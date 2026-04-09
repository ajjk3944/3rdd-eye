package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1371jQ implements InterfaceC1695pQ, InterfaceC1641oQ {

    /* renamed from: a, reason: collision with root package name */
    public final C1749qQ f14943a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14944b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1292i f14945c;

    /* renamed from: d, reason: collision with root package name */
    public XP f14946d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1695pQ f14947e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC1641oQ f14948f;

    /* renamed from: g, reason: collision with root package name */
    public long f14949g = -9223372036854775807L;

    public C1371jQ(C1749qQ c1749qQ, InterfaceC1292i interfaceC1292i, long j6) {
        this.f14943a = c1749qQ;
        this.f14945c = interfaceC1292i;
        this.f14944b = j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final void a(long j6) {
        InterfaceC1695pQ interfaceC1695pQ = this.f14947e;
        String str = Vt.f12096a;
        interfaceC1695pQ.a(j6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final long b(InterfaceC1020d[] interfaceC1020dArr, boolean[] zArr, MQ[] mqArr, boolean[] zArr2, long j6) {
        long j7 = this.f14949g;
        long j8 = (j7 == -9223372036854775807L || j6 != this.f14944b) ? j6 : j7;
        this.f14949g = -9223372036854775807L;
        InterfaceC1695pQ interfaceC1695pQ = this.f14947e;
        String str = Vt.f12096a;
        return interfaceC1695pQ.b(interfaceC1020dArr, zArr, mqArr, zArr2, j8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final long c(long j6, C2178yO c2178yO) {
        InterfaceC1695pQ interfaceC1695pQ = this.f14947e;
        String str = Vt.f12096a;
        return interfaceC1695pQ.c(j6, c2178yO);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1641oQ
    public final /* bridge */ /* synthetic */ void d(NQ nq) {
        InterfaceC1641oQ interfaceC1641oQ = this.f14948f;
        String str = Vt.f12096a;
        interfaceC1641oQ.d(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1641oQ
    public final void e(InterfaceC1695pQ interfaceC1695pQ) {
        InterfaceC1641oQ interfaceC1641oQ = this.f14948f;
        String str = Vt.f12096a;
        interfaceC1641oQ.e(this);
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final boolean f(C1045dO c1045dO) {
        InterfaceC1695pQ interfaceC1695pQ = this.f14947e;
        return interfaceC1695pQ != null && interfaceC1695pQ.f(c1045dO);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final long g() {
        InterfaceC1695pQ interfaceC1695pQ = this.f14947e;
        String str = Vt.f12096a;
        return interfaceC1695pQ.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final long h(long j6) {
        InterfaceC1695pQ interfaceC1695pQ = this.f14947e;
        String str = Vt.f12096a;
        return interfaceC1695pQ.h(j6);
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final long i() {
        InterfaceC1695pQ interfaceC1695pQ = this.f14947e;
        String str = Vt.f12096a;
        return interfaceC1695pQ.i();
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final long j() {
        InterfaceC1695pQ interfaceC1695pQ = this.f14947e;
        String str = Vt.f12096a;
        return interfaceC1695pQ.j();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final void k(InterfaceC1641oQ interfaceC1641oQ, long j6) {
        this.f14948f = interfaceC1641oQ;
        InterfaceC1695pQ interfaceC1695pQ = this.f14947e;
        if (interfaceC1695pQ != null) {
            long j7 = this.f14949g;
            if (j7 == -9223372036854775807L) {
                j7 = this.f14944b;
            }
            interfaceC1695pQ.k(this, j7);
        }
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final void l(long j6) {
        InterfaceC1695pQ interfaceC1695pQ = this.f14947e;
        String str = Vt.f12096a;
        interfaceC1695pQ.l(j6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final SQ m() {
        InterfaceC1695pQ interfaceC1695pQ = this.f14947e;
        String str = Vt.f12096a;
        return interfaceC1695pQ.m();
    }

    public final void n(C1749qQ c1749qQ) {
        long j6 = this.f14949g;
        if (j6 == -9223372036854775807L) {
            j6 = this.f14944b;
        }
        XP xp = this.f14946d;
        xp.getClass();
        InterfaceC1695pQ interfaceC1695pQC = xp.c(c1749qQ, this.f14945c, j6);
        this.f14947e = interfaceC1695pQC;
        if (this.f14948f != null) {
            interfaceC1695pQC.k(this, j6);
        }
    }

    @Override // com.google.android.gms.internal.ads.NQ
    public final boolean o() {
        InterfaceC1695pQ interfaceC1695pQ = this.f14947e;
        return interfaceC1695pQ != null && interfaceC1695pQ.o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695pQ
    public final void s() {
        InterfaceC1695pQ interfaceC1695pQ = this.f14947e;
        if (interfaceC1695pQ != null) {
            interfaceC1695pQ.s();
            return;
        }
        XP xp = this.f14946d;
        if (xp != null) {
            xp.r();
        }
    }
}
