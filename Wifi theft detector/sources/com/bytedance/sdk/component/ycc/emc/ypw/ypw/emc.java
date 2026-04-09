package com.bytedance.sdk.component.ycc.emc.ypw.ypw;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.ycc.emc.emc.emc.uym;
import com.bytedance.sdk.component.ycc.emc.emc.emc.ycc;
import com.bytedance.sdk.component.ycc.emc.msw;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class emc {
    private static String dg() {
        return uym.ypw + "/ad_log_event/";
    }

    public static void emc() {
        if (msw.uym().ycc() == null) {
            return;
        }
        try {
            ContentResolver contentResolverXq = xq();
            if (contentResolverXq != null) {
                contentResolverXq.getType(Uri.parse(dg() + "adLogStart"));
            }
        } catch (Throwable unused) {
        }
    }

    private static ContentResolver xq() {
        try {
            if (msw.uym().ycc() != null) {
                return msw.uym().ycc().getContentResolver();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void ypw() {
        if (msw.uym().ycc() == null) {
            return;
        }
        try {
            ContentResolver contentResolverXq = xq();
            if (contentResolverXq != null) {
                contentResolverXq.getType(Uri.parse(dg() + "adLogStop"));
            }
        } catch (Throwable unused) {
        }
    }

    public static void emc(com.bytedance.sdk.component.ycc.emc.dg.emc emcVar) {
        if (emcVar == null) {
            return;
        }
        try {
            ContentResolver contentResolverXq = xq();
            if (contentResolverXq != null) {
                contentResolverXq.getType(Uri.parse(dg() + "adLogDispatch?event=" + ycc.emc(emcVar.ycc())));
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public static void emc(String str, List<String> list, boolean z10) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                sb.append(ycc.emc(it.next()));
                sb.append(",");
            }
            String str2 = "?did=" + String.valueOf(str) + "&track=" + String.valueOf(ycc.emc(sb.toString())) + "&replace=" + String.valueOf(z10);
            ContentResolver contentResolverXq = xq();
            if (contentResolverXq != null) {
                contentResolverXq.getType(Uri.parse(dg() + "trackAdUrl" + str2));
            }
        } catch (Throwable unused) {
        }
    }

    public static void emc(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ContentResolver contentResolverXq = xq();
            if (contentResolverXq != null) {
                contentResolverXq.getType(Uri.parse(dg() + "trackAdFailed?did=" + String.valueOf(str)));
            }
        } catch (Throwable unused) {
        }
    }
}
