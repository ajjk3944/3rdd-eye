package i2;

import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.measurement.z3;
import java.util.List;
import u0.o2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e0 implements u0.h, n1, g {
    public static final z S = new z("Undefined intrinsics block and it is required");
    public static final y T = new y();
    public static final b4.b U = new b4.b(4);
    public d3.l A;
    public j2.y1 B;
    public u0.y C;
    public c0 D;
    public c0 E;
    public boolean F;
    public final com.google.android.gms.internal.consent_sdk.a0 G;
    public final i0 H;
    public g2.f0 I;
    public d1 J;
    public boolean K;
    public i1.n L;
    public i1.n M;
    public g3.d N;
    public c2.a0 O;
    public boolean P;
    public int Q;
    public boolean R;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25627a;

    /* renamed from: b, reason: collision with root package name */
    public int f25628b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25629c;

    /* renamed from: d, reason: collision with root package name */
    public long f25630d;

    /* renamed from: e, reason: collision with root package name */
    public long f25631e;

    /* renamed from: f, reason: collision with root package name */
    public long f25632f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25633h;

    /* renamed from: i, reason: collision with root package name */
    public e0 f25634i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public final yb.i f25635k;

    /* renamed from: l, reason: collision with root package name */
    public w0.e f25636l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f25637m;

    /* renamed from: n, reason: collision with root package name */
    public e0 f25638n;

    /* renamed from: o, reason: collision with root package name */
    public m1 f25639o;

    /* renamed from: p, reason: collision with root package name */
    public g3.x f25640p;

    /* renamed from: q, reason: collision with root package name */
    public int f25641q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f25642r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f25643s;

    /* renamed from: t, reason: collision with root package name */
    public p2.l f25644t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f25645u;

    /* renamed from: v, reason: collision with root package name */
    public final w0.e f25646v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f25647w;

    /* renamed from: x, reason: collision with root package name */
    public g2.j0 f25648x;

    /* renamed from: y, reason: collision with root package name */
    public y4.a f25649y;

    /* renamed from: z, reason: collision with root package name */
    public d3.c f25650z;

    public e0(int i4) {
        this(p2.n.f31099a.addAndGet(1), (i4 & 1) == 0);
    }

    public static void T(e0 e0Var, boolean z3, int i4) {
        e0 e0VarV;
        if ((i4 & 1) != 0) {
            z3 = false;
        }
        boolean z10 = (i4 & 2) != 0;
        boolean z11 = (i4 & 4) != 0;
        if (e0Var.f25634i == null) {
            f2.a.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        m1 m1Var = e0Var.f25639o;
        if (m1Var == null || e0Var.f25642r || e0Var.f25627a) {
            return;
        }
        ((j2.r) m1Var).C(e0Var, true, z3, z10);
        if (z11) {
            q0 q0Var = e0Var.H.f25688q;
            nk.k.b(q0Var);
            i0 i0Var = q0Var.f25741f;
            e0 e0VarV2 = i0Var.f25674a.v();
            c0 c0Var = i0Var.f25674a.D;
            if (e0VarV2 == null || c0Var == c0.f25589c) {
                return;
            }
            while (e0VarV2.D == c0Var && (e0VarV = e0VarV2.v()) != null) {
                e0VarV2 = e0VarV;
            }
            int iOrdinal = c0Var.ordinal();
            if (iOrdinal == 0) {
                if (e0VarV2.f25634i != null) {
                    T(e0VarV2, z3, 6);
                    return;
                } else {
                    V(e0VarV2, z3, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (e0VarV2.f25634i != null) {
                e0VarV2.S(z3);
            } else {
                e0VarV2.U(z3);
            }
        }
    }

    public static void V(e0 e0Var, boolean z3, int i4) {
        m1 m1Var;
        e0 e0VarV;
        if ((i4 & 1) != 0) {
            z3 = false;
        }
        boolean z10 = (i4 & 2) != 0;
        boolean z11 = (i4 & 4) != 0;
        if (e0Var.f25642r || e0Var.f25627a || (m1Var = e0Var.f25639o) == null) {
            return;
        }
        ((j2.r) m1Var).C(e0Var, false, z3, z10);
        if (z11) {
            i0 i0Var = e0Var.H.f25687p.f25786f;
            e0 e0VarV2 = i0Var.f25674a.v();
            c0 c0Var = i0Var.f25674a.D;
            if (e0VarV2 == null || c0Var == c0.f25589c) {
                return;
            }
            while (e0VarV2.D == c0Var && (e0VarV = e0VarV2.v()) != null) {
                e0VarV2 = e0VarV;
            }
            int iOrdinal = c0Var.ordinal();
            if (iOrdinal == 0) {
                V(e0VarV2, z3, 6);
            } else {
                if (iOrdinal != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                e0VarV2.U(z3);
            }
        }
    }

    public static void W(e0 e0Var) {
        i0 i0Var = e0Var.H;
        if (d0.f25609a[i0Var.f25677d.ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + i0Var.f25677d);
        }
        if (i0Var.f25678e) {
            T(e0Var, true, 6);
            return;
        }
        if (i0Var.f25679f) {
            e0Var.S(true);
        }
        if (e0Var.r()) {
            V(e0Var, true, 6);
        } else if (e0Var.q()) {
            e0Var.U(true);
        }
    }

    private final String k(e0 e0Var) {
        StringBuilder sb2 = new StringBuilder("Cannot insert ");
        sb2.append(e0Var);
        sb2.append(" because it already has a parent or an owner. This tree: ");
        sb2.append(g(0));
        sb2.append(" Other tree: ");
        e0 e0Var2 = e0Var.f25638n;
        sb2.append(e0Var2 != null ? e0Var2.g(0) : null);
        return sb2.toString();
    }

    public final void A(long j, o oVar, int i4, boolean z3) {
        com.google.android.gms.internal.consent_sdk.a0 a0Var = this.G;
        d1 d1Var = (d1) a0Var.f19258e;
        p1.h0 h0Var = d1.N;
        ((d1) a0Var.f19258e).E0(d1.P, d1Var.w0(j), oVar, i4, z3);
    }

    public final void B(int i4, e0 e0Var) {
        if (e0Var.f25638n != null && e0Var.f25639o != null) {
            f2.a.b(k(e0Var));
        }
        e0Var.f25638n = this;
        yb.i iVar = this.f25635k;
        ((w0.e) iVar.f37516b).a(i4, e0Var);
        ((b2.b) iVar.f37517c).invoke();
        O();
        if (e0Var.f25627a) {
            this.j++;
        }
        G();
        m1 m1Var = this.f25639o;
        if (m1Var != null) {
            e0Var.d(m1Var);
        }
        if (e0Var.H.f25683l > 0) {
            i0 i0Var = this.H;
            i0Var.d(i0Var.f25683l + 1);
        }
        if (e0Var.Q > 0) {
            a0(this.Q + 1);
        }
    }

    public final void C() {
        if (this.K) {
            com.google.android.gms.internal.consent_sdk.a0 a0Var = this.G;
            d1 d1Var = (q) a0Var.f19257d;
            d1 d1Var2 = ((d1) a0Var.f19258e).f25612q;
            this.J = null;
            while (true) {
                if (nk.k.a(d1Var, d1Var2)) {
                    break;
                }
                if ((d1Var != null ? d1Var.L : null) != null) {
                    this.J = d1Var;
                    break;
                }
                d1Var = d1Var != null ? d1Var.f25612q : null;
            }
        }
        d1 d1Var3 = this.J;
        if (d1Var3 != null && d1Var3.L == null) {
            throw d.h.o("layer was not set");
        }
        if (d1Var3 != null) {
            d1Var3.G0();
            return;
        }
        e0 e0VarV = v();
        if (e0VarV != null) {
            e0VarV.C();
        }
    }

    public final void D() {
        com.google.android.gms.internal.consent_sdk.a0 a0Var = this.G;
        d1 d1Var = (d1) a0Var.f19258e;
        q qVar = (q) a0Var.f19257d;
        while (d1Var != qVar) {
            nk.k.c(d1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            w wVar = (w) d1Var;
            l1 l1Var = wVar.L;
            if (l1Var != null) {
                l1Var.invalidate();
            }
            d1Var = wVar.f25611p;
        }
        l1 l1Var2 = ((q) a0Var.f19257d).L;
        if (l1Var2 != null) {
            l1Var2.invalidate();
        }
    }

    public final void E() {
        if (this.f25627a) {
            e0 e0VarV = v();
            if (e0VarV != null) {
                e0VarV.E();
                return;
            }
            return;
        }
        if (this.f25634i != null) {
            T(this, false, 7);
        } else {
            V(this, false, 7);
        }
    }

    public final void F() {
        if (this.f25645u) {
            return;
        }
        if (((y0) this.G.f19256c).f25559f != null || this.M != null) {
            this.f25643s = true;
            return;
        }
        p2.l lVar = this.f25644t;
        this.f25645u = true;
        nk.u uVar = new nk.u();
        uVar.f29986a = new p2.l();
        o1 snapshotObserver = ((j2.r) h0.a(this)).getSnapshotObserver();
        c2.c cVar = new c2.c(5, this, uVar);
        snapshotObserver.f25732a.b(this, snapshotObserver.f25735d, cVar);
        this.f25645u = false;
        this.f25644t = (p2.l) uVar.f29986a;
        this.f25643s = false;
        j2.r rVar = (j2.r) h0.a(this);
        rVar.getSemanticsOwner().b(this, lVar);
        rVar.E();
    }

    public final void G() {
        e0 e0Var;
        if (this.j > 0) {
            this.f25637m = true;
        }
        if (!this.f25627a || (e0Var = this.f25638n) == null) {
            return;
        }
        e0Var.G();
    }

    public final boolean H() {
        return this.f25639o != null;
    }

    public final boolean I() {
        return this.H.f25687p.f25797s;
    }

    public final Boolean J() {
        q0 q0Var = this.H.f25688q;
        if (q0Var != null) {
            return Boolean.valueOf(q0Var.f25750q != o0.f25730c);
        }
        return null;
    }

    public final void K() {
        e0 e0VarV;
        if (this.D == c0.f25589c) {
            f();
        }
        q0 q0Var = this.H.f25688q;
        nk.k.b(q0Var);
        boolean z3 = true;
        try {
            q0Var.g = true;
            if (!q0Var.f25744k) {
                f2.a.b("replace() called on item that was not placed");
            }
            q0Var.B = false;
            if (q0Var.f25750q == o0.f25730c) {
                z3 = false;
            }
            q0Var.e0(q0Var.f25747n, q0Var.f25748o, q0Var.f25749p);
            if (z3 && !q0Var.B && (e0VarV = q0Var.f25741f.f25674a.v()) != null) {
                e0VarV.S(false);
            }
            q0Var.g = false;
        } catch (Throwable th2) {
            q0Var.g = false;
            throw th2;
        }
    }

    public final void L(int i4, int i10, int i11) {
        if (i4 == i10) {
            return;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i4 > i10 ? i4 + i12 : i4;
            int i14 = i4 > i10 ? i10 + i12 : (i10 + i11) - 2;
            yb.i iVar = this.f25635k;
            w0.e eVar = (w0.e) iVar.f37516b;
            b2.b bVar = (b2.b) iVar.f37517c;
            Object objL = eVar.l(i13);
            bVar.invoke();
            ((w0.e) iVar.f37516b).a(i14, (e0) objL);
            bVar.invoke();
        }
        O();
        G();
        E();
    }

    public final void M(e0 e0Var) {
        if (e0Var.H.f25683l > 0) {
            this.H.d(r0.f25683l - 1);
        }
        if (this.f25639o != null) {
            e0Var.h();
        }
        e0Var.f25638n = null;
        if (e0Var.Q > 0) {
            a0(this.Q - 1);
        }
        ((d1) e0Var.G.f19258e).f25612q = null;
        if (e0Var.f25627a) {
            this.j--;
            w0.e eVar = (w0.e) e0Var.f25635k.f37516b;
            Object[] objArr = eVar.f36397a;
            int i4 = eVar.f36399c;
            for (int i10 = 0; i10 < i4; i10++) {
                ((d1) ((e0) objArr[i10]).G.f19258e).f25612q = null;
            }
        }
        G();
        O();
    }

    public final void N() {
        q2.b rectManager;
        this.g = true;
        m1 m1Var = this.f25639o;
        if (m1Var == null || (rectManager = ((j2.r) m1Var).getRectManager()) == null) {
            return;
        }
        rectManager.d(this);
    }

    public final void O() {
        if (!this.f25627a) {
            this.f25647w = true;
            return;
        }
        e0 e0VarV = v();
        if (e0VarV != null) {
            e0VarV.O();
        }
    }

    public final void P() {
        yb.i iVar = this.f25635k;
        w0.e eVar = (w0.e) iVar.f37516b;
        w0.e eVar2 = (w0.e) iVar.f37516b;
        int i4 = eVar.f36399c;
        while (true) {
            i4--;
            if (-1 >= i4) {
                eVar2.h();
                ((b2.b) iVar.f37517c).invoke();
                return;
            }
            M((e0) eVar2.f36397a[i4]);
        }
    }

    public final void Q(int i4, int i10) {
        if (i10 < 0) {
            f2.a.a("count (" + i10 + ") must be greater than 0");
        }
        int i11 = (i10 + i4) - 1;
        if (i4 > i11) {
            return;
        }
        while (true) {
            yb.i iVar = this.f25635k;
            M((e0) ((w0.e) iVar.f37516b).f36397a[i11]);
            Object objL = ((w0.e) iVar.f37516b).l(i11);
            ((b2.b) iVar.f37517c).invoke();
            if (i11 == i4) {
                return;
            } else {
                i11--;
            }
        }
    }

    public final void R() {
        e0 e0VarV;
        if (this.D == c0.f25589c) {
            f();
        }
        u0 u0Var = this.H.f25687p;
        i0 i0Var = u0Var.f25786f;
        try {
            u0Var.g = true;
            if (!u0Var.f25789k) {
                f2.a.b("replace called on unplaced item");
            }
            boolean z3 = u0Var.f25797s;
            u0Var.e0(u0Var.f25791m, u0Var.f25794p, u0Var.f25792n, u0Var.f25793o);
            if (z3 && !u0Var.F && (e0VarV = i0Var.f25674a.v()) != null) {
                e0VarV.U(false);
            }
        } finally {
        }
    }

    public final void S(boolean z3) {
        m1 m1Var;
        if (this.f25627a || (m1Var = this.f25639o) == null) {
            return;
        }
        ((j2.r) m1Var).D(this, true, z3);
    }

    public final void U(boolean z3) {
        m1 m1Var;
        if (this.f25627a || (m1Var = this.f25639o) == null) {
            return;
        }
        ((j2.r) m1Var).D(this, false, z3);
    }

    public final void X() {
        w0.e eVarZ = z();
        Object[] objArr = eVarZ.f36397a;
        int i4 = eVarZ.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            e0 e0Var = (e0) objArr[i10];
            c0 c0Var = e0Var.E;
            e0Var.D = c0Var;
            if (c0Var != c0.f25589c) {
                e0Var.X();
            }
        }
    }

    public final void Y(Throwable th2) {
        u0.y yVar = this.C;
        o2 o2Var = h1.e.f24805a;
        c1.l lVar = (c1.l) yVar;
        lVar.getClass();
        h1.d dVar = (h1.d) u0.q.s(lVar, o2Var);
        if (dVar == null) {
            throw th2;
        }
        z3.x(th2, new c0.p(5, dVar, this));
        throw th2;
    }

    public final void Z(d3.c cVar) {
        if (nk.k.a(this.f25650z, cVar)) {
            return;
        }
        this.f25650z = cVar;
        E();
        e0 e0VarV = v();
        if (e0VarV != null) {
            e0VarV.C();
        }
        D();
        for (i1.m mVar = (i1.m) this.G.g; mVar != null; mVar = mVar.f25559f) {
            mVar.g0();
        }
    }

    @Override // u0.h
    public final void a() {
        g3.x xVar = this.f25640p;
        if (xVar != null) {
            xVar.a();
        }
        g2.f0 f0Var = this.I;
        if (f0Var != null) {
            f0Var.a();
        }
        com.google.android.gms.internal.consent_sdk.a0 a0Var = this.G;
        d1 d1Var = ((q) a0Var.f19257d).f25611p;
        for (d1 d1Var2 = (d1) a0Var.f19258e; !nk.k.a(d1Var2, d1Var) && d1Var2 != null; d1Var2 = d1Var2.f25611p) {
            d1Var2.L0();
        }
    }

    public final void a0(int i4) {
        e0 e0VarV;
        e0 e0VarV2;
        int i10 = this.Q;
        if (i10 != i4) {
            if (i4 > 0 && i10 == 0 && (e0VarV2 = v()) != null) {
                e0VarV2.a0(e0VarV2.Q + 1);
            }
            if (i4 == 0 && this.Q > 0 && (e0VarV = v()) != null) {
                e0VarV.a0(e0VarV.Q - 1);
            }
            this.Q = i4;
        }
    }

    @Override // u0.h
    public final void b() {
        j1.c cVar;
        g3.x xVar = this.f25640p;
        if (xVar != null) {
            xVar.b();
        }
        g2.f0 f0Var = this.I;
        if (f0Var != null) {
            f0Var.i(true);
        }
        this.R = true;
        i1.m mVar = (w1) this.G.f19259f;
        for (i1.m mVar2 = mVar; mVar2 != null; mVar2 = mVar2.f25558e) {
            if (mVar2.f25565n) {
                mVar2.k0();
            }
        }
        for (i1.m mVar3 = mVar; mVar3 != null; mVar3 = mVar3.f25558e) {
            if (mVar3.f25565n) {
                mVar3.m0();
            }
        }
        while (mVar != null) {
            if (mVar.f25565n) {
                mVar.e0();
            }
            mVar = mVar.f25558e;
        }
        if (H()) {
            this.f25644t = null;
            this.f25643s = false;
        }
        m1 m1Var = this.f25639o;
        if (m1Var != null) {
            j2.r rVar = (j2.r) m1Var;
            if (j2.r.i() && (cVar = rVar.L) != null && cVar.g.e(this.f25628b)) {
                cVar.f27041a.j(cVar.f27043c, this.f25628b, false);
            }
        }
    }

    public final void b0(e0 e0Var) {
        if (nk.k.a(e0Var, this.f25634i)) {
            return;
        }
        this.f25634i = e0Var;
        i0 i0Var = this.H;
        if (e0Var != null) {
            if (i0Var.f25688q == null) {
                i0Var.f25688q = new q0(i0Var);
            }
            com.google.android.gms.internal.consent_sdk.a0 a0Var = this.G;
            d1 d1Var = ((q) a0Var.f19257d).f25611p;
            for (d1 d1Var2 = (d1) a0Var.f19258e; !nk.k.a(d1Var2, d1Var) && d1Var2 != null; d1Var2 = d1Var2.f25611p) {
                d1Var2.u0();
            }
        } else {
            i0Var.f25688q = null;
            i0Var.f25679f = false;
            i0Var.f25678e = false;
        }
        E();
    }

    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v3, types: [i1.m, i2.d1] */
    public final void c(i1.n nVar) {
        ?? r72;
        w0.e eVar;
        com.google.android.gms.internal.consent_sdk.a0 a0Var;
        y0 y0Var;
        w0.e eVar2;
        boolean z3;
        boolean z10;
        boolean z11;
        com.google.android.gms.internal.consent_sdk.a0 a0Var2;
        boolean z12;
        c2.l0 l0Var;
        com.google.android.gms.internal.consent_sdk.a0 a0Var3 = this.G;
        boolean zF = a0Var3.f(16);
        i1.m mVar = (w1) a0Var3.f19259f;
        boolean zF2 = a0Var3.f(Segment.SHARE_MINIMUM);
        this.L = nVar;
        q qVar = (q) a0Var3.f19257d;
        e0 e0Var = (e0) a0Var3.f19255b;
        i1.m mVar2 = (i1.m) a0Var3.g;
        y0 y0Var2 = (y0) a0Var3.f19256c;
        if (mVar2 == y0Var2) {
            f2.a.b("padChain called on already padded chain");
        }
        i1.m mVar3 = (i1.m) a0Var3.g;
        mVar3.f25558e = y0Var2;
        y0Var2.f25559f = mVar3;
        w0.e eVar3 = (w0.e) a0Var3.f19260h;
        int i4 = eVar3 != null ? eVar3.f36399c : 0;
        w0.e eVar4 = (w0.e) a0Var3.f19261i;
        if (eVar4 == null) {
            eVar4 = new w0.e(new i1.l[16]);
        }
        w0.e eVar5 = (w0.e) a0Var3.j;
        eVar5.b(nVar);
        c2.l0 l0Var2 = null;
        while (true) {
            int i10 = eVar5.f36399c;
            if (i10 == 0) {
                break;
            }
            i1.n nVar2 = (i1.n) eVar5.l(i10 - 1);
            if (nVar2 instanceof i1.g) {
                i1.g gVar = (i1.g) nVar2;
                eVar5.b(gVar.f25548b);
                eVar5.b(gVar.f25547a);
            } else if (nVar2 instanceof i1.l) {
                eVar4.b(nVar2);
            } else {
                if (l0Var2 == null) {
                    l0Var = new c2.l0(6, eVar4);
                    l0Var2 = l0Var;
                } else {
                    l0Var = l0Var2;
                }
                nVar2.a(l0Var);
            }
        }
        int i11 = eVar4.f36399c;
        if (i11 == i4) {
            i1.m mVar4 = y0Var2.f25559f;
            com.google.android.gms.internal.consent_sdk.a0 a0Var4 = a0Var3;
            int i12 = 0;
            while (mVar4 != null && i12 < i4) {
                if (eVar3 == null) {
                    throw d.h.o("expected prior modifier list to be non-empty");
                }
                i1.l lVar = (i1.l) eVar3.f36397a[i12];
                i1.l lVar2 = (i1.l) eVar4.f36397a[i12];
                if (nk.k.a(lVar, lVar2)) {
                    a0Var2 = a0Var4;
                    z12 = 2;
                } else {
                    a0Var2 = a0Var4;
                    z12 = lVar.getClass() == lVar2.getClass();
                }
                if (!z12) {
                    mVar4 = mVar4.f25558e;
                    break;
                }
                if (z12) {
                    com.google.android.gms.internal.consent_sdk.a0.j(lVar, lVar2, mVar4);
                }
                mVar4 = mVar4.f25559f;
                i12++;
                a0Var4 = a0Var2;
            }
            a0Var2 = a0Var4;
            if (i12 >= i4) {
                a0Var3 = a0Var2;
                z10 = false;
                a0Var = a0Var3;
                eVar = eVar3;
                y0Var = y0Var2;
                eVar2 = eVar4;
                z3 = false;
                r72 = z10;
            } else {
                if (eVar3 == null) {
                    throw d.h.o("expected prior modifier list to be non-empty");
                }
                if (mVar4 == null) {
                    throw d.h.o("structuralUpdate requires a non-null tail");
                }
                boolean z13 = e0Var.M != null;
                eVar = eVar3;
                eVar2 = eVar4;
                z11 = false;
                i1.m mVar5 = mVar4;
                a0Var = a0Var2;
                a0Var.h(i12, eVar, eVar2, mVar5, !z13);
                y0Var = y0Var2;
                z3 = true;
                r72 = z11;
            }
        } else {
            r72 = 0;
            z11 = false;
            z10 = false;
            i1.n nVar3 = e0Var.M;
            if (nVar3 != null && i4 == 0) {
                i1.m mVarD = y0Var2;
                for (int i13 = 0; i13 < eVar4.f36399c; i13++) {
                    mVarD = com.google.android.gms.internal.consent_sdk.a0.d((i1.l) eVar4.f36397a[i13], mVarD);
                }
                int i14 = 0;
                for (i1.m mVar6 = mVar.f25558e; mVar6 != null && mVar6 != y0Var2; mVar6 = mVar6.f25558e) {
                    i14 |= mVar6.f25556c;
                    mVar6.f25557d = i14;
                }
                a0Var = a0Var3;
                eVar = eVar3;
                y0Var = y0Var2;
                eVar2 = eVar4;
                z3 = true;
                r72 = z11;
            } else if (i11 != 0) {
                if (eVar3 == null) {
                    eVar3 = new w0.e(new i1.l[16]);
                }
                eVar = eVar3;
                a0Var = a0Var3;
                y0Var = y0Var2;
                eVar2 = eVar4;
                a0Var.h(0, eVar, eVar2, y0Var, !(nVar3 != null));
                z3 = true;
            } else {
                if (eVar3 == null) {
                    throw d.h.o("expected prior modifier list to be non-empty");
                }
                i1.m mVar7 = y0Var2.f25559f;
                for (int i15 = 0; mVar7 != null && i15 < eVar3.f36399c; i15++) {
                    mVar7 = com.google.android.gms.internal.consent_sdk.a0.e(mVar7).f25559f;
                }
                e0 e0VarV = e0Var.v();
                qVar.f25612q = e0VarV != null ? (q) e0VarV.G.f19257d : null;
                a0Var3.f19258e = qVar;
                a0Var = a0Var3;
                eVar = eVar3;
                y0Var = y0Var2;
                eVar2 = eVar4;
                z3 = false;
                r72 = z10;
            }
        }
        a0Var.f19260h = eVar2;
        if (eVar != null) {
            eVar.h();
        } else {
            eVar = r72;
        }
        a0Var.f19261i = eVar;
        i1.m mVar8 = y0Var.f25559f;
        if (mVar8 != null) {
            mVar = mVar8;
        }
        mVar.f25558e = r72;
        y0Var.f25559f = r72;
        y0Var.f25557d = -1;
        y0Var.f25560h = r72;
        if (mVar == y0Var) {
            f2.a.b("trimChain did not update the head");
        }
        a0Var.g = mVar;
        if (z3) {
            a0Var.i();
        }
        boolean zF3 = a0Var.f(16);
        boolean zF4 = a0Var.f(Segment.SHARE_MINIMUM);
        this.H.j();
        if (this.f25634i == null && a0Var.f(512)) {
            b0(this);
        }
        if (zF == zF3 && zF2 == zF4) {
            return;
        }
        q2.b rectManager = ((j2.r) h0.a(this)).getRectManager();
        rectManager.getClass();
        if (H()) {
            com.google.android.gms.common.api.internal.a0 a0Var5 = rectManager.f32147a;
            int i16 = this.f25628b & 33554431;
            long[] jArr = (long[]) a0Var5.f9070c;
            int i17 = a0Var5.f9069b;
            for (int i18 = 0; i18 < jArr.length - 2 && i18 < i17; i18 += 3) {
                int i19 = i18 + 2;
                long j = jArr[i19];
                if ((((int) j) & 33554431) == i16) {
                    jArr[i19] = ((zF3 ? 1L : 0L) * 4611686018427387904L) | ((-6917529027641081857L) & j) | ((zF4 ? 1L : 0L) * 2305843009213693952L);
                    return;
                }
            }
        }
    }

    public final void c0(g2.j0 j0Var) {
        if (nk.k.a(this.f25648x, j0Var)) {
            return;
        }
        this.f25648x = j0Var;
        y4.a aVar = this.f25649y;
        if (aVar != null) {
            ((u0.d1) aVar.f37324b).setValue(j0Var);
        }
        E();
    }

    public final void d(m1 m1Var) {
        e0 e0Var;
        j1.c cVar;
        p2.l lVarX;
        if (this.f25639o != null) {
            f2.a.b("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        e0 e0Var2 = this.f25638n;
        if (e0Var2 != null && !nk.k.a(e0Var2.f25639o, m1Var)) {
            StringBuilder sb2 = new StringBuilder("Attaching to a different owner(");
            sb2.append(m1Var);
            sb2.append(") than the parent's owner(");
            e0 e0VarV = v();
            sb2.append(e0VarV != null ? e0VarV.f25639o : null);
            sb2.append("). This tree: ");
            sb2.append(g(0));
            sb2.append(" Parent tree: ");
            e0 e0Var3 = this.f25638n;
            sb2.append(e0Var3 != null ? e0Var3.g(0) : null);
            f2.a.b(sb2.toString());
        }
        e0 e0VarV2 = v();
        i0 i0Var = this.H;
        if (e0VarV2 == null) {
            i0Var.f25687p.f25797s = true;
            ((j2.r) m1Var).getRectManager().e(this, false);
            q0 q0Var = i0Var.f25688q;
            if (q0Var != null) {
                q0Var.f25750q = o0.f25728a;
            }
        }
        com.google.android.gms.internal.consent_sdk.a0 a0Var = this.G;
        ((d1) a0Var.f19258e).f25612q = e0VarV2 != null ? (q) e0VarV2.G.f19257d : null;
        this.f25639o = m1Var;
        this.f25641q = (e0VarV2 != null ? e0VarV2.f25641q : -1) + 1;
        i1.n nVar = this.M;
        if (nVar != null) {
            c(nVar);
        }
        this.M = null;
        j2.r rVar = (j2.r) m1Var;
        rVar.getLayoutNodes().h(this.f25628b, this);
        e0 e0Var4 = this.f25638n;
        if (e0Var4 == null || (e0Var = e0Var4.f25634i) == null) {
            e0Var = this.f25634i;
        }
        b0(e0Var);
        if (this.f25634i == null && a0Var.f(512)) {
            b0(this);
        }
        if (!this.R) {
            for (i1.m mVar = (i1.m) a0Var.g; mVar != null; mVar = mVar.f25559f) {
                mVar.d0();
            }
        }
        w0.e eVar = (w0.e) this.f25635k.f37516b;
        Object[] objArr = eVar.f36397a;
        int i4 = eVar.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            ((e0) objArr[i10]).d(m1Var);
        }
        if (!this.R) {
            a0Var.g();
        }
        E();
        if (e0VarV2 != null) {
            e0VarV2.E();
        }
        g3.d dVar = this.N;
        if (dVar != null) {
            dVar.invoke(m1Var);
        }
        i0Var.j();
        if (!this.R && a0Var.f(8)) {
            F();
        }
        rVar.getClass();
        if (!j2.r.i() || (cVar = rVar.L) == null || (lVarX = x()) == null || !lVarX.f31095a.b(p2.t.f31128q)) {
            return;
        }
        cVar.g.a(this.f25628b);
        cVar.f27041a.j(cVar.f27043c, this.f25628b, true);
    }

    public final void d0(i1.n nVar) {
        if (this.f25627a && this.L != i1.k.f25553a) {
            f2.a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.R) {
            f2.a.a("modifier is updated when deactivated");
        }
        if (!H()) {
            this.M = nVar;
            return;
        }
        c(nVar);
        if (this.f25643s) {
            F();
        }
    }

    public final void e() {
        this.E = this.D;
        this.D = c0.f25589c;
        w0.e eVarZ = z();
        Object[] objArr = eVarZ.f36397a;
        int i4 = eVarZ.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            e0 e0Var = (e0) objArr[i10];
            if (e0Var.D != c0.f25589c) {
                e0Var.e();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void e0(j2.y1 y1Var) {
        if (nk.k.a(this.B, y1Var)) {
            return;
        }
        this.B = y1Var;
        i1.m mVar = (i1.m) this.G.g;
        if ((mVar.f25557d & 16) != 0) {
            while (mVar != null) {
                if ((mVar.f25556c & 16) != 0) {
                    j jVarE = mVar;
                    ?? eVar = 0;
                    while (jVarE != 0) {
                        if (jVarE instanceof r1) {
                            ((r1) jVarE).V();
                        } else if ((jVarE.f25556c & 16) != 0 && (jVarE instanceof j)) {
                            i1.m mVar2 = jVarE.f25691p;
                            int i4 = 0;
                            jVarE = jVarE;
                            eVar = eVar;
                            while (mVar2 != null) {
                                if ((mVar2.f25556c & 16) != 0) {
                                    i4++;
                                    eVar = eVar;
                                    if (i4 == 1) {
                                        jVarE = mVar2;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new w0.e(new i1.m[16]);
                                        }
                                        if (jVarE != 0) {
                                            eVar.b(jVarE);
                                            jVarE = 0;
                                        }
                                        eVar.b(mVar2);
                                    }
                                }
                                mVar2 = mVar2.f25559f;
                                jVarE = jVarE;
                                eVar = eVar;
                            }
                            if (i4 == 1) {
                            }
                        }
                        jVarE = k.e(eVar);
                    }
                }
                if ((mVar.f25557d & 16) == 0) {
                    return;
                } else {
                    mVar = mVar.f25559f;
                }
            }
        }
    }

    public final void f() {
        this.E = this.D;
        this.D = c0.f25589c;
        w0.e eVarZ = z();
        Object[] objArr = eVarZ.f36397a;
        int i4 = eVarZ.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            e0 e0Var = (e0) objArr[i10];
            if (e0Var.D == c0.f25588b) {
                e0Var.f();
            }
        }
    }

    public final void f0() {
        if (this.j <= 0 || !this.f25637m) {
            return;
        }
        this.f25637m = false;
        w0.e eVar = this.f25636l;
        if (eVar == null) {
            eVar = new w0.e(new e0[16]);
            this.f25636l = eVar;
        }
        eVar.h();
        w0.e eVar2 = (w0.e) this.f25635k.f37516b;
        Object[] objArr = eVar2.f36397a;
        int i4 = eVar2.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            e0 e0Var = (e0) objArr[i10];
            if (e0Var.f25627a) {
                eVar.d(eVar.f36399c, e0Var.z());
            } else {
                eVar.b(e0Var);
            }
        }
        i0 i0Var = this.H;
        i0Var.f25687p.f25804z = true;
        q0 q0Var = i0Var.f25688q;
        if (q0Var != null) {
            q0Var.f25753t = true;
        }
    }

    public final String g(int i4) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < i4; i10++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        w0.e eVarZ = z();
        Object[] objArr = eVarZ.f36397a;
        int i11 = eVarZ.f36399c;
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append(((e0) objArr[i12]).g(i4 + 1));
        }
        String string = sb2.toString();
        if (i4 != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        nk.k.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final void h() {
        j1.c cVar;
        f0 f0Var;
        m1 m1Var = this.f25639o;
        if (m1Var == null) {
            StringBuilder sb2 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            e0 e0VarV = v();
            sb2.append(e0VarV != null ? e0VarV.g(0) : null);
            f2.a.c(sb2.toString());
            throw new ac.m();
        }
        e0 e0VarV2 = v();
        i0 i0Var = this.H;
        if (e0VarV2 != null) {
            e0VarV2.C();
            e0VarV2.E();
            u0 u0Var = i0Var.f25687p;
            c0 c0Var = c0.f25589c;
            u0Var.f25790l = c0Var;
            q0 q0Var = i0Var.f25688q;
            if (q0Var != null) {
                q0Var.j = c0Var;
            }
        }
        f0 f0Var2 = i0Var.f25687p.f25802x;
        f0Var2.f25659b = true;
        f0Var2.f25660c = false;
        f0Var2.f25661d = false;
        f0Var2.f25662e = false;
        f0Var2.f25663f = null;
        q0 q0Var2 = i0Var.f25688q;
        if (q0Var2 != null && (f0Var = q0Var2.f25751r) != null) {
            f0Var.f25659b = true;
            f0Var.f25660c = false;
            f0Var.f25661d = false;
            f0Var.f25662e = false;
            f0Var.f25663f = null;
        }
        com.google.android.gms.internal.consent_sdk.a0 a0Var = this.G;
        i1.m mVar = (w1) a0Var.f19259f;
        d1 d1Var = ((q) a0Var.f19257d).f25611p;
        for (d1 d1Var2 = (d1) a0Var.f19258e; !nk.k.a(d1Var2, d1Var) && d1Var2 != null; d1Var2 = d1Var2.f25611p) {
            d1Var2.R0();
            if (d1Var2.f25610o.I()) {
                d1Var2.M0();
            }
        }
        c2.a0 a0Var2 = this.O;
        if (a0Var2 != null) {
            a0Var2.invoke(m1Var);
        }
        for (i1.m mVar2 = mVar; mVar2 != null; mVar2 = mVar2.f25558e) {
            if (mVar2.f25565n) {
                mVar2.m0();
            }
        }
        this.f25642r = true;
        w0.e eVar = (w0.e) this.f25635k.f37516b;
        Object[] objArr = eVar.f36397a;
        int i4 = eVar.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            ((e0) objArr[i10]).h();
        }
        this.f25642r = false;
        while (mVar != null) {
            if (mVar.f25565n) {
                mVar.e0();
            }
            mVar = mVar.f25558e;
        }
        j2.r rVar = (j2.r) m1Var;
        rVar.getLayoutNodes().g(this.f25628b);
        s0 s0Var = rVar.U;
        i0.f fVar = s0Var.f25777b;
        ((o7.c) fVar.f25416b).x(this);
        ((o7.c) fVar.f25417c).x(this);
        ((o7.c) fVar.f25418d).x(this);
        ((w0.e) s0Var.f25780e.f37323a).k(this);
        rVar.M = true;
        if (j2.r.i() && (cVar = rVar.L) != null && cVar.g.e(this.f25628b)) {
            cVar.f27041a.j(cVar.f27043c, this.f25628b, false);
        }
        rVar.getRectManager().g(this);
        this.f25639o = null;
        b0(null);
        this.f25641q = 0;
        u0 u0Var2 = i0Var.f25687p;
        u0Var2.f25788i = Integer.MAX_VALUE;
        u0Var2.f25787h = Integer.MAX_VALUE;
        u0Var2.f25797s = false;
        q0 q0Var3 = i0Var.f25688q;
        if (q0Var3 != null) {
            q0Var3.f25743i = Integer.MAX_VALUE;
            q0Var3.f25742h = Integer.MAX_VALUE;
            q0Var3.f25750q = o0.f25730c;
        }
        if (a0Var.f(8)) {
            p2.l lVar = this.f25644t;
            this.f25644t = null;
            this.f25643s = false;
            rVar.getSemanticsOwner().b(this, lVar);
            rVar.E();
        }
    }

    @Override // i2.n1
    public final boolean i() {
        return H();
    }

    public final void j(p1.q qVar, s1.b bVar) {
        try {
            ((d1) this.G.f19258e).s0(qVar, bVar);
        } catch (Throwable th2) {
            Y(th2);
            throw null;
        }
    }

    public final void l() {
        if (this.f25634i != null) {
            T(this, false, 5);
        } else {
            V(this, false, 5);
        }
        u0 u0Var = this.H.f25687p;
        d3.a aVar = u0Var.j ? new d3.a(u0Var.f24411d) : null;
        if (aVar != null) {
            m1 m1Var = this.f25639o;
            if (m1Var != null) {
                ((j2.r) m1Var).x(this, aVar.f21951a);
                return;
            }
            return;
        }
        m1 m1Var2 = this.f25639o;
        if (m1Var2 != null) {
            ((j2.r) m1Var2).w(true);
        }
    }

    public final List m() {
        q0 q0Var = this.H.f25688q;
        nk.k.b(q0Var);
        w0.e eVar = q0Var.f25752s;
        i0 i0Var = q0Var.f25741f;
        i0Var.f25674a.o();
        if (!q0Var.f25753t) {
            return eVar.g();
        }
        e0 e0Var = i0Var.f25674a;
        w0.e eVarZ = e0Var.z();
        Object[] objArr = eVarZ.f36397a;
        int i4 = eVarZ.f36399c;
        for (int i10 = 0; i10 < i4; i10++) {
            e0 e0Var2 = (e0) objArr[i10];
            if (eVar.f36399c <= i10) {
                q0 q0Var2 = e0Var2.H.f25688q;
                nk.k.b(q0Var2);
                eVar.b(q0Var2);
            } else {
                q0 q0Var3 = e0Var2.H.f25688q;
                nk.k.b(q0Var3);
                Object[] objArr2 = eVar.f36397a;
                Object obj = objArr2[i10];
                objArr2[i10] = q0Var3;
            }
        }
        eVar.m(((w0.b) e0Var.o()).f36391a.f36399c, eVar.f36399c);
        q0Var.f25753t = false;
        return eVar.g();
    }

    public final List n() {
        return this.H.f25687p.Y();
    }

    public final List o() {
        return z().g();
    }

    public final List p() {
        return ((w0.e) this.f25635k.f37516b).g();
    }

    public final boolean q() {
        return this.H.f25687p.f25800v;
    }

    public final boolean r() {
        return this.H.f25687p.f25799u;
    }

    public final c0 s() {
        return this.H.f25687p.f25790l;
    }

    public final c0 t() {
        c0 c0Var;
        q0 q0Var = this.H.f25688q;
        return (q0Var == null || (c0Var = q0Var.j) == null) ? c0.f25589c : c0Var;
    }

    public final String toString() {
        return j2.d0.r(this) + " children: " + ((w0.b) o()).f36391a.f36399c + " measurePolicy: " + this.f25648x + " deactivated: " + this.R;
    }

    public final y4.a u() {
        y4.a aVar = this.f25649y;
        if (aVar != null) {
            return aVar;
        }
        g2.j0 j0Var = this.f25648x;
        y4.a aVar2 = new y4.a();
        aVar2.f37323a = this;
        aVar2.f37324b = u0.q.r(j0Var);
        this.f25649y = aVar2;
        return aVar2;
    }

    public final e0 v() {
        e0 e0Var = this.f25638n;
        while (e0Var != null && e0Var.f25627a) {
            e0Var = e0Var.f25638n;
        }
        return e0Var;
    }

    public final int w() {
        return this.H.f25687p.f25788i;
    }

    public final p2.l x() {
        if (H() && !this.R && this.G.f(8)) {
            return this.f25644t;
        }
        return null;
    }

    public final w0.e y() {
        boolean z3 = this.f25647w;
        w0.e eVar = this.f25646v;
        if (z3) {
            eVar.h();
            eVar.d(eVar.f36399c, z());
            zj.m.d0(eVar.f36397a, U, 0, eVar.f36399c);
            this.f25647w = false;
        }
        return eVar;
    }

    public final w0.e z() {
        f0();
        if (this.j == 0) {
            return (w0.e) this.f25635k.f37516b;
        }
        w0.e eVar = this.f25636l;
        nk.k.b(eVar);
        return eVar;
    }

    public e0(int i4, boolean z3) {
        this.f25627a = z3;
        this.f25628b = i4;
        this.f25630d = 9223372034707292159L;
        this.f25631e = 0L;
        this.f25632f = 9223372034707292159L;
        this.g = true;
        this.f25635k = new yb.i(new w0.e(new e0[16]), false, new b2.b(13, this), 23);
        this.f25646v = new w0.e(new e0[16]);
        this.f25647w = true;
        this.f25648x = S;
        this.f25650z = h0.f25673a;
        this.A = d3.l.f21966a;
        this.B = T;
        u0.y.f35023a9.getClass();
        this.C = u0.x.f35017b;
        c0 c0Var = c0.f25589c;
        this.D = c0Var;
        this.E = c0Var;
        this.G = new com.google.android.gms.internal.consent_sdk.a0(this);
        this.H = new i0(this);
        this.K = true;
        this.L = i1.k.f25553a;
    }
}
