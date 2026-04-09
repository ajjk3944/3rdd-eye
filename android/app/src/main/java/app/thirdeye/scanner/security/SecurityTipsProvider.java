package app.thirdeye.scanner.security;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * SecurityTipsProvider - Provides static and contextual security tips
 */
public class SecurityTipsProvider {
    private static final String TAG = "SecurityTipsProvider";
    
    /**
     * Get all security tips (static + contextual based on audit results)
     */
    public static JSONArray getSecurityTips(JSONObject auditResult) {
        JSONArray tips = new JSONArray();
        List<JSONObject> tipList = new ArrayList<>();
        
        try {
            int tipId = 1;
            
            // Add contextual tips based on audit results
            if (auditResult != null && auditResult.has("checks")) {
                JSONArray checks = auditResult.getJSONArray("checks");
                
                for (int i = 0; i < checks.length(); i++) {
                    JSONObject check = checks.getJSONObject(i);
                    String checkId = check.optString("id", "");
                    String value = check.optString("value", "");
                    int score = check.optInt("score", 0);
                    
                    // WiFi encryption contextual tip
                    if (checkId.equals("wifi_encryption") && value.equals("WPA2")) {
                        JSONObject tip = new JSONObject();
                        tip.put("id", "ctx_" + tipId++);
                        tip.put("category", "wifi");
                        tip.put("title", "Consider WPA3 Upgrade");
                        tip.put("description", "Your router uses WPA2. Check if a firmware update enables WPA3 for stronger encryption.");
                        tip.put("isContextual", true);
                        tipList.add(tip);
                    }
                    
                    // Device count contextual tip
                    if (checkId.equals("device_count")) {
                        int deviceCount = check.optInt("count", 0);
                        if (deviceCount > 10) {
                            JSONObject tip = new JSONObject();
                            tip.put("id", "ctx_" + tipId++);
                            tip.put("category", "network");
                            tip.put("title", "Review Connected Devices");
                            tip.put("description", "You have " + deviceCount + " devices connected. Use Network Scanner to identify all devices and remove unknown ones.");
                            tip.put("isContextual", true);
                            tipList.add(tip);
                        }
                    }
                    
                    // Open ports contextual tip
                    if (checkId.equals("open_ports") && score < 15) {
                        JSONObject tip = new JSONObject();
                        tip.put("id", "ctx_" + tipId++);
                        tip.put("category", "router");
                        tip.put("title", "Close Unnecessary Ports");
                        tip.put("description", "Multiple ports are open on your router. Close unused ports to reduce security risks.");
                        tip.put("isContextual", true);
                        tipList.add(tip);
                    }
                    
                    // DNS contextual tip
                    if (checkId.equals("dns_security") && score < 10) {
                        JSONObject tip = new JSONObject();
                        tip.put("id", "ctx_" + tipId++);
                        tip.put("category", "privacy");
                        tip.put("title", "Use Private DNS");
                        tip.put("description", "Your current DNS may track your browsing. Switch to Cloudflare (1.1.1.1) or Quad9 (9.9.9.9) for better privacy.");
                        tip.put("isContextual", true);
                        tipList.add(tip);
                    }
                    
                    // Default SSID contextual tip
                    if (checkId.equals("ssid_security") && score < 8) {
                        JSONObject tip = new JSONObject();
                        tip.put("id", "ctx_" + tipId++);
                        tip.put("category", "router");
                        tip.put("title", "Customize Router Settings");
                        tip.put("description", "Your WiFi name suggests default setup. Customize SSID and change default admin password.");
                        tip.put("isContextual", true);
                        tipList.add(tip);
                    }
                }
            }
            
            // Add static tips (always show)
            tipList.addAll(getStaticTips());
            
            // Convert to JSONArray
            for (JSONObject tip : tipList) {
                tips.put(tip);
            }
            
        } catch (Exception e) {
            Log.e(TAG, "Error getting security tips", e);
        }
        
        return tips;
    }
    
