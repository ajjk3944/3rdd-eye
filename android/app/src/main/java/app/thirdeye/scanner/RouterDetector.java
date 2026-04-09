package app.thirdeye.scanner;

import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Router Brand Detector
 * Identifies router brand to use specific API endpoints
 */
public class RouterDetector {
    private static final String TAG = "RouterDetector";
    
    public static String detectRouterBrand(String gatewayIP) {
        Log.d(TAG, "Detecting router brand for: " + gatewayIP);
        
        // Method 1: Check HTTP headers and response content
        String brand = checkHTTPFingerprint(gatewayIP);
        if (brand != null) {
            Log.d(TAG, "Detected router brand: " + brand);
            return brand;
        }
        
        // Method 2: Check common router pages
        brand = checkRouterPages(gatewayIP);
        if (brand != null) {
            Log.d(TAG, "Detected router brand: " + brand);
            return brand;
        }
        
        // Method 3: Check MAC address OUI (if available)
        brand = checkMACOUI(gatewayIP);
        if (brand != null) {
            Log.d(TAG, "Detected router brand: " + brand);
            return brand;
        }
        
        Log.d(TAG, "Could not detect router brand - using generic approach");
        return "Generic";
    }
    
    private static String checkHTTPFingerprint(String gatewayIP) {
        try {
            URL url = new URL("http://" + gatewayIP + "/");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(3000);
            conn.setReadTimeout(3000);
            conn.setRequestProperty("User-Agent", "Mozilla/5.0");
            
            // Check response headers
            String server = conn.getHeaderField("Server");
            String wwwAuth = conn.getHeaderField("WWW-Authenticate");
            
            if (server != null) {
                server = server.toLowerCase();
                if (server.contains("tp-link") || server.contains("tplink")) return "TP-Link";
                if (server.contains("asus")) return "ASUS";
                if (server.contains("netgear")) return "Netgear";
                if (server.contains("linksys")) return "Linksys";
                if (server.contains("dlink") || server.contains("d-link")) return "D-Link";
                if (server.contains("buffalo")) return "Buffalo";
                if (server.contains("belkin")) return "Belkin";
            }
            
            if (wwwAuth != null) {
                wwwAuth = wwwAuth.toLowerCase();
                if (wwwAuth.contains("tp-link") || wwwAuth.contains("tplink")) return "TP-Link";
                if (wwwAuth.contains("asus")) return "ASUS";
                if (wwwAuth.contains("netgear")) return "Netgear";
                if (wwwAuth.contains("linksys")) return "Linksys";
                if (wwwAuth.contains("dlink") || wwwAuth.contains("d-link")) return "D-Link";
            }
            
            // Check response content
            if (conn.getResponseCode() == 200) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder content = new StringBuilder();
                String line;
                int lines = 0;
                
                while ((line = reader.readLine()) != null && lines < 50) { // Only read first 50 lines
                    content.append(line.toLowerCase()).append(" ");
                    lines++;
                }
                reader.close();
                
                String contentStr = content.toString();
                if (contentStr.contains("tp-link") || contentStr.contains("tplink")) return "TP-Link";
                if (contentStr.contains("asus")) return "ASUS";
                if (contentStr.contains("netgear")) return "Netgear";
                if (contentStr.contains("linksys")) return "Linksys";
                if (contentStr.contains("dlink") || contentStr.contains("d-link")) return "D-Link";
                if (contentStr.contains("buffalo")) return "Buffalo";
                if (contentStr.contains("belkin")) return "Belkin";
                if (contentStr.contains("xiaomi") || contentStr.contains("mi router")) return "Xiaomi";
                if (contentStr.contains("huawei")) return "Huawei";
                if (contentStr.contains("cisco")) return "Cisco";
            }
            
        } catch (Exception e) {
            // Ignore
        }
        
