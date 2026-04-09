package app.thirdeye.scanner.security;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.util.Log;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import org.json.JSONArray;
import org.json.JSONObject;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

/**
 * SecurityAuditPlugin - Capacitor plugin for network security auditing
 */
@CapacitorPlugin(name = "SecurityAudit")
public class SecurityAuditPlugin extends Plugin {
    private static final String TAG = "SecurityAuditPlugin";
    
    private SecurityChecker securityChecker;
    private JSONObject lastAuditResult = null;
    
    @Override
    public void load() {
        super.load();
        securityChecker = new SecurityChecker(getContext());
    }
    
    /**
     * Run full security audit
     */
    @PluginMethod
    public void runFullAudit(PluginCall call) {
        new Thread(() -> {
            try {
                long startTime = System.currentTimeMillis();
                
                // Get network info
                String ssid = getCurrentSSID();
                String gatewayIp = getGatewayIP();
                
                // Run all security checks
                List<JSONObject> checkResults = new ArrayList<>();
                
                // 1. WiFi Encryption (25%)
                JSONObject wifiCheck = securityChecker.checkWiFiEncryption();
                wifiCheck.put("id", "wifi_encryption");
                wifiCheck.put("name", "WiFi Encryption");
                wifiCheck.put("weight", 25);
                wifiCheck.put("status", getStatus(wifiCheck.getInt("score"), 25));
                wifiCheck.put("value", wifiCheck.getString("type"));
                checkResults.add(wifiCheck);
                
                // 2. Router Open Ports (20%)
                JSONObject portsCheck = securityChecker.checkRouterPorts(gatewayIp);
                portsCheck.put("id", "open_ports");
                portsCheck.put("name", "Router Open Ports");
                portsCheck.put("weight", 20);
                portsCheck.put("status", getStatus(portsCheck.getInt("score"), 20));
                JSONArray openPorts = portsCheck.optJSONArray("openPorts");
                portsCheck.put("value", openPorts != null ? openPorts.length() + " ports" : "Unknown");
                checkResults.add(portsCheck);
                
                // 3. DNS Security (15%)
                JSONObject dnsCheck = securityChecker.checkDNSSecurity();
                dnsCheck.put("id", "dns_security");
                dnsCheck.put("name", "DNS Security");
                dnsCheck.put("weight", 15);
                dnsCheck.put("status", getStatus(dnsCheck.getInt("score"), 15));
                JSONArray dnsServers = dnsCheck.optJSONArray("dnsServers");
                dnsCheck.put("value", dnsServers != null && dnsServers.length() > 0 ? 
                    dnsServers.getString(0) : "Unknown");
                checkResults.add(dnsCheck);
                
                // 4. Device Count (10%)
                JSONObject deviceCheck = securityChecker.checkDeviceCount();
                deviceCheck.put("id", "device_count");
                deviceCheck.put("name", "Connected Devices");
                deviceCheck.put("weight", 10);
                deviceCheck.put("status", getStatus(deviceCheck.getInt("score"), 10));
                deviceCheck.put("value", deviceCheck.getInt("count") + " devices");
                checkResults.add(deviceCheck);
                
                // 5. SSID Security (10%)
                JSONObject ssidCheck = securityChecker.checkSSIDSecurity(ssid);
                ssidCheck.put("id", "ssid_security");
                ssidCheck.put("name", "Network Name");
                ssidCheck.put("weight", 10);
                ssidCheck.put("status", getStatus(ssidCheck.getInt("score"), 10));
                ssidCheck.put("value", ssidCheck.getBoolean("isDefault") ? "Default SSID" : "Custom SSID");
                checkResults.add(ssidCheck);
                
                // 6. Router Admin Access (10%)
                JSONObject adminCheck = securityChecker.checkRouterAdminAccess(gatewayIp);
                adminCheck.put("id", "router_admin");
                adminCheck.put("name", "Router Admin Access");
                adminCheck.put("weight", 10);
                adminCheck.put("status", getStatus(adminCheck.getInt("score"), 10));
                boolean httpAccessible = adminCheck.getBoolean("httpAccessible");
                boolean httpsAccessible = adminCheck.getBoolean("httpsAccessible");
                String accessValue = "Not accessible";
                if (httpAccessible && httpsAccessible) accessValue = "HTTP & HTTPS";
                else if (httpsAccessible) accessValue = "HTTPS only";
                else if (httpAccessible) accessValue = "HTTP only";
                adminCheck.put("value", accessValue);
                checkResults.add(adminCheck);
                
                // 7. Gateway Ping (10%)
                JSONObject pingCheck = securityChecker.checkGatewayPing(gatewayIp);
                pingCheck.put("id", "gateway_ping");
                pingCheck.put("name", "Gateway Connectivity");
                pingCheck.put("weight", 10);
                pingCheck.put("status", getStatus(pingCheck.getInt("score"), 10));
                long latency = pingCheck.getLong("latencyMs");
                pingCheck.put("value", latency > 0 ? latency + "ms" : "Unreachable");
                checkResults.add(pingCheck);
                
                // Calculate overall score
                JSONObject scoreResult = SecurityScoreCalculator.calculateScore(checkResults);
                int finalScore = scoreResult.getInt("score");
                String grade = scoreResult.getString("grade");
                
                // Build router info
                JSONObject routerInfo = new JSONObject();
                routerInfo.put("gatewayIp", gatewayIp != null ? gatewayIp : "Unknown");
                routerInfo.put("adminAccessible", adminCheck.getBoolean("httpAccessible") || 
                    adminCheck.getBoolean("httpsAccessible"));
                routerInfo.put("httpAccessible", adminCheck.getBoolean("httpAccessible"));
                routerInfo.put("httpsAccessible", adminCheck.getBoolean("httpsAccessible"));
                routerInfo.put("openPorts", portsCheck.optJSONArray("openPorts"));
                routerInfo.put("manufacturer", "Unknown"); // Could be enhanced with MAC OUI lookup
                
                // Generate recommendations
                JSONArray recommendations = SecurityScoreCalculator.generateRecommendations(
                    checkResults, routerInfo);
                
                // Build final result
                JSONObject result = new JSONObject();
                result.put("score", finalScore);
                result.put("grade", grade);
                result.put("timestamp", System.currentTimeMillis());
                result.put("networkName", ssid != null ? ssid : "Unknown");
                result.put("deviceCount", deviceCheck.getInt("count"));
                
                // Convert checks to JSONArray
                JSONArray checksArray = new JSONArray();
                for (JSONObject check : checkResults) {
                    checksArray.put(check);
                }
                result.put("checks", checksArray);
                result.put("recommendations", recommendations);
                result.put("routerInfo", routerInfo);
                
                long endTime = System.currentTimeMillis();
                Log.d(TAG, "Full audit completed in " + (endTime - startTime) + "ms. Score: " + finalScore);
                
                // Cache result
                lastAuditResult = result;
                
                // Return to frontend
                JSObject response = new JSObject();
                response.put("result", convertToJSObject(result));
                call.resolve(response);
                
            } catch (Exception e) {
                Log.e(TAG, "Error running full audit", e);
                call.reject("Audit failed: " + e.getMessage());
            }
        }).start();
    }
    
