# Router Credentials Fix - Bugfix Design

## Overview

The router credentials system has six critical issues preventing device discovery through router API authentication. The primary problems are: (1) RouterSetupDialog not passing routerIP to the native scanner, (2) NetworkScannerPlugin not accepting routerIP parameter, (3) RouterAPIService only supporting HTTP Basic Auth which fails on modern routers with form-based login, (4) no fallback to RouterBypassScanner when RouterAPIService returns 0 devices, (5) username validation incorrectly requiring username when it should be optional, and (6) no localStorage fallback for Capacitor compatibility.

The fix strategy involves: passing routerIP through the entire call chain from UI to native plugin, adding RouterBypassScanner fallback when RouterAPIService fails, making username optional in validation and storage, and implementing localStorage fallback for offline/Capacitor scenarios.

## Glossary

- **Bug_Condition (C)**: The condition that triggers the bug - when router credentials are provided but device discovery fails due to missing routerIP, authentication failures, or lack of fallback mechanisms
- **Property (P)**: The desired behavior - router credentials should enable device discovery either through RouterAPIService or RouterBypassScanner fallback
- **Preservation**: Existing device scanning behavior without credentials must remain unchanged
- **RouterSetupDialog**: React component in `src/components/RouterSetupDialog.tsx` that collects router credentials from user
- **NetworkScannerPlugin**: Capacitor plugin in `android/app/src/main/java/app/thirdeye/scanner/NetworkScannerPlugin.java` that performs native network scanning
- **RouterAPIService**: Java service that authenticates with router web interface using HTTP Basic Auth to retrieve connected devices
- **RouterBypassScanner**: Java service that queries router directly without authentication (fallback method)
- **scanWithRouterCredentials**: Method that performs authenticated scanning using router credentials
- **routerIP**: The IP address of the router (gateway) to authenticate against
- **HTTP Basic Auth**: Authentication method using username:password in Authorization header (fails on modern routers)
- **Form-based login**: Modern router authentication using POST requests with session cookies (not currently supported)

## Bug Details

### Fault Condition

The bug manifests when a user provides router credentials (routerIP, username, password) but device discovery fails. The system has multiple failure points: RouterSetupDialog doesn't pass routerIP to the scanner, NetworkScannerPlugin doesn't accept routerIP parameter and always auto-detects from DHCP (which may be incorrect), RouterAPIService only supports HTTP Basic Auth (fails on modern TP-Link and other routers using form-based login), no fallback occurs when RouterAPIService returns 0 devices, username validation rejects requests without username despite it being optional, and localStorage fallback is missing for Capacitor compatibility.

**Formal Specification:**
```
FUNCTION isBugCondition(input)
  INPUT: input of type { routerIP: string, username: string, password: string, context: string }
  OUTPUT: boolean
  
  RETURN (input.context == "RouterSetupDialog.testConnection" OR 
          input.context == "RouterSetupDialog.saveCredentials" OR
          input.context == "DeviceMonitor.scanWithCredentials") AND
         (routerIPNotPassedToScanner(input) OR
          scannerIgnoresProvidedRouterIP(input) OR
          routerAPIServiceReturnsZeroDevices(input) OR
          usernameValidationRejectsEmptyUsername(input) OR
          localStorageFallbackMissing(input))
END FUNCTION
```

### Examples

- **RouterSetupDialog Test Connection**: User enters routerIP=192.168.0.1, username="", password="mypass" and clicks "Test Connection". Expected: scanner uses 192.168.0.1. Actual: scanner uses auto-detected gateway (192.168.1.1) and fails with "No devices found"

- **Modern TP-Link Router**: User provides correct credentials for TP-Link Archer router. Expected: device discovery succeeds via RouterBypassScanner fallback. Actual: RouterAPIService fails with HTTP 401 (Basic Auth not supported), returns 0 devices, no fallback occurs, user sees "No devices found"

- **Password-only Router**: User enters routerIP=192.168.1.1, username="", password="admin123" and clicks "Save & Continue". Expected: credentials saved successfully. Actual: API returns error "Router IP and username required"

- **Capacitor Offline Mode**: Device monitor tries to load credentials on app startup while offline. Expected: credentials loaded from localStorage. Actual: API fetch fails, no localStorage fallback, scanning proceeds without credentials

- **Edge case - Username defaults to "admin"**: User provides empty username for router that doesn't use usernames. Expected: empty string passed to RouterAPIService. Actual: NetworkScannerPlugin defaults to "admin", causing authentication failure

## Expected Behavior

### Preservation Requirements

