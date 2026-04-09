package io.sentry.android.core;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import io.sentry.b5;
import io.sentry.l4;
import io.sentry.v3;

/* loaded from: classes.dex */
public final class r0 extends ConnectivityManager.NetworkCallback {

    /* renamed from: b, reason: collision with root package name */
    public final f0 f11760b;

    /* renamed from: e, reason: collision with root package name */
    public final l4 f11763e;

    /* renamed from: c, reason: collision with root package name */
    public NetworkCapabilities f11761c = null;

    /* renamed from: d, reason: collision with root package name */
    public long f11762d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final v3 f11759a = v3.f12830a;

    public r0(f0 f0Var, l4 l4Var) {
        ir.f0.T(f0Var, "BuildInfoProvider is required");
        this.f11760b = f0Var;
        ir.f0.T(l4Var, "SentryDateProvider is required");
        this.f11763e = l4Var;
    }

    public static io.sentry.e a(String str) {
        io.sentry.e eVar = new io.sentry.e();
        eVar.f12204x = "system";
        eVar.B = "network.event";
        eVar.b(str, "action");
        eVar.E = b5.INFO;
        return eVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f11759a.m(a("NETWORK_AVAILABLE"));
        this.f11761c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    @Override // android.net.ConnectivityManager.NetworkCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCapabilitiesChanged(android.net.Network r20, android.net.NetworkCapabilities r21) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.r0.onCapabilitiesChanged(android.net.Network, android.net.NetworkCapabilities):void");
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f11759a.m(a("NETWORK_LOST"));
        this.f11761c = null;
    }
}
