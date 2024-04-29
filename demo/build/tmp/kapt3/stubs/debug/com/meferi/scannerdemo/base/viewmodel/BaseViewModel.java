package com.meferi.scannerdemo.base.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\"\u0010\r\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/meferi/scannerdemo/base/viewmodel/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/meferi/scannerdemo/base/viewmodel/IBaseViewModel;", "()V", "errorLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getErrorLiveData$demo_debug", "()Landroidx/lifecycle/MutableLiveData;", "hideLoadingLiveData", "", "kotlin.jvm.PlatformType", "getHideLoadingLiveData$demo_debug", "loadingDialogLiveData", "getLoadingDialogLiveData$demo_debug", "loadingViewLiveData", "getLoadingViewLiveData$demo_debug", "showFailedViewLiveData", "getShowFailedViewLiveData$demo_debug", "demo_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel implements com.meferi.scannerdemo.base.viewmodel.IBaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loadingDialogLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loadingViewLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> hideLoadingLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showFailedViewLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Throwable> errorLiveData = null;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoadingDialogLiveData$demo_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoadingViewLiveData$demo_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getHideLoadingLiveData$demo_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowFailedViewLiveData$demo_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Throwable> getErrorLiveData$demo_debug() {
        return null;
    }
    
    /**
     * 此函数可以监听Activity的全部Event事件
     * @param owner
     * @param event
     */
    public void onAny(@org.jetbrains.annotations.Nullable
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.Nullable
    androidx.lifecycle.Lifecycle.Event event) {
    }
    
    public void onCreate() {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    public void onDestroy() {
    }
    
    @java.lang.Override
    public void onDestroy(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    public void onPause() {
    }
    
    @java.lang.Override
    public void onPause(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    public void onResume() {
    }
    
    @java.lang.Override
    public void onResume(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    public void onStart() {
    }
    
    @java.lang.Override
    public void onStart(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    @java.lang.Override
    public void onStateChanged(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner source, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.Lifecycle.Event event) {
    }
    
    public void onStop() {
    }
    
    @java.lang.Override
    public void onStop(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner owner) {
    }
}