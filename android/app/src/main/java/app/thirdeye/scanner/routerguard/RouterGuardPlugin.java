package app.thirdeye.scanner.routerguard;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@CapacitorPlugin(name = "RouterGuard")
public class RouterGuardPlugin extends Plugin {
    
    private static final String TAG = "RouterGuardPlugin";
    
    private RouterCredentialDatabase credentialDb;
    private DeviceHistoryDatabase deviceDb;
    private RouterDeviceFetcher fetcher;
    private MACVendorResolver vendorResolver;
    private ExecutorService executorService;
    private GuardPreferences preferences;
    private BroadcastReceiver serviceReceiver;

    @Override
    public void load() {
        credentialDb = RouterCredentialDatabase.getInstance(getContext());
        deviceDb = DeviceHistoryDatabase.getInstance(getContext());
        fetcher = new RouterDeviceFetcher();
        vendorResolver = MACVendorResolver.getInstance();
        executorService = Executors.newSingleThreadExecutor();
        preferences = new GuardPreferences(getContext());
        
        // Register broadcast receiver for service events
        registerServiceReceiver();
    }
    
    @Override
    protected void handleOnDestroy() {
        super.handleOnDestroy();
        if (serviceReceiver != null) {
            getContext().unregisterReceiver(serviceReceiver);
        }
    }
    
