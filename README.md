# MeBluScanner

## Initialization:

    MeScannerSDK.initialize(this, BuildConfig.DEBUG)

## getVersion

    MeScannerSDK.getVersion()

## setConnectionListener

    MeScannerSDK.setConnectionListener(object : MeConnectionListener {

            override fun onConnected(bluetoothDevice: BluetoothDevice, connectMode: ConnectMode) {
            }

            override fun onConnectFailure(msg: String) {
            }

            override fun onDisconnected() {
            }

            override fun onConnectionStateChanged(state: Int) {
               
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

            override fun onBuzzerStatus(status: Int) {
            }

            override fun onAutoShutdownTime(duration: Int) {
            }

            override fun onTriggerMode(mode: MeTriggerMode) {
                //mode 0:press 1:key hold 3:continuous
            }

            override fun onReconnectEnable(enable: Boolean) {
            }

            override fun onContinuousScanInterval(interval: Int) {
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
  > MeScannerSDK.setContinuousMode(mode: MeTriggerMode, interval: Int)
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
