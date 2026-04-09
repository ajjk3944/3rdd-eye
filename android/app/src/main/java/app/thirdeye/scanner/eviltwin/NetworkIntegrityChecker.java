package app.thirdeye.scanner.eviltwin;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import java.net.URL;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;

public class NetworkIntegrityChecker {

    public NetworkIntegrityChecker() {
    }

    public DNSCheckResult checkDNSIntegrity() {
        DNSCheckResult result = new DNSCheckResult();
        result.tests = new ArrayList<>();
        Set<String> resolvedIPs = new HashSet<>();
        int privateIPCount = 0;
        int failCount = 0;

        // Test domains - removed hardcoded IP ranges
        String[] testDomains = {
            "www.google.com", "www.cloudflare.com", "www.microsoft.com",
            "www.amazon.com", "www.apple.com"
        };

        for (String domain : testDomains) {
            DNSTest dnsTest = new DNSTest();
            dnsTest.domain = domain;
            dnsTest.expectedRange = "Public IP";

            try {
                InetAddress[] addresses = InetAddress.getAllByName(domain);
                if (addresses.length > 0) {
                    dnsTest.resolvedIP = addresses[0].getHostAddress();
                    resolvedIPs.add(dnsTest.resolvedIP);

                    // Check if resolved to private IP (REAL hijack indicator)
                    if (isPrivateIP(dnsTest.resolvedIP)) {
                        dnsTest.passed = false;
                        privateIPCount++;
                    } else {
                        // Public IP = OK, regardless of specific range
                        dnsTest.passed = true;
                    }
                } else {
                    dnsTest.passed = false;
                    failCount++;
                }
            } catch (Exception e) {
                dnsTest.resolvedIP = "failed";
                dnsTest.passed = false;
                failCount++;
            }

            result.tests.add(dnsTest);
        }

        // Only flag hijacked if MAJORITY resolve to private IPs (2+ out of 5)
        result.dnsHijacked = (privateIPCount >= 2);

        // Check if all domains resolve to same IP (captive portal indicator)
        result.allSameIP = (resolvedIPs.size() == 1 && result.tests.size() > 1 && failCount == 0);

        return result;
    }

    public SSLCheckResult checkSSLIntegrity() {
        SSLCheckResult result = new SSLCheckResult();
        result.tests = new ArrayList<>();

        String[] testURLs = {
            "https://www.google.com",
            "https://www.cloudflare.com",
            "https://1.1.1.1"
        };

        // Known trusted CAs - expanded list
        String[] trustedCAs = {
            "DigiCert", "Let's Encrypt", "ISRG Root", "Google Trust", 
            "GlobalSign", "Cloudflare", "Amazon", "Microsoft",
            "GeoTrust", "Sectigo", "Comodo", "Go Daddy", "GoDaddy",
            "Entrust", "Thawte", "VeriSign", "Baltimore",
            "Starfield", "QuoVadis", "SwissSign", "Buypass",
            "T-Systems", "WR2", "WE1", "WR3", "GTS CA"
        };

        for (String urlString : testURLs) {
            SSLTest sslTest = new SSLTest();
            sslTest.url = urlString;

            try {
                URL url = new URL(urlString);
                HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);
                connection.connect();

                Certificate[] certificates = connection.getServerCertificates();
                if (certificates.length > 0 && certificates[0] instanceof X509Certificate) {
                    X509Certificate cert = (X509Certificate) certificates[0];
                    String issuer = cert.getIssuerDN().getName();
                    sslTest.issuer = issuer;

                    // Check if issuer is trusted
                    boolean trusted = false;
                    for (String ca : trustedCAs) {
                        if (issuer.contains(ca)) {
                            trusted = true;
                            break;
                        }
                    }

                    // Check validity
                    try {
                        cert.checkValidity();
                        sslTest.valid = true;
                    } catch (Exception e) {
                        sslTest.valid = false;
                    }

                    sslTest.trusted = trusted;

                    if (!trusted || !sslTest.valid) {
                        result.sslIntercepted = true;
                    }
                } else {
                    sslTest.trusted = false;
                    result.sslIntercepted = true;
                }

                connection.disconnect();
            } catch (javax.net.ssl.SSLHandshakeException e) {
                // SSL handshake failed = possible interception
                sslTest.issuer = "SSL handshake failed";
                sslTest.valid = false;
                sslTest.trusted = false;
                result.sslIntercepted = true;
            } catch (java.net.SocketTimeoutException e) {
                // Timeout = network issue, NOT interception
                sslTest.issuer = "timeout";
                sslTest.valid = false;
                sslTest.trusted = false;
                // Do NOT set sslIntercepted for timeouts
            } catch (Exception e) {
                // General error = network issue, NOT interception
                sslTest.issuer = "error: " + e.getMessage();
                sslTest.valid = false;
                sslTest.trusted = false;
                // Do NOT set sslIntercepted
            }

            result.tests.add(sslTest);
        }

        return result;
    }

    public RTTResult measureRTT() {
        RTTResult result = new RTTResult();
        result.tests = new ArrayList<>();

        String[] targets = {
            "8.8.8.8",      // Google DNS
            "1.1.1.1",      // Cloudflare DNS
            "208.67.222.222" // OpenDNS
        };

        long totalRTT = 0;
        int successCount = 0;
        int highRTTCount = 0;

        for (String target : targets) {
            PingTest pingTest = new PingTest();
            pingTest.target = target;

            try {
                InetAddress address = InetAddress.getByName(target);
                long start = System.nanoTime();
                boolean reachable = address.isReachable(3000);
                long rtt = (System.nanoTime() - start) / 1_000_000; // Convert to ms

                pingTest.reachable = reachable;
                pingTest.rttMs = rtt;

                if (reachable) {
                    totalRTT += rtt;
                    successCount++;

                    if (rtt > 500) {
                        highRTTCount++;
                    }
                }
            } catch (Exception e) {
                pingTest.reachable = false;
                pingTest.rttMs = -1;
            }

            result.tests.add(pingTest);
        }

        if (successCount > 0) {
            result.averageRTT = totalRTT / successCount;
        } else {
            result.averageRTT = -1;
        }

        // Anomaly if all targets have high RTT
        result.anomalyDetected = (highRTTCount == targets.length);

        result.baselineRTT = 0; // Will be set from database

        return result;
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

    // Result classes
    public static class DNSCheckResult {
        public boolean dnsHijacked;
        public List<DNSTest> tests;
        public boolean allSameIP;
    }

    public static class DNSTest {
        public String domain;
        public String resolvedIP;
        public String expectedRange;
        public boolean passed;
    }

    public static class SSLCheckResult {
        public boolean sslIntercepted;
        public List<SSLTest> tests;
    }

    public static class SSLTest {
        public String url;
        public String issuer;
        public boolean valid;
        public boolean trusted;
    }

    public static class RTTResult {
        public long averageRTT;
        public boolean anomalyDetected;
        public List<PingTest> tests;
        public long baselineRTT;
    }

    public static class PingTest {
        public String target;
        public long rttMs;
        public boolean reachable;
    }
}
