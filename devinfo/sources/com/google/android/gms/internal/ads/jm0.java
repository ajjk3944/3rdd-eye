package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class jm0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final double f12786a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12787b;

    public jm0(double d10, boolean z3) {
        this.f12786a = d10;
        this.f12787b = z3;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((t50) obj).f16705a;
        Bundle bundleA = mq0.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        Bundle bundleA2 = mq0.a(bundleA, "battery");
        bundleA.putBundle("battery", bundleA2);
        bundleA2.putBoolean("is_charging", this.f12787b);
        bundleA2.putDouble("battery_level", this.f12786a);
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* synthetic */ void h(Object obj) {
    }
}