    /**
     * Run quick check (lightweight version)
     */
    @PluginMethod
    public void runQuickCheck(PluginCall call) {
        new Thread(() -> {
            try {
                // Quick checks: WiFi encryption + device count only
                JSONObject wifiCheck = securityChecker.checkWiFiEncryption();
                JSONObject deviceCheck = securityChecker.checkDeviceCount();
                
                // Calculate quick score (weighted average)
                int wifiScore = wifiCheck.getInt("score");
                int deviceScore = deviceCheck.getInt("count") <= 10 ? 10 : 5;
                int quickScore = (wifiScore * 70 + deviceScore * 30) / 100;
                
                String grade = quickScore >= 80 ? "A" : quickScore >= 60 ? "B" : 
                              quickScore >= 40 ? "C" : "D";
                
                // Count critical issues (simplified)
                int criticalIssues = 0;
                if (wifiScore < 15) criticalIssues++;
                if (deviceCheck.getInt("count") > 20) criticalIssues++;
                
                JSONObject result = new JSONObject();
                result.put("score", quickScore);
                result.put("grade", grade);
                result.put("encryptionType", wifiCheck.getString("type"));
                result.put("deviceCount", deviceCheck.getInt("count"));
                result.put("criticalIssues", criticalIssues);
                
                JSObject response = new JSObject();
                response.put("result", convertToJSObject(result));
                call.resolve(response);
                
            } catch (Exception e) {
                Log.e(TAG, "Error running quick check", e);
                call.reject("Quick check failed: " + e.getMessage());
            }
        }).start();
    }
    
    /**
     * Get security tips
     */
    @PluginMethod
    public void getSecurityTips(PluginCall call) {
        try {
            JSONArray tips = SecurityTipsProvider.getSecurityTips(lastAuditResult);
            
            JSObject response = new JSObject();
            response.put("tips", convertToJSArray(tips));
            call.resolve(response);
            
        } catch (Exception e) {
            Log.e(TAG, "Error getting security tips", e);
            call.reject("Failed to get tips: " + e.getMessage());
        }
    }
    
