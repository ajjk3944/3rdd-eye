package app.thirdeye.scanner.iot;

import android.util.Log;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Performs basic security assessment on discovered IoT devices.
 */
public class IoTSecurityScanner {
    private static final String TAG = "ThirdEye-IoT";
    
    // Common ports to scan
    private static final int[] COMMON_PORTS = {
        21,    // FTP
        22,    // SSH
        23,    // Telnet
        80,    // HTTP
        443,   // HTTPS
        554,   // RTSP
        1883,  // MQTT
        5000,  // Various
        8008,  // Chromecast
        8080,  // HTTP Alt
        8443,  // HTTPS Alt
        8554,  // RTSP Alt
        9090,  // Various
        49152  // UPnP
    };
    
    /**
     * Security finding class
     */
    public static class SecurityFinding {
        public String findingType;
        public String severity;
        public String title;
        public String description;
        public String recommendation;
        
        public SecurityFinding(String findingType, String severity, String title, 
                String description, String recommendation) {
            this.findingType = findingType;
            this.severity = severity;
            this.title = title;
            this.description = description;
            this.recommendation = recommendation;
        }
        
        public JSObject toJSObject() {
            JSObject obj = new JSObject();
            obj.put("findingType", findingType);
            obj.put("severity", severity);
            obj.put("title", title);
            obj.put("description", description);
            obj.put("recommendation", recommendation);
            return obj;
        }
    }
    
    /**
     * Security result class
     */
    public static class SecurityResult {
        public int score;
        public List<SecurityFinding> findings;
        
        public SecurityResult() {
            this.score = 100;
            this.findings = new ArrayList<>();
        }
    }
    
    /**
     * Scan device for security issues
     */
    public static SecurityResult scanDevice(String ip, int timeout) {
        SecurityResult result = new SecurityResult();
        
        try {
            // Quick port scan
            List<Integer> openPorts = quickPortScan(ip, COMMON_PORTS, timeout);
            
            // Assess security based on open ports
            result = assessSecurity(ip, null, openPorts);
            
        } catch (Exception e) {
            Log.e(TAG, "Error scanning device: " + ip, e);
        }
        
        return result;
    }
    
    /**
     * Quick port scan
     */
    public static List<Integer> quickPortScan(String ip, int[] ports, int timeout) {
        List<Integer> openPorts = new ArrayList<>();
        
        for (int port : ports) {
            Socket socket = null;
            try {
                socket = new Socket();
                socket.connect(new InetSocketAddress(ip, port), timeout);
                openPorts.add(port);
                Log.d(TAG, "Port " + port + " is open on " + ip);
            } catch (Exception e) {
                // Port is closed or filtered
            } finally {
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (Exception e) {
                        // Ignore
                    }
                }
            }
        }
        
        return openPorts;
    }
    
    /**
     * Assess security based on findings
     */
    public static SecurityResult assessSecurity(String ip, String deviceType, List<Integer> openPorts) {
        SecurityResult result = new SecurityResult();
        result.score = 100;
        
        if (openPorts == null || openPorts.isEmpty()) {
            return result;
        }
        
        boolean hasHttp = openPorts.contains(80) || openPorts.contains(8080);
        boolean hasHttps = openPorts.contains(443) || openPorts.contains(8443);
        boolean hasMqtt = openPorts.contains(1883);
        boolean hasMqttTls = openPorts.contains(8883);
        boolean hasTelnet = openPorts.contains(23);
        boolean hasFtp = openPorts.contains(21);
        boolean hasUpnp = openPorts.contains(1900);
        
        // CRITICAL: Telnet port open
        if (hasTelnet) {
            result.findings.add(new SecurityFinding(
                "open_port",
                "critical",
                "Telnet Port Open (23)",
                "Telnet provides unencrypted remote access to the device. This is a severe security risk.",
                "Disable Telnet and use SSH (port 22) instead if remote access is needed."
            ));
            result.score -= 30;
        }
        
        // HIGH: FTP port open
        if (hasFtp) {
            result.findings.add(new SecurityFinding(
                "open_port",
                "high",
                "FTP Port Open (21)",
                "FTP transmits data including passwords in plain text.",
                "Disable FTP or use SFTP/FTPS for secure file transfer."
            ));
            result.score -= 20;
        }
        
        // MEDIUM: HTTP without HTTPS
        if (hasHttp && !hasHttps) {
            result.findings.add(new SecurityFinding(
                "no_encryption",
                "medium",
                "HTTP Without HTTPS",
                "Device uses unencrypted HTTP which can expose sensitive data.",
                "Enable HTTPS in device settings if available."
            ));
            result.score -= 10;
        }
        
        // HIGH: MQTT without TLS
        if (hasMqtt && !hasMqttTls) {
            result.findings.add(new SecurityFinding(
                "no_encryption",
                "high",
                "MQTT Without Encryption",
                "MQTT broker is running without TLS encryption.",
                "Configure MQTT to use TLS (port 8883) for secure communication."
            ));
            result.score -= 20;
        }
        
        // LOW: UPnP enabled
        if (hasUpnp) {
            result.findings.add(new SecurityFinding(
                "upnp_exposed",
                "low",
                "UPnP Enabled",
                "UPnP can expose device to network attacks if not properly configured.",
                "Disable UPnP if not needed, or ensure it's restricted to local network only."
            ));
            result.score -= 5;
        }
        
        // MEDIUM: Too many open ports
        if (openPorts.size() > 5) {
            result.findings.add(new SecurityFinding(
                "open_port",
                "medium",
                "Excessive Open Ports (" + openPorts.size() + ")",
                "Device has many open ports which increases attack surface.",
                "Close unnecessary ports and services. Only keep essential services running."
            ));
            result.score -= 10;
        }
        
        // Ensure score doesn't go below 0
        if (result.score < 0) {
            result.score = 0;
        }
        
        return result;
    }
    
    /**
     * Get security score color/label
     */
    public static String getScoreLabel(int score) {
        if (score >= 80) return "Good";
        if (score >= 50) return "Fair";
        return "Poor";
    }
    
    /**
     * Get security score color
     */
    public static String getScoreColor(int score) {
        if (score >= 80) return "green";
        if (score >= 50) return "amber";
        return "red";
    }
}
