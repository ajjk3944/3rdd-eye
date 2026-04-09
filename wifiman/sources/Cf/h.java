package Cf;

import Af.A;
import Af.AbstractC2431f;
import Af.B;
import Af.C2428c;
import Af.E;
import Be.M;
import Be.m0;
import Be.n0;
import Bf.k;
import C0.C;
import Cf.h;
import Df.a;
import E0.InterfaceC2629g;
import Ee.C2706g;
import Ee.F;
import L9.AbstractC3198d;
import N.AbstractC3313c0;
import N.C0;
import N.Z;
import Q.y;
import Q.z;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.AbstractC3561w;
import T.E1;
import T.I0;
import T.InterfaceC3540l;
import T.InterfaceC3547o0;
import T.InterfaceC3563x;
import T.L0;
import T.O;
import T.X0;
import T.h1;
import T.o1;
import Yg.J;
import android.content.res.Resources;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC4017o;
import androidx.lifecycle.P;
import androidx.lifecycle.S;
import c2.AbstractC4197c;
import c2.C4195a;
import d.AbstractC5265c;
import dh.InterfaceC5380e;
import f0.c;
import h9.C5969a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import q.AbstractC7385d;
import q.InterfaceC7386e;
import sa.AbstractC7930a;
import xe.AbstractC8460B;
import xe.InterfaceC8511f;
import ye.AbstractC8664j;
import ye.C8663i;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;
import z.N;
import z.W;
import z.Y;
import z.a0;
import z.f0;
import z.h0;
import z.j0;

/* loaded from: classes4.dex */
public abstract class h {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Cf.d f2725a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f2726b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3547o0 f2727c;

        /* renamed from: Cf.h$a$a, reason: collision with other inner class name */
        static final class C0134a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Cf.d f2728a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3547o0 f2729b;

            /* renamed from: Cf.h$a$a$a, reason: collision with other inner class name */
            static final class C0135a implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Df.b f2730a;

                C0135a(Df.b bVar) {
                    this.f2730a = bVar;
                }

