package com.bytedance.sdk.component.ouw;

import android.text.TextUtils;
import d.h;
import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class th {
    static boolean ouw;

    public static String ouw(Throwable th2) {
        return c.j(th2 instanceof rn ? ((rn) th2).ouw : 0, "}", new StringBuilder("{\"code\":"));
    }

    public static String ouw(String str, boolean z3) {
        String strSubstring;
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        if (ouw && !z3) {
            strSubstring = str.substring(1, str.length() - 1);
        } else {
            strSubstring = "";
        }
        String strConcat = "{\"code\":1,\"__data\":".concat(String.valueOf(str));
        if (!strSubstring.isEmpty()) {
            return strConcat + "," + strSubstring + "}";
        }
        return h.s(strConcat, "}");
    }
}
