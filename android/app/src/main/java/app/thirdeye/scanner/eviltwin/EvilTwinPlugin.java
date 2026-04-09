package app.thirdeye.scanner.eviltwin;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.DhcpInfo;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@CapacitorPlugin(name = "EvilTwin")
public class EvilTwinPlugin extends Plugin {
    private EvilTwinDetector detector;
    private NetworkSecurityDatabase database;
    private WiFiStateMonitor wifiStateMonitor;
    private boolean autoMonitorEnabled = false;
    private ExecutorService executorService;

    @Override
    public void load() {
        detector = new EvilTwinDetector(getContext());
        database = new NetworkSecurityDatabase(getContext());
        wifiStateMonitor = new WiFiStateMonitor();
        executorService = Executors.newFixedThreadPool(2);
    }

    @PluginMethod
    public void runFullScan(PluginCall call) {
        executorService.execute(() -> {
            try {
                EvilTwinDetector.EvilTwinScanResult result = detector.runFullScan();
                JSObject response = convertScanResultToJS(result);
                call.resolve(response);
                
                // Fire event
                notifyListeners("scanComplete", response);
                
                // Fire threat event if score >= 40
                if (result.threatScore >= 40) {
                    notifyListeners("threatDetected", response);
                }
            } catch (Exception e) {
                call.reject("Scan failed: " + e.getMessage());
            }
        });
    }

    @PluginMethod
    public void runQuickScan(PluginCall call) {
        executorService.execute(() -> {
            try {
                EvilTwinDetector.EvilTwinScanResult result = detector.runQuickScan();
                JSObject response = convertScanResultToJS(result);
                call.resolve(response);
                
                notifyListeners("scanComplete", response);
                
                if (result.threatScore >= 40) {
                    notifyListeners("threatDetected", response);
                }
            } catch (Exception e) {
                call.reject("Quick scan failed: " + e.getMessage());
            }
        });
    }

    @PluginMethod
    public void getScanHistory(PluginCall call) {
        executorService.execute(() -> {
            try {
                int limit = call.getInt("limit", 50);
                List<NetworkSecurityDatabase.ScanHistoryEntry> history = database.getScanHistory(limit);
                
                JSArray historyArray = new JSArray();
                for (NetworkSecurityDatabase.ScanHistoryEntry entry : history) {
                    JSObject entryObj = new JSObject();
                    entryObj.put("id", entry.id);
                    entryObj.put("ssid", entry.ssid);
                    entryObj.put("bssid", entry.bssid);
                    entryObj.put("threatScore", entry.threatScore);
                    entryObj.put("threatLevel", entry.threatLevel);
                    entryObj.put("timestamp", entry.timestamp);
                    entryObj.put("scanDurationMs", entry.scanDurationMs);
                    historyArray.put(entryObj);
                }
                
                JSObject response = new JSObject();
                response.put("success", true);
                response.put("history", historyArray);
                call.resolve(response);
            } catch (Exception e) {
                call.reject("Failed to get history: " + e.getMessage());
            }
        });
    }

    @PluginMethod
    public void getNetworkProfile(PluginCall call) {
        executorService.execute(() -> {
            try {
                String ssid = call.getString("ssid");
                if (ssid == null) {
                    call.reject("SSID is required");
                    return;
                }
                
                NetworkSecurityDatabase.NetworkBaseline baseline = database.getBaseline(ssid, "");
                
                JSObject profile = new JSObject();
                profile.put("ssid", ssid);
                if (baseline != null) {
                    profile.put("bssid", baseline.bssid);
                    profile.put("gatewayIP", baseline.gatewayIP);
                    profile.put("gatewayMAC", baseline.gatewayMAC);
                    profile.put("securityType", baseline.securityType);
                    profile.put("averageRTT", baseline.averageRTT);
                    profile.put("firstSeen", baseline.firstSeen);
                    profile.put("lastSeen", baseline.lastSeen);
                    profile.put("timesConnected", baseline.timesConnected);
                    profile.put("isTrusted", baseline.isTrusted);
                }
                
                JSObject response = new JSObject();
                response.put("success", true);
                response.put("profile", profile);
                call.resolve(response);
            } catch (Exception e) {
                call.reject("Failed to get network profile: " + e.getMessage());
            }
        });
    }

    @PluginMethod
    public void markTrusted(PluginCall call) {
        executorService.execute(() -> {
            try {
                String ssid = call.getString("ssid");
                String bssid = call.getString("bssid");
                
                if (ssid == null || bssid == null) {
                    call.reject("SSID and BSSID are required");
                    return;
                }
                
                database.markAsTrusted(ssid, bssid);
                
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } catch (Exception e) {
                call.reject("Failed to mark as trusted: " + e.getMessage());
            }
        });
    }

