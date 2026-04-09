package app.thirdeye.scanner.routerguard;

import java.util.HashMap;

public class MACVendorResolver {
    private static MACVendorResolver instance;
    private HashMap<String, String> vendorMap;
    
    public static synchronized MACVendorResolver getInstance() {
        if (instance == null) {
            instance = new MACVendorResolver();
        }
        return instance;
    }
    
    private MACVendorResolver() {
        vendorMap = new HashMap<>();
        loadVendorDatabase();
    }
    
    public String resolve(String macAddress) {
        if (macAddress == null || macAddress.isEmpty()) {
            return "Unknown";
        }
        
        // Extract OUI (first 6 chars after removing separators)
        String oui = macAddress.replaceAll("[^A-Fa-f0-9]", "").substring(0, Math.min(6, macAddress.length())).toUpperCase();
        
        return vendorMap.getOrDefault(oui, "Unknown");
    }
    
    public String guessDeviceType(String vendor) {
        if (vendor == null || vendor.equals("Unknown")) {
            return "unknown";
        }
        
        String vendorLower = vendor.toLowerCase();
        
        // Phones
        if (vendorLower.contains("apple") || vendorLower.contains("iphone")) {
            return "phone";
        }
        if (vendorLower.contains("samsung") && !vendorLower.contains("display")) {
            return "phone";
        }
        if (vendorLower.contains("xiaomi") || vendorLower.contains("huawei") || 
            vendorLower.contains("oppo") || vendorLower.contains("vivo") ||
            vendorLower.contains("oneplus") || vendorLower.contains("realme") ||
            vendorLower.contains("google") && !vendorLower.contains("nest")) {
            return "phone";
        }
        
        // Laptops
        if (vendorLower.contains("intel") || vendorLower.contains("dell") ||
            vendorLower.contains("hp") && !vendorLower.contains("printer") ||
            vendorLower.contains("lenovo") || vendorLower.contains("asus") && vendorLower.contains("tek") ||
            vendorLower.contains("acer") || vendorLower.contains("microsoft")) {
            return "laptop";
        }
        
        // TVs
        if (vendorLower.contains("lg electronics") || vendorLower.contains("sony") ||
            vendorLower.contains("roku") || vendorLower.contains("tcl") ||
            vendorLower.contains("vizio") || vendorLower.contains("hisense")) {
            return "tv";
        }
        
        // Printers
        if (vendorLower.contains("canon") || vendorLower.contains("epson") ||
            vendorLower.contains("brother") || vendorLower.contains("printer")) {
            return "printer";
        }
        
        // IoT devices
        if (vendorLower.contains("amazon") || vendorLower.contains("ring") ||
            vendorLower.contains("nest") || vendorLower.contains("sonos") ||
            vendorLower.contains("philips") || vendorLower.contains("tp-link") ||
            vendorLower.contains("d-link") || vendorLower.contains("netgear") ||
            vendorLower.contains("raspberry") || vendorLower.contains("espressif") ||
            vendorLower.contains("tuya") || vendorLower.contains("wyze")) {
            return "iot";
        }
        
        // Cameras
        if (vendorLower.contains("hikvision") || vendorLower.contains("dahua") ||
            vendorLower.contains("axis") || vendorLower.contains("camera")) {
            return "camera";
        }
        
        // Tablets
        if (vendorLower.contains("ipad") || vendorLower.contains("tablet")) {
            return "tablet";
        }
        
        return "unknown";
    }
    
