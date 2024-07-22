package com.meferi.scannerdemo.base.activity

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.hjq.bar.OnTitleBarListener
import com.hjq.bar.TitleBar
import com.meferi.scannerdemo.R
import com.meferi.scannerdemo.databinding.ViewRootBinding
import java.lang.reflect.ParameterizedType

abstract class BaseDbActivity<VB : ViewDataBinding> : AppCompatActivity() {

    protected lateinit var binding: VB
    private lateinit var rootBinding: ViewRootBinding

    protected open fun showTitleBar(): Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rootBinding = DataBindingUtil.inflate(layoutInflater, R.layout.view_root, null, false)
        binding = createBinding()
        if (showTitleBar()) {
            rootBinding.layoutBody.addView(binding.root)
            setContentView(rootBinding.root)
            initTitleBar()
        } else {
            setContentView(binding.root)
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

    private fun initTitleBar() {
        buildTitleBar {
            if (!showTitleBar()) {
                leftIcon = null
            }
            setLineVisible(false)
            setOnTitleBarListener(object : OnTitleBarListener {
                override fun onLeftClick(titleBar: TitleBar?) {
                    super.onLeftClick(titleBar)
                    onBackPressed()
                }

                override fun onRightClick(titleBar: TitleBar?) {
                    super.onRightClick(titleBar)
                    onClickTitleBarRight()
                }
            })
        }
    }

    protected open fun getTitleBar() = rootBinding.titleBar

    protected open fun onClickTitleBarRight() {
        Log.e("click", "TitleBar RightView")
    }

    protected open fun buildTitleBar(block: TitleBar.() -> Unit) {
        block.invoke(rootBinding.titleBar)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onDestroy() {
        super.onDestroy()
        //此处记得取消绑定，避免内存泄露
        if (::rootBinding.isInitialized) {
            rootBinding.unbind()
        }
        if (::binding.isInitialized) {
            binding.unbind()
        }
    }

    /**
     * 初始化数据
     * 发送请求
     */
    protected open fun initData() {}

    /**
     * 初始化Observable
     */
    protected open fun initObservable() {}

    protected open fun loadData() {}


}