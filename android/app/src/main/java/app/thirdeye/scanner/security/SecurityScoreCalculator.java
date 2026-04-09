package app.thirdeye.scanner.security;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * SecurityScoreCalculator - Calculates overall security score and generates recommendations
 */
public class SecurityScoreCalculator {
    private static final String TAG = "SecurityScoreCalculator";
    
    /**
     * Calculate overall security score from individual check results
     * Returns score (0-100) and grade (A+, A, B, C, D, F)
     */
    public static JSONObject calculateScore(List<JSONObject> checkResults) {
        JSONObject result = new JSONObject();
        
        try {
            int totalScore = 0;
            int totalWeight = 0;
            
            for (JSONObject check : checkResults) {
                if (check.has("score") && check.has("weight")) {
                    int score = check.getInt("score");
                    int weight = check.getInt("weight");
                    totalScore += score;
                    totalWeight += weight;
                }
            }
            
            // Calculate final score (0-100)
            int finalScore = totalWeight > 0 ? (totalScore * 100) / totalWeight : 0;
            
            // Determine grade
            String grade = getGrade(finalScore);
            
            result.put("score", finalScore);
            result.put("grade", grade);
            
        } catch (Exception e) {
            Log.e(TAG, "Error calculating score", e);
            try {
                result.put("score", 0);
                result.put("grade", "F");
            } catch (Exception ignored) {}
        }
        
        return result;
    }
    
    /**
     * Get letter grade based on score
     */
    private static String getGrade(int score) {
        if (score >= 90) return "A+";
        if (score >= 80) return "A";
        if (score >= 70) return "B";
        if (score >= 60) return "C";
        if (score >= 40) return "D";
        return "F";
    }
    
