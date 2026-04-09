import type { CapacitorConfig } from '@capacitor/cli';

// Development config - for testing with live reload
// Make sure your dev server is running on the network IP
const config: CapacitorConfig = {
  appId: 'app.thirdeye.scanner',
  appName: 'ThirdEye (Dev)',
  webDir: 'out',
  server: {
    url: 'http://YOUR_LOCAL_IP:3000', // Replace with your actual IP (e.g., 192.168.1.100:3000)
    cleartext: true,
    androidScheme: 'http'
  }
};

export default config;
