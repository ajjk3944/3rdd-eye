// Native Plugin Interfaces for Capacitor

// Check if running in Capacitor (with proper SSR safety)
export const isCapacitor = (() => {
  if (typeof window === 'undefined') return false;
  try {
    return (window as any).Capacitor !== undefined;
  } catch {
    return false;
  }
})();

// ============ App Plugin (Capacitor Core) ============
export interface AppPlugin {
  addListener(eventName: 'backButton', callback: (data: { canGoBack: boolean }) => void): Promise<{ remove: () => void }>;
  exitApp(): Promise<void>;
}

export const getApp = (): AppPlugin | null => {
  if (!isCapacitor) return null;
  const Capacitor = (window as any).Capacitor;
  return Capacitor?.Plugins?.App || null;
};

// ============ Network Traffic Plugin (Real Data) ============
export interface NetworkTrafficPlugin {
  getDeviceTraffic(options: { 
    macAddress: string
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
      count: number
    }>
    totalConnections: number
  }>
  
  getPortActivity(): Promise<{
    ports: Array<{
      port: number
      count: number
    }>
  }>
  
  getAllDevicesTraffic(): Promise<{
    devices: Array<{
      ipAddress: string
      macAddress: string
      bytesUploaded: number
      bytesDownloaded: number
    }>
    timestamp: number
  }>
}

export const getNetworkTraffic = (): NetworkTrafficPlugin | null => {
  if (!isCapacitor) return null;
  const Capacitor = (window as any).Capacitor;
  return Capacitor?.Plugins?.NetworkTraffic || null;
};

// ============ WiFi Scanner Plugin ============
export interface WiFiNetwork {
  ssid: string;
  bssid: string;
  rssi: number;
  signal: number;
  frequency: number;
  channel: number;
  security: string;
  is5GHz: boolean;
  timestamp: number;
}

export interface WiFiScanResult {
  success: boolean;
  networks: WiFiNetwork[];
  count?: number;
  cached?: boolean;
  error?: string;
}

export interface CurrentNetworkInfo {
  ssid?: string;
  bssid?: string;
  rssi?: number;
  linkSpeed?: number;
  frequency?: number;
  ipAddress?: string;
  connected: boolean;
}

export interface WiFiScannerPlugin {
  isWifiEnabled(): Promise<{ enabled: boolean }>;
  getCurrentNetwork(): Promise<CurrentNetworkInfo>;
  scan(): Promise<WiFiScanResult>;
  connect(options: { ssid: string; password?: string; security?: string }): Promise<{ success: boolean; error?: string }>;
  disconnect(): Promise<{ success: boolean; error?: string }>;
  forget(options: { ssid: string }): Promise<{ success: boolean; error?: string }>;
}

export const getWiFiScanner = (): WiFiScannerPlugin | null => {
  if (!isCapacitor) return null;
  const Capacitor = (window as any).Capacitor;
  return Capacitor?.Plugins?.WiFiScanner || null;
};

// ============ Saved WiFi Plugin (NEW - reads from Android local DB) ============
export interface SavedWifiPluginInterface {
  getSavedNetworks(): Promise<{
    success: boolean;
    networks: Array<{
      id: string;
      ssid: string;
      password: string;
      bssid: string;
      security: string;
      addedAt: string;
      lastConnectedAt: string;
    }>;
    count: number;
    error?: string;
  }>;
  saveNetwork(options: {
    ssid: string;
    password?: string;
    security?: string;
    bssid?: string;
  }): Promise<{ success: boolean; ssid?: string; error?: string }>;
  deleteNetwork(options: {
    ssid: string;
  }): Promise<{ success: boolean; error?: string }>;
}

export const getSavedWifi = (): SavedWifiPluginInterface | null => {
  if (!isCapacitor) return null;
  const Capacitor = (window as any).Capacitor;
  return Capacitor?.Plugins?.SavedWifi || null;
};

// ============ Bluetooth Scanner Plugin ============
export interface BluetoothDevice {
  name: string;
  macAddress: string;
  rssi?: number;
  signal?: number;
  distance?: number; // Distance in meters
  distanceDescription?: string; // Human-readable distance
  type: string;
  scanType?: string;
  deviceClass?: string;
  deviceType?: string;
  bondState?: string;
  isPaired?: boolean;
  isConnected?: boolean; // Added: true if device is actively connected
  timestamp?: number;
  // History fields
  firstSeen?: number;
  lastSeen?: number;
  connectionCount?: number;
  lastRssi?: number;
}

export interface BluetoothScanResult {
  success: boolean;
  devices: BluetoothDevice[];
  count?: number;
  error?: string;
}

export interface BluetoothHistoryResult {
  success: boolean;
  devices: BluetoothDevice[];
  count?: number;
  error?: string;
}

export interface BluetoothScannerPlugin {
  isBluetoothEnabled(): Promise<{ enabled: boolean }>;
  getPairedDevices(): Promise<BluetoothScanResult>;
  scan(): Promise<BluetoothScanResult>;
  getDeviceHistory(): Promise<BluetoothHistoryResult>;
  clearHistory(): Promise<{ success: boolean; error?: string }>;
  pairDevice(options: { address: string }): Promise<{ success: boolean; error?: string }>;
}

export const getBluetoothScanner = (): BluetoothScannerPlugin | null => {
  if (!isCapacitor) return null;
  const Capacitor = (window as any).Capacitor;
  return Capacitor?.Plugins?.BluetoothScanner || null;
};

// ============ Network Scanner Plugin ============
export interface NetworkDevice {
  ipAddress: string;
  macAddress?: string;
  hostname?: string;
  deviceType?: string;
  isReachable?: boolean;
  hasHttp?: boolean;
  hasHttps?: boolean;
  hasSsh?: boolean;
  timestamp?: number;
  // Device tracking fields
  pingMs?: number;
  signalStrength?: number;
  rssiEstimate?: number;
  firstSeen?: number;
  lastSeen?: number;
  connectionCount?: number;
  connectionsToday?: number;
  totalOnlineTime?: number;
  lastSessionStart?: number;
  isOnline?: boolean;
  source?: string;
  imei?: string;
  vendor?: string;
  name?: string;
  isTrusted?: boolean;
}

