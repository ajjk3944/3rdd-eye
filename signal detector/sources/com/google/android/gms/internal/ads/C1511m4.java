package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.m4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1511m4 implements L0 {

    /* renamed from: a, reason: collision with root package name */
    public final C1401k2 f15522a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15523b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15524c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15525d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15526e;

    public C1511m4(C1401k2 c1401k2, int i, long j6, long j7) {
        this.f15522a = c1401k2;
        this.f15523b = i;
        this.f15524c = j6;
        long j8 = (j7 - j6) / c1401k2.f15055c;
        this.f15525d = j8;
        this.f15526e = b(j8);
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final long a() {
        return this.f15526e;
    }

    public final long b(long j6) {
        return Vt.u(j6 * this.f15523b, 1000000L, this.f15522a.f15054b, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final boolean c() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final K0 i(long j6) {
        long j7 = this.f15523b;
        C1401k2 c1401k2 = this.f15522a;
        long j8 = (c1401k2.f15054b * j6) / (j7 * 1000000);
        String str = Vt.f12096a;
        long j9 = this.f15525d - 1;
        long jMax = Math.max(0L, Math.min(j8, j9));
        long j10 = c1401k2.f15055c;
        long jB = b(jMax);
        long j11 = this.f15524c;
        M0 m02 = new M0(jB, (jMax * j10) + j11);
        if (jB >= j6 || jMax == j9) {
            return new K0(m02, m02);
        }
        long j12 = jMax + 1;
        return new K0(m02, new M0(b(j12), (j10 * j12) + j11));
    }
}
