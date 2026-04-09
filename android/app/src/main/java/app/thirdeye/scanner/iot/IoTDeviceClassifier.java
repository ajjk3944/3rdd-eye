package app.thirdeye.scanner.iot;

import android.util.Log;

import com.getcapacitor.JSObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Identifies and classifies IoT devices based on MAC OUI, hostname patterns, 
 * open ports, and mDNS services.
 */
public class IoTDeviceClassifier {
    private static final String TAG = "ThirdEye-IoT";
    
    private static final Map<String, String[]> MAC_OUI_DATABASE = new HashMap<>();
    private static final Map<String, String[]> HOSTNAME_PATTERNS = new HashMap<>();
    private static final Map<Integer, String> PORT_TYPES = new HashMap<>();
    
    static {
        initializeMacOuiDatabase();
        initializeHostnamePatterns();
        initializePortTypes();
    }
    
    private static void initializeMacOuiDatabase() {
        // Smart Cameras
        MAC_OUI_DATABASE.put("B0:09:DA", new String[]{"Ring", "camera"});
        MAC_OUI_DATABASE.put("18:B4:30", new String[]{"Nest", "camera"});
        MAC_OUI_DATABASE.put("D0:52:A8", new String[]{"Wyze", "camera"});
        MAC_OUI_DATABASE.put("9C:8E:CD", new String[]{"Amcrest", "camera"});
        MAC_OUI_DATABASE.put("78:A5:04", new String[]{"Reolink", "camera"});
        MAC_OUI_DATABASE.put("E8:AB:FA", new String[]{"Shenzhen Bilian", "camera"});
        MAC_OUI_DATABASE.put("94:A1:A2", new String[]{"Eufy", "camera"});
        
        // Smart Speakers & Displays
        MAC_OUI_DATABASE.put("F0:72:EA", new String[]{"Google Home", "speaker"});
        MAC_OUI_DATABASE.put("1C:F2:9A", new String[]{"Google Home", "speaker"});
        MAC_OUI_DATABASE.put("48:D6:D5", new String[]{"Google Nest", "speaker"});
        MAC_OUI_DATABASE.put("FC:65:DE", new String[]{"Amazon Echo", "speaker"});
        MAC_OUI_DATABASE.put("74:C2:46", new String[]{"Amazon Echo", "speaker"});
        MAC_OUI_DATABASE.put("A4:08:EA", new String[]{"Amazon Echo", "speaker"});
        MAC_OUI_DATABASE.put("68:54:FD", new String[]{"Amazon Echo", "speaker"});
        MAC_OUI_DATABASE.put("00:71:47", new String[]{"Amazon Echo", "speaker"});
        MAC_OUI_DATABASE.put("38:F7:3D", new String[]{"Amazon Echo", "speaker"});
        MAC_OUI_DATABASE.put("B0:FC:0D", new String[]{"Amazon Echo", "speaker"});
        MAC_OUI_DATABASE.put("CC:9E:A2", new String[]{"Amazon Echo", "speaker"});
        MAC_OUI_DATABASE.put("14:91:82", new String[]{"Apple HomePod", "speaker"});
        
        // Smart Lights
        MAC_OUI_DATABASE.put("00:17:88", new String[]{"Philips Hue", "light"});
        MAC_OUI_DATABASE.put("EC:B5:FA", new String[]{"Philips Hue", "light"});
        MAC_OUI_DATABASE.put("D0:73:D5", new String[]{"LIFX", "light"});
        MAC_OUI_DATABASE.put("7C:B2:7D", new String[]{"Govee", "light"});
        MAC_OUI_DATABASE.put("68:57:2D", new String[]{"Sengled", "light"});
        
        // Smart Plugs & Switches
        MAC_OUI_DATABASE.put("B4:B0:24", new String[]{"TP-Link Kasa", "plug"});
        MAC_OUI_DATABASE.put("60:32:B1", new String[]{"TP-Link Kasa", "plug"});
        MAC_OUI_DATABASE.put("50:C7:BF", new String[]{"TP-Link Kasa", "plug"});
        MAC_OUI_DATABASE.put("98:DA:C4", new String[]{"TP-Link Kasa", "plug"});
        MAC_OUI_DATABASE.put("1C:3B:F3", new String[]{"TP-Link Kasa", "plug"});
        MAC_OUI_DATABASE.put("B0:95:75", new String[]{"TP-Link Kasa", "plug"});
        MAC_OUI_DATABASE.put("5C:A6:E6", new String[]{"TP-Link Kasa", "plug"});
        MAC_OUI_DATABASE.put("68:FF:7B", new String[]{"TP-Link Kasa", "plug"});
        MAC_OUI_DATABASE.put("C0:06:C3", new String[]{"TP-Link Kasa", "plug"});
        MAC_OUI_DATABASE.put("B0:BE:76", new String[]{"TP-Link Kasa", "plug"});
        MAC_OUI_DATABASE.put("AC:84:C6", new String[]{"TP-Link Kasa", "plug"});
        MAC_OUI_DATABASE.put("54:AF:97", new String[]{"TP-Link Kasa", "plug"});
        MAC_OUI_DATABASE.put("D8:0D:17", new String[]{"TP-Link Kasa", "plug"});
        MAC_OUI_DATABASE.put("30:DE:4B", new String[]{"TP-Link Kasa", "plug"});
        MAC_OUI_DATABASE.put("84:D8:1B", new String[]{"TP-Link Kasa", "plug"});
        MAC_OUI_DATABASE.put("E4:FA:C4", new String[]{"Meross", "plug"});
        MAC_OUI_DATABASE.put("48:E1:E9", new String[]{"Meross", "plug"});
        MAC_OUI_DATABASE.put("34:EA:34", new String[]{"Meross", "plug"});
        MAC_OUI_DATABASE.put("24:62:AB", new String[]{"Espressif/Tuya", "plug"});
        MAC_OUI_DATABASE.put("A4:CF:12", new String[]{"Espressif/Tuya", "plug"});
        MAC_OUI_DATABASE.put("BC:DD:C2", new String[]{"Espressif/Tuya", "plug"});
        MAC_OUI_DATABASE.put("DC:4F:22", new String[]{"Espressif/Tuya", "plug"});
        MAC_OUI_DATABASE.put("30:AE:A4", new String[]{"Espressif/Tuya", "plug"});
        MAC_OUI_DATABASE.put("84:CC:A8", new String[]{"Espressif/Tuya", "plug"});
        MAC_OUI_DATABASE.put("AC:67:B2", new String[]{"Espressif/Tuya", "plug"});
        MAC_OUI_DATABASE.put("08:3A:F2", new String[]{"Espressif/Tuya", "plug"});
        MAC_OUI_DATABASE.put("3C:71:BF", new String[]{"Espressif/Tuya", "plug"});
        MAC_OUI_DATABASE.put("C8:C9:A3", new String[]{"Espressif/Tuya", "plug"});
        MAC_OUI_DATABASE.put("D8:F1:5B", new String[]{"Espressif/Tuya", "plug"});
        MAC_OUI_DATABASE.put("80:7D:3A", new String[]{"Espressif/Tuya", "plug"});
        
        // Smart Thermostats
        MAC_OUI_DATABASE.put("44:61:32", new String[]{"ecobee", "thermostat"});
        MAC_OUI_DATABASE.put("64:16:66", new String[]{"Nest Thermostat", "thermostat"});
        
        // Smart TVs
        MAC_OUI_DATABASE.put("8C:79:F5", new String[]{"Samsung Smart TV", "tv"});
        MAC_OUI_DATABASE.put("F4:7B:09", new String[]{"Samsung Smart TV", "tv"});
        MAC_OUI_DATABASE.put("78:BD:BC", new String[]{"Samsung Smart TV", "tv"});
        MAC_OUI_DATABASE.put("C4:73:1E", new String[]{"Samsung Smart TV", "tv"});
        MAC_OUI_DATABASE.put("D0:03:4B", new String[]{"LG Smart TV", "tv"});
        MAC_OUI_DATABASE.put("A8:23:FE", new String[]{"LG Smart TV", "tv"});
        MAC_OUI_DATABASE.put("74:A5:28", new String[]{"LG Smart TV", "tv"});
        MAC_OUI_DATABASE.put("A0:B4:A5", new String[]{"LG Smart TV", "tv"});
        MAC_OUI_DATABASE.put("AC:5A:F0", new String[]{"LG Smart TV", "tv"});
        MAC_OUI_DATABASE.put("00:E0:4C", new String[]{"Roku", "tv"});
        
        // Smart Locks
        MAC_OUI_DATABASE.put("D0:03:DF", new String[]{"August Smart Lock", "lock"});
        MAC_OUI_DATABASE.put("5C:31:3E", new String[]{"Schlage", "lock"});
        
        // Smart Hubs
        MAC_OUI_DATABASE.put("28:6D:97", new String[]{"SmartThings Hub", "hub"});
        
        // Robot Vacuums
        MAC_OUI_DATABASE.put("50:EC:50", new String[]{"iRobot Roomba", "appliance"});
        MAC_OUI_DATABASE.put("80:C5:F2", new String[]{"Roborock", "appliance"});
        MAC_OUI_DATABASE.put("64:90:C1", new String[]{"Xiaomi/Roborock", "appliance"});
        MAC_OUI_DATABASE.put("78:11:DC", new String[]{"Xiaomi/Roborock", "appliance"});
    }
    
