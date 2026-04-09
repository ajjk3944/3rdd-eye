package app.thirdeye.scanner.iot;

import android.Manifest;
import android.util.Log;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.annotation.Permission;

import org.json.JSONArray;

import java.util.List;

@CapacitorPlugin(
    name = "IoTDevice",
    permissions = {
        @Permission(
            alias = "network",
            strings = {
                Manifest.permission.ACCESS_NETWORK_STATE,
                Manifest.permission.ACCESS_WIFI_STATE,
                Manifest.permission.INTERNET
            }
        )
    }
)
public class IoTDevicePlugin extends Plugin {
    private static final String TAG = "ThirdEye-IoT";
    private IoTDeviceDatabase database;
    private IoTDiscoveryManager discoveryManager;
    
    @Override
    public void load() {
        super.load();
        database = IoTDeviceDatabase.getInstance(getContext());
        discoveryManager = new IoTDiscoveryManager(getContext());
        Log.d(TAG, "IoTDevicePlugin loaded");
    }
    
    // ========== DISCOVERY METHODS ==========
    
    @PluginMethod
    public void startDiscovery(PluginCall call) {
        try {
            discoveryManager.startDiscovery(new IoTDiscoveryManager.DiscoveryCallback() {
                @Override
                public void onDeviceFound(JSObject device) {
                    // Emit event for each device found
                    notifyListeners("iotDeviceFound", device);
                }
                
                @Override
                public void onScanProgress(int scanned, int total) {
                    JSObject progress = new JSObject();
                    progress.put("scanned", scanned);
                    progress.put("total", total);
                    progress.put("percentage", (int)((scanned * 100.0) / total));
                    notifyListeners("iotScanProgress", progress);
                }
                
                @Override
                public void onScanComplete(int totalDevices, int iotDevices) {
                    JSObject result = new JSObject();
                    result.put("totalDevices", totalDevices);
                    result.put("iotDevices", iotDevices);
                    notifyListeners("iotScanComplete", result);
                }
                
                @Override
                public void onError(String error) {
                    Log.e(TAG, "Discovery error: " + error);
                }
            });
            
            JSObject result = new JSObject();
            result.put("success", true);
            result.put("message", "IoT device discovery started");
            call.resolve(result);
            
        } catch (Exception e) {
            Log.e(TAG, "Error starting discovery", e);
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("message", e.getMessage());
            call.resolve(result);
        }
    }
    
    @PluginMethod
    public void stopDiscovery(PluginCall call) {
        try {
            discoveryManager.stopDiscovery();
            
            JSObject result = new JSObject();
            result.put("success", true);
            call.resolve(result);
            
        } catch (Exception e) {
            Log.e(TAG, "Error stopping discovery", e);
            JSObject result = new JSObject();
            result.put("success", false);
            call.resolve(result);
        }
    }
    
    @PluginMethod
    public void isScanning(PluginCall call) {
        JSObject result = new JSObject();
        result.put("scanning", discoveryManager.isScanning());
        call.resolve(result);
    }
    
    // ========== DEVICE METHODS ==========
    
    @PluginMethod
    public void getAllDevices(PluginCall call) {
        try {
            JSArray devices = database.getAllDevices();
            
            JSObject result = new JSObject();
            result.put("devices", devices);
            call.resolve(result);
            
        } catch (Exception e) {
            Log.e(TAG, "Error getting all devices", e);
            call.reject("Error getting devices: " + e.getMessage());
        }
    }
    
    @PluginMethod
    public void getDeviceById(PluginCall call) {
        try {
            int id = call.getInt("id", -1);
            if (id == -1) {
                call.reject("Device ID is required");
                return;
            }
            
            JSObject device = database.getDeviceById(id);
            
            JSObject result = new JSObject();
            result.put("device", device);
            call.resolve(result);
            
        } catch (Exception e) {
            Log.e(TAG, "Error getting device by ID", e);
            call.reject("Error getting device: " + e.getMessage());
        }
    }
    
    @PluginMethod
    public void getDevicesByRoom(PluginCall call) {
        try {
            int roomId = call.getInt("roomId", 0);
            
            JSArray devices = database.getDevicesByRoom(roomId);
            
            JSObject result = new JSObject();
            result.put("devices", devices);
            call.resolve(result);
            
        } catch (Exception e) {
            Log.e(TAG, "Error getting devices by room", e);
            call.reject("Error getting devices: " + e.getMessage());
        }
    }
    
    @PluginMethod
    public void getDevicesByType(PluginCall call) {
        try {
            String type = call.getString("type", "");
            if (type.isEmpty()) {
                call.reject("Device type is required");
                return;
            }
            
            JSArray devices = database.getDevicesByType(type);
            
            JSObject result = new JSObject();
            result.put("devices", devices);
            call.resolve(result);
            
        } catch (Exception e) {
            Log.e(TAG, "Error getting devices by type", e);
            call.reject("Error getting devices: " + e.getMessage());
        }
    }
    
