package com.thirdeye.network;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.text.TextUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * MAC Address Scanner - Reads ARP table to get MAC addresses
 * This is used to get hardware addresses of devices on the network
 */
public class MacAddressScanner {

    private static final String ARP_TABLE_PATH = "/proc/net/arp";
    
    /**
     * Get MAC address for a specific IP address from ARP table
     */
    public static String getMacAddress(String ipAddress) {
        if (TextUtils.isEmpty(ipAddress)) {
            return "00:00:00:00:00:00";
        }
        
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(ARP_TABLE_PATH));
            String line;
            
            // Skip header line
            reader.readLine();
            
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                
                // ARP table format: IP address HW type Flags HW address Mask Device
                if (parts.length >= 4) {
                    String arpIp = parts[0];
                    String arpMac = parts[3];
                    
                    if (ipAddress.equals(arpIp)) {
                        // Validate MAC address format
                        if (isValidMacAddress(arpMac)) {
                            return arpMac.toUpperCase();
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
        return "00:00:00:00:00:00";
    }
    
    /**
     * Get all MAC addresses from ARP table
     */
    public static Map<String, String> getAllMacAddresses() {
        Map<String, String> arpTable = new HashMap<>();
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new FileReader(ARP_TABLE_PATH));
            String line;
            
            // Skip header line
            reader.readLine();
            
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                
                if (parts.length >= 4) {
                    String ip = parts[0];
                    String mac = parts[3];
                    
                    if (isValidMacAddress(mac)) {
                        arpTable.put(ip, mac.toUpperCase());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
        return arpTable;
    }
    
    /**
     * Validate MAC address format
     */
    private static boolean isValidMacAddress(String mac) {
        if (TextUtils.isEmpty(mac)) {
            return false;
        }
        
        // Check if it's not the invalid MAC (00:00:00:00:00:00)
        if (mac.equals("00:00:00:00:00:00")) {
            return false;
        }
        
        // Check MAC address pattern (XX:XX:XX:XX:XX:XX)
        return mac.matches("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$");
    }
    
    /**
     * Get router MAC address
     */
    public static String getRouterMacAddress(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext()
                    .getSystemService(Context.WIFI_SERVICE);
            
            if (wifiManager != null) {
                String gatewayIp = NetworkDeviceScanner.getInstance().getGatewayIpAddress();
                if (!TextUtils.isEmpty(gatewayIp)) {
                    return getMacAddress(gatewayIp);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return "00:00:00:00:00:00";
    }
}
