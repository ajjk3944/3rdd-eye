# IMEI Implementation - Technical Documentation

## Overview
This document explains the IMEI retrieval implementation in ThirdEye and the technical limitations imposed by Android.

## Changes Made

### 1. Android Manifest Updates
- Added `READ_PRIVILEGED_PHONE_STATE` permission (for system apps)
- This permission is marked with `tools:ignore="ProtectedPermissions"` as it's a protected permission

### 2. Native Plugin Improvements (DeviceInfoPlugin.java)
Enhanced IMEI retrieval with multiple fallback methods:
- Primary: `telephonyManager.getImei(slotIndex)` - Standard method
- Fallback 1: `telephonyManager.getImei()` - Without slot index
- Fallback 2: `telephonyManager.getDeviceId(slotIndex)` - Legacy method
- Fallback 3: Reflection-based access - `getImei()` via reflection
- Fallback 4: `telephonyManager.getMeid(slotIndex)` - For CDMA devices

### 3. UI/UX Improvements (DevInfoTab.tsx)
- Better error messaging explaining Android restrictions
- Improved "Open Dialer" button with clearer instructions
- Added alternative methods section for users
- Fixed app list layout to show Info/Uninstall buttons properly on all screen sizes

## Technical Limitations

### Android 10+ (API 29+) Restrictions
Starting with Android 10, Google implemented strict privacy restrictions:

1. **IMEI Access Restriction**
   - Regular apps cannot access IMEI/MEID directly
   - Only system apps (pre-installed on /system partition) can access IMEI
   - Even with `READ_PHONE_STATE` permission, the API returns null

2. **Why This Restriction Exists**
   - Privacy protection: IMEI is a permanent device identifier
   - Prevents tracking across app uninstalls
   - Reduces fingerprinting capabilities
   - Aligns with GDPR and privacy regulations

3. **What Works**
   - System apps with `READ_PRIVILEGED_PHONE_STATE` permission
   - Device manufacturers' pre-installed apps
   - Apps signed with platform certificate

4. **What Doesn't Work**
   - Third-party apps from Play Store or APK
   - Apps with only `READ_PHONE_STATE` permission
   - Reflection-based workarounds (blocked by Android)

## Current Implementation Behavior

### When IMEI is Available (Android 9 and below, or system apps)
- IMEI is fetched directly from the native plugin
- Displayed in the IMEI section with proper formatting
- Shows per-SIM slot information for dual-SIM devices

### When IMEI is Not Available (Android 10+ for regular apps)
- Shows informative message explaining the restriction
- Provides "Open Dialer with *#06#" button
- Lists alternative methods to view IMEI
- Dialer opens with *#06# pre-filled (IMEI displays automatically)

## Alternative Solutions

### For Users
1. **Dial *#06#** - Opens dialer, IMEI shows automatically
2. **Settings → About Phone → Status** - View IMEI in system settings
3. **Check device box** - IMEI printed on original packaging
4. **Check SIM tray** - Some devices have IMEI on SIM tray

### For Developers (Not Applicable to Regular Apps)
1. **System App** - Sign app with platform certificate and install to /system
2. **Device Admin** - Some device admin APIs may provide access (limited)
3. **Root Access** - Read from system files (requires root)

## Testing

### To Test IMEI Retrieval
1. Build and install the app
2. Grant all required permissions (Location, Phone State)
3. Navigate to Dev Info → IMEI section
4. Check if IMEI is displayed or fallback UI is shown

### Expected Results
- **Android 9 and below**: IMEI should be displayed
- **Android 10+**: Fallback UI with dialer option
- **Dual-SIM devices**: Multiple IMEI entries (if available)

## Code References

### Files Modified
1. `android/app/src/main/AndroidManifest.xml` - Added privileged permission
2. `android/app/src/main/java/app/thirdeye/scanner/plugins/DeviceInfoPlugin.java` - Enhanced IMEI retrieval
3. `src/components/DevInfoTab.tsx` - Improved UI/UX for IMEI section and apps list

### Key Methods
- `getSimInfo()` - Main method that fetches SIM and IMEI data
- `telephonyManager.getImei()` - Android API for IMEI retrieval
- `IMEISection()` - React component for displaying IMEI

## Conclusion

The current implementation uses the official TelephonyManager API (the correct approach) and does everything technically possible for a regular Android app:

1. Uses TelephonyManager.getImei() - the official Android API
2. Attempts all available methods to retrieve IMEI
3. Provides clear user guidance when IMEI is unavailable
4. Offers convenient dialer access for manual *#06# entry
5. Explains the technical limitations transparently

**Important:** The Android 10+ restriction is a platform-level security feature that cannot be bypassed by regular apps without root access or system-level signing. The implementation provides the best possible user experience within these constraints.

## User Instructions

When IMEI is restricted (Android 10+):
1. Click "Open Dialer" button
2. Manually type: *#06#
3. IMEI will be displayed automatically
4. No need to press "Call" button
