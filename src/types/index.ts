export interface WifiNetwork {
  id: string
  ssid: string
  bssid: string
  signalStrength: number
  channel: number
  frequency: string
  security: string
  riskLevel: 'Secure' | 'Low' | 'Medium' | 'High' | 'Critical'
  lastSeen: Date
  createdAt: Date
}

export interface BluetoothDevice {
  id: string
  name: string | null
  macAddress: string
  signalStrength: number
  deviceType: string
  manufacturer: string | null
  isSuspicious: boolean
  firstSeen: Date
  lastSeen: Date
}

export interface NetworkDevice {
  id: string
  name: string | null
  macAddress: string
  ipAddress: string
  vendor: string | null
  deviceType: string
  isTrusted: boolean
  isOnline: boolean
  firstSeen: Date
  lastSeen: Date
  // Enhanced fields for better device tracking
  signalStrength?: number
  rssiEstimate?: number
  pingMs?: number
  connectionCount?: number
  connectionsToday?: number
  totalOnlineTime?: number
  lastSessionStart?: number
  source?: string
  imei?: string
  hasHttp?: boolean
  hasHttps?: boolean
  hasSsh?: boolean
}

export interface Hotspot {
  id: string
  ssid: string
  location: string
  password: string | null
  hasPassword: boolean
  isVerified: boolean
  signalStrength: number | null
  uploadedBy: string | null
  createdAt: Date
  updatedAt: Date
}

export interface SecurityReport {
  id: string
  name: string
  reportType: string
  status: 'completed' | 'in_progress'
  fileSize: number | null
  networksCount: number
  devicesCount: number
  createdAt: Date
}

export interface ScanHistory {
  id: string
  scanType: string
  itemsFound: number
  timestamp: Date
  duration: number | null
}

export interface UserSettings {
  id: string
  fullName: string | null
  email: string | null
  twoFactorEnabled: boolean
  securityAlerts: boolean
  deviceAlerts: boolean
  scanNotifications: boolean
  createdAt: Date
  updatedAt: Date
}

export interface DashboardStats {
  totalNetworks: number
  connectedDevices: number
  beaconsDetected: number
  securityAlerts: number
  highRiskNetworks: number
  lastScanTime: Date | null
}

export type RiskLevel = 'Secure' | 'Low' | 'Medium' | 'High' | 'Critical'
export type SecurityProtocol = 'Open' | 'WEP' | 'WPA' | 'WPA2' | 'WPA3'
export type ScanType = 'wifi' | 'bluetooth' | 'devices' | 'full'
