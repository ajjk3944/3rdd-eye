package com.mbridge.msdk.foundation.tools;

import android.net.ConnectivityManager;

/* loaded from: classes3.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    private static ConnectivityManager f15445a;

    public static synchronized ConnectivityManager a() {
        try {
        } catch (Exception e10) {
            q0.b("NetManager", e10.getMessage());
        }
        if (f15445a != null || com.mbridge.msdk.foundation.controller.c.n().d() == null) {
        } else {
            f15445a = (ConnectivityManager) com.mbridge.msdk.foundation.controller.c.n().d().getSystemService("connectivity");
        }
        return f15445a;
    }
}
