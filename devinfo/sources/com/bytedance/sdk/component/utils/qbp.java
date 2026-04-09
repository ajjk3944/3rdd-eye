package com.bytedance.sdk.component.utils;

import a0.g;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class qbp {
    private static boolean ouw = false;
    private static String vt = "";

    public static void lh(String str, Object... objArr) {
        if (ouw) {
            Log.w(vt(str), ouw(objArr));
        }
    }

    public static void ouw() {
        ouw = true;
    }

    public static void vt() {
        ouw = false;
    }

    public static void yu(String str, Object... objArr) {
        if (ouw) {
            Log.e(vt(str), ouw(objArr));
        }
    }

    public static void ouw(String str, String str2) {
        if (ouw && str2 != null) {
            Log.d(vt(str), str2);
        }
    }

    public static void vt(String str, String str2) {
        if (ouw && str2 != null) {
            Log.i(vt(str), str2);
        }
    }

    public static void lh(String str, String str2) {
        if (ouw && str2 != null) {
            Log.e(vt(str), str2);
        }
    }

    public static void ouw(String str, Object... objArr) {
        if (ouw) {
            Log.d(vt(str), ouw(objArr));
        }
    }

    public static void vt(String str, Object... objArr) {
        if (ouw) {
            Log.i(vt(str), ouw(objArr));
        }
    }

    public static void ouw(String str, String str2, Throwable th2) {
        if (ouw) {
            Log.e(vt(str), str2, th2);
        }
    }

    private static String vt(String str) {
        return TextUtils.isEmpty(vt) ? str : ouw(g.p(new StringBuilder("["), vt, "]-[", str, "]"));
    }

    public static void ouw(String str) {
        vt = str;
    }

    private static String ouw(Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (Object obj : objArr) {
                if (obj != null) {
                    sb2.append(obj.toString());
                } else {
                    sb2.append(" null ");
                }
                sb2.append(" ");
            }
            return sb2.toString();
        }
        return "";
    }
}
