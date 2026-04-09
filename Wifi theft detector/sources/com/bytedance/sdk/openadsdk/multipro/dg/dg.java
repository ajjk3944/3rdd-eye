package com.bytedance.sdk.openadsdk.multipro.dg;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.component.emc;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.zz;

/* loaded from: classes.dex */
public class dg {
    private static boolean emc() {
        return aa.emc() == null;
    }

    private static String ypw(String str) {
        return TextUtils.isEmpty(str) ? "tt_sp" : str;
    }

    public static void emc(String str, String str2, Boolean bool) {
        if (emc()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            emc.emc(ypw(str), str2, bool);
        } else {
            emc(ypw(str), str2, bool);
        }
    }

    public static String ypw(String str, String str2, String str3) {
        if (emc()) {
            return str3;
        }
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            return emc.ypw(ypw(str), str2, str3);
        }
        return emc.emc(aa.emc(), ypw(str), str2, str3);
    }

    public static void emc(String str, String str2, Long l10) {
        if (emc()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            emc.emc(ypw(str), str2, l10);
        } else {
            emc(ypw(str), str2, l10);
        }
    }

    public static void emc(String str, String str2, String str3) {
        if (emc()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            emc.emc(ypw(str), str2, str3);
        } else {
            emc(ypw(str), str2, str3);
        }
    }

    public static void emc(String str, String str2, Integer num) {
        if (emc()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            emc.emc(ypw(str), str2, num);
        } else {
            emc(ypw(str), str2, num);
        }
    }

    public static int emc(String str, String str2, int i10) {
        if (emc()) {
            return i10;
        }
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            return emc.emc(ypw(str), str2, i10);
        }
        return emc.emc(aa.emc(), ypw(str), str2, i10);
    }

    public static boolean emc(String str, String str2, boolean z10) {
        if (emc()) {
            return z10;
        }
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            return emc.emc(ypw(str), str2, z10);
        }
        return emc.emc(aa.emc(), ypw(str), str2, z10);
    }

    public static long emc(String str, String str2, long j10) {
        if (emc()) {
            return j10;
        }
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            return emc.emc(ypw(str), str2, j10);
        }
        return emc.emc(aa.emc(), ypw(str), str2, j10);
    }

    public static void emc(String str, String str2) {
        if (emc()) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
                emc.ypw(ypw(str), str2);
            } else {
                ypw.ypw(aa.emc(), ypw(str), str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void emc(String str) {
        if (emc()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            emc.emc(ypw(str));
        } else {
            ypw.ypw(aa.emc(), ypw(str));
        }
    }

    private static <T> void emc(String str, String str2, T t10) {
        String strEmc = emc.emc(str, str2);
        if (zz.uym(strEmc)) {
            emc.xq xqVarYpw = com.bytedance.sdk.component.emc.emc(aa.emc(), ypw(strEmc)).ypw();
            ypw.emc(xqVarYpw, str2, (Object) t10);
            xqVarYpw.apply();
        } else {
            SharedPreferences sharedPreferencesEmc = ypw.emc(aa.emc(), ypw(strEmc));
            if (sharedPreferencesEmc == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesEmc.edit();
            ypw.emc(editorEdit, str2, t10);
            editorEdit.apply();
        }
    }
}
