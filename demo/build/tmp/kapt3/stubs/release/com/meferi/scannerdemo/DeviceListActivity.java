package com.meferi.scannerdemo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0005H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/meferi/scannerdemo/DeviceListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mDeviceList", "Ljava/util/ArrayList;", "Lcom/meferi/scannerdemo/model/MeBluetoothDevice;", "mRvDevice", "Landroidx/recyclerview/widget/RecyclerView;", "getSignalIconFromRssi", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "rssi", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showConnectOptions", "meBluetoothDevice", "demo_release"})
public final class DeviceListActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.recyclerview.widget.RecyclerView mRvDevice;
    private final java.util.ArrayList<com.meferi.scannerdemo.model.MeBluetoothDevice> mDeviceList = null;
    
    public DeviceListActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final android.graphics.drawable.Drawable getSignalIconFromRssi(android.content.Context context, int rssi) {
        return null;
    }
    
    private final void showConnectOptions(com.meferi.scannerdemo.model.MeBluetoothDevice meBluetoothDevice) {
    }
}