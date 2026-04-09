package app.thirdeye.scanner.iot;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.util.Log;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;

import org.json.JSONArray;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Orchestrates the full IoT discovery process - combines network scan, 
 * classification, and security assessment.
 */
public class IoTDiscoveryManager {
    private static final String TAG = "ThirdEye-IoT";
    private static final int SCAN_TIMEOUT = 30000; // 30 seconds
    private static final int PING_TIMEOUT = 1000;  // 1 second
    private static final int PORT_SCAN_TIMEOUT = 200; // 200ms per port
    
    private Context context;
    private WifiManager wifiManager;
    private IoTDeviceDatabase database;
    private AtomicBoolean isScanning;
    private ExecutorService executorService;
    
    /**
     * Discovery callback interface
     */
    public interface DiscoveryCallback {
        void onDeviceFound(JSObject device);
        void onScanProgress(int scanned, int total);
        void onScanComplete(int totalDevices, int iotDevices);
        void onError(String error);
    }
    
    public IoTDiscoveryManager(Context context) {
        this.context = context;
        this.wifiManager = (WifiManager) context.getApplicationContext()
                .getSystemService(Context.WIFI_SERVICE);
        this.database = IoTDeviceDatabase.getInstance(context);
        this.isScanning = new AtomicBoolean(false);
    }
    
    /**
     * Start IoT device discovery
     */
    public void startDiscovery(DiscoveryCallback callback) {
        if (isScanning.get()) {
            callback.onError("Scan already in progress");
            return;
        }
        
        isScanning.set(true);
        executorService = Executors.newFixedThreadPool(10);
        
        new Thread(() -> {
            try {
                Log.d(TAG, "Starting IoT device discovery...");
                
                // Get subnet info
                String subnet = getSubnet();
                if (subnet == null) {
                    callback.onError("Not connected to WiFi");
                    isScanning.set(false);
                    return;
                }
                
                Log.d(TAG, "Scanning subnet: " + subnet);
                
                // Scan network for devices
                List<String> liveHosts = scanNetwork(subnet, callback);
                
                Log.d(TAG, "Found " + liveHosts.size() + " live hosts");
                
                // Process each host
                AtomicInteger iotDeviceCount = new AtomicInteger(0);
                
                for (String ip : liveHosts) {
                    if (!isScanning.get()) {
                        break; // Scan was stopped
                    }
                    
                    executorService.submit(() -> {
                        try {
                            processHost(ip, callback, iotDeviceCount);
                        } catch (Exception e) {
                            Log.e(TAG, "Error processing host: " + ip, e);
                        }
                    });
                }
                
                // Wait for all tasks to complete
                executorService.shutdown();
                executorService.awaitTermination(SCAN_TIMEOUT, TimeUnit.MILLISECONDS);
                
                callback.onScanComplete(liveHosts.size(), iotDeviceCount.get());
                Log.d(TAG, "IoT discovery complete. Found " + iotDeviceCount.get() + " IoT devices");
                
            } catch (Exception e) {
                Log.e(TAG, "Error during discovery", e);
                callback.onError(e.getMessage());
            } finally {
                isScanning.set(false);
                if (executorService != null && !executorService.isShutdown()) {
                    executorService.shutdownNow();
                }
            }
        }).start();
    }
    
    /**
     * Stop ongoing discovery
     */
    public void stopDiscovery() {
        isScanning.set(false);
        if (executorService != null && !executorService.isShutdown()) {
            executorService.shutdownNow();
        }
        Log.d(TAG, "IoT discovery stopped");
    }
    
    /**
     * Check if scanning
     */
    public boolean isScanning() {
        return isScanning.get();
    }
    
