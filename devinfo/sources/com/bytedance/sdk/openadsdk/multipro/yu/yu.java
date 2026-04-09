package com.bytedance.sdk.openadsdk.multipro.yu;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.component.vt;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.zih;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu {
    private static boolean ouw() {
        return zih.ouw() == null;
    }

    private static String vt(String str) {
        return TextUtils.isEmpty(str) ? "tt_sp" : str;
    }

    public static void ouw(String str, String str2, Boolean bool) {
        if (ouw()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw.ouw(vt(str), str2, bool);
        } else {
            ouw(vt(str), str2, bool);
        }
    }

    public static String vt(String str, String str2, String str3) {
        if (ouw()) {
            return str3;
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            return ouw.vt(vt(str), str2, str3);
        }
        return ouw.ouw(zih.ouw(), vt(str), str2, str3);
    }

    public static void ouw(String str, String str2, Long l10) {
        if (ouw()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw.ouw(vt(str), str2, l10);
        } else {
            ouw(vt(str), str2, l10);
        }
    }

    public static void vt(String str, String str2) {
        if (ouw()) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                ouw.vt(vt(str), str2);
            } else {
                vt.vt(zih.ouw(), vt(str), str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void ouw(String str, String str2, String str3) {
        if (ouw()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw.ouw(vt(str), str2, str3);
        } else {
            ouw(vt(str), str2, str3);
        }
    }

    public static void ouw(String str, String str2, Integer num) {
        if (ouw()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw.ouw(vt(str), str2, num);
        } else {
            ouw(vt(str), str2, num);
        }
    }

    public static int ouw(String str, String str2, int i4) {
        if (ouw()) {
            return i4;
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            return ouw.ouw(vt(str), str2, i4);
        }
        return ouw.ouw(zih.ouw(), vt(str), str2, i4);
    }

    public static boolean ouw(String str, String str2) {
        if (ouw()) {
            return true;
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            return ouw.ouw(vt(str), str2, true);
        }
        return ouw.ouw(zih.ouw(), vt(str), str2, true);
    }

    public static long ouw(String str, String str2, long j) {
        if (ouw()) {
            return j;
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            return ouw.ouw(vt(str), str2, j);
        }
        return ouw.ouw(zih.ouw(), vt(str), str2, j);
    }

    public static void ouw(String str) {
        if (ouw()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw.ouw(vt(str));
        } else {
            vt.vt(zih.ouw(), vt(str));
        }
    }

    private static <T> void ouw(String str, String str2, T t10) {
        String strOuw = ouw.ouw(str, str2);
        if (bly.fkw(strOuw)) {
            vt.lh lhVarVt = com.bytedance.sdk.component.vt.ouw(zih.ouw(), vt(strOuw)).vt();
            vt.ouw(lhVarVt, str2, (Object) t10);
            lhVarVt.apply();
        } else {
            SharedPreferences sharedPreferencesOuw = vt.ouw(zih.ouw(), vt(strOuw));
            if (sharedPreferencesOuw == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesOuw.edit();
            vt.ouw(editorEdit, str2, t10);
            editorEdit.apply();
        }
    }
}
