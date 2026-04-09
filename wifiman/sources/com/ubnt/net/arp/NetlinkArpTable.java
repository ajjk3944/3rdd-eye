package com.ubnt.net.arp;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class NetlinkArpTable {

    static class ArpNeighbor {
        public String ip;
        public String mac;

        ArpNeighbor() {
        }
    }

    public NetlinkArpTable(Context context) {
        a.b(context, "netlink-arp");
    }

    private static native ArpNeighbor[] getNativeArpTable();

    public HashMap<String, String> getArpTable() {
        String str;
        ArpNeighbor[] nativeArpTable = getNativeArpTable();
        if (nativeArpTable == null) {
            return null;
        }
        HashMap<String, String> map = new HashMap<>();
        for (ArpNeighbor arpNeighbor : nativeArpTable) {
            String str2 = arpNeighbor.ip;
            if (str2 != null && !str2.isEmpty() && (str = arpNeighbor.mac) != null && !str.isEmpty()) {
                map.put(arpNeighbor.ip, arpNeighbor.mac);
            }
        }
        return map;
    }
}
