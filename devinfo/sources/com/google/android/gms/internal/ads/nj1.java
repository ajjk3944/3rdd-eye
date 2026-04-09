package com.google.android.gms.internal.ads;

import java.security.spec.ECPoint;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class nj1 extends qk1 {

    /* renamed from: c, reason: collision with root package name */
    public final lj1 f14304c;

    /* renamed from: d, reason: collision with root package name */
    public final ECPoint f14305d;

    /* renamed from: e, reason: collision with root package name */
    public final vl1 f14306e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f14307f;

    public nj1(lj1 lj1Var, ECPoint eCPoint, vl1 vl1Var, Integer num) {
        super(12);
        this.f14304c = lj1Var;
        this.f14305d = eCPoint;
        this.f14306e = vl1Var;
        this.f14307f = num;
    }

    @Override // com.google.android.gms.internal.ads.qk1
    public final vl1 Z() {
        return this.f14306e;
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final /* synthetic */ s91 k() {
        return this.f14304c;
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final Integer u() {
        return this.f14307f;
    }
}
