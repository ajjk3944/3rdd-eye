package app.thirdeye.scanner;

import android.util.Log;
import android.util.Base64;
import com.getcapacitor.JSObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Router Bypass Scanner - The ULTIMATE AP Isolation Bypass
 * This scanner ONLY communicates with the router, never with other devices
 * Uses every possible router endpoint and authentication method
 */
public class RouterBypassScanner {
    private static final String TAG = "RouterBypassScanner";
    
    /**
     * Scan using ONLY router communication - bypasses AP Isolation completely
     */
    public static List<JSObject> scanRouterOnly(String gatewayIP) {
        List<JSObject> allDevices = new ArrayList<>();
        
        Log.d(TAG, "=== ROUTER BYPASS SCAN START ===");
        Log.d(TAG, "Target Router: " + gatewayIP);
        Log.d(TAG, "Strategy: ONLY communicate with router, never with devices");
        
        // Step 1: Detect router brand for targeted approach
        String routerBrand = RouterDetector.detectRouterBrand(gatewayIP);
        Log.d(TAG, "Detected router brand: " + routerBrand);
        
        // Step 2: Try brand-specific approach first
        if (!routerBrand.equals("Generic")) {
            Log.d(TAG, "Trying brand-specific approach for: " + routerBrand);
            allDevices.addAll(tryBrandSpecificScan(gatewayIP, routerBrand));
            
            if (!allDevices.isEmpty()) {
                Log.d(TAG, "SUCCESS! Brand-specific scan found " + allDevices.size() + " devices");
                return allDevices;
            }
        }
        
        // Step 3: Fallback to generic methods
        Log.d(TAG, "Brand-specific failed, trying generic methods...");
        
        // Method 1: Try without authentication first
        Log.d(TAG, "Method 1: No Authentication");
        allDevices.addAll(tryNoAuth(gatewayIP));
        if (!allDevices.isEmpty()) return allDevices;
        
        // Method 2: Try common default credentials
        Log.d(TAG, "Method 2: Default Credentials");
        allDevices.addAll(tryDefaultCredentials(gatewayIP));
        if (!allDevices.isEmpty()) return allDevices;
        
        // Method 3: Try router-specific APIs
        Log.d(TAG, "Method 3: Router-Specific APIs");
        allDevices.addAll(tryRouterSpecificAPIs(gatewayIP));
        if (!allDevices.isEmpty()) return allDevices;
        
        // Method 4: Try UPnP/SSDP discovery (router-only)
        Log.d(TAG, "Method 4: UPnP Router Discovery");
        allDevices.addAll(tryUPnPRouterDiscovery(gatewayIP));
        if (!allDevices.isEmpty()) return allDevices;
        
        // Method 5: Try SNMP (if available)
        Log.d(TAG, "Method 5: SNMP Query");
        allDevices.addAll(trySNMPQuery(gatewayIP));
        
        Log.d(TAG, "=== ROUTER BYPASS SCAN END ===");
        Log.d(TAG, "Total devices found: " + allDevices.size());
        
        return allDevices;
    }
    
    /**
     * Try brand-specific scanning approach
     */
    private static List<JSObject> tryBrandSpecificScan(String gatewayIP, String brand) {
        List<JSObject> devices = new ArrayList<>();
        
        String[] endpoints = RouterDetector.getBrandSpecificEndpoints(brand);
        String[][] credentials = RouterDetector.getBrandCredentials(brand);
        
        // Try each credential combination with brand-specific endpoints
        for (String[] cred : credentials) {
            String username = cred[0];
            String password = cred[1];
            
            Log.d(TAG, "Trying " + brand + " credentials: " + username + "/" + password);
            
            for (String endpoint : endpoints) {
                try {
                    String url = "http://" + gatewayIP + endpoint;
                    String response = makeRequest(url, username, password, 8000);
                    
                    if (response != null && !response.isEmpty()) {
                        Log.d(TAG, "Got response from " + brand + " endpoint: " + endpoint);
                        devices.addAll(parseAnyFormat(response, brand + " API"));
                        
                        if (!devices.isEmpty()) {
                            Log.d(TAG, "SUCCESS! " + brand + " endpoint found " + devices.size() + " devices");
                            return devices;
                        }
                    }
                } catch (Exception e) {
                    // Try next endpoint
                }
            }
        }
        
        return devices;
    }
    