export interface DeviceHistoryResult {
  success: boolean;
  devices: NetworkDevice[];
  count?: number;
  error?: string;
}

export interface NetworkInfo {
  success: boolean;
  ssid?: string;
  bssid?: string;
  ipAddress?: string;
  gateway?: string;
  netmask?: string;
  dns1?: string;
  dns2?: string;
  serverAddress?: string;
  linkSpeed?: number;
  rssi?: number;
  frequency?: number;
  connectionType?: string;
  isConnected?: boolean;
  // Carrier/SIM information
  carrierName?: string;
  networkType?: string;
  simState?: string;
  hasSim?: boolean;
  networkOperator?: string;
  error?: string;
}

export interface NetworkScanResult {
  success: boolean;
  devices: NetworkDevice[];
  count?: number;
  subnet?: string;
  error?: string;
}

// ===== ENHANCED DEVICE SCANNER TYPES =====
export interface EnhancedDevice {
  ipAddress: string;
  macAddress: string;
  hostname: string;
  vendor: string;
  deviceType: 'phone' | 'laptop' | 'tablet' | 'tv' | 'printer' | 'camera' | 'iot' | 'router' | 'gaming' | 'unknown';
  customName: string | null;
  firstSeen: number;
  lastSeen: number;
  timesSeen: number;
  isFavorite: boolean;
  notes: string | null;
}

export interface OpenPort {
  port: number;
  service: string;
  description: string;
}

export interface PortScanResult {
  success: boolean;
  ipAddress: string;
  openPorts: OpenPort[];
  scanDuration: number;
}

// ===== NETWORK USAGE TYPES =====
export interface NetworkSpeed {
  downloadSpeed: number;  // bytes per second
  uploadSpeed: number;    // bytes per second
  totalRxBytes: number;
  totalTxBytes: number;
  timestamp: number;
}

export interface DataUsage {
  wifiRx: number;
  wifiTx: number;
  wifiTotal: number;
  mobileRx: number;
  mobileTx: number;
  mobileTotal: number;
  totalRx: number;
  totalTx: number;
  grandTotal: number;
  startTime: number;
  endTime: number;
  needsPermission: boolean;
  error?: string;
}

export interface AppUsage {
  uid: number;
  packageName: string;
  appName: string;
  rxBytes: number;
  txBytes: number;
  totalBytes: number;
}

export interface NetworkScannerPlugin {
  getNetworkInfo(): Promise<NetworkInfo>;
  scanDevices(): Promise<NetworkScanResult>;
  scanWithRouterCredentials(options: { routerIP?: string; username: string; password: string }): Promise<NetworkScanResult>;
  getArpTable(): Promise<NetworkScanResult>;
  getDeviceHistory(): Promise<DeviceHistoryResult>;
  clearDeviceHistory(): Promise<{ success: boolean; error?: string }>;
  
  // ===== ENHANCED DEVICE SCANNER METHODS =====
  scanWithDetails(): Promise<{ success: boolean; devices: EnhancedDevice[]; count: number; scanDuration: number }>;
  scanDevicePorts(options: { ipAddress: string }): Promise<PortScanResult>;
  getDeviceInfo(options: { macAddress: string }): Promise<{ device: EnhancedDevice | null }>;
  setDeviceCustomName(options: { macAddress: string; customName: string }): Promise<{ success: boolean }>;
  setDeviceType(options: { macAddress: string; deviceType: string }): Promise<{ success: boolean }>;
  setDeviceNotes(options: { macAddress: string; notes: string }): Promise<{ success: boolean }>;
  toggleDeviceFavorite(options: { macAddress: string }): Promise<{ success: boolean; isFavorite: boolean }>;
  getSavedDevices(): Promise<{ success: boolean; devices: EnhancedDevice[]; count: number }>;
  deleteDeviceHistory(options: { macAddress: string }): Promise<{ success: boolean }>;
  
  // ===== NETWORK USAGE METHODS =====
  getNetworkSpeed(): Promise<NetworkSpeed>;
  getDataUsage(options: { period: 'today' | 'week' | 'month' | 'custom'; startTime?: number; endTime?: number }): Promise<DataUsage>;
  getPerAppUsage(options: { period: 'today' | 'week' | 'month' }): Promise<{ apps: AppUsage[]; count: number; needsPermission: boolean }>;
  hasUsagePermission(): Promise<{ granted: boolean }>;
  requestUsagePermission(): Promise<{ opened: boolean }>;
}

export interface RouterCredentials {
  routerIP: string;
  username: string;
  password: string;
}

export const getNetworkScanner = (): NetworkScannerPlugin | null => {
  if (!isCapacitor) return null;
  const Capacitor = (window as any).Capacitor;
  return Capacitor?.Plugins?.NetworkScanner || null;
};

// ============ VPN Detection Plugin ============
export interface VpnDetectionResult {
  vpnDetected: boolean;
  method?: string;
  vpnNetworkFound?: boolean;
  vpnInterfaces?: string[];
  interfaceCheckError?: string;
}

export interface VpnDetectionPlugin {
  checkVpnStatus(): Promise<VpnDetectionResult>;
}

export const getVpnDetection = (): VpnDetectionPlugin | null => {
  if (!isCapacitor) return null;
  const Capacitor = (window as any).Capacitor;
  return Capacitor?.Plugins?.VpnDetection || Capacitor?.Plugins?.NetworkScanner || null;
};

// ============ IR Blaster Plugin (re-export) ============
export interface IRBlasterPlugin {
  hasIrEmitter(): Promise<{ hasIrEmitter: boolean }>;
  getCarrierFrequencies(): Promise<{
    success: boolean;
    frequencies?: { minFrequency: number; maxFrequency: number }[];
    error?: string;
  }>;
  transmit(options: { frequency: number; pattern: number[] }): Promise<{
    success: boolean;
    error?: string;
  }>;
  transmitPronto(options: { code: string }): Promise<{
    success: boolean;
    error?: string;
  }>;
}

