package app.thirdeye.scanner;

import java.util.HashMap;

public class MACVendorLookup {
    private static MACVendorLookup instance;
    private HashMap<String, String> vendorMap;

    public static synchronized MACVendorLookup getInstance() {
        if (instance == null) {
            instance = new MACVendorLookup();
        }
        return instance;
    }

    private MACVendorLookup() {
        vendorMap = new HashMap<>(300);
        loadVendors();
    }

    /**
     * Resolve MAC address to vendor name.
     * @param mac MAC address in any format (AA:BB:CC:DD:EE:FF or AA-BB-CC-DD-EE-FF or AABBCCDDEEFF)
     * @return Vendor name or "Unknown"
     */
    public String getVendor(String mac) {
        if (mac == null || mac.length() < 8) return "Unknown";
        // Normalize: remove separators, uppercase, take first 6 chars (OUI)
        String normalized = mac.replaceAll("[:-]", "").toUpperCase();
        if (normalized.length() < 6) return "Unknown";
        String oui = normalized.substring(0, 6);
        String vendor = vendorMap.get(oui);
        return vendor != null ? vendor : "Unknown";
    }

    /**
     * Guess device type from vendor name.
     * @return "phone", "laptop", "tablet", "tv", "printer", "camera", "iot", "router", "gaming", "unknown"
     */
    public String guessDeviceType(String vendor, String hostname) {
        if (vendor == null) vendor = "";
        if (hostname == null) hostname = "";
        String v = vendor.toLowerCase();
        String h = hostname.toLowerCase();

        // Check hostname first (more specific)
        if (h.contains("iphone") || h.contains("galaxy") || h.contains("pixel") ||
            h.contains("oneplus") || h.contains("redmi") || h.contains("poco") ||
            h.contains("realme") || h.contains("oppo") || h.contains("vivo")) return "phone";
        if (h.contains("ipad") || h.contains("tab")) return "tablet";
        if (h.contains("macbook") || h.contains("laptop") || h.contains("desktop") ||
            h.contains("-pc") || h.contains("notebook")) return "laptop";
        if (h.contains("tv") || h.contains("roku") || h.contains("firetv") ||
            h.contains("chromecast") || h.contains("appletv") || h.contains("smart-tv")) return "tv";
        if (h.contains("printer") || h.contains("epson") || h.contains("canon") ||
            h.contains("brother") || h.contains("laserjet")) return "printer";
        if (h.contains("camera") || h.contains("cam") || h.contains("ring") ||
            h.contains("wyze") || h.contains("nest-cam")) return "camera";
        if (h.contains("echo") || h.contains("alexa") || h.contains("google-home") ||
            h.contains("homepod") || h.contains("nest")) return "iot";
        if (h.contains("xbox") || h.contains("playstation") || h.contains("nintendo") ||
            h.contains("switch")) return "gaming";

        // Check vendor
        if (v.contains("apple")) return "phone";
        if (v.contains("samsung")) return "phone";
        if (v.contains("xiaomi") || v.contains("redmi")) return "phone";
        if (v.contains("huawei")) return "phone";
        if (v.contains("oneplus")) return "phone";
        if (v.contains("oppo") || v.contains("vivo") || v.contains("realme")) return "phone";
        if (v.contains("google")) return "phone";
        if (v.contains("intel") || v.contains("dell") || v.contains("lenovo") ||
            v.contains("hewlett") || v.contains("hp") || v.contains("acer") ||
            v.contains("asus") && !v.contains("asustek")) return "laptop";
        if (v.contains("asustek")) return "router";
        if (v.contains("tp-link") || v.contains("d-link") || v.contains("netgear") ||
            v.contains("cudy") || v.contains("tenda") || v.contains("mikrotik") ||
            v.contains("ubiquiti")) return "router";
        if (v.contains("lg elec") || v.contains("sony") || v.contains("tcl") ||
            v.contains("hisense") || v.contains("roku") || v.contains("vizio")) return "tv";
        if (v.contains("canon") || v.contains("epson") || v.contains("brother") ||
            v.contains("xerox")) return "printer";
        if (v.contains("amazon")) return "iot";
        if (v.contains("sonos") || v.contains("bose")) return "iot";
        if (v.contains("ring") || v.contains("wyze") || v.contains("hikvision") ||
            v.contains("dahua")) return "camera";
        if (v.contains("nintendo") || v.contains("microsoft") || v.contains("valve")) return "gaming";
        if (v.contains("espressif") || v.contains("raspberry") || v.contains("tuya") ||
            v.contains("shenzhen")) return "iot";

        return "unknown";
    }

