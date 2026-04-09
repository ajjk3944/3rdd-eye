package app.thirdeye.scanner.network;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.format.Formatter;
import android.util.Log;

import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Network Device Scanner - Scans local network for connected devices
 * Based on WiFi Theft Detector implementation
 */
public class NetworkDeviceScanner {
    private static final String TAG = "NetworkDeviceScanner";
    private static final int THREAD_POOL_SIZE = 255;
    private static final int PING_TIMEOUT = 1000; // 1 second per device (faster)
    private static final int SCAN_TIMEOUT = 30; // 30 seconds total

    private final Context context;
    private final List<DeviceInfo> discoveredDevices;
    private ScanCallback callback;
    private boolean isScanning = false;
    private final AtomicInteger scannedCount = new AtomicInteger(0);

    public interface ScanCallback {
        void onScanStarted();
        void onDeviceFound(DeviceInfo device);
        void onScanProgress(int current, int total);
        void onScanCompleted(List<DeviceInfo> devices);
        void onScanError(String error);
    }

    public NetworkDeviceScanner(Context context) {
        this.context = context.getApplicationContext();
        this.discoveredDevices = new ArrayList<>();
    }

    public void setScanCallback(ScanCallback callback) {
        this.callback = callback;
    }

    public boolean isScanning() {
        return isScanning;
    }

    public void startScan() {
        if (isScanning) {
            Log.w(TAG, "Scan already in progress");
            return;
        }

        discoveredDevices.clear();
        scannedCount.set(0);
        isScanning = true;

        if (callback != null) {
            callback.onScanStarted();
        }

        new Thread(() -> {
            try {
                performScan();
            } catch (Exception e) {
                Log.e(TAG, "Scan error", e);
                if (callback != null) {
                    callback.onScanError(e.getMessage());
                }
            } finally {
                isScanning = false;
            }
        }).start();
    }

    private void performScan() {
        // Get WiFi manager
        WifiManager wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        if (wifiManager == null) {
            if (callback != null) {
                callback.onScanError("WiFi not available");
            }
            return;
        }

        // Check if WiFi is enabled
        if (!wifiManager.isWifiEnabled()) {
            if (callback != null) {
                callback.onScanError("WiFi is disabled");
            }
            return;
        }

        // Get WiFi info
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
        if (wifiInfo == null) {
            if (callback != null) {
                callback.onScanError("Not connected to WiFi");
            }
            return;
        }

        // Get device IP and gateway
        int deviceIp = wifiInfo.getIpAddress();
        String deviceIpStr = Formatter.formatIpAddress(deviceIp);
        
        int gatewayIp = wifiManager.getDhcpInfo().gateway;
        String gatewayIpStr = Formatter.formatIpAddress(gatewayIp);

        Log.d(TAG, "Device IP: " + deviceIpStr);
        Log.d(TAG, "Gateway IP: " + gatewayIpStr);

        // Calculate subnet prefix (e.g., "192.168.1.")
        String subnetPrefix = deviceIpStr.substring(0, deviceIpStr.lastIndexOf('.') + 1);
        Log.d(TAG, "Scanning subnet: " + subnetPrefix + "0/24");

        // First, read ARP table to get known devices
        MacAddressScanner macScanner = new MacAddressScanner(context);
        List<DeviceInfo> arpDevices = macScanner.getDevicesFromArpTable();
        
        Log.d(TAG, "Found " + arpDevices.size() + " devices in ARP table");
        
        // Add ARP devices immediately
        for (DeviceInfo device : arpDevices) {
            synchronized (discoveredDevices) {
                discoveredDevices.add(device);
            }
            if (callback != null) {
                callback.onDeviceFound(device);
            }
        }

        // Create thread pool for parallel scanning
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

        // Scan all IPs in subnet (1-255)
        for (int i = 1; i <= 255; i++) {
            final String ipAddress = subnetPrefix + i;
            final int index = i;
            executor.execute(() -> {
                pingDevice(ipAddress);
                int count = scannedCount.incrementAndGet();
                if (callback != null && count % 10 == 0) {
                    callback.onScanProgress(count, 255);
                }
            });
        }

        // Shutdown executor and wait for completion
        executor.shutdown();
        try {
            if (!executor.awaitTermination(SCAN_TIMEOUT, TimeUnit.SECONDS)) {
                executor.shutdownNow();
                Log.w(TAG, "Scan timeout reached");
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }

        // Enrich devices with MAC addresses from ARP table again
        macScanner.enrichDevicesWithMacAddresses(discoveredDevices);

        // Mark special devices
        markSpecialDevices(deviceIpStr, gatewayIpStr);

        // Notify completion
        if (callback != null) {
            callback.onScanCompleted(new ArrayList<>(discoveredDevices));
        }

        Log.d(TAG, "Scan completed. Found " + discoveredDevices.size() + " devices");
    }

    private void pingDevice(String ipAddress) {
        try {
            InetAddress inetAddress = InetAddress.getByName(ipAddress);
            
            // Try multiple methods to detect device
            boolean isReachable = false;
            
            // Method 1: Standard ping
            try {
                isReachable = inetAddress.isReachable(PING_TIMEOUT);
            } catch (IOException e) {
                Log.v(TAG, "Standard ping failed for " + ipAddress);
            }
            
            // Method 2: Try with network interface (more reliable on Android)
            if (!isReachable) {
                try {
                    isReachable = inetAddress.isReachable(null, 0, PING_TIMEOUT);
                } catch (IOException e) {
                    Log.v(TAG, "Network interface ping failed for " + ipAddress);
                }
            }
            
            if (isReachable) {
                String hostname = inetAddress.getCanonicalHostName();
                
                // Check if device already exists (from ARP table)
                boolean exists = false;
                synchronized (discoveredDevices) {
                    for (DeviceInfo existing : discoveredDevices) {
                        if (existing.getIpAddress().equals(ipAddress)) {
                            exists = true;
                            // Update hostname if we got a better one
                            if (!hostname.equals(ipAddress) && existing.getHostname().equals(ipAddress)) {
                                existing.setHostname(hostname);
                                existing.setDeviceName(hostname);
                            }
                            break;
                        }
                    }
                }
                
                if (!exists) {
                    // Create device info
                    DeviceInfo device = new DeviceInfo();
                    device.setIpAddress(ipAddress);
                    device.setHostname(hostname);
                    device.setDeviceName(hostname.equals(ipAddress) ? "Unknown Device" : hostname);
                    device.setOnline(true);

                    // Add to discovered devices
                    synchronized (discoveredDevices) {
                        discoveredDevices.add(device);
                    }

                    // Notify callback
                    if (callback != null) {
                        callback.onDeviceFound(device);
                    }

                    Log.d(TAG, "Device found: " + ipAddress + " (" + hostname + ")");
                }
            }
        } catch (Exception e) {
            Log.v(TAG, "Error pinging " + ipAddress + ": " + e.getMessage());
        }
    }

    private void markSpecialDevices(String deviceIp, String gatewayIp) {
        for (DeviceInfo device : discoveredDevices) {
            if (device.getIpAddress().equals(gatewayIp)) {
                device.setDeviceName("Router (Gateway)");
                device.setIsRouter(true);
            } else if (device.getIpAddress().equals(deviceIp)) {
                device.setDeviceName("This Device");
                device.setIsThisDevice(true);
            }
        }
    }

    public void stopScan() {
        isScanning = false;
    }

    public List<DeviceInfo> getDiscoveredDevices() {
        return new ArrayList<>(discoveredDevices);
    }
}
