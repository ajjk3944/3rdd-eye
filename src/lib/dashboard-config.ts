export interface DashboardItem {
  id: string;
  label: string;
  icon: string;
  visible: boolean;
  order: number;
}

export const DEFAULT_DASHBOARD_ITEMS: DashboardItem[] = [
  { id: 'networks', label: 'Networks', icon: 'wifi', visible: true, order: 0 },
  { id: 'bluetooth', label: 'Bluetooth', icon: 'bluetooth', visible: true, order: 1 },
  { id: 'ir-remote', label: 'IR Remote', icon: 'tv', visible: true, order: 2 },
  { id: 'wifi-map', label: 'WiFi Map', icon: 'map', visible: true, order: 3 },
  { id: 'camera-detector', label: 'Camera Detector', icon: 'camera', visible: true, order: 4 },
  { id: 'iot-devices', label: 'IoT Devices', icon: 'cpu', visible: true, order: 5 },
  { id: 'traffic', label: 'Traffic', icon: 'activity', visible: true, order: 6 },
  { id: 'tools', label: 'Tools', icon: 'terminal', visible: true, order: 7 },
  { id: 'devinfo', label: 'DevInfo', icon: 'info', visible: true, order: 8 },
  { id: 'use-cases', label: 'Use Cases', icon: 'file-text', visible: true, order: 9 },
];

const STORAGE_KEY = 'thirdeye_dashboard_layout';

export function getDashboardLayout(): DashboardItem[] {
  try {
    if (typeof window !== 'undefined') {
      const saved = localStorage.getItem(STORAGE_KEY);
      if (saved) {
        return JSON.parse(saved);
      }
    }
  } catch (error) {
    console.error('Error loading dashboard layout:', error);
  }
  return DEFAULT_DASHBOARD_ITEMS;
}

export function saveDashboardLayout(items: DashboardItem[]): void {
  try {
    if (typeof window !== 'undefined') {
      localStorage.setItem(STORAGE_KEY, JSON.stringify(items));
    }
  } catch (error) {
    console.error('Error saving dashboard layout:', error);
  }
}

export function resetDashboardLayout(): void {
  try {
    if (typeof window !== 'undefined') {
      localStorage.removeItem(STORAGE_KEY);
    }
  } catch (error) {
    console.error('Error resetting dashboard layout:', error);
  }
}