    /**
     * Method 1: Try without authentication
     */
    private static List<JSObject> tryNoAuth(String gatewayIP) {
        List<JSObject> devices = new ArrayList<>();
        
        // Common open endpoints that don't require auth
        String[] openEndpoints = {
            "/api/devices",
            "/api/clients", 
            "/api/dhcp/leases",
            "/data/dhcp.json",
            "/data/devices.json",
            "/status.json",
            "/info.json",
            "/dhcp.json",
            "/clients.json",
            "/network.json",
            "/cgi-bin/api.cgi?method=do&login={'username':'','password':''}",
            "/cgi-bin/luci/rpc/sys?auth=",
            "/api/v1/status/dhcp",
            "/api/v1/network/clients",
            "/rest/dhcp/clients",
            "/xmlapi/dhcp",
            "/jsonapi/dhcp"
        };
        
        for (String endpoint : openEndpoints) {
            try {
                String url = "http://" + gatewayIP + endpoint;
                String response = makeRequest(url, null, null, 3000);
                
                if (response != null && !response.isEmpty()) {
                    Log.d(TAG, "Got response from " + endpoint + " (length: " + response.length() + ")");
                    devices.addAll(parseAnyFormat(response, "No Auth"));
                    
                    if (!devices.isEmpty()) {
                        Log.d(TAG, "SUCCESS! Found " + devices.size() + " devices from " + endpoint);
                        break;
                    }
                }
            } catch (Exception e) {
                // Try next endpoint
            }
        }
        
        return devices;
    }
    
    /**
     * Method 2: Try common default credentials
     */
    private static List<JSObject> tryDefaultCredentials(String gatewayIP) {
        List<JSObject> devices = new ArrayList<>();
        
        // Common router credentials
        String[][] credentials = {
            {"admin", "admin"},
            {"admin", "password"},
            {"admin", ""},
            {"admin", "1234"},
            {"admin", "12345"},
            {"root", "admin"},
            {"root", "root"},
            {"user", "user"},
            {"guest", "guest"},
            {"", ""},
            {"admin", "router"},
            {"admin", "wifi"},
            {"admin", "default"}
        };
        
        // Common authenticated endpoints
        String[] authEndpoints = {
            "/userRpm/AssignedIpAddrListRpm.htm",
            "/cgi-bin/luci/admin/status/overview",
            "/update_clients.asp",
            "/appGet.cgi?hook=get_clientlist()",
            "/Main_DHCPStatus_Content.asp",
            "/DEV_device_info.htm",
            "/RST_status.htm",
            "/api/v1/attached-devices",
            "/DHCP.asp",
            "/Status_Lan.asp",
            "/st_device.html",
            "/dhcp_status.asp",
            "/dhcp_clients.asp"
        };
        
        for (String[] cred : credentials) {
            String username = cred[0];
            String password = cred[1];
            
            Log.d(TAG, "Trying credentials: " + username + "/" + password);
            
            for (String endpoint : authEndpoints) {
                try {
                    String url = "http://" + gatewayIP + endpoint;
                    String response = makeRequest(url, username, password, 5000);
                    
                    if (response != null && !response.isEmpty()) {
                        devices.addAll(parseAnyFormat(response, "Auth: " + username));
                        
                        if (!devices.isEmpty()) {
                            Log.d(TAG, "SUCCESS! Found " + devices.size() + " devices with " + username + "/" + password);
                            return devices; // Found working credentials
                        }
                    }
                } catch (Exception e) {
                    // Try next
                }
            }
        }
        
        return devices;
    }
    
