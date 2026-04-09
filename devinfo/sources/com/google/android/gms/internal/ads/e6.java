package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e6 implements m2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f6 f10711a;

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final long b() {
        f6 f6Var = this.f10711a;
        l6 l6Var = f6Var.f11011d;
        return (f6Var.f11013f * 1000000) / l6Var.f13390i;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final l2 g(long j) {
        f6 f6Var = this.f10711a;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((f6Var.f11011d.f13390i * j) / 1000000);
        long j8 = f6Var.f11010c;
        long j9 = f6Var.f11009b;
        long jLongValue = bigIntegerValueOf.multiply(BigInteger.valueOf(j8 - j9)).divide(BigInteger.valueOf(f6Var.f11013f)).longValue() + j9;
        String str = bq0.f9768a;
        n2 n2Var = new n2(j, Math.max(j9, Math.min(jLongValue - 30000, j8 - 1)));
        return new l2(n2Var, n2Var);
    }
}