    private static void initializeHostnamePatterns() {
        HOSTNAME_PATTERNS.put("google-home", new String[]{"Google Home", "speaker"});
        HOSTNAME_PATTERNS.put("googlecast", new String[]{"Google Chromecast", "tv"});
        HOSTNAME_PATTERNS.put("nest", new String[]{"Nest", "thermostat"});
        HOSTNAME_PATTERNS.put("ring", new String[]{"Ring", "camera"});
        HOSTNAME_PATTERNS.put("echo", new String[]{"Amazon Echo", "speaker"});
        HOSTNAME_PATTERNS.put("alexa", new String[]{"Amazon Alexa", "speaker"});
        HOSTNAME_PATTERNS.put("fire-tv", new String[]{"Amazon Fire TV", "tv"});
        HOSTNAME_PATTERNS.put("firetv", new String[]{"Amazon Fire TV", "tv"});
        HOSTNAME_PATTERNS.put("roku", new String[]{"Roku", "tv"});
        HOSTNAME_PATTERNS.put("philips-hue", new String[]{"Philips Hue", "light"});
        HOSTNAME_PATTERNS.put("hue-bridge", new String[]{"Philips Hue Bridge", "hub"});
        HOSTNAME_PATTERNS.put("lifx", new String[]{"LIFX", "light"});
        HOSTNAME_PATTERNS.put("tplink", new String[]{"TP-Link", "plug"});
        HOSTNAME_PATTERNS.put("tapo", new String[]{"TP-Link Tapo", "plug"});
        HOSTNAME_PATTERNS.put("kasa", new String[]{"TP-Link Kasa", "plug"});
        HOSTNAME_PATTERNS.put("smartthings", new String[]{"SmartThings", "hub"});
        HOSTNAME_PATTERNS.put("roomba", new String[]{"iRobot Roomba", "appliance"});
        HOSTNAME_PATTERNS.put("irobot", new String[]{"iRobot", "appliance"});
        HOSTNAME_PATTERNS.put("roborock", new String[]{"Roborock", "appliance"});
        HOSTNAME_PATTERNS.put("wyze", new String[]{"Wyze", "camera"});
        HOSTNAME_PATTERNS.put("eufy", new String[]{"Eufy", "camera"});
        HOSTNAME_PATTERNS.put("sonos", new String[]{"Sonos", "speaker"});
        HOSTNAME_PATTERNS.put("homepod", new String[]{"Apple HomePod", "speaker"});
        HOSTNAME_PATTERNS.put("appletv", new String[]{"Apple TV", "tv"});
        HOSTNAME_PATTERNS.put("apple-tv", new String[]{"Apple TV", "tv"});
        HOSTNAME_PATTERNS.put("chromecast", new String[]{"Google Chromecast", "tv"});
    }
    
