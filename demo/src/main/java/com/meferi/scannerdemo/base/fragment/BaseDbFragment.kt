package com.meferi.scannerdemo.base.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import java.lang.reflect.ParameterizedType

/**
 * 干净的基类，不处理viewModel
 */
abstract class BaseDbFragment<VB : ViewDataBinding> : Fragment() {

    protected lateinit var binding: VB

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = createBinding()
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            initArgs(it)
        }
        initData()
        initView()
        initObservable()
        loadData()
    }

    private fun createBinding(): VB {
        val vbClass = (javaClass.genericSuperclass as ParameterizedType).actualTypeArguments.filterIsInstance<Class<VB>>()
        val inflate = vbClass[0].getDeclaredMethod("inflate", LayoutInflater::class.java)
        return inflate.invoke(null, layoutInflater) as VB
    }

    /**
     * 初始化视图
     */
    protected open fun initView() {}


    override fun onDestroy() {
        super.onDestroy()
        //此处记得取消绑定，避免内存泄露
        if (::binding.isInitialized) {
            binding.unbind()
        }
    }

    /**
     * 初始化bundle数据
     */
    protected open fun initArgs(bundle: Bundle) {}

    /**
     * 初始化数据
     * 发送请求
     */
    protected open fun initData() {}

    protected open fun loadData() {}

    /**
     * 初始化Observable
     */
    protected open fun initObservable() {}
}