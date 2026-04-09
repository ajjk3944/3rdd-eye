package com.bytedance.sdk.openadsdk.multipro.lh;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.sdk.component.le.ouw.le;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.multipro.yu;
import d.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw implements com.bytedance.sdk.openadsdk.multipro.ouw {
    private static String fkw() {
        return h.w(new StringBuilder(), yu.vt, "/t_frequent/");
    }

    public static String lh() {
        if (zih.ouw() == null) {
            return null;
        }
        try {
            le leVarYu = yu();
            if (leVarYu != null) {
                return leVarYu.ouw(Uri.parse(fkw() + "maxRit"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static boolean vt() {
        if (zih.ouw() == null) {
            return false;
        }
        try {
            le leVarYu = yu();
            if (leVarYu != null) {
                return "true".equals(leVarYu.ouw(Uri.parse(fkw() + "isSilent")));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static le yu() {
        try {
            if (zih.ouw() != null) {
                return com.bytedance.sdk.openadsdk.multipro.ouw.ouw.ouw(zih.ouw());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final int ouw(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final int ouw(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final Cursor ouw(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final Uri ouw(Uri uri, ContentValues contentValues) {
        return null;
    }

    public static boolean ouw(String str) {
        if (zih.ouw() == null) {
            return false;
        }
        try {
            le leVarYu = yu();
            if (leVarYu != null) {
                return "true".equals(leVarYu.ouw(Uri.parse(fkw() + "checkFrequency?rit=" + str)));
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final String ouw() {
        return "t_frequent";
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.ouw
    public final String ouw(Uri uri) {
        ko.vt("FrequentCallProviderImpl", "get type uri: ".concat(String.valueOf(uri)));
        String str = uri.getPath().split("/")[2];
        if ("checkFrequency".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.pno.ouw.ouw().ouw(uri.getQueryParameter("rit")) ? "true" : "false";
        }
        if ("isSilent".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.pno.ouw.ouw().vt() ? "true" : "false";
        }
        if ("maxRit".equals(str)) {
            return com.bytedance.sdk.openadsdk.core.pno.ouw.ouw().lh();
        }
        return null;
    }
}