    private static void initializePortTypes() {
        PORT_TYPES.put(554, "camera");    // RTSP streaming
        PORT_TYPES.put(8554, "camera");   // Alternative RTSP
        PORT_TYPES.put(1883, "hub");      // MQTT
        PORT_TYPES.put(8883, "hub");      // MQTT over TLS
        PORT_TYPES.put(8008, "tv");       // Chromecast
        PORT_TYPES.put(8443, "hub");      // Smart hub HTTPS
        PORT_TYPES.put(5353, "any");      // mDNS
        PORT_TYPES.put(1900, "any");      // SSDP/UPnP
        PORT_TYPES.put(49152, "tv");      // UPnP media
        PORT_TYPES.put(5000, "camera");   // Some IP cameras
    }
    
    /**
     * Classify device based on available information
     */
    public static JSObject classifyDevice(String macAddress, String hostname, String ip, 
            List<Integer> openPorts, List<String> mdnsServices) {
        
        JSObject result = new JSObject();
        result.put("manufacturer", "Unknown");
        result.put("deviceType", "other");
        result.put("deviceModel", "");
        result.put("platform", "other");
        result.put("confidence", 0);
        
        int confidence = 0;
        
        // Method 1: MAC OUI lookup
        if (macAddress != null && macAddress.length() >= 8) {
            String oui = macAddress.substring(0, 8).toUpperCase();
            String[] macInfo = MAC_OUI_DATABASE.get(oui);
            
            if (macInfo != null) {
                result.put("manufacturer", macInfo[0]);
                result.put("deviceType", macInfo[1]);
                confidence += 70;
                
                // Determine platform from manufacturer
                String manufacturer = macInfo[0].toLowerCase();
                if (manufacturer.contains("google") || manufacturer.contains("nest")) {
                    result.put("platform", "google_home");
                } else if (manufacturer.contains("amazon") || manufacturer.contains("echo")) {
                    result.put("platform", "alexa");
                } else if (manufacturer.contains("apple")) {
                    result.put("platform", "homekit");
                } else if (manufacturer.contains("smartthings")) {
                    result.put("platform", "smartthings");
                }
            }
        }
        
        // Method 2: Hostname pattern matching
        if (hostname != null && !hostname.isEmpty()) {
            String lowerHostname = hostname.toLowerCase();
            
            for (Map.Entry<String, String[]> entry : HOSTNAME_PATTERNS.entrySet()) {
                if (lowerHostname.contains(entry.getKey())) {
                    String[] hostnameInfo = entry.getValue();
                    
                    // Only override if we don't have manufacturer yet or confidence is low
                    if (confidence < 50) {
                        result.put("manufacturer", hostnameInfo[0]);
                        result.put("deviceType", hostnameInfo[1]);
                        confidence += 60;
                    }
                    
                    // Update platform
                    String pattern = entry.getKey();
                    if (pattern.contains("google") || pattern.contains("nest") || pattern.contains("chromecast")) {
                        result.put("platform", "google_home");
                    } else if (pattern.contains("echo") || pattern.contains("alexa") || pattern.contains("fire")) {
                        result.put("platform", "alexa");
                    } else if (pattern.contains("apple") || pattern.contains("homepod")) {
                        result.put("platform", "homekit");
                    } else if (pattern.contains("smartthings")) {
                        result.put("platform", "smartthings");
                    }
                    
                    break;
                }
            }
        }
        
        // Method 3: Port-based identification
        if (openPorts != null && !openPorts.isEmpty()) {
            for (Integer port : openPorts) {
                String portType = PORT_TYPES.get(port);
                if (portType != null && !portType.equals("any")) {
                    // Only use port info if we have low confidence
                    if (confidence < 40) {
                        result.put("deviceType", portType);
                        confidence += 30;
                    }
                }
            }
        }
        
        // Method 4: mDNS service detection
        if (mdnsServices != null && !mdnsServices.isEmpty()) {
            for (String service : mdnsServices) {
                String lowerService = service.toLowerCase();
                
                if (lowerService.contains("googlecast")) {
                    result.put("manufacturer", "Google");
                    result.put("deviceType", "tv");
                    result.put("platform", "google_home");
                    confidence += 50;
                } else if (lowerService.contains("airplay") || lowerService.contains("raop")) {
                    result.put("manufacturer", "Apple");
                    result.put("deviceType", "tv");
                    result.put("platform", "homekit");
                    confidence += 50;
                } else if (lowerService.contains("hue")) {
                    result.put("manufacturer", "Philips Hue");
                    result.put("deviceType", "light");
                    confidence += 50;
                } else if (lowerService.contains("sonos")) {
                    result.put("manufacturer", "Sonos");
                    result.put("deviceType", "speaker");
                    confidence += 50;
                } else if (lowerService.contains("mqtt")) {
                    if (confidence < 30) {
                        result.put("deviceType", "hub");
                        confidence += 20;
                    }
                }
            }
        }
        
        result.put("confidence", Math.min(confidence, 100));
        
        // Generate device model if not set
        if (result.getString("deviceModel") == null || result.getString("deviceModel").isEmpty()) {
            String manufacturer = result.getString("manufacturer");
            String deviceType = result.getString("deviceType");
            if (manufacturer != null && !manufacturer.equals("Unknown")) {
                result.put("deviceModel", manufacturer + " " + capitalizeFirst(deviceType));
            }
        }
        
        return result;
    }
    
