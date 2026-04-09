/**
 * TypeScript interface for DeviceInfo Capacitor Plugin
 * 
 * This provides type-safe access to native Android device information
 * with ZERO WebView overhead for data collection.
 */

import { registerPlugin } from '@capacitor/core'

export interface DeviceInfoPlugin {
  /**
   * Get comprehensive device dashboard
   * Returns: device name, manufacturer, memory, storage, battery, CPU
   */
  getDashboard(): Promise<DashboardInfo>

  /**
   * Get detailed system information
   * Returns: Android version, build info, hardware details
   */
  getSystemInfo(): Promise<SystemInfo>

  /**
   * Get CPU information
   * Returns: cores, architecture, supported ABIs
   */
  getCPUInfo(): Promise<CPUInfo>

  /**
   * Get battery information
   * Returns: level, charging status, health, temperature
   */
  getBatteryInfo(): Promise<BatteryInfo>

  /**
   * Get storage information
   * Returns: internal/external storage total, free, used
   */
  getStorageInfo(): Promise<StorageInfo>

  /**
   * Get display information
   * Returns: resolution, density, refresh rate
   */
  getDisplayInfo(): Promise<DisplayInfo>

  /**
   * Get all available sensors
   * Returns: list of all device sensors with details
   */
  getSensors(): Promise<SensorsInfo>

  /**
   * Get location/GPS information
   * Returns: GPS status, available providers
   */
  getLocationInfo(): Promise<LocationInfo>

  /**
   * Get camera information
   * Returns: camera specs, megapixels, features
   */
  getCameraInfo(): Promise<CameraInfo>

  /**
   * Get temperature information
   * Returns: battery temp, ambient temp sensors
   */
  getTemperatureInfo(): Promise<TemperatureInfo>

  /**
   * Get installed apps
   * Returns: list of all installed apps (system + user)
   */
  getInstalledApps(): Promise<AppsInfo>

  /**
   * Uninstall an app (opens system dialog)
   */
  uninstallApp(options: { packageName: string }): Promise<void>

  /**
   * Open app info settings
   */
  openAppInfo(options: { packageName: string }): Promise<void>

  /**
   * Get SIM card and cellular network information
   * Returns: SIM slots, operator, signal strength, cell info
   */
  getSimInfo(): Promise<SimInfo>
}

// Type definitions

export interface DashboardInfo {
  deviceName: string
  manufacturer: string
  brand: string
  androidVersion: string
  sdkVersion: number
  memory: {
    totalRAM: number
    availableRAM: number
    usedRAM: number
    threshold: number
    lowMemory: boolean
  }
  storage: StorageInfo
  battery: BatteryInfo
  cpu: CPUInfo
}

export interface SystemInfo {
  manufacturer: string
  brand: string
  model: string
  device: string
  product: string
  hardware: string
  board: string
  bootloader: string
  fingerprint: string
  host: string
  id: string
  tags: string
  type: string
  user: string
  androidVersion: string
  sdkVersion: number
  codename: string
  incremental: string
  securityPatch: string
  androidId: string
}

export interface CPUInfo {
  abi: string
  cores: number
  hardware: string
  supportedAbis: string[]
}

export interface BatteryInfo {
  level: number
  isCharging: boolean
  health: number
  temperature: number
  voltage: number
  technology: string
}

export interface StorageInfo {
  internal: {
    total: number
    free: number
    used: number
  }
  external?: {
    total: number
    free: number
    used: number
  }
}

export interface DisplayInfo {
  widthPixels: number
  heightPixels: number
  densityDpi: number
  density: number
  scaledDensity: number
  xdpi: number
  ydpi: number
  refreshRate: number
}

export interface SensorInfo {
  name: string
  type: number
  vendor: string
  version: number
  power: number
  resolution: number
  maxRange: number
  fifoMaxEventCount?: number
  fifoReservedEventCount?: number
}

export interface SensorsInfo {
  sensors: SensorInfo[]
  count: number
}

export interface LocationInfo {
  gpsEnabled: boolean
  networkEnabled: boolean
  providers: string[]
  latitude?: number
  longitude?: number
  altitude?: number
  speed?: number
  accuracy?: number
  bearing?: number
  satelliteCount?: number
  satellites?: SatelliteInfo[]
}

export interface SatelliteInfo {
  system: string
  count: number
  flag?: string
}

export interface CameraSpec {
  id: string
  facing: string
  megapixels: string
  maxResolution: string
  hasFlash: boolean
  focalLength?: string
  aperture?: string
  sensorSize?: string
  hardwareLevel?: string
}

