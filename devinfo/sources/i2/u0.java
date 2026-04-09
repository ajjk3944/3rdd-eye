package i2;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u0 extends g2.s0 implements g2.i0, a, w0 {
    public boolean A;
    public float E;
    public boolean F;
    public mk.c G;
    public s1.b H;
    public float J;
    public boolean L;

    /* renamed from: f, reason: collision with root package name */
    public final i0 f25786f;
    public boolean g;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f25789k;

    /* renamed from: n, reason: collision with root package name */
    public mk.c f25792n;

    /* renamed from: o, reason: collision with root package name */
    public s1.b f25793o;

    /* renamed from: p, reason: collision with root package name */
    public float f25794p;

    /* renamed from: r, reason: collision with root package name */
    public Object f25796r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f25797s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f25798t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f25799u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f25800v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f25801w;

    /* renamed from: h, reason: collision with root package name */
    public int f25787h = Integer.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public int f25788i = Integer.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public c0 f25790l = c0.f25589c;

    /* renamed from: m, reason: collision with root package name */
    public long f25791m = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f25795q = true;

    /* renamed from: x, reason: collision with root package name */
    public final f0 f25802x = new f0(this, 0);

    /* renamed from: y, reason: collision with root package name */
    public final w0.e f25803y = new w0.e(new u0[16]);

    /* renamed from: z, reason: collision with root package name */
    public boolean f25804z = true;
    public long B = d3.b.b(0, 0, 15);
    public final t0 C = new t0(this, 1);
    public final t0 D = new t0(this, 0);
    public long I = 0;
    public final t0 K = new t0(this, 2);

    public u0(i0 i0Var) {
        this.f25786f = i0Var;
    }

    @Override // i2.a
    public final void B() {
        boolean zG0;
        this.A = true;
        f0 f0Var = this.f25802x;
        f0Var.h();
        boolean z3 = this.f25800v;
        i0 i0Var = this.f25786f;
        if (z3) {
            w0.e eVarZ = i0Var.f25674a.z();
            Object[] objArr = eVarZ.f36397a;
            int i4 = eVarZ.f36399c;
            for (int i10 = 0; i10 < i4; i10++) {
                e0 e0Var = (e0) objArr[i10];
                boolean zR = e0Var.r();
                i0 i0Var2 = e0Var.H;
                if (zR && e0Var.s() == c0.f25587a) {
                    u0 u0Var = i0Var2.f25687p;
                    d3.a aVar = u0Var.j ? new d3.a(u0Var.f24411d) : null;
                    if (aVar != null) {
                        if (e0Var.D == c0.f25589c) {
                            e0Var.e();
                        }
                        zG0 = i0Var2.f25687p.g0(aVar.f21951a);
                    } else {
                        zG0 = false;
                    }
                    if (zG0) {
                        e0.V(i0Var.f25674a, false, 7);
                    }
                }
            }
        }
        if (this.f25801w || (!h().f25712k && this.f25800v)) {
            this.f25800v = false;
            a0 a0Var = i0Var.f25677d;
            i0Var.f25677d = a0.f25569c;
            i0Var.g(false);
            e0 e0Var2 = i0Var.f25674a;
            o1 snapshotObserver = ((j2.r) h0.a(e0Var2)).getSnapshotObserver();
            snapshotObserver.f25732a.b(e0Var2, snapshotObserver.f25736e, this.D);
            i0Var.f25677d = a0Var;
            this.f25801w = false;
        }
        if (f0Var.f25659b && f0Var.e()) {
            f0Var.g();
        }
        this.A = false;
    }

    @Override // i2.a
    public final void G() {
        e0.V(this.f25786f.f25674a, false, 7);
    }

    @Override // g2.i0
    public final int J(int i4) {
        i0 i0Var = this.f25786f;
        if (!k.o(i0Var.f25674a)) {
            c0();
            return i0Var.a().J(i4);
        }
        q0 q0Var = i0Var.f25688q;
        nk.k.b(q0Var);
        return q0Var.J(i4);
    }

    @Override // g2.s0
    public final int K() {
        return this.f25786f.a().K();
    }

    @Override // g2.s0
    public final int L() {
        return this.f25786f.a().L();
    }

    @Override // g2.s0
    public final void R(long j, float f10, mk.c cVar) {
        f0(j, f10, cVar, null);
    }

    @Override // g2.s0
    public final void S(long j, float f10, s1.b bVar) {
        f0(j, f10, null, bVar);
    }

    public final List Y() {
        i0 i0Var = this.f25786f;
        i0Var.f25674a.f0();
        boolean z3 = this.f25804z;
        w0.e eVar = this.f25803y;
        if (!z3) {
            return eVar.g();
        }
        e0 e0Var = i0Var.f25674a;
        w0.e eVarZ = e0Var.z();
        Object[] objArr = eVarZ.f36397a;
        int i4 = eVarZ.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            e0 e0Var2 = (e0) objArr[i10];
            if (eVar.f36399c <= i10) {
                eVar.b(e0Var2.H.f25687p);
            } else {
                u0 u0Var = e0Var2.H.f25687p;
                Object[] objArr2 = eVar.f36397a;
                Object obj = objArr2[i10];
                objArr2[i10] = u0Var;
            }
        }
        eVar.m(((w0.b) e0Var.o()).f36391a.f36399c, eVar.f36399c);
        this.f25804z = false;
        return eVar.g();
    }

    public final void Z() {
        boolean z3 = this.f25797s;
        this.f25797s = true;
        i0 i0Var = this.f25786f;
        e0 e0Var = i0Var.f25674a;
        com.google.android.gms.internal.consent_sdk.a0 a0Var = e0Var.G;
        if (!z3) {
            ((q) a0Var.f19257d).K0();
            ((j2.r) h0.a(e0Var)).getRectManager().e(i0Var.f25674a, true);
            if (e0Var.r()) {
                e0.V(e0Var, true, 6);
            } else if (e0Var.H.f25678e) {
                e0.T(e0Var, true, 6);
            }
        }
        d1 d1Var = ((q) a0Var.f19257d).f25611p;
        for (d1 d1Var2 = (d1) a0Var.f19258e; !nk.k.a(d1Var2, d1Var) && d1Var2 != null; d1Var2 = d1Var2.f25611p) {
            if (d1Var2.K) {
                d1Var2.G0();
            }
        }
        w0.e eVarZ = e0Var.z();
        Object[] objArr = eVarZ.f36397a;
        int i4 = eVarZ.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            e0 e0Var2 = (e0) objArr[i10];
            if (e0Var2.w() != Integer.MAX_VALUE) {
                e0Var2.H.f25687p.Z();
                e0.W(e0Var2);
            }
        }
    }

    public final void a0() {
        if (this.f25797s) {
            this.f25797s = false;
            i0 i0Var = this.f25786f;
            e0 e0Var = i0Var.f25674a;
            e0 e0Var2 = i0Var.f25674a;
            ((j2.r) h0.a(e0Var)).getRectManager().g(e0Var2);
            com.google.android.gms.internal.consent_sdk.a0 a0Var = e0Var2.G;
            d1 d1Var = ((q) a0Var.f19257d).f25611p;
            for (d1 d1Var2 = (d1) a0Var.f19258e; !nk.k.a(d1Var2, d1Var) && d1Var2 != null; d1Var2 = d1Var2.f25611p) {
                d1Var2.M0();
                d1Var2.R0();
            }
            w0.e eVarZ = e0Var2.z();
            Object[] objArr = eVarZ.f36397a;
            int i4 = eVarZ.f36399c;
            for (int i10 = 0; i10 < i4; i10++) {
                ((e0) objArr[i10]).H.f25687p.a0();
            }
        }
    }

    @Override // i2.a
    public final f0 b() {
        return this.f25802x;
    }

    public final void b0() {
        i0 i0Var = this.f25786f;
        if (i0Var.f25683l > 0) {
            w0.e eVarZ = i0Var.f25674a.z();
            Object[] objArr = eVarZ.f36397a;
            int i4 = eVarZ.f36399c;
            for (int i10 = 0; i10 < i4; i10++) {
                e0 e0Var = (e0) objArr[i10];
                i0 i0Var2 = e0Var.H;
                boolean z3 = i0Var2.j;
                u0 u0Var = i0Var2.f25687p;
                if ((z3 || i0Var2.f25682k) && !u0Var.f25800v) {
                    e0Var.U(false);
                }
                u0Var.b0();
            }
        }
    }

    public final void c0() {
        i0 i0Var = this.f25786f;
        e0.V(i0Var.f25674a, false, 7);
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
        i0 i0Var = this.f25786f;
        if (!k.o(i0Var.f25674a)) {
            c0();
            return i0Var.a().d(i4);
        }
        q0 q0Var = i0Var.f25688q;
        nk.k.b(q0Var);
        return q0Var.d(i4);
    }

    public final void d0() {
        this.F = true;
        i0 i0Var = this.f25786f;
        e0 e0VarV = i0Var.f25674a.v();
        float f10 = h().A;
        e0 e0Var = i0Var.f25674a;
        com.google.android.gms.internal.consent_sdk.a0 a0Var = e0Var.G;
        d1 d1Var = (d1) a0Var.f19258e;
        q qVar = (q) a0Var.f19257d;
        while (d1Var != qVar) {
            nk.k.c(d1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            w wVar = (w) d1Var;
            f10 += wVar.A;
            d1Var = wVar.f25611p;
        }
        if (f10 != this.E) {
            this.E = f10;
            if (e0VarV != null) {
                e0VarV.O();
            }
            if (e0VarV != null) {
                e0VarV.C();
            }
        }
        if (!h().f25712k) {
            boolean z3 = this.f25797s;
            if (!z3 || this.f25802x.d()) {
                Z();
            }
            if (z3) {
                ((q) e0Var.G.f19257d).K0();
            } else {
                if (e0VarV != null) {
                    e0VarV.C();
                }
                if (this.g && e0VarV != null) {
                    e0VarV.U(false);
                }
            }
        }
        if (e0VarV != null) {
            i0 i0Var2 = e0VarV.H;
            if (!this.g && i0Var2.f25677d == a0.f25569c) {
                if (this.f25788i != Integer.MAX_VALUE) {
                    f2.a.b("Place was called on a node which was placed already");
                }
                int i4 = i0Var2.f25681i;
                this.f25788i = i4;
                i0Var2.f25681i = i4 + 1;
            }
        } else {
            this.f25788i = 0;
        }
        B();
    }

    public final void e0(long j, float f10, mk.c cVar, s1.b bVar) {
        i0 i0Var = this.f25786f;
        e0 e0Var = i0Var.f25674a;
        e0 e0Var2 = i0Var.f25674a;
        if (e0Var.R) {
            f2.a.a("place is called on a deactivated node");
        }
        i0Var.f25677d = a0.f25569c;
        this.f25791m = j;
        this.f25794p = f10;
        this.f25792n = cVar;
        this.f25793o = bVar;
        this.F = false;
        m1 m1VarA = h0.a(e0Var2);
        if (this.f25800v || !this.f25797s) {
            this.f25802x.f25662e = false;
            i0Var.f(false);
            this.G = cVar;
            this.I = j;
            this.J = f10;
            this.H = bVar;
            o1 snapshotObserver = ((j2.r) m1VarA).getSnapshotObserver();
            snapshotObserver.f25732a.b(e0Var2, snapshotObserver.f25737f, this.K);
        } else {
            d1 d1VarA = i0Var.a();
            d1VarA.P0(d3.i.c(j, d1VarA.f24412e), f10, cVar, bVar);
            d0();
        }
        i0Var.f25677d = a0.f25571e;
        if (i0Var.a().f25712k && (i0Var.f25682k || i0Var.j)) {
            requestLayout();
        }
        this.f25789k = true;
    }

    public final void f0(long j, float f10, mk.c cVar, s1.b bVar) {
        g2.r0 placementScope;
        i0 i0Var = this.f25786f;
        e0 e0Var = i0Var.f25674a;
        e0 e0Var2 = i0Var.f25674a;
        try {
            this.f25798t = true;
            if (!d3.i.a(j, this.f25791m) || this.L) {
                if (i0Var.f25682k || i0Var.j || this.L) {
                    this.f25800v = true;
                    this.L = false;
                }
                b0();
            }
            q0 q0Var = i0Var.f25688q;
            if (q0Var != null) {
                i0 i0Var2 = q0Var.f25741f;
                if (q0Var.f25750q == o0.f25730c && !k.o(i0Var2.f25674a)) {
                    i0Var2.f25676c = true;
                }
            }
            q0 q0Var2 = i0Var.f25688q;
            if (q0Var2 != null && q0Var2.Y()) {
                d1 d1Var = i0Var.a().f25612q;
                if (d1Var == null || (placementScope = d1Var.f25713l) == null) {
                    placementScope = ((j2.r) h0.a(e0Var2)).getPlacementScope();
                }
                q0 q0Var3 = i0Var.f25688q;
                nk.k.b(q0Var3);
                e0 e0VarV = e0Var2.v();
                if (e0VarV != null) {
                    e0VarV.H.f25680h = 0;
                }
                q0Var3.f25743i = Integer.MAX_VALUE;
                g2.r0.g(placementScope, q0Var3, (int) (j >> 32), (int) (4294967295L & j));
            }
            q0 q0Var4 = i0Var.f25688q;
            if (q0Var4 != null && !q0Var4.f25744k) {
                f2.a.b("Error: Placement happened before lookahead.");
            }
            e0(j, f10, cVar, bVar);
        } catch (Throwable th2) {
            e0Var.Y(th2);
            throw null;
        }
    }

    @Override // i2.a
    public final void g(c2.l0 l0Var) {
        w0.e eVarZ = this.f25786f.f25674a.z();
        Object[] objArr = eVarZ.f36397a;
        int i4 = eVarZ.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            l0Var.invoke(((e0) objArr[i10]).H.f25687p);
        }
    }

    public final boolean g0(long j) {
        i0 i0Var = this.f25786f;
        e0 e0Var = i0Var.f25674a;
        e0 e0Var2 = i0Var.f25674a;
        try {
            if (e0Var.R) {
                f2.a.a("measure is called on a deactivated node");
            }
            m1 m1VarA = h0.a(e0Var2);
            e0 e0VarV = e0Var2.v();
            boolean z3 = true;
            e0Var2.F = e0Var2.F || (e0VarV != null && e0VarV.F);
            if (!e0Var2.r() && d3.a.b(this.f24411d, j)) {
                ((j2.r) m1VarA).o(e0Var2, false);
                e0Var2.X();
                return false;
            }
            this.f25802x.f25661d = false;
            w0.e eVarZ = e0Var2.z();
            Object[] objArr = eVarZ.f36397a;
            int i4 = eVarZ.f36399c;
            for (int i10 = 0; i10 < i4; i10++) {
                ((e0) objArr[i10]).H.f25687p.f25802x.getClass();
            }
            this.j = true;
            long j8 = i0Var.a().f24410c;
            V(j);
            a0 a0Var = i0Var.f25677d;
            a0 a0Var2 = a0.f25571e;
            if (a0Var != a0Var2) {
                f2.a.b("layout state is not idle before measure starts");
            }
            this.B = j;
            a0 a0Var3 = a0.f25567a;
            i0Var.f25677d = a0Var3;
            this.f25799u = false;
            o1 snapshotObserver = ((j2.r) h0.a(e0Var2)).getSnapshotObserver();
            snapshotObserver.f25732a.b(e0Var2, snapshotObserver.f25734c, this.C);
            if (i0Var.f25677d == a0Var3) {
                this.f25800v = true;
                this.f25801w = true;
                i0Var.f25677d = a0Var2;
            }
            if (d3.k.a(i0Var.a().f24410c, j8) && i0Var.a().f24408a == this.f24408a && i0Var.a().f24409b == this.f24409b) {
                z3 = false;
            }
            U((i0Var.a().f24409b & 4294967295L) | (i0Var.a().f24408a << 32));
            return z3;
        } catch (Throwable th2) {
            e0Var.Y(th2);
            throw null;
        }
    }

    @Override // i2.a
    public final q h() {
        return (q) this.f25786f.f25674a.G.f19257d;
    }

    @Override // i2.a
    public final a j() {
        i0 i0Var;
        e0 e0VarV = this.f25786f.f25674a.v();
        if (e0VarV == null || (i0Var = e0VarV.H) == null) {
            return null;
        }
        return i0Var.f25687p;
    }

    @Override // g2.i0
    public final int n(int i4) {
        i0 i0Var = this.f25786f;
        if (!k.o(i0Var.f25674a)) {
            c0();
            return i0Var.a().n(i4);
        }
        q0 q0Var = i0Var.f25688q;
        nk.k.b(q0Var);
        return q0Var.n(i4);
    }

    @Override // i2.a
    public final int q() {
        return this.f25788i;
    }

    @Override // i2.a
    public final void requestLayout() {
        this.f25786f.f25674a.U(false);
    }

    @Override // g2.i0
    public final int t(int i4) {
        i0 i0Var = this.f25786f;
        if (!k.o(i0Var.f25674a)) {
            c0();
            return i0Var.a().t(i4);
        }
        q0 q0Var = i0Var.f25688q;
        nk.k.b(q0Var);
        return q0Var.t(i4);
    }

    @Override // g2.i0
    public final g2.s0 v(long j) {
        c0 c0Var;
        i0 i0Var = this.f25786f;
        e0 e0Var = i0Var.f25674a;
        c0 c0Var2 = e0Var.D;
        c0 c0Var3 = c0.f25589c;
        if (c0Var2 == c0Var3) {
            e0Var.e();
        }
        if (k.o(i0Var.f25674a)) {
            q0 q0Var = i0Var.f25688q;
            nk.k.b(q0Var);
            q0Var.j = c0Var3;
            q0Var.v(j);
        }
        e0 e0Var2 = i0Var.f25674a;
        e0 e0VarV = e0Var2.v();
        if (e0VarV != null) {
            i0 i0Var2 = e0VarV.H;
            if (this.f25790l != c0Var3 && !e0Var2.F) {
                f2.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = i0Var2.f25677d.ordinal();
            if (iOrdinal == 0) {
                c0Var = c0.f25587a;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + i0Var2.f25677d);
                }
                c0Var = c0.f25588b;
            }
            this.f25790l = c0Var;
        } else {
            this.f25790l = c0Var3;
        }
        g0(j);
        return this;
    }

    @Override // g2.s0, g2.i0
    public final Object w() {
        return this.f25796r;
    }

    @Override // i2.w0
    public final void z(boolean z3) {
        i0 i0Var = this.f25786f;
        if (z3 != i0Var.a().f25711i) {
            i0Var.a().f25711i = z3;
            this.L = true;
        }
    }
}
