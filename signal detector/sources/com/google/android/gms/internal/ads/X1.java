package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class X1 implements InterfaceC0914b2, L0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f12352a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12353b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12354c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12355d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12356e;

    /* renamed from: f, reason: collision with root package name */
    public final long f12357f;

    /* renamed from: g, reason: collision with root package name */
    public final long f12358g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12359h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final long f12360j;

    public X1(int i, int i3, long j6, long j7) {
        long jMax;
        this.f12352a = j6;
        this.f12353b = j7;
        this.f12354c = i3 == -1 ? 1 : i3;
        this.f12356e = i;
        if (j6 == -1) {
            this.f12355d = -1L;
            jMax = -9223372036854775807L;
        } else {
            long j8 = j6 - j7;
            this.f12355d = j8;
            jMax = (Math.max(0L, j8) * 8000000) / i;
        }
        this.f12357f = jMax;
        this.f12358g = j7;
        this.f12359h = i;
        this.i = i3;
        this.f12360j = j6 == -1 ? -1L : j6;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final long a() {
        return this.f12357f;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final boolean c() {
        return this.f12355d != -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0914b2
    public final long d() {
        return this.f12360j;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0914b2
    public final int e() {
        return this.f12359h;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0914b2
    public final long g(long j6) {
        return (Math.max(0L, j6 - this.f12353b) * 8000000) / this.f12356e;
    }

    @Override // com.google.android.gms.internal.ads.L0
    public final K0 i(long j6) {
        long j7 = this.f12355d;
        long j8 = this.f12353b;
        if (j7 == -1) {
            M0 m02 = new M0(0L, j8);
            return new K0(m02, m02);
        }
        int i = this.f12356e;
        long j9 = this.f12354c;
        long jMin = (((i * j6) / 8000000) / j9) * j9;
        if (j7 != -1) {
            jMin = Math.min(jMin, j7 - j9);
        }
        long jMax = Math.max(jMin, 0L) + j8;
        long jMax2 = (Math.max(0L, jMax - j8) * 8000000) / i;
        M0 m03 = new M0(jMax2, jMax);
        if (j7 != -1 && jMax2 < j6) {
            long j10 = jMax + j9;
            if (j10 < this.f12352a) {
                return new K0(m03, new M0((Math.max(0L, j10 - j8) * 8000000) / i, j10));
            }
        }
        return new K0(m03, m03);
    }
}
