package app.thirdeye.scanner.routerguard;

import android.content.Context;
import android.util.Log;

import com.getcapacitor.JSObject;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ThreatDetector {
    private static final String TAG = "ThreatDetector";
    private static ThreatDetector instance;
    
    // Threat levels
    public static final int THREAT_NONE = 0;
    public static final int THREAT_LOW = 1;
    public static final int THREAT_MEDIUM = 2;
    public static final int THREAT_HIGH = 3;
    public static final int THREAT_CRITICAL = 4;
    
    private DeviceHistoryDatabase deviceDb;
    private Context context;
    
    public static synchronized ThreatDetector getInstance(Context context) {
        if (instance == null) {
            instance = new ThreatDetector(context);
        }
        return instance;
    }
    
    private ThreatDetector(Context context) {
        this.context = context.getApplicationContext();
        this.deviceDb = DeviceHistoryDatabase.getInstance(context);
    }
    
    // Inner classes
    public static class ThreatReport {
        public String macAddress;
        public String deviceName;
        public int overallThreatLevel;
        public int threatScore;
        public List<ThreatFinding> findings;
        public String summary;
        public long analyzedAt;
        public boolean isDismissed;
        
        public ThreatReport() {
            findings = new ArrayList<>();
            analyzedAt = System.currentTimeMillis();
            isDismissed = false;
        }
    }
    
    public static class ThreatFinding {
        public String ruleId;
        public String ruleName;
        public String description;
        public int severity;
        public int scoreContribution;
        public String recommendation;
        
        public ThreatFinding(String ruleId, String ruleName, String description, 
                           int severity, int scoreContribution, String recommendation) {
            this.ruleId = ruleId;
            this.ruleName = ruleName;
            this.description = description;
            this.severity = severity;
            this.scoreContribution = scoreContribution;
            this.recommendation = recommendation;
        }
    }
    
    public static class DeviceCategory {
        public String deviceType;
        public double confidence;
        public String reasoning;
        
        public DeviceCategory(String deviceType, double confidence, String reasoning) {
            this.deviceType = deviceType;
            this.confidence = confidence;
            this.reasoning = reasoning;
        }
    }
    
    // Main analysis method
    public ThreatReport analyzeDevice(JSObject device) {
        ThreatReport report = new ThreatReport();
        report.macAddress = device.getString("macAddress");
        report.deviceName = device.getString("customName");
        if (report.deviceName == null || report.deviceName.isEmpty()) {
            report.deviceName = device.getString("deviceName");
        }
        if (report.deviceName == null) report.deviceName = "Unknown";
        
        List<JSObject> sessions = deviceDb.getDeviceSessions(report.macAddress, 50);
        List<JSObject> allDevices = deviceDb.getAllDevices();
        
        // Run all detection rules
        ThreatFinding finding;
        
        finding = checkRandomizedMAC(device);
        if (finding != null) report.findings.add(finding);
        
        finding = checkUnknownVendor(device);
        if (finding != null) report.findings.add(finding);
        
        finding = checkOddHoursConnection(device);
        if (finding != null) report.findings.add(finding);
        
        finding = checkRapidReconnection(device, sessions);
        if (finding != null) report.findings.add(finding);
        
        finding = checkShortSessions(device, sessions);
        if (finding != null) report.findings.add(finding);
        
        finding = checkIPAnomaly(device);
        if (finding != null) report.findings.add(finding);
        
        finding = checkSuspiciousHostname(device);
        if (finding != null) report.findings.add(finding);
        
        finding = checkVendorMismatch(device);
        if (finding != null) report.findings.add(finding);
        
        finding = checkDuplicateIP(device, allDevices);
        if (finding != null) report.findings.add(finding);
        
        finding = checkProbePattern(device, sessions);
        if (finding != null) report.findings.add(finding);
        
        // Calculate overall score
        report.threatScore = calculateOverallScore(report.findings, device);
        report.overallThreatLevel = scoreToThreatLevel(report.threatScore);
        report.summary = generateSummary(device, report.overallThreatLevel, report.findings);
        
        return report;
    }
    
    public List<ThreatReport> analyzeAllDevices() {
        List<ThreatReport> reports = new ArrayList<>();
        List<JSObject> devices = deviceDb.getOnlineDevices();
        
        for (JSObject device : devices) {
            ThreatReport report = analyzeDevice(device);
            reports.add(report);
        }
        
        // Sort by threat score (highest first)
        reports.sort((a, b) -> Integer.compare(b.threatScore, a.threatScore));
        
        return reports;
    }
    
    // Detection Rules
    
    // Rule 1: Randomized MAC Address
    private ThreatFinding checkRandomizedMAC(JSObject device) {
        String mac = device.getString("macAddress");
        if (mac == null || mac.length() < 2) return null;
        
        // Check if locally administered bit is set (bit 1 of first byte)
        String firstByte = mac.substring(0, 2);
        int value = Integer.parseInt(firstByte, 16);
        
        if ((value & 0x02) != 0) {
            String deviceType = device.getString("deviceType");
            boolean isPhone = "phone".equals(deviceType) || "tablet".equals(deviceType);
            
            int score = isPhone ? 5 : 15;
            int severity = isPhone ? THREAT_NONE : THREAT_LOW;
            
            String description = isPhone 
                ? "This device uses a randomized MAC address. This is standard for modern phones and tablets."
                : "This device uses a randomized MAC address, which is unusual for " + deviceType + " devices.";
            
            return new ThreatFinding(
                "RANDOM_MAC",
                "Randomized MAC Address",
                description,
                severity,
                score,
                isPhone ? "No action needed." : "Verify this device is legitimate."
            );
        }
        
        return null;
    }
    
    // Rule 2: Unknown Vendor
    private ThreatFinding checkUnknownVendor(JSObject device) {
        String vendor = device.getString("vendor");
        
        if ("Unknown".equals(vendor)) {
            return new ThreatFinding(
                "UNKNOWN_VENDOR",
                "Unknown Manufacturer",
                "The manufacturer of this device could not be identified from its MAC address. This could be a cheap IoT device, custom hardware, or someone spoofing their MAC address.",
                THREAT_LOW,
                15,
                "Investigate this device further. Check if you recognize it."
            );
        }
        
        return null;
    }
    
    // Rule 3: Odd Hours Connection
    private ThreatFinding checkOddHoursConnection(JSObject device) {
        try {
            long firstSeen = device.getLong("firstSeen");
            java.util.Calendar cal = java.util.Calendar.getInstance();
            cal.setTimeInMillis(firstSeen);
            
            int hour = cal.get(java.util.Calendar.HOUR_OF_DAY);
            
            // Between 12 AM and 5 AM
            if (hour >= 0 && hour < 5) {
                // Check if this is a NEW device (first seen within last 24 hours)
                long dayAgo = System.currentTimeMillis() - (24 * 60 * 60 * 1000);
                if (firstSeen > dayAgo) {
                    return new ThreatFinding(
                        "ODD_HOURS",
                        "Connected at Unusual Hours",
                        String.format("This device first connected to your network at %d:%02d AM, which is unusual.", 
                            hour, cal.get(java.util.Calendar.MINUTE)),
                        THREAT_MEDIUM,
                        25,
                        "Verify you recognize this device. Someone may have accessed your WiFi password."
                    );
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "Error checking odd hours connection", e);
        }
        
        return null;
    }
    
    // Rule 4: Rapid Reconnection Pattern
    private ThreatFinding checkRapidReconnection(JSObject device, List<JSObject> sessions) {
        if (sessions.size() < 5) return null;
        
        try {
            // Count sessions in last hour
            long hourAgo = System.currentTimeMillis() - (60 * 60 * 1000);
            int recentSessions = 0;
            
            for (JSObject session : sessions) {
                long connectedAt = session.getLong("connectedAt");
                if (connectedAt > hourAgo) {
                    recentSessions++;
                }
            }
            
            if (recentSessions >= 5) {
                return new ThreatFinding(
                    "RAPID_RECONNECT",
                    "Rapid Reconnection Pattern",
                    String.format("This device has connected and disconnected %d times in the last hour. This could indicate network scanning or a deauth attack.", recentSessions),
                    THREAT_HIGH,
                    35,
                    "Block this device immediately if you don't recognize it."
                );
            }
        } catch (Exception e) {
            Log.e(TAG, "Error checking rapid reconnection", e);
        }
        
        return null;
    }
    
    // Rule 5: Short Session Duration
    private ThreatFinding checkShortSessions(JSObject device, List<JSObject> sessions) {
        if (sessions.size() < 3) return null;
        
        long totalDuration = 0;
        int completedSessions = 0;
        
        for (JSObject session : sessions) {
            Integer duration = session.getInteger("sessionDuration");
            if (duration != null && duration > 0) {
                totalDuration += duration;
                completedSessions++;
            }
        }
        
        if (completedSessions >= 3) {
            long avgDuration = totalDuration / completedSessions;
            
            // Average session less than 2 minutes (120 seconds)
            if (avgDuration < 120) {
                return new ThreatFinding(
                    "SHORT_SESSIONS",
                    "Very Short Connection Sessions",
                    String.format("This device's average session duration is only %d seconds. This suggests it may be probing or scanning your network.", avgDuration),
                    THREAT_MEDIUM,
                    20,
                    "Monitor this device closely. Consider blocking if behavior continues."
                );
            }
        }
        
        return null;
    }
    
    // Rule 6: IP Address Anomaly
    private ThreatFinding checkIPAnomaly(JSObject device) {
        String ipAddress = device.getString("ipAddress");
        if (ipAddress == null || ipAddress.isEmpty()) return null;
        
        // Check if IP is outside typical DHCP range
        // Most routers use .100-.254 for DHCP
        String[] parts = ipAddress.split("\\.");
        if (parts.length == 4) {
            try {
                int lastOctet = Integer.parseInt(parts[3]);
                
                // If IP is in .1-.99 range (typically reserved/static)
                if (lastOctet > 1 && lastOctet < 100) {
                    return new ThreatFinding(
                        "IP_ANOMALY",
                        "Unusual IP Address",
                        String.format("This device has IP address %s which is outside the typical DHCP range. It may be using a manually configured static IP.", ipAddress),
                        THREAT_LOW,
                        15,
                        "Verify this device is authorized to use a static IP."
                    );
                }
            } catch (NumberFormatException e) {
                // Invalid IP format
            }
        }
        
        return null;
    }
    
    // Rule 7: Suspicious Hostname
    private ThreatFinding checkSuspiciousHostname(JSObject device) {
        String hostname = device.getString("deviceName");
        if (hostname == null || hostname.isEmpty()) return null;
        
        String hostnameLower = hostname.toLowerCase();
        
        // Check for known hacking tools/distros
        String[] suspiciousPatterns = {
            "kali", "parrot", "blackarch", "pentoo",
            "aircrack", "wifite", "bettercap", "wireshark",
            "pentest", "hack", "exploit", "attack", "crack",
            "metasploit", "nmap", "burp"
        };
        
        for (String pattern : suspiciousPatterns) {
            if (hostnameLower.contains(pattern)) {
                return new ThreatFinding(
                    "SUSPICIOUS_HOSTNAME",
                    "Suspicious Device Name",
                    String.format("The device hostname '%s' contains patterns associated with hacking tools or penetration testing software.", hostname),
                    THREAT_HIGH,
                    45,
                    "BLOCK THIS DEVICE IMMEDIATELY unless you are running authorized security testing."
                );
            }
        }
        
        // Check for very long random hostnames (> 20 chars, mostly random)
        if (hostname.length() > 20 && !hostname.contains(" ")) {
            // Count alphanumeric vs special chars
            int alphaNum = 0;
            for (char c : hostname.toCharArray()) {
                if (Character.isLetterOrDigit(c)) alphaNum++;
            }
            
            if (alphaNum > 15) {
                return new ThreatFinding(
                    "RANDOM_HOSTNAME",
                    "Random Device Name",
                    "This device has a long, randomly generated hostname which is unusual.",
                    THREAT_LOW,
                    10,
                    "Verify you recognize this device."
                );
            }
        }
        
        return null;
    }
    
    // Rule 8: Vendor Mismatch
    private ThreatFinding checkVendorMismatch(JSObject device) {
        String hostname = device.getString("deviceName");
        String vendor = device.getString("vendor");
        
        if (hostname == null || vendor == null || "Unknown".equals(vendor)) return null;
        
        String hostnameLower = hostname.toLowerCase();
        String vendorLower = vendor.toLowerCase();
        
        // Check for obvious mismatches
        if (hostnameLower.contains("iphone") || hostnameLower.contains("ipad") || hostnameLower.contains("macbook")) {
            if (!vendorLower.contains("apple")) {
                return new ThreatFinding(
                    "VENDOR_MISMATCH",
                    "Device Type Mismatch",
                    String.format("Device claims to be '%s' but MAC address belongs to '%s'. This may indicate MAC address spoofing.", hostname, vendor),
                    THREAT_HIGH,
                    40,
                    "This is highly suspicious. Block this device and investigate."
                );
            }
        }
        
        if (hostnameLower.contains("samsung") || hostnameLower.contains("galaxy")) {
            if (!vendorLower.contains("samsung")) {
                return new ThreatFinding(
                    "VENDOR_MISMATCH",
                    "Device Type Mismatch",
                    String.format("Device claims to be '%s' but MAC address belongs to '%s'.", hostname, vendor),
                    THREAT_HIGH,
                    40,
                    "Possible MAC spoofing detected. Block this device."
                );
            }
        }
        
        return null;
    }
    
    // Rule 9: Duplicate IP Detection
    private ThreatFinding checkDuplicateIP(JSObject device, List<JSObject> allDevices) {
        String ipAddress = device.getString("ipAddress");
        String macAddress = device.getString("macAddress");
        
        if (ipAddress == null || ipAddress.isEmpty()) return null;
        
        try {
            // Check if any other ONLINE device has the same IP
            for (JSObject other : allDevices) {
                if (!other.getBoolean("isOnline")) continue;
                
                String otherMac = other.getString("macAddress");
                String otherIp = other.getString("ipAddress");
                
                if (!macAddress.equals(otherMac) && ipAddress.equals(otherIp)) {
                    return new ThreatFinding(
                        "DUPLICATE_IP",
                        "Duplicate IP Address Detected",
                        String.format("Two devices are using the same IP address (%s). This is a strong indicator of ARP spoofing or Man-in-the-Middle attack.", ipAddress),
                        THREAT_CRITICAL,
                        50,
                        "CRITICAL: Disconnect from WiFi immediately. This is likely an active attack."
                    );
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "Error checking duplicate IP", e);
        }
        
        return null;
    }
    
    // Rule 10: Device Count Anomaly (checked at network level, not per-device)
    public ThreatFinding checkDeviceCountAnomaly(int currentCount) {
        // Get average device count from last 7 days
        ThreatDatabase threatDb = ThreatDatabase.getInstance(context);
        int avgCount = threatDb.getAverageDeviceCount(7);
        
        if (avgCount > 0 && currentCount > avgCount * 1.5) {
            return new ThreatFinding(
                "DEVICE_COUNT_ANOMALY",
                "Unusual Number of Devices",
                String.format("Your network currently has %d devices connected, which is significantly higher than your average of %d devices. Your WiFi password may have been compromised.", currentCount, avgCount),
                THREAT_HIGH,
                35,
                "Change your WiFi password immediately and review all connected devices."
            );
        }
        
        return null;
    }
    
    // Rule 11: Probe Pattern
    private ThreatFinding checkProbePattern(JSObject device, List<JSObject> sessions) {
        if (sessions.size() < 2) return null;
        
        // Check if device has multiple very short sessions (< 10 seconds)
        int veryShortSessions = 0;
        
        for (JSObject session : sessions) {
            Integer duration = session.getInteger("sessionDuration");
            if (duration != null && duration < 10 && duration > 0) {
                veryShortSessions++;
            }
        }
        
        if (veryShortSessions >= 3) {
            return new ThreatFinding(
                "PROBE_PATTERN",
                "Network Probing Detected",
                String.format("This device has %d sessions lasting less than 10 seconds. This pattern is consistent with network reconnaissance or deauth attacks.", veryShortSessions),
                THREAT_CRITICAL,
                50,
                "BLOCK THIS DEVICE. This is likely an attacker probing your network."
            );
        }
        
        return null;
    }
    
    // Scoring & Classification
    private int calculateOverallScore(List<ThreatFinding> findings, JSObject device) {
        int score = 0;
        
        for (ThreatFinding finding : findings) {
            score += finding.scoreContribution;
        }
        
        // If device is trusted, reduce score by 50%
        int trustLevel = device.getInteger("isTrusted");
        if (trustLevel == 1) {
            score = score / 2;
        }
        
        // Cap at 100
        return Math.min(100, score);
    }
    
    private int scoreToThreatLevel(int score) {
        if (score <= 10) return THREAT_NONE;
        if (score <= 30) return THREAT_LOW;
        if (score <= 55) return THREAT_MEDIUM;
        if (score <= 80) return THREAT_HIGH;
        return THREAT_CRITICAL;
    }
    
    private String generateSummary(JSObject device, int threatLevel, List<ThreatFinding> findings) {
        String deviceName = device.getString("customName");
        if (deviceName == null || deviceName.isEmpty()) {
            deviceName = device.getString("deviceName");
        }
        if (deviceName == null || deviceName.isEmpty()) {
            deviceName = "This device";
        }
        
        switch (threatLevel) {
            case THREAT_NONE:
                return deviceName + " appears to be safe. No suspicious activity detected.";
                
            case THREAT_LOW:
                if (findings.size() == 1) {
                    return "Minor concern: " + findings.get(0).description;
                }
                return deviceName + " has minor concerns but appears mostly safe.";
                
            case THREAT_MEDIUM:
                return "⚠️ " + deviceName + " shows some suspicious patterns. " + 
                       (findings.size() > 0 ? findings.get(0).ruleName + " detected." : "Monitor this device.");
                
            case THREAT_HIGH:
                return "🚨 WARNING: " + deviceName + " shows suspicious behavior. " +
                       (findings.size() > 0 ? findings.get(0).description : "Investigate immediately.");
                
            case THREAT_CRITICAL:
                return "🔴 DANGER: " + deviceName + " shows signs of a potential attack! " +
                       (findings.size() > 0 ? findings.get(0).ruleName + " detected." : "") +
                       " Take immediate action.";
                
            default:
                return "Unknown threat level.";
        }
    }
    
    // Smart Device Categorization
    public DeviceCategory categorizeDevice(JSObject device) {
        String vendor = device.getString("vendor");
        String hostname = device.getString("deviceName");
        String currentType = device.getString("deviceType");
        
        if (vendor == null) vendor = "";
        if (hostname == null) hostname = "";
        
        String vendorLower = vendor.toLowerCase();
        String hostnameLower = hostname.toLowerCase();
        
        // High confidence matches
        if (hostnameLower.contains("iphone") || hostnameLower.contains("ipad")) {
            String type = hostnameLower.contains("ipad") ? "tablet" : "phone";
            return new DeviceCategory(type, 0.95, "Hostname indicates Apple " + type);
        }
        
        if (hostnameLower.contains("macbook") || hostnameLower.contains("imac")) {
            return new DeviceCategory("laptop", 0.95, "Hostname indicates Apple computer");
        }
        
        if (hostnameLower.contains("galaxy") || hostnameLower.contains("pixel") || 
            hostnameLower.contains("oneplus") || hostnameLower.contains("xiaomi")) {
            return new DeviceCategory("phone", 0.90, "Hostname indicates Android phone");
        }
        
        // Vendor-based categorization
        if (vendorLower.contains("apple")) {
            return new DeviceCategory("phone", 0.70, "Apple device (likely iPhone)");
        }
        
        if (vendorLower.contains("samsung")) {
            return new DeviceCategory("phone", 0.65, "Samsung device (likely phone or tablet)");
        }
        
        if (vendorLower.contains("roku") || vendorLower.contains("chromecast") || 
            vendorLower.contains("fire tv") || hostnameLower.contains("smarttv")) {
            return new DeviceCategory("tv", 0.85, "Streaming device or Smart TV");
        }
        
        if (vendorLower.contains("sonos") || vendorLower.contains("amazon") || 
            vendorLower.contains("google") || vendorLower.contains("nest")) {
            return new DeviceCategory("iot", 0.75, "IoT/Smart home device");
        }
        
        if (vendorLower.contains("canon") || vendorLower.contains("epson") || 
            vendorLower.contains("brother") || vendorLower.contains("hp") && hostnameLower.contains("printer")) {
            return new DeviceCategory("printer", 0.90, "Printer device");
        }
        
        if (vendorLower.contains("ring") || vendorLower.contains("wyze") || 
            vendorLower.contains("hikvision") || hostnameLower.contains("camera")) {
            return new DeviceCategory("camera", 0.85, "Security camera");
        }
        
        // Keep current type if already set and not unknown
        if (currentType != null && !"unknown".equals(currentType)) {
            return new DeviceCategory(currentType, 0.50, "Previously categorized");
        }
        
        return new DeviceCategory("unknown", 0.0, "Unable to determine device type");
    }
}
