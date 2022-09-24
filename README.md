# Java Windows Bluetooth LE Driver

Note : This is a work in progress

## What is it for ?

This project is a demo for the [Java Client / Driver for using Windows 10 Bluetooth LE API](https://github.com/flake9025/java-bluetooth-win-jni).

The demo application will do the following operations :
- Get Devices
- Get Device Services
- Get Service Characteristics

## How to use ?

This project is based on the JNI technology : it contains only an interface, describing functional operations.
The result of the build is a generated C++ header.

To compile, you need Maven and Java 8+ :
```shell
mvn clean install
```

To run, you will need the following libraries in your Java classpath :
- msvcp140d_app
- vcruntime140_1d_app
- VCRUNTIME140D_APP
- CONCRT140D_APP
- ucrtbased
- api-ms-win-core-synch-l1-2-0
- api-ms-win-core-synch-l1-1-0
- api-ms-win-core-processthreads-l1-1-0
- api-ms-win-core-debug-l1-1-0
- api-ms-win-core-errorhandling-l1-1-0
- api-ms-win-core-string-l1-1-0
- api-ms-win-core-profile-l1-1-0
- api-ms-win-core-sysinfo-l1-1-0
- api-ms-win-core-interlocked-l1-1-0
- api-ms-win-core-winrt-l1-1-0
- api-ms-win-core-heap-l1-1-0
- api-ms-win-core-memory-l1-1-0
- api-ms-win-core-libraryloader-l1-2-0
- OLEAUT32
- CppBluetoothWin

```shell
mvn compile exec:java -Dexec.mainClass="fr.vvlabs.bluetooth.WindowsBlueToothManagerDemo"
```

Demo Output:

```
Loading C++ dlls...
Windows Bluetooth Manager : starting devices discovery...
Devices: 
    -----------------------------------------------------
	ID: BluetoothLE#BluetoothLE48:f1:7f:65:0e:36-44:d8:78:70:15:0c
	Name: Android TV
    -----------------------------------------------------
	ID: BluetoothLE#BluetoothLE48:f1:7f:65:0e:36-46:4a:6c:0a:f3:ce
	Name: Cuisine
    -----------------------------------------------------
Windows Bluetooth Manager : end discovery.
```
