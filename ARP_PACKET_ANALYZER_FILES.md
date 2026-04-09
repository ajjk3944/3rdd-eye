# ARP Spoofing & Packet Analyzer - Related Files

This document lists all files related to the ARP Spoofing Detector and Packet Analyzer tools under Tools -> WiFi Security.

---

## 🎯 UI/Frontend Files (TypeScript/React)

### Main Component
- **`src/components/WiFiSecurity.tsx`**
  - Main WiFi Security panel component
  - Contains both ARP Spoofing and Packet Analyzer views
  - Lines 2056-2220: `scanArpTable()` function (ARP Spoofing)
  - Lines 2222-2365: `startPacketAnalysis()` function (Packet Analyzer)
  - Lines 4306-4500: ARP Spoofing Detector View UI
  - Lines 5019-5170: Packet Analyzer View UI
  - State variables:
    - `arpDevices`, `arpSpoofing`, `scanningArp` (ARP)
    - `packetStats`, `analyzingPackets` (Packet Analyzer)

### Plugin Interface Definitions
- **`src/lib/native-plugins.ts`**
  - TypeScript interfaces for native plugins
  - NetworkScanner plugin interface (for ARP)
  - PacketSniffer plugin interface (for Packet Analyzer)
  - Type definitions for plugin responses

### Tool Registry
- **`src/lib/tool-registry.ts`**
  - Tool registration and metadata
  - Line 68: ARP Spoofing tool registration
  - Line 71: Packet Analyzer tool registration

### Translations
- **`src/lib/i18n/en.ts`**
  - Lines 546-577: ARP Spoofing translations
    - `arpSpoofing`, `arpSpoofingDetector`
    - `whatIsArpSpoofing`, `arpSpoofingDescription`
    - `scanArp`, `arpTable`, `suspicious`
    - `potentialArpSpoofing`, `tapScanArp`

---

## 📱 Android/Java Backend Files

### ARP Spoofing Related

#### NetworkScanner Plugin
- **`android/app/src/main/java/app/thirdeye/scanner/NetworkScannerPlugin.java`**
  - Main plugin that provides `getArpTable()` method
  - Capacitor plugin for network scanning
  - Exposes ARP table data to JavaScript

#### MAC Address Scanner
- **`android/app/src/main/java/app/thirdeye/scanner/network/MacAddressScanner.java`**
  - Scans and retrieves MAC addresses from ARP table
  - Used by NetworkScanner plugin
  - Native ARP table access

#### ARP Scan Service
- **`android/app/src/main/java/app/thirdeye/scanner/ARPScanService.java`**
  - Background service for ARP scanning
  - Continuous ARP table monitoring

#### Device Database
- **`android/app/src/main/java/app/thirdeye/scanner/DeviceDatabase.java`**
  - Stores device information from ARP scans
  - Tracks device history and changes

#### MAC Vendor Lookup
- **`android/app/src/main/java/app/thirdeye/scanner/MACVendorLookup.java`**
  - Identifies device manufacturers from MAC addresses
  - Used to detect suspicious locally-administered MACs

### Packet Analyzer Related

#### PacketSniffer Plugin
- **`android/app/src/main/java/app/thirdeye/scanner/sniffer/PacketSnifferPlugin.java`**
  - Main Capacitor plugin for packet analysis
  - Exposes packet capture methods to JavaScript
  - Methods:
    - `startCapture()` - Start VPN-based packet capture
    - `stopCapture()` - Stop packet capture
    - `isCapturing()` - Check capture status
    - `getPacketStats()` - Get packet statistics
    - `getTopDestinations()` - Get top destination IPs
    - `getProtocolDistribution()` - Get protocol breakdown

#### PacketSniffer Service
- **`android/app/src/main/java/app/thirdeye/scanner/sniffer/PacketSnifferService.java`**
  - VPN-based packet capture service
  - Runs as foreground service
  - Intercepts and analyzes network packets
  - Maintains packet statistics in real-time

#### Packet Parser
- **`android/app/src/main/java/app/thirdeye/scanner/sniffer/PacketParser.java`**
  - Parses raw packet data
  - Extracts protocol information (TCP, UDP, ICMP)
  - Identifies source/destination IPs and ports

#### Connection Tracker
- **`android/app/src/main/java/app/thirdeye/scanner/sniffer/ConnectionTracker.java`**
  - Tracks active network connections
  - Maintains connection state
  - Identifies connection patterns

#### App Identifier
- **`android/app/src/main/java/app/thirdeye/scanner/sniffer/AppIdentifier.java`**
  - Identifies which app is making network requests
  - Maps connections to applications

#### GeoIP Resolver
- **`android/app/src/main/java/app/thirdeye/scanner/sniffer/GeoIPResolver.java`**
  - Resolves IP addresses to geographic locations
  - Provides country/region information

