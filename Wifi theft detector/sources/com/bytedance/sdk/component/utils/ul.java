package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes.dex */
public class ul {
    private static boolean emc = false;
    private static String ypw = "";

    public static void emc() {
        emc = true;
    }

    public static void xq(String str, String str2) {
        if (emc && str2 != null) {
            Log.e(ypw(str), str2);
        }
    }

    public static void ypw() {
        emc = false;
    }

    public static void emc(String str, String str2) {
        if (emc && str2 != null) {
            Log.d(ypw(str), str2);
        }
    }

    public static void ypw(String str, String str2) {
        if (emc && str2 != null) {
            Log.i(ypw(str), str2);
        }
    }

    public static void xq(String str, Object... objArr) {
        if (emc && objArr != null) {
            Log.e(ypw(str), emc(objArr));
        }
    }

    public static void emc(String str, Object... objArr) {
        if (emc && objArr != null) {
            Log.d(ypw(str), emc(objArr));
        }
    }

    public static void ypw(String str, Object... objArr) {
        if (emc && objArr != null) {
            Log.i(ypw(str), emc(objArr));
        }
    }

    public static void emc(String str, String str2, Throwable th) {
        if (emc) {
            if (str2 == null && th == null) {
                return;
            }
            Log.e(ypw(str), str2, th);
        }
    }

    private static String ypw(String str) {
        if (TextUtils.isEmpty(ypw)) {
            return str;
        }
        return emc("[" + ypw + "]-[" + str + "]");
    }

    public static void emc(String str) {
        ypw = str;
    }

    private static String emc(Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : objArr) {
                if (obj != null) {
                    sb.append(obj.toString());
                } else {
                    sb.append(" null ");
                }
                sb.append(" ");
            }
            return sb.toString();
        }
        return "";
    }
}