**Unchanged Behaviors:**
- Device scanning without router credentials must continue to work exactly as before (RouterBypassScanner, DHCP, ARP methods)
- RouterAPIService authentication with both username and password must continue to work for routers that support HTTP Basic Auth
- Credential encryption and database storage must remain unchanged
- RouterSetupDialog UI and user interaction flow must remain unchanged
- Auto-detection of gateway IP must continue to work

**Scope:**
All inputs that do NOT involve router credentials should be completely unaffected by this fix. This includes:
- Regular device scanning via scanDevices() method
- ARP table scanning
- DHCP lease scanning
- RouterBypassScanner when used without credentials
- Network info retrieval
- Device history tracking

## Hypothesized Root Cause

Based on the bug description and code analysis, the root causes are:

1. **Missing routerIP Parameter Propagation**: RouterSetupDialog calls `scanner.scanWithRouterCredentials({ username, password })` without including routerIP in the options object. The TypeScript interface `NetworkScannerPlugin.scanWithRouterCredentials()` only accepts `{ username: string; password: string }` without routerIP parameter.

2. **Native Plugin Ignores routerIP**: NetworkScannerPlugin.scanWithRouterCredentials() in Java always uses `wifiManager.getDhcpInfo().gateway` to get the router IP, even if a different IP is provided. The method signature doesn't accept routerIP parameter.

3. **HTTP Basic Auth Limitation**: RouterAPIService only implements HTTP Basic Auth (`Authorization: Basic base64(username:password)`). Modern routers (TP-Link Archer, newer D-Link, Xiaomi) use form-based login with session cookies or token-based auth, causing RouterAPIService to return 401 Unauthorized and 0 devices.

4. **No Fallback Mechanism**: When RouterAPIService.getConnectedDevices() returns an empty list (0 devices), NetworkScannerPlugin.scanWithRouterCredentials() immediately returns success with 0 devices instead of falling back to RouterBypassScanner.scanRouterOnly() which can work without authentication.

5. **Incorrect Username Validation**: The API route `/api/router/credentials` validates `if (!routerIP || !username)` which rejects requests where username is empty string, despite many routers only requiring password.

6. **Missing localStorage Fallback**: DeviceMonitor.loadRouterCredentials() only tries API fetch without localStorage fallback, causing failures in Capacitor offline mode or when API is unavailable.

## Correctness Properties

Property 1: Fault Condition - Router Credentials Enable Device Discovery

_For any_ input where router credentials are provided (routerIP, username, password) and the user initiates device scanning, the fixed system SHALL either successfully authenticate with the router via RouterAPIService OR fall back to RouterBypassScanner when RouterAPIService returns 0 devices, resulting in device discovery succeeding for at least one method.

**Validates: Requirements 2.1, 2.2, 2.3, 2.4, 2.5, 2.6, 2.7, 2.8**

Property 2: Preservation - Non-Credential Scanning Behavior

_For any_ device scanning operation that does NOT use router credentials (regular scanDevices calls, ARP scanning, DHCP scanning), the fixed code SHALL produce exactly the same behavior as the original code, preserving all existing device discovery mechanisms.

**Validates: Requirements 3.1, 3.2, 3.3, 3.4, 3.5, 3.6**

## Fix Implementation

### Changes Required

Assuming our root cause analysis is correct:

**File**: `src/lib/native-plugins.ts`

**Interface**: `NetworkScannerPlugin` and `RouterCredentials`

**Specific Changes**:
1. **Add routerIP to RouterCredentials interface**: Change interface from `{ username: string; password: string }` to `{ routerIP?: string; username: string; password: string }`
2. **Update scanWithRouterCredentials signature**: Change from `scanWithRouterCredentials(options: { username: string; password: string })` to `scanWithRouterCredentials(options: RouterCredentials)`

---

**File**: `src/components/RouterSetupDialog.tsx`

**Function**: `testConnection` and `saveCredentials`

**Specific Changes**:
1. **Pass routerIP to scanner**: In testConnection(), change `scanner.scanWithRouterCredentials({ username: username || '', password })` to `scanner.scanWithRouterCredentials({ routerIP, username: username || '', password })`
2. **Save to localStorage after API**: In saveCredentials(), after successful API call, add `localStorage.setItem('routerCredentials', JSON.stringify({ routerIP, username: username || '', password }))`
3. **Save to localStorage on test success**: In testConnection(), after successful test, add localStorage save as fallback

---

**File**: `src/lib/device-monitor.ts`

**Function**: `loadRouterCredentials` and `scanAndCheck`

