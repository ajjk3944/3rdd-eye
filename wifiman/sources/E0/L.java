package E0;

import C0.AbstractC2521a;
import E0.G;
import Y0.n;
import androidx.compose.ui.layout.t;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.PduHandle;
import p0.C7182c;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    private final G f3669a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3670b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3672d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3673e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3674f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3675g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3676h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f3677i;

    /* renamed from: j, reason: collision with root package name */
    private int f3678j;

    /* renamed from: k, reason: collision with root package name */
    private int f3679k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f3680l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f3681m;

    /* renamed from: n, reason: collision with root package name */
    private int f3682n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f3683o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f3684p;

    /* renamed from: q, reason: collision with root package name */
    private int f3685q;

    /* renamed from: s, reason: collision with root package name */
    private a f3687s;

    /* renamed from: c, reason: collision with root package name */
    private G.e f3671c = G.e.Idle;

    /* renamed from: r, reason: collision with root package name */
    private final b f3686r = new b();

    /* renamed from: t, reason: collision with root package name */
    private long f3688t = Y0.c.b(0, 0, 0, 0, 15, null);

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC6824a f3689u = new d();

    public final class a extends androidx.compose.ui.layout.t implements C0.B, InterfaceC2621b, W {

        /* renamed from: f, reason: collision with root package name */
        private boolean f3691f;

        /* renamed from: j, reason: collision with root package name */
        private boolean f3695j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f3696k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f3697l;

        /* renamed from: m, reason: collision with root package name */
        private Y0.b f3698m;

        /* renamed from: o, reason: collision with root package name */
        private float f3700o;

        /* renamed from: p, reason: collision with root package name */
        private InterfaceC6835l f3701p;

        /* renamed from: q, reason: collision with root package name */
        private C7182c f3702q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f3703r;

        /* renamed from: v, reason: collision with root package name */
        private boolean f3707v;

        /* renamed from: y, reason: collision with root package name */
        private boolean f3710y;

        /* renamed from: z, reason: collision with root package name */
        private boolean f3711z;

        /* renamed from: g, reason: collision with root package name */
        private int f3692g = MPv3.MAX_MESSAGE_ID;

        /* renamed from: h, reason: collision with root package name */
        private int f3693h = MPv3.MAX_MESSAGE_ID;

        /* renamed from: i, reason: collision with root package name */
        private G.g f3694i = G.g.NotUsed;

        /* renamed from: n, reason: collision with root package name */
        private long f3699n = Y0.n.f24536b.a();

        /* renamed from: s, reason: collision with root package name */
        private final AbstractC2619a f3704s = new O(this);

        /* renamed from: t, reason: collision with root package name */
        private final V.b f3705t = new V.b(new a[16], 0);

        /* renamed from: u, reason: collision with root package name */
        private boolean f3706u = true;

        /* renamed from: w, reason: collision with root package name */
        private boolean f3708w = true;

        /* renamed from: x, reason: collision with root package name */
        private Object f3709x = g1().b();

        /* renamed from: E0.L$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0163a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3712a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f3713b;

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
                    iArr[G.e.LayingOut.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[G.e.LookaheadLayingOut.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f3712a = iArr;
                int[] iArr2 = new int[G.g.values().length];
                try {
                    iArr2[G.g.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[G.g.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                f3713b = iArr2;
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Q f3715b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ L f3716c;

            /* renamed from: E0.L$a$b$a, reason: collision with other inner class name */
            static final class C0164a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final C0164a f3717a = new C0164a();

                C0164a() {
                    super(1);
                }

                public final void a(InterfaceC2621b interfaceC2621b) {
                    interfaceC2621b.p().t(false);
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((InterfaceC2621b) obj);
                    return Yg.J.f24997a;
                }
            }

            /* renamed from: E0.L$a$b$b, reason: collision with other inner class name */
            static final class C0165b extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final C0165b f3718a = new C0165b();

                C0165b() {
                    super(1);
                }

                public final void a(InterfaceC2621b interfaceC2621b) {
                    interfaceC2621b.p().q(interfaceC2621b.p().l());
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((InterfaceC2621b) obj);
                    return Yg.J.f24997a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Q q10, L l10) {
                super(0);
                this.f3715b = q10;
                this.f3716c = l10;
            }

            public final void a() {
                a.this.W0();
                a.this.Q(C0164a.f3717a);
                Q qC2 = a.this.B().C2();
                if (qC2 != null) {
                    boolean zL1 = qC2.L1();
                    List listH = this.f3716c.f3669a.H();
                    int size = listH.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Q qC22 = ((G) listH.get(i10)).m0().C2();
                        if (qC22 != null) {
                            qC22.S1(zL1);
                        }
                    }
                }
                this.f3715b.h1().q();
                Q qC23 = a.this.B().C2();
                if (qC23 != null) {
                    qC23.L1();
                    List listH2 = this.f3716c.f3669a.H();
                    int size2 = listH2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        Q qC24 = ((G) listH2.get(i11)).m0().C2();
                        if (qC24 != null) {
                            qC24.S1(false);
                        }
                    }
                }
                a.this.V0();
                a.this.Q(C0165b.f3718a);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Yg.J.f24997a;
            }
        }

        static final class c extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L f3719a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m0 f3720b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f3721c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(L l10, m0 m0Var, long j10) {
                super(0);
                this.f3719a = l10;
                this.f3720b = m0Var;
                this.f3721c = j10;
            }

            public final void a() {
                Q qC2;
                t.a aVarQ1 = null;
                if (M.a(this.f3719a.f3669a)) {
                    AbstractC2624c0 abstractC2624c0I2 = this.f3719a.K().I2();
                    if (abstractC2624c0I2 != null) {
                        aVarQ1 = abstractC2624c0I2.q1();
                    }
                } else {
                    AbstractC2624c0 abstractC2624c0I22 = this.f3719a.K().I2();
                    if (abstractC2624c0I22 != null && (qC2 = abstractC2624c0I22.C2()) != null) {
                        aVarQ1 = qC2.q1();
                    }
                }
                if (aVarQ1 == null) {
                    aVarQ1 = this.f3720b.getPlacementScope();
                }
                L l10 = this.f3719a;
                long j10 = this.f3721c;
                Q qC22 = l10.K().C2();
                AbstractC6492s.f(qC22);
                t.a.j(aVarQ1, qC22, j10, 0.0f, 2, null);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Yg.J.f24997a;
            }
        }

        static final class d extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final d f3722a = new d();

            d() {
                super(1);
            }

            public final void a(InterfaceC2621b interfaceC2621b) {
                interfaceC2621b.p().u(false);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((InterfaceC2621b) obj);
                return Yg.J.f24997a;
            }
        }

        public a() {
        }

        private final void B1() {
            if (q()) {
                int i10 = 0;
                a2(false);
                V.b bVarW0 = L.this.f3669a.w0();
                int iO = bVarW0.o();
                if (iO > 0) {
                    Object[] objArrM = bVarW0.m();
                    do {
                        a aVarH = ((G) objArrM[i10]).U().H();
                        AbstractC6492s.f(aVarH);
                        aVarH.B1();
                        i10++;
                    } while (i10 < iO);
                }
            }
        }

        private final void J1() {
            G g10 = L.this.f3669a;
            L l10 = L.this;
            V.b bVarW0 = g10.w0();
            int iO = bVarW0.o();
            if (iO > 0) {
                Object[] objArrM = bVarW0.m();
                int i10 = 0;
                do {
                    G g11 = (G) objArrM[i10];
                    if (g11.Y() && g11.g0() == G.g.InMeasureBlock) {
                        a aVarH = g11.U().H();
                        AbstractC6492s.f(aVarH);
                        Y0.b bVarZ = g11.U().z();
                        AbstractC6492s.f(bVarZ);
                        if (aVarH.S1(bVarZ.r())) {
                            G.s1(l10.f3669a, false, false, false, 7, null);
                        }
                    }
                    i10++;
                } while (i10 < iO);
            }
        }

        private final void L1() {
            G.s1(L.this.f3669a, false, false, false, 7, null);
            G gO0 = L.this.f3669a.o0();
            if (gO0 == null || L.this.f3669a.T() != G.g.NotUsed) {
                return;
            }
            G g10 = L.this.f3669a;
            int i10 = C0163a.f3712a[gO0.W().ordinal()];
            g10.D1(i10 != 2 ? i10 != 3 ? gO0.T() : G.g.InLayoutBlock : G.g.InMeasureBlock);
        }

        private final void R1(long j10, float f10, InterfaceC6835l interfaceC6835l, C7182c c7182c) {
            if (L.this.f3669a.L0()) {
                B0.a.a("place is called on a deactivated node");
            }
            L.this.f3671c = G.e.LookaheadLayingOut;
            this.f3696k = true;
            this.f3711z = false;
            if (!Y0.n.g(j10, this.f3699n)) {
                if (L.this.D() || L.this.E()) {
                    L.this.f3676h = true;
                }
                E1();
            }
            m0 m0VarB = K.b(L.this.f3669a);
            if (L.this.F() || !q()) {
                L.this.a0(false);
                p().r(false);
                o0.d(m0VarB.getSnapshotObserver(), L.this.f3669a, false, new c(L.this, m0VarB, j10), 2, null);
            } else {
                Q qC2 = L.this.K().C2();
                AbstractC6492s.f(qC2);
                qC2.i2(j10);
                O1();
            }
            this.f3699n = j10;
            this.f3700o = f10;
            this.f3701p = interfaceC6835l;
            this.f3702q = c7182c;
            L.this.f3671c = G.e.Idle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void V0() {
            V.b bVarW0 = L.this.f3669a.w0();
            int iO = bVarW0.o();
            if (iO > 0) {
                Object[] objArrM = bVarW0.m();
                int i10 = 0;
                do {
                    a aVarH = ((G) objArrM[i10]).U().H();
                    AbstractC6492s.f(aVarH);
                    int i11 = aVarH.f3692g;
                    int i12 = aVarH.f3693h;
                    if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                        aVarH.B1();
                    }
                    i10++;
                } while (i10 < iO);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void W0() {
            int i10 = 0;
            L.this.f3678j = 0;
            V.b bVarW0 = L.this.f3669a.w0();
            int iO = bVarW0.o();
            if (iO > 0) {
                Object[] objArrM = bVarW0.m();
                do {
                    a aVarH = ((G) objArrM[i10]).U().H();
                    AbstractC6492s.f(aVarH);
                    aVarH.f3692g = aVarH.f3693h;
                    aVarH.f3693h = MPv3.MAX_MESSAGE_ID;
                    if (aVarH.f3694i == G.g.InLayoutBlock) {
                        aVarH.f3694i = G.g.NotUsed;
                    }
                    i10++;
                } while (i10 < iO);
            }
        }

        private final void b2(G g10) {
            G.g gVar;
            G gO0 = g10.o0();
            if (gO0 == null) {
                this.f3694i = G.g.NotUsed;
                return;
            }
            if (!(this.f3694i == G.g.NotUsed || g10.E())) {
                B0.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i10 = C0163a.f3712a[gO0.W().ordinal()];
            if (i10 == 1 || i10 == 2) {
                gVar = G.g.InMeasureBlock;
            } else {
                if (i10 != 3 && i10 != 4) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + gO0.W());
                }
                gVar = G.g.InLayoutBlock;
            }
            this.f3694i = gVar;
        }

        private final void z1() {
            boolean zQ = q();
            a2(true);
            if (!zQ && L.this.G()) {
                G.s1(L.this.f3669a, true, false, false, 6, null);
            }
            V.b bVarW0 = L.this.f3669a.w0();
            int iO = bVarW0.o();
            if (iO > 0) {
                Object[] objArrM = bVarW0.m();
                int i10 = 0;
                do {
                    G g10 = (G) objArrM[i10];
                    a aVarZ = g10.Z();
                    if (aVarZ == null) {
                        throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                    }
                    if (aVarZ.f3693h != Integer.MAX_VALUE) {
                        aVarZ.z1();
                        g10.x1(g10);
                    }
                    i10++;
                } while (i10 < iO);
            }
        }

        @Override // E0.InterfaceC2621b
        public AbstractC2624c0 B() {
            return L.this.f3669a.P();
        }

        @Override // androidx.compose.ui.layout.t
        public int D0() {
            Q qC2 = L.this.K().C2();
            AbstractC6492s.f(qC2);
            return qC2.D0();
        }

        public final void E1() {
            V.b bVarW0;
            int iO;
            if (L.this.t() <= 0 || (iO = (bVarW0 = L.this.f3669a.w0()).o()) <= 0) {
                return;
            }
            Object[] objArrM = bVarW0.m();
            int i10 = 0;
            do {
                G g10 = (G) objArrM[i10];
                L lU = g10.U();
                if ((lU.E() || lU.D()) && !lU.F()) {
                    G.q1(g10, false, 1, null);
                }
                a aVarH = lU.H();
                if (aVarH != null) {
                    aVarH.E1();
                }
                i10++;
            } while (i10 < iO);
        }

        @Override // androidx.compose.ui.layout.t
        public int G0() {
            Q qC2 = L.this.K().C2();
            AbstractC6492s.f(qC2);
            return qC2.G0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.t
        public void K0(long j10, float f10, InterfaceC6835l interfaceC6835l) {
            R1(j10, f10, interfaceC6835l, null);
        }

        @Override // E0.InterfaceC2621b
        public InterfaceC2621b L() {
            L lU;
            G gO0 = L.this.f3669a.o0();
            if (gO0 == null || (lU = gO0.U()) == null) {
                return null;
            }
            return lU.C();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.t
        public void L0(long j10, float f10, C7182c c7182c) {
            R1(j10, f10, null, c7182c);
        }

        public final void M1() {
            this.f3693h = MPv3.MAX_MESSAGE_ID;
            this.f3692g = MPv3.MAX_MESSAGE_ID;
            a2(false);
        }

        public final void O1() {
            this.f3711z = true;
            G gO0 = L.this.f3669a.o0();
            if (!q()) {
                z1();
                if (this.f3691f && gO0 != null) {
                    G.q1(gO0, false, 1, null);
                }
            }
            if (gO0 == null) {
                this.f3693h = 0;
            } else if (!this.f3691f && (gO0.W() == G.e.LayingOut || gO0.W() == G.e.LookaheadLayingOut)) {
                if (!(this.f3693h == Integer.MAX_VALUE)) {
                    B0.a.b("Place was called on a node which was placed already");
                }
                this.f3693h = gO0.U().f3678j;
                gO0.U().f3678j++;
            }
            g0();
        }

        @Override // E0.InterfaceC2621b
        public void Q(InterfaceC6835l interfaceC6835l) {
            V.b bVarW0 = L.this.f3669a.w0();
            int iO = bVarW0.o();
            if (iO > 0) {
                Object[] objArrM = bVarW0.m();
                int i10 = 0;
                do {
                    InterfaceC2621b interfaceC2621bC = ((G) objArrM[i10]).U().C();
                    AbstractC6492s.f(interfaceC2621bC);
                    interfaceC6835l.invoke(interfaceC2621bC);
                    i10++;
                } while (i10 < iO);
            }
        }

        @Override // C0.InterfaceC2534n
        public int R(int i10) {
            L1();
            Q qC2 = L.this.K().C2();
            AbstractC6492s.f(qC2);
            return qC2.R(i10);
        }

        @Override // C0.InterfaceC2534n
        public int S(int i10) {
            L1();
            Q qC2 = L.this.K().C2();
            AbstractC6492s.f(qC2);
            return qC2.S(i10);
        }

        public final boolean S1(long j10) {
            if (L.this.f3669a.L0()) {
                B0.a.a("measure is called on a deactivated node");
            }
            G gO0 = L.this.f3669a.o0();
            L.this.f3669a.A1(L.this.f3669a.E() || (gO0 != null && gO0.E()));
            if (!L.this.f3669a.Y()) {
                Y0.b bVar = this.f3698m;
                if (bVar == null ? false : Y0.b.f(bVar.r(), j10)) {
                    m0 m0VarN0 = L.this.f3669a.n0();
                    if (m0VarN0 != null) {
                        m0VarN0.s(L.this.f3669a, true);
                    }
                    L.this.f3669a.z1();
                    return false;
                }
            }
            this.f3698m = Y0.b.a(j10);
            S0(j10);
            p().s(false);
            Q(d.f3722a);
            long jE0 = this.f3697l ? E0() : Y0.s.a(PduHandle.NONE, PduHandle.NONE);
            this.f3697l = true;
            Q qC2 = L.this.K().C2();
            if (!(qC2 != null)) {
                B0.a.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            L.this.T(j10);
            Q0(Y0.s.a(qC2.I0(), qC2.C0()));
            return (Y0.r.g(jE0) == qC2.I0() && Y0.r.f(jE0) == qC2.C0()) ? false : true;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
        @Override // C0.B
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.compose.ui.layout.t T(long r4) {
            /*
                r3 = this;
                E0.L r0 = E0.L.this
                E0.G r0 = E0.L.a(r0)
                E0.G r0 = r0.o0()
                r1 = 0
                if (r0 == 0) goto L12
                E0.G$e r0 = r0.W()
                goto L13
            L12:
                r0 = r1
            L13:
                E0.G$e r2 = E0.G.e.LookaheadMeasuring
                if (r0 == r2) goto L2b
                E0.L r0 = E0.L.this
                E0.G r0 = E0.L.a(r0)
                E0.G r0 = r0.o0()
                if (r0 == 0) goto L27
                E0.G$e r1 = r0.W()
            L27:
                E0.G$e r0 = E0.G.e.LookaheadLayingOut
                if (r1 != r0) goto L31
            L2b:
                E0.L r0 = E0.L.this
                r1 = 0
                E0.L.i(r0, r1)
            L31:
                E0.L r0 = E0.L.this
                E0.G r0 = E0.L.a(r0)
                r3.b2(r0)
                E0.L r0 = E0.L.this
                E0.G r0 = E0.L.a(r0)
                E0.G$g r0 = r0.T()
                E0.G$g r1 = E0.G.g.NotUsed
                if (r0 != r1) goto L51
                E0.L r0 = E0.L.this
                E0.G r0 = E0.L.a(r0)
                r0.v()
            L51:
                r3.S1(r4)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: E0.L.a.T(long):androidx.compose.ui.layout.t");
        }

        public final void U1() {
            G gO0;
            try {
                this.f3691f = true;
                if (!this.f3696k) {
                    B0.a.b("replace() called on item that was not placed");
                }
                this.f3711z = false;
                boolean zQ = q();
                R1(this.f3699n, 0.0f, this.f3701p, this.f3702q);
                if (zQ && !this.f3711z && (gO0 = L.this.f3669a.o0()) != null) {
                    G.q1(gO0, false, 1, null);
                }
                this.f3691f = false;
            } catch (Throwable th2) {
                this.f3691f = false;
                throw th2;
            }
        }

        public final void W1(boolean z10) {
            this.f3706u = z10;
        }

        @Override // C0.E
        public int X(AbstractC2521a abstractC2521a) {
            G gO0 = L.this.f3669a.o0();
            if ((gO0 != null ? gO0.W() : null) == G.e.LookaheadMeasuring) {
                p().u(true);
            } else {
                G gO02 = L.this.f3669a.o0();
                if ((gO02 != null ? gO02.W() : null) == G.e.LookaheadLayingOut) {
                    p().t(true);
                }
            }
            this.f3695j = true;
            Q qC2 = L.this.K().C2();
            AbstractC6492s.f(qC2);
            int iX = qC2.X(abstractC2521a);
            this.f3695j = false;
            return iX;
        }

        public final List Y0() {
            L.this.f3669a.H();
            if (!this.f3706u) {
                return this.f3705t.g();
            }
            G g10 = L.this.f3669a;
            V.b bVar = this.f3705t;
            V.b bVarW0 = g10.w0();
            int iO = bVarW0.o();
            if (iO > 0) {
                Object[] objArrM = bVarW0.m();
                int i10 = 0;
                do {
                    G g11 = (G) objArrM[i10];
                    if (bVar.o() <= i10) {
                        a aVarH = g11.U().H();
                        AbstractC6492s.f(aVarH);
                        bVar.b(aVarH);
                    } else {
                        a aVarH2 = g11.U().H();
                        AbstractC6492s.f(aVarH2);
                        bVar.C(i10, aVarH2);
                    }
                    i10++;
                } while (i10 < iO);
            }
            bVar.A(g10.H().size(), bVar.o());
            this.f3706u = false;
            return this.f3705t.g();
        }

        public final void Y1(G.g gVar) {
            this.f3694i = gVar;
        }

        public final Y0.b Z0() {
            return this.f3698m;
        }

        public final void Z1(int i10) {
            this.f3693h = i10;
        }

        public void a2(boolean z10) {
            this.f3703r = z10;
        }

        @Override // C0.E, C0.InterfaceC2534n
        public Object b() {
            return this.f3709x;
        }

        public final boolean c1() {
            return this.f3707v;
        }

        public final boolean c2() {
            if (b() == null) {
                Q qC2 = L.this.K().C2();
                AbstractC6492s.f(qC2);
                if (qC2.b() == null) {
                    return false;
                }
            }
            if (!this.f3708w) {
                return false;
            }
            this.f3708w = false;
            Q qC22 = L.this.K().C2();
            AbstractC6492s.f(qC22);
            this.f3709x = qC22.b();
            return true;
        }

        @Override // E0.InterfaceC2621b
        public void g0() {
            this.f3707v = true;
            p().o();
            if (L.this.F()) {
                J1();
            }
            Q qC2 = B().C2();
            AbstractC6492s.f(qC2);
            if (L.this.f3677i || (!this.f3695j && !qC2.L1() && L.this.F())) {
                L.this.f3676h = false;
                G.e eVarB = L.this.B();
                L.this.f3671c = G.e.LookaheadLayingOut;
                m0 m0VarB = K.b(L.this.f3669a);
                L.this.b0(false);
                o0.f(m0VarB.getSnapshotObserver(), L.this.f3669a, false, new b(qC2, L.this), 2, null);
                L.this.f3671c = eVarB;
                if (L.this.E() && qC2.L1()) {
                    requestLayout();
                }
                L.this.f3677i = false;
            }
            if (p().l()) {
                p().q(true);
            }
            if (p().g() && p().k()) {
                p().n();
            }
            this.f3707v = false;
        }

        public final b g1() {
            return L.this.I();
        }

        public final G.g h1() {
            return this.f3694i;
        }

        @Override // E0.W
        public void k0(boolean z10) {
            Q qC2;
            Q qC22 = L.this.K().C2();
            if (!AbstractC6492s.d(Boolean.valueOf(z10), qC22 != null ? Boolean.valueOf(qC22.J1()) : null) && (qC2 = L.this.K().C2()) != null) {
                qC2.k0(z10);
            }
            this.f3710y = z10;
        }

        public final boolean o1() {
            return this.f3696k;
        }

        @Override // E0.InterfaceC2621b
        public AbstractC2619a p() {
            return this.f3704s;
        }

        @Override // E0.InterfaceC2621b
        public boolean q() {
            return this.f3703r;
        }

        public final void q1(boolean z10) {
            G g10;
            G gO0 = L.this.f3669a.o0();
            G.g gVarT = L.this.f3669a.T();
            if (gO0 == null || gVarT == G.g.NotUsed) {
                return;
            }
            do {
                g10 = gO0;
                if (g10.T() != gVarT) {
                    break;
                } else {
                    gO0 = g10.o0();
                }
            } while (gO0 != null);
            int i10 = C0163a.f3713b[gVarT.ordinal()];
            if (i10 == 1) {
                if (g10.a0() != null) {
                    G.s1(g10, z10, false, false, 6, null);
                    return;
                } else {
                    G.w1(g10, z10, false, false, 6, null);
                    return;
                }
            }
            if (i10 != 2) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (g10.a0() != null) {
                g10.p1(z10);
            } else {
                g10.t1(z10);
            }
        }

        @Override // E0.InterfaceC2621b
        public void r0() {
            G.s1(L.this.f3669a, false, false, false, 7, null);
        }

        public final void r1() {
            this.f3708w = true;
        }

        @Override // E0.InterfaceC2621b
        public void requestLayout() {
            G.q1(L.this.f3669a, false, 1, null);
        }

        @Override // C0.InterfaceC2534n
        public int s(int i10) {
            L1();
            Q qC2 = L.this.K().C2();
            AbstractC6492s.f(qC2);
            return qC2.s(i10);
        }

        @Override // C0.InterfaceC2534n
        public int s0(int i10) {
            L1();
            Q qC2 = L.this.K().C2();
            AbstractC6492s.f(qC2);
            return qC2.s0(i10);
        }

        @Override // E0.InterfaceC2621b
        public Map v() {
            if (!this.f3695j) {
                if (L.this.B() == G.e.LookaheadMeasuring) {
                    p().s(true);
                    if (p().g()) {
                        L.this.P();
                    }
                } else {
                    p().r(true);
                }
            }
            Q qC2 = B().C2();
            if (qC2 != null) {
                qC2.S1(true);
            }
            g0();
            Q qC22 = B().C2();
            if (qC22 != null) {
                qC22.S1(false);
            }
            return p().h();
        }
    }

    public final class b extends androidx.compose.ui.layout.t implements C0.B, InterfaceC2621b, W {

        /* renamed from: A, reason: collision with root package name */
        private boolean f3723A;

        /* renamed from: B, reason: collision with root package name */
        private InterfaceC6835l f3724B;

        /* renamed from: C, reason: collision with root package name */
        private C7182c f3725C;

        /* renamed from: D, reason: collision with root package name */
        private long f3726D;

        /* renamed from: E, reason: collision with root package name */
        private float f3727E;

        /* renamed from: F, reason: collision with root package name */
        private final InterfaceC6824a f3728F;

        /* renamed from: G, reason: collision with root package name */
        private boolean f3729G;

        /* renamed from: H, reason: collision with root package name */
        private boolean f3730H;

        /* renamed from: f, reason: collision with root package name */
        private boolean f3732f;

        /* renamed from: i, reason: collision with root package name */
        private boolean f3735i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f3736j;

        /* renamed from: l, reason: collision with root package name */
        private boolean f3738l;

        /* renamed from: m, reason: collision with root package name */
        private long f3739m;

        /* renamed from: n, reason: collision with root package name */
        private InterfaceC6835l f3740n;

        /* renamed from: o, reason: collision with root package name */
        private C7182c f3741o;

        /* renamed from: p, reason: collision with root package name */
        private float f3742p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f3743q;

        /* renamed from: r, reason: collision with root package name */
        private Object f3744r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f3745s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f3746t;

        /* renamed from: u, reason: collision with root package name */
        private final AbstractC2619a f3747u;

        /* renamed from: v, reason: collision with root package name */
        private final V.b f3748v;

        /* renamed from: w, reason: collision with root package name */
        private boolean f3749w;

        /* renamed from: x, reason: collision with root package name */
        private boolean f3750x;

        /* renamed from: y, reason: collision with root package name */
        private final InterfaceC6824a f3751y;

        /* renamed from: z, reason: collision with root package name */
        private float f3752z;

        /* renamed from: g, reason: collision with root package name */
        private int f3733g = MPv3.MAX_MESSAGE_ID;

        /* renamed from: h, reason: collision with root package name */
        private int f3734h = MPv3.MAX_MESSAGE_ID;

        /* renamed from: k, reason: collision with root package name */
        private G.g f3737k = G.g.NotUsed;

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3753a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f3754b;

            static {
                int[] iArr = new int[G.e.values().length];
                try {
                    iArr[G.e.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[G.e.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f3753a = iArr;
                int[] iArr2 = new int[G.g.values().length];
                try {
                    iArr2[G.g.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[G.g.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                f3754b = iArr2;
            }
        }

        /* renamed from: E0.L$b$b, reason: collision with other inner class name */
        static final class C0166b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: E0.L$b$b$a */
            static final class a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final a f3756a = new a();

                a() {
                    super(1);
                }

                public final void a(InterfaceC2621b interfaceC2621b) {
                    interfaceC2621b.p().t(false);
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((InterfaceC2621b) obj);
                    return Yg.J.f24997a;
                }
            }

            /* renamed from: E0.L$b$b$b, reason: collision with other inner class name */
            static final class C0167b extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                public static final C0167b f3757a = new C0167b();

                C0167b() {
                    super(1);
                }

                public final void a(InterfaceC2621b interfaceC2621b) {
                    interfaceC2621b.p().q(interfaceC2621b.p().l());
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((InterfaceC2621b) obj);
                    return Yg.J.f24997a;
                }
            }

            C0166b() {
                super(0);
            }

            public final void a() {
                b.this.g1();
                b.this.Q(a.f3756a);
                b.this.B().h1().q();
                b.this.c1();
                b.this.Q(C0167b.f3757a);
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Yg.J.f24997a;
            }
        }

        static final class c extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L f3758a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f3759b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(L l10, b bVar) {
                super(0);
                this.f3758a = l10;
                this.f3759b = bVar;
            }

            public final void a() {
                t.a placementScope;
                AbstractC2624c0 abstractC2624c0I2 = this.f3758a.K().I2();
                if (abstractC2624c0I2 == null || (placementScope = abstractC2624c0I2.q1()) == null) {
                    placementScope = K.b(this.f3758a.f3669a).getPlacementScope();
                }
                t.a aVar = placementScope;
                b bVar = this.f3759b;
                L l10 = this.f3758a;
                InterfaceC6835l interfaceC6835l = bVar.f3724B;
                C7182c c7182c = bVar.f3725C;
                if (c7182c != null) {
                    aVar.x(l10.K(), bVar.f3726D, c7182c, bVar.f3727E);
                } else if (interfaceC6835l == null) {
                    aVar.i(l10.K(), bVar.f3726D, bVar.f3727E);
                } else {
                    aVar.w(l10.K(), bVar.f3726D, bVar.f3727E, interfaceC6835l);
                }
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Yg.J.f24997a;
            }
        }

        static final class d extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final d f3760a = new d();

            d() {
                super(1);
            }

            public final void a(InterfaceC2621b interfaceC2621b) {
                interfaceC2621b.p().u(false);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((InterfaceC2621b) obj);
                return Yg.J.f24997a;
            }
        }

        public b() {
            n.a aVar = Y0.n.f24536b;
            this.f3739m = aVar.a();
            this.f3743q = true;
            this.f3747u = new H(this);
            this.f3748v = new V.b(new b[16], 0);
            this.f3749w = true;
            this.f3751y = new C0166b();
            this.f3726D = aVar.a();
            this.f3728F = new c(L.this, this);
        }

        private final void O1() {
            boolean zQ = q();
            g2(true);
            G g10 = L.this.f3669a;
            if (!zQ) {
                if (g10.d0()) {
                    G.w1(g10, true, false, false, 6, null);
                } else if (g10.Y()) {
                    G.s1(g10, true, false, false, 6, null);
                }
            }
            AbstractC2624c0 abstractC2624c0H2 = g10.P().H2();
            for (AbstractC2624c0 abstractC2624c0M0 = g10.m0(); !AbstractC6492s.d(abstractC2624c0M0, abstractC2624c0H2) && abstractC2624c0M0 != null; abstractC2624c0M0 = abstractC2624c0M0.H2()) {
                if (abstractC2624c0M0.z2()) {
                    abstractC2624c0M0.R2();
                }
            }
            V.b bVarW0 = g10.w0();
            int iO = bVarW0.o();
            if (iO > 0) {
                Object[] objArrM = bVarW0.m();
                int i10 = 0;
                do {
                    G g11 = (G) objArrM[i10];
                    if (g11.p0() != Integer.MAX_VALUE) {
                        g11.c0().O1();
                        g10.x1(g11);
                    }
                    i10++;
                } while (i10 < iO);
            }
        }

        private final void R1() {
            if (q()) {
                int i10 = 0;
                g2(false);
                G g10 = L.this.f3669a;
                AbstractC2624c0 abstractC2624c0H2 = g10.P().H2();
                for (AbstractC2624c0 abstractC2624c0M0 = g10.m0(); !AbstractC6492s.d(abstractC2624c0M0, abstractC2624c0H2) && abstractC2624c0M0 != null; abstractC2624c0M0 = abstractC2624c0M0.H2()) {
                    abstractC2624c0M0.h3();
                }
                V.b bVarW0 = L.this.f3669a.w0();
                int iO = bVarW0.o();
                if (iO > 0) {
                    Object[] objArrM = bVarW0.m();
                    do {
                        ((G) objArrM[i10]).c0().R1();
                        i10++;
                    } while (i10 < iO);
                }
            }
        }

        private final void U1() {
            G g10 = L.this.f3669a;
            L l10 = L.this;
            V.b bVarW0 = g10.w0();
            int iO = bVarW0.o();
            if (iO > 0) {
                Object[] objArrM = bVarW0.m();
                int i10 = 0;
                do {
                    G g11 = (G) objArrM[i10];
                    if (g11.d0() && g11.f0() == G.g.InMeasureBlock && G.l1(g11, null, 1, null)) {
                        G.w1(l10.f3669a, false, false, false, 7, null);
                    }
                    i10++;
                } while (i10 < iO);
            }
        }

        private final void W1() {
            G.w1(L.this.f3669a, false, false, false, 7, null);
            G gO0 = L.this.f3669a.o0();
            if (gO0 == null || L.this.f3669a.T() != G.g.NotUsed) {
                return;
            }
            G g10 = L.this.f3669a;
            int i10 = a.f3753a[gO0.W().ordinal()];
            g10.D1(i10 != 1 ? i10 != 2 ? gO0.T() : G.g.InLayoutBlock : G.g.InMeasureBlock);
        }

        private final void a2(long j10, float f10, InterfaceC6835l interfaceC6835l, C7182c c7182c) {
            if (L.this.f3669a.L0()) {
                B0.a.a("place is called on a deactivated node");
            }
            L.this.f3671c = G.e.LayingOut;
            this.f3739m = j10;
            this.f3742p = f10;
            this.f3740n = interfaceC6835l;
            this.f3741o = c7182c;
            this.f3736j = true;
            this.f3723A = false;
            m0 m0VarB = K.b(L.this.f3669a);
            if (L.this.A() || !q()) {
                p().r(false);
                L.this.Y(false);
                this.f3724B = interfaceC6835l;
                this.f3726D = j10;
                this.f3727E = f10;
                this.f3725C = c7182c;
                m0VarB.getSnapshotObserver().c(L.this.f3669a, false, this.f3728F);
            } else {
                L.this.K().e3(j10, f10, interfaceC6835l, c7182c);
                Z1();
            }
            L.this.f3671c = G.e.Idle;
        }

        private final void b2(long j10, float f10, InterfaceC6835l interfaceC6835l, C7182c c7182c) {
            t.a placementScope;
            this.f3746t = true;
            if (!Y0.n.g(j10, this.f3739m) || this.f3729G) {
                if (L.this.u() || L.this.v() || this.f3729G) {
                    L.this.f3673e = true;
                    this.f3729G = false;
                }
                S1();
            }
            if (M.a(L.this.f3669a)) {
                AbstractC2624c0 abstractC2624c0I2 = L.this.K().I2();
                if (abstractC2624c0I2 == null || (placementScope = abstractC2624c0I2.q1()) == null) {
                    placementScope = K.b(L.this.f3669a).getPlacementScope();
                }
                t.a aVar = placementScope;
                L l10 = L.this;
                a aVarH = l10.H();
                AbstractC6492s.f(aVarH);
                G gO0 = l10.f3669a.o0();
                if (gO0 != null) {
                    gO0.U().f3678j = 0;
                }
                aVarH.Z1(MPv3.MAX_MESSAGE_ID);
                t.a.h(aVar, aVarH, Y0.n.h(j10), Y0.n.i(j10), 0.0f, 4, null);
            }
            a aVarH2 = L.this.H();
            if ((aVarH2 == null || aVarH2.o1()) ? false : true) {
                B0.a.b("Error: Placement happened before lookahead.");
            }
            a2(j10, f10, interfaceC6835l, c7182c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c1() {
            G g10 = L.this.f3669a;
            V.b bVarW0 = g10.w0();
            int iO = bVarW0.o();
            if (iO > 0) {
                Object[] objArrM = bVarW0.m();
                int i10 = 0;
                do {
                    G g11 = (G) objArrM[i10];
                    if (g11.c0().f3733g != g11.p0()) {
                        g10.h1();
                        g10.D0();
                        if (g11.p0() == Integer.MAX_VALUE) {
                            g11.c0().R1();
                        }
                    }
                    i10++;
                } while (i10 < iO);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g1() {
            L.this.f3679k = 0;
            V.b bVarW0 = L.this.f3669a.w0();
            int iO = bVarW0.o();
            if (iO > 0) {
                Object[] objArrM = bVarW0.m();
                int i10 = 0;
                do {
                    b bVarC0 = ((G) objArrM[i10]).c0();
                    bVarC0.f3733g = bVarC0.f3734h;
                    bVarC0.f3734h = MPv3.MAX_MESSAGE_ID;
                    bVarC0.f3746t = false;
                    if (bVarC0.f3737k == G.g.InLayoutBlock) {
                        bVarC0.f3737k = G.g.NotUsed;
                    }
                    i10++;
                } while (i10 < iO);
            }
        }

        private final void h2(G g10) {
            G.g gVar;
            G gO0 = g10.o0();
            if (gO0 == null) {
                this.f3737k = G.g.NotUsed;
                return;
            }
            if (!(this.f3737k == G.g.NotUsed || g10.E())) {
                B0.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i10 = a.f3753a[gO0.W().ordinal()];
            if (i10 == 1) {
                gVar = G.g.InMeasureBlock;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + gO0.W());
                }
                gVar = G.g.InLayoutBlock;
            }
            this.f3737k = gVar;
        }

        @Override // E0.InterfaceC2621b
        public AbstractC2624c0 B() {
            return L.this.f3669a.P();
        }

        public final float B1() {
            return this.f3752z;
        }

        @Override // androidx.compose.ui.layout.t
        public int D0() {
            return L.this.K().D0();
        }

        public final void E1(boolean z10) {
            G g10;
            G gO0 = L.this.f3669a.o0();
            G.g gVarT = L.this.f3669a.T();
            if (gO0 == null || gVarT == G.g.NotUsed) {
                return;
            }
            do {
                g10 = gO0;
                if (g10.T() != gVarT) {
                    break;
                } else {
                    gO0 = g10.o0();
                }
            } while (gO0 != null);
            int i10 = a.f3754b[gVarT.ordinal()];
            if (i10 == 1) {
                G.w1(g10, z10, false, false, 6, null);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                g10.t1(z10);
            }
        }

        @Override // androidx.compose.ui.layout.t
        public int G0() {
            return L.this.K().G0();
        }

        public final void J1() {
            this.f3743q = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.t
        public void K0(long j10, float f10, InterfaceC6835l interfaceC6835l) {
            b2(j10, f10, interfaceC6835l, null);
        }

        @Override // E0.InterfaceC2621b
        public InterfaceC2621b L() {
            L lU;
            G gO0 = L.this.f3669a.o0();
            if (gO0 == null || (lU = gO0.U()) == null) {
                return null;
            }
            return lU.r();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.t
        public void L0(long j10, float f10, C7182c c7182c) {
            b2(j10, f10, null, c7182c);
        }

        public final boolean L1() {
            return this.f3746t;
        }

        public final void M1() {
            L.this.f3670b = true;
        }

        @Override // E0.InterfaceC2621b
        public void Q(InterfaceC6835l interfaceC6835l) {
            V.b bVarW0 = L.this.f3669a.w0();
            int iO = bVarW0.o();
            if (iO > 0) {
                Object[] objArrM = bVarW0.m();
                int i10 = 0;
                do {
                    interfaceC6835l.invoke(((G) objArrM[i10]).U().r());
                    i10++;
                } while (i10 < iO);
            }
        }

        @Override // C0.InterfaceC2534n
        public int R(int i10) {
            W1();
            return L.this.K().R(i10);
        }

        @Override // C0.InterfaceC2534n
        public int S(int i10) {
            W1();
            return L.this.K().S(i10);
        }

        public final void S1() {
            V.b bVarW0;
            int iO;
            if (L.this.s() <= 0 || (iO = (bVarW0 = L.this.f3669a.w0()).o()) <= 0) {
                return;
            }
            Object[] objArrM = bVarW0.m();
            int i10 = 0;
            do {
                G g10 = (G) objArrM[i10];
                L lU = g10.U();
                if ((lU.v() || lU.u()) && !lU.A()) {
                    G.u1(g10, false, 1, null);
                }
                lU.I().S1();
                i10++;
            } while (i10 < iO);
        }

        @Override // C0.B
        public androidx.compose.ui.layout.t T(long j10) {
            G.g gVarT = L.this.f3669a.T();
            G.g gVar = G.g.NotUsed;
            if (gVarT == gVar) {
                L.this.f3669a.v();
            }
            if (M.a(L.this.f3669a)) {
                a aVarH = L.this.H();
                AbstractC6492s.f(aVarH);
                aVarH.Y1(gVar);
                aVarH.T(j10);
            }
            h2(L.this.f3669a);
            c2(j10);
            return this;
        }

        @Override // C0.E
        public int X(AbstractC2521a abstractC2521a) {
            G gO0 = L.this.f3669a.o0();
            if ((gO0 != null ? gO0.W() : null) == G.e.Measuring) {
                p().u(true);
            } else {
                G gO02 = L.this.f3669a.o0();
                if ((gO02 != null ? gO02.W() : null) == G.e.LayingOut) {
                    p().t(true);
                }
            }
            this.f3738l = true;
            int iX = L.this.K().X(abstractC2521a);
            this.f3738l = false;
            return iX;
        }

        public final void Y1() {
            this.f3734h = MPv3.MAX_MESSAGE_ID;
            this.f3733g = MPv3.MAX_MESSAGE_ID;
            g2(false);
        }

        public final void Z1() {
            this.f3723A = true;
            G gO0 = L.this.f3669a.o0();
            float fJ2 = B().J2();
            G g10 = L.this.f3669a;
            AbstractC2624c0 abstractC2624c0M0 = g10.m0();
            AbstractC2624c0 abstractC2624c0P = g10.P();
            while (abstractC2624c0M0 != abstractC2624c0P) {
                AbstractC6492s.g(abstractC2624c0M0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                C c10 = (C) abstractC2624c0M0;
                fJ2 += c10.J2();
                abstractC2624c0M0 = c10.H2();
            }
            if (fJ2 != this.f3752z) {
                this.f3752z = fJ2;
                if (gO0 != null) {
                    gO0.h1();
                }
                if (gO0 != null) {
                    gO0.D0();
                }
            }
            if (!q()) {
                if (gO0 != null) {
                    gO0.D0();
                }
                O1();
                if (this.f3732f && gO0 != null) {
                    G.u1(gO0, false, 1, null);
                }
            }
            if (gO0 == null) {
                this.f3734h = 0;
            } else if (!this.f3732f && gO0.W() == G.e.LayingOut) {
                if (!(this.f3734h == Integer.MAX_VALUE)) {
                    B0.a.b("Place was called on a node which was placed already");
                }
                this.f3734h = gO0.U().f3679k;
                gO0.U().f3679k++;
            }
            g0();
        }

        @Override // C0.E, C0.InterfaceC2534n
        public Object b() {
            return this.f3744r;
        }

        public final boolean c2(long j10) {
            if (L.this.f3669a.L0()) {
                B0.a.a("measure is called on a deactivated node");
            }
            m0 m0VarB = K.b(L.this.f3669a);
            G gO0 = L.this.f3669a.o0();
            boolean z10 = true;
            L.this.f3669a.A1(L.this.f3669a.E() || (gO0 != null && gO0.E()));
            if (!L.this.f3669a.d0() && Y0.b.f(H0(), j10)) {
                m0.m(m0VarB, L.this.f3669a, false, 2, null);
                L.this.f3669a.z1();
                return false;
            }
            p().s(false);
            Q(d.f3760a);
            this.f3735i = true;
            long jH = L.this.K().h();
            S0(j10);
            L.this.U(j10);
            if (Y0.r.e(L.this.K().h(), jH) && L.this.K().I0() == I0() && L.this.K().C0() == C0()) {
                z10 = false;
            }
            Q0(Y0.s.a(L.this.K().I0(), L.this.K().C0()));
            return z10;
        }

        public final void d2() {
            G gO0;
            try {
                this.f3732f = true;
                if (!this.f3736j) {
                    B0.a.b("replace called on unplaced item");
                }
                boolean zQ = q();
                a2(this.f3739m, this.f3742p, this.f3740n, this.f3741o);
                if (zQ && !this.f3723A && (gO0 = L.this.f3669a.o0()) != null) {
                    G.u1(gO0, false, 1, null);
                }
                this.f3732f = false;
            } catch (Throwable th2) {
                this.f3732f = false;
                throw th2;
            }
        }

        public final void e2(boolean z10) {
            this.f3749w = z10;
        }

        public final void f2(G.g gVar) {
            this.f3737k = gVar;
        }

        @Override // E0.InterfaceC2621b
        public void g0() {
            this.f3750x = true;
            p().o();
            if (L.this.A()) {
                U1();
            }
            if (L.this.f3674f || (!this.f3738l && !B().L1() && L.this.A())) {
                L.this.f3673e = false;
                G.e eVarB = L.this.B();
                L.this.f3671c = G.e.LayingOut;
                L.this.Z(false);
                G g10 = L.this.f3669a;
                K.b(g10).getSnapshotObserver().e(g10, false, this.f3751y);
                L.this.f3671c = eVarB;
                if (B().L1() && L.this.v()) {
                    requestLayout();
                }
                L.this.f3674f = false;
            }
            if (p().l()) {
                p().q(true);
            }
            if (p().g() && p().k()) {
                p().n();
            }
            this.f3750x = false;
        }

        public void g2(boolean z10) {
            this.f3745s = z10;
        }

        public final List h1() {
            L.this.f3669a.L1();
            if (!this.f3749w) {
                return this.f3748v.g();
            }
            G g10 = L.this.f3669a;
            V.b bVar = this.f3748v;
            V.b bVarW0 = g10.w0();
            int iO = bVarW0.o();
            if (iO > 0) {
                Object[] objArrM = bVarW0.m();
                int i10 = 0;
                do {
                    G g11 = (G) objArrM[i10];
                    if (bVar.o() <= i10) {
                        bVar.b(g11.U().I());
                    } else {
                        bVar.C(i10, g11.U().I());
                    }
                    i10++;
                } while (i10 < iO);
            }
            bVar.A(g10.H().size(), bVar.o());
            this.f3749w = false;
            return this.f3748v.g();
        }

        public final boolean i2() {
            if ((b() == null && L.this.K().b() == null) || !this.f3743q) {
                return false;
            }
            this.f3743q = false;
            this.f3744r = L.this.K().b();
            return true;
        }

        @Override // E0.W
        public void k0(boolean z10) {
            boolean zJ1 = L.this.K().J1();
            if (z10 != zJ1) {
                L.this.K().k0(zJ1);
                this.f3729G = true;
            }
            this.f3730H = z10;
        }

        public final Y0.b o1() {
            if (this.f3735i) {
                return Y0.b.a(H0());
            }
            return null;
        }

        @Override // E0.InterfaceC2621b
        public AbstractC2619a p() {
            return this.f3747u;
        }

        @Override // E0.InterfaceC2621b
        public boolean q() {
            return this.f3745s;
        }

        public final boolean q1() {
            return this.f3750x;
        }

        @Override // E0.InterfaceC2621b
        public void r0() {
            G.w1(L.this.f3669a, false, false, false, 7, null);
        }

        public final G.g r1() {
            return this.f3737k;
        }

        @Override // E0.InterfaceC2621b
        public void requestLayout() {
            G.u1(L.this.f3669a, false, 1, null);
        }

        @Override // C0.InterfaceC2534n
        public int s(int i10) {
            W1();
            return L.this.K().s(i10);
        }

        @Override // C0.InterfaceC2534n
        public int s0(int i10) {
            W1();
            return L.this.K().s0(i10);
        }

        @Override // E0.InterfaceC2621b
        public Map v() {
            if (!this.f3738l) {
                if (L.this.B() == G.e.Measuring) {
                    p().s(true);
                    if (p().g()) {
                        L.this.O();
                    }
                } else {
                    p().r(true);
                }
            }
            B().S1(true);
            g0();
            B().S1(false);
            return p().h();
        }

        public final int z1() {
            return this.f3734h;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f3762b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10) {
            super(0);
            this.f3762b = j10;
        }

        public final void a() {
            Q qC2 = L.this.K().C2();
            AbstractC6492s.f(qC2);
            qC2.T(this.f3762b);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6824a {
        d() {
            super(0);
        }

        public final void a() {
            L.this.K().T(L.this.f3688t);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    public L(G g10) {
        this.f3669a = g10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(long j10) {
        this.f3671c = G.e.LookaheadMeasuring;
        this.f3675g = false;
        o0.h(K.b(this.f3669a).getSnapshotObserver(), this.f3669a, false, new c(j10), 2, null);
        P();
        if (M.a(this.f3669a)) {
            O();
        } else {
            R();
        }
        this.f3671c = G.e.Idle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(long j10) {
        G.e eVar = this.f3671c;
        G.e eVar2 = G.e.Idle;
        if (!(eVar == eVar2)) {
            B0.a.b("layout state is not idle before measure starts");
        }
        G.e eVar3 = G.e.Measuring;
        this.f3671c = eVar3;
        this.f3672d = false;
        this.f3688t = j10;
        K.b(this.f3669a).getSnapshotObserver().g(this.f3669a, false, this.f3689u);
        if (this.f3671c == eVar3) {
            O();
            this.f3671c = eVar2;
        }
    }

    public final boolean A() {
        return this.f3673e;
    }

    public final G.e B() {
        return this.f3671c;
    }

    public final InterfaceC2621b C() {
        return this.f3687s;
    }

    public final boolean D() {
        return this.f3684p;
    }

    public final boolean E() {
        return this.f3683o;
    }

    public final boolean F() {
        return this.f3676h;
    }

    public final boolean G() {
        return this.f3675g;
    }

    public final a H() {
        return this.f3687s;
    }

    public final b I() {
        return this.f3686r;
    }

    public final boolean J() {
        return this.f3672d;
    }

    public final AbstractC2624c0 K() {
        return this.f3669a.k0().n();
    }

    public final int L() {
        return this.f3686r.I0();
    }

    public final void M() {
        this.f3686r.J1();
        a aVar = this.f3687s;
        if (aVar != null) {
            aVar.r1();
        }
    }

    public final void N() {
        this.f3686r.e2(true);
        a aVar = this.f3687s;
        if (aVar != null) {
            aVar.W1(true);
        }
    }

    public final void O() {
        this.f3673e = true;
        this.f3674f = true;
    }

    public final void P() {
        this.f3676h = true;
        this.f3677i = true;
    }

    public final void Q() {
        this.f3675g = true;
    }

    public final void R() {
        this.f3672d = true;
    }

    public final void S() {
        G.e eVarW = this.f3669a.W();
        if (eVarW == G.e.LayingOut || eVarW == G.e.LookaheadLayingOut) {
            if (this.f3686r.q1()) {
                Z(true);
            } else {
                Y(true);
            }
        }
        if (eVarW == G.e.LookaheadLayingOut) {
            a aVar = this.f3687s;
            if (aVar == null || !aVar.c1()) {
                a0(true);
            } else {
                b0(true);
            }
        }
    }

    public final void V() {
        AbstractC2619a abstractC2619aP;
        this.f3686r.p().p();
        a aVar = this.f3687s;
        if (aVar == null || (abstractC2619aP = aVar.p()) == null) {
            return;
        }
        abstractC2619aP.p();
    }

    public final void W(int i10) {
        int i11 = this.f3682n;
        this.f3682n = i10;
        if ((i11 == 0) != (i10 == 0)) {
            G gO0 = this.f3669a.o0();
            L lU = gO0 != null ? gO0.U() : null;
            if (lU != null) {
                if (i10 == 0) {
                    lU.W(lU.f3682n - 1);
                } else {
                    lU.W(lU.f3682n + 1);
                }
            }
        }
    }

    public final void X(int i10) {
        int i11 = this.f3685q;
        this.f3685q = i10;
        if ((i11 == 0) != (i10 == 0)) {
            G gO0 = this.f3669a.o0();
            L lU = gO0 != null ? gO0.U() : null;
            if (lU != null) {
                if (i10 == 0) {
                    lU.X(lU.f3685q - 1);
                } else {
                    lU.X(lU.f3685q + 1);
                }
            }
        }
    }

    public final void Y(boolean z10) {
        if (this.f3681m != z10) {
            this.f3681m = z10;
            if (z10 && !this.f3680l) {
                W(this.f3682n + 1);
            } else {
                if (z10 || this.f3680l) {
                    return;
                }
                W(this.f3682n - 1);
            }
        }
    }

    public final void Z(boolean z10) {
        if (this.f3680l != z10) {
            this.f3680l = z10;
            if (z10 && !this.f3681m) {
                W(this.f3682n + 1);
            } else {
                if (z10 || this.f3681m) {
                    return;
                }
                W(this.f3682n - 1);
            }
        }
    }

    public final void a0(boolean z10) {
        if (this.f3684p != z10) {
            this.f3684p = z10;
            if (z10 && !this.f3683o) {
                X(this.f3685q + 1);
            } else {
                if (z10 || this.f3683o) {
                    return;
                }
                X(this.f3685q - 1);
            }
        }
    }

    public final void b0(boolean z10) {
        if (this.f3683o != z10) {
            this.f3683o = z10;
            if (z10 && !this.f3684p) {
                X(this.f3685q + 1);
            } else {
                if (z10 || this.f3684p) {
                    return;
                }
                X(this.f3685q - 1);
            }
        }
    }

    public final void c0() {
        G gO0;
        if (this.f3686r.i2() && (gO0 = this.f3669a.o0()) != null) {
            G.w1(gO0, false, false, false, 7, null);
        }
        a aVar = this.f3687s;
        if (aVar == null || !aVar.c2()) {
            return;
        }
        if (M.a(this.f3669a)) {
            G gO02 = this.f3669a.o0();
            if (gO02 != null) {
                G.w1(gO02, false, false, false, 7, null);
                return;
            }
            return;
        }
        G gO03 = this.f3669a.o0();
        if (gO03 != null) {
            G.s1(gO03, false, false, false, 7, null);
        }
    }

    public final void q() {
        if (this.f3687s == null) {
            this.f3687s = new a();
        }
    }

    public final InterfaceC2621b r() {
        return this.f3686r;
    }

    public final int s() {
        return this.f3682n;
    }

    public final int t() {
        return this.f3685q;
    }

    public final boolean u() {
        return this.f3681m;
    }

    public final boolean v() {
        return this.f3680l;
    }

    public final boolean w() {
        return this.f3670b;
    }

    public final int x() {
        return this.f3686r.C0();
    }

    public final Y0.b y() {
        return this.f3686r.o1();
    }

    public final Y0.b z() {
        a aVar = this.f3687s;
        if (aVar != null) {
            return aVar.Z0();
        }
        return null;
    }
}
