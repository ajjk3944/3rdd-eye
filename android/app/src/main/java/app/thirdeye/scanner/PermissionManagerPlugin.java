package app.thirdeye.scanner;

import android.Manifest;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;

import androidx.core.app.ActivityCompat;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.annotation.Permission;
import com.getcapacitor.annotation.PermissionCallback;

@CapacitorPlugin(
    name = "PermissionManager",
    permissions = {
        @Permission(
            alias = "location",
            strings = {
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION
            }
        ),
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
            alias = "wifi",
            strings = {
                Manifest.permission.ACCESS_WIFI_STATE,
                Manifest.permission.CHANGE_WIFI_STATE
            }
        )
    }
)
public class PermissionManagerPlugin extends Plugin {
    private static final String TAG = "PermissionManagerPlugin";
    
    private WifiManager wifiManager;
    private BluetoothAdapter bluetoothAdapter;
    private LocationManager locationManager;
    
    @Override
    public void load() {
        super.load();
        wifiManager = (WifiManager) getContext().getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        BluetoothManager bluetoothManager = (BluetoothManager) getContext().getSystemService(Context.BLUETOOTH_SERVICE);
        if (bluetoothManager != null) {
            bluetoothAdapter = bluetoothManager.getAdapter();
        }
        locationManager = (LocationManager) getContext().getSystemService(Context.LOCATION_SERVICE);
    }

    // ============ Check Status Methods ============
    
    @PluginMethod
    public void checkAllStatus(PluginCall call) {
        JSObject result = new JSObject();
        
        // Check permissions
        boolean hasLocationPermission = hasLocationPermission();
        boolean hasBluetoothPermission = hasBluetoothPermission();
        boolean hasWifiPermission = hasWifiPermission();
        
        // Check if services are enabled
        boolean isLocationEnabled = isLocationEnabled();
        boolean isBluetoothEnabled = bluetoothAdapter != null && bluetoothAdapter.isEnabled();
        boolean isWifiEnabled = wifiManager != null && wifiManager.isWifiEnabled();
        
        JSObject permissions = new JSObject();
        permissions.put("location", hasLocationPermission);
        permissions.put("bluetooth", hasBluetoothPermission);
        permissions.put("wifi", hasWifiPermission);
        
        JSObject services = new JSObject();
        services.put("location", isLocationEnabled);
        services.put("bluetooth", isBluetoothEnabled);
        services.put("wifi", isWifiEnabled);
        
        result.put("permissions", permissions);
        result.put("services", services);
        result.put("allPermissionsGranted", hasLocationPermission && hasBluetoothPermission && hasWifiPermission);
        result.put("allServicesEnabled", isLocationEnabled && isBluetoothEnabled && isWifiEnabled);
        
        call.resolve(result);
    }
    
    @PluginMethod
    public void isLocationEnabled(PluginCall call) {
        JSObject result = new JSObject();
        result.put("enabled", isLocationEnabled());
        call.resolve(result);
    }
    
    @PluginMethod
    public void isBluetoothEnabled(PluginCall call) {
        JSObject result = new JSObject();
        result.put("enabled", bluetoothAdapter != null && bluetoothAdapter.isEnabled());
        call.resolve(result);
    }
    
    @PluginMethod
    public void isWifiEnabled(PluginCall call) {
        JSObject result = new JSObject();
        result.put("enabled", wifiManager != null && wifiManager.isWifiEnabled());
        call.resolve(result);
    }
    
    // ============ Permission Request Methods ============
    
    @PluginMethod
    public void requestLocationPermission(PluginCall call) {
        if (hasLocationPermission()) {
            JSObject result = new JSObject();
            result.put("granted", true);
            call.resolve(result);
            return;
        }
        requestPermissionForAlias("location", call, "locationPermissionCallback");
    }
    
    @PermissionCallback
    private void locationPermissionCallback(PluginCall call) {
        JSObject result = new JSObject();
        result.put("granted", hasLocationPermission());
        call.resolve(result);
    }
    
