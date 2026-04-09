package app.thirdeye.scanner.routerguard;

import android.content.Context;
import android.content.SharedPreferences;

public class GuardPreferences {
    private static final String PREF_NAME = "thirdeye_guard_prefs";
    
    // Keys
    private static final String KEY_MONITORING_ENABLED = "monitoring_enabled";
    private static final String KEY_SCAN_INTERVAL = "scan_interval_ms";
    private static final String KEY_NOTIFY_NEW_DEVICE = "notify_new_device";
    private static final String KEY_NOTIFY_RETURNING_DEVICE = "notify_returning_device";
    private static final String KEY_NOTIFY_SUSPICIOUS = "notify_suspicious";
    private static final String KEY_AUTO_START_ON_BOOT = "auto_start_on_boot";
    private static final String KEY_LAST_SCAN_TIME = "last_scan_time";
    
    // Defaults
    private static final int DEFAULT_SCAN_INTERVAL = 30000; // 30 seconds
    
    private SharedPreferences prefs;
    
    public GuardPreferences(Context context) {
        prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }
    
    public boolean isMonitoringEnabled() {
        return prefs.getBoolean(KEY_MONITORING_ENABLED, false);
    }
    
    public void setMonitoringEnabled(boolean enabled) {
        prefs.edit().putBoolean(KEY_MONITORING_ENABLED, enabled).apply();
    }
    
    public int getScanInterval() {
        return prefs.getInt(KEY_SCAN_INTERVAL, DEFAULT_SCAN_INTERVAL);
    }
    
    public void setScanInterval(int intervalMs) {
        prefs.edit().putInt(KEY_SCAN_INTERVAL, intervalMs).apply();
    }
    
    public boolean shouldNotifyNewDevice() {
        return prefs.getBoolean(KEY_NOTIFY_NEW_DEVICE, true);
    }
    
    public void setNotifyNewDevice(boolean notify) {
        prefs.edit().putBoolean(KEY_NOTIFY_NEW_DEVICE, notify).apply();
    }
    
    public boolean shouldNotifyReturningDevice() {
        return prefs.getBoolean(KEY_NOTIFY_RETURNING_DEVICE, false);
    }
    
    public void setNotifyReturningDevice(boolean notify) {
        prefs.edit().putBoolean(KEY_NOTIFY_RETURNING_DEVICE, notify).apply();
    }
    
    public boolean shouldNotifySuspicious() {
        return prefs.getBoolean(KEY_NOTIFY_SUSPICIOUS, true);
    }
    
    public void setNotifySuspicious(boolean notify) {
        prefs.edit().putBoolean(KEY_NOTIFY_SUSPICIOUS, notify).apply();
    }
    
    public boolean isAutoStartOnBoot() {
        return prefs.getBoolean(KEY_AUTO_START_ON_BOOT, true);
    }
    
    public void setAutoStartOnBoot(boolean autoStart) {
        prefs.edit().putBoolean(KEY_AUTO_START_ON_BOOT, autoStart).apply();
    }
    
    public long getLastScanTime() {
        return prefs.getLong(KEY_LAST_SCAN_TIME, 0);
    }
    
    public void setLastScanTime(long timestamp) {
        prefs.edit().putLong(KEY_LAST_SCAN_TIME, timestamp).apply();
    }
}
