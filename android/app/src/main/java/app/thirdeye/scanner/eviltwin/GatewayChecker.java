package app.thirdeye.scanner.eviltwin;

import android.content.Context;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GatewayChecker {
    private Context context;
    private WifiManager wifiManager;

    public GatewayChecker(Context context) {
        this.context = context;
        this.wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
    }

    public GatewayCheckResult checkGateway() {
        GatewayCheckResult result = new GatewayCheckResult();

        try {
            // Get DHCP info
            DhcpInfo dhcp = wifiManager.getDhcpInfo();
            result.gatewayIP = intToIpAddress(dhcp.gateway);
            result.dhcpServer = intToIpAddress(dhcp.serverAddress);

            // Read ARP table
            Map<String, String> arpTable = readARPTable();
            result.gatewayMAC = getGatewayMAC(result.gatewayIP, arpTable);

            // Check for duplicate MACs (ARP poisoning indicator)
            result.possibleARPSpoof = checkForDuplicateMACs(arpTable);

            // This will be populated by comparing with database baseline
            result.macChanged = false;
            result.dhcpChanged = false;
            result.previousMAC = null;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    private String intToIpAddress(int ip) {
        return String.format("%d.%d.%d.%d",
            (ip & 0xff),
            (ip >> 8 & 0xff),
            (ip >> 16 & 0xff),
            (ip >> 24 & 0xff));
    }

    private Map<String, String> readARPTable() {
        Map<String, String> arpTable = new HashMap<>();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("/proc/net/arp"));
            String line;
            
            // Skip header line
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] parts = line.trim().split("\\s+");
                if (parts.length >= 4) {
                    String ip = parts[0];
                    String mac = parts[3];
                    
                    // Filter out invalid entries
                    if (!mac.equals("00:00:00:00:00:00") && !ip.equals("0.0.0.0")) {
                        arpTable.put(ip, mac.toUpperCase());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return arpTable;
    }

    private String getGatewayMAC(String gatewayIP, Map<String, String> arpTable) {
        if (arpTable.containsKey(gatewayIP)) {
            return arpTable.get(gatewayIP);
        }
        return "unknown";
    }

    private boolean checkForDuplicateMACs(Map<String, String> arpTable) {
        Map<String, Integer> macCount = new HashMap<>();
        
        for (String mac : arpTable.values()) {
            macCount.put(mac, macCount.getOrDefault(mac, 0) + 1);
        }

        // If any MAC appears more than once, possible ARP poisoning
        for (int count : macCount.values()) {
            if (count > 1) {
                return true;
            }
        }

        return false;
    }

    // Result class
    public static class GatewayCheckResult {
        public String gatewayIP;
        public String gatewayMAC;
        public boolean macChanged;
        public boolean possibleARPSpoof;
        public String dhcpServer;
        public boolean dhcpChanged;
        public String previousMAC;
    }
}
