package app.thirdeye.scanner;

import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.util.Log;

import com.getcapacitor.JSObject;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * mDNS/Bonjour Service Discovery
 * Discovers devices advertising services on the network
 */
public class MDnsDiscoveryService {
    private static final String TAG = "MDnsDiscovery";
    
    // Common service types to discover
    private static final String[] SERVICE_TYPES = {
        "_http._tcp",           // HTTP servers
        "_https._tcp",          // HTTPS servers
        "_ssh._tcp",            // SSH servers
        "_smb._tcp",            // SMB/Samba file sharing
        "_afpovertcp._tcp",     // Apple File Protocol
        "_airplay._tcp",        // AirPlay devices
        "_raop._tcp",           // AirPlay audio
        "_googlecast._tcp",     // Chromecast
        "_spotify-connect._tcp", // Spotify Connect
        "_printer._tcp",        // Printers
        "_ipp._tcp",            // Internet Printing Protocol
        "_scanner._tcp",        // Scanners
        "_pdl-datastream._tcp", // Printer
        "_workstation._tcp",    // Workstations
        "_device-info._tcp",    // Device info
        "_homekit._tcp",        // HomeKit devices
        "_hap._tcp",            // HomeKit Accessory Protocol
        "_companion-link._tcp", // Apple devices
        "_sleep-proxy._udp",    // Sleep proxy
        "_daap._tcp",           // iTunes sharing
        "_dacp._tcp",           // iTunes remote
        "_touch-able._tcp",     // iTunes remote
        "_appletv-v2._tcp",     // Apple TV
        "_mediaremotetv._tcp",  // Apple TV remote
        "_airpodsync._tcp",     // AirPods
        "_airdrop._tcp",        // AirDrop
        "_rdlink._tcp",         // Remote Desktop
        "_rfb._tcp",            // VNC
        "_telnet._tcp",         // Telnet
        "_ftp._tcp",            // FTP
        "_sftp-ssh._tcp",       // SFTP
        "_nfs._tcp",            // NFS
        "_webdav._tcp",         // WebDAV
        "_upnp._tcp",           // UPnP
        "_services._dns-sd._udp" // Service discovery
    };
    
    private final Context context;
    private final NsdManager nsdManager;
    private final Map<String, JSObject> discoveredDevices;
    private final List<NsdManager.DiscoveryListener> activeListeners;
    
    public MDnsDiscoveryService(Context context) {
        this.context = context;
        this.nsdManager = (NsdManager) context.getSystemService(Context.NSD_SERVICE);
        this.discoveredDevices = new HashMap<>();
        this.activeListeners = new ArrayList<>();
    }
    
