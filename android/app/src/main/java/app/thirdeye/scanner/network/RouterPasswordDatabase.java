package app.thirdeye.scanner.network;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Router Password Database - Contains default credentials for common routers
 * Based on "Who uses my wifi" app router password feature
 */
public class RouterPasswordDatabase {
    
    public static class RouterCredential {
        public final String brand;
        public final String model;
        public final String defaultUsername;
        public final String defaultPassword;
        
        public RouterCredential(String brand, String model, String defaultUsername, String defaultPassword) {
            this.brand = brand;
            this.model = model;
            this.defaultUsername = defaultUsername;
            this.defaultPassword = defaultPassword;
        }
    }
    
    private static List<RouterCredential> credentials = null;
    
    /**
     * Get all router credentials
     */
    public static List<RouterCredential> getAllCredentials() {
        if (credentials == null) {
            initializeDatabase();
        }
        return new ArrayList<>(credentials);
    }
    
    /**
     * Search credentials by brand or model
     */
    public static List<RouterCredential> searchCredentials(String query) {
        if (credentials == null) {
            initializeDatabase();
        }
        
        List<RouterCredential> results = new ArrayList<>();
        String lowerQuery = query.toLowerCase();
        
        for (RouterCredential cred : credentials) {
            if (cred.brand.toLowerCase().contains(lowerQuery) ||
                cred.model.toLowerCase().contains(lowerQuery)) {
                results.add(cred);
            }
        }
        
        return results;
    }
    
    /**
     * Get credentials by brand
     */
    public static List<RouterCredential> getCredentialsByBrand(String brand) {
        if (credentials == null) {
            initializeDatabase();
        }
        
        List<RouterCredential> results = new ArrayList<>();
        String lowerBrand = brand.toLowerCase();
        
        for (RouterCredential cred : credentials) {
            if (cred.brand.toLowerCase().equals(lowerBrand)) {
                results.add(cred);
            }
        }
        
        return results;
    }
    
    /**
     * Get all brands
     */
    public static List<String> getAllBrands() {
        if (credentials == null) {
            initializeDatabase();
        }
        
        Map<String, Boolean> brandMap = new HashMap<>();
        for (RouterCredential cred : credentials) {
            brandMap.put(cred.brand, true);
        }
        
        return new ArrayList<>(brandMap.keySet());
    }
    
