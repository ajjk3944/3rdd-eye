package app.thirdeye.scanner.armapper;

import android.Manifest;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanSettings;
import android.os.Build;
import android.util.Log;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.annotation.Permission;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@CapacitorPlugin(
    name = "ARMapper",
    permissions = {
        @Permission(strings = { Manifest.permission.ACCESS_FINE_LOCATION }, alias = "location"),
        @Permission(strings = { Manifest.permission.BLUETOOTH_SCAN, Manifest.permission.BLUETOOTH_CONNECT }, alias = "bluetooth"),
        @Permission(strings = { Manifest.permission.CAMERA }, alias = "camera")
    }
)
public class ARMapperPlugin extends Plugin implements SensorEventListener {

    private static final String TAG = "ARMapperPlugin";

    private SensorManager sensorManager;
    private Sensor accelerometer;
    private Sensor magnetometer;

    private float[] gravity;
    private float[] geomagnetic;
    private float azimuth = 0;
    private float pitch = 0;
    private float roll = 0;

    // Low-pass filter coefficient (lower = smoother compass)
    private static final float ALPHA = 0.15f;
    private float smoothAzimuth = 0;
    private float smoothPitch = 0;
    private float smoothRoll = 0;

    private WifiManager wifiManager;
    private BluetoothAdapter bluetoothAdapter;
    private BluetoothLeScanner bleScanner;

    private boolean isScanning = false;
    private boolean isSensorActive = false;

    private final ConcurrentHashMap<String, BLEDeviceInfo> bleDevices = new ConcurrentHashMap<>();

    @Override
    public void load() {
        Context context = getContext();
        sensorManager = (SensorManager) context.getSystemService(Context.SENSOR_SERVICE);
        accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        magnetometer = sensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);

