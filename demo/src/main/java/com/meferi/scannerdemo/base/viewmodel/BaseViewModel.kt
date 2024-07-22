package com.meferi.scannerdemo.base.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.meferi.scannerdemo.base.viewmodel.IBaseViewModel

abstract class BaseViewModel : ViewModel(), IBaseViewModel {

    internal val loadingDialogLiveData = MutableLiveData(false)
    internal val loadingViewLiveData = MutableLiveData(false)
    internal val hideLoadingLiveData = MutableLiveData(false)
    internal val showFailedViewLiveData = MutableLiveData(false)
    internal val errorLiveData = MutableLiveData<Throwable>()

}