        return null;
    }
    
    private static String checkRouterPages(String gatewayIP) {
        // Brand-specific page checks
        String[][] brandPages = {
            {"TP-Link", "/userRpm/LoginRpm.htm", "/webpages/login.html"},
            {"ASUS", "/Main_Login.asp", "/index.asp"},
            {"Netgear", "/index.htm", "/RST_status.htm"},
            {"Linksys", "/DHCP.asp", "/Status_Lan.asp"},
            {"D-Link", "/st_device.html", "/info/Login.html"},
            {"Buffalo", "/cgi-bin/cgi", "/buffalo.html"},
            {"Belkin", "/login.stm", "/index.html"}
        };
        
        for (String[] brandPage : brandPages) {
            String brand = brandPage[0];
            for (int i = 1; i < brandPage.length; i++) {
                if (checkPageExists(gatewayIP, brandPage[i])) {
                    return brand;
                }
            }
        }
        
        return null;
    }
    
    private static boolean checkPageExists(String gatewayIP, String page) {
        try {
            URL url = new URL("http://" + gatewayIP + page);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(2000);
            conn.setReadTimeout(2000);
            conn.setRequestMethod("HEAD");
            
            int responseCode = conn.getResponseCode();
            return responseCode == 200 || responseCode == 401; // 401 means auth required but page exists
            
        } catch (Exception e) {
            return false;
        }
    }
    
    private static String checkMACOUI(String gatewayIP) {
        // This would require getting the router's MAC address first
        // For now, return null - could be implemented later
        return null;
    }
    
    /**
     * Get brand-specific device list endpoints
     */
    public static String[] getBrandSpecificEndpoints(String brand) {
        switch (brand.toLowerCase()) {
            case "tp-link":
                return new String[]{
                    "/userRpm/AssignedIpAddrListRpm.htm",
                    "/cgi-bin/luci/admin/status/overview",
                    "/webpages/index.html",
                    "/cgi-bin/luci/admin/network/dhcp"
                };
                
            case "asus":
                return new String[]{
                    "/update_clients.asp",
                    "/appGet.cgi?hook=get_clientlist()",
                    "/Main_DHCPStatus_Content.asp",
                    "/adaptive/js/adaptive.js"
                };
                
            case "netgear":
                return new String[]{
                    "/api/v1/attached-devices",
                    "/DEV_device_info.htm",
                    "/RST_status.htm",
                    "/currentsetting.htm"
                };
                
            case "linksys":
                return new String[]{
                    "/JNAP/",
                    "/ui/dynamic/client_table.jst",
                    "/Status_Lan.asp",
                    "/DHCP.asp"
                };
                
            case "d-link":
                return new String[]{
                    "/st_device.html",
                    "/info/st_device.html",
                    "/DHCP_clients_table.xml",
                    "/status/device_info.xml"
                };
                
            case "buffalo":
                return new String[]{
                    "/cgi-bin/cgi?req=frm&frm=py-db-01.html",
                    "/buffalo/device_list.html"
                };
                
            case "belkin":
                return new String[]{
                    "/cgi-bin/belkin_status.cgi",
                    "/setup.cgi?todo=status_device_list"
                };
                
            case "xiaomi":
                return new String[]{
                    "/cgi-bin/luci/api/misystem/devicelist",
                    "/cgi-bin/luci/web/api/device/list"
                };
                
            case "huawei":
                return new String[]{
                    "/api/system/deviceinfo",
                    "/api/wlan/host-list"
                };
                
            default:
                return new String[]{
                    "/api/devices",
                    "/api/clients",
                    "/dhcp.html",
                    "/status.html",
                    "/devices.html"
                };
        }
    }
    
    /**
     * Get brand-specific default credentials
     */
    public static String[][] getBrandCredentials(String brand) {
        switch (brand.toLowerCase()) {
            case "tp-link":
                return new String[][]{
                    {"admin", "admin"},
                    {"admin", "password"},
                    {"admin", ""},
                    {"admin", "1234"}
                };
                
            case "asus":
                return new String[][]{
                    {"admin", "admin"},
                    {"admin", "password"},
                    {"admin", ""},
                    {"root", "admin"}
                };
                
            case "netgear":
                return new String[][]{
                    {"admin", "password"},
                    {"admin", "admin"},
                    {"admin", ""},
                    {"admin", "1234"}
                };
                
            case "linksys":
                return new String[][]{
                    {"admin", ""},
                    {"admin", "admin"},
                    {"", "admin"},
                    {"admin", "password"}
                };
                
            case "d-link":
                return new String[][]{
                    {"admin", ""},
                    {"admin", "admin"},
                    {"admin", "password"},
                    {"user", ""}
                };
                
            default:
                return new String[][]{
                    {"admin", "admin"},
                    {"admin", "password"},
                    {"admin", ""},
                    {"root", "admin"},
                    {"user", "user"}
                };
        }
    }
}