    /**
     * Discover devices using mDNS
     * @param timeoutSeconds How long to scan
     * @return List of discovered devices
     */
    public List<JSObject> discoverDevices(int timeoutSeconds) {
        discoveredDevices.clear();
        activeListeners.clear();
        
        final CountDownLatch latch = new CountDownLatch(SERVICE_TYPES.length);
        
        // Start discovery for each service type
        for (String serviceType : SERVICE_TYPES) {
            startDiscovery(serviceType, latch);
        }
        
        // Wait for discoveries to complete or timeout
        try {
            latch.await(timeoutSeconds, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e(TAG, "Discovery interrupted", e);
        }
        
        // Stop all discoveries
        stopAllDiscoveries();
        
        return new ArrayList<>(discoveredDevices.values());
    }
    
    private void startDiscovery(String serviceType, CountDownLatch latch) {
        NsdManager.DiscoveryListener listener = new NsdManager.DiscoveryListener() {
            @Override
            public void onStartDiscoveryFailed(String serviceType, int errorCode) {
                Log.e(TAG, "Discovery failed for " + serviceType + ": " + errorCode);
                latch.countDown();
            }
            
            @Override
            public void onStopDiscoveryFailed(String serviceType, int errorCode) {
                Log.e(TAG, "Stop discovery failed for " + serviceType + ": " + errorCode);
            }
            
            @Override
            public void onDiscoveryStarted(String serviceType) {
                Log.d(TAG, "Discovery started for " + serviceType);
            }
            
            @Override
            public void onDiscoveryStopped(String serviceType) {
                Log.d(TAG, "Discovery stopped for " + serviceType);
                latch.countDown();
            }
            
            @Override
            public void onServiceFound(NsdServiceInfo serviceInfo) {
                Log.d(TAG, "Service found: " + serviceInfo.getServiceName());
                resolveService(serviceInfo);
            }
            
            @Override
            public void onServiceLost(NsdServiceInfo serviceInfo) {
                Log.d(TAG, "Service lost: " + serviceInfo.getServiceName());
            }
        };
        
        activeListeners.add(listener);
        
        try {
            nsdManager.discoverServices(serviceType, NsdManager.PROTOCOL_DNS_SD, listener);
        } catch (Exception e) {
            Log.e(TAG, "Failed to start discovery for " + serviceType, e);
            latch.countDown();
        }
    }
    
    private void resolveService(NsdServiceInfo serviceInfo) {
        nsdManager.resolveService(serviceInfo, new NsdManager.ResolveListener() {
            @Override
            public void onResolveFailed(NsdServiceInfo serviceInfo, int errorCode) {
                Log.e(TAG, "Resolve failed: " + errorCode);
            }
            
            @Override
            public void onServiceResolved(NsdServiceInfo serviceInfo) {
                Log.d(TAG, "Service resolved: " + serviceInfo.getServiceName());
                
                try {
                    InetAddress host = serviceInfo.getHost();
                    if (host == null) return;
                    
                    String ipAddress = host.getHostAddress();
                    if (ipAddress == null) return;
                    
                    // Create or update device entry
                    JSObject device = discoveredDevices.get(ipAddress);
                    if (device == null) {
                        device = new JSObject();
                        device.put("ipAddress", ipAddress);
                        device.put("services", new ArrayList<String>());
                        device.put("source", "mDNS");
                        device.put("timestamp", System.currentTimeMillis());
                    }
                    
                    // Add service information
                    String serviceName = serviceInfo.getServiceName();
                    String serviceType = serviceInfo.getServiceType();
                    int port = serviceInfo.getPort();
                    
                    device.put("hostname", serviceName);
                    device.put("name", serviceName);
                    
                    // Add service to list
                    @SuppressWarnings("unchecked")
                    List<String> services = (List<String>) device.get("services");
                    if (services != null && !services.contains(serviceType)) {
                        services.add(serviceType);
                    }
                    
                    // Identify device type from service
                    String deviceType = identifyDeviceTypeFromService(serviceType, serviceName);
                    if (deviceType != null) {
                        device.put("deviceType", deviceType);
                    }
                    
                    // Add port information
                    if (serviceType.contains("_http")) {
                        device.put("hasHttp", true);
                        device.put("httpPort", port);
                    } else if (serviceType.contains("_https")) {
                        device.put("hasHttps", true);
                        device.put("httpsPort", port);
                    } else if (serviceType.contains("_ssh")) {
                        device.put("hasSsh", true);
                        device.put("sshPort", port);
                    }
                    
                    // Identify vendor from service name
                    String vendor = identifyVendorFromService(serviceName, serviceType);
                    if (vendor != null) {
                        device.put("vendor", vendor);
                    }
                    
                    device.put("isReachable", true);
                    device.put("isOnline", true);
                    
                    discoveredDevices.put(ipAddress, device);
                } catch (Exception e) {
                    Log.e(TAG, "Error processing resolved service", e);
                }
            }
        });
    }
    
    private String identifyDeviceTypeFromService(String serviceType, String serviceName) {
        String lower = serviceType.toLowerCase();
        String nameLower = serviceName.toLowerCase();
        
        if (lower.contains("airplay") || lower.contains("raop") || lower.contains("appletv")) {
            return "Apple TV";
        } else if (lower.contains("googlecast") || nameLower.contains("chromecast")) {
            return "Chromecast";
        } else if (lower.contains("printer") || lower.contains("ipp") || lower.contains("pdl")) {
            return "Printer";
        } else if (lower.contains("scanner")) {
            return "Scanner";
        } else if (lower.contains("homekit") || lower.contains("hap")) {
            return "HomeKit Device";
        } else if (lower.contains("airpod")) {
            return "AirPods";
        } else if (lower.contains("spotify")) {
            return "Spotify Device";
        } else if (lower.contains("workstation") || lower.contains("smb") || lower.contains("afp")) {
            return "Computer";
        } else if (lower.contains("daap") || lower.contains("dacp") || lower.contains("touch-able")) {
            return "iTunes/Music";
        } else if (lower.contains("rfb") || lower.contains("vnc")) {
            return "VNC Server";
        } else if (lower.contains("ssh") || lower.contains("telnet")) {
            return "Server";
        } else if (lower.contains("http") || lower.contains("web")) {
            return "Web Server";
        }
        
        return "Network Device";
    }
    
    private String identifyVendorFromService(String serviceName, String serviceType) {
        String lower = serviceName.toLowerCase();
        
        if (lower.contains("apple") || lower.contains("iphone") || lower.contains("ipad") || 
            lower.contains("macbook") || lower.contains("imac") || serviceType.contains("airplay") ||
            serviceType.contains("homekit") || serviceType.contains("airpod")) {
            return "Apple";
        } else if (lower.contains("google") || lower.contains("chromecast") || lower.contains("nest")) {
            return "Google";
        } else if (lower.contains("samsung")) {
            return "Samsung";
        } else if (lower.contains("sony")) {
            return "Sony";
        } else if (lower.contains("lg")) {
            return "LG";
        } else if (lower.contains("hp") || lower.contains("hewlett")) {
            return "HP";
        } else if (lower.contains("canon")) {
            return "Canon";
        } else if (lower.contains("epson")) {
            return "Epson";
        } else if (lower.contains("brother")) {
            return "Brother";
        } else if (lower.contains("amazon") || lower.contains("echo") || lower.contains("alexa")) {
            return "Amazon";
        } else if (lower.contains("spotify")) {
            return "Spotify";
        } else if (lower.contains("roku")) {
            return "Roku";
        } else if (lower.contains("philips") || lower.contains("hue")) {
            return "Philips";
        }
        
        return null;
    }
    
    private void stopAllDiscoveries() {
        for (NsdManager.DiscoveryListener listener : activeListeners) {
            try {
                nsdManager.stopServiceDiscovery(listener);
            } catch (Exception e) {
                Log.e(TAG, "Failed to stop discovery", e);
            }
        }
        activeListeners.clear();
    }
}
