package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n9 implements m2 {

    /* renamed from: a, reason: collision with root package name */
    public final l5 f14180a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14181b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14182c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14183d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14184e;

    public n9(l5 l5Var, int i4, long j, long j8) {
        this.f14180a = l5Var;
        this.f14181b = i4;
        this.f14182c = j;
        long j9 = (j8 - j) / l5Var.f13374c;
        this.f14183d = j9;
        this.f14184e = c(j9);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final long b() {
        return this.f14184e;
    }

    public final long c(long j) {
        return bq0.u(j * this.f14181b, 1000000L, this.f14180a.f13373b, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final l2 g(long j) {
        long j8 = this.f14181b;
        l5 l5Var = this.f14180a;
        long j9 = (l5Var.f13373b * j) / (j8 * 1000000);
        String str = bq0.f9768a;
        long j10 = this.f14183d - 1;
        long jMax = Math.max(0L, Math.min(j9, j10));
        long j11 = l5Var.f13374c;
        long jC = c(jMax);
        long j12 = this.f14182c;
        n2 n2Var = new n2(jC, (jMax * j11) + j12);
        if (jC >= j || jMax == j10) {
            return new l2(n2Var, n2Var);
        }
        long j13 = jMax + 1;
        return new l2(n2Var, new n2(c(j13), (j11 * j13) + j12));
    }
}
