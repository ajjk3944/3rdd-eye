package app.thirdeye.scanner;

import android.util.Log;
import com.getcapacitor.JSObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Advanced ARP Scanning Service
 * Uses multiple techniques to discover ALL devices on network
 * Updated for Android 10+ compatibility without root
 */
public class ARPScanService {
    private static final String TAG = "ARPScanService";
    
    // Common ports to probe for device discovery
    private static final int[] PROBE_PORTS = {80, 443, 8080, 7, 135, 445, 62078, 22, 23, 21};
    
    /**
     * Aggressive network scan that forces ARP cache population
     * Updated to work on Android 10+ without root
     */
    public static List<JSObject> aggressiveScan(String subnet) {
        Map<String, JSObject> deviceMap = new HashMap<>();
        
        try {
            Log.d(TAG, "Starting aggressive ARP scan on subnet: " + subnet);
            
            // Step 1: Force ARP cache population using TCP probes (primary method)
            forceARPCachePopulation(subnet);
            
            // Step 2: Read ARP cache multiple times (it updates dynamically)
            for (int attempt = 0; attempt < 3; attempt++) {
                Thread.sleep(500); // Wait for ARP cache to update
                List<JSObject> arpDevices = readARPCache();
                
                for (JSObject device : arpDevices) {
                    String ip = device.getString("ipAddress");
                    if (ip != null && !deviceMap.containsKey(ip)) {
                        deviceMap.put(ip, device);
                    }
                }
                
                Log.d(TAG, "ARP scan attempt " + (attempt + 1) + " found " + arpDevices.size() + " devices");
            }
            
            // Step 3: Verify devices are actually reachable
            verifyDevices(deviceMap);
            
            Log.d(TAG, "Aggressive scan complete. Total devices: " + deviceMap.size());
            
        } catch (Exception e) {
            Log.e(TAG, "Aggressive scan error", e);
        }
        
        return new ArrayList<>(deviceMap.values());
    }
    
    /**
     * Force ARP cache population using TCP connect probes
     * This works without root on all Android versions
     */
    private static void forceARPCachePopulation(String subnet) {
        ExecutorService executor = Executors.newFixedThreadPool(50);
        
        try {
            // Probe all 254 possible IPs simultaneously using TCP
            for (int i = 1; i <= 254; i++) {
                final String host = subnet + i;
                executor.execute(() -> {
                    try {
                        // TCP connect is the most reliable method without root
                        // Try multiple common ports
                        for (int port : PROBE_PORTS) {
                            if (tryQuickConnect(host, port, 100)) {
                                break; // Found a responsive port, no need to try others
                            }
                        }
                        
                        // Also try UDP echo as secondary method
                        tryUdpProbe(host);
                        
                    } catch (Exception e) {
                        // Ignore - we just want to populate ARP cache
                    }
                });
            }
            
            executor.shutdown();
            executor.awaitTermination(8, TimeUnit.SECONDS);
            
            Log.d(TAG, "ARP cache population complete");
            
        } catch (Exception e) {
            Log.e(TAG, "Error populating ARP cache", e);
        }
    }
    
