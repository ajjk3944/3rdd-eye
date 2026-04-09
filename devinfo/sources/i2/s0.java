package i2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f25776a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25778c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25779d;

    /* renamed from: i, reason: collision with root package name */
    public d3.a f25783i;

    /* renamed from: b, reason: collision with root package name */
    public final i0.f f25777b = new i0.f(1);

    /* renamed from: e, reason: collision with root package name */
    public final y4.a f25780e = new y4.a(23);

    /* renamed from: f, reason: collision with root package name */
    public final w0.e f25781f = new w0.e(new e0[16]);
    public final long g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final w0.e f25782h = new w0.e(new r0[16]);

    public s0(e0 e0Var) {
        this.f25776a = e0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(i2.e0 r5, d3.a r6) {
        /*
            i2.e0 r0 = r5.f25634i
            i2.i0 r1 = r5.H
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            if (r6 == 0) goto L1a
            if (r0 == 0) goto L18
            i2.q0 r0 = r1.f25688q
            nk.k.b(r0)
            long r3 = r6.f21951a
            boolean r6 = r0.f0(r3)
            goto L2f
        L18:
            r6 = r2
            goto L2f
        L1a:
            i2.q0 r6 = r1.f25688q
            if (r6 == 0) goto L21
            d3.a r1 = r6.f25746m
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L18
            if (r0 == 0) goto L18
            nk.k.b(r6)
            long r0 = r1.f21951a
            boolean r6 = r6.f0(r0)
        L2f:
            i2.e0 r0 = r5.v()
            if (r6 == 0) goto L57
            if (r0 == 0) goto L57
            i2.e0 r1 = r0.f25634i
            r3 = 3
            if (r1 != 0) goto L40
            i2.e0.V(r0, r2, r3)
            return r6
        L40:
            i2.c0 r1 = r5.t()
            i2.c0 r4 = i2.c0.f25587a
            if (r1 != r4) goto L4c
            i2.e0.T(r0, r2, r3)
            return r6
        L4c:
            i2.c0 r5 = r5.t()
            i2.c0 r1 = i2.c0.f25588b
            if (r5 != r1) goto L57
            r0.S(r2)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.s0.b(i2.e0, d3.a):boolean");
    }

    public static boolean c(e0 e0Var, d3.a aVar) {
        boolean zG0;
        c0 c0Var = c0.f25589c;
        if (aVar != null) {
            if (e0Var.D == c0Var) {
                e0Var.e();
            }
            zG0 = e0Var.H.f25687p.g0(aVar.f21951a);
        } else {
            u0 u0Var = e0Var.H.f25687p;
            d3.a aVar2 = u0Var.j ? new d3.a(u0Var.f24411d) : null;
            if (aVar2 != null) {
                if (e0Var.D == c0Var) {
                    e0Var.e();
                }
                zG0 = e0Var.H.f25687p.g0(aVar2.f21951a);
            } else {
                zG0 = false;
            }
        }
        e0 e0VarV = e0Var.v();
        if (zG0 && e0VarV != null) {
            if (e0Var.s() == c0.f25587a) {
                e0.V(e0VarV, false, 3);
                return zG0;
            }
            if (e0Var.s() == c0.f25588b) {
                e0VarV.U(false);
            }
        }
        return zG0;
    }

    public static boolean h(e0 e0Var) {
        q0 q0Var;
        f0 f0Var;
        if (e0Var.H.f25678e) {
            return (e0Var.t() == c0.f25589c && ((q0Var = e0Var.H.f25688q) == null || (f0Var = q0Var.f25751r) == null || !f0Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean i(e0 e0Var) {
        if (!e0Var.r()) {
            return false;
        }
        do {
            if (e0Var.s() == c0.f25589c && !e0Var.H.f25687p.f25802x.e()) {
                e0 e0VarV = e0Var.v();
                if ((e0VarV != null ? e0VarV.H.f25677d : null) != a0.f25567a) {
                    return false;
                }
            }
            e0Var = e0Var.v();
            if (e0Var == null) {
                return false;
            }
        } while (!e0Var.I());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r8) {
        /*
            r7 = this;
            r0 = 1
            y4.a r1 = r7.f25780e
            if (r8 == 0) goto L17
            java.lang.Object r8 = r1.f37323a
            w0.e r8 = (w0.e) r8
            i2.e0 r2 = r7.f25776a
            int r3 = r2.Q
            if (r3 <= 0) goto L17
            r8.h()
            r8.b(r2)
            r2.P = r0
        L17:
            java.lang.Object r8 = r1.f37323a
            w0.e r8 = (w0.e) r8
            int r2 = r8.f36399c
            if (r2 == 0) goto L62
            i2.j1 r3 = i2.j1.f25696b
            java.lang.Object[] r4 = r8.f36397a
            r5 = 0
            zj.m.d0(r4, r3, r5, r2)
            int r2 = r8.f36399c
            java.lang.Object r3 = r1.f37324b
            i2.e0[] r3 = (i2.e0[]) r3
            if (r3 == 0) goto L32
            int r4 = r3.length
            if (r4 >= r2) goto L3a
        L32:
            r3 = 16
            int r3 = java.lang.Math.max(r3, r2)
            i2.e0[] r3 = new i2.e0[r3]
        L3a:
            r4 = 0
            r1.f37324b = r4
        L3d:
            if (r5 >= r2) goto L48
            java.lang.Object[] r6 = r8.f36397a
            r6 = r6[r5]
            r3[r5] = r6
            int r5 = r5 + 1
            goto L3d
        L48:
            r8.h()
            int r2 = r2 - r0
        L4c:
            r8 = -1
            if (r8 >= r2) goto L60
            r8 = r3[r2]
            nk.k.b(r8)
            boolean r0 = r8.P
            if (r0 == 0) goto L5b
            y4.a.e(r8)
        L5b:
            r3[r2] = r4
            int r2 = r2 + (-1)
            goto L4c
        L60:
            r1.f37324b = r3
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.s0.a(boolean):void");
    }

    public final void d() {
        w0.e eVar = this.f25782h;
        int i4 = eVar.f36399c;
        if (i4 != 0) {
            Object[] objArr = eVar.f36397a;
            for (int i10 = 0; i10 < i4; i10++) {
                r0 r0Var = (r0) objArr[i10];
                e0 e0Var = r0Var.f25767a;
                boolean z3 = r0Var.f25769c;
                e0 e0Var2 = r0Var.f25767a;
                if (e0Var.H()) {
                    if (r0Var.f25768b) {
                        e0.T(e0Var2, z3, 2);
                    } else {
                        e0.V(e0Var2, z3, 2);
                    }
                }
            }
            eVar.h();
        }
    }

    public final void e(e0 e0Var) {
        w0.e eVarZ = e0Var.z();
        Object[] objArr = eVarZ.f36397a;
        int i4 = eVarZ.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            e0 e0Var2 = (e0) objArr[i10];
            if (nk.k.a(e0Var2.J(), Boolean.TRUE) && !e0Var2.R) {
                if (this.f25777b.r(e0Var2)) {
                    e0Var2.K();
                }
                e(e0Var2);
            }
        }
    }

    public final void f(e0 e0Var, boolean z3) {
        if (!this.f25778c) {
            f2.a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z3 ? e0Var.H.f25678e : e0Var.r()) {
            f2.a.a("node not yet measured");
        }
        g(e0Var, z3);
    }

    public final void g(e0 e0Var, boolean z3) {
        q0 q0Var;
        f0 f0Var;
        w0.e eVarZ = e0Var.z();
        Object[] objArr = eVarZ.f36397a;
        int i4 = eVarZ.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            e0 e0Var2 = (e0) objArr[i10];
            c0 c0Var = c0.f25587a;
            if ((!z3 && (e0Var2.s() == c0Var || e0Var2.H.f25687p.f25802x.e())) || (z3 && (e0Var2.t() == c0Var || ((q0Var = e0Var2.H.f25688q) != null && (f0Var = q0Var.f25751r) != null && f0Var.e())))) {
                boolean zO = k.o(e0Var2);
                i0 i0Var = e0Var2.H;
                if (zO && !z3) {
                    if (i0Var.f25678e && this.f25777b.r(e0Var2)) {
                        m(e0Var2, true, false);
                    } else {
                        f(e0Var2, true);
                    }
                }
                if (z3 ? i0Var.f25678e : e0Var2.r()) {
                    m(e0Var2, z3, false);
                }
                if (!(z3 ? i0Var.f25678e : e0Var2.r())) {
                    g(e0Var2, z3);
                }
            }
        }
        if (z3 ? e0Var.H.f25678e : e0Var.r()) {
            m(e0Var, z3, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2, types: [i1.m] */
    public final boolean j(j2.o oVar) {
        boolean z3;
        i1.m mVar;
        w0.e eVar;
        i1.m mVarE;
        int i4;
        boolean z10;
        e0 e0Var;
        boolean z11;
        i0.f fVar = this.f25777b;
        e0 e0Var2 = this.f25776a;
        if (!e0Var2.H()) {
            f2.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!e0Var2.I()) {
            f2.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f25778c) {
            f2.a.a("performMeasureAndLayout called during measure layout");
        }
        int i10 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        if (this.f25783i != null) {
            this.f25778c = true;
            this.f25779d = true;
            try {
                boolean zH = fVar.H();
                o7.c cVar = (o7.c) fVar.f25416b;
                if (zH) {
                    z3 = false;
                    while (true) {
                        o7.c cVar2 = (o7.c) fVar.f25418d;
                        o7.c cVar3 = (o7.c) fVar.f25417c;
                        if (!((v1) cVar.f30419b).isEmpty()) {
                            e0Var = (e0) ((v1) cVar.f30419b).first();
                            cVar.x(e0Var);
                            z11 = e0Var.f25634i != null;
                            z10 = false;
                        } else if (!((v1) cVar3.f30419b).isEmpty()) {
                            e0Var = (e0) ((v1) cVar3.f30419b).first();
                            cVar3.x(e0Var);
                            z11 = e0Var.f25634i != null;
                            z10 = true;
                        } else {
                            if (((v1) cVar2.f30419b).isEmpty()) {
                                break;
                            }
                            e0 e0Var3 = (e0) ((v1) cVar2.f30419b).first();
                            cVar2.x(e0Var3);
                            z10 = true;
                            e0Var = e0Var3;
                            z11 = false;
                        }
                        boolean zM = m(e0Var, z11, z10);
                        if (!z10) {
                            if (e0Var.H.f25679f) {
                                fVar.p(e0Var, r.f25763b);
                            }
                            if (e0Var.q()) {
                                fVar.p(e0Var, r.f25765d);
                            }
                        }
                        if (e0Var == e0Var2 && zM) {
                            z3 = true;
                        }
                    }
                    if (oVar != null) {
                        oVar.invoke();
                    }
                } else {
                    z3 = false;
                }
            } finally {
            }
        } else {
            z3 = false;
        }
        w0.e eVar2 = this.f25781f;
        Object[] objArr = eVar2.f36397a;
        int i11 = eVar2.f36399c;
        int i12 = 0;
        while (i12 < i11) {
            com.google.android.gms.internal.consent_sdk.a0 a0Var = ((e0) objArr[i12]).G;
            q qVar = (q) a0Var.f19257d;
            int i13 = 4194304;
            boolean zG = e1.g(4194304);
            if (zG) {
                mVar = qVar.R;
            } else {
                mVar = qVar.R.f25558e;
                if (mVar == null) {
                }
                i12++;
                i10 = 0;
            }
            p1.h0 h0Var = d1.N;
            i1.m mVarB0 = qVar.B0(zG);
            while (mVarB0 != null && (mVarB0.f25557d & i13) != 0) {
                if ((mVarB0.f25556c & i13) != 0) {
                    j jVar = mVarB0;
                    w0.e eVar3 = null;
                    while (jVar != 0) {
                        if (jVar instanceof t) {
                            ((t) jVar).w((q) a0Var.f19257d);
                        } else {
                            if ((jVar.f25556c & i13) != 0 && (jVar instanceof j)) {
                                i1.m mVar2 = jVar.f25691p;
                                mVarE = jVar;
                                eVar = eVar3;
                                while (mVar2 != null) {
                                    int i14 = i13;
                                    if ((mVar2.f25556c & i14) != 0) {
                                        i10++;
                                        eVar = eVar;
                                        if (i10 == 1) {
                                            mVarE = mVar2;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new w0.e(new i1.m[16]);
                                            }
                                            if (mVarE != null) {
                                                eVar.b(mVarE);
                                                mVarE = null;
                                            }
                                            eVar.b(mVar2);
                                        }
                                    }
                                    mVar2 = mVar2.f25559f;
                                    i13 = i14;
                                    mVarE = mVarE;
                                    eVar = eVar;
                                }
                                i4 = i13;
                                eVar = eVar;
                                if (i10 == 1) {
                                }
                                i13 = i4;
                                i10 = 0;
                                jVar = mVarE;
                                eVar3 = eVar;
                            }
                            mVarE = k.e(eVar);
                            i13 = i4;
                            i10 = 0;
                            jVar = mVarE;
                            eVar3 = eVar;
                        }
                        i4 = i13;
                        eVar = eVar3;
                        mVarE = k.e(eVar);
                        i13 = i4;
                        i10 = 0;
                        jVar = mVarE;
                        eVar3 = eVar;
                    }
                }
                int i15 = i13;
                if (mVarB0 != mVar) {
                    mVarB0 = mVarB0.f25559f;
                    i13 = i15;
                    i10 = 0;
                }
            }
            i12++;
            i10 = 0;
        }
        eVar2.h();
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [i2.e0, java.lang.Object] */
    public final void k(e0 e0Var, long j) {
        i1.m mVar;
        i1.m mVarE;
        if (e0Var.R) {
            return;
        }
        e0 e0Var2 = this.f25776a;
        if (e0Var.equals(e0Var2)) {
            f2.a.a("measureAndLayout called on root");
        }
        if (!e0Var2.H()) {
            f2.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!e0Var2.I()) {
            f2.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f25778c) {
            f2.a.a("performMeasureAndLayout called during measure layout");
        }
        boolean z3 = false;
        if (this.f25783i != null) {
            this.f25778c = true;
            this.f25779d = false;
            try {
                i0.f fVar = this.f25777b;
                ((o7.c) fVar.f25416b).x(e0Var);
                ((o7.c) fVar.f25417c).x(e0Var);
                ((o7.c) fVar.f25418d).x(e0Var);
                if ((b(e0Var, new d3.a(j)) || e0Var.H.f25679f) && nk.k.a(e0Var.J(), Boolean.TRUE)) {
                    e0Var.K();
                }
                e(e0Var);
                c(e0Var, new d3.a(j));
                if (e0Var.q() && e0Var.I()) {
                    e0Var.R();
                    y4.a aVar = this.f25780e;
                    aVar.getClass();
                    if (e0Var.Q > 0) {
                        ((w0.e) aVar.f37323a).b(e0Var);
                        e0Var.P = true;
                    }
                }
                d();
            } finally {
            }
        }
        w0.e eVar = this.f25781f;
        Object[] objArr = eVar.f36397a;
        int i4 = eVar.f36399c;
        int i10 = 0;
        while (i10 < i4) {
            com.google.android.gms.internal.consent_sdk.a0 a0Var = ((e0) objArr[i10]).G;
            q qVar = (q) a0Var.f19257d;
            boolean zG = e1.g(4194304);
            if (zG) {
                mVar = qVar.R;
            } else {
                mVar = qVar.R.f25558e;
                if (mVar == null) {
                }
                i10++;
                z3 = false;
            }
            p1.h0 h0Var = d1.N;
            i1.m mVarB0 = qVar.B0(zG);
            while (mVarB0 != null && (mVarB0.f25557d & 4194304) != 0) {
                if ((mVarB0.f25556c & 4194304) != 0) {
                    j jVar = mVarB0;
                    w0.e eVar2 = null;
                    while (jVar != 0) {
                        if (jVar instanceof t) {
                            ((t) jVar).w((q) a0Var.f19257d);
                        } else {
                            if ((jVar.f25556c & 4194304) != 0 && (jVar instanceof j)) {
                                i1.m mVar2 = jVar.f25691p;
                                ?? r15 = z3;
                                mVarE = jVar;
                                eVar2 = eVar2;
                                while (mVar2 != null) {
                                    if ((mVar2.f25556c & 4194304) != 0) {
                                        r15++;
                                        eVar2 = eVar2;
                                        if (r15 == 1) {
                                            mVarE = mVar2;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new w0.e(new i1.m[16]);
                                            }
                                            if (mVarE != null) {
                                                eVar2.b(mVarE);
                                                mVarE = null;
                                            }
                                            eVar2.b(mVar2);
                                        }
                                    }
                                    mVar2 = mVar2.f25559f;
                                    mVarE = mVarE;
                                    eVar2 = eVar2;
                                    r15 = r15;
                                }
                                if (r15 == 1) {
                                }
                            }
                            z3 = false;
                            jVar = mVarE;
                            eVar2 = eVar2;
                        }
                        mVarE = k.e(eVar2);
                        z3 = false;
                        jVar = mVarE;
                        eVar2 = eVar2;
                    }
                }
                if (mVarB0 != mVar) {
                    mVarB0 = mVarB0.f25559f;
                    z3 = false;
                }
            }
            i10++;
            z3 = false;
        }
        eVar.h();
    }

    public final void l() {
        i0.f fVar = this.f25777b;
        if (fVar.H()) {
            e0 e0Var = this.f25776a;
            if (!e0Var.H()) {
                f2.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!e0Var.I()) {
                f2.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f25778c) {
                f2.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.f25783i != null) {
                this.f25778c = true;
                this.f25779d = false;
                try {
                    if (!((v1) ((o7.c) fVar.f25418d).f30419b).isEmpty() && !((v1) ((o7.c) fVar.f25416b).f30419b).isEmpty()) {
                        if (e0Var.f25634i != null) {
                            o(e0Var, true);
                        } else {
                            n(e0Var);
                        }
                    }
                    o(e0Var, false);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } finally {
                        this.f25778c = false;
                        this.f25779d = false;
                    }
                }
            }
        }
    }

    public final boolean m(e0 e0Var, boolean z3, boolean z10) {
        d3.a aVar;
        boolean zB;
        g2.r0 placementScope;
        q qVar;
        e0 e0VarV;
        q0 q0Var;
        f0 f0Var;
        boolean z11 = e0Var.R;
        i0 i0Var = e0Var.H;
        if (z11 || (!e0Var.I() && !i0Var.f25687p.f25798t && !i(e0Var) && !nk.k.a(e0Var.J(), Boolean.TRUE) && !h(e0Var) && !i0Var.f25687p.f25802x.e() && ((q0Var = i0Var.f25688q) == null || (f0Var = q0Var.f25751r) == null || !f0Var.e()))) {
            return false;
        }
        e0 e0Var2 = this.f25776a;
        if (e0Var == e0Var2) {
            aVar = this.f25783i;
            nk.k.b(aVar);
        } else {
            aVar = null;
        }
        if (z3) {
            zB = i0Var.f25678e ? b(e0Var, aVar) : false;
            if (z10 && ((zB || i0Var.f25679f) && nk.k.a(e0Var.J(), Boolean.TRUE))) {
                e0Var.K();
            }
        } else {
            boolean zC = e0Var.r() ? c(e0Var, aVar) : false;
            if (z10 && e0Var.q() && (e0Var == e0Var2 || ((e0VarV = e0Var.v()) != null && e0VarV.I() && i0Var.f25687p.f25798t))) {
                if (e0Var == e0Var2) {
                    if (e0Var.D == c0.f25589c) {
                        e0Var.f();
                    }
                    e0 e0VarV2 = e0Var.v();
                    if (e0VarV2 == null || (qVar = (q) e0VarV2.G.f19257d) == null || (placementScope = qVar.f25713l) == null) {
                        placementScope = ((j2.r) h0.a(e0Var)).getPlacementScope();
                    }
                    g2.r0.i(placementScope, i0Var.f25687p, 0, 0);
                } else {
                    e0Var.R();
                }
                y4.a aVar2 = this.f25780e;
                aVar2.getClass();
                if (e0Var.Q > 0) {
                    ((w0.e) aVar2.f37323a).b(e0Var);
                    e0Var.P = true;
                }
            }
            zB = zC;
        }
        d();
        return zB;
    }

    public final void n(e0 e0Var) {
        w0.e eVarZ = e0Var.z();
        Object[] objArr = eVarZ.f36397a;
        int i4 = eVarZ.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            e0 e0Var2 = (e0) objArr[i10];
            if (e0Var2.s() == c0.f25587a || e0Var2.H.f25687p.f25802x.e()) {
                if (k.o(e0Var2)) {
                    o(e0Var2, true);
                } else {
                    n(e0Var2);
                }
            }
        }
    }

    public final void o(e0 e0Var, boolean z3) {
        d3.a aVar;
        if (e0Var.R) {
            return;
        }
        if (e0Var == this.f25776a) {
            aVar = this.f25783i;
            nk.k.b(aVar);
        } else {
            aVar = null;
        }
        if (z3) {
            b(e0Var, aVar);
        } else {
            c(e0Var, aVar);
        }
    }

    public final boolean p(e0 e0Var, boolean z3) {
        int iOrdinal = e0Var.H.f25677d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.f25782h.b(new r0(e0Var, false, z3));
            } else {
                if (iOrdinal != 4) {
                    throw new ac.m();
                }
                if (!e0Var.r() || z3) {
                    e0Var.H.f25687p.f25799u = true;
                    if (!e0Var.R && (e0Var.I() || i(e0Var))) {
                        e0 e0VarV = e0Var.v();
                        if (e0VarV == null || !e0VarV.r()) {
                            this.f25777b.p(e0Var, r.f25764c);
                        }
                        if (!this.f25779d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void q(long j) {
        d3.a aVar = this.f25783i;
        if (aVar == null ? false : d3.a.b(aVar.f21951a, j)) {
            return;
        }
        if (this.f25778c) {
            f2.a.a("updateRootConstraints called while measuring");
        }
        this.f25783i = new d3.a(j);
        e0 e0Var = this.f25776a;
        e0 e0Var2 = e0Var.f25634i;
        i0 i0Var = e0Var.H;
        if (e0Var2 != null) {
            i0Var.f25678e = true;
        }
        i0Var.f25687p.f25799u = true;
        this.f25777b.p(e0Var, e0Var2 != null ? r.f25762a : r.f25764c);
    }
}
