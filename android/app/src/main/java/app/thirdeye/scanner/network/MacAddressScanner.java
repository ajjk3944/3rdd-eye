package app.thirdeye.scanner.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * MAC Address Scanner - Reads ARP table to get MAC addresses
 * Updated for Android 10+ compatibility
 */
public class MacAddressScanner {
    private static final String TAG = "MacAddressScanner";
    private static final String ARP_TABLE_PATH = "/proc/net/arp";
    private static final Pattern MAC_PATTERN = Pattern.compile("([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})");
    
    private Context context;

    public MacAddressScanner(Context context) {
        this.context = context;
    }

    /**
     * Get devices from ARP table - works on Android 9 and below
     * On Android 10+, this may return limited results
     */
    public List<DeviceInfo> getDevicesFromArpTable() {
        List<DeviceInfo> devices = new ArrayList<>();
        
        // Try /proc/net/arp first (works on older Android)
        devices.addAll(readProcNetArp());
        
        // Try ip neighbor command as fallback
        if (devices.isEmpty() || Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            devices.addAll(readIpNeighbor());
        }
        
        Log.d(TAG, "Found " + devices.size() + " devices total");
        return devices;
    }

    private List<DeviceInfo> readProcNetArp() {
        List<DeviceInfo> devices = new ArrayList<>();
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(ARP_TABLE_PATH));
            String line;
            
            // Skip header line
            reader.readLine();
            
            while ((line = reader.readLine()) != null) {
                String[] parts = line.trim().split("\\s+");
                
                if (parts.length >= 4) {
                    String ip = parts[0];
                    String mac = parts[3];
                    String flags = parts.length > 2 ? parts[2] : "";
                    
                    // Validate MAC address and IP
                    if (isValidMacAddress(mac) && !ip.equals("0.0.0.0")) {
                        DeviceInfo device = new DeviceInfo();
                        device.setIpAddress(ip);
                        device.setMacAddress(mac.toUpperCase());
                        device.setHostname(ip);
                        device.setDeviceName("Unknown Device");
                        device.setOnline(true);
                        
                        devices.add(device);
                        Log.d(TAG, "ARP device: " + ip + " -> " + mac);
                    }
                }
            }
            
            reader.close();
            Log.d(TAG, "Found " + devices.size() + " devices in /proc/net/arp");
            
        } catch (Exception e) {
            Log.w(TAG, "Error reading /proc/net/arp (expected on Android 10+): " + e.getMessage());
        }
        
        return devices;
    }

    private List<DeviceInfo> readIpNeighbor() {
        List<DeviceInfo> devices = new ArrayList<>();
        
        try {
            // Use "ip neighbor" instead of "ip neigh show" (doesn't require root)
            Process process = Runtime.getRuntime().exec("ip neighbor");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            
            while ((line = reader.readLine()) != null) {
                // Format: 192.168.1.1 dev wlan0 lladdr aa:bb:cc:dd:ee:ff REACHABLE
                String[] parts = line.split("\\s+");
                
                if (parts.length >= 5) {
                    String ip = parts[0];
                    String mac = null;
                    String state = null;
                    
                    for (int i = 0; i < parts.length; i++) {
                        if (parts[i].equals("lladdr") && i + 1 < parts.length) {
                            mac = parts[i + 1];
                        }
                        if (parts[i].matches("REACHABLE|STALE|DELAY|PROBE")) {
                            state = parts[i];
                        }
                    }
                    
                    if (isValidMacAddress(mac) && !ip.equals("0.0.0.0")) {
                        DeviceInfo device = new DeviceInfo();
                        device.setIpAddress(ip);
                        device.setMacAddress(mac.toUpperCase());
                        device.setHostname(ip);
                        device.setDeviceName("Unknown Device");
                        device.setOnline(state != null && !state.equals("FAILED"));
                        
                        devices.add(device);
                        Log.d(TAG, "IP neighbor device: " + ip + " -> " + mac + " (" + state + ")");
                    }
                }
            }
            
            reader.close();
            process.waitFor();
            
            Log.d(TAG, "Found " + devices.size() + " devices via ip neighbor");
            
        } catch (Exception e) {
            Log.w(TAG, "Error reading ip neighbor: " + e.getMessage());
        }
        
        return devices;
    }

    public void enrichDevicesWithMacAddresses(List<DeviceInfo> devices) {
        // Try both methods to enrich
        Map<String, String> ipToMac = new HashMap<>();
        
        // Collect from /proc/net/arp
        try {
            BufferedReader reader = new BufferedReader(new FileReader(ARP_TABLE_PATH));
            String line;
            reader.readLine(); // Skip header
            
            while ((line = reader.readLine()) != null) {
                String[] parts = line.trim().split("\\s+");
                if (parts.length >= 4) {
                    String ip = parts[0];
                    String mac = parts[3];
                    if (isValidMacAddress(mac) && !ip.equals("0.0.0.0")) {
                        ipToMac.put(ip, mac.toUpperCase());
                    }
                }
            }
            reader.close();
        } catch (Exception e) {
            Log.w(TAG, "Error reading ARP table for enrichment: " + e.getMessage());
        }
        
        // Collect from ip neighbor
        try {
            Process process = Runtime.getRuntime().exec("ip neighbor");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                if (parts.length >= 5) {
                    String ip = parts[0];
                    String mac = null;
                    
                    for (int i = 0; i < parts.length; i++) {
                        if (parts[i].equals("lladdr") && i + 1 < parts.length) {
                            mac = parts[i + 1];
                            break;
                        }
                    }
                    
                    if (isValidMacAddress(mac) && !ip.equals("0.0.0.0")) {
                        ipToMac.put(ip, mac.toUpperCase());
                    }
                }
            }
            reader.close();
            process.waitFor();
        } catch (Exception e) {
            Log.w(TAG, "Error reading ip neighbor for enrichment: " + e.getMessage());
        }
        
        // Enrich devices
        for (DeviceInfo device : devices) {
            String ip = device.getIpAddress();
            if (ipToMac.containsKey(ip)) {
                if (device.getMacAddress() == null || device.getMacAddress().isEmpty()) {
                    device.setMacAddress(ipToMac.get(ip));
                    Log.d(TAG, "MAC found for " + ip + ": " + ipToMac.get(ip));
                }
            }
        }
    }

    private boolean isValidMacAddress(String mac) {
        if (mac == null || mac.isEmpty()) {
            return false;
        }
        
        // Check if it's all zeros
        if (mac.equals("00:00:00:00:00:00") || mac.equals("00-00-00-00-00-00")) {
            return false;
        }
        
        // Validate format
        Matcher matcher = MAC_PATTERN.matcher(mac);
        return matcher.matches();
    }
}