export const getIRBlaster = (): IRBlasterPlugin | null => {
  if (!isCapacitor) return null;
  const Capacitor = (window as any).Capacitor;
  return Capacitor?.Plugins?.IRBlaster || null;
};

// ============ Speed Test Plugin ============
export interface SpeedTestResult {
  success: boolean;
  download?: number;
  upload?: number;
  ping?: number;
  jitter?: number;
  timestamp?: number;
  error?: string;
}

export interface SpeedTestProgress {
  phase: 'ping' | 'download' | 'upload';
  progress: number;
  message: string;
}

export interface SpeedTestPlugin {
  runFullTest(): Promise<SpeedTestResult>;
  cancelTest(): Promise<{ success: boolean }>;
  measurePingOnly(): Promise<{ success: boolean; ping?: number; jitter?: number; error?: string }>;
  addListener(eventName: 'speedTestProgress', callback: (data: SpeedTestProgress) => void): Promise<{ remove: () => void }>;
}

export const getSpeedTest = (): SpeedTestPlugin | null => {
  if (!isCapacitor) return null;
  const Capacitor = (window as any).Capacitor;
  return Capacitor?.Plugins?.SpeedTest || null;
};


// ============ Permission Manager Plugin ============
export interface PermissionStatus {
  location: boolean;
  bluetooth: boolean;
  wifi: boolean;
}

export interface ServiceStatus {
  location: boolean;
  bluetooth: boolean;
  wifi: boolean;
}

export interface AllStatusResult {
  permissions: PermissionStatus;
  services: ServiceStatus;
  allPermissionsGranted: boolean;
  allServicesEnabled: boolean;
}

export interface PermissionResult {
  granted: boolean;
}

export interface AllPermissionsResult {
  granted: boolean;
  location: boolean;
  bluetooth: boolean;
  wifi: boolean;
}

export interface EnableServiceResult {
  success: boolean;
  enabled?: boolean;
  enabling?: boolean;
  openedSettings?: boolean;
  message?: string;
  error?: string;
}

export interface PermissionManagerPlugin {
  checkAllStatus(): Promise<AllStatusResult>;
  isLocationEnabled(): Promise<{ enabled: boolean }>;
  isBluetoothEnabled(): Promise<{ enabled: boolean }>;
  isWifiEnabled(): Promise<{ enabled: boolean }>;
  requestLocationPermission(): Promise<PermissionResult>;
  requestBluetoothPermission(): Promise<PermissionResult>;
  requestAllPermissions(): Promise<AllPermissionsResult>;
  enableLocation(): Promise<EnableServiceResult>;
  enableBluetooth(): Promise<EnableServiceResult>;
  enableWifi(): Promise<EnableServiceResult>;
}

export const getPermissionManager = (): PermissionManagerPlugin | null => {
  if (!isCapacitor) return null;
  const Capacitor = (window as any).Capacitor;
  return Capacitor?.Plugins?.PermissionManager || null;
};


// ============ Network Tools Plugin ============
export interface TracerouteHop {
  hop: number;
  ip: string;
  hostname?: string;
  time: number;
  status: 'success' | 'timeout' | 'error' | 'pending';
}

export interface TracerouteResult {
  success: boolean;
  hops: TracerouteHop[];
  destination: string;
  resolvedIp?: string;
  totalHops?: number;
  error?: string;
}

export interface PingResult {
  success: boolean;
  host: string;
  resolvedIp?: string;
  sent: number;
  received: number;
  lost: number;
  min: number;
  max: number;
  avg: number;
  stdDev: number;
  times: number[];
  error?: string;
}

export interface PortScanResult {
  success: boolean;
  host: string;
  resolvedIp?: string;
  openPorts: {
    port: number;
    service: string;
    description: string;
  }[];
  scannedPorts: number;
  error?: string;
}

export interface NetworkToolsPlugin {
  traceroute(options: { host: string; maxHops?: number }): Promise<TracerouteResult>;
  ping(options: { host: string; count?: number; timeout?: number }): Promise<PingResult>;
  portScan(options: { host: string; ports?: number[]; timeout?: number }): Promise<PortScanResult>;
  resolveHost(options: { host: string }): Promise<{ success: boolean; ip?: string; error?: string }>;
  addListener(eventName: 'tracerouteProgress' | 'pingProgress' | 'portScanProgress', callback: (data: any) => void): Promise<{ remove: () => void }>;
}

export const getNetworkTools = (): NetworkToolsPlugin | null => {
  if (!isCapacitor) return null;
  const Capacitor = (window as any).Capacitor;
  return Capacitor?.Plugins?.NetworkTools || null;
};

// ============ Camera Detector Plugin ============
export interface CameraDetectorPlugin {
  hasMagnetometer(): Promise<{ hasSensor: boolean }>;
  hasIrEmitter(): Promise<{ hasIrEmitter: boolean }>;
  hasCamera(): Promise<{ hasCamera: boolean }>;
  startMagneticScan(): Promise<{ success: boolean; error?: string }>;
  stopMagneticScan(): Promise<{ success: boolean }>;
  startIRDetection(): Promise<{ success: boolean; error?: string }>;
  stopIRDetection(): Promise<{ success: boolean }>;
  startLensDetection(): Promise<{ success: boolean; error?: string }>;
  stopLensDetection(): Promise<{ success: boolean }>;
  getMagneticReading(): Promise<{
    success: boolean;
    x: number;
    y: number;
    z: number;
    magnitude: number;
    anomalyDetected: boolean;
    threshold: number;
    timestamp: number;
    error?: string;
  }>;
  getIRReading(): Promise<{
    success: boolean;
    reflectionDetected: boolean;
    intensity: number;
    confidence: number;
    timestamp: number;
    error?: string;
  }>;
  addListener(
    eventName: 'magneticAnomaly' | 'irReflection' | 'lensDetected',
    callback: (data: any) => void
  ): Promise<{ remove: () => void }>;
}

export const getCameraDetector = (): CameraDetectorPlugin | null => {
  if (!isCapacitor) return null;
  const Capacitor = (window as any).Capacitor;
  return Capacitor?.Plugins?.CameraDetector || null;
};

