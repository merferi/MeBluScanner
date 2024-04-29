package com.meferi.scannerdemo.base.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0011"}, d2 = {"Lcom/meferi/scannerdemo/base/viewmodel/IBaseViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "onAny", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "onCreate", "onDestroy", "onPause", "onResume", "onStart", "onStateChanged", "source", "onStop", "demo_release"})
public abstract interface IBaseViewModel extends androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.LifecycleEventObserver {
    
    @java.lang.Override
    public abstract void onStateChanged(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner source, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.Lifecycle.Event event);
    
    /**
     * 此函数可以监听Activity的全部Event事件
     * @param owner
     * @param event
     */
    public abstract void onAny(@org.jetbrains.annotations.Nullable
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.Nullable
    androidx.lifecycle.Lifecycle.Event event);
    
    @java.lang.Override
    public abstract void onCreate(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner owner);
    
    public abstract void onCreate();
    
    @java.lang.Override
    public abstract void onStart(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner owner);
    
    public abstract void onStart();
    
    @java.lang.Override
    public abstract void onResume(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner owner);
    
    public abstract void onResume();
    
    @java.lang.Override
    public abstract void onPause(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner owner);
    
    public abstract void onPause();
    
    @java.lang.Override
    public abstract void onStop(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner owner);
    
    public abstract void onStop();
    
    @java.lang.Override
    public abstract void onDestroy(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner owner);
    
    public abstract void onDestroy();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public final class DefaultImpls {
        
        @java.lang.Override
        public static void onStateChanged(@org.jetbrains.annotations.NotNull
        com.meferi.scannerdemo.base.viewmodel.IBaseViewModel $this, @org.jetbrains.annotations.NotNull
        androidx.lifecycle.LifecycleOwner source, @org.jetbrains.annotations.NotNull
        androidx.lifecycle.Lifecycle.Event event) {
        }
        
        /**
         * 此函数可以监听Activity的全部Event事件
         * @param owner
         * @param event
         */
        public static void onAny(@org.jetbrains.annotations.NotNull
        com.meferi.scannerdemo.base.viewmodel.IBaseViewModel $this, @org.jetbrains.annotations.Nullable
        androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.Nullable
        androidx.lifecycle.Lifecycle.Event event) {
        }
        
        @java.lang.Override
        public static void onCreate(@org.jetbrains.annotations.NotNull
        com.meferi.scannerdemo.base.viewmodel.IBaseViewModel $this, @org.jetbrains.annotations.NotNull
        androidx.lifecycle.LifecycleOwner owner) {
        }
        
        public static void onCreate(@org.jetbrains.annotations.NotNull
        com.meferi.scannerdemo.base.viewmodel.IBaseViewModel $this) {
        }
        
        @java.lang.Override
        public static void onStart(@org.jetbrains.annotations.NotNull
        com.meferi.scannerdemo.base.viewmodel.IBaseViewModel $this, @org.jetbrains.annotations.NotNull
        androidx.lifecycle.LifecycleOwner owner) {
        }
        
        public static void onStart(@org.jetbrains.annotations.NotNull
        com.meferi.scannerdemo.base.viewmodel.IBaseViewModel $this) {
        }
        
        @java.lang.Override
        public static void onResume(@org.jetbrains.annotations.NotNull
        com.meferi.scannerdemo.base.viewmodel.IBaseViewModel $this, @org.jetbrains.annotations.NotNull
        androidx.lifecycle.LifecycleOwner owner) {
        }
        
        public static void onResume(@org.jetbrains.annotations.NotNull
        com.meferi.scannerdemo.base.viewmodel.IBaseViewModel $this) {
        }
        
        @java.lang.Override
        public static void onPause(@org.jetbrains.annotations.NotNull
        com.meferi.scannerdemo.base.viewmodel.IBaseViewModel $this, @org.jetbrains.annotations.NotNull
        androidx.lifecycle.LifecycleOwner owner) {
        }
        
        public static void onPause(@org.jetbrains.annotations.NotNull
        com.meferi.scannerdemo.base.viewmodel.IBaseViewModel $this) {
        }
        
        @java.lang.Override
        public static void onStop(@org.jetbrains.annotations.NotNull
        com.meferi.scannerdemo.base.viewmodel.IBaseViewModel $this, @org.jetbrains.annotations.NotNull
        androidx.lifecycle.LifecycleOwner owner) {
        }
        
        public static void onStop(@org.jetbrains.annotations.NotNull
        com.meferi.scannerdemo.base.viewmodel.IBaseViewModel $this) {
        }
        
        @java.lang.Override
        public static void onDestroy(@org.jetbrains.annotations.NotNull
        com.meferi.scannerdemo.base.viewmodel.IBaseViewModel $this, @org.jetbrains.annotations.NotNull
        androidx.lifecycle.LifecycleOwner owner) {
        }
        
        public static void onDestroy(@org.jetbrains.annotations.NotNull
        com.meferi.scannerdemo.base.viewmodel.IBaseViewModel $this) {
        }
    }
}