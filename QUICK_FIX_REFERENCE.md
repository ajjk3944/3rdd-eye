# Quick Fix Reference - WiFi Security Tools on Android

## 🎯 What Was Fixed

Changed Packet Analyzer to use the correct plugin accessor function.

**File**: `src/components/WiFiSecurity.tsx`

```diff
- const packetSniffer = (window as any).Capacitor?.Plugins?.PacketSniffer
+ const packetSniffer = getPacketSniffer()
```

## 🚀 Deploy to Android (3 Commands)

```bash
npm run build
npx cap sync android
npx cap open android
```

Then in Android Studio: **Run > Run 'app'**

## ✅ Test Checklist

### ARP Analyzer
- [ ] Open app on Android
- [ ] Go to: Tools → WiFi Security → ARP Spoofing Detector
- [ ] Click "Scan ARP"
- [ ] See real device list (not demo data)

### Packet Analyzer
- [ ] Go to: Traffic Monitor tab
- [ ] Click "Start Capture" (grant VPN permission)
- [ ] Go to: Tools → WiFi Security → Packet Analyzer
- [ ] Click "Analyze"
- [ ] See real traffic stats (not demo data)

## 🐛 Debug (If Not Working)

### Check Console (Chrome DevTools)
1. Connect phone via USB
2. Open: `chrome://inspect`
3. Click "inspect" on your device
4. Look for:
   ```
   isCapacitor: true
   packetSniffer: [object Object]  ← Should NOT be null
   netScanner: [object Object]     ← Should NOT be null
   ```

### Check Android Logs
```bash
adb logcat | grep -E "PacketSniffer|NetworkScanner"
```

## 📱 Requirements

- Android device (not web browser)
- WiFi connection (for ARP Analyzer)
- Traffic Monitor running (for Packet Analyzer)
- VPN permission granted (for Packet Analyzer)

## 🎉 Expected Results

### ARP Analyzer
- Shows list of devices with IP and MAC addresses
- Highlights suspicious devices in red (if any)
- Toast: "✓ No ARP spoofing detected - X devices scanned"

### Packet Analyzer
- Shows Protocol Distribution chart
- Shows Top Destination IPs
- Shows Top Destination Ports
- Toast: "Packet analysis complete"

## 🔧 Still Not Working?

1. Clean rebuild:
   ```bash
   cd android
   ./gradlew clean
   cd ..
   npm run build
   npx cap sync android
   ```

2. Check MainActivity.java has:
   - `registerPlugin(NetworkScannerPlugin.class);`
   - `registerPlugin(app.thirdeye.scanner.sniffer.PacketSnifferPlugin.class);`

3. Check AndroidManifest.xml has:
   - `android.permission.INTERNET`
   - `android.permission.ACCESS_NETWORK_STATE`
   - `android.permission.ACCESS_WIFI_STATE`

## 📚 Documentation

- **WIFI_SECURITY_FIX_SUMMARY.md** - Overview and summary
- **ANDROID_WIFI_SECURITY_FIX.md** - Detailed technical docs
- **TEST_WIFI_SECURITY_ANDROID.md** - Step-by-step testing guide

---

**Status**: ✅ Fix applied, ready to build and test!
