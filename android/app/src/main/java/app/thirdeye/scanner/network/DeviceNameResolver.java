package app.thirdeye.scanner.network;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Device Name Resolver - Resolves device names from various sources
 * Implements multiple methods to get proper device names instead of just IPs
 */
public class DeviceNameResolver {
    private static final String TAG = "DeviceNameResolver";
    private final Context context;
    private final ExecutorService executor;
    private final Map<String, String> macVendorCache;
    
    // Common device name patterns
    private static final Map<String, String> COMMON_HOSTNAMES = new HashMap<>();
    
    static {
        // Android devices
        COMMON_HOSTNAMES.put("android", "Android Device");
        COMMON_HOSTNAMES.put("samsung", "Samsung Device");
        COMMON_HOSTNAMES.put("xiaomi", "Xiaomi Device");
        COMMON_HOSTNAMES.put("huawei", "Huawei Device");
        COMMON_HOSTNAMES.put("oppo", "OPPO Device");
        COMMON_HOSTNAMES.put("vivo", "Vivo Device");
        COMMON_HOSTNAMES.put("oneplus", "OnePlus Device");
        
        // iOS devices
        COMMON_HOSTNAMES.put("iphone", "iPhone");
        COMMON_HOSTNAMES.put("ipad", "iPad");
        COMMON_HOSTNAMES.put("ipod", "iPod");
        COMMON_HOSTNAMES.put("macbook", "MacBook");
        COMMON_HOSTNAMES.put("imac", "iMac");
        
        // Smart TVs
        COMMON_HOSTNAMES.put("smarttv", "Smart TV");
        COMMON_HOSTNAMES.put("tv", "Smart TV");
        COMMON_HOSTNAMES.put("roku", "Roku Device");
        COMMON_HOSTNAMES.put("chromecast", "Chromecast");
        COMMON_HOSTNAMES.put("firetv", "Fire TV");
        
        // Gaming consoles
        COMMON_HOSTNAMES.put("playstation", "PlayStation");
        COMMON_HOSTNAMES.put("ps4", "PlayStation 4");
        COMMON_HOSTNAMES.put("ps5", "PlayStation 5");
        COMMON_HOSTNAMES.put("xbox", "Xbox");
        COMMON_HOSTNAMES.put("nintendo", "Nintendo Switch");
        
        // Smart home devices
        COMMON_HOSTNAMES.put("alexa", "Amazon Echo");
        COMMON_HOSTNAMES.put("echo", "Amazon Echo");
        COMMON_HOSTNAMES.put("google-home", "Google Home");
        COMMON_HOSTNAMES.put("nest", "Google Nest");
        
        // Computers
        COMMON_HOSTNAMES.put("desktop", "Desktop Computer");
        COMMON_HOSTNAMES.put("laptop", "Laptop");
        COMMON_HOSTNAMES.put("pc", "PC");
        COMMON_HOSTNAMES.put("windows", "Windows PC");
        COMMON_HOSTNAMES.put("linux", "Linux Computer");
    }

    public DeviceNameResolver(Context context) {
        this.context = context.getApplicationContext();
        this.executor = Executors.newFixedThreadPool(10);
        this.macVendorCache = new HashMap<>();
    }

    /**
     * Resolve device name from multiple sources
     */
    public void resolveDeviceName(DeviceInfo device, DeviceNameCallback callback) {
        executor.execute(() -> {
            try {
                String resolvedName = resolveNameInternal(device);
                device.setDeviceName(resolvedName);
                
                if (callback != null) {
                    callback.onNameResolved(device);
                }
            } catch (Exception e) {
                Log.e(TAG, "Error resolving device name", e);
                if (callback != null) {
                    callback.onNameResolved(device);
                }
            }
        });
    }

    private String resolveNameInternal(DeviceInfo device) {
        // Priority 1: Check if hostname contains recognizable pattern
        String hostname = device.getHostname();
        if (hostname != null && !hostname.equals(device.getIpAddress())) {
            String lowerHostname = hostname.toLowerCase();
            
            for (Map.Entry<String, String> entry : COMMON_HOSTNAMES.entrySet()) {
                if (lowerHostname.contains(entry.getKey())) {
                    return entry.getValue();
                }
            }
            
            // Return cleaned hostname
            return cleanHostname(hostname);
        }
        
        // Priority 2: Try to resolve from MAC vendor
        String macAddress = device.getMacAddress();
        if (macAddress != null && !macAddress.equals("Unknown")) {
            String vendor = getVendorFromMac(macAddress);
            if (vendor != null) {
                device.setVendor(vendor);
                return vendor + " Device";
            }
        }
        
        // Priority 3: Try mDNS/Bonjour discovery
        String mdnsName = tryMdnsDiscovery(device.getIpAddress());
        if (mdnsName != null) {
            return mdnsName;
        }
        
        // Priority 4: Try NetBIOS name resolution
        String netbiosName = tryNetBiosResolution(device.getIpAddress());
        if (netbiosName != null) {
            return netbiosName;
        }
        
        // Fallback: Unknown Device
        return "Unknown Device";
    }

