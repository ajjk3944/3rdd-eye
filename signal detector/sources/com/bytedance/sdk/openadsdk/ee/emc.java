package com.bytedance.sdk.openadsdk.ee;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sup;
import com.bytedance.sdk.openadsdk.utils.tp;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class emc {
    private static int emc(int i) {
        int i3 = 2;
        if (i != 2) {
            i3 = 3;
            if (i != 3) {
                i3 = 4;
                if (i != 4) {
                    i3 = 5;
                    if (i != 5 && i != 15) {
                        return -1;
                    }
                }
            }
        }
        return i3;
    }

    public static List<String> emc(List<String> list, boolean z6) {
        String strEmc = sup.emc(aa.emc());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(strEmc)) {
                next = next.replace("{UID}", strEmc).replace("__UID__", strEmc);
            }
            if (z6) {
                next = emc(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    private static String emc(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return str.replace("[ss_random]", String.valueOf(new SecureRandom().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception e6) {
                ul.xq("TrackAdUrlUtils", e6.getMessage());
            }
        }
        return str;
    }

    public static List<String> emc(List<String> list, boolean z6, rie rieVar) {
        String strEmc = sup.emc(aa.emc());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(strEmc)) {
                next = next.replace("{UID}", strEmc).replace("__UID__", strEmc);
            }
            if (next.contains("__CID__") && rieVar != null && !TextUtils.isEmpty(rieVar.ye())) {
                next = next.replace("__CID__", rieVar.ye());
            }
            if (next.contains("__CTYPE__") && rieVar != null) {
                next = next.replace("__CTYPE__", String.valueOf(emc(rieVar.in())));
            }
            if (next.contains("__GAID__")) {
                next = next.replace("__GAID__", com.bytedance.sdk.openadsdk.ul.emc.ypw.emc.emc().ypw());
            }
            if (next.contains("__OS__")) {
                next = next.replace("__OS__", "0");
            }
            if (next.contains("__UA1__")) {
                next = next.replace("__UA1__", URLEncoder.encode(tp.dg()));
            }
            if (z6) {
                next = emc(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
