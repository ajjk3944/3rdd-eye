import { WebPlugin } from '@capacitor/core';
import type { NetworkDeviceDiscoveryPlugin, ScanResult } from './network-device-discovery';

export class NetworkDeviceDiscoveryWeb extends WebPlugin implements NetworkDeviceDiscoveryPlugin {
  async openDeviceScanner(): Promise<void> {
    console.warn('NetworkDeviceDiscovery: openDeviceScanner is not available on web platform');
    throw this.unavailable('Network device scanning is only available on native platforms');
  }

  async openRouterAdmin(options: { url: string }): Promise<void> {
    console.warn('NetworkDeviceDiscovery: openRouterAdmin is not available on web platform');
    throw this.unavailable('Router admin is only available on native platforms');
  }

  async openRouterPasswords(): Promise<void> {
    console.warn('NetworkDeviceDiscovery: openRouterPasswords is not available on web platform');
    throw this.unavailable('Router passwords is only available on native platforms');
  }

  async getScannedDevices(): Promise<ScanResult> {
    console.warn('NetworkDeviceDiscovery: getScannedDevices is not available on web platform');
    return {
      status: 'unavailable',
      deviceCount: 0,
      devices: []
    };
  }

  async startScan(): Promise<ScanResult> {
    console.warn('NetworkDeviceDiscovery: startScan is not available on web platform');
    throw this.unavailable('Network device scanning is only available on native platforms');
  }

  async stopScan(): Promise<void> {
    console.warn('NetworkDeviceDiscovery: stopScan is not available on web platform');
    throw this.unavailable('Network device scanning is only available on native platforms');
  }
}
