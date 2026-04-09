package x1;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f24942a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24944c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24945d;

    /* renamed from: i, reason: collision with root package name */
    public t2.a f24950i;

    /* renamed from: b, reason: collision with root package name */
    public final qm.c f24943b = new qm.c(17);

    /* renamed from: e, reason: collision with root package name */
    public final om.f f24946e = new om.f(24);

    /* renamed from: f, reason: collision with root package name */
    public final p0.e f24947f = new p0.e(new f0[16]);

    /* renamed from: g, reason: collision with root package name */
    public final long f24948g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final p0.e f24949h = new p0.e(new t0[16]);

    public v0(f0 f0Var) {
        this.f24942a = f0Var;
    }

    public static boolean b(f0 f0Var, t2.a aVar) {
        if (f0Var.f24804h == null) {
            return false;
        }
        boolean zW = aVar != null ? f0Var.W(aVar) : f0.X(f0Var);
        f0 f0VarC = f0Var.C();
        if (zW && f0VarC != null) {
            if (f0VarC.f24804h == null) {
                f0.n0(f0VarC, false, 3);
                return zW;
            }
            if (f0Var.A() == d0.InMeasureBlock) {
                f0.l0(f0VarC, false, 3);
                return zW;
            }
            if (f0Var.A() == d0.InLayoutBlock) {
                f0VarC.k0(false);
            }
        }
        return zW;
    }

    public static boolean c(f0 f0Var, t2.a aVar) {
        boolean zH0 = aVar != null ? f0Var.h0(aVar) : f0.i0(f0Var);
        f0 f0VarC = f0Var.C();
        if (zH0 && f0VarC != null) {
            if (f0Var.z() == d0.InMeasureBlock) {
                f0.n0(f0VarC, false, 3);
                return zH0;
            }
            if (f0Var.z() == d0.InLayoutBlock) {
                f0VarC.m0(false);
            }
        }
        return zH0;
    }

    public static boolean f(f0 f0Var) {
        s0 s0Var;
        g0 g0Var;
        if (f0Var.v()) {
            return (f0Var.A() == d0.NotUsed && ((s0Var = f0Var.r().f24860q) == null || (g0Var = s0Var.f24927r) == null || !g0Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean g(f0 f0Var) {
        if (!f0Var.y()) {
            return false;
        }
        do {
            if (f0Var.z() == d0.NotUsed && !f0Var.r().f24859p.f24974w.e()) {
                f0 f0VarC = f0Var.C();
                if ((f0VarC != null ? f0VarC.t() : null) != b0.Measuring) {
                    return false;
                }
            }
            f0Var = f0Var.C();
            if (f0Var == null) {
                return false;
            }
        } while (!f0Var.T());
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
            om.f r1 = r7.f24946e
            if (r8 == 0) goto L17
            java.lang.Object r8 = r1.f19554d
            p0.e r8 = (p0.e) r8
            x1.f0 r2 = r7.f24942a
            int r3 = r2.J
            if (r3 <= 0) goto L17
            r8.g()
            r8.b(r2)
            r2.I = r0
        L17:
            java.lang.Object r8 = r1.f19554d
            p0.e r8 = (p0.e) r8
            int r2 = r8.f20232g
            if (r2 == 0) goto L62
            x1.j1 r3 = x1.j1.f24868d
            java.lang.Object[] r4 = r8.f20230a
            r5 = 0
            mq.l.z0(r4, r3, r5, r2)
            int r2 = r8.f20232g
            java.lang.Object r3 = r1.f19555g
            x1.f0[] r3 = (x1.f0[]) r3
            if (r3 == 0) goto L32
            int r4 = r3.length
            if (r4 >= r2) goto L3a
        L32:
            r3 = 16
            int r3 = java.lang.Math.max(r3, r2)
            x1.f0[] r3 = new x1.f0[r3]
        L3a:
            r4 = 0
            r1.f19555g = r4
        L3d:
            if (r5 >= r2) goto L48
            java.lang.Object[] r6 = r8.f20230a
            r6 = r6[r5]
            r3[r5] = r6
            int r5 = r5 + 1
            goto L3d
        L48:
            r8.g()
            int r2 = r2 - r0
        L4c:
            r8 = -1
            if (r8 >= r2) goto L60
            r8 = r3[r2]
            br.l.b(r8)
            boolean r0 = r8.I
            if (r0 == 0) goto L5b
            om.f.i(r8)
        L5b:
            r3[r2] = r4
            int r2 = r2 + (-1)
            goto L4c
        L60:
            r1.f19555g = r3
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.v0.a(boolean):void");
    }

    public final void d(f0 f0Var, boolean z10) {
        if (!this.f24944c) {
            u1.a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z10 ? f0Var.v() : f0Var.y()) {
            u1.a.a("node not yet measured");
        }
        e(f0Var, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(x1.f0 r10, boolean r11) {
        /*
            r9 = this;
            p0.e r0 = r10.I()
            java.lang.Object[] r1 = r0.f20230a
            int r0 = r0.f20232g
            r2 = 0
            r3 = r2
        La:
            if (r3 >= r0) goto Laf
            r4 = r1[r3]
            x1.f0 r4 = (x1.f0) r4
            r5 = 1
            if (r11 != 0) goto L2a
            x1.d0 r6 = r4.z()
            x1.d0 r7 = x1.d0.InMeasureBlock
            if (r6 == r7) goto L46
            x1.i0 r6 = r4.r()
            x1.y0 r6 = r6.f24859p
            x1.g0 r6 = r6.f24974w
            boolean r6 = r6.e()
            if (r6 == 0) goto L2a
            goto L46
        L2a:
            if (r11 == 0) goto Lab
            x1.d0 r6 = r4.A()
            x1.d0 r7 = x1.d0.InMeasureBlock
            if (r6 == r7) goto L46
            x1.i0 r6 = r4.r()
            x1.s0 r6 = r6.f24860q
            if (r6 == 0) goto Lab
            x1.g0 r6 = r6.f24927r
            if (r6 == 0) goto Lab
            boolean r6 = r6.e()
            if (r6 != r5) goto Lab
        L46:
            boolean r6 = x1.k.o(r4)
            if (r6 == 0) goto L8b
            if (r11 != 0) goto L8b
            boolean r6 = r4.v()
            if (r6 == 0) goto L88
            qm.c r6 = r9.f24943b
            r6.getClass()
            x1.f0 r7 = r4.f24804h
            if (r7 != 0) goto L5f
            r7 = r5
            goto L60
        L5f:
            r7 = r2
        L60:
            java.lang.Object r8 = r6.f20918d
            o2.g r8 = (o2.g) r8
            java.lang.Object r8 = r8.f18754d
            x1.u1 r8 = (x1.u1) r8
            boolean r8 = r8.contains(r4)
            if (r8 != 0) goto L7f
            java.lang.Object r6 = r6.f20919g
            o2.g r6 = (o2.g) r6
            java.lang.Object r6 = r6.f18754d
            x1.u1 r6 = (x1.u1) r6
            boolean r6 = r6.contains(r4)
            if (r6 == 0) goto L7d
            goto L7f
        L7d:
            r6 = r2
            goto L80
        L7f:
            r6 = r5
        L80:
            if (r7 != 0) goto L88
            if (r6 == 0) goto L88
            r9.j(r4, r5, r2)
            goto L8b
        L88:
            r9.d(r4, r5)
        L8b:
            if (r11 == 0) goto L92
            boolean r5 = r4.v()
            goto L96
        L92:
            boolean r5 = r4.y()
        L96:
            if (r5 == 0) goto L9b
            r9.j(r4, r11, r2)
        L9b:
            if (r11 == 0) goto La2
            boolean r5 = r4.v()
            goto La6
        La2:
            boolean r5 = r4.y()
        La6:
            if (r5 != 0) goto Lab
            r9.e(r4, r11)
        Lab:
            int r3 = r3 + 1
            goto La
        Laf:
            if (r11 == 0) goto Lb6
            boolean r0 = r10.v()
            goto Lba
        Lb6:
            boolean r0 = r10.y()
        Lba:
            if (r0 == 0) goto Lbf
            r9.j(r10, r11, r2)
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.v0.e(x1.f0, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2, types: [z0.l] */
    public final boolean h(ar.a aVar) {
        boolean z10;
        z0.l lVar;
        z0.l lVarE;
        boolean z11;
        f0 f0Var;
        boolean z12;
        qm.c cVar = this.f24943b;
        f0 f0Var2 = this.f24942a;
        if (!f0Var2.S()) {
            u1.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!f0Var2.T()) {
            u1.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f24944c) {
            u1.a.a("performMeasureAndLayout called during measure layout");
        }
        int i10 = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        if (this.f24950i != null) {
            this.f24944c = true;
            this.f24945d = true;
            try {
                boolean zB = cVar.B();
                o2.g gVar = (o2.g) cVar.f20918d;
                if (zB) {
                    z10 = false;
                    while (true) {
                        o2.g gVar2 = (o2.g) cVar.f20920r;
                        o2.g gVar3 = (o2.g) cVar.f20919g;
                        if (!((u1) gVar.f18754d).isEmpty()) {
                            f0Var = (f0) ((u1) gVar.f18754d).first();
                            gVar.f0(f0Var);
                            z12 = f0Var.f24804h != null;
                            z11 = false;
                        } else if (!((u1) gVar3.f18754d).isEmpty()) {
                            f0Var = (f0) ((u1) gVar3.f18754d).first();
                            gVar3.f0(f0Var);
                            z12 = f0Var.f24804h != null;
                            z11 = true;
                        } else {
                            if (((u1) gVar2.f18754d).isEmpty()) {
                                break;
                            }
                            f0 f0Var3 = (f0) ((u1) gVar2.f18754d).first();
                            gVar2.f0(f0Var3);
                            z11 = true;
                            f0Var = f0Var3;
                            z12 = false;
                        }
                        boolean zJ = j(f0Var, z12, z11);
                        if (!z11) {
                            if (f0Var.u()) {
                                cVar.t(f0Var, s.LookaheadPlacement);
                            }
                            if (f0Var.s()) {
                                cVar.t(f0Var, s.Placement);
                            }
                        }
                        if (f0Var == f0Var2 && zJ) {
                            z10 = true;
                        }
                    }
                    if (aVar != null) {
                        aVar.c();
                    }
                } else {
                    z10 = false;
                }
            } finally {
            }
        } else {
            z10 = false;
        }
        p0.e eVar = this.f24947f;
        Object[] objArr = eVar.f20230a;
        int i11 = eVar.f20232g;
        int i12 = 0;
        while (i12 < i11) {
            al.c cVar2 = ((f0) objArr[i12]).D;
            r rVar = (r) cVar2.f822d;
            boolean zG = g1.g(128);
            if (zG) {
                lVar = rVar.N;
            } else {
                lVar = rVar.N.f26499f;
                if (lVar == null) {
                }
                i12++;
                i10 = 0;
            }
            g1.g0 g0Var = f1.J;
            z0.l lVarX0 = rVar.x0(zG);
            while (lVarX0 != null && (lVarX0.f26498e & 128) != 0) {
                if ((lVarX0.f26497d & 128) != 0) {
                    j jVar = lVarX0;
                    p0.e eVar2 = null;
                    while (jVar != 0) {
                        if (jVar instanceof u) {
                            ((u) jVar).x((r) cVar2.f822d);
                        } else {
                            if ((jVar.f26497d & 128) != 0 && (jVar instanceof j)) {
                                z0.l lVar2 = jVar.f24863q;
                                lVarE = jVar;
                                eVar2 = eVar2;
                                while (lVar2 != null) {
                                    if ((lVar2.f26497d & 128) != 0) {
                                        i10++;
                                        eVar2 = eVar2;
                                        if (i10 == 1) {
                                            lVarE = lVar2;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new p0.e(new z0.l[16]);
                                            }
                                            if (lVarE != null) {
                                                eVar2.b(lVarE);
                                                lVarE = null;
                                            }
                                            eVar2.b(lVar2);
                                        }
                                    }
                                    lVar2 = lVar2.f26500g;
                                    lVarE = lVarE;
                                    eVar2 = eVar2;
                                }
                                if (i10 == 1) {
                                }
                            }
                            i10 = 0;
                            jVar = lVarE;
                            eVar2 = eVar2;
                        }
                        lVarE = k.e(eVar2);
                        i10 = 0;
                        jVar = lVarE;
                        eVar2 = eVar2;
                    }
                }
                if (lVarX0 != lVar) {
                    lVarX0 = lVarX0.f26500g;
                    i10 = 0;
                }
            }
            i12++;
            i10 = 0;
        }
        eVar.g();
        return z10;
    }

    public final void i() {
        qm.c cVar = this.f24943b;
        if (cVar.B()) {
            f0 f0Var = this.f24942a;
            if (!f0Var.S()) {
                u1.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!f0Var.T()) {
                u1.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f24944c) {
                u1.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.f24950i != null) {
                this.f24944c = true;
                this.f24945d = false;
                try {
                    if (!((u1) ((o2.g) cVar.f20920r).f18754d).isEmpty() && !((u1) ((o2.g) cVar.f20918d).f18754d).isEmpty()) {
                        if (f0Var.f24804h != null) {
                            l(f0Var, true);
                        } else {
                            k(f0Var);
                        }
                    }
                    l(f0Var, false);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } finally {
                        this.f24944c = false;
                        this.f24945d = false;
                    }
                }
            }
        }
    }

    public final boolean j(f0 f0Var, boolean z10, boolean z11) {
        t2.a aVar;
        boolean zC;
        f0 f0VarC;
        if (f0Var.K || (!f0Var.T() && !f0Var.U() && !g(f0Var) && !br.l.a(f0Var.V(), Boolean.TRUE) && !f(f0Var) && !f0Var.m())) {
            return false;
        }
        f0 f0Var2 = this.f24942a;
        if (f0Var == f0Var2) {
            aVar = this.f24950i;
            br.l.b(aVar);
        } else {
            aVar = null;
        }
        if (z10) {
            zC = f0Var.v() ? b(f0Var, aVar) : false;
            if (z11 && ((zC || f0Var.u()) && br.l.a(f0Var.V(), Boolean.TRUE))) {
                f0Var.Y();
            }
        } else {
            zC = f0Var.y() ? c(f0Var, aVar) : false;
            if (z11 && f0Var.s() && (f0Var == f0Var2 || ((f0VarC = f0Var.C()) != null && f0VarC.T() && f0Var.U()))) {
                if (f0Var == f0Var2) {
                    f0Var.g0();
                } else {
                    f0Var.j0();
                }
                om.f fVar = this.f24946e;
                fVar.getClass();
                if (f0Var.J > 0) {
                    ((p0.e) fVar.f19554d).b(f0Var);
                    f0Var.I = true;
                }
                k.t(f0Var).getRectManager().e(f0Var);
            }
        }
        p0.e eVar = this.f24949h;
        int i10 = eVar.f20232g;
        if (i10 != 0) {
            Object[] objArr = eVar.f20230a;
            for (int i11 = 0; i11 < i10; i11++) {
                t0 t0Var = (t0) objArr[i11];
                f0 f0Var3 = t0Var.f24938a;
                boolean z12 = t0Var.f24940c;
                f0 f0Var4 = t0Var.f24938a;
                if (f0Var3.S()) {
                    if (t0Var.f24939b) {
                        f0.l0(f0Var4, z12, 2);
                    } else {
                        f0.n0(f0Var4, z12, 2);
                    }
                }
            }
            eVar.g();
        }
        return zC;
    }

    public final void k(f0 f0Var) {
        p0.e eVarI = f0Var.I();
        Object[] objArr = eVarI.f20230a;
        int i10 = eVarI.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            f0 f0Var2 = (f0) objArr[i11];
            if (f0Var2.z() == d0.InMeasureBlock || f0Var2.r().f24859p.f24974w.e()) {
                if (k.o(f0Var2)) {
                    l(f0Var2, true);
                } else {
                    k(f0Var2);
                }
            }
        }
    }

    public final void l(f0 f0Var, boolean z10) {
        t2.a aVar;
        if (f0Var.K) {
            return;
        }
        if (f0Var == this.f24942a) {
            aVar = this.f24950i;
            br.l.b(aVar);
        } else {
            aVar = null;
        }
        if (z10) {
            b(f0Var, aVar);
        } else {
            c(f0Var, aVar);
        }
    }

    public final boolean m(f0 f0Var, boolean z10) {
        int i10 = u0.f24941a[f0Var.t().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                this.f24949h.b(new t0(f0Var, false, z10));
            } else {
                if (i10 != 5) {
                    throw new bf.n();
                }
                if (!f0Var.y() || z10) {
                    f0Var.c0();
                    if (!f0Var.K && (f0Var.T() || g(f0Var))) {
                        f0 f0VarC = f0Var.C();
                        if (f0VarC == null || !f0VarC.y()) {
                            this.f24943b.t(f0Var, s.Measurement);
                        }
                        if (!this.f24945d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void n(long j) {
        t2.a aVar = this.f24950i;
        if (aVar == null ? false : t2.a.b(aVar.f22381a, j)) {
            return;
        }
        if (this.f24944c) {
            u1.a.a("updateRootConstraints called while measuring");
        }
        this.f24950i = new t2.a(j);
        f0 f0Var = this.f24942a;
        if (f0Var.f24804h != null) {
            f0Var.b0();
        }
        f0Var.c0();
        this.f24943b.t(f0Var, f0Var.f24804h != null ? s.LookaheadMeasurement : s.Measurement);
    }
}
