package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1533mQ extends AbstractC1047dQ {

    /* renamed from: k, reason: collision with root package name */
    public final XP f15619k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f15620l;

    /* renamed from: m, reason: collision with root package name */
    public final U7 f15621m;

    /* renamed from: n, reason: collision with root package name */
    public final I7 f15622n;

    /* renamed from: o, reason: collision with root package name */
    public C1425kQ f15623o;

    /* renamed from: p, reason: collision with root package name */
    public C1371jQ f15624p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f15625q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f15626r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15627s;

    public C1533mQ(XP xp, boolean z6) {
        boolean z7;
        this.f15619k = xp;
        if (z6) {
            xp.e();
            z7 = true;
        } else {
            z7 = false;
        }
        this.f15620l = z7;
        this.f15621m = new U7();
        this.f15622n = new I7();
        xp.d();
        this.f15623o = new C1425kQ(new C1479lQ(xp.f()), U7.f11601m, C1425kQ.f15163e);
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final void a(C1241h2 c1241h2) {
        if (this.f15627s) {
            C1425kQ c1425kQ = this.f15623o;
            this.f15623o = new C1425kQ(new C1962uO(this.f15623o.f14270b, c1241h2), c1425kQ.f15164c, c1425kQ.f15165d);
        } else {
            this.f15623o = new C1425kQ(new C1479lQ(c1241h2), U7.f11601m, C1425kQ.f15163e);
        }
        this.f15619k.a(c1241h2);
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final void b(InterfaceC1695pQ interfaceC1695pQ) {
        C1371jQ c1371jQ = (C1371jQ) interfaceC1695pQ;
        InterfaceC1695pQ interfaceC1695pQ2 = c1371jQ.f14947e;
        if (interfaceC1695pQ2 != null) {
            XP xp = c1371jQ.f14946d;
            xp.getClass();
            xp.b(interfaceC1695pQ2);
        }
        if (interfaceC1695pQ == this.f15624p) {
            this.f15624p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final void d() {
        this.f15619k.d();
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final void e() {
        this.f15619k.e();
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final C1241h2 f() {
        return this.f15619k.f();
    }

    @Override // com.google.android.gms.internal.ads.XP
    public final void h(InterfaceC1958uK interfaceC1958uK) {
        this.f13765j = interfaceC1958uK;
        this.i = Vt.n();
        if (this.f15620l) {
            return;
        }
        this.f15625q = true;
        t(null, this.f15619k);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1047dQ, com.google.android.gms.internal.ads.XP
    public final void j() {
        this.f15626r = false;
        this.f15625q = false;
        super.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    @Override // com.google.android.gms.internal.ads.AbstractC1047dQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(java.lang.Object r10, com.google.android.gms.internal.ads.XP r11, com.google.android.gms.internal.ads.AbstractC1353j8 r12) {
        /*
            r9 = this;
            java.lang.Void r10 = (java.lang.Void) r10
            boolean r10 = r9.f15626r
            r11 = 0
            if (r10 == 0) goto L1f
            com.google.android.gms.internal.ads.kQ r10 = r9.f15623o
            java.lang.Object r0 = r10.f15164c
            java.lang.Object r10 = r10.f15165d
            com.google.android.gms.internal.ads.kQ r1 = new com.google.android.gms.internal.ads.kQ
            r1.<init>(r12, r0, r10)
            r9.f15623o = r1
            com.google.android.gms.internal.ads.jQ r10 = r9.f15624p
            if (r10 == 0) goto Lb5
            long r0 = r10.f14949g
            r9.y(r0)
            goto Lb5
        L1f:
            boolean r10 = r12.g()
            if (r10 == 0) goto L42
            boolean r10 = r9.f15627s
            if (r10 == 0) goto L35
            com.google.android.gms.internal.ads.kQ r10 = r9.f15623o
            java.lang.Object r0 = r10.f15164c
            java.lang.Object r10 = r10.f15165d
            com.google.android.gms.internal.ads.kQ r1 = new com.google.android.gms.internal.ads.kQ
            r1.<init>(r12, r0, r10)
            goto L3e
        L35:
            java.lang.Object r10 = com.google.android.gms.internal.ads.U7.f11601m
            java.lang.Object r0 = com.google.android.gms.internal.ads.C1425kQ.f15163e
            com.google.android.gms.internal.ads.kQ r1 = new com.google.android.gms.internal.ads.kQ
            r1.<init>(r12, r10, r0)
        L3e:
            r9.f15623o = r1
            goto Lb5
        L42:
            r10 = 0
            com.google.android.gms.internal.ads.U7 r1 = r9.f15621m
            r2 = 0
            r12.b(r10, r1, r2)
            java.lang.Object r6 = r1.f11603a
            com.google.android.gms.internal.ads.jQ r0 = r9.f15624p
            if (r0 == 0) goto L67
            long r4 = r0.f14944b
            com.google.android.gms.internal.ads.kQ r7 = r9.f15623o
            com.google.android.gms.internal.ads.qQ r0 = r0.f14943a
            java.lang.Object r0 = r0.f16374a
            com.google.android.gms.internal.ads.I7 r8 = r9.f15622n
            r7.o(r0, r8)
            com.google.android.gms.internal.ads.kQ r0 = r9.f15623o
            r0.b(r10, r1, r2)
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 == 0) goto L67
            goto L68
        L67:
            r4 = r2
        L68:
            com.google.android.gms.internal.ads.I7 r2 = r9.f15622n
            r3 = 0
            r0 = r12
            android.util.Pair r10 = r0.m(r1, r2, r3, r4)
            java.lang.Object r12 = r10.first
            java.lang.Object r10 = r10.second
            java.lang.Long r10 = (java.lang.Long) r10
            long r1 = r10.longValue()
            boolean r10 = r9.f15627s
            if (r10 == 0) goto L8a
            com.google.android.gms.internal.ads.kQ r10 = r9.f15623o
            java.lang.Object r12 = r10.f15164c
            java.lang.Object r10 = r10.f15165d
            com.google.android.gms.internal.ads.kQ r3 = new com.google.android.gms.internal.ads.kQ
            r3.<init>(r0, r12, r10)
            goto L8f
        L8a:
            com.google.android.gms.internal.ads.kQ r3 = new com.google.android.gms.internal.ads.kQ
            r3.<init>(r0, r6, r12)
        L8f:
            r9.f15623o = r3
            com.google.android.gms.internal.ads.jQ r10 = r9.f15624p
            if (r10 == 0) goto Lb5
            boolean r12 = r9.y(r1)
            if (r12 == 0) goto Lb5
            com.google.android.gms.internal.ads.qQ r10 = r10.f14943a
            java.lang.Object r11 = r10.f16374a
            com.google.android.gms.internal.ads.kQ r12 = r9.f15623o
            java.lang.Object r12 = r12.f15165d
            if (r12 == 0) goto Lb1
            java.lang.Object r12 = com.google.android.gms.internal.ads.C1425kQ.f15163e
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto Lb1
            com.google.android.gms.internal.ads.kQ r11 = r9.f15623o
            java.lang.Object r11 = r11.f15165d
        Lb1:
            com.google.android.gms.internal.ads.qQ r11 = r10.a(r11)
        Lb5:
            r10 = 1
            r9.f15627s = r10
            r9.f15626r = r10
            com.google.android.gms.internal.ads.kQ r10 = r9.f15623o
            r9.k(r10)
            if (r11 == 0) goto Lc9
            com.google.android.gms.internal.ads.jQ r10 = r9.f15624p
            r10.getClass()
            r10.n(r11)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1533mQ.s(java.lang.Object, com.google.android.gms.internal.ads.XP, com.google.android.gms.internal.ads.j8):void");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1047dQ
    public final /* bridge */ /* synthetic */ void u(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1047dQ
    public final C1749qQ v(Object obj, C1749qQ c1749qQ) {
        Object obj2 = this.f15623o.f15165d;
        Object obj3 = c1749qQ.f16374a;
        if (obj2 != null && obj2.equals(obj3)) {
            obj3 = C1425kQ.f15163e;
        }
        return c1749qQ.a(obj3);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1047dQ
    public final /* synthetic */ void w(long j6, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.XP
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final C1371jQ c(C1749qQ c1749qQ, InterfaceC1292i interfaceC1292i, long j6) {
        C1371jQ c1371jQ = new C1371jQ(c1749qQ, interfaceC1292i, j6);
        AbstractC0582Jp.h0(c1371jQ.f14946d == null);
        XP xp = this.f15619k;
        c1371jQ.f14946d = xp;
        if (!this.f15626r) {
            this.f15624p = c1371jQ;
            if (!this.f15625q) {
                this.f15625q = true;
                t(null, xp);
            }
            return c1371jQ;
        }
        Object obj = c1749qQ.f16374a;
        if (this.f15623o.f15165d != null && obj.equals(C1425kQ.f15163e)) {
            obj = this.f15623o.f15165d;
        }
        c1371jQ.n(c1749qQ.a(obj));
        return c1371jQ;
    }

    public final boolean y(long j6) {
        C1371jQ c1371jQ = this.f15624p;
        int iE = this.f15623o.e(c1371jQ.f14943a.f16374a);
        if (iE == -1) {
            return false;
        }
        C1425kQ c1425kQ = this.f15623o;
        I7 i7 = this.f15622n;
        c1425kQ.d(iE, i7, false);
        long j7 = i7.f9073d;
        if (j7 != -9223372036854775807L && j6 >= j7) {
            j6 = Math.max(0L, j7 - 1);
        }
        c1371jQ.f14949g = j6;
        return true;
    }
}