    @PluginMethod
    public void getOnlineDevices(PluginCall call) {
        try {
            JSArray devices = database.getOnlineDevices();
            
            JSObject result = new JSObject();
            result.put("devices", devices);
            call.resolve(result);
            
        } catch (Exception e) {
            Log.e(TAG, "Error getting online devices", e);
            call.reject("Error getting devices: " + e.getMessage());
        }
    }
    
    @PluginMethod
    public void updateDeviceName(PluginCall call) {
        try {
            int id = call.getInt("id", -1);
            String name = call.getString("name", "");
            
            if (id == -1 || name.isEmpty()) {
                call.reject("Device ID and name are required");
                return;
            }
            
            boolean success = database.updateDeviceName(id, name);
            
            JSObject result = new JSObject();
            result.put("success", success);
            call.resolve(result);
            
        } catch (Exception e) {
            Log.e(TAG, "Error updating device name", e);
            call.reject("Error updating device: " + e.getMessage());
        }
    }
    
    @PluginMethod
    public void updateDeviceRoom(PluginCall call) {
        try {
            int id = call.getInt("id", -1);
            int roomId = call.getInt("roomId", 0);
            
            if (id == -1) {
                call.reject("Device ID is required");
                return;
            }
            
            boolean success = database.updateDeviceRoom(id, roomId);
            
            JSObject result = new JSObject();
            result.put("success", success);
            call.resolve(result);
            
        } catch (Exception e) {
            Log.e(TAG, "Error updating device room", e);
            call.reject("Error updating device: " + e.getMessage());
        }
    }
    
    @PluginMethod
    public void deleteDevice(PluginCall call) {
        try {
            int id = call.getInt("id", -1);
            
            if (id == -1) {
                call.reject("Device ID is required");
                return;
            }
            
            boolean success = database.deleteDevice(id);
            
            JSObject result = new JSObject();
            result.put("success", success);
            call.resolve(result);
            
        } catch (Exception e) {
            Log.e(TAG, "Error deleting device", e);
            call.reject("Error deleting device: " + e.getMessage());
        }
    }
    
    @PluginMethod
    public void getDeviceStats(PluginCall call) {
        try {
            int total = database.getDeviceCount();
            JSArray onlineDevices = database.getOnlineDevices();
            int online = onlineDevices.length();
            JSObject byType = database.getDeviceCountByType();
            int avgSecurityScore = database.getOverallSecurityScore();
            
            // Count critical issues using database method
            int criticalIssues = database.getCriticalIssueCount();
            
            JSObject result = new JSObject();
            result.put("total", total);
            result.put("online", online);
            result.put("byType", byType);
            result.put("avgSecurityScore", avgSecurityScore);
            result.put("criticalIssues", criticalIssues);
            call.resolve(result);
            
        } catch (Exception e) {
            Log.e(TAG, "Error getting device stats", e);
            call.reject("Error getting stats: " + e.getMessage());
        }
    }
    
    // ========== SECURITY METHODS ==========
    
    @PluginMethod
    public void scanDeviceSecurity(PluginCall call) {
        try {
            int id = call.getInt("id", -1);
            
            if (id == -1) {
                call.reject("Device ID is required");
                return;
            }
            
            // Get device
            JSObject device = database.getDeviceById(id);
            if (device == null) {
                call.reject("Device not found");
                return;
            }
            
            String ip = device.getString("ipAddress");
            
            // Run security scan in background
            new Thread(() -> {
                try {
                    IoTSecurityScanner.SecurityResult securityResult = 
                            IoTSecurityScanner.scanDevice(ip, 200);
                    
                    // Convert findings to JSArray
                    JSArray findings = new JSArray();
                    for (IoTSecurityScanner.SecurityFinding finding : securityResult.findings) {
                        findings.put(finding.toJSObject());
                        
                        // Save to database
                        database.insertSecurityFinding(
                                id,
                                finding.findingType,
                                finding.severity,
                                finding.title,
                                finding.description,
                                finding.recommendation
                        );
                    }
                    
                    JSObject result = new JSObject();
                    result.put("score", securityResult.score);
                    result.put("findings", findings);
                    
                    call.resolve(result);
                    
                } catch (Exception e) {
                    Log.e(TAG, "Error scanning device security", e);
                    call.reject("Error scanning device: " + e.getMessage());
                }
            }).start();
            
        } catch (Exception e) {
            Log.e(TAG, "Error in scanDeviceSecurity", e);
            call.reject("Error: " + e.getMessage());
        }
    }
    