// ============ Packet Sniffer Plugin ============
export interface ConnectionLog {
  id: string;
  appPackage: string;
  appName: string;
  appIcon?: string; // Base64 encoded PNG
  protocol: string;
  sourceIP: string;
  sourcePort: number;
  destinationIP: string;
  destinationPort: number;
  countryName: string;
  countryCode: string;
  bytesSent: number;
  bytesReceived: number;
  isSuspicious: boolean;
  suspiciousReason?: string;
  severity?: string; // 'high', 'medium', 'low'
  timestamp: number;
}

export interface AppTrafficSummary {
  appPackage: string;
  appName: string;
  appIcon?: string; // Base64 encoded PNG
  totalConnections: number;
  totalBytesSent: number;
  totalBytesReceived: number;
  uniqueCountries: number;
  uniqueIps: number;
  suspiciousCount: number;
  lastActive: number;
}

export interface CountryTraffic {
  countryCode: string;
  countryName: string;
  totalConnections: number;
  totalBytes: number;
  uniqueApps: number;
}

export interface LiveStats {
  capturing: boolean;
  totalPackets: number;
  totalBytes: number;
  activeApps: number;
  uniqueCountries: number;
  suspiciousCount: number;
  duration: number; // seconds
}

export interface PacketSnifferPlugin {
  startCapture(): Promise<{ 
    success: boolean; 
    sessionId?: string; 
    error?: string 
  }>;
  
  stopCapture(): Promise<{ 
    success: boolean; 
    error?: string 
  }>;
  
  isCapturing(): Promise<{ 
    capturing: boolean 
  }>;
  
  getRecentConnections(options?: { 
    limit?: number 
  }): Promise<{ 
    success: boolean; 
    connections: ConnectionLog[]; 
    error?: string 
  }>;
  
  getAppTraffic(): Promise<{ 
    success: boolean; 
    apps: AppTrafficSummary[]; 
    error?: string 
  }>;
  
  getCountryTraffic(): Promise<{ 
    success: boolean; 
    countries: CountryTraffic[]; 
    error?: string 
  }>;
  
  getSuspiciousActivity(): Promise<{ 
    success: boolean; 
    alerts: ConnectionLog[]; 
    error?: string 
  }>;
  
  getLiveStats(): Promise<{ 
    success: boolean; 
    stats: LiveStats; 
    error?: string 
  }>;
  
  clearLogs(): Promise<{ 
    success: boolean; 
    error?: string 
  }>;
  
  addListener(
    eventName: 'newConnection',
    callback: (data: ConnectionLog) => void
  ): Promise<{ remove: () => void }>;
  
  addListener(
    eventName: 'suspiciousDetected',
    callback: (data: ConnectionLog) => void
  ): Promise<{ remove: () => void }>;
}

export const getPacketSniffer = (): PacketSnifferPlugin | null => {
  if (!isCapacitor) return null;
  const Capacitor = (window as any).Capacitor;
  return Capacitor?.Plugins?.PacketSniffer || null;
};

// ============ Evil Twin Shield Plugin ============

// DNS Shield Types
export interface PrivateDNSStatus {
  supported: boolean;
  enabled: boolean;
  mode: 'off' | 'automatic' | 'strict';
  serverHostname?: string;
  active: boolean;
}

export interface DNSShieldStatus {
  shieldStatus: 'ACTIVE' | 'INACTIVE' | 'SYSTEM_PROTECTED';
  appLevelDoHEnabled: boolean;
  systemPrivateDNS: PrivateDNSStatus;
  activeProvider: string;
  cachedEntries: number;
  autoActivateEnabled: boolean;
  activationThreshold: number;
}

export interface DNSComparisonResult {
  domain: string;
  dohIPs: string[];
  systemIPs: string[];
  match: boolean;
  systemHijacked: boolean;
}

export interface DNSLeakTestResult {
  success: boolean;
  leakDetected: boolean;
  systemDNSServers: string[];
  dnsServersAreTrusted: boolean;
  comparisons: DNSComparisonResult[];
  resultsConsistent: boolean;
  summary: string;
}

export interface DNSResolutionResult {
  success: boolean;
  hostname: string;
  resolvedIPs: string[];
  provider: string;
  resolutionTimeMs: number;
  encrypted: boolean;
  ttl: number;
  error?: string;
}

// Evil Twin Types
export interface ThreatIndicator {
  type: 'DUPLICATE_SSID' | 'SECURITY_DOWNGRADE' | 'SIGNAL_ANOMALY' | 'GATEWAY_MAC_CHANGED' | 'ARP_SPOOF' | 'DNS_HIJACK' | 'CAPTIVE_PORTAL_REDIRECT' | 'SSL_INTERCEPT' | 'RTT_ANOMALY' | 'DNS_LEAK' | 'UNTRUSTED_DNS';
  severity: 'CRITICAL' | 'HIGH' | 'MEDIUM' | 'LOW';
  description: string;
}

export interface DuplicateAP {
  bssid: string;
  signalLevel: number;
  security: string;
  frequency: number;
  channel: number;
  vendorOUI: string;
}

export interface WiFiAnalysisResult {
  duplicateCount: number;
  duplicates: DuplicateAP[];
  securityDowngrade: boolean;
  signalAnomaly: boolean;
}

export interface GatewayCheckResult {
  gatewayIP: string;
  gatewayMAC: string;
  macChanged: boolean;
  possibleARPSpoof: boolean;
  previousMAC?: string;
  dhcpServer: string;
  dhcpChanged: boolean;
}

export interface DNSTest {
  domain: string;
  resolvedIP: string;
  expectedRange: string;
  passed: boolean;
}

export interface DNSCheckResult {
  dnsHijacked: boolean;
  allSameIP: boolean;
  tests: DNSTest[];
}

export interface SSLTest {
  url: string;
  issuer: string;
  valid: boolean;
  trusted: boolean;
}

export interface SSLCheckResult {
  sslIntercepted: boolean;
  tests: SSLTest[];
}

export interface PingTest {
  target: string;
  rttMs: number;
  reachable: boolean;
}