export interface CameraInfo {
  cameras: CameraSpec[]
  count: number
}

export interface TemperatureInfo {
  battery: number
  hasAmbientSensor: boolean
  ambientSensorName?: string
  hasDeviceSensor: boolean
  deviceSensorName?: string
}

export interface AppInfo {
  packageName: string
  appName: string
  versionName: string
  versionCode: number
  installedDate: string
  updatedDate: string
  size: number
  isSystemApp: boolean
  sourceDir?: string
}

export interface AppsInfo {
  systemApps: AppInfo[]
  userApps: AppInfo[]
  systemCount: number
  userCount: number
  totalCount: number
}

export interface SimSlotInfo {
  slotIndex: number
  isActive: boolean
  operatorName: string | null
  operatorCode: string | null
  countryCode: string | null
  countryIso: string | null
  networkType: string | null
  simState: string | null
  phoneNumber: string | null
  imei: string | null
  iccid: string | null
  isRoaming: boolean
  dataEnabled: boolean
  signalStrength: number
  signalDbm: number
  signalAsu: number
  signalLevel: number
  signalHistory: number[]
  servingCell: CellInfo | null
  neighboringCells: CellInfo[]
  towerDistance: number | null
  towerDirection: number | null
}

export interface CellInfo {
  cellId: string
  mcc: number
  mnc: number
  lac: number | null
  tac: number | null
  pci: number | null
  earfcn: number | null
  bandwidth: number | null
  signalDbm: number
  rsrp: number | null
  rsrq: number | null
  rssi: number | null
  rssnr: number | null
}

export interface NetworkStats {
  operator: string
  downloadSpeed: number
  uploadSpeed: number
  latency: number
  signalQuality: number
  color: string
}

export interface SimInfo {
  hasSimCard: boolean
  simCount: number
  simSlots: SimSlotInfo[]
  networkStats: NetworkStats[]
}

// Register the plugin
const DeviceInfo = registerPlugin<DeviceInfoPlugin>('DeviceInfo', {
  web: () => import('./device-info-plugin-web').then(m => new m.DeviceInfoWeb()),
})

export default DeviceInfo

// Helper functions for formatting

export function formatBytes(bytes: number): string {
  if (bytes === 0) return '0 B'
  const k = 1024
  const sizes = ['B', 'KB', 'MB', 'GB', 'TB']
  const i = Math.floor(Math.log(bytes) / Math.log(k))
  return Math.round((bytes / Math.pow(k, i)) * 100) / 100 + ' ' + sizes[i]
}

export function formatPercentage(used: number, total: number): number {
  return Math.round((used / total) * 100)
}

export function getBatteryHealthText(health: number): string {
  const healthMap: { [key: number]: string } = {
    1: 'Unknown',
    2: 'Good',
    3: 'Overheat',
    4: 'Dead',
    5: 'Over Voltage',
    6: 'Unspecified Failure',
    7: 'Cold',
  }
  return healthMap[health] || 'Unknown'
}

export function getSensorTypeName(type: number): string {
  const sensorTypes: { [key: number]: string } = {
    1: 'Accelerometer',
    2: 'Magnetic Field',
    3: 'Orientation',
    4: 'Gyroscope',
    5: 'Light',
    6: 'Pressure',
    7: 'Temperature',
    8: 'Proximity',
    9: 'Gravity',
    10: 'Linear Acceleration',
    11: 'Rotation Vector',
    12: 'Relative Humidity',
    13: 'Ambient Temperature',
    14: 'Magnetic Field Uncalibrated',
    15: 'Game Rotation Vector',
    16: 'Gyroscope Uncalibrated',
    17: 'Significant Motion',
    18: 'Step Detector',
    19: 'Step Counter',
    20: 'Geomagnetic Rotation Vector',
    21: 'Heart Rate',
    22: 'Tilt Detector',
    23: 'Wake Gesture',
    24: 'Glance Gesture',
    25: 'Pick Up Gesture',
    26: 'Wrist Tilt Gesture',
    27: 'Device Orientation',
    28: 'Pose 6DOF',
    29: 'Stationary Detect',
    30: 'Motion Detect',
    31: 'Heart Beat',
    32: 'Low Latency Offbody Detect',
    33: 'Accelerometer Uncalibrated',
    34: 'Hinge Angle',
  }
  return sensorTypes[type] || `Sensor Type ${type}`
}
