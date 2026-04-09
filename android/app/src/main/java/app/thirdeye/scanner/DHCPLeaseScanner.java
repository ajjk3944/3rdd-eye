package app.thirdeye.scanner;

import android.util.Log;
import com.getcapacitor.JSObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * DHCP Lease Scanner - The REAL way Fing finds all devices
 * Reads router's DHCP lease information
 */
public class DHCPLeaseScanner {
    private static final String TAG = "DHCPLeaseScanner";
    
    /**
     * Scan using multiple methods to find ALL devices
     */
    public static List<JSObject> scanAllMethods(String gatewayIP) {
        List<JSObject> allDevices = new ArrayList<>();
        
        Log.d(TAG, "=== DHCP LEASE SCANNER START ===");
        Log.d(TAG, "Gateway IP: " + gatewayIP);
        
        // Method 1: Try to read router's DHCP page
        Log.d(TAG, "Trying Method 1: Router DHCP Page...");
        List<JSObject> dhcpPageDevices = scanRouterDHCPPage(gatewayIP);
        Log.d(TAG, "Method 1 found: " + dhcpPageDevices.size() + " devices");
        allDevices.addAll(dhcpPageDevices);
        
        // Method 2: Try common router API endpoints
        Log.d(TAG, "Trying Method 2: Router API...");
        List<JSObject> apiDevices = scanRouterAPI(gatewayIP);
        Log.d(TAG, "Method 2 found: " + apiDevices.size() + " devices");
        allDevices.addAll(apiDevices);
        
        // Method 3: Try UPnP IGD (Internet Gateway Device)
        Log.d(TAG, "Trying Method 3: UPnP IGD...");
        List<JSObject> upnpDevices = scanUPnPIGD(gatewayIP);
        Log.d(TAG, "Method 3 found: " + upnpDevices.size() + " devices");
        allDevices.addAll(upnpDevices);
        
        Log.d(TAG, "=== DHCP LEASE SCANNER END ===");
        Log.d(TAG, "Total devices found from all methods: " + allDevices.size());
        
        return allDevices;
    }
    
    /**
     * Method 1: Scan router's DHCP status page
     */
    private static List<JSObject> scanRouterDHCPPage(String gatewayIP) {
        List<JSObject> devices = new ArrayList<>();
        
        // Common DHCP status page URLs
        String[] urls = {
            "http://" + gatewayIP + "/dhcp.html",
            "http://" + gatewayIP + "/dhcpd.html",
            "http://" + gatewayIP + "/dhcp_status.html",
            "http://" + gatewayIP + "/dhcp_clients.html",
            "http://" + gatewayIP + "/status_dhcp.html",
            "http://" + gatewayIP + "/cgi-bin/luci/admin/status/overview",
            "http://" + gatewayIP + "/userRpm/AssignedIpAddrListRpm.htm",
            "http://" + gatewayIP + "/RST_status.htm",
            "http://" + gatewayIP + "/st_device.html",
            "http://" + gatewayIP + "/Status_Lan.asp",
            "http://" + gatewayIP + "/DHCP.asp"
        };
        
        for (String url : urls) {
            try {
                Log.d(TAG, "Trying URL: " + url);
                String content = fetchURL(url, 3000);
                if (content != null && !content.isEmpty()) {
                    Log.d(TAG, "Got response from " + url + " (length: " + content.length() + ")");
                    List<JSObject> foundDevices = parseDevicesFromHTML(content);
                    devices.addAll(foundDevices);
                    if (!devices.isEmpty()) {
                        Log.d(TAG, "SUCCESS! Found " + devices.size() + " devices from " + url);
                        break; // Found devices, no need to try other URLs
                    } else {
                        Log.d(TAG, "No devices parsed from " + url);
                    }
                } else {
                    Log.d(TAG, "No content from " + url);
                }
            } catch (Exception e) {
                Log.d(TAG, "Failed to fetch " + url + ": " + e.getMessage());
            }
        }
        
        return devices;
    }
    
    /**
     * Method 2: Try router API endpoints
     */
    private static List<JSObject> scanRouterAPI(String gatewayIP) {
        List<JSObject> devices = new ArrayList<>();
        
        String[] apiUrls = {
            "http://" + gatewayIP + "/api/devices",
            "http://" + gatewayIP + "/api/clients",
            "http://" + gatewayIP + "/api/dhcp/leases",
            "http://" + gatewayIP + "/api/v1/attached-devices",
            "http://" + gatewayIP + "/data/dhcp.json",
            "http://" + gatewayIP + "/data/devices.json"
        };
        
        for (String url : apiUrls) {
            try {
                String content = fetchURL(url, 3000);
                if (content != null && content.contains("{")) {
                    devices.addAll(parseDevicesFromJSON(content));
                    if (!devices.isEmpty()) {
                        Log.d(TAG, "Found " + devices.size() + " devices from API " + url);
                        break;
                    }
                }
            } catch (Exception e) {
                // Try next URL
            }
        }
        
        return devices;
    }
    
    /**
     * Method 3: UPnP IGD discovery
     */
    private static List<JSObject> scanUPnPIGD(String gatewayIP) {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            // Try to get device list via UPnP
            String url = "http://" + gatewayIP + ":49000/igd.xml";
            String content = fetchURL(url, 3000);
            if (content != null) {
                devices.addAll(parseDevicesFromXML(content));
            }
        } catch (Exception e) {
            Log.d(TAG, "UPnP IGD scan failed: " + e.getMessage());
        }
        
