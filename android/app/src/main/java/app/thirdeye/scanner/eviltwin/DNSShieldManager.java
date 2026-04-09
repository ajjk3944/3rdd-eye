package app.thirdeye.scanner.eviltwin;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class DNSShieldManager {
    private static final String TAG = "DNSShieldManager";
    
    private final Context context;
    private final EncryptedDNSResolver dnsResolver;
    private boolean autoActivateEnabled = true;
    private int activationThreshold = 40;
    private String currentStatus = "INACTIVE";

    private static final Set<String> TRUSTED_DNS_SERVERS = new HashSet<>(Arrays.asList(
        "1.1.1.1", "1.0.0.1", // Cloudflare
        "8.8.8.8", "8.8.4.4", // Google
        "9.9.9.9", "149.112.112.112", // Quad9
        "208.67.222.222", "208.67.220.220" // OpenDNS
    ));

    public DNSShieldManager(Context context) {
        this.context = context;
        this.dnsResolver = new EncryptedDNSResolver();
        checkSystemPrivateDNS();
        Log.i(TAG, "DNSShieldManager initialized");
    }

    public PrivateDNSStatus checkSystemPrivateDNS() {
        PrivateDNSStatus status = new PrivateDNSStatus();
        
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.P) {
            status.supported = false;
            status.enabled = false;
            status.mode = "off";
            status.active = false;
            return status;
        }

        status.supported = true;

        try {
            // Check system setting
            String mode = Settings.Global.getString(
                context.getContentResolver(),
                "private_dns_mode"
            );

            if (mode == null) {
                mode = "off";
            }

            status.enabled = !mode.equals("off");
            
            switch (mode) {
                case "off":
                    status.mode = "off";
                    break;
                case "opportunistic":
                    status.mode = "automatic";
                    break;
                case "hostname":
                    status.mode = "strict";
                    String server = Settings.Global.getString(
                        context.getContentResolver(),
                        "private_dns_specifier"
                    );
                    status.serverHostname = server;
                    break;
                default:
                    status.mode = "off";
            }

            // Check via ConnectivityManager (more reliable)
            ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            if (cm != null) {
                Network activeNetwork = cm.getActiveNetwork();
                if (activeNetwork != null) {
                    LinkProperties lp = cm.getLinkProperties(activeNetwork);
                    if (lp != null && Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                        status.active = lp.isPrivateDnsActive();
                        String privateDnsServer = lp.getPrivateDnsServerName();
                        if (privateDnsServer != null && !privateDnsServer.isEmpty()) {
                            status.serverHostname = privateDnsServer;
                        }
                    }
                }
            }

            Log.i(TAG, "Private DNS status: mode=" + status.mode + ", active=" + status.active);

        } catch (Exception e) {
            Log.e(TAG, "Error checking Private DNS status", e);
            status.enabled = false;
            status.mode = "off";
            status.active = false;
        }

        return status;
    }

    public DNSLeakTestResult runDNSLeakTest() {
        DNSLeakTestResult result = new DNSLeakTestResult();
        result.success = true;
        result.comparisons = new ArrayList<>();
        result.systemDNSServers = new ArrayList<>();
        result.resultsConsistent = true;

        try {
            // Get system DNS servers
            ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            if (cm != null && Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                Network activeNetwork = cm.getActiveNetwork();
                if (activeNetwork != null) {
                    LinkProperties lp = cm.getLinkProperties(activeNetwork);
                    if (lp != null) {
                        List<InetAddress> dnsServers = lp.getDnsServers();
                        for (InetAddress dns : dnsServers) {
                            result.systemDNSServers.add(dns.getHostAddress());
                        }
                    }
                }
            }

            // Check if DNS servers are trusted
            result.dnsServersAreTrusted = true;
            for (String dnsServer : result.systemDNSServers) {
                if (!TRUSTED_DNS_SERVERS.contains(dnsServer)) {
                    // Private IPs are NORMAL for WiFi routers - they forward to ISP DNS
                    // Only flag if it's an unknown PUBLIC DNS server
                    if (!isPrivateIP(dnsServer)) {
                        // Unknown public DNS - could be ISP or compromised
                        result.dnsServersAreTrusted = false;
                        break;
                    }
                    // Private IP (192.168.x.x, 10.x.x.x) = normal router DNS, treat as neutral
                }
            }

            // Test domains
            String[] testDomains = {"google.com", "cloudflare.com", "microsoft.com", "amazon.com"};
            
            for (String domain : testDomains) {
                DNSComparisonResult comparison = new DNSComparisonResult();
                comparison.domain = domain;
                comparison.dohIPs = new ArrayList<>();
                comparison.systemIPs = new ArrayList<>();

                try {
                    // Resolve via DoH (temporarily enable if disabled)
                    boolean wasEnabled = dnsResolver.isEnabled();
                    dnsResolver.setEnabled(true);
                    List<InetAddress> dohResult = dnsResolver.resolveDoH(domain);
                    dnsResolver.setEnabled(wasEnabled);
                    
                    for (InetAddress addr : dohResult) {
                        comparison.dohIPs.add(addr.getHostAddress());
                    }

                    // Resolve via system DNS
                    List<InetAddress> systemResult = Arrays.asList(InetAddress.getAllByName(domain));
                    for (InetAddress addr : systemResult) {
                        comparison.systemIPs.add(addr.getHostAddress());
                    }

                    // Compare results - use Set to ignore order differences
                    Set<String> dohSet = new HashSet<>(comparison.dohIPs);
                    Set<String> systemSet = new HashSet<>(comparison.systemIPs);
                    comparison.match = !dohSet.isEmpty() && !systemSet.isEmpty() && 
                        (dohSet.equals(systemSet) || hasOverlap(dohSet, systemSet));
                    
                    // Check if system DNS is hijacked (resolves to private IP)
                    comparison.systemHijacked = false;
                    for (String ip : comparison.systemIPs) {
                        if (ip.startsWith("192.168.") || ip.startsWith("10.") || ip.startsWith("172.")) {
                            comparison.systemHijacked = true;
                            break;
                        }
                    }

                    if (!comparison.match || comparison.systemHijacked) {
                        result.leakDetected = true;
                    }

                } catch (Exception e) {
                    Log.e(TAG, "Error testing domain: " + domain, e);
                    comparison.match = false;
                }

                result.comparisons.add(comparison);
            }

            // Generate summary
            if (result.leakDetected) {
                result.summary = "DNS leak detected! System DNS may be compromised. Enable DNS Shield for protection.";
            } else if (!result.dnsServersAreTrusted) {
                result.summary = "Using untrusted DNS servers. Consider enabling DNS Shield or system Private DNS.";
            } else {
                result.summary = "No DNS leaks detected. Your DNS queries appear secure.";
            }

            Log.i(TAG, "DNS leak test completed: " + result.summary);

        } catch (Exception e) {
            Log.e(TAG, "DNS leak test failed", e);
            result.success = false;
            result.summary = "DNS leak test failed: " + e.getMessage();
        }

        return result;
    }

    public void onThreatScoreUpdated(int threatScore) {
        if (autoActivateEnabled && threatScore >= activationThreshold && !dnsResolver.isEnabled()) {
            dnsResolver.setEnabled(true);
            currentStatus = "ACTIVE";
            Log.w(TAG, "DNS Shield AUTO-ACTIVATED: Threat score " + threatScore + " >= " + activationThreshold);
        }
    }

    public void enableShield() {
        dnsResolver.setEnabled(true);
        currentStatus = "ACTIVE";
        Log.i(TAG, "DNS Shield manually enabled");
    }

    public void disableShield() {
        dnsResolver.setEnabled(false);
        currentStatus = "INACTIVE";
        Log.i(TAG, "DNS Shield manually disabled");
    }

    public boolean isShieldActive() {
        return dnsResolver.isEnabled();
    }

    public DNSShieldStatus getStatus() {
        DNSShieldStatus status = new DNSShieldStatus();
        
        PrivateDNSStatus privateDNS = checkSystemPrivateDNS();
        
        if (privateDNS.active) {
            status.shieldStatus = "SYSTEM_PROTECTED";
        } else if (dnsResolver.isEnabled()) {
            status.shieldStatus = "ACTIVE";
        } else {
            status.shieldStatus = "INACTIVE";
        }
        
        status.appLevelDoHEnabled = dnsResolver.isEnabled();
        status.systemPrivateDNS = privateDNS;
        status.activeProvider = dnsResolver.getPrimaryProvider().name;
        status.cachedEntries = dnsResolver.getCacheSize();
        status.autoActivateEnabled = autoActivateEnabled;
        status.activationThreshold = activationThreshold;
        
        return status;
    }

    public void setAutoActivate(boolean enabled) {
        this.autoActivateEnabled = enabled;
        Log.i(TAG, "Auto-activate " + (enabled ? "enabled" : "disabled"));
    }

    public void setActivationThreshold(int threshold) {
        this.activationThreshold = Math.max(0, Math.min(100, threshold));
        Log.i(TAG, "Activation threshold set to: " + this.activationThreshold);
    }

    public void setProvider(String providerName) {
        EncryptedDNSResolver.DoHProvider provider;
        switch (providerName.toLowerCase()) {
            case "google":
                provider = EncryptedDNSResolver.DoHProvider.GOOGLE;
                break;
            case "quad9":
                provider = EncryptedDNSResolver.DoHProvider.QUAD9;
                break;
            case "cloudflare":
            default:
                provider = EncryptedDNSResolver.DoHProvider.CLOUDFLARE;
                break;
        }
        dnsResolver.setProvider(provider);
    }

    public void openSystemPrivateDNSSettings() {
        try {
            Intent intent;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                intent = new Intent("android.settings.PRIVATE_DNS_SETTINGS");
            } else {
                intent = new Intent(Settings.ACTION_WIRELESS_SETTINGS);
            }
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
            Log.i(TAG, "Opened Private DNS settings");
        } catch (Exception e) {
            Log.e(TAG, "Failed to open Private DNS settings", e);
            // Fallback to WiFi settings
            try {
                Intent intent = new Intent(Settings.ACTION_WIFI_SETTINGS);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            } catch (Exception e2) {
                Log.e(TAG, "Failed to open WiFi settings", e2);
            }
        }
    }

    public EncryptedDNSResolver getDnsResolver() {
        return dnsResolver;
    }

    private boolean hasOverlap(Set<String> set1, Set<String> set2) {
        for (String ip : set1) {
            if (set2.contains(ip)) return true;
        }
        return false;
    }

    private boolean isPrivateIP(String ip) {
        return ip.startsWith("192.168.") || 
               ip.startsWith("10.") || 
               ip.startsWith("172.16.") || 
               ip.startsWith("172.17.") || 
               ip.startsWith("172.18.") || 
               ip.startsWith("172.19.") || 
               ip.startsWith("172.20.") || 
               ip.startsWith("172.21.") || 
               ip.startsWith("172.22.") || 
               ip.startsWith("172.23.") || 
               ip.startsWith("172.24.") || 
               ip.startsWith("172.25.") || 
               ip.startsWith("172.26.") || 
               ip.startsWith("172.27.") || 
               ip.startsWith("172.28.") || 
               ip.startsWith("172.29.") || 
               ip.startsWith("172.30.") || 
               ip.startsWith("172.31.");
    }

    // Inner classes
    public static class PrivateDNSStatus {
        public boolean supported;
        public boolean enabled;
        public String mode;
        public String serverHostname;
        public boolean active;
    }

    public static class DNSShieldStatus {
        public String shieldStatus;
        public boolean appLevelDoHEnabled;
        public PrivateDNSStatus systemPrivateDNS;
        public String activeProvider;
        public int cachedEntries;
        public boolean autoActivateEnabled;
        public int activationThreshold;
    }

    public static class DNSLeakTestResult {
        public boolean success;
        public boolean leakDetected;
        public List<String> systemDNSServers;
        public boolean dnsServersAreTrusted;
        public List<DNSComparisonResult> comparisons;
        public boolean resultsConsistent;
        public String summary;
    }

    public static class DNSComparisonResult {
        public String domain;
        public List<String> dohIPs;
        public List<String> systemIPs;
        public boolean match;
        public boolean systemHijacked;
    }
}
