package i2;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q0 extends g2.s0 implements g2.i0, a, w0 {
    public boolean B;

    /* renamed from: f, reason: collision with root package name */
    public final i0 f25741f;
    public boolean g;

    /* renamed from: k, reason: collision with root package name */
    public boolean f25744k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f25745l;

    /* renamed from: m, reason: collision with root package name */
    public d3.a f25746m;

    /* renamed from: o, reason: collision with root package name */
    public mk.c f25748o;

    /* renamed from: p, reason: collision with root package name */
    public s1.b f25749p;

    /* renamed from: u, reason: collision with root package name */
    public boolean f25754u;

    /* renamed from: x, reason: collision with root package name */
    public Object f25757x;

    /* renamed from: h, reason: collision with root package name */
    public int f25742h = Integer.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public int f25743i = Integer.MAX_VALUE;
    public c0 j = c0.f25589c;

    /* renamed from: n, reason: collision with root package name */
    public long f25747n = 0;

    /* renamed from: q, reason: collision with root package name */
    public o0 f25750q = o0.f25730c;

    /* renamed from: r, reason: collision with root package name */
    public final f0 f25751r = new f0(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final w0.e f25752s = new w0.e(new q0[16]);

    /* renamed from: t, reason: collision with root package name */
    public boolean f25753t = true;

    /* renamed from: v, reason: collision with root package name */
    public final p0 f25755v = new p0(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public boolean f25756w = true;

    /* renamed from: y, reason: collision with root package name */
    public long f25758y = d3.b.b(0, 0, 15);

    /* renamed from: z, reason: collision with root package name */
    public final p0 f25759z = new p0(this, 2);
    public final p0 A = new p0(this, 1);

    public q0(i0 i0Var) {
        this.f25741f = i0Var;
        this.f25757x = i0Var.f25687p.f25796r;
    }

    @Override // i2.a
    public final void B() {
        this.f25754u = true;
        f0 f0Var = this.f25751r;
        f0Var.h();
        i0 i0Var = this.f25741f;
        boolean z3 = i0Var.f25679f;
        e0 e0Var = i0Var.f25674a;
        if (z3) {
            w0.e eVarZ = e0Var.z();
            Object[] objArr = eVarZ.f36397a;
            int i4 = eVarZ.f36399c;
            for (int i10 = 0; i10 < i4; i10++) {
                e0 e0Var2 = (e0) objArr[i10];
                i0 i0Var2 = e0Var2.H;
                if (i0Var2.f25678e && e0Var2.t() == c0.f25587a) {
                    q0 q0Var = i0Var2.f25688q;
                    nk.k.b(q0Var);
                    q0 q0Var2 = i0Var2.f25688q;
                    d3.a aVar = q0Var2 != null ? q0Var2.f25746m : null;
                    nk.k.b(aVar);
                    if (q0Var.f0(aVar.f21951a)) {
                        e0.T(e0Var, false, 7);
                    }
                }
            }
        }
        p pVar = h().S;
        nk.k.b(pVar);
        if (i0Var.g || (!pVar.f25712k && i0Var.f25679f)) {
            i0Var.f25679f = false;
            a0 a0Var = i0Var.f25677d;
            i0Var.f25677d = a0.f25570d;
            i0Var.i(false);
            o1 snapshotObserver = ((j2.r) h0.a(e0Var)).getSnapshotObserver();
            snapshotObserver.f25732a.b(e0Var, snapshotObserver.f25738h, this.f25755v);
            i0Var.f25677d = a0Var;
            if (i0Var.f25684m && pVar.f25712k) {
                requestLayout();
            }
            i0Var.g = false;
        }
        if (f0Var.f25659b && f0Var.e()) {
            f0Var.g();
        }
        this.f25754u = false;
    }

    @Override // i2.a
    public final void G() {
        e0.T(this.f25741f.f25674a, false, 7);
    }

    @Override // g2.i0
    public final int J(int i4) {
        c0();
        n0 n0VarX0 = this.f25741f.a().x0();
        nk.k.b(n0VarX0);
        return n0VarX0.J(i4);
    }

    @Override // g2.s0
    public final void R(long j, float f10, mk.c cVar) {
        e0(j, cVar, null);
    }

    @Override // g2.s0
    public final void S(long j, float f10, s1.b bVar) {
        e0(j, null, bVar);
    }

    public final boolean Y() {
        i0 i0Var = this.f25741f;
        return k.o(i0Var.f25674a) || i0Var.f25676c;
    }

    public final void Z(boolean z3) {
        if (z3 && Y()) {
            return;
        }
        if (z3 || Y()) {
            this.f25750q = o0.f25730c;
            w0.e eVarZ = this.f25741f.f25674a.z();
            Object[] objArr = eVarZ.f36397a;
            int i4 = eVarZ.f36399c;
            for (int i10 = 0; i10 < i4; i10++) {
                q0 q0Var = ((e0) objArr[i10]).H.f25688q;
                nk.k.b(q0Var);
                q0Var.Z(true);
            }
        }
    }

    public final void a0() {
        o0 o0Var = this.f25750q;
        i0 i0Var = this.f25741f;
        boolean z3 = i0Var.f25676c;
        e0 e0Var = i0Var.f25674a;
        o0 o0Var2 = o0.f25728a;
        if (z3) {
            this.f25750q = o0.f25729b;
        } else {
            this.f25750q = o0Var2;
        }
        if (o0Var != o0Var2 && i0Var.f25678e) {
            e0.T(e0Var, true, 6);
        }
        w0.e eVarZ = e0Var.z();
        Object[] objArr = eVarZ.f36397a;
        int i4 = eVarZ.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            e0 e0Var2 = (e0) objArr[i10];
            q0 q0Var = e0Var2.H.f25688q;
            if (q0Var == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (q0Var.f25743i != Integer.MAX_VALUE) {
                q0Var.a0();
                e0.W(e0Var2);
            }
        }
    }

    @Override // i2.a
    public final f0 b() {
        return this.f25751r;
    }

    public final void b0() {
        i0 i0Var = this.f25741f;
        if (i0Var.f25686o > 0) {
            w0.e eVarZ = i0Var.f25674a.z();
            Object[] objArr = eVarZ.f36397a;
            int i4 = eVarZ.f36399c;
            for (int i10 = 0; i10 < i4; i10++) {
                e0 e0Var = (e0) objArr[i10];
                i0 i0Var2 = e0Var.H;
                if ((i0Var2.f25684m || i0Var2.f25685n) && !i0Var2.f25679f) {
                    e0Var.S(false);
                }
                q0 q0Var = i0Var2.f25688q;
                if (q0Var != null) {
                    q0Var.b0();
                }
            }
        }
    }

    public final void c0() {
        i0 i0Var = this.f25741f;
        e0.T(i0Var.f25674a, false, 7);
        e0 e0Var = i0Var.f25674a;
        e0 e0VarV = e0Var.v();
        if (e0VarV == null || e0Var.D != c0.f25589c) {
            return;
        }
        int iOrdinal = e0VarV.H.f25677d.ordinal();
        e0Var.D = iOrdinal != 0 ? iOrdinal != 2 ? e0VarV.D : c0.f25588b : c0.f25587a;
    }

    @Override // g2.i0
    public final int d(int i4) {
        c0();
        n0 n0VarX0 = this.f25741f.a().x0();
        nk.k.b(n0VarX0);
        return n0VarX0.d(i4);
    }

    public final void d0() {
        a0 a0Var;
        this.B = true;
        i0 i0Var = this.f25741f;
        e0 e0VarV = i0Var.f25674a.v();
        o0 o0Var = this.f25750q;
        if ((o0Var != o0.f25728a && !i0Var.f25676c) || (o0Var != o0.f25729b && i0Var.f25676c)) {
            a0();
            if (this.g && e0VarV != null) {
                e0VarV.S(false);
            }
        }
        if (e0VarV != null) {
            i0 i0Var2 = e0VarV.H;
            if (!this.g && ((a0Var = i0Var2.f25677d) == a0.f25569c || a0Var == a0.f25570d)) {
                if (this.f25743i != Integer.MAX_VALUE) {
                    f2.a.b("Place was called on a node which was placed already");
                }
                int i4 = i0Var2.f25680h;
                this.f25743i = i4;
                i0Var2.f25680h = i4 + 1;
            }
        } else {
            this.f25743i = 0;
        }
        B();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006f A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001e, B:14:0x0022, B:15:0x0027, B:17:0x0036, B:19:0x003a, B:22:0x0040, B:21:0x003e, B:23:0x0043, B:25:0x004d, B:30:0x0057, B:32:0x0085, B:31:0x006f), top: B:36:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e0(long r10, mk.c r12, s1.b r13) {
        /*
            r9 = this;
            i2.i0 r0 = r9.f25741f
            i2.e0 r1 = r0.f25674a
            i2.e0 r2 = r0.f25674a
            r3 = 0
            i2.e0 r4 = r1.v()     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L12
            i2.i0 r4 = r4.H     // Catch: java.lang.Throwable -> L1b
            i2.a0 r4 = r4.f25677d     // Catch: java.lang.Throwable -> L1b
            goto L13
        L12:
            r4 = r3
        L13:
            i2.a0 r5 = i2.a0.f25570d     // Catch: java.lang.Throwable -> L1b
            r6 = 0
            if (r4 != r5) goto L1e
            r0.f25676c = r6     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            r10 = move-exception
            goto L8e
        L1e:
            boolean r4 = r2.R     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L27
            java.lang.String r4 = "place is called on a deactivated node"
            f2.a.a(r4)     // Catch: java.lang.Throwable -> L1b
        L27:
            r0.f25677d = r5     // Catch: java.lang.Throwable -> L1b
            r4 = 1
            r9.f25744k = r4     // Catch: java.lang.Throwable -> L1b
            r9.B = r6     // Catch: java.lang.Throwable -> L1b
            long r7 = r9.f25747n     // Catch: java.lang.Throwable -> L1b
            boolean r5 = d3.i.a(r10, r7)     // Catch: java.lang.Throwable -> L1b
            if (r5 != 0) goto L43
            boolean r5 = r0.f25685n     // Catch: java.lang.Throwable -> L1b
            if (r5 != 0) goto L3e
            boolean r5 = r0.f25684m     // Catch: java.lang.Throwable -> L1b
            if (r5 == 0) goto L40
        L3e:
            r0.f25679f = r4     // Catch: java.lang.Throwable -> L1b
        L40:
            r9.b0()     // Catch: java.lang.Throwable -> L1b
        L43:
            i2.m1 r5 = i2.h0.a(r2)     // Catch: java.lang.Throwable -> L1b
            r9.f25747n = r10     // Catch: java.lang.Throwable -> L1b
            boolean r7 = r0.f25679f     // Catch: java.lang.Throwable -> L1b
            if (r7 != 0) goto L6f
            i2.o0 r7 = r9.f25750q     // Catch: java.lang.Throwable -> L1b
            i2.o0 r8 = i2.o0.f25730c     // Catch: java.lang.Throwable -> L1b
            if (r7 == r8) goto L54
            goto L55
        L54:
            r4 = r6
        L55:
            if (r4 == 0) goto L6f
            i2.d1 r2 = r0.a()     // Catch: java.lang.Throwable -> L1b
            i2.n0 r2 = r2.x0()     // Catch: java.lang.Throwable -> L1b
            nk.k.b(r2)     // Catch: java.lang.Throwable -> L1b
            long r4 = r2.f24412e     // Catch: java.lang.Throwable -> L1b
            long r10 = d3.i.c(r10, r4)     // Catch: java.lang.Throwable -> L1b
            r2.q0(r10)     // Catch: java.lang.Throwable -> L1b
            r9.d0()     // Catch: java.lang.Throwable -> L1b
            goto L85
        L6f:
            r0.h(r6)     // Catch: java.lang.Throwable -> L1b
            i2.f0 r10 = r9.f25751r     // Catch: java.lang.Throwable -> L1b
            r10.f25662e = r6     // Catch: java.lang.Throwable -> L1b
            j2.r r5 = (j2.r) r5     // Catch: java.lang.Throwable -> L1b
            i2.o1 r10 = r5.getSnapshotObserver()     // Catch: java.lang.Throwable -> L1b
            i2.p0 r11 = r9.A     // Catch: java.lang.Throwable -> L1b
            i2.d r4 = r10.g     // Catch: java.lang.Throwable -> L1b
            g1.u r10 = r10.f25732a     // Catch: java.lang.Throwable -> L1b
            r10.b(r2, r4, r11)     // Catch: java.lang.Throwable -> L1b
        L85:
            r9.f25748o = r12     // Catch: java.lang.Throwable -> L1b
            r9.f25749p = r13     // Catch: java.lang.Throwable -> L1b
            i2.a0 r10 = i2.a0.f25571e     // Catch: java.lang.Throwable -> L1b
            r0.f25677d = r10     // Catch: java.lang.Throwable -> L1b
            return
        L8e:
            r1.Y(r10)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.q0.e0(long, mk.c, s1.b):void");
    }

    public final boolean f0(long j) {
        long j8;
        i0 i0Var = this.f25741f;
        e0 e0Var = i0Var.f25674a;
        e0 e0Var2 = i0Var.f25674a;
        try {
            if (e0Var.R) {
                f2.a.a("measure is called on a deactivated node");
            }
            e0 e0VarV = e0Var2.v();
            e0Var2.F = e0Var2.F || (e0VarV != null && e0VarV.F);
            if (!e0Var2.H.f25678e) {
                d3.a aVar = this.f25746m;
                if (aVar == null ? false : d3.a.b(aVar.f21951a, j)) {
                    m1 m1Var = e0Var2.f25639o;
                    if (m1Var != null) {
                        ((j2.r) m1Var).o(e0Var2, true);
                    }
                    e0Var2.X();
                    return false;
                }
            }
            this.f25746m = new d3.a(j);
            V(j);
            this.f25751r.f25661d = false;
            w0.e eVarZ = e0Var2.z();
            Object[] objArr = eVarZ.f36397a;
            int i4 = eVarZ.f36399c;
            for (int i10 = 0; i10 < i4; i10++) {
                q0 q0Var = ((e0) objArr[i10]).H.f25688q;
                nk.k.b(q0Var);
                q0Var.f25751r.getClass();
            }
            if (this.f25745l) {
                j8 = this.f24410c;
            } else {
                long j9 = LinearLayoutManager.INVALID_OFFSET;
                j8 = (j9 & 4294967295L) | (j9 << 32);
            }
            this.f25745l = true;
            n0 n0VarX0 = i0Var.a().x0();
            if (!(n0VarX0 != null)) {
                f2.a.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            i0Var.c(j);
            U((n0VarX0.f24409b & 4294967295L) | (n0VarX0.f24408a << 32));
            return (((int) (j8 >> 32)) == n0VarX0.f24408a && ((int) (j8 & 4294967295L)) == n0VarX0.f24409b) ? false : true;
        } catch (Throwable th2) {
            e0Var.Y(th2);
            throw null;
        }
    }

    @Override // i2.a
    public final void g(c2.l0 l0Var) {
        w0.e eVarZ = this.f25741f.f25674a.z();
        Object[] objArr = eVarZ.f36397a;
        int i4 = eVarZ.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            q0 q0Var = ((e0) objArr[i10]).H.f25688q;
            nk.k.b(q0Var);
            l0Var.invoke(q0Var);
        }
    }

    @Override // i2.a
    public final q h() {
        return (q) this.f25741f.f25674a.G.f19257d;
    }

    @Override // i2.a
    public final a j() {
        i0 i0Var;
        e0 e0VarV = this.f25741f.f25674a.v();
        if (e0VarV == null || (i0Var = e0VarV.H) == null) {
            return null;
        }
        return i0Var.f25688q;
    }

    @Override // g2.i0
    public final int n(int i4) {
        c0();
        n0 n0VarX0 = this.f25741f.a().x0();
        nk.k.b(n0VarX0);
        return n0VarX0.n(i4);
    }

    @Override // i2.a
    public final int q() {
        return this.f25743i;
    }

    @Override // i2.a
    public final void requestLayout() {
        this.f25741f.f25674a.S(false);
    }

    @Override // g2.i0
    public final int t(int i4) {
        c0();
        n0 n0VarX0 = this.f25741f.a().x0();
        nk.k.b(n0VarX0);
        return n0VarX0.t(i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // g2.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final g2.s0 v(long r6) {
        /*
            r5 = this;
            i2.i0 r0 = r5.f25741f
            i2.e0 r1 = r0.f25674a
            i2.e0 r1 = r1.v()
            r2 = 0
            if (r1 == 0) goto L10
            i2.i0 r1 = r1.H
            i2.a0 r1 = r1.f25677d
            goto L11
        L10:
            r1 = r2
        L11:
            i2.a0 r3 = i2.a0.f25568b
            if (r1 == r3) goto L25
            i2.e0 r1 = r0.f25674a
            i2.e0 r1 = r1.v()
            if (r1 == 0) goto L21
            i2.i0 r1 = r1.H
            i2.a0 r2 = r1.f25677d
        L21:
            i2.a0 r1 = i2.a0.f25570d
            if (r2 != r1) goto L28
        L25:
            r1 = 0
            r0.f25675b = r1
        L28:
            i2.e0 r1 = r0.f25674a
            i2.e0 r2 = r1.v()
            if (r2 == 0) goto L72
            i2.i0 r2 = r2.H
            i2.c0 r3 = r5.j
            i2.c0 r4 = i2.c0.f25589c
            if (r3 == r4) goto L42
            boolean r1 = r1.F
            if (r1 == 0) goto L3d
            goto L42
        L3d:
            java.lang.String r1 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            f2.a.b(r1)
        L42:
            i2.a0 r1 = r2.f25677d
            int r1 = r1.ordinal()
            if (r1 == 0) goto L6d
            r3 = 1
            if (r1 == r3) goto L6d
            r3 = 2
            if (r1 == r3) goto L6a
            r3 = 3
            if (r1 != r3) goto L54
            goto L6a
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            r7.<init>(r0)
            i2.a0 r0 = r2.f25677d
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L6a:
            i2.c0 r1 = i2.c0.f25588b
            goto L6f
        L6d:
            i2.c0 r1 = i2.c0.f25587a
        L6f:
            r5.j = r1
            goto L76
        L72:
            i2.c0 r1 = i2.c0.f25589c
            r5.j = r1
        L76:
            i2.e0 r0 = r0.f25674a
            i2.c0 r1 = r0.D
            i2.c0 r2 = i2.c0.f25589c
            if (r1 != r2) goto L81
            r0.e()
        L81:
            r5.f0(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.q0.v(long):g2.s0");
    }

    @Override // g2.s0, g2.i0
    public final Object w() {
        return this.f25757x;
    }

    @Override // i2.w0
    public final void z(boolean z3) {
        n0 n0VarX0;
        i0 i0Var = this.f25741f;
        n0 n0VarX02 = i0Var.a().x0();
        if (Boolean.valueOf(z3).equals(n0VarX02 != null ? Boolean.valueOf(n0VarX02.f25711i) : null) || (n0VarX0 = i0Var.a().x0()) == null) {
            return;
        }
        n0VarX0.f25711i = z3;
    }
}
