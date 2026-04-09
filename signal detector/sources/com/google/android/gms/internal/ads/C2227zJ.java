package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* renamed from: com.google.android.gms.internal.ads.zJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2227zJ extends DJ {

    /* renamed from: c, reason: collision with root package name */
    public final C2119xJ f17853c;

    /* renamed from: d, reason: collision with root package name */
    public final BigInteger f17854d;

    /* renamed from: e, reason: collision with root package name */
    public final C1313iK f17855e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f17856f;

    public C2227zJ(C2119xJ c2119xJ, BigInteger bigInteger, C1313iK c1313iK, Integer num) {
        super(12);
        this.f17853c = c2119xJ;
        this.f17854d = bigInteger;
        this.f17855e = c1313iK;
        this.f17856f = num;
    }

    @Override // com.google.android.gms.internal.ads.DJ
    public final C1313iK W() {
        return this.f17855e;
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final /* synthetic */ AbstractC1089eE g() {
        return this.f17853c;
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final Integer q() {
        return this.f17856f;
    }
}
