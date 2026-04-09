package app.thirdeye.scanner.routerguard;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.util.Log;

import androidx.core.app.NotificationCompat;

import com.getcapacitor.JSObject;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import app.thirdeye.scanner.MainActivity;
import app.thirdeye.scanner.R;

public class NetworkGuardService extends Service {
    private static final String TAG = "NetworkGuardService";
    
    // Notification constants
    private static final int NOTIFICATION_ID = 3001;
    private static final String CHANNEL_ID = "thirdeye_network_guard";
    private static final String CHANNEL_NAME = "Network Guard";
    private static final String ALERT_CHANNEL_ID = "thirdeye_device_alerts";
    private static final String ALERT_CHANNEL_NAME = "Device Alerts";
    
    // Scan interval constants
    private static final int DEFAULT_SCAN_INTERVAL_MS = 30000; // 30 seconds
    private static final int MIN_SCAN_INTERVAL_MS = 10000;     // 10 seconds
    private static final int MAX_SCAN_INTERVAL_MS = 300000;    // 5 minutes
    
    // Broadcast actions
    public static final String ACTION_DEVICE_LIST_UPDATED = "app.thirdeye.DEVICE_LIST_UPDATED";
    public static final String ACTION_NEW_DEVICE_DETECTED = "app.thirdeye.NEW_DEVICE_DETECTED";
    public static final String ACTION_DEVICE_WENT_OFFLINE = "app.thirdeye.DEVICE_WENT_OFFLINE";
    public static final String ACTION_SCAN_COMPLETED = "app.thirdeye.SCAN_COMPLETED";
    
