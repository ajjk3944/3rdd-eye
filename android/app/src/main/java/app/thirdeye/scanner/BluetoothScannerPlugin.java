package app.thirdeye.scanner;

import android.Manifest;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import androidx.core.app.ActivityCompat;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.annotation.Permission;
import com.getcapacitor.annotation.PermissionCallback;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@CapacitorPlugin(
    name = "BluetoothScanner",
    permissions = {
        @Permission(
            alias = "bluetooth",
            strings = {
                Manifest.permission.BLUETOOTH,
                Manifest.permission.BLUETOOTH_ADMIN
            }
        ),
        @Permission(
            alias = "bluetoothScan",
            strings = {
                Manifest.permission.BLUETOOTH_SCAN,
                Manifest.permission.BLUETOOTH_CONNECT
            }
        ),
        @Permission(
            alias = "location",
            strings = {
                Manifest.permission.ACCESS_FINE_LOCATION
            }
        )
    }
)
public class BluetoothScannerPlugin extends Plugin {
    private static final String TAG = "BluetoothScannerPlugin";
    private static final long SCAN_DURATION = 10000; // 10 seconds
    private static final String PREFS_NAME = "BluetoothHistory";

    private BluetoothAdapter bluetoothAdapter;
    private BluetoothLeScanner bleScanner;
    private Map<String, JSObject> discoveredDevices = new HashMap<>();
    private Handler handler = new Handler(Looper.getMainLooper());
    private boolean isScanning = false;
    private PluginCall currentCall;
    private SharedPreferences historyPrefs;

    @Override
    public void load() {
        super.load();
        BluetoothManager bluetoothManager = (BluetoothManager) getContext().getSystemService(Context.BLUETOOTH_SERVICE);
        if (bluetoothManager != null) {
            bluetoothAdapter = bluetoothManager.getAdapter();
            if (bluetoothAdapter != null) {
                bleScanner = bluetoothAdapter.getBluetoothLeScanner();
            }
        }
        historyPrefs = getContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
    }

    // Calculate distance from RSSI (in meters)
    // Using the path loss formula: RSSI = -10n * log10(d) + A
    // Where: n = path loss exponent (2-4), A = RSSI at 1 meter (-50 to -60 dBm)
    private double calculateDistance(int rssi) {
        // Measured power at 1 meter (typical for Bluetooth)
        int measuredPower = -59;
        
        if (rssi == 0) {
            return -1.0; // Unknown distance
        }
        
        // Path loss exponent (2.0 for free space, 2-4 for indoor)
        double n = 2.5;
        
        // Calculate distance in meters
        double ratio = rssi * 1.0 / measuredPower;
        if (ratio < 1.0) {
            return Math.pow(ratio, 10);
        } else {
            double distance = Math.pow(10, ((measuredPower - rssi) / (10 * n)));
            return distance;
        }
    }
    
    // Get human-readable distance
    private String getDistanceDescription(double distanceMeters) {
        if (distanceMeters < 0) return "Unknown";
        if (distanceMeters < 1) return "Very Close (<1m)";
        if (distanceMeters < 3) return "Close (1-3m)";
        if (distanceMeters < 5) return "Near (3-5m)";
        if (distanceMeters < 10) return "Nearby (5-10m)";
        if (distanceMeters < 20) return "Far (10-20m)";
        if (distanceMeters < 30) return "Very Far (20-30m)";
        return "Extremely Far (30m+)";
    }