    /**
     * Clean hostname for display
     */
    private String cleanHostname(String hostname) {
        if (hostname == null) return "Unknown Device";
        
        // Remove domain suffixes
        hostname = hostname.replaceAll("\\.local$", "");
        hostname = hostname.replaceAll("\\.lan$", "");
        
        // Replace dashes and underscores with spaces
        hostname = hostname.replace("-", " ");
        hostname = hostname.replace("_", " ");
        
        // Capitalize first letter of each word
        String[] words = hostname.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    result.append(word.substring(1).toLowerCase());
                }
                result.append(" ");
            }
        }
        
        return result.toString().trim();
    }

    /**
     * Get vendor from MAC address OUI (first 3 bytes)
     */
    private String getVendorFromMac(String macAddress) {
        if (macAddress == null || macAddress.length() < 8) {
            return null;
        }
        
        // Get OUI (first 3 bytes)
        String oui = macAddress.substring(0, 8).replace(":", "").toUpperCase();
        
        // Check cache first
        if (macVendorCache.containsKey(oui)) {
            return macVendorCache.get(oui);
        }
        
        // Common MAC OUI prefixes (partial list)
        Map<String, String> commonOuis = getCommonOuis();
        String vendor = commonOuis.get(oui);
        
        if (vendor != null) {
            macVendorCache.put(oui, vendor);
            return vendor;
        }
        
        return null;
    }

    /**
     * Common MAC OUI database (partial)
     */
    private Map<String, String> getCommonOuis() {
        Map<String, String> ouis = new HashMap<>();
        
        // Apple
        ouis.put("00:03:93", "Apple");
        ouis.put("00:0A:95", "Apple");
        ouis.put("00:0D:93", "Apple");
        ouis.put("00:17:F2", "Apple");
        ouis.put("00:1B:63", "Apple");
        ouis.put("00:1C:B3", "Apple");
        ouis.put("00:1E:52", "Apple");
        ouis.put("00:1F:5B", "Apple");
        ouis.put("00:1F:F3", "Apple");
        ouis.put("00:21:E9", "Apple");
        ouis.put("00:22:41", "Apple");
        ouis.put("00:23:12", "Apple");
        ouis.put("00:23:32", "Apple");
        ouis.put("00:23:6C", "Apple");
        ouis.put("00:23:DF", "Apple");
        ouis.put("00:24:36", "Apple");
        ouis.put("00:25:00", "Apple");
        ouis.put("00:25:4B", "Apple");
        ouis.put("00:25:BC", "Apple");
        ouis.put("00:26:08", "Apple");
        ouis.put("00:26:4A", "Apple");
        ouis.put("00:26:B0", "Apple");
        ouis.put("00:26:BB", "Apple");
        
        // Samsung
        ouis.put("00:00:F0", "Samsung");
        ouis.put("00:07:AB", "Samsung");
        ouis.put("00:12:47", "Samsung");
        ouis.put("00:12:FB", "Samsung");
        ouis.put("00:13:77", "Samsung");
        ouis.put("00:15:99", "Samsung");
        ouis.put("00:15:B9", "Samsung");
        ouis.put("00:16:32", "Samsung");
        ouis.put("00:16:6B", "Samsung");
        ouis.put("00:16:6C", "Samsung");
        ouis.put("00:17:C9", "Samsung");
        ouis.put("00:17:D5", "Samsung");
        ouis.put("00:18:AF", "Samsung");
        ouis.put("00:1A:8A", "Samsung");
        ouis.put("00:1B:98", "Samsung");
        ouis.put("00:1C:43", "Samsung");
        ouis.put("00:1D:25", "Samsung");
        ouis.put("00:1E:7D", "Samsung");
        ouis.put("00:1E:E1", "Samsung");
        ouis.put("00:1E:E2", "Samsung");
        
        // Xiaomi
        ouis.put("00:9E:C8", "Xiaomi");
        ouis.put("04:33:89", "Xiaomi");
        ouis.put("04:CF:8C", "Xiaomi");
        ouis.put("08:D4:2B", "Xiaomi");
        ouis.put("0C:1D:AF", "Xiaomi");
        ouis.put("10:2A:B3", "Xiaomi");
        ouis.put("14:F6:5A", "Xiaomi");
        ouis.put("18:59:36", "Xiaomi");
        ouis.put("28:6C:07", "Xiaomi");
        ouis.put("34:CE:00", "Xiaomi");
        ouis.put("34:80:B3", "Xiaomi");
        ouis.put("3C:BD:D8", "Xiaomi");
        ouis.put("40:31:3C", "Xiaomi");
        ouis.put("50:8F:4C", "Xiaomi");
        ouis.put("58:44:98", "Xiaomi");
        ouis.put("64:09:80", "Xiaomi");
        ouis.put("64:B4:73", "Xiaomi");
        ouis.put("68:DF:DD", "Xiaomi");
        ouis.put("74:51:BA", "Xiaomi");
        ouis.put("78:02:F8", "Xiaomi");
        
        // Huawei
        ouis.put("00:18:82", "Huawei");
        ouis.put("00:1E:10", "Huawei");
        ouis.put("00:25:9E", "Huawei");
        ouis.put("00:46:4B", "Huawei");
        ouis.put("00:66:4B", "Huawei");
        ouis.put("00:E0:FC", "Huawei");
        ouis.put("04:02:1F", "Huawei");
        ouis.put("08:19:A6", "Huawei");
        ouis.put("0C:37:DC", "Huawei");
        ouis.put("10:C6:1F", "Huawei");
        ouis.put("18:0F:76", "Huawei");
        ouis.put("1C:1D:67", "Huawei");
        ouis.put("20:F3:A3", "Huawei");
        ouis.put("28:6E:D4", "Huawei");
        ouis.put("2C:AB:00", "Huawei");
        ouis.put("34:6B:D3", "Huawei");
        ouis.put("38:BC:01", "Huawei");
        ouis.put("3C:FA:43", "Huawei");
        ouis.put("40:4D:8E", "Huawei");
        ouis.put("48:46:FB", "Huawei");
        
        // TP-Link
        ouis.put("00:27:19", "TP-Link");
        ouis.put("04:95:E6", "TP-Link");
        ouis.put("08:57:00", "TP-Link");
        ouis.put("0C:80:63", "TP-Link");
        ouis.put("10:FE:ED", "TP-Link");
        ouis.put("14:CF:92", "TP-Link");
        ouis.put("18:A6:F7", "TP-Link");
        ouis.put("1C:3B:F3", "TP-Link");
        ouis.put("20:DC:E6", "TP-Link");
        ouis.put("24:A4:3C", "TP-Link");
        ouis.put("28:2C:B2", "TP-Link");
        ouis.put("2C:30:33", "TP-Link");
        ouis.put("30:B5:C2", "TP-Link");
        ouis.put("34:29:8F", "TP-Link");
        ouis.put("38:2C:4A", "TP-Link");
        ouis.put("3C:84:6A", "TP-Link");
        ouis.put("40:16:7E", "TP-Link");
        ouis.put("44:D9:E7", "TP-Link");
        ouis.put("48:5D:36", "TP-Link");
        ouis.put("4C:ED:FB", "TP-Link");
        
        return ouis;
    }

    /**
     * Try mDNS/Bonjour discovery
     */
    private String tryMdnsDiscovery(String ipAddress) {
        try {
            // This would require javax.jmdns library
            // For now, return null
            return null;
        } catch (Exception e) {
            Log.v(TAG, "mDNS discovery failed for " + ipAddress);
            return null;
        }
    }

    /**
     * Try NetBIOS name resolution
     */
    private String tryNetBiosResolution(String ipAddress) {
        try {
            // NetBIOS resolution would require additional implementation
            // For now, return null
            return null;
        } catch (Exception e) {
            Log.v(TAG, "NetBIOS resolution failed for " + ipAddress);
            return null;
        }
    }

    public void shutdown() {
        if (executor != null && !executor.isShutdown()) {
            executor.shutdown();
        }
    }

    public interface DeviceNameCallback {
        void onNameResolved(DeviceInfo device);
    }
}
