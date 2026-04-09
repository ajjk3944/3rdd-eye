# Build Instructions for IMEI Changes

## Quick Build

To build the Android app with the IMEI improvements:

```bash
# 1. Sync Capacitor (copies web assets to Android)
npm run sync:android

# 2. Build the Android app
npm run build:android:prod

# Or use the simple build
npm run build:android:simple
```

## What Changed

### Files Modified
1. `android/app/src/main/AndroidManifest.xml` - Added IMEI permission
2. `android/app/src/main/java/app/thirdeye/scanner/plugins/DeviceInfoPlugin.java` - Enhanced IMEI retrieval
3. `src/components/DevInfoTab.tsx` - Improved UI for IMEI and Apps sections

### Testing the Changes

1. Build and install the app on your Android device
2. Grant all required permissions when prompted
3. Navigate to: Dev Info → IMEI
4. Observe the behavior:
   - If IMEI is available: It will be displayed directly
   - If IMEI is restricted: You'll see the improved fallback UI with dialer option

## Important Notes

- The IMEI retrieval will work on Android 9 and below
- On Android 10+, the app will show a user-friendly fallback
- The "Open Dialer with *#06#" button provides the best UX for restricted devices
- When the dialer opens, the IMEI displays automatically (no need to press Call)

## Clean Build (if needed)

If you encounter any issues:

```bash
# Clean all build artifacts
npm run clean:all

# Then rebuild
npm run sync:android
npm run build:android:prod
```
