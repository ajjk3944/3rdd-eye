import type { CapacitorConfig } from '@capacitor/cli';

// Production config - for building APK with bundled assets
const config: CapacitorConfig = {
  appId: 'app.thirdeye.scanner',
  appName: 'ThirdEye',
  webDir: 'out',
  server: {
    androidScheme: 'https',
    hostname: 'app.thirdeye.scanner',
    allowNavigation: []
  }
};

export default config;