#### Suspicious Detector
- **`android/app/src/main/java/app/thirdeye/scanner/sniffer/SuspiciousDetector.java`**
  - Detects suspicious network activity
  - Identifies potential security threats in traffic

#### Traffic Log Database
- **`android/app/src/main/java/app/thirdeye/scanner/sniffer/TrafficLogDatabase.java`**
  - Stores packet capture logs
  - Maintains historical traffic data
  - Provides statistics and analytics

### Network Traffic Plugin
- **`android/app/src/main/java/app/thirdeye/scanner/NetworkTrafficPlugin.java`**
  - Real-time network traffic monitoring
  - Provides bandwidth usage statistics
  - Used by Packet Analyzer for live stats

---

## 🔧 Supporting Files

### MainActivity
- **`android/app/src/main/java/app/thirdeye/scanner/MainActivity.java`**
  - Registers all Capacitor plugins
  - Line 41: Registers PacketSnifferPlugin
  - Line 40: Registers NetworkTrafficPlugin

### Device Info
- **`android/app/src/main/java/app/thirdeye/scanner/network/DeviceInfo.java`**
  - Data model for network devices
  - Used by ARP scanner

### Network Device Scanner
- **`android/app/src/main/java/app/thirdeye/scanner/network/NetworkDeviceScanner.java`**
  - Scans for devices on network
  - Works with ARP scanner

---

## 📋 Documentation Files

- **`ARP_PACKET_ANALYZER_FIX.md`**
  - Documentation of previous fixes
  - Implementation details
  - Testing instructions

---

## 🔍 Key Methods & Interfaces

### ARP Spoofing
```typescript
// Frontend (WiFiSecurity.tsx)
scanArpTable(): Promise<void>
  - Calls NetworkScanner.getArpTable()
  - Analyzes for suspicious entries
  - Updates arpDevices and arpSpoofing state

// Backend (NetworkScannerPlugin.java)
getArpTable(): Promise<{ success: boolean, devices: Device[] }>
  - Returns ARP table entries
  - Includes IP, MAC, vendor info
```

### Packet Analyzer
```typescript
// Frontend (WiFiSecurity.tsx)
startPacketAnalysis(): Promise<void>
  - Checks if PacketSniffer.isCapturing()
  - Calls PacketSniffer.getPacketStats()
  - Updates packetStats state

// Backend (PacketSnifferPlugin.java)
startCapture(): Promise<{ success: boolean, sessionId: string }>
stopCapture(): Promise<{ success: boolean }>
isCapturing(): Promise<{ capturing: boolean }>
getPacketStats(): Promise<{ protocols, topIPs, topPorts, packetsPerSecond }>
```

---

## 🐛 Known Issues

### ARP Spoofing
- ✅ Fixed: Function was correctly placed but may have plugin availability issues
- Check: NetworkScanner plugin registration in MainActivity
- Check: Android permissions for network access

### Packet Analyzer
- ✅ Fixed: Function moved from view block to component body
- Check: VPN permission granted for packet capture
- Check: PacketSnifferService running status
- Check: TrafficLogDatabase initialization

---

## 🔐 Required Permissions

### ARP Spoofing
- `android.permission.INTERNET`
- `android.permission.ACCESS_NETWORK_STATE`
- `android.permission.ACCESS_WIFI_STATE`

### Packet Analyzer
- `android.permission.INTERNET`
- `android.permission.FOREGROUND_SERVICE`
- VPN permission (requested at runtime)
- `android.permission.BIND_VPN_SERVICE`

---

## 📝 Testing Checklist

### ARP Spoofing
- [ ] NetworkScanner plugin is registered
- [ ] getArpTable() returns data
- [ ] UI displays ARP table entries
- [ ] Suspicious entries are flagged
- [ ] Demo mode works (browser)

### Packet Analyzer
- [ ] PacketSniffer plugin is registered
- [ ] VPN permission is granted
- [ ] PacketSnifferService starts successfully
- [ ] isCapturing() returns true when active
- [ ] getPacketStats() returns valid data
- [ ] UI displays protocol distribution
- [ ] UI displays top destinations
- [ ] Demo mode works (browser)

---

## 🚀 Next Steps for Debugging

1. **Check Plugin Registration**
   - Verify both plugins are registered in MainActivity.java
   - Check for any initialization errors in logcat

2. **Test Native Methods**
   - Use Android Studio debugger
   - Add logging to plugin methods
   - Verify data is being returned

3. **Check Permissions**
   - Verify all required permissions are in AndroidManifest.xml
   - Check runtime permission requests

4. **Test Service Status**
   - For Packet Analyzer, verify PacketSnifferService is running
   - Check VPN connection status

5. **Review Error Logs**
   - Check browser console for frontend errors
   - Check Android logcat for native errors
   - Look for plugin communication failures
