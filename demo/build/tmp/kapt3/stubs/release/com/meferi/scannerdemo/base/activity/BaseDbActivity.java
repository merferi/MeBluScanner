package com.meferi.scannerdemo.base.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J!\u0010\r\u001a\u00020\u000e2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u0010\u00a2\u0006\u0002\b\u0012H\u0014J\r\u0010\u0013\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0014\u001a\u00020\u0011H\u0014J\b\u0010\u0015\u001a\u00020\u000eH\u0014J\b\u0010\u0016\u001a\u00020\u000eH\u0014J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\b\u0010\u0018\u001a\u00020\u000eH\u0014J\b\u0010\u0019\u001a\u00020\u000eH\u0014J\b\u0010\u001a\u001a\u00020\u000eH\u0014J\u0012\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u000eH\u0014J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020 H\u0014R\u001c\u0010\u0005\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/meferi/scannerdemo/base/activity/BaseDbActivity;", "VB", "Landroidx/databinding/ViewDataBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "rootBinding", "Lcom/meferi/scannerdemo/databinding/ViewRootBinding;", "buildTitleBar", "", "block", "Lkotlin/Function1;", "Lcom/hjq/bar/TitleBar;", "Lkotlin/ExtensionFunctionType;", "createBinding", "getTitleBar", "initData", "initObservable", "initTitleBar", "initView", "loadData", "onClickTitleBarRight", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "showTitleBar", "demo_release"})
public abstract class BaseDbActivity<VB extends androidx.databinding.ViewDataBinding> extends androidx.appcompat.app.AppCompatActivity {
    protected VB binding;
    private com.meferi.scannerdemo.databinding.ViewRootBinding rootBinding;
    
    public BaseDbActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final VB getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull
    VB p0) {
    }
    
    protected boolean showTitleBar() {
        return false;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final VB createBinding() {
        return null;
    }
    
    /**
     * 初始化视图
     */
    protected void initView() {
    }
    
    private final void initTitleBar() {
    }
    
    @org.jetbrains.annotations.NotNull
    protected com.hjq.bar.TitleBar getTitleBar() {
        return null;
    }
    
    protected void onClickTitleBarRight() {
    }
    
    protected void buildTitleBar(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.hjq.bar.TitleBar, kotlin.Unit> block) {
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
    
    /**
     * 初始化数据
     * 发送请求
     */
    protected void initData() {
    }
    
    /**
     * 初始化Observable
     */
    protected void initObservable() {
    }
    
    protected void loadData() {
    }
}