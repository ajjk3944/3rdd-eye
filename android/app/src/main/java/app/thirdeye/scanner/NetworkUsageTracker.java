package app.thirdeye.scanner;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.TrafficStats;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Tracks network data usage using Android APIs.
 *
 * TWO approaches used:
 * 1. TrafficStats (simple, real-time):
 *    - TrafficStats.getTotalRxBytes() / getTotalTxBytes() -- total device bytes
 *    - TrafficStats.getUidRxBytes(uid) / getUidTxBytes(uid) -- per-app bytes
 *    - These are CUMULATIVE since boot. Take snapshots and diff to get rate.
 *    - Does NOT survive reboots (resets to 0).
 *
 * 2. NetworkStatsManager (detailed, historical):
 *    - Requires PACKAGE_USAGE_STATS permission (user grants in Settings)
 *    - querySummaryForDevice() -- total usage for a time period
 *    - querySummary() -- per-UID (per-app) usage for a time period
 *    - Works across reboots, gives historical data
 *    - Available on Android 6.0+ (API 23+)
 */
public class NetworkUsageTracker {
    private static final String TAG = "NetworkUsageTracker";
    private Context context;
    private static NetworkUsageTracker instance;

    // For real-time speed calculation
    private long lastRxBytes = 0;
    private long lastTxBytes = 0;
    private long lastTimestamp = 0;

    public static synchronized NetworkUsageTracker getInstance(Context context) {
        if (instance == null) {
            instance = new NetworkUsageTracker(context.getApplicationContext());
        }
        return instance;
    }

    private NetworkUsageTracker(Context context) {
        this.context = context;
    }

    // ====== REAL-TIME SPEED ======
    /**
     * Get current download/upload speed in bytes per second.
     * Call this every 1-2 seconds and diff with previous values.
     */
    public JSONObject getCurrentSpeed() throws Exception {
        long currentRxBytes = TrafficStats.getTotalRxBytes();
        long currentTxBytes = TrafficStats.getTotalTxBytes();
        long currentTime = System.currentTimeMillis();

        double downloadSpeed = 0;
        double uploadSpeed = 0;

        if (lastTimestamp > 0 && currentTime > lastTimestamp) {
            double timeDiffSeconds = (currentTime - lastTimestamp) / 1000.0;
            if (timeDiffSeconds > 0) {
                downloadSpeed = (currentRxBytes - lastRxBytes) / timeDiffSeconds;
                uploadSpeed = (currentTxBytes - lastTxBytes) / timeDiffSeconds;
            }
        }

        lastRxBytes = currentRxBytes;
        lastTxBytes = currentTxBytes;
        lastTimestamp = currentTime;

        JSONObject result = new JSONObject();
        result.put("downloadSpeed", Math.max(0, downloadSpeed)); // bytes/sec
        result.put("uploadSpeed", Math.max(0, uploadSpeed));     // bytes/sec
        result.put("totalRxBytes", currentRxBytes);
        result.put("totalTxBytes", currentTxBytes);
        result.put("timestamp", currentTime);
        return result;
    }

    // ====== TOTAL USAGE FOR TIME PERIOD ======
    /**
     * Get total data usage for a time period (WiFi and Mobile separate).
     * Requires PACKAGE_USAGE_STATS permission.
     */
    public JSONObject getTotalUsage(long startTime, long endTime) throws Exception {
        NetworkStatsManager nsm = (NetworkStatsManager) context.getSystemService(Context.NETWORK_STATS_SERVICE);

        long wifiRx = 0, wifiTx = 0;
        long mobileRx = 0, mobileTx = 0;

        // WiFi usage
        try {
            NetworkStats.Bucket bucket = nsm.querySummaryForDevice(
                ConnectivityManager.TYPE_WIFI, null, startTime, endTime);
            if (bucket != null) {
                wifiRx = bucket.getRxBytes();
                wifiTx = bucket.getTxBytes();
            }
        } catch (Exception e) {
            Log.w(TAG, "Could not query WiFi stats: " + e.getMessage());
        }

        // Mobile data usage
        try {
            TelephonyManager tm = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
            String subscriberId = null;
            try {
                subscriberId = tm.getSubscriberId();
            } catch (SecurityException se) {
                // No permission for subscriber ID, skip mobile stats
            }

            if (subscriberId != null) {
                NetworkStats.Bucket bucket = nsm.querySummaryForDevice(
                    ConnectivityManager.TYPE_MOBILE, subscriberId, startTime, endTime);
                if (bucket != null) {
                    mobileRx = bucket.getRxBytes();
                    mobileTx = bucket.getTxBytes();
                }
            }
        } catch (Exception e) {
            Log.w(TAG, "Could not query mobile stats: " + e.getMessage());
        }

        JSONObject result = new JSONObject();
        result.put("wifiRx", wifiRx);
        result.put("wifiTx", wifiTx);
        result.put("wifiTotal", wifiRx + wifiTx);
        result.put("mobileRx", mobileRx);
        result.put("mobileTx", mobileTx);
        result.put("mobileTotal", mobileRx + mobileTx);
        result.put("totalRx", wifiRx + mobileRx);
        result.put("totalTx", wifiTx + mobileTx);
        result.put("grandTotal", wifiRx + wifiTx + mobileRx + mobileTx);
        result.put("startTime", startTime);
        result.put("endTime", endTime);
        return result;
    }

