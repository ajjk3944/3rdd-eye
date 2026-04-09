# Android Network Traffic Plugin - Implementation Guide

## Overview
This plugin captures REAL network traffic data from devices on your network for anomaly detection.

## Required Android Permissions

Add to `AndroidManifest.xml`:
```xml
<uses-permission android:name="android.permission.PACKAGE_USAGE_STATS" />
<uses-permission android:name="android.permission.READ_PHONE_STATE" />
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
```

## Plugin Implementation

### 1. Create NetworkTrafficPlugin.kt

```kotlin
package com.yourapp.plugins

import android.app.usage.NetworkStats
import android.app.usage.NetworkStatsManager
import android.content.Context
import android.net.ConnectivityManager
import android.os.Build
import androidx.annotation.RequiresApi
import com.getcapacitor.JSObject
import com.getcapacitor.Plugin
import com.getcapacitor.PluginCall
import com.getcapacitor.PluginMethod
import com.getcapacitor.annotation.CapacitorPlugin

@CapacitorPlugin(name = "NetworkTraffic")
class NetworkTrafficPlugin : Plugin() {

    @RequiresApi(Build.VERSION_CODES.M)
    @PluginMethod
    fun getDeviceTraffic(call: PluginCall) {
        val macAddress = call.getString("macAddress")
        val uid = call.getInt("uid", -1)
        
        if (macAddress == null) {
            call.reject("MAC address is required")
            return
        }

        try {
            val context = activity.applicationContext
            val networkStatsManager = context.getSystemService(Context.NETWORK_STATS_SERVICE) as NetworkStatsManager
            
            // Get traffic for the last 10 seconds
            val endTime = System.currentTimeMillis()
            val startTime = endTime - 10000 // 10 seconds ago
            
            val result = JSObject()
            result.put("macAddress", macAddress)
            result.put("timestamp", endTime)
            
            // Get WiFi traffic
            val wifiStats = getWifiTraffic(networkStatsManager, uid, startTime, endTime)
            result.put("bytesUploaded", wifiStats.txBytes)
            result.put("bytesDownloaded", wifiStats.rxBytes)
            result.put("connectionCount", wifiStats.connections)
            
            call.resolve(result)
            
        } catch (e: Exception) {
            call.reject("Failed to get traffic data: ${e.message}")
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun getWifiTraffic(
        networkStatsManager: NetworkStatsManager,
        uid: Int,
        startTime: Long,
        endTime: Long
    ): TrafficData {
        var totalTx = 0L
        var totalRx = 0L
        var connections = 0

        try {
            val networkStats = networkStatsManager.querySummary(
                ConnectivityManager.TYPE_WIFI,
                null,
                startTime,
                endTime
            )

            val bucket = NetworkStats.Bucket()
            while (networkStats.hasNextBucket()) {
                networkStats.getNextBucket(bucket)
                
                if (uid == -1 || bucket.uid == uid) {
                    totalTx += bucket.txBytes
                    totalRx += bucket.rxBytes
                    connections++
                }
            }
            networkStats.close()
            
        } catch (e: Exception) {
            // Handle exception
        }

        return TrafficData(totalTx, totalRx, connections)
    }

    @PluginMethod
    fun getActiveConnections(call: PluginCall) {
        try {
            // Get active network connections
            // This would use /proc/net/tcp or similar
            val connections = mutableListOf<JSObject>()
            
            // Parse /proc/net/tcp for active connections
            val tcpFile = java.io.File("/proc/net/tcp")
            if (tcpFile.exists()) {
                tcpFile.forEachLine { line ->
                    if (!line.contains("local_address")) {
                        val parts = line.trim().split("\\s+".toRegex())
                        if (parts.size >= 3) {
                            val remoteAddr = parts[2]
                            val ip = parseHexIP(remoteAddr.split(":")[0])
                            
                            val conn = JSObject()
                            conn.put("destinationIP", ip)
                            conn.put("state", parts[3])
                            connections.add(conn)
                        }
                    }
                }
            }
            
            val result = JSObject()
            result.put("connections", connections)
            call.resolve(result)
            
        } catch (e: Exception) {
            call.reject("Failed to get connections: ${e.message}")
        }
    }

    private fun parseHexIP(hex: String): String {
        return try {
            val ip = hex.toLong(16)
            "${ip and 0xFF}.${(ip shr 8) and 0xFF}.${(ip shr 16) and 0xFF}.${(ip shr 24) and 0xFF}"
        } catch (e: Exception) {
            "0.0.0.0"
        }
    }

    data class TrafficData(
        val txBytes: Long,
        val rxBytes: Long,
        val connections: Int
    )
}
```

