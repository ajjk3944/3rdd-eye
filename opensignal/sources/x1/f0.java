package x1;

import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import com.google.android.gms.internal.measurement.e5;
import java.util.List;
import n0.h2;

/* loaded from: classes.dex */
public final class f0 implements n0.h, m1, g {
    public static final a0 L = new a0();
    public static final z M = new z();
    public static final oh.f N = new oh.f(9);
    public d0 A;
    public d0 B;
    public boolean C;
    public final al.c D;
    public f1 E;
    public boolean F;
    public z0.m G;
    public z0.m H;
    public boolean I;
    public int J;
    public boolean K;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24798b;

    /* renamed from: c, reason: collision with root package name */
    public int f24799c;

    /* renamed from: d, reason: collision with root package name */
    public long f24800d;

    /* renamed from: e, reason: collision with root package name */
    public long f24801e;

    /* renamed from: f, reason: collision with root package name */
    public long f24802f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24803g;

    /* renamed from: h, reason: collision with root package name */
    public f0 f24804h;

    /* renamed from: i, reason: collision with root package name */
    public int f24805i;
    public final q3.a j;
    public p0.e k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f24806l;
    private final i0 layoutDelegate;

    /* renamed from: m, reason: collision with root package name */
    public f0 f24807m;

    /* renamed from: n, reason: collision with root package name */
    public Owner f24808n;

    /* renamed from: o, reason: collision with root package name */
    public int f24809o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f24810p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f24811q;

    /* renamed from: r, reason: collision with root package name */
    public SemanticsConfiguration f24812r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f24813s;

    /* renamed from: t, reason: collision with root package name */
    public final p0.e f24814t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f24815u;

    /* renamed from: v, reason: collision with root package name */
    public v1.r f24816v;

    /* renamed from: w, reason: collision with root package name */
    public t2.c f24817w;

    /* renamed from: x, reason: collision with root package name */
    public t2.i f24818x;

    /* renamed from: y, reason: collision with root package name */
    public y1.x1 f24819y;

    /* renamed from: z, reason: collision with root package name */
    public n0.z f24820z;

    public f0(int i10) {
        this(e2.h.f7710a.addAndGet(1), (i10 & 1) == 0);
    }

    public static boolean X(f0 f0Var) {
        s0 s0Var = f0Var.layoutDelegate.f24860q;
        return f0Var.W(s0Var != null ? s0Var.f24923n : null);
    }

    public static boolean i0(f0 f0Var) {
        y0 y0Var = f0Var.layoutDelegate.f24859p;
        return f0Var.h0(y0Var.k ? new t2.a(y0Var.f23812e) : null);
    }

    private final String l(f0 f0Var) {
        StringBuilder sb2 = new StringBuilder("Cannot insert ");
        sb2.append(f0Var);
        sb2.append(" because it already has a parent or an owner. This tree: ");
        sb2.append(g(0));
        sb2.append(" Other tree: ");
        f0 f0Var2 = f0Var.f24807m;
        sb2.append(f0Var2 != null ? f0Var2.g(0) : null);
        return sb2.toString();
    }

    public static void l0(f0 f0Var, boolean z10, int i10) {
        f0 f0VarC;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i10 & 4) != 0;
        if (f0Var.f24804h == null) {
            u1.a.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        Owner owner = f0Var.f24808n;
        if (owner == null || f0Var.f24810p || f0Var.f24798b) {
            return;
        }
        ((AndroidComposeView) owner).v(f0Var, true, z10);
        if (z11) {
            s0 s0Var = f0Var.layoutDelegate.f24860q;
            br.l.b(s0Var);
            i0 i0Var = s0Var.f24918g;
            f0 f0VarC2 = i0Var.f24846a.C();
            d0 d0Var = i0Var.f24846a.A;
            if (f0VarC2 == null || d0Var == d0.NotUsed) {
                return;
            }
            while (f0VarC2.A == d0Var && (f0VarC = f0VarC2.C()) != null) {
                f0VarC2 = f0VarC;
            }
            int i11 = p0.f24910b[d0Var.ordinal()];
            if (i11 == 1) {
                if (f0VarC2.f24804h != null) {
                    l0(f0VarC2, z10, 6);
                    return;
                } else {
                    n0(f0VarC2, z10, 6);
                    return;
                }
            }
            if (i11 != 2) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (f0VarC2.f24804h != null) {
                f0VarC2.k0(z10);
            } else {
                f0VarC2.m0(z10);
            }
        }
    }

    public static void n0(f0 f0Var, boolean z10, int i10) {
        Owner owner;
        f0 f0VarC;
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        boolean z11 = (i10 & 4) != 0;
        if (f0Var.f24810p || f0Var.f24798b || (owner = f0Var.f24808n) == null) {
            return;
        }
        ((AndroidComposeView) owner).v(f0Var, false, z10);
        if (z11) {
            i0 i0Var = f0Var.layoutDelegate.f24859p.f24960g;
            f0 f0VarC2 = i0Var.f24846a.C();
            d0 d0Var = i0Var.f24846a.A;
            if (f0VarC2 == null || d0Var == d0.NotUsed) {
                return;
            }
            while (f0VarC2.A == d0Var && (f0VarC = f0VarC2.C()) != null) {
                f0VarC2 = f0VarC;
            }
            int i11 = w0.f24954b[d0Var.ordinal()];
            if (i11 == 1) {
                n0(f0VarC2, z10, 6);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                f0VarC2.m0(z10);
            }
        }
    }

    public static void o0(f0 f0Var) {
        if (e0.f24789a[f0Var.layoutDelegate.f24849d.ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + f0Var.layoutDelegate.f24849d);
        }
        i0 i0Var = f0Var.layoutDelegate;
        if (i0Var.f24850e) {
            l0(f0Var, true, 6);
            return;
        }
        if (i0Var.f24851f) {
            f0Var.k0(true);
        }
        if (f0Var.y()) {
            n0(f0Var, true, 6);
        } else if (f0Var.s()) {
            f0Var.m0(true);
        }
    }

