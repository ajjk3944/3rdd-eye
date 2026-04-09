package app.thirdeye.scanner.sniffer;

import android.content.Context;
import android.util.Log;

import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.model.CountryResponse;

import java.io.InputStream;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GeoIPResolver {
    private static final String TAG = "GeoIPResolver";
    private static final String GEOIP_DB_FILE = "GeoLite2-Country.mmdb";

    private static GeoIPResolver instance;
    private DatabaseReader reader;
    private final Map<String, GeoInfo> cache = new HashMap<>();

    public static class GeoInfo {
        public String countryName;
        public String countryCode;
        public String continentName;

        public GeoInfo(String countryName, String countryCode, String continentName) {
            this.countryName = countryName;
            this.countryCode = countryCode;
            this.continentName = continentName;
        }
    }

    private GeoIPResolver() {
    }

    public static synchronized GeoIPResolver getInstance() {
        if (instance == null) {
            instance = new GeoIPResolver();
        }
        return instance;
    }

    /**
     * Initialize the GeoIP database
     */
    public void init(Context context) {
        if (reader != null) {
            Log.i(TAG, "GeoIP database already initialized");
            return;
        }

        try {
            InputStream inputStream = context.getAssets().open(GEOIP_DB_FILE);
            reader = new DatabaseReader.Builder(inputStream).build();
            Log.i(TAG, "GeoIP database initialized successfully");
        } catch (Exception e) {
            Log.e(TAG, "Error initializing GeoIP database", e);
        }
    }

    /**
     * Resolve IP address to country information
     */
    public GeoInfo resolve(String ipAddress) {
        if (ipAddress == null || ipAddress.isEmpty()) {
            return new GeoInfo("Unknown", "??", "Unknown");
        }

        // Check cache first
        if (cache.containsKey(ipAddress)) {
            return cache.get(ipAddress);
        }

        // Check for private IPs
        if (PacketParser.isPrivateIP(ipAddress)) {
            GeoInfo localInfo = new GeoInfo("Local Network", "LAN", "Local");
            cache.put(ipAddress, localInfo);
            return localInfo;
        }

        // Check for loopback
        if (ipAddress.startsWith("127.") || ipAddress.equals("::1")) {
            GeoInfo loopbackInfo = new GeoInfo("Localhost", "LO", "Local");
            cache.put(ipAddress, loopbackInfo);
            return loopbackInfo;
        }

        // Resolve using GeoIP database
        if (reader == null) {
            Log.w(TAG, "GeoIP database not initialized");
            return new GeoInfo("Unknown", "??", "Unknown");
        }

        try {
            InetAddress inetAddress = InetAddress.getByName(ipAddress);
            Optional<CountryResponse> response = reader.tryCountry(inetAddress);

            if (response.isPresent()) {
                CountryResponse country = response.get();
                String countryName = country.getCountry().getName();
                String countryCode = country.getCountry().getIsoCode();
                String continentName = country.getContinent().getName();

                if (countryName == null) countryName = "Unknown";
                if (countryCode == null) countryCode = "??";
                if (continentName == null) continentName = "Unknown";

                GeoInfo geoInfo = new GeoInfo(countryName, countryCode, continentName);
                cache.put(ipAddress, geoInfo);
                return geoInfo;
            } else {
                GeoInfo unknownInfo = new GeoInfo("Unknown", "??", "Unknown");
                cache.put(ipAddress, unknownInfo);
                return unknownInfo;
            }
        } catch (Exception e) {
            Log.w(TAG, "Error resolving IP: " + ipAddress, e);
            GeoInfo unknownInfo = new GeoInfo("Unknown", "??", "Unknown");
            cache.put(ipAddress, unknownInfo);
            return unknownInfo;
        }
    }

    /**
     * Clear the cache
     */
    public void clearCache() {
        cache.clear();
        Log.i(TAG, "GeoIP cache cleared");
    }

    /**
     * Close the database reader
     */
    public void close() {
        if (reader != null) {
            try {
                reader.close();
                reader = null;
                Log.i(TAG, "GeoIP database closed");
            } catch (Exception e) {
                Log.e(TAG, "Error closing GeoIP database", e);
            }
        }
    }
}
