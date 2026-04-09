# Android WiFi Security Tools Fix

## Problem
The ARP Analyzer and Packet Analyzer tools in the WiFi Security section work on web/desktop but not on Android.

## Root Cause Analysis

### 1. Packet Analyzer Issue
The code was accessing the plugin directly via:
```typescript
const packetSniffer = (window as any).Capacitor?.Plugins?.PacketSniffer
```

Instead of using the proper helper function:
```typescript
const packetSniffer = getPacketSniffer()
```

This caused the plugin to not be properly detected on Android.

### 2. ARP Analyzer Issue
The ARP Analyzer was using the correct helper function `getNetworkScanner()`, but there may be:
- Plugin registration issues
- Permission issues on Android
- The plugin not being properly initialized

## Solution Applied

### Fix 1: Update Packet Analyzer to use proper plugin accessor
**File**: `src/components/WiFiSecurity.tsx`

Changed from:
```typescript
const packetSniffer = (window as any).Capacitor?.Plugins?.PacketSniffer
```

To:
```typescript
const packetSniffer = getPacketSniffer()
```

And added the import:
```typescript
import { isCapacitor, getWiFiScanner, getNetworkScanner, getEvilTwin, getPacketSniffer } from '@/lib/native-plugins'
```

## Verification Steps

### On Android Device:

1. **Check Plugin Registration**
   - Open Android Studio
   - Check `MainActivity.java` - verify both plugins are registered:
     ```java
     registerPlugin(NetworkScannerPlugin.class);
     registerPlugin(app.thirdeye.scanner.sniffer.PacketSnifferPlugin.class);
     ```

2. **Check Permissions**
   - Verify `AndroidManifest.xml` has all required permissions:
     - `INTERNET`
     - `ACCESS_NETWORK_STATE`
     - `ACCESS_WIFI_STATE`
     - `FOREGROUND_SERVICE`
     - `FOREGROUND_SERVICE_SPECIAL_USE`

3. **Test ARP Analyzer**
   - Open app on Android
   - Navigate to Tools → WiFi Security → ARP Spoofing Detector
   - Click "Scan ARP" button
   - Check logcat for debug logs:
     ```
     adb logcat | grep -E "scanArpTable|NetworkScanner|ARP"
     ```
   - Should see:
     - "scanArpTable called"
     - "isCapacitor: true"
     - "netScanner: [object Object]"
     - "Attempting native ARP scan..."
     - "ARP Result: ..."

4. **Test Packet Analyzer**
   - First, start Traffic Monitor (required for packet analysis)
   - Navigate to Tools → WiFi Security → Packet Analyzer
   - Click "Analyze" button
   - Check logcat for debug logs:
     ```
     adb logcat | grep -E "startPacketAnalysis|PacketSniffer|Packet"
     ```
   - Should see:
     - "startPacketAnalysis called"
     - "isCapacitor: true"
     - "packetSniffer: [object Object]"
     - "Attempting native packet analysis..."
     - "Capture status: ..."

## Common Issues & Solutions

### Issue 1: Plugin returns null
**Symptom**: Console shows `netScanner: null` or `packetSniffer: null`

**Solutions**:
1. Verify plugin is registered in `MainActivity.java`
2. Rebuild the Android app: `npm run build && npx cap sync android`
3. Clean and rebuild in Android Studio

### Issue 2: "Plugin not available" error
**Symptom**: Toast shows "Native plugin not available"

**Solutions**:
1. Check if running on actual Android device (not web browser)
2. Verify `isCapacitor` is true
3. Check Capacitor bridge is initialized

### Issue 3: Packet Analyzer says "Traffic Monitor not running"
**Symptom**: Error message "Packet Sniffer not running. Please start Traffic Monitor first."

**Solutions**:
1. Navigate to Traffic Monitor tab
2. Click "Start Capture" button
3. Grant VPN permission when prompted
4. Wait for capture to start
5. Then try Packet Analyzer again

### Issue 4: ARP scan returns empty results
**Symptom**: "No devices found in ARP table"

**Solutions**:
1. Ensure device is connected to WiFi
2. Check network permissions are granted
3. Try scanning from a different network
4. Check `/proc/net/arp` file exists and is readable

## Testing Checklist

- [ ] Plugins are registered in MainActivity.java
- [ ] All permissions are in AndroidManifest.xml
- [ ] App builds without errors
- [ ] App installs on Android device
- [ ] isCapacitor returns true on Android
- [ ] getNetworkScanner() returns plugin object (not null)
- [ ] getPacketSniffer() returns plugin object (not null)
- [ ] ARP Analyzer button is clickable
- [ ] ARP Analyzer shows loading state
- [ ] ARP Analyzer displays results or demo data
- [ ] Packet Analyzer button is clickable
- [ ] Packet Analyzer shows loading state
- [ ] Packet Analyzer displays results or demo data
- [ ] Console logs show correct plugin detection
- [ ] No JavaScript errors in console

## Build Commands

```bash
# 1. Build the Next.js app
npm run build

# 2. Sync with Capacitor
npx cap sync android

# 3. Open in Android Studio
npx cap open android

# 4. Build and run on device from Android Studio
# Or use command line:
cd android
./gradlew assembleDebug
adb install app/build/outputs/apk/debug/app-debug.apk
```

## Debug Commands

```bash
# View all logs
adb logcat

# Filter for WiFi Security logs
adb logcat | grep -E "WiFiSecurity|ARP|Packet"

# Filter for plugin logs
adb logcat | grep -E "NetworkScanner|PacketSniffer"

# Filter for Capacitor logs
adb logcat | grep Capacitor

# Clear logs and start fresh
adb logcat -c && adb logcat
```

## Expected Behavior

### ARP Analyzer (Working)
1. Click "Scan ARP" button
2. See loading spinner and "Scanning..." message
3. After 2-3 seconds, see list of devices with IP and MAC addresses
4. Suspicious devices highlighted in red (if any)
5. Success toast: "✓ No ARP spoofing detected - X devices scanned"

### Packet Analyzer (Working)
1. Ensure Traffic Monitor is running
2. Click "Analyze" button
3. See loading spinner and "Analyzing..." message
4. After 2-3 seconds, see:
   - Protocol Distribution chart (TCP, UDP, ICMP, Other)
   - Top Destination IPs list
   - Top Destination Ports list
   - Packets per second metric
5. Success toast: "Packet analysis complete"

## Demo Mode Fallback

Both tools have demo mode that activates when:
- Not running on Android (`!isCapacitor`)
- Plugin is not available (`plugin === null`)
- Plugin call fails (caught in try-catch)

Demo mode shows realistic fake data for testing the UI.

## Next Steps

1. Build and deploy the updated code to Android
2. Test both tools on a real Android device
3. Check logcat for any errors
4. Verify plugins are properly detected
5. If issues persist, check plugin registration and permissions
