// USAGE EXAMPLE - How to use the NetworkDeviceScanner in your code

package com.thirdeye.network;

import android.content.Context;
import android.widget.Toast;
import java.util.HashMap;

/**
 * Example usage of NetworkDeviceScanner
 * This shows different ways to use the scanner in your app
 */
public class UsageExample {

    // Example 1: Basic scanning with callbacks
    public void basicScanExample(Context context) {
        NetworkDeviceScanner scanner = NetworkDeviceScanner.getInstance();
        
        scanner.startScan(context, new NetworkDeviceScanner.ScanCallback() {
            @Override
            public void onDeviceFound(String ipAddress, String hostname) {
                // Called each time a device is found
                System.out.println("Found device: " + hostname + " at " + ipAddress);
            }

            @Override
            public void onScanComplete(HashMap<String, String> devices) {
                // Called when scan is complete
                System.out.println("Scan complete! Found " + devices.size() + " devices");
                
                // Process all devices
                for (String ip : devices.keySet()) {
                    String hostname = devices.get(ip);
                    System.out.println(ip + " -> " + hostname);
                }
            }

            @Override
            public void onScanFailed() {
                // Called if scan fails (no WiFi, etc.)
                System.out.println("Scan failed!");
            }
        });
    }

    // Example 2: Scanning with MAC address lookup
    public void scanWithMacAddresses(Context context) {
        NetworkDeviceScanner scanner = NetworkDeviceScanner.getInstance();
        
        scanner.startScan(context, new NetworkDeviceScanner.ScanCallback() {
            @Override
            public void onDeviceFound(String ipAddress, String hostname) {
                // Get MAC address for this device
                String macAddress = MacAddressScanner.getMacAddress(ipAddress);
                System.out.println(hostname + " (" + ipAddress + ") - MAC: " + macAddress);
            }

            @Override
            public void onScanComplete(HashMap<String, String> devices) {
                // Get all MAC addresses at once
                HashMap<String, String> macAddresses = (HashMap<String, String>) 
                        MacAddressScanner.getAllMacAddresses();
                
                for (String ip : devices.keySet()) {
                    String hostname = devices.get(ip);
                    String mac = macAddresses.get(ip);
                    System.out.println(hostname + " - " + ip + " - " + mac);
                }
            }

            @Override
            public void onScanFailed() {
                System.out.println("Scan failed!");
            }
        });
    }

    // Example 3: Building a device list
    public void buildDeviceList(Context context) {
        final java.util.List<DeviceInfo> deviceList = new java.util.ArrayList<>();
        NetworkDeviceScanner scanner = NetworkDeviceScanner.getInstance();
        
        scanner.startScan(context, new NetworkDeviceScanner.ScanCallback() {
            @Override
            public void onDeviceFound(String ipAddress, String hostname) {
                DeviceInfo device = new DeviceInfo(ipAddress, hostname);
                
                // Mark special devices
                if (ipAddress.equals(scanner.getMyIpAddress())) {
                    device.setMyDevice(true);
                }
                if (ipAddress.equals(scanner.getGatewayIpAddress())) {
                    device.setGateway(true);
                }
                
                // Get MAC address
                String mac = MacAddressScanner.getMacAddress(ipAddress);
                device.setMacAddress(mac);
                
                deviceList.add(device);
            }

            @Override
            public void onScanComplete(HashMap<String, String> devices) {
                System.out.println("Built list of " + deviceList.size() + " devices");
                
                // Now you can use deviceList for display, storage, etc.
                for (DeviceInfo device : deviceList) {
                    System.out.println(device.toString());
                }
            }

            @Override
            public void onScanFailed() {
                System.out.println("Scan failed!");
            }
        });
    }

    // Example 4: Checking scan status
    public void checkScanStatus(Context context) {
        NetworkDeviceScanner scanner = NetworkDeviceScanner.getInstance();
        
        if (scanner.isScanning()) {
            System.out.println("Already scanning...");
            Toast.makeText(context, "Scan in progress", Toast.LENGTH_SHORT).show();
            return;
        }
        
        // Start new scan
        scanner.startScan(context, new NetworkDeviceScanner.ScanCallback() {
            @Override
            public void onDeviceFound(String ipAddress, String hostname) {
                // Handle device found
            }

            @Override
            public void onScanComplete(HashMap<String, String> devices) {
                // Handle completion
            }

            @Override
            public void onScanFailed() {
                // Handle failure
            }
        });
    }