    /**
     * Get last audit result (cached)
     */
    @PluginMethod
    public void getLastAuditResult(PluginCall call) {
        try {
            JSObject response = new JSObject();
            if (lastAuditResult != null) {
                response.put("result", convertToJSObject(lastAuditResult));
            } else {
                response.put("result", JSObject.NULL);
            }
            call.resolve(response);
            
        } catch (Exception e) {
            Log.e(TAG, "Error getting last audit result", e);
            call.reject("Failed to get last result: " + e.getMessage());
        }
    }
    
    /**
     * Open router admin page in browser
     */
    @PluginMethod
    public void openRouterAdmin(PluginCall call) {
        try {
            String gatewayIp = getGatewayIP();
            
            if (gatewayIp == null || gatewayIp.isEmpty()) {
                call.reject("Gateway IP not available");
                return;
            }
            
            // Try HTTPS first, fallback to HTTP
            String url = "http://" + gatewayIp;
            
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            
            getContext().startActivity(intent);
            
            JSObject response = new JSObject();
            response.put("success", true);
            call.resolve(response);
            
        } catch (Exception e) {
            Log.e(TAG, "Error opening router admin", e);
            call.reject("Failed to open router admin: " + e.getMessage());
        }
    }
    
    // Helper methods
    
    private String getStatus(int score, int maxScore) {
        double percentage = (double) score / maxScore;
        if (percentage >= 0.8) return "pass";
        if (percentage >= 0.5) return "warn";
        return "fail";
    }
    
    private String getCurrentSSID() {
        try {
            WifiManager wifiManager = (WifiManager) getContext().getApplicationContext()
                .getSystemService(Context.WIFI_SERVICE);
            
            if (wifiManager != null && wifiManager.isWifiEnabled()) {
                WifiInfo wifiInfo = wifiManager.getConnectionInfo();
                if (wifiInfo != null) {
                    String ssid = wifiInfo.getSSID();
                    if (ssid != null) {
                        return ssid.replace("\"", "");
                    }
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "Error getting SSID", e);
        }
        return null;
    }
    
    private String getGatewayIP() {
        try {
            // Method 1: Try to get from DHCP info (most reliable for WiFi)
            WifiManager wifiManager = (WifiManager) getContext().getApplicationContext()
                .getSystemService(Context.WIFI_SERVICE);
            if (wifiManager != null) {
                int gatewayInt = wifiManager.getDhcpInfo().gateway;
                if (gatewayInt != 0) {
                    return intToIp(gatewayInt);
                }
            }
            
            // Method 2: Try to get from LinkProperties routes
            ConnectivityManager cm = (ConnectivityManager) getContext()
                .getSystemService(Context.CONNECTIVITY_SERVICE);
            
            if (cm != null) {
                Network network = cm.getActiveNetwork();
                if (network != null) {
                    LinkProperties linkProperties = cm.getLinkProperties(network);
                    if (linkProperties != null) {
                        // Get routes and find gateway
                        for (android.net.RouteInfo route : linkProperties.getRoutes()) {
                            if (route.getGateway() != null && !route.getGateway().isAnyLocalAddress()) {
                                return route.getGateway().getHostAddress();
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "Error getting gateway IP", e);
        }
        return null;
    }
    
    private String intToIp(int ip) {
        return String.format("%d.%d.%d.%d",
            (ip & 0xff),
            (ip >> 8 & 0xff),
            (ip >> 16 & 0xff),
            (ip >> 24 & 0xff));
    }
    
    private JSObject convertToJSObject(JSONObject json) throws Exception {
        JSObject jsObject = new JSObject();
        
        if (json == null) return jsObject;
        
        JSONArray names = json.names();
        if (names == null) return jsObject;
        
        for (int i = 0; i < names.length(); i++) {
            String key = names.getString(i);
            Object value = json.get(key);
            
            if (value instanceof JSONObject) {
                jsObject.put(key, convertToJSObject((JSONObject) value));
            } else if (value instanceof JSONArray) {
                jsObject.put(key, convertToJSArray((JSONArray) value));
            } else {
                jsObject.put(key, value);
            }
        }
        
        return jsObject;
    }
    
    private JSArray convertToJSArray(JSONArray jsonArray) throws Exception {
        JSArray jsArray = new JSArray();
        
        if (jsonArray == null) return jsArray;
        
        for (int i = 0; i < jsonArray.length(); i++) {
            Object value = jsonArray.get(i);
            
            if (value instanceof JSONObject) {
                jsArray.put(convertToJSObject((JSONObject) value));
            } else if (value instanceof JSONArray) {
                jsArray.put(convertToJSArray((JSONArray) value));
            } else {
                jsArray.put(value);
            }
        }
        
        return jsArray;
    }
}
