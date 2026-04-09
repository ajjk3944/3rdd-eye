package app.thirdeye.scanner.eviltwin;

import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONObject;

public class EncryptedDNSResolver {
    private static final String TAG = "EncryptedDNSResolver";
    private static final long CACHE_TTL_MS = 5 * 60 * 1000; // 5 minutes

    public enum DoHProvider {
        CLOUDFLARE("https://cloudflare-dns.com/dns-query", "Cloudflare", "1.1.1.1"),
        GOOGLE("https://dns.google/resolve", "Google", "8.8.8.8"),
        QUAD9("https://dns.quad9.net:5053/dns-query", "Quad9", "9.9.9.9");

        public final String url;
        public final String name;
        public final String bootstrapIP;

        DoHProvider(String url, String name, String bootstrapIP) {
            this.url = url;
            this.name = name;
            this.bootstrapIP = bootstrapIP;
        }
    }

    private DoHProvider primaryProvider = DoHProvider.CLOUDFLARE;
    private DoHProvider fallbackProvider = DoHProvider.GOOGLE;
    private boolean enabled = false;
    private final Map<String, CachedDNSResult> cache = new ConcurrentHashMap<>();

    public EncryptedDNSResolver() {
        Log.i(TAG, "EncryptedDNSResolver initialized with provider: " + primaryProvider.name);
    }

    public List<InetAddress> resolveDoH(String hostname) throws Exception {
        if (!enabled) {
            Log.d(TAG, "DoH disabled, using system DNS for: " + hostname);
            return Arrays.asList(InetAddress.getAllByName(hostname));
        }

        // Check cache first
        CachedDNSResult cached = cache.get(hostname);
        if (cached != null && !cached.isExpired()) {
            Log.d(TAG, "Cache hit for: " + hostname);
            return cached.addresses;
        }

        // Try primary provider
        try {
            List<InetAddress> result = tryProvider(primaryProvider, hostname);
            cache.put(hostname, new CachedDNSResult(result, System.currentTimeMillis()));
            return result;
        } catch (Exception e) {
            Log.w(TAG, "Primary provider failed, trying fallback: " + e.getMessage());
            // Try fallback provider
            try {
                List<InetAddress> result = tryProvider(fallbackProvider, hostname);
                cache.put(hostname, new CachedDNSResult(result, System.currentTimeMillis()));
                return result;
            } catch (Exception e2) {
                Log.e(TAG, "Both DoH providers failed, falling back to system DNS", e2);
                return Arrays.asList(InetAddress.getAllByName(hostname));
            }
        }
    }

    private List<InetAddress> tryProvider(DoHProvider provider, String hostname) throws Exception {
        String queryUrl = provider.url + "?name=" + hostname + "&type=A";
        Log.d(TAG, "Querying DoH: " + queryUrl);

        URL url = new URL(queryUrl);
        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
        try {
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/dns-json");
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);

            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                throw new Exception("DoH query failed with code: " + responseCode);
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            String jsonStr = response.toString();
            JSONObject json = new JSONObject(jsonStr);

            int status = json.getInt("Status");
            if (status != 0) {
                throw new Exception("DNS query returned error status: " + status);
            }

            if (!json.has("Answer")) {
                throw new Exception("No Answer section in DNS response");
            }

            JSONArray answers = json.getJSONArray("Answer");
            List<InetAddress> addresses = new ArrayList<>();

            for (int i = 0; i < answers.length(); i++) {
                JSONObject answer = answers.getJSONObject(i);
                int type = answer.getInt("type");
                if (type == 1) { // A record (IPv4)
                    String ip = answer.getString("data");
                    addresses.add(InetAddress.getByName(ip));
                }
            }

            if (addresses.isEmpty()) {
                throw new Exception("No A records found in DNS response");
            }

            Log.i(TAG, "DoH resolved " + hostname + " to " + addresses.size() + " addresses via " + provider.name);
            return addresses;

        } finally {
            conn.disconnect();
        }
    }

    public DNSResolutionResult resolveDoHWithDetails(String hostname) {
        DNSResolutionResult result = new DNSResolutionResult();
        result.hostname = hostname;
        result.encrypted = enabled;
        long startTime = System.currentTimeMillis();

        try {
            List<InetAddress> addresses = resolveDoH(hostname);
            result.resolvedIPs = new ArrayList<>();
            for (InetAddress addr : addresses) {
                result.resolvedIPs.add(addr.getHostAddress());
            }
            result.providerUsed = enabled ? primaryProvider.name : "SystemFallback";
            result.resolutionTimeMs = System.currentTimeMillis() - startTime;
            result.success = true;
            result.ttl = 300; // Default TTL
        } catch (Exception e) {
            result.success = false;
            result.error = e.getMessage();
            result.resolutionTimeMs = System.currentTimeMillis() - startTime;
            Log.e(TAG, "DNS resolution failed for " + hostname, e);
        }

        return result;
    }

    public void setProvider(DoHProvider provider) {
        this.primaryProvider = provider;
        Log.i(TAG, "DoH provider changed to: " + provider.name);
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
        Log.i(TAG, "DoH " + (enabled ? "enabled" : "disabled"));
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void clearCache() {
        cache.clear();
        Log.i(TAG, "DNS cache cleared");
    }

    public int getCacheSize() {
        return cache.size();
    }

    public DoHProvider getPrimaryProvider() {
        return primaryProvider;
    }

    // Inner classes
    private static class CachedDNSResult {
        final List<InetAddress> addresses;
        final long timestamp;

        CachedDNSResult(List<InetAddress> addresses, long timestamp) {
            this.addresses = addresses;
            this.timestamp = timestamp;
        }

        boolean isExpired() {
            return System.currentTimeMillis() - timestamp > CACHE_TTL_MS;
        }
    }

    public static class DNSResolutionResult {
        public String hostname;
        public List<String> resolvedIPs;
        public String providerUsed;
        public long resolutionTimeMs;
        public boolean encrypted;
        public int ttl;
        public boolean success;
        public String error;
    }
}