    // Get friendly device type name based on MAC prefix and device class
    private String identifyDeviceType(String macAddress, int bluetoothClass, String name) {
        String nameLower = name != null ? name.toLowerCase() : "";
        
        // Check name patterns first for specific devices
        if (nameLower.contains("airpod")) return "AirPods";
        if (nameLower.contains("galaxy buds")) return "Galaxy Buds";
        if (nameLower.contains("redmi buds") || nameLower.contains("mi buds")) return "Redmi/Mi Buds";
        if (nameLower.contains("jbl")) return "JBL Speaker";
        if (nameLower.contains("sony wh") || nameLower.contains("sony wf")) return "Sony Headphones";
        if (nameLower.contains("bose")) return "Bose Audio";
        if (nameLower.contains("beats")) return "Beats Audio";
        if (nameLower.contains("jabra")) return "Jabra Audio";
        if (nameLower.contains("sennheiser")) return "Sennheiser Audio";
        if (nameLower.contains("marshall")) return "Marshall Speaker";
        if (nameLower.contains("harman") || nameLower.contains("kardon")) return "Harman Kardon";
        if (nameLower.contains("bang") && nameLower.contains("olufsen")) return "Bang & Olufsen";
        if (nameLower.contains("anker") || nameLower.contains("soundcore")) return "Anker Audio";
        if (nameLower.contains("skullcandy")) return "Skullcandy Audio";
        if (nameLower.contains("xiaomi") || nameLower.contains("redmi")) return "Xiaomi Device";
        if (nameLower.contains("mi band") || nameLower.contains("mi smart")) return "Mi Band";
        if (nameLower.contains("fitbit")) return "Fitbit";
        if (nameLower.contains("garmin")) return "Garmin Watch";
        if (nameLower.contains("samsung")) return "Samsung Device";
        if (nameLower.contains("watch") || nameLower.contains("band")) return "Smartwatch/Band";
        if (nameLower.contains("speaker") || nameLower.contains("soundbar")) return "Speaker";
        if (nameLower.contains("headphone") || nameLower.contains("earphone") || nameLower.contains("earbud")) return "Headphones";
        if (nameLower.contains("keyboard")) return "Keyboard";
        if (nameLower.contains("mouse")) return "Mouse";
        if (nameLower.contains("controller") || nameLower.contains("gamepad")) return "Game Controller";
        if (nameLower.contains("tv") || nameLower.contains("television")) return "Smart TV";
        if (nameLower.contains("car") || nameLower.contains("auto")) return "Car Audio";
        if (nameLower.contains("printer")) return "Printer";
        
        // Use Bluetooth device class to determine type
        if (bluetoothClass != 0) {
            int majorClass = (bluetoothClass & 0x1F00) >> 8;
            int minorClass = (bluetoothClass & 0xFC) >> 2;
            
            switch (majorClass) {
                case 0x01: // Computer
                    return "Computer";
                case 0x02: // Phone
                    return "Phone";
                case 0x04: // Audio/Video
                    switch (minorClass) {
                        case 0x01: return "Wearable Headset";
                        case 0x02: return "Hands-free Device";
                        case 0x04: return "Microphone";
                        case 0x05: return "Speaker";
                        case 0x06: return "Headphones";
                        case 0x07: return "Portable Audio";
                        case 0x08: return "Car Audio";
                        case 0x0A: return "HiFi Audio";
                        case 0x0B: return "VCR";
                        case 0x0C: return "Video Camera";
                        case 0x0D: return "Camcorder";
                        case 0x0E: return "Video Monitor";
                        case 0x0F: return "Video Display";
                        case 0x10: return "Video Conferencing";
                        default: return "Audio/Video Device";
                    }
                case 0x05: // Peripheral (keyboard, mouse, etc.)
                    switch (minorClass) {
                        case 0x10: return "Keyboard";
                        case 0x20: return "Pointing Device";
                        case 0x30: return "Keyboard/Mouse Combo";
                        default: return "Peripheral Device";
                    }
                case 0x06: // Imaging (printer, scanner, etc.)
                    return "Imaging Device";
                case 0x07: // Wearable
                    switch (minorClass) {
                        case 0x01: return "Wristwatch";
                        case 0x02: return "Pager";
                        case 0x03: return "Jacket";
                        case 0x04: return "Helmet";
                        case 0x05: return "Glasses";
                        default: return "Wearable Device";
                    }
                case 0x08: // Toy
                    return "Toy";
                case 0x09: // Health
                    switch (minorClass) {
                        case 0x01: return "Blood Pressure Monitor";
                        case 0x02: return "Thermometer";
                        case 0x03: return "Weighing Scale";
                        case 0x04: return "Glucose Meter";
                        case 0x05: return "Pulse Oximeter";
                        case 0x06: return "Heart Rate Monitor";
                        case 0x07: return "Health Data Display";
                        default: return "Health Device";
                    }
                default:
                    return "Bluetooth Device";
            }
        }
        
        // Check MAC prefix for manufacturer (if no other info available)
        if (macAddress != null && macAddress.length() >= 8) {
            String macUpper = macAddress.toUpperCase();
            String macPrefix = macUpper.substring(0, 8);
            
            // Apple devices
            if (macPrefix.startsWith("00:1C:B3") || macPrefix.startsWith("00:1E:C2") ||
                macPrefix.startsWith("3C:06:30") || macPrefix.startsWith("A4:D1:8C") ||
                macPrefix.startsWith("F0:B4:79") || macPrefix.startsWith("AC:DE:48")) {
                return "Apple Device";
            }
            
            // Samsung
            if (macPrefix.startsWith("94:35:0A") || macPrefix.startsWith("50:01:BB") ||
                macPrefix.startsWith("CC:07:AB") || macPrefix.startsWith("D0:22:BE")) {
                return "Samsung Device";
            }
            
            // Xiaomi
            if (macPrefix.startsWith("54:84:50") || macPrefix.startsWith("64:09:80") ||
                macPrefix.startsWith("78:11:DC") || macPrefix.startsWith("34:CE:00")) {
                return "Xiaomi Device";
            }
        }
        
        return "Bluetooth Device";
    }

