# SSL/TLS Certificate Inspector & DNS Leak Tester Button Fix

## Issue
The "Inspect SSL" button in SSL/TLS Certificate Inspector and "Test DNS" button in DNS Leak Tester were not functioning. When clicked, they showed no response or visual feedback.

## Root Cause
Both button handlers were using mock/placeholder data instead of calling the actual native EvilTwin plugin methods:

1. **DNS Leak Test**: The `testDnsLeak()` function was only using `getNetworkScanner()` to get basic DNS info, not calling the comprehensive `plugin.runDNSLeakTest()` method.

2. **SSL Inspector**: The `inspectSslCertificates()` function was returning hardcoded mock certificate data instead of calling the native plugin to perform actual SSL checks.

## Solution

### DNS Leak Test Fix
Updated `testDnsLeak()` function to:
1. Get the EvilTwin plugin instance via `getEvilTwin()`
2. Call `plugin.runDNSLeakTest()` which performs comprehensive DNS leak testing
3. Process the native plugin results and display them
4. Fallback to the previous mock behavior if plugin is unavailable (for web/demo mode)

### SSL Certificate Inspector Fix
Updated `inspectSslCertificates()` function to:
1. Get the EvilTwin plugin instance via `getEvilTwin()`
2. Call `plugin.runQuickScan()` which includes SSL certificate checks
3. Extract SSL check results from `scanResult.sslCheck.tests`
4. Display actual certificate validation results
5. Fallback to mock data if plugin is unavailable (for web/demo mode)

## Changes Made

### File: `src/components/WiFiSecurity.tsx`

1. **Added import**: Added `getEvilTwin` to the imports from `@/lib/native-plugins`

2. **Updated `testDnsLeak()` function** (lines ~1946-2030):
   - Now calls `plugin.runDNSLeakTest()` for actual DNS leak testing
   - Processes native plugin results properly
   - Maintains fallback for demo mode

3. **Updated `inspectSslCertificates()` function** (lines ~2162-2230):
   - Now calls `plugin.runQuickScan()` to get SSL check results
   - Extracts and displays actual SSL certificate data
   - Maintains fallback for demo mode

## Testing
Both buttons should now:
- Show loading state when clicked ("Testing..." / "Inspecting...")
- Call the native Android plugin methods
- Display actual results from the network security checks
- Show appropriate success/error toasts
- Work in both native (Capacitor) and web (demo) modes

## Native Plugin Methods Used
- `EvilTwinPlugin.runDNSLeakTest()`: Comprehensive DNS leak detection
- `EvilTwinPlugin.runQuickScan()`: Quick network scan including SSL checks
