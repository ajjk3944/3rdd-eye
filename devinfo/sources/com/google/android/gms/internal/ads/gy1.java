package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gy1 extends wx1 {

    /* renamed from: k, reason: collision with root package name */
    public final qx1 f11651k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f11652l;

    /* renamed from: m, reason: collision with root package name */
    public final fh f11653m;

    /* renamed from: n, reason: collision with root package name */
    public final tg f11654n;

    /* renamed from: o, reason: collision with root package name */
    public ey1 f11655o;

    /* renamed from: p, reason: collision with root package name */
    public dy1 f11656p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11657q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f11658r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f11659s;

    public gy1(qx1 qx1Var, boolean z3) {
        boolean z10;
        this.f11651k = qx1Var;
        if (z3) {
            qx1Var.e();
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11652l = z10;
        this.f11653m = new fh();
        this.f11654n = new tg();
        qx1Var.d();
        this.f11655o = new ey1(new fy1(qx1Var.f()), fh.f11162m, ey1.f10919e);
    }

    @Override // com.google.android.gms.internal.ads.qx1
    public final void a(h5 h5Var) {
        if (this.f11659s) {
            ey1 ey1Var = this.f11655o;
            this.f11655o = new ey1(new iu1(this.f11655o.f19232b, h5Var), ey1Var.f10920c, ey1Var.f10921d);
        } else {
            this.f11655o = new ey1(new fy1(h5Var), fh.f11162m, ey1.f10919e);
        }
        this.f11651k.a(h5Var);
    }

    @Override // com.google.android.gms.internal.ads.qx1
    public final void b(iy1 iy1Var) {
        dy1 dy1Var = (dy1) iy1Var;
        iy1 iy1Var2 = dy1Var.f10610e;
        if (iy1Var2 != null) {
            qx1 qx1Var = dy1Var.f10609d;
            qx1Var.getClass();
            qx1Var.b(iy1Var2);
        }
        if (iy1Var == this.f11656p) {
            this.f11656p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.qx1
    public final void d() {
        this.f11651k.d();
    }

    @Override // com.google.android.gms.internal.ads.qx1
    public final void e() {
        this.f11651k.e();
    }

    @Override // com.google.android.gms.internal.ads.qx1
    public final h5 f() {
        return this.f11651k.f();
    }

    @Override // com.google.android.gms.internal.ads.qx1
    public final void h(hm1 hm1Var) {
        this.j = hm1Var;
        this.f18235i = bq0.n();
        if (this.f11652l) {
            return;
        }
        this.f11657q = true;
        t(null, this.f11651k);
    }

    @Override // com.google.android.gms.internal.ads.wx1, com.google.android.gms.internal.ads.qx1
    public final void j() {
        this.f11658r = false;
        this.f11657q = false;
        super.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    @Override // com.google.android.gms.internal.ads.wx1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(java.lang.Object r10, com.google.android.gms.internal.ads.qx1 r11, com.google.android.gms.internal.ads.uh r12) {
        /*
            r9 = this;
            java.lang.Void r10 = (java.lang.Void) r10
            boolean r10 = r9.f11658r
            r11 = 0
            if (r10 == 0) goto L1f
            com.google.android.gms.internal.ads.ey1 r10 = r9.f11655o
            java.lang.Object r0 = r10.f10920c
            java.lang.Object r10 = r10.f10921d
            com.google.android.gms.internal.ads.ey1 r1 = new com.google.android.gms.internal.ads.ey1
            r1.<init>(r12, r0, r10)
            r9.f11655o = r1
            com.google.android.gms.internal.ads.dy1 r10 = r9.f11656p
            if (r10 == 0) goto Lb5
            long r0 = r10.g
            r9.y(r0)
            goto Lb5
        L1f:
            boolean r10 = r12.g()
            if (r10 == 0) goto L42
            boolean r10 = r9.f11659s
            if (r10 == 0) goto L35
            com.google.android.gms.internal.ads.ey1 r10 = r9.f11655o
            java.lang.Object r0 = r10.f10920c
            java.lang.Object r10 = r10.f10921d
            com.google.android.gms.internal.ads.ey1 r1 = new com.google.android.gms.internal.ads.ey1
            r1.<init>(r12, r0, r10)
            goto L3e
        L35:
            java.lang.Object r10 = com.google.android.gms.internal.ads.fh.f11162m
            java.lang.Object r0 = com.google.android.gms.internal.ads.ey1.f10919e
            com.google.android.gms.internal.ads.ey1 r1 = new com.google.android.gms.internal.ads.ey1
            r1.<init>(r12, r10, r0)
        L3e:
            r9.f11655o = r1
            goto Lb5
        L42:
            r10 = 0
            com.google.android.gms.internal.ads.fh r1 = r9.f11653m
            r2 = 0
            r12.b(r10, r1, r2)
            java.lang.Object r6 = r1.f11164a
            com.google.android.gms.internal.ads.dy1 r0 = r9.f11656p
            if (r0 == 0) goto L67
            long r4 = r0.f10607b
            com.google.android.gms.internal.ads.ey1 r7 = r9.f11655o
            com.google.android.gms.internal.ads.jy1 r0 = r0.f10606a
            java.lang.Object r0 = r0.f12875a
            com.google.android.gms.internal.ads.tg r8 = r9.f11654n
            r7.o(r0, r8)
            com.google.android.gms.internal.ads.ey1 r0 = r9.f11655o
            r0.b(r10, r1, r2)
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 == 0) goto L67
            goto L68
        L67:
            r4 = r2
        L68:
            com.google.android.gms.internal.ads.tg r2 = r9.f11654n
            r3 = 0
            r0 = r12
            android.util.Pair r10 = r0.m(r1, r2, r3, r4)
            java.lang.Object r12 = r10.first
            java.lang.Object r10 = r10.second
            java.lang.Long r10 = (java.lang.Long) r10
            long r1 = r10.longValue()
            boolean r10 = r9.f11659s
            if (r10 == 0) goto L8a
            com.google.android.gms.internal.ads.ey1 r10 = r9.f11655o
            java.lang.Object r12 = r10.f10920c
            java.lang.Object r10 = r10.f10921d
            com.google.android.gms.internal.ads.ey1 r3 = new com.google.android.gms.internal.ads.ey1
            r3.<init>(r0, r12, r10)
            goto L8f
        L8a:
            com.google.android.gms.internal.ads.ey1 r3 = new com.google.android.gms.internal.ads.ey1
            r3.<init>(r0, r6, r12)
        L8f:
            r9.f11655o = r3
            com.google.android.gms.internal.ads.dy1 r10 = r9.f11656p
            if (r10 == 0) goto Lb5
            boolean r12 = r9.y(r1)
            if (r12 == 0) goto Lb5
            com.google.android.gms.internal.ads.jy1 r10 = r10.f10606a
            java.lang.Object r11 = r10.f12875a
            com.google.android.gms.internal.ads.ey1 r12 = r9.f11655o
            java.lang.Object r12 = r12.f10921d
            if (r12 == 0) goto Lb1
            java.lang.Object r12 = com.google.android.gms.internal.ads.ey1.f10919e
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto Lb1
            com.google.android.gms.internal.ads.ey1 r11 = r9.f11655o
            java.lang.Object r11 = r11.f10921d
        Lb1:
            com.google.android.gms.internal.ads.jy1 r11 = r10.a(r11)
        Lb5:
            r10 = 1
            r9.f11659s = r10
            r9.f11658r = r10
            com.google.android.gms.internal.ads.ey1 r10 = r9.f11655o
            r9.k(r10)
            if (r11 == 0) goto Lc9
            com.google.android.gms.internal.ads.dy1 r10 = r9.f11656p
            r10.getClass()
            r10.i(r11)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gy1.s(java.lang.Object, com.google.android.gms.internal.ads.qx1, com.google.android.gms.internal.ads.uh):void");
    }

    @Override // com.google.android.gms.internal.ads.wx1
    public final /* bridge */ /* synthetic */ void u(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.wx1
    public final jy1 v(Object obj, jy1 jy1Var) {
        Object obj2 = this.f11655o.f10921d;
        Object obj3 = jy1Var.f12875a;
        if (obj2 != null && obj2.equals(obj3)) {
            obj3 = ey1.f10919e;
        }
        return jy1Var.a(obj3);
    }

    @Override // com.google.android.gms.internal.ads.wx1
    public final /* synthetic */ void w(Object obj, long j) {
    }

    @Override // com.google.android.gms.internal.ads.qx1
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final dy1 c(jy1 jy1Var, i iVar, long j) {
        dy1 dy1Var = new dy1(jy1Var, iVar, j);
        mq0.c0(dy1Var.f10609d == null);
        qx1 qx1Var = this.f11651k;
        dy1Var.f10609d = qx1Var;
        if (!this.f11658r) {
            this.f11656p = dy1Var;
            if (!this.f11657q) {
                this.f11657q = true;
                t(null, qx1Var);
            }
            return dy1Var;
        }
        Object obj = jy1Var.f12875a;
        if (this.f11655o.f10921d != null && obj.equals(ey1.f10919e)) {
            obj = this.f11655o.f10921d;
        }
        dy1Var.i(jy1Var.a(obj));
        return dy1Var;
    }

    public final boolean y(long j) {
        dy1 dy1Var = this.f11656p;
        int iE = this.f11655o.e(dy1Var.f10606a.f12875a);
        if (iE == -1) {
            return false;
        }
        ey1 ey1Var = this.f11655o;
        tg tgVar = this.f11654n;
        ey1Var.d(iE, tgVar, false);
        long j8 = tgVar.f16812d;
        if (j8 != -9223372036854775807L && j >= j8) {
            j = Math.max(0L, j8 - 1);
        }
        dy1Var.g = j;
        return true;
    }
}
