package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ZP implements InterfaceC1695pQ, InterfaceC1641oQ {

    /* renamed from: a, reason: collision with root package name */
    public final C1371jQ f12889a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1641oQ f12890b;

    /* renamed from: c, reason: collision with root package name */
    public YP[] f12891c = new YP[0];

    /* renamed from: d, reason: collision with root package name */
    public long f12892d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f12893e;

    public ZP(C1371jQ c1371jQ, long j6) {
        this.f12889a = c1371jQ;
        this.f12893e = j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final void a(long j6) {
        this.f12889a.a(j6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final long b(InterfaceC1020d[] interfaceC1020dArr, boolean[] zArr, MQ[] mqArr, boolean[] zArr2, long j6) {
        int length = mqArr.length;
        this.f12891c = new YP[length];
        MQ[] mqArr2 = new MQ[length];
        for (int i = 0; i < mqArr.length; i++) {
            YP[] ypArr = this.f12891c;
            YP yp = (YP) mqArr[i];
            ypArr[i] = yp;
            mqArr2[i] = yp != null ? yp.f12638a : null;
        }
        long jB = this.f12889a.b(interfaceC1020dArr, zArr, mqArr2, zArr2, j6);
        long j7 = this.f12893e;
        long jMax = Math.max(jB, j6);
        if (j7 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j7);
        }
        long j8 = -9223372036854775807L;
        if (n()) {
            if (jB < j6) {
                j8 = jMax;
                break;
            }
            if (jB != 0) {
                for (InterfaceC1020d interfaceC1020d : interfaceC1020dArr) {
                    if (interfaceC1020d != null) {
                        TP tpF = interfaceC1020d.f();
                        if (!D4.d(tpF.f11397m, tpF.f11394j)) {
                            j8 = jMax;
                            break;
                        }
                    }
                }
            }
        }
        this.f12892d = j8;
        for (int i3 = 0; i3 < mqArr.length; i3++) {
            MQ mq = mqArr2[i3];
            if (mq == null) {
                this.f12891c[i3] = null;
            } else {
                YP[] ypArr2 = this.f12891c;
                YP yp2 = ypArr2[i3];
                if (yp2 == null || yp2.f12638a != mq) {
                    ypArr2[i3] = new YP(this, mq);
                }
            }
            mqArr[i3] = this.f12891c[i3];
        }
        return jMax;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final long c(long j6, C2178yO c2178yO) {
        if (j6 == 0) {
            return 0L;
        }
        long j7 = c2178yO.f17718a;
        String str = Vt.f12096a;
        long jMax = Math.max(0L, Math.min(j7, j6));
        long j8 = c2178yO.f17719b;
        long j9 = this.f12893e;
        long jMax2 = Math.max(0L, Math.min(j8, j9 == Long.MIN_VALUE ? Long.MAX_VALUE : j9 - j6));
        if (jMax != j7 || jMax2 != j8) {
            c2178yO = new C2178yO(jMax, jMax2);
        }
        return this.f12889a.c(j6, c2178yO);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1641oQ
    public final /* bridge */ /* synthetic */ void d(NQ nq) {
        InterfaceC1641oQ interfaceC1641oQ = this.f12890b;
        interfaceC1641oQ.getClass();
        interfaceC1641oQ.d(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1641oQ
    public final void e(InterfaceC1695pQ interfaceC1695pQ) {
        InterfaceC1641oQ interfaceC1641oQ = this.f12890b;
        interfaceC1641oQ.getClass();
        interfaceC1641oQ.e(this);
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final boolean f(C1045dO c1045dO) {
        return this.f12889a.f(c1045dO);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final long g() {
        if (n()) {
            long j6 = this.f12892d;
            this.f12892d = -9223372036854775807L;
            long jG = g();
            return jG != -9223372036854775807L ? jG : j6;
        }
        long jG2 = this.f12889a.g();
        if (jG2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j7 = this.f12893e;
        long jMax = Math.max(jG2, 0L);
        return j7 != Long.MIN_VALUE ? Math.min(jMax, j7) : jMax;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final long h(long j6) {
        this.f12892d = -9223372036854775807L;
        for (YP yp : this.f12891c) {
            if (yp != null) {
                yp.f12639b = false;
            }
        }
        long jH = this.f12889a.h(j6);
        long j7 = this.f12893e;
        long jMax = Math.max(jH, 0L);
        return j7 != Long.MIN_VALUE ? Math.min(jMax, j7) : jMax;
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final long i() {
        long jI = this.f12889a.i();
        if (jI != Long.MIN_VALUE) {
            long j6 = this.f12893e;
            if (j6 == Long.MIN_VALUE || jI < j6) {
                return jI;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final long j() {
        long j6 = this.f12889a.j();
        if (j6 != Long.MIN_VALUE) {
            long j7 = this.f12893e;
            if (j7 == Long.MIN_VALUE || j6 < j7) {
                return j6;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final void k(InterfaceC1641oQ interfaceC1641oQ, long j6) {
        this.f12890b = interfaceC1641oQ;
        this.f12889a.k(this, j6);
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final void l(long j6) {
        this.f12889a.l(j6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final SQ m() {
        return this.f12889a.m();
    }

    public final boolean n() {
        return this.f12892d != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final boolean o() {
        return this.f12889a.o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final void s() {
        this.f12889a.s();
    }
}