export interface RTTCheckResult {
  averageRTT: number;
  anomalyDetected: boolean;
  tests: PingTest[];
  baselineRTT: number;
}

export interface EvilTwinScanResult {
  success: boolean;
  threatScore: number;
  threatLevel: 'SAFE' | 'LOW_RISK' | 'MEDIUM_RISK' | 'HIGH_RISK' | 'CRITICAL';
  ssid: string;
  bssid: string;
  indicators: ThreatIndicator[];
  wifiAnalysis?: WiFiAnalysisResult;
  gatewayCheck?: GatewayCheckResult;
  dnsCheck?: DNSCheckResult;
  sslCheck?: SSLCheckResult;
  rttCheck?: RTTCheckResult;
  scanDurationMs: number;
  scanTimestamp: number;
  error?: string;
}

export interface ScanHistoryEntry {
  id: number;
  ssid: string;
  bssid: string;
  threatScore: number;
  threatLevel: string;
  timestamp: number;
  scanDurationMs: number;
}

export interface EvilTwinNetworkInfo {
  ssid: string;
  bssid: string;
  rssi: number;
  frequency: number;
  gatewayIP: string;
  hasTrustedBaseline: boolean;
  isKnownEvilTwin: boolean;
  timesConnected?: number;
  lastSeen?: number;
}

export interface KnownEvilTwin {
  id: number;
  ssid: string;
  bssid: string;
  reason: string;
  firstDetected: number;
  lastDetected: number;
  timesDetected: number;
}

export interface EvilTwinPlugin {
  runFullScan(): Promise<EvilTwinScanResult>;
  runQuickScan(): Promise<EvilTwinScanResult>;
  getScanHistory(options?: { limit?: number }): Promise<{
    success: boolean;
    history: ScanHistoryEntry[];
  }>;
  getNetworkProfile(options: { ssid: string }): Promise<{
    success: boolean;
    profile: any;
  }>;
  markTrusted(options: { ssid: string; bssid: string }): Promise<{ success: boolean }>;
  markEvilTwin(options: { ssid: string; bssid: string; reason?: string }): Promise<{ success: boolean }>;
  getKnownEvilTwins(): Promise<{ success: boolean; evilTwins: KnownEvilTwin[] }>;
  enableAutoMonitor(): Promise<{ success: boolean }>;
  disableAutoMonitor(): Promise<{ success: boolean }>;
  isAutoMonitorEnabled(): Promise<{ enabled: boolean }>;
  getCurrentNetworkInfo(): Promise<{ success: boolean; network: EvilTwinNetworkInfo }>;
  clearHistory(): Promise<{ success: boolean }>;
  // DNS Shield methods
  getDNSShieldStatus(): Promise<{ success: boolean } & DNSShieldStatus>;
  enableDNSShield(): Promise<{ success: boolean }>;
  disableDNSShield(): Promise<{ success: boolean }>;
  setDNSProvider(options: { provider: 'cloudflare' | 'google' | 'quad9' }): Promise<{ success: boolean }>;
  runDNSLeakTest(): Promise<DNSLeakTestResult>;
  resolveDomain(options: { domain: string; encrypted?: boolean }): Promise<DNSResolutionResult>;
  setAutoActivate(options: { enabled: boolean; threshold?: number }): Promise<{ success: boolean }>;
  getSystemPrivateDNSStatus(): Promise<{ success: boolean } & PrivateDNSStatus>;
  openPrivateDNSSettings(): Promise<{ success: boolean }>;
  addListener(eventName: 'scanComplete', callback: (data: EvilTwinScanResult) => void): Promise<{ remove: () => void }>;
  addListener(eventName: 'threatDetected', callback: (data: EvilTwinScanResult) => void): Promise<{ remove: () => void }>;
}

export const getEvilTwin = (): EvilTwinPlugin | null => {
  if (!isCapacitor) return null;
  const Capacitor = (window as any).Capacitor;
  return Capacitor?.Plugins?.EvilTwin || null;
};

// =============================================================
// AR NETWORK MAPPER PLUGIN
// =============================================================

export interface AROrientation {
  azimuth: number;     // 0-360, compass heading
  pitch: number;       // -180 to 180, tilt forward/back
  roll: number;        // -90 to 90, tilt left/right
  direction: string;   // "N", "NE", "E", "SE", "S", "SW", "W", "NW"
}

export interface ARWiFiNetwork {
  ssid: string;
  bssid: string;
  dbm: number;
  frequency: number;
  channel: number;
  band: string;        // "2.4 GHz" | "5 GHz"
  security: string;
  quality: string;     // "Excellent" | "Very Good" | "Good" | "Fair" | "Weak"
  qualityPercent: number;
  type: 'wifi';
  standard?: string;
}

export interface ARBluetoothDevice {
  name: string;
  mac: string;
  dbm: number;
  quality: string;
  qualityPercent: number;
  type: 'bluetooth';
  btType: string;
  lastSeen?: number;
}

export interface ARData {
  orientation: AROrientation;
  wifiNetworks: ARWiFiNetwork[];
  wifiCount: number;
  bluetoothDevices: ARBluetoothDevice[];
  bluetoothCount: number;
  timestamp: number;
  isScanning: boolean;
}

export interface ARMapperPlugin {
  startARScan(): Promise<{ success: boolean; hasCompass: boolean; hasBluetooth: boolean; hasWifi: boolean }>;
  stopARScan(): Promise<{ success: boolean }>;
  getOrientation(): Promise<AROrientation>;
  getARData(): Promise<ARData>;
  addListener(eventName: 'orientationChange', handler: (data: AROrientation) => void): any;
  addListener(eventName: 'bleDeviceFound', handler: (data: ARBluetoothDevice) => void): any;
}

export const getARMapper = (): ARMapperPlugin | null => {
  if (!isCapacitor) return null;
  const Capacitor = (window as any).Capacitor;
  return Capacitor?.Plugins?.ARMapper || null;
};

// AR Signal helper functions
export interface ARSignalInfo {
  quality: string;
  color: string;
  bgColor: string;
  percent: number;
}

