package Ff;

import Af.B;
import Af.H;
import Af.K;
import Be.C2459b0;
import C0.C;
import E0.InterfaceC2629g;
import Ee.C2706g;
import Ff.d;
import Ff.t;
import Gf.i;
import L9.L;
import L9.z;
import Li.P;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.O;
import T.X0;
import T.o1;
import T.z1;
import Yg.J;
import Zg.AbstractC3689v;
import androidx.compose.ui.e;
import d.AbstractC5263a;
import ic.EnumC6141b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import of.C7125a;
import org.conscrypt.PSKKeyManager;
import org.kodein.di.DI;
import q.AbstractC7391j;
import s9.d;
import z.N;
import z.Y;
import z.j0;

/* loaded from: classes4.dex */
public abstract class t {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ff.e f6597a;

        /* renamed from: Ff.t$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0267a extends C6490p implements InterfaceC6824a {
            C0267a(Object obj) {
                super(0, obj, Ff.e.class, "onWizardClicked", "onWizardClicked()V", 0);
            }

            public final void a() {
                ((Ff.e) this.receiver).G0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        a(Ff.e eVar) {
            this.f6597a = eVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(805567405, i10, -1, "com.ui.wifiman.ui.wifi.scan.WifiScanToolbar.<anonymous> (WifiScanUi.kt:124)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.f(aVar, 0.0f, 1, null), 0.0f, Y0.h.j(8), 1, null);
            f0.c cVarE = f0.c.f46573a.e();
            Ff.e eVar = this.f6597a;
            C cH = androidx.compose.foundation.layout.d.h(cVarE, false);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarK);
            InterfaceC2629g.a aVar2 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar2.a();
            if (interfaceC3540l.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l.u();
            if (interfaceC3540l.o()) {
                interfaceC3540l.D(interfaceC6824aA);
            } else {
                interfaceC3540l.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540l);
            E1.c(interfaceC3540lA, cH, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            androidx.compose.ui.e eVarD = androidx.compose.foundation.layout.r.d(aVar, 0.0f, 1, null);
            H h10 = (H) o1.b(eVar.v0(), null, interfaceC3540l, 0, 1).getValue();
            interfaceC3540l.U(1007611390);
            boolean zT = interfaceC3540l.T(eVar);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new C0267a(eVar);
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            K.c(eVarD, h10, (InterfaceC6824a) ((th.g) objF), interfaceC3540l, 6, 0);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ff.e f6598a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2459b0 f6599b;

        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ff.e f6600a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2459b0 f6601b;

            a(Ff.e eVar, C2459b0 c2459b0) {
                this.f6600a = eVar;
                this.f6601b = c2459b0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J c(C2459b0 c2459b0) {
                c2459b0.e();
                return J.f24997a;
            }

            public final void b(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1851822339, i10, -1, "com.ui.wifiman.ui.wifi.scan.WifiScanToolbar.<anonymous>.<anonymous> (WifiScanUi.kt:142)");
                }
                if (((Boolean) o1.b(this.f6600a.t0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue()) {
                    s9.b bVarH = N9.b.f16117a.H();
                    long jA = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).c().a();
                    interfaceC3540l.U(1007624489);
                    boolean zT = interfaceC3540l.T(this.f6601b);
                    final C2459b0 c2459b0 = this.f6601b;
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new InterfaceC6824a() { // from class: Ff.u
                            @Override // mh.InterfaceC6824a
                            public final Object invoke() {
                                return t.b.a.c(c2459b0);
                            }
                        };
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    z.c(bVarH, null, jA, false, (InterfaceC6824a) objF, interfaceC3540l, 0, 10);
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                b((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        b(Ff.e eVar, C2459b0 c2459b0) {
            this.f6598a = eVar;
            this.f6599b = c2459b0;
        }

        public final void a(Y WifimanToolbarBase, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(WifimanToolbarBase, "$this$WifimanToolbarBase");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(672357924, i10, -1, "com.ui.wifiman.ui.wifi.scan.WifiScanToolbar.<anonymous> (WifiScanUi.kt:141)");
            }
            L.b(null, b0.c.e(-1851822339, true, new a(this.f6598a, this.f6599b), interfaceC3540l, 54), interfaceC3540l, 48, 1);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class c implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z1 f6602a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ff.e f6603b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C7125a.c f6604c;

        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ff.e f6605a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C7125a.c f6606b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z1 f6607c;

            /* renamed from: Ff.t$c$a$a, reason: collision with other inner class name */
            public static final class C0268a implements T.K {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Ff.e f6608a;

