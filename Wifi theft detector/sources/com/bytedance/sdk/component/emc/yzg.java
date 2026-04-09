package com.bytedance.sdk.component.emc;

import android.text.TextUtils;

/* loaded from: classes.dex */
class yzg {
    private static boolean emc;

    public static String emc(Throwable th) {
        StringBuilder sb = new StringBuilder("{\"code\":");
        sb.append(th instanceof vk ? ((vk) th).emc : 0);
        sb.append("}");
        return sb.toString();
    }

    public static String emc(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        String strSubstring = (!emc || z10) ? "" : str.substring(1, str.length() - 1);
        String strConcat = "{\"code\":1,\"__data\":".concat(String.valueOf(str));
        if (strSubstring.isEmpty()) {
            return strConcat + "}";
        }
        return strConcat + "," + strSubstring + "}";
    }

    public static String emc() {
        return "";
    }

    public static void emc(boolean z10) {
        emc = z10;
    }
}
