package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* renamed from: com.google.android.gms.internal.ads.sJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1849sJ extends DJ {

    /* renamed from: c, reason: collision with root package name */
    public final C1688pJ f16702c;

    /* renamed from: d, reason: collision with root package name */
    public final BigInteger f16703d;

    /* renamed from: e, reason: collision with root package name */
    public final C1313iK f16704e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f16705f;

    public C1849sJ(C1688pJ c1688pJ, BigInteger bigInteger, C1313iK c1313iK, Integer num) {
        super(12);
        this.f16702c = c1688pJ;
        this.f16703d = bigInteger;
        this.f16704e = c1313iK;
        this.f16705f = num;
    }

    @Override // com.google.android.gms.internal.ads.DJ
    public final C1313iK W() {
        return this.f16704e;
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final /* synthetic */ AbstractC1089eE g() {
        return this.f16702c;
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final Integer q() {
        return this.f16705f;
    }
}