                public C0268a(Ff.e eVar) {
                    this.f6608a = eVar;
                }

                @Override // T.K
                public void dispose() {
                    this.f6608a.A0(false);
                }
            }

            a(Ff.e eVar, C7125a.c cVar, z1 z1Var) {
                this.f6605a = eVar;
                this.f6606b = cVar;
                this.f6607c = z1Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final T.K c(Ff.e eVar, T.L DisposableEffect) {
                AbstractC6492s.i(DisposableEffect, "$this$DisposableEffect");
                eVar.A0(true);
                return new C0268a(eVar);
            }

            public final void b(boolean z10, InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= interfaceC3540l.c(z10) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(615325967, i10, -1, "com.ui.wifiman.ui.wifi.scan.WifiScanUi.<anonymous>.<anonymous> (WifiScanUi.kt:64)");
                }
                if (z10) {
                    interfaceC3540l.U(-814772123);
                    He.f.b(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), t.f(this.f6607c), new d.b(AbstractC6780c.f53488f5), interfaceC3540l, 6);
                    C2459b0 c2459b0F = t.f(this.f6607c);
                    interfaceC3540l.U(805011760);
                    boolean zT = interfaceC3540l.T(this.f6605a);
                    final Ff.e eVar = this.f6605a;
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new InterfaceC6835l() { // from class: Ff.v
                            @Override // mh.InterfaceC6835l
                            public final Object invoke(Object obj) {
                                return t.c.a.c(eVar, (T.L) obj);
                            }
                        };
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    O.c(c2459b0F, (InterfaceC6835l) objF, interfaceC3540l, 0);
                    interfaceC3540l.J();
                } else {
                    interfaceC3540l.U(-814268218);
                    t.c(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), this.f6605a, this.f6606b, t.f(this.f6607c), interfaceC3540l, 6);
                    interfaceC3540l.J();
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                b(((Boolean) obj).booleanValue(), (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        c(z1 z1Var, Ff.e eVar, C7125a.c cVar) {
            this.f6602a = z1Var;
            this.f6603b = eVar;
            this.f6604c = cVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1713433840, i10, -1, "com.ui.wifiman.ui.wifi.scan.WifiScanUi.<anonymous> (WifiScanUi.kt:57)");
            }
            androidx.compose.ui.e eVarC = j0.c(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null));
            Boolean bool = (Boolean) t.f(this.f6602a).c().getValue();
            bool.booleanValue();
            AbstractC7391j.a(bool, eVarC, null, "WifiScanUiScaffold", b0.c.e(615325967, true, new a(this.f6603b, this.f6604c, this.f6602a), interfaceC3540l, 54), interfaceC3540l, 27648, 4);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class d implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ff.e f6609a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z1 f6610b;

        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ff.e f6611a;

            a(Ff.e eVar) {
                this.f6611a = eVar;
            }

