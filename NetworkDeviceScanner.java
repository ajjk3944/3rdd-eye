package com.thirdeye.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;

import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Network Device Scanner - Scans local network for connected devices
 * Based on WiFi Theft Detector implementation
 */
public class NetworkDeviceScanner {

    private static NetworkDeviceScanner instance;
    
    private String subnetPrefix; // e.g., "192.168.1."
    private String myIpAddress;
    private String gatewayIpAddress;
    private final HashMap<String, String> discoveredDevices = new HashMap<>();
    private ScanCallback callback = null;
    private boolean isScanning = false;
    private boolean shouldStop = false;

    public static NetworkDeviceScanner getInstance() {
        if (instance == null) {
            instance = new NetworkDeviceScanner();
        }
        return instance;
    }

    /**
     * Callback interface for scan results
     */
    public interface ScanCallback {
        void onDeviceFound(String ipAddress, String hostname);
        void onScanComplete(HashMap<String, String> devices);
        void onScanFailed();
    }

    /**
     * Start scanning the network for devices
     */
    public void startScan(Context context, ScanCallback callback) {
        this.shouldStop = false;
        this.callback = callback;
        
        if (isScanning || !isWifiConnected(context)) {
            if (this.callback != null) {
                this.callback.onScanFailed();
            }
            return;
        }
        
        isScanning = true;
        discoveredDevices.clear();
        initializeNetworkInfo(context);
        
        new Thread(new ScanRunnable()).start();
    }

    /**
     * Stop the current scan
     */
    public void stopScan() {
        this.shouldStop = true;
        if (this.shouldStop) {
            this.isScanning = false;
        }
    }

    /**
     * Check if currently scanning
     */
    public boolean isScanning() {
        return isScanning;
    }

    /**
     * Get my device IP address
     */
    public String getMyIpAddress() {
        return myIpAddress;
    }

    /**
     * Get gateway IP address
     */
    public String getGatewayIpAddress() {
        return gatewayIpAddress;
    }

    /**
     * Initialize network information (IP addresses, subnet)
     */
    private void initializeNetworkInfo(Context context) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext()
                .getSystemService(Context.WIFI_SERVICE);
        
        if (wifiManager != null) {
            gatewayIpAddress = convertLongToIp(wifiManager.getDhcpInfo().gateway);
            myIpAddress = convertLongToIp(wifiManager.getConnectionInfo().getIpAddress());
            String ipAddress = convertLongToIp(wifiManager.getDhcpInfo().ipAddress);
            
            if (ipAddress != null) {
                subnetPrefix = ipAddress.substring(0, ipAddress.lastIndexOf(".") + 1);
            }
        }
    }

    /**
     * Check if WiFi is connected
     */
    private boolean isWifiConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if (cm != null) {
            NetworkInfo networkInfo = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            return networkInfo != null && networkInfo.isConnected();
        }
        return false;
    }

    /**
     * Convert long IP to string format
     */
    private String convertLongToIp(long ipLong) {
        try {
            byte[] bytes = BigInteger.valueOf(ipLong).toByteArray();
            reverseArray(bytes, 0, bytes.length);
            return InetAddress.getByAddress(bytes).getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Reverse byte array
     */
    private void reverseArray(byte[] array, int start, int length) {
        if (array == null) return;
        
        int end = Math.min(array.length, length) - 1;
        for (int i = Math.max(start, 0); end > i; i++) {
            byte temp = array[end];
            array[end] = array[i];
            array[i] = temp;
            end--;
        }
    }

    /**
     * Main scanning runnable
     */
    private class ScanRunnable implements Runnable {
        @Override
        public void run() {
            ExecutorService executor = Executors.newFixedThreadPool(255);
            
            for (int i = 1; i <= 255; i++) {
                if (shouldStop) {
                    isScanning = false;
                    return;
                }
                
                String ipAddress = subnetPrefix + i;
                PingRunnable pingRunnable = new PingRunnable(ipAddress, 3000);
                
                if (shouldStop) {
                    isScanning = false;
                    return;
                }
                
                executor.execute(pingRunnable);
            }
            
            try {
                if (!executor.awaitTermination(20L, TimeUnit.SECONDS)) {
                    executor.shutdown();
                }
                
                if (shouldStop) {
                    isScanning = false;
                    return;
                }
            } catch (Exception e) {
                executor.shutdown();
                e.printStackTrace();
                
                if (shouldStop) {
                    isScanning = false;
                    return;
                } else if (callback != null) {
                    callback.onScanFailed();
                }
            }
            
            if (callback != null) {
                callback.onScanComplete(discoveredDevices);
            }
            
            callback = null;
            isScanning = false;
        }
    }

    /**
     * Ping runnable for individual IP addresses
     */
    private class PingRunnable implements Runnable {
        private final String ipAddress;
        private final int timeout;

        public PingRunnable(String ipAddress, int timeout) {
            this.ipAddress = ipAddress;
            this.timeout = timeout;
        }

        @Override
        public void run() {
            try {
                InetAddress inetAddress = InetAddress.getByName(ipAddress);
                
                if (!inetAddress.isReachable(timeout)) {
                    return;
                }
                
                String hostname;
                if (TextUtils.equals(ipAddress, myIpAddress)) {
                    hostname = Build.MODEL; // My device
                } else {
                    hostname = inetAddress.getHostName();
                }
                
                synchronized (discoveredDevices) {
                    discoveredDevices.put(ipAddress, hostname);
                }
                
                if (callback != null) {
                    callback.onDeviceFound(ipAddress, hostname);
                }
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
