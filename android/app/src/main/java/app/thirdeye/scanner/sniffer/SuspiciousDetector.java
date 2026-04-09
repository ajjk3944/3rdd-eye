package app.thirdeye.scanner.sniffer;

import android.util.Log;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class SuspiciousDetector {
    private static final String TAG = "SuspiciousDetector";

    // Utility app keywords
    private static final Set<String> UTILITY_KEYWORDS = new HashSet<>(Arrays.asList(
            "calculator", "flashlight", "torch", "clock", "alarm", "calendar",
            "compass", "level", "ruler", "converter", "notepad", "memo",
            "recorder", "mirror", "magnifier"
    ));

    // Common/expected ports
    private static final Set<Integer> COMMON_PORTS = new HashSet<>(Arrays.asList(
            80, 443, 8080, 8443,           // HTTP/HTTPS
            53, 853,                        // DNS
            993, 995, 587, 465, 143, 110, 25, // Email
            22,                             // SSH
            5228, 5229, 5230,              // Google services
            5222, 5223,                     // XMPP
            3478, 19302                     // STUN/TURN
    ));

    // Ephemeral port range
    private static final int EPHEMERAL_PORT_START = 49152;
    private static final int EPHEMERAL_PORT_END = 65535;

    // Tracking data
    private final Map<String, LinkedList<Long>> connectionFrequency = new HashMap<>();
    private final Map<String, long[]> dataTransfer = new HashMap<>(); // [bytes_sent, bytes_received]

    // Thresholds
    private static final int HIGH_FREQUENCY_THRESHOLD = 50; // connections per minute
    private static final long HIGH_FREQUENCY_WINDOW = 60 * 1000; // 60 seconds
    private static final long DATA_EXFILTRATION_THRESHOLD = 1024 * 1024; // 1 MB
    private static final double DATA_EXFILTRATION_RATIO = 3.0; // 3:1 sent/received ratio

    public static class SuspiciousResult {
        public boolean isSuspicious;
        public String reason;
        public String severity; // "high", "medium", "low"

        public SuspiciousResult(boolean isSuspicious, String reason, String severity) {
            this.isSuspicious = isSuspicious;
            this.reason = reason;
            this.severity = severity;
        }
    }

    /**
     * Analyze connection for suspicious activity
     */
    public SuspiciousResult analyze(String appPackage, String appName, String destinationIP,
                                     int destinationPort, String countryCode, long bytesSent,
                                     long bytesReceived) {
        // Rule 1: Utility app making external connections
        SuspiciousResult utilityCheck = checkUtilityForeignServer(appPackage, appName, destinationIP, countryCode);
        if (utilityCheck.isSuspicious) {
            return utilityCheck;
        }

        // Rule 2: High frequency connections
        SuspiciousResult frequencyCheck = checkHighFrequency(appPackage, appName);
        if (frequencyCheck.isSuspicious) {
            return frequencyCheck;
        }

        // Rule 3: Unusual port
        SuspiciousResult portCheck = checkUnusualPort(appName, destinationIP, destinationPort);
        if (portCheck.isSuspicious) {
            return portCheck;
        }

        // Rule 4: Data exfiltration
        SuspiciousResult exfiltrationCheck = checkDataExfiltration(appPackage, appName, bytesSent, bytesReceived);
        if (exfiltrationCheck.isSuspicious) {
            return exfiltrationCheck;
        }

        return new SuspiciousResult(false, "", "");
    }

    /**
     * Rule 1: Utility app making external connections
     */
    private SuspiciousResult checkUtilityForeignServer(String appPackage, String appName,
                                                        String destinationIP, String countryCode) {
        if (appPackage == null || appName == null) {
            return new SuspiciousResult(false, "", "");
        }

        String packageLower = appPackage.toLowerCase();
        String nameLower = appName.toLowerCase();

        // Check if app is a utility app
        boolean isUtility = false;
        for (String keyword : UTILITY_KEYWORDS) {
            if (packageLower.contains(keyword) || nameLower.contains(keyword)) {
                isUtility = true;
                break;
            }
        }

        if (!isUtility) {
            return new SuspiciousResult(false, "", "");
        }

        // Check if making external connection
        if (!PacketParser.isPrivateIP(destinationIP)) {
            String reason = String.format("%s is communicating with %s server (%s). " +
                            "Utility apps typically do not need internet access.",
                    appName, countryCode != null ? countryCode : "external", destinationIP);
            return new SuspiciousResult(true, reason, "high");
        }

        return new SuspiciousResult(false, "", "");
    }

    /**
     * Rule 2: High frequency connections
     */
    private SuspiciousResult checkHighFrequency(String appPackage, String appName) {
        if (appPackage == null) {
            return new SuspiciousResult(false, "", "");
        }

        long now = System.currentTimeMillis();

        // Get or create timestamp list for this app
        LinkedList<Long> timestamps = connectionFrequency.get(appPackage);
        if (timestamps == null) {
            timestamps = new LinkedList<>();
            connectionFrequency.put(appPackage, timestamps);
        }

        // Add current timestamp
        timestamps.add(now);

        // Remove timestamps older than the window
        while (!timestamps.isEmpty() && timestamps.getFirst() < now - HIGH_FREQUENCY_WINDOW) {
            timestamps.removeFirst();
        }

        // Check if threshold exceeded
        if (timestamps.size() > HIGH_FREQUENCY_THRESHOLD) {
            String reason = String.format("%s made %d connections in the last minute. " +
                            "This is unusually high.",
                    appName != null ? appName : appPackage, timestamps.size());
            return new SuspiciousResult(true, reason, "medium");
        }

        return new SuspiciousResult(false, "", "");
    }

    /**
     * Rule 3: Unusual port
     */
    private SuspiciousResult checkUnusualPort(String appName, String destinationIP, int destinationPort) {
        // Skip if port is common or ephemeral
        if (COMMON_PORTS.contains(destinationPort) ||
                (destinationPort >= EPHEMERAL_PORT_START && destinationPort <= EPHEMERAL_PORT_END)) {
            return new SuspiciousResult(false, "", "");
        }

        String reason = String.format("%s connected to %s:%d. Port %d is not commonly used.",
                appName != null ? appName : "App", destinationIP, destinationPort, destinationPort);
        return new SuspiciousResult(true, reason, "low");
    }

    /**
     * Rule 4: Data exfiltration
     */
    private SuspiciousResult checkDataExfiltration(String appPackage, String appName,
                                                    long bytesSent, long bytesReceived) {
        if (appPackage == null) {
            return new SuspiciousResult(false, "", "");
        }

        // Get or create data transfer tracking for this app
        long[] transfer = dataTransfer.get(appPackage);
        if (transfer == null) {
            transfer = new long[]{0, 0}; // [bytes_sent, bytes_received]
            dataTransfer.put(appPackage, transfer);
        }

        // Update cumulative bytes
        transfer[0] += bytesSent;
        transfer[1] += bytesReceived;

        long totalSent = transfer[0];
        long totalReceived = transfer[1];

        // Check if sent more than threshold AND ratio is suspicious
        if (totalSent > DATA_EXFILTRATION_THRESHOLD && totalReceived > 0) {
            double ratio = (double) totalSent / totalReceived;

            if (ratio > DATA_EXFILTRATION_RATIO) {
                String reason = String.format("%s has uploaded significantly more data (%s) " +
                                "than downloaded (%s). This may indicate data exfiltration.",
                        appName != null ? appName : appPackage,
                        formatBytes(totalSent), formatBytes(totalReceived));
                return new SuspiciousResult(true, reason, "high");
            }
        }

        return new SuspiciousResult(false, "", "");
    }

    /**
     * Reset all tracking state
     */
    public void reset() {
        connectionFrequency.clear();
        dataTransfer.clear();
        Log.i(TAG, "Suspicious detector state reset");
    }

    /**
     * Format bytes to human-readable string
     */
    private String formatBytes(long bytes) {
        if (bytes < 1024) {
            return bytes + " B";
        } else if (bytes < 1024 * 1024) {
            return String.format("%.2f KB", bytes / 1024.0);
        } else if (bytes < 1024 * 1024 * 1024) {
            return String.format("%.2f MB", bytes / (1024.0 * 1024));
        } else {
            return String.format("%.2f GB", bytes / (1024.0 * 1024 * 1024));
        }
    }
}