    // ====== PER-APP USAGE ======
    /**
     * Get data usage per app for a time period.
     * Returns sorted list (highest usage first).
     * Requires PACKAGE_USAGE_STATS permission.
     */
    public JSONArray getPerAppUsage(long startTime, long endTime) throws Exception {
        NetworkStatsManager nsm = (NetworkStatsManager) context.getSystemService(Context.NETWORK_STATS_SERVICE);
        PackageManager pm = context.getPackageManager();

        // Collect per-UID stats
        Map<Integer, long[]> uidStats = new HashMap<>(); // uid -> [rx, tx]

        // WiFi per-app stats
        try {
            NetworkStats stats = nsm.querySummary(
                ConnectivityManager.TYPE_WIFI, null, startTime, endTime);
            if (stats != null) {
                NetworkStats.Bucket bucket = new NetworkStats.Bucket();
                while (stats.hasNextBucket()) {
                    stats.getNextBucket(bucket);
                    int uid = bucket.getUid();
                    long[] existing = uidStats.getOrDefault(uid, new long[]{0, 0});
                    existing[0] += bucket.getRxBytes();
                    existing[1] += bucket.getTxBytes();
                    uidStats.put(uid, existing);
                }
                stats.close();
            }
        } catch (Exception e) {
            Log.w(TAG, "Could not query per-app WiFi stats: " + e.getMessage());
        }

        // Convert to app list
        List<JSONObject> appList = new ArrayList<>();
        for (Map.Entry<Integer, long[]> entry : uidStats.entrySet()) {
            int uid = entry.getKey();
            long rx = entry.getValue()[0];
            long tx = entry.getValue()[1];
            long total = rx + tx;

            if (total < 1024) continue; // Skip apps with less than 1KB usage

            String packageName = "unknown";
            String appName = "Unknown";

            // Get app name from UID
            String[] packages = pm.getPackagesForUid(uid);
            if (packages != null && packages.length > 0) {
                packageName = packages[0];
                try {
                    ApplicationInfo appInfo = pm.getApplicationInfo(packageName, 0);
                    appName = pm.getApplicationLabel(appInfo).toString();
                } catch (PackageManager.NameNotFoundException ignored) {
                }
            } else if (uid < 10000) {
                appName = "Android System";
                packageName = "android.system";
            }

            JSONObject app = new JSONObject();
            app.put("uid", uid);
            app.put("packageName", packageName);
            app.put("appName", appName);
            app.put("rxBytes", rx);
            app.put("txBytes", tx);
            app.put("totalBytes", total);
            appList.add(app);
        }

        // Sort by total bytes descending
        Collections.sort(appList, (a, b) -> {
            try {
                return Long.compare(b.getLong("totalBytes"), a.getLong("totalBytes"));
            } catch (Exception e) {
                return 0;
            }
        });

        JSONArray result = new JSONArray();
        for (JSONObject app : appList) {
            result.put(app);
        }
        return result;
    }

    // ====== PERMISSION CHECK ======
    /**
     * Check if PACKAGE_USAGE_STATS permission is granted.
     * This is required for NetworkStatsManager.
     */
    public boolean hasUsageStatsPermission() {
        try {
            android.app.AppOpsManager appOps = (android.app.AppOpsManager)
                context.getSystemService(Context.APP_OPS_SERVICE);
            int mode = appOps.checkOpNoThrow(
                android.app.AppOpsManager.OPSTR_GET_USAGE_STATS,
                android.os.Process.myUid(),
                context.getPackageName());
            return mode == android.app.AppOpsManager.MODE_ALLOWED;
        } catch (Exception e) {
            return false;
        }
    }
}