    /**
     * Get subnet information
     */
    public JSObject getSubnetInfo() {
        JSObject info = new JSObject();
        
        try {
            if (wifiManager != null) {
                WifiInfo wifiInfo = wifiManager.getConnectionInfo();
                if (wifiInfo != null) {
                    int ipAddress = wifiInfo.getIpAddress();
                    String ip = intToIp(ipAddress);
                    info.put("ipAddress", ip);
                    info.put("subnet", getSubnet());
                    info.put("ssid", wifiInfo.getSSID().replace("\"", ""));
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "Error getting subnet info", e);
        }
        
        return info;
    }
    
    /**
     * Refresh single device
     */
    public JSObject refreshDevice(String ip) {
        try {
            // Get MAC and hostname
            String macAddress = getMacFromArp(ip);
            String hostname = getHostname(ip);
            
            if (macAddress == null) {
                return null;
            }
            
            // Classify device
            List<Integer> openPorts = IoTSecurityScanner.quickPortScan(ip, 
                    new int[]{80, 443, 554, 1883, 8008}, PORT_SCAN_TIMEOUT);
            
            JSObject classification = IoTDeviceClassifier.classifyDevice(
                    macAddress, hostname, ip, openPorts, null);
            
            // Build device object
            JSObject device = new JSObject();
            device.put("ipAddress", ip);
            device.put("macAddress", macAddress);
            device.put("hostname", hostname);
            device.put("manufacturer", classification.getString("manufacturer"));
            device.put("deviceType", classification.getString("deviceType"));
            device.put("deviceModel", classification.getString("deviceModel"));
            device.put("platform", classification.getString("platform"));
            device.put("isOnline", true);
            
            // Convert open ports to JSON array string
            JSONArray portsArray = new JSONArray();
            for (Integer port : openPorts) {
                portsArray.put(port);
            }
            device.put("openPorts", portsArray.toString());
            
            // Run security scan
            IoTSecurityScanner.SecurityResult securityResult = 
                    IoTSecurityScanner.assessSecurity(ip, 
                            classification.getString("deviceType"), openPorts);
            device.put("securityScore", securityResult.score);
            
            // Save to database
            long deviceId = database.insertDevice(device);
            device.put("id", (int)deviceId);
            
            return device;
            
        } catch (Exception e) {
            Log.e(TAG, "Error refreshing device: " + ip, e);
            return null;
        }
    }
    
    /**
     * Scan network for live hosts
     */
    private List<String> scanNetwork(String subnet, DiscoveryCallback callback) {
        List<String> liveHosts = new ArrayList<>();
        
        try {
            // Get base IP (e.g., "192.168.1")
            String baseIp = subnet.substring(0, subnet.lastIndexOf('.'));
            
            // Scan 254 possible hosts
            AtomicInteger scanned = new AtomicInteger(0);
            ExecutorService scanExecutor = Executors.newFixedThreadPool(20);
            
            for (int i = 1; i <= 254; i++) {
                final String ip = baseIp + "." + i;
                
                scanExecutor.submit(() -> {
                    try {
                        InetAddress address = InetAddress.getByName(ip);
                        if (address.isReachable(PING_TIMEOUT)) {
                            synchronized (liveHosts) {
                                liveHosts.add(ip);
                            }
                        }
                    } catch (Exception e) {
                        // Host not reachable
                    } finally {
                        int progress = scanned.incrementAndGet();
                        if (progress % 10 == 0) {
                            callback.onScanProgress(progress, 254);
                        }
                    }
                });
            }
            
            scanExecutor.shutdown();
            scanExecutor.awaitTermination(SCAN_TIMEOUT, TimeUnit.MILLISECONDS);
            
        } catch (Exception e) {
            Log.e(TAG, "Error scanning network", e);
        }
        
        return liveHosts;
    }
    
    /**
     * Process individual host
     */
    private void processHost(String ip, DiscoveryCallback callback, AtomicInteger iotDeviceCount) {
        try {
            // Get MAC address from ARP table
            String macAddress = getMacFromArp(ip);
            if (macAddress == null) {
                return;
            }
            
            // Get hostname
            String hostname = getHostname(ip);
            
            // Quick port scan for classification
            List<Integer> openPorts = IoTSecurityScanner.quickPortScan(ip, 
                    new int[]{80, 443, 554, 1883, 8008, 8080}, PORT_SCAN_TIMEOUT);
            
            // Classify device
            JSObject classification = IoTDeviceClassifier.classifyDevice(
                    macAddress, hostname, ip, openPorts, null);
            
            // Check if it's an IoT device
            boolean isIoT = IoTDeviceClassifier.isLikelyIoT(macAddress, hostname, openPorts);
            
            if (!isIoT) {
                return; // Skip non-IoT devices
            }
            
            iotDeviceCount.incrementAndGet();
            
            // Build device object
            JSObject device = new JSObject();
            device.put("ipAddress", ip);
            device.put("macAddress", macAddress);
            device.put("hostname", hostname);
            device.put("deviceName", classification.getString("deviceModel"));
            device.put("manufacturer", classification.getString("manufacturer"));
            device.put("deviceType", classification.getString("deviceType"));
            device.put("deviceModel", classification.getString("deviceModel"));
            device.put("platform", classification.getString("platform"));
            device.put("iconType", IoTDeviceClassifier.getDeviceIcon(
                    classification.getString("deviceType")));
            device.put("isOnline", true);
            device.put("roomId", 0);
            
            // Convert open ports to JSON array string
            JSONArray portsArray = new JSONArray();
            for (Integer port : openPorts) {
                portsArray.put(port);
            }
            device.put("openPorts", portsArray.toString());
            
            // Services (empty for now)
            device.put("services", "[]");
            
            // Run security scan
            IoTSecurityScanner.SecurityResult securityResult = 
                    IoTSecurityScanner.assessSecurity(ip, 
                            classification.getString("deviceType"), openPorts);
            device.put("securityScore", securityResult.score);
            
            // Convert security issues to JSON array string
            JSONArray issuesArray = new JSONArray();
            device.put("securityIssues", issuesArray.toString());
            
            device.put("notes", "");
            
            // Save to database
            long deviceId = database.insertDevice(device);
            device.put("id", (int)deviceId);
            
            // Save security findings
            for (IoTSecurityScanner.SecurityFinding finding : securityResult.findings) {
                database.insertSecurityFinding(
                        (int)deviceId,
                        finding.findingType,
                        finding.severity,
                        finding.title,
                        finding.description,
                        finding.recommendation
                );
            }
            
            // Notify callback
            callback.onDeviceFound(device);
            
            Log.d(TAG, "Found IoT device: " + device.getString("deviceName") + 
                    " (" + ip + ") - Score: " + securityResult.score);
            
        } catch (Exception e) {
            Log.e(TAG, "Error processing host: " + ip, e);
        }
    }
    
    /**
     * Get MAC address from ARP table
     */
    private String getMacFromArp(String ip) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("/proc/net/arp"));
            String line;
            
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\s+");
                if (parts.length >= 4 && parts[0].equals(ip)) {
                    String mac = parts[3];
                    if (!mac.equals("00:00:00:00:00:00") && !mac.equals("*")) {
                        br.close();
                        return mac.toUpperCase();
                    }
                }
            }
            
            br.close();
        } catch (Exception e) {
            Log.e(TAG, "Error reading ARP table", e);
        }
        
        return null;
    }
    
    /**
     * Get hostname for IP
     */
    private String getHostname(String ip) {
        try {
            InetAddress address = InetAddress.getByName(ip);
            String hostname = address.getCanonicalHostName();
            if (!hostname.equals(ip)) {
                return hostname;
            }
        } catch (Exception e) {
            // Ignore
        }
        return "";
    }
    
    /**
     * Get current subnet
     */
    private String getSubnet() {
        try {
            if (wifiManager != null) {
                WifiInfo wifiInfo = wifiManager.getConnectionInfo();
                if (wifiInfo != null) {
                    int ipAddress = wifiInfo.getIpAddress();
                    return intToIp(ipAddress);
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "Error getting subnet", e);
        }
        return null;
    }
    
    /**
     * Convert int IP to string
     */
    private String intToIp(int ip) {
        return (ip & 0xFF) + "." +
                ((ip >> 8) & 0xFF) + "." +
                ((ip >> 16) & 0xFF) + "." +
                ((ip >> 24) & 0xFF);
    }
}
