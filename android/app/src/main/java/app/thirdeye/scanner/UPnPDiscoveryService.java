package app.thirdeye.scanner;

import android.util.Log;

import com.getcapacitor.JSObject;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UPnP/SSDP Device Discovery
 * Discovers UPnP devices on the network
 */
public class UPnPDiscoveryService {
    private static final String TAG = "UPnPDiscovery";
    
    private static final String SSDP_IP = "239.255.255.250";
    private static final int SSDP_PORT = 1900;
    private static final int SOCKET_TIMEOUT = 5000; // 5 seconds
    
    // SSDP M-SEARCH request
    private static final String SSDP_SEARCH_MESSAGE =
        "M-SEARCH * HTTP/1.1\r\n" +
        "HOST: 239.255.255.250:1900\r\n" +
        "MAN: \"ssdp:discover\"\r\n" +
        "MX: 3\r\n" +
        "ST: ssdp:all\r\n" +
        "\r\n";
    
    private final Map<String, JSObject> discoveredDevices;
    
    public UPnPDiscoveryService() {
        this.discoveredDevices = new HashMap<>();
    }
    
    /**
     * Discover UPnP devices on the network
     * @return List of discovered devices
     */
    public List<JSObject> discoverDevices() {
        discoveredDevices.clear();
        
        DatagramSocket socket = null;
        try {
            // Create socket
            socket = new DatagramSocket();
            socket.setSoTimeout(SOCKET_TIMEOUT);
            
            // Send M-SEARCH request
            byte[] searchBytes = SSDP_SEARCH_MESSAGE.getBytes();
            InetAddress group = InetAddress.getByName(SSDP_IP);
            DatagramPacket searchPacket = new DatagramPacket(
                searchBytes, 
                searchBytes.length, 
                group, 
                SSDP_PORT
            );
            
            Log.d(TAG, "Sending SSDP M-SEARCH request...");
            socket.send(searchPacket);
            
            // Receive responses
            byte[] buffer = new byte[8192];
            long startTime = System.currentTimeMillis();
            long timeout = 6000; // 6 seconds total
            
            while (System.currentTimeMillis() - startTime < timeout) {
                try {
                    DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                    socket.receive(packet);
                    
                    String response = new String(packet.getData(), 0, packet.getLength());
                    String deviceIp = packet.getAddress().getHostAddress();
                    
                    Log.d(TAG, "Received SSDP response from: " + deviceIp);
                    parseSSDPResponse(response, deviceIp);
                    
                } catch (SocketTimeoutException e) {
                    // Timeout is expected, continue
                    break;
                }
            }
            
            Log.d(TAG, "UPnP discovery complete. Found " + discoveredDevices.size() + " devices");
            
        } catch (IOException e) {
            Log.e(TAG, "UPnP discovery error", e);
        } finally {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        }
        
        return new ArrayList<>(discoveredDevices.values());
    }
    
    private void parseSSDPResponse(String response, String ipAddress) {
        try {
            // Parse SSDP response headers
            String[] lines = response.split("\r\n");
            
            String location = null;
            String server = null;
            String usn = null;
            String st = null;
            
            for (String line : lines) {
                String lowerLine = line.toLowerCase();
                if (lowerLine.startsWith("location:")) {
                    location = line.substring(9).trim();
                } else if (lowerLine.startsWith("server:")) {
                    server = line.substring(7).trim();
                } else if (lowerLine.startsWith("usn:")) {
                    usn = line.substring(4).trim();
                } else if (lowerLine.startsWith("st:")) {
                    st = line.substring(3).trim();
                }
            }
            
            // Create or update device entry
            JSObject device = discoveredDevices.get(ipAddress);
            if (device == null) {
                device = new JSObject();
                device.put("ipAddress", ipAddress);
                device.put("source", "UPnP");
                device.put("timestamp", System.currentTimeMillis());
                device.put("isReachable", true);
                device.put("isOnline", true);
            }
            
            // Add UPnP information
            if (location != null) {
                device.put("upnpLocation", location);
                device.put("hasHttp", true);
            }
            
            if (server != null) {
                device.put("server", server);
                
                // Try to identify device from server string
                String deviceType = identifyDeviceTypeFromServer(server);
                if (deviceType != null) {
                    device.put("deviceType", deviceType);
                }
                
                String vendor = identifyVendorFromServer(server);
                if (vendor != null) {
                    device.put("vendor", vendor);
                }
            }
            
            if (usn != null) {
                device.put("usn", usn);
                
                // Extract device name from USN if available
                if (usn.contains("::")) {
                    String[] parts = usn.split("::");
                    if (parts.length > 0) {
                        String uuid = parts[0].replace("uuid:", "");
                        device.put("uuid", uuid);
                    }
                }
            }
            
            if (st != null) {
                device.put("serviceType", st);
                
                // Identify device type from service type
                String deviceType = identifyDeviceTypeFromServiceType(st);
                if (deviceType != null && !device.has("deviceType")) {
                    device.put("deviceType", deviceType);
                }
            }
            
            discoveredDevices.put(ipAddress, device);
            
        } catch (Exception e) {
            Log.e(TAG, "Error parsing SSDP response", e);
        }
    }
    
