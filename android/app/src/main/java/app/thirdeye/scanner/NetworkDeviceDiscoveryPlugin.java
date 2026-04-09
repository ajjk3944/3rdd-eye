package app.thirdeye.scanner;

import android.content.Intent;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import java.util.ArrayList;
import java.util.List;

import app.thirdeye.scanner.network.ConnectedDevicesActivity;
import app.thirdeye.scanner.network.DeviceInfo;
import app.thirdeye.scanner.network.NetworkDeviceScanner;
import app.thirdeye.scanner.network.RouterAdminWebViewActivity;
import app.thirdeye.scanner.network.RouterPasswordActivity;

@CapacitorPlugin(name = "NetworkDeviceDiscovery")
public class NetworkDeviceDiscoveryPlugin extends Plugin {
    private NetworkDeviceScanner scanner;
    private static List<DeviceInfo> lastScannedDevices = new ArrayList<>();

    @PluginMethod
    public void openDeviceScanner(PluginCall call) {
        try {
            Intent intent = new Intent(getContext(), ConnectedDevicesActivity.class);
            getActivity().startActivity(intent);
            call.resolve();
        } catch (Exception e) {
            call.reject("Failed to open device scanner: " + e.getMessage(), e);
        }
    }

    @PluginMethod
    public void openRouterAdmin(PluginCall call) {
        try {
            String url = call.getString("url", "");
            
            // If no valid URL provided or it's the generic fallback, get REAL gateway from Android
            if (url == null || url.isEmpty() || url.equals("192.168.1.1")) {
                try {
                    android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager)
                            getContext().getApplicationContext().getSystemService(android.content.Context.WIFI_SERVICE);
                    if (wifiManager != null) {
                        android.net.DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
                        if (dhcpInfo != null && dhcpInfo.gateway != 0) {
                            int gateway = dhcpInfo.gateway;
                            url = String.format("%d.%d.%d.%d",
                                    (gateway & 0xff),
                                    (gateway >> 8 & 0xff),
                                    (gateway >> 16 & 0xff),
                                    (gateway >> 24 & 0xff));
                        }
                    }
                } catch (Exception e) {
                    // Fallback to default if native gateway detection fails
                }
            }
            
            // Final fallback
            if (url == null || url.isEmpty()) {
                url = "192.168.1.1";
            }
            
            Intent intent = new Intent(getContext(), RouterAdminWebViewActivity.class);
            intent.putExtra(RouterAdminWebViewActivity.EXTRA_URL, url);
            intent.putExtra(RouterAdminWebViewActivity.EXTRA_TITLE, "Router Admin");
            getActivity().startActivity(intent);
            
            call.resolve();
        } catch (Exception e) {
            call.reject("Failed to open router admin: " + e.getMessage(), e);
        }
    }

    @PluginMethod
    public void openRouterPasswords(PluginCall call) {
        try {
            Intent intent = new Intent(getContext(), RouterPasswordActivity.class);
            getActivity().startActivity(intent);
            
            call.resolve();
        } catch (Exception e) {
            call.reject("Failed to open router passwords: " + e.getMessage(), e);
        }
    }

    @PluginMethod
    public void getScannedDevices(PluginCall call) {
        JSObject ret = new JSObject();
        ret.put("status", "success");
        ret.put("deviceCount", lastScannedDevices.size());
        
        JSArray devicesArray = new JSArray();
        for (DeviceInfo device : lastScannedDevices) {
            devicesArray.put(deviceToJSObject(device));
        }
        ret.put("devices", devicesArray);
        
        call.resolve(ret);
    }

    public static void setScannedDevices(List<DeviceInfo> devices) {
        lastScannedDevices = new ArrayList<>(devices);
    }

    @PluginMethod
    public void startScan(PluginCall call) {
        if (scanner == null) {
            scanner = new NetworkDeviceScanner(getContext());
        }

        scanner.setScanCallback(new NetworkDeviceScanner.ScanCallback() {
            @Override
            public void onScanStarted() {
                JSObject ret = new JSObject();
                ret.put("status", "started");
                notifyListeners("scanStarted", ret);
            }

            @Override
            public void onDeviceFound(DeviceInfo device) {
                JSObject deviceObj = deviceToJSObject(device);
                notifyListeners("deviceFound", deviceObj);
            }

            @Override
            public void onScanProgress(int current, int total) {
                JSObject ret = new JSObject();
                ret.put("current", current);
                ret.put("total", total);
                notifyListeners("scanProgress", ret);
            }

            @Override
            public void onScanCompleted(List<DeviceInfo> devices) {
                JSObject ret = new JSObject();
                ret.put("status", "completed");
                ret.put("deviceCount", devices.size());
                
                JSArray devicesArray = new JSArray();
                for (DeviceInfo device : devices) {
                    devicesArray.put(deviceToJSObject(device));
                }
                ret.put("devices", devicesArray);
                
                call.resolve(ret);
            }

            @Override
            public void onScanError(String error) {
                call.reject(error);
            }
        });

        scanner.startScan();
    }

    @PluginMethod
    public void stopScan(PluginCall call) {
        if (scanner != null) {
            scanner.stopScan();
        }
        call.resolve();
    }

    private JSObject deviceToJSObject(DeviceInfo device) {
        JSObject obj = new JSObject();
        obj.put("ipAddress", device.getIpAddress());
        obj.put("macAddress", device.getMacAddress());
        obj.put("hostname", device.getHostname());
        obj.put("deviceName", device.getDeviceName());
        obj.put("isOnline", device.isOnline());
        obj.put("isRouter", device.isRouter());
        obj.put("isThisDevice", device.isThisDevice());
        obj.put("lastSeen", device.getLastSeen());
        return obj;
    }
}
