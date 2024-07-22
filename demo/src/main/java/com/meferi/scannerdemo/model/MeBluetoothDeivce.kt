package com.meferi.scannerdemo.model

import android.bluetooth.BluetoothDevice

data class MeBluetoothDevice(val bluetoothDevice: BluetoothDevice, var rssi: Int)