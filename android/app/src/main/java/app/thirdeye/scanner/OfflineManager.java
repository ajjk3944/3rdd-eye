package app.thirdeye.scanner;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;

/**
 * Offline Manager - Handles offline mode and connectivity checks
 */
public class OfflineManager {
    private static final String TAG = "OfflineManager";
    private final Context context;
    private final ConnectivityManager connectivityManager;
    
    public OfflineManager(Context context) {
        this.context = context.getApplicationContext();
        this.connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
    }
    
    /**
     * Check if device has internet connectivity
     */
    public boolean isOnline() {
        if (connectivityManager == null) {
            return false;
        }
        
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            Network network = connectivityManager.getActiveNetwork();
            if (network == null) return false;
            
            NetworkCapabilities capabilities = connectivityManager.getNetworkCapabilities(network);
            return capabilities != null && (
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) ||
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) ||
                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET)
            );
        } else {
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            return networkInfo != null && networkInfo.isConnected();
        }
    }
    
    /**
     * Check if connected via WiFi
     */
    public boolean isWiFiConnected() {
        if (connectivityManager == null) {
            return false;
        }
        
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            Network network = connectivityManager.getActiveNetwork();
            if (network == null) return false;
            
            NetworkCapabilities capabilities = connectivityManager.getNetworkCapabilities(network);
            return capabilities != null && capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI);
        } else {
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            return networkInfo != null && 
                   networkInfo.getType() == ConnectivityManager.TYPE_WIFI && 
                   networkInfo.isConnected();
        }
    }
    
    /**
     * Check if connected via mobile data
     */
    public boolean isMobileDataConnected() {
        if (connectivityManager == null) {
            return false;
        }
        
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            Network network = connectivityManager.getActiveNetwork();
            if (network == null) return false;
            
            NetworkCapabilities capabilities = connectivityManager.getNetworkCapabilities(network);
            return capabilities != null && capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR);
        } else {
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            return networkInfo != null && 
                   networkInfo.getType() == ConnectivityManager.TYPE_MOBILE && 
                   networkInfo.isConnected();
        }
    }
    
    /**
     * Get connection type as string
     */
    public String getConnectionType() {
        if (!isOnline()) {
            return "Offline";
        }
        
        if (isWiFiConnected()) {
            return "WiFi";
        }
        
        if (isMobileDataConnected()) {
            return "Mobile Data";
        }
        
        return "Unknown";
    }
    
    /**
     * Check if feature is available offline
     */
    public boolean isFeatureAvailableOffline(String featureName) {
        switch (featureName.toLowerCase()) {
            case "camera":
            case "detector":
            case "magnetometer":
            case "object_detection":
            case "bluetooth":
            case "ir_blaster":
                return true;
                
            case "network_scanner":
            case "speed_test":
            case "device_discovery":
            case "wifi_scanner":
                return isWiFiConnected();
                
            default:
                return false;
        }
    }
    
    /**
     * Get offline availability message for feature
     */
    public String getOfflineMessage(String featureName) {
        if (isFeatureAvailableOffline(featureName)) {
            return null;
        }
        
        if (!isOnline()) {
            return "This feature requires internet connection. Please connect to WiFi or mobile data.";
        }
        
        if (featureName.equalsIgnoreCase("network_scanner") || 
            featureName.equalsIgnoreCase("device_discovery")) {
            return "This feature requires WiFi connection. Please connect to a WiFi network.";
        }
        
        return "This feature is not available offline.";
    }
}
