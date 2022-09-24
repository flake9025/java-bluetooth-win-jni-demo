package fr.vvlabs.bluetooth;

public class WindowsBlueToothManagerDemo {

  public WindowsBlueToothManagerDemo() {
    String[] deviceList = WindowsBluetoothManager.getDevices();
    if (deviceList == null || deviceList.length == 0) {
      System.err.println("No devices returned");
    }
    System.out.println("Devices: ");
    System.out.println("\t-----------------------------------------------------");
    for (String device : deviceList) {
      String deviceName = WindowsBluetoothManager.getDeviceName(device);

      if(deviceName != null && !deviceName.equals("")) {
        System.out.println("\tID: " + device);
        System.out.println("\tName: " + deviceName);
        System.out.println("\t-----------------------------------------------------");
      }

      /*
      if (deviceName != null && !deviceName.equals("")) {
        String[] deviceServices = WindowsBluetoothManager.getDeviceServices(device);
        if (deviceServices != null) {
          for (String service : deviceServices) {
            System.out.println("\t\tService: " + service);
            String deviceServiceCharacteristics[] = WindowsBluetoothManager.getDeviceServiceCharacteristics(device, service);
            if (deviceServiceCharacteristics != null) {
              for (String characteristic : deviceServiceCharacteristics) {
                System.out.println("\t\t\tCharacteristic: " + characteristic);
              }
            }
          }
        }
      }*/
    }
  }

  public static void main(String[] args) {
    System.out.println("Loading C++ dlls...");
    System.loadLibrary("msvcp140d_app");
    System.loadLibrary("vcruntime140_1d_app");
    System.loadLibrary("VCRUNTIME140D_APP");
    System.loadLibrary("CONCRT140D_APP");
    System.loadLibrary("ucrtbased");
    System.loadLibrary("api-ms-win-core-synch-l1-2-0");
    System.loadLibrary("api-ms-win-core-synch-l1-1-0");
    System.loadLibrary("api-ms-win-core-processthreads-l1-1-0");
    System.loadLibrary("api-ms-win-core-debug-l1-1-0");
    System.loadLibrary("api-ms-win-core-errorhandling-l1-1-0");
    System.loadLibrary("api-ms-win-core-string-l1-1-0");
    System.loadLibrary("api-ms-win-core-profile-l1-1-0");
    System.loadLibrary("api-ms-win-core-sysinfo-l1-1-0");
    System.loadLibrary("api-ms-win-core-interlocked-l1-1-0");
    System.loadLibrary("api-ms-win-core-winrt-l1-1-0");
    System.loadLibrary("api-ms-win-core-heap-l1-1-0");
    System.loadLibrary("api-ms-win-core-memory-l1-1-0");
    System.loadLibrary("api-ms-win-core-libraryloader-l1-2-0");
    System.loadLibrary("OLEAUT32");
    System.loadLibrary("CppBluetoothWin");
    new WindowsBlueToothManagerDemo();
  }
}