    @PluginMethod
    public void markEvilTwin(PluginCall call) {
        executorService.execute(() -> {
            try {
                String ssid = call.getString("ssid");
                String bssid = call.getString("bssid");
                String reason = call.getString("reason", "User reported");
                
                if (ssid == null || bssid == null) {
                    call.reject("SSID and BSSID are required");
                    return;
                }
                
                database.markAsEvilTwin(ssid, bssid, reason);
                
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } catch (Exception e) {
                call.reject("Failed to mark as evil twin: " + e.getMessage());
            }
        });
    }

    @PluginMethod
    public void getKnownEvilTwins(PluginCall call) {
        executorService.execute(() -> {
            try {
                List<NetworkSecurityDatabase.KnownEvilTwin> evilTwins = database.getKnownEvilTwins();
                
                JSArray evilTwinsArray = new JSArray();
                for (NetworkSecurityDatabase.KnownEvilTwin twin : evilTwins) {
                    JSObject twinObj = new JSObject();
                    twinObj.put("id", twin.id);
                    twinObj.put("ssid", twin.ssid);
                    twinObj.put("bssid", twin.bssid);
                    twinObj.put("reason", twin.reason);
                    twinObj.put("firstDetected", twin.firstDetected);
                    twinObj.put("lastDetected", twin.lastDetected);
                    twinObj.put("timesDetected", twin.timesDetected);
                    evilTwinsArray.put(twinObj);
                }
                
                JSObject response = new JSObject();
                response.put("success", true);
                response.put("evilTwins", evilTwinsArray);
                call.resolve(response);
            } catch (Exception e) {
                call.reject("Failed to get evil twins: " + e.getMessage());
            }
        });
    }

    @PluginMethod
    public void enableAutoMonitor(PluginCall call) {
        try {
            if (!autoMonitorEnabled) {
                IntentFilter filter = new IntentFilter();
                filter.addAction(WifiManager.NETWORK_STATE_CHANGED_ACTION);
                filter.addAction(WifiManager.SUPPLICANT_STATE_CHANGED_ACTION);
                filter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
                
                getContext().registerReceiver(wifiStateMonitor, filter);
                autoMonitorEnabled = true;
            }
            
            JSObject response = new JSObject();
            response.put("success", true);
            call.resolve(response);
        } catch (Exception e) {
            call.reject("Failed to enable auto monitor: " + e.getMessage());
        }
    }

    @PluginMethod
    public void disableAutoMonitor(PluginCall call) {
        try {
            if (autoMonitorEnabled) {
                getContext().unregisterReceiver(wifiStateMonitor);
                autoMonitorEnabled = false;
            }
            
            JSObject response = new JSObject();
            response.put("success", true);
            call.resolve(response);
        } catch (Exception e) {
            call.reject("Failed to disable auto monitor: " + e.getMessage());
        }
    }

    @PluginMethod
    public void isAutoMonitorEnabled(PluginCall call) {
        JSObject response = new JSObject();
        response.put("enabled", autoMonitorEnabled);
        call.resolve(response);
    }

    @PluginMethod
    public void getCurrentNetworkInfo(PluginCall call) {
        executorService.execute(() -> {
            try {
                WifiManager wifiManager = (WifiManager) getContext().getApplicationContext()
                    .getSystemService(Context.WIFI_SERVICE);
                WifiInfo wifiInfo = wifiManager.getConnectionInfo();
                
                if (wifiInfo == null) {
                    call.reject("Not connected to WiFi");
                    return;
                }
                
                String ssid = wifiInfo.getSSID().replace("\"", "");
                String bssid = wifiInfo.getBSSID();
                int rssi = wifiInfo.getRssi();
                int frequency = wifiInfo.getFrequency();
                
                // Get gateway info
                DhcpInfo dhcp = wifiManager.getDhcpInfo();
                String gatewayIP = intToIpAddress(dhcp.gateway);
                
                // Check if baseline exists
                NetworkSecurityDatabase.NetworkBaseline baseline = database.getBaseline(ssid, bssid);
                
                JSObject network = new JSObject();
                network.put("ssid", ssid);
                network.put("bssid", bssid);
                network.put("rssi", rssi);
                network.put("frequency", frequency);
                network.put("gatewayIP", gatewayIP);
                network.put("hasTrustedBaseline", baseline != null && baseline.isTrusted);
                network.put("isKnownEvilTwin", database.isKnownEvilTwin(bssid));
                
                if (baseline != null) {
                    network.put("timesConnected", baseline.timesConnected);
                    network.put("lastSeen", baseline.lastSeen);
                }
                
                JSObject response = new JSObject();
                response.put("success", true);
                response.put("network", network);
                call.resolve(response);
            } catch (Exception e) {
                call.reject("Failed to get network info: " + e.getMessage());
            }
        });
    }

