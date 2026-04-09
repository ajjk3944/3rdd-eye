package app.thirdeye.scanner;

import android.util.Log;
import android.util.Base64;

import com.getcapacitor.JSArray;
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
 * Router API Service - Directly queries router for connected devices
 * This bypasses AP Isolation by getting data from router's web interface
 * 
 * NOW SUPPORTS:
 * - HTTP Basic Auth (legacy routers: some ASUS, Netgear, Linksys)
 * - Form-based login with session cookies (TP-Link, Cudy, D-Link, Tenda)
 * - Token-based authentication (Xiaomi, Huawei)
 * - LuCI session management (OpenWrt-based routers like Cudy)
 * 
 * Uses RouterAuthenticator for modern authentication methods
 */
public class RouterAPIService {
    private static final String TAG = "RouterAPIService";
    
    private final String routerIP;
    private String username = "admin";
    private String password = "";
    private RouterAuthenticator authenticator;
    
    public RouterAPIService(String routerIP) {
        this.routerIP = routerIP;
    }
    
    public void setCredentials(String username, String password) {
        this.username = username;
        this.password = password;
        // Initialize authenticator with credentials
        this.authenticator = new RouterAuthenticator(routerIP, username, password);
    }
    
    /**
     * Get connected devices from router's web interface
     * Now uses modern authentication methods
     */
    public List<JSObject> getConnectedDevices() {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            // Step 1: Authenticate with router using modern methods
            if (authenticator != null && !authenticator.isSessionValid()) {
                Log.d(TAG, "Authenticating with router...");
                if (!authenticator.authenticate()) {
                    Log.e(TAG, "❌ Router authentication failed - trying fallback methods");
                    // Fall back to old basic auth methods
                    return tryLegacyMethods();
                }
                Log.d(TAG, "✅ Router authentication successful");
            }
            
            // Step 2: Try different router API endpoints with authenticated session
            devices.addAll(tryLuCIDeviceList());
            if (devices.isEmpty()) devices.addAll(tryTPLinkAPI());
            if (devices.isEmpty()) devices.addAll(tryASUSAPI());
            if (devices.isEmpty()) devices.addAll(tryNetgearAPI());
            if (devices.isEmpty()) devices.addAll(tryLinksysAPI());
            if (devices.isEmpty()) devices.addAll(tryDLinkAPI());
            if (devices.isEmpty()) devices.addAll(tryXiaomiAPI());
            if (devices.isEmpty()) devices.addAll(tryHuaweiAPI());
            if (devices.isEmpty()) devices.addAll(tryTendaAPI());
            if (devices.isEmpty()) devices.addAll(tryGenericDHCPAPI());
            
            Log.d(TAG, "Found " + devices.size() + " devices from router API");
            
        } catch (Exception e) {
            Log.e(TAG, "Error getting router devices", e);
        }
        
