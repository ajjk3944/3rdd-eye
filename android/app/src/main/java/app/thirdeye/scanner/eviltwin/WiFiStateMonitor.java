package app.thirdeye.scanner.eviltwin;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import androidx.core.app.NotificationCompat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WiFiStateMonitor extends BroadcastReceiver {
    private static final String CHANNEL_ID = "evil_twin_alerts";
    private static final String PREFS_NAME = "evil_twin_prefs";
    private static final String PREF_LAST_SSID = "last_ssid";
    private static final String PREF_LAST_BSSID = "last_bssid";
    private static final int NOTIFICATION_ID_SAFE = 1001;
    private static final int NOTIFICATION_ID_WARNING = 1002;
    private static final int NOTIFICATION_ID_DANGER = 1003;

    private static ExecutorService executorService = Executors.newSingleThreadExecutor();

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();

        if (WifiManager.NETWORK_STATE_CHANGED_ACTION.equals(action)) {
            NetworkInfo networkInfo = intent.getParcelableExtra(WifiManager.EXTRA_NETWORK_INFO);
            
            if (networkInfo != null && networkInfo.isConnected() && 
                networkInfo.getType() == ConnectivityManager.TYPE_WIFI) {
                
                // WiFi connected - check if it's a new connection
                WifiManager wifiManager = (WifiManager) context.getApplicationContext()
                    .getSystemService(Context.WIFI_SERVICE);
                WifiInfo wifiInfo = wifiManager.getConnectionInfo();
                
                if (wifiInfo != null) {
                    String ssid = wifiInfo.getSSID().replace("\"", "");
                    String bssid = wifiInfo.getBSSID();
                    
                    // Check if this is a new connection
                    SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
                    String lastSSID = prefs.getString(PREF_LAST_SSID, "");
                    String lastBSSID = prefs.getString(PREF_LAST_BSSID, "");
                    
                    if (!ssid.equals(lastSSID) || !bssid.equals(lastBSSID)) {
                        // New connection detected - run scan
                        prefs.edit()
                            .putString(PREF_LAST_SSID, ssid)
                            .putString(PREF_LAST_BSSID, bssid)
                            .apply();
                        
                        runBackgroundScan(context, ssid, bssid);
                    }
                }
            } else if (networkInfo != null && !networkInfo.isConnected()) {
                // WiFi disconnected - clear state
                SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
                prefs.edit()
                    .remove(PREF_LAST_SSID)
                    .remove(PREF_LAST_BSSID)
                    .apply();
                
                // Cancel any existing notifications
                NotificationManager notificationManager = 
                    (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
                notificationManager.cancel(NOTIFICATION_ID_SAFE);
                notificationManager.cancel(NOTIFICATION_ID_WARNING);
                notificationManager.cancel(NOTIFICATION_ID_DANGER);
            }
        }
    }

    private void runBackgroundScan(Context context, String ssid, String bssid) {
        executorService.execute(() -> {
            try {
                EvilTwinDetector detector = new EvilTwinDetector(context);
                EvilTwinDetector.EvilTwinScanResult result = detector.runQuickScan();
                
                // Show notification based on result
                showNotification(context, result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    private void showNotification(Context context, EvilTwinDetector.EvilTwinScanResult result) {
        createNotificationChannel(context);
        
        NotificationManager notificationManager = 
            (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        
        // Cancel previous notifications
        notificationManager.cancel(NOTIFICATION_ID_SAFE);
        notificationManager.cancel(NOTIFICATION_ID_WARNING);
        notificationManager.cancel(NOTIFICATION_ID_DANGER);
        
        // Create intent to open app
        Intent appIntent = context.getPackageManager()
            .getLaunchIntentForPackage(context.getPackageName());
        if (appIntent != null) {
            appIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        }
        PendingIntent pendingIntent = PendingIntent.getActivity(
            context, 0, appIntent, 
            PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE
        );
        
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID);
        
        int notificationId;
        int color;
        int priority;
        
        if (result.threatScore < 20) {
            // SAFE
            notificationId = NOTIFICATION_ID_SAFE;
            color = 0xFF4CAF50; // Green
            priority = NotificationCompat.PRIORITY_LOW;
            
            builder.setSmallIcon(android.R.drawable.ic_dialog_info)
                .setContentTitle("Network Secure")
                .setContentText("'" + result.ssid + "' passed all security checks")
                .setColor(color)
                .setPriority(priority)
                .setAutoCancel(true)
                .setTimeoutAfter(10000); // Auto-dismiss after 10 seconds
                
        } else if (result.threatScore < 60) {
            // LOW/MEDIUM RISK
            notificationId = NOTIFICATION_ID_WARNING;
            color = 0xFFFFC107; // Amber
            priority = NotificationCompat.PRIORITY_DEFAULT;
            
            int issueCount = result.indicators.size();
            builder.setSmallIcon(android.R.drawable.ic_dialog_alert)
                .setContentTitle("WiFi Security Warning")
                .setContentText(issueCount + " potential issue(s) found on '" + result.ssid + "'")
                .setColor(color)
                .setPriority(priority)
                .setAutoCancel(true)
                .setContentIntent(pendingIntent);
                
        } else {
            // HIGH RISK / CRITICAL
            notificationId = NOTIFICATION_ID_DANGER;
            color = 0xFFF44336; // Red
            priority = NotificationCompat.PRIORITY_HIGH;
            
            builder.setSmallIcon(android.R.drawable.ic_dialog_alert)
                .setContentTitle("DANGER: Possible Evil Twin Detected!")
                .setContentText("'" + result.ssid + "' may be a fake/malicious hotspot. Threat: " + 
                    result.threatScore + "/100")
                .setColor(color)
                .setPriority(priority)
                .setAutoCancel(true)
                .setContentIntent(pendingIntent)
                .setDefaults(NotificationCompat.DEFAULT_ALL);
            
            // Add disconnect action
            Intent disconnectIntent = new Intent(context, WiFiDisconnectReceiver.class);
            PendingIntent disconnectPendingIntent = PendingIntent.getBroadcast(
                context, 0, disconnectIntent,
                PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE
            );
            builder.addAction(android.R.drawable.ic_delete, "Disconnect WiFi", disconnectPendingIntent);
            
            // Add view details action
            builder.addAction(android.R.drawable.ic_menu_info_details, "View Details", pendingIntent);
        }
        
        notificationManager.notify(notificationId, builder.build());
    }

    private void createNotificationChannel(Context context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(
                CHANNEL_ID,
                "Evil Twin Alerts",
                NotificationManager.IMPORTANCE_HIGH
            );
            channel.setDescription("Alerts for potential evil twin / rogue WiFi access points");
            
            NotificationManager notificationManager = 
                context.getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }

    // Separate receiver for disconnect action
    public static class WiFiDisconnectReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            disconnectWiFi(context);
        }
    }

    public static void disconnectWiFi(Context context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // Android 10+ - cannot programmatically disconnect
            // Show notification to go to settings
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID)
                .setSmallIcon(android.R.drawable.ic_dialog_info)
                .setContentTitle("Manual Disconnect Required")
                .setContentText("Tap to open WiFi settings and disconnect manually")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true);
            
            Intent settingsIntent = new Intent(Settings.ACTION_WIFI_SETTINGS);
            settingsIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            PendingIntent pendingIntent = PendingIntent.getActivity(
                context, 0, settingsIntent,
                PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE
            );
            builder.setContentIntent(pendingIntent);
            
            NotificationManager notificationManager = 
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
            notificationManager.notify(9999, builder.build());
            
        } else {
            // Android 9 and below - can disconnect programmatically
            WifiManager wifiManager = (WifiManager) context.getApplicationContext()
                .getSystemService(Context.WIFI_SERVICE);
            wifiManager.disconnect();
        }
    }
}
