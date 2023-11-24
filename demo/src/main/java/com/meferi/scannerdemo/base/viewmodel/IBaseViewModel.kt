package com.meferi.scannerdemo.base.viewmodel

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner


interface IBaseViewModel : DefaultLifecycleObserver, LifecycleEventObserver {

    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        onAny(source, event)
    }

    /**
     * 此函数可以监听Activity的全部Event事件
     * @param owner
     * @param event
     */
    fun onAny(owner: LifecycleOwner?, event: Lifecycle.Event?) {}

    override fun onCreate(owner: LifecycleOwner) {
        onCreate()
    }

    fun onCreate() {}

    override fun onStart(owner: LifecycleOwner) {
        onStart()
    }

    fun onStart() {}

    override fun onResume(owner: LifecycleOwner) {
        onResume()
    }

    fun onResume() {}

    override fun onPause(owner: LifecycleOwner) {
        onPause()
    }

    fun onPause() {}

    override fun onStop(owner: LifecycleOwner) {
        onStop()
    }

    fun onStop() {}

    override fun onDestroy(owner: LifecycleOwner) {
        onDestroy()
    }

    fun onDestroy() {}
}