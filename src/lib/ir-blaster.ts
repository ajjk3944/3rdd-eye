// IR Blaster Plugin Interface for Capacitor

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

// Check if running in Capacitor
const isCapacitor = typeof window !== 'undefined' && 
  (window as any).Capacitor !== undefined;

// Get the plugin from Capacitor
export const getIRBlaster = (): IRBlasterPlugin | null => {
  if (!isCapacitor) return null;
  const Capacitor = (window as any).Capacitor;
  if (Capacitor?.Plugins?.IRBlaster) {
    return Capacitor.Plugins.IRBlaster as IRBlasterPlugin;
  }
  return null;
};

// Device types for IR remote
export type DeviceType = 
  | 'tv' 
  | 'ac' 
  | 'fan' 
  | 'set-top-box' 
  | 'dvd' 
  | 'projector' 
  | 'smart-box'
  | 'av-receiver'
  | 'camera';

export interface DeviceCategory {
  id: DeviceType;
  name: string;
  icon: string;
  brands: string[];
}

export const deviceCategories: DeviceCategory[] = [
  { id: 'tv', name: 'TV', icon: 'tv', brands: ['Samsung', 'LG', 'Sony', 'TCL', 'Hisense', 'Xiaomi', 'Panasonic', 'Philips', 'Toshiba', 'Sharp'] },
  { id: 'ac', name: 'AC', icon: 'thermometer', brands: ['Gree', 'Midea', 'Daikin', 'LG', 'Samsung', 'Carrier', 'Haier', 'Voltas', 'Blue Star', 'Hitachi'] },
  { id: 'fan', name: 'Fan', icon: 'fan', brands: ['Havells', 'Crompton', 'Orient', 'Usha', 'Bajaj', 'Atomberg', 'Symphony'] },
  { id: 'set-top-box', name: 'Set-top Box', icon: 'box', brands: ['Airtel', 'Tata Sky', 'Dish TV', 'Videocon', 'Sun Direct', 'Hathway'] },
  { id: 'dvd', name: 'DVD Player', icon: 'disc', brands: ['Sony', 'Samsung', 'LG', 'Philips', 'Panasonic'] },
  { id: 'projector', name: 'Projector', icon: 'projector', brands: ['Epson', 'BenQ', 'Optoma', 'ViewSonic', 'Casio', 'Sony', 'LG'] },
  { id: 'smart-box', name: 'Smart Box', icon: 'cast', brands: ['Mi Box', 'Fire TV', 'Apple TV', 'Roku', 'Chromecast'] },
  { id: 'av-receiver', name: 'A/V Receiver', icon: 'speaker', brands: ['Yamaha', 'Denon', 'Sony', 'Onkyo', 'Pioneer'] },
  { id: 'camera', name: 'Camera', icon: 'camera', brands: ['Canon', 'Nikon', 'Sony', 'Fujifilm', 'Panasonic'] },
];

// IR Code interface
export interface IRCode {
  name: string;
  frequency: number;
  pattern: number[];
}

export interface RemoteButton {
  id: string;
  label: string;
  icon?: string;
  code: IRCode;
  gridArea?: string;
}

export interface RemoteLayout {
  deviceType: DeviceType;
  brand: string;
  model?: string;
  buttons: RemoteButton[];
}

// Common IR frequencies
export const IR_FREQUENCIES = {
  STANDARD: 38000,  // Most common (38 kHz)
  NEC: 38000,
  RC5: 36000,
  RC6: 36000,
  SONY: 40000,
  SAMSUNG: 38000,
  LG: 38000,
};