            public final void a(Ff.d cnt, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(cnt, "cnt");
                if ((i10 & 6) == 0) {
                    i10 |= interfaceC3540l.T(cnt) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1077555187, i10, -1, "com.ui.wifiman.ui.wifi.scan.WifiScanUi.<anonymous>.<anonymous> (WifiScanUi.kt:93)");
                }
                if (cnt instanceof d.a) {
                    interfaceC3540l.U(805039452);
                    q.b(androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), (d.a) cnt, this.f6611a, interfaceC3540l, 6);
                    interfaceC3540l.J();
                } else if (cnt instanceof d.b) {
                    interfaceC3540l.U(805046138);
                    y.b(androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), interfaceC3540l, 6);
                    interfaceC3540l.J();
                } else {
                    if (!(cnt instanceof d.c)) {
                        interfaceC3540l.U(805037805);
                        interfaceC3540l.J();
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC3540l.U(805050656);
                    i.c(this.f6611a, interfaceC3540l, 0);
                    interfaceC3540l.J();
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((Ff.d) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        d(Ff.e eVar, z1 z1Var) {
            this.f6609a = eVar;
            this.f6610b = z1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(z1 z1Var) {
            t.f(z1Var).d();
            return J.f24997a;
        }

        public final void b(N scaffoldPadding, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(scaffoldPadding, "scaffoldPadding");
            if ((i10 & 6) == 0) {
                i10 |= interfaceC3540l.T(scaffoldPadding) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1421350537, i10, -1, "com.ui.wifiman.ui.wifi.scan.WifiScanUi.<anonymous> (WifiScanUi.kt:85)");
            }
            AbstractC7391j.a((Ff.d) o1.b(this.f6609a.r0(), null, interfaceC3540l, 0, 1).getValue(), androidx.compose.foundation.layout.o.h(androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), scaffoldPadding), null, "WifiScanUiContent", b0.c.e(1077555187, true, new a(this.f6609a), interfaceC3540l, 54), interfaceC3540l, 27648, 4);
            boolean zBooleanValue = ((Boolean) t.f(this.f6610b).c().getValue()).booleanValue();
            interfaceC3540l.U(-1958968333);
            boolean zT = interfaceC3540l.T(this.f6610b);
            final z1 z1Var = this.f6610b;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: Ff.w
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return t.d.c(z1Var);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            AbstractC5263a.a(zBooleanValue, (InterfaceC6824a) objF, interfaceC3540l, 0, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            b((N) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    /* synthetic */ class e extends C6490p implements InterfaceC6835l {
        e(Object obj) {
            super(1, obj, Ff.e.class, "onSearchQueryChanged", "onSearchQueryChanged(Ljava/lang/String;)V", 0);
        }

        public final void a(String p02) {
            AbstractC6492s.i(p02, "p0");
            ((Ff.e) this.receiver).B0(p02);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return J.f24997a;
        }
    }

    public static final class f extends Ff.e {

        /* renamed from: g, reason: collision with root package name */
        private final Li.z f6612g;

        /* renamed from: h, reason: collision with root package name */
        private final Li.z f6613h;

        /* renamed from: i, reason: collision with root package name */
        private final Li.z f6614i = P.a(Boolean.TRUE);

        /* renamed from: j, reason: collision with root package name */
        private final Li.z f6615j;

        /* renamed from: k, reason: collision with root package name */
        private final Li.z f6616k;

        /* renamed from: l, reason: collision with root package name */
        private final Li.z f6617l;

        /* renamed from: m, reason: collision with root package name */
        private final Li.z f6618m;

        /* renamed from: n, reason: collision with root package name */
        private final Li.z f6619n;

        /* renamed from: o, reason: collision with root package name */
        private final Li.N f6620o;

        f(Ff.d dVar, C2706g c2706g, InterfaceC3540l interfaceC3540l, H h10) {
            this.f6612g = P.a(dVar);
            this.f6613h = P.a(c2706g);
            S8.c cVar = S8.c.GHZ_2_4;
            this.f6615j = P.a(new Bf.b(cVar, AbstractC3689v.l()));
            this.f6616k = P.a(new B(cVar, AbstractC3689v.i1(S8.c.getEntries()), null, 4, null));
            this.f6617l = P.a(Gf.m.d(2, interfaceC3540l, 6, 0));
            this.f6618m = P.a(new Gf.h(EnumC6141b.NETWORKS, AbstractC3689v.i1(EnumC6141b.getEntries())));
            this.f6619n = P.a(Boolean.FALSE);
            this.f6620o = P.a(h10);
        }

        @Override // Ff.e
        public void A0(boolean z10) {
        }

        @Override // Ff.e
        public void B0(String query) {
            AbstractC6492s.i(query, "query");
        }

        @Override // Ff.e
        public void C0() {
        }

        @Override // Ff.e
        public void D0() {
        }

        @Override // Ff.e
        public void E0(String id2) {
            AbstractC6492s.i(id2, "id");
        }

        @Override // Ff.e
        public void F0(S8.c cVar) {
        }

        @Override // Ff.e
        public void G0() {
        }

        @Override // Ff.e
        /* renamed from: H0, reason: merged with bridge method [inline-methods] */
        public Li.z n0() {
            return this.f6615j;
        }

        @Override // Ff.e
        /* renamed from: I0, reason: merged with bridge method [inline-methods] */
        public Li.z o0() {
            return this.f6619n;
        }

        @Override // Ff.e
        /* renamed from: J0, reason: merged with bridge method [inline-methods] */
        public Li.z p0() {
            return this.f6617l;
        }

        @Override // Ff.e
        /* renamed from: K0, reason: merged with bridge method [inline-methods] */
        public Li.z q0() {
            return this.f6613h;
        }

        @Override // Ff.e
        /* renamed from: L0, reason: merged with bridge method [inline-methods] */
        public Li.z r0() {
            return this.f6612g;
        }

        @Override // Ff.e
        /* renamed from: M0, reason: merged with bridge method [inline-methods] */
        public Li.z s0() {
            return this.f6618m;
        }

        @Override // Ff.e
        /* renamed from: N0, reason: merged with bridge method [inline-methods] */
        public Li.z t0() {
            return this.f6614i;
        }

        @Override // Ff.e
        /* renamed from: O0, reason: merged with bridge method [inline-methods] */
        public Li.z u0() {
            return this.f6616k;
        }

        @Override // org.kodein.di.c
        /* renamed from: d */
        public DI getDi() {
            throw new IllegalStateException();
        }

        @Override // Ff.e
        public Li.N v0() {
            return this.f6620o;
        }

        @Override // Ff.e
        public void w0(String id2) {
            AbstractC6492s.i(id2, "id");
        }

        @Override // Ff.e
        public void x0() {
        }

        @Override // Ff.e
        public void y0() {
        }

        @Override // Ff.e
        public void z0(EnumC6141b feature) {
            AbstractC6492s.i(feature, "feature");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final androidx.compose.ui.e eVar, final Ff.e eVar2, final C7125a.c cVar, final C2459b0 c2459b0, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1055409411);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(eVar2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(cVar) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC3540lR.T(c2459b0) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1055409411, i11, -1, "com.ui.wifiman.ui.wifi.scan.WifiScanToolbar (WifiScanUi.kt:120)");
            }
            He.m.b(eVar, cVar, b0.c.e(805567405, true, new a(eVar2), interfaceC3540lR, 54), b0.c.e(672357924, true, new b(eVar2, c2459b0), interfaceC3540lR, 54), interfaceC3540lR, (i11 & 14) | 3456 | ((i11 >> 3) & 112), 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Ff.s
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return t.d(eVar, eVar2, cVar, c2459b0, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d(androidx.compose.ui.e eVar, Ff.e eVar2, C7125a.c cVar, C2459b0 c2459b0, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        c(eVar, eVar2, cVar, c2459b0, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(androidx.compose.ui.e r35, Ff.e r36, of.C7125a.c r37, T.InterfaceC3540l r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ff.t.e(androidx.compose.ui.e, Ff.e, of.a$c, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2459b0 f(z1 z1Var) {
        return (C2459b0) z1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J g(androidx.compose.ui.e eVar, Ff.e eVar2, C7125a.c cVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        e(eVar, eVar2, cVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    public static final Ff.e j(Ff.d dVar, C2706g c2706g, H h10, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        interfaceC3540l.U(-1672276681);
        if ((i11 & 1) != 0) {
            dVar = d.c.f6532a;
        }
        if ((i11 & 2) != 0) {
            c2706g = new C2706g(AbstractC3689v.e(new C2706g.a.C0194a("ubiquiti", null, null, AbstractC3689v.o(new i.c("1", Gf.t.s(0, interfaceC3540l, 0, 1)), new i.c("2", Gf.t.s(0, interfaceC3540l, 0, 1)), new i.c("3", Gf.t.s(0, interfaceC3540l, 0, 1))), 6, null)));
        }
        if ((i11 & 4) != 0) {
            h10 = new H.a(Float.valueOf(0.7f), true);
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1672276681, i10, -1, "com.ui.wifiman.ui.wifi.scan.previewWifiScanVM (WifiScanUi.kt:173)");
        }
        f fVar = new f(dVar, c2706g, interfaceC3540l, h10);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return fVar;
    }
}
