package app.thirdeye.scanner;

import android.util.Log;
import android.util.Base64;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Modern Router Authentication Handler
 * Supports multiple authentication methods:
 * - HTTP Basic Auth (legacy routers)
 * - Form-based login with session cookies (TP-Link, Cudy, D-Link)
 * - Token-based authentication (Xiaomi, Huawei)
 * - LuCI session management (OpenWrt-based routers like Cudy)
 */
public class RouterAuthenticator {
    private static final String TAG = "RouterAuthenticator";
    
    private final String routerIP;
    private String username;
    private String password;
    private String sessionCookie;
    private String authToken;
    private long sessionExpiry = 0;
    
    public RouterAuthenticator(String routerIP, String username, String password) {
        this.routerIP = routerIP;
        this.username = username;
        this.password = password;
    }
    
    /**
     * Authenticate with router using appropriate method
     * Returns true if authentication successful
     */
    public boolean authenticate() {
        Log.d(TAG, "Attempting authentication with router: " + routerIP);
        
        // Try different authentication methods in order of likelihood
        if (authenticateLuCI()) return true;           // OpenWrt/Cudy/TP-Link modern
        if (authenticateTPLink()) return true;         // TP-Link Archer series
        if (authenticateXiaomi()) return true;         // Xiaomi routers
        if (authenticateHuawei()) return true;         // Huawei routers
        if (authenticateTenda()) return true;          // Tenda routers
        if (authenticateASUS()) return true;           // ASUS routers
        if (authenticateNetgear()) return true;        // Netgear routers
        if (authenticateDLink()) return true;          // D-Link routers
        
        Log.w(TAG, "All authentication methods failed");
        return false;
    }
    
    /**
     * LuCI Authentication (OpenWrt-based: Cudy, modern TP-Link, Mercusys)
     * This is the most common for budget routers
     */
    private boolean authenticateLuCI() {
        try {
            Log.d(TAG, "Trying LuCI authentication...");
            
            // Step 1: POST login credentials
            String loginUrl = "http://" + routerIP + "/cgi-bin/luci";
            String postData = "luci_username=" + URLEncoder.encode(username, "UTF-8") +
                            "&luci_password=" + URLEncoder.encode(password, "UTF-8");
            
            HttpURLConnection conn = (HttpURLConnection) new URL(loginUrl).openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(10000);
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("User-Agent", "Mozilla/5.0");
            
            // Send credentials
            OutputStream os = conn.getOutputStream();
            os.write(postData.getBytes());
            os.flush();
            os.close();
            
            int responseCode = conn.getResponseCode();
            
            // Step 2: Extract session cookie
            String cookies = conn.getHeaderField("Set-Cookie");
            if (cookies != null) {
                // Extract sysauth cookie
                Pattern pattern = Pattern.compile("sysauth=([^;]+)");
                Matcher matcher = pattern.matcher(cookies);
                if (matcher.find()) {
                    sessionCookie = "sysauth=" + matcher.group(1);
                    sessionExpiry = System.currentTimeMillis() + (30 * 60 * 1000); // 30 min
                    Log.d(TAG, "✅ LuCI authentication successful");
                    return true;
                }
            }
            
            // Alternative: Check for redirect to admin page (successful login)
            if (responseCode == 302 || responseCode == 200) {
                String location = conn.getHeaderField("Location");
                if (location != null && location.contains("admin")) {
                    if (cookies != null) {
                        sessionCookie = cookies.split(";")[0];
                        sessionExpiry = System.currentTimeMillis() + (30 * 60 * 1000);
                        Log.d(TAG, "✅ LuCI authentication successful (redirect)");
                        return true;
                    }
                }
            }
            
        } catch (Exception e) {
            Log.d(TAG, "LuCI auth failed: " + e.getMessage());
        }
        return false;
    }
    
