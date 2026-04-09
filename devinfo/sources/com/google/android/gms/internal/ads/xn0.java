package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xn0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f18432a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18433b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18434c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18435d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18436e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18437f;

    public xn0(String str, int i4, int i10, int i11, boolean z3, int i12) {
        this.f18432a = str;
        this.f18433b = i4;
        this.f18434c = i10;
        this.f18435d = i11;
        this.f18436e = z3;
        this.f18437f = i12;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((t50) obj).f16705a;
        mq0.v(bundle, "carrier", this.f18432a, !TextUtils.isEmpty(r0));
        int i4 = this.f18433b;
        mq0.I(bundle, "cnt", i4, i4 != -2);
        bundle.putInt("gnt", this.f18434c);
        bundle.putInt("pt", this.f18435d);
        Bundle bundleA = mq0.a(bundle, "device");
        bundle.putBundle("device", bundleA);
        Bundle bundleA2 = mq0.a(bundleA, "network");
        bundleA.putBundle("network", bundleA2);
        bundleA2.putInt("active_network_state", this.f18437f);
        bundleA2.putBoolean("active_network_metered", this.f18436e);
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* synthetic */ void h(Object obj) {
    }
}