    // Save device to history
    private void saveToHistory(String macAddress, String name, String deviceType, int rssi) {
        try {
            JSONObject history = new JSONObject();
            history.put("macAddress", macAddress);
            history.put("name", name != null && !name.isEmpty() ? name : "Unknown Device");
            history.put("deviceType", deviceType);
            history.put("lastSeen", System.currentTimeMillis());
            history.put("lastRssi", rssi);
            
            // Check if exists and update connection count
            String existing = historyPrefs.getString(macAddress, null);
            if (existing != null) {
                JSONObject existingObj = new JSONObject(existing);
                int count = existingObj.optInt("connectionCount", 0) + 1;
                history.put("connectionCount", count);
                history.put("firstSeen", existingObj.optLong("firstSeen", System.currentTimeMillis()));
            } else {
                history.put("connectionCount", 1);
                history.put("firstSeen", System.currentTimeMillis());
            }
            
            historyPrefs.edit().putString(macAddress, history.toString()).apply();
        } catch (JSONException e) {
            Log.e(TAG, "Error saving to history", e);
        }
    }

    @PluginMethod
    public void isBluetoothEnabled(PluginCall call) {
        JSObject result = new JSObject();
        result.put("enabled", bluetoothAdapter != null && bluetoothAdapter.isEnabled());
        call.resolve(result);
    }

    @PluginMethod
    public void getPairedDevices(PluginCall call) {
        if (!hasBluetoothPermissions()) {
            requestAllPermissions(call, "permissionCallback");
            return;
        }

        JSObject result = new JSObject();
        JSArray devicesArray = new JSArray();

        if (bluetoothAdapter != null) {
            try {
                Set<BluetoothDevice> pairedDevices = bluetoothAdapter.getBondedDevices();
                for (BluetoothDevice device : pairedDevices) {
                    JSObject deviceObj = createDeviceObject(device, -50, "Paired");
                    if (deviceObj != null) {
                        devicesArray.put(deviceObj);
                        // Save paired devices to history
                        String name = deviceObj.getString("name");
                        saveToHistory(device.getAddress(), name, 
                            deviceObj.getString("deviceType"), -50);
                    }
                }
                result.put("success", true);
            } catch (SecurityException e) {
                Log.e(TAG, "Security exception getting paired devices", e);
                result.put("success", false);
                result.put("error", "Permission denied");
            }
        } else {
            result.put("success", false);
            result.put("error", "Bluetooth not available");
        }

        result.put("devices", devicesArray);
        call.resolve(result);
    }

    @PluginMethod
    public void getDeviceHistory(PluginCall call) {
        JSObject result = new JSObject();
        JSArray devicesArray = new JSArray();

        try {
            Map<String, ?> allHistory = historyPrefs.getAll();
            for (Map.Entry<String, ?> entry : allHistory.entrySet()) {
                try {
                    JSONObject history = new JSONObject((String) entry.getValue());
                    JSObject device = new JSObject();
                    device.put("macAddress", history.optString("macAddress", entry.getKey()));
                    device.put("name", history.optString("name", "Unknown"));
                    device.put("deviceType", history.optString("deviceType", "Unknown"));
                    device.put("firstSeen", history.optLong("firstSeen", 0));
                    device.put("lastSeen", history.optLong("lastSeen", 0));
                    device.put("connectionCount", history.optInt("connectionCount", 0));
                    device.put("lastRssi", history.optInt("lastRssi", 0));
                    devicesArray.put(device);
                } catch (JSONException e) {
                    Log.e(TAG, "Error parsing history entry", e);
                }
            }

            result.put("success", true);
            result.put("devices", devicesArray);
            result.put("count", devicesArray.length());
        } catch (Exception e) {
            Log.e(TAG, "Error getting device history", e);
            result.put("success", false);
            result.put("error", e.getMessage());
            result.put("devices", devicesArray);
        }

        call.resolve(result);
    }