    private String identifyDeviceTypeFromServer(String server) {
        String lower = server.toLowerCase();
        
        if (lower.contains("router") || lower.contains("gateway")) {
            return "Router/Gateway";
        } else if (lower.contains("tv") || lower.contains("television")) {
            return "Smart TV";
        } else if (lower.contains("printer")) {
            return "Printer";
        } else if (lower.contains("nas") || lower.contains("storage")) {
            return "Network Storage";
        } else if (lower.contains("media") || lower.contains("dlna")) {
            return "Media Server";
        } else if (lower.contains("camera") || lower.contains("webcam")) {
            return "IP Camera";
        } else if (lower.contains("speaker") || lower.contains("audio")) {
            return "Smart Speaker";
        } else if (lower.contains("xbox") || lower.contains("playstation") || lower.contains("nintendo")) {
            return "Gaming Console";
        } else if (lower.contains("chromecast")) {
            return "Chromecast";
        } else if (lower.contains("roku")) {
            return "Roku";
        } else if (lower.contains("apple") || lower.contains("airport")) {
            return "Apple Device";
        }
        
        return null;
    }
    
    private String identifyVendorFromServer(String server) {
        String lower = server.toLowerCase();
        
        if (lower.contains("samsung")) {
            return "Samsung";
        } else if (lower.contains("lg")) {
            return "LG";
        } else if (lower.contains("sony")) {
            return "Sony";
        } else if (lower.contains("apple") || lower.contains("airport")) {
            return "Apple";
        } else if (lower.contains("google") || lower.contains("chromecast")) {
            return "Google";
        } else if (lower.contains("amazon") || lower.contains("echo")) {
            return "Amazon";
        } else if (lower.contains("roku")) {
            return "Roku";
        } else if (lower.contains("microsoft") || lower.contains("xbox")) {
            return "Microsoft";
        } else if (lower.contains("nintendo")) {
            return "Nintendo";
        } else if (lower.contains("philips")) {
            return "Philips";
        } else if (lower.contains("tp-link") || lower.contains("tplink")) {
            return "TP-Link";
        } else if (lower.contains("netgear")) {
            return "Netgear";
        } else if (lower.contains("asus")) {
            return "ASUS";
        } else if (lower.contains("d-link") || lower.contains("dlink")) {
            return "D-Link";
        } else if (lower.contains("linksys")) {
            return "Linksys";
        } else if (lower.contains("synology")) {
            return "Synology";
        } else if (lower.contains("qnap")) {
            return "QNAP";
        } else if (lower.contains("hp") || lower.contains("hewlett")) {
            return "HP";
        } else if (lower.contains("canon")) {
            return "Canon";
        } else if (lower.contains("epson")) {
            return "Epson";
        } else if (lower.contains("brother")) {
            return "Brother";
        }
        
        return null;
    }
    
    private String identifyDeviceTypeFromServiceType(String serviceType) {
        String lower = serviceType.toLowerCase();
        
        if (lower.contains("mediarenderer")) {
            return "Media Renderer";
        } else if (lower.contains("mediaserver")) {
            return "Media Server";
        } else if (lower.contains("wanconnection") || lower.contains("wanipconnection")) {
            return "Router/Gateway";
        } else if (lower.contains("printer")) {
            return "Printer";
        } else if (lower.contains("scanner")) {
            return "Scanner";
        } else if (lower.contains("storage")) {
            return "Network Storage";
        } else if (lower.contains("camera")) {
            return "IP Camera";
        }
        
        return null;
    }
}
