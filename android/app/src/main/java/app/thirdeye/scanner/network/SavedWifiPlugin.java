package app.thirdeye.scanner.network;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.util.Log;

import androidx.core.app.ActivityCompat;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@CapacitorPlugin(name = "SavedWifi")
public class SavedWifiPlugin extends Plugin {
    private static final String TAG = "SavedWifiPlugin";

    /**
     * Get saved WiFi passwords - tries multiple methods
     */
    @PluginMethod
    public void getSavedWifiPasswords(PluginCall call) {
        Log.d(TAG, "getSavedWifiPasswords called");
        JSObject result = new JSObject();
        JSArray wifiList = new JSArray();
        boolean isRooted = checkRoot();
        
        Log.d(TAG, "Device rooted: " + isRooted);
        Log.d(TAG, "Android version: " + Build.VERSION.SDK_INT);

        // Method 1: Try root access to read system WiFi config (works on all Android versions if rooted)
        if (isRooted) {
            try {
                Log.d(TAG, "Attempting root method...");
                List<JSObject> rootPasswords = getPasswordsViaRoot();
                Log.d(TAG, "Root method found " + rootPasswords.size() + " networks");
                for (JSObject wifi : rootPasswords) {
                    wifiList.put(wifi);
                }
                result.put("source", "root");
            } catch (Exception e) {
                Log.e(TAG, "Root method failed: " + e.getMessage());
            }
        }

        // Method 2: Try WifiManager.getConfiguredNetworks() (Android 9 and below, deprecated in 10+)
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q && wifiList.length() == 0) {
            try {
                Log.d(TAG, "Attempting WifiManager.getConfiguredNetworks()...");
                List<JSObject> configuredNetworks = getConfiguredNetworks();
                Log.d(TAG, "WifiManager found " + configuredNetworks.size() + " networks");
                for (JSObject wifi : configuredNetworks) {
                    wifiList.put(wifi);
                }
                if (!result.has("source")) {
                    result.put("source", "wifimanager");
                }
            } catch (Exception e) {
                Log.e(TAG, "WifiManager method failed: " + e.getMessage());
            }
        }

        // Method 3: Get from app's local database (always available)
        try {
            Log.d(TAG, "Attempting app database method...");
            List<JSObject> dbPasswords = getPasswordsFromDatabase();
            Log.d(TAG, "Database found " + dbPasswords.size() + " networks");
            // Merge with previous results (avoid duplicates by SSID)
            for (JSObject wifi : dbPasswords) {
                boolean duplicate = false;
                for (int i = 0; i < wifiList.length(); i++) {
                    JSONObject existing = wifiList.getJSONObject(i);
                    if (existing.getString("ssid").equals(wifi.getString("ssid"))) {
                        duplicate = true;
                        break;
                    }
                }
                if (!duplicate) {
                    wifiList.put(wifi);
                }
            }
            if (!result.has("source")) {
                result.put("source", "database");
            }
        } catch (Exception e) {
            Log.e(TAG, "Database method failed: " + e.getMessage());
        }

        // Method 4: Get currently connected WiFi info
        try {
            JSObject currentWifi = getCurrentWifiInfo();
            if (currentWifi != null) {
                // Try to find password for current WiFi from saved list
                String currentSsid = currentWifi.getString("ssid");
                for (int i = 0; i < wifiList.length(); i++) {
                    JSONObject saved = wifiList.getJSONObject(i);
                    if (saved.getString("ssid").equals(currentSsid)) {
                        currentWifi.put("password", saved.getString("password"));
                        break;
                    }
                }
                result.put("currentWifi", currentWifi);
            }
        } catch (Exception e) {
            Log.e(TAG, "Current wifi info failed: " + e.getMessage());
        }

        result.put("networks", wifiList);
        result.put("isRooted", isRooted);
        result.put("count", wifiList.length());
        result.put("androidVersion", Build.VERSION.SDK_INT);
        