**Specific Changes**:
1. **Add localStorage fallback**: In loadRouterCredentials(), wrap API fetch in try-catch and add fallback: `if (!data.success) { const stored = localStorage.getItem('routerCredentials'); if (stored) { this.routerCredentials = JSON.parse(stored); return true; } }`
2. **Pass routerIP to scanner**: In scanAndCheck(), when calling scanWithRouterCredentials, change to include routerIP: `scanner.scanWithRouterCredentials({ routerIP: this.routerCredentials.routerIP, username: this.routerCredentials.username, password: this.routerCredentials.password })`

---

**File**: `android/app/src/main/java/app/thirdeye/scanner/NetworkScannerPlugin.java`

**Function**: `scanWithRouterCredentials`

**Specific Changes**:
1. **Accept optional routerIP parameter**: Change method to read routerIP from call: `String routerIP = call.getString("routerIP", null);`
2. **Use provided routerIP or fallback**: Replace `String gatewayIP = intToIp(wifiManager.getDhcpInfo().gateway);` with conditional logic: `String gatewayIP = (routerIP != null && !routerIP.isEmpty()) ? routerIP : intToIp(wifiManager.getDhcpInfo().gateway);`
3. **Handle empty username**: Change `String username = call.getString("username", "admin");` to `String username = call.getString("username", "");` (don't default to "admin")
4. **Add RouterBypassScanner fallback**: After RouterAPIService returns devices, add check: `if (routerDevices.isEmpty()) { Log.d(TAG, "RouterAPIService returned 0 devices - falling back to RouterBypassScanner"); List<JSObject> bypassDevices = RouterBypassScanner.scanRouterOnly(gatewayIP); for (JSObject device : bypassDevices) { ... } }`
5. **Pass empty username correctly**: In `routerAPI.setCredentials(username, password)`, ensure empty string is passed (not null or "admin")

---

**File**: `src/app/api/router/credentials/route.ts`

**Function**: `POST` handler

**Specific Changes**:
1. **Change validation logic**: Replace `if (!routerIP || !username)` with `if (!routerIP)` to allow empty username
2. **Store empty username**: Change username storage to `username: username || ''` to ensure empty string is stored instead of undefined
3. **Update error message**: Change error message from "Router IP and username required" to "Router IP required"

---

**File**: `prisma/schema.prisma`

**Model**: `RouterCredentials`

**Specific Changes**:
1. **Add default value for username**: Change `username String` to `username String @default("")` to allow empty username with default value
2. **Run migration**: After schema change, run `npx prisma migrate dev --name allow-empty-username` to update database

## Testing Strategy

### Validation Approach

The testing strategy follows a two-phase approach: first, surface counterexamples that demonstrate the bugs on unfixed code, then verify the fixes work correctly and preserve existing behavior. We'll test each of the six bug conditions independently and in combination.

### Exploratory Fault Condition Checking

**Goal**: Surface counterexamples that demonstrate the bugs BEFORE implementing the fix. Confirm or refute the root cause analysis. If we refute, we will need to re-hypothesize.

**Test Plan**: Write tests that simulate router credential scenarios for each bug condition. Run these tests on the UNFIXED code to observe failures and understand the root causes. Use mock NetworkScannerPlugin and API responses to isolate each failure point.

**Test Cases**:
1. **RouterIP Not Passed Test**: Mock scanner.scanWithRouterCredentials() to log received parameters. Call from RouterSetupDialog with routerIP=192.168.0.1. Assert that routerIP is NOT in the logged parameters (will fail on unfixed code - routerIP missing)

2. **Scanner Ignores RouterIP Test**: Mock NetworkScannerPlugin to always use DHCP gateway. Provide routerIP=192.168.0.1 when actual gateway is 192.168.1.1. Assert scanner uses 192.168.0.1 (will fail on unfixed code - uses 192.168.1.1)

3. **No Fallback Test**: Mock RouterAPIService to return empty array. Call scanWithRouterCredentials(). Assert RouterBypassScanner is called as fallback (will fail on unfixed code - no fallback occurs)

4. **Username Validation Test**: POST to /api/router/credentials with { routerIP: "192.168.1.1", username: "", password: "test" }. Assert response.success === true (will fail on unfixed code - validation rejects)

5. **localStorage Fallback Test**: Mock API fetch to fail. Call DeviceMonitor.loadRouterCredentials(). Assert credentials loaded from localStorage (will fail on unfixed code - no fallback)

6. **Empty Username Default Test**: Mock NetworkScannerPlugin to log username passed to RouterAPIService. Call with username="". Assert logged username is "" not "admin" (will fail on unfixed code - defaults to "admin")

**Expected Counterexamples**:
- RouterSetupDialog doesn't include routerIP in scanner call options
- NetworkScannerPlugin always uses DHCP gateway regardless of provided routerIP
- RouterAPIService returns 0 devices, no fallback to RouterBypassScanner occurs
- API validation rejects empty username with "Router IP and username required"
- DeviceMonitor fails to load credentials when API is unavailable
- Empty username gets defaulted to "admin" causing authentication failures

### Fix Checking

**Goal**: Verify that for all inputs where the bug conditions hold, the fixed functions produce the expected behavior.

**Pseudocode:**
```
FOR ALL input WHERE isBugCondition(input) DO
  result := scanWithRouterCredentials_fixed(input)
  ASSERT expectedBehavior(result)
END FOR

FUNCTION expectedBehavior(result)
  RETURN (result.success == true) AND
         (result.devices.length > 0 OR result.source == "RouterBypassScanner fallback") AND
         (routerIPWasUsed(result) == true) AND
         (emptyUsernameAccepted(result) == true) AND
         (localStorageFallbackWorked(result) == true)
END FUNCTION
```

### Preservation Checking

**Goal**: Verify that for all inputs where the bug conditions do NOT hold, the fixed functions produce the same result as the original functions.

**Pseudocode:**
```
FOR ALL input WHERE NOT isBugCondition(input) DO
  ASSERT scanDevices_original(input) = scanDevices_fixed(input)
END FOR
```

**Testing Approach**: Property-based testing is recommended for preservation checking because:
- It generates many test cases automatically across the input domain
- It catches edge cases that manual unit tests might miss
- It provides strong guarantees that behavior is unchanged for all non-credential scanning operations

**Test Plan**: Observe behavior on UNFIXED code first for regular device scanning (without credentials), then write property-based tests capturing that behavior. Verify that ARP scanning, DHCP scanning, and RouterBypassScanner (when used without credentials) continue to work identically.

**Test Cases**:
1. **Regular Scan Preservation**: Observe scanDevices() behavior on unfixed code (no credentials). Write test to verify same devices discovered, same sources used, same timing characteristics after fix.

2. **ARP Table Preservation**: Observe getArpTable() behavior on unfixed code. Write test to verify identical ARP entries returned after fix.

3. **RouterBypassScanner Preservation**: Observe RouterBypassScanner.scanRouterOnly() behavior when called directly (not as fallback). Write test to verify identical device discovery after fix.

4. **Credential Storage Preservation**: Observe database encryption and storage behavior on unfixed code with valid username+password. Write test to verify identical storage after fix (only validation changes, not storage logic).

### Unit Tests

- Test RouterSetupDialog passes routerIP to scanner in testConnection() and saveCredentials()
- Test NetworkScannerPlugin uses provided routerIP instead of DHCP gateway when routerIP parameter is present
- Test NetworkScannerPlugin falls back to RouterBypassScanner when RouterAPIService returns 0 devices
- Test API route accepts empty username and stores it as empty string
- Test DeviceMonitor loads credentials from localStorage when API fails
- Test empty username is passed as empty string (not "admin") to RouterAPIService
- Test edge case: routerIP is null or undefined (should fallback to DHCP gateway)
- Test edge case: both RouterAPIService and RouterBypassScanner return 0 devices (should return 0 devices with appropriate error)

### Property-Based Tests

- Generate random router credentials (various IP formats, empty/non-empty usernames, various passwords) and verify device discovery succeeds via either RouterAPIService or RouterBypassScanner fallback
- Generate random network configurations (different gateway IPs, subnets) and verify provided routerIP is always used when present
- Generate random API failure scenarios (network errors, timeouts, 401/403 responses) and verify localStorage fallback works correctly
- Generate random device scanning scenarios without credentials and verify identical behavior to unfixed code (preservation)

### Integration Tests

- Test full flow: User enters credentials in RouterSetupDialog → Test Connection → Save & Continue → DeviceMonitor loads credentials → Scanning succeeds
- Test RouterAPIService failure → RouterBypassScanner fallback → Device discovery succeeds
- Test offline mode: App starts without network → Credentials loaded from localStorage → Scanning works when network returns
- Test username variations: empty username, "admin", custom username - all should work correctly
- Test routerIP variations: auto-detected gateway, manually entered IP, different subnet - all should work correctly
- Test that existing device scanning (without credentials) continues to work after credentials are configured