    public final d0 A() {
        d0 d0Var;
        s0 s0Var = this.layoutDelegate.f24860q;
        return (s0Var == null || (d0Var = s0Var.k) == null) ? d0.NotUsed : d0Var;
    }

    public final List B() {
        al.c cVar = this.D;
        p0.e eVar = (p0.e) cVar.f826h;
        if (eVar == null) {
            return mq.w.f16945a;
        }
        p0.e eVar2 = new p0.e(new v1.s[eVar.f20232g]);
        z0.l lVar = (z0.l) cVar.f825g;
        int i10 = 0;
        while (lVar != null) {
            v1 v1Var = (v1) cVar.f824f;
            if (lVar == v1Var) {
                break;
            }
            f1 f1Var = lVar.f26502i;
            if (f1Var == null) {
                throw new IllegalArgumentException("getModifierInfo called on node with no coordinator");
            }
            l1 l1Var = f1Var.I;
            l1 l1Var2 = ((r) cVar.f822d).I;
            z0.l lVar2 = lVar.f26500g;
            if (lVar2 != v1Var || f1Var == lVar2.f26502i) {
                l1Var2 = null;
            }
            if (l1Var == null) {
                l1Var = l1Var2;
            }
            eVar2.b(new v1.s((z0.m) eVar.f20230a[i10], f1Var, l1Var));
            lVar = lVar.f26500g;
            i10++;
        }
        return eVar2.f();
    }

    public final f0 C() {
        f0 f0Var = this.f24807m;
        while (f0Var != null && f0Var.f24798b) {
            f0Var = f0Var.f24807m;
        }
        return f0Var;
    }

    public final int D() {
        return this.layoutDelegate.f24859p.j;
    }

    public SemanticsConfiguration E() {
        if (S() && !this.K && this.D.i(8)) {
            return this.f24812r;
        }
        return null;
    }

    public final int F() {
        return this.layoutDelegate.f24859p.f23809b;
    }

    public final float G() {
        return this.layoutDelegate.f24859p.D;
    }

    public final p0.e H() {
        boolean z10 = this.f24815u;
        p0.e eVar = this.f24814t;
        if (z10) {
            eVar.g();
            eVar.d(eVar.f20232g, I());
            mq.l.z0(eVar.f20230a, N, 0, eVar.f20232g);
            this.f24815u = false;
        }
        return eVar;
    }

    public final p0.e I() {
        w0();
        if (this.f24805i == 0) {
            return (p0.e) this.j.f20679d;
        }
        p0.e eVar = this.k;
        br.l.b(eVar);
        return eVar;
    }

    public final void J(long j, p pVar, int i10, boolean z10) {
        al.c cVar = this.D;
        f1 f1Var = (f1) cVar.f823e;
        g1.g0 g0Var = f1.J;
        ((f1) cVar.f823e).A0(f1.L, f1Var.s0(j), pVar, i10, z10);
    }

    public final void K(int i10, f0 f0Var) {
        if (f0Var.f24807m != null && f0Var.f24808n != null) {
            u1.a.b(l(f0Var));
        }
        f0Var.f24807m = this;
        q3.a aVar = this.j;
        ((p0.e) aVar.f20679d).a(i10, f0Var);
        ((pp.c) aVar.f20680g).c();
        f0();
        if (f0Var.f24798b) {
            this.f24805i++;
        }
        R();
        Owner owner = this.f24808n;
        if (owner != null) {
            f0Var.d(owner);
        }
        if (f0Var.layoutDelegate.f24855l > 0) {
            i0 i0Var = this.layoutDelegate;
            i0Var.d(i0Var.f24855l + 1);
        }
        if (f0Var.J > 0) {
            s0(this.J + 1);
        }
    }

    public final void L() {
        if (this.F) {
            al.c cVar = this.D;
            f1 f1Var = (r) cVar.f822d;
            f1 f1Var2 = ((f1) cVar.f823e).f24823q;
            this.E = null;
            while (true) {
                if (br.l.a(f1Var, f1Var2)) {
                    break;
                }
                if ((f1Var != null ? f1Var.I : null) != null) {
                    this.E = f1Var;
                    break;
                }
                f1Var = f1Var != null ? f1Var.f24823q : null;
            }
        }
        f1 f1Var3 = this.E;
        if (f1Var3 != null && f1Var3.I == null) {
            throw c7.a.h("layer was not set");
        }
        if (f1Var3 != null) {
            f1Var3.C0();
            return;
        }
        f0 f0VarC = C();
        if (f0VarC != null) {
            f0VarC.L();
        }
    }

    public final void M() {
        al.c cVar = this.D;
        f1 f1Var = (f1) cVar.f823e;
        r rVar = (r) cVar.f822d;
        while (f1Var != rVar) {
            br.l.c(f1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            x xVar = (x) f1Var;
            l1 l1Var = xVar.I;
            if (l1Var != null) {
                l1Var.invalidate();
            }
            f1Var = xVar.f24822p;
        }
        l1 l1Var2 = ((r) cVar.f822d).I;
        if (l1Var2 != null) {
            l1Var2.invalidate();
        }
    }

    public final void N() {
        if (this.f24798b) {
            f0 f0VarC = C();
            if (f0VarC != null) {
                f0VarC.N();
                return;
            }
            return;
        }
        if (this.f24804h != null) {
            l0(this, false, 7);
        } else {
            n0(this, false, 7);
        }
    }

    public final void O() {
        if (i3.g.l(this.f24800d, 9223372034707292159L)) {
            return;
        }
        this.f24800d = 9223372034707292159L;
        p0.e eVarI = I();
        Object[] objArr = eVarI.f20230a;
        int i10 = eVarI.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            ((f0) objArr[i11]).O();
        }
    }