    private void loadVendors() {
        // ========= APPLE =========
        vendorMap.put("000A27", "Apple");
        vendorMap.put("000D93", "Apple");
        vendorMap.put("001CB3", "Apple");
        vendorMap.put("0021E9", "Apple");
        vendorMap.put("0023DF", "Apple");
        vendorMap.put("002332", "Apple");
        vendorMap.put("002500", "Apple");
        vendorMap.put("0026BB", "Apple");
        vendorMap.put("003EE1", "Apple");
        vendorMap.put("0050E4", "Apple");
        vendorMap.put("0C3021", "Apple");
        vendorMap.put("109ADD", "Apple");
        vendorMap.put("14109F", "Apple");
        vendorMap.put("147DDA", "Apple");
        vendorMap.put("18AF8F", "Apple");
        vendorMap.put("1C36BB", "Apple");
        vendorMap.put("20A2E4", "Apple");
        vendorMap.put("24A074", "Apple");
        vendorMap.put("28E02C", "Apple");
        vendorMap.put("2C1F23", "Apple");
        vendorMap.put("3C15C2", "Apple");
        vendorMap.put("3CE072", "Apple");
        vendorMap.put("40B395", "Apple");
        vendorMap.put("44D884", "Apple");
        vendorMap.put("48D705", "Apple");
        vendorMap.put("501479", "Apple");
        vendorMap.put("54724F", "Apple");
        vendorMap.put("5855CA", "Apple");
        vendorMap.put("5C8D4E", "Apple");
        vendorMap.put("5CF7E6", "Apple");
        vendorMap.put("609217", "Apple");
        vendorMap.put("64A3CB", "Apple");
        vendorMap.put("685B35", "Apple");
        vendorMap.put("6C3B6B", "Apple");
        vendorMap.put("6C709F", "Apple");
        vendorMap.put("70EF00", "Apple");
        vendorMap.put("7831C1", "Apple");
        vendorMap.put("787B8A", "Apple");
        vendorMap.put("7CC3A1", "Apple");
        vendorMap.put("7CD1C3", "Apple");
        vendorMap.put("80006E", "Apple");
        vendorMap.put("80E650", "Apple");
        vendorMap.put("84788B", "Apple");
        vendorMap.put("848506", "Apple");
        vendorMap.put("8866A5", "Apple");
        vendorMap.put("8C7C92", "Apple");
        vendorMap.put("90840D", "Apple");
        vendorMap.put("9C207B", "Apple");
        vendorMap.put("9C35EB", "Apple");
        vendorMap.put("A483E7", "Apple");
        vendorMap.put("A4B197", "Apple");
        vendorMap.put("A4D1D2", "Apple");
        vendorMap.put("A860B6", "Apple");
        vendorMap.put("A8968A", "Apple");
        vendorMap.put("ACBC32", "Apple");
        vendorMap.put("B065BD", "Apple");
        vendorMap.put("B4F0AB", "Apple");
        vendorMap.put("B8C111", "Apple");
        vendorMap.put("B8E856", "Apple");
        vendorMap.put("BCEC5D", "Apple");
        vendorMap.put("C06394", "Apple");
        vendorMap.put("C82A14", "Apple");
        vendorMap.put("C869CD", "Apple");
        vendorMap.put("CC785F", "Apple");
        vendorMap.put("D02B20", "Apple");
        vendorMap.put("D04F7E", "Apple");
        vendorMap.put("D0C5F3", "Apple");
        vendorMap.put("D49A20", "Apple");
        vendorMap.put("D89695", "Apple");
        vendorMap.put("D8CF9C", "Apple");
        vendorMap.put("DCA904", "Apple");
        vendorMap.put("E05F45", "Apple");
        vendorMap.put("E0B52D", "Apple");
        vendorMap.put("E4C63D", "Apple");
        vendorMap.put("F0B479", "Apple");
        vendorMap.put("F0D1A9", "Apple");
        vendorMap.put("F0DBE2", "Apple");
        vendorMap.put("F437B7", "Apple");
        vendorMap.put("F4F15A", "Apple");
        vendorMap.put("F8FFC2", "Apple");

        // ========= SAMSUNG =========
        vendorMap.put("002637", "Samsung");
        vendorMap.put("0007AB", "Samsung");
        vendorMap.put("001247", "Samsung");
        vendorMap.put("001377", "Samsung");
        vendorMap.put("001599", "Samsung");
        vendorMap.put("001FCC", "Samsung");
        vendorMap.put("002339", "Samsung");
        vendorMap.put("0025A0", "Samsung");
        vendorMap.put("086266", "Samsung");
        vendorMap.put("0C715D", "Samsung");
        vendorMap.put("10D38A", "Samsung");
        vendorMap.put("14568E", "Samsung");
        vendorMap.put("184617", "Samsung");
        vendorMap.put("1C5A3E", "Samsung");
        vendorMap.put("2013E0", "Samsung");
        vendorMap.put("244B03", "Samsung");
        vendorMap.put("2487FC", "Samsung");
        vendorMap.put("288335", "Samsung");
        vendorMap.put("2CAEEB", "Samsung");
        vendorMap.put("30CBF8", "Samsung");
        vendorMap.put("340AB3", "Samsung");
        vendorMap.put("380B40", "Samsung");
        vendorMap.put("3C5A37", "Samsung");
        vendorMap.put("4018B1", "Samsung");
        vendorMap.put("442A60", "Samsung");
        vendorMap.put("483B38", "Samsung");
        vendorMap.put("4CA56D", "Samsung");
        vendorMap.put("5001BB", "Samsung");
        vendorMap.put("50F520", "Samsung");
        vendorMap.put("549B12", "Samsung");
        vendorMap.put("5CA39D", "Samsung");
        vendorMap.put("600292", "Samsung");
        vendorMap.put("6455B1", "Samsung");
        vendorMap.put("6C2F2C", "Samsung");
        vendorMap.put("78471D", "Samsung");
        vendorMap.put("7C0191", "Samsung");
        vendorMap.put("843835", "Samsung");
        vendorMap.put("8855A5", "Samsung");
        vendorMap.put("8C771A", "Samsung");
        vendorMap.put("8CF5A3", "Samsung");
        vendorMap.put("94350A", "Samsung");
        vendorMap.put("983B16", "Samsung");
        vendorMap.put("9C02A1", "Samsung");
        vendorMap.put("A007B6", "Samsung");
        vendorMap.put("A47C14", "Samsung");
        vendorMap.put("A87C01", "Samsung");
        vendorMap.put("AC5F3E", "Samsung");
        vendorMap.put("B47443", "Samsung");
        vendorMap.put("B83A08", "Samsung");
        vendorMap.put("BC14EF", "Samsung");
        vendorMap.put("BC765E", "Samsung");
        vendorMap.put("C0BDD1", "Samsung");
        vendorMap.put("C45006", "Samsung");
        vendorMap.put("CC07AB", "Samsung");
        vendorMap.put("D022BE", "Samsung");
        vendorMap.put("D0176A", "Samsung");
        vendorMap.put("D0C1B1", "Samsung");
        vendorMap.put("E4F3C4", "Samsung");
        vendorMap.put("E8039A", "Samsung");
        vendorMap.put("EC1F72", "Samsung");
        vendorMap.put("F47B09", "Samsung");
        vendorMap.put("F8042E", "Samsung");

        // ========= XIAOMI =========
        vendorMap.put("0C1DAF", "Xiaomi");
        vendorMap.put("10D07A", "Xiaomi");
        vendorMap.put("149634", "Xiaomi");
        vendorMap.put("183A2D", "Xiaomi");
        vendorMap.put("286C07", "Xiaomi");
        vendorMap.put("2C28B7", "Xiaomi");
        vendorMap.put("34CE00", "Xiaomi");
        vendorMap.put("380101", "Xiaomi");
        vendorMap.put("3C15FB", "Xiaomi");
        vendorMap.put("3CE624", "Xiaomi");
        vendorMap.put("50F14A", "Xiaomi");
        vendorMap.put("58448E", "Xiaomi");
        vendorMap.put("5C5027", "Xiaomi");
        vendorMap.put("6083C6", "Xiaomi");
        vendorMap.put("64B473", "Xiaomi");
        vendorMap.put("64CC2E", "Xiaomi");
        vendorMap.put("7451BA", "Xiaomi");
        vendorMap.put("7811DC", "Xiaomi");
        vendorMap.put("7C1C4E", "Xiaomi");
        vendorMap.put("8CBEBE", "Xiaomi");
        vendorMap.put("9C9C1F", "Xiaomi");
        vendorMap.put("A462CE", "Xiaomi");
        vendorMap.put("ACC1EE", "Xiaomi");
        vendorMap.put("B0E235", "Xiaomi");
        vendorMap.put("C4268A", "Xiaomi");
        vendorMap.put("D4612E", "Xiaomi");
        vendorMap.put("F48B32", "Xiaomi");
        vendorMap.put("F80377", "Xiaomi");
        vendorMap.put("FC64BA", "Xiaomi");

        // ========= HUAWEI =========
        vendorMap.put("00259E", "Huawei");
        vendorMap.put("00464B", "Huawei");
        vendorMap.put("001882", "Huawei");
        vendorMap.put("0025AB", "Huawei");
        vendorMap.put("009ACD", "Huawei");
        vendorMap.put("04F938", "Huawei");
        vendorMap.put("0C96BF", "Huawei");
        vendorMap.put("1C8E5C", "Huawei");
        vendorMap.put("200BC7", "Huawei");
        vendorMap.put("241FA0", "Huawei");
        vendorMap.put("24DF6A", "Huawei");
        vendorMap.put("283152", "Huawei");
        vendorMap.put("2C9D1E", "Huawei");
        vendorMap.put("3400A3", "Huawei");
        vendorMap.put("4846FB", "Huawei");
        vendorMap.put("4C8BEF", "Huawei");
        vendorMap.put("548998", "Huawei");
        vendorMap.put("5C7D5E", "Huawei");
        vendorMap.put("70723C", "Huawei");
        vendorMap.put("708A09", "Huawei");
        vendorMap.put("780AC7", "Huawei");
        vendorMap.put("8018A7", "Huawei");
        vendorMap.put("84BE52", "Huawei");
        vendorMap.put("88E3AB", "Huawei");
        vendorMap.put("9C28EF", "Huawei");
        vendorMap.put("AC853D", "Huawei");
        vendorMap.put("C8D15E", "Huawei");
        vendorMap.put("CCA223", "Huawei");
        vendorMap.put("D065CA", "Huawei");
        vendorMap.put("D4B110", "Huawei");
        vendorMap.put("D8490B", "Huawei");
        vendorMap.put("E0247F", "Huawei");
        vendorMap.put("E0CC7A", "Huawei");
        vendorMap.put("F4C714", "Huawei");
        vendorMap.put("F84ABF", "Huawei");
        vendorMap.put("FC48EF", "Huawei");

        // ========= OTHER BRANDS =========
        vendorMap.put("94652D", "OnePlus");
        vendorMap.put("C0EEFB", "OnePlus");
        vendorMap.put("64A2F9", "OnePlus");
        vendorMap.put("A47758", "OPPO");
        vendorMap.put("7C3924", "OPPO");
        vendorMap.put("74A528", "OPPO");
        vendorMap.put("E8A2AC", "OPPO");
        vendorMap.put("14A51A", "Vivo");
        vendorMap.put("C4BE84", "Vivo");
        vendorMap.put("F40E22", "Vivo");
        vendorMap.put("5E5006", "Realme");
        vendorMap.put("8A6901", "Realme");
        vendorMap.put("3C5AB4", "Google");
        vendorMap.put("546009", "Google");
        vendorMap.put("A4C639", "Google");
        vendorMap.put("F4F5D8", "Google");
        vendorMap.put("48D6D5", "Google");
        vendorMap.put("F88FCA", "Google");

        // ========= LAPTOPS/PCS =========
        vendorMap.put("001E64", "Intel");
        vendorMap.put("001E67", "Intel");
        vendorMap.put("002314", "Intel");
        vendorMap.put("3C970E", "Intel");
        vendorMap.put("4851B7", "Intel");
        vendorMap.put("7483C8", "Intel");
        vendorMap.put("8C8D28", "Intel");
        vendorMap.put("A0C589", "Intel");
        vendorMap.put("B4D5BD", "Intel");
        vendorMap.put("C87F54", "Intel");
        vendorMap.put("F8632C", "Intel");
        vendorMap.put("001422", "Dell");
        vendorMap.put("001A4B", "Dell");
        vendorMap.put("001E4F", "Dell");
        vendorMap.put("180373", "Dell");
        vendorMap.put("246E96", "Dell");
        vendorMap.put("B08351", "Dell");
        vendorMap.put("F04DA2", "Dell");
        vendorMap.put("F8BC12", "Dell");
        vendorMap.put("28D244", "Lenovo");
        vendorMap.put("5CF9DD", "Lenovo");
        vendorMap.put("70F1A1", "Lenovo");
        vendorMap.put("8CFD18", "Lenovo");
        vendorMap.put("B05ADA", "Lenovo");
        vendorMap.put("E82A44", "Lenovo");
        vendorMap.put("00215A", "HP");
        vendorMap.put("001F29", "HP");
        vendorMap.put("0022B0", "HP");
        vendorMap.put("3CD92B", "HP");
        vendorMap.put("689CE2", "HP");
        vendorMap.put("94579B", "HP");
        vendorMap.put("D07E28", "HP");
        vendorMap.put("000C6E", "ASUS");
        vendorMap.put("001731", "ASUS");
        vendorMap.put("002354", "ASUS");
        vendorMap.put("04D4C4", "ASUS");
        vendorMap.put("2C4D54", "ASUS");
        vendorMap.put("50465D", "ASUS");
        vendorMap.put("AC9E17", "ASUS");
        vendorMap.put("D45D64", "ASUS");

        // ========= ROUTERS =========
        vendorMap.put("1C3BF3", "TP-Link");
        vendorMap.put("30B5C2", "TP-Link");
        vendorMap.put("5032AB", "TP-Link");
        vendorMap.put("50C7BF", "TP-Link");
        vendorMap.put("6032B1", "TP-Link");
        vendorMap.put("643109", "TP-Link");
        vendorMap.put("6C198F", "TP-Link");
        vendorMap.put("900A4F", "TP-Link");
        vendorMap.put("B44BD6", "TP-Link");
        vendorMap.put("C006C3", "TP-Link");
        vendorMap.put("C46E1F", "TP-Link");
        vendorMap.put("E894F6", "TP-Link");
        vendorMap.put("F4F26D", "TP-Link");
        vendorMap.put("00265A", "D-Link");
        vendorMap.put("1C7EE5", "D-Link");
        vendorMap.put("340804", "D-Link");
        vendorMap.put("78542E", "D-Link");
        vendorMap.put("9094E4", "D-Link");
        vendorMap.put("B8A386", "D-Link");
        vendorMap.put("CCB255", "D-Link");
        vendorMap.put("20E52A", "Netgear");
        vendorMap.put("B07FB9", "Netgear");
        vendorMap.put("C40415", "Netgear");
        vendorMap.put("E0469A", "Netgear");
        vendorMap.put("2CB05D", "Netgear");
        vendorMap.put("10FF7B", "Cudy");
        vendorMap.put("D83E48", "Cudy");
        vendorMap.put("C83A35", "Tenda");
        vendorMap.put("D8382E", "Tenda");
        vendorMap.put("CC7191", "Tenda");

        // ========= IOT/SMART HOME =========
        vendorMap.put("0012F2", "Amazon");
        vendorMap.put("40B4CD", "Amazon");
        vendorMap.put("44650D", "Amazon");
        vendorMap.put("50F5DA", "Amazon");
        vendorMap.put("68543C", "Amazon");
        vendorMap.put("74C246", "Amazon");
        vendorMap.put("A002DC", "Amazon");
        vendorMap.put("AC63BE", "Amazon");
        vendorMap.put("F0272D", "Amazon");
        vendorMap.put("F0D2F1", "Amazon");
        vendorMap.put("F0F0A4", "Amazon");
        vendorMap.put("FC65DE", "Amazon");
        vendorMap.put("00041F", "Sony");
        vendorMap.put("001315", "Sony");
        vendorMap.put("0019C5", "Sony");
        vendorMap.put("001D0D", "Sony");
        vendorMap.put("281878", "Sony");
        vendorMap.put("FC0FE6", "Sony");
        vendorMap.put("001E75", "LG");
        vendorMap.put("001FE3", "LG");
        vendorMap.put("10683F", "LG");
        vendorMap.put("20219A", "LG");
        vendorMap.put("34FCEF", "LG");
        vendorMap.put("402305", "LG");
        vendorMap.put("B45253", "LG");
        vendorMap.put("C49A02", "LG");
        vendorMap.put("CC2D8C", "LG");
        vendorMap.put("7C1E52", "Microsoft");
        vendorMap.put("6045BD", "Microsoft");
        vendorMap.put("001DD8", "Microsoft");
        vendorMap.put("C83DD4", "Microsoft");
        vendorMap.put("28184D", "Microsoft");
        vendorMap.put("002444", "Nintendo");
        vendorMap.put("0009BF", "Nintendo");
        vendorMap.put("0019FD", "Nintendo");
        vendorMap.put("0023CC", "Nintendo");
        vendorMap.put("002709", "Nintendo");
        vendorMap.put("34AF2C", "Nintendo");
        vendorMap.put("58BDA3", "Nintendo");
        vendorMap.put("7CBB8A", "Nintendo");
        vendorMap.put("E84ECE", "Nintendo");
        vendorMap.put("CC6DA0", "Roku");
        vendorMap.put("D83134", "Roku");
        vendorMap.put("B03829", "Roku");
        vendorMap.put("5CAAFD", "Sonos");
        vendorMap.put("B8E937", "Sonos");
        vendorMap.put("949F3E", "Sonos");
        vendorMap.put("001E8F", "Canon");
        vendorMap.put("18274B", "Canon");
        vendorMap.put("881FA1", "Canon");
        vendorMap.put("0000C5", "Epson");
        vendorMap.put("0026AB", "Epson");
        vendorMap.put("6038E0", "Epson");
        vendorMap.put("000092", "Brother");
        vendorMap.put("001BA9", "Brother");
        vendorMap.put("302303", "Brother");
        vendorMap.put("B827EB", "Raspberry Pi");
        vendorMap.put("DCA632", "Raspberry Pi");
        vendorMap.put("E45F01", "Raspberry Pi");
        vendorMap.put("240AC4", "Espressif");
        vendorMap.put("A4CF12", "Espressif");
        vendorMap.put("BCDDC2", "Espressif");
        vendorMap.put("00037F", "Qualcomm");
        vendorMap.put("B0A7B9", "Realtek");
        vendorMap.put("00E04C", "Realtek");
        vendorMap.put("000CE7", "MediaTek");
        vendorMap.put("0418D6", "Ubiquiti");
        vendorMap.put("24A43C", "Ubiquiti");
        vendorMap.put("44D9E7", "Ubiquiti");
        vendorMap.put("68D79A", "Ubiquiti");
        vendorMap.put("788A20", "Ubiquiti");
        vendorMap.put("B4FBE4", "Ubiquiti");
        vendorMap.put("000C42", "MikroTik");
        vendorMap.put("48A98A", "MikroTik");
        vendorMap.put("D4015D", "MikroTik");
    }
}