                public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(156430301, i10, -1, "com.ui.wifiman.ui.wifi.network.Content.<anonymous>.<anonymous>.<anonymous> (WifiNetworkDetailUi.kt:114)");
                    }
                    Df.b bVar = this.f2730a;
                    if (bVar != null) {
                        Df.d.b(o.k(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), C6562a.f52458a.d(interfaceC3540l, C6562a.f52459b).a().a().c(), 0.0f, 2, null), bVar, interfaceC3540l, 0, 0);
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    a((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            /* renamed from: Cf.h$a$a$b */
            static final class b implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Cf.d f2731a;

                /* renamed from: Cf.h$a$a$b$a, reason: collision with other inner class name */
                /* synthetic */ class C0136a extends C6490p implements InterfaceC6824a {
                    C0136a(Object obj) {
                        super(0, obj, Cf.d.class, "onSortClicked", "onSortClicked()V", 0);
                    }

                    public final void a() {
                        ((Cf.d) this.receiver).u0();
                    }

                    @Override // mh.InterfaceC6824a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        a();
                        return J.f24997a;
                    }
                }

                b(Cf.d dVar) {
                    this.f2731a = dVar;
                }

                public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                    if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-1509308399, i10, -1, "com.ui.wifiman.ui.wifi.network.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WifiNetworkDetailUi.kt:148)");
                    }
                    androidx.compose.ui.e eVarV = r.v(androidx.compose.ui.e.f28771b0, Y0.h.j(24));
                    Cf.d dVar = this.f2731a;
                    interfaceC3540l.U(337779121);
                    boolean zT = interfaceC3540l.T(dVar);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C0136a(dVar);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    Z.a((InterfaceC6824a) ((th.g) objF), eVarV, false, null, Cf.a.f2696a.a(), interfaceC3540l, 24624, 12);
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

            C0134a(Cf.d dVar, InterfaceC3547o0 interfaceC3547o0) {
                this.f2728a = dVar;
                this.f2729b = interfaceC3547o0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J c(Cf.d dVar, InterfaceC3547o0 interfaceC3547o0, S8.c cVar) {
                dVar.v0(cVar);
                h.e(interfaceC3547o0, System.currentTimeMillis());
                return J.f24997a;
            }

            public final void b(InterfaceC8687j UiCardCollapsible, InterfaceC3540l interfaceC3540l, int i10) {
                int i11;
                AbstractC6492s.i(UiCardCollapsible, "$this$UiCardCollapsible");
                if ((i10 & 6) == 0) {
                    i11 = i10 | (interfaceC3540l.T(UiCardCollapsible) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1499094091, i11, -1, "com.ui.wifiman.ui.wifi.network.Content.<anonymous>.<anonymous> (WifiNetworkDetailUi.kt:112)");
                }
                Df.b bVar = (Df.b) o1.b(this.f2728a.q0(), null, interfaceC3540l, 0, 1).getValue();
                int i12 = (i11 & 14) | 1572864;
                AbstractC7385d.d(UiCardCollapsible, bVar != null, null, null, null, null, b0.c.e(156430301, true, new C0135a(bVar), interfaceC3540l, 54), interfaceC3540l, i12, 30);
                e.a aVar = androidx.compose.ui.e.f28771b0;
                androidx.compose.ui.e eVarM = o.m(o.k(r.h(aVar, 0.0f, 1, null), C6562a.f52458a.d(interfaceC3540l, C6562a.f52459b).a().a().c(), 0.0f, 2, null), 0.0f, Y0.h.j(16), 0.0f, 0.0f, 13, null);
                c.InterfaceC1752c interfaceC1752cI = f0.c.f46573a.i();
                final Cf.d dVar = this.f2728a;
                final InterfaceC3547o0 interfaceC3547o0 = this.f2729b;
                C cB = W.b(C8680c.f66832a.f(), interfaceC1752cI, interfaceC3540l, 48);
                int iA = AbstractC3536j.a(interfaceC3540l, 0);
                InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
                androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarM);
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
                E1.c(interfaceC3540lA, cB, aVar2.e());
                E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
                InterfaceC6839p interfaceC6839pB = aVar2.b();
                if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                    interfaceC3540lA.K(Integer.valueOf(iA));
                    interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
                }
                E1.c(interfaceC3540lA, eVarE, aVar2.f());
                z.Z z10 = z.Z.f66823a;
                B b10 = (B) o1.b(dVar.s0(), null, interfaceC3540l, 0, 1).getValue();
                interfaceC3540l.U(1679431354);
                boolean zT = interfaceC3540l.T(dVar);
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6835l() { // from class: Cf.g
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return h.a.C0134a.c(dVar, interfaceC3547o0, (S8.c) obj);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                E.c(aVar, b10, (InterfaceC6835l) objF, interfaceC3540l, 6, 0);
                a0.a(o.m(Y.b(z10, aVar, 1.0f, false, 2, null), 0.0f, 0.0f, Y0.h.j(4), 0.0f, 11, null), interfaceC3540l, 0);
                AbstractC3561w.a(AbstractC3313c0.b().d(Boolean.FALSE), b0.c.e(-1509308399, true, new b(dVar), interfaceC3540l, 54), interfaceC3540l, I0.f20869i | 48);
                interfaceC3540l.R();
                AbstractC7385d.d(UiCardCollapsible, ((Boolean) o1.b(this.f2728a.p0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue(), null, null, null, null, Cf.a.f2696a.b(), interfaceC3540l, i12, 30);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                b((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        static final class b implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Cf.d f2732a;

            b(Cf.d dVar) {
                this.f2732a = dVar;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(928660126, i10, -1, "com.ui.wifiman.ui.wifi.network.Content.<anonymous>.<anonymous> (WifiNetworkDetailUi.kt:183)");
                }
                e.a aVar = androidx.compose.ui.e.f28771b0;
                androidx.compose.ui.e eVarK = o.k(r.h(aVar, 0.0f, 1, null), C6562a.f52458a.d(interfaceC3540l, C6562a.f52459b).a().a().c(), 0.0f, 2, null);
                Cf.d dVar = this.f2732a;
                C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.k(), interfaceC3540l, 0);
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
                E1.c(interfaceC3540lA, cA, aVar2.e());
                E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
                InterfaceC6839p interfaceC6839pB = aVar2.b();
                if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                    interfaceC3540lA.K(Integer.valueOf(iA));
                    interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
                }
                E1.c(interfaceC3540lA, eVarE, aVar2.f());
                C8688k c8688k = C8688k.f66923a;
                float f10 = 16;
                a0.a(r.i(aVar, Y0.h.j(f10)), interfaceC3540l, 6);
                A.b(r.h(aVar, 0.0f, 1, null), ((B) o1.b(dVar.s0(), null, interfaceC3540l, 0, 1).getValue()).b(), interfaceC3540l, 6, 0);
                a0.a(r.i(aVar, Y0.h.j(f10)), interfaceC3540l, 6);
                k.e(r.i(r.h(aVar, 0.0f, 1, null), Y0.h.j(164)), (Bf.b) o1.b(dVar.o0(), null, interfaceC3540l, 0, 1).getValue(), interfaceC3540l, 6);
                interfaceC3540l.R();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
                a((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return J.f24997a;
            }
        }

        a(Cf.d dVar, z zVar, InterfaceC3547o0 interfaceC3547o0) {
            this.f2725a = dVar;
            this.f2726b = zVar;
            this.f2727c = interfaceC3547o0;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1719322828, i10, -1, "com.ui.wifiman.ui.wifi.network.Content.<anonymous> (WifiNetworkDetailUi.kt:107)");
            }
            androidx.compose.ui.e eVarH = r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
            interfaceC3540l.U(761255462);
            boolean z10 = ((Boolean) o1.b(this.f2725a.p0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue() && !((Boolean) ((n0) interfaceC3540l.t(m0.m())).a().getValue()).booleanValue();
            interfaceC3540l.J();
            M.d(eVarH, this.f2726b, b0.c.e(-1499094091, true, new C0134a(this.f2725a, this.f2727c), interfaceC3540l, 54), null, null, false, null, z10, Cf.a.f2696a.d(), b0.c.e(928660126, true, new b(this.f2725a), interfaceC3540l, 54), interfaceC3540l, 905970054, 120);
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

    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Cf.d f2733a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A.B f2734b;

        static final class a implements mh.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Cf.d f2735a;

            /* renamed from: Cf.h$b$a$a, reason: collision with other inner class name */
            /* synthetic */ class C0137a extends C6490p implements InterfaceC6835l {
                C0137a(Object obj) {
                    super(1, obj, Cf.d.class, "onAccessPointClicked", "onAccessPointClicked(Lcom/ui/common/hwaddr/HwAddress;)V", 0);
                }

                public final void a(C5969a p02) {
                    AbstractC6492s.i(p02, "p0");
                    ((Cf.d) this.receiver).t0(p02);
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((C5969a) obj);
                    return J.f24997a;
                }
            }

            a(Cf.d dVar) {
                this.f2735a = dVar;
            }

            public final void a(androidx.compose.ui.e itemModifier, Df.a item, InterfaceC3540l interfaceC3540l, int i10) {
                int i11;
                AbstractC6492s.i(itemModifier, "itemModifier");
                AbstractC6492s.i(item, "item");
                if ((i10 & 6) == 0) {
                    i11 = (interfaceC3540l.T(itemModifier) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 48) == 0) {
                    i11 |= (i10 & 64) == 0 ? interfaceC3540l.T(item) : interfaceC3540l.l(item) ? 32 : 16;
                }
                if ((i11 & 147) == 146 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-916011222, i11, -1, "com.ui.wifiman.ui.wifi.network.Content.<anonymous>.<anonymous> (WifiNetworkDetailUi.kt:214)");
                }
                if (item instanceof a.C0159a) {
                    interfaceC3540l.U(-700274327);
                    C2428c c2428cA = ((a.C0159a) item).a();
                    Cf.d dVar = this.f2735a;
                    interfaceC3540l.U(-700269606);
                    boolean zT = interfaceC3540l.T(dVar);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C0137a(dVar);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    AbstractC2431f.c(itemModifier, c2428cA, (InterfaceC6835l) ((th.g) objF), interfaceC3540l, i11 & 14, 0);
                    interfaceC3540l.J();
                } else {
                    if (!(item instanceof a.b)) {
                        interfaceC3540l.U(-700276400);
                        interfaceC3540l.J();
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC3540l.U(-700265909);
                    F.b(itemModifier, ((a.b) item).a(), interfaceC3540l, i11 & 14);
                    interfaceC3540l.J();
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.r
            public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
                a((androidx.compose.ui.e) obj, (Df.a) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
                return J.f24997a;
            }
        }

        b(Cf.d dVar, A.B b10) {
            this.f2733a = dVar;
            this.f2734b = b10;
        }

        public final void a(N innerPadding, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(innerPadding, "innerPadding");
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC3540l.T(innerPadding) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1911059067, i11, -1, "com.ui.wifiman.ui.wifi.network.Content.<anonymous> (WifiNetworkDetailUi.kt:206)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            Ee.z.L(o.h(r.f(androidx.compose.foundation.b.d(aVar, c6562a.a(interfaceC3540l, i12).e().a(), null, 2, null), 0.0f, 1, null), innerPadding), (C2706g) o1.b(this.f2733a.n0(), null, interfaceC3540l, 0, 1).getValue(), this.f2734b, false, false, null, null, b0.c.e(-916011222, true, new a(this.f2733a), interfaceC3540l, 54), interfaceC3540l, 12582912, 120);
            Ee.B.b(o.h(aVar, innerPadding), c6562a.a(interfaceC3540l, i12).e().a(), interfaceC3540l, 0, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((N) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class c extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f2736a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A.B f2737b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z f2738c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3547o0 f2739d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(A.B b10, z zVar, InterfaceC3547o0 interfaceC3547o0, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f2737b = b10;
            this.f2738c = zVar;
            this.f2739d = interfaceC3547o0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J t(z zVar, float f10, float f11) {
            zVar.getState().g(f10);
            return J.f24997a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new c(this.f2737b, this.f2738c, this.f2739d, interfaceC5380e);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x005b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r11.f2736a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                Yg.v.b(r12)
                goto L5c
            L12:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1a:
                Yg.v.b(r12)
                goto L3b
            L1e:
                Yg.v.b(r12)
                T.o0 r12 = r11.f2739d
                long r4 = Cf.h.j(r12)
                r6 = 0
                int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r12 == 0) goto L5c
                A.B r12 = r11.f2737b
                r11.f2736a = r3
                r1 = 0
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                java.lang.Object r12 = r12.l(r1, r3, r11)
                if (r12 != r0) goto L3b
                return r0
            L3b:
                Q.z r12 = r11.f2738c
                Q.A r12 = r12.getState()
                float r3 = r12.d()
                Q.z r12 = r11.f2738c
                Cf.i r7 = new Cf.i
                r7.<init>()
                r11.f2736a = r2
                r4 = 0
                r5 = 0
                r6 = 0
                r9 = 12
                r10 = 0
                r8 = r11
                java.lang.Object r12 = r.m0.e(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L5c
                return r0
            L5c:
                Yg.J r12 = Yg.J.f24997a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: Cf.h.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class d implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Cf.d f2740a;

        d(Cf.d dVar) {
            this.f2740a = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(InterfaceC8511f.b bVar) {
            bVar.a();
            return J.f24997a;
        }

        public final void b(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(669831248, i10, -1, "com.ui.wifiman.ui.wifi.network.WifiNetworkDetailUi.<anonymous> (WifiNetworkDetailUi.kt:74)");
            }
            final InterfaceC8511f.b bVar = (InterfaceC8511f.b) interfaceC3540l.t(AbstractC8460B.K());
            androidx.compose.ui.e eVarC = j0.c(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null));
            String strB = AbstractC7930a.b((s9.d) o1.b(this.f2740a.c(), null, interfaceC3540l, 0, 1).getValue(), interfaceC3540l, 0);
            AbstractC3198d.a aVar = AbstractC3198d.a.f11402b;
            interfaceC3540l.U(1530940712);
            boolean zT = interfaceC3540l.T(bVar);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: Cf.j
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return h.d.c(bVar);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            L9.E.i(eVarC, strB, aVar, (InterfaceC6824a) objF, null, 0L, 0L, 0L, 0.0f, null, 0.0f, interfaceC3540l, AbstractC3198d.a.f11403c << 6, 0, 2032);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class e implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Cf.d f2741a;

        e(Cf.d dVar) {
            this.f2741a = dVar;
        }

        public final void a(N scaffoldPadding, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(scaffoldPadding, "scaffoldPadding");
            if ((i10 & 6) == 0) {
                i10 |= interfaceC3540l.T(scaffoldPadding) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1932740489, i10, -1, "com.ui.wifiman.ui.wifi.network.WifiNetworkDetailUi.<anonymous> (WifiNetworkDetailUi.kt:85)");
            }
            h.c(o.h(androidx.compose.ui.e.f28771b0, scaffoldPadding), this.f2741a, interfaceC3540l, 0, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((N) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(androidx.compose.ui.e eVar, final Cf.d dVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        final androidx.compose.ui.e eVar2;
        int i12;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1019917190);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            eVar2 = eVar;
        } else if ((i10 & 6) == 0) {
            eVar2 = eVar;
            i12 = (interfaceC3540lR.T(eVar2) ? 4 : 2) | i10;
        } else {
            eVar2 = eVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(dVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            androidx.compose.ui.e eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1019917190, i12, -1, "com.ui.wifiman.ui.wifi.network.Content (WifiNetworkDetailUi.kt:97)");
            }
            z zVarB = y.f18962a.b(null, null, null, null, interfaceC3540lR, y.f18968g << 12, 15);
            A.B bC = A.C.c(0, 0, interfaceC3540lR, 0, 3);
            interfaceC3540lR.U(1503796393);
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                objF = h0.a(0, 0, 0, 0);
                interfaceC3540lR.K(objF);
            }
            f0 f0Var = (f0) objF;
            interfaceC3540lR.J();
            interfaceC3540lR.U(1503798598);
            Object objF2 = interfaceC3540lR.f();
            if (objF2 == aVar.a()) {
                objF2 = h1.a(0L);
                interfaceC3540lR.K(objF2);
            }
            InterfaceC3547o0 interfaceC3547o0 = (InterfaceC3547o0) objF2;
            interfaceC3540lR.J();
            androidx.compose.ui.e eVar4 = eVar3;
            C0.b(f0Var, androidx.compose.ui.input.nestedscroll.a.b(eVar3, zVarB.a(), null, 2, null), null, b0.c.e(1719322828, true, new a(dVar, zVarB, interfaceC3547o0), interfaceC3540lR, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).e().a(), 0L, b0.c.e(-1911059067, true, new b(dVar, bC), interfaceC3540lR, 54), interfaceC3540lR, 3078, 100663296, 196596);
            Long lValueOf = Long.valueOf(d(interfaceC3547o0));
            interfaceC3540l2 = interfaceC3540lR;
            interfaceC3540l2.U(1503988613);
            boolean zT = interfaceC3540l2.T(bC) | interfaceC3540l2.T(zVarB);
            Object objF3 = interfaceC3540l2.f();
            if (zT || objF3 == aVar.a()) {
                objF3 = new c(bC, zVarB, interfaceC3547o0, null);
                interfaceC3540l2.K(objF3);
            }
            interfaceC3540l2.J();
            O.f(lValueOf, (InterfaceC6839p) objF3, interfaceC3540l2, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar4;
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Cf.f
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return h.f(eVar2, dVar, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long d(InterfaceC3547o0 interfaceC3547o0) {
        return interfaceC3547o0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InterfaceC3547o0 interfaceC3547o0, long j10) {
        interfaceC3547o0.m(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(androidx.compose.ui.e eVar, Cf.d dVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(eVar, dVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    public static final void g(androidx.compose.ui.e eVar, Cf.d dVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        final androidx.compose.ui.e eVar2;
        int i12;
        final Cf.d dVar2;
        Cf.d dVar3;
        androidx.compose.ui.e eVar3;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-391495349);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            eVar2 = eVar;
        } else if ((i10 & 6) == 0) {
            eVar2 = eVar;
            i12 = (interfaceC3540lR.T(eVar2) ? 4 : 2) | i10;
        } else {
            eVar2 = eVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                dVar2 = dVar;
                int i14 = interfaceC3540lR.T(dVar2) ? 32 : 16;
                i12 |= i14;
            } else {
                dVar2 = dVar;
            }
            i12 |= i14;
        } else {
            dVar2 = dVar;
        }
        int i15 = i12;
        if ((i15 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            interfaceC3540lR.q();
            if ((i10 & 1) == 0 || interfaceC3540lR.H()) {
                androidx.compose.ui.e eVar4 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
                if ((i11 & 2) != 0) {
                    interfaceC3540lR.U(-1927673007);
                    S sA = C4195a.f33733a.a(interfaceC3540lR, C4195a.f33735c);
                    if (sA == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    androidx.lifecycle.N nB = AbstractC4197c.b(Cf.d.class, sA, null, (P.c) interfaceC3540lR.t(AbstractC8664j.c()), null, interfaceC3540lR, 0, 16);
                    InterfaceC4017o interfaceC4017o = (InterfaceC4017o) interfaceC3540lR.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    Object objT = interfaceC3540lR.t(AbstractC5265c.a());
                    AbstractC6492s.g(objT, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    androidx.appcompat.app.c cVar = (androidx.appcompat.app.c) objT;
                    Object objT2 = interfaceC3540lR.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    interfaceC3540lR.U(831146569);
                    boolean zL = interfaceC3540lR.l(nB) | interfaceC3540lR.l(cVar) | interfaceC3540lR.l(interfaceC4017o);
                    Object objF = interfaceC3540lR.f();
                    if (zL || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C8663i(nB, interfaceC4017o, cVar);
                        interfaceC3540lR.K(objF);
                    }
                    interfaceC3540lR.J();
                    O.c(objT2, (InterfaceC6835l) objF, interfaceC3540lR, 0);
                    interfaceC3540lR.J();
                    dVar3 = (Cf.d) nB;
                    i15 &= -113;
                } else {
                    dVar3 = dVar2;
                }
                eVar3 = eVar4;
            } else {
                interfaceC3540lR.C();
                if ((i11 & 2) != 0) {
                    i15 &= -113;
                }
                eVar3 = eVar2;
                dVar3 = dVar2;
            }
            interfaceC3540lR.S();
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-391495349, i15, -1, "com.ui.wifiman.ui.wifi.network.WifiNetworkDetailUi (WifiNetworkDetailUi.kt:69)");
            }
            interfaceC3540l2 = interfaceC3540lR;
            Cf.d dVar4 = dVar3;
            C0.a(eVar3, null, b0.c.e(669831248, true, new d(dVar3), interfaceC3540lR, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).e().a(), 0L, b0.c.e(1932740489, true, new e(dVar3), interfaceC3540lR, 54), interfaceC3540l2, (i15 & 14) | 384, 12582912, 98298);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar3;
            dVar2 = dVar4;
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Cf.e
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return h.h(eVar2, dVar2, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J h(androidx.compose.ui.e eVar, Cf.d dVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        g(eVar, dVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