    public final void P() {
        i0 i0Var = this.layoutDelegate;
        i0Var.f24859p.f24967p = true;
        s0 s0Var = i0Var.f24860q;
        if (s0Var != null) {
            s0Var.f24931v = true;
        }
    }

    public final void Q() {
        if (this.f24813s) {
            return;
        }
        if (((c1) this.D.f821c).f26500g != null || this.H != null) {
            this.f24811q = true;
            return;
        }
        SemanticsConfiguration semanticsConfiguration = this.f24812r;
        this.f24813s = true;
        br.w wVar = new br.w();
        wVar.f2917a = new SemanticsConfiguration();
        n1 snapshotObserver = k.t(this).getSnapshotObserver();
        snapshotObserver.a(this, snapshotObserver.f24898d, new qr.g(this, 6, wVar));
        this.f24813s = false;
        this.f24812r = (SemanticsConfiguration) wVar.f2917a;
        this.f24811q = false;
        Owner ownerT = k.t(this);
        ownerT.getSemanticsOwner().b(this, semanticsConfiguration);
        ((AndroidComposeView) ownerT).x();
    }

    public final void R() {
        f0 f0Var;
        if (this.f24805i > 0) {
            this.f24806l = true;
        }
        if (!this.f24798b || (f0Var = this.f24807m) == null) {
            return;
        }
        f0Var.R();
    }

    public final boolean S() {
        return this.f24808n != null;
    }

    public final boolean T() {
        return this.layoutDelegate.f24859p.f24969r;
    }

    public final boolean U() {
        return this.layoutDelegate.f24859p.f24970s;
    }

    public final Boolean V() {
        s0 s0Var = this.layoutDelegate.f24860q;
        if (s0Var != null) {
            return Boolean.valueOf(s0Var.x());
        }
        return null;
    }

    public final boolean W(t2.a aVar) {
        if (aVar == null || this.f24804h == null) {
            return false;
        }
        s0 s0Var = this.layoutDelegate.f24860q;
        br.l.b(s0Var);
        return s0Var.W(aVar.f22381a);
    }

    public final void Y() {
        f0 f0VarC;
        if (this.A == d0.NotUsed) {
            f();
        }
        s0 s0Var = this.layoutDelegate.f24860q;
        br.l.b(s0Var);
        try {
            s0Var.f24919h = true;
            if (!s0Var.f24921l) {
                u1.a.b("replace() called on item that was not placed");
            }
            s0Var.f24933x = false;
            boolean zX = s0Var.x();
            s0Var.V(s0Var.f24924o, s0Var.f24925p);
            if (zX && !s0Var.f24933x && (f0VarC = s0Var.f24918g.f24846a.C()) != null) {
                f0VarC.k0(false);
            }
            s0Var.f24919h = false;
        } catch (Throwable th2) {
            s0Var.f24919h = false;
            throw th2;
        }
    }

    public final void Z() {
        y0 y0Var = this.layoutDelegate.f24859p;
        y0Var.f24972u = true;
        y0Var.f24973v = true;
    }

    @Override // n0.h
    public final void a() {
        al.c cVar = this.D;
        f1 f1Var = ((r) cVar.f822d).f24822p;
        for (f1 f1Var2 = (f1) cVar.f823e; !br.l.a(f1Var2, f1Var) && f1Var2 != null; f1Var2 = f1Var2.f24822p) {
            f1Var2.J0();
        }
    }

    public final void a0() {
        i0 i0Var = this.layoutDelegate;
        i0Var.f24851f = true;
        i0Var.f24852g = true;
    }

