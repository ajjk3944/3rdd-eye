package app.thirdeye.scanner.routerguard;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

public class NetworkGuardReceiver extends BroadcastReceiver {
    private static final String TAG = "NetworkGuardReceiver";
    
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) return;
        
        Log.d(TAG, "Received action: " + action);
        
        switch (action) {
            case Intent.ACTION_BOOT_COMPLETED:
                handleBootCompleted(context);
                break;
                
            case ConnectivityManager.CONNECTIVITY_ACTION:
            case "android.net.wifi.STATE_CHANGE":
                handleConnectivityChange(context);
                break;
                
            case "app.thirdeye.action.TRUST_DEVICE":
                handleTrustDevice(context, intent);
                break;
                
            case "app.thirdeye.action.STOP_MONITORING":
                handleStopMonitoring(context);
                break;
        }
    }
    
    private void handleBootCompleted(Context context) {
        Log.d(TAG, "Device booted");
        
        GuardPreferences preferences = new GuardPreferences(context);
        
        // Check if monitoring was enabled and auto-start is enabled
        if (preferences.isMonitoringEnabled() && preferences.isAutoStartOnBoot()) {
            Log.d(TAG, "Auto-starting monitoring service");
            
            Intent serviceIntent = new Intent(context, NetworkGuardService.class);
            serviceIntent.putExtra("action", "start");
            serviceIntent.putExtra("interval", preferences.getScanInterval());
            
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                context.startForegroundService(serviceIntent);
            } else {
                context.startService(serviceIntent);
            }
        }
    }
    
    private void handleConnectivityChange(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        
        if (activeNetwork != null && activeNetwork.getType() == ConnectivityManager.TYPE_WIFI) {
            if (activeNetwork.isConnected()) {
                Log.d(TAG, "WiFi connected");
                
                // If monitoring is enabled, trigger immediate scan
                GuardPreferences preferences = new GuardPreferences(context);
                if (preferences.isMonitoringEnabled()) {
                    // Service should already be running, but ensure it's started
                    if (!NetworkGuardService.isServiceRunning(context)) {
                        Intent serviceIntent = new Intent(context, NetworkGuardService.class);
                        serviceIntent.putExtra("action", "start");
                        serviceIntent.putExtra("interval", preferences.getScanInterval());
                        
                        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                            context.startForegroundService(serviceIntent);
                        } else {
                            context.startService(serviceIntent);
                        }
                    }
                }
            } else {
                Log.d(TAG, "WiFi disconnected");
                // Optionally pause scanning when WiFi is disconnected
            }
        }
    }
    
    private void handleTrustDevice(Context context, Intent intent) {
        String macAddress = intent.getStringExtra("mac_address");
        if (macAddress == null) return;
        
        Log.d(TAG, "Trusting device: " + macAddress);
        
        // Mark device as trusted
        DeviceHistoryDatabase deviceDb = DeviceHistoryDatabase.getInstance(context);
        deviceDb.setDeviceTrust(macAddress, 1);
        
        // Dismiss notification
        android.app.NotificationManager notificationManager = 
            (android.app.NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.cancel(macAddress.hashCode());
        
        // Show toast
        android.widget.Toast.makeText(context, "Device marked as trusted", android.widget.Toast.LENGTH_SHORT).show();
    }
    
    private void handleStopMonitoring(Context context) {
        Log.d(TAG, "Stopping monitoring service");
        
        Intent serviceIntent = new Intent(context, NetworkGuardService.class);
        serviceIntent.putExtra("action", "stop");
        context.startService(serviceIntent);
    }
}