        return devices;
    }
    
    /**
     * Try legacy basic auth methods as fallback
     */
    private List<JSObject> tryLegacyMethods() {
        List<JSObject> devices = new ArrayList<>();
        devices.addAll(tryTPLinkAPI());
        if (devices.isEmpty()) devices.addAll(tryASUSAPI());
        if (devices.isEmpty()) devices.addAll(tryNetgearAPI());
        if (devices.isEmpty()) devices.addAll(tryLinksysAPI());
        if (devices.isEmpty()) devices.addAll(tryDLinkAPI());
        if (devices.isEmpty()) devices.addAll(tryGenericDHCPAPI());
        return devices;
    }
    
    /**
     * LuCI Device List (OpenWrt-based: Cudy, modern TP-Link, Mercusys)
     * This is the PRIMARY method for Cudy routers
     */
    private List<JSObject> tryLuCIDeviceList() {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            Log.d(TAG, "Trying LuCI device list...");
            
            String[] endpoints = {
                "/cgi-bin/luci/admin/status/overview",
                "/cgi-bin/luci/admin/network/dhcp_leases",
                "/cgi-bin/luci/;stok=/admin/network/dhcp",
                "/cgi-bin/luci/admin/network/wireless",
                "/cgi-bin/luci/rpc/sys?auth=" + (authenticator != null ? authenticator.getAuthToken() : "")
            };
            
            for (String endpoint : endpoints) {
                String response = makeAuthenticatedRequest(endpoint);
                if (response != null && !response.isEmpty()) {
                    devices.addAll(parseLuCIResponse(response));
                    if (!devices.isEmpty()) {
                        Log.d(TAG, "✅ LuCI found " + devices.size() + " devices");
                        break;
                    }
                }
            }
            
        } catch (Exception e) {
            Log.d(TAG, "LuCI API failed: " + e.getMessage());
        }
        
        return devices;
    }
    
    /**
     * Xiaomi Router API (token-based)
     */
    private List<JSObject> tryXiaomiAPI() {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            Log.d(TAG, "Trying Xiaomi device list...");
            
            String endpoint = "/cgi-bin/luci/api/xqsystem/device_list";
            String response = makeAuthenticatedRequest(endpoint);
            
            if (response != null && !response.isEmpty()) {
                devices.addAll(parseXiaomiResponse(response));
                if (!devices.isEmpty()) {
                    Log.d(TAG, "✅ Xiaomi found " + devices.size() + " devices");
                }
            }
            
        } catch (Exception e) {
            Log.d(TAG, "Xiaomi API failed: " + e.getMessage());
        }
        
        return devices;
    }
    
    /**
     * Huawei Router API
     */
    private List<JSObject> tryHuaweiAPI() {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            Log.d(TAG, "Trying Huawei device list...");
            
            String[] endpoints = {
                "/api/device/hosts",
                "/api/device/information",
                "/api/lan/HostInfo"
            };
            
            for (String endpoint : endpoints) {
                String response = makeAuthenticatedRequest(endpoint);
                if (response != null && !response.isEmpty()) {
                    devices.addAll(parseHuaweiResponse(response));
                    if (!devices.isEmpty()) {
                        Log.d(TAG, "✅ Huawei found " + devices.size() + " devices");
                        break;
                    }
                }
            }
            
        } catch (Exception e) {
            Log.d(TAG, "Huawei API failed: " + e.getMessage());
        }
        
        return devices;
    }
    
    /**
     * Tenda Router API
     */
    private List<JSObject> tryTendaAPI() {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            Log.d(TAG, "Trying Tenda device list...");
            
            String endpoint = "/goform/getOnlineList";
            String response = makeAuthenticatedRequest(endpoint);
            
            if (response != null && !response.isEmpty()) {
                devices.addAll(parseTendaResponse(response));
                if (!devices.isEmpty()) {
                    Log.d(TAG, "✅ Tenda found " + devices.size() + " devices");
                }
            }
            
        } catch (Exception e) {
            Log.d(TAG, "Tenda API failed: " + e.getMessage());
        }
        
        return devices;
    }
    
    /**
     * TP-Link Router API
     * Now uses authenticated session
     */
    private List<JSObject> tryTPLinkAPI() {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            // TP-Link DHCP client list with authenticated session
            String[] endpoints = {
                "/userRpm/AssignedIpAddrListRpm.htm",
                "/cgi-bin/luci/admin/status/overview",
                "/webpages/index.html",
                "/cgi-bin/luci/admin/network/dhcp",
                "/cgi-bin/luci/;stok=/admin/status/overview"
            };
            
            for (String endpoint : endpoints) {
                String response = makeAuthenticatedRequest(endpoint);
                if (response != null && !response.isEmpty()) {
                    devices.addAll(parseTPLinkResponse(response));
                    if (!devices.isEmpty()) break;
                }
            }
            
        } catch (Exception e) {
            Log.d(TAG, "TP-Link API failed: " + e.getMessage());
        }
        
        return devices;
    }
    
    /**
     * ASUS Router API
     */
    private List<JSObject> tryASUSAPI() {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            String[] endpoints = {
                "/update_clients.asp",
                "/appGet.cgi?hook=get_clientlist()",
                "/Main_DHCPStatus_Content.asp"
            };
            
            for (String endpoint : endpoints) {
                String response = makeAuthenticatedRequest(endpoint);
                if (response != null && !response.isEmpty()) {
                    devices.addAll(parseASUSResponse(response));
                    if (!devices.isEmpty()) break;
                }
            }
            
        } catch (Exception e) {
            Log.d(TAG, "ASUS API failed: " + e.getMessage());
        }
        
        return devices;
    }
    
    /**
     * Netgear Router API
     */
    private List<JSObject> tryNetgearAPI() {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            String[] endpoints = {
                "/DEV_device_info.htm",
                "/RST_status.htm",
                "/api/v1/attached-devices"
            };
            
            for (String endpoint : endpoints) {
                String response = makeAuthenticatedRequest(endpoint);
                if (response != null && !response.isEmpty()) {
                    devices.addAll(parseNetgearResponse(response));
                    if (!devices.isEmpty()) break;
                }
            }
            
        } catch (Exception e) {
            Log.d(TAG, "Netgear API failed: " + e.getMessage());
        }
        
        return devices;
    }
    
    /**
     * Linksys Router API
     */
    private List<JSObject> tryLinksysAPI() {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            String[] endpoints = {
                "/DHCP.asp",
                "/Status_Lan.asp",
                "/ui/dynamic/client_table.jst"
            };
            
            for (String endpoint : endpoints) {
                String response = makeAuthenticatedRequest(endpoint);
                if (response != null && !response.isEmpty()) {
                    devices.addAll(parseLinksysResponse(response));
                    if (!devices.isEmpty()) break;
                }
            }
            
        } catch (Exception e) {
            Log.d(TAG, "Linksys API failed: " + e.getMessage());
        }
        
        return devices;
    }
    
    /**
     * D-Link Router API
     */
    private List<JSObject> tryDLinkAPI() {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            String[] endpoints = {
                "/st_device.html",
                "/info/st_device.html",
                "/DHCP_clients_table.xml"
            };
            
            for (String endpoint : endpoints) {
                String response = makeAuthenticatedRequest(endpoint);
                if (response != null && !response.isEmpty()) {
                    devices.addAll(parseDLinkResponse(response));
                    if (!devices.isEmpty()) break;
                }
            }
            
        } catch (Exception e) {
            Log.d(TAG, "D-Link API failed: " + e.getMessage());
        }
        
        return devices;
    }
    
    /**
     * Generic DHCP API attempts
     */
    private List<JSObject> tryGenericDHCPAPI() {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            String[] endpoints = {
                "/dhcp.html",
                "/status.html",
                "/devices.html",
                "/clients.html",
                "/network.html",
                "/lan.html",
                "/dhcp_status.asp",
                "/dhcp_clients.asp",
                "/connected_devices.asp",
                "/device_list.asp"
            };
            
            for (String endpoint : endpoints) {
                String response = makeAuthenticatedRequest(endpoint);
                if (response != null && !response.isEmpty()) {
                    devices.addAll(parseGenericResponse(response));
                    if (!devices.isEmpty()) break;
                }
            }
            
        } catch (Exception e) {
            Log.d(TAG, "Generic API failed: " + e.getMessage());
        }
        
        return devices;
    }
    
    /**
     * Make authenticated HTTP request to router
     * Now uses RouterAuthenticator for session management
     */
    private String makeAuthenticatedRequest(String endpoint) {
        try {
            // Use authenticator if available
            if (authenticator != null && authenticator.isSessionValid()) {
                return authenticator.makeAuthenticatedRequest(endpoint);
            }
            
            // Fallback to basic auth for legacy routers
            String urlString = endpoint.startsWith("http") ? endpoint : "http://" + routerIP + endpoint;
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            
            // Set timeout
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(10000);
            
            // Add basic auth if credentials provided
            if (username != null && !username.isEmpty()) {
                String auth = username + ":" + password;
                String encodedAuth = Base64.encodeToString(auth.getBytes(), Base64.NO_WRAP);
                connection.setRequestProperty("Authorization", "Basic " + encodedAuth);
            }
            
            // Set user agent
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Android; Mobile)");
            connection.setRequestProperty("Accept", "text/html,application/json,*/*");
            
            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                
                while ((line = reader.readLine()) != null) {
                    response.append(line).append("\n");
                }
                reader.close();
                
                return response.toString();
            }
            
        } catch (Exception e) {
            Log.d(TAG, "Request failed for " + endpoint + ": " + e.getMessage());
        }
        
        return null;
    }
    
    /**
     * Parse TP-Link router response
     */
    private List<JSObject> parseTPLinkResponse(String response) {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            // TP-Link patterns
            Pattern[] patterns = {
                Pattern.compile("new\\s+DHCPDynList\\(\"([^\"]+)\",\\s*\"([^\"]+)\",\\s*\"([^\"]+)\""),
                Pattern.compile("(\\d+\\.\\d+\\.\\d+\\.\\d+)\\s+([0-9A-Fa-f:]{17})\\s+([^\\s]+)"),
                Pattern.compile("\"ip\":\"([^\"]+)\",\"mac\":\"([^\"]+)\",\"name\":\"([^\"]+)\"")
            };
            
            for (Pattern pattern : patterns) {
                Matcher matcher = pattern.matcher(response);
                while (matcher.find()) {
                    JSObject device = new JSObject();
                    device.put("ipAddress", matcher.group(1));
                    device.put("macAddress", matcher.group(2));
                    device.put("hostname", matcher.group(3));
                    device.put("source", "Router API");
                    device.put("isOnline", true);
                    device.put("timestamp", System.currentTimeMillis());
                    devices.add(device);
                }
                if (!devices.isEmpty()) break;
            }
            
        } catch (Exception e) {
            Log.e(TAG, "Error parsing TP-Link response", e);
        }
        
        return devices;
    }
    
    /**
     * Parse ASUS router response
     */
    private List<JSObject> parseASUSResponse(String response) {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            // ASUS patterns
            Pattern[] patterns = {
                Pattern.compile("\"([0-9A-Fa-f:]{17})\":\\{[^}]*\"ip\":\"([^\"]+)\"[^}]*\"name\":\"([^\"]+)\""),
                Pattern.compile("(\\d+\\.\\d+\\.\\d+\\.\\d+)\\s+([0-9A-Fa-f:]{17})\\s+([^\\s]+)"),
                Pattern.compile("fromNetworkmapd\\(\"([^\"]+)\\s+([^\"]+)\\s+([^\"]+)\"")
            };
            
            for (Pattern pattern : patterns) {
                Matcher matcher = pattern.matcher(response);
                while (matcher.find()) {
                    JSObject device = new JSObject();
                    if (pattern.pattern().contains("mac")) {
                        device.put("macAddress", matcher.group(1));
                        device.put("ipAddress", matcher.group(2));
                        device.put("hostname", matcher.group(3));
                    } else {
                        device.put("ipAddress", matcher.group(1));
                        device.put("macAddress", matcher.group(2));
                        device.put("hostname", matcher.group(3));
                    }
                    device.put("source", "Router API");
                    device.put("isOnline", true);
                    device.put("timestamp", System.currentTimeMillis());
                    devices.add(device);
                }
                if (!devices.isEmpty()) break;
            }
            
        } catch (Exception e) {
            Log.e(TAG, "Error parsing ASUS response", e);
        }
        
        return devices;
    }
    
    /**
     * Parse Netgear router response
     */
    private List<JSObject> parseNetgearResponse(String response) {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            // Netgear patterns
            Pattern[] patterns = {
                Pattern.compile("(\\d+\\.\\d+\\.\\d+\\.\\d+)\\s+([0-9A-Fa-f:]{17})\\s+([^\\s]+)"),
                Pattern.compile("\"IP\":\"([^\"]+)\",\"MAC\":\"([^\"]+)\",\"Name\":\"([^\"]+)\""),
                Pattern.compile("AttachDevice\\(\"([^\"]+)\",\"([^\"]+)\",\"([^\"]+)\"")
            };
            
            for (Pattern pattern : patterns) {
                Matcher matcher = pattern.matcher(response);
                while (matcher.find()) {
                    JSObject device = new JSObject();
                    device.put("ipAddress", matcher.group(1));
                    device.put("macAddress", matcher.group(2));
                    device.put("hostname", matcher.group(3));
                    device.put("source", "Router API");
                    device.put("isOnline", true);
                    device.put("timestamp", System.currentTimeMillis());
                    devices.add(device);
                }
                if (!devices.isEmpty()) break;
            }
            
        } catch (Exception e) {
            Log.e(TAG, "Error parsing Netgear response", e);
        }
        
        return devices;
    }
    
    /**
     * Parse Linksys router response
     */
    private List<JSObject> parseLinksysResponse(String response) {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            // Linksys patterns
            Pattern[] patterns = {
                Pattern.compile("(\\d+\\.\\d+\\.\\d+\\.\\d+)\\s+([0-9A-Fa-f:]{17})\\s+([^\\s]+)"),
                Pattern.compile("\"ip\":\"([^\"]+)\",\"mac\":\"([^\"]+)\",\"hostname\":\"([^\"]+)\""),
                Pattern.compile("DHCPTable\\[\\d+\\]\\s*=\\s*\"([^\"]+)\\s+([^\"]+)\\s+([^\"]+)\"")
            };
            
            for (Pattern pattern : patterns) {
                Matcher matcher = pattern.matcher(response);
                while (matcher.find()) {
                    JSObject device = new JSObject();
                    device.put("ipAddress", matcher.group(1));
                    device.put("macAddress", matcher.group(2));
                    device.put("hostname", matcher.group(3));
                    device.put("source", "Router API");
                    device.put("isOnline", true);
                    device.put("timestamp", System.currentTimeMillis());
                    devices.add(device);
                }
                if (!devices.isEmpty()) break;
            }
            
        } catch (Exception e) {
            Log.e(TAG, "Error parsing Linksys response", e);
        }
        
        return devices;
    }
    
    /**
     * Parse D-Link router response
     */
    private List<JSObject> parseDLinkResponse(String response) {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            // D-Link patterns
            Pattern[] patterns = {
                Pattern.compile("(\\d+\\.\\d+\\.\\d+\\.\\d+)\\s+([0-9A-Fa-f:]{17})\\s+([^\\s]+)"),
                Pattern.compile("<IP>([^<]+)</IP>\\s*<MAC>([^<]+)</MAC>\\s*<HostName>([^<]+)</HostName>"),
                Pattern.compile("\"ip\":\"([^\"]+)\",\"mac\":\"([^\"]+)\",\"name\":\"([^\"]+)\"")
            };
            
            for (Pattern pattern : patterns) {
                Matcher matcher = pattern.matcher(response);
                while (matcher.find()) {
                    JSObject device = new JSObject();
                    device.put("ipAddress", matcher.group(1));
                    device.put("macAddress", matcher.group(2));
                    device.put("hostname", matcher.group(3));
                    device.put("source", "Router API");
                    device.put("isOnline", true);
                    device.put("timestamp", System.currentTimeMillis());
                    devices.add(device);
                }
                if (!devices.isEmpty()) break;
            }
            
        } catch (Exception e) {
            Log.e(TAG, "Error parsing D-Link response", e);
        }
        
        return devices;
    }
    
    /**
     * Parse generic router response
     */
    private List<JSObject> parseGenericResponse(String response) {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            // Generic IP + MAC patterns
            Pattern[] patterns = {
                // Standard format: IP MAC Hostname
                Pattern.compile("(\\d+\\.\\d+\\.\\d+\\.\\d+)\\s+([0-9A-Fa-f:]{17})\\s+([^\\s\\n\\r]+)"),
                // Table format
                Pattern.compile("<td[^>]*>(\\d+\\.\\d+\\.\\d+\\.\\d+)</td>\\s*<td[^>]*>([0-9A-Fa-f:]{17})</td>\\s*<td[^>]*>([^<]+)</td>"),
                // JSON format
                Pattern.compile("\"ip\"\\s*:\\s*\"([^\"]+)\"[^}]*\"mac\"\\s*:\\s*\"([^\"]+)\"[^}]*\"name\"\\s*:\\s*\"([^\"]+)\""),
                // JavaScript array format
                Pattern.compile("\\[\\s*\"([^\"]+)\"\\s*,\\s*\"([^\"]+)\"\\s*,\\s*\"([^\"]+)\"\\s*\\]")
            };
            
            for (Pattern pattern : patterns) {
                Matcher matcher = pattern.matcher(response);
                while (matcher.find()) {
                    String ip = matcher.group(1);
                    String mac = matcher.group(2);
                    String hostname = matcher.group(3);
                    
                    // Validate IP format
                    if (ip.matches("\\d+\\.\\d+\\.\\d+\\.\\d+") && 
                        mac.matches("[0-9A-Fa-f:]{17}")) {
                        
                        JSObject device = new JSObject();
                        device.put("ipAddress", ip);
                        device.put("macAddress", mac);
                        device.put("hostname", hostname.trim());
                        device.put("source", "Router API");
                        device.put("isOnline", true);
                        device.put("timestamp", System.currentTimeMillis());
                        
                        // Note: Most routers don't expose per-device bandwidth in basic APIs
                        // Advanced routers (ASUS, some TP-Link models) may provide this data
                        // For now, set to 0 - can be enhanced per router model
                        device.put("bytesUploaded", 0);
                        device.put("bytesDownloaded", 0);
                        
                        devices.add(device);
                    }
                }
                if (!devices.isEmpty()) break;
            }
            
        } catch (Exception e) {
            Log.e(TAG, "Error parsing generic response", e);
        }
        
        return devices;
    }
    
    /**
     * Parse LuCI (OpenWrt) response - PRIMARY for Cudy routers
     */
    private List<JSObject> parseLuCIResponse(String response) {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            // LuCI JSON format
            Pattern jsonPattern = Pattern.compile("\"([0-9A-Fa-f:]{17})\"\\s*:\\s*\\{[^}]*\"ipaddr\"\\s*:\\s*\"([^\"]+)\"[^}]*\"hostname\"\\s*:\\s*\"([^\"]+)\"");
            Matcher matcher = jsonPattern.matcher(response);
            
            while (matcher.find()) {
                JSObject device = new JSObject();
                device.put("macAddress", matcher.group(1));
                device.put("ipAddress", matcher.group(2));
                device.put("hostname", matcher.group(3));
                device.put("source", "Router API (LuCI)");
                device.put("isOnline", true);
                device.put("timestamp", System.currentTimeMillis());
                devices.add(device);
            }
            
            // Alternative LuCI format
            if (devices.isEmpty()) {
                Pattern altPattern = Pattern.compile("(\\d+\\.\\d+\\.\\d+\\.\\d+)\\s+([0-9A-Fa-f:]{17})\\s+([^\\s\\n]+)");
                matcher = altPattern.matcher(response);
                
                while (matcher.find()) {
                    JSObject device = new JSObject();
                    device.put("ipAddress", matcher.group(1));
                    device.put("macAddress", matcher.group(2));
                    device.put("hostname", matcher.group(3));
                    device.put("source", "Router API (LuCI)");
                    device.put("isOnline", true);
                    device.put("timestamp", System.currentTimeMillis());
                    devices.add(device);
                }
            }
            
        } catch (Exception e) {
            Log.e(TAG, "Error parsing LuCI response", e);
        }
        
        return devices;
    }
    
    /**
     * Parse Xiaomi router response
     */
    private List<JSObject> parseXiaomiResponse(String response) {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            // Xiaomi JSON format
            Pattern pattern = Pattern.compile("\"mac\"\\s*:\\s*\"([^\"]+)\"[^}]*\"ip\"\\s*:\\s*\"([^\"]+)\"[^}]*\"name\"\\s*:\\s*\"([^\"]+)\"");
            Matcher matcher = pattern.matcher(response);
            
            while (matcher.find()) {
                JSObject device = new JSObject();
                device.put("macAddress", matcher.group(1));
                device.put("ipAddress", matcher.group(2));
                device.put("hostname", matcher.group(3));
                device.put("source", "Router API (Xiaomi)");
                device.put("isOnline", true);
                device.put("timestamp", System.currentTimeMillis());
                devices.add(device);
            }
            
        } catch (Exception e) {
            Log.e(TAG, "Error parsing Xiaomi response", e);
        }
        
        return devices;
    }
    
    /**
     * Parse Huawei router response
     */
    private List<JSObject> parseHuaweiResponse(String response) {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            // Huawei XML format
            Pattern pattern = Pattern.compile("<MacAddress>([^<]+)</MacAddress>\\s*<IpAddress>([^<]+)</IpAddress>\\s*<HostName>([^<]+)</HostName>");
            Matcher matcher = pattern.matcher(response);
            
            while (matcher.find()) {
                JSObject device = new JSObject();
                device.put("macAddress", matcher.group(1));
                device.put("ipAddress", matcher.group(2));
                device.put("hostname", matcher.group(3));
                device.put("source", "Router API (Huawei)");
                device.put("isOnline", true);
                device.put("timestamp", System.currentTimeMillis());
                devices.add(device);
            }
            
        } catch (Exception e) {
            Log.e(TAG, "Error parsing Huawei response", e);
        }
        
        return devices;
    }
    
    /**
     * Parse Tenda router response
     */
    private List<JSObject> parseTendaResponse(String response) {
        List<JSObject> devices = new ArrayList<>();
        
        try {
            // Tenda JSON format
            Pattern pattern = Pattern.compile("\"mac\"\\s*:\\s*\"([^\"]+)\"[^}]*\"ip\"\\s*:\\s*\"([^\"]+)\"[^}]*\"hostname\"\\s*:\\s*\"([^\"]+)\"");
            Matcher matcher = pattern.matcher(response);
            
            while (matcher.find()) {
                JSObject device = new JSObject();
                device.put("macAddress", matcher.group(1));
                device.put("ipAddress", matcher.group(2));
                device.put("hostname", matcher.group(3));
                device.put("source", "Router API (Tenda)");
                device.put("isOnline", true);
                device.put("timestamp", System.currentTimeMillis());
                devices.add(device);
            }
            
        } catch (Exception e) {
            Log.e(TAG, "Error parsing Tenda response", e);
        }
        
        return devices;
    }
}