    @PluginMethod
    public void getSecurityOverview(PluginCall call) {
        try {
            int overallScore = database.getOverallSecurityScore();
            JSArray allFindings = database.getAllSecurityFindings();
            
            int totalFindings = allFindings.length();
            
            // Get counts by severity using database methods
            int critical = database.getFindingCountBySeverity("critical");
            int high = database.getFindingCountBySeverity("high");
            int medium = database.getFindingCountBySeverity("medium");
            int low = database.getFindingCountBySeverity("low");
            
            JSObject result = new JSObject();
            result.put("overallScore", overallScore);
            result.put("totalFindings", totalFindings);
            result.put("critical", critical);
            result.put("high", high);
            result.put("medium", medium);
            result.put("low", low);
            call.resolve(result);
            
        } catch (Exception e) {
            Log.e(TAG, "Error getting security overview", e);
            call.reject("Error getting security overview: " + e.getMessage());
        }
    }
    
    @PluginMethod
    public void getSecurityFindings(PluginCall call) {
        try {
            int deviceId = call.getInt("deviceId", -1);
            
            if (deviceId == -1) {
                call.reject("Device ID is required");
                return;
            }
            
            JSArray findings = database.getSecurityFindings(deviceId);
            
            JSObject result = new JSObject();
            result.put("findings", findings);
            call.resolve(result);
            
        } catch (Exception e) {
            Log.e(TAG, "Error getting security findings", e);
            call.reject("Error getting findings: " + e.getMessage());
        }
    }
    
    // ========== ROOM METHODS ==========
    
    @PluginMethod
    public void getAllRooms(PluginCall call) {
        try {
            JSArray rooms = database.getAllRooms();
            
            JSObject result = new JSObject();
            result.put("rooms", rooms);
            call.resolve(result);
            
        } catch (Exception e) {
            Log.e(TAG, "Error getting all rooms", e);
            call.reject("Error getting rooms: " + e.getMessage());
        }
    }
    
    @PluginMethod
    public void addRoom(PluginCall call) {
        try {
            String name = call.getString("name", "");
            String icon = call.getString("icon", "home");
            
            if (name.isEmpty()) {
                call.reject("Room name is required");
                return;
            }
            
            long id = database.insertRoom(name, icon);
            
            JSObject result = new JSObject();
            result.put("success", id > 0);
            result.put("id", (int)id);
            call.resolve(result);
            
        } catch (Exception e) {
            Log.e(TAG, "Error adding room", e);
            call.reject("Error adding room: " + e.getMessage());
        }
    }
    
    @PluginMethod
    public void updateRoom(PluginCall call) {
        try {
            int id = call.getInt("id", -1);
            String name = call.getString("name", "");
            String icon = call.getString("icon", "home");
            
            if (id == -1 || name.isEmpty()) {
                call.reject("Room ID and name are required");
                return;
            }
            
            boolean success = database.updateRoom(id, name, icon);
            
            JSObject result = new JSObject();
            result.put("success", success);
            call.resolve(result);
            
        } catch (Exception e) {
            Log.e(TAG, "Error updating room", e);
            call.reject("Error updating room: " + e.getMessage());
        }
    }
    
    @PluginMethod
    public void deleteRoom(PluginCall call) {
        try {
            int id = call.getInt("id", -1);
            
            if (id == -1) {
                call.reject("Room ID is required");
                return;
            }
            
            boolean success = database.deleteRoom(id);
            
            JSObject result = new JSObject();
            result.put("success", success);
            call.resolve(result);
            
        } catch (Exception e) {
            Log.e(TAG, "Error deleting room", e);
            call.reject("Error deleting room: " + e.getMessage());
        }
    }
    
    // ========== UTILITY METHODS ==========
    
    @PluginMethod
    public void refreshDevice(PluginCall call) {
        try {
            String ip = call.getString("ip", "");
            
            if (ip.isEmpty()) {
                call.reject("IP address is required");
                return;
            }
            
            // Run refresh in background
            new Thread(() -> {
                try {
                    JSObject device = discoveryManager.refreshDevice(ip);
                    
                    if (device != null) {
                        JSObject result = new JSObject();
                        result.put("device", device);
                        call.resolve(result);
                    } else {
                        call.reject("Could not refresh device");
                    }
                    
                } catch (Exception e) {
                    Log.e(TAG, "Error refreshing device", e);
                    call.reject("Error refreshing device: " + e.getMessage());
                }
            }).start();
            
        } catch (Exception e) {
            Log.e(TAG, "Error in refreshDevice", e);
            call.reject("Error: " + e.getMessage());
        }
    }
    
    @PluginMethod
    public void clearAllData(PluginCall call) {
        try {
            database.clearAllData();
            
            JSObject result = new JSObject();
            result.put("success", true);
            call.resolve(result);
            
        } catch (Exception e) {
            Log.e(TAG, "Error clearing data", e);
            call.reject("Error clearing data: " + e.getMessage());
        }
    }
}
