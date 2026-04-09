package app.thirdeye.scanner.routerguard;

import android.util.Log;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class RouterDeviceFetcher {
    private static final String TAG = "RouterDeviceFetcher";
    private static final int CONNECT_TIMEOUT_MS = 10000;
    private static final int READ_TIMEOUT_MS = 15000;
    
    // Regex patterns
    private static final Pattern MAC_PATTERN = Pattern.compile("([0-9A-Fa-f]{2}[:-]){5}[0-9A-Fa-f]{2}");
    private static final Pattern IP_PATTERN = Pattern.compile("(\\d{1,3}\\.){3}\\d{1,3}");
    
    public static class RouterDevice {
        public String macAddress;
        public String ipAddress;
        public String hostname;
        public String connectionType;
        public boolean isActive;
        
        public RouterDevice(String mac, String ip, String hostname) {
            this.macAddress = normalizeMac(mac);
            this.ipAddress = ip;
            this.hostname = hostname != null ? hostname : "";
            this.connectionType = "unknown";
            this.isActive = true;
        }
    }
    
    public static class FetchResult {
        public boolean success;
        public List<RouterDevice> devices;
        public String error;
        public String method;
        
        public FetchResult(boolean success, List<RouterDevice> devices, String method) {
            this.success = success;
            this.devices = devices != null ? devices : new ArrayList<>();
            this.method = method;
        }
        
        public FetchResult(boolean success, String error) {
            this.success = success;
            this.error = error;
            this.devices = new ArrayList<>();
        }
    }
    
    public FetchResult fetchDevices(String routerIp, String username, String password, String brand) {
        // Initialize cookie manager for session handling
        CookieManager cookieManager = new CookieManager();
        CookieHandler.setDefault(cookieManager);
        
        // Setup SSL to accept self-signed certificates for local network
        setupSSLForLocalNetwork();
        
        // Try strategies based on brand
        FetchResult result = null;
        
        if (brand != null && !brand.isEmpty()) {
            String brandLower = brand.toLowerCase();
            
            // Try LuCI/OpenWrt first for Cudy and OpenWrt routers
            if (brandLower.contains("cudy") || brandLower.contains("openwrt") || brandLower.contains("luci")) {
                result = tryLuCIOpenWrt(routerIp, password);
                if (result.success) return result;
            } else if (brandLower.contains("tp-link") || brandLower.contains("tplink")) {
                result = tryTPLinkAPI(routerIp, username, password);
                if (result.success) return result;
            } else if (brandLower.contains("asus")) {
                result = tryASUSAPI(routerIp, username, password);
                if (result.success) return result;
            } else if (brandLower.contains("netgear")) {
                result = tryNetgearAPI(routerIp, username, password);
                if (result.success) return result;
            }
        }
        
        // Try LuCI/OpenWrt anyway (many routers use it)
        result = tryLuCIOpenWrt(routerIp, password);
        if (result.success) return result;
        
        // Try generic strategies
        result = tryBasicAuthScrape(routerIp, username, password);
        if (result.success) return result;
        
        result = tryFormLogin(routerIp, username, password);
        if (result.success) return result;
        
        // ALWAYS try ARP scan as final fallback (no credentials needed)
        result = tryARPScan(routerIp);
        if (result.success) return result;
        
        return new FetchResult(false, "Could not connect to router. Please check credentials and router IP.");
    }
    
    // ====== STRATEGY A: TP-Link API ======
    private FetchResult tryTPLinkAPI(String routerIp, String username, String password) {
        try {
            // Try newer TP-Link API
            String loginUrl = "http://" + routerIp + "/cgi-bin/luci/;stok=/login?form=login";
            String loginBody = "username=" + username + "&password=" + password;
            
            HttpResponse loginResp = doPost(loginUrl, loginBody, new HashMap<>());
            if (loginResp.code == 200 && loginResp.body.contains("stok")) {
                // Extract token
                Pattern tokenPattern = Pattern.compile("\"stok\":\"([^\"]+)\"");
                Matcher matcher = tokenPattern.matcher(loginResp.body);
                if (matcher.find()) {
                    String token = matcher.group(1);
                    String devicesUrl = "http://" + routerIp + "/cgi-bin/luci/;stok=" + token + "/admin/status?form=all";
                    HttpResponse devicesResp = doGet(devicesUrl, new HashMap<>());
                    if (devicesResp.code == 200) {
                        List<RouterDevice> devices = parseJSONDevices(devicesResp.body);
                        if (!devices.isEmpty()) {
                            return new FetchResult(true, devices, "TP-Link API");
                        }
                    }
                }
            }
            
            // Try older TP-Link interface
            String oldUrl = "http://" + routerIp + "/userRpm/AssignedIpAddrListRpm.htm";
            Map<String, String> headers = new HashMap<>();
            headers.put("Authorization", "Basic " + Base64.getEncoder().encodeToString((username + ":" + password).getBytes()));
            HttpResponse resp = doGet(oldUrl, headers);
            if (resp.code == 200) {
                List<RouterDevice> devices = parseHTMLForDevices(resp.body, routerIp);
                if (!devices.isEmpty()) {
                    return new FetchResult(true, devices, "TP-Link Basic Auth");
                }
            }
        } catch (Exception e) {
            Log.d(TAG, "TP-Link API failed: " + e.getMessage());
        }
        return new FetchResult(false, "TP-Link API failed");
    }
    
    // ====== STRATEGY A2: LuCI/OpenWrt (Cudy, OpenWrt routers) ======
    private FetchResult tryLuCIOpenWrt(String routerIp, String password) {
        try {
            Log.d(TAG, "Trying LuCI/OpenWrt authentication...");
            
            // Step 1: Login to LuCI with username=root (LuCI standard)
            String loginUrl = "http://" + routerIp + "/cgi-bin/luci";
            String loginBody = "luci_username=root&luci_password=" + java.net.URLEncoder.encode(password, "UTF-8");
            
            HttpURLConnection conn = (HttpURLConnection) new URL(loginUrl).openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setInstanceFollowRedirects(false); // Don't auto-follow redirect
            conn.setConnectTimeout(CONNECT_TIMEOUT_MS);
            conn.setReadTimeout(READ_TIMEOUT_MS);
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            
            // Write POST body
            java.io.OutputStream os = conn.getOutputStream();
            os.write(loginBody.getBytes("UTF-8"));
            os.close();
            
            // Get response - expect 302 redirect with sysauth cookie
            int responseCode = conn.getResponseCode();
            String setCookie = conn.getHeaderField("Set-Cookie");
            
            Log.d(TAG, "LuCI login response code: " + responseCode);
            
            if (setCookie == null || !setCookie.contains("sysauth")) {
                Log.d(TAG, "LuCI login failed - no sysauth cookie");
                conn.disconnect();
                return new FetchResult(false, "LuCI login failed");
            }
            
            // Extract sysauth cookie value
            String sysauth = "";
            for (String part : setCookie.split(";")) {
                part = part.trim();
                if (part.startsWith("sysauth=")) {
                    sysauth = part;
                    break;
                }
            }
            
            Log.d(TAG, "LuCI login successful, got sysauth cookie");
            conn.disconnect();
            
            // Step 2: Try multiple methods to fetch devices
            List<RouterDevice> devices = new ArrayList<>();
            
            // Method A: Try status JSON API
            devices = tryLuCIStatusJSON(routerIp, sysauth);
            if (!devices.isEmpty()) {
                tryLuCILogout(routerIp, sysauth);
                return new FetchResult(true, devices, "LuCI Status JSON");
            }
            
            // Method B: Try DHCP leases page
            devices = tryLuCIDHCPLeases(routerIp, sysauth);
            if (!devices.isEmpty()) {
                tryLuCILogout(routerIp, sysauth);
                return new FetchResult(true, devices, "LuCI DHCP Leases");
            }
            
            // Method C: Try admin status page
            devices = tryLuCIAdminStatus(routerIp, sysauth);
            if (!devices.isEmpty()) {
                tryLuCILogout(routerIp, sysauth);
                return new FetchResult(true, devices, "LuCI Admin Status");
            }
            
            // Logout
            tryLuCILogout(routerIp, sysauth);
            
            // If LuCI login worked but no devices found, still try ARP as fallback
            Log.d(TAG, "LuCI authenticated but no devices found via web interface");
            
        } catch (Exception e) {
            Log.e(TAG, "LuCI connection error: " + e.getClass().getName() + ": " + e.getMessage(), e);
            return new FetchResult(false, "LuCI error: " + e.getMessage());
        }
        
        return new FetchResult(false, "LuCI connection failed");
    }
    
    private List<RouterDevice> tryLuCIStatusJSON(String routerIp, String sysauth) {
        List<RouterDevice> devices = new ArrayList<>();
        try {
            String url = "http://" + routerIp + "/cgi-bin/luci/?status=1";
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(CONNECT_TIMEOUT_MS);
            conn.setReadTimeout(READ_TIMEOUT_MS);
            conn.setRequestProperty("Cookie", sysauth);
            
            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                StringBuilder response = new StringBuilder();
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }
                }
                
                String body = response.toString();
                devices = parseJSONDevices(body);
                Log.d(TAG, "LuCI Status JSON found " + devices.size() + " devices");
            }
            conn.disconnect();
        } catch (Exception e) {
            Log.d(TAG, "LuCI Status JSON failed: " + e.getMessage());
        }
        return devices;
    }
    
    private List<RouterDevice> tryLuCIDHCPLeases(String routerIp, String sysauth) {
        List<RouterDevice> devices = new ArrayList<>();
        String[] pagesToTry = {
            "/cgi-bin/luci/admin/network/dhcp_leases",
            "/cgi-bin/luci/admin/status/overview",
            "/cgi-bin/luci/admin/network/wireless"
        };
        
        for (String page : pagesToTry) {
            try {
                String url = "http://" + routerIp + page;
                HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
                conn.setRequestMethod("GET");
                conn.setConnectTimeout(CONNECT_TIMEOUT_MS);
                conn.setReadTimeout(READ_TIMEOUT_MS);
                conn.setRequestProperty("Cookie", sysauth);
                
                int responseCode = conn.getResponseCode();
                if (responseCode == 200) {
                    StringBuilder response = new StringBuilder();
                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            response.append(line);
                        }
                    }
                    
                    String body = response.toString();
                    devices = parseHTMLForDevices(body, routerIp);
                    if (!devices.isEmpty()) {
                        Log.d(TAG, "LuCI DHCP page " + page + " found " + devices.size() + " devices");
                        break;
                    }
                }
                conn.disconnect();
            } catch (Exception e) {
                Log.d(TAG, "LuCI DHCP page " + page + " failed: " + e.getMessage());
            }
        }
        return devices;
    }
    
    private List<RouterDevice> tryLuCIAdminStatus(String routerIp, String sysauth) {
        List<RouterDevice> devices = new ArrayList<>();
        try {
            String url = "http://" + routerIp + "/cgi-bin/luci/admin/status";
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(CONNECT_TIMEOUT_MS);
            conn.setReadTimeout(READ_TIMEOUT_MS);
            conn.setRequestProperty("Cookie", sysauth);
            
            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                StringBuilder response = new StringBuilder();
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }
                }
                
                String body = response.toString();
                devices = parseHTMLForDevices(body, routerIp);
                Log.d(TAG, "LuCI Admin Status found " + devices.size() + " devices");
            }
            conn.disconnect();
        } catch (Exception e) {
            Log.d(TAG, "LuCI Admin Status failed: " + e.getMessage());
        }
        return devices;
    }
    
    private void tryLuCILogout(String routerIp, String sysauth) {
        try {
            String url = "http://" + routerIp + "/cgi-bin/luci/admin/logout";
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);
            conn.setRequestProperty("Cookie", sysauth);
            conn.getResponseCode();
            conn.disconnect();
            Log.d(TAG, "LuCI logout successful");
        } catch (Exception e) {
            Log.d(TAG, "LuCI logout failed: " + e.getMessage());
        }
    }
    
    // ====== STRATEGY B: ASUS API ======
    private FetchResult tryASUSAPI(String routerIp, String username, String password) {
        try {
            String loginUrl = "http://" + routerIp + "/login.cgi";
            String credentials = Base64.getEncoder().encodeToString((username + ":" + password).getBytes());
            String loginBody = "login_authorization=" + credentials;
            
            HttpResponse loginResp = doPost(loginUrl, loginBody, new HashMap<>());
            if (loginResp.code == 200) {
                // Try to get client list
                String clientsUrl = "http://" + routerIp + "/update_clients.asp";
                HttpResponse clientsResp = doGet(clientsUrl, new HashMap<>());
                if (clientsResp.code == 200) {
                    List<RouterDevice> devices = parseASUSClients(clientsResp.body);
                    if (!devices.isEmpty()) {
                        return new FetchResult(true, devices, "ASUS API");
                    }
                }
            }
        } catch (Exception e) {
            Log.d(TAG, "ASUS API failed: " + e.getMessage());
        }
        return new FetchResult(false, "ASUS API failed");
    }
    
    // ====== STRATEGY C: Netgear SOAP API ======
    private FetchResult tryNetgearAPI(String routerIp, String username, String password) {
        try {
            String soapUrl = "http://" + routerIp + "/soap/server_sa";
            String soapBody = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                "<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\">" +
                "<SOAP-ENV:Body><GetAttachDevice></GetAttachDevice></SOAP-ENV:Body>" +
                "</SOAP-ENV:Envelope>";
            
            Map<String, String> headers = new HashMap<>();
            headers.put("Authorization", "Basic " + Base64.getEncoder().encodeToString((username + ":" + password).getBytes()));
            headers.put("SOAPAction", "urn:NETGEAR-ROUTER:service:DeviceInfo:1#GetAttachDevice");
            headers.put("Content-Type", "text/xml");
            
            HttpResponse resp = doPost(soapUrl, soapBody, headers);
            if (resp.code == 200) {
                List<RouterDevice> devices = parseNetgearSOAP(resp.body);
                if (!devices.isEmpty()) {
                    return new FetchResult(true, devices, "Netgear SOAP");
                }
            }
        } catch (Exception e) {
            Log.d(TAG, "Netgear API failed: " + e.getMessage());
        }
        return new FetchResult(false, "Netgear API failed");
    }
    
    // ====== STRATEGY D: HTTP Basic Auth + HTML Scraping ======
    private FetchResult tryBasicAuthScrape(String routerIp, String username, String password) {
        String[] pagesToTry = {
            "/dhcp_clients.html",
            "/Status/lan_clients.htm",
            "/cgi-bin/luci/admin/status/overview",
            "/userRpm/AssignedIpAddrListRpm.htm",
            "/connected_devices.html",
            "/info/dhcp_clients",
            "/DHCPTable.asp",
            "/arp.htm",
            "/status/client_table",
            "/status.htm",
            "/dhcpinfo.html"
        };
        
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Basic " + Base64.getEncoder().encodeToString((username + ":" + password).getBytes()));
        
        for (String page : pagesToTry) {
            try {
                String url = "http://" + routerIp + page;
                HttpResponse resp = doGet(url, headers);
                if (resp.code == 200) {
                    List<RouterDevice> devices = parseHTMLForDevices(resp.body, routerIp);
                    if (!devices.isEmpty()) {
                        return new FetchResult(true, devices, "Basic Auth Scrape");
                    }
                }
            } catch (Exception e) {
                Log.d(TAG, "Basic auth page " + page + " failed: " + e.getMessage());
            }
        }
        
        return new FetchResult(false, "Basic Auth scrape failed");
    }
    
    // ====== STRATEGY E: Form Login + Cookie + Scrape ======
    private FetchResult tryFormLogin(String routerIp, String username, String password) {
        try {
            // Try common login endpoints
            String[] loginUrls = {
                "http://" + routerIp + "/login.cgi",
                "http://" + routerIp + "/cgi-bin/login",
                "http://" + routerIp + "/login.asp"
            };
            
            for (String loginUrl : loginUrls) {
                String loginBody = "username=" + username + "&password=" + password;
                HttpResponse loginResp = doPost(loginUrl, loginBody, new HashMap<>());
                
                if (loginResp.code == 200 || loginResp.code == 302) {
                    // Try to access device pages with session cookie
                    String[] devicePages = {
                        "/status.htm",
                        "/dhcp_clients.html",
                        "/connected_devices.html"
                    };
                    
                    for (String page : devicePages) {
                        HttpResponse resp = doGet("http://" + routerIp + page, new HashMap<>());
                        if (resp.code == 200) {
                            List<RouterDevice> devices = parseHTMLForDevices(resp.body, routerIp);
                            if (!devices.isEmpty()) {
                                return new FetchResult(true, devices, "Form Login");
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            Log.d(TAG, "Form login failed: " + e.getMessage());
        }
        return new FetchResult(false, "Form login failed");
    }
    
    // ====== STRATEGY F: ARP Table Fallback (no credentials) ======
    public FetchResult tryARPScan(String routerIp) {
        List<RouterDevice> devices = new ArrayList<>();
        try {
            Log.d(TAG, "=== Trying ARP table scan (fallback method) ===");
            BufferedReader reader = new BufferedReader(new FileReader("/proc/net/arp"));
            String line;
            reader.readLine(); // Skip header
            
            int lineCount = 0;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                String[] parts = line.trim().split("\\s+");
                if (parts.length >= 4) {
                    String ip = parts[0];
                    String mac = parts[3];
                    
                    // Skip invalid entries
                    if (mac.equals("00:00:00:00:00:00") || ip.equals(routerIp) || ip.equals("0.0.0.0")) {
                        continue;
                    }
                    
                    // Validate MAC format
                    if (MAC_PATTERN.matcher(mac).matches()) {
                        devices.add(new RouterDevice(mac, ip, ""));
                        Log.d(TAG, "ARP found device: " + mac + " -> " + ip);
                    }
                }
            }
            reader.close();
            
            Log.d(TAG, "ARP scan completed: read " + lineCount + " lines, found " + devices.size() + " valid devices");
            
            if (!devices.isEmpty()) {
                return new FetchResult(true, devices, "ARP Scan");
            }
        } catch (Exception e) {
            Log.e(TAG, "ARP scan failed: " + e.getMessage());
        }
        return new FetchResult(false, "ARP scan failed");
    }
    
    // ====== HTML Parser ======
    private List<RouterDevice> parseHTMLForDevices(String html, String routerIp) {
        List<RouterDevice> devices = new ArrayList<>();
        Map<String, String> macToIp = new HashMap<>();
        Map<String, String> macToHostname = new HashMap<>();
        
        // Find all MACs
        Matcher macMatcher = MAC_PATTERN.matcher(html);
        List<String> macs = new ArrayList<>();
        while (macMatcher.find()) {
            String mac = macMatcher.group();
            if (!mac.equals("00:00:00:00:00:00")) {
                macs.add(mac);
            }
        }
        
        // Find all IPs
        Matcher ipMatcher = IP_PATTERN.matcher(html);
        List<String> ips = new ArrayList<>();
        while (ipMatcher.find()) {
            String ip = ipMatcher.group();
            if (!ip.equals(routerIp) && !ip.equals("0.0.0.0") && !ip.equals("255.255.255.255")) {
                ips.add(ip);
            }
        }
        
        // Try to pair MACs with IPs (assume they appear in same order or close proximity)
        int minSize = Math.min(macs.size(), ips.size());
        for (int i = 0; i < minSize; i++) {
            macToIp.put(macs.get(i), ips.get(i));
        }
        
        // Create devices
        for (String mac : macs) {
            String ip = macToIp.getOrDefault(mac, "");
            String hostname = macToHostname.getOrDefault(mac, "");
            devices.add(new RouterDevice(mac, ip, hostname));
        }
        
        return devices;
    }
    
    // ====== JSON Parser (simple) ======
    private List<RouterDevice> parseJSONDevices(String json) {
        List<RouterDevice> devices = new ArrayList<>();
        
        // Simple JSON parsing without external library
        Matcher macMatcher = MAC_PATTERN.matcher(json);
        Matcher ipMatcher = IP_PATTERN.matcher(json);
        
        List<String> macs = new ArrayList<>();
        List<String> ips = new ArrayList<>();
        
        while (macMatcher.find()) {
            macs.add(macMatcher.group());
        }
        while (ipMatcher.find()) {
            ips.add(ipMatcher.group());
        }
        
        int minSize = Math.min(macs.size(), ips.size());
        for (int i = 0; i < minSize; i++) {
            devices.add(new RouterDevice(macs.get(i), ips.get(i), ""));
        }
        
        return devices;
    }
    
    // ====== ASUS Client Parser ======
    private List<RouterDevice> parseASUSClients(String body) {
        List<RouterDevice> devices = new ArrayList<>();
        
        // ASUS format: originData = { "MAC": { "ip": "...", "name": "..." } }
        Matcher macMatcher = MAC_PATTERN.matcher(body);
        Matcher ipMatcher = IP_PATTERN.matcher(body);
        
        List<String> macs = new ArrayList<>();
        List<String> ips = new ArrayList<>();
        
        while (macMatcher.find()) {
            macs.add(macMatcher.group());
        }
        while (ipMatcher.find()) {
            ips.add(ipMatcher.group());
        }
        
        int minSize = Math.min(macs.size(), ips.size());
        for (int i = 0; i < minSize; i++) {
            devices.add(new RouterDevice(macs.get(i), ips.get(i), ""));
        }
        
        return devices;
    }
    
    // ====== Netgear SOAP Parser ======
    private List<RouterDevice> parseNetgearSOAP(String xml) {
        List<RouterDevice> devices = new ArrayList<>();
        
        // Parse XML response for device info
        Matcher macMatcher = MAC_PATTERN.matcher(xml);
        Matcher ipMatcher = IP_PATTERN.matcher(xml);
        
        List<String> macs = new ArrayList<>();
        List<String> ips = new ArrayList<>();
        
        while (macMatcher.find()) {
            macs.add(macMatcher.group());
        }
        while (ipMatcher.find()) {
            ips.add(ipMatcher.group());
        }
        
        int minSize = Math.min(macs.size(), ips.size());
        for (int i = 0; i < minSize; i++) {
            devices.add(new RouterDevice(macs.get(i), ips.get(i), ""));
        }
        
        return devices;
    }
    
    // ====== HTTP Helpers ======
    private static class HttpResponse {
        int code;
        String body;
        
        HttpResponse(int code, String body) {
            this.code = code;
            this.body = body;
        }
    }
    
    private HttpResponse doGet(String urlString, Map<String, String> headers) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(CONNECT_TIMEOUT_MS);
            conn.setReadTimeout(READ_TIMEOUT_MS);
            
            for (Map.Entry<String, String> header : headers.entrySet()) {
                conn.setRequestProperty(header.getKey(), header.getValue());
            }
            
            int responseCode = conn.getResponseCode();
            StringBuilder response = new StringBuilder();
            
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
            } catch (Exception e) {
                // Try error stream
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }
                } catch (Exception ignored) {}
            }
            
            conn.disconnect();
            return new HttpResponse(responseCode, response.toString());
        } catch (Exception e) {
            Log.e(TAG, "GET request failed: " + e.getMessage());
            return new HttpResponse(0, "");
        }
    }
    
    private HttpResponse doPost(String urlString, String body, Map<String, String> headers) {
        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setConnectTimeout(CONNECT_TIMEOUT_MS);
            conn.setReadTimeout(READ_TIMEOUT_MS);
            conn.setDoOutput(true);
            
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            for (Map.Entry<String, String> header : headers.entrySet()) {
                conn.setRequestProperty(header.getKey(), header.getValue());
            }
            
            try (DataOutputStream out = new DataOutputStream(conn.getOutputStream())) {
                out.writeBytes(body);
                out.flush();
            }
            
            int responseCode = conn.getResponseCode();
            StringBuilder response = new StringBuilder();
            
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
            } catch (Exception e) {
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }
                } catch (Exception ignored) {}
            }
            
            conn.disconnect();
            return new HttpResponse(responseCode, response.toString());
        } catch (Exception e) {
            Log.e(TAG, "POST request failed: " + e.getMessage());
            return new HttpResponse(0, "");
        }
    }
    
    // ====== SSL Setup for Self-Signed Certs ======
    private void setupSSLForLocalNetwork() {
        try {
            TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    public X509Certificate[] getAcceptedIssuers() {
                        return new X509Certificate[0];
                    }
                    public void checkClientTrusted(X509Certificate[] certs, String authType) {}
                    public void checkServerTrusted(X509Certificate[] certs, String authType) {}
                }
            };
            
            SSLContext sc = SSLContext.getInstance("TLS");
            sc.init(null, trustAllCerts, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
            
            HostnameVerifier allHostsValid = new HostnameVerifier() {
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            };
            HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
        } catch (Exception e) {
            Log.e(TAG, "SSL setup failed: " + e.getMessage());
        }
    }
    
    // ====== MAC Normalization ======
    private static String normalizeMac(String mac) {
        if (mac == null) return "";
        return mac.toUpperCase().replaceAll("[^A-F0-9]", "")
                .replaceAll("(.{2})", "$1:").replaceAll(":$", "");
    }
}
