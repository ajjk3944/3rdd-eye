package app.thirdeye.scanner.eviltwin;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import java.util.ArrayList;
import java.util.List;

public class WiFiScanAnalyzer {
    private Context context;
    private WifiManager wifiManager;
    private ConnectivityManager connectivityManager;

    public WiFiScanAnalyzer(Context context) {
        this.context = context;
        this.wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        this.connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
    }

    public WiFiAnalysisResult analyzeSurroundingNetworks(String currentSSID, String currentBSSID) {
        WiFiAnalysisResult result = new WiFiAnalysisResult();
        result.currentSSID = currentSSID;
        result.currentBSSID = currentBSSID;
        result.duplicates = new ArrayList<>();

        // Trigger WiFi scan (throttled on Android 9+)
        wifiManager.startScan();

        // Get scan results
        List<ScanResult> scanResults = wifiManager.getScanResults();
        if (scanResults == null) {
            return result;
        }

        String currentSecurity = null;
        int currentSignal = 0;

        // Find current AP info
        for (ScanResult sr : scanResults) {
            if (sr.BSSID.equalsIgnoreCase(currentBSSID)) {
                currentSecurity = parseSecurityType(sr.capabilities);
                currentSignal = sr.level;
                result.currentAPInfo = new APInfo(sr.BSSID, sr.level, currentSecurity, 
                    sr.frequency, getChannelFromFrequency(sr.frequency), extractVendorOUI(sr.BSSID));
                break;
            }
        }

        // Analyze for duplicates
        for (ScanResult sr : scanResults) {
            String scannedSSID = sr.SSID;
            if (scannedSSID == null || scannedSSID.isEmpty()) {
                continue;
            }

            // Check if same SSID but different BSSID
            if (scannedSSID.equals(currentSSID) && !sr.BSSID.equalsIgnoreCase(currentBSSID)) {
                String security = parseSecurityType(sr.capabilities);
                String duplicateVendor = extractVendorOUI(sr.BSSID);
                String currentVendor = result.currentAPInfo != null ? result.currentAPInfo.vendorOUI : extractVendorOUI(currentBSSID);
                
                // Check if different frequency bands
                int currentFreq = result.currentAPInfo != null ? result.currentAPInfo.frequency : 0;
                boolean sameBand = isSameFrequencyBand(currentFreq, sr.frequency);
                
                // Skip if different band but same vendor (normal dual-band router)
                if (!sameBand && currentVendor.equals(duplicateVendor)) {
                    continue; // Normal dual-band, not evil twin
                }
                
                // Skip if different band (mesh/repeater networks)
                if (!sameBand) {
                    continue; // Different bands are almost never evil twins
                }
                
                // Only count as suspicious duplicate if:
                // - Same frequency band (attacker must mimic exact channel)
                // - AND different vendor OR security downgrade
                boolean suspiciousDuplicate = sameBand && (
                    !currentVendor.equals(duplicateVendor) || 
                    isSecurityDowngrade(currentSecurity, security)
                );
                
                if (suspiciousDuplicate) {
                    DuplicateAP duplicate = new DuplicateAP(
                        sr.BSSID,
                        sr.level,
                        security,
                        sr.frequency,
                        getChannelFromFrequency(sr.frequency),
                        duplicateVendor
                    );
                    result.duplicates.add(duplicate);

                    // Check for security downgrade
                    if (currentSecurity != null && isSecurityDowngrade(currentSecurity, security)) {
                        result.securityDowngrade = true;
                    }

                    // Check for signal anomaly (abnormally strong signal > -30 dBm)
                    if (sr.level > -30) {
                        result.signalAnomaly = true;
                    }
                }
            }
        }

        result.duplicateCount = result.duplicates.size();
        return result;
    }

    private String parseSecurityType(String capabilities) {
        if (capabilities == null) {
            return "Open";
        }
        if (capabilities.contains("WPA3")) {
            return "WPA3";
        } else if (capabilities.contains("WPA2")) {
            return "WPA2";
        } else if (capabilities.contains("WPA")) {
            return "WPA";
        } else if (capabilities.contains("WEP")) {
            return "WEP";
        } else {
            return "Open";
        }
    }

    private boolean isSecurityDowngrade(String currentSecurity, String duplicateSecurity) {
        int currentLevel = getSecurityLevel(currentSecurity);
        int duplicateLevel = getSecurityLevel(duplicateSecurity);
        return duplicateLevel < currentLevel;
    }

    private int getSecurityLevel(String security) {
        switch (security) {
            case "WPA3": return 5;
            case "WPA2": return 4;
            case "WPA": return 3;
            case "WEP": return 2;
            case "Open": return 1;
            default: return 0;
        }
    }

    private String extractVendorOUI(String bssid) {
        if (bssid == null || bssid.length() < 8) {
            return "unknown";
        }
        return bssid.substring(0, 8).toUpperCase();
    }

    private int getChannelFromFrequency(int frequency) {
        if (frequency >= 2412 && frequency <= 2484) {
            return (frequency - 2412) / 5 + 1;
        } else if (frequency >= 5170 && frequency <= 5825) {
            return (frequency - 5170) / 5 + 34;
        }
        return 0;
    }

    private boolean isSameFrequencyBand(int freq1, int freq2) {
        boolean is24GHz1 = freq1 >= 2400 && freq1 <= 2500;
        boolean is24GHz2 = freq2 >= 2400 && freq2 <= 2500;
        return is24GHz1 == is24GHz2; // both 2.4 or both 5GHz
    }

    // Result classes
    public static class WiFiAnalysisResult {
        public String currentSSID;
        public String currentBSSID;
        public int duplicateCount;
        public List<DuplicateAP> duplicates;
        public boolean securityDowngrade;
        public boolean signalAnomaly;
        public APInfo currentAPInfo;
    }

    public static class DuplicateAP {
        public String bssid;
        public int signalLevel;
        public String security;
        public int frequency;
        public int channel;
        public String vendorOUI;

        public DuplicateAP(String bssid, int signalLevel, String security, 
                          int frequency, int channel, String vendorOUI) {
            this.bssid = bssid;
            this.signalLevel = signalLevel;
            this.security = security;
            this.frequency = frequency;
            this.channel = channel;
            this.vendorOUI = vendorOUI;
        }
    }

    public static class APInfo {
        public String bssid;
        public int signalLevel;
        public String security;
        public int frequency;
        public int channel;
        public String vendorOUI;

        public APInfo(String bssid, int signalLevel, String security, 
                     int frequency, int channel, String vendorOUI) {
            this.bssid = bssid;
            this.signalLevel = signalLevel;
            this.security = security;
            this.frequency = frequency;
            this.channel = channel;
            this.vendorOUI = vendorOUI;
        }
    }
}
