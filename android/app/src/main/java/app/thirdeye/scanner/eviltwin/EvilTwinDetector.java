package app.thirdeye.scanner.eviltwin;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class EvilTwinDetector {
    private Context context;
    private WifiManager wifiManager;
    private WiFiScanAnalyzer wifiScanAnalyzer;
    private GatewayChecker gatewayChecker;
    private NetworkIntegrityChecker networkIntegrityChecker;
    private NetworkSecurityDatabase database;
    private DNSShieldManager dnsShieldManager;
    private ExecutorService executorService;

    public EvilTwinDetector(Context context) {
        this.context = context;
        this.wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        this.wifiScanAnalyzer = new WiFiScanAnalyzer(context);
        this.gatewayChecker = new GatewayChecker(context);
        this.networkIntegrityChecker = new NetworkIntegrityChecker();
        this.database = new NetworkSecurityDatabase(context);
        this.dnsShieldManager = new DNSShieldManager(context);
        this.executorService = Executors.newFixedThreadPool(4);
    }

    public EvilTwinScanResult runFullScan() {
        long startTime = System.currentTimeMillis();

        // Get current WiFi info
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
        String ssid = wifiInfo.getSSID().replace("\"", "");
        String bssid = wifiInfo.getBSSID();
        int rssi = wifiInfo.getRssi();
        int frequency = wifiInfo.getFrequency();
        int networkId = wifiInfo.getNetworkId();

        // Run checks in parallel
        WiFiScanAnalyzer.WiFiAnalysisResult wifiResult = null;
        GatewayChecker.GatewayCheckResult gatewayResult = null;
        NetworkIntegrityChecker.DNSCheckResult dnsResult = null;
        NetworkIntegrityChecker.SSLCheckResult sslResult = null;
        NetworkIntegrityChecker.RTTResult rttResult = null;

        try {
            Future<WiFiScanAnalyzer.WiFiAnalysisResult> wifiFuture = executorService.submit(
                () -> wifiScanAnalyzer.analyzeSurroundingNetworks(ssid, bssid)
            );
            Future<GatewayChecker.GatewayCheckResult> gatewayFuture = executorService.submit(
                () -> gatewayChecker.checkGateway()
            );
            Future<NetworkIntegrityChecker.DNSCheckResult> dnsFuture = executorService.submit(
                () -> networkIntegrityChecker.checkDNSIntegrity()
            );
            Future<NetworkIntegrityChecker.SSLCheckResult> sslFuture = executorService.submit(
                () -> networkIntegrityChecker.checkSSLIntegrity()
            );
            Future<NetworkIntegrityChecker.RTTResult> rttFuture = executorService.submit(
                () -> networkIntegrityChecker.measureRTT()
            );

            wifiResult = wifiFuture.get();
            gatewayResult = gatewayFuture.get();
            dnsResult = dnsFuture.get();
            sslResult = sslFuture.get();
            rttResult = rttFuture.get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Get baseline from database
        NetworkSecurityDatabase.NetworkBaseline baseline = database.getBaseline(ssid, bssid);

        // Check for baseline changes
        if (baseline != null && gatewayResult != null) {
            if (!baseline.gatewayMAC.equals(gatewayResult.gatewayMAC)) {
                gatewayResult.macChanged = true;
                gatewayResult.previousMAC = baseline.gatewayMAC;
            }
            if (!baseline.dhcpServer.equals(gatewayResult.dhcpServer)) {
                gatewayResult.dhcpChanged = true;
            }
            // Check RTT anomaly against baseline
            if (rttResult != null && baseline.averageRTT > 0) {
                rttResult.baselineRTT = baseline.averageRTT;
                if (rttResult.averageRTT > baseline.averageRTT * 2) {
                    rttResult.anomalyDetected = true;
                }
            }
        }

        // Calculate threat score
        int score = 0;
        List<ThreatIndicator> indicators = new ArrayList<>();

        // Duplicate SSID with different BSSID
        if (wifiResult != null && wifiResult.duplicateCount > 0) {
            score += 25;
            indicators.add(new ThreatIndicator("DUPLICATE_SSID", "HIGH",
                wifiResult.duplicateCount + " other access point(s) with same name detected"));
        }

        // Security downgrade
        if (wifiResult != null && wifiResult.securityDowngrade) {
            score += 20;
            indicators.add(new ThreatIndicator("SECURITY_DOWNGRADE", "HIGH",
                "A nearby clone uses weaker security than expected"));
        }

        // Signal strength anomaly
        if (wifiResult != null && wifiResult.signalAnomaly) {
            score += 10;
            indicators.add(new ThreatIndicator("SIGNAL_ANOMALY", "MEDIUM",
                "Abnormally strong signal from duplicate AP - possible high-power rogue device"));
        }

        // Gateway MAC changed
        if (gatewayResult != null && gatewayResult.macChanged) {
            score += 30;
            indicators.add(new ThreatIndicator("GATEWAY_MAC_CHANGED", "CRITICAL",
                "Router MAC address changed from " + gatewayResult.previousMAC + " - possible ARP spoofing"));
        }

        // ARP spoofing detected
        if (gatewayResult != null && gatewayResult.possibleARPSpoof) {
            score += 25;
            indicators.add(new ThreatIndicator("ARP_SPOOF", "CRITICAL",
                "Multiple IPs sharing same MAC address detected in ARP table"));
        }

        // DNS hijack
        if (dnsResult != null && dnsResult.dnsHijacked) {
            score += 25;
            indicators.add(new ThreatIndicator("DNS_HIJACK", "HIGH",
                "DNS resolution returning unexpected/private IPs - possible hijacking"));
        }

        if (dnsResult != null && dnsResult.allSameIP) {
            score += 15;
            indicators.add(new ThreatIndicator("CAPTIVE_PORTAL_REDIRECT", "MEDIUM",
                "All domains resolving to same IP - captive portal or DNS redirect"));
        }

        // SSL interception
        if (sslResult != null && sslResult.sslIntercepted) {
            score += 25;
            indicators.add(new ThreatIndicator("SSL_INTERCEPT", "HIGH",
                "HTTPS certificates from unknown/self-signed CA - possible MITM proxy"));
        }

        // RTT anomaly
        if (rttResult != null && rttResult.anomalyDetected) {
            score += 10;
            indicators.add(new ThreatIndicator("RTT_ANOMALY", "MEDIUM",
                "Network latency significantly higher than normal - traffic may be routed through attacker"));
        }

        // Run DNS leak test and add to threat assessment BEFORE capping
        DNSShieldManager.DNSLeakTestResult leakResult = dnsShieldManager.runDNSLeakTest();
        if (leakResult.leakDetected) {
            score += 15;
            indicators.add(new ThreatIndicator("DNS_LEAK", "HIGH",
                "DNS queries are not encrypted and may be intercepted. " +
                "System DNS servers: " + String.join(", ", leakResult.systemDNSServers)));
        }
        if (!leakResult.dnsServersAreTrusted) {
            score += 10;
            indicators.add(new ThreatIndicator("UNTRUSTED_DNS", "MEDIUM",
                "Device is using unknown DNS servers: " + String.join(", ", leakResult.systemDNSServers)));
        }

        // Single cap at 100 after all checks
        score = Math.min(score, 100);

        // Determine threat level
        String threatLevel;
        if (score < 20) threatLevel = "SAFE";
        else if (score < 40) threatLevel = "LOW_RISK";
        else if (score < 60) threatLevel = "MEDIUM_RISK";
        else if (score < 80) threatLevel = "HIGH_RISK";
        else threatLevel = "CRITICAL";

        long scanDuration = System.currentTimeMillis() - startTime;

        // Create result
        EvilTwinScanResult result = new EvilTwinScanResult(
            ssid, bssid, score, threatLevel, indicators,
            wifiResult, gatewayResult, dnsResult, sslResult, rttResult,
            System.currentTimeMillis(), scanDuration
        );

        // Save result to database
        database.saveScanResult(result);

        // Notify DNS Shield Manager of threat score update
        dnsShieldManager.onThreatScoreUpdated(score);

        // Save or update baseline if first time or trusted
        if (baseline == null) {
            database.saveOrUpdateBaseline(ssid, bssid, gatewayResult, rttResult);
        }

        return result;
    }

    public EvilTwinScanResult runQuickScan() {
        long startTime = System.currentTimeMillis();

        // Get current WiFi info
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
        String ssid = wifiInfo.getSSID().replace("\"", "");
        String bssid = wifiInfo.getBSSID();

        // Run quick checks (skip SSL and RTT)
        WiFiScanAnalyzer.WiFiAnalysisResult wifiResult = wifiScanAnalyzer.analyzeSurroundingNetworks(ssid, bssid);
        GatewayChecker.GatewayCheckResult gatewayResult = gatewayChecker.checkGateway();
        NetworkIntegrityChecker.DNSCheckResult dnsResult = networkIntegrityChecker.checkDNSIntegrity();

        // Get baseline
        NetworkSecurityDatabase.NetworkBaseline baseline = database.getBaseline(ssid, bssid);
        if (baseline != null && gatewayResult != null) {
            if (!baseline.gatewayMAC.equals(gatewayResult.gatewayMAC)) {
                gatewayResult.macChanged = true;
                gatewayResult.previousMAC = baseline.gatewayMAC;
            }
        }

        // Calculate threat score (simplified)
        int score = 0;
        List<ThreatIndicator> indicators = new ArrayList<>();

        if (wifiResult.duplicateCount > 0) {
            score += 25;
            indicators.add(new ThreatIndicator("DUPLICATE_SSID", "HIGH",
                wifiResult.duplicateCount + " other access point(s) with same name detected"));
        }
        if (wifiResult.securityDowngrade) {
            score += 20;
            indicators.add(new ThreatIndicator("SECURITY_DOWNGRADE", "HIGH",
                "A nearby clone uses weaker security than expected"));
        }
        if (gatewayResult.macChanged) {
            score += 30;
            indicators.add(new ThreatIndicator("GATEWAY_MAC_CHANGED", "CRITICAL",
                "Router MAC address changed - possible ARP spoofing"));
        }
        if (dnsResult.dnsHijacked) {
            score += 25;
            indicators.add(new ThreatIndicator("DNS_HIJACK", "HIGH",
                "DNS resolution returning unexpected IPs"));
        }

        score = Math.min(score, 100);
        String threatLevel = score < 20 ? "SAFE" : score < 60 ? "MEDIUM_RISK" : "HIGH_RISK";

        long scanDuration = System.currentTimeMillis() - startTime;

        return new EvilTwinScanResult(
            ssid, bssid, score, threatLevel, indicators,
            wifiResult, gatewayResult, dnsResult, null, null,
            System.currentTimeMillis(), scanDuration
        );
    }

    // Result class
    public static class EvilTwinScanResult {
        public String ssid;
        public String bssid;
        public int threatScore;
        public String threatLevel;
        public List<ThreatIndicator> indicators;
        public WiFiScanAnalyzer.WiFiAnalysisResult wifiAnalysis;
        public GatewayChecker.GatewayCheckResult gatewayCheck;
        public NetworkIntegrityChecker.DNSCheckResult dnsCheck;
        public NetworkIntegrityChecker.SSLCheckResult sslCheck;
        public NetworkIntegrityChecker.RTTResult rttCheck;
        public long scanTimestamp;
        public long scanDurationMs;

        public EvilTwinScanResult(String ssid, String bssid, int threatScore, String threatLevel,
                                 List<ThreatIndicator> indicators,
                                 WiFiScanAnalyzer.WiFiAnalysisResult wifiAnalysis,
                                 GatewayChecker.GatewayCheckResult gatewayCheck,
                                 NetworkIntegrityChecker.DNSCheckResult dnsCheck,
                                 NetworkIntegrityChecker.SSLCheckResult sslCheck,
                                 NetworkIntegrityChecker.RTTResult rttCheck,
                                 long scanTimestamp, long scanDurationMs) {
            this.ssid = ssid;
            this.bssid = bssid;
            this.threatScore = threatScore;
            this.threatLevel = threatLevel;
            this.indicators = indicators;
            this.wifiAnalysis = wifiAnalysis;
            this.gatewayCheck = gatewayCheck;
            this.dnsCheck = dnsCheck;
            this.sslCheck = sslCheck;
            this.rttCheck = rttCheck;
            this.scanTimestamp = scanTimestamp;
            this.scanDurationMs = scanDurationMs;
        }
    }

    // Threat indicator class
    public static class ThreatIndicator {
        public String type;
        public String severity;
        public String description;

        public ThreatIndicator(String type, String severity, String description) {
            this.type = type;
            this.severity = severity;
            this.description = description;
        }
    }

    public DNSShieldManager getDNSShieldManager() {
        return dnsShieldManager;
    }
}
