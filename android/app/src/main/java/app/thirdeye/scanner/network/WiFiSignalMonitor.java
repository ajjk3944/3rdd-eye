package app.thirdeye.scanner.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * WiFi Signal Monitor - Monitors WiFi signal strength in real-time
 * Provides data for live signal graph
 */
public class WiFiSignalMonitor {
    private static final String TAG = "WiFiSignalMonitor";
    private static final int UPDATE_INTERVAL_MS = 1000; // Update every second
    private static final int MAX_DATA_POINTS = 60; // Keep last 60 seconds
    
    private final Context context;
    private final WifiManager wifiManager;
    private final Handler handler;
    private final List<SignalDataPoint> signalHistory;
    private SignalCallback callback;
    private boolean isMonitoring = false;
    
    private BroadcastReceiver wifiReceiver;
    private Runnable updateRunnable;
    
    public interface SignalCallback {
        void onSignalUpdate(int signalStrength, int signalLevel, String ssid);
        void onSignalHistoryUpdate(List<SignalDataPoint> history);
    }
    
    public static class SignalDataPoint {
        public final long timestamp;
        public final int signalStrength; // dBm
        public final int signalLevel; // 0-4
        public final String ssid;
        
        public SignalDataPoint(long timestamp, int signalStrength, int signalLevel, String ssid) {
            this.timestamp = timestamp;
            this.signalStrength = signalStrength;
            this.signalLevel = signalLevel;
            this.ssid = ssid;
        }
    }
    
    public WiFiSignalMonitor(Context context) {
        this.context = context.getApplicationContext();
        this.wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        this.handler = new Handler(Looper.getMainLooper());
        this.signalHistory = new ArrayList<>();
    }
    
    public void setCallback(SignalCallback callback) {
        this.callback = callback;
    }
    
    public void startMonitoring() {
        if (isMonitoring) {
            Log.w(TAG, "Already monitoring");
            return;
        }
        
        isMonitoring = true;
        signalHistory.clear();
        
        // Register WiFi state receiver
        registerWifiReceiver();
        
        // Start periodic updates
        startPeriodicUpdates();
        
        Log.d(TAG, "Started monitoring WiFi signal");
    }
    
    public void stopMonitoring() {
        if (!isMonitoring) {
            return;
        }
        
        isMonitoring = false;
        
        // Unregister receiver
        unregisterWifiReceiver();
        
        // Stop periodic updates
        stopPeriodicUpdates();
        
        Log.d(TAG, "Stopped monitoring WiFi signal");
    }
    
    private void registerWifiReceiver() {
        wifiReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                updateSignalStrength();
            }
        };
        
        IntentFilter filter = new IntentFilter();
        filter.addAction(WifiManager.RSSI_CHANGED_ACTION);
        filter.addAction(WifiManager.NETWORK_STATE_CHANGED_ACTION);
        context.registerReceiver(wifiReceiver, filter);
    }
    
    private void unregisterWifiReceiver() {
        if (wifiReceiver != null) {
            try {
                context.unregisterReceiver(wifiReceiver);
            } catch (Exception e) {
                Log.e(TAG, "Error unregistering receiver", e);
            }
            wifiReceiver = null;
        }
    }
    
    private void startPeriodicUpdates() {
        updateRunnable = new Runnable() {
            @Override
            public void run() {
                if (isMonitoring) {
                    updateSignalStrength();
                    handler.postDelayed(this, UPDATE_INTERVAL_MS);
                }
            }
        };
        handler.post(updateRunnable);
    }
    
    private void stopPeriodicUpdates() {
        if (updateRunnable != null) {
            handler.removeCallbacks(updateRunnable);
            updateRunnable = null;
        }
    }
    
    private void updateSignalStrength() {
        if (wifiManager == null) {
            return;
        }
        
        try {
            WifiInfo wifiInfo = wifiManager.getConnectionInfo();
            if (wifiInfo == null) {
                return;
            }
            
            int rssi = wifiInfo.getRssi();
            int level = WifiManager.calculateSignalLevel(rssi, 5); // 0-4 scale
            String ssid = wifiInfo.getSSID();
            
            // Remove quotes from SSID
            if (ssid != null && ssid.startsWith("\"") && ssid.endsWith("\"")) {
                ssid = ssid.substring(1, ssid.length() - 1);
            }
            
            // Add to history
            SignalDataPoint dataPoint = new SignalDataPoint(
                System.currentTimeMillis(),
                rssi,
                level,
                ssid
            );
            
            synchronized (signalHistory) {
                signalHistory.add(dataPoint);
                
                // Keep only last MAX_DATA_POINTS
                while (signalHistory.size() > MAX_DATA_POINTS) {
                    signalHistory.remove(0);
                }
            }
            
            // Notify callback
            if (callback != null) {
                callback.onSignalUpdate(rssi, level, ssid);
                callback.onSignalHistoryUpdate(new ArrayList<>(signalHistory));
            }
            
        } catch (Exception e) {
            Log.e(TAG, "Error updating signal strength", e);
        }
    }
    
    public List<SignalDataPoint> getSignalHistory() {
        synchronized (signalHistory) {
            return new ArrayList<>(signalHistory);
        }
    }
    
    public boolean isMonitoring() {
        return isMonitoring;
    }
    
    /**
     * Get signal quality description
     */
    public static String getSignalQuality(int rssi) {
        if (rssi >= -50) {
            return "Excellent";
        } else if (rssi >= -60) {
            return "Good";
        } else if (rssi >= -70) {
            return "Fair";
        } else if (rssi >= -80) {
            return "Weak";
        } else {
            return "Very Weak";
        }
    }
    
    /**
     * Get signal percentage (0-100)
     */
    public static int getSignalPercentage(int rssi) {
        // Convert dBm to percentage
        // -30 dBm = 100%, -90 dBm = 0%
        int percentage = 2 * (rssi + 100);
        return Math.max(0, Math.min(100, percentage));
    }
}
