# Testing WiFi Security Tools on Android

## Quick Test Steps

### 1. Install the Updated App

```bash
# Build the app
npm run build

# Sync with Android
npx cap sync android

# Open in Android Studio
npx cap open android

# Build and install on your device
# In Android Studio: Run > Run 'app'
# Or via command line:
cd android
./gradlew installDebug
```

### 2. Test ARP Analyzer

1. Open the app on your Android phone
2. Make sure you're connected to WiFi
3. Navigate to: **Tools → WiFi Security**
4. Scroll down to **ARP Spoofing Detector**
5. Click the **"Scan ARP"** button
6. You should see:
   - Loading spinner
   - "Scanning ARP table for anomalies..." toast
   - After 2-3 seconds: List of devices with IP and MAC addresses
   - Success message: "✓ No ARP spoofing detected - X devices scanned"

**If it doesn't work:**
- Open Chrome DevTools (chrome://inspect on your computer)
- Connect your phone via USB
- Check the console for errors
- Look for these logs:
  - `scanArpTable called`
  - `isCapacitor: true`
  - `netScanner: [object Object]` (should NOT be null)

### 3. Test Packet Analyzer

**IMPORTANT**: Packet Analyzer requires Traffic Monitor to be running first!

1. Navigate to: **Traffic Monitor** tab (main navigation)
2. Click **"Start Capture"** button
3. Grant VPN permission when prompted
4. Wait for "Capturing..." status
5. Now go back to: **Tools → WiFi Security**
6. Scroll down to **Packet Analyzer**
7. Click the **"Analyze"** button
8. You should see:
   - Loading spinner
   - "Starting packet analysis..." toast
   - After 2-3 seconds:
     - Protocol Distribution chart (TCP, UDP, ICMP, Other)
     - Top Destination IPs
     - Top Destination Ports
   - Success message: "Packet analysis complete"

**If it doesn't work:**
- Make sure Traffic Monitor is running (step 1-4 above)
- Check Chrome DevTools console for errors
- Look for these logs:
  - `startPacketAnalysis called`
  - `isCapacitor: true`
  - `packetSniffer: [object Object]` (should NOT be null)
  - `Capture status: { capturing: true }`

## Common Issues

### Issue: "Native plugin not available"

**Cause**: Plugin not detected on Android

**Fix**:
1. Verify you're testing on a real Android device (not web browser)
2. Rebuild and reinstall the app
3. Check MainActivity.java has both plugins registered

### Issue: "Packet Sniffer not running"

**Cause**: Traffic Monitor not started

**Fix**:
1. Go to Traffic Monitor tab
2. Click "Start Capture"
3. Grant VPN permission
4. Wait for capture to start
5. Then try Packet Analyzer again

### Issue: "No devices found in ARP table"

**Cause**: Not connected to WiFi or no other devices on network

**Fix**:
1. Make sure you're connected to WiFi (not mobile data)
2. Make sure there are other devices on the network
3. Try from a different WiFi network

### Issue: Shows demo data instead of real data

**Cause**: Plugin not properly initialized or detected

**Fix**:
1. Check console logs - should show `isCapacitor: true`
2. Check plugin is not null
3. Rebuild app: `npm run build && npx cap sync android`
4. Reinstall app on device

## Debug with Chrome DevTools

1. Connect your Android phone to computer via USB
2. Enable USB debugging on phone
3. Open Chrome on computer
4. Go to: `chrome://inspect`
5. Find your device and click "inspect"
6. Open Console tab
7. Run the tests and watch for logs

## Expected Console Logs

### ARP Analyzer (Success)
```
scanArpTable called
isCapacitor: true
netScanner: [object Object]
Attempting native ARP scan...
ARP Result: { success: true, devices: [...] }
```

### Packet Analyzer (Success)
```
startPacketAnalysis called
isCapacitor: true
packetSniffer: [object Object]
Attempting native packet analysis...
Capture status: { capturing: true }
Stats: { success: true, stats: {...} }
Connections: { success: true, connections: [...] }
```

## What Changed

### Before (Broken)
```typescript
// Packet Analyzer was using direct access
const packetSniffer = (window as any).Capacitor?.Plugins?.PacketSniffer
```

### After (Fixed)
```typescript
// Now uses proper helper function
const packetSniffer = getPacketSniffer()
```

This ensures the plugin is properly detected and initialized on Android.

## Still Not Working?

If the tools still don't work after following all steps:

1. **Check Plugin Registration**
   ```bash
   # Search MainActivity.java for plugin registrations
   grep -n "registerPlugin" android/app/src/main/java/app/thirdeye/scanner/MainActivity.java
   ```
   Should show:
   - `NetworkScannerPlugin.class`
   - `app.thirdeye.scanner.sniffer.PacketSnifferPlugin.class`

2. **Check Android Logs**
   ```bash
   # View all logs
   adb logcat

   # Filter for errors
   adb logcat | grep -E "ERROR|Exception"

   # Filter for plugin logs
   adb logcat | grep -E "NetworkScanner|PacketSniffer"
   ```

3. **Verify Permissions**
   Check `AndroidManifest.xml` has:
   - `android.permission.INTERNET`
   - `android.permission.ACCESS_NETWORK_STATE`
   - `android.permission.ACCESS_WIFI_STATE`
   - `android.permission.FOREGROUND_SERVICE`

4. **Clean Rebuild**
   ```bash
   # Clean everything
   cd android
   ./gradlew clean

   # Rebuild from scratch
   cd ..
   npm run build
   npx cap sync android
   npx cap open android
   # Then rebuild in Android Studio
   ```

## Success Criteria

✅ ARP Analyzer shows real device list (not demo data)
✅ Packet Analyzer shows real traffic stats (not demo data)
✅ Console logs show `isCapacitor: true`
✅ Console logs show plugins are objects (not null)
✅ No "Native plugin not available" errors
✅ Tools work consistently on multiple tests

## Need More Help?

If you're still having issues, provide:
1. Screenshot of the error
2. Console logs from Chrome DevTools
3. Android logcat output
4. Which Android version you're testing on