    @PluginMethod
    public void clearHistory(PluginCall call) {
        JSObject result = new JSObject();
        try {
            historyPrefs.edit().clear().apply();
            result.put("success", true);
        } catch (Exception e) {
            result.put("success", false);
            result.put("error", e.getMessage());
        }
        call.resolve(result);
    }

    @PluginMethod
    public void scan(PluginCall call) {
        // CRITICAL: ALWAYS check and request permissions on EVERY scan attempt
        // This ensures that even if the user denies permissions multiple times,
        // they can always click the Scan button again to re-request permissions.
        // This prevents the app from getting stuck in a state where scanning is impossible.
        if (!hasBluetoothPermissions()) {
            currentCall = call;
            // Request permissions - this will show the Android permission dialog
            requestAllPermissions(call, "permissionCallback");
            return;
        }

        performScan(call);
    }

    @PermissionCallback
    private void permissionCallback(PluginCall call) {
        // Check if permissions were granted after the request
        if (hasBluetoothPermissions()) {
            // Permissions granted - proceed with scan
            performScan(call);
        } else {
            // Permissions still not granted - return error but allow retry
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "Bluetooth and location permissions are required. Please grant permissions to scan for devices.");
            result.put("devices", new JSArray());
            result.put("permissionDenied", true); // Flag to indicate permission issue
            call.resolve(result);
        }
    }

    private boolean hasBluetoothPermissions() {
        boolean hasLocation = ActivityCompat.checkSelfPermission(getContext(), 
            Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED;
        
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            boolean hasBtScan = ActivityCompat.checkSelfPermission(getContext(), 
                Manifest.permission.BLUETOOTH_SCAN) == PackageManager.PERMISSION_GRANTED;
            boolean hasBtConnect = ActivityCompat.checkSelfPermission(getContext(), 
                Manifest.permission.BLUETOOTH_CONNECT) == PackageManager.PERMISSION_GRANTED;
            return hasLocation && hasBtScan && hasBtConnect;
        }
        
        return hasLocation;
    }

    private void performScan(PluginCall call) {
        if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "Bluetooth is disabled. Please enable Bluetooth.");
            result.put("devices", new JSArray());
            call.resolve(result);
            return;
        }

        if (isScanning) {
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "Scan already in progress");
            result.put("devices", new JSArray());
            call.resolve(result);
            return;
        }

        discoveredDevices.clear();
        currentCall = call;
        isScanning = true;

        // First, add paired/connected devices (these are always real)
        addPairedDevices();

        // Start classic Bluetooth discovery
        startClassicDiscovery();

        // Start BLE scan
        startBleScan();

        // Stop scan after duration
        handler.postDelayed(() -> {
            stopScan();
            returnResults();
        }, SCAN_DURATION);
    }

    private void addPairedDevices() {
        try {
            Set<BluetoothDevice> pairedDevices = bluetoothAdapter.getBondedDevices();
            for (BluetoothDevice device : pairedDevices) {
                addDevice(device, -50, "Paired");
            }
        } catch (SecurityException e) {
            Log.e(TAG, "Security exception getting paired devices", e);
        }
    }

    private void startClassicDiscovery() {
        final BroadcastReceiver[] receiverHolder = new BroadcastReceiver[1];
        
        BroadcastReceiver discoveryReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if (BluetoothDevice.ACTION_FOUND.equals(action)) {
                    BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                    if (device != null) {
                        short rssi = intent.getShortExtra(BluetoothDevice.EXTRA_RSSI, Short.MIN_VALUE);
                        addDevice(device, rssi, "Classic");
                    }
                } else if (BluetoothAdapter.ACTION_DISCOVERY_FINISHED.equals(action)) {
                    try {
                        getContext().unregisterReceiver(receiverHolder[0]);
                    } catch (Exception e) {
                        Log.e(TAG, "Error unregistering receiver", e);
                    }
                }
            }
        };
        
        receiverHolder[0] = discoveryReceiver;

        IntentFilter filter = new IntentFilter();
        filter.addAction(BluetoothDevice.ACTION_FOUND);
        filter.addAction(BluetoothAdapter.ACTION_DISCOVERY_FINISHED);
        getContext().registerReceiver(discoveryReceiver, filter);

        try {
            if (bluetoothAdapter.isDiscovering()) {
                bluetoothAdapter.cancelDiscovery();
            }
            bluetoothAdapter.startDiscovery();
        } catch (SecurityException e) {
            Log.e(TAG, "Security exception starting discovery", e);
            try {
                getContext().unregisterReceiver(discoveryReceiver);
            } catch (Exception ex) {
                // Ignore
            }
        }
    }

    private void startBleScan() {
        if (bleScanner == null) return;

        ScanSettings settings = new ScanSettings.Builder()
            .setScanMode(ScanSettings.SCAN_MODE_LOW_LATENCY)
            .build();

        try {
            bleScanner.startScan(null, settings, bleScanCallback);
        } catch (SecurityException e) {
            Log.e(TAG, "Security exception starting BLE scan", e);
        }
    }

    private final ScanCallback bleScanCallback = new ScanCallback() {
        @Override
        public void onScanResult(int callbackType, ScanResult result) {
            BluetoothDevice device = result.getDevice();
            addDevice(device, result.getRssi(), "BLE");
        }
    };

    private JSObject createDeviceObject(BluetoothDevice device, int rssi, String scanType) {
        try {
            String deviceName = device.getName();
            String address = device.getAddress();
            
            // Get Bluetooth class for device type identification
            int bluetoothClass = 0;
            if (device.getBluetoothClass() != null) {
                bluetoothClass = device.getBluetoothClass().getDeviceClass();
            }
            
            // Always show device - no filtering
            // If no name, use "Unknown Device" or MAC address
            if (deviceName == null || deviceName.trim().isEmpty()) {
                deviceName = "Unknown Device";
            }
            
            String deviceType = identifyDeviceType(address, bluetoothClass, deviceName);
            String deviceClass = getDeviceClassString(bluetoothClass);
            
            // Calculate distance from RSSI
            double distanceMeters = calculateDistance(rssi);
            String distanceDescription = getDistanceDescription(distanceMeters);
            
            // Check if paired
            boolean isPaired = scanType.equals("Paired") || 
                device.getBondState() == BluetoothDevice.BOND_BONDED;
            
            // Check if actually connected (not just paired)
            boolean isConnected = false;
            try {
                // Use reflection to check if device is connected
                // This works for most Android versions
                java.lang.reflect.Method method = device.getClass().getMethod("isConnected");
                isConnected = (boolean) method.invoke(device);
            } catch (Exception e) {
                // If reflection fails, assume not connected
                // We can also check by bond state and recent RSSI
                // If device is paired and has strong recent signal, likely connected
                if (isPaired && rssi > -70) {
                    // Strong signal on paired device suggests connection
                    isConnected = false; // Conservative approach
                }
            }
            
            JSObject deviceObj = new JSObject();
            deviceObj.put("name", deviceName);
            deviceObj.put("macAddress", address);
            deviceObj.put("rssi", rssi);
            deviceObj.put("signal", calculateSignalLevel(rssi));
            deviceObj.put("distance", distanceMeters);
            deviceObj.put("distanceDescription", distanceDescription);
            deviceObj.put("type", getDeviceType(device.getType()));
            deviceObj.put("scanType", scanType);
            deviceObj.put("deviceClass", deviceClass);
            deviceObj.put("deviceType", deviceType);
            deviceObj.put("bondState", getBondState(device.getBondState()));
            deviceObj.put("isPaired", isPaired);
            deviceObj.put("isConnected", isConnected); // Now properly detects connection status
            deviceObj.put("timestamp", System.currentTimeMillis());
            
            return deviceObj;
        } catch (SecurityException e) {
            Log.e(TAG, "Security exception creating device object", e);
            return null;
        }
    }
    
    // Get device class as string
    private String getDeviceClassString(int bluetoothClass) {
        if (bluetoothClass == 0) return "Unknown";
        
        int majorClass = (bluetoothClass & 0x1F00) >> 8;
        
        switch (majorClass) {
            case 0x01: return "Computer";
            case 0x02: return "Phone";
            case 0x03: return "Network";
            case 0x04: return "Audio/Video";
            case 0x05: return "Peripheral";
            case 0x06: return "Imaging";
            case 0x07: return "Wearable";
            case 0x08: return "Toy";
            case 0x09: return "Health";
            default: return "Unknown";
        }
    }

    private void addDevice(BluetoothDevice device, int rssi, String scanType) {
        String address = device.getAddress();
        if (!discoveredDevices.containsKey(address)) {
            JSObject deviceObj = createDeviceObject(device, rssi, scanType);
            if (deviceObj != null) {
                discoveredDevices.put(address, deviceObj);
                // Save to history
                try {
                    saveToHistory(address, deviceObj.getString("name"), 
                        deviceObj.getString("deviceType"), rssi);
                } catch (Exception e) {
                    Log.e(TAG, "Error saving to history", e);
                }
            }
        }
    }

    private void stopScan() {
        isScanning = false;
        try {
            if (bluetoothAdapter != null) {
                bluetoothAdapter.cancelDiscovery();
            }
            if (bleScanner != null) {
                bleScanner.stopScan(bleScanCallback);
            }
        } catch (SecurityException e) {
            Log.e(TAG, "Security exception stopping scan", e);
        }
    }

    private void returnResults() {
        if (currentCall == null) return;

        JSObject result = new JSObject();
        JSArray devicesArray = new JSArray();

        for (JSObject device : discoveredDevices.values()) {
            devicesArray.put(device);
        }

        result.put("success", true);
        result.put("devices", devicesArray);
        result.put("count", discoveredDevices.size());
        currentCall.resolve(result);
        currentCall = null;
    }

    private int calculateSignalLevel(int rssi) {
        if (rssi >= -50) return 100;
        if (rssi >= -60) return 80;
        if (rssi >= -70) return 60;
        if (rssi >= -80) return 40;
        if (rssi >= -90) return 20;
        return 10;
    }

    private String getDeviceType(int type) {
        switch (type) {
            case BluetoothDevice.DEVICE_TYPE_CLASSIC:
                return "Classic";
            case BluetoothDevice.DEVICE_TYPE_LE:
                return "BLE";
            case BluetoothDevice.DEVICE_TYPE_DUAL:
                return "Dual";
            default:
                return "Unknown";
        }
    }

    private String getBondState(int bondState) {
        switch (bondState) {
            case BluetoothDevice.BOND_BONDED:
                return "Paired";
            case BluetoothDevice.BOND_BONDING:
                return "Pairing";
            default:
                return "Not Paired";
        }
    }

    @PluginMethod
    public void pairDevice(PluginCall call) {
        if (!hasBluetoothPermissions()) {
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "Bluetooth permissions required");
            call.resolve(result);
            return;
        }

        String address = call.getString("address");
        if (address == null || address.isEmpty()) {
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "Device address is required");
            call.resolve(result);
            return;
        }

        JSObject result = new JSObject();
        
        try {
            BluetoothDevice device = bluetoothAdapter.getRemoteDevice(address);
            
            // Check if already paired
            if (device.getBondState() == BluetoothDevice.BOND_BONDED) {
                result.put("success", true);
                result.put("message", "Device is already paired");
                call.resolve(result);
                return;
            }
            
            // Attempt to create bond (pair)
            boolean pairingStarted = device.createBond();
            
            if (pairingStarted) {
                result.put("success", true);
                result.put("message", "Pairing initiated. Please accept pairing request on the device.");
            } else {
                result.put("success", false);
                result.put("error", "Failed to initiate pairing");
            }
        } catch (SecurityException e) {
            Log.e(TAG, "Security exception pairing device", e);
            result.put("success", false);
            result.put("error", "Permission denied: " + e.getMessage());
        } catch (Exception e) {
            Log.e(TAG, "Error pairing device", e);
            result.put("success", false);
            result.put("error", "Pairing error: " + e.getMessage());
        }
        
        call.resolve(result);
    }
}
