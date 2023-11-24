package com.meferi.scannerdemo

import android.bluetooth.BluetoothDevice
import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.drake.brv.utils.bindingAdapter
import com.drake.brv.utils.linear
import com.drake.brv.utils.setup
import com.meferi.btscannersdk.MeScannerSDK
import com.meferi.btscannersdk.connect.ConnectMode
import com.meferi.btscannersdk.connect.scan.MeScanListener
import com.meferi.btscannersdk.connect.scan.ScanMode
import com.meferi.scannerdemo.databinding.ItemBtDeviceBinding
import com.meferi.scannerdemo.model.MeBluetoothDevice

class DeviceListActivity : AppCompatActivity() {

    private lateinit var mRvDevice: RecyclerView
    private val mDeviceList = arrayListOf<MeBluetoothDevice>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_device_list)

        mRvDevice = findViewById<RecyclerView>(R.id.rv_device).linear()
        mRvDevice.linear().setup {
            addType<MeBluetoothDevice>(R.layout.item_bt_device)

            onClick(R.id.item) {
                val model = getModel<MeBluetoothDevice>()
                MeScannerSDK.connect(model.bluetoothDevice, ConnectMode.SPP)
                MeScannerSDK.stopDiscover()
                finish()
            }

            onLongClick(R.id.item) {
                val model = getModel<MeBluetoothDevice>()
                MeScannerSDK.connect(model.bluetoothDevice, ConnectMode.BLE)
                MeScannerSDK.stopDiscover()
                finish()
            }

            onBind {
                val model = getModel<MeBluetoothDevice>()
                val bind = getBinding<ItemBtDeviceBinding>()
                bind.ivRssi.setImageDrawable(getSignalIconFromRssi(it.context, model.rssi))
            }
        }

        MeScannerSDK.startDiscover(ScanMode.MIXED, object : MeScanListener {
            override fun onDeviceDiscovered(bluetoothDevice: BluetoothDevice, rssi: Int) {
                if (mDeviceList.none { it.bluetoothDevice.address == bluetoothDevice.address }) {
                    mDeviceList.add(MeBluetoothDevice(bluetoothDevice, rssi))
                    mRvDevice.bindingAdapter.addModels(arrayListOf(MeBluetoothDevice(bluetoothDevice, rssi)), true)
                }
            }
        })
    }

    private fun getSignalIconFromRssi(context: Context, rssi: Int): Drawable? {
        return if (-60 <= rssi && rssi <= 0) {
            ContextCompat.getDrawable(context, R.drawable.ic_signal_level_4_24dp)
        } else if (-70 <= rssi && rssi < -60) {
            ContextCompat.getDrawable(context, R.drawable.ic_signal_level_3_24dp)
        } else if (-80 <= rssi && rssi < -70) {
            ContextCompat.getDrawable(context, R.drawable.ic_signal_level_2_24dp)
        } else if (-90 <= rssi && rssi < -80) {
            ContextCompat.getDrawable(context, R.drawable.ic_signal_level_1_24dp)
        } else if (rssi < -90) {
            ContextCompat.getDrawable(context, R.drawable.ic_signal_level_0_24dp)
        } else {
            ContextCompat.getDrawable(context, R.drawable.ic_signal_unknown_24dp)
        }
    }
}