    /**
     * Generate prioritized recommendations based on check results
     */
    public static JSONArray generateRecommendations(List<JSONObject> checkResults, 
                                                     JSONObject routerInfo) {
        JSONArray recommendations = new JSONArray();
        List<JSONObject> recList = new ArrayList<>();
        
        try {
            int recId = 1;
            
            // Analyze each check and generate recommendations
            for (JSONObject check : checkResults) {
                String checkId = check.optString("id", "");
                int score = check.optInt("score", 0);
                int maxScore = check.optInt("weight", 0);
                
                // WiFi Encryption recommendations
                if (checkId.equals("wifi_encryption") && score < 20) {
                    JSONObject rec = new JSONObject();
                    rec.put("id", "rec_" + recId++);
                    rec.put("priority", "HIGH");
                    rec.put("title", "Upgrade WiFi Encryption");
                    rec.put("description", "Your network uses outdated encryption. Upgrade to WPA2 or WPA3 in router settings for better security.");
                    rec.put("category", "wifi");
                    rec.put("actionable", true);
                    rec.put("actionLabel", "Open Router Settings");
                    rec.put("actionType", "open_router");
                    recList.add(rec);
                }
                
                // Open Ports recommendations
                if (checkId.equals("open_ports")) {
                    JSONArray dangerousPorts = check.optJSONArray("dangerousPorts");
                    if (dangerousPorts != null && dangerousPorts.length() > 0) {
                        JSONObject rec = new JSONObject();
                        rec.put("id", "rec_" + recId++);
                        rec.put("priority", "HIGH");
                        rec.put("title", "Close Dangerous Ports");
                        rec.put("description", "Dangerous ports are open on your router: " + 
                            dangerousPorts.toString() + ". These should be closed immediately to prevent unauthorized access.");
                        rec.put("category", "router");
                        rec.put("actionable", true);
                        rec.put("actionLabel", "Open Router Settings");
                        rec.put("actionType", "open_router");
                        recList.add(rec);
                    } else if (score < 15) {
                        JSONObject rec = new JSONObject();
                        rec.put("id", "rec_" + recId++);
                        rec.put("priority", "MEDIUM");
                        rec.put("title", "Review Open Ports");
                        rec.put("description", "Multiple ports are open on your router. Review and close unnecessary ports to reduce attack surface.");
                        rec.put("category", "router");
                        rec.put("actionable", true);
                        rec.put("actionLabel", "Open Router Settings");
                        rec.put("actionType", "open_router");
                        recList.add(rec);
                    }
                }
                
                // DNS Security recommendations
                if (checkId.equals("dns_security") && score < 10) {
                    JSONObject rec = new JSONObject();
                    rec.put("id", "rec_" + recId++);
                    rec.put("priority", "MEDIUM");
                    rec.put("title", "Switch to Secure DNS");
                    rec.put("description", "Change DNS to Cloudflare (1.1.1.1), Google (8.8.8.8), or Quad9 (9.9.9.9) for better privacy and security.");
                    rec.put("category", "dns");
                    rec.put("actionable", false);
                    recList.add(rec);
                }
                
                // Device Count recommendations
                if (checkId.equals("device_count")) {
                    int deviceCount = check.optInt("count", 0);
                    if (deviceCount > 15) {
                        JSONObject rec = new JSONObject();
                        rec.put("id", "rec_" + recId++);
                        rec.put("priority", "MEDIUM");
                        rec.put("title", "Audit Connected Devices");
                        rec.put("description", deviceCount + " devices found on your network. Review and remove unauthorized devices. Consider changing WiFi password if needed.");
                        rec.put("category", "network");
                        rec.put("actionable", false);
                        recList.add(rec);
                    }
                }
                
                // SSID Security recommendations
                if (checkId.equals("ssid_security") && score < 8) {
                    JSONObject rec = new JSONObject();
                    rec.put("id", "rec_" + recId++);
                    rec.put("priority", "HIGH");
                    rec.put("title", "Change Default Router Settings");
                    rec.put("description", "Your SSID suggests default router configuration. Change SSID, admin password, and WiFi password to secure your network.");
                    rec.put("category", "router");
                    rec.put("actionable", true);
                    rec.put("actionLabel", "Open Router Settings");
                    rec.put("actionType", "open_router");
                    recList.add(rec);
                }
                
                // Router Admin Access recommendations
                if (checkId.equals("router_admin") && score < 8) {
                    boolean httpAccessible = check.optBoolean("httpAccessible", false);
                    boolean httpsAccessible = check.optBoolean("httpsAccessible", false);
                    
                    if (httpAccessible && !httpsAccessible) {
                        JSONObject rec = new JSONObject();
                        rec.put("id", "rec_" + recId++);
                        rec.put("priority", "MEDIUM");
                        rec.put("title", "Enable HTTPS for Router Admin");
                        rec.put("description", "Your router admin panel is accessible via HTTP only. Enable HTTPS in router settings for encrypted admin access.");
                        rec.put("category", "router");
                        rec.put("actionable", true);
                        rec.put("actionLabel", "Open Router Settings");
                        rec.put("actionType", "open_router");
                        recList.add(rec);
                    }
                }
                
                // Gateway Ping recommendations
                if (checkId.equals("gateway_ping") && score < 5) {
                    JSONObject rec = new JSONObject();
                    rec.put("id", "rec_" + recId++);
                    rec.put("priority", "LOW");
                    rec.put("title", "Check Network Connectivity");
                    rec.put("description", "High latency or connectivity issues detected. Check router placement, interference, or consider restarting router.");
                    rec.put("category", "network");
                    rec.put("actionable", false);
                    recList.add(rec);
                }
            }
            
            // Sort recommendations by priority
            Collections.sort(recList, new Comparator<JSONObject>() {
                @Override
                public int compare(JSONObject o1, JSONObject o2) {
                    String p1 = o1.optString("priority", "LOW");
                    String p2 = o2.optString("priority", "LOW");
                    return getPriorityValue(p2) - getPriorityValue(p1); // Descending
                }
            });
            
            // Convert to JSONArray
            for (JSONObject rec : recList) {
                recommendations.put(rec);
            }
            
        } catch (Exception e) {
            Log.e(TAG, "Error generating recommendations", e);
        }
        
        return recommendations;
    }
    
    private static int getPriorityValue(String priority) {
        switch (priority) {
            case "HIGH": return 3;
            case "MEDIUM": return 2;
            case "LOW": return 1;
            default: return 0;
        }
    }
}
