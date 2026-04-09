package app.thirdeye.scanner;

import android.util.Log;
import com.getcapacitor.JSObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Brute Force Scanner - The Nuclear Option
 * Pings EVERY IP in the subnet and forces ARP cache population
 */
public class BruteForceScanner {
    private static final String TAG = "BruteForceScanner";
    
    public static List<JSObject> scanSubnet(String subnet) {
        Log.d(TAG, "=== BRUTE FORCE SCAN START ===");
        Log.d(TAG, "Scanning subnet: " + subnet);
        
        // Step 1: Multiple ping waves to force ARP cache population
        for (int wave = 1; wave <= 3; wave++) {
            Log.d(TAG, "Ping wave " + wave + "/3");
            pingAllIPs(subnet, wave);
            
            // Wait between waves
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        
        // Step 2: Wait for ARP cache to fully populate
        try {
            Thread.sleep(3000); // Wait 3 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        // Step 3: Read ARP cache multiple times
        Map<String, JSObject> deviceMap = new HashMap<>();
        
        for (int attempt = 1; attempt <= 7; attempt++) {
            Log.d(TAG, "Reading ARP cache - attempt " + attempt);
            List<JSObject> arpDevices = readARPCache();
            
            for (JSObject device : arpDevices) {
                String ip = device.getString("ipAddress");
                if (ip != null && !deviceMap.containsKey(ip)) {
                    deviceMap.put(ip, device);
                }
            }
            
            Log.d(TAG, "Attempt " + attempt + " found " + arpDevices.size() + " devices, total unique: " + deviceMap.size());
            
            // Wait between attempts
            if (attempt < 7) {
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
        
        List<JSObject> result = new ArrayList<>(deviceMap.values());
        Log.d(TAG, "=== BRUTE FORCE SCAN END ===");
        Log.d(TAG, "Final result: " + result.size() + " devices found");
        
        return result;
    }
    
    private static void pingAllIPs(String subnet, int wave) {
        Log.d(TAG, "Pinging all IPs in subnet: " + subnet + " (wave " + wave + ")");
        
        ExecutorService executor = Executors.newFixedThreadPool(100); // More threads
        AtomicInteger pingedCount = new AtomicInteger(0);
        AtomicInteger reachableCount = new AtomicInteger(0);
        
        for (int i = 1; i <= 254; i++) {
            final String ip = subnet + i;
            executor.execute(() -> {
                try {
                    // Multiple ping attempts per wave
                    for (int attempt = 0; attempt < wave; attempt++) {
                        InetAddress address = InetAddress.getByName(ip);
                        boolean reachable = address.isReachable(150); // Shorter timeout
                        
                        if (reachable) {
                            reachableCount.incrementAndGet();
                            Log.d(TAG, "PING SUCCESS: " + ip + " (wave " + wave + ")");
                        }
                        
                        // Also try TCP connections to force ARP entries
                        tryQuickConnect(ip, 80, 100);
                        tryQuickConnect(ip, 443, 100);
                        tryQuickConnect(ip, 22, 100);
                        tryQuickConnect(ip, 23, 100);
                        tryQuickConnect(ip, 53, 100);
                        
                        // Small delay between attempts
                        if (attempt < wave - 1) {
                            Thread.sleep(50);
                        }
                    }
                    
                    pingedCount.incrementAndGet();
                    
                } catch (Exception e) {
                    pingedCount.incrementAndGet();
                }
            });
        }
        
        executor.shutdown();
        try {
            executor.awaitTermination(45, TimeUnit.SECONDS); // Longer timeout
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        Log.d(TAG, "Ping wave " + wave + " complete: " + pingedCount.get() + " IPs pinged, " + reachableCount.get() + " reachable");
    }
    
    private static boolean tryQuickConnect(String host, int port, int timeout) {
        try {
            java.net.Socket socket = new java.net.Socket();
            socket.connect(new java.net.InetSocketAddress(host, port), timeout);
            socket.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    private static List<JSObject> readARPCache() {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/proc/net/arp"));
            String line;
            reader.readLine(); // Skip header
            
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                if (parts.length >= 4) {
                    String ip = parts[0];
                    String mac = parts[3];
                    String flags = parts[2];
                    
                    // Only include valid entries
                    if (!mac.equals("00:00:00:00:00:00") && 
                        !ip.equals("0.0.0.0") &&
                        !mac.equals("*")) {
                        
                        Log.d(TAG, "ARP Entry: " + ip + " -> " + mac + " (flags: " + flags + ")");
                        
                        JSObject device = new JSObject();
                        device.put("ipAddress", ip);
                        device.put("macAddress", mac);
                        device.put("source", "Brute Force ARP");
                        device.put("isOnline", true);
                        device.put("hostname", "Unknown");
                        device.put("deviceType", "Network Device");
                        device.put("timestamp", System.currentTimeMillis());
                        
                        devices.add(device);
                    }
                }
            }
            reader.close();
            
        } catch (IOException e) {
            Log.e(TAG, "Error reading ARP cache", e);
        }
        
        return devices;
    }
    
    // Alternative method: Use 'ip neigh' command
    public static List<JSObject> scanUsingIPNeigh() {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            Log.d(TAG, "Trying 'ip neigh' command...");
            Process process = Runtime.getRuntime().exec("ip neigh show");
            BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(process.getInputStream()));
            String line;
            
            while ((line = reader.readLine()) != null) {
                Log.d(TAG, "IP NEIGH: " + line);
                
                // Parse: 192.168.1.1 dev wlan0 lladdr aa:bb:cc:dd:ee:ff REACHABLE
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
                    
                    if (mac != null && !mac.equals("00:00:00:00:00:00")) {
                        JSObject device = new JSObject();
                        device.put("ipAddress", ip);
                        device.put("macAddress", mac);
                        device.put("state", state);
                        device.put("source", "IP Neigh");
                        device.put("isOnline", state != null && state.equals("REACHABLE"));
                        device.put("hostname", "Unknown");
                        device.put("deviceType", "Network Device");
                        device.put("timestamp", System.currentTimeMillis());
                        
                        devices.add(device);
                    }
                }
            }
            
            reader.close();
            process.waitFor();
            
            Log.d(TAG, "IP neigh found " + devices.size() + " devices");
            
        } catch (Exception e) {
            Log.e(TAG, "IP neigh failed", e);
        }
        
        return devices;
    }
}