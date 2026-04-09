package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes.dex */
public final class Y1 implements InterfaceC0914b2 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f12573a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f12574b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12575c;

    public Y1(long j6, long[] jArr, long[] jArr2) {
        this.f12573a = jArr;
        this.f12574b = jArr2;
        this.f12575c = j6 == -9223372036854775807L ? Vt.s(jArr2[jArr2.length - 1]) : j6;
    }

    public static Pair b(long j6, long[] jArr, long[] jArr2) {
        int iQ = Vt.q(jArr, j6, true);
        long j7 = jArr[iQ];
        long j8 = jArr2[iQ];
        int i = iQ + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j7), Long.valueOf(j8));
        }
        return Pair.create(Long.valueOf(j6), Long.valueOf(((long) ((jArr[i] == j7 ? 0.0d : (j6 - j7) / (r6 - j7)) * (jArr2[i] - j8))) + j8));
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final long a() {
        return this.f12575c;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final boolean c() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0914b2
    public final long d() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0914b2
    public final int e() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0914b2
    public final long g(long j6) {
        return Vt.s(((Long) b(j6, this.f12573a, this.f12574b).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final K0 i(long j6) {
        String str = Vt.f12096a;
        Pair pairB = b(Vt.r(Math.max(0L, Math.min(j6, this.f12575c))), this.f12574b, this.f12573a);
        M0 m02 = new M0(Vt.s(((Long) pairB.first).longValue()), ((Long) pairB.second).longValue());
        return new K0(m02, m02);
    }
}