export function getARSignalInfo(dbm: number): ARSignalInfo {
  if (dbm >= -50) return { quality: 'Excellent', color: '#22d3ee', bgColor: 'rgba(34,211,238,0.15)', percent: Math.min(100, 100 + dbm + 30) };
  if (dbm >= -60) return { quality: 'Very Good', color: '#10b981', bgColor: 'rgba(16,185,129,0.15)', percent: Math.min(90, 80 + (dbm + 60) * 2) };
  if (dbm >= -70) return { quality: 'Good', color: '#a3e635', bgColor: 'rgba(163,230,53,0.15)', percent: Math.min(70, 60 + (dbm + 70) * 2) };
  if (dbm >= -80) return { quality: 'Fair', color: '#f59e0b', bgColor: 'rgba(245,158,11,0.15)', percent: Math.min(50, 30 + (dbm + 80) * 2) };
  return { quality: 'Weak', color: '#ef4444', bgColor: 'rgba(239,68,68,0.15)', percent: Math.max(5, 15 + (dbm + 90)) };
}

export function hashMacAddress(mac: string): number {
  let hash = 0;
  for (let i = 0; i < mac.length; i++) {
    hash = ((hash << 5) - hash) + mac.charCodeAt(i);
    hash |= 0;
  }
  return Math.abs(hash);
}

export function calculateARPosition(mac: string, dbm: number, screenW: number, screenH: number) {
  const h = hashMacAddress(mac);
  const angle = h % 360;
  const angleRad = (angle * Math.PI) / 180;
  const normalizedDistance = Math.max(0, Math.min(1, (Math.abs(dbm) - 30) / 65));
  const cx = screenW / 2;
  const cy = screenH / 2;
  let x = cx + Math.cos(angleRad) * normalizedDistance * (cx - 100) * 0.7;
  let y = cy + Math.sin(angleRad) * normalizedDistance * (cy - 60) * 0.6;
  x = Math.max(10, Math.min(screenW - 180, x));
  y = Math.max(100, Math.min(screenH - 40, y));
  return { x, y, angle, normalizedDistance };
}

// ============ Router Guard Plugin ============

export interface RouterCredential {
  id: number;
  routerIp: string;
  brand: string;
  model: string;
  username: string;
  authMethod: 'http' | 'ssh' | 'telnet';
  loginUrl: string;
  isActive: boolean;
  lastConnected: number | null;
}

export interface KnownDevice {
  id: number;
  macAddress: string;
  deviceName: string;
  customName: string | null;
  ipAddress: string;
  vendor: string;
  deviceType: 'phone' | 'laptop' | 'tablet' | 'iot' | 'tv' | 'printer' | 'camera' | 'unknown';
  isTrusted: number; // 1 = trusted, 0 = unknown, -1 = blocked
  firstSeen: number;
  lastSeen: number;
  timesSeen: number;
  isOnline: boolean;
  notes: string | null;
}

export interface DeviceSession {
  id: number;
  macAddress: string;
  ipAddress: string;
  connectedAt: number;
  disconnectedAt: number | null;
  sessionDuration: number | null;
}

export interface DeviceAlert {
  id: number;
  macAddress: string;
  alertType: 'new_device' | 'reconnected' | 'suspicious' | 'blocked_attempt';
  alertMessage: string;
  severity: 'info' | 'warning' | 'danger';
  isRead: boolean;
  createdAt: number;
}

export interface DeviceStats {
  totalDevices: number;
  onlineDevices: number;
  trustedDevices: number;
  untrustedDevices: number;
  newDevicesToday: number;
  unreadAlerts: number;
}

export interface GuardSettings {
  monitoringEnabled: boolean;
  scanInterval: number;
  notifyNewDevice: boolean;
  notifyReturningDevice: boolean;
  notifySuspicious: boolean;
  autoStartOnBoot: boolean;
}

export interface ThreatFinding {
  ruleId: string;
  ruleName: string;
  description: string;
  severity: number; // 0-4
  scoreContribution: number;
  recommendation: string;
}

export interface ThreatReport {
  macAddress: string;
  deviceName: string;
  overallThreatLevel: number; // 0-4
  threatScore: number; // 0-100
  findings: ThreatFinding[];
  summary: string;
  analyzedAt: number;
  isDismissed: boolean;
}

export interface NetworkSnapshot {
  id: number;
  onlineCount: number;
  trustedCount: number;
  untrustedCount: number;
  threatCount: number;
  snapshotAt: number;
}

export interface DeviceCategorization {
  deviceType: string;
  confidence: number;
  reasoning: string;
}

export interface RouterGuardPlugin {
  // Router Credentials
  saveRouterCredentials(options: { 
    routerIp: string; 
    brand: string; 
    model?: string; 
    username: string; 
    password: string; 
    authMethod?: string; 
    loginUrl?: string 
  }): Promise<{ success: boolean; id: number }>;
  
  getActiveRouter(): Promise<{ router: RouterCredential | null }>;
  
  getAllRouters(): Promise<{ routers: RouterCredential[] }>;
  
  deleteRouter(options: { id: number }): Promise<{ success: boolean }>;
  
  setActiveRouter(options: { id: number }): Promise<{ success: boolean }>;

  // Device History
  getKnownDevices(): Promise<{ devices: KnownDevice[] }>;
  
  getOnlineDevices(): Promise<{ devices: KnownDevice[]; count: number }>;
  
  setDeviceTrust(options: { macAddress: string; trustLevel: number }): Promise<{ success: boolean }>;
  
  setDeviceCustomName(options: { macAddress: string; customName: string }): Promise<{ success: boolean }>;
  
  setDeviceType(options: { macAddress: string; deviceType: string }): Promise<{ success: boolean }>;
  
  getDeviceSessions(options: { macAddress: string; limit?: number }): Promise<{ sessions: DeviceSession[] }>;
  
  getAlerts(options: { unreadOnly?: boolean; limit?: number }): Promise<{ alerts: DeviceAlert[]; unreadCount: number }>;
  
  markAlertRead(options: { alertId: number }): Promise<{ success: boolean }>;
  