### 2. Register Plugin

In `MainActivity.kt`:
```kotlin
import com.yourapp.plugins.NetworkTrafficPlugin

class MainActivity : BridgeActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerPlugin(NetworkTrafficPlugin::class.java)
    }
}
```

### 3. TypeScript Interface

Add to `src/lib/native-plugins.ts`:
```typescript
export interface NetworkTrafficPlugin {
  getDeviceTraffic(options: { 
    macAddress: string
    uid?: number 
  }): Promise<{
    macAddress: string
    bytesUploaded: number
    bytesDownloaded: number
    connectionCount: number
    timestamp: number
  }>
  
  getActiveConnections(): Promise<{
    connections: Array<{
      destinationIP: string
      state: string
    }>
  }>
}

export const getNetworkTraffic = (): NetworkTrafficPlugin | null => {
  if (!isCapacitor) return null
  const Capacitor = (window as any).Capacitor
  return Capacitor?.Plugins?.NetworkTraffic || null
}
```

## Usage in App

```typescript
import { getNetworkTraffic } from '@/lib/native-plugins'

const trafficPlugin = getNetworkTraffic()

if (trafficPlugin) {
  // Get traffic for a device
  const traffic = await trafficPlugin.getDeviceTraffic({
    macAddress: 'AA:BB:CC:DD:EE:FF'
  })
  
  console.log('Uploaded:', traffic.bytesUploaded)
  console.log('Downloaded:', traffic.bytesDownloaded)
  
  // Get active connections
  const connections = await trafficPlugin.getActiveConnections()
  console.log('Destination IPs:', connections.connections.map(c => c.destinationIP))
}
```

## Alternative: Router API Integration

If you have access to your router's API, you can get even more detailed data:

### Router API Example (TP-Link)
```typescript
async function getRouterTraffic() {
  const response = await fetch('http://192.168.1.1/api/traffic', {
    headers: {
      'Authorization': 'Basic ' + btoa('admin:password')
    }
  })
  
  const data = await response.json()
  return data.devices // Array of device traffic
}
```

## Limitations

### Android NetworkStatsManager:
- Requires `PACKAGE_USAGE_STATS` permission (user must grant in Settings)
- Only shows aggregate data, not per-destination
- Requires Android 6.0+ (API 23)

### /proc/net/tcp:
- Shows active connections
- Requires root on some devices
- Only shows current connections, not historical

### Best Solution:
- Use router API if available (most accurate)
- Fall back to Android NetworkStatsManager
- Use estimation for web/demo mode

## Implementation Priority

1. **Phase 1 (Current)**: Use estimation based on device type
2. **Phase 2**: Integrate Android NetworkStatsManager
3. **Phase 3**: Add router API support
4. **Phase 4**: Add deep packet inspection (requires root)

## Testing

```bash
# Test the plugin
adb shell dumpsys netstats

# Check permissions
adb shell dumpsys package com.yourapp | grep permission

# Monitor traffic in real-time
adb shell cat /proc/net/tcp
```

## Security Considerations

- Request permissions at runtime
- Explain why you need traffic data
- Store data locally only
- Encrypt sensitive information
- Respect user privacy