    /**
     * TP-Link Archer Authentication (newer models)
     */
    private boolean authenticateTPLink() {
        try {
            Log.d(TAG, "Trying TP-Link authentication...");
            
            // TP-Link uses encrypted password with RSA
            // For simplicity, try basic auth first, then form-based
            String loginUrl = "http://" + routerIP + "/cgi-bin/luci/;stok=/login?form=login";
            
            JSONObject loginData = new JSONObject();
            loginData.put("method", "do");
            loginData.put("login", new JSONObject()
                .put("username", username)
                .put("password", password));
            
            HttpURLConnection conn = (HttpURLConnection) new URL(loginUrl).openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(10000);
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("User-Agent", "Mozilla/5.0");
            
            OutputStream os = conn.getOutputStream();
            os.write(loginData.toString().getBytes());
            os.flush();
            os.close();
            
            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();
                
                // Extract stok token
                JSONObject jsonResponse = new JSONObject(response.toString());
                if (jsonResponse.has("data") && jsonResponse.getJSONObject("data").has("stok")) {
                    authToken = jsonResponse.getJSONObject("data").getString("stok");
                    sessionExpiry = System.currentTimeMillis() + (30 * 60 * 1000);
                    Log.d(TAG, "✅ TP-Link authentication successful");
                    return true;
                }
            }
            
        } catch (Exception e) {
            Log.d(TAG, "TP-Link auth failed: " + e.getMessage());
        }
        return false;
    }

    /**
     * Xiaomi Router Authentication (token-based)
     */
    private boolean authenticateXiaomi() {
        try {
            Log.d(TAG, "Trying Xiaomi authentication...");
            
            String loginUrl = "http://" + routerIP + "/cgi-bin/luci/api/xqsystem/login";
            String postData = "username=" + URLEncoder.encode(username, "UTF-8") +
                            "&password=" + URLEncoder.encode(password, "UTF-8") +
                            "&logtype=2&nonce=0_0_0_0";
            
            HttpURLConnection conn = (HttpURLConnection) new URL(loginUrl).openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(10000);
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            
            OutputStream os = conn.getOutputStream();
            os.write(postData.getBytes());
            os.flush();
            os.close();
            
            if (conn.getResponseCode() == 200) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();
                
                JSONObject jsonResponse = new JSONObject(response.toString());
                if (jsonResponse.has("token")) {
                    authToken = jsonResponse.getString("token");
                    sessionExpiry = System.currentTimeMillis() + (30 * 60 * 1000);
                    Log.d(TAG, "✅ Xiaomi authentication successful");
                    return true;
                }
            }
            
        } catch (Exception e) {
            Log.d(TAG, "Xiaomi auth failed: " + e.getMessage());
        }
        return false;
    }
    
    /**
     * Huawei Router Authentication
     */
    private boolean authenticateHuawei() {
        try {
            Log.d(TAG, "Trying Huawei authentication...");
            
            // Huawei uses session-based auth
            String loginUrl = "http://" + routerIP + "/api/user/login";
            
            // Create XML request
            String xmlData = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                           "<request>" +
                           "<Username>" + username + "</Username>" +
                           "<Password>" + Base64.encodeToString(password.getBytes(), Base64.NO_WRAP) + "</Password>" +
                           "<password_type>4</password_type>" +
                           "</request>";
            
            HttpURLConnection conn = (HttpURLConnection) new URL(loginUrl).openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(10000);
            conn.setRequestProperty("Content-Type", "application/xml");
            
            OutputStream os = conn.getOutputStream();
            os.write(xmlData.getBytes());
            os.flush();
            os.close();
            
            if (conn.getResponseCode() == 200) {
                String cookies = conn.getHeaderField("Set-Cookie");
                if (cookies != null) {
                    sessionCookie = cookies.split(";")[0];
                    sessionExpiry = System.currentTimeMillis() + (30 * 60 * 1000);
                    Log.d(TAG, "✅ Huawei authentication successful");
                    return true;
                }
            }
            
        } catch (Exception e) {
            Log.d(TAG, "Huawei auth failed: " + e.getMessage());
        }
        return false;
    }
    
    /**
     * Tenda Router Authentication
     */
    private boolean authenticateTenda() {
        try {
            Log.d(TAG, "Trying Tenda authentication...");
            
            String loginUrl = "http://" + routerIP + "/login/Auth";
            String postData = "username=" + URLEncoder.encode(username, "UTF-8") +
                            "&password=" + URLEncoder.encode(password, "UTF-8");
            
            HttpURLConnection conn = (HttpURLConnection) new URL(loginUrl).openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(10000);
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            
            OutputStream os = conn.getOutputStream();
            os.write(postData.getBytes());
            os.flush();
            os.close();
            
            if (conn.getResponseCode() == 200) {
                String cookies = conn.getHeaderField("Set-Cookie");
                if (cookies != null) {
                    sessionCookie = cookies.split(";")[0];
                    sessionExpiry = System.currentTimeMillis() + (30 * 60 * 1000);
                    Log.d(TAG, "✅ Tenda authentication successful");
                    return true;
                }
            }
            
        } catch (Exception e) {
            Log.d(TAG, "Tenda auth failed: " + e.getMessage());
        }
        return false;
    }
    
    /**
     * ASUS Router Authentication
     */
    private boolean authenticateASUS() {
        try {
            Log.d(TAG, "Trying ASUS authentication...");
            
            String loginUrl = "http://" + routerIP + "/login.cgi";
            String postData = "login_username=" + URLEncoder.encode(username, "UTF-8") +
                            "&login_passwd=" + URLEncoder.encode(password, "UTF-8");
            
            HttpURLConnection conn = (HttpURLConnection) new URL(loginUrl).openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(10000);
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("User-Agent", "asusrouter-Android-DUTUtil-1.0.0.245");
            
            OutputStream os = conn.getOutputStream();
            os.write(postData.getBytes());
            os.flush();
            os.close();
            
            if (conn.getResponseCode() == 200) {
                String cookies = conn.getHeaderField("Set-Cookie");
                if (cookies != null && cookies.contains("asus_token")) {
                    sessionCookie = cookies.split(";")[0];
                    sessionExpiry = System.currentTimeMillis() + (30 * 60 * 1000);
                    Log.d(TAG, "✅ ASUS authentication successful");
                    return true;
                }
            }
            
        } catch (Exception e) {
            Log.d(TAG, "ASUS auth failed: " + e.getMessage());
        }
        return false;
    }
    
    /**
     * Netgear Router Authentication
     */
    private boolean authenticateNetgear() {
        try {
            Log.d(TAG, "Trying Netgear authentication...");
            
            // Netgear uses HTTP Basic Auth but with special headers
            String auth = username + ":" + password;
            String encodedAuth = Base64.encodeToString(auth.getBytes(), Base64.NO_WRAP);
            
            String testUrl = "http://" + routerIP + "/currentsetting.htm";
            HttpURLConnection conn = (HttpURLConnection) new URL(testUrl).openConnection();
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(10000);
            conn.setRequestProperty("Authorization", "Basic " + encodedAuth);
            conn.setRequestProperty("User-Agent", "Mozilla/5.0");
            
            if (conn.getResponseCode() == 200) {
                // Netgear uses Basic Auth, store credentials for later use
                sessionCookie = "Basic " + encodedAuth;
                sessionExpiry = System.currentTimeMillis() + (60 * 60 * 1000); // 1 hour
                Log.d(TAG, "✅ Netgear authentication successful");
                return true;
            }
            
        } catch (Exception e) {
            Log.d(TAG, "Netgear auth failed: " + e.getMessage());
        }
        return false;
    }
    
    /**
     * D-Link Router Authentication
     */
    private boolean authenticateDLink() {
        try {
            Log.d(TAG, "Trying D-Link authentication...");
            
            String loginUrl = "http://" + routerIP + "/login.cgi";
            String postData = "ACTION=login_plaintext&USER=" + URLEncoder.encode(username, "UTF-8") +
                            "&PASS=" + URLEncoder.encode(password, "UTF-8");
            
            HttpURLConnection conn = (HttpURLConnection) new URL(loginUrl).openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(10000);
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            
            OutputStream os = conn.getOutputStream();
            os.write(postData.getBytes());
            os.flush();
            os.close();
            
            if (conn.getResponseCode() == 200) {
                String cookies = conn.getHeaderField("Set-Cookie");
                if (cookies != null) {
                    sessionCookie = cookies.split(";")[0];
                    sessionExpiry = System.currentTimeMillis() + (30 * 60 * 1000);
                    Log.d(TAG, "✅ D-Link authentication successful");
                    return true;
                }
            }
            
        } catch (Exception e) {
            Log.d(TAG, "D-Link auth failed: " + e.getMessage());
        }
        return false;
    }
    
    /**
     * Check if session is still valid
     */
    public boolean isSessionValid() {
        return (sessionCookie != null || authToken != null) && 
               System.currentTimeMillis() < sessionExpiry;
    }
    
    /**
     * Make authenticated request to router
     */
    public String makeAuthenticatedRequest(String endpoint) {
        try {
            // Re-authenticate if session expired
            if (!isSessionValid()) {
                if (!authenticate()) {
                    Log.e(TAG, "Re-authentication failed");
                    return null;
                }
            }
            
            String urlString = endpoint.startsWith("http") ? endpoint : "http://" + routerIP + endpoint;
            HttpURLConnection conn = (HttpURLConnection) new URL(urlString).openConnection();
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(10000);
            conn.setRequestProperty("User-Agent", "Mozilla/5.0");
            
            // Add authentication headers
            if (sessionCookie != null) {
                if (sessionCookie.startsWith("Basic ")) {
                    conn.setRequestProperty("Authorization", sessionCookie);
                } else {
                    conn.setRequestProperty("Cookie", sessionCookie);
                }
            }
            
            if (authToken != null) {
                // For TP-Link with stok token
                if (urlString.contains("stok=")) {
                    urlString = urlString.replace("stok=", "stok=" + authToken);
                } else {
                    conn.setRequestProperty("X-Token", authToken);
                }
            }
            
            if (conn.getResponseCode() == 200) {
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
            Log.e(TAG, "Authenticated request failed: " + e.getMessage());
        }
        return null;
    }
    
    /**
     * Get session cookie for external use
     */
    public String getSessionCookie() {
        return sessionCookie;
    }
    
    /**
     * Get auth token for external use
     */
    public String getAuthToken() {
        return authToken;
    }
}
