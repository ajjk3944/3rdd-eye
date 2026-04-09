package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes3.dex */
public final class ch1 {
    public static final String a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        try {
            Object systemService = context.getApplicationContext().getSystemService("connectivity");
            kotlin.jvm.internal.l.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            return activeNetworkInfo.getType() == 0 ? activeNetworkInfo.getSubtypeName() : activeNetworkInfo.getTypeName();
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Point b(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.l.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Boolean c(android.content.Context r1) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.l.f(r1, r0)
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = "null cannot be cast to non-null type android.net.ConnectivityManager"
            kotlin.jvm.internal.l.d(r1, r0)     // Catch: java.lang.Throwable -> L2b
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1     // Catch: java.lang.Throwable -> L2b
            android.net.Network r0 = r1.getActiveNetwork()     // Catch: java.lang.Throwable -> L2b
            android.net.NetworkCapabilities r1 = r1.getNetworkCapabilities(r0)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L25
            r0 = 4
            boolean r1 = r1.hasTransport(r0)     // Catch: java.lang.Throwable -> L2b
            r0 = 1
            if (r1 != r0) goto L25
            goto L26
        L25:
            r0 = 0
        L26:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L2b
            return r1
        L2b:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ch1.c(android.content.Context):java.lang.Boolean");
    }
}