        // Add helpful message
        if (!isRooted && wifiList.length() == 0) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                result.put("message", "Android 10+ restricts access to saved WiFi passwords. Connect to networks through this app to save them.");
            } else {
                result.put("message", "No saved networks found. Connect to WiFi networks through this app to save them automatically.");
            }
        } else if (!isRooted && wifiList.length() > 0) {
            result.put("message", "Showing networks saved through this app. System WiFi networks require root access.");
        } else if (isRooted && wifiList.length() > 0) {
            result.put("message", "Showing all system WiFi networks (root access detected).");
        }
        
        Log.d(TAG, "Returning " + wifiList.length() + " networks");
        call.resolve(result);
    }

    /**
     * Save a WiFi password to app's local database
     */
    @PluginMethod
    public void saveWifiPassword(PluginCall call) {
        String ssid = call.getString("ssid", "");
        String password = call.getString("password", "");
        String bssid = call.getString("bssid", "");

        if (ssid.isEmpty()) {
            call.reject("SSID is required");
            return;
        }

        try {
            SavedWifiDatabase db = SavedWifiDatabase.getInstance(getContext());
            db.saveWifi(ssid, password, bssid);
            call.resolve();
        } catch (Exception e) {
            call.reject("Failed to save: " + e.getMessage());
        }
    }

    /**
     * Delete a saved WiFi entry
     */
    @PluginMethod
    public void deleteWifiPassword(PluginCall call) {
        String ssid = call.getString("ssid", "");
        if (ssid.isEmpty()) {
            call.reject("SSID is required");
            return;
        }
        try {
            SavedWifiDatabase db = SavedWifiDatabase.getInstance(getContext());
            db.deleteWifi(ssid);
            call.resolve();
        } catch (Exception e) {
            call.reject("Failed to delete: " + e.getMessage());
        }
    }

    /**
     * Check if device is rooted
     */
    private boolean checkRoot() {
        String[] paths = {
            "/system/app/Superuser.apk",
            "/sbin/su",
            "/system/bin/su",
            "/system/xbin/su",
            "/data/local/xbin/su",
            "/data/local/bin/su",
            "/system/sd/xbin/su",
            "/system/bin/failsafe/su",
            "/data/local/su"
        };
        for (String path : paths) {
            if (new File(path).exists()) return true;
        }
        try {
            Process process = Runtime.getRuntime().exec(new String[]{"which", "su"});
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = reader.readLine();
            return line != null && !line.isEmpty();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Read WiFi passwords via root access (Android system files)
     */
    private List<JSObject> getPasswordsViaRoot() throws Exception {
        List<JSObject> passwords = new ArrayList<>();

        // Try WifiConfigStore.xml (Android 8+)
        String[] commands = {
            "su -c 'cat /data/misc/wifi/WifiConfigStore.xml'",
            "su -c 'cat /data/misc/wifi/wpa_supplicant.conf'"  // Older Android
        };

        for (String cmd : commands) {
            try {
                Process process = Runtime.getRuntime().exec(new String[]{"sh", "-c", cmd});
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                StringBuilder output = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    output.append(line).append("\n");
                }
                reader.close();

                String content = output.toString();
                if (content.contains("WifiConfiguration") || content.contains("ssid=")) {
                    // Parse WifiConfigStore.xml format
                    passwords = parseWifiConfig(content);
                    if (!passwords.isEmpty()) break;
                }
            } catch (Exception e) {
                continue;
            }
        }

        return passwords;
    }

    /**
     * Parse WiFi configuration from system files
     */
    private List<JSObject> parseWifiConfig(String content) {
        List<JSObject> passwords = new ArrayList<>();

        // Parse WifiConfigStore.xml format
        if (content.contains("ConfigKey")) {
            String[] blocks = content.split("WifiConfiguration");
            for (String block : blocks) {
                try {
                    String ssid = extractValue(block, "SSID", "\"");
                    String psk = extractValue(block, "PreSharedKey", "\"");
                    if (ssid != null && !ssid.isEmpty()) {
                        JSObject wifi = new JSObject();
                        wifi.put("ssid", ssid.replace("\"", ""));
                        wifi.put("password", psk != null ? psk.replace("\"", "") : "Open Network");
                        wifi.put("bssid", "");
                        wifi.put("source", "system");
                        wifi.put("savedAt", System.currentTimeMillis());
                        passwords.add(wifi);
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }

        // Parse wpa_supplicant.conf format (older Android)
        if (content.contains("network={")) {
            String[] networks = content.split("network=\\{");
            for (String network : networks) {
                try {
                    String ssid = extractSimpleValue(network, "ssid");
                    String psk = extractSimpleValue(network, "psk");
                    if (ssid != null && !ssid.isEmpty()) {
                        JSObject wifi = new JSObject();
                        wifi.put("ssid", ssid.replace("\"", ""));
                        wifi.put("password", psk != null ? psk.replace("\"", "") : "Open Network");
                        wifi.put("bssid", "");
                        wifi.put("source", "system");
                        wifi.put("savedAt", System.currentTimeMillis());
                        passwords.add(wifi);
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }

        return passwords;
    }

    private String extractValue(String block, String key, String delimiter) {
        int start = block.indexOf(key);
        if (start == -1) return null;
        start = block.indexOf(delimiter, start) + 1;
        int end = block.indexOf(delimiter, start);
        if (end == -1) return null;
        return block.substring(start, end);
    }

    private String extractSimpleValue(String block, String key) {
        int start = block.indexOf(key + "=");
        if (start == -1) return null;
        start += key.length() + 1;
        int end = block.indexOf("\n", start);
        if (end == -1) return null;
        return block.substring(start, end).trim();
    }

    /**
     * Get current WiFi info including SSID and BSSID
     */
    private JSObject getCurrentWifiInfo() {
        try {
            WifiManager wifiManager = (WifiManager) getContext().getApplicationContext()
                    .getSystemService(Context.WIFI_SERVICE);
            if (wifiManager == null) return null;

            WifiInfo wifiInfo = wifiManager.getConnectionInfo();
            if (wifiInfo == null) return null;

            String ssid = wifiInfo.getSSID();
            if (ssid == null || ssid.equals("<unknown ssid>")) return null;

            JSObject current = new JSObject();
            current.put("ssid", ssid.replace("\"", ""));
            current.put("bssid", wifiInfo.getBSSID() != null ? wifiInfo.getBSSID() : "");
            current.put("rssi", wifiInfo.getRssi());
            current.put("linkSpeed", wifiInfo.getLinkSpeed());
            // Password of current WiFi can only be retrieved via root
            current.put("password", ""); // Will be filled if found in saved passwords

            return current;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Get saved passwords from app's local SQLite database
     */
    private List<JSObject> getPasswordsFromDatabase() {
        List<JSObject> passwords = new ArrayList<>();
        try {
            SavedWifiDatabase db = SavedWifiDatabase.getInstance(getContext());
            passwords = db.getAllSavedWifi();
        } catch (Exception e) {
            Log.e(TAG, "Database error: " + e.getMessage());
        }
        return passwords;
    }

    /**
     * Get configured networks using WifiManager (Android 9 and below)
     * This method is deprecated in Android 10+ but still works on older versions
     */
    @SuppressWarnings("deprecation")
    private List<JSObject> getConfiguredNetworks() {
        List<JSObject> passwords = new ArrayList<>();
        
        try {
            WifiManager wifiManager = (WifiManager) getContext().getApplicationContext()
                    .getSystemService(Context.WIFI_SERVICE);
            
            if (wifiManager == null) {
                Log.e(TAG, "WifiManager is null");
                return passwords;
            }

            // Check permission
            if (ActivityCompat.checkSelfPermission(getContext(), 
                    Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                Log.e(TAG, "No location permission for getConfiguredNetworks");
                return passwords;
            }

            // Get configured networks (deprecated in API 29+)
            List<WifiConfiguration> configs = wifiManager.getConfiguredNetworks();
            
            if (configs == null || configs.isEmpty()) {
                Log.d(TAG, "No configured networks found");
                return passwords;
            }

            Log.d(TAG, "Found " + configs.size() + " configured networks");

            for (WifiConfiguration config : configs) {
                try {
                    JSObject wifi = new JSObject();
                    
                    // Get SSID (remove quotes)
                    String ssid = config.SSID;
                    if (ssid != null) {
                        ssid = ssid.replace("\"", "");
                        wifi.put("ssid", ssid);
                    } else {
                        continue; // Skip if no SSID
                    }

                    // Get BSSID
                    if (config.BSSID != null) {
                        wifi.put("bssid", config.BSSID);
                    } else {
                        wifi.put("bssid", "");
                    }

                    // Try to get password using reflection (may not work on all devices)
                    String password = "Protected";
                    try {
                        // Try to access preSharedKey field
                        if (config.preSharedKey != null) {
                            password = config.preSharedKey.replace("\"", "");
                        } else if (config.allowedKeyManagement.get(WifiConfiguration.KeyMgmt.NONE)) {
                            password = "Open Network";
                        } else {
                            // Try reflection to get WEP keys
                            if (config.wepKeys != null && config.wepKeys.length > 0 && config.wepKeys[0] != null) {
                                password = config.wepKeys[0].replace("\"", "");
                            }
                        }
                    } catch (Exception e) {
                        Log.e(TAG, "Failed to get password for " + ssid + ": " + e.getMessage());
                    }

                    wifi.put("password", password);
                    wifi.put("source", "wifimanager");
                    wifi.put("savedAt", System.currentTimeMillis());
                    
                    passwords.add(wifi);
                    Log.d(TAG, "Added network: " + ssid);
                    
                } catch (Exception e) {
                    Log.e(TAG, "Error processing config: " + e.getMessage());
                    continue;
                }
            }
            
        } catch (Exception e) {
            Log.e(TAG, "getConfiguredNetworks failed: " + e.getMessage());
        }
        
        return passwords;
    }
}
