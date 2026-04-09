// Regional WiFi frequency band information

export interface WifiBand {
  band: string;
  channels: string;
  maxPower: string;
  status: 'Allowed' | 'Not Allowed' | 'Partial';
}

export interface RegionalWifiInfo {
  country: string;
  bands: WifiBand[];
  notes: string;
  regulator: string;
}

export const REGIONAL_WIFI_DATA: Record<string, RegionalWifiInfo> = {
  'BD': {
    country: 'Bangladesh',
    bands: [
      { band: '2.4 GHz', channels: '1-13', maxPower: '20 dBm (100 mW)', status: 'Allowed' },
      { band: '5 GHz', channels: '36-48, 149-165', maxPower: '23 dBm (200 mW)', status: 'Allowed' },
      { band: '6 GHz', channels: 'Not Available', maxPower: '-', status: 'Not Allowed' },
    ],
    notes: 'WiFi 6E (6 GHz) is not yet approved. DFS channels may require dynamic frequency selection.',
    regulator: 'BTRC (Bangladesh Telecommunication Regulatory Commission)',
  },
  'IN': {
    country: 'India',
    bands: [
      { band: '2.4 GHz', channels: '1-13', maxPower: '20 dBm (100 mW)', status: 'Allowed' },
      { band: '5 GHz', channels: '36-48, 52-64, 100-140, 149-165', maxPower: '23 dBm (200 mW)', status: 'Allowed' },
      { band: '6 GHz', channels: '1-93 (Low Power Indoor)', maxPower: '24 dBm', status: 'Allowed' },
    ],
    notes: 'WiFi 6E approved in 2024. 5 GHz DFS channels require radar detection.',
    regulator: 'DoT (Department of Telecommunications)',
  },
  'US': {
    country: 'United States',
    bands: [
      { band: '2.4 GHz', channels: '1-11', maxPower: '30 dBm (1000 mW)', status: 'Allowed' },
      { band: '5 GHz', channels: '36-48, 52-64, 100-144, 149-165', maxPower: '30 dBm (1000 mW)', status: 'Allowed' },
      { band: '6 GHz', channels: '1-233', maxPower: '30 dBm', status: 'Allowed' },
    ],
    notes: 'Full WiFi 6E and WiFi 7 support. Highest allowed power levels globally.',
    regulator: 'FCC (Federal Communications Commission)',
  },
  'GB': {
    country: 'United Kingdom',
    bands: [
      { band: '2.4 GHz', channels: '1-13', maxPower: '20 dBm (100 mW)', status: 'Allowed' },
      { band: '5 GHz', channels: '36-48, 52-64, 100-140', maxPower: '23 dBm (200 mW)', status: 'Allowed' },
      { band: '6 GHz', channels: '1-93 (Low Power Indoor)', maxPower: '23 dBm', status: 'Allowed' },
    ],
    notes: 'WiFi 6E limited to lower 6 GHz band. Outdoor use restricted.',
    regulator: 'Ofcom',
  },
  'DE': {
    country: 'Germany',
    bands: [
      { band: '2.4 GHz', channels: '1-13', maxPower: '20 dBm (100 mW)', status: 'Allowed' },
      { band: '5 GHz', channels: '36-48, 52-64, 100-140', maxPower: '23 dBm (200 mW)', status: 'Allowed' },
      { band: '6 GHz', channels: '1-93 (Low Power Indoor)', maxPower: '23 dBm', status: 'Allowed' },
    ],
    notes: 'EU regulations apply. WiFi 6E for indoor low-power use.',
    regulator: 'BNetzA (Bundesnetzagentur)',
  },
  'BR': {
    country: 'Brazil',
    bands: [
      { band: '2.4 GHz', channels: '1-13', maxPower: '20 dBm (100 mW)', status: 'Allowed' },
      { band: '5 GHz', channels: '36-48, 52-64, 100-140, 149-165', maxPower: '23 dBm (200 mW)', status: 'Allowed' },
      { band: '6 GHz', channels: '1-233', maxPower: '30 dBm', status: 'Allowed' },
    ],
    notes: 'Full 6 GHz band opened in 2021. One of the most WiFi-friendly regulations globally.',
    regulator: 'Anatel',
  },
  'SA': {
    country: 'Saudi Arabia',
    bands: [
      { band: '2.4 GHz', channels: '1-13', maxPower: '20 dBm (100 mW)', status: 'Allowed' },
      { band: '5 GHz', channels: '36-48, 149-165', maxPower: '23 dBm (200 mW)', status: 'Allowed' },
      { band: '6 GHz', channels: 'Limited', maxPower: '-', status: 'Partial' },
    ],
    notes: 'DFS channels may not be available. 6 GHz partially approved.',
    regulator: 'CITC',
  },
  'FR': {
    country: 'France',
    bands: [
      { band: '2.4 GHz', channels: '1-13', maxPower: '20 dBm (100 mW)', status: 'Allowed' },
      { band: '5 GHz', channels: '36-48, 52-64, 100-140', maxPower: '23 dBm (200 mW)', status: 'Allowed' },
      { band: '6 GHz', channels: '1-93 (Low Power Indoor)', maxPower: '23 dBm', status: 'Allowed' },
    ],
    notes: 'EU harmonized regulations. WiFi 6E indoor use approved.',
    regulator: 'ARCEP',
  },
  'ES': {
    country: 'Spain',
    bands: [
      { band: '2.4 GHz', channels: '1-13', maxPower: '20 dBm (100 mW)', status: 'Allowed' },
      { band: '5 GHz', channels: '36-48, 52-64, 100-140', maxPower: '23 dBm (200 mW)', status: 'Allowed' },
      { band: '6 GHz', channels: '1-93 (Low Power Indoor)', maxPower: '23 dBm', status: 'Allowed' },
    ],
    notes: 'EU regulations apply. WiFi 6E for indoor use.',
    regulator: 'CNMC',
  },
  'CA': {
    country: 'Canada',
    bands: [
      { band: '2.4 GHz', channels: '1-11', maxPower: '30 dBm (1000 mW)', status: 'Allowed' },
      { band: '5 GHz', channels: '36-48, 52-64, 100-144, 149-165', maxPower: '30 dBm (1000 mW)', status: 'Allowed' },
      { band: '6 GHz', channels: '1-233', maxPower: '30 dBm', status: 'Allowed' },
    ],
    notes: 'Similar to US regulations. Full WiFi 6E support.',
    regulator: 'ISED (Innovation, Science and Economic Development Canada)',
  },
  'AU': {
    country: 'Australia',
    bands: [
      { band: '2.4 GHz', channels: '1-13', maxPower: '20 dBm (100 mW)', status: 'Allowed' },
      { band: '5 GHz', channels: '36-48, 52-64, 100-140, 149-165', maxPower: '30 dBm (1000 mW)', status: 'Allowed' },
      { band: '6 GHz', channels: '1-233', maxPower: '30 dBm', status: 'Allowed' },
    ],
    notes: 'Full 6 GHz band approved. High power limits for 5 GHz.',
    regulator: 'ACMA (Australian Communications and Media Authority)',
  },
  'JP': {
    country: 'Japan',
    bands: [
      { band: '2.4 GHz', channels: '1-13', maxPower: '20 dBm (100 mW)', status: 'Allowed' },
      { band: '5 GHz', channels: '36-48, 52-64, 100-140', maxPower: '20 dBm (100 mW)', status: 'Allowed' },
      { band: '6 GHz', channels: 'Not Available', maxPower: '-', status: 'Not Allowed' },
    ],
    notes: 'WiFi 6E not yet approved. Strict DFS requirements for 5 GHz.',
    regulator: 'MIC (Ministry of Internal Affairs and Communications)',
  },
  'CN': {
    country: 'China',
    bands: [
      { band: '2.4 GHz', channels: '1-13', maxPower: '20 dBm (100 mW)', status: 'Allowed' },
      { band: '5 GHz', channels: '36-48, 149-165', maxPower: '23 dBm (200 mW)', status: 'Allowed' },
      { band: '6 GHz', channels: 'Limited', maxPower: '-', status: 'Partial' },
    ],
    notes: 'Limited 5 GHz channels. 6 GHz under consideration.',
    regulator: 'MIIT (Ministry of Industry and Information Technology)',
  },
  'KR': {
    country: 'South Korea',
    bands: [
      { band: '2.4 GHz', channels: '1-13', maxPower: '20 dBm (100 mW)', status: 'Allowed' },
      { band: '5 GHz', channels: '36-48, 52-64, 100-140, 149-165', maxPower: '23 dBm (200 mW)', status: 'Allowed' },
      { band: '6 GHz', channels: '1-93 (Low Power Indoor)', maxPower: '24 dBm', status: 'Allowed' },
    ],
    notes: 'WiFi 6E approved. Advanced wireless infrastructure.',
    regulator: 'MSIT (Ministry of Science and ICT)',
  },
  'SG': {
    country: 'Singapore',
    bands: [
      { band: '2.4 GHz', channels: '1-13', maxPower: '20 dBm (100 mW)', status: 'Allowed' },
      { band: '5 GHz', channels: '36-48, 52-64, 100-140, 149-165', maxPower: '23 dBm (200 mW)', status: 'Allowed' },
      { band: '6 GHz', channels: '1-233', maxPower: '24 dBm', status: 'Allowed' },
    ],
    notes: 'Full WiFi 6E support. Progressive wireless regulations.',
    regulator: 'IMDA (Infocomm Media Development Authority)',
  },
};

// Helper function to detect country from locale
export function detectCountryFromLocale(): string | null {
  if (typeof navigator === 'undefined') return null;
  
  const locale = navigator.language || (navigator as any).userLanguage;
  if (!locale) return null;
  
  // Extract country code from locale (e.g., "en-US" -> "US", "bn-BD" -> "BD")
  const parts = locale.split('-');
  if (parts.length > 1) {
    return parts[1].toUpperCase();
  }
  
  // Map language codes to likely countries
  const languageToCountry: Record<string, string> = {
    'en': 'US',
    'bn': 'BD',
    'hi': 'IN',
    'es': 'ES',
    'fr': 'FR',
    'de': 'DE',
    'ar': 'SA',
    'pt': 'BR',
    'ja': 'JP',
    'zh': 'CN',
    'ko': 'KR',
  };
  
  const langCode = parts[0].toLowerCase();
  return languageToCountry[langCode] || null;
}

// Get list of all countries
export function getAvailableCountries(): Array<{ code: string; name: string }> {
  return Object.entries(REGIONAL_WIFI_DATA).map(([code, info]) => ({
    code,
    name: info.country,
  }));
}
