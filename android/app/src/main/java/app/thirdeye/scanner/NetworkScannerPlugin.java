package app.thirdeye.scanner;

import android.Manifest;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.util.Log;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.annotation.Permission;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@CapacitorPlugin(
    name = "NetworkScanner",
    permissions = {
        @Permission(
            alias = "network",
            strings = {
                Manifest.permission.ACCESS_NETWORK_STATE,
                Manifest.permission.ACCESS_WIFI_STATE,
                Manifest.permission.INTERNET
            }
        )
    }
)
public class NetworkScannerPlugin extends Plugin {
    private static final String TAG = "NetworkScannerPlugin";
    private static final String PREFS_NAME = "DeviceHistory";
    private WifiManager wifiManager;
    private ConnectivityManager connectivityManager;
    private SharedPreferences deviceHistoryPrefs;

    private CarrierDetector carrierDetector;
    private OfflineManager offlineManager;
    
    @Override
    public void load() {
        super.load();
        wifiManager = (WifiManager) getContext().getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        connectivityManager = (ConnectivityManager) getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        deviceHistoryPrefs = getContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        carrierDetector = new CarrierDetector(getContext());
        offlineManager = new OfflineManager(getContext());
    }

    // Get device history from SharedPreferences
    private JSONObject getDeviceHistory(String macAddress) {
        String historyJson = deviceHistoryPrefs.getString(macAddress, null);
        if (historyJson != null) {
            try {
                return new JSONObject(historyJson);
            } catch (JSONException e) {
                Log.e(TAG, "Error parsing device history", e);
            }
        }
        return null;
    }

    // Save device history to SharedPreferences
    private void saveDeviceHistory(String macAddress, JSONObject history) {
        deviceHistoryPrefs.edit().putString(macAddress, history.toString()).apply();
    }

    // Update device history when device is seen
    private JSONObject updateDeviceHistory(String macAddress, String hostname, String ipAddress, String deviceType) {
        JSONObject history = getDeviceHistory(macAddress);
        long now = System.currentTimeMillis();
        
        try {
            if (history == null) {
                // First time seeing this device
                history = new JSONObject();
                history.put("macAddress", macAddress);
                history.put("firstSeen", now);
                history.put("lastSeen", now);
                history.put("connectionCount", 1);
                history.put("totalOnlineTime", 0);
                history.put("lastSessionStart", now);
                history.put("hostname", hostname);
                history.put("ipAddress", ipAddress);
                history.put("deviceType", deviceType);
                history.put("isOnline", true);
                
                // Track daily connection
                incrementConnectionsToday(macAddress);
            } else {
                // Device seen before
                boolean wasOnline = history.optBoolean("isOnline", false);
                long lastSeen = history.optLong("lastSeen", now);
                long totalOnlineTime = history.optLong("totalOnlineTime", 0);
                int connectionCount = history.optInt("connectionCount", 0);
                
                // If device was offline (last seen > 5 minutes ago), count as new connection
                if (!wasOnline || (now - lastSeen) > 5 * 60 * 1000) {
                    connectionCount++;
                    history.put("connectionCount", connectionCount);
                    history.put("lastSessionStart", now);
                    
                    // Track daily connection
                    incrementConnectionsToday(macAddress);
                } else {
                    // Add time since last seen to total online time
                    totalOnlineTime += (now - lastSeen);
                    history.put("totalOnlineTime", totalOnlineTime);
                }
                
                history.put("lastSeen", now);
                history.put("isOnline", true);
                history.put("hostname", hostname);
                history.put("ipAddress", ipAddress);
                history.put("deviceType", deviceType);
            }
            
            saveDeviceHistory(macAddress, history);
        } catch (JSONException e) {
            Log.e(TAG, "Error updating device history", e);
        }
        
        return history;
    }

    // Mark device as offline
    private void markDeviceOffline(String macAddress) {
        JSONObject history = getDeviceHistory(macAddress);
        if (history != null) {
            try {
                long now = System.currentTimeMillis();
                long lastSeen = history.optLong("lastSeen", now);
                long totalOnlineTime = history.optLong("totalOnlineTime", 0);
                
                // Add final session time
                if (history.optBoolean("isOnline", false)) {
                    totalOnlineTime += (now - lastSeen);
                    history.put("totalOnlineTime", totalOnlineTime);
                }
                
                history.put("isOnline", false);
                saveDeviceHistory(macAddress, history);
            } catch (JSONException e) {
                Log.e(TAG, "Error marking device offline", e);
            }
        }
    }

    // Measure ping latency to estimate signal quality
    private int measurePingLatency(String host) {
        try {
            long start = System.currentTimeMillis();
            InetAddress address = InetAddress.getByName(host);
            if (address.isReachable(1000)) {
                return (int)(System.currentTimeMillis() - start);
            }
        } catch (Exception e) {
            // Ignore
        }
        return -1;
    }

    // Estimate signal strength based on ping latency
    private int estimateSignalStrength(int pingMs) {
        if (pingMs < 0) return 0;
        if (pingMs < 5) return 100;
        if (pingMs < 10) return 90;
        if (pingMs < 20) return 80;
        if (pingMs < 50) return 70;
        if (pingMs < 100) return 60;
        if (pingMs < 200) return 50;
        if (pingMs < 500) return 30;
        return 20;
    }

