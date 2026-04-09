package io.sentry.android.core;

import android.net.NetworkCapabilities;
import android.os.Build;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11750a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11751b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11752c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11753d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11754e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11755f;

    public q0(NetworkCapabilities networkCapabilities, f0 f0Var, long j) {
        ir.f0.T(networkCapabilities, "NetworkCapabilities is required");
        ir.f0.T(f0Var, "BuildInfoProvider is required");
        this.f11750a = networkCapabilities.getLinkDownstreamBandwidthKbps();
        this.f11751b = networkCapabilities.getLinkUpstreamBandwidthKbps();
        int signalStrength = Build.VERSION.SDK_INT >= 29 ? networkCapabilities.getSignalStrength() : 0;
        this.f11752c = signalStrength > -100 ? signalStrength : 0;
        this.f11754e = networkCapabilities.hasTransport(4);
        String strW = io.sentry.android.core.internal.util.c.w(networkCapabilities);
        this.f11755f = strW == null ? "" : strW;
        this.f11753d = j;
    }
}
