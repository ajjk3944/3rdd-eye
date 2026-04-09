package x1;

import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class y0 extends v1.v implements v1.q, a, a1 {
    public float D;
    public boolean E;
    public ar.k F;
    public boolean I;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f24960g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24961h;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f24963l;

    /* renamed from: o, reason: collision with root package name */
    public ar.k f24966o;

    /* renamed from: q, reason: collision with root package name */
    public Object f24968q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f24969r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f24970s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f24971t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f24972u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f24973v;

    /* renamed from: z, reason: collision with root package name */
    public boolean f24977z;

    /* renamed from: i, reason: collision with root package name */
    public int f24962i = Integer.MAX_VALUE;
    public int j = Integer.MAX_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public d0 f24964m = d0.NotUsed;

    /* renamed from: n, reason: collision with root package name */
    public long f24965n = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f24967p = true;

    /* renamed from: w, reason: collision with root package name */
    public final g0 f24974w = new g0(this, 0);

    /* renamed from: x, reason: collision with root package name */
    public final p0.e f24975x = new p0.e(new y0[16]);

    /* renamed from: y, reason: collision with root package name */
    public boolean f24976y = true;
    public long A = t2.b.b(0, 0, 15);
    public final x0 B = new x0(this, 1);
    public final x0 C = new x0(this, 0);
    public long G = 0;
    public final x0 H = new x0(this, 2);

    public y0(i0 i0Var) {
        this.f24960g = i0Var;
    }

    @Override // x1.a
    public final void E() {
        f0.n0(this.f24960g.f24846a, false, 7);
    }

    @Override // v1.v
    public final int I() {
        return this.f24960g.a().I();
    }

    @Override // v1.v
    public final int K() {
        return this.f24960g.a().K();
    }

    @Override // v1.v
    public final void N(long j, float f10, ar.k kVar) throws Throwable {
        boolean z10;
        v1.u placementScope;
        i0 i0Var = this.f24960g;
        f0 f0Var = i0Var.f24846a;
        boolean z11 = true;
        try {
            this.f24970s = true;
            if (!i3.g.l(j, this.f24965n) || this.I) {
                if (i0Var.k || i0Var.j || this.I) {
                    this.f24972u = true;
                    this.I = false;
                }
                T();
            }
            s0 s0Var = i0Var.f24860q;
            if (s0Var != null) {
                i0 i0Var2 = s0Var.f24918g;
                if (k.o(i0Var2.f24846a)) {
                    z10 = true;
                } else {
                    if (s0Var.f24926q == o0.IsNotPlaced && !i0Var2.f24847b) {
                        i0Var2.f24848c = true;
                    }
                    z10 = i0Var2.f24848c;
                }
                if (z10) {
                    f1 f1Var = i0Var.a().f24823q;
                    if (f1Var == null || (placementScope = f1Var.f24886l) == null) {
                        placementScope = k.t(f0Var).getPlacementScope();
                    }
                    s0 s0Var2 = i0Var.f24860q;
                    br.l.b(s0Var2);
                    f0 f0VarC = f0Var.C();
                    if (f0VarC != null) {
                        f0VarC.r().f24853h = 0;
                    }
                    s0Var2.j = Integer.MAX_VALUE;
                    v1.u.e(placementScope, s0Var2, (int) (j >> 32), (int) (4294967295L & j));
                }
            }
            s0 s0Var3 = i0Var.f24860q;
            if (s0Var3 == null || s0Var3.f24921l) {
                z11 = false;
            }
            if (z11) {
                u1.a.b("Error: Placement happened before lookahead.");
            }
            W(j, kVar);
        } catch (Throwable th2) {
            f0Var.q0(th2);
            throw null;
        }
    }

    public final void R() {
        boolean z10 = this.f24969r;
        this.f24969r = true;
        f0 f0Var = this.f24960g.f24846a;
        al.c cVar = f0Var.D;
        if (!z10) {
            ((r) cVar.f822d).I0();
            if (f0Var.y()) {
                f0.n0(f0Var, true, 6);
            } else if (f0Var.v()) {
                f0.l0(f0Var, true, 6);
            }
        }
        f1 f1Var = ((r) cVar.f822d).f24822p;
        for (f1 f1Var2 = (f1) cVar.f823e; !br.l.a(f1Var2, f1Var) && f1Var2 != null; f1Var2 = f1Var2.f24822p) {
            if (f1Var2.H) {
                f1Var2.C0();
            }
        }
        p0.e eVarI = f0Var.I();
        Object[] objArr = eVarI.f20230a;
        int i10 = eVarI.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            f0 f0Var2 = (f0) objArr[i11];
            if (f0Var2.D() != Integer.MAX_VALUE) {
                f0Var2.x().R();
                f0.o0(f0Var2);
            }
        }
    }

    public final void S() {
        if (this.f24969r) {
            this.f24969r = false;
            i0 i0Var = this.f24960g;
            al.c cVar = i0Var.f24846a.D;
            f1 f1Var = ((r) cVar.f822d).f24822p;
            for (f1 f1Var2 = (f1) cVar.f823e; !br.l.a(f1Var2, f1Var) && f1Var2 != null; f1Var2 = f1Var2.f24822p) {
                z0.l lVarX0 = f1Var2.x0(g1.g(1048576));
                if (lVarX0 != null && (lVarX0.f26495b.f26498e & 1048576) != 0) {
                    boolean zG = g1.g(1048576);
                    z0.l lVarV0 = f1Var2.v0();
                    if (zG || (lVarV0 = lVarV0.f26499f) != null) {
                        for (z0.l lVarX02 = f1Var2.x0(zG); lVarX02 != null && (lVarX02.f26498e & 1048576) != 0; lVarX02 = lVarX02.f26500g) {
                            if ((lVarX02.f26497d & 1048576) != 0) {
                                z0.l lVarE = lVarX02;
                                p0.e eVar = null;
                                while (lVarE != null) {
                                    if ((lVarE.f26497d & 1048576) != 0 && (lVarE instanceof j)) {
                                        int i10 = 0;
                                        for (z0.l lVar = ((j) lVarE).f24863q; lVar != null; lVar = lVar.f26500g) {
                                            if ((lVar.f26497d & 1048576) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    lVarE = lVar;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new p0.e(new z0.l[16]);
                                                    }
                                                    if (lVarE != null) {
                                                        eVar.b(lVarE);
                                                        lVarE = null;
                                                    }
                                                    eVar.b(lVar);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    lVarE = k.e(eVar);
                                }
                            }
                            if (lVarX02 != lVarV0) {
                            }
                        }
                    }
                }
                f1Var2.O0();
            }
            p0.e eVarI = i0Var.f24846a.I();
            Object[] objArr = eVarI.f20230a;
            int i11 = eVarI.f20232g;
            for (int i12 = 0; i12 < i11; i12++) {
                ((f0) objArr[i12]).x().S();
            }
        }
    }

    public final void T() {
        i0 i0Var = this.f24960g;
        if (i0Var.f24855l > 0) {
            p0.e eVarI = i0Var.f24846a.I();
            Object[] objArr = eVarI.f20230a;
            int i10 = eVarI.f20232g;
            for (int i11 = 0; i11 < i10; i11++) {
                f0 f0Var = (f0) objArr[i11];
                i0 i0VarR = f0Var.r();
                boolean z10 = i0VarR.j;
                y0 y0Var = i0VarR.f24859p;
                if ((z10 || i0VarR.k) && !y0Var.f24972u) {
                    f0Var.m0(false);
                }
                y0Var.T();
            }
        }
    }

    public final void U() {
        this.E = true;
        i0 i0Var = this.f24960g;
        f0 f0VarC = i0Var.f24846a.C();
        float f10 = d().A;
        f0 f0Var = i0Var.f24846a;
        al.c cVar = f0Var.D;
        f1 f1Var = (f1) cVar.f823e;
        r rVar = (r) cVar.f822d;
        while (f1Var != rVar) {
            br.l.c(f1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            x xVar = (x) f1Var;
            f10 += xVar.A;
            f1Var = xVar.f24822p;
        }
        if (f10 != this.D) {
            this.D = f10;
            if (f0VarC != null) {
                f0VarC.f0();
            }
            if (f0VarC != null) {
                f0VarC.L();
            }
        }
        if (this.f24969r) {
            ((r) f0Var.D.f822d).I0();
        } else {
            if (f0VarC != null) {
                f0VarC.L();
            }
            R();
            if (this.f24961h && f0VarC != null) {
                f0VarC.m0(false);
            }
        }
        if (f0VarC == null) {
            this.j = 0;
        } else if (!this.f24961h && f0VarC.t() == b0.LayingOut) {
            if (this.j != Integer.MAX_VALUE) {
                u1.a.b("Place was called on a node which was placed already");
            }
            this.j = f0VarC.r().f24854i;
            f0VarC.r().f24854i++;
        }
        w();
    }

    public final void V(long j) {
        i0 i0Var = this.f24960g;
        b0 b0Var = i0Var.f24849d;
        f0 f0Var = i0Var.f24846a;
        b0 b0Var2 = b0.Idle;
        if (b0Var != b0Var2) {
            u1.a.b("layout state is not idle before measure starts");
        }
        this.A = j;
        b0 b0Var3 = b0.Measuring;
        i0Var.f24849d = b0Var3;
        this.f24971t = false;
        n1 snapshotObserver = k.t(f0Var).getSnapshotObserver();
        snapshotObserver.a(f0Var, snapshotObserver.f24897c, this.B);
        if (i0Var.f24849d == b0Var3) {
            this.f24972u = true;
            this.f24973v = true;
            i0Var.f24849d = b0Var2;
        }
    }

    public final void W(long j, ar.k kVar) {
        i0 i0Var = this.f24960g;
        f0 f0Var = i0Var.f24846a;
        f0 f0Var2 = i0Var.f24846a;
        if (f0Var.K) {
            u1.a.a("place is called on a deactivated node");
        }
        i0Var.f24849d = b0.LayingOut;
        this.f24965n = j;
        this.f24966o = kVar;
        this.E = false;
        Owner ownerT = k.t(f0Var2);
        if (this.f24972u || !this.f24969r) {
            this.f24974w.f24840g = false;
            i0Var.f(false);
            this.F = kVar;
            this.G = j;
            n1 snapshotObserver = ownerT.getSnapshotObserver();
            snapshotObserver.a(f0Var2, snapshotObserver.f24900f, this.H);
        } else {
            f1 f1VarA = i0Var.a();
            f1VarA.M0(i3.g.A(j, f1VarA.f23813f), 0.0f, kVar);
            U();
        }
        i0Var.f24849d = b0.Idle;
        this.f24963l = true;
    }

    public final boolean X(long j) throws Throwable {
        i0 i0Var = this.f24960g;
        f0 f0Var = i0Var.f24846a;
        f0 f0Var2 = i0Var.f24846a;
        try {
            if (f0Var.K) {
                u1.a.a("measure is called on a deactivated node");
            }
            Owner ownerT = k.t(f0Var2);
            f0 f0VarC = f0Var2.C();
            boolean z10 = true;
            f0Var2.C = f0Var2.C || (f0VarC != null && f0VarC.C);
            if (!f0Var2.y() && t2.a.b(this.f23812e, j)) {
                ((AndroidComposeView) ownerT).j(f0Var2, false);
                f0Var2.p0();
                return false;
            }
            this.f24974w.f24839f = false;
            p0.e eVarI = f0Var2.I();
            Object[] objArr = eVarI.f20230a;
            int i10 = eVarI.f20232g;
            for (int i11 = 0; i11 < i10; i11++) {
                ((f0) objArr[i11]).r().f24859p.f24974w.f24836c = false;
            }
            this.k = true;
            long j7 = i0Var.a().f23811d;
            Q(j);
            V(j);
            if (ir.f0.t(i0Var.a().f23811d, j7) && i0Var.a().f23809b == this.f23809b && i0Var.a().f23810c == this.f23810c) {
                z10 = false;
            }
            O((i0Var.a().f23810c & 4294967295L) | (i0Var.a().f23809b << 32));
            return z10;
        } catch (Throwable th2) {
            f0Var.q0(th2);
            throw null;
        }
    }

    @Override // x1.a1
    public final void c() {
        this.f24960g.a().getClass();
    }

    @Override // x1.a
    public final r d() {
        return (r) this.f24960g.f24846a.D.f822d;
    }

    @Override // x1.a
    public final a e() {
        i0 i0VarR;
        f0 f0VarC = this.f24960g.f24846a.C();
        if (f0VarC == null || (i0VarR = f0VarC.r()) == null) {
            return null;
        }
        return i0VarR.f24859p;
    }

    @Override // x1.a
    public final g0 n() {
        return this.f24974w;
    }

    @Override // x1.a
    public final void o(j1.a aVar) {
        p0.e eVarI = this.f24960g.f24846a.I();
        Object[] objArr = eVarI.f20230a;
        int i10 = eVarI.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            aVar.a(((f0) objArr[i11]).r().f24859p);
        }
    }

    @Override // x1.a
    public final void requestLayout() {
        this.f24960g.f24846a.m0(false);
    }

    @Override // v1.q
    public final v1.v s(long j) throws Throwable {
        d0 d0Var;
        i0 i0Var = this.f24960g;
        f0 f0Var = i0Var.f24846a;
        d0 d0Var2 = f0Var.A;
        d0 d0Var3 = d0.NotUsed;
        if (d0Var2 == d0Var3) {
            f0Var.e();
        }
        if (k.o(i0Var.f24846a)) {
            s0 s0Var = i0Var.f24860q;
            br.l.b(s0Var);
            s0Var.k = d0Var3;
            s0Var.s(j);
        }
        f0 f0Var2 = i0Var.f24846a;
        f0 f0VarC = f0Var2.C();
        if (f0VarC != null) {
            if (this.f24964m != d0Var3 && !f0Var2.C) {
                u1.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i10 = w0.f24953a[f0VarC.t().ordinal()];
            if (i10 == 1) {
                d0Var = d0.InMeasureBlock;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + f0VarC.t());
                }
                d0Var = d0.InLayoutBlock;
            }
            this.f24964m = d0Var;
        } else {
            this.f24964m = d0Var3;
        }
        X(j);
        return this;
    }

    @Override // v1.v, v1.q
    public final Object t() {
        return this.f24968q;
    }

    @Override // x1.a
    public final void w() {
        this.f24977z = true;
        g0 g0Var = this.f24974w;
        g0Var.h();
        boolean z10 = this.f24972u;
        i0 i0Var = this.f24960g;
        if (z10) {
            p0.e eVarI = i0Var.f24846a.I();
            Object[] objArr = eVarI.f20230a;
            int i10 = eVarI.f20232g;
            for (int i11 = 0; i11 < i10; i11++) {
                f0 f0Var = (f0) objArr[i11];
                if (f0Var.y() && f0Var.z() == d0.InMeasureBlock && f0.i0(f0Var)) {
                    f0.n0(i0Var.f24846a, false, 7);
                }
            }
        }
        if (this.f24973v || (!d().k && this.f24972u)) {
            this.f24972u = false;
            b0 b0Var = i0Var.f24849d;
            i0Var.f24849d = b0.LayingOut;
            i0Var.g(false);
            f0 f0Var2 = i0Var.f24846a;
            n1 snapshotObserver = k.t(f0Var2).getSnapshotObserver();
            snapshotObserver.a(f0Var2, snapshotObserver.f24899e, this.C);
            i0Var.f24849d = b0Var;
            if (d().k && i0Var.j) {
                requestLayout();
            }
            this.f24973v = false;
        }
        if (g0Var.f24837d) {
            g0Var.f24838e = true;
        }
        if (g0Var.f24835b && g0Var.e()) {
            g0Var.g();
        }
        this.f24977z = false;
    }

    @Override // x1.a
    public final boolean x() {
        return this.f24969r;
    }
}
