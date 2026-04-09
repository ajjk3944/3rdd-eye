package com.google.android.gms.internal.ads;

import java.security.spec.ECPoint;

/* loaded from: classes.dex */
public final class ZI extends DJ {

    /* renamed from: c, reason: collision with root package name */
    public final XI f12812c;

    /* renamed from: d, reason: collision with root package name */
    public final ECPoint f12813d;

    /* renamed from: e, reason: collision with root package name */
    public final C1313iK f12814e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f12815f;

    public ZI(XI xi, ECPoint eCPoint, C1313iK c1313iK, Integer num) {
        super(12);
        this.f12812c = xi;
        this.f12813d = eCPoint;
        this.f12814e = c1313iK;
        this.f12815f = num;
    }

    @Override // com.google.android.gms.internal.ads.DJ
    public final C1313iK W() {
        return this.f12814e;
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final /* synthetic */ AbstractC1089eE g() {
        return this.f12812c;
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final Integer q() {
        return this.f12815f;
    }
}