    /**
     * Method 3: Try router-specific APIs
     */
    private static List<JSObject> tryRouterSpecificAPIs(String gatewayIP) {
        List<JSObject> devices = new ArrayList<>();
        
        // TP-Link specific
        devices.addAll(tryTPLinkSpecific(gatewayIP));
        if (!devices.isEmpty()) return devices;
        
        // ASUS specific  
        devices.addAll(tryASUSSpecific(gatewayIP));
        if (!devices.isEmpty()) return devices;
        
        // Netgear specific
        devices.addAll(tryNetgearSpecific(gatewayIP));
        if (!devices.isEmpty()) return devices;
        
        // Linksys specific
        devices.addAll(tryLinksysSpecific(gatewayIP));
        if (!devices.isEmpty()) return devices;
        
        // D-Link specific
        devices.addAll(tryDLinkSpecific(gatewayIP));
        
        return devices;
    }
    
    private static List<JSObject> tryTPLinkSpecific(String gatewayIP) {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            // TP-Link login and get token
            String loginUrl = "http://" + gatewayIP + "/cgi-bin/luci/";
            String response = makeRequest(loginUrl, "admin", "admin", 5000);
            
            if (response != null && response.contains("stok=")) {
                // Extract token
                Pattern tokenPattern = Pattern.compile("stok=([^/]+)");
                Matcher matcher = tokenPattern.matcher(response);
                if (matcher.find()) {
                    String token = matcher.group(1);
                    
                    // Use token to get device list
                    String deviceUrl = "http://" + gatewayIP + "/cgi-bin/luci/;stok=" + token + "/admin/status/overview";
                    String deviceResponse = makeRequest(deviceUrl, null, null, 5000);
                    
                    if (deviceResponse != null) {
                        devices.addAll(parseAnyFormat(deviceResponse, "TP-Link API"));
                    }
                }
            }
        } catch (Exception e) {
            Log.d(TAG, "TP-Link specific failed: " + e.getMessage());
        }
        