    @PluginMethod
    public void clearHistory(PluginCall call) {
        executorService.execute(() -> {
            try {
                database.clearHistory();
                
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } catch (Exception e) {
                call.reject("Failed to clear history: " + e.getMessage());
            }
        });
    }

    // Helper method to convert scan result to JSObject
    private JSObject convertScanResultToJS(EvilTwinDetector.EvilTwinScanResult result) {
        JSObject response = new JSObject();
        response.put("success", true);
        response.put("threatScore", result.threatScore);
        response.put("threatLevel", result.threatLevel);
        response.put("ssid", result.ssid);
        response.put("bssid", result.bssid);
        response.put("scanTimestamp", result.scanTimestamp);
        response.put("scanDurationMs", result.scanDurationMs);
        
        // Indicators
        JSArray indicatorsArray = new JSArray();
        for (EvilTwinDetector.ThreatIndicator indicator : result.indicators) {
            JSObject indicatorObj = new JSObject();
            indicatorObj.put("type", indicator.type);
            indicatorObj.put("severity", indicator.severity);
            indicatorObj.put("description", indicator.description);
            indicatorsArray.put(indicatorObj);
        }
        response.put("indicators", indicatorsArray);
        
        // WiFi Analysis
        if (result.wifiAnalysis != null) {
            JSObject wifiAnalysis = new JSObject();
            wifiAnalysis.put("duplicateCount", result.wifiAnalysis.duplicateCount);
            wifiAnalysis.put("securityDowngrade", result.wifiAnalysis.securityDowngrade);
            wifiAnalysis.put("signalAnomaly", result.wifiAnalysis.signalAnomaly);
            
            JSArray duplicatesArray = new JSArray();
            for (WiFiScanAnalyzer.DuplicateAP dup : result.wifiAnalysis.duplicates) {
                JSObject dupObj = new JSObject();
                dupObj.put("bssid", dup.bssid);
                dupObj.put("signalLevel", dup.signalLevel);
                dupObj.put("security", dup.security);
                dupObj.put("frequency", dup.frequency);
                dupObj.put("channel", dup.channel);
                dupObj.put("vendorOUI", dup.vendorOUI);
                duplicatesArray.put(dupObj);
            }
            wifiAnalysis.put("duplicates", duplicatesArray);
            response.put("wifiAnalysis", wifiAnalysis);
        }
        
        // Gateway Check
        if (result.gatewayCheck != null) {
            JSObject gatewayCheck = new JSObject();
            gatewayCheck.put("gatewayIP", result.gatewayCheck.gatewayIP);
            gatewayCheck.put("gatewayMAC", result.gatewayCheck.gatewayMAC);
            gatewayCheck.put("macChanged", result.gatewayCheck.macChanged);
            gatewayCheck.put("possibleARPSpoof", result.gatewayCheck.possibleARPSpoof);
            gatewayCheck.put("dhcpServer", result.gatewayCheck.dhcpServer);
            gatewayCheck.put("dhcpChanged", result.gatewayCheck.dhcpChanged);
            if (result.gatewayCheck.previousMAC != null) {
                gatewayCheck.put("previousMAC", result.gatewayCheck.previousMAC);
            }
            response.put("gatewayCheck", gatewayCheck);
        }
        
        // DNS Check
        if (result.dnsCheck != null) {
            JSObject dnsCheck = new JSObject();
            dnsCheck.put("dnsHijacked", result.dnsCheck.dnsHijacked);
            dnsCheck.put("allSameIP", result.dnsCheck.allSameIP);
            
            JSArray testsArray = new JSArray();
            for (NetworkIntegrityChecker.DNSTest test : result.dnsCheck.tests) {
                JSObject testObj = new JSObject();
                testObj.put("domain", test.domain);
                testObj.put("resolvedIP", test.resolvedIP);
                testObj.put("expectedRange", test.expectedRange);
                testObj.put("passed", test.passed);
                testsArray.put(testObj);
            }
            dnsCheck.put("tests", testsArray);
            response.put("dnsCheck", dnsCheck);
        }
        
        // SSL Check
        if (result.sslCheck != null) {
            JSObject sslCheck = new JSObject();
            sslCheck.put("sslIntercepted", result.sslCheck.sslIntercepted);
            
            JSArray testsArray = new JSArray();
            for (NetworkIntegrityChecker.SSLTest test : result.sslCheck.tests) {
                JSObject testObj = new JSObject();
                testObj.put("url", test.url);
                testObj.put("issuer", test.issuer);
                testObj.put("valid", test.valid);
                testObj.put("trusted", test.trusted);
                testsArray.put(testObj);
            }
            sslCheck.put("tests", testsArray);
            response.put("sslCheck", sslCheck);
        }
        
        // RTT Check
        if (result.rttCheck != null) {
            JSObject rttCheck = new JSObject();
            rttCheck.put("averageRTT", result.rttCheck.averageRTT);
            rttCheck.put("anomalyDetected", result.rttCheck.anomalyDetected);
            rttCheck.put("baselineRTT", result.rttCheck.baselineRTT);
            
            JSArray testsArray = new JSArray();
            for (NetworkIntegrityChecker.PingTest test : result.rttCheck.tests) {
                JSObject testObj = new JSObject();
                testObj.put("target", test.target);
                testObj.put("rttMs", test.rttMs);
                testObj.put("reachable", test.reachable);
                testsArray.put(testObj);
            }
            rttCheck.put("tests", testsArray);
            response.put("rttCheck", rttCheck);
        }
        
        return response;
    }

