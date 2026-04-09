package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1023d2 implements InterfaceC0914b2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f13707a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13708b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13709c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13710d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13711e;

    /* renamed from: f, reason: collision with root package name */
    public final long f13712f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f13713g;

    public C1023d2(long j6, int i, long j7, int i3, long j8, long[] jArr) {
        this.f13707a = j6;
        this.f13708b = i;
        this.f13709c = j7;
        this.f13710d = i3;
        this.f13711e = j8;
        this.f13713g = jArr;
        this.f13712f = j8 != -1 ? j6 + j8 : -1L;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final long a() {
        return this.f13709c;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final boolean c() {
        return this.f13713g != null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0914b2
    public final long d() {
        return this.f13712f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0914b2
    public final int e() {
        return this.f13710d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0914b2
    public final long g(long j6) {
        if (!c()) {
            return 0L;
        }
        long j7 = j6 - this.f13707a;
        if (j7 <= this.f13708b) {
            return 0L;
        }
        long[] jArr = this.f13713g;
        jArr.getClass();
        double d6 = (j7 * 256.0d) / this.f13711e;
        int iQ = Vt.q(jArr, (long) d6, true);
        long j8 = this.f13709c;
        long j9 = (iQ * j8) / 100;
        long j10 = jArr[iQ];
        int i = iQ + 1;
        long j11 = (j8 * i) / 100;
        return Math.round((j10 == (iQ == 99 ? 256L : jArr[i]) ? 0.0d : (d6 - j10) / (r0 - j10)) * (j11 - j9)) + j9;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final K0 i(long j6) {
        double d6;
        double d7;
        boolean zC = c();
        int i = this.f13708b;
        long j7 = this.f13707a;
        if (!zC) {
            M0 m02 = new M0(0L, j7 + i);
            return new K0(m02, m02);
        }
        String str = Vt.f12096a;
        long j8 = this.f13709c;
        long jMax = Math.max(0L, Math.min(j6, j8));
        double d8 = (jMax * 100.0d) / j8;
        double d9 = 0.0d;
        if (d8 <= 0.0d) {
            d6 = 256.0d;
        } else if (d8 >= 100.0d) {
            d6 = 256.0d;
            d9 = 256.0d;
        } else {
            int i3 = (int) d8;
            long[] jArr = this.f13713g;
            jArr.getClass();
            double d10 = jArr[i3];
            if (i3 == 99) {
                d6 = 256.0d;
                d7 = 256.0d;
            } else {
                d6 = 256.0d;
                d7 = jArr[i3 + 1];
            }
            d9 = ((d7 - d10) * (d8 - i3)) + d10;
        }
        long j9 = this.f13711e;
        M0 m03 = new M0(jMax, j7 + Math.max(i, Math.min(Math.round((d9 / d6) * j9), j9 - 1)));
        return new K0(m03, m03);
    }
}