    private void registerServiceReceiver() {
        serviceReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if (action == null) return;
                
                switch (action) {
                    case NetworkGuardService.ACTION_DEVICE_LIST_UPDATED:
                        handleDeviceListUpdated(intent);
                        break;
                    case NetworkGuardService.ACTION_NEW_DEVICE_DETECTED:
                        handleNewDeviceDetected(intent);
                        break;
                    case NetworkGuardService.ACTION_DEVICE_WENT_OFFLINE:
                        handleDeviceWentOffline(intent);
                        break;
                    case NetworkGuardService.ACTION_SCAN_COMPLETED:
                        handleScanCompleted(intent);
                        break;
                }
            }
        };
        
        IntentFilter filter = new IntentFilter();
        filter.addAction(NetworkGuardService.ACTION_DEVICE_LIST_UPDATED);
        filter.addAction(NetworkGuardService.ACTION_NEW_DEVICE_DETECTED);
        filter.addAction(NetworkGuardService.ACTION_DEVICE_WENT_OFFLINE);
        filter.addAction(NetworkGuardService.ACTION_SCAN_COMPLETED);
        getContext().registerReceiver(serviceReceiver, filter);
    }
    
    private void handleDeviceListUpdated(Intent intent) {
        int onlineCount = intent.getIntExtra("onlineCount", 0);
        int newCount = intent.getIntExtra("newCount", 0);
        long timestamp = intent.getLongExtra("timestamp", 0);
        
        List<JSObject> devices = deviceDb.getOnlineDevices();
        JSArray devicesArray = new JSArray();
        for (JSObject device : devices) {
            devicesArray.put(device);
        }
        
        JSObject data = new JSObject();
        data.put("devices", devicesArray);
        data.put("onlineCount", onlineCount);
        data.put("timestamp", timestamp);
        notifyListeners("deviceListUpdated", data);
    }
    
    private void handleNewDeviceDetected(Intent intent) {
        String macAddress = intent.getStringExtra("macAddress");
        if (macAddress == null) return;
        
        JSObject device = deviceDb.getDevice(macAddress);
        if (device == null) return;
        
        List<JSObject> alerts = deviceDb.getUnreadAlerts();
        JSObject latestAlert = null;
        for (JSObject alert : alerts) {
            if (macAddress.equals(alert.getString("macAddress"))) {
                latestAlert = alert;
                break;
            }
        }
        
        JSObject data = new JSObject();
        data.put("device", device);
        if (latestAlert != null) {
            data.put("alert", latestAlert);
        }
        notifyListeners("newDeviceDetected", data);
    }
    
    private void handleDeviceWentOffline(Intent intent) {
        String macAddress = intent.getStringExtra("macAddress");
        String deviceName = intent.getStringExtra("deviceName");
        
        JSObject data = new JSObject();
        data.put("macAddress", macAddress);
        data.put("deviceName", deviceName != null ? deviceName : "");
        notifyListeners("deviceWentOffline", data);
    }
    
    private void handleScanCompleted(Intent intent) {
        int onlineCount = intent.getIntExtra("onlineCount", 0);
        long duration = intent.getLongExtra("duration", 0);
        
        // Get new devices count from last scan
        long lastScanTime = preferences.getLastScanTime();
        int newCount = deviceDb.getNewDevicesCount(lastScanTime - 60000); // Last minute
        
        JSObject data = new JSObject();
        data.put("onlineCount", onlineCount);
        data.put("newCount", newCount);
        data.put("duration", duration);
        notifyListeners("scanCompleted", data);
    }

    // ==================== Router Credentials ====================

    @PluginMethod
    public void saveRouterCredentials(PluginCall call) {
        String routerIp = call.getString("routerIp");
        String brand = call.getString("brand", "");
        String model = call.getString("model", "");
        String username = call.getString("username");
        String password = call.getString("password");
        String authMethod = call.getString("authMethod", "http");
        String loginUrl = call.getString("loginUrl", "");

        if (routerIp == null || username == null || password == null) {
            call.reject("Missing required parameters: routerIp, username, password");
            return;
        }

        long id = credentialDb.saveCredentials(routerIp, brand, model, username, password, authMethod, loginUrl);
        
        if (id > 0) {
            JSObject result = new JSObject();
            result.put("success", true);
            result.put("id", id);
            call.resolve(result);
        } else {
            call.reject("Failed to save router credentials");
        }
    }

    @PluginMethod
    public void getActiveRouter(PluginCall call) {
        JSObject router = credentialDb.getActiveCredentials();
        JSObject result = new JSObject();
        result.put("router", router);
        call.resolve(result);
    }

    @PluginMethod
    public void getAllRouters(PluginCall call) {
        List<JSObject> routers = credentialDb.getAllCredentials();
        JSArray routersArray = new JSArray();
        for (JSObject router : routers) {
            routersArray.put(router);
        }
        
        JSObject result = new JSObject();
        result.put("routers", routersArray);
        call.resolve(result);
    }

    @PluginMethod
    public void deleteRouter(PluginCall call) {
        Integer id = call.getInt("id");
        if (id == null) {
            call.reject("Missing required parameter: id");
            return;
        }

        boolean success = credentialDb.deleteCredentials(id);
        JSObject result = new JSObject();
        result.put("success", success);
        call.resolve(result);
    }

    @PluginMethod
    public void setActiveRouter(PluginCall call) {
        Integer id = call.getInt("id");
        if (id == null) {
            call.reject("Missing required parameter: id");
            return;
        }

        credentialDb.setActive(id);
        JSObject result = new JSObject();
        result.put("success", true);
        call.resolve(result);
    }

    // ==================== Device History ====================

    @PluginMethod
    public void getKnownDevices(PluginCall call) {
        List<JSObject> devices = deviceDb.getAllDevices();
        JSArray devicesArray = new JSArray();
        for (JSObject device : devices) {
            devicesArray.put(device);
        }
        
        JSObject result = new JSObject();
        result.put("devices", devicesArray);
        call.resolve(result);
    }

    @PluginMethod
    public void getOnlineDevices(PluginCall call) {
        List<JSObject> devices = deviceDb.getOnlineDevices();
        JSArray devicesArray = new JSArray();
        for (JSObject device : devices) {
            devicesArray.put(device);
        }
        
        JSObject result = new JSObject();
        result.put("devices", devicesArray);
        result.put("count", devices.size());
        call.resolve(result);
    }

    @PluginMethod
    public void setDeviceTrust(PluginCall call) {
        String macAddress = call.getString("macAddress");
        Integer trustLevel = call.getInt("trustLevel");
        
        if (macAddress == null || trustLevel == null) {
            call.reject("Missing required parameters: macAddress, trustLevel");
            return;
        }

        deviceDb.setDeviceTrust(macAddress, trustLevel);
        JSObject result = new JSObject();
        result.put("success", true);
        call.resolve(result);
    }

    @PluginMethod
    public void setDeviceCustomName(PluginCall call) {
        String macAddress = call.getString("macAddress");
        String customName = call.getString("customName");
        
        if (macAddress == null || customName == null) {
            call.reject("Missing required parameters: macAddress, customName");
            return;
        }

        deviceDb.setCustomName(macAddress, customName);
        JSObject result = new JSObject();
        result.put("success", true);
        call.resolve(result);
    }

    @PluginMethod
    public void setDeviceType(PluginCall call) {
        String macAddress = call.getString("macAddress");
        String deviceType = call.getString("deviceType");
        
        if (macAddress == null || deviceType == null) {
            call.reject("Missing required parameters: macAddress, deviceType");
            return;
        }

        deviceDb.setDeviceType(macAddress, deviceType);
        JSObject result = new JSObject();
        result.put("success", true);
        call.resolve(result);
    }

    @PluginMethod
    public void getDeviceSessions(PluginCall call) {
        String macAddress = call.getString("macAddress");
        Integer limit = call.getInt("limit", 50);
        
        if (macAddress == null) {
            call.reject("Missing required parameter: macAddress");
            return;
        }

        List<JSObject> sessions = deviceDb.getDeviceSessions(macAddress, limit);
        JSArray sessionsArray = new JSArray();
        for (JSObject session : sessions) {
            sessionsArray.put(session);
        }
        
        JSObject result = new JSObject();
        result.put("sessions", sessionsArray);
        call.resolve(result);
    }

    @PluginMethod
    public void getAlerts(PluginCall call) {
        Boolean unreadOnly = call.getBoolean("unreadOnly", false);
        Integer limit = call.getInt("limit", 50);
        
        List<JSObject> alerts;
        if (unreadOnly) {
            alerts = deviceDb.getUnreadAlerts();
        } else {
            alerts = deviceDb.getAllAlerts(limit);
        }
        
        JSArray alertsArray = new JSArray();
        for (JSObject alert : alerts) {
            alertsArray.put(alert);
        }
        
        int unreadCount = deviceDb.getUnreadAlerts().size();
        
        JSObject result = new JSObject();
        result.put("alerts", alertsArray);
        result.put("unreadCount", unreadCount);
        call.resolve(result);
    }

    @PluginMethod
    public void markAlertRead(PluginCall call) {
        Integer alertId = call.getInt("alertId");
        
        if (alertId == null) {
            call.reject("Missing required parameter: alertId");
            return;
        }

        deviceDb.markAlertRead(alertId);
        JSObject result = new JSObject();
        result.put("success", true);
        call.resolve(result);
    }

    @PluginMethod
    public void markAllAlertsRead(PluginCall call) {
        deviceDb.markAllAlertsRead();
        JSObject result = new JSObject();
        result.put("success", true);
        call.resolve(result);
    }

    @PluginMethod
    public void getDeviceStats(PluginCall call) {
        int totalDevices = deviceDb.getDeviceCount();
        int onlineDevices = deviceDb.getOnlineDevices().size();
        int trustedDevices = deviceDb.getTrustedDevices().size();
        int untrustedDevices = deviceDb.getUntrustedDevices().size();
        
        // New devices in last 24 hours
        long yesterday = System.currentTimeMillis() - (24 * 60 * 60 * 1000);
        int newDevicesToday = deviceDb.getNewDevicesCount(yesterday);
        
        int unreadAlerts = deviceDb.getUnreadAlerts().size();
        
        JSObject result = new JSObject();
        result.put("totalDevices", totalDevices);
        result.put("onlineDevices", onlineDevices);
        result.put("trustedDevices", trustedDevices);
        result.put("untrustedDevices", untrustedDevices);
        result.put("newDevicesToday", newDevicesToday);
        result.put("unreadAlerts", unreadAlerts);
        call.resolve(result);
    }
    
    // ==================== Router Device Fetching (Part 2) ====================
    
    @PluginMethod
    public void testRouterConnection(PluginCall call) {
        String routerIp = call.getString("routerIp");
        String username = call.getString("username");
        String password = call.getString("password");
        String brand = call.getString("brand", "");
        String authMethod = call.getString("authMethod", "http");
        
        if (routerIp == null || username == null || password == null) {
            call.reject("Missing required parameters: routerIp, username, password");
            return;
        }
        
        // Run on background thread
        executorService.execute(() -> {
            RouterDeviceFetcher.FetchResult result = fetcher.fetchDevices(routerIp, username, password, brand);
            
            JSObject response = new JSObject();
            response.put("success", result.success);
            
            if (result.success) {
                response.put("deviceCount", result.devices.size());
                response.put("method", result.method);
                call.resolve(response);
            } else {
                response.put("error", result.error);
                call.resolve(response);
            }
        });
    }
    
    @PluginMethod
    public void fetchRouterDevices(PluginCall call) {
        // Get active router credentials
        JSObject activeRouter = credentialDb.getActiveCredentials();
        
        if (activeRouter == null) {
            call.reject("No active router configured. Please add router credentials first.");
            return;
        }
        
        String routerIp = activeRouter.getString("routerIp");
        String username = activeRouter.getString("username");
        String brand = activeRouter.getString("brand");
        String password = credentialDb.getActivePassword();
        
        if (password == null) {
            call.reject("Failed to decrypt router password");
            return;
        }
        
        // Run on background thread
        executorService.execute(() -> {
            RouterDeviceFetcher.FetchResult fetchResult = fetcher.fetchDevices(routerIp, username, password, brand);
            
            if (!fetchResult.success) {
                JSObject response = new JSObject();
                response.put("success", false);
                response.put("error", fetchResult.error);
                call.resolve(response);
                return;
            }
            
            // Mark all devices offline first
            deviceDb.setAllDevicesOffline();
            
            int newDevicesCount = 0;
            long timestamp = System.currentTimeMillis();
            
            // Process each device
            for (RouterDeviceFetcher.RouterDevice device : fetchResult.devices) {
                // Resolve vendor
                String vendor = vendorResolver.resolve(device.macAddress);
                String deviceType = vendorResolver.guessDeviceType(vendor);
                
                // Check if device is new
                JSObject existingDevice = deviceDb.getDevice(device.macAddress);
                boolean isNew = (existingDevice == null);
                
                // Add or update device
                deviceDb.addOrUpdateDevice(device.macAddress, device.hostname, device.ipAddress, vendor, deviceType);
                
                // Log session
                deviceDb.logSession(device.macAddress, device.ipAddress, timestamp);
                
                if (isNew) {
                    newDevicesCount++;
                } else {
                    try {
                        if (!existingDevice.getBoolean("isOnline")) {
                            // Device reconnected
                            deviceDb.addAlert(device.macAddress, "reconnected", 
                                "Device reconnected: " + (device.hostname.isEmpty() ? device.macAddress : device.hostname), "info");
                        }
                    } catch (Exception e) {
                        Log.e(TAG, "Error checking device online status", e);
                    }
                }
            }
            
            // Update last connected timestamp
            int routerId = activeRouter.getInteger("id");
            credentialDb.updateLastConnected(routerId);
            
            // Get enriched device list
            List<JSObject> devices = deviceDb.getOnlineDevices();
            JSArray devicesArray = new JSArray();
            for (JSObject device : devices) {
                devicesArray.put(device);
            }
            
            JSObject response = new JSObject();
            response.put("success", true);
            response.put("devices", devicesArray);
            response.put("newDevices", newDevicesCount);
            response.put("method", fetchResult.method);
            response.put("totalOnline", devices.size());
            call.resolve(response);
        });
    }
    
    @PluginMethod
    public void getRouterDevicesQuick(PluginCall call) {
        // Run on background thread
        executorService.execute(() -> {
            // Use ARP scan (no credentials needed)
            RouterDeviceFetcher.FetchResult fetchResult = fetcher.tryARPScan("");
            
            if (!fetchResult.success) {
                JSObject response = new JSObject();
                response.put("success", false);
                response.put("error", "ARP scan failed");
                call.resolve(response);
                return;
            }
            
            // Mark all devices offline first
            deviceDb.setAllDevicesOffline();
            
            long timestamp = System.currentTimeMillis();
            
            // Process each device
            for (RouterDeviceFetcher.RouterDevice device : fetchResult.devices) {
                // Resolve vendor
                String vendor = vendorResolver.resolve(device.macAddress);
                String deviceType = vendorResolver.guessDeviceType(vendor);
                
                // Add or update device
                deviceDb.addOrUpdateDevice(device.macAddress, device.hostname, device.ipAddress, vendor, deviceType);
                
                // Log session
                deviceDb.logSession(device.macAddress, device.ipAddress, timestamp);
            }
            
            // Get enriched device list
            List<JSObject> devices = deviceDb.getOnlineDevices();
            JSArray devicesArray = new JSArray();
            for (JSObject device : devices) {
                devicesArray.put(device);
            }
            
            JSObject response = new JSObject();
            response.put("success", true);
            response.put("devices", devicesArray);
            response.put("method", "ARP Scan");
            call.resolve(response);
        });
    }
    
    // ==================== Monitoring Service Control (Part 3) ====================
    
    @PluginMethod
    public void startMonitoring(PluginCall call) {
        Integer scanInterval = call.getInt("scanInterval", 30000);
        
        Intent serviceIntent = new Intent(getContext(), NetworkGuardService.class);
        serviceIntent.putExtra("action", "start");
        serviceIntent.putExtra("interval", scanInterval);
        
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            getContext().startForegroundService(serviceIntent);
        } else {
            getContext().startService(serviceIntent);
        }
        
        JSObject result = new JSObject();
        result.put("success", true);
        result.put("interval", scanInterval);
        call.resolve(result);
    }
    
    @PluginMethod
    public void stopMonitoring(PluginCall call) {
        Intent serviceIntent = new Intent(getContext(), NetworkGuardService.class);
        serviceIntent.putExtra("action", "stop");
        getContext().startService(serviceIntent);
        
        JSObject result = new JSObject();
        result.put("success", true);
        call.resolve(result);
    }
    
    @PluginMethod
    public void isMonitoring(PluginCall call) {
        boolean monitoring = NetworkGuardService.isServiceRunning(getContext());
        int interval = preferences.getScanInterval();
        long lastScanTime = preferences.getLastScanTime();
        
        JSObject result = new JSObject();
        result.put("monitoring", monitoring);
        result.put("interval", interval);
        result.put("lastScanTime", lastScanTime);
        call.resolve(result);
    }
    
    @PluginMethod
    public void setScanInterval(PluginCall call) {
        Integer interval = call.getInt("interval");
        if (interval == null) {
            call.reject("Missing required parameter: interval");
            return;
        }
        
        // Validate interval (10s to 5min)
        interval = Math.max(10000, Math.min(300000, interval));
        
        Intent serviceIntent = new Intent(getContext(), NetworkGuardService.class);
        serviceIntent.putExtra("action", "update_interval");
        serviceIntent.putExtra("interval", interval);
        getContext().startService(serviceIntent);
        
        JSObject result = new JSObject();
        result.put("success", true);
        result.put("interval", interval);
        call.resolve(result);
    }
    
    @PluginMethod
    public void getGuardSettings(PluginCall call) {
        JSObject result = new JSObject();
        result.put("monitoringEnabled", preferences.isMonitoringEnabled());
        result.put("scanInterval", preferences.getScanInterval());
        result.put("notifyNewDevice", preferences.shouldNotifyNewDevice());
        result.put("notifyReturningDevice", preferences.shouldNotifyReturningDevice());
        result.put("notifySuspicious", preferences.shouldNotifySuspicious());
        result.put("autoStartOnBoot", preferences.isAutoStartOnBoot());
        call.resolve(result);
    }
    
    @PluginMethod
    public void updateGuardSettings(PluginCall call) {
        Boolean monitoringEnabled = call.getBoolean("monitoringEnabled");
        Integer scanInterval = call.getInt("scanInterval");
        Boolean notifyNewDevice = call.getBoolean("notifyNewDevice");
        Boolean notifyReturningDevice = call.getBoolean("notifyReturningDevice");
        Boolean notifySuspicious = call.getBoolean("notifySuspicious");
        Boolean autoStartOnBoot = call.getBoolean("autoStartOnBoot");
        
        if (monitoringEnabled != null) {
            preferences.setMonitoringEnabled(monitoringEnabled);
        }
        if (scanInterval != null) {
            preferences.setScanInterval(scanInterval);
        }
        if (notifyNewDevice != null) {
            preferences.setNotifyNewDevice(notifyNewDevice);
        }
        if (notifyReturningDevice != null) {
            preferences.setNotifyReturningDevice(notifyReturningDevice);
        }
        if (notifySuspicious != null) {
            preferences.setNotifySuspicious(notifySuspicious);
        }
        if (autoStartOnBoot != null) {
            preferences.setAutoStartOnBoot(autoStartOnBoot);
        }
        
        JSObject result = new JSObject();
        result.put("success", true);
        call.resolve(result);
    }
    
    // ==================== Threat Detection (Part 4) ====================
    
    @PluginMethod
    public void analyzeDevice(PluginCall call) {
        String macAddress = call.getString("macAddress");
        if (macAddress == null) {
            call.reject("Missing required parameter: macAddress");
            return;
        }
        
        JSObject device = deviceDb.getDevice(macAddress);
        if (device == null) {
            call.reject("Device not found");
            return;
        }
        
        ThreatDetector detector = ThreatDetector.getInstance(getContext());
        ThreatDetector.ThreatReport report = detector.analyzeDevice(device);
        
        JSObject result = new JSObject();
        result.put("report", threatReportToJSObject(report));
        call.resolve(result);
    }
    
    @PluginMethod
    public void analyzeAllDevices(PluginCall call) {
        ThreatDetector detector = ThreatDetector.getInstance(getContext());
        List<ThreatDetector.ThreatReport> reports = detector.analyzeAllDevices();
        
        JSArray reportsArray = new JSArray();
        int highThreatCount = 0;
        
        for (ThreatDetector.ThreatReport report : reports) {
            reportsArray.put(threatReportToJSObject(report));
            if (report.overallThreatLevel >= ThreatDetector.THREAT_HIGH) {
                highThreatCount++;
            }
        }
        
        JSObject result = new JSObject();
        result.put("reports", reportsArray);
        result.put("highThreatCount", highThreatCount);
        call.resolve(result);
    }
    
    @PluginMethod
    public void getActiveThreats(PluginCall call) {
        ThreatDatabase threatDb = ThreatDatabase.getInstance(getContext());
        List<ThreatDetector.ThreatReport> threats = threatDb.getAllActiveThreats();
        
        JSArray threatsArray = new JSArray();
        for (ThreatDetector.ThreatReport threat : threats) {
            threatsArray.put(threatReportToJSObject(threat));
        }
        
        JSObject result = new JSObject();
        result.put("threats", threatsArray);
        result.put("count", threats.size());
        call.resolve(result);
    }
    
    @PluginMethod
    public void getHighThreats(PluginCall call) {
        ThreatDatabase threatDb = ThreatDatabase.getInstance(getContext());
        List<ThreatDetector.ThreatReport> threats = threatDb.getHighThreats();
        
        JSArray threatsArray = new JSArray();
        for (ThreatDetector.ThreatReport threat : threats) {
            threatsArray.put(threatReportToJSObject(threat));
        }
        
        JSObject result = new JSObject();
        result.put("threats", threatsArray);
        result.put("count", threats.size());
        call.resolve(result);
    }
    
    @PluginMethod
    public void dismissThreat(PluginCall call) {
        Integer reportId = call.getInt("reportId");
        if (reportId == null) {
            call.reject("Missing required parameter: reportId");
            return;
        }
        
        ThreatDatabase threatDb = ThreatDatabase.getInstance(getContext());
        threatDb.dismissThreat(reportId);
        
        JSObject result = new JSObject();
        result.put("success", true);
        call.resolve(result);
    }
    
    @PluginMethod
    public void getNetworkHealthHistory(PluginCall call) {
        Integer hours = call.getInt("hours", 24);
        
        ThreatDatabase threatDb = ThreatDatabase.getInstance(getContext());
        List<JSObject> snapshots = threatDb.getNetworkHistory(hours);
        
        JSArray snapshotsArray = new JSArray();
        for (JSObject snapshot : snapshots) {
            snapshotsArray.put(snapshot);
        }
        
        JSObject result = new JSObject();
        result.put("snapshots", snapshotsArray);
        call.resolve(result);
    }
    
    @PluginMethod
    public void getThreatTrend(PluginCall call) {
        String macAddress = call.getString("macAddress");
        Integer days = call.getInt("days", 7);
        
        if (macAddress == null) {
            call.reject("Missing required parameter: macAddress");
            return;
        }
        
        ThreatDatabase threatDb = ThreatDatabase.getInstance(getContext());
        List<JSObject> trend = threatDb.getThreatTrend(macAddress, days);
        
        JSArray trendArray = new JSArray();
        for (JSObject point : trend) {
            trendArray.put(point);
        }
        
        JSObject result = new JSObject();
        result.put("trend", trendArray);
        call.resolve(result);
    }
    
    @PluginMethod
    public void categorizeDevice(PluginCall call) {
        String macAddress = call.getString("macAddress");
        if (macAddress == null) {
            call.reject("Missing required parameter: macAddress");
            return;
        }
        
        JSObject device = deviceDb.getDevice(macAddress);
        if (device == null) {
            call.reject("Device not found");
            return;
        }
        
        ThreatDetector detector = ThreatDetector.getInstance(getContext());
        ThreatDetector.DeviceCategory category = detector.categorizeDevice(device);
        
        JSObject result = new JSObject();
        result.put("deviceType", category.deviceType);
        result.put("confidence", category.confidence);
        result.put("reasoning", category.reasoning);
        call.resolve(result);
    }
    
    @PluginMethod
    public void autoCategorizeAll(PluginCall call) {
        List<JSObject> devices = deviceDb.getAllDevices();
        ThreatDetector detector = ThreatDetector.getInstance(getContext());
        
        int categorized = 0;
        JSArray resultsArray = new JSArray();
        
        for (JSObject device : devices) {
            String currentType = device.getString("deviceType");
            if ("unknown".equals(currentType)) {
                ThreatDetector.DeviceCategory category = detector.categorizeDevice(device);
                
                if (!"unknown".equals(category.deviceType) && category.confidence > 0.5) {
                    String macAddress = device.getString("macAddress");
                    deviceDb.setDeviceType(macAddress, category.deviceType);
                    categorized++;
                    
                    JSObject resultItem = new JSObject();
                    resultItem.put("macAddress", macAddress);
                    resultItem.put("deviceType", category.deviceType);
                    resultItem.put("confidence", category.confidence);
                    resultsArray.put(resultItem);
                }
            }
        }
        
        JSObject result = new JSObject();
        result.put("categorized", categorized);
        result.put("results", resultsArray);
        call.resolve(result);
    }
    
    // Helper method to convert ThreatReport to JSObject
    private JSObject threatReportToJSObject(ThreatDetector.ThreatReport report) {
        JSObject obj = new JSObject();
        obj.put("macAddress", report.macAddress);
        obj.put("deviceName", report.deviceName);
        obj.put("overallThreatLevel", report.overallThreatLevel);
        obj.put("threatScore", report.threatScore);
        obj.put("summary", report.summary);
        obj.put("analyzedAt", report.analyzedAt);
        obj.put("isDismissed", report.isDismissed);
        
        JSArray findingsArray = new JSArray();
        for (ThreatDetector.ThreatFinding finding : report.findings) {
            JSObject findingObj = new JSObject();
            findingObj.put("ruleId", finding.ruleId);
            findingObj.put("ruleName", finding.ruleName);
            findingObj.put("description", finding.description);
            findingObj.put("severity", finding.severity);
            findingObj.put("scoreContribution", finding.scoreContribution);
            findingObj.put("recommendation", finding.recommendation);
            findingsArray.put(findingObj);
        }
        obj.put("findings", findingsArray);
        
        return obj;
    }
}