  markAllAlertsRead(): Promise<{ success: boolean }>;
  
  getDeviceStats(): Promise<DeviceStats>;
  
  // Router Device Fetching (Part 2)
  testRouterConnection(options: {
    routerIp: string;
    username: string;
    password: string;
    brand?: string;
    authMethod?: string;
  }): Promise<{ success: boolean; deviceCount?: number; method?: string; error?: string }>;
  
  fetchRouterDevices(): Promise<{
    success: boolean;
    devices?: KnownDevice[];
    newDevices?: number;
    method?: string;
    totalOnline?: number;
    error?: string;
  }>;
  
  getRouterDevicesQuick(): Promise<{
    success: boolean;
    devices?: KnownDevice[];
    method?: string;
    error?: string;
  }>;
  
  // Monitoring Service Control (Part 3)
  startMonitoring(options?: { scanInterval?: number }): Promise<{ success: boolean; interval: number }>;
  
  stopMonitoring(): Promise<{ success: boolean }>;
  
  isMonitoring(): Promise<{ monitoring: boolean; interval: number; lastScanTime: number }>;
  
  setScanInterval(options: { interval: number }): Promise<{ success: boolean; interval: number }>;
  
  // Guard Settings
  getGuardSettings(): Promise<GuardSettings>;
  
  updateGuardSettings(options: Partial<GuardSettings>): Promise<{ success: boolean }>;
  
  // Event Listeners
  addListener(
    eventName: 'deviceListUpdated',
    handler: (data: { devices: KnownDevice[]; onlineCount: number; timestamp: number }) => void
  ): Promise<{ remove: () => void }>;
  
  addListener(
    eventName: 'newDeviceDetected',
    handler: (data: { device: KnownDevice; alert: DeviceAlert }) => void
  ): Promise<{ remove: () => void }>;
  
  addListener(
    eventName: 'deviceWentOffline',
    handler: (data: { macAddress: string; deviceName: string }) => void
  ): Promise<{ remove: () => void }>;
  
  addListener(
    eventName: 'scanCompleted',
    handler: (data: { onlineCount: number; newCount: number; duration: number }) => void
  ): Promise<{ remove: () => void }>;
  
  // Threat Detection (Part 4)
  analyzeDevice(options: { macAddress: string }): Promise<{ report: ThreatReport }>;
  
  analyzeAllDevices(): Promise<{ reports: ThreatReport[]; highThreatCount: number }>;
  
  getActiveThreats(): Promise<{ threats: ThreatReport[]; count: number }>;
  
  getHighThreats(): Promise<{ threats: ThreatReport[]; count: number }>;
  
  dismissThreat(options: { reportId: number }): Promise<{ success: boolean }>;
  
  getNetworkHealthHistory(options?: { hours?: number }): Promise<{ snapshots: NetworkSnapshot[] }>;
  
  getThreatTrend(options: { macAddress: string; days?: number }): Promise<{ 
    trend: { score: number; timestamp: number }[] 
  }>;
  
  categorizeDevice(options: { macAddress: string }): Promise<DeviceCategorization>;
  
  autoCategorizeAll(): Promise<{ 
    categorized: number; 
    results: { macAddress: string; deviceType: string; confidence: number }[] 
  }>;
  
  // Threat events
  addListener(
    eventName: 'threatDetected',
    handler: (data: { report: ThreatReport }) => void
  ): Promise<{ remove: () => void }>;
  
  addListener(
    eventName: 'networkHealthUpdate',
    handler: (data: NetworkSnapshot) => void
  ): Promise<{ remove: () => void }>;
}

export const getRouterGuard = (): RouterGuardPlugin | null => {
  if (!isCapacitor) return null;
  const Capacitor = (window as any).Capacitor;
  return Capacitor?.Plugins?.RouterGuard || null;
};


// ============================================
// SECURITY AUDIT PLUGIN INTERFACES
// ============================================

// --- Check Result ---
export interface SecurityCheck {
  id: string;                    // e.g. "wifi_encryption", "open_ports"
  name: string;                  // Human readable: "WiFi Encryption"
  status: 'pass' | 'warn' | 'fail';
  value: string;                 // e.g. "WPA3", "2 ports open"
  detail: string;                // Explanation
  score: number;                 // 0-100 (individual check score)
  weight: number;                // Weight in total calculation
  icon?: string;                 // Icon name hint for frontend
}

// --- Recommendation ---
export interface SecurityRecommendation {
  id: string;
  priority: 'HIGH' | 'MEDIUM' | 'LOW';
  title: string;
  description: string;
  category: 'wifi' | 'router' | 'dns' | 'network' | 'general';
  actionable: boolean;           // Can user take direct action?
  actionLabel?: string;          // e.g. "Open Router Settings"
  actionType?: 'open_router' | 'open_settings' | 'info_only';
}

// --- Router Info ---
export interface RouterInfo {
  gatewayIp: string;
  adminAccessible: boolean;
  httpAccessible: boolean;
  httpsAccessible: boolean;
  openPorts: number[];
  manufacturer?: string;         // From MAC OUI if detectable
}

// --- Full Audit Result ---
export interface SecurityAuditResult {
  score: number;                 // 0-100
  grade: string;                 // "A+", "A", "B", "C", "D", "F"
  timestamp: number;             // Milliseconds since epoch
  checks: SecurityCheck[];
  recommendations: SecurityRecommendation[];
  routerInfo: RouterInfo;
  networkName?: string;          // Current WiFi SSID
  deviceCount?: number;          // Devices on network
}

// --- Quick Check Result ---
export interface QuickCheckResult {
  score: number;
  grade: string;
  encryptionType: string;
  deviceCount: number;
  criticalIssues: number;        // Number of HIGH priority issues
}

// --- Security Tip ---
export interface SecurityTip {
  id: string;
  category: 'wifi' | 'router' | 'password' | 'network' | 'privacy' | 'general';
  title: string;
  description: string;
  isContextual: boolean;         // true = based on audit, false = static
}

