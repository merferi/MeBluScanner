package com.meferi.scannerdemo.base.activity

import android.os.Bundle
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.meferi.scannerdemo.base.viewmodel.BaseViewModel
import java.lang.reflect.ParameterizedType

/**
 * 基类，处理viewModel相关逻辑
 */
abstract class BaseDbVmActivity<VB : ViewDataBinding, VM : BaseViewModel> : BaseDbActivity<VB>() {

    protected val viewModel: VM by lazy {
        val type = (javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[1]
        ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(application))[type as Class<VM>]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        this.lifecycle.addObserver(viewModel)
        super.onCreate(savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
        this.lifecycle.removeObserver(viewModel)
    }


}