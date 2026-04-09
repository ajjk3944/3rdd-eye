package E0;

import E0.G;
import E0.m0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    private final G f3793a;

    /* renamed from: b, reason: collision with root package name */
    private final C2637o f3794b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3795c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3796d;

    /* renamed from: e, reason: collision with root package name */
    private final k0 f3797e;

    /* renamed from: f, reason: collision with root package name */
    private final V.b f3798f;

    /* renamed from: g, reason: collision with root package name */
    private long f3799g;

    /* renamed from: h, reason: collision with root package name */
    private final V.b f3800h;

    /* renamed from: i, reason: collision with root package name */
    private Y0.b f3801i;

    /* renamed from: j, reason: collision with root package name */
    private final N f3802j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final G f3803a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f3804b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f3805c;

        public a(G g10, boolean z10, boolean z11) {
            this.f3803a = g10;
            this.f3804b = z10;
            this.f3805c = z11;
        }

        public final G a() {
            return this.f3803a;
        }

        public final boolean b() {
            return this.f3805c;
        }

        public final boolean c() {
            return this.f3804b;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3806a;

        static {
            int[] iArr = new int[G.e.values().length];
            try {
                iArr[G.e.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[G.e.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[G.e.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[G.e.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[G.e.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f3806a = iArr;
        }
    }

    public S(G g10) {
        this.f3793a = g10;
        m0.a aVar = m0.f3951L;
        C2637o c2637o = new C2637o(aVar.a());
        this.f3794b = c2637o;
        this.f3797e = new k0();
        this.f3798f = new V.b(new m0.b[16], 0);
        this.f3799g = 1L;
        V.b bVar = new V.b(new a[16], 0);
        this.f3800h = bVar;
        this.f3802j = aVar.a() ? new N(g10, c2637o, bVar.g()) : null;
    }

    private final void A(G g10, boolean z10) {
        Y0.b bVar;
        if (g10.L0()) {
            return;
        }
        if (g10 == this.f3793a) {
            bVar = this.f3801i;
            AbstractC6492s.f(bVar);
        } else {
            bVar = null;
        }
        if (z10) {
            e(g10, bVar);
        } else {
            f(g10, bVar);
        }
    }

    public static /* synthetic */ boolean G(S s10, G g10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return s10.F(g10, z10);
    }

    private final void b() {
        V.b bVar = this.f3798f;
        int iO = bVar.o();
        if (iO > 0) {
            Object[] objArrM = bVar.m();
            int i10 = 0;
            do {
                ((m0.b) objArrM[i10]).d();
                i10++;
            } while (i10 < iO);
        }
        this.f3798f.h();
    }

    public static /* synthetic */ void d(S s10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        s10.c(z10);
    }

    private final boolean e(G g10, Y0.b bVar) {
        if (g10.a0() == null) {
            return false;
        }
        boolean zP0 = bVar != null ? g10.P0(bVar) : G.Q0(g10, null, 1, null);
        G gO0 = g10.o0();
        if (zP0 && gO0 != null) {
            if (gO0.a0() == null) {
                G.w1(gO0, false, false, false, 3, null);
            } else if (g10.g0() == G.g.InMeasureBlock) {
                G.s1(gO0, false, false, false, 3, null);
            } else if (g10.g0() == G.g.InLayoutBlock) {
                G.q1(gO0, false, 1, null);
            }
        }
        return zP0;
    }

    private final boolean f(G g10, Y0.b bVar) {
        boolean zK1 = bVar != null ? g10.k1(bVar) : G.l1(g10, null, 1, null);
        G gO0 = g10.o0();
        if (zK1 && gO0 != null) {
            if (g10.f0() == G.g.InMeasureBlock) {
                G.w1(gO0, false, false, false, 3, null);
            } else if (g10.f0() == G.g.InLayoutBlock) {
                G.u1(gO0, false, 1, null);
            }
        }
        return zK1;
    }

    private final void g() {
        if (this.f3800h.u()) {
            V.b bVar = this.f3800h;
            int iO = bVar.o();
            if (iO > 0) {
                Object[] objArrM = bVar.m();
                int i10 = 0;
                do {
                    a aVar = (a) objArrM[i10];
                    if (aVar.a().K0()) {
                        if (aVar.c()) {
                            G.s1(aVar.a(), aVar.b(), false, false, 2, null);
                        } else {
                            G.w1(aVar.a(), aVar.b(), false, false, 2, null);
                        }
                    }
                    i10++;
                } while (i10 < iO);
            }
            this.f3800h.h();
        }
    }

    private final void h(G g10) {
        V.b bVarW0 = g10.w0();
        int iO = bVarW0.o();
        if (iO > 0) {
            Object[] objArrM = bVarW0.m();
            int i10 = 0;
            do {
                G g11 = (G) objArrM[i10];
                if (AbstractC6492s.d(g11.N0(), Boolean.TRUE) && !g11.L0()) {
                    if (this.f3794b.e(g11, true)) {
                        g11.R0();
                    }
                    h(g11);
                }
                i10++;
            } while (i10 < iO);
        }
    }

    private final void j(G g10, boolean z10) {
        V.b bVarW0 = g10.w0();
        int iO = bVarW0.o();
        if (iO > 0) {
            Object[] objArrM = bVarW0.m();
            int i10 = 0;
            do {
                G g11 = (G) objArrM[i10];
                if ((!z10 && o(g11)) || (z10 && p(g11))) {
                    if (M.a(g11) && !z10) {
                        if (g11.Y() && this.f3794b.e(g11, true)) {
                            x(g11, true, false);
                        } else {
                            i(g11, true);
                        }
                    }
                    w(g11, z10);
                    if (!u(g11, z10)) {
                        j(g11, z10);
                    }
                }
                i10++;
            } while (i10 < iO);
        }
        w(g10, z10);
    }

    private final boolean k(G g10) {
        return g10.d0() && o(g10);
    }

    private final boolean l(G g10) {
        return g10.Y() && p(g10);
    }

    private final boolean o(G g10) {
        return g10.f0() == G.g.InMeasureBlock || g10.U().r().p().k();
    }

    private final boolean p(G g10) {
        AbstractC2619a abstractC2619aP;
        if (g10.g0() == G.g.InMeasureBlock) {
            return true;
        }
        InterfaceC2621b interfaceC2621bC = g10.U().C();
        return (interfaceC2621bC == null || (abstractC2619aP = interfaceC2621bC.p()) == null || !abstractC2619aP.k()) ? false : true;
    }

    private final boolean u(G g10, boolean z10) {
        return z10 ? g10.Y() : g10.d0();
    }

    private final void w(G g10, boolean z10) {
        if (u(g10, z10) && this.f3794b.e(g10, z10)) {
            x(g10, z10, false);
        }
    }

    private final boolean x(G g10, boolean z10, boolean z11) {
        Y0.b bVar;
        G gO0;
        if (g10.L0()) {
            return false;
        }
        if (g10.q() || g10.M0() || k(g10) || AbstractC6492s.d(g10.N0(), Boolean.TRUE) || l(g10) || g10.C()) {
            if (g10 == this.f3793a) {
                bVar = this.f3801i;
                AbstractC6492s.f(bVar);
            } else {
                bVar = null;
            }
            if (z10) {
                zE = g10.Y() ? e(g10, bVar) : false;
                if (z11 && ((zE || g10.X()) && AbstractC6492s.d(g10.N0(), Boolean.TRUE))) {
                    g10.R0();
                }
            } else {
                boolean zF = g10.d0() ? f(g10, bVar) : false;
                if (z11 && g10.V() && (g10 == this.f3793a || ((gO0 = g10.o0()) != null && gO0.q() && g10.M0()))) {
                    if (g10 == this.f3793a) {
                        g10.i1(0, 0);
                    } else {
                        g10.o1();
                    }
                    this.f3797e.d(g10);
                    N n10 = this.f3802j;
                    if (n10 != null) {
                        n10.a();
                    }
                }
                zE = zF;
            }
            g();
        }
        return zE;
    }

    static /* synthetic */ boolean y(S s10, G g10, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        return s10.x(g10, z10, z11);
    }

    private final void z(G g10) {
        V.b bVarW0 = g10.w0();
        int iO = bVarW0.o();
        if (iO > 0) {
            Object[] objArrM = bVarW0.m();
            int i10 = 0;
            do {
                G g11 = (G) objArrM[i10];
                if (o(g11)) {
                    if (M.a(g11)) {
                        A(g11, true);
                    } else {
                        z(g11);
                    }
                }
                i10++;
            } while (i10 < iO);
        }
    }

    public final boolean B(G g10, boolean z10) {
        int i10 = b.f3806a[g10.W().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4 && i10 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if ((g10.Y() || g10.X()) && !z10) {
                N n10 = this.f3802j;
                if (n10 == null) {
                    return false;
                }
                n10.a();
                return false;
            }
            g10.T0();
            g10.S0();
            if (g10.L0()) {
                return false;
            }
            G gO0 = g10.o0();
            if (AbstractC6492s.d(g10.N0(), Boolean.TRUE) && ((gO0 == null || !gO0.Y()) && (gO0 == null || !gO0.X()))) {
                this.f3794b.c(g10, true);
            } else if (g10.q() && ((gO0 == null || !gO0.V()) && (gO0 == null || !gO0.d0()))) {
                this.f3794b.c(g10, false);
            }
            return !this.f3796d;
        }
        N n11 = this.f3802j;
        if (n11 == null) {
            return false;
        }
        n11.a();
        return false;
    }

    public final boolean C(G g10, boolean z10) {
        G gO0;
        G gO02;
        if (!(g10.a0() != null)) {
            B0.a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i10 = b.f3806a[g10.W().ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            this.f3800h.b(new a(g10, true, z10));
            N n10 = this.f3802j;
            if (n10 == null) {
                return false;
            }
            n10.a();
            return false;
        }
        if (i10 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        if (g10.Y() && !z10) {
            return false;
        }
        g10.U0();
        g10.V0();
        if (g10.L0()) {
            return false;
        }
        if ((AbstractC6492s.d(g10.N0(), Boolean.TRUE) || l(g10)) && ((gO0 = g10.o0()) == null || !gO0.Y())) {
            this.f3794b.c(g10, true);
        } else if ((g10.q() || k(g10)) && ((gO02 = g10.o0()) == null || !gO02.d0())) {
            this.f3794b.c(g10, false);
        }
        return !this.f3796d;
    }

    public final void D(G g10) {
        this.f3797e.d(g10);
    }

    public final boolean E(G g10, boolean z10) {
        int i10 = b.f3806a[g10.W().ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            N n10 = this.f3802j;
            if (n10 != null) {
                n10.a();
            }
        } else {
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            if (!z10 && g10.q() == g10.M0() && (g10.d0() || g10.V())) {
                N n11 = this.f3802j;
                if (n11 != null) {
                    n11.a();
                }
            } else {
                g10.S0();
                if (!g10.L0() && g10.M0()) {
                    G gO0 = g10.o0();
                    if ((gO0 == null || !gO0.V()) && (gO0 == null || !gO0.d0())) {
                        this.f3794b.c(g10, false);
                    }
                    if (!this.f3796d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean F(G g10, boolean z10) {
        int i10 = b.f3806a[g10.W().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                this.f3800h.b(new a(g10, false, z10));
                N n10 = this.f3802j;
                if (n10 != null) {
                    n10.a();
                }
            } else {
                if (i10 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!g10.d0() || z10) {
                    g10.V0();
                    if (!g10.L0() && (g10.q() || k(g10))) {
                        G gO0 = g10.o0();
                        if (gO0 == null || !gO0.d0()) {
                            this.f3794b.c(g10, false);
                        }
                        if (!this.f3796d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void H(long j10) {
        Y0.b bVar = this.f3801i;
        if (bVar == null ? false : Y0.b.f(bVar.r(), j10)) {
            return;
        }
        if (this.f3795c) {
            B0.a.a("updateRootConstraints called while measuring");
        }
        this.f3801i = Y0.b.a(j10);
        if (this.f3793a.a0() != null) {
            this.f3793a.U0();
        }
        this.f3793a.V0();
        C2637o c2637o = this.f3794b;
        G g10 = this.f3793a;
        c2637o.c(g10, g10.a0() != null);
    }

    public final void c(boolean z10) {
        if (z10) {
            this.f3797e.e(this.f3793a);
        }
        this.f3797e.a();
    }

    public final void i(G g10, boolean z10) {
        if (this.f3794b.g(z10)) {
            return;
        }
        if (!this.f3795c) {
            B0.a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (u(g10, z10)) {
            B0.a.a("node not yet measured");
        }
        j(g10, z10);
    }

    public final boolean m() {
        return this.f3794b.h();
    }

    public final boolean n() {
        return this.f3797e.c();
    }

    public final long q() {
        if (!this.f3795c) {
            B0.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return this.f3799g;
    }

    public final boolean r(InterfaceC6824a interfaceC6824a) {
        boolean z10;
        if (!this.f3793a.K0()) {
            B0.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!this.f3793a.q()) {
            B0.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f3795c) {
            B0.a.a("performMeasureAndLayout called during measure layout");
        }
        boolean z11 = false;
        if (this.f3801i != null) {
            this.f3795c = true;
            this.f3796d = true;
            try {
                if (this.f3794b.h()) {
                    C2637o c2637o = this.f3794b;
                    z10 = false;
                    while (c2637o.h()) {
                        boolean zD = c2637o.f3959a.d();
                        boolean z12 = !zD;
                        G gE = (!zD ? c2637o.f3959a : c2637o.f3960b).e();
                        boolean zY = y(this, gE, z12, false, 4, null);
                        if (gE == this.f3793a && zY) {
                            z10 = true;
                        }
                    }
                    if (interfaceC6824a != null) {
                        interfaceC6824a.invoke();
                    }
                } else {
                    z10 = false;
                }
                this.f3795c = false;
                this.f3796d = false;
                N n10 = this.f3802j;
                if (n10 != null) {
                    n10.a();
                }
                z11 = z10;
            } catch (Throwable th2) {
                this.f3795c = false;
                this.f3796d = false;
                throw th2;
            }
        }
        b();
        return z11;
    }

    public final void s(G g10, long j10) {
        if (g10.L0()) {
            return;
        }
        if (AbstractC6492s.d(g10, this.f3793a)) {
            B0.a.a("measureAndLayout called on root");
        }
        if (!this.f3793a.K0()) {
            B0.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!this.f3793a.q()) {
            B0.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f3795c) {
            B0.a.a("performMeasureAndLayout called during measure layout");
        }
        if (this.f3801i != null) {
            this.f3795c = true;
            this.f3796d = false;
            try {
                this.f3794b.i(g10);
                if (e(g10, Y0.b.a(j10)) || g10.X()) {
                    if (AbstractC6492s.d(g10.N0(), Boolean.TRUE)) {
                        g10.R0();
                    }
                }
                h(g10);
                f(g10, Y0.b.a(j10));
                if (g10.V() && g10.q()) {
                    g10.o1();
                    this.f3797e.d(g10);
                }
                g();
                this.f3795c = false;
                this.f3796d = false;
                N n10 = this.f3802j;
                if (n10 != null) {
                    n10.a();
                }
            } catch (Throwable th2) {
                this.f3795c = false;
                this.f3796d = false;
                throw th2;
            }
        }
        b();
    }

    public final void t() {
        if (this.f3794b.h()) {
            if (!this.f3793a.K0()) {
                B0.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!this.f3793a.q()) {
                B0.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f3795c) {
                B0.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.f3801i != null) {
                this.f3795c = true;
                this.f3796d = false;
                try {
                    if (!this.f3794b.g(true)) {
                        if (this.f3793a.a0() != null) {
                            A(this.f3793a, true);
                        } else {
                            z(this.f3793a);
                        }
                    }
                    A(this.f3793a, false);
                    this.f3795c = false;
                    this.f3796d = false;
                    N n10 = this.f3802j;
                    if (n10 != null) {
                        n10.a();
                    }
                } catch (Throwable th2) {
                    this.f3795c = false;
                    this.f3796d = false;
                    throw th2;
                }
            }
        }
    }

    public final void v(G g10) {
        this.f3794b.i(g10);
        this.f3797e.f(g10);
    }
}
