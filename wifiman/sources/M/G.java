package M;

import F.EnumC2726p;
import F.EnumC2727q;
import F.U;
import F.V;
import F.j0;
import F.u0;
import F.y0;
import L0.C3174d;
import L0.S;
import L0.T;
import R0.Q;
import R0.c0;
import T.InterfaceC3551q0;
import T.t1;
import androidx.compose.ui.platform.InterfaceC3923h0;
import androidx.compose.ui.platform.q1;
import androidx.compose.ui.platform.s1;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6532h;
import l0.C6531g;
import l0.C6533i;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;
import u0.AbstractC8124b;
import u0.InterfaceC8123a;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private final u0 f12085a;

    /* renamed from: d, reason: collision with root package name */
    private F.E f12088d;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC3923h0 f12091g;

    /* renamed from: h, reason: collision with root package name */
    private q1 f12092h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC8123a f12093i;

    /* renamed from: j, reason: collision with root package name */
    private androidx.compose.ui.focus.o f12094j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC3551q0 f12095k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC3551q0 f12096l;

    /* renamed from: m, reason: collision with root package name */
    private long f12097m;

    /* renamed from: n, reason: collision with root package name */
    private Integer f12098n;

    /* renamed from: o, reason: collision with root package name */
    private long f12099o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC3551q0 f12100p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC3551q0 f12101q;

    /* renamed from: r, reason: collision with root package name */
    private int f12102r;

    /* renamed from: s, reason: collision with root package name */
    private Q f12103s;

    /* renamed from: t, reason: collision with root package name */
    private x f12104t;

    /* renamed from: u, reason: collision with root package name */
    private final U f12105u;

    /* renamed from: v, reason: collision with root package name */
    private final InterfaceC3240i f12106v;

    /* renamed from: b, reason: collision with root package name */
    private R0.H f12086b = y0.d();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC6835l f12087c = d.f12111a;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3551q0 f12089e = t1.d(new Q((String) null, 0, (S) null, 7, (DefaultConstructorMarker) null), null, 2, null);

    /* renamed from: f, reason: collision with root package name */
    private c0 f12090f = c0.f19456a.c();

    public static final class a implements U {
        a() {
        }

        @Override // F.U
        public void a() {
            G.this.Y(null);
            G.this.W(null);
        }

        @Override // F.U
        public void b(long j10) {
        }

        @Override // F.U
        public void c(long j10) {
            j0 j0VarJ;
            long jA = w.a(G.this.G(true));
            F.E eL = G.this.L();
            if (eL == null || (j0VarJ = eL.j()) == null) {
                return;
            }
            long jK = j0VarJ.k(jA);
            G.this.f12097m = jK;
            G.this.W(C6531g.d(jK));
            G.this.f12099o = C6531g.f52335b.c();
            G.this.Y(EnumC2726p.Cursor);
            G.this.m0(false);
        }

        @Override // F.U
        public void d() {
            G.this.Y(null);
            G.this.W(null);
        }

        @Override // F.U
        public void e(long j10) {
            j0 j0VarJ;
            InterfaceC8123a interfaceC8123aH;
            G g10 = G.this;
            g10.f12099o = C6531g.r(g10.f12099o, j10);
            F.E eL = G.this.L();
            if (eL == null || (j0VarJ = eL.j()) == null) {
                return;
            }
            G g11 = G.this;
            g11.W(C6531g.d(C6531g.r(g11.f12097m, g11.f12099o)));
            R0.H hJ = g11.J();
            C6531g c6531gA = g11.A();
            AbstractC6492s.f(c6531gA);
            int iA = hJ.a(j0.e(j0VarJ, c6531gA.v(), false, 2, null));
            long jB = T.b(iA, iA);
            if (S.g(jB, g11.O().h())) {
                return;
            }
            F.E eL2 = g11.L();
            if ((eL2 == null || eL2.y()) && (interfaceC8123aH = g11.H()) != null) {
                interfaceC8123aH.a(AbstractC8124b.f62666a.b());
            }
            g11.K().invoke(g11.q(g11.O().f(), jB));
        }

        @Override // F.U
        public void onCancel() {
        }
    }

    public static final class b implements U {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f12109b;

        b(boolean z10) {
            this.f12109b = z10;
        }

        @Override // F.U
        public void a() {
            G.this.Y(null);
            G.this.W(null);
            G.this.m0(true);
        }

        @Override // F.U
        public void b(long j10) {
            j0 j0VarJ;
            G.this.Y(this.f12109b ? EnumC2726p.SelectionStart : EnumC2726p.SelectionEnd);
            long jA = w.a(G.this.G(this.f12109b));
            F.E eL = G.this.L();
            if (eL == null || (j0VarJ = eL.j()) == null) {
                return;
            }
            long jK = j0VarJ.k(jA);
            G.this.f12097m = jK;
            G.this.W(C6531g.d(jK));
            G.this.f12099o = C6531g.f52335b.c();
            G.this.f12102r = -1;
            F.E eL2 = G.this.L();
            if (eL2 != null) {
                eL2.D(true);
            }
            G.this.m0(false);
        }

        @Override // F.U
        public void c(long j10) {
        }

        @Override // F.U
        public void d() {
            G.this.Y(null);
            G.this.W(null);
            G.this.m0(true);
        }

        @Override // F.U
        public void e(long j10) {
            G g10 = G.this;
            g10.f12099o = C6531g.r(g10.f12099o, j10);
            G g11 = G.this;
            g11.W(C6531g.d(C6531g.r(g11.f12097m, G.this.f12099o)));
            G g12 = G.this;
            Q qO = g12.O();
            C6531g c6531gA = G.this.A();
            AbstractC6492s.f(c6531gA);
            g12.n0(qO, c6531gA.v(), false, this.f12109b, r.f12223a.l(), true);
            G.this.m0(false);
        }

        @Override // F.U
        public void onCancel() {
        }
    }

    public static final class c implements InterfaceC3240i {
        c() {
        }

        @Override // M.InterfaceC3240i
        public boolean a(long j10) {
            F.E eL;
            if (!G.this.E() || G.this.O().i().length() == 0 || (eL = G.this.L()) == null || eL.j() == null) {
                return false;
            }
            f(G.this.O(), j10, false, r.f12223a.m());
            return true;
        }

        @Override // M.InterfaceC3240i
        public boolean b(long j10, r rVar) {
            F.E eL;
            if (!G.this.E() || G.this.O().i().length() == 0 || (eL = G.this.L()) == null || eL.j() == null) {
                return false;
            }
            f(G.this.O(), j10, false, rVar);
            return true;
        }

        @Override // M.InterfaceC3240i
        public boolean c(long j10, r rVar) {
            F.E eL;
            if (!G.this.E() || G.this.O().i().length() == 0 || (eL = G.this.L()) == null || eL.j() == null) {
                return false;
            }
            androidx.compose.ui.focus.o oVarF = G.this.F();
            if (oVarF != null) {
                oVarF.f();
            }
            G.this.f12097m = j10;
            G.this.f12102r = -1;
            G.w(G.this, false, 1, null);
            f(G.this.O(), G.this.f12097m, true, rVar);
            return true;
        }

        @Override // M.InterfaceC3240i
        public void d() {
        }

        @Override // M.InterfaceC3240i
        public boolean e(long j10) {
            F.E eL = G.this.L();
            if (eL == null || eL.j() == null || !G.this.E()) {
                return false;
            }
            G.this.f12102r = -1;
            f(G.this.O(), j10, false, r.f12223a.m());
            return true;
        }

        public final void f(Q q10, long j10, boolean z10, r rVar) {
            G.this.c0(S.h(G.this.n0(q10, j10, z10, false, rVar, false)) ? EnumC2727q.Cursor : EnumC2727q.Selection);
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final d f12111a = new d();

        d() {
            super(1);
        }

        public final void a(Q q10) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Q) obj);
            return Yg.J.f24997a;
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6824a {
        e() {
            super(0);
        }

        public final void a() {
            G.p(G.this, false, 1, null);
            G.this.R();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6824a {
        f() {
            super(0);
        }

        public final void a() {
            G.this.s();
            G.this.R();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6824a {
        g() {
            super(0);
        }

        public final void a() {
            G.this.T();
            G.this.R();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6824a {
        h() {
            super(0);
        }

        public final void a() {
            G.this.U();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    public static final class i implements U {
        i() {
        }

        private final void f() {
            G.this.Y(null);
            G.this.W(null);
            G.this.m0(true);
            G.this.f12098n = null;
            boolean zH = S.h(G.this.O().h());
            G.this.c0(zH ? EnumC2727q.Cursor : EnumC2727q.Selection);
            F.E eL = G.this.L();
            if (eL != null) {
                eL.M(!zH && H.c(G.this, true));
            }
            F.E eL2 = G.this.L();
            if (eL2 != null) {
                eL2.L(!zH && H.c(G.this, false));
            }
            F.E eL3 = G.this.L();
            if (eL3 == null) {
                return;
            }
            eL3.J(zH && H.c(G.this, true));
        }

        @Override // F.U
        public void a() {
            f();
        }

        @Override // F.U
        public void b(long j10) {
        }

        @Override // F.U
        public void c(long j10) {
            j0 j0VarJ;
            j0 j0VarJ2;
            if (G.this.E() && G.this.C() == null) {
                G.this.Y(EnumC2726p.SelectionEnd);
                G.this.f12102r = -1;
                G.this.R();
                F.E eL = G.this.L();
                if (eL == null || (j0VarJ2 = eL.j()) == null || !j0VarJ2.g(j10)) {
                    F.E eL2 = G.this.L();
                    if (eL2 != null && (j0VarJ = eL2.j()) != null) {
                        G g10 = G.this;
                        int iA = g10.J().a(j0.e(j0VarJ, j10, false, 2, null));
                        Q q10 = g10.q(g10.O().f(), T.b(iA, iA));
                        g10.v(false);
                        InterfaceC8123a interfaceC8123aH = g10.H();
                        if (interfaceC8123aH != null) {
                            interfaceC8123aH.a(AbstractC8124b.f62666a.b());
                        }
                        g10.K().invoke(q10);
                    }
                } else {
                    if (G.this.O().i().length() == 0) {
                        return;
                    }
                    G.this.v(false);
                    G g11 = G.this;
                    G.this.f12098n = Integer.valueOf(S.n(g11.n0(Q.d(g11.O(), null, S.f11103b.a(), null, 5, null), j10, true, false, r.f12223a.o(), true)));
                }
                G.this.c0(EnumC2727q.None);
                G.this.f12097m = j10;
                G g12 = G.this;
                g12.W(C6531g.d(g12.f12097m));
                G.this.f12099o = C6531g.f52335b.c();
            }
        }

        @Override // F.U
        public void d() {
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
        @Override // F.U
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void e(long r10) {
            /*
                r9 = this;
                M.G r0 = M.G.this
                boolean r0 = r0.E()
                if (r0 == 0) goto L107
                M.G r0 = M.G.this
                R0.Q r0 = r0.O()
                java.lang.String r0 = r0.i()
                int r0 = r0.length()
                if (r0 != 0) goto L1a
                goto L107
            L1a:
                M.G r0 = M.G.this
                long r1 = M.G.d(r0)
                long r10 = l0.C6531g.r(r1, r10)
                M.G.h(r0, r10)
                M.G r10 = M.G.this
                F.E r10 = r10.L()
                r11 = 0
                if (r10 == 0) goto L102
                F.j0 r10 = r10.j()
                if (r10 == 0) goto L102
                M.G r6 = M.G.this
                long r0 = M.G.c(r6)
                long r2 = M.G.d(r6)
                long r0 = l0.C6531g.r(r0, r2)
                l0.g r0 = l0.C6531g.d(r0)
                M.G.e(r6, r0)
                java.lang.Integer r0 = M.G.b(r6)
                if (r0 != 0) goto Lb6
                l0.g r0 = r6.A()
                kotlin.jvm.internal.AbstractC6492s.f(r0)
                long r0 = r0.v()
                boolean r0 = r10.g(r0)
                if (r0 != 0) goto Lb6
                R0.H r7 = r6.J()
                long r1 = M.G.c(r6)
                r4 = 2
                r5 = 0
                r3 = 0
                r0 = r10
                int r0 = F.j0.e(r0, r1, r3, r4, r5)
                int r7 = r7.a(r0)
                R0.H r8 = r6.J()
                l0.g r0 = r6.A()
                kotlin.jvm.internal.AbstractC6492s.f(r0)
                long r1 = r0.v()
                r0 = r10
                int r10 = F.j0.e(r0, r1, r3, r4, r5)
                int r10 = r8.a(r10)
                if (r7 != r10) goto L97
                M.r$a r10 = M.r.f12223a
                M.r r10 = r10.m()
                goto L9d
            L97:
                M.r$a r10 = M.r.f12223a
                M.r r10 = r10.o()
            L9d:
                R0.Q r1 = r6.O()
                l0.g r0 = r6.A()
                kotlin.jvm.internal.AbstractC6492s.f(r0)
                long r2 = r0.v()
                r5 = 0
                r7 = 1
                r4 = 0
                r0 = r6
                r6 = r10
                long r0 = M.G.m(r0, r1, r2, r4, r5, r6, r7)
                goto Lff
            Lb6:
                java.lang.Integer r0 = M.G.b(r6)
                if (r0 == 0) goto Lc1
                int r0 = r0.intValue()
                goto Lc9
            Lc1:
                long r0 = M.G.c(r6)
                int r0 = r10.d(r0, r11)
            Lc9:
                l0.g r1 = r6.A()
                kotlin.jvm.internal.AbstractC6492s.f(r1)
                long r1 = r1.v()
                int r10 = r10.d(r1, r11)
                java.lang.Integer r1 = M.G.b(r6)
                if (r1 != 0) goto Le1
                if (r0 != r10) goto Le1
                return
            Le1:
                R0.Q r1 = r6.O()
                l0.g r10 = r6.A()
                kotlin.jvm.internal.AbstractC6492s.f(r10)
                long r2 = r10.v()
                M.r$a r10 = M.r.f12223a
                M.r r10 = r10.o()
                r7 = 1
                r4 = 0
                r5 = 0
                r0 = r6
                r6 = r10
                long r0 = M.G.m(r0, r1, r2, r4, r5, r6, r7)
            Lff:
                L0.S.b(r0)
            L102:
                M.G r10 = M.G.this
                M.G.l(r10, r11)
            L107:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: M.G.i.e(long):void");
        }

        @Override // F.U
        public void onCancel() {
            f();
        }
    }

    public G(u0 u0Var) {
        this.f12085a = u0Var;
        Boolean bool = Boolean.TRUE;
        this.f12095k = t1.d(bool, null, 2, null);
        this.f12096l = t1.d(bool, null, 2, null);
        C6531g.a aVar = C6531g.f52335b;
        this.f12097m = aVar.c();
        this.f12099o = aVar.c();
        this.f12100p = t1.d(null, null, 2, null);
        this.f12101q = t1.d(null, null, 2, null);
        this.f12102r = -1;
        this.f12103s = new Q((String) null, 0L, (S) null, 7, (DefaultConstructorMarker) null);
        this.f12105u = new i();
        this.f12106v = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(C6531g c6531g) {
        this.f12101q.setValue(c6531g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(EnumC2726p enumC2726p) {
        this.f12100p.setValue(enumC2726p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(EnumC2727q enumC2727q) {
        F.E e10 = this.f12088d;
        if (e10 != null) {
            if (e10.d() == enumC2727q) {
                e10 = null;
            }
            if (e10 != null) {
                e10.B(enumC2727q);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0(boolean z10) {
        F.E e10 = this.f12088d;
        if (e10 != null) {
            e10.K(z10);
        }
        if (z10) {
            l0();
        } else {
            R();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long n0(Q q10, long j10, boolean z10, boolean z11, r rVar, boolean z12) {
        j0 j0VarJ;
        InterfaceC8123a interfaceC8123a;
        int i10;
        F.E e10 = this.f12088d;
        if (e10 == null || (j0VarJ = e10.j()) == null) {
            return S.f11103b.a();
        }
        long jB = T.b(this.f12086b.b(S.n(q10.h())), this.f12086b.b(S.i(q10.h())));
        boolean z13 = false;
        int iD = j0VarJ.d(j10, false);
        int iN = (z11 || z10) ? iD : S.n(jB);
        int i11 = (!z11 || z10) ? iD : S.i(jB);
        x xVar = this.f12104t;
        int i12 = -1;
        if (!z10 && xVar != null && (i10 = this.f12102r) != -1) {
            i12 = i10;
        }
        x xVarC = y.c(j0VarJ.f(), iN, i11, i12, jB, z10, z11);
        if (!xVarC.j(xVar)) {
            return q10.h();
        }
        this.f12104t = xVarC;
        this.f12102r = iD;
        C3243l c3243lA = rVar.a(xVarC);
        long jB2 = T.b(this.f12086b.a(c3243lA.e().c()), this.f12086b.a(c3243lA.c().c()));
        if (S.g(jB2, q10.h())) {
            return q10.h();
        }
        boolean z14 = S.m(jB2) != S.m(q10.h()) && S.g(T.b(S.i(jB2), S.n(jB2)), q10.h());
        boolean z15 = S.h(jB2) && S.h(q10.h());
        if (z12 && q10.i().length() > 0 && !z14 && !z15 && (interfaceC8123a = this.f12093i) != null) {
            interfaceC8123a.a(AbstractC8124b.f62666a.b());
        }
        this.f12087c.invoke(q(q10.f(), jB2));
        if (!z12) {
            m0(!S.h(jB2));
        }
        F.E e11 = this.f12088d;
        if (e11 != null) {
            e11.D(z12);
        }
        F.E e12 = this.f12088d;
        if (e12 != null) {
            e12.M(!S.h(jB2) && H.c(this, true));
        }
        F.E e13 = this.f12088d;
        if (e13 != null) {
            e13.L(!S.h(jB2) && H.c(this, false));
        }
        F.E e14 = this.f12088d;
        if (e14 != null) {
            if (S.h(jB2) && H.c(this, true)) {
                z13 = true;
            }
            e14.J(z13);
        }
        return jB2;
    }

    public static /* synthetic */ void p(G g10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        g10.o(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Q q(C3174d c3174d, long j10) {
        return new Q(c3174d, j10, (S) null, 4, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void u(G g10, C6531g c6531g, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c6531g = null;
        }
        g10.t(c6531g);
    }

    public static /* synthetic */ void w(G g10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        g10.v(z10);
    }

    private final C6533i z() {
        float fN;
        C0.r rVarI;
        L0.M mF;
        C6533i c6533iE;
        C0.r rVarI2;
        L0.M mF2;
        C6533i c6533iE2;
        C0.r rVarI3;
        C0.r rVarI4;
        F.E e10 = this.f12088d;
        if (e10 != null) {
            if (e10.z()) {
                e10 = null;
            }
            if (e10 != null) {
                int iB = this.f12086b.b(S.n(O().h()));
                int iB2 = this.f12086b.b(S.i(O().h()));
                F.E e11 = this.f12088d;
                long jC = (e11 == null || (rVarI4 = e11.i()) == null) ? C6531g.f52335b.c() : rVarI4.o0(G(true));
                F.E e12 = this.f12088d;
                long jC2 = (e12 == null || (rVarI3 = e12.i()) == null) ? C6531g.f52335b.c() : rVarI3.o0(G(false));
                F.E e13 = this.f12088d;
                float fN2 = 0.0f;
                if (e13 == null || (rVarI2 = e13.i()) == null) {
                    fN = 0.0f;
                } else {
                    j0 j0VarJ = e10.j();
                    fN = C6531g.n(rVarI2.o0(AbstractC6532h.a(0.0f, (j0VarJ == null || (mF2 = j0VarJ.f()) == null || (c6533iE2 = mF2.e(iB)) == null) ? 0.0f : c6533iE2.n())));
                }
                F.E e14 = this.f12088d;
                if (e14 != null && (rVarI = e14.i()) != null) {
                    j0 j0VarJ2 = e10.j();
                    fN2 = C6531g.n(rVarI.o0(AbstractC6532h.a(0.0f, (j0VarJ2 == null || (mF = j0VarJ2.f()) == null || (c6533iE = mF.e(iB2)) == null) ? 0.0f : c6533iE.n())));
                }
                return new C6533i(Math.min(C6531g.m(jC), C6531g.m(jC2)), Math.min(fN, fN2), Math.max(C6531g.m(jC), C6531g.m(jC2)), Math.max(C6531g.n(jC), C6531g.n(jC2)) + (Y0.h.j(25) * e10.v().a().getDensity()));
            }
        }
        return C6533i.f52340e.a();
    }

    public final C6531g A() {
        return (C6531g) this.f12101q.getValue();
    }

    public final long B(Y0.d dVar) {
        int iB = this.f12086b.b(S.n(O().h()));
        F.E e10 = this.f12088d;
        j0 j0VarJ = e10 != null ? e10.j() : null;
        AbstractC6492s.f(j0VarJ);
        L0.M mF = j0VarJ.f();
        C6533i c6533iE = mF.e(AbstractC7978m.k(iB, 0, mF.l().j().length()));
        return AbstractC6532h.a(c6533iE.k() + (dVar.d1(V.b()) / 2), c6533iE.e());
    }

    public final EnumC2726p C() {
        return (EnumC2726p) this.f12100p.getValue();
    }

    public final boolean D() {
        return ((Boolean) this.f12095k.getValue()).booleanValue();
    }

    public final boolean E() {
        return ((Boolean) this.f12096l.getValue()).booleanValue();
    }

    public final androidx.compose.ui.focus.o F() {
        return this.f12094j;
    }

    public final long G(boolean z10) {
        j0 j0VarJ;
        L0.M mF;
        F.E e10 = this.f12088d;
        if (e10 == null || (j0VarJ = e10.j()) == null || (mF = j0VarJ.f()) == null) {
            return C6531g.f52335b.b();
        }
        C3174d c3174dN = N();
        if (c3174dN == null) {
            return C6531g.f52335b.b();
        }
        if (!AbstractC6492s.d(c3174dN.k(), mF.l().j().k())) {
            return C6531g.f52335b.b();
        }
        long jH = O().h();
        return M.b(mF, this.f12086b.b(z10 ? S.n(jH) : S.i(jH)), z10, S.m(O().h()));
    }

    public final InterfaceC8123a H() {
        return this.f12093i;
    }

    public final InterfaceC3240i I() {
        return this.f12106v;
    }

    public final R0.H J() {
        return this.f12086b;
    }

    public final InterfaceC6835l K() {
        return this.f12087c;
    }

    public final F.E L() {
        return this.f12088d;
    }

    public final U M() {
        return this.f12105u;
    }

    public final C3174d N() {
        F.S sV;
        F.E e10 = this.f12088d;
        if (e10 == null || (sV = e10.v()) == null) {
            return null;
        }
        return sV.k();
    }

    public final Q O() {
        return (Q) this.f12089e.getValue();
    }

    public final c0 P() {
        return this.f12090f;
    }

    public final U Q(boolean z10) {
        return new b(z10);
    }

    public final void R() {
        q1 q1Var;
        q1 q1Var2 = this.f12092h;
        if ((q1Var2 != null ? q1Var2.a() : null) != s1.Shown || (q1Var = this.f12092h) == null) {
            return;
        }
        q1Var.c();
    }

    public final boolean S() {
        return !AbstractC6492s.d(this.f12103s.i(), O().i());
    }

    public final void T() {
        C3174d c3174dA;
        InterfaceC3923h0 interfaceC3923h0 = this.f12091g;
        if (interfaceC3923h0 == null || (c3174dA = interfaceC3923h0.a()) == null) {
            return;
        }
        C3174d c3174dQ = R0.S.c(O(), O().i().length()).q(c3174dA).q(R0.S.b(O(), O().i().length()));
        int iL = S.l(O().h()) + c3174dA.length();
        this.f12087c.invoke(q(c3174dQ, T.b(iL, iL)));
        c0(EnumC2727q.None);
        u0 u0Var = this.f12085a;
        if (u0Var != null) {
            u0Var.a();
        }
    }

    public final void U() {
        Q q10 = q(O().f(), T.b(0, O().i().length()));
        this.f12087c.invoke(q10);
        this.f12103s = Q.d(this.f12103s, null, q10.h(), null, 5, null);
        v(true);
    }

    public final void V(InterfaceC3923h0 interfaceC3923h0) {
        this.f12091g = interfaceC3923h0;
    }

    public final void X(long j10) {
        F.E e10 = this.f12088d;
        if (e10 != null) {
            e10.A(j10);
        }
        F.E e11 = this.f12088d;
        if (e11 != null) {
            e11.I(S.f11103b.a());
        }
        if (S.h(j10)) {
            return;
        }
        x();
    }

    public final void Z(boolean z10) {
        this.f12095k.setValue(Boolean.valueOf(z10));
    }

    public final void a0(boolean z10) {
        this.f12096l.setValue(Boolean.valueOf(z10));
    }

    public final void b0(androidx.compose.ui.focus.o oVar) {
        this.f12094j = oVar;
    }

    public final void d0(InterfaceC8123a interfaceC8123a) {
        this.f12093i = interfaceC8123a;
    }

    public final void e0(R0.H h10) {
        this.f12086b = h10;
    }

    public final void f0(InterfaceC6835l interfaceC6835l) {
        this.f12087c = interfaceC6835l;
    }

    public final void g0(long j10) {
        F.E e10 = this.f12088d;
        if (e10 != null) {
            e10.I(j10);
        }
        F.E e11 = this.f12088d;
        if (e11 != null) {
            e11.A(S.f11103b.a());
        }
        if (S.h(j10)) {
            return;
        }
        x();
    }

    public final void h0(F.E e10) {
        this.f12088d = e10;
    }

    public final void i0(q1 q1Var) {
        this.f12092h = q1Var;
    }

    public final void j0(Q q10) {
        this.f12089e.setValue(q10);
    }

    public final void k0(c0 c0Var) {
        this.f12090f = c0Var;
    }

    public final void l0() {
        InterfaceC3923h0 interfaceC3923h0;
        if (E()) {
            F.E e10 = this.f12088d;
            if (e10 == null || e10.y()) {
                boolean z10 = this.f12090f instanceof R0.J;
                e eVar = (S.h(O().h()) || z10) ? null : new e();
                f fVar = (S.h(O().h()) || !D() || z10) ? null : new f();
                g gVar = (D() && (interfaceC3923h0 = this.f12091g) != null && interfaceC3923h0.c()) ? new g() : null;
                h hVar = S.j(O().h()) != O().i().length() ? new h() : null;
                q1 q1Var = this.f12092h;
                if (q1Var != null) {
                    q1Var.b(z(), eVar, gVar, fVar, hVar);
                }
            }
        }
    }

    public final void n() {
        F.E e10 = this.f12088d;
        if (e10 != null) {
            e10.A(S.f11103b.a());
        }
        F.E e11 = this.f12088d;
        if (e11 == null) {
            return;
        }
        e11.I(S.f11103b.a());
    }

    public final void o(boolean z10) {
        if (S.h(O().h())) {
            return;
        }
        InterfaceC3923h0 interfaceC3923h0 = this.f12091g;
        if (interfaceC3923h0 != null) {
            interfaceC3923h0.b(R0.S.a(O()));
        }
        if (z10) {
            int iK = S.k(O().h());
            this.f12087c.invoke(q(O().f(), T.b(iK, iK)));
            c0(EnumC2727q.None);
        }
    }

    public final U r() {
        return new a();
    }

    public final void s() {
        if (S.h(O().h())) {
            return;
        }
        InterfaceC3923h0 interfaceC3923h0 = this.f12091g;
        if (interfaceC3923h0 != null) {
            interfaceC3923h0.b(R0.S.a(O()));
        }
        C3174d c3174dQ = R0.S.c(O(), O().i().length()).q(R0.S.b(O(), O().i().length()));
        int iL = S.l(O().h());
        this.f12087c.invoke(q(c3174dQ, T.b(iL, iL)));
        c0(EnumC2727q.None);
        u0 u0Var = this.f12085a;
        if (u0Var != null) {
            u0Var.a();
        }
    }

    public final void t(C6531g c6531g) {
        if (!S.h(O().h())) {
            F.E e10 = this.f12088d;
            j0 j0VarJ = e10 != null ? e10.j() : null;
            this.f12087c.invoke(Q.d(O(), null, T.a((c6531g == null || j0VarJ == null) ? S.k(O().h()) : this.f12086b.a(j0.e(j0VarJ, c6531g.v(), false, 2, null))), null, 5, null));
        }
        c0((c6531g == null || O().i().length() <= 0) ? EnumC2727q.None : EnumC2727q.Cursor);
        m0(false);
    }

    public final void v(boolean z10) {
        androidx.compose.ui.focus.o oVar;
        F.E e10 = this.f12088d;
        if (e10 != null && !e10.e() && (oVar = this.f12094j) != null) {
            oVar.f();
        }
        this.f12103s = O();
        m0(z10);
        c0(EnumC2727q.Selection);
    }

    public final void x() {
        m0(false);
        c0(EnumC2727q.None);
    }

    public final InterfaceC3923h0 y() {
        return this.f12091g;
    }
}