// --- Plugin Interface ---
export interface SecurityAuditPlugin {
  runFullAudit(): Promise<{ result: SecurityAuditResult }>;
  runQuickCheck(): Promise<{ result: QuickCheckResult }>;
  getSecurityTips(): Promise<{ tips: SecurityTip[] }>;
  getLastAuditResult(): Promise<{ result: SecurityAuditResult | null }>;
  openRouterAdmin(): Promise<{ success: boolean }>;
}

// --- Getter (follows existing pattern EXACTLY) ---
export const getSecurityAudit = (): SecurityAuditPlugin | null => {
  if (!isCapacitor) return null;
  const Capacitor = (window as any).Capacitor;
  return Capacitor?.Plugins?.SecurityAudit || null;
};

// ============================================================
// IoT Device Plugin
// ============================================================
export interface IoTDeviceInfo {
  id: number;
  ipAddress: string;
  macAddress: string;
  hostname: string;
  deviceName: string;
  manufacturer: string;
  deviceType: 'camera' | 'speaker' | 'light' | 'plug' | 'thermostat' | 'tv' | 'lock' | 'hub' | 'sensor' | 'appliance' | 'other';
  deviceModel: string;
  roomId: number;
  roomName?: string;
  firstSeen: number;
  lastSeen: number;
  isOnline: boolean;
  openPorts: number[];
  services: string[];
  securityScore: number;
  securityIssues: string[];
  notes: string;
  iconType: string;
  platform: 'google_home' | 'alexa' | 'homekit' | 'smartthings' | 'other';
}

export interface IoTRoom {
  id: number;
  name: string;
  icon: string;
  deviceCount: number;
  createdAt: number;
}

export interface IoTSecurityFinding {
  id: number;
  deviceId: number;
  findingType: string;
  severity: 'critical' | 'high' | 'medium' | 'low' | 'info';
  title: string;
  description: string;
  recommendation: string;
  foundAt: number;
}

export interface IoTDeviceStats {
  total: number;
  online: number;
  byType: Record<string, number>;
  avgSecurityScore: number;
  criticalIssues: number;
}

export interface IoTSecurityOverview {
  overallScore: number;
  totalFindings: number;
  critical: number;
  high: number;
  medium: number;
  low: number;
}

export interface IoTDevicePlugin {
  startDiscovery(): Promise<{ success: boolean; message: string }>;
  stopDiscovery(): Promise<{ success: boolean }>;
  isScanning(): Promise<{ scanning: boolean }>;
  getAllDevices(): Promise<{ devices: IoTDeviceInfo[] }>;
  getDeviceById(options: { id: number }): Promise<{ device: IoTDeviceInfo }>;
  getDevicesByRoom(options: { roomId: number }): Promise<{ devices: IoTDeviceInfo[] }>;
  getDevicesByType(options: { type: string }): Promise<{ devices: IoTDeviceInfo[] }>;
  getOnlineDevices(): Promise<{ devices: IoTDeviceInfo[] }>;
  updateDeviceName(options: { id: number; name: string }): Promise<{ success: boolean }>;
  updateDeviceRoom(options: { id: number; roomId: number }): Promise<{ success: boolean }>;
  deleteDevice(options: { id: number }): Promise<{ success: boolean }>;
  getDeviceStats(): Promise<IoTDeviceStats>;
  scanDeviceSecurity(options: { id: number }): Promise<{ score: number; findings: IoTSecurityFinding[] }>;
  getAllRooms(): Promise<{ rooms: IoTRoom[] }>;
  addRoom(options: { name: string; icon: string }): Promise<{ success: boolean; id: number }>;
  updateRoom(options: { id: number; name: string; icon: string }): Promise<{ success: boolean }>;
  deleteRoom(options: { id: number }): Promise<{ success: boolean }>;
  getSecurityOverview(): Promise<IoTSecurityOverview>;
  getSecurityFindings(options: { deviceId: number }): Promise<{ findings: IoTSecurityFinding[] }>;
  refreshDevice(options: { ip: string }): Promise<{ device: IoTDeviceInfo }>;
  clearAllData(): Promise<{ success: boolean }>;
  addListener(eventName: 'iotDeviceFound', listenerFunc: (data: { device: IoTDeviceInfo }) => void): Promise<any>;
  addListener(eventName: 'iotScanProgress', listenerFunc: (data: { scanned: number; total: number; percentage: number }) => void): Promise<any>;
  addListener(eventName: 'iotScanComplete', listenerFunc: (data: { totalDevices: number; iotDevices: number }) => void): Promise<any>;
  removeAllListeners(): Promise<void>;
}

export const getIoTDevice = (): IoTDevicePlugin | null => {
  if (!isCapacitor) return null;
  const Capacitor = (window as any).Capacitor;
  return Capacitor?.Plugins?.IoTDevice || null;
};

// ============================================
// DATA EXPORT PLUGIN INTERFACES
// ============================================

export interface DataStats {
  wifiScans: number;
  networkScans: number;
  speedTests: number;
  savedWifi: number;
  totalSize: string;
}

export interface ExportResult {
  success: boolean;
  filePath?: string;
  fileName?: string;
  error?: string;
}

export interface RestoreResult {
  success: boolean;
  restoredItems?: {
    wifiScans: number;
    networkScans: number;
    speedTests: number;
    savedWifi: number;
    settings: boolean;
  };
  error?: string;
}

export interface PickFileResult {
  success: boolean;
  filePath?: string;
  error?: string;
}

export interface DataExportPlugin {
  exportCSV(options: { dataTypes: string[] }): Promise<ExportResult>;
  exportPDF(options: { dataTypes: string[] }): Promise<ExportResult>;
  shareFile(options: { filePath: string; mimeType: string }): Promise<{ success: boolean }>;
  backupData(): Promise<ExportResult>;
  restoreData(options: { filePath: string }): Promise<RestoreResult>;
  pickFile(options?: { mimeType?: string }): Promise<PickFileResult>;
  getDataStats(): Promise<DataStats>;
}

export const getDataExport = (): DataExportPlugin | null => {
  if (!isCapacitor) return null;
  const Capacitor = (window as any).Capacitor;
  return Capacitor?.Plugins?.DataExport || null;
};
