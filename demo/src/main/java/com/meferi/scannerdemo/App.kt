package com.meferi.scannerdemo

import android.app.Application
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Build
import android.util.Log
import androidx.core.content.ContextCompat
import com.drake.brv.utils.BRV
import com.meferi.scannerdemo.BuildConfig
import com.meferi.btscannersdk.MeScannerSDK

class App : Application() {

    private var broadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            if (intent?.action == "android.intent.action.MEF_SR_ACTION") {
                val data = intent.getStringExtra("raw_data")
                if (data != null) {
                    Log.e("Received Data", data)
                }
            }
        }
    }

    override fun onCreate() {
        super.onCreate()

        BRV.modelId = BR.data

        MeScannerSDK.initialize(this)
        MeScannerSDK.keepSppServerAlive(true)
        Log.d("SDK Version", "${MeScannerSDK.getVersion()}")
        Log.d("BroadCast Action:", "${MeScannerSDK.getBroadcastAction()}")
        Log.d("BroadCast ExtName", "${MeScannerSDK.getBroadcastExtName()}")
        val intentFilter = IntentFilter("android.intent.action.MEF_SR_ACTION")
        ContextCompat.registerReceiver(this, broadcastReceiver, intentFilter, ContextCompat.RECEIVER_EXPORTED)
    }
}