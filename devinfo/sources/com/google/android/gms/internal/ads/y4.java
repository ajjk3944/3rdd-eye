package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y4 implements b5 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f18624a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f18625b;

    /* renamed from: c, reason: collision with root package name */
    public final long f18626c;

    public y4(long j, long[] jArr, long[] jArr2) {
        this.f18624a = jArr;
        this.f18625b = jArr2;
        this.f18626c = j == -9223372036854775807L ? bq0.s(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair c(long j, long[] jArr, long[] jArr2) {
        int iQ = bq0.q(jArr, j, true);
        long j8 = jArr[iQ];
        long j9 = jArr2[iQ];
        int i4 = iQ + 1;
        if (i4 == jArr.length) {
            return Pair.create(Long.valueOf(j8), Long.valueOf(j9));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i4] == j8 ? 0.0d : (j - j8) / (r6 - j8)) * (jArr2[i4] - j9))) + j9));
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final long b() {
        return this.f18626c;
    }

    @Override // com.google.android.gms.internal.ads.b5
    public final long d() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.b5
    public final int e() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.b5
    public final long f(long j) {
        return bq0.s(((Long) c(j, this.f18624a, this.f18625b).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final l2 g(long j) {
        String str = bq0.f9768a;
        Pair pairC = c(bq0.r(Math.max(0L, Math.min(j, this.f18626c))), this.f18625b, this.f18624a);
        n2 n2Var = new n2(bq0.s(((Long) pairC.first).longValue()), ((Long) pairC.second).longValue());
        return new l2(n2Var, n2Var);
    }
}