    /**
     * Read ARP cache from /proc/net/arp and ip neighbor
     * Updated to work on Android 10+
     */
    private static List<JSObject> readARPCache() {
        List<JSObject> devices = new ArrayList<>();
        Map<String, JSObject> deviceMap = new HashMap<>();
        
        // Try /proc/net/arp first (works on older Android)
        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader("/proc/net/arp"));
            String line;
            reader.readLine(); // Skip header
            
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                if (parts.length >= 4) {
                    String ip = parts[0];
                    String mac = parts[3];
                    String flags = parts.length > 2 ? parts[2] : "";
                    
                    // Accept valid entries - don't filter by flags too strictly
                    // Accept 0x2 (complete), 0x6 (reachable), but exclude 0x0 (incomplete)
                    boolean validFlags = !flags.equals("0x0");
                    
                    if (!mac.equals("00:00:00:00:00:00") && 
                        !ip.equals("0.0.0.0") &&
                        validFlags) {
                        
                        JSObject device = new JSObject();
                        device.put("ipAddress", ip);
                        device.put("macAddress", mac);
                        device.put("source", "ARP Cache");
                        device.put("isOnline", true);
                        device.put("timestamp", System.currentTimeMillis());
                        
                        deviceMap.put(ip, device);
                    }
                }
            }
            reader.close();
            
        } catch (Exception e) {
            Log.w(TAG, "Error reading /proc/net/arp (expected on Android 10+): " + e.getMessage());
        }
        
        // Try ip neighbor command (works on Android 10+)
        try {
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
                    
                    if (mac != null && !mac.equals("00:00:00:00:00:00") && !ip.equals("0.0.0.0")) {
                        // Don't filter by state - include STALE entries too
                        JSObject device = new JSObject();
                        device.put("ipAddress", ip);
                        device.put("macAddress", mac);
                        device.put("state", state);
                        device.put("source", "IP Neighbor");
                        device.put("isOnline", state != null && !state.equals("FAILED"));
                        device.put("timestamp", System.currentTimeMillis());
                        
                        deviceMap.put(ip, device);
                    }
                }
            }
            
            reader.close();
            process.waitFor();
            
        } catch (Exception e) {
            Log.w(TAG, "Error reading ip neighbor: " + e.getMessage());
        }
        
        devices.addAll(deviceMap.values());
        return devices;
    }
    
    /**
     * Verify devices are actually reachable using TCP connect
     * This is the most reliable method without root
     */
    private static void verifyDevices(Map<String, JSObject> deviceMap) {
        ExecutorService executor = Executors.newFixedThreadPool(32);
        
        for (Map.Entry<String, JSObject> entry : deviceMap.entrySet()) {
            final String ip = entry.getKey();
            final JSObject device = entry.getValue();
            
            executor.execute(() -> {
                try {
                    boolean reachable = false;
                    
                    // Primary: Try TCP connect to common ports
                    for (int port : new int[]{80, 443, 8080, 22, 7}) {
                        if (tryQuickConnect(ip, port, 300)) {
                            reachable = true;
                            break;
                        }
                    }
                    
                    // Secondary: Try InetAddress.isReachable (may not work without root)
                    if (!reachable) {
                        try {
                            InetAddress address = InetAddress.getByName(ip);
                            reachable = address.isReachable(500);
                        } catch (Exception e) {
                            // Ignore
                        }
                    }
                    
                    // Tertiary: Try UDP probe
                    if (!reachable) {
                        reachable = tryUdpProbe(ip);
                    }
                    
                    device.put("isReachable", reachable);
                    device.put("isOnline", reachable);
                    
                    // Try to get hostname
                    if (reachable) {
                        try {
                            InetAddress address = InetAddress.getByName(ip);
                            String hostname = address.getHostName();
                            if (hostname != null && !hostname.equals(ip)) {
                                device.put("hostname", hostname);
                            }
                        } catch (Exception e) {
                            // Ignore
                        }
                    }
                    
                } catch (Exception e) {
                    device.put("isReachable", false);
                }
            });
        }
        
        try {
            executor.shutdown();
            executor.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e(TAG, "Verification interrupted", e);
        }
    }
    
    /**
     * Quick TCP connect attempt - PRIMARY method for device discovery
     */
    private static boolean tryQuickConnect(String host, int port, int timeout) {
        Socket socket = null;
        try {
            socket = new Socket();
            socket.connect(new InetSocketAddress(host, port), timeout);
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (Exception e) {
                    // Ignore
                }
            }
        }
    }
    
    /**
     * UDP probe to port 7 (echo) - works without root
     */
    private static boolean tryUdpProbe(String host) {
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket();
            socket.setSoTimeout(200);
            
            byte[] data = "ping".getBytes();
            java.net.DatagramPacket packet = new java.net.DatagramPacket(
                    data, data.length,
                    InetAddress.getByName(host), 7);
            
            socket.send(packet);
            
            // Try to receive response (may timeout, but that's ok)
            byte[] buffer = new byte[1024];
            java.net.DatagramPacket response = new java.net.DatagramPacket(buffer, buffer.length);
            socket.receive(response);
            
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            if (socket != null) {
                socket.close();
            }
        }
    }
    
    /**
     * Alternative method: Use 'ip neighbor' command
     * Updated to use 'ip neighbor' instead of 'ip neigh show'
     */
    public static List<JSObject> scanUsingIPNeigh() {
        List<JSObject> devices = new ArrayList<>();
        
        try {
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
                    
                    if (mac != null && !mac.equals("00:00:00:00:00:00")) {
                        JSObject device = new JSObject();
                        device.put("ipAddress", ip);
                        device.put("macAddress", mac);
                        device.put("state", state);
                        device.put("source", "IP Neighbor");
                        device.put("isOnline", state != null && !state.equals("FAILED"));
                        device.put("timestamp", System.currentTimeMillis());
                        
                        devices.add(device);
                    }
                }
            }
            
            reader.close();
            process.waitFor();
            
            Log.d(TAG, "IP neighbor scan found " + devices.size() + " devices");
            
        } catch (Exception e) {
            Log.w(TAG, "IP neighbor scan failed (expected on some devices): " + e.getMessage());
        }
        
        return devices;
    }
    
    /**
     * Broadcast ping - removed as it doesn't work on modern Android without root
     * Kept as stub for compatibility
     */
    public static void broadcastPing(String subnet) {
        // Broadcast ping doesn't work on modern Android without root
        // This is now a no-op, but kept for API compatibility
        Log.d(TAG, "Broadcast ping skipped (not supported without root)");
    }
}