    // Example 5: Stopping a scan
    public void stopScanExample() {
        NetworkDeviceScanner scanner = NetworkDeviceScanner.getInstance();
        
        if (scanner.isScanning()) {
            scanner.stopScan();
            System.out.println("Scan stopped");
        }
    }

    // Example 6: Getting network info
    public void getNetworkInfo() {
        NetworkDeviceScanner scanner = NetworkDeviceScanner.getInstance();
        
        String myIp = scanner.getMyIpAddress();
        String gatewayIp = scanner.getGatewayIpAddress();
        
        System.out.println("My IP: " + myIp);
        System.out.println("Gateway IP: " + gatewayIp);
    }

    // Example 7: Simple one-liner scan
    public void quickScan(Context context) {
        NetworkDeviceScanner.getInstance().startScan(context, 
            new NetworkDeviceScanner.ScanCallback() {
                @Override
                public void onDeviceFound(String ip, String hostname) {
                    System.out.println(hostname + " @ " + ip);
                }
                
                @Override
                public void onScanComplete(HashMap<String, String> devices) {
                    System.out.println("Done! Found " + devices.size() + " devices");
                }
                
                @Override
                public void onScanFailed() {
                    System.out.println("Failed!");
                }
            }
        );
    }

    // Example 8: Integration with existing network section
    public void integrateWithExistingCode(Context context) {
        // In your existing network activity/fragment:
        
        // 1. Add a scan button click listener
        // scanButton.setOnClickListener(v -> startDeviceScan());
        
        // 2. Implement the scan method
        NetworkDeviceScanner scanner = NetworkDeviceScanner.getInstance();
        scanner.startScan(context, new NetworkDeviceScanner.ScanCallback() {
            @Override
            public void onDeviceFound(String ipAddress, String hostname) {
                // Update your UI with found device
                // runOnUiThread(() -> {
                //     addDeviceToList(ipAddress, hostname);
                // });
            }

            @Override
            public void onScanComplete(HashMap<String, String> devices) {
                // Update UI to show scan complete
                // runOnUiThread(() -> {
                //     showScanComplete(devices.size());
                // });
            }

            @Override
            public void onScanFailed() {
                // Show error message
                // runOnUiThread(() -> {
                //     showError("Scan failed. Check WiFi connection.");
                // });
            }
        });
    }

    // Example 9: Background scanning with periodic updates
    public void backgroundScanExample(Context context) {
        // You can use this with WorkManager or a Service
        // for periodic background scanning
        
        NetworkDeviceScanner scanner = NetworkDeviceScanner.getInstance();
        scanner.startScan(context, new NetworkDeviceScanner.ScanCallback() {
            @Override
            public void onDeviceFound(String ipAddress, String hostname) {
                // Store in database or shared preferences
                // saveDeviceToDatabase(ipAddress, hostname);
            }

            @Override
            public void onScanComplete(HashMap<String, String> devices) {
                // Compare with previous scan
                // checkForNewDevices(devices);
                // sendNotificationIfNewDevice();
            }

            @Override
            public void onScanFailed() {
                // Log failure
                // logScanFailure();
            }
        });
    }

    // Example 10: Custom timeout and configuration
    public void customConfigExample(Context context) {
        // If you need to modify the scanner behavior,
        // you can edit NetworkDeviceScanner.java:
        
        // 1. Change timeout per device (default 3000ms):
        //    PingRunnable pingRunnable = new PingRunnable(ipAddress, 5000);
        
        // 2. Change total scan timeout (default 20 seconds):
        //    executor.awaitTermination(30L, TimeUnit.SECONDS)
        
        // 3. Change thread pool size (default 255):
        //    Executors.newFixedThreadPool(100)
        
        // 4. Change IP range (default 1-255):
        //    for (int i = 1; i <= 100; i++)
    }
}
