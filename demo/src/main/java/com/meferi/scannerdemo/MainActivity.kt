package com.meferi.scannerdemo

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import android.content.Intent
import android.graphics.BitmapFactory
import com.meferi.btscannersdk.MeCommunicateListener
import com.meferi.btscannersdk.MeScannerSDK
import com.meferi.btscannersdk.communicate.MeBuzzerState
import com.meferi.btscannersdk.communicate.MeLedColor
import com.meferi.btscannersdk.communicate.MeScannerBrand
import com.meferi.btscannersdk.communicate.MeScannerEngine
import com.meferi.btscannersdk.communicate.MeTriggerMode
import com.meferi.btscannersdk.connect.ConnectMode
import com.meferi.btscannersdk.connect.MeConnectionListener
import com.meferi.btscannersdk.ext.dp2px
import com.meferi.btscannersdk.ext.logD
import com.meferi.btscannersdk.utils.ByteUtils
import com.meferi.scannerdemo.base.activity.BaseDbActivity
import com.meferi.scannerdemo.databinding.ActivityMainBinding
import com.yzq.zxinglibrary.encode.CodeCreator

@SuppressLint("MissingPermission")
class MainActivity : BaseDbActivity<ActivityMainBinding>() {

    override fun initData() {
        super.initData()
        MeScannerSDK.setConnectionListener(object : MeConnectionListener {

            override fun onConnected(bluetoothDevice: BluetoothDevice, connectMode: ConnectMode) {
                "onConnected name:${bluetoothDevice.name ?: ""} mac:${bluetoothDevice.address} connectMode:${connectMode.value}".logD("onConnected")
                binding.tvDevAddress.text = bluetoothDevice.address
                binding.tvDevName.text = bluetoothDevice.name
            }

            override fun onConnectFailure(msg: String) {
            }

            override fun onDisconnected() {
            }

            override fun onConnectionStateChanged(state: Int) {
                "onConnectionStateChanged ${state}".logD()
                if (state == 2) {
                    MeScannerSDK.getFirmwareVersion()
                }
                if (state == 0) {
                    binding.tvDevAddress.text = ""
                    binding.tvDevName.text = ""
                }
            }
        })
        MeScannerSDK.setCommunicateListener(object : MeCommunicateListener {

            override fun onDecodingData(data: ByteArray) {
                binding.tvReceived.setText(ByteUtils.bytesToHex(data))
            }

            override fun onFirmwareVersion(version: String) {
                binding.tvReceived.setText(version)
            }

            override fun onBatteryInfo(status: Int, voltage: Int, batteryLevel: Int) {
                binding.tvReceived.setText("status: $status,voltage: ${voltage},batteryLevel: ${batteryLevel}")
            }

            override fun onBuzzerStatus(enable: Boolean) {
                binding.tvReceived.setText("status: $enable")
            }


            override fun onAutoShutdownTime(duration: Int) {
                binding.tvReceived.setText("duration: $duration")
            }

            override fun onTriggerMode(mode: MeTriggerMode) {
                //mode 0:press 1:key hold 3:continuous
                binding.tvReceived.setText("duration: $mode")
            }

            override fun onReconnectEnable(enable: Boolean) {
            }

            override fun onContinuousScanInterval(interval: Float) {
                binding.tvReceived.setText("interval:$interval")
            }

            override fun onScanning() {
            }
        })
    }

    override fun initView() {
        super.initView()

        buildTitleBar {
            title = getString(R.string.app_name)
        }

        binding.btnConnect.setOnClickListener {
            startActivity(Intent(this@MainActivity, DeviceListActivity::class.java))
        }
        binding.btnDisconnect.setOnClickListener {
            MeScannerSDK.disconnect()
        }
        binding.battery.setOnClickListener {
            MeScannerSDK.getBatteryInfo()
        }
        binding.btnVibrator.setOnClickListener {
            MeScannerSDK.doVibrate()
        }
        binding.btnBuzzer.setOnClickListener {
            MeScannerSDK.doBuzzer(MeBuzzerState.TEST)
        }
        binding.btnLedRed.setOnClickListener {
            MeScannerSDK.controlLed(MeLedColor.RED_ON)
        }
        binding.btnLedGreen.setOnClickListener {
            MeScannerSDK.controlLed(MeLedColor.GREEN_ON)
        }
        binding.btnLedBlue.setOnClickListener {
            MeScannerSDK.controlLed(MeLedColor.BLUE_ON)
        }
        binding.btnScan.setOnClickListener {
            MeScannerSDK.doScan()
        }
        binding.btnDeviceFirmware.setOnClickListener {
            MeScannerSDK.getFirmwareVersion()
        }

        binding.btnQrcode.setOnClickListener {
            val mac = binding.inputMac.text.toString().trim()
            val logo = BitmapFactory.decodeResource(resources, R.mipmap.ic_launcher)
            val dpValue = resources.getDimension(R.dimen.dp_200)
            val size = dpValue.dp2px().toInt()
            val bitmap = CodeCreator.createQRCode("@${mac.lowercase()}@", size, size, logo)
            binding.ivQrCode.setImageBitmap(bitmap)
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        MeScannerSDK.disconnect()
    }

}