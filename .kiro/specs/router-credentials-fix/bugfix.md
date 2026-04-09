# Bugfix Requirements Document

## Introduction

The router credentials system has multiple critical issues preventing device discovery:
1. RouterSetupDialog doesn't pass `routerIP` to the native scanner
2. NetworkScannerPlugin.scanWithRouterCredentials() doesn't accept or use `routerIP` parameter
3. RouterAPIService only supports HTTP Basic Auth (fails with modern routers using form-based login)
4. No fallback to RouterBypassScanner when RouterAPIService returns 0 devices
5. Username field incorrectly required in validation despite being optional for some routers

This causes "No devices found" errors even with correct credentials.

## Bug Analysis

### Current Behavior (Defect)

1.1 WHEN RouterSetupDialog calls scanner.scanWithRouterCredentials() THEN it does NOT include routerIP in the options, causing the scanner to use auto-detected gateway which may be incorrect

1.2 WHEN NetworkScannerPlugin.scanWithRouterCredentials() is called THEN it does NOT accept a routerIP parameter and always uses wifiManager.getDhcpInfo().gateway

1.3 WHEN RouterAPIService.getConnectedDevices() returns 0 devices (due to Basic Auth failure on modern routers) THEN the scan completes with 0 devices instead of falling back to RouterBypassScanner

1.4 WHEN a router only requires password (no username) THEN the API validation rejects the request with "Router IP and username required"

1.5 WHEN username is empty in NetworkScannerPlugin THEN it defaults to "admin" which may be incorrect for routers that don't use usernames

### Expected Behavior (Correct)

2.1 WHEN RouterSetupDialog calls scanner.scanWithRouterCredentials() THEN it SHALL include routerIP in the options: { routerIP, username, password }

2.2 WHEN NetworkScannerPlugin.scanWithRouterCredentials() is called with routerIP THEN it SHALL use the provided routerIP instead of auto-detecting from DHCP

2.3 WHEN RouterAPIService.getConnectedDevices() returns 0 devices THEN the scanner SHALL fall back to RouterBypassScanner.scanRouterOnly(gatewayIP) to handle routers with form-based login

2.4 WHEN a POST request is made to /api/router/credentials without username THEN the system SHALL accept the request and store username as empty string

2.5 WHEN username is empty in NetworkScannerPlugin THEN it SHALL pass empty string to RouterAPIService instead of defaulting to "admin"

2.6 WHEN username is empty in RouterAPIService THEN it SHALL only use password in Basic Auth (username:password where username is empty)

2.7 WHEN device-monitor.ts loads router credentials THEN it SHALL try localStorage fallback if API fetch fails (for Capacitor compatibility)

2.8 WHEN device-monitor.ts calls scanWithRouterCredentials() THEN it SHALL include routerIP in the options

### Unchanged Behavior (Regression Prevention)

3.1 WHEN router credentials are provided with both username and password THEN the system SHALL CONTINUE TO authenticate using both credentials

3.2 WHEN RouterAPIService successfully returns devices THEN the system SHALL CONTINUE TO use those devices without fallback

3.3 WHEN RouterBypassScanner is used as fallback THEN it SHALL CONTINUE TO work as currently implemented

3.4 WHEN credentials are saved via API THEN they SHALL CONTINUE TO be encrypted and stored in the database

3.5 WHEN "Test Connection" button is clicked THEN it SHALL CONTINUE TO test the connection and display results

3.6 WHEN "Save & Continue" is clicked THEN it SHALL CONTINUE TO save credentials and close the dialog

## Files Requiring Changes

1. src/components/RouterSetupDialog.tsx
   - Pass routerIP to scanWithRouterCredentials()
   - Save to localStorage as fallback after API call

2. src/lib/native-plugins.ts
   - Update scanWithRouterCredentials interface to accept optional routerIP

3. src/lib/device-monitor.ts
   - Load credentials from localStorage if API fails
   - Pass routerIP when calling scanWithRouterCredentials()

4. android/app/src/main/java/app/thirdeye/scanner/NetworkScannerPlugin.java
   - Accept optional routerIP parameter in scanWithRouterCredentials()
   - Use provided routerIP or fall back to auto-detect
   - Add fallback to RouterBypassScanner when RouterAPIService returns 0 devices
   - Handle empty username (don't default to "admin")

5. src/app/api/router/credentials/route.ts
   - Change validation from (!routerIP || !username) to (!routerIP)
   - Store username || '' in database

6. prisma/schema.prisma
   - Change username String to username String @default("")

## Success Criteria

- Router credentials with only password (no username) can be saved
- RouterSetupDialog passes routerIP to native scanner
- NetworkScannerPlugin uses provided routerIP parameter
- When RouterAPIService returns 0 devices, RouterBypassScanner is used as fallback
- "No devices found" error only occurs when both methods genuinely find no devices
- Credentials are saved to both API and localStorage for Capacitor compatibility
- Device monitor loads credentials from localStorage if API fails
