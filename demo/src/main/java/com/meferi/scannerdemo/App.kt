package com.meferi.scannerdemo

import android.app.Application
import android.util.Log
import com.drake.brv.utils.BRV
import com.meferi.scannerdemo.BuildConfig
import com.meferi.btscannersdk.MeScannerSDK

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        BRV.modelId = BR.data

        MeScannerSDK.initialize(this, BuildConfig.DEBUG)
        MeScannerSDK.startMeSppServer()
        Log.e("SDK Version", "${MeScannerSDK.getVersion()}")
    }
}