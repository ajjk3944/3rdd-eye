package app.thirdeye.scanner;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiNetworkSpecifier;
import android.net.wifi.WifiNetworkSuggestion;
import android.os.Build;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.annotation.Permission;
import com.getcapacitor.annotation.PermissionCallback;

import java.util.ArrayList;
import java.util.List;

@CapacitorPlugin(name = "WiFiScanner", permissions = {
        @Permission(alias = "location", strings = {
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION
        }),
        @Permission(alias = "wifi", strings = {
                Manifest.permission.ACCESS_WIFI_STATE,
                Manifest.permission.CHANGE_WIFI_STATE
        })
})
public class WiFiScannerPlugin extends Plugin {
    private static final String TAG = "WiFiScannerPlugin";
    private WifiManager wifiManager;
    private ConnectivityManager connectivityManager;
    private BroadcastReceiver wifiScanReceiver;
    private PluginCall savedCall;
    private ConnectivityManager.NetworkCallback networkCallback;

    @Override
    public void load() {
        super.load();
        wifiManager = (WifiManager) getContext().getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        connectivityManager = (ConnectivityManager) getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
    }

    @PluginMethod
    public void isWifiEnabled(PluginCall call) {
        JSObject result = new JSObject();
        result.put("enabled", wifiManager != null && wifiManager.isWifiEnabled());
        call.resolve(result);
    }

    @PluginMethod
    public void getCurrentNetwork(PluginCall call) {
        if (!hasLocationPermission()) {
            requestAllPermissions(call, "permissionCallback");
            return;
        }

        JSObject result = new JSObject();
        if (wifiManager != null) {
            WifiInfo wifiInfo = wifiManager.getConnectionInfo();
            if (wifiInfo != null) {
                String ssid = wifiInfo.getSSID();
                if (ssid != null) {
                    ssid = ssid.replace("\"", "");
                }
                result.put("ssid", ssid);
                result.put("bssid", wifiInfo.getBSSID());
                result.put("rssi", wifiInfo.getRssi());
                result.put("linkSpeed", wifiInfo.getLinkSpeed());
                result.put("frequency", wifiInfo.getFrequency());
                result.put("ipAddress", intToIp(wifiInfo.getIpAddress()));
                result.put("connected", true);
            } else {
                result.put("connected", false);
            }
        } else {
            result.put("connected", false);
        }
        call.resolve(result);
    }

    @PluginMethod
    public void scan(PluginCall call) {
        // CRITICAL: ALWAYS check and request permissions on EVERY scan attempt
        // This ensures that even if the user denies permissions multiple times,
        // they can always click the Scan button again to re-request permissions.
        // This prevents the app from getting stuck in a state where scanning is impossible.
        if (!hasLocationPermission()) {
            savedCall = call;
            // Request permissions - this will show the Android permission dialog
            requestAllPermissions(call, "permissionCallback");
            return;
        }

        performScan(call);
    }

