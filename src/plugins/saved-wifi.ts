import { registerPlugin } from '@capacitor/core';

export interface SavedWifiNetwork {
  ssid: string;
  password: string;
  bssid: string;
  source: 'system' | 'app_database';
  savedAt: number;
  lastConnected?: number;
  showPassword?: boolean;
}

export interface SavedWifiResult {
  networks: SavedWifiNetwork[];
  currentWifi: {
    ssid: string;
    bssid: string;
    password: string;
    rssi: number;
    linkSpeed: number;
  } | null;
  isRooted: boolean;
  source: 'root' | 'database';
  count: number;
}

export interface SavedWifiPlugin {
  getSavedWifiPasswords(): Promise<SavedWifiResult>;
  saveWifiPassword(options: { ssid: string; password: string; bssid?: string }): Promise<void>;
  deleteWifiPassword(options: { ssid: string }): Promise<void>;
}

const SavedWifi = registerPlugin<SavedWifiPlugin>('SavedWifi');
export default SavedWifi;
