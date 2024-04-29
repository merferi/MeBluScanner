// Generated by data binding compiler. Do not edit!
package com.meferi.scannerdemo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.meferi.scannerdemo.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMainBinding extends ViewDataBinding {
  @NonNull
  public final Button battery;

  @NonNull
  public final Button btnBuzzer;

  @NonNull
  public final Button btnConnect;

  @NonNull
  public final Button btnDeviceFirmware;

  @NonNull
  public final Button btnDisconnect;

  @NonNull
  public final Button btnLedBlue;

  @NonNull
  public final Button btnLedGreen;

  @NonNull
  public final Button btnLedRed;

  @NonNull
  public final Button btnQrcode;

  @NonNull
  public final Button btnScan;

  @NonNull
  public final Button btnVibrator;

  @NonNull
  public final EditText inputMac;

  @NonNull
  public final ImageView ivQrCode;

  @NonNull
  public final TextView tvDevAddress;

  @NonNull
  public final TextView tvDevName;

  @NonNull
  public final TextView tvReceived;

  protected ActivityMainBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button battery, Button btnBuzzer, Button btnConnect, Button btnDeviceFirmware,
      Button btnDisconnect, Button btnLedBlue, Button btnLedGreen, Button btnLedRed,
      Button btnQrcode, Button btnScan, Button btnVibrator, EditText inputMac, ImageView ivQrCode,
      TextView tvDevAddress, TextView tvDevName, TextView tvReceived) {
    super(_bindingComponent, _root, _localFieldCount);
    this.battery = battery;
    this.btnBuzzer = btnBuzzer;
    this.btnConnect = btnConnect;
    this.btnDeviceFirmware = btnDeviceFirmware;
    this.btnDisconnect = btnDisconnect;
    this.btnLedBlue = btnLedBlue;
    this.btnLedGreen = btnLedGreen;
    this.btnLedRed = btnLedRed;
    this.btnQrcode = btnQrcode;
    this.btnScan = btnScan;
    this.btnVibrator = btnVibrator;
    this.inputMac = inputMac;
    this.ivQrCode = ivQrCode;
    this.tvDevAddress = tvDevAddress;
    this.tvDevName = tvDevName;
    this.tvReceived = tvReceived;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, null, false, component);
  }

  public static ActivityMainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityMainBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMainBinding)bind(component, view, R.layout.activity_main);
  }
}