    private String intToIpAddress(int ip) {
        return String.format("%d.%d.%d.%d",
            (ip & 0xff),
            (ip >> 8 & 0xff),
            (ip >> 16 & 0xff),
            (ip >> 24 & 0xff));
    }

    // ============ DNS Shield Methods ============

    @PluginMethod
    public void getDNSShieldStatus(PluginCall call) {
        executorService.execute(() -> {
            try {
                DNSShieldManager.DNSShieldStatus status = detector.getDNSShieldManager().getStatus();
                
                JSObject response = new JSObject();
                response.put("success", true);
                response.put("shieldStatus", status.shieldStatus);
                response.put("appLevelDoHEnabled", status.appLevelDoHEnabled);
                response.put("activeProvider", status.activeProvider);
                response.put("cachedEntries", status.cachedEntries);
                response.put("autoActivateEnabled", status.autoActivateEnabled);
                response.put("activationThreshold", status.activationThreshold);
                
                // System Private DNS
                JSObject privateDNS = new JSObject();
                privateDNS.put("supported", status.systemPrivateDNS.supported);
                privateDNS.put("enabled", status.systemPrivateDNS.enabled);
                privateDNS.put("mode", status.systemPrivateDNS.mode);
                privateDNS.put("serverHostname", status.systemPrivateDNS.serverHostname);
                privateDNS.put("active", status.systemPrivateDNS.active);
                response.put("systemPrivateDNS", privateDNS);
                
                call.resolve(response);
            } catch (Exception e) {
                call.reject("Failed to get DNS shield status: " + e.getMessage());
            }
        });
    }

    @PluginMethod
    public void enableDNSShield(PluginCall call) {
        executorService.execute(() -> {
            try {
                detector.getDNSShieldManager().enableShield();
                
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } catch (Exception e) {
                call.reject("Failed to enable DNS shield: " + e.getMessage());
            }
        });
    }

    @PluginMethod
    public void disableDNSShield(PluginCall call) {
        executorService.execute(() -> {
            try {
                detector.getDNSShieldManager().disableShield();
                
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } catch (Exception e) {
                call.reject("Failed to disable DNS shield: " + e.getMessage());
            }
        });
    }

    @PluginMethod
    public void setDNSProvider(PluginCall call) {
        executorService.execute(() -> {
            try {
                String provider = call.getString("provider", "cloudflare");
                detector.getDNSShieldManager().setProvider(provider);
                
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } catch (Exception e) {
                call.reject("Failed to set DNS provider: " + e.getMessage());
            }
        });
    }

