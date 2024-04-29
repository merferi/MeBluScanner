package com.meferi.scannerdemo.base.activity;

import java.lang.System;

/**
 * 基类，处理viewModel相关逻辑
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0014R\u001b\u0010\u0007\u001a\u00028\u00018DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0011"}, d2 = {"Lcom/meferi/scannerdemo/base/activity/BaseDbVmActivity;", "VB", "Landroidx/databinding/ViewDataBinding;", "VM", "Lcom/meferi/scannerdemo/base/viewmodel/BaseViewModel;", "Lcom/meferi/scannerdemo/base/activity/BaseDbActivity;", "()V", "viewModel", "getViewModel", "()Lcom/meferi/scannerdemo/base/viewmodel/BaseViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "demo_release"})
public abstract class BaseDbVmActivity<VB extends androidx.databinding.ViewDataBinding, VM extends com.meferi.scannerdemo.base.viewmodel.BaseViewModel> extends com.meferi.scannerdemo.base.activity.BaseDbActivity<VB> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    
    public BaseDbVmActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final VM getViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
}