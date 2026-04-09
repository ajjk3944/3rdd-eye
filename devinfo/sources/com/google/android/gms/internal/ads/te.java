package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class te {

    /* renamed from: a, reason: collision with root package name */
    public NetworkCapabilities f16792a;

    public static te a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        te teVar = new te();
        if (connectivityManager != null && Build.VERSION.SDK_INT >= 24) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new se(0, teVar));
                return teVar;
            } catch (RuntimeException unused) {
                synchronized (te.class) {
                    teVar.f16792a = null;
                }
            }
        }
        return teVar;
    }
}