    @PluginMethod
    public void runDNSLeakTest(PluginCall call) {
        executorService.execute(() -> {
            try {
                DNSShieldManager.DNSLeakTestResult result = detector.getDNSShieldManager().runDNSLeakTest();
                
                JSObject response = new JSObject();
                response.put("success", result.success);
                response.put("leakDetected", result.leakDetected);
                response.put("dnsServersAreTrusted", result.dnsServersAreTrusted);
                response.put("resultsConsistent", result.resultsConsistent);
                response.put("summary", result.summary);
                
                // System DNS servers
                JSArray serversArray = new JSArray();
                for (String server : result.systemDNSServers) {
                    serversArray.put(server);
                }
                response.put("systemDNSServers", serversArray);
                
                // Comparisons
                JSArray comparisonsArray = new JSArray();
                for (DNSShieldManager.DNSComparisonResult comp : result.comparisons) {
                    JSObject compObj = new JSObject();
                    compObj.put("domain", comp.domain);
                    compObj.put("match", comp.match);
                    compObj.put("systemHijacked", comp.systemHijacked);
                    
                    JSArray dohIPsArray = new JSArray();
                    for (String ip : comp.dohIPs) {
                        dohIPsArray.put(ip);
                    }
                    compObj.put("dohIPs", dohIPsArray);
                    
                    JSArray systemIPsArray = new JSArray();
                    for (String ip : comp.systemIPs) {
                        systemIPsArray.put(ip);
                    }
                    compObj.put("systemIPs", systemIPsArray);
                    
                    comparisonsArray.put(compObj);
                }
                response.put("comparisons", comparisonsArray);
                
                call.resolve(response);
            } catch (Exception e) {
                call.reject("DNS leak test failed: " + e.getMessage());
            }
        });
    }

    @PluginMethod
    public void resolveDomain(PluginCall call) {
        executorService.execute(() -> {
            try {
                String domain = call.getString("domain");
                boolean useDoH = call.getBoolean("encrypted", true);
                
                if (domain == null) {
                    call.reject("Domain is required");
                    return;
                }
                
                EncryptedDNSResolver.DNSResolutionResult result;
                if (useDoH) {
                    result = detector.getDNSShieldManager().getDnsResolver().resolveDoHWithDetails(domain);
                } else {
                    // System DNS resolution
                    result = new EncryptedDNSResolver.DNSResolutionResult();
                    result.hostname = domain;
                    result.encrypted = false;
                    result.providerUsed = "SystemDNS";
                    long startTime = System.currentTimeMillis();
                    try {
                        java.net.InetAddress[] addresses = java.net.InetAddress.getAllByName(domain);
                        result.resolvedIPs = new java.util.ArrayList<>();
                        for (java.net.InetAddress addr : addresses) {
                            result.resolvedIPs.add(addr.getHostAddress());
                        }
                        result.success = true;
                    } catch (Exception e) {
                        result.success = false;
                        result.error = e.getMessage();
                    }
                    result.resolutionTimeMs = System.currentTimeMillis() - startTime;
                }
                
                JSObject response = new JSObject();
                response.put("success", result.success);
                response.put("hostname", result.hostname);
                response.put("provider", result.providerUsed);
                response.put("resolutionTimeMs", result.resolutionTimeMs);
                response.put("encrypted", result.encrypted);
                response.put("ttl", result.ttl);
                
                if (result.success && result.resolvedIPs != null) {
                    JSArray ipsArray = new JSArray();
                    for (String ip : result.resolvedIPs) {
                        ipsArray.put(ip);
                    }
                    response.put("resolvedIPs", ipsArray);
                } else {
                    response.put("error", result.error);
                }
                
                call.resolve(response);
            } catch (Exception e) {
                call.reject("Domain resolution failed: " + e.getMessage());
            }
        });
    }

    @PluginMethod
    public void setAutoActivate(PluginCall call) {
        executorService.execute(() -> {
            try {
                boolean enabled = call.getBoolean("enabled", true);
                int threshold = call.getInt("threshold", 40);
                
                detector.getDNSShieldManager().setAutoActivate(enabled);
                detector.getDNSShieldManager().setActivationThreshold(threshold);
                
                JSObject response = new JSObject();
                response.put("success", true);
                call.resolve(response);
            } catch (Exception e) {
                call.reject("Failed to set auto-activate: " + e.getMessage());
            }
        });
    }

    @PluginMethod
    public void getSystemPrivateDNSStatus(PluginCall call) {
        executorService.execute(() -> {
            try {
                DNSShieldManager.PrivateDNSStatus status = detector.getDNSShieldManager().checkSystemPrivateDNS();
                
                JSObject response = new JSObject();
                response.put("success", true);
                response.put("supported", status.supported);
                response.put("enabled", status.enabled);
                response.put("mode", status.mode);
                response.put("serverHostname", status.serverHostname);
                response.put("active", status.active);
                
                call.resolve(response);
            } catch (Exception e) {
                call.reject("Failed to get Private DNS status: " + e.getMessage());
            }
        });
    }

    @PluginMethod
    public void openPrivateDNSSettings(PluginCall call) {
        try {
            detector.getDNSShieldManager().openSystemPrivateDNSSettings();
            
            JSObject response = new JSObject();
            response.put("success", true);
            call.resolve(response);
        } catch (Exception e) {
            call.reject("Failed to open Private DNS settings: " + e.getMessage());
        }
    }
}