    @PluginMethod
    public void requestBluetoothPermission(PluginCall call) {
        if (hasBluetoothPermission()) {
            JSObject result = new JSObject();
            result.put("granted", true);
            call.resolve(result);
            return;
        }
        
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            requestPermissionForAlias("bluetoothScan", call, "bluetoothPermissionCallback");
        } else {
            requestPermissionForAlias("bluetooth", call, "bluetoothPermissionCallback");
        }
    }
    
    @PermissionCallback
    private void bluetoothPermissionCallback(PluginCall call) {
        JSObject result = new JSObject();
        result.put("granted", hasBluetoothPermission());
        call.resolve(result);
    }
    
    @PluginMethod
    public void requestAllPermissions(PluginCall call) {
        if (hasAllPermissions()) {
            JSObject result = new JSObject();
            result.put("granted", true);
            result.put("location", true);
            result.put("bluetooth", true);
            result.put("wifi", true);
            call.resolve(result);
            return;
        }
        requestAllPermissions(call, "allPermissionsCallback");
    }
    
    @PermissionCallback
    private void allPermissionsCallback(PluginCall call) {
        JSObject result = new JSObject();
        result.put("granted", hasAllPermissions());
        result.put("location", hasLocationPermission());
        result.put("bluetooth", hasBluetoothPermission());
        result.put("wifi", hasWifiPermission());
        call.resolve(result);
    }

    // ============ Enable Service Methods ============
    
    @PluginMethod
    public void enableLocation(PluginCall call) {
        if (isLocationEnabled()) {
            JSObject result = new JSObject();
            result.put("success", true);
            result.put("enabled", true);
            call.resolve(result);
            return;
        }
        
        // Open location settings - user must enable manually
        try {
            Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            getContext().startActivity(intent);
            
            JSObject result = new JSObject();
            result.put("success", true);
            result.put("openedSettings", true);
            result.put("message", "Please enable location services");
            call.resolve(result);
        } catch (Exception e) {
            Log.e(TAG, "Error opening location settings", e);
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "Could not open location settings");
            call.resolve(result);
        }
    }
    
    @PluginMethod
    public void enableBluetooth(PluginCall call) {
        if (bluetoothAdapter == null) {
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "Bluetooth not available on this device");
            call.resolve(result);
            return;
        }
        
        if (bluetoothAdapter.isEnabled()) {
            JSObject result = new JSObject();
            result.put("success", true);
            result.put("enabled", true);
            call.resolve(result);
            return;
        }
        
        try {
            // For Android 12+, we need BLUETOOTH_CONNECT permission to enable
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                if (ActivityCompat.checkSelfPermission(getContext(), 
                    Manifest.permission.BLUETOOTH_CONNECT) != PackageManager.PERMISSION_GRANTED) {
                    // Open Bluetooth settings instead
                    Intent intent = new Intent(Settings.ACTION_BLUETOOTH_SETTINGS);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    getContext().startActivity(intent);
                    
                    JSObject result = new JSObject();
                    result.put("success", true);
                    result.put("openedSettings", true);
                    result.put("message", "Please enable Bluetooth");
                    call.resolve(result);
                    return;
                }
            }
            
            // Try to enable Bluetooth directly
            boolean enabling = bluetoothAdapter.enable();
            
            JSObject result = new JSObject();
            result.put("success", enabling);
            result.put("enabling", enabling);
            if (!enabling) {
                // Fallback to settings
                Intent intent = new Intent(Settings.ACTION_BLUETOOTH_SETTINGS);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getContext().startActivity(intent);
                result.put("openedSettings", true);
                result.put("message", "Please enable Bluetooth");
            }
            call.resolve(result);
        } catch (SecurityException e) {
            Log.e(TAG, "Security exception enabling Bluetooth", e);
            // Fallback to settings
            try {
                Intent intent = new Intent(Settings.ACTION_BLUETOOTH_SETTINGS);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getContext().startActivity(intent);
                
                JSObject result = new JSObject();
                result.put("success", true);
                result.put("openedSettings", true);
                result.put("message", "Please enable Bluetooth");
                call.resolve(result);
            } catch (Exception ex) {
                JSObject result = new JSObject();
                result.put("success", false);
                result.put("error", "Could not enable Bluetooth");
                call.resolve(result);
            }
        }
    }
    
    @PluginMethod
    public void enableWifi(PluginCall call) {
        if (wifiManager == null) {
            JSObject result = new JSObject();
            result.put("success", false);
            result.put("error", "WiFi not available on this device");
            call.resolve(result);
            return;
        }
        
        if (wifiManager.isWifiEnabled()) {
            JSObject result = new JSObject();
            result.put("success", true);
            result.put("enabled", true);
            call.resolve(result);
            return;
        }
        
        try {
            // For Android 10+, we cannot enable WiFi programmatically
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                Intent intent = new Intent(Settings.Panel.ACTION_WIFI);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getContext().startActivity(intent);
                
                JSObject result = new JSObject();
                result.put("success", true);
                result.put("openedSettings", true);
                result.put("message", "Please enable WiFi");
                call.resolve(result);
            } else {
                // For older Android versions, try to enable directly
                boolean enabled = wifiManager.setWifiEnabled(true);
                
                JSObject result = new JSObject();
                result.put("success", enabled);
                result.put("enabled", enabled);
                call.resolve(result);
            }
        } catch (Exception e) {
            Log.e(TAG, "Error enabling WiFi", e);
            // Fallback to settings
            try {
                Intent intent = new Intent(Settings.ACTION_WIFI_SETTINGS);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getContext().startActivity(intent);
                
                JSObject result = new JSObject();
                result.put("success", true);
                result.put("openedSettings", true);
                result.put("message", "Please enable WiFi");
                call.resolve(result);
            } catch (Exception ex) {
                JSObject result = new JSObject();
                result.put("success", false);
                result.put("error", "Could not enable WiFi");
                call.resolve(result);
            }
        }
    }

    // ============ Helper Methods ============
    
    private boolean hasLocationPermission() {
        return ActivityCompat.checkSelfPermission(getContext(), 
            Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED;
    }
    
    private boolean hasBluetoothPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            boolean hasBtScan = ActivityCompat.checkSelfPermission(getContext(), 
                Manifest.permission.BLUETOOTH_SCAN) == PackageManager.PERMISSION_GRANTED;
            boolean hasBtConnect = ActivityCompat.checkSelfPermission(getContext(), 
                Manifest.permission.BLUETOOTH_CONNECT) == PackageManager.PERMISSION_GRANTED;
            return hasBtScan && hasBtConnect;
        }
        return true; // Legacy Bluetooth permissions are normal permissions
    }
    
    private boolean hasWifiPermission() {
        return ActivityCompat.checkSelfPermission(getContext(), 
            Manifest.permission.ACCESS_WIFI_STATE) == PackageManager.PERMISSION_GRANTED;
    }
    
    private boolean hasAllPermissions() {
        return hasLocationPermission() && hasBluetoothPermission() && hasWifiPermission();
    }
    
    private boolean isLocationEnabled() {
        if (locationManager == null) return false;
        
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            return locationManager.isLocationEnabled();
        } else {
            boolean gpsEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
            boolean networkEnabled = locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
            return gpsEnabled || networkEnabled;
        }
    }
}