    /**
     * Initialize the database with common router credentials
     */
    private static void initializeDatabase() {
        credentials = new ArrayList<>();
        
        // TP-Link
        credentials.add(new RouterCredential("TP-Link", "TL-WR740N", "admin", "admin"));
        credentials.add(new RouterCredential("TP-Link", "TL-WR841N", "admin", "admin"));
        credentials.add(new RouterCredential("TP-Link", "TL-WR940N", "admin", "admin"));
        credentials.add(new RouterCredential("TP-Link", "TL-WR1043ND", "admin", "admin"));
        credentials.add(new RouterCredential("TP-Link", "Archer C7", "admin", "admin"));
        credentials.add(new RouterCredential("TP-Link", "Archer C9", "admin", "admin"));
        credentials.add(new RouterCredential("TP-Link", "Archer A7", "admin", "admin"));
        credentials.add(new RouterCredential("TP-Link", "Deco M5", "admin", "admin"));
        
        // D-Link
        credentials.add(new RouterCredential("D-Link", "DIR-600", "admin", ""));
        credentials.add(new RouterCredential("D-Link", "DIR-615", "admin", ""));
        credentials.add(new RouterCredential("D-Link", "DIR-825", "admin", ""));
        credentials.add(new RouterCredential("D-Link", "DIR-842", "admin", ""));
        credentials.add(new RouterCredential("D-Link", "DIR-867", "admin", ""));
        credentials.add(new RouterCredential("D-Link", "DSL-2750U", "admin", "admin"));
        credentials.add(new RouterCredential("D-Link", "DSL-2730U", "admin", "admin"));
        
        // Linksys
        credentials.add(new RouterCredential("Linksys", "WRT54G", "admin", "admin"));
        credentials.add(new RouterCredential("Linksys", "WRT1900AC", "admin", "admin"));
        credentials.add(new RouterCredential("Linksys", "EA6350", "admin", "admin"));
        credentials.add(new RouterCredential("Linksys", "EA7500", "admin", "admin"));
        credentials.add(new RouterCredential("Linksys", "E1200", "admin", "admin"));
        credentials.add(new RouterCredential("Linksys", "E2500", "admin", "admin"));
        credentials.add(new RouterCredential("Linksys", "Velop", "admin", "admin"));
        
        // Netgear
        credentials.add(new RouterCredential("Netgear", "R6250", "admin", "password"));
        credentials.add(new RouterCredential("Netgear", "R6400", "admin", "password"));
        credentials.add(new RouterCredential("Netgear", "R7000", "admin", "password"));
        credentials.add(new RouterCredential("Netgear", "R8000", "admin", "password"));
        credentials.add(new RouterCredential("Netgear", "Nighthawk", "admin", "password"));
        credentials.add(new RouterCredential("Netgear", "Orbi", "admin", "password"));
        credentials.add(new RouterCredential("Netgear", "WNDR3400", "admin", "password"));
        credentials.add(new RouterCredential("Netgear", "WNDR4500", "admin", "password"));
        
        // ASUS
        credentials.add(new RouterCredential("ASUS", "RT-N12", "admin", "admin"));
        credentials.add(new RouterCredential("ASUS", "RT-N66U", "admin", "admin"));
        credentials.add(new RouterCredential("ASUS", "RT-AC66U", "admin", "admin"));
        credentials.add(new RouterCredential("ASUS", "RT-AC68U", "admin", "admin"));
        credentials.add(new RouterCredential("ASUS", "RT-AC86U", "admin", "admin"));
        credentials.add(new RouterCredential("ASUS", "RT-AC88U", "admin", "admin"));
        credentials.add(new RouterCredential("ASUS", "RT-AX88U", "admin", "admin"));
        credentials.add(new RouterCredential("ASUS", "ZenWiFi", "admin", "admin"));
        
        // Belkin
        credentials.add(new RouterCredential("Belkin", "F5D7234-4", "admin", ""));
        credentials.add(new RouterCredential("Belkin", "F7D2301", "admin", ""));
        credentials.add(new RouterCredential("Belkin", "F9K1002", "admin", ""));
        credentials.add(new RouterCredential("Belkin", "F9K1105", "admin", ""));
        credentials.add(new RouterCredential("Belkin", "N300", "admin", ""));
        credentials.add(new RouterCredential("Belkin", "N600", "admin", ""));
        
        // Cisco
        credentials.add(new RouterCredential("Cisco", "E1000", "admin", "admin"));
        credentials.add(new RouterCredential("Cisco", "E2500", "admin", "admin"));
        credentials.add(new RouterCredential("Cisco", "E3000", "admin", "admin"));
        credentials.add(new RouterCredential("Cisco", "E4200", "admin", "admin"));
        credentials.add(new RouterCredential("Cisco", "RV110W", "cisco", "cisco"));
        credentials.add(new RouterCredential("Cisco", "RV130W", "cisco", "cisco"));
        
        // Tenda
        credentials.add(new RouterCredential("Tenda", "N301", "admin", "admin"));
        credentials.add(new RouterCredential("Tenda", "AC6", "admin", "admin"));
        credentials.add(new RouterCredential("Tenda", "AC9", "admin", "admin"));
        credentials.add(new RouterCredential("Tenda", "AC15", "admin", "admin"));
        credentials.add(new RouterCredential("Tenda", "AC18", "admin", "admin"));
        
        // Xiaomi
        credentials.add(new RouterCredential("Xiaomi", "Mi Router 3", "admin", "admin"));
        credentials.add(new RouterCredential("Xiaomi", "Mi Router 3G", "admin", "admin"));
        credentials.add(new RouterCredential("Xiaomi", "Mi Router 4", "admin", "admin"));
        credentials.add(new RouterCredential("Xiaomi", "Mi Router 4A", "admin", "admin"));
        credentials.add(new RouterCredential("Xiaomi", "Mi Router AX3600", "admin", "admin"));
        
        // Huawei
        credentials.add(new RouterCredential("Huawei", "HG8245H", "admin", "admin"));
        credentials.add(new RouterCredential("Huawei", "HG8245Q", "admin", "admin"));
        credentials.add(new RouterCredential("Huawei", "HG8546M", "admin", "admin"));
        credentials.add(new RouterCredential("Huawei", "HG8247H", "admin", "admin"));
        credentials.add(new RouterCredential("Huawei", "B315", "admin", "admin"));
        credentials.add(new RouterCredential("Huawei", "B525", "admin", "admin"));
        
        // ZTE
        credentials.add(new RouterCredential("ZTE", "ZXHN H108N", "admin", "admin"));
        credentials.add(new RouterCredential("ZTE", "ZXHN H168N", "admin", "admin"));
        credentials.add(new RouterCredential("ZTE", "ZXHN F660", "admin", "admin"));
        credentials.add(new RouterCredential("ZTE", "MF283", "admin", "admin"));
        credentials.add(new RouterCredential("ZTE", "MF920", "admin", "admin"));
        
        // Motorola
        credentials.add(new RouterCredential("Motorola", "SBG6580", "admin", "motorola"));
        credentials.add(new RouterCredential("Motorola", "SBG6782", "admin", "motorola"));
        credentials.add(new RouterCredential("Motorola", "MG7540", "admin", "motorola"));
        credentials.add(new RouterCredential("Motorola", "MG7550", "admin", "motorola"));
        
        // Arris
        credentials.add(new RouterCredential("Arris", "TG862", "admin", "password"));
        credentials.add(new RouterCredential("Arris", "TG1672", "admin", "password"));
        credentials.add(new RouterCredential("Arris", "SBG6700", "admin", "password"));
        credentials.add(new RouterCredential("Arris", "SBG6900", "admin", "password"));
        
        // Ubiquiti
        credentials.add(new RouterCredential("Ubiquiti", "EdgeRouter X", "ubnt", "ubnt"));
        credentials.add(new RouterCredential("Ubiquiti", "EdgeRouter Lite", "ubnt", "ubnt"));
        credentials.add(new RouterCredential("Ubiquiti", "UniFi Dream Machine", "ubnt", "ubnt"));
        credentials.add(new RouterCredential("Ubiquiti", "AmpliFi", "ubnt", "ubnt"));
        
        // MikroTik
        credentials.add(new RouterCredential("MikroTik", "hAP ac", "admin", ""));
        credentials.add(new RouterCredential("MikroTik", "hAP lite", "admin", ""));
        credentials.add(new RouterCredential("MikroTik", "RB750", "admin", ""));
        credentials.add(new RouterCredential("MikroTik", "RB2011", "admin", ""));
        
        // Google
        credentials.add(new RouterCredential("Google", "Nest WiFi", "NOLOGIN", "NOLOGIN"));
        credentials.add(new RouterCredential("Google", "Google WiFi", "NOLOGIN", "NOLOGIN"));
        
        // Amazon
        credentials.add(new RouterCredential("Amazon", "eero", "NOLOGIN", "NOLOGIN"));
        credentials.add(new RouterCredential("Amazon", "eero Pro", "NOLOGIN", "NOLOGIN"));
        
        // 2Wire
        credentials.add(new RouterCredential("2Wire", "1000s", "NOLOGIN", "NOLOGIN"));
        credentials.add(new RouterCredential("2Wire", "1000sw", "NOLOGIN", "NOLOGIN"));
        credentials.add(new RouterCredential("2Wire", "1070-B", "NOLOGIN", "NOLOGIN"));
        credentials.add(new RouterCredential("2Wire", "1701HG", "NOLOGIN", "NOLOGIN"));
        credentials.add(new RouterCredential("2Wire", "1800HW", "NOLOGIN", "NOLOGIN"));
        credentials.add(new RouterCredential("2Wire", "2071-A", "Blank", "NOLOGIN"));
        credentials.add(new RouterCredential("2Wire", "2700HG-D", "NOLOGIN", "NOLOGIN"));
        credentials.add(new RouterCredential("2Wire", "2700HG-E", "NOLOGIN", "NOLOGIN"));
        credentials.add(new RouterCredential("2Wire", "2700HG-G", "NOLOGIN", "NOLOGIN"));
        
        // 1net1
        credentials.add(new RouterCredential("1net1", "R-90", "admin", "admin"));
        
        // 100Fio
        credentials.add(new RouterCredential("100Fio", "Station M5", "admin", "admin"));
        
        // Sort by brand
        credentials.sort((a, b) -> {
            int brandCompare = a.brand.compareTo(b.brand);
            if (brandCompare != 0) {
                return brandCompare;
            }
            return a.model.compareTo(b.model);
        });
    }
}