    private void loadVendorDatabase() {
        // Apple
        vendorMap.put("001CB3", "Apple, Inc.");
        vendorMap.put("3C15C2", "Apple, Inc.");
        vendorMap.put("ACBC32", "Apple, Inc.");
        vendorMap.put("F0DBE2", "Apple, Inc.");
        vendorMap.put("147DDA", "Apple, Inc.");
        vendorMap.put("A483E7", "Apple, Inc.");
        vendorMap.put("F8FFC2", "Apple, Inc.");
        vendorMap.put("DCA904", "Apple, Inc.");
        vendorMap.put("787B8A", "Apple, Inc.");
        vendorMap.put("40B395", "Apple, Inc.");
        vendorMap.put("D023DB", "Apple, Inc.");
        vendorMap.put("E0ACCB", "Apple, Inc.");
        vendorMap.put("90B0ED", "Apple, Inc.");
        vendorMap.put("B8E856", "Apple, Inc.");
        vendorMap.put("7CC537", "Apple, Inc.");
        vendorMap.put("A85C2C", "Apple, Inc.");
        vendorMap.put("F82793", "Apple, Inc.");
        vendorMap.put("E4CE8F", "Apple, Inc.");
        vendorMap.put("68A86D", "Apple, Inc.");
        vendorMap.put("98B8E3", "Apple, Inc.");
        
        // Samsung
        vendorMap.put("002637", "Samsung Electronics");
        vendorMap.put("5001BB", "Samsung Electronics");
        vendorMap.put("A87C01", "Samsung Electronics");
        vendorMap.put("C0BDD1", "Samsung Electronics");
        vendorMap.put("D022BE", "Samsung Electronics");
        vendorMap.put("F47B09", "Samsung Electronics");
        vendorMap.put("8CF5A3", "Samsung Electronics");
        vendorMap.put("B43A28", "Samsung Electronics");
        vendorMap.put("CC07AB", "Samsung Electronics");
        vendorMap.put("E8508B", "Samsung Electronics");
        vendorMap.put("3C5A37", "Samsung Electronics");
        vendorMap.put("E4B021", "Samsung Electronics");
        vendorMap.put("C8F230", "Samsung Electronics");
        vendorMap.put("E81132", "Samsung Electronics");
        vendorMap.put("7C6193", "Samsung Electronics");
        
        // Xiaomi
        vendorMap.put("64CC2E", "Xiaomi Communications");
        vendorMap.put("286C07", "Xiaomi Communications");
        vendorMap.put("7811DC", "Xiaomi Communications");
        vendorMap.put("FC64BA", "Xiaomi Communications");
        vendorMap.put("7C1C4E", "Xiaomi Communications");
        vendorMap.put("ACC1EE", "Xiaomi Communications");
        vendorMap.put("F8A45F", "Xiaomi Communications");
        vendorMap.put("50EC50", "Xiaomi Communications");
        vendorMap.put("34CE00", "Xiaomi Communications");
        vendorMap.put("F0B429", "Xiaomi Communications");
        
        // Google
        vendorMap.put("3C5AB4", "Google, Inc.");
        vendorMap.put("F4F5D8", "Google, Inc.");
        vendorMap.put("546009", "Google, Inc.");
        vendorMap.put("6C4008", "Google, Inc.");
        vendorMap.put("F8CF7E", "Google, Inc.");
        vendorMap.put("B4F0AB", "Google, Inc.");
        
        // Intel
        vendorMap.put("001E64", "Intel Corporate");
        vendorMap.put("3C970E", "Intel Corporate");
        vendorMap.put("4851B7", "Intel Corporate");
        vendorMap.put("8C8D28", "Intel Corporate");
        vendorMap.put("D4BE D9", "Intel Corporate");
        vendorMap.put("7085C2", "Intel Corporate");
        vendorMap.put("A41731", "Intel Corporate");
        
        // Qualcomm / Atheros
        vendorMap.put("00037F", "Atheros Communications");
        vendorMap.put("001D0F", "Atheros Communications");
        vendorMap.put("002713", "Atheros Communications");
        vendorMap.put("04F0D1", "Qualcomm");
        vendorMap.put("C4411E", "Qualcomm");
        
        // Realtek
        vendorMap.put("B0A7B9", "Realtek Semiconductor");
        vendorMap.put("00E04C", "Realtek Semiconductor");
        vendorMap.put("E0D55E", "Realtek Semiconductor");
        vendorMap.put("1C39BB", "Realtek Semiconductor");
        vendorMap.put("F0B479", "Realtek Semiconductor");
        
        // MediaTek
        vendorMap.put("C83DD4", "MediaTek Inc.");
        vendorMap.put("00080E", "MediaTek Inc.");
        vendorMap.put("7C7A91", "MediaTek Inc.");
        
        // TP-Link
        vendorMap.put("50C7BF", "TP-Link Technologies");
        vendorMap.put("B44BD6", "TP-Link Technologies");
        vendorMap.put("6032B1", "TP-Link Technologies");
        vendorMap.put("30B5C2", "TP-Link Technologies");
        vendorMap.put("F4F26D", "TP-Link Technologies");
        vendorMap.put("A42BB0", "TP-Link Technologies");
        vendorMap.put("C46E1F", "TP-Link Technologies");
        
        // D-Link
        vendorMap.put("00265A", "D-Link Corporation");
        vendorMap.put("1C7EE5", "D-Link Corporation");
        vendorMap.put("78542E", "D-Link Corporation");
        vendorMap.put("B8A386", "D-Link Corporation");
        vendorMap.put("CCB255", "D-Link Corporation");
        
        // Netgear
        vendorMap.put("C40415", "Netgear");
        vendorMap.put("20E52A", "Netgear");
        vendorMap.put("B0487A", "Netgear");
        vendorMap.put("A040A0", "Netgear");
        vendorMap.put("E091F5", "Netgear");
        
        // ASUS
        vendorMap.put("04D4C4", "ASUSTek Computer");
        vendorMap.put("2C4D54", "ASUSTek Computer");
        vendorMap.put("AC9E17", "ASUSTek Computer");
        vendorMap.put("1C872C", "ASUSTek Computer");
        vendorMap.put("F832E4", "ASUSTek Computer");
        
        // Amazon (Echo, Fire, Ring)
        vendorMap.put("F0F0A4", "Amazon Technologies");
        vendorMap.put("FC65DE", "Amazon Technologies");
        vendorMap.put("44650D", "Amazon Technologies");
        vendorMap.put("74C246", "Amazon Technologies");
        vendorMap.put("6854FD", "Amazon Technologies");
        vendorMap.put("00FC8B", "Amazon Technologies");
        vendorMap.put("A002DC", "Amazon Technologies");
        
        // Huawei
        vendorMap.put("00464B", "Huawei Technologies");
        vendorMap.put("4846FB", "Huawei Technologies");
        vendorMap.put("708A09", "Huawei Technologies");
        vendorMap.put("CCA223", "Huawei Technologies");
        vendorMap.put("E8CD2D", "Huawei Technologies");
        vendorMap.put("F8E61A", "Huawei Technologies");
        
        // OnePlus
        vendorMap.put("94652D", "OnePlus Technology");
        vendorMap.put("C0EEFB", "OnePlus Technology");
        vendorMap.put("A856D7", "OnePlus Technology");
        
        // OPPO
        vendorMap.put("A47758", "OPPO Electronics");
        vendorMap.put("74A528", "OPPO Electronics");
        vendorMap.put("D85D4C", "OPPO Electronics");
        
        // Vivo
        vendorMap.put("14A51A", "vivo Mobile");
        vendorMap.put("C4BE84", "vivo Mobile");
        vendorMap.put("E8E5D6", "vivo Mobile");
        
        // Realme
        vendorMap.put("5E5006", "Realme");
        vendorMap.put("C8D3FF", "Realme");
        
        // Sony
        vendorMap.put("00041F", "Sony Corporation");
        vendorMap.put("FC0FE6", "Sony Corporation");
        vendorMap.put("54B802", "Sony Corporation");
        vendorMap.put("E4E0A6", "Sony Corporation");
        
        // LG
        vendorMap.put("001E75", "LG Electronics");
        vendorMap.put("10683F", "LG Electronics");
        vendorMap.put("B8D9CE", "LG Electronics");
        vendorMap.put("E8B2AC", "LG Electronics");
        
        // HP
        vendorMap.put("00215A", "Hewlett-Packard");
        vendorMap.put("3CD92B", "Hewlett-Packard");
        vendorMap.put("D48564", "Hewlett-Packard");
        vendorMap.put("9C8CDC", "Hewlett-Packard");
        
        // Dell
        vendorMap.put("001422", "Dell Inc.");
        vendorMap.put("180373", "Dell Inc.");
        vendorMap.put("D4AE52", "Dell Inc.");
        vendorMap.put("B8CA3A", "Dell Inc.");
        
        // Lenovo
        vendorMap.put("28D244", "Lenovo");
        vendorMap.put("E82A44", "Lenovo");
        vendorMap.put("F0DEF1", "Lenovo");
        vendorMap.put("C0EE40", "Lenovo");
        
        // Microsoft (Xbox, Surface)
        vendorMap.put("7C1E52", "Microsoft Corporation");
        vendorMap.put("6045BD", "Microsoft Corporation");
        vendorMap.put("98B8E3", "Microsoft Corporation");
        vendorMap.put("D0509", "Microsoft Corporation");
        
        // Roku
        vendorMap.put("CC6DA0", "Roku, Inc.");
        vendorMap.put("D83134", "Roku, Inc.");
        vendorMap.put("B0A737", "Roku, Inc.");
        
        // Sonos
        vendorMap.put("5CAAFD", "Sonos, Inc.");
        vendorMap.put("B8E937", "Sonos, Inc.");
        vendorMap.put("00095", "Sonos, Inc.");
        
        // Ring
        vendorMap.put("4CA56D", "Ring LLC");
        vendorMap.put("74C63B", "Ring LLC");
        
        // Raspberry Pi
        vendorMap.put("B827EB", "Raspberry Pi Foundation");
        vendorMap.put("DCA632", "Raspberry Pi Foundation");
        vendorMap.put("E45F01", "Raspberry Pi Foundation");
        
        // Espressif (ESP32/ESP8266)
        vendorMap.put("240AC4", "Espressif Inc.");
        vendorMap.put("A4CF12", "Espressif Inc.");
        vendorMap.put("3C71BF", "Espressif Inc.");
        vendorMap.put("807D3A", "Espressif Inc.");
        
        // Canon
        vendorMap.put("001E8F", "Canon Inc.");
        vendorMap.put("00260E", "Canon Inc.");
        vendorMap.put("A8A795", "Canon Inc.");
        
        // Epson
        vendorMap.put("0026AB", "Seiko Epson");
        vendorMap.put("64EB8C", "Seiko Epson");
        
        // Brother
        vendorMap.put("008092", "Brother Industries");
        vendorMap.put("00E0B0", "Brother Industries");
        
        // Nintendo
        vendorMap.put("0009BF", "Nintendo Co.");
        vendorMap.put("E84ECE", "Nintendo Co.");
        vendorMap.put("A45C27", "Nintendo Co.");
        vendorMap.put("7CBB8A", "Nintendo Co.");
        
        // Philips (Hue)
        vendorMap.put("001788", "Philips Lighting");
        vendorMap.put("00178", "Philips Lighting");
        vendorMap.put("ECB5FA", "Philips Lighting");
        
        // Nest / Google Nest
        vendorMap.put("18B430", "Nest Labs");
        vendorMap.put("64168D", "Nest Labs");
        
        // Belkin / Wemo
        vendorMap.put("EC1A59", "Belkin International");
        vendorMap.put("944452", "Belkin International");
        
        // Linksys
        vendorMap.put("000C41", "Linksys");
        vendorMap.put("C06C59", "Linksys");
        
        // Cisco
        vendorMap.put("000142", "Cisco Systems");
        vendorMap.put("001D45", "Cisco Systems");
        
        // Motorola
        vendorMap.put("000CE9", "Motorola Mobility");
        vendorMap.put("F8E0FE", "Motorola Mobility");
        
        // HTC
        vendorMap.put("001E98", "HTC Corporation");
        vendorMap.put("7C61D", "HTC Corporation");
        
        // Nokia
        vendorMap.put("001E3A", "Nokia");
        vendorMap.put("D4F46F", "Nokia");
        
        // Acer
        vendorMap.put("001D0F", "Acer Inc.");
        vendorMap.put("F0DEF1", "Acer Inc.");
        
        // Toshiba
        vendorMap.put("001560", "Toshiba");
        vendorMap.put("B8F6B1", "Toshiba");
        
        // Panasonic
        vendorMap.put("001094", "Panasonic");
        vendorMap.put("E8039A", "Panasonic");
        
        // Vizio
        vendorMap.put("D4E8B2", "Vizio, Inc.");
        vendorMap.put("0007E1", "Vizio, Inc.");
        
        // TCL
        vendorMap.put("F8A9D0", "TCL King Electrical");
        vendorMap.put("C8D3FF", "TCL King Electrical");
        
        // Hisense
        vendorMap.put("00E04B", "Hisense");
        vendorMap.put("F8E61A", "Hisense");
        
        // Wyze
        vendorMap.put("2CF432", "Wyze Labs");
        
        // Tuya (IoT platform)
        vendorMap.put("807D3A", "Tuya Smart");
        
        // Hikvision (cameras)
        vendorMap.put("001D72", "Hikvision");
        vendorMap.put("44190B", "Hikvision");
        
        // Dahua (cameras)
        vendorMap.put("00124B", "Dahua Technology");
        
        // Axis (cameras)
        vendorMap.put("00408C", "Axis Communications");
        vendorMap.put("ACCC8E", "Axis Communications");
        
        // Ubiquiti
        vendorMap.put("F09FC2", "Ubiquiti Networks");
        vendorMap.put("788A20", "Ubiquiti Networks");
        
        // Aruba Networks
        vendorMap.put("000B86", "Aruba Networks");
        vendorMap.put("6C72E7", "Aruba Networks");
        
        // Broadcom
        vendorMap.put("001018", "Broadcom");
        vendorMap.put("B4B676", "Broadcom");
    }
}
