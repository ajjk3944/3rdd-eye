// API Configuration for Capacitor
// In development: uses localhost
// In production APK: uses the deployed backend URL from env

const getApiUrl = () => {
  // Check if we're in a browser environment
  if (typeof window !== 'undefined') {
    // For Android app, use the configured API URL
    // For web browser, use relative URLs (empty string)
    const isCapacitor = window.location.protocol === 'https:' && 
                        window.location.hostname === 'app.thirdeye.scanner';
    
    if (isCapacitor || process.env.NEXT_PUBLIC_API_URL) {
      return process.env.NEXT_PUBLIC_API_URL || '';
    }
  }
  
  // Default: use relative URLs for web
  return '';
};

export const API_BASE_URL = getApiUrl();
