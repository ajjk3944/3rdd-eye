package g8;

import android.content.Context;
import android.text.TextUtils;
import com.wifi.netdiscovery.data.HostInfo;
import com.wifihacker.detector.data.HistoryInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.jmdns.impl.constants.DNSConstants;

/* loaded from: classes3.dex */
public abstract class f {
    public static ArrayList a(Context context) {
        try {
            return (ArrayList) n.a(context, "history");
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static List b(Context context) {
        HashMap map;
        ArrayList arrayList = null;
        try {
            map = (HashMap) n.a(context, "router_mac_address");
        } catch (Exception e10) {
            e10.printStackTrace();
            map = null;
        }
        if (map == null) {
            return null;
        }
        HashMap map2 = (HashMap) map.get(u.a(context));
        if (map2 != null && map2.size() != 0) {
            Set setEntrySet = map2.entrySet();
            arrayList = new ArrayList();
            Iterator it = setEntrySet.iterator();
            while (it.hasNext()) {
                arrayList.add((HostInfo) ((Map.Entry) it.next()).getValue());
            }
        }
        return arrayList;
    }

    public static boolean c(Context context, List list, List list2) {
        ArrayList arrayList;
        HistoryInfo historyInfo = new HistoryInfo();
        historyInfo.wifiName = u.c(context);
        historyInfo.Bssid = u.a(context);
        historyInfo.onLineList = list;
        historyInfo.offLineList = list2;
        historyInfo.scanTime = new Date().getTime();
        historyInfo.hasWifiPassword = d.a(context);
        try {
            arrayList = (ArrayList) n.a(context, "history");
        } catch (Exception e10) {
            e10.printStackTrace();
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        } else {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (historyInfo.scanTime - ((HistoryInfo) obj).scanTime < DNSConstants.SERVICE_INFO_TIMEOUT) {
                    return false;
                }
            }
        }
        arrayList.add(0, historyInfo);
        if (arrayList.size() > 200) {
            arrayList.remove(200);
        }
        try {
            n.b(context, "history", arrayList);
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }

    public static void d(Context context, List list) {
        HashMap map;
        String strA = u.a(context);
        HashMap map2 = null;
        try {
            map = (HashMap) n.a(context, "router_mac_address");
        } catch (Exception e10) {
            e10.printStackTrace();
            map = null;
        }
        if (map == null) {
            map = new HashMap();
        }
        if (!TextUtils.isEmpty(strA)) {
            strA = strA.trim();
            map2 = (HashMap) map.get(strA);
            if (map2 == null) {
                map2 = new HashMap();
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                HostInfo hostInfo = (HostInfo) it.next();
                map2.put(hostInfo.hardwareAddress, hostInfo);
            }
        }
        if (map2 != null) {
            map.put(strA, map2);
            try {
                n.b(context, "router_mac_address", map);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