    /**
     * Check if device is likely an IoT device
     */
    public static boolean isLikelyIoT(String macAddress, String hostname, List<Integer> openPorts) {
        // Check MAC OUI
        if (macAddress != null && macAddress.length() >= 8) {
            String oui = macAddress.substring(0, 8).toUpperCase();
            if (MAC_OUI_DATABASE.containsKey(oui)) {
                return true;
            }
        }
        
        // Check hostname patterns
        if (hostname != null && !hostname.isEmpty()) {
            String lowerHostname = hostname.toLowerCase();
            for (String pattern : HOSTNAME_PATTERNS.keySet()) {
                if (lowerHostname.contains(pattern)) {
                    return true;
                }
            }
        }
        
        // Check for IoT-specific ports
        if (openPorts != null) {
            for (Integer port : openPorts) {
                if (PORT_TYPES.containsKey(port)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    /**
     * Get device icon type for frontend
     */
    public static String getDeviceIcon(String deviceType) {
        if (deviceType == null) return "other";
        
        switch (deviceType.toLowerCase()) {
            case "camera": return "camera";
            case "speaker": return "speaker";
            case "light": return "light";
            case "plug": return "plug";
            case "thermostat": return "thermostat";
            case "tv": return "tv";
            case "lock": return "lock";
            case "hub": return "hub";
            case "sensor": return "sensor";
            case "appliance": return "appliance";
            default: return "other";
        }
    }
    
    /**
     * Capitalize first letter
     */
    private static String capitalizeFirst(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
