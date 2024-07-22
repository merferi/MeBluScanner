package com.meferi.scannerdemo.base.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.meferi.scannerdemo.base.viewmodel.BaseViewModel
import java.lang.reflect.ParameterizedType

/**
 * 基类，处理viewModel相关逻辑
 */
abstract class BaseDbVmFragment<VB : ViewDataBinding, VM : BaseViewModel> : BaseDbFragment<VB>() {

    protected val viewModel: VM by lazy {
        val type = (javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[1]
        ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(requireActivity().application))[type as Class<VM>]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        this.lifecycle.addObserver(viewModel)
        return super.onCreateView(inflater, container, savedInstanceState)
    }


    override fun onDestroy() {
        super.onDestroy()
        this.lifecycle.removeObserver(viewModel)
    }
}