        wifiManager = (WifiManager) context.getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (bluetoothAdapter != null) {
            bleScanner = bluetoothAdapter.getBluetoothLeScanner();
        }
    }

    // =============================================
    // PLUGIN METHODS (called from TypeScript)
    // =============================================

    @PluginMethod
    public void startARScan(PluginCall call) {
        try {
            startSensors();
            isScanning = true;

            // Start BLE scan too
            if (bleScanner != null) {
                bleDevices.clear();
                ScanSettings settings = new ScanSettings.Builder()
                    .setScanMode(ScanSettings.SCAN_MODE_LOW_LATENCY)
                    .setReportDelay(0)
                    .build();
                try {
                    bleScanner.startScan(null, settings, bleScanCallback);
                } catch (Exception e) {
                    Log.w(TAG, "BLE scan start failed: " + e.getMessage());
                }
            }

            JSObject result = new JSObject();
            result.put("success", true);
            result.put("hasCompass", magnetometer != null);
            result.put("hasBluetooth", bluetoothAdapter != null);
            result.put("hasWifi", wifiManager != null);
            call.resolve(result);
        } catch (Exception e) {
            call.reject("Failed to start AR scan: " + e.getMessage());
        }
    }

    @PluginMethod
    public void stopARScan(PluginCall call) {
        try {
            stopSensors();
            stopBLEScanInternal();
            isScanning = false;
            bleDevices.clear();

            JSObject result = new JSObject();
            result.put("success", true);
            call.resolve(result);
        } catch (Exception e) {
            call.reject("Failed to stop AR scan: " + e.getMessage());
        }
    }

    @PluginMethod
    public void getOrientation(PluginCall call) {
        JSObject result = new JSObject();
        result.put("azimuth", smoothAzimuth);
        result.put("pitch", smoothPitch);
        result.put("roll", smoothRoll);
        result.put("direction", getCardinalDirection(smoothAzimuth));
        call.resolve(result);
    }

    @PluginMethod
    public void getARData(PluginCall call) {
        try {
            JSObject result = new JSObject();

            // Orientation
            JSObject orientation = new JSObject();
            orientation.put("azimuth", smoothAzimuth);
            orientation.put("pitch", smoothPitch);
            orientation.put("roll", smoothRoll);
            orientation.put("direction", getCardinalDirection(smoothAzimuth));
            result.put("orientation", orientation);

            // WiFi networks
            if (wifiManager != null) {
                wifiManager.startScan();
                List<ScanResult> wifiResults = wifiManager.getScanResults();
                JSArray networks = new JSArray();
                for (ScanResult sr : wifiResults) {
                    JSObject net = new JSObject();
                    net.put("ssid", sr.SSID != null && !sr.SSID.isEmpty() ? sr.SSID : "Hidden Network");
                    net.put("bssid", sr.BSSID);
                    net.put("dbm", sr.level);
                    net.put("frequency", sr.frequency);
                    net.put("channel", frequencyToChannel(sr.frequency));
                    net.put("band", sr.frequency > 4900 ? "5 GHz" : "2.4 GHz");
                    net.put("security", getSecurityType(sr));
                    net.put("quality", getSignalQuality(sr.level));
                    net.put("qualityPercent", getSignalPercent(sr.level));
                    net.put("type", "wifi");
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                        net.put("standard", getWifiStandard(sr));
                    }
                    networks.put(net);
                }
                result.put("wifiNetworks", networks);
                result.put("wifiCount", wifiResults.size());
            } else {
                result.put("wifiNetworks", new JSArray());
                result.put("wifiCount", 0);
            }

            // BLE devices
            JSArray btDevicesArr = new JSArray();
            for (Map.Entry<String, BLEDeviceInfo> entry : bleDevices.entrySet()) {
                BLEDeviceInfo info = entry.getValue();
                // Skip devices not seen in last 30 seconds
                if (System.currentTimeMillis() - info.lastSeen > 30000) continue;
                JSObject dev = new JSObject();
                dev.put("name", info.name);
                dev.put("mac", info.mac);
                dev.put("dbm", info.rssi);
                dev.put("quality", getSignalQuality(info.rssi));
                dev.put("qualityPercent", getSignalPercent(info.rssi));
                dev.put("type", "bluetooth");
                dev.put("btType", "BLE");
                btDevicesArr.put(dev);
            }
            result.put("bluetoothDevices", btDevicesArr);
            result.put("bluetoothCount", btDevicesArr.length());

            result.put("timestamp", System.currentTimeMillis());
            result.put("isScanning", isScanning);

            call.resolve(result);
        } catch (Exception e) {
            call.reject("Failed to get AR data: " + e.getMessage());
        }
    }

    // =============================================
    // SENSOR HANDLING
    // =============================================

    private void startSensors() {
        if (!isSensorActive) {
            if (accelerometer != null)
                sensorManager.registerListener(this, accelerometer, SensorManager.SENSOR_DELAY_UI);
            if (magnetometer != null)
                sensorManager.registerListener(this, magnetometer, SensorManager.SENSOR_DELAY_UI);
            isSensorActive = true;
        }
    }

    private void stopSensors() {
        if (isSensorActive) {
            sensorManager.unregisterListener(this);
            isSensorActive = false;
        }
    }

    private void stopBLEScanInternal() {
        try {
            if (bleScanner != null) {
                bleScanner.stopScan(bleScanCallback);
            }
        } catch (Exception e) {
            Log.w(TAG, "Error stopping BLE scan: " + e.getMessage());
        }
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            gravity = lowPass(event.values.clone(), gravity);
        } else if (event.sensor.getType() == Sensor.TYPE_MAGNETIC_FIELD) {
            geomagnetic = lowPass(event.values.clone(), geomagnetic);
        }

        if (gravity != null && geomagnetic != null) {
            float[] R = new float[9];
            float[] I = new float[9];

            if (SensorManager.getRotationMatrix(R, I, gravity, geomagnetic)) {
                float[] orientationVals = new float[3];
                SensorManager.getOrientation(R, orientationVals);

                float rawAzimuth = (float) Math.toDegrees(orientationVals[0]);
                if (rawAzimuth < 0) rawAzimuth += 360;

                // Smooth compass (circular low-pass for 359->0 wraparound)
                float diff = rawAzimuth - smoothAzimuth;
                if (diff > 180) diff -= 360;
                if (diff < -180) diff += 360;
                smoothAzimuth += ALPHA * diff;
                if (smoothAzimuth < 0) smoothAzimuth += 360;
                if (smoothAzimuth >= 360) smoothAzimuth -= 360;

                smoothPitch += ALPHA * ((float) Math.toDegrees(orientationVals[1]) - smoothPitch);
                smoothRoll += ALPHA * ((float) Math.toDegrees(orientationVals[2]) - smoothRoll);

                // Send event to frontend
                if (isScanning) {
                    JSObject data = new JSObject();
                    data.put("azimuth", smoothAzimuth);
                    data.put("pitch", smoothPitch);
                    data.put("roll", smoothRoll);
                    data.put("direction", getCardinalDirection(smoothAzimuth));
                    notifyListeners("orientationChange", data);
                }
            }
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {}

    // =============================================
    // BLE SCAN CALLBACK
    // =============================================

    private final ScanCallback bleScanCallback = new ScanCallback() {
        @Override
        public void onScanResult(int callbackType, android.bluetooth.le.ScanResult result) {
            BluetoothDevice device = result.getDevice();
            String mac = device.getAddress();
            String name = device.getName();
            if (name == null || name.isEmpty()) name = "Unknown Device";
            int rssi = result.getRssi();

            bleDevices.put(mac, new BLEDeviceInfo(name, mac, rssi));

            // Notify frontend
            JSObject data = new JSObject();
            data.put("name", name);
            data.put("mac", mac);
            data.put("dbm", rssi);
            data.put("quality", getSignalQuality(rssi));
            data.put("type", "bluetooth");
            notifyListeners("bleDeviceFound", data);
        }
    };

    // =============================================
    // HELPER METHODS
    // =============================================

    private float[] lowPass(float[] input, float[] output) {
        if (output == null) return input;
        for (int i = 0; i < input.length; i++) {
            output[i] = output[i] + ALPHA * (input[i] - output[i]);
        }
        return output;
    }

    private int frequencyToChannel(int freq) {
        if (freq >= 2412 && freq <= 2484) return (freq - 2407) / 5;
        if (freq >= 5170 && freq <= 5825) return (freq - 5000) / 5;
        return 0;
    }

    private String getSecurityType(ScanResult sr) {
        String caps = sr.capabilities;
        if (caps.contains("WPA3")) return "WPA3";
        if (caps.contains("WPA2")) return "WPA2";
        if (caps.contains("WPA")) return "WPA";
        if (caps.contains("WEP")) return "WEP";
        return "Open";
    }

    private String getSignalQuality(int dbm) {
        if (dbm >= -50) return "Excellent";
        if (dbm >= -60) return "Very Good";
        if (dbm >= -70) return "Good";
        if (dbm >= -80) return "Fair";
        return "Weak";
    }

    private int getSignalPercent(int dbm) {
        if (dbm >= -30) return 100;
        if (dbm <= -90) return 5;
        return (int) ((dbm + 90.0) / 60.0 * 100);
    }

    private String getCardinalDirection(float deg) {
        String[] dirs = {"N", "NE", "E", "SE", "S", "SW", "W", "NW"};
        return dirs[Math.round(deg / 45) % 8];
    }

    private String getWifiStandard(ScanResult sr) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            switch (sr.getWifiStandard()) {
                case ScanResult.WIFI_STANDARD_11AX: return "Wi-Fi 6 (802.11ax)";
                case ScanResult.WIFI_STANDARD_11AC: return "Wi-Fi 5 (802.11ac)";
                case ScanResult.WIFI_STANDARD_11N: return "Wi-Fi 4 (802.11n)";
                case ScanResult.WIFI_STANDARD_LEGACY: return "Legacy (802.11a/b/g)";
                default: return "Unknown";
            }
        }
        return "Unknown";
    }

    @Override
    protected void handleOnDestroy() {
        stopSensors();
        stopBLEScanInternal();
        super.handleOnDestroy();
    }

    // Inner class
    private static class BLEDeviceInfo {
        String name;
        String mac;
        int rssi;
        long lastSeen;
        BLEDeviceInfo(String name, String mac, int rssi) {
            this.name = name;
            this.mac = mac;
            this.rssi = rssi;
            this.lastSeen = System.currentTimeMillis();
        }
    }
}
