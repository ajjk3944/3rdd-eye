import { registerPlugin } from '@capacitor/core';

export interface DeviceInfo {
  ipAddress: string;
  macAddress: string;
  hostname: string;
  deviceName: string;
  isOnline: boolean;
  isRouter: boolean;
  isThisDevice: boolean;
  lastSeen: number;
}

export interface ScanResult {
  status: string;
  deviceCount: number;
  devices: DeviceInfo[];
}

export interface NetworkDeviceDiscoveryPlugin {
  /**
   * Open the native device scanner activity
   */
  openDeviceScanner(): Promise<void>;

  /**
   * Open router admin in WebView
   */
  openRouterAdmin(options: { url: string }): Promise<void>;

  /**
   * Open router passwords database
   */
  openRouterPasswords(): Promise<void>;

  /**
   * Get the last scanned devices
   */
  getScannedDevices(): Promise<ScanResult>;

  /**
   * Start scanning for network devices
   */
  startScan(): Promise<ScanResult>;

  /**
   * Stop the current scan
   */
  stopScan(): Promise<void>;

  /**
   * Add listener for scan events
   */
  addListener(
    eventName: 'scanStarted' | 'deviceFound' | 'scanProgress',
    listenerFunc: (data: any) => void
  ): Promise<any>;
}

const NetworkDeviceDiscovery = registerPlugin<NetworkDeviceDiscoveryPlugin>(
  'NetworkDeviceDiscovery',  // Must match Java @CapacitorPlugin name
  {
    web: () => import('./web').then(m => new m.NetworkDeviceDiscoveryWeb()),
  }
);

export default NetworkDeviceDiscovery;
