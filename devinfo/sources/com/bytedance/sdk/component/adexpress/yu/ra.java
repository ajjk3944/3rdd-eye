package com.bytedance.sdk.component.adexpress.yu;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra {
    public static float lh(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f7383lh.vt();
        }
        return f10 * vt(context);
    }

    public static int ouw(float f10, float f11, float f12, float f13) {
        return (((int) ((f10 * 255.0f) + 0.5f)) << 24) | (((int) ((f11 * 255.0f) + 0.5f)) << 16) | (((int) ((f12 * 255.0f) + 0.5f)) << 8) | ((int) ((f13 * 255.0f) + 0.5f));
    }

    public static int vt(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f7383lh.vt();
        }
        float fVt = vt(context);
        if (fVt <= 0.0f) {
            fVt = 1.0f;
        }
        return (int) ((f10 / fVt) + 0.5f);
    }

    public static float ouw(Context context, float f10) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f7383lh.vt();
        }
        return (f10 * vt(context)) + 0.5f;
    }

    private static float vt(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String ouw(android.content.Context r3) {
        /*
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2f
            r2 = 24
            if (r1 < r2) goto L18
            android.content.res.Resources r3 = com.bytedance.sdk.component.utils.vpp.vt(r3)     // Catch: java.lang.Throwable -> L2f
            android.content.res.Configuration r3 = r3.getConfiguration()     // Catch: java.lang.Throwable -> L2f
            android.os.LocaleList r3 = r3.getLocales()     // Catch: java.lang.Throwable -> L2f
            java.util.Locale r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L2f
            goto L1c
        L18:
            java.util.Locale r3 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L2f
        L1c:
            java.lang.String r1 = r3.getLanguage()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r3.getCountry()     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "TW"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L31
            java.lang.String r1 = "zhHant"
            goto L31
        L2f:
            java.lang.String r1 = ""
        L31:
            r1.getClass()
            int r3 = r1.hashCode()
            r2 = -1
            switch(r3) {
                case 3121: goto L6a;
                case 3383: goto L5f;
                case 3428: goto L54;
                case 3494: goto L49;
                case 3886: goto L3e;
                default: goto L3c;
            }
        L3c:
            r0 = r2
            goto L73
        L3e:
            java.lang.String r3 = "zh"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L47
            goto L3c
        L47:
            r0 = 4
            goto L73
        L49:
            java.lang.String r3 = "ms"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L52
            goto L3c
        L52:
            r0 = 3
            goto L73
        L54:
            java.lang.String r3 = "ko"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L5d
            goto L3c
        L5d:
            r0 = 2
            goto L73
        L5f:
            java.lang.String r3 = "ja"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L68
            goto L3c
        L68:
            r0 = 1
            goto L73
        L6a:
            java.lang.String r3 = "ar"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L73
            goto L3c
        L73:
            switch(r0) {
                case 0: goto L83;
                case 1: goto L80;
                case 2: goto L7d;
                case 3: goto L7a;
                case 4: goto L77;
                default: goto L76;
            }
        L76:
            goto L85
        L77:
            java.lang.String r1 = "cn"
            goto L85
        L7a:
            java.lang.String r1 = "my"
            goto L85
        L7d:
            java.lang.String r1 = "korea"
            goto L85
        L80:
            java.lang.String r1 = "japan"
            goto L85
        L83:
            java.lang.String r1 = "aa"
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.yu.ra.ouw(android.content.Context):java.lang.String");
    }
}