    @PluginMethod
    public void getNetworkInfo(PluginCall call) {
        JSObject result = new JSObject();

        try {
            // Get WiFi info
            if (wifiManager != null) {
                WifiInfo wifiInfo = wifiManager.getConnectionInfo();
                DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();

                if (wifiInfo != null) {
                    String ssid = wifiInfo.getSSID();
                    if (ssid != null) {
                        ssid = ssid.replace("\"", "");
                    }
                    result.put("ssid", ssid);
                    result.put("bssid", wifiInfo.getBSSID());
                    result.put("ipAddress", intToIp(wifiInfo.getIpAddress()));
                    result.put("linkSpeed", wifiInfo.getLinkSpeed());
                    result.put("rssi", wifiInfo.getRssi());
                    result.put("frequency", wifiInfo.getFrequency());
                }

                if (dhcpInfo != null) {
                    result.put("gateway", intToIp(dhcpInfo.gateway));
                    result.put("netmask", intToIp(dhcpInfo.netmask));
                    result.put("dns1", intToIp(dhcpInfo.dns1));
                    result.put("dns2", intToIp(dhcpInfo.dns2));
                    result.put("serverAddress", intToIp(dhcpInfo.serverAddress));
                }
            }

            // Get connection type and carrier info
            if (connectivityManager != null) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    Network network = connectivityManager.getActiveNetwork();
                    if (network != null) {
                        NetworkCapabilities capabilities = connectivityManager.getNetworkCapabilities(network);
                        if (capabilities != null) {
                            if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)) {
                                result.put("connectionType", "WiFi");
                            } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)) {
                                result.put("connectionType", "Mobile Data");
                            } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET)) {
                                result.put("connectionType", "Ethernet");
                            } else {
                                result.put("connectionType", "Unknown");
                            }
                            result.put("isConnected", true);
                        }
                    } else {
                        result.put("isConnected", false);
                    }
                }
            }
            
            // ALWAYS get carrier information (even when connected via WiFi hotspot)
            // This shows the SIM provider name (Robi, Grameenphone, etc.)
            CarrierDetector.CarrierInfo carrierInfo = carrierDetector.getCarrierInfo();
            result.put("carrierName", carrierInfo.carrierName);
            result.put("networkType", carrierInfo.networkType);
            result.put("simState", carrierInfo.simState);
            result.put("hasSim", carrierInfo.hasSim);
            result.put("networkOperator", carrierInfo.networkOperator);
            
            // Add offline status
            result.put("isOnline", offlineManager.isOnline());
            result.put("isWiFiConnected", offlineManager.isWiFiConnected());
            result.put("isMobileDataConnected", offlineManager.isMobileDataConnected());

            result.put("success", true);
        } catch (Exception e) {
            Log.e(TAG, "Error getting network info", e);
            result.put("success", false);
            result.put("error", e.getMessage());
        }

        call.resolve(result);
    }
    
    /**
     * Check VPN status using ConnectivityManager API
     * Detects active VPN connections and retrieves VPN interface details
     */
    @PluginMethod
    public void checkVpnStatus(PluginCall call) {
        JSObject result = new JSObject();
        
        try {
            boolean vpnDetected = false;
            String vpnInterface = null;
            String vpnIP = null;
            List<String> vpnInterfaces = new ArrayList<>();
            
            // Method 1: Check using ConnectivityManager (Android M+)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && connectivityManager != null) {
                Network activeNetwork = connectivityManager.getActiveNetwork();
                if (activeNetwork != null) {
                    NetworkCapabilities capabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                    if (capabilities != null) {
                        // Check for TRANSPORT_VPN capability
                        if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_VPN)) {
                            vpnDetected = true;
                            Log.d(TAG, "VPN detected via TRANSPORT_VPN capability");
                        }
                    }
                }
                
                // Check all networks for VPN
                Network[] allNetworks = connectivityManager.getAllNetworks();
                if (allNetworks != null) {
                    for (Network network : allNetworks) {
                        NetworkCapabilities caps = connectivityManager.getNetworkCapabilities(network);
                        if (caps != null && caps.hasTransport(NetworkCapabilities.TRANSPORT_VPN)) {
                            vpnDetected = true;
                            Log.d(TAG, "VPN detected in network: " + network);
                        }
                    }
                }
            }
            
            // Method 2: Check NetworkInterface for VPN interfaces (tun0, ppp0, etc.)
            try {
                List<NetworkInterface> interfaces = Collections.list(NetworkInterface.getNetworkInterfaces());
                for (NetworkInterface networkInterface : interfaces) {
                    String interfaceName = networkInterface.getName().toLowerCase();
                    
                    // Check for common VPN interface names
                    if (interfaceName.startsWith("tun") || 
                        interfaceName.startsWith("ppp") || 
                        interfaceName.startsWith("pptp") ||
                        interfaceName.startsWith("l2tp") ||
                        interfaceName.startsWith("ipsec") ||
                        interfaceName.startsWith("wg")) { // WireGuard
                        
                        vpnDetected = true;
                        vpnInterfaces.add(interfaceName);
                        
                        // Get IP address from this interface
                        List<InetAddress> addresses = Collections.list(networkInterface.getInetAddresses());
                        for (InetAddress address : addresses) {
                            if (!address.isLoopbackAddress() && !address.isLinkLocalAddress()) {
                                String ip = address.getHostAddress();
                                // Filter out IPv6 addresses (contains :)
                                if (ip != null && !ip.contains(":")) {
                                    vpnIP = ip;
                                    Log.d(TAG, "VPN IP found: " + vpnIP + " on interface: " + interfaceName);
                                    break;
                                }
                            }
                        }
                        
                        if (vpnInterface == null) {
                            vpnInterface = interfaceName;
                        }
                    }
                }
            } catch (Exception e) {
                Log.e(TAG, "Error checking network interfaces", e);
            }
            
            // Method 3: Fallback - Check for VPN using legacy NetworkInfo (pre-M)
            if (!vpnDetected && Build.VERSION.SDK_INT < Build.VERSION_CODES.M && connectivityManager != null) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    int type = activeNetworkInfo.getType();
                    // TYPE_VPN = 17
                    if (type == 17) {
                        vpnDetected = true;
                        Log.d(TAG, "VPN detected via legacy NetworkInfo");
                    }
                }
            }
            
            // Build result
            result.put("vpnDetected", vpnDetected);
            result.put("method", vpnDetected ? "ConnectivityManager + NetworkInterface" : "None");
            
            if (vpnInterface != null) {
                result.put("vpnInterface", vpnInterface);
            }
            
            if (vpnIP != null) {
                result.put("vpnIP", vpnIP);
            }
            
            if (!vpnInterfaces.isEmpty()) {
                JSArray interfacesArray = new JSArray();
                for (String iface : vpnInterfaces) {
                    interfacesArray.put(iface);
                }
                result.put("vpnInterfaces", interfacesArray);
            }
            
            result.put("success", true);
            
            Log.d(TAG, "VPN Status Check - Detected: " + vpnDetected + 
                      ", Interface: " + vpnInterface + 
                      ", IP: " + vpnIP);
            
        } catch (Exception e) {
            Log.e(TAG, "Error checking VPN status", e);
            result.put("success", false);
            result.put("vpnDetected", false);
            result.put("error", e.getMessage());
        }
        
        call.resolve(result);
    }
    
    /**
     * Get router information including model/manufacturer
     * Uses multiple detection methods:
     * 1. MAC address OUI lookup (manufacturer)
     * 2. UPnP/SSDP discovery (model name)
     * 3. HTTP request to router admin page
     */
    @PluginMethod
    public void getRouterInfo(PluginCall call) {
        JSObject result = new JSObject();
        
        try {
            if (wifiManager != null) {
                DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
                WifiInfo wifiInfo = wifiManager.getConnectionInfo();
                
                if (dhcpInfo != null && wifiInfo != null) {
                    String gatewayIp = intToIp(dhcpInfo.gateway);
                    String bssid = wifiInfo.getBSSID();
                    
                    result.put("gatewayIp", gatewayIp);
                    result.put("bssid", bssid);
                    
                    // Method 1: Get manufacturer from MAC address (BSSID)
                    if (bssid != null && !bssid.equals("02:00:00:00:00:00")) {
                        String manufacturer = getManufacturerFromMac(bssid);
                        result.put("manufacturer", manufacturer);
                    } else {
                        result.put("manufacturer", "Unknown");
                    }
                    
                    // Method 2: Try to get router hostname from ARP cache
                    String routerHostname = getRouterHostname(gatewayIp);
                    if (routerHostname != null && !routerHostname.isEmpty()) {
                        result.put("hostname", routerHostname);
                        // Extract model from hostname if possible
                        String model = extractModelFromHostname(routerHostname);
                        if (model != null) {
                            result.put("model", model);
                        }
                    }
                    
                    // Method 3: Try reverse DNS lookup
                    try {
                        InetAddress gatewayAddr = InetAddress.getByName(gatewayIp);
                        String hostName = gatewayAddr.getCanonicalHostName();
                        if (hostName != null && !hostName.equals(gatewayIp)) {
                            result.put("dnsName", hostName);
                            if (!result.has("model")) {
                                String model = extractModelFromHostname(hostName);
                                if (model != null) {
                                    result.put("model", model);
                                }
                            }
                        }
                    } catch (Exception e) {
                        Log.d(TAG, "Reverse DNS lookup failed: " + e.getMessage());
                    }
                    
                    // If no model detected, use manufacturer name if available
                    if (!result.has("model")) {
                        if (result.has("manufacturer")) {
                            String manufacturer = result.getString("manufacturer");
                            if (!manufacturer.equals("Unknown")) {
                                result.put("model", manufacturer);
                            } else {
                                result.put("model", "Router");
                            }
                        } else {
                            result.put("model", "Router");
                        }
                    }
                    
                    result.put("success", true);
                } else {
                    result.put("success", false);
                    result.put("error", "Not connected to WiFi");
                }
            } else {
                result.put("success", false);
                result.put("error", "WiFi manager not available");
            }
        } catch (Exception e) {
            Log.e(TAG, "Error getting router info", e);
            result.put("success", false);
            result.put("error", e.getMessage());
        }
        
        call.resolve(result);
    }
    
    /**
     * Get manufacturer name from MAC address using OUI database
     */
    private String getManufacturerFromMac(String macAddress) {
        if (macAddress == null || macAddress.length() < 8) {
            return "Unknown";
        }
        
        // Extract OUI (first 3 octets)
        String oui = macAddress.substring(0, 8).replace(":", "").toUpperCase();
        
        // Common router manufacturers by OUI prefix
        Map<String, String> ouiMap = new HashMap<>();
        
        // TP-Link
        ouiMap.put("F4F26D", "TP-Link");
        ouiMap.put("C46E1F", "TP-Link");
        ouiMap.put("A42BB0", "TP-Link");
        ouiMap.put("98DAC4", "TP-Link");
        ouiMap.put("E848B8", "TP-Link");
        ouiMap.put("1C3BF3", "TP-Link");
        
        // D-Link
        ouiMap.put("B8A386", "D-Link");
        ouiMap.put("C0A0BB", "D-Link");
        ouiMap.put("1CAFF7", "D-Link");
        ouiMap.put("CCB255", "D-Link");
        
        // Netgear
        ouiMap.put("A040A0", "Netgear");
        ouiMap.put("E091F5", "Netgear");
        ouiMap.put("C03F0E", "Netgear");
        ouiMap.put("2C3033", "Netgear");
        
        // Asus
        ouiMap.put("2C56DC", "Asus");
        ouiMap.put("F832E4", "Asus");
        ouiMap.put("1062EB", "Asus");
        ouiMap.put("D850E6", "Asus");
        
        // Linksys
        ouiMap.put("C05627", "Linksys");
        ouiMap.put("48F8B3", "Linksys");
        ouiMap.put("20AA4B", "Linksys");
        
        // Huawei
        ouiMap.put("0025BC", "Huawei");
        ouiMap.put("00E0FC", "Huawei");
        ouiMap.put("F8E7A0", "Huawei");
        ouiMap.put("C83A35", "Huawei");
        
        // Xiaomi
        ouiMap.put("34CE00", "Xiaomi");
        ouiMap.put("F0B429", "Xiaomi");
        ouiMap.put("64B473", "Xiaomi");
        
        // Tenda
        ouiMap.put("C83A35", "Tenda");
        ouiMap.put("E0CB1D", "Tenda");
        
        // Cudy
        ouiMap.put("B44BD6", "Cudy");
        ouiMap.put("D4DA21", "Cudy");
        ouiMap.put("8C1F64", "Cudy");
        
        // Mercusys
        ouiMap.put("A8F7E0", "Mercusys");
        ouiMap.put("E03F49", "Mercusys");
        
        // Totolink
        ouiMap.put("A0F3C1", "Totolink");
        ouiMap.put("8C21 0A", "Totolink");
        
        // Wavlink
        ouiMap.put("C4E90A", "Wavlink");
        
        // Comfast
        ouiMap.put("00272D", "Comfast");
        
        // Netlink (Bangladesh)
        ouiMap.put("00E04C", "Netlink");
        ouiMap.put("001E58", "Netlink");
        
        // ZTE
        ouiMap.put("68DFDD", "ZTE");
        ouiMap.put("F4F5D8", "ZTE");
        
        // Cisco
        ouiMap.put("001D45", "Cisco");
        ouiMap.put("0026CB", "Cisco");
        
        // Ubiquiti
        ouiMap.put("F09FC2", "Ubiquiti");
        ouiMap.put("788A20", "Ubiquiti");
        
        // Mikrotik
        ouiMap.put("4C5E0C", "Mikrotik");
        ouiMap.put("D4CA6D", "Mikrotik");
        
        // Belkin
        ouiMap.put("944452", "Belkin");
        ouiMap.put("EC1A59", "Belkin");
        
        // Arris
        ouiMap.put("001DD0", "Arris");
        ouiMap.put("0090D0", "Arris");
        
        // Motorola
        ouiMap.put("001ADB", "Motorola");
        ouiMap.put("00E0DA", "Motorola");
        
        // Check if OUI matches any known manufacturer
        for (Map.Entry<String, String> entry : ouiMap.entrySet()) {
            if (oui.startsWith(entry.getKey())) {
                return entry.getValue();
            }
        }
        
        return "Unknown";
    }
    
    /**
     * Get router hostname from ARP cache
     */
    private String getRouterHostname(String ipAddress) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("/proc/net/arp"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\s+");
                if (parts.length >= 6 && parts[0].equals(ipAddress)) {
                    // Try to get hostname from the device name field
                    if (parts.length > 5 && !parts[5].equals("*")) {
                        br.close();
                        return parts[5];
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            Log.d(TAG, "Error reading ARP cache: " + e.getMessage());
        }
        return null;
    }
    
    /**
     * Extract model name from hostname
     */
    private String extractModelFromHostname(String hostname) {
        if (hostname == null || hostname.isEmpty()) {
            return null;
        }
        
        hostname = hostname.toLowerCase();
        
        // Common router hostname patterns
        if (hostname.contains("tplink") || hostname.contains("tp-link")) {
            if (hostname.contains("archer")) return "TP-Link Archer";
            if (hostname.contains("deco")) return "TP-Link Deco";
            return "TP-Link Router";
        }
        if (hostname.contains("dlink") || hostname.contains("d-link")) {
            return "D-Link Router";
        }
        if (hostname.contains("netgear")) {
            if (hostname.contains("nighthawk")) return "Netgear Nighthawk";
            if (hostname.contains("orbi")) return "Netgear Orbi";
            return "Netgear Router";
        }
        if (hostname.contains("asus")) {
            if (hostname.contains("rt-")) return "Asus RT Series";
            return "Asus Router";
        }
        if (hostname.contains("linksys")) {
            return "Linksys Router";
        }
        if (hostname.contains("huawei")) {
            return "Huawei Router";
        }
        if (hostname.contains("xiaomi") || hostname.contains("mi")) {
            return "Xiaomi Router";
        }
        if (hostname.contains("tenda")) {
            return "Tenda Router";
        }
        if (hostname.contains("netlink")) {
            return "Netlink Router";
        }
        if (hostname.contains("zte")) {
            return "ZTE Router";
        }
        
        return null;
    }
    
    @PluginMethod
    public void getCarrierInfo(PluginCall call) {
        JSObject result = new JSObject();
        
        try {
            CarrierDetector.CarrierInfo carrierInfo = carrierDetector.getCarrierInfo();
            result.put("success", true);
            result.put("carrierName", carrierInfo.carrierName);
            result.put("networkType", carrierInfo.networkType);
            result.put("simState", carrierInfo.simState);
            result.put("hasSim", carrierInfo.hasSim);
            result.put("networkOperator", carrierInfo.networkOperator);
            result.put("signalStrength", carrierInfo.signalStrength);
        } catch (Exception e) {
            Log.e(TAG, "Error getting carrier info", e);
            result.put("success", false);
            result.put("error", e.getMessage());
        }
        
        call.resolve(result);
    }
    
    @PluginMethod
    public void checkOfflineAvailability(PluginCall call) {
        String featureName = call.getString("feature", "");
        
        JSObject result = new JSObject();
        result.put("feature", featureName);
        result.put("isAvailable", offlineManager.isFeatureAvailableOffline(featureName));
        result.put("isOnline", offlineManager.isOnline());
        result.put("connectionType", offlineManager.getConnectionType());
        
        String message = offlineManager.getOfflineMessage(featureName);
        if (message != null) {
            result.put("message", message);
        }
        
        call.resolve(result);
    }

    @PluginMethod
    public void scanDevices(PluginCall call) {
        // Run scan in background thread
        new Thread(() -> {
            JSObject result = new JSObject();
            Map<String, JSObject> deviceMap = Collections.synchronizedMap(new HashMap<>());

            try {
                String subnet = getSubnet();
                if (subnet == null) {
                    result.put("success", false);
                    result.put("error", "Could not determine network subnet. Make sure WiFi is connected.");
                    result.put("devices", new JSArray());
                    call.resolve(result);
                    return;
                }

                String gatewayIP = intToIp(wifiManager.getDhcpInfo().gateway);
                
                Log.d(TAG, "========================================");
                Log.d(TAG, "STARTING AP ISOLATION BYPASS SCAN");
                Log.d(TAG, "Strategy: ONLY communicate with router");
                Log.d(TAG, "Subnet: " + subnet);
                Log.d(TAG, "Gateway: " + gatewayIP);
                Log.d(TAG, "========================================");
                
                // ===== PRIMARY METHOD: ROUTER BYPASS SCANNER =====
                Log.d(TAG, "PRIMARY: Router Bypass Scanner (AP Isolation Bypass)");
                try {
                    List<JSObject> routerDevices = RouterBypassScanner.scanRouterOnly(gatewayIP);
                    Log.d(TAG, "Router Bypass found: " + routerDevices.size() + " devices");
                    
                    for (JSObject device : routerDevices) {
                        String ip = device.getString("ipAddress");
                        if (ip != null) {
                            String mac = device.getString("macAddress");
                            if (mac != null) {
                                String deviceType = identifyDeviceType(ip, mac);
                                device.put("deviceType", deviceType);
                                
                                // Update device history
                                String hostname = device.getString("hostname");
                                JSONObject history = updateDeviceHistory(mac, hostname, ip, deviceType);
                                if (history != null) {
                                    device.put("firstSeen", history.optLong("firstSeen", 0));
                                    device.put("lastSeen", history.optLong("lastSeen", 0));
                                    device.put("connectionCount", history.optInt("connectionCount", 1));
                                    device.put("totalOnlineTime", history.optLong("totalOnlineTime", 0));
                                    device.put("connectionsToday", getConnectionsToday(mac));
                                }
                            }
                            deviceMap.put(ip, device);
                        }
                    }
                    
                    // If we found devices via router bypass, we're done!
                    if (!deviceMap.isEmpty()) {
                        Log.d(TAG, "SUCCESS! Router bypass found " + deviceMap.size() + " devices - skipping other methods");
                    }
                } catch (Exception e) {
                    Log.e(TAG, "Router bypass scan failed", e);
                }
                
                // ===== FALLBACK METHODS (only if router bypass failed) =====
                if (deviceMap.isEmpty()) {
                    Log.d(TAG, "Router bypass failed - trying fallback methods...");
                    
                    // Fallback 1: DHCP Lease Scan
                    Log.d(TAG, "Fallback 1: DHCP Lease Scan...");
                    try {
                        List<JSObject> dhcpDevices = DHCPLeaseScanner.scanAllMethods(gatewayIP);
                        Log.d(TAG, "DHCP scan found: " + dhcpDevices.size() + " devices");
                        
                        for (JSObject device : dhcpDevices) {
                            String ip = device.getString("ipAddress");
                            if (ip != null && !deviceMap.containsKey(ip)) {
                                String mac = device.getString("macAddress");
                                if (mac != null) {
                                    String deviceType = identifyDeviceType(ip, mac);
                                    device.put("deviceType", deviceType);
                                }
                                deviceMap.put(ip, device);
                            }
                        }
                    } catch (Exception e) {
                        Log.e(TAG, "DHCP scan failed", e);
                    }
                    
                    // Fallback 2: Only if still no devices found
                    if (deviceMap.isEmpty()) {
                        Log.d(TAG, "Fallback 2: Aggressive ARP Scan (last resort)...");
                        try {
                            List<JSObject> arpDevices = ARPScanService.aggressiveScan(subnet);
                            Log.d(TAG, "ARP scan found: " + arpDevices.size() + " devices");
                            
                            for (JSObject device : arpDevices) {
                                String ip = device.getString("ipAddress");
                                if (ip != null && !deviceMap.containsKey(ip)) {
                                    String mac = device.getString("macAddress");
                                    if (mac != null) {
                                        String deviceType = identifyDeviceType(ip, mac);
                                        device.put("deviceType", deviceType);
                                    }
                                    deviceMap.put(ip, device);
                                }
                            }
                        } catch (Exception e) {
                            Log.e(TAG, "ARP scan failed", e);
                        }
                    }
                }
                
                // ===== ENHANCE DEVICE DATA =====
                Log.d(TAG, "Enhancing device data...");
                for (JSObject device : deviceMap.values()) {
                    try {
                        String ip = device.getString("ipAddress");
                        String mac = device.getString("macAddress");
                        
                        if (ip != null && mac != null) {
                            // Only ping if we're not using router data (to avoid AP isolation issues)
                            String source = device.getString("source");
                            if (source == null || !source.contains("Router")) {
                                int pingMs = measurePingLatency(ip);
                                device.put("pingMs", pingMs);
                                device.put("signalStrength", estimateSignalStrength(pingMs));
                            } else {
                                // For router-sourced data, assume good connection
                                device.put("pingMs", 10);
                                device.put("signalStrength", 90);
                            }
                            
                            // Try to get hostname if not already set (only if not from router)
                            if ((!device.has("hostname") || device.getString("hostname").equals("Unknown")) &&
                                (source == null || !source.contains("Router"))) {
                                try {
                                    InetAddress addr = InetAddress.getByName(ip);
                                    String hostname = addr.getHostName();
                                    if (hostname != null && !hostname.equals(ip)) {
                                        device.put("hostname", hostname);
                                    }
                                } catch (Exception e) {
                                    // Keep as Unknown
                                }
                            }
                            
                            // Update device history
                            String hostname = device.getString("hostname");
                            String deviceType = device.getString("deviceType");
                            JSONObject history = updateDeviceHistory(mac, hostname, ip, deviceType);
                            if (history != null) {
                                device.put("firstSeen", history.optLong("firstSeen", 0));
                                device.put("lastSeen", history.optLong("lastSeen", 0));
                                device.put("connectionCount", history.optInt("connectionCount", 1));
                                device.put("totalOnlineTime", history.optLong("totalOnlineTime", 0));
                                device.put("connectionsToday", getConnectionsToday(mac));
                                device.put("isOnline", true);
                            }
                        }
                    } catch (Exception e) {
                        Log.e(TAG, "Error enhancing device data", e);
                    }
                }
                
                Log.d(TAG, "========================================");
                Log.d(TAG, "SCAN COMPLETE - TOTAL DEVICES: " + deviceMap.size());
                Log.d(TAG, "========================================");
                
                // Convert map to array
                JSArray devicesArray = new JSArray();
                for (JSObject device : deviceMap.values()) {
                    devicesArray.put(device);
                }

                result.put("success", true);
                result.put("devices", devicesArray);
                result.put("count", deviceMap.size());
                result.put("subnet", subnet + "0/24");
                result.put("gateway", gatewayIP);
                result.put("source", deviceMap.isEmpty() ? "No devices found" : "Router Bypass + Fallbacks");

            } catch (Exception e) {
                Log.e(TAG, "Error scanning devices", e);
                result.put("success", false);
                result.put("error", e.getMessage());
                result.put("devices", new JSArray());
            }

            call.resolve(result);
        }).start();
    }

    /**
     * Alias for scanDevices() to match TypeScript interface
     * This allows the TypeScript plugin to call startScan() which maps to scanDevices()
     */
    @PluginMethod
    public void startScan(PluginCall call) {
        scanDevices(call);
    }

    @PluginMethod
    public void scanWithRouterCredentials(PluginCall call) {
        String username = call.getString("username", "admin");
        String password = call.getString("password", "");
        String routerIP = call.getString("routerIP", null);
        
        // Run scan in background thread
        new Thread(() -> {
            JSObject result = new JSObject();
            Map<String, JSObject> deviceMap = Collections.synchronizedMap(new HashMap<>());

            try {
                String subnet = getSubnet();
                if (subnet == null) {
                    result.put("success", false);
                    result.put("error", "Could not determine network subnet. Make sure WiFi is connected.");
                    result.put("devices", new JSArray());
                    call.resolve(result);
                    return;
                }

                // ===== Router API Discovery with provided credentials =====
                Log.d(TAG, "Starting Router API discovery with credentials...");
                try {
                    // Use provided routerIP or auto-detect from gateway
                    String gatewayIP = routerIP;
                    if (gatewayIP == null || gatewayIP.isEmpty()) {
                        gatewayIP = intToIp(wifiManager.getDhcpInfo().gateway);
                        Log.d(TAG, "Auto-detected gateway IP: " + gatewayIP);
                    } else {
                        Log.d(TAG, "Using provided router IP: " + gatewayIP);
                    }
                    
                    RouterAPIService routerAPI = new RouterAPIService(gatewayIP);
                    routerAPI.setCredentials(username, password);
                    
                    List<JSObject> routerDevices = routerAPI.getConnectedDevices();
                    
                    // Add router devices to map
                    for (JSObject device : routerDevices) {
                        String ip = device.getString("ipAddress");
                        if (ip != null) {
                            // Enhance with device identification
                            String mac = device.getString("macAddress");
                            if (mac != null) {
                                String deviceType = identifyDeviceType(ip, mac);
                                device.put("deviceType", deviceType);
                                
                                // Update device history
                                String hostname = device.getString("hostname");
                                JSONObject history = updateDeviceHistory(mac, hostname, ip, deviceType);
                                if (history != null) {
                                    device.put("firstSeen", history.optLong("firstSeen", 0));
                                    device.put("lastSeen", history.optLong("lastSeen", 0));
                                    device.put("connectionCount", history.optInt("connectionCount", 1));
                                    device.put("totalOnlineTime", history.optLong("totalOnlineTime", 0));
                                    device.put("connectionsToday", getConnectionsToday(mac));
                                }
                            }
                            
                            deviceMap.put(ip, device);
                        }
                    }
                    
                    Log.d(TAG, "Router API with credentials found " + routerDevices.size() + " devices");
                    
                } catch (Exception e) {
                    Log.e(TAG, "Router API with credentials failed", e);
                }

                // Convert map to array
                JSArray devicesArray = new JSArray();
                for (JSObject device : deviceMap.values()) {
                    devicesArray.put(device);
                }

                result.put("success", true);
                result.put("devices", devicesArray);
                result.put("count", deviceMap.size());
                result.put("subnet", subnet + "0/24");
                result.put("source", "Router API");

            } catch (Exception e) {
                Log.e(TAG, "Error scanning with router credentials", e);
                result.put("success", false);
                result.put("error", e.getMessage());
                result.put("devices", new JSArray());
            }

            call.resolve(result);
        }).start();
    }
    
    // Quick port check with custom timeout
    private boolean isPortOpenQuick(String host, int port, int timeout) {
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(host, port), timeout);
            socket.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    // Merge device data from multiple discovery sources
    private void mergeDeviceData(JSObject target, JSObject source) {
        try {
            // Merge all keys from source to target (don't overwrite existing non-null values)
            Iterator<String> keys = source.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                Object value = source.get(key);
                
                // Skip null values
                if (value == null) continue;
                
                // Don't overwrite existing non-null values except for specific keys
                if (!target.has(key) || target.get(key) == null || 
                    key.equals("timestamp") || key.equals("source")) {
                    target.put(key, value);
                } else if (key.equals("source")) {
                    // Combine sources
                    String existingSource = target.getString("source");
                    String newSource = source.getString("source");
                    if (existingSource != null && newSource != null && !existingSource.contains(newSource)) {
                        target.put("source", existingSource + " + " + newSource);
                    }
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "Error merging device data", e);
        }
    }
    
    // Advanced signal strength estimation using ping and WiFi RSSI
    private int estimateSignalStrengthAdvanced(int pingMs, int baseRssi) {
        if (pingMs < 0) return 0;
        
        // Base signal from ping latency
        int pingSignal;
        if (pingMs < 3) pingSignal = 100;
        else if (pingMs < 5) pingSignal = 95;
        else if (pingMs < 10) pingSignal = 90;
        else if (pingMs < 20) pingSignal = 85;
        else if (pingMs < 30) pingSignal = 80;
        else if (pingMs < 50) pingSignal = 70;
        else if (pingMs < 100) pingSignal = 60;
        else if (pingMs < 200) pingSignal = 50;
        else if (pingMs < 500) pingSignal = 35;
        else pingSignal = 20;
        
        // Adjust based on WiFi signal quality
        // If our WiFi is weak, other devices might also have weak signals
        int rssiAdjustment = 0;
        if (baseRssi < -80) rssiAdjustment = -15;
        else if (baseRssi < -70) rssiAdjustment = -10;
        else if (baseRssi < -60) rssiAdjustment = -5;
        else if (baseRssi > -50) rssiAdjustment = 5;
        
        return Math.max(0, Math.min(100, pingSignal + rssiAdjustment));
    }
    
    // Estimate RSSI (dBm) from ping latency
    private int estimateRssiFromPing(int pingMs, int baseRssi) {
        if (pingMs < 0) return -100;
        
        // Estimate RSSI based on ping (rough approximation)
        int estimatedRssi;
        if (pingMs < 5) estimatedRssi = -30;
        else if (pingMs < 10) estimatedRssi = -40;
        else if (pingMs < 20) estimatedRssi = -50;
        else if (pingMs < 50) estimatedRssi = -60;
        else if (pingMs < 100) estimatedRssi = -70;
        else if (pingMs < 200) estimatedRssi = -80;
        else estimatedRssi = -90;
        
        // Blend with base RSSI for more realistic estimate
        return (estimatedRssi + baseRssi) / 2;
    }
    
    // Get connections count for today
    private int getConnectionsToday(String macAddress) {
        if (macAddress == null) return 0;
        
        String todayKey = macAddress + "_today_" + getTodayDateString();
        return deviceHistoryPrefs.getInt(todayKey, 0);
    }
    
    // Increment today's connection count
    private void incrementConnectionsToday(String macAddress) {
        if (macAddress == null) return;
        
        String todayKey = macAddress + "_today_" + getTodayDateString();
        int current = deviceHistoryPrefs.getInt(todayKey, 0);
        deviceHistoryPrefs.edit().putInt(todayKey, current + 1).apply();
    }
    
    // Get today's date as string for daily tracking
    private String getTodayDateString() {
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.US);
        return sdf.format(new java.util.Date());
    }
    
    private List<JSObject> getArpDevices() {
        List<JSObject> devices = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/proc/net/arp"));
            String line;
            reader.readLine(); // Skip header

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                if (parts.length >= 4 && !parts[3].equals("00:00:00:00:00:00")) {
                    String ipAddress = parts[0];
                    String macAddress = parts[3];
                    String hostname = "Unknown";
                    
                    // Try to get hostname
                    try {
                        InetAddress addr = InetAddress.getByName(ipAddress);
                        hostname = addr.getHostName();
                    } catch (Exception e) {
                        // Keep as Unknown
                    }
                    
                    String deviceType = identifyDeviceType(ipAddress, macAddress);
                    
                    // Update device history
                    JSONObject history = updateDeviceHistory(macAddress, hostname, ipAddress, deviceType);
                    
                    // Measure ping latency for signal estimation
                    int pingMs = measurePingLatency(ipAddress);
                    int signalStrength = estimateSignalStrength(pingMs);
                    
                    JSObject device = new JSObject();
                    device.put("ipAddress", ipAddress);
                    device.put("macAddress", macAddress);
                    device.put("hostname", hostname);
                    device.put("deviceType", deviceType);
                    device.put("isReachable", true);
                    device.put("source", "ARP");
                    device.put("pingMs", pingMs);
                    device.put("signalStrength", signalStrength);
                    
                    // Add history data
                    if (history != null) {
                        device.put("firstSeen", history.optLong("firstSeen", 0));
                        device.put("lastSeen", history.optLong("lastSeen", 0));
                        device.put("connectionCount", history.optInt("connectionCount", 1));
                        device.put("totalOnlineTime", history.optLong("totalOnlineTime", 0));
                        device.put("lastSessionStart", history.optLong("lastSessionStart", 0));
                        device.put("isOnline", true);
                    }
                    
                    // Check common ports (quick check)
                    device.put("hasHttp", isPortOpen(ipAddress, 80));
                    device.put("hasHttps", isPortOpen(ipAddress, 443));
                    device.put("hasSsh", isPortOpen(ipAddress, 22));
                    
                    device.put("timestamp", System.currentTimeMillis());
                    devices.add(device);
                }
            }
            reader.close();
        } catch (IOException e) {
            Log.e(TAG, "Error reading ARP table", e);
        }
        return devices;
    }

    @PluginMethod
    public void getArpTable(PluginCall call) {
        JSObject result = new JSObject();
        JSArray devicesArray = new JSArray();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("/proc/net/arp"));
            String line;
            reader.readLine(); // Skip header

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                if (parts.length >= 4) {
                    JSObject device = new JSObject();
                    device.put("ipAddress", parts[0]);
                    device.put("macAddress", parts[3]);
                    device.put("device", parts.length > 5 ? parts[5] : "Unknown");
                    device.put("flags", parts[2]);
                    devicesArray.put(device);
                }
            }
            reader.close();

            result.put("success", true);
            result.put("devices", devicesArray);
        } catch (IOException e) {
            Log.e(TAG, "Error reading ARP table", e);
            result.put("success", false);
            result.put("error", e.getMessage());
            result.put("devices", devicesArray);
        }

        call.resolve(result);
    }

    @PluginMethod
    public void getDeviceHistory(PluginCall call) {
        JSObject result = new JSObject();
        JSArray devicesArray = new JSArray();

        try {
            Map<String, ?> allHistory = deviceHistoryPrefs.getAll();
            for (Map.Entry<String, ?> entry : allHistory.entrySet()) {
                try {
                    JSONObject history = new JSONObject((String) entry.getValue());
                    JSObject device = new JSObject();
                    device.put("macAddress", history.optString("macAddress", entry.getKey()));
                    device.put("hostname", history.optString("hostname", "Unknown"));
                    device.put("ipAddress", history.optString("ipAddress", ""));
                    device.put("deviceType", history.optString("deviceType", "Unknown"));
                    device.put("firstSeen", history.optLong("firstSeen", 0));
                    device.put("lastSeen", history.optLong("lastSeen", 0));
                    device.put("connectionCount", history.optInt("connectionCount", 0));
                    device.put("totalOnlineTime", history.optLong("totalOnlineTime", 0));
                    device.put("isOnline", history.optBoolean("isOnline", false));
                    devicesArray.put(device);
                } catch (JSONException e) {
                    Log.e(TAG, "Error parsing device history entry", e);
                }
            }

            result.put("success", true);
            result.put("devices", devicesArray);
            result.put("count", devicesArray.length());
        } catch (Exception e) {
            Log.e(TAG, "Error getting device history", e);
            result.put("success", false);
            result.put("error", e.getMessage());
            result.put("devices", devicesArray);
        }

        call.resolve(result);
    }

    @PluginMethod
    public void clearDeviceHistory(PluginCall call) {
        JSObject result = new JSObject();
        try {
            deviceHistoryPrefs.edit().clear().apply();
            result.put("success", true);
        } catch (Exception e) {
            Log.e(TAG, "Error clearing device history", e);
            result.put("success", false);
            result.put("error", e.getMessage());
        }
        call.resolve(result);
    }

    private String getSubnet() {
        if (wifiManager == null) return null;
        
        DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
        if (dhcpInfo == null) return null;

        int ip = dhcpInfo.ipAddress;
        int mask = dhcpInfo.netmask;
        int network = ip & mask;

        return String.format("%d.%d.%d.",
            (network & 0xff),
            (network >> 8 & 0xff),
            (network >> 16 & 0xff));
    }

    private String getMacFromArpCache(String ip) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/proc/net/arp"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                if (parts.length >= 4 && parts[0].equals(ip)) {
                    reader.close();
                    return parts[3];
                }
            }
            reader.close();
        } catch (IOException e) {
            Log.e(TAG, "Error reading ARP cache", e);
        }
        return null;
    }

    private boolean isPortOpen(String host, int port) {
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(host, port), 200);
            socket.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private String identifyDeviceType(String ip, String mac) {
        // Simple device type identification based on MAC prefix
        if (mac == null || mac.equals("Unknown")) return "Unknown";
        
        String macUpper = mac.toUpperCase();
        String macPrefix = macUpper.length() >= 8 ? macUpper.substring(0, 8) : macUpper;
        
        // Apple devices
        if (macPrefix.startsWith("AC:DE:48") || macPrefix.startsWith("18:B4:30") ||
            macPrefix.startsWith("00:1C:B3") || macPrefix.startsWith("00:1E:C2") ||
            macPrefix.startsWith("00:21:E9") || macPrefix.startsWith("00:22:41") ||
            macPrefix.startsWith("00:23:12") || macPrefix.startsWith("00:23:32") ||
            macPrefix.startsWith("00:23:6C") || macPrefix.startsWith("00:23:DF") ||
            macPrefix.startsWith("00:24:36") || macPrefix.startsWith("00:25:00") ||
            macPrefix.startsWith("00:25:4B") || macPrefix.startsWith("00:25:BC") ||
            macPrefix.startsWith("00:26:08") || macPrefix.startsWith("00:26:4A") ||
            macPrefix.startsWith("00:26:B0") || macPrefix.startsWith("00:26:BB") ||
            macPrefix.startsWith("3C:06:30") || macPrefix.startsWith("3C:07:54") ||
            macPrefix.startsWith("A4:D1:8C") || macPrefix.startsWith("F0:B4:79") ||
            macPrefix.startsWith("F4:5C:89") || macPrefix.startsWith("F8:1E:DF")) return "iPhone/iPad";
        
        // Samsung devices
        if (macPrefix.startsWith("00:1E:C2") || macPrefix.startsWith("00:26:AB") ||
            macPrefix.startsWith("00:26:37") || macPrefix.startsWith("00:12:47") ||
            macPrefix.startsWith("00:15:99") || macPrefix.startsWith("00:16:32") ||
            macPrefix.startsWith("00:17:C9") || macPrefix.startsWith("00:18:AF") ||
            macPrefix.startsWith("00:1A:8A") || macPrefix.startsWith("00:1B:98") ||
            macPrefix.startsWith("00:1C:43") || macPrefix.startsWith("00:1D:25") ||
            macPrefix.startsWith("00:1D:F6") || macPrefix.startsWith("00:1E:7D") ||
            macPrefix.startsWith("00:21:19") || macPrefix.startsWith("00:21:4C") ||
            macPrefix.startsWith("00:21:D1") || macPrefix.startsWith("00:21:D2") ||
            macPrefix.startsWith("00:23:39") || macPrefix.startsWith("00:23:3A") ||
            macPrefix.startsWith("00:23:99") || macPrefix.startsWith("00:23:D6") ||
            macPrefix.startsWith("00:23:D7") || macPrefix.startsWith("00:24:54") ||
            macPrefix.startsWith("00:24:90") || macPrefix.startsWith("00:24:91") ||
            macPrefix.startsWith("00:24:E9") || macPrefix.startsWith("00:25:38") ||
            macPrefix.startsWith("00:25:66") || macPrefix.startsWith("00:25:67") ||
            macPrefix.startsWith("00:26:5D") || macPrefix.startsWith("00:26:5F")) return "Samsung";
        
        // Xiaomi devices
        if (macPrefix.startsWith("00:1D:D8") || macPrefix.startsWith("00:22:68") ||
            macPrefix.startsWith("00:9E:C8") || macPrefix.startsWith("04:CF:8C") ||
            macPrefix.startsWith("0C:1D:AF") || macPrefix.startsWith("10:2A:B3") ||
            macPrefix.startsWith("14:F6:5A") || macPrefix.startsWith("18:59:36") ||
            macPrefix.startsWith("20:34:FB") || macPrefix.startsWith("28:6C:07") ||
            macPrefix.startsWith("34:80:B3") || macPrefix.startsWith("38:A4:ED") ||
            macPrefix.startsWith("3C:BD:D8") || macPrefix.startsWith("44:23:7C") ||
            macPrefix.startsWith("50:64:2B") || macPrefix.startsWith("58:44:98") ||
            macPrefix.startsWith("64:09:80") || macPrefix.startsWith("64:B4:73") ||
            macPrefix.startsWith("68:DF:DD") || macPrefix.startsWith("74:23:44") ||
            macPrefix.startsWith("78:02:F8") || macPrefix.startsWith("78:11:DC") ||
            macPrefix.startsWith("7C:1D:D9") || macPrefix.startsWith("84:F3:EB") ||
            macPrefix.startsWith("8C:BE:BE") || macPrefix.startsWith("98:FA:E3") ||
            macPrefix.startsWith("9C:99:A0") || macPrefix.startsWith("A0:86:C6") ||
            macPrefix.startsWith("AC:C1:EE") || macPrefix.startsWith("B0:E2:35") ||
            macPrefix.startsWith("C4:0B:CB") || macPrefix.startsWith("C4:6A:B7") ||
            macPrefix.startsWith("D4:97:0B") || macPrefix.startsWith("E8:AB:FA") ||
            macPrefix.startsWith("F0:B4:29") || macPrefix.startsWith("F4:F5:DB") ||
            macPrefix.startsWith("F8:A4:5F") || macPrefix.startsWith("FC:64:BA")) return "Xiaomi/Redmi";
        
        // OnePlus
        if (macPrefix.startsWith("C0:EE:FB") || macPrefix.startsWith("94:65:2D") ||
            macPrefix.startsWith("64:A2:F9") || macPrefix.startsWith("BC:14:85")) return "OnePlus";
        
        // Huawei
        if (macPrefix.startsWith("00:18:82") || macPrefix.startsWith("00:1E:10") ||
            macPrefix.startsWith("00:25:68") || macPrefix.startsWith("00:25:9E") ||
            macPrefix.startsWith("00:46:4B") || macPrefix.startsWith("00:66:4B") ||
            macPrefix.startsWith("00:9A:CD") || macPrefix.startsWith("00:E0:FC") ||
            macPrefix.startsWith("04:02:1F") || macPrefix.startsWith("04:25:C5") ||
            macPrefix.startsWith("04:33:89") || macPrefix.startsWith("04:B0:E7") ||
            macPrefix.startsWith("04:C0:6F") || macPrefix.startsWith("04:F9:38") ||
            macPrefix.startsWith("08:19:A6") || macPrefix.startsWith("08:63:61") ||
            macPrefix.startsWith("08:7A:4C") || macPrefix.startsWith("0C:37:DC") ||
            macPrefix.startsWith("0C:45:BA") || macPrefix.startsWith("0C:96:BF")) return "Huawei";
        
        // Google devices
        if (macPrefix.startsWith("00:1A:11") || macPrefix.startsWith("00:1E:58") ||
            macPrefix.startsWith("3C:5A:B4") || macPrefix.startsWith("54:60:09") ||
            macPrefix.startsWith("94:EB:2C") || macPrefix.startsWith("F4:F5:E8") ||
            macPrefix.startsWith("F8:8F:CA")) return "Google/Pixel";
        
        // Smart TVs
        if (macPrefix.startsWith("00:09:B0") || macPrefix.startsWith("00:E0:91") ||
            macPrefix.startsWith("38:8C:50") || macPrefix.startsWith("5C:49:7D") ||
            macPrefix.startsWith("78:BD:BC") || macPrefix.startsWith("84:A4:66") ||
            macPrefix.startsWith("AC:5A:14") || macPrefix.startsWith("CC:6E:A4")) return "Smart TV";
        
        // Amazon devices (Echo, Fire TV, etc.)
        if (macPrefix.startsWith("00:FC:8B") || macPrefix.startsWith("0C:47:C9") ||
            macPrefix.startsWith("10:CE:A9") || macPrefix.startsWith("18:74:2E") ||
            macPrefix.startsWith("34:D2:70") || macPrefix.startsWith("38:F7:3D") ||
            macPrefix.startsWith("40:B4:CD") || macPrefix.startsWith("44:65:0D") ||
            macPrefix.startsWith("4C:EF:C0") || macPrefix.startsWith("50:DC:E7") ||
            macPrefix.startsWith("68:37:E9") || macPrefix.startsWith("68:54:FD") ||
            macPrefix.startsWith("74:C2:46") || macPrefix.startsWith("84:D6:D0") ||
            macPrefix.startsWith("A0:02:DC") || macPrefix.startsWith("AC:63:BE") ||
            macPrefix.startsWith("B4:7C:9C") || macPrefix.startsWith("F0:27:2D") ||
            macPrefix.startsWith("F0:F0:A4") || macPrefix.startsWith("FC:65:DE")) return "Amazon Echo/Fire";
        
        // Smartwatches
        if (macPrefix.startsWith("00:1E:AE") || macPrefix.startsWith("00:24:E4") ||
            macPrefix.startsWith("00:27:13") || macPrefix.startsWith("28:FA:A0") ||
            macPrefix.startsWith("30:21:19") || macPrefix.startsWith("48:A9:D2") ||
            macPrefix.startsWith("5C:E8:EB") || macPrefix.startsWith("74:75:48") ||
            macPrefix.startsWith("88:B4:A6") || macPrefix.startsWith("98:29:A6") ||
            macPrefix.startsWith("B8:5A:F7") || macPrefix.startsWith("D0:E7:82")) return "Smartwatch";
        
        // Routers/Network equipment
        if (macPrefix.startsWith("00:1A:2B") || macPrefix.startsWith("00:1F:E2") ||
            macPrefix.startsWith("00:14:BF") || macPrefix.startsWith("00:17:9A") ||
            macPrefix.startsWith("00:18:39") || macPrefix.startsWith("00:19:5B") ||
            macPrefix.startsWith("00:1A:A2") || macPrefix.startsWith("00:1B:2F") ||
            macPrefix.startsWith("00:1C:10") || macPrefix.startsWith("00:1D:45") ||
            macPrefix.startsWith("00:1E:13") || macPrefix.startsWith("00:1E:BD") ||
            macPrefix.startsWith("00:1F:27") || macPrefix.startsWith("00:1F:6C") ||
            macPrefix.startsWith("00:21:29") || macPrefix.startsWith("00:21:55") ||
            macPrefix.startsWith("00:22:3F") || macPrefix.startsWith("00:22:6B") ||
            macPrefix.startsWith("00:23:04") || macPrefix.startsWith("00:23:5E") ||
            macPrefix.startsWith("00:23:69") || macPrefix.startsWith("00:23:AB") ||
            macPrefix.startsWith("00:24:14") || macPrefix.startsWith("00:24:97") ||
            macPrefix.startsWith("00:24:C3") || macPrefix.startsWith("00:25:45") ||
            macPrefix.startsWith("00:25:84") || macPrefix.startsWith("00:25:B4") ||
            macPrefix.startsWith("00:26:0A") || macPrefix.startsWith("00:26:52") ||
            macPrefix.startsWith("00:26:98") || macPrefix.startsWith("00:26:CB")) return "Router/AP";
        
        // TP-Link
        if (macPrefix.startsWith("00:1D:0F") || macPrefix.startsWith("00:23:CD") ||
            macPrefix.startsWith("00:27:19") || macPrefix.startsWith("14:CC:20") ||
            macPrefix.startsWith("14:CF:92") || macPrefix.startsWith("18:A6:F7") ||
            macPrefix.startsWith("1C:3B:F3") || macPrefix.startsWith("30:B5:C2") ||
            macPrefix.startsWith("50:C7:BF") || macPrefix.startsWith("54:C8:0F") ||
            macPrefix.startsWith("60:E3:27") || macPrefix.startsWith("64:66:B3") ||
            macPrefix.startsWith("64:70:02") || macPrefix.startsWith("6C:B0:CE") ||
            macPrefix.startsWith("78:A1:06") || macPrefix.startsWith("90:F6:52") ||
            macPrefix.startsWith("94:D9:B3") || macPrefix.startsWith("98:DA:C4") ||
            macPrefix.startsWith("A0:F3:C1") || macPrefix.startsWith("AC:84:C6") ||
            macPrefix.startsWith("B0:4E:26") || macPrefix.startsWith("B0:95:75") ||
            macPrefix.startsWith("C0:25:E9") || macPrefix.startsWith("C4:6E:1F") ||
            macPrefix.startsWith("C8:3A:35") || macPrefix.startsWith("D4:6E:0E") ||
            macPrefix.startsWith("D8:07:B6") || macPrefix.startsWith("E4:D3:32") ||
            macPrefix.startsWith("E8:94:F6") || macPrefix.startsWith("EC:08:6B") ||
            macPrefix.startsWith("EC:17:2F") || macPrefix.startsWith("F4:EC:38") ||
            macPrefix.startsWith("F8:1A:67") || macPrefix.startsWith("F8:D1:11")) return "TP-Link";
        
        // Raspberry Pi
        if (macPrefix.startsWith("00:1A:79") || macPrefix.startsWith("B8:27:EB") ||
            macPrefix.startsWith("DC:A6:32") || macPrefix.startsWith("E4:5F:01")) return "Raspberry Pi";
        
        // VMware/VirtualBox
        if (macPrefix.startsWith("00:50:56") || macPrefix.startsWith("00:0C:29")) return "VMware VM";
        if (macPrefix.startsWith("08:00:27")) return "VirtualBox VM";
        
        // Dell
        if (macPrefix.startsWith("00:14:22") || macPrefix.startsWith("00:1B:63") ||
            macPrefix.startsWith("00:06:5B") || macPrefix.startsWith("00:08:74") ||
            macPrefix.startsWith("00:0B:DB") || macPrefix.startsWith("00:0D:56") ||
            macPrefix.startsWith("00:0F:1F") || macPrefix.startsWith("00:11:43") ||
            macPrefix.startsWith("00:12:3F") || macPrefix.startsWith("00:13:72") ||
            macPrefix.startsWith("00:15:C5") || macPrefix.startsWith("00:18:8B") ||
            macPrefix.startsWith("00:19:B9") || macPrefix.startsWith("00:1A:A0") ||
            macPrefix.startsWith("00:1C:23") || macPrefix.startsWith("00:1D:09") ||
            macPrefix.startsWith("00:1E:4F") || macPrefix.startsWith("00:1E:C9") ||
            macPrefix.startsWith("00:21:70") || macPrefix.startsWith("00:21:9B") ||
            macPrefix.startsWith("00:22:19") || macPrefix.startsWith("00:23:AE") ||
            macPrefix.startsWith("00:24:E8") || macPrefix.startsWith("00:25:64") ||
            macPrefix.startsWith("00:26:B9")) return "Dell PC/Laptop";
        
        // HP
        if (macPrefix.startsWith("00:1C:C0") || macPrefix.startsWith("00:21:5A") ||
            macPrefix.startsWith("00:01:E6") || macPrefix.startsWith("00:01:E7") ||
            macPrefix.startsWith("00:02:A5") || macPrefix.startsWith("00:04:EA") ||
            macPrefix.startsWith("00:08:02") || macPrefix.startsWith("00:08:83") ||
            macPrefix.startsWith("00:0A:57") || macPrefix.startsWith("00:0B:CD") ||
            macPrefix.startsWith("00:0D:9D") || macPrefix.startsWith("00:0E:7F") ||
            macPrefix.startsWith("00:0F:20") || macPrefix.startsWith("00:0F:61") ||
            macPrefix.startsWith("00:10:83") || macPrefix.startsWith("00:11:0A") ||
            macPrefix.startsWith("00:11:85") || macPrefix.startsWith("00:12:79") ||
            macPrefix.startsWith("00:13:21") || macPrefix.startsWith("00:14:38") ||
            macPrefix.startsWith("00:14:C2") || macPrefix.startsWith("00:15:60") ||
            macPrefix.startsWith("00:16:35") || macPrefix.startsWith("00:17:08") ||
            macPrefix.startsWith("00:17:A4") || macPrefix.startsWith("00:18:71") ||
            macPrefix.startsWith("00:18:FE") || macPrefix.startsWith("00:19:BB") ||
            macPrefix.startsWith("00:1A:4B") || macPrefix.startsWith("00:1B:78") ||
            macPrefix.startsWith("00:1C:2E") || macPrefix.startsWith("00:1E:0B") ||
            macPrefix.startsWith("00:1F:29") || macPrefix.startsWith("00:21:5A") ||
            macPrefix.startsWith("00:22:64") || macPrefix.startsWith("00:23:7D") ||
            macPrefix.startsWith("00:24:81") || macPrefix.startsWith("00:25:B3") ||
            macPrefix.startsWith("00:26:55")) return "HP PC/Laptop";
        
        // Lenovo
        if (macPrefix.startsWith("00:06:1B") || macPrefix.startsWith("00:09:6B") ||
            macPrefix.startsWith("00:0A:E4") || macPrefix.startsWith("00:12:FE") ||
            macPrefix.startsWith("00:16:41") || macPrefix.startsWith("00:1A:6B") ||
            macPrefix.startsWith("00:1E:4C") || macPrefix.startsWith("00:1E:68") ||
            macPrefix.startsWith("00:21:86") || macPrefix.startsWith("00:22:4D") ||
            macPrefix.startsWith("00:23:7D") || macPrefix.startsWith("00:24:7E") ||
            macPrefix.startsWith("00:26:22") || macPrefix.startsWith("28:D2:44") ||
            macPrefix.startsWith("40:B0:34") || macPrefix.startsWith("54:EE:75") ||
            macPrefix.startsWith("60:D9:C7") || macPrefix.startsWith("70:72:0D") ||
            macPrefix.startsWith("74:E5:0B") || macPrefix.startsWith("7C:7A:91") ||
            macPrefix.startsWith("84:7B:EB") || macPrefix.startsWith("88:70:8C") ||
            macPrefix.startsWith("98:FA:9B") || macPrefix.startsWith("A4:4E:31") ||
            macPrefix.startsWith("B8:70:F4") || macPrefix.startsWith("C8:1F:66") ||
            macPrefix.startsWith("D0:57:7B") || macPrefix.startsWith("E8:2A:EA") ||
            macPrefix.startsWith("F0:DE:F1") || macPrefix.startsWith("F4:8E:38")) return "Lenovo PC/Laptop";
        
        // Microsoft
        if (macPrefix.startsWith("00:0D:3A") || macPrefix.startsWith("00:15:5D") ||
            macPrefix.startsWith("00:17:FA") || macPrefix.startsWith("00:1D:D8") ||
            macPrefix.startsWith("00:22:48") || macPrefix.startsWith("00:25:AE") ||
            macPrefix.startsWith("00:50:F2") || macPrefix.startsWith("28:18:78") ||
            macPrefix.startsWith("30:59:B7") || macPrefix.startsWith("50:1A:C5") ||
            macPrefix.startsWith("58:82:A8") || macPrefix.startsWith("60:45:BD") ||
            macPrefix.startsWith("7C:1E:52") || macPrefix.startsWith("7C:ED:8D") ||
            macPrefix.startsWith("98:5F:D3") || macPrefix.startsWith("B4:0E:DE") ||
            macPrefix.startsWith("C8:3F:26") || macPrefix.startsWith("DC:B4:C4") ||
            macPrefix.startsWith("F4:8C:50")) return "Microsoft/Xbox";
        
        // Sony PlayStation
        if (macPrefix.startsWith("00:04:1F") || macPrefix.startsWith("00:13:15") ||
            macPrefix.startsWith("00:15:C1") || macPrefix.startsWith("00:19:C5") ||
            macPrefix.startsWith("00:1D:0D") || macPrefix.startsWith("00:1F:A7") ||
            macPrefix.startsWith("00:24:8D") || macPrefix.startsWith("28:0D:FC") ||
            macPrefix.startsWith("70:9E:29") || macPrefix.startsWith("78:C8:81") ||
            macPrefix.startsWith("A8:E3:EE") || macPrefix.startsWith("BC:60:A7") ||
            macPrefix.startsWith("F8:46:1C") || macPrefix.startsWith("FC:0F:E6")) return "PlayStation";
        
        // Nintendo
        if (macPrefix.startsWith("00:09:BF") || macPrefix.startsWith("00:16:56") ||
            macPrefix.startsWith("00:17:AB") || macPrefix.startsWith("00:19:1D") ||
            macPrefix.startsWith("00:19:FD") || macPrefix.startsWith("00:1A:E9") ||
            macPrefix.startsWith("00:1B:7A") || macPrefix.startsWith("00:1B:EA") ||
            macPrefix.startsWith("00:1C:BE") || macPrefix.startsWith("00:1D:BC") ||
            macPrefix.startsWith("00:1E:35") || macPrefix.startsWith("00:1E:A9") ||
            macPrefix.startsWith("00:1F:32") || macPrefix.startsWith("00:1F:C5") ||
            macPrefix.startsWith("00:21:47") || macPrefix.startsWith("00:21:BD") ||
            macPrefix.startsWith("00:22:4C") || macPrefix.startsWith("00:22:AA") ||
            macPrefix.startsWith("00:23:31") || macPrefix.startsWith("00:23:CC") ||
            macPrefix.startsWith("00:24:1E") || macPrefix.startsWith("00:24:44") ||
            macPrefix.startsWith("00:24:F3") || macPrefix.startsWith("00:25:A0") ||
            macPrefix.startsWith("00:26:59") || macPrefix.startsWith("2C:10:C1") ||
            macPrefix.startsWith("34:AF:2C") || macPrefix.startsWith("40:D2:8A") ||
            macPrefix.startsWith("58:BD:A3") || macPrefix.startsWith("78:A2:A0") ||
            macPrefix.startsWith("7C:BB:8A") || macPrefix.startsWith("8C:CD:E8") ||
            macPrefix.startsWith("98:41:5C") || macPrefix.startsWith("98:B6:E9") ||
            macPrefix.startsWith("A4:5C:27") || macPrefix.startsWith("B8:AE:6E") ||
            macPrefix.startsWith("CC:9E:00") || macPrefix.startsWith("D8:6B:F7") ||
            macPrefix.startsWith("DC:68:EB") || macPrefix.startsWith("E0:0C:7F") ||
            macPrefix.startsWith("E0:E7:51") || macPrefix.startsWith("E8:4E:CE")) return "Nintendo";
        
        // Printers
        if (macPrefix.startsWith("00:00:48") || macPrefix.startsWith("00:00:74") ||
            macPrefix.startsWith("00:00:85") || macPrefix.startsWith("00:00:F0") ||
            macPrefix.startsWith("00:01:E4") || macPrefix.startsWith("00:04:00") ||
            macPrefix.startsWith("00:80:77") || macPrefix.startsWith("00:80:91") ||
            macPrefix.startsWith("00:C0:EE")) return "Printer";
        
        // IoT/Smart Home
        if (macPrefix.startsWith("18:B4:30") || macPrefix.startsWith("24:0A:C4") ||
            macPrefix.startsWith("2C:F4:32") || macPrefix.startsWith("5C:CF:7F") ||
            macPrefix.startsWith("60:01:94") || macPrefix.startsWith("68:C6:3A") ||
            macPrefix.startsWith("84:0D:8E") || macPrefix.startsWith("84:F3:EB") ||
            macPrefix.startsWith("A0:20:A6") || macPrefix.startsWith("A4:CF:12") ||
            macPrefix.startsWith("AC:CF:23") || macPrefix.startsWith("B4:E6:2D") ||
            macPrefix.startsWith("BC:DD:C2") || macPrefix.startsWith("C4:5B:BE") ||
            macPrefix.startsWith("CC:50:E3") || macPrefix.startsWith("D8:F1:5B") ||
            macPrefix.startsWith("DC:4F:22") || macPrefix.startsWith("EC:FA:BC")) return "IoT Device";
        
        return "Network Device";
    }

    private String intToIp(int ip) {
        return String.format("%d.%d.%d.%d",
            (ip & 0xff),
            (ip >> 8 & 0xff),
            (ip >> 16 & 0xff),
            (ip >> 24 & 0xff));
    }

    // ===== NEW ENHANCED SCAN METHOD =====
    @PluginMethod
    public void scanWithDetails(PluginCall call) {
        new Thread(() -> {
            long startTime = System.currentTimeMillis();
            JSObject result = new JSObject();
            
            try {
                // Run existing scan to get devices
                String subnet = getSubnet();
                if (subnet == null) {
                    result.put("success", false);
                    result.put("error", "Could not determine network subnet");
                    result.put("devices", new JSArray());
                    result.put("count", 0);
                    call.resolve(result);
                    return;
                }

                // Get devices from ARP table
                List<JSObject> devices = getArpDevices();
                
                // Enhance each device with vendor and type info
                MACVendorLookup vendorLookup = MACVendorLookup.getInstance();
                DeviceDatabase db = DeviceDatabase.getInstance(getContext());
                
                JSArray enhancedDevices = new JSArray();
                for (JSObject device : devices) {
                    String mac = device.getString("macAddress");
                    String ip = device.getString("ipAddress");
                    String hostname = device.getString("hostname");
                    
                    if (mac != null && !mac.equals("Unknown")) {
                        // Get vendor from MAC
                        String vendor = vendorLookup.getVendor(mac);
                        device.put("vendor", vendor);
                        
                        // Guess device type
                        String deviceType = vendorLookup.guessDeviceType(vendor, hostname);
                        device.put("deviceType", deviceType);
                        
                        // Save/update in database
                        db.saveOrUpdate(mac, ip, hostname, vendor, deviceType);
                        
                        // Get saved device info (custom name, notes, etc.)
                        JSObject savedInfo = db.getDevice(mac);
                        if (savedInfo != null) {
                            device.put("customName", savedInfo.get("customName"));
                            device.put("firstSeen", savedInfo.get("firstSeen"));
                            device.put("lastSeen", savedInfo.get("lastSeen"));
                            device.put("timesSeen", savedInfo.get("timesSeen"));
                            device.put("isFavorite", savedInfo.get("isFavorite"));
                            device.put("notes", savedInfo.get("notes"));
                        }
                    }
                    
                    enhancedDevices.put(device);
                }
                
                long duration = System.currentTimeMillis() - startTime;
                result.put("success", true);
                result.put("devices", enhancedDevices);
                result.put("count", enhancedDevices.length());
                result.put("scanDuration", duration);
                
            } catch (Exception e) {
                Log.e(TAG, "Error in scanWithDetails", e);
                result.put("success", false);
                result.put("error", e.getMessage());
                result.put("devices", new JSArray());
                result.put("count", 0);
            }
            
            call.resolve(result);
        }).start();
    }

    // ===== PORT SCAN METHOD =====
    @PluginMethod
    public void scanDevicePorts(PluginCall call) {
        String ipAddress = call.getString("ipAddress");
        
        if (ipAddress == null) {
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "IP address is required");
            call.resolve(result);
            return;
        }
        
        new Thread(() -> {
            long startTime = System.currentTimeMillis();
            JSObject result = new JSObject();
            JSArray openPorts = new JSArray();
            
            int[] commonPorts = {21, 22, 23, 53, 80, 443, 445, 548, 554, 631, 3389, 5000, 5353, 8080, 8443, 9100, 62078};
            
            for (int port : commonPorts) {
                try {
                    Socket socket = new Socket();
                    socket.connect(new InetSocketAddress(ipAddress, port), 500);
                    socket.close();
                    
                    JSObject portInfo = new JSObject();
                    portInfo.put("port", port);
                    portInfo.put("service", getServiceName(port));
                    portInfo.put("description", getServiceDescription(port));
                    openPorts.put(portInfo);
                    
                } catch (Exception e) {
                    // Port closed or timeout
                }
            }
            
            long duration = System.currentTimeMillis() - startTime;
            result.put("success", true);
            result.put("ipAddress", ipAddress);
            result.put("openPorts", openPorts);
            result.put("scanDuration", duration);
            
            call.resolve(result);
        }).start();
    }

    private String getServiceName(int port) {
        switch (port) {
            case 21: return "FTP";
            case 22: return "SSH";
            case 23: return "Telnet";
            case 53: return "DNS";
            case 80: return "HTTP";
            case 443: return "HTTPS";
            case 445: return "SMB";
            case 548: return "AFP";
            case 554: return "RTSP";
            case 631: return "IPP Printing";
            case 3389: return "RDP";
            case 5000: return "UPnP";
            case 5353: return "mDNS";
            case 8080: return "HTTP Alt";
            case 8443: return "HTTPS Alt";
            case 9100: return "RAW Print";
            case 62078: return "iSync";
            default: return "Unknown";
        }
    }

    private String getServiceDescription(int port) {
        switch (port) {
            case 21: return "File Transfer";
            case 22: return "Secure Shell";
            case 23: return "Telnet";
            case 53: return "Domain Name System";
            case 80: return "Web Server";
            case 443: return "Secure Web";
            case 445: return "Windows File Sharing";
            case 548: return "Apple File Sharing";
            case 554: return "Camera Stream";
            case 631: return "Printer";
            case 3389: return "Windows Remote Desktop";
            case 5000: return "Universal Plug and Play";
            case 5353: return "Multicast DNS";
            case 8080: return "Web Server (Alt)";
            case 8443: return "Secure Web (Alt)";
            case 9100: return "Raw Printing";
            case 62078: return "Apple Device Sync";
            default: return "";
        }
    }

    // ===== GET DEVICE INFO =====
    @PluginMethod
    public void getDeviceInfo(PluginCall call) {
        String macAddress = call.getString("macAddress");
        
        if (macAddress == null) {
            JSObject result = new JSObject();
            result.put("device", null);
            call.resolve(result);
            return;
        }
        
        DeviceDatabase db = DeviceDatabase.getInstance(getContext());
        JSObject device = db.getDevice(macAddress);
        
        JSObject result = new JSObject();
        result.put("device", device);
        call.resolve(result);
    }

    // ===== SET CUSTOM NAME =====
    @PluginMethod
    public void setDeviceCustomName(PluginCall call) {
        String macAddress = call.getString("macAddress");
        String customName = call.getString("customName");
        
        if (macAddress == null) {
            JSObject result = new JSObject();
            result.put("success", false);
            call.resolve(result);
            return;
        }
        
        DeviceDatabase db = DeviceDatabase.getInstance(getContext());
        db.setCustomName(macAddress, customName);
        
        JSObject result = new JSObject();
        result.put("success", true);
        call.resolve(result);
    }

    // ===== SET DEVICE TYPE =====
    @PluginMethod
    public void setDeviceType(PluginCall call) {
        String macAddress = call.getString("macAddress");
        String deviceType = call.getString("deviceType");
        
        if (macAddress == null) {
            JSObject result = new JSObject();
            result.put("success", false);
            call.resolve(result);
            return;
        }
        
        DeviceDatabase db = DeviceDatabase.getInstance(getContext());
        db.setDeviceType(macAddress, deviceType);
        
        JSObject result = new JSObject();
        result.put("success", true);
        call.resolve(result);
    }

    // ===== SET DEVICE NOTES =====
    @PluginMethod
    public void setDeviceNotes(PluginCall call) {
        String macAddress = call.getString("macAddress");
        String notes = call.getString("notes");
        
        if (macAddress == null) {
            JSObject result = new JSObject();
            result.put("success", false);
            call.resolve(result);
            return;
        }
        
        DeviceDatabase db = DeviceDatabase.getInstance(getContext());
        db.setNotes(macAddress, notes);
        
        JSObject result = new JSObject();
        result.put("success", true);
        call.resolve(result);
    }

    // ===== TOGGLE FAVORITE =====
    @PluginMethod
    public void toggleDeviceFavorite(PluginCall call) {
        String macAddress = call.getString("macAddress");
        
        if (macAddress == null) {
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("isFavorite", false);
            call.resolve(result);
            return;
        }
        
        DeviceDatabase db = DeviceDatabase.getInstance(getContext());
        boolean isFavorite = db.toggleFavorite(macAddress);
        
        JSObject result = new JSObject();
        result.put("success", true);
        result.put("isFavorite", isFavorite);
        call.resolve(result);
    }

    // ===== GET ALL SAVED DEVICES =====
    @PluginMethod
    public void getSavedDevices(PluginCall call) {
        DeviceDatabase db = DeviceDatabase.getInstance(getContext());
        List<JSObject> devices = db.getAllDevices();
        
        JSArray devicesArray = new JSArray();
        for (JSObject device : devices) {
            devicesArray.put(device);
        }
        
        JSObject result = new JSObject();
        result.put("success", true);
        result.put("devices", devicesArray);
        result.put("count", devices.size());
        call.resolve(result);
    }

    // ===== DELETE DEVICE HISTORY =====
    @PluginMethod
    public void deleteDeviceHistory(PluginCall call) {
        String macAddress = call.getString("macAddress");
        
        if (macAddress == null) {
            JSObject result = new JSObject();
            result.put("success", false);
            call.resolve(result);
            return;
        }
        
        DeviceDatabase db = DeviceDatabase.getInstance(getContext());
        db.deleteDevice(macAddress);
        
        JSObject result = new JSObject();
        result.put("success", true);
        call.resolve(result);
    }

    // ===== NETWORK USAGE METHODS =====
    @PluginMethod
    public void getNetworkSpeed(PluginCall call) {
        // Returns current download/upload speed
        // Uses NetworkUsageTracker.getCurrentSpeed()
        // Run on background thread
        new Thread(() -> {
            try {
                NetworkUsageTracker tracker = NetworkUsageTracker.getInstance(getContext());
                JSONObject speed = tracker.getCurrentSpeed();

                JSObject ret = new JSObject();
                ret.put("downloadSpeed", speed.getDouble("downloadSpeed"));
                ret.put("uploadSpeed", speed.getDouble("uploadSpeed"));
                ret.put("totalRxBytes", speed.getLong("totalRxBytes"));
                ret.put("totalTxBytes", speed.getLong("totalTxBytes"));
                ret.put("timestamp", speed.getLong("timestamp"));
                call.resolve(ret);
            } catch (Exception e) {
                call.reject("Speed check failed", e);
            }
        }).start();
    }

    @PluginMethod
    public void getDataUsage(PluginCall call) {
        // Get total data usage for a time period
        // params: period = "today" | "week" | "month" | "custom"
        // params: startTime, endTime (for custom)
        new Thread(() -> {
            try {
                NetworkUsageTracker tracker = NetworkUsageTracker.getInstance(getContext());

                // Check permission first
                if (!tracker.hasUsageStatsPermission()) {
                    JSObject ret = new JSObject();
                    ret.put("needsPermission", true);
                    ret.put("error", "Usage stats permission required");
                    call.resolve(ret);
                    return;
                }

                String period = call.getString("period", "today");
                long endTime = System.currentTimeMillis();
                long startTime;

                switch (period) {
                    case "week":
                        startTime = endTime - (7L * 24 * 60 * 60 * 1000);
                        break;
                    case "month":
                        startTime = endTime - (30L * 24 * 60 * 60 * 1000);
                        break;
                    case "custom":
                        startTime = call.getLong("startTime", endTime - (24L * 60 * 60 * 1000));
                        endTime = call.getLong("endTime", endTime);
                        break;
                    case "today":
                    default:
                        // Start of today (midnight)
                        java.util.Calendar cal = java.util.Calendar.getInstance();
                        cal.set(java.util.Calendar.HOUR_OF_DAY, 0);
                        cal.set(java.util.Calendar.MINUTE, 0);
                        cal.set(java.util.Calendar.SECOND, 0);
                        cal.set(java.util.Calendar.MILLISECOND, 0);
                        startTime = cal.getTimeInMillis();
                        break;
                }

                JSONObject usage = tracker.getTotalUsage(startTime, endTime);
                JSObject ret = JSObject.fromJSONObject(usage);
                ret.put("needsPermission", false);
                call.resolve(ret);
            } catch (Exception e) {
                call.reject("Usage query failed: " + e.getMessage(), e);
            }
        }).start();
    }

    @PluginMethod
    public void getPerAppUsage(PluginCall call) {
        // Get per-app data usage
        // params: period = "today" | "week" | "month"
        new Thread(() -> {
            try {
                NetworkUsageTracker tracker = NetworkUsageTracker.getInstance(getContext());

                if (!tracker.hasUsageStatsPermission()) {
                    JSObject ret = new JSObject();
                    ret.put("needsPermission", true);
                    call.resolve(ret);
                    return;
                }

                String period = call.getString("period", "today");
                long endTime = System.currentTimeMillis();
                long startTime;

                switch (period) {
                    case "week":
                        startTime = endTime - (7L * 24 * 60 * 60 * 1000);
                        break;
                    case "month":
                        startTime = endTime - (30L * 24 * 60 * 60 * 1000);
                        break;
                    default:
                        java.util.Calendar cal = java.util.Calendar.getInstance();
                        cal.set(java.util.Calendar.HOUR_OF_DAY, 0);
                        cal.set(java.util.Calendar.MINUTE, 0);
                        cal.set(java.util.Calendar.SECOND, 0);
                        cal.set(java.util.Calendar.MILLISECOND, 0);
                        startTime = cal.getTimeInMillis();
                        break;
                }

                JSONArray apps = tracker.getPerAppUsage(startTime, endTime);
                JSObject ret = new JSObject();
                ret.put("apps", apps);
                ret.put("count", apps.length());
                ret.put("needsPermission", false);
                call.resolve(ret);
            } catch (Exception e) {
                call.reject("Per-app usage query failed: " + e.getMessage(), e);
            }
        }).start();
    }

    @PluginMethod
    public void hasUsagePermission(PluginCall call) {
        NetworkUsageTracker tracker = NetworkUsageTracker.getInstance(getContext());
        JSObject ret = new JSObject();
        ret.put("granted", tracker.hasUsageStatsPermission());
        call.resolve(ret);
    }

    @PluginMethod
    public void requestUsagePermission(PluginCall call) {
        // Open Android Settings -> Usage Access page
        // User must manually grant permission to ThirdEye
        try {
            android.content.Intent intent = new android.content.Intent(
                android.provider.Settings.ACTION_USAGE_ACCESS_SETTINGS);
            intent.setFlags(android.content.Intent.FLAG_ACTIVITY_NEW_TASK);
            getContext().startActivity(intent);
            JSObject ret = new JSObject();
            ret.put("opened", true);
            call.resolve(ret);
        } catch (Exception e) {
            call.reject("Could not open settings", e);
        }
    }
}