    // State
    private boolean isRunning = false;
    private int scanIntervalMs = DEFAULT_SCAN_INTERVAL_MS;
    private Handler scanHandler;
    private HandlerThread handlerThread;
    private RouterDeviceFetcher deviceFetcher;
    private DeviceHistoryDatabase deviceDb;
    private RouterCredentialDatabase credentialDb;
    private MACVendorResolver macResolver;
    private GuardPreferences preferences;
    private Set<String> lastScanDevices;
    private NotificationManager notificationManager;
    
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "NetworkGuardService created");
        
        // Initialize components
        deviceFetcher = new RouterDeviceFetcher();
        deviceDb = DeviceHistoryDatabase.getInstance(this);
        credentialDb = RouterCredentialDatabase.getInstance(this);
        macResolver = MACVendorResolver.getInstance();
        preferences = new GuardPreferences(this);
        lastScanDevices = new HashSet<>();
        notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        
        // Create notification channels
        createNotificationChannels();
        
        // Initialize background thread
        handlerThread = new HandlerThread("NetworkGuardThread");
        handlerThread.start();
        scanHandler = new Handler(handlerThread.getLooper());
    }
    
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (intent == null) {
            return START_STICKY;
        }
        
        String action = intent.getStringExtra("action");
        if (action == null) action = "start";
        
        switch (action) {
            case "start":
                int interval = intent.getIntExtra("interval", DEFAULT_SCAN_INTERVAL_MS);
                startMonitoring(interval);
                break;
            case "stop":
                stopMonitoring();
                stopSelf();
                break;
            case "update_interval":
                int newInterval = intent.getIntExtra("interval", DEFAULT_SCAN_INTERVAL_MS);
                updateScanInterval(newInterval);
                break;
        }
        
        return START_STICKY;
    }
    
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "NetworkGuardService destroyed");
        
        stopMonitoring();
        
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        
        // Mark all devices offline
        deviceDb.setAllDevicesOffline();
    }
    
    @Override
    public IBinder onBind(Intent intent) {
        return null; // Not a bound service
    }
    
    private void startMonitoring(int intervalMs) {
        if (isRunning) {
            Log.d(TAG, "Monitoring already running");
            return;
        }
        
        // Validate interval
        scanIntervalMs = Math.max(MIN_SCAN_INTERVAL_MS, Math.min(MAX_SCAN_INTERVAL_MS, intervalMs));
        
        // Start foreground service
        Notification notification = buildPersistentNotification(0, 0);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            startForeground(NOTIFICATION_ID, notification, android.content.pm.ServiceInfo.FOREGROUND_SERVICE_TYPE_CONNECTED_DEVICE);
        } else {
            startForeground(NOTIFICATION_ID, notification);
        }
        
        isRunning = true;
        preferences.setMonitoringEnabled(true);
        preferences.setScanInterval(scanIntervalMs);
        
        // Start scanning
        scanHandler.post(scanRunnable);
        
        Log.d(TAG, "Monitoring started with interval: " + scanIntervalMs + "ms");
    }
    
    private void stopMonitoring() {
        if (!isRunning) {
            return;
        }
        
        isRunning = false;
        preferences.setMonitoringEnabled(false);
        
        // Stop scanning
        scanHandler.removeCallbacks(scanRunnable);
        
        // Stop foreground
        stopForeground(true);
        
        Log.d(TAG, "Monitoring stopped");
    }
    
    private void updateScanInterval(int intervalMs) {
        scanIntervalMs = Math.max(MIN_SCAN_INTERVAL_MS, Math.min(MAX_SCAN_INTERVAL_MS, intervalMs));
        preferences.setScanInterval(scanIntervalMs);
        
        if (isRunning) {
            // Restart scan timer with new interval
            scanHandler.removeCallbacks(scanRunnable);
            scanHandler.post(scanRunnable);
        }
        
        Log.d(TAG, "Scan interval updated to: " + scanIntervalMs + "ms");
    }
    
    private Runnable scanRunnable = new Runnable() {
        @Override
        public void run() {
            long startTime = System.currentTimeMillis();
            performScan();
            long duration = System.currentTimeMillis() - startTime;
            
            // Broadcast scan completed
            Intent intent = new Intent(ACTION_SCAN_COMPLETED);
            intent.putExtra("onlineCount", deviceDb.getOnlineDevices().size());
            intent.putExtra("duration", duration);
            sendBroadcast(intent);
            
            // Schedule next scan
            if (isRunning) {
                scanHandler.postDelayed(this, scanIntervalMs);
            }
        }
    };
    
    private void performScan() {
        Log.d(TAG, "=== Performing network scan ===");
        
        try {
            // Get active router credentials
            JSObject activeRouter = credentialDb.getActiveCredentials();
            RouterDeviceFetcher.FetchResult result;
            
            if (activeRouter != null) {
                String routerIp = activeRouter.getString("routerIp");
                String username = activeRouter.getString("username");
                String brand = activeRouter.getString("brand");
                String password = credentialDb.getActivePassword();
                
                Log.d(TAG, "Router configured: IP=" + routerIp + ", Brand=" + brand);
                
                if (password != null) {
                    result = deviceFetcher.fetchDevices(routerIp, username, password, brand);
                    Log.d(TAG, "Router fetch result: success=" + result.success + ", method=" + result.method + ", devices=" + result.devices.size());
                } else {
                    Log.w(TAG, "No password found, falling back to ARP scan");
                    result = deviceFetcher.tryARPScan("");
                }
            } else {
                // No credentials, use ARP scan
                Log.d(TAG, "No router configured, using ARP scan");
                result = deviceFetcher.tryARPScan("");
            }
            
            if (!result.success || result.devices.isEmpty()) {
                Log.w(TAG, "No devices found! Trying ARP fallback...");
                // ALWAYS try ARP scan as final fallback
                result = deviceFetcher.tryARPScan("");
                Log.d(TAG, "ARP fallback result: success=" + result.success + ", devices=" + result.devices.size());
            }
            
            // ALWAYS update last scan time, even if no devices found
            preferences.setLastScanTime(System.currentTimeMillis());
            
            if (!result.success || result.devices.isEmpty()) {
                Log.d(TAG, "Scan completed with 0 devices found");
                // Still broadcast scan completed
                Intent intent = new Intent(ACTION_SCAN_COMPLETED);
                intent.putExtra("onlineCount", 0);
                intent.putExtra("newCount", 0);
                intent.putExtra("timestamp", System.currentTimeMillis());
                sendBroadcast(intent);
                return;
            }
            
            Log.d(TAG, "Fetched " + result.devices.size() + " devices using method: " + result.method);
            
            // Current scan device MACs
            Set<String> currentScanDevices = new HashSet<>();
            int newDevicesCount = 0;
            
            for (RouterDeviceFetcher.RouterDevice device : result.devices) {
                currentScanDevices.add(device.macAddress);
                
                // Check if device exists in database
                JSObject existingDevice = deviceDb.getDevice(device.macAddress);
                boolean isNew = (existingDevice == null);
                boolean wasOffline = existingDevice != null && !existingDevice.getBoolean("isOnline");
                
                // Resolve vendor
                String vendor = macResolver.resolve(device.macAddress);
                String deviceType = macResolver.guessDeviceType(vendor);
                
                // Add or update device
                deviceDb.addOrUpdateDevice(device.macAddress, device.hostname, device.ipAddress, vendor, deviceType);
                
                // Log session
                deviceDb.logSession(device.macAddress, device.ipAddress, System.currentTimeMillis());
                
                if (isNew) {
                    // NEW DEVICE
                    newDevicesCount++;
                    Log.d(TAG, "New device detected: " + device.macAddress + " (" + vendor + ")");
                    handleNewDevice(device, vendor);
                } else if (wasOffline) {
                    // RETURNING DEVICE
                    Log.d(TAG, "Device reconnected: " + device.macAddress);
                    handleReturningDevice(device, existingDevice);
                }
            }
            
            // Check for devices that went offline
            for (String mac : lastScanDevices) {
                if (!currentScanDevices.contains(mac)) {
                    handleDeviceWentOffline(mac);
                }
            }
            
            // Update last scan devices
            lastScanDevices = currentScanDevices;
            preferences.setLastScanTime(System.currentTimeMillis());
            
            // ====== THREAT DETECTION (Part 4) ======
            // Run threat analysis on all online devices
            ThreatDetector detector = ThreatDetector.getInstance(NetworkGuardService.this);
            List<ThreatDetector.ThreatReport> reports = detector.analyzeAllDevices();
            
            // Save reports to ThreatDatabase
            ThreatDatabase threatDb = ThreatDatabase.getInstance(NetworkGuardService.this);
            int highThreatCount = 0;
            
            for (ThreatDetector.ThreatReport report : reports) {
                threatDb.saveThreatReport(report);
                threatDb.recordThreatScore(report.macAddress, report.threatScore);
                
                // If HIGH or CRITICAL threat detected -> send notification
                if (report.overallThreatLevel >= ThreatDetector.THREAT_HIGH) {
                    highThreatCount++;
                    sendThreatNotification(report);
                }
            }
            
            // Save network snapshot
            int onlineCount = deviceDb.getOnlineDevices().size();
            int trustedCount = deviceDb.getTrustedDevices().size();
            int untrustedCount = deviceDb.getUntrustedDevices().size();
            int threatCount = (int) reports.stream().filter(r -> r.threatScore > 30).count();
            threatDb.saveNetworkSnapshot(onlineCount, trustedCount, untrustedCount, threatCount);
            
            // Update persistent notification
            updatePersistentNotification(onlineCount, trustedCount);
            
            // Broadcast device list updated
            Intent intent = new Intent(ACTION_DEVICE_LIST_UPDATED);
            intent.putExtra("onlineCount", onlineCount);
            intent.putExtra("newCount", newDevicesCount);
            intent.putExtra("timestamp", System.currentTimeMillis());
            sendBroadcast(intent);
            
            Log.d(TAG, "Scan completed: " + onlineCount + " devices online, " + newDevicesCount + " new");
            
        } catch (Exception e) {
            Log.e(TAG, "Error during scan: " + e.getMessage(), e);
        }
    }
    
    private void handleNewDevice(RouterDeviceFetcher.RouterDevice device, String vendor) {
        Log.d(TAG, "New device detected: " + device.macAddress);
        
        // Send notification if enabled
        if (preferences.shouldNotifyNewDevice()) {
            sendNewDeviceNotification(device.macAddress, vendor, device.ipAddress);
        }
        
        // Broadcast
        Intent intent = new Intent(ACTION_NEW_DEVICE_DETECTED);
        intent.putExtra("macAddress", device.macAddress);
        intent.putExtra("vendor", vendor);
        intent.putExtra("ipAddress", device.ipAddress);
        sendBroadcast(intent);
    }
    
    private void handleReturningDevice(RouterDeviceFetcher.RouterDevice device, JSObject existingDevice) {
        Log.d(TAG, "Device reconnected: " + device.macAddress);
        
        int trustLevel = existingDevice.getInteger("isTrusted");
        
        // If device is blocked/suspicious, send warning
        if (trustLevel == -1 && preferences.shouldNotifySuspicious()) {
            String vendor = existingDevice.getString("vendor");
            sendSuspiciousDeviceNotification(device.macAddress, vendor, "Blocked device attempting to connect");
        } else if (preferences.shouldNotifyReturningDevice()) {
            // Optional: notify for returning trusted devices
            String deviceName = existingDevice.getString("customName");
            if (deviceName == null || deviceName.isEmpty()) {
                deviceName = existingDevice.getString("deviceName");
            }
            // Could send a low-priority notification here
        }
    }
    
    private void handleDeviceWentOffline(String macAddress) {
        Log.d(TAG, "Device went offline: " + macAddress);
        
        deviceDb.setDeviceOffline(macAddress);
        
        // Broadcast
        JSObject device = deviceDb.getDevice(macAddress);
        if (device != null) {
            Intent intent = new Intent(ACTION_DEVICE_WENT_OFFLINE);
            intent.putExtra("macAddress", macAddress);
            intent.putExtra("deviceName", device.getString("deviceName"));
            sendBroadcast(intent);
        }
    }
    
    private void createNotificationChannels() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            // Persistent notification channel (low importance)
            NotificationChannel persistentChannel = new NotificationChannel(
                CHANNEL_ID,
                CHANNEL_NAME,
                NotificationManager.IMPORTANCE_LOW
            );
            persistentChannel.setDescription("Network monitoring status");
            persistentChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(persistentChannel);
            
            // Alert notification channel (high importance)
            NotificationChannel alertChannel = new NotificationChannel(
                ALERT_CHANNEL_ID,
                ALERT_CHANNEL_NAME,
                NotificationManager.IMPORTANCE_HIGH
            );
            alertChannel.setDescription("New device alerts");
            alertChannel.enableVibration(true);
            alertChannel.enableLights(true);
            alertChannel.setLightColor(android.graphics.Color.RED);
            notificationManager.createNotificationChannel(alertChannel);
        }
    }
    
    private Notification buildPersistentNotification(int onlineDevices, int trustedDevices) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 
            PendingIntent.FLAG_IMMUTABLE | PendingIntent.FLAG_UPDATE_CURRENT);
        
        // Stop action
        Intent stopIntent = new Intent(this, NetworkGuardReceiver.class);
        stopIntent.setAction("app.thirdeye.action.STOP_MONITORING");
        PendingIntent stopPendingIntent = PendingIntent.getBroadcast(this, 0, stopIntent, 
            PendingIntent.FLAG_IMMUTABLE | PendingIntent.FLAG_UPDATE_CURRENT);
        
        String contentText = onlineDevices > 0 
            ? onlineDevices + " devices online" 
            : "Scanning...";
        
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(android.R.drawable.ic_menu_info_details)
            .setContentTitle("Network Guard Active")
            .setContentText(contentText)
            .setContentIntent(pendingIntent)
            .setOngoing(true)
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .addAction(android.R.drawable.ic_menu_close_clear_cancel, "Stop", stopPendingIntent);
        
        return builder.build();
    }
    
    private void updatePersistentNotification(int onlineDevices, int trustedDevices) {
        Notification notification = buildPersistentNotification(onlineDevices, trustedDevices);
        notificationManager.notify(NOTIFICATION_ID, notification);
    }
    
    private void sendNewDeviceNotification(String macAddress, String vendor, String ipAddress) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.putExtra("openDevice", macAddress);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, macAddress.hashCode(), intent, 
            PendingIntent.FLAG_IMMUTABLE | PendingIntent.FLAG_UPDATE_CURRENT);
        
        // Trust action
        Intent trustIntent = new Intent(this, NetworkGuardReceiver.class);
        trustIntent.setAction("app.thirdeye.action.TRUST_DEVICE");
        trustIntent.putExtra("mac_address", macAddress);
        PendingIntent trustPendingIntent = PendingIntent.getBroadcast(this, macAddress.hashCode() + 1, trustIntent, 
            PendingIntent.FLAG_IMMUTABLE | PendingIntent.FLAG_UPDATE_CURRENT);
        
        String title = "New Device Detected!";
        String body = "Unknown device connected to your WiFi\n" +
                     (vendor.equals("Unknown") ? "" : vendor + " | ") +
                     "MAC: " + macAddress + "\n" +
                     "IP: " + ipAddress;
        
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, ALERT_CHANNEL_ID)
            .setSmallIcon(android.R.drawable.ic_dialog_alert)
            .setContentTitle(title)
            .setContentText(body)
            .setStyle(new NotificationCompat.BigTextStyle().bigText(body))
            .setContentIntent(pendingIntent)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setAutoCancel(true)
            .setVibrate(new long[]{0, 500, 250, 500})
            .setLights(android.graphics.Color.RED, 1000, 1000)
            .addAction(android.R.drawable.ic_input_add, "Trust", trustPendingIntent);
        
        notificationManager.notify(macAddress.hashCode(), builder.build());
    }
    
    private void sendSuspiciousDeviceNotification(String macAddress, String vendor, String reason) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.putExtra("openDevice", macAddress);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, macAddress.hashCode() + 2, intent, 
            PendingIntent.FLAG_IMMUTABLE | PendingIntent.FLAG_UPDATE_CURRENT);
        
        String title = "⚠️ Suspicious Device Alert!";
        String body = "A blocked device is trying to connect\n" +
                     (vendor.equals("Unknown") ? "" : vendor + " | ") +
                     macAddress;
        
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, ALERT_CHANNEL_ID)
            .setSmallIcon(android.R.drawable.ic_dialog_alert)
            .setContentTitle(title)
            .setContentText(body)
            .setStyle(new NotificationCompat.BigTextStyle().bigText(body))
            .setContentIntent(pendingIntent)
            .setPriority(NotificationCompat.PRIORITY_MAX)
            .setAutoCancel(true)
            .setVibrate(new long[]{0, 1000, 500, 1000})
            .setLights(android.graphics.Color.RED, 500, 500)
            .setColor(android.graphics.Color.RED);
        
        notificationManager.notify(macAddress.hashCode() + 1000, builder.build());
    }
    
    private void sendThreatNotification(ThreatDetector.ThreatReport report) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.putExtra("openDevice", report.macAddress);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, report.macAddress.hashCode() + 3, intent, 
            PendingIntent.FLAG_IMMUTABLE | PendingIntent.FLAG_UPDATE_CURRENT);
        
        String title = report.overallThreatLevel == ThreatDetector.THREAT_CRITICAL 
            ? "🔴 CRITICAL Security Threat!" 
            : "🚨 Security Threat Detected";
        
        String body = report.summary;
        if (body.length() > 100) {
            body = body.substring(0, 97) + "...";
        }
        
        int color = report.overallThreatLevel == ThreatDetector.THREAT_CRITICAL 
            ? android.graphics.Color.RED 
            : 0xFFFF6B00; // Orange
        
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, ALERT_CHANNEL_ID)
            .setSmallIcon(android.R.drawable.ic_dialog_alert)
            .setContentTitle(title)
            .setContentText(body)
            .setStyle(new NotificationCompat.BigTextStyle().bigText(report.summary))
            .setContentIntent(pendingIntent)
            .setPriority(NotificationCompat.PRIORITY_MAX)
            .setAutoCancel(true)
            .setVibrate(new long[]{0, 1000, 500, 1000, 500, 1000})
            .setLights(color, 500, 500)
            .setColor(color);
        
        notificationManager.notify(report.macAddress.hashCode() + 2000, builder.build());
    }
    
    public static boolean isServiceRunning(Context context) {
        android.app.ActivityManager manager = (android.app.ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        for (android.app.ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {
            if (NetworkGuardService.class.getName().equals(service.service.getClassName())) {
                return true;
            }
        }
        return false;
    }
}