        return devices;
    }
    
    private static List<JSObject> tryASUSSpecific(String gatewayIP) {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            // ASUS login
            String loginData = "group_id=&action_mode=&action_script=&action_wait=5&current_page=Main_Login.asp&next_page=index.asp&login_authorization=admin:admin";
            String response = makePostRequest("http://" + gatewayIP + "/login.cgi", loginData, 5000);
            
            if (response != null) {
                // Get client list
                String clientUrl = "http://" + gatewayIP + "/update_clients.asp";
                String clientResponse = makeRequest(clientUrl, null, null, 5000);
                
                if (clientResponse != null) {
                    devices.addAll(parseAnyFormat(clientResponse, "ASUS API"));
                }
            }
        } catch (Exception e) {
            Log.d(TAG, "ASUS specific failed: " + e.getMessage());
        }
        
        return devices;
    }
    
    private static List<JSObject> tryNetgearSpecific(String gatewayIP) {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            // Netgear API
            String[] netgearUrls = {
                "http://" + gatewayIP + "/api/v1/attached-devices",
                "http://" + gatewayIP + "/DEV_device_info.htm",
                "http://" + gatewayIP + "/RST_status.htm"
            };
            
            for (String url : netgearUrls) {
                String response = makeRequest(url, "admin", "password", 5000);
                if (response != null) {
                    devices.addAll(parseAnyFormat(response, "Netgear API"));
                    if (!devices.isEmpty()) break;
                }
            }
        } catch (Exception e) {
            Log.d(TAG, "Netgear specific failed: " + e.getMessage());
        }
        
        return devices;
    }
    
    private static List<JSObject> tryLinksysSpecific(String gatewayIP) {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            // Linksys Smart WiFi
            String[] linksysUrls = {
                "http://" + gatewayIP + "/JNAP/",
                "http://" + gatewayIP + "/ui/dynamic/client_table.jst",
                "http://" + gatewayIP + "/Status_Lan.asp"
            };
            
            for (String url : linksysUrls) {
                String response = makeRequest(url, "admin", "", 5000);
                if (response != null) {
                    devices.addAll(parseAnyFormat(response, "Linksys API"));
                    if (!devices.isEmpty()) break;
                }
            }
        } catch (Exception e) {
            Log.d(TAG, "Linksys specific failed: " + e.getMessage());
        }
        
        return devices;
    }
    
    private static List<JSObject> tryDLinkSpecific(String gatewayIP) {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            // D-Link
            String[] dlinkUrls = {
                "http://" + gatewayIP + "/st_device.html",
                "http://" + gatewayIP + "/info/st_device.html",
                "http://" + gatewayIP + "/DHCP_clients_table.xml"
            };
            
            for (String url : dlinkUrls) {
                String response = makeRequest(url, "admin", "", 5000);
                if (response != null) {
                    devices.addAll(parseAnyFormat(response, "D-Link API"));
                    if (!devices.isEmpty()) break;
                }
            }
        } catch (Exception e) {
            Log.d(TAG, "D-Link specific failed: " + e.getMessage());
        }
        
        return devices;
    }
    
    /**
     * Method 4: UPnP Router Discovery
     */
    private static List<JSObject> tryUPnPRouterDiscovery(String gatewayIP) {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            // Try UPnP IGD endpoints
            String[] upnpUrls = {
                "http://" + gatewayIP + ":49000/igd.xml",
                "http://" + gatewayIP + ":5000/rootDesc.xml",
                "http://" + gatewayIP + ":1900/description.xml",
                "http://" + gatewayIP + "/rootDesc.xml",
                "http://" + gatewayIP + "/igd.xml"
            };
            
            for (String url : upnpUrls) {
                String response = makeRequest(url, null, null, 3000);
                if (response != null && response.contains("<device>")) {
                    devices.addAll(parseAnyFormat(response, "UPnP"));
                    if (!devices.isEmpty()) break;
                }
            }
        } catch (Exception e) {
            Log.d(TAG, "UPnP discovery failed: " + e.getMessage());
        }
        
        return devices;
    }
    
    /**
     * Method 5: SNMP Query
     */
    private static List<JSObject> trySNMPQuery(String gatewayIP) {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            // Try SNMP over HTTP (some routers expose this)
            String[] snmpUrls = {
                "http://" + gatewayIP + "/snmp/dhcp",
                "http://" + gatewayIP + "/snmp/clients",
                "http://" + gatewayIP + "/cgi-bin/snmp.cgi"
            };
            
            for (String url : snmpUrls) {
                String response = makeRequest(url, "public", "", 3000);
                if (response != null) {
                    devices.addAll(parseAnyFormat(response, "SNMP"));
                    if (!devices.isEmpty()) break;
                }
            }
        } catch (Exception e) {
            Log.d(TAG, "SNMP query failed: " + e.getMessage());
        }
        
        return devices;
    }
    
    /**
     * Make HTTP request with optional authentication
     */
    private static String makeRequest(String urlString, String username, String password, int timeout) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            
            conn.setConnectTimeout(timeout);
            conn.setReadTimeout(timeout);
            conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Android; Mobile)");
            conn.setRequestProperty("Accept", "text/html,application/json,application/xml,*/*");
            
            // Add authentication if provided
            if (username != null && !username.isEmpty()) {
                String auth = username + ":" + (password != null ? password : "");
                String encodedAuth = Base64.encodeToString(auth.getBytes(), Base64.NO_WRAP);
                conn.setRequestProperty("Authorization", "Basic " + encodedAuth);
            }
            
            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                
                while ((line = reader.readLine()) != null) {
                    response.append(line).append("\n");
                }
                reader.close();
                
                return response.toString();
            }
            
        } catch (Exception e) {
            // Ignore and try next
        }
        
        return null;
    }
    
    /**
     * Make POST request
     */
    private static String makePostRequest(String urlString, String postData, int timeout) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setConnectTimeout(timeout);
            conn.setReadTimeout(timeout);
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Android; Mobile)");
            
            OutputStream os = conn.getOutputStream();
            os.write(postData.getBytes());
            os.flush();
            os.close();
            
            int responseCode = conn.getResponseCode();
            if (responseCode == 200 || responseCode == 302) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                
                while ((line = reader.readLine()) != null) {
                    response.append(line).append("\n");
                }
                reader.close();
                
                return response.toString();
            }
            
        } catch (Exception e) {
            // Ignore
        }
        
        return null;
    }
    
    /**
     * Parse any format (HTML, JSON, XML) for device information
     */
    private static List<JSObject> parseAnyFormat(String content, String source) {
        List<JSObject> devices = new ArrayList<>();
        
        if (content == null || content.isEmpty()) return devices;
        
        // Pattern 1: Standard IP + MAC format
        Pattern pattern1 = Pattern.compile("(\\d+\\.\\d+\\.\\d+\\.\\d+)\\s+([0-9A-Fa-f:]{17})\\s+([^\\s\\n\\r<>\"]+)");
        Matcher matcher1 = pattern1.matcher(content);
        while (matcher1.find()) {
            JSObject device = new JSObject();
            device.put("ipAddress", matcher1.group(1));
            device.put("macAddress", matcher1.group(2));
            device.put("hostname", matcher1.group(3));
            device.put("source", source);
            device.put("isOnline", true);
            device.put("timestamp", System.currentTimeMillis());
            devices.add(device);
        }
        
        // Pattern 2: JSON format
        if (devices.isEmpty()) {
            Pattern ipPattern = Pattern.compile("\"ip\"\\s*:\\s*\"(\\d+\\.\\d+\\.\\d+\\.\\d+)\"");
            Pattern macPattern = Pattern.compile("\"mac\"\\s*:\\s*\"([0-9A-Fa-f:]{17})\"");
            Pattern namePattern = Pattern.compile("\"name\"\\s*:\\s*\"([^\"]+)\"");
            
            Matcher ipMatcher = ipPattern.matcher(content);
            Matcher macMatcher = macPattern.matcher(content);
            Matcher nameMatcher = namePattern.matcher(content);
            
            List<String> ips = new ArrayList<>();
            List<String> macs = new ArrayList<>();
            List<String> names = new ArrayList<>();
            
            while (ipMatcher.find()) ips.add(ipMatcher.group(1));
            while (macMatcher.find()) macs.add(macMatcher.group(1));
            while (nameMatcher.find()) names.add(nameMatcher.group(1));
            
            int count = Math.min(ips.size(), macs.size());
            for (int i = 0; i < count; i++) {
                JSObject device = new JSObject();
                device.put("ipAddress", ips.get(i));
                device.put("macAddress", macs.get(i));
                device.put("hostname", i < names.size() ? names.get(i) : "Unknown");
                device.put("source", source);
                device.put("isOnline", true);
                device.put("timestamp", System.currentTimeMillis());
                devices.add(device);
            }
        }
        
        // Pattern 3: HTML table format
        if (devices.isEmpty()) {
            Pattern tablePattern = Pattern.compile("<td[^>]*>(\\d+\\.\\d+\\.\\d+\\.\\d+)</td>\\s*<td[^>]*>([0-9A-Fa-f:]{17})</td>\\s*<td[^>]*>([^<]+)</td>");
            Matcher tableMatcher = tablePattern.matcher(content);
            while (tableMatcher.find()) {
                JSObject device = new JSObject();
                device.put("ipAddress", tableMatcher.group(1));
                device.put("macAddress", tableMatcher.group(2));
                device.put("hostname", tableMatcher.group(3).trim());
                device.put("source", source);
                device.put("isOnline", true);
                device.put("timestamp", System.currentTimeMillis());
                devices.add(device);
            }
        }
        
        // Pattern 4: XML format
        if (devices.isEmpty()) {
            Pattern xmlPattern = Pattern.compile("<IP>([^<]+)</IP>\\s*<MAC>([^<]+)</MAC>\\s*<HostName>([^<]+)</HostName>");
            Matcher xmlMatcher = xmlPattern.matcher(content);
            while (xmlMatcher.find()) {
                JSObject device = new JSObject();
                device.put("ipAddress", xmlMatcher.group(1));
                device.put("macAddress", xmlMatcher.group(2));
                device.put("hostname", xmlMatcher.group(3));
                device.put("source", source);
                device.put("isOnline", true);
                device.put("timestamp", System.currentTimeMillis());
                devices.add(device);
            }
        }
        
        Log.d(TAG, "Parsed " + devices.size() + " devices from " + source + " (content length: " + content.length() + ")");
        
        return devices;
    }
}