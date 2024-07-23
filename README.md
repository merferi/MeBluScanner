# MeBluScanner

## Permissions

    <uses-feature
        android:name="android.hardware.bluetooth"
        android:required="true" />
    <uses-feature
        android:name="android.hardware.bluetooth_le"
        android:required="true" />

    <uses-permission
        android:name="android.permission.BLUETOOTH"
        android:maxSdkVersion="30" />
    <uses-permission
        android:name="android.permission.BLUETOOTH_ADMIN"
        android:maxSdkVersion="30" />
    <uses-permission
        android:name="android.permission.BLUETOOTH_SCAN"
        android:usesPermissionFlags="neverForLocation"
        tools:targetApi="s" />

    <uses-permission android:name="android.permission.BLUETOOTH_CONNECT" />

    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />

## Initialization:

    MeScannerSDK.initialize(application: Application)

## SetBroadCastCfg

    MeScannerSDK.setBroadCastCfg(action: String, extName: String)

    MeScannerSDK.getBroadCastAction():String

    MeScannerSDK.getBroadCastExtName():String

## getVersion

    MeScannerSDK.getVersion():String

## setConnectionListener

    MeScannerSDK.setConnectionListener(object : MeConnectionListener {

            override fun onConnected(bluetoothDevice: BluetoothDevice, connectMode: ConnectMode) {
            }

            override fun onConnectFailure(msg: String) {
            }

            override fun onDisconnected() {
            }

            override fun onConnectionStateChanged(state: Int) {
              //0:disconnect 1:connecting 2:connected 3:disconnect 4:no_state               
            }
        })

## setCommunicateListener

     MeScannerSDK.setCommunicateListener(object : MeCommunicateListener {

            override fun onDecodingData(data: ByteArray) {
            }

            override fun onFirmwareVersion(version: String) {
            }

            override fun onBatteryInfo(status: Int, voltage: Int, batteryLevel: Int) {
            }

            override fun onBuzzerStatus(enable: Boolean) {
            }

            override fun onAutoShutdownTime(duration: Int) {
            }

            override fun onTriggerMode(mode: MeTriggerMode) {
            }

            override fun onReconnectEnable(enable: Boolean) {
            }

            override fun onContinuousScanInterval(interval: Float) {
            }

            override fun onScanning() {
            }
        })

## startMeSppServer

__Note:__
__Start the SPP server after applying for Bluetooth permission.__

    MeScannerSDK.startMeSppServer()

## connect

    MeScannerSDK.connect(device: BluetoothDevice, mode: ConnectMode)

## disconnect

    MeScannerSDK.disconnect()

## other

* firmwareVersion:
  > MeScannerSDK.getFirmwareVersion()
* batteryInfo:
  > MeScannerSDK.getBatteryInfo()
* doVibrate:
  > MeScannerSDK.doVibrate()
* doBuzzer:
  > MeScannerSDK.doBuzzer(state: MeBuzzerState)
* getBuzzerStatus:
  > MeScannerSDK.getBuzzerStatus()
* setTriggerMode:
  > MeScannerSDK.setTriggerMode(mode: MeTriggerMode)()
* setContinuousMode:
  > MeScannerSDK.setContinuousMode(mode: MeTriggerMode, interval: Float)
* getContinuousScanInterval
  > MeScannerSDK.getContinuousScanInterval()
* doScan:
  > MeScannerSDK.doScan()
* controlLed:
  > MeScannerSDK.(color: MeLedColor)
* setAutoShutdownTime:
  > MeScannerSDK.setAutoShutdownTime(status: MeShutdown)
* getTriggerMode:
  > MeScannerSDK.getTriggerMode()
* getReconnectEnable
  > MeScannerSDK.getReconnectEnable()
* setReconnect
  > MeScannerSDK.setReconnect(enable:boolean)
* resetFactory:
  > MeScannerSDK.resetFactory()