    @Override // n0.h
    public final void b() {
        a1.c cVar;
        this.K = true;
        z0.l lVar = (v1) this.D.f824f;
        for (z0.l lVar2 = lVar; lVar2 != null; lVar2 = lVar2.f26499f) {
            if (lVar2.f26506o) {
                lVar2.X();
            }
        }
        for (z0.l lVar3 = lVar; lVar3 != null; lVar3 = lVar3.f26499f) {
            if (lVar3.f26506o) {
                lVar3.Z();
            }
        }
        while (lVar != null) {
            if (lVar.f26506o) {
                lVar.T();
            }
            lVar = lVar.f26499f;
        }
        if (S()) {
            this.f24812r = null;
            this.f24811q = false;
        }
        Owner owner = this.f24808n;
        if (owner != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) owner;
            androidComposeView.getRectManager().j(this);
            if (AndroidComposeView.d() && (cVar = androidComposeView._autofillManager) != null && cVar.f17g.e(this.f24799c)) {
                cVar.f11a.p(cVar.f13c, this.f24799c, false);
            }
        }
    }

    public final void b0() {
        this.layoutDelegate.f24850e = true;
    }

    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v3, types: [x1.f1, z0.l] */
    public final void c(z0.m mVar) {
        ?? r72;
        p0.e eVar;
        al.c cVar;
        c1 c1Var;
        p0.e eVar2;
        boolean z10;
        boolean z11;
        boolean z12;
        al.c cVar2;
        boolean z13;
        j1.a aVar;
        al.c cVar3 = this.D;
        boolean zI = cVar3.i(16);
        z0.l lVar = (v1) cVar3.f824f;
        boolean zI2 = cVar3.i(1024);
        this.G = mVar;
        r rVar = (r) cVar3.f822d;
        f0 f0Var = (f0) cVar3.f820b;
        z0.l lVar2 = (z0.l) cVar3.f825g;
        c1 c1Var2 = (c1) cVar3.f821c;
        if (lVar2 == c1Var2) {
            u1.a.b("padChain called on already padded chain");
        }
        z0.l lVar3 = (z0.l) cVar3.f825g;
        lVar3.f26499f = c1Var2;
        c1Var2.f26500g = lVar3;
        p0.e eVar3 = (p0.e) cVar3.f826h;
        int i10 = eVar3 != null ? eVar3.f20232g : 0;
        p0.e eVar4 = (p0.e) cVar3.f827i;
        if (eVar4 == null) {
            eVar4 = new p0.e(new z0.k[16]);
        }
        p0.e eVar5 = (p0.e) cVar3.j;
        eVar5.b(mVar);
        j1.a aVar2 = null;
        while (true) {
            int i11 = eVar5.f20232g;
            if (i11 == 0) {
                break;
            }
            z0.m mVar2 = (z0.m) eVar5.k(i11 - 1);
            if (mVar2 instanceof z0.g) {
                z0.g gVar = (z0.g) mVar2;
                eVar5.b(gVar.f26492b);
                eVar5.b(gVar.f26491a);
            } else if (mVar2 instanceof z0.k) {
                eVar4.b(mVar2);
            } else {
                if (aVar2 == null) {
                    aVar = new j1.a(19, eVar4);
                    aVar2 = aVar;
                } else {
                    aVar = aVar2;
                }
                mVar2.b(aVar);
            }
        }
        int i12 = eVar4.f20232g;
        if (i12 == i10) {
            z0.l lVar4 = c1Var2.f26500g;
            al.c cVar4 = cVar3;
            int i13 = 0;
            while (lVar4 != null && i13 < i10) {
                if (eVar3 == null) {
                    throw c7.a.h("expected prior modifier list to be non-empty");
                }
                z0.k kVar = (z0.k) eVar3.f20230a[i13];
                z0.k kVar2 = (z0.k) eVar4.f20230a[i13];
                if (br.l.a(kVar, kVar2)) {
                    cVar2 = cVar4;
                    z13 = 2;
                } else {
                    cVar2 = cVar4;
                    z13 = kVar.getClass() == kVar2.getClass();
                }
                if (!z13) {
                    lVar4 = lVar4.f26499f;
                    break;
                }
                if (z13) {
                    al.c.s(kVar, kVar2, lVar4);
                }
                lVar4 = lVar4.f26500g;
                i13++;
                cVar4 = cVar2;
            }
            cVar2 = cVar4;
            if (i13 >= i10) {
                cVar3 = cVar2;
                z11 = false;
                cVar = cVar3;
                eVar = eVar3;
                c1Var = c1Var2;
                eVar2 = eVar4;
                z10 = false;
                r72 = z11;
            } else {
                if (eVar3 == null) {
                    throw c7.a.h("expected prior modifier list to be non-empty");
                }
                if (lVar4 == null) {
                    throw c7.a.h("structuralUpdate requires a non-null tail");
                }
                boolean z14 = f0Var.H != null;
                eVar = eVar3;
                eVar2 = eVar4;
                z12 = false;
                z0.l lVar5 = lVar4;
                cVar = cVar2;
                cVar.q(i13, eVar, eVar2, lVar5, !z14);
                c1Var = c1Var2;
                z10 = true;
                r72 = z12;
            }
        } else {
            r72 = 0;
            z12 = false;
            z11 = false;
            z0.m mVar3 = f0Var.H;
            if (mVar3 != null && i10 == 0) {
                z0.l lVarF = c1Var2;
                for (int i14 = 0; i14 < eVar4.f20232g; i14++) {
                    lVarF = al.c.f((z0.k) eVar4.f20230a[i14], lVarF);
                }
                int i15 = 0;
                for (z0.l lVar6 = lVar.f26499f; lVar6 != null && lVar6 != c1Var2; lVar6 = lVar6.f26499f) {
                    i15 |= lVar6.f26497d;
                    lVar6.f26498e = i15;
                }
                cVar = cVar3;
                eVar = eVar3;
                c1Var = c1Var2;
                eVar2 = eVar4;
                z10 = true;
                r72 = z12;
            } else if (i12 != 0) {
                if (eVar3 == null) {
                    eVar3 = new p0.e(new z0.k[16]);
                }
                eVar = eVar3;
                cVar = cVar3;
                c1Var = c1Var2;
                eVar2 = eVar4;
                cVar.q(0, eVar, eVar2, c1Var, !(mVar3 != null));
                z10 = true;
            } else {
                if (eVar3 == null) {
                    throw c7.a.h("expected prior modifier list to be non-empty");
                }
                z0.l lVar7 = c1Var2.f26500g;
                for (int i16 = 0; lVar7 != null && i16 < eVar3.f20232g; i16++) {
                    lVar7 = al.c.g(lVar7).f26500g;
                }
                f0 f0VarC = f0Var.C();
                rVar.f24823q = f0VarC != null ? (r) f0VarC.D.f822d : null;
                cVar3.f823e = rVar;
                cVar = cVar3;
                eVar = eVar3;
                c1Var = c1Var2;
                eVar2 = eVar4;
                z10 = false;
                r72 = z11;
            }
        }
        cVar.f826h = eVar2;
        if (eVar != null) {
            eVar.g();
        } else {
            eVar = r72;
        }
        cVar.f827i = eVar;
        z0.l lVar8 = c1Var.f26500g;
        if (lVar8 != null) {
            lVar = lVar8;
        }
        lVar.f26499f = r72;
        c1Var.f26500g = r72;
        c1Var.f26498e = -1;
        c1Var.f26502i = r72;
        if (lVar == c1Var) {
            u1.a.b("trimChain did not update the head");
        }
        cVar.f825g = lVar;
        if (z10) {
            cVar.r();
        }
        boolean zI3 = cVar.i(16);
        boolean zI4 = cVar.i(1024);
        this.layoutDelegate.j();
        if (this.f24804h == null && cVar.i(512)) {
            t0(this);
        }
        if (zI == zI3 && zI2 == zI4) {
            return;
        }
        f2.a rectManager = k.t(this).getRectManager();
        rectManager.getClass();
        if (S()) {
            bc.f0 f0Var2 = rectManager.f8417a;
            int i17 = this.f24799c & 67108863;
            long[] jArr = (long[]) f0Var2.f2603g;
            int i18 = f0Var2.f2602d;
            for (int i19 = 0; i19 < jArr.length - 2 && i19 < i18; i19 += 3) {
                int i20 = i19 + 2;
                long j = jArr[i20];
                if ((((int) j) & 67108863) == i17) {
                    jArr[i20] = ((zI3 ? 1L : 0L) * Long.MIN_VALUE) | (4611686018427387903L & j) | ((zI4 ? 1L : 0L) * 4611686018427387904L);
                    return;
                }
            }
        }
    }

    public final void c0() {
        this.layoutDelegate.f24859p.f24971t = true;
    }

    public final void d(Owner owner) {
        f0 f0Var;
        a1.c cVar;
        SemanticsConfiguration semanticsConfigurationE;
        if (this.f24808n != null) {
            u1.a.b("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        f0 f0Var2 = this.f24807m;
        if (f0Var2 != null && !br.l.a(f0Var2.f24808n, owner)) {
            StringBuilder sb2 = new StringBuilder("Attaching to a different owner(");
            sb2.append(owner);
            sb2.append(") than the parent's owner(");
            f0 f0VarC = C();
            sb2.append(f0VarC != null ? f0VarC.f24808n : null);
            sb2.append("). This tree: ");
            sb2.append(g(0));
            sb2.append(" Parent tree: ");
            f0 f0Var3 = this.f24807m;
            sb2.append(f0Var3 != null ? f0Var3.g(0) : null);
            u1.a.b(sb2.toString());
        }
        f0 f0VarC2 = C();
        if (f0VarC2 == null) {
            i0 i0Var = this.layoutDelegate;
            i0Var.f24859p.f24969r = true;
            s0 s0Var = i0Var.f24860q;
            if (s0Var != null) {
                s0Var.f24926q = o0.IsPlacedInLookahead;
            }
        }
        al.c cVar2 = this.D;
        ((f1) cVar2.f823e).f24823q = f0VarC2 != null ? (r) f0VarC2.D.f822d : null;
        this.f24808n = owner;
        this.f24809o = (f0VarC2 != null ? f0VarC2.f24809o : -1) + 1;
        z0.m mVar = this.H;
        if (mVar != null) {
            c(mVar);
        }
        this.H = null;
        AndroidComposeView androidComposeView = (AndroidComposeView) owner;
        androidComposeView.getLayoutNodes().h(this.f24799c, this);
        f0 f0Var4 = this.f24807m;
        if (f0Var4 == null || (f0Var = f0Var4.f24804h) == null) {
            f0Var = this.f24804h;
        }
        t0(f0Var);
        if (this.f24804h == null && cVar2.i(512)) {
            t0(this);
        }
        if (!this.K) {
            for (z0.l lVar = (z0.l) cVar2.f825g; lVar != null; lVar = lVar.f26500g) {
                lVar.S();
            }
        }
        p0.e eVar = (p0.e) this.j.f20679d;
        Object[] objArr = eVar.f20230a;
        int i10 = eVar.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            ((f0) objArr[i11]).d(owner);
        }
        if (!this.K) {
            cVar2.o();
        }
        N();
        if (f0VarC2 != null) {
            f0VarC2.N();
        }
        this.layoutDelegate.j();
        if (!this.K && cVar2.i(8)) {
            Q();
        }
        androidComposeView.getClass();
        if (!AndroidComposeView.d() || (cVar = androidComposeView._autofillManager) == null || (semanticsConfigurationE = E()) == null || !semanticsConfigurationE.f1191a.b(e2.p.f7746p)) {
            return;
        }
        cVar.f17g.a(this.f24799c);
        cVar.f11a.p(cVar.f13c, this.f24799c, true);
    }

    public final void d0(f0 f0Var) {
        if (f0Var.layoutDelegate.f24855l > 0) {
            this.layoutDelegate.d(r0.f24855l - 1);
        }
        if (this.f24808n != null) {
            f0Var.h();
        }
        f0Var.f24807m = null;
        if (f0Var.J > 0) {
            s0(this.J - 1);
        }
        ((f1) f0Var.D.f823e).f24823q = null;
        if (f0Var.f24798b) {
            this.f24805i--;
            p0.e eVar = (p0.e) f0Var.j.f20679d;
            Object[] objArr = eVar.f20230a;
            int i10 = eVar.f20232g;
            for (int i11 = 0; i11 < i10; i11++) {
                ((f1) ((f0) objArr[i11]).D.f823e).f24823q = null;
            }
        }
        R();
        f0();
    }

    public final void e() {
        this.B = this.A;
        this.A = d0.NotUsed;
        p0.e eVarI = I();
        Object[] objArr = eVarI.f20230a;
        int i10 = eVarI.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            f0 f0Var = (f0) objArr[i11];
            if (f0Var.A != d0.NotUsed) {
                f0Var.e();
            }
        }
    }

    public final void e0() {
        this.f24803g = true;
        p0.e eVarI = I();
        Object[] objArr = eVarI.f20230a;
        int i10 = eVarI.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            ((f0) objArr[i11]).O();
        }
    }

    public final void f() {
        this.B = this.A;
        this.A = d0.NotUsed;
        p0.e eVarI = I();
        Object[] objArr = eVarI.f20230a;
        int i10 = eVarI.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            f0 f0Var = (f0) objArr[i11];
            if (f0Var.A == d0.InLayoutBlock) {
                f0Var.f();
            }
        }
    }

    public final void f0() {
        if (!this.f24798b) {
            this.f24815u = true;
            return;
        }
        f0 f0VarC = C();
        if (f0VarC != null) {
            f0VarC.f0();
        }
    }

    public final String g(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        p0.e eVarI = I();
        Object[] objArr = eVarI.f20230a;
        int i12 = eVarI.f20232g;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append(((f0) objArr[i13]).g(i10 + 1));
        }
        String string = sb2.toString();
        if (i10 != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        br.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final void g0() {
        v1.u placementScope;
        r rVar;
        if (this.A == d0.NotUsed) {
            f();
        }
        f0 f0VarC = C();
        if (f0VarC == null || (rVar = (r) f0VarC.D.f822d) == null || (placementScope = rVar.f24886l) == null) {
            placementScope = k.t(this).getPlacementScope();
        }
        v1.u.h(placementScope, this.layoutDelegate.f24859p, 0, 0);
    }

    public final void h() {
        a1.c cVar;
        g0 g0Var;
        Owner owner = this.f24808n;
        if (owner == null) {
            StringBuilder sb2 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            f0 f0VarC = C();
            sb2.append(f0VarC != null ? f0VarC.g(0) : null);
            u1.a.c(sb2.toString());
            throw new bf.n();
        }
        f0 f0VarC2 = C();
        if (f0VarC2 != null) {
            f0VarC2.L();
            f0VarC2.N();
            i0 i0Var = this.layoutDelegate;
            y0 y0Var = i0Var.f24859p;
            d0 d0Var = d0.NotUsed;
            y0Var.f24964m = d0Var;
            s0 s0Var = i0Var.f24860q;
            if (s0Var != null) {
                s0Var.k = d0Var;
            }
        }
        i0 i0Var2 = this.layoutDelegate;
        g0 g0Var2 = i0Var2.f24859p.f24974w;
        g0Var2.f24835b = true;
        g0Var2.f24836c = false;
        g0Var2.f24838e = false;
        g0Var2.f24837d = false;
        g0Var2.f24839f = false;
        g0Var2.f24840g = false;
        g0Var2.f24841h = null;
        s0 s0Var2 = i0Var2.f24860q;
        if (s0Var2 != null && (g0Var = s0Var2.f24927r) != null) {
            g0Var.f24835b = true;
            g0Var.f24836c = false;
            g0Var.f24838e = false;
            g0Var.f24837d = false;
            g0Var.f24839f = false;
            g0Var.f24840g = false;
            g0Var.f24841h = null;
        }
        al.c cVar2 = this.D;
        z0.l lVar = (v1) cVar2.f824f;
        f1 f1Var = ((r) cVar2.f822d).f24822p;
        for (f1 f1Var2 = (f1) cVar2.f823e; !br.l.a(f1Var2, f1Var) && f1Var2 != null; f1Var2 = f1Var2.f24822p) {
            f1Var2.O0();
        }
        for (z0.l lVar2 = lVar; lVar2 != null; lVar2 = lVar2.f26499f) {
            if (lVar2.f26506o) {
                lVar2.Z();
            }
        }
        this.f24810p = true;
        p0.e eVar = (p0.e) this.j.f20679d;
        Object[] objArr = eVar.f20230a;
        int i10 = eVar.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            ((f0) objArr[i11]).h();
        }
        this.f24810p = false;
        while (lVar != null) {
            if (lVar.f26506o) {
                lVar.T();
            }
            lVar = lVar.f26499f;
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) owner;
        androidComposeView.getLayoutNodes().g(this.f24799c);
        v0 v0Var = androidComposeView.f1172m0;
        qm.c cVar3 = v0Var.f24943b;
        ((o2.g) cVar3.f20918d).f0(this);
        ((o2.g) cVar3.f20919g).f0(this);
        ((o2.g) cVar3.f20920r).f0(this);
        ((p0.e) v0Var.f24946e.f19554d).j(this);
        androidComposeView.f1163e0 = true;
        androidComposeView.getRectManager().j(this);
        if (AndroidComposeView.d() && (cVar = androidComposeView._autofillManager) != null && cVar.f17g.e(this.f24799c)) {
            cVar.f11a.p(cVar.f13c, this.f24799c, false);
        }
        this.f24808n = null;
        this.f24800d = 9223372034707292159L;
        t0(null);
        this.f24809o = 0;
        i0 i0Var3 = this.layoutDelegate;
        y0 y0Var2 = i0Var3.f24859p;
        y0Var2.j = Integer.MAX_VALUE;
        y0Var2.f24962i = Integer.MAX_VALUE;
        y0Var2.f24969r = false;
        s0 s0Var3 = i0Var3.f24860q;
        if (s0Var3 != null) {
            s0Var3.j = Integer.MAX_VALUE;
            s0Var3.f24920i = Integer.MAX_VALUE;
            s0Var3.f24926q = o0.IsNotPlaced;
        }
        if (cVar2.i(8)) {
            SemanticsConfiguration semanticsConfiguration = this.f24812r;
            this.f24812r = null;
            this.f24811q = false;
            owner.getSemanticsOwner().b(this, semanticsConfiguration);
            androidComposeView.x();
        }
    }

    public final boolean h0(t2.a aVar) {
        if (aVar == null) {
            return false;
        }
        if (this.A == d0.NotUsed) {
            e();
        }
        return this.layoutDelegate.f24859p.X(aVar.f22381a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void i() {
        if (this.layoutDelegate.f24849d != b0.Idle || s() || y() || this.K || !T()) {
            return;
        }
        z0.l lVar = (z0.l) this.D.f825g;
        if ((lVar.f26498e & 256) != 0) {
            while (lVar != null) {
                if ((lVar.f26497d & 256) != 0) {
                    j jVarE = lVar;
                    ?? eVar = 0;
                    while (jVarE != 0) {
                        if (jVarE instanceof n) {
                            n nVar = (n) jVarE;
                            nVar.b(k.q(nVar, 256));
                        } else if ((jVarE.f26497d & 256) != 0 && (jVarE instanceof j)) {
                            z0.l lVar2 = jVarE.f24863q;
                            int i10 = 0;
                            jVarE = jVarE;
                            eVar = eVar;
                            while (lVar2 != null) {
                                if ((lVar2.f26497d & 256) != 0) {
                                    i10++;
                                    eVar = eVar;
                                    if (i10 == 1) {
                                        jVarE = lVar2;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new p0.e(new z0.l[16]);
                                        }
                                        if (jVarE != 0) {
                                            eVar.b(jVarE);
                                            jVarE = 0;
                                        }
                                        eVar.b(lVar2);
                                    }
                                }
                                lVar2 = lVar2.f26500g;
                                jVarE = jVarE;
                                eVar = eVar;
                            }
                            if (i10 == 1) {
                            }
                        }
                        jVarE = k.e(eVar);
                    }
                }
                if ((lVar.f26498e & 256) == 0) {
                    return;
                } else {
                    lVar = lVar.f26500g;
                }
            }
        }
    }

    @Override // x1.m1
    public final boolean j() {
        return S();
    }

    public final void j0() {
        f0 f0VarC;
        if (this.A == d0.NotUsed) {
            f();
        }
        y0 y0Var = this.layoutDelegate.f24859p;
        i0 i0Var = y0Var.f24960g;
        try {
            y0Var.f24961h = true;
            if (!y0Var.f24963l) {
                u1.a.b("replace called on unplaced item");
            }
            boolean z10 = y0Var.f24969r;
            y0Var.W(y0Var.f24965n, y0Var.f24966o);
            if (z10 && !y0Var.E && (f0VarC = i0Var.f24846a.C()) != null) {
                f0VarC.m0(false);
            }
        } finally {
        }
    }

    public final void k(g1.p pVar, j1.c cVar) throws Throwable {
        try {
            ((f1) this.D.f823e).o0(pVar, cVar);
        } catch (Throwable th2) {
            q0(th2);
            throw null;
        }
    }

    public final void k0(boolean z10) {
        Owner owner;
        if (this.f24798b || (owner = this.f24808n) == null) {
            return;
        }
        ((AndroidComposeView) owner).w(this, true, z10);
    }

    public final boolean m() {
        s0 s0Var;
        g0 g0Var;
        i0 i0Var = this.layoutDelegate;
        return i0Var.f24859p.f24974w.e() || !((s0Var = i0Var.f24860q) == null || (g0Var = s0Var.f24927r) == null || !g0Var.e());
    }

    public final void m0(boolean z10) {
        Owner owner;
        if (this.f24798b || (owner = this.f24808n) == null) {
            return;
        }
        ((AndroidComposeView) owner).w(this, false, z10);
    }

    public final List n() {
        s0 s0Var = this.layoutDelegate.f24860q;
        br.l.b(s0Var);
        p0.e eVar = s0Var.f24928s;
        i0 i0Var = s0Var.f24918g;
        i0Var.f24846a.p();
        if (!s0Var.f24929t) {
            return eVar.f();
        }
        f0 f0Var = i0Var.f24846a;
        p0.e eVarI = f0Var.I();
        Object[] objArr = eVarI.f20230a;
        int i10 = eVarI.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            f0 f0Var2 = (f0) objArr[i11];
            if (eVar.f20232g <= i11) {
                s0 s0Var2 = f0Var2.layoutDelegate.f24860q;
                br.l.b(s0Var2);
                eVar.b(s0Var2);
            } else {
                s0 s0Var3 = f0Var2.layoutDelegate.f24860q;
                br.l.b(s0Var3);
                Object[] objArr2 = eVar.f20230a;
                Object obj = objArr2[i11];
                objArr2[i11] = s0Var3;
            }
        }
        eVar.l(((p0.b) f0Var.p()).f20224a.f20232g, eVar.f20232g);
        s0Var.f24929t = false;
        return eVar.f();
    }

    public final List o() {
        y0 y0Var = this.layoutDelegate.f24859p;
        p0.e eVar = y0Var.f24975x;
        i0 i0Var = y0Var.f24960g;
        i0Var.f24846a.w0();
        if (!y0Var.f24976y) {
            return eVar.f();
        }
        f0 f0Var = i0Var.f24846a;
        p0.e eVarI = f0Var.I();
        Object[] objArr = eVarI.f20230a;
        int i10 = eVarI.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            f0 f0Var2 = (f0) objArr[i11];
            if (eVar.f20232g <= i11) {
                eVar.b(f0Var2.r().f24859p);
            } else {
                y0 y0Var2 = f0Var2.r().f24859p;
                Object[] objArr2 = eVar.f20230a;
                Object obj = objArr2[i11];
                objArr2[i11] = y0Var2;
            }
        }
        eVar.l(((p0.b) f0Var.p()).f20224a.f20232g, eVar.f20232g);
        y0Var.f24976y = false;
        return eVar.f();
    }

    public final List p() {
        return I().f();
    }

    public final void p0() {
        p0.e eVarI = I();
        Object[] objArr = eVarI.f20230a;
        int i10 = eVarI.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            f0 f0Var = (f0) objArr[i11];
            d0 d0Var = f0Var.B;
            f0Var.A = d0Var;
            if (d0Var != d0.NotUsed) {
                f0Var.p0();
            }
        }
    }

    public final int q() {
        return this.layoutDelegate.f24859p.f23810c;
    }

    public final void q0(Throwable th2) throws Throwable {
        n0.z zVar = this.f24820z;
        h2 h2Var = y0.c.f25615a;
        v0.h hVar = (v0.h) zVar;
        hVar.getClass();
        y0.b bVar = (y0.b) n0.w.j(hVar, h2Var);
        if (bVar == null) {
            throw th2;
        }
        e5.T(th2, new c8.x(bVar, 7, this));
        throw th2;
    }

    public final i0 r() {
        return this.layoutDelegate;
    }

    public final void r0(t2.c cVar) {
        if (br.l.a(this.f24817w, cVar)) {
            return;
        }
        this.f24817w = cVar;
        N();
        f0 f0VarC = C();
        if (f0VarC != null) {
            f0VarC.L();
        }
        M();
        for (z0.l lVar = (z0.l) this.D.f825g; lVar != null; lVar = lVar.f26500g) {
            lVar.a();
        }
    }

    public final boolean s() {
        return this.layoutDelegate.f24859p.f24972u;
    }

    public final void s0(int i10) {
        f0 f0VarC;
        f0 f0VarC2;
        int i11 = this.J;
        if (i11 != i10) {
            if (i10 > 0 && i11 == 0 && (f0VarC2 = C()) != null) {
                f0VarC2.s0(f0VarC2.J + 1);
            }
            if (i10 == 0 && this.J > 0 && (f0VarC = C()) != null) {
                f0VarC.s0(f0VarC.J - 1);
            }
            this.J = i10;
        }
    }

    public final b0 t() {
        return this.layoutDelegate.f24849d;
    }

    public final void t0(f0 f0Var) {
        if (br.l.a(f0Var, this.f24804h)) {
            return;
        }
        this.f24804h = f0Var;
        if (f0Var != null) {
            i0 i0Var = this.layoutDelegate;
            if (i0Var.f24860q == null) {
                i0Var.f24860q = new s0(i0Var);
            }
            al.c cVar = this.D;
            f1 f1Var = ((r) cVar.f822d).f24822p;
            for (f1 f1Var2 = (f1) cVar.f823e; !br.l.a(f1Var2, f1Var) && f1Var2 != null; f1Var2 = f1Var2.f24822p) {
                f1Var2.q0();
            }
        } else {
            i0 i0Var2 = this.layoutDelegate;
            i0Var2.f24860q = null;
            i0Var2.f24851f = false;
            i0Var2.f24850e = false;
        }
        N();
    }

    public final String toString() {
        return y1.e0.t(this) + " children: " + ((p0.b) p()).f20224a.f20232g + " measurePolicy: " + this.f24816v + " deactivated: " + this.K;
    }

    public final boolean u() {
        return this.layoutDelegate.f24851f;
    }

    public final void u0(z0.m mVar) {
        if (this.f24798b && this.G != z0.j.f26494a) {
            u1.a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.K) {
            u1.a.a("modifier is updated when deactivated");
        }
        if (!S()) {
            this.H = mVar;
            return;
        }
        c(mVar);
        if (this.f24811q) {
            Q();
        }
    }

    public final boolean v() {
        return this.layoutDelegate.f24850e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [z0.l] */
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
    /* JADX WARN: Type inference failed for: r3v3, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void v0(y1.x1 x1Var) {
        if (br.l.a(this.f24819y, x1Var)) {
            return;
        }
        this.f24819y = x1Var;
        z0.l lVar = (z0.l) this.D.f825g;
        if ((lVar.f26498e & 16) != 0) {
            while (lVar != null) {
                if ((lVar.f26497d & 16) != 0) {
                    j jVarE = lVar;
                    ?? eVar = 0;
                    while (jVarE != 0) {
                        if (jVarE instanceof q1) {
                            ((q1) jVarE).q();
                        } else if ((jVarE.f26497d & 16) != 0 && (jVarE instanceof j)) {
                            z0.l lVar2 = jVarE.f24863q;
                            int i10 = 0;
                            jVarE = jVarE;
                            eVar = eVar;
                            while (lVar2 != null) {
                                if ((lVar2.f26497d & 16) != 0) {
                                    i10++;
                                    eVar = eVar;
                                    if (i10 == 1) {
                                        jVarE = lVar2;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new p0.e(new z0.l[16]);
                                        }
                                        if (jVarE != 0) {
                                            eVar.b(jVarE);
                                            jVarE = 0;
                                        }
                                        eVar.b(lVar2);
                                    }
                                }
                                lVar2 = lVar2.f26500g;
                                jVarE = jVarE;
                                eVar = eVar;
                            }
                            if (i10 == 1) {
                            }
                        }
                        jVarE = k.e(eVar);
                    }
                }
                if ((lVar.f26498e & 16) == 0) {
                    return;
                } else {
                    lVar = lVar.f26500g;
                }
            }
        }
    }

    public final s0 w() {
        return this.layoutDelegate.f24860q;
    }

    public final void w0() {
        if (this.f24805i <= 0 || !this.f24806l) {
            return;
        }
        this.f24806l = false;
        p0.e eVar = this.k;
        if (eVar == null) {
            eVar = new p0.e(new f0[16]);
            this.k = eVar;
        }
        eVar.g();
        p0.e eVar2 = (p0.e) this.j.f20679d;
        Object[] objArr = eVar2.f20230a;
        int i10 = eVar2.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            f0 f0Var = (f0) objArr[i11];
            if (f0Var.f24798b) {
                eVar.d(eVar.f20232g, f0Var.I());
            } else {
                eVar.b(f0Var);
            }
        }
        i0 i0Var = this.layoutDelegate;
        i0Var.f24859p.f24976y = true;
        s0 s0Var = i0Var.f24860q;
        if (s0Var != null) {
            s0Var.f24929t = true;
        }
    }

    public final y0 x() {
        return this.layoutDelegate.f24859p;
    }

    public final boolean y() {
        return this.layoutDelegate.f24859p.f24971t;
    }

    public final d0 z() {
        return this.layoutDelegate.f24859p.f24964m;
    }

    public f0(int i10, boolean z10) {
        this.f24798b = z10;
        this.f24799c = i10;
        this.f24800d = 9223372034707292159L;
        this.f24801e = 0L;
        this.f24802f = 9223372034707292159L;
        this.f24803g = true;
        this.j = new q3.a(new p0.e(new f0[16]), 17, new pp.c(13, this));
        this.f24814t = new p0.e(new f0[16]);
        this.f24815u = true;
        this.f24816v = L;
        this.f24817w = k.f24871b;
        this.f24818x = t2.i.Ltr;
        this.f24819y = M;
        n0.z.f17367o.getClass();
        this.f24820z = n0.y.f17365b;
        d0 d0Var = d0.NotUsed;
        this.A = d0Var;
        this.B = d0Var;
        this.D = new al.c(this);
        this.layoutDelegate = new i0(this);
        this.F = true;
        this.G = z0.j.f26494a;
    }
}
