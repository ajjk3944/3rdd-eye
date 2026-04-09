package app.thirdeye.scanner;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.RemoteException;
import androidx.annotation.RequiresApi;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CapacitorPlugin(name = "NetworkTraffic")
public class NetworkTrafficPlugin extends Plugin {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @PluginMethod
    public void getDeviceTraffic(PluginCall call) {
        String macAddress = call.getString("macAddress");
        
        if (macAddress == null) {
            call.reject("MAC address is required");
            return;
        }

        try {
            Context context = getContext();
            NetworkStatsManager networkStatsManager = (NetworkStatsManager) context.getSystemService(Context.NETWORK_STATS_SERVICE);
            
            // Get traffic for the last 10 seconds
            long endTime = System.currentTimeMillis();
            long startTime = endTime - 10000; // 10 seconds ago
            
            JSObject result = new JSObject();
            result.put("macAddress", macAddress);
            result.put("timestamp", endTime);
            
            // Get WiFi traffic
            TrafficData wifiStats = getWifiTraffic(networkStatsManager, startTime, endTime);
            result.put("bytesUploaded", wifiStats.txBytes);
            result.put("bytesDownloaded", wifiStats.rxBytes);
            result.put("connectionCount", wifiStats.connections);
            
            call.resolve(result);
            
        } catch (Exception e) {
            // If NetworkStatsManager fails, try alternative method
            JSObject result = new JSObject();
            result.put("macAddress", macAddress);
            result.put("timestamp", System.currentTimeMillis());
            result.put("bytesUploaded", getTrafficFromProc("tx"));
            result.put("bytesDownloaded", getTrafficFromProc("rx"));
            result.put("connectionCount", getConnectionCount());
            
            call.resolve(result);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private TrafficData getWifiTraffic(NetworkStatsManager networkStatsManager, long startTime, long endTime) {
        long totalTx = 0;
        long totalRx = 0;
        int connections = 0;

        try {
            NetworkStats networkStats = networkStatsManager.querySummary(
                ConnectivityManager.TYPE_WIFI,
                null,
                startTime,
                endTime
            );

            NetworkStats.Bucket bucket = new NetworkStats.Bucket();
            while (networkStats.hasNextBucket()) {
                networkStats.getNextBucket(bucket);
                totalTx += bucket.getTxBytes();
                totalRx += bucket.getRxBytes();
                connections++;
            }
            networkStats.close();
            
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        return new TrafficData(totalTx, totalRx, connections);
    }

    @PluginMethod
    public void getActiveConnections(PluginCall call) {
        try {
            JSArray connections = new JSArray();
            Map<String, Integer> ipCounts = new HashMap<>();
            
            // Parse /proc/net/tcp for active connections
            BufferedReader reader = new BufferedReader(new FileReader("/proc/net/tcp"));
            String line;
            boolean firstLine = true;
            
            while ((line = reader.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue; // Skip header
                }
                
                String[] parts = line.trim().split("\\s+");
                if (parts.length >= 3) {
                    String remoteAddr = parts[2];
                    String[] addrParts = remoteAddr.split(":");
                    if (addrParts.length >= 1) {
                        String ip = parseHexIP(addrParts[0]);
                        
                        // Count connections per IP
                        ipCounts.put(ip, ipCounts.getOrDefault(ip, 0) + 1);
                    }
                }
            }
            reader.close();
            
            // Convert to JSArray
            for (Map.Entry<String, Integer> entry : ipCounts.entrySet()) {
                JSObject conn = new JSObject();
                conn.put("destinationIP", entry.getKey());
                conn.put("count", entry.getValue());
                connections.put(conn);
            }
            
            JSObject result = new JSObject();
            result.put("connections", connections);
            result.put("totalConnections", ipCounts.size());
            call.resolve(result);
            
        } catch (IOException e) {
            call.reject("Failed to get connections: " + e.getMessage());
        }
    }

    @PluginMethod
    public void getPortActivity(PluginCall call) {
        try {
            JSArray ports = new JSArray();
            Map<Integer, Integer> portCounts = new HashMap<>();
            
            // Parse /proc/net/tcp for port activity
            BufferedReader reader = new BufferedReader(new FileReader("/proc/net/tcp"));
            String line;
            boolean firstLine = true;
            
            while ((line = reader.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                
                String[] parts = line.trim().split("\\s+");
                if (parts.length >= 2) {
                    String localAddr = parts[1];
                    String[] addrParts = localAddr.split(":");
                    if (addrParts.length >= 2) {
                        int port = Integer.parseInt(addrParts[1], 16);
                        portCounts.put(port, portCounts.getOrDefault(port, 0) + 1);
                    }
                }
            }
            reader.close();
            
            // Convert to JSArray
            for (Map.Entry<Integer, Integer> entry : portCounts.entrySet()) {
                JSObject portObj = new JSObject();
                portObj.put("port", entry.getKey());
                portObj.put("count", entry.getValue());
                ports.put(portObj);
            }
            
            JSObject result = new JSObject();
            result.put("ports", ports);
            call.resolve(result);
            
        } catch (IOException e) {
            call.reject("Failed to get port activity: " + e.getMessage());
        }
    }

    @PluginMethod
    public void getAllDevicesTraffic(PluginCall call) {
        try {
            JSArray devices = new JSArray();
            
            // Read /proc/net/arp to get all devices
            BufferedReader reader = new BufferedReader(new FileReader("/proc/net/arp"));
            String line;
            boolean firstLine = true;
            
            while ((line = reader.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                
                String[] parts = line.trim().split("\\s+");
                if (parts.length >= 4) {
                    String ip = parts[0];
                    String mac = parts[3];
                    
                    if (!mac.equals("00:00:00:00:00:00") && !ip.equals("0.0.0.0")) {
                        JSObject device = new JSObject();
                        device.put("ipAddress", ip);
                        device.put("macAddress", mac);
                        device.put("bytesUploaded", getTrafficFromProc("tx"));
                        device.put("bytesDownloaded", getTrafficFromProc("rx"));
                        devices.put(device);
                    }
                }
            }
            reader.close();
            
            JSObject result = new JSObject();
            result.put("devices", devices);
            result.put("timestamp", System.currentTimeMillis());
            call.resolve(result);
            
        } catch (IOException e) {
            call.reject("Failed to get all devices traffic: " + e.getMessage());
        }
    }

    private String parseHexIP(String hex) {
        try {
            long ip = Long.parseLong(hex, 16);
            return String.format("%d.%d.%d.%d",
                (ip & 0xFF),
                ((ip >> 8) & 0xFF),
                ((ip >> 16) & 0xFF),
                ((ip >> 24) & 0xFF)
            );
        } catch (Exception e) {
            return "0.0.0.0";
        }
    }

    private long getTrafficFromProc(String type) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/proc/net/dev"));
            String line;
            long totalBytes = 0;
            
            while ((line = reader.readLine()) != null) {
                if (line.contains("wlan0") || line.contains("eth0")) {
                    String[] parts = line.trim().split("\\s+");
                    if (parts.length >= 10) {
                        if (type.equals("rx")) {
                            totalBytes += Long.parseLong(parts[1]); // RX bytes
                        } else {
                            totalBytes += Long.parseLong(parts[9]); // TX bytes
                        }
                    }
                }
            }
            reader.close();
            return totalBytes;
            
        } catch (Exception e) {
            return 0;
        }
    }

    private int getConnectionCount() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/proc/net/tcp"));
            int count = 0;
            String line;
            
            while ((line = reader.readLine()) != null) {
                count++;
            }
            reader.close();
            return Math.max(0, count - 1); // Subtract header line
            
        } catch (Exception e) {
            return 0;
        }
    }

    private static class TrafficData {
        long txBytes;
        long rxBytes;
        int connections;

        TrafficData(long txBytes, long rxBytes, int connections) {
            this.txBytes = txBytes;
            this.rxBytes = rxBytes;
            this.connections = connections;
        }
    }
}
