package com.bytedance.sdk.openadsdk.ee;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sup;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.mbridge.msdk.MBridgeConstans;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class emc {
    private static int emc(int i10) {
        int i11 = 2;
        if (i10 != 2) {
            i11 = 3;
            if (i10 != 3) {
                i11 = 4;
                if (i10 != 4) {
                    i11 = 5;
                    if (i10 != 5 && i10 != 15) {
                        return -1;
                    }
                }
            }
        }
        return i11;
    }

    public static List<String> emc(List<String> list, boolean z10) {
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
            if (z10) {
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
            } catch (Exception e10) {
                ul.xq("TrackAdUrlUtils", e10.getMessage());
            }
        }
        return str;
    }

    public static List<String> emc(List<String> list, boolean z10, rie rieVar) {
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
                next = next.replace("__OS__", MBridgeConstans.ENDCARD_URL_TYPE_PL);
            }
            if (next.contains("__UA1__")) {
                next = next.replace("__UA1__", URLEncoder.encode(tp.dg()));
            }
            if (z10) {
                next = emc(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