    @PermissionCallback
    private void permissionCallback(PluginCall call) {
        // Check if permissions were granted after the request
        if (hasLocationPermission()) {
            // Permissions granted - proceed with scan
            performScan(call);
        } else {
            // Permissions still not granted - return error but allow retry
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "Location permission is required to scan WiFi networks. Please grant permission to continue.");
            result.put("networks", new JSArray());
            result.put("permissionDenied", true); // Flag to indicate permission issue
            call.resolve(result);
        }
    }

    private boolean hasLocationPermission() {
        return ActivityCompat.checkSelfPermission(getContext(),
                Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED;
    }

    private void performScan(PluginCall call) {
        if (wifiManager == null) {
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "WiFi not available");
            result.put("networks", new JSArray());
            call.resolve(result);
            return;
        }

        if (!wifiManager.isWifiEnabled()) {
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "WiFi is disabled. Please enable WiFi.");
            result.put("networks", new JSArray());
            call.resolve(result);
            return;
        }

        try {
            // Unregister any existing receiver first to avoid duplicates
            if (wifiScanReceiver != null) {
                try {
                    getContext().unregisterReceiver(wifiScanReceiver);
                } catch (Exception e) {
                    // Ignore if not registered
                }
            }

            // Register receiver for scan results
            wifiScanReceiver = new BroadcastReceiver() {
                @Override
                public void onReceive(Context context, Intent intent) {
                    try {
                        getContext().unregisterReceiver(this);
                    } catch (Exception e) {
                        Log.e(TAG, "Error unregistering receiver", e);
                    }

                    JSObject result = new JSObject();
                    JSArray networksArray = new JSArray();

                    try {
                        List<ScanResult> scanResults = wifiManager.getScanResults();
                        Log.d(TAG, "Scan completed. Found " + (scanResults != null ? scanResults.size() : 0)
                                + " networks");

                        if (scanResults != null) {
                            for (ScanResult scanResult : scanResults) {
                                JSObject network = new JSObject();
                                network.put("ssid",
                                        scanResult.SSID != null && !scanResult.SSID.isEmpty() ? scanResult.SSID
                                                : "Hidden Network");
                                network.put("bssid", scanResult.BSSID);
                                network.put("rssi", scanResult.level);
                                network.put("signal", calculateSignalLevel(scanResult.level));
                                network.put("frequency", scanResult.frequency);
                                network.put("channel", frequencyToChannel(scanResult.frequency));
                                network.put("security", getSecurityType(scanResult));
                                network.put("is5GHz", scanResult.frequency > 4900);
                                network.put("timestamp", System.currentTimeMillis());
                                networksArray.put(network);
                            }
                        }
                        result.put("success", true);
                        result.put("networks", networksArray);
                        result.put("count", networksArray.length());
                        result.put("cached", false);
                        Log.d(TAG, "Returning " + networksArray.length() + " networks");
                    } catch (SecurityException e) {
                        Log.e(TAG, "Security exception getting scan results", e);
                        result.put("success", false);
                        result.put("error", "Permission denied. Please grant location permission.");
                        result.put("networks", new JSArray());
                    } catch (Exception e) {
                        Log.e(TAG, "Error processing scan results", e);
                        result.put("success", false);
                        result.put("error", "Error: " + e.getMessage());
                        result.put("networks", new JSArray());
                    }

                    call.resolve(result);
                }
            };

            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(WifiManager.SCAN_RESULTS_AVAILABLE_ACTION);
            getContext().registerReceiver(wifiScanReceiver, intentFilter);

            Log.d(TAG, "Starting WiFi scan...");
            boolean scanStarted = wifiManager.startScan();
            Log.d(TAG, "Scan started: " + scanStarted);

            if (!scanStarted) {
                // If scan didn't start, unregister receiver and return cached results
                Log.w(TAG, "Scan failed to start, returning cached results");
                try {
                    getContext().unregisterReceiver(wifiScanReceiver);
                } catch (Exception e) {
                    // Ignore
                }
                returnCachedResults(call);
            }
        } catch (Exception e) {
            Log.e(TAG, "Error starting WiFi scan", e);
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "Failed to start scan: " + e.getMessage());
            result.put("networks", new JSArray());
            call.resolve(result);
        }
    }

    private void returnCachedResults(PluginCall call) {
        JSObject result = new JSObject();
        JSArray networksArray = new JSArray();

        try {
            List<ScanResult> scanResults = wifiManager.getScanResults();
            for (ScanResult scanResult : scanResults) {
                JSObject network = new JSObject();
                network.put("ssid", scanResult.SSID != null ? scanResult.SSID : "Hidden Network");
                network.put("bssid", scanResult.BSSID);
                network.put("rssi", scanResult.level);
                network.put("signal", calculateSignalLevel(scanResult.level));
                network.put("frequency", scanResult.frequency);
                network.put("channel", frequencyToChannel(scanResult.frequency));
                network.put("security", getSecurityType(scanResult));
                network.put("is5GHz", scanResult.frequency > 4900);
                network.put("timestamp", System.currentTimeMillis());
                networksArray.put(network);
            }
            result.put("success", true);
            result.put("networks", networksArray);
            result.put("count", scanResults.size());
            result.put("cached", true);
        } catch (SecurityException e) {
            result.put("success", false);
            result.put("error", "Permission denied");
            result.put("networks", new JSArray());
        }

        call.resolve(result);
    }

    private int calculateSignalLevel(int rssi) {
        if (rssi >= -50)
            return 100;
        if (rssi >= -60)
            return 80;
        if (rssi >= -70)
            return 60;
        if (rssi >= -80)
            return 40;
        if (rssi >= -90)
            return 20;
        return 10;
    }

    private int frequencyToChannel(int frequency) {
        if (frequency >= 2412 && frequency <= 2484) {
            return (frequency - 2412) / 5 + 1;
        } else if (frequency >= 5170 && frequency <= 5825) {
            return (frequency - 5170) / 5 + 34;
        }
        return 0;
    }

    private String getSecurityType(ScanResult scanResult) {
        String capabilities = scanResult.capabilities;
        if (capabilities.contains("WPA3")) {
            return "WPA3";
        } else if (capabilities.contains("WPA2")) {
            return "WPA2";
        } else if (capabilities.contains("WPA")) {
            return "WPA";
        } else if (capabilities.contains("WEP")) {
            return "WEP";
        } else if (capabilities.contains("ESS") && !capabilities.contains("WPA") && !capabilities.contains("WEP")) {
            return "Open";
        }
        return "Unknown";
    }

    private String intToIp(int ip) {
        return String.format("%d.%d.%d.%d",
                (ip & 0xff),
                (ip >> 8 & 0xff),
                (ip >> 16 & 0xff),
                (ip >> 24 & 0xff));
    }

    @PluginMethod
    public void connect(PluginCall call) {
        String ssid = call.getString("ssid");
        String password = call.getString("password");
        String security = call.getString("security");
        String bssid = call.getString("bssid");

        Log.d(TAG, "Connect called - SSID: " + ssid + ", Security: " + security + ", BSSID: " + bssid);
        Log.d(TAG, "Android version: " + Build.VERSION.SDK_INT);

        if (ssid == null || ssid.isEmpty()) {
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "SSID is required");
            call.resolve(result);
            return;
        }

        if (!hasLocationPermission()) {
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "Location permission is required to connect to WiFi");
            call.resolve(result);
            return;
        }

        if (wifiManager == null) {
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "WiFi not available");
            call.resolve(result);
            return;
        }

        if (!wifiManager.isWifiEnabled()) {
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "WiFi is disabled. Please enable WiFi.");
            call.resolve(result);
            return;
        }

        // Auto-save network credentials to local database for non-rooted devices
        // This allows the network to appear in "Saved Networks" even without root access
        if (password != null && !password.isEmpty()) {
            try {
                app.thirdeye.scanner.network.SavedWifiDatabase db = 
                    app.thirdeye.scanner.network.SavedWifiDatabase.getInstance(getContext());
                db.saveWifi(ssid, password, bssid != null ? bssid : "");
                Log.d(TAG, "Auto-saved WiFi credentials to local database");
            } catch (Exception e) {
                Log.e(TAG, "Failed to auto-save WiFi credentials: " + e.getMessage());
            }
        }

        // Use different methods based on Android version
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Android 10+ (API 29+) - Use WifiNetworkSuggestion for persistent connection
            connectAndroid10PlusSuggestion(call, ssid, password, security, bssid);
        } else {
            // Android 9 and below - Use legacy WifiConfiguration
            connectLegacy(call, ssid, password, security, bssid);
        }
    }

    // Android 10+ connection using WifiNetworkSuggestion (persistent connection)
    private void connectAndroid10PlusSuggestion(PluginCall call, String ssid, String password, String security,
            String bssid) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) {
            return;
        }

        try {
            Log.d(TAG, "Using Android 10+ WifiNetworkSuggestion method for persistent connection");

            // First, remove any existing suggestions for this SSID
            List<WifiNetworkSuggestion> existingSuggestions = wifiManager.getNetworkSuggestions();
            if (existingSuggestions != null && !existingSuggestions.isEmpty()) {
                List<WifiNetworkSuggestion> toRemove = new ArrayList<>();
                for (WifiNetworkSuggestion suggestion : existingSuggestions) {
                    if (suggestion.getSsid() != null && suggestion.getSsid().equals(ssid)) {
                        toRemove.add(suggestion);
                    }
                }
                if (!toRemove.isEmpty()) {
                    int removed = wifiManager.removeNetworkSuggestions(toRemove);
                    Log.d(TAG, "Removed " + removed + " existing suggestions for SSID: " + ssid);
                }
            }

            // Build the network suggestion
            WifiNetworkSuggestion.Builder suggestionBuilder = new WifiNetworkSuggestion.Builder();
            suggestionBuilder.setSsid(ssid);

            if (bssid != null && !bssid.isEmpty()) {
                suggestionBuilder.setBssid(android.net.MacAddress.fromString(bssid));
            }

            // Configure security
            boolean isOpen = security == null || security.equals("Open") || security.equals("None");

            if (!isOpen && password != null && !password.isEmpty()) {
                if (security.contains("WPA3")) {
                    suggestionBuilder.setWpa3Passphrase(password);
                } else if (security.contains("WPA")) {
                    suggestionBuilder.setWpa2Passphrase(password);
                } else if (security.contains("WEP")) {
                    // WEP not supported in Android 10+
                    JSObject result = new JSObject();
                    result.put("success", false);
                    result.put("error", "WEP security is not supported on Android 10+");
                    call.resolve(result);
                    return;
                }
            }

            // Set priority and auto-join
            suggestionBuilder.setIsAppInteractionRequired(false); // Don't require user interaction
            suggestionBuilder.setIsEnhancedOpen(false);
            suggestionBuilder.setIsHiddenSsid(false);

            // For Android 12+ (API 31+), set priority
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                suggestionBuilder.setPriority(1); // High priority
            }

            WifiNetworkSuggestion suggestion = suggestionBuilder.build();
            List<WifiNetworkSuggestion> suggestionsList = new ArrayList<>();
            suggestionsList.add(suggestion);

            // Add the network suggestion
            int status = wifiManager.addNetworkSuggestions(suggestionsList);
            Log.d(TAG, "Add network suggestion status: " + status);

            if (status == WifiManager.STATUS_NETWORK_SUGGESTIONS_SUCCESS) {
                Log.d(TAG, "Network suggestion added successfully");

                // Now use WifiNetworkSpecifier to immediately connect
                connectWithSpecifier(call, ssid, password, security, bssid);

            } else if (status == WifiManager.STATUS_NETWORK_SUGGESTIONS_ERROR_ADD_DUPLICATE) {
                Log.d(TAG, "Network suggestion already exists, connecting...");
                connectWithSpecifier(call, ssid, password, security, bssid);

            } else {
                String errorMsg = "Failed to add network suggestion. Status: " + status;
                if (status == WifiManager.STATUS_NETWORK_SUGGESTIONS_ERROR_APP_DISALLOWED) {
                    errorMsg = "App is not allowed to add network suggestions. Please check app permissions.";
                } else if (status == WifiManager.STATUS_NETWORK_SUGGESTIONS_ERROR_ADD_EXCEEDS_MAX_PER_APP) {
                    errorMsg = "Too many network suggestions. Please remove some networks first.";
                }

                Log.e(TAG, errorMsg);
                JSObject result = new JSObject();
                result.put("success", false);
                result.put("error", errorMsg);
                call.resolve(result);
            }

        } catch (Exception e) {
            Log.e(TAG, "Error adding network suggestion", e);
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "Connection error: " + e.getMessage());
            call.resolve(result);
        }
    }

    // Helper method to connect using WifiNetworkSpecifier
    private void connectWithSpecifier(PluginCall call, String ssid, String password, String security, String bssid) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) {
            return;
        }

        try {
            Log.d(TAG, "Connecting with WifiNetworkSpecifier...");

            WifiNetworkSpecifier.Builder specifierBuilder = new WifiNetworkSpecifier.Builder();
            specifierBuilder.setSsid(ssid);

            if (bssid != null && !bssid.isEmpty()) {
                specifierBuilder.setBssid(android.net.MacAddress.fromString(bssid));
            }

            // Configure security
            boolean isOpen = security == null || security.equals("Open") || security.equals("None");

            if (!isOpen && password != null && !password.isEmpty()) {
                if (security.contains("WPA3")) {
                    specifierBuilder.setWpa3Passphrase(password);
                } else if (security.contains("WPA")) {
                    specifierBuilder.setWpa2Passphrase(password);
                }
            }

            NetworkRequest.Builder requestBuilder = new NetworkRequest.Builder();
            requestBuilder.addTransportType(NetworkCapabilities.TRANSPORT_WIFI);
            requestBuilder.addCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET);
            requestBuilder.addCapability(NetworkCapabilities.NET_CAPABILITY_NOT_RESTRICTED);
            requestBuilder.setNetworkSpecifier(specifierBuilder.build());

            NetworkRequest networkRequest = requestBuilder.build();

            // Remove any existing callback
            if (networkCallback != null) {
                try {
                    connectivityManager.unregisterNetworkCallback(networkCallback);
                    connectivityManager.bindProcessToNetwork(null);
                } catch (Exception e) {
                    Log.w(TAG, "Failed to unregister previous callback", e);
                }
            }

            // Create new callback
            networkCallback = new ConnectivityManager.NetworkCallback() {
                private boolean resolved = false;

                @Override
                public void onAvailable(@NonNull Network network) {
                    super.onAvailable(network);
                    Log.d(TAG, "Network available: " + network);

                    // DON'T bind process to network - let system handle routing
                    // This allows the connection to persist and work system-wide

                    // Wait for network validation
                    getActivity().runOnUiThread(() -> {
                        new android.os.Handler().postDelayed(() -> {
                            NetworkCapabilities capabilities = connectivityManager.getNetworkCapabilities(network);
                            if (capabilities != null) {
                                boolean hasInternet = capabilities
                                        .hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET);
                                boolean validated = capabilities
                                        .hasCapability(NetworkCapabilities.NET_CAPABILITY_VALIDATED);
                                Log.d(TAG, "Network has internet: " + hasInternet + ", validated: " + validated);

                                if (!resolved) {
                                    resolved = true;
                                    JSObject result = new JSObject();
                                    result.put("success", true);
                                    result.put("hasInternet", hasInternet);
                                    result.put("validated", validated);
                                    call.resolve(result);

                                    // Unregister callback after successful connection
                                    try {
                                        connectivityManager.unregisterNetworkCallback(this);
                                        networkCallback = null;
                                    } catch (Exception e) {
                                        Log.w(TAG, "Failed to unregister callback", e);
                                    }
                                }
                            }
                        }, 3000); // Wait 3 seconds for validation
                    });
                }

                @Override
                public void onCapabilitiesChanged(@NonNull Network network,
                        @NonNull NetworkCapabilities networkCapabilities) {
                    super.onCapabilitiesChanged(network, networkCapabilities);
                    boolean hasInternet = networkCapabilities
                            .hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET);
                    boolean validated = networkCapabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_VALIDATED);
                    Log.d(TAG, "Network capabilities changed - Internet: " + hasInternet + ", Validated: " + validated);
                }

                @Override
                public void onUnavailable() {
                    super.onUnavailable();
                    Log.e(TAG, "Network unavailable");

                    if (!resolved) {
                        resolved = true;
                        JSObject result = new JSObject();
                        result.put("success", false);
                        result.put("error",
                                "Network unavailable. Check if network is in range and password is correct.");
                        call.resolve(result);
                    }
                }

                @Override
                public void onLost(@NonNull Network network) {
                    super.onLost(network);
                    Log.w(TAG, "Network lost: " + network);
                }
            };

            Log.d(TAG, "Requesting network connection...");
            connectivityManager.requestNetwork(networkRequest, networkCallback, 30000); // 30 second timeout

        } catch (Exception e) {
            Log.e(TAG, "Error connecting with specifier", e);
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "Connection error: " + e.getMessage());
            call.resolve(result);
        }
    }

    // Legacy connection for Android 9 and below
    private void connectLegacy(PluginCall call, String ssid, String password, String security, String bssid) {
        try {
            Log.d(TAG, "Using legacy WifiConfiguration method");

            android.net.wifi.WifiConfiguration wifiConfig = new android.net.wifi.WifiConfiguration();
            wifiConfig.SSID = "\"" + ssid + "\"";

            if (bssid != null && !bssid.isEmpty()) {
                wifiConfig.BSSID = bssid;
            }

            // Configure security
            if (security == null || security.equals("Open") || security.equals("None")) {
                wifiConfig.allowedKeyManagement.set(android.net.wifi.WifiConfiguration.KeyMgmt.NONE);
            } else if (security.contains("WPA")) {
                wifiConfig.preSharedKey = "\"" + password + "\"";
                wifiConfig.allowedKeyManagement.set(android.net.wifi.WifiConfiguration.KeyMgmt.WPA_PSK);
            } else if (security.contains("WEP")) {
                wifiConfig.wepKeys[0] = "\"" + password + "\"";
                wifiConfig.wepTxKeyIndex = 0;
                wifiConfig.allowedKeyManagement.set(android.net.wifi.WifiConfiguration.KeyMgmt.NONE);
                wifiConfig.allowedAuthAlgorithms.set(android.net.wifi.WifiConfiguration.AuthAlgorithm.SHARED);
            }

            int networkId = wifiManager.addNetwork(wifiConfig);
            Log.d(TAG, "Network added with ID: " + networkId);

            if (networkId == -1) {
                JSObject result = new JSObject();
                result.put("success", false);
                result.put("error", "Failed to add network configuration");
                call.resolve(result);
                return;
            }

            boolean disconnected = wifiManager.disconnect();
            Log.d(TAG, "Disconnected: " + disconnected);

            boolean enabled = wifiManager.enableNetwork(networkId, true);
            Log.d(TAG, "Network enabled: " + enabled);

            boolean reconnected = wifiManager.reconnect();
            Log.d(TAG, "Reconnected: " + reconnected);

            if (enabled && reconnected) {
                JSObject result = new JSObject();
                result.put("success", true);
                call.resolve(result);
            } else {
                JSObject result = new JSObject();
                result.put("success", false);
                result.put("error", "Failed to connect to network");
                call.resolve(result);
            }

        } catch (Exception e) {
            Log.e(TAG, "Error connecting to WiFi (legacy)", e);
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "Connection error: " + e.getMessage());
            call.resolve(result);
        }
    }

    @PluginMethod
    public void forget(PluginCall call) {
        String ssid = call.getString("ssid");

        if (ssid == null || ssid.isEmpty()) {
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "SSID is required");
            call.resolve(result);
            return;
        }

        if (wifiManager == null) {
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "WiFi not available");
            call.resolve(result);
            return;
        }

        try {
            boolean success = false;

            // Disconnect if currently connected to this network
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo != null && connectionInfo.getSSID() != null) {
                String currentSsid = connectionInfo.getSSID().replace("\"", "");
                if (currentSsid.equals(ssid)) {
                    // If forgetting current network, also unregister any active callbacks
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q && networkCallback != null) {
                        try {
                            connectivityManager.unregisterNetworkCallback(networkCallback);
                            connectivityManager.bindProcessToNetwork(null);
                            networkCallback = null;
                        } catch (Exception e) {
                            Log.w(TAG, "Failed to unregister callback during forget", e);
                        }
                    }
                    wifiManager.disconnect();
                }
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                // Android 10+ (API 29+): Remove network suggestions
                List<WifiNetworkSuggestion> existingSuggestions = wifiManager.getNetworkSuggestions();
                if (existingSuggestions != null && !existingSuggestions.isEmpty()) {
                    List<WifiNetworkSuggestion> toRemove = new ArrayList<>();
                    for (WifiNetworkSuggestion suggestion : existingSuggestions) {
                        if (suggestion.getSsid() != null && suggestion.getSsid().equals(ssid)) {
                            toRemove.add(suggestion);
                        }
                    }
                    if (!toRemove.isEmpty()) {
                        int status = wifiManager.removeNetworkSuggestions(toRemove);
                        success = (status == WifiManager.STATUS_NETWORK_SUGGESTIONS_SUCCESS);
                        Log.d(TAG, "Removed suggestions for " + ssid + ", status: " + status);
                    } else {
                        // No suggestion found to remove, consider it success
                        success = true;
                    }
                } else {
                    success = true;
                }
            } else {
                // Legacy Android: Remove configured network
                List<android.net.wifi.WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
                if (configuredNetworks != null) {
                    for (android.net.wifi.WifiConfiguration config : configuredNetworks) {
                        if (config.SSID != null && config.SSID.equals("\"" + ssid + "\"")) {
                            success = wifiManager.removeNetwork(config.networkId);
                            wifiManager.saveConfiguration();
                            Log.d(TAG, "Removed legacy config for " + ssid + ", success: " + success);
                            break;
                        }
                    }
                }

                if (!success) { // If not found, assume already forgotten
                    success = true;
                }
            }

            JSObject result = new JSObject();
            result.put("success", success);
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "Error forgetting network", e);
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "Forget error: " + e.getMessage());
            call.resolve(result);
        }
    }

    @PluginMethod
    public void disconnect(PluginCall call) {
        if (wifiManager == null) {
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "WiFi not available");
            call.resolve(result);
            return;
        }

        try {
            // For Android 10+, unregister network callback
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q && networkCallback != null) {
                try {
                    connectivityManager.unregisterNetworkCallback(networkCallback);
                    connectivityManager.bindProcessToNetwork(null);
                    networkCallback = null;
                } catch (Exception e) {
                    Log.w(TAG, "Failed to unregister callback", e);
                }
            }

            // Also remove suggestions for the CURRENT connected network if we suggested it.
            // This prevents auto-reconnection.
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                try {
                    WifiInfo diffConnectionInfo = wifiManager.getConnectionInfo();
                    if (diffConnectionInfo != null && diffConnectionInfo.getSSID() != null) {
                        String currentSsid = diffConnectionInfo.getSSID().replace("\"", "");
                        // Remove suggestions for this SSID
                        List<WifiNetworkSuggestion> existingSuggestions = wifiManager.getNetworkSuggestions();
                        if (existingSuggestions != null && !existingSuggestions.isEmpty()) {
                            List<WifiNetworkSuggestion> toRemove = new ArrayList<>();
                            for (WifiNetworkSuggestion suggestion : existingSuggestions) {
                                if (suggestion.getSsid() != null && suggestion.getSsid().equals(currentSsid)) {
                                    toRemove.add(suggestion);
                                }
                            }
                            if (!toRemove.isEmpty()) {
                                wifiManager.removeNetworkSuggestions(toRemove);
                                Log.d(TAG, "Removed suggestions for " + currentSsid + " during disconnect");
                            }
                        }
                    }
                } catch (Exception e) {
                    Log.e(TAG, "Error removing suggestions during disconnect", e);
                }
            }

            // For all versions, try to disconnect
            boolean disconnected = wifiManager.disconnect();
            JSObject result = new JSObject();
            result.put("success", true);
            if (!disconnected) {
                Log.w(TAG, "wifiManager.disconnect() returned false");
            }
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "Error disconnecting WiFi", e);
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "Disconnect error: " + e.getMessage());
            call.resolve(result);
        }
    }
}
