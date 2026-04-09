package app.thirdeye.scanner.widget;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;

public class WidgetDataHelper {

    // ===== WiFi Data =====
    public static class WifiData {
        public boolean isConnected;
        public String ssid;
        public int signalDbm;
        public int signalPercent;
        public String ipAddress;
        public String bssid;
        public int frequency;
        public int linkSpeed;
    }

    public static WifiData getCurrentWifiData(Context context) {
        WifiData data = new WifiData();
        data.isConnected = false;
        data.ssid = "Not Connected";
        data.signalDbm = -100;
        
        try {
            ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            if (cm == null) {
                return data;
            }
            
            boolean isWifiConnected = false;

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                Network network = cm.getActiveNetwork();
                if (network != null) {
                    NetworkCapabilities caps = cm.getNetworkCapabilities(network);
                    isWifiConnected = caps != null && caps.hasTransport(NetworkCapabilities.TRANSPORT_WIFI);
                }
            } else {
                android.net.NetworkInfo networkInfo = cm.getActiveNetworkInfo();
                isWifiConnected = networkInfo != null && 
                    networkInfo.getType() == ConnectivityManager.TYPE_WIFI && 
                    networkInfo.isConnected();
            }

            if (!isWifiConnected) {
                data.isConnected = false;
                return data;
            }

            WifiManager wifiManager = (WifiManager) context.getApplicationContext()
                .getSystemService(Context.WIFI_SERVICE);
            if (wifiManager == null) {
                return data;
            }
            
            WifiInfo wifiInfo = wifiManager.getConnectionInfo();

            if (wifiInfo != null) {
                data.isConnected = true;

                // SSID (remove quotes)
                String ssid = wifiInfo.getSSID();
                if (ssid != null) {
                    ssid = ssid.replace("\"", "");
                    if (ssid.equals("<unknown ssid>")) {
                        ssid = "Connected WiFi";
                    }
                    data.ssid = ssid;
                } else {
                    data.ssid = "Connected WiFi";
                }

                // Signal
                data.signalDbm = wifiInfo.getRssi();
                data.signalPercent = WifiManager.calculateSignalLevel(wifiInfo.getRssi(), 100);

                // IP Address
                int ip = wifiInfo.getIpAddress();
                data.ipAddress = String.format("%d.%d.%d.%d",
                    (ip & 0xff), (ip >> 8 & 0xff), (ip >> 16 & 0xff), (ip >> 24 & 0xff));

                // BSSID
                data.bssid = wifiInfo.getBSSID();

                // Frequency & Link Speed
                data.frequency = wifiInfo.getFrequency();
                data.linkSpeed = wifiInfo.getLinkSpeed();
            }
        } catch (Exception e) {
            data.isConnected = false;
            data.ssid = "Error";
        }
        return data;
    }

    // ===== Last Speed Test Result =====
    public static class SpeedData {
        public boolean hasData;
        public double downloadMbps;
        public double uploadMbps;
        public int pingMs;
    }

    public static SpeedData getLastSpeedTest(Context context) {
        SpeedData data = new SpeedData();
        data.hasData = false;
        // Speed test data not persisted in database - show N/A
        return data;
    }

    // ===== Connected Devices Count =====
    public static int getConnectedDevicesCount(Context context) {
        // Device count not persisted in database - return 0
        return 0;
    }
}
