package com.bytedance.sdk.component.emc;

import android.text.TextUtils;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
class yzg {
    private static boolean emc;

    public static String emc(Throwable th) {
        return AbstractC2763b.d(th instanceof vk ? ((vk) th).emc : 0, "}", new StringBuilder("{\"code\":"));
    }

    public static String emc(String str, boolean z6) {
        String strSubstring;
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        if (emc && !z6) {
            strSubstring = str.substring(1, str.length() - 1);
        } else {
            strSubstring = "";
        }
        String strConcat = "{\"code\":1,\"__data\":".concat(String.valueOf(str));
        if (!strSubstring.isEmpty()) {
            return strConcat + "," + strSubstring + "}";
        }
        return AbstractC2763b.e(strConcat, "}");
    }

    public static String emc() {
        return "";
    }

    public static void emc(boolean z6) {
        emc = z6;
    }
}