    /**
     * Get static security tips (general best practices)
     */
    private static List<JSONObject> getStaticTips() {
        List<JSONObject> tips = new ArrayList<>();
        
        try {
            // Tip 1: Strong WiFi Password
            JSONObject tip1 = new JSONObject();
            tip1.put("id", "static_1");
            tip1.put("category", "password");
            tip1.put("title", "Use Strong WiFi Password");
            tip1.put("description", "At least 12 characters with a mix of uppercase, lowercase, numbers, and symbols.");
            tip1.put("isContextual", false);
            tips.add(tip1);
            
            // Tip 2: Router Firmware Updates
            JSONObject tip2 = new JSONObject();
            tip2.put("id", "static_2");
            tip2.put("category", "router");
            tip2.put("title", "Keep Router Firmware Updated");
            tip2.put("description", "Check manufacturer website monthly for firmware updates to patch security vulnerabilities.");
            tip2.put("isContextual", false);
            tips.add(tip2);
            
            // Tip 3: Disable WPS
            JSONObject tip3 = new JSONObject();
            tip3.put("id", "static_3");
            tip3.put("category", "router");
            tip3.put("title", "Disable WPS");
            tip3.put("description", "WiFi Protected Setup (WPS) has known security vulnerabilities. Disable it in router settings.");
            tip3.put("isContextual", false);
            tips.add(tip3);
            
            // Tip 4: Change Default Admin Password
            JSONObject tip4 = new JSONObject();
            tip4.put("id", "static_4");
            tip4.put("category", "password");
            tip4.put("title", "Change Default Router Admin Password");
            tip4.put("description", "Default passwords are publicly known. Change your router admin password immediately.");
            tip4.put("isContextual", false);
            tips.add(tip4);
            
            // Tip 5: Enable Firewall
            JSONObject tip5 = new JSONObject();
            tip5.put("id", "static_5");
            tip5.put("category", "router");
            tip5.put("title", "Enable Router Firewall");
            tip5.put("description", "Most routers have built-in firewall options. Enable it for additional protection.");
            tip5.put("isContextual", false);
            tips.add(tip5);
            
            // Tip 6: Disable Remote Management
            JSONObject tip6 = new JSONObject();
            tip6.put("id", "static_6");
            tip6.put("category", "router");
            tip6.put("title", "Disable Remote Management");
            tip6.put("description", "Unless you specifically need it, disable remote management to prevent external access to your router.");
            tip6.put("isContextual", false);
            tips.add(tip6);
            
            // Tip 7: Guest Network
            JSONObject tip7 = new JSONObject();
            tip7.put("id", "static_7");
            tip7.put("category", "network");
            tip7.put("title", "Use Guest Network for Visitors");
            tip7.put("description", "Set up a guest network to isolate visitor devices from your main network and personal devices.");
            tip7.put("isContextual", false);
            tips.add(tip7);
            
            // Tip 8: Regular Device Review
            JSONObject tip8 = new JSONObject();
            tip8.put("id", "static_8");
            tip8.put("category", "network");
            tip8.put("title", "Regularly Check Connected Devices");
            tip8.put("description", "Review connected devices weekly and remove unknown devices from your network.");
            tip8.put("isContextual", false);
            tips.add(tip8);
            
            // Tip 9: VPN on Public WiFi
            JSONObject tip9 = new JSONObject();
            tip9.put("id", "static_9");
            tip9.put("category", "privacy");
            tip9.put("title", "Use VPN on Public WiFi");
            tip9.put("description", "Always use a VPN when connecting to public WiFi to encrypt your traffic on untrusted networks.");
            tip9.put("isContextual", false);
            tips.add(tip9);
            
            // Tip 10: MAC Address Filtering
            JSONObject tip10 = new JSONObject();
            tip10.put("id", "static_10");
            tip10.put("category", "network");
            tip10.put("title", "Consider MAC Address Filtering");
            tip10.put("description", "Enable MAC address filtering on your router to allow only known devices to connect.");
            tip10.put("isContextual", false);
            tips.add(tip10);
            
        } catch (Exception e) {
            Log.e(TAG, "Error creating static tips", e);
        }
        
        return tips;
    }
}