        return devices;
    }
    
    /**
     * Fetch URL content
     */
    private static String fetchURL(String urlString, int timeout) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(timeout);
            conn.setReadTimeout(timeout);
            conn.setRequestProperty("User-Agent", "Mozilla/5.0");
            
            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
                StringBuilder content = new StringBuilder();
                String line;
                
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
                reader.close();
                return content.toString();
            }
        } catch (Exception e) {
            // Ignore
        }
        return null;
    }
    
    /**
     * Parse devices from HTML content
     */
    private static List<JSObject> parseDevicesFromHTML(String html) {
        List<JSObject> devices = new ArrayList<>();
        
        // Pattern 1: IP and MAC in table format
        Pattern pattern1 = Pattern.compile(
            "(\\d+\\.\\d+\\.\\d+\\.\\d+).*?([0-9A-Fa-f]{2}[:-][0-9A-Fa-f]{2}[:-][0-9A-Fa-f]{2}[:-][0-9A-Fa-f]{2}[:-][0-9A-Fa-f]{2}[:-][0-9A-Fa-f]{2})",
            Pattern.DOTALL
        );
        
        // Pattern 2: MAC and IP in reverse order
        Pattern pattern2 = Pattern.compile(
            "([0-9A-Fa-f]{2}[:-][0-9A-Fa-f]{2}[:-][0-9A-Fa-f]{2}[:-][0-9A-Fa-f]{2}[:-][0-9A-Fa-f]{2}[:-][0-9A-Fa-f]{2}).*?(\\d+\\.\\d+\\.\\d+\\.\\d+)",
            Pattern.DOTALL
        );
        
        // Try pattern 1
        Matcher matcher = pattern1.matcher(html);
        while (matcher.find()) {
            String ip = matcher.group(1);
            String mac = matcher.group(2);
            
            if (isValidIP(ip) && isValidMAC(mac)) {
                JSObject device = new JSObject();
                device.put("ipAddress", ip);
                device.put("macAddress", mac.toUpperCase().replace("-", ":"));
                device.put("source", "Router DHCP Page");
                device.put("isOnline", true);
                device.put("timestamp", System.currentTimeMillis());
                devices.add(device);
            }
        }
        
        // If no devices found, try pattern 2
        if (devices.isEmpty()) {
            matcher = pattern2.matcher(html);
            while (matcher.find()) {
                String mac = matcher.group(1);
                String ip = matcher.group(2);
                
                if (isValidIP(ip) && isValidMAC(mac)) {
                    JSObject device = new JSObject();
                    device.put("ipAddress", ip);
                    device.put("macAddress", mac.toUpperCase().replace("-", ":"));
                    device.put("source", "Router DHCP Page");
                    device.put("isOnline", true);
                    device.put("timestamp", System.currentTimeMillis());
                    devices.add(device);
                }
            }
        }
        
        return devices;
    }
    
    /**
     * Parse devices from JSON content
     */
    private static List<JSObject> parseDevicesFromJSON(String json) {
        List<JSObject> devices = new ArrayList<>();
        
        // Simple JSON parsing for IP and MAC
        Pattern ipPattern = Pattern.compile("\"ip\"\\s*:\\s*\"(\\d+\\.\\d+\\.\\d+\\.\\d+)\"");
        Pattern macPattern = Pattern.compile("\"mac\"\\s*:\\s*\"([0-9A-Fa-f:]{17})\"");
        
        Matcher ipMatcher = ipPattern.matcher(json);
        Matcher macMatcher = macPattern.matcher(json);
        
        List<String> ips = new ArrayList<>();
        List<String> macs = new ArrayList<>();
        
        while (ipMatcher.find()) {
            ips.add(ipMatcher.group(1));
        }
        
        while (macMatcher.find()) {
            macs.add(macMatcher.group(1));
        }
        
        // Match IPs with MACs
        int count = Math.min(ips.size(), macs.size());
        for (int i = 0; i < count; i++) {
            JSObject device = new JSObject();
            device.put("ipAddress", ips.get(i));
            device.put("macAddress", macs.get(i).toUpperCase());
            device.put("source", "Router API");
            device.put("isOnline", true);
            device.put("timestamp", System.currentTimeMillis());
            devices.add(device);
        }
        
        return devices;
    }
    
    /**
     * Parse devices from XML content
     */
    private static List<JSObject> parseDevicesFromXML(String xml) {
        List<JSObject> devices = new ArrayList<>();
        
        // Parse XML for device info
        Pattern pattern = Pattern.compile(
            "<device>.*?<ip>(.*?)</ip>.*?<mac>(.*?)</mac>.*?</device>",
            Pattern.DOTALL
        );
        
        Matcher matcher = pattern.matcher(xml);
        while (matcher.find()) {
            String ip = matcher.group(1);
            String mac = matcher.group(2);
            
            if (isValidIP(ip) && isValidMAC(mac)) {
                JSObject device = new JSObject();
                device.put("ipAddress", ip);
                device.put("macAddress", mac.toUpperCase());
                device.put("source", "UPnP IGD");
                device.put("isOnline", true);
                device.put("timestamp", System.currentTimeMillis());
                devices.add(device);
            }
        }
        
        return devices;
    }
    
    /**
     * Validate IP address
     */
    private static boolean isValidIP(String ip) {
        if (ip == null || ip.isEmpty()) return false;
        String[] parts = ip.split("\\.");
        if (parts.length != 4) return false;
        
        try {
            for (String part : parts) {
                int num = Integer.parseInt(part);
                if (num < 0 || num > 255) return false;
            }
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    /**
     * Validate MAC address
     */
    private static boolean isValidMAC(String mac) {
        if (mac == null || mac.isEmpty()) return false;
        return mac.matches("([0-9A-Fa-f]{2}[:-]){5}[0-9A-Fa-f]{2}");
    }
}
