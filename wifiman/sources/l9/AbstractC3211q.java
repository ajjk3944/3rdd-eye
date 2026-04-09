package L9;

import C0.InterfaceC2524d;
import E0.InterfaceC2629g;
import L9.AbstractC3211q;
import N.AbstractC3343s;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.AbstractC3561w;
import T.E1;
import T.I0;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import Zg.AbstractC3689v;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.platform.AbstractC3932k0;
import dh.C5385j;
import f0.c;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import r.C7516C;
import r.u0;
import sh.AbstractC7978m;
import z.C8680c;
import z.W;
import z.Y;
import z.Z;

/* renamed from: L9.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3211q {

    /* renamed from: L9.q$a */
    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ mh.q f11454a;

        a(mh.q qVar) {
            this.f11454a = qVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1962317801, i10, -1, "com.ui.core.ui.component.toolbar.Actions.<anonymous> (UiToolbarBase.kt:175)");
            }
            C8680c.e eVarC = C8680c.f66832a.c();
            c.InterfaceC1752c interfaceC1752cI = f0.c.f46573a.i();
            mh.q qVar = this.f11454a;
            e.a aVar = androidx.compose.ui.e.f28771b0;
            C0.C cB = W.b(eVarC, interfaceC1752cI, interfaceC3540l, 54);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, aVar);
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
            qVar.s(Z.f66823a, interfaceC3540l, 6);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: L9.q$b */
    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f11455a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ mh.q f11456b;

        /* renamed from: L9.q$b$a */
        static final class a implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f11457a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ mh.q f11458b;

            a(float f10, mh.q qVar) {
                this.f11457a = f10;
                this.f11458b = qVar;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-126323713, i10, -1, "com.ui.core.ui.component.toolbar.AppBar.<anonymous>.<anonymous> (UiToolbarBase.kt:199)");
                }
                androidx.compose.ui.e eVarI = androidx.compose.foundation.layout.r.i(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), this.f11457a);
                C8680c.e eVarF = C8680c.f66832a.f();
                c.InterfaceC1752c interfaceC1752cI = f0.c.f46573a.i();
                mh.q qVar = this.f11458b;
                C0.C cB = W.b(eVarF, interfaceC1752cI, interfaceC3540l, 54);
                int iA = AbstractC3536j.a(interfaceC3540l, 0);
                InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
                androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarI);
                InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
                InterfaceC6824a interfaceC6824aA = aVar.a();
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
                E1.c(interfaceC3540lA, cB, aVar.e());
                E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
                InterfaceC6839p interfaceC6839pB = aVar.b();
                if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                    interfaceC3540lA.K(Integer.valueOf(iA));
                    interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
                }
                E1.c(interfaceC3540lA, eVarE, aVar.f());
                qVar.s(Z.f66823a, interfaceC3540l, 6);
                interfaceC3540l.R();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return Yg.J.f24997a;
            }
        }

        b(float f10, mh.q qVar) {
            this.f11455a = f10;
            this.f11456b = qVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2099187903, i10, -1, "com.ui.core.ui.component.toolbar.AppBar.<anonymous> (UiToolbarBase.kt:198)");
            }
            AbstractC3561w.a(AbstractC3343s.a().d(Float.valueOf(N.r.f14715a.d(interfaceC3540l, N.r.f14716b))), b0.c.e(-126323713, true, new a(this.f11455a, this.f11456b), interfaceC3540l, 54), interfaceC3540l, I0.f20869i | 48);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: L9.q$c */
    static final class c implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f11459a;

        /* renamed from: L9.q$c$a */
        static final class a implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f11460a;

            /* renamed from: L9.q$c$a$a, reason: collision with other inner class name */
            static final class C0451a implements mh.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C7516C f11461a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Ii.N f11462b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC6839p f11463c;

                C0451a(C7516C c7516c, Ii.N n10, InterfaceC6839p interfaceC6839p) {
                    this.f11461a = c7516c;
                    this.f11462b = n10;
                    this.f11463c = interfaceC6839p;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final boolean f(C7516C c7516c, Ii.N n10, Y0.r rVar) {
                    C7516C.g(c7516c, rVar, n10, null, 4, null);
                    return !c7516c.d();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final C0.D h(C7516C c7516c, Ii.N n10, InterfaceC2524d approachLayout, C0.B measurable, Y0.b bVar) {
                    AbstractC6492s.i(approachLayout, "$this$approachLayout");
                    AbstractC6492s.i(measurable, "measurable");
                    long j10 = ((Y0.r) C7516C.g(c7516c, Y0.r.b(approachLayout.N()), n10, null, 4, null)).j();
                    final androidx.compose.ui.layout.t tVarT = measurable.T(Y0.b.f24516b.c(Y0.r.g(j10), Y0.r.f(j10)));
                    return androidx.compose.ui.layout.m.x0(approachLayout, tVarT.I0(), tVarT.C0(), null, new InterfaceC6835l() { // from class: L9.t
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return AbstractC3211q.c.a.C0451a.i(tVarT, (t.a) obj);
                        }
                    }, 4, null);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Yg.J i(androidx.compose.ui.layout.t tVar, t.a layout) {
                    AbstractC6492s.i(layout, "$this$layout");
                    t.a.h(layout, tVar, 0, 0, 0.0f, 4, null);
                    return Yg.J.f24997a;
                }

                public final void e(androidx.compose.ui.layout.j LookaheadScope, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(LookaheadScope, "$this$LookaheadScope");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-2117907341, i10, -1, "com.ui.core.ui.component.toolbar.Title.<anonymous>.<anonymous>.<anonymous> (UiToolbarBase.kt:147)");
                    }
                    androidx.compose.ui.e eVarD = androidx.compose.foundation.layout.r.d(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
                    interfaceC3540l.U(1576903097);
                    boolean zL = interfaceC3540l.l(this.f11461a) | interfaceC3540l.l(this.f11462b);
                    final C7516C c7516c = this.f11461a;
                    final Ii.N n10 = this.f11462b;
                    Object objF = interfaceC3540l.f();
                    if (zL || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new InterfaceC6835l() { // from class: L9.r
                            @Override // mh.InterfaceC6835l
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(AbstractC3211q.c.a.C0451a.f(c7516c, n10, (Y0.r) obj));
                            }
                        };
                        interfaceC3540l.K(objF);
                    }
                    InterfaceC6835l interfaceC6835l = (InterfaceC6835l) objF;
                    interfaceC3540l.J();
                    interfaceC3540l.U(1576911034);
                    boolean zL2 = interfaceC3540l.l(this.f11461a) | interfaceC3540l.l(this.f11462b);
                    final C7516C c7516c2 = this.f11461a;
                    final Ii.N n11 = this.f11462b;
                    Object objF2 = interfaceC3540l.f();
                    if (zL2 || objF2 == InterfaceC3540l.f21100a.a()) {
                        objF2 = new mh.q() { // from class: L9.s
                            @Override // mh.q
                            public final Object s(Object obj, Object obj2, Object obj3) {
                                return AbstractC3211q.c.a.C0451a.h(c7516c2, n11, (InterfaceC2524d) obj, (C0.B) obj2, (Y0.b) obj3);
                            }
                        };
                        interfaceC3540l.K(objF2);
                    }
                    interfaceC3540l.J();
                    androidx.compose.ui.e eVarC = androidx.compose.ui.layout.l.c(eVarD, interfaceC6835l, null, (mh.q) objF2, 2, null);
                    f0.c cVarE = f0.c.f46573a.e();
                    InterfaceC6839p interfaceC6839p = this.f11463c;
                    C0.C cH = androidx.compose.foundation.layout.d.h(cVarE, false);
                    int iA = AbstractC3536j.a(interfaceC3540l, 0);
                    InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
                    androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarC);
                    InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
                    InterfaceC6824a interfaceC6824aA = aVar.a();
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
                    E1.c(interfaceC3540lA, cH, aVar.e());
                    E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
                    InterfaceC6839p interfaceC6839pB = aVar.b();
                    if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                        interfaceC3540lA.K(Integer.valueOf(iA));
                        interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
                    }
                    E1.c(interfaceC3540lA, eVarE, aVar.f());
                    androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
                    interfaceC6839p.invoke(interfaceC3540l, 0);
                    interfaceC3540l.R();
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    e((androidx.compose.ui.layout.j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return Yg.J.f24997a;
                }
            }

            a(InterfaceC6839p interfaceC6839p) {
                this.f11460a = interfaceC6839p;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(2061736500, i10, -1, "com.ui.core.ui.component.toolbar.Title.<anonymous>.<anonymous> (UiToolbarBase.kt:143)");
                }
                interfaceC3540l.U(437987799);
                Object objF = interfaceC3540l.f();
                InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
                if (objF == aVar.a()) {
                    objF = new C7516C(u0.e(Y0.r.f24545b));
                    interfaceC3540l.K(objF);
                }
                C7516C c7516c = (C7516C) objF;
                interfaceC3540l.J();
                Object objF2 = interfaceC3540l.f();
                if (objF2 == aVar.a()) {
                    objF2 = new T.A(T.O.i(C5385j.f46088a, interfaceC3540l));
                    interfaceC3540l.K(objF2);
                }
                androidx.compose.ui.layout.l.a(b0.c.e(-2117907341, true, new C0451a(c7516c, ((T.A) objF2).a(), this.f11460a), interfaceC3540l, 54), interfaceC3540l, 6);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return Yg.J.f24997a;
            }
        }

        c(InterfaceC6839p interfaceC6839p) {
            this.f11459a = interfaceC6839p;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1986966900, i10, -1, "com.ui.core.ui.component.toolbar.Title.<anonymous> (UiToolbarBase.kt:142)");
            }
            AbstractC3561w.a(AbstractC3343s.a().d(Float.valueOf(N.r.f14715a.c(interfaceC3540l, N.r.f14716b))), b0.c.e(2061736500, true, new a(this.f11459a), interfaceC3540l, 54), interfaceC3540l, I0.f20869i | 48);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: L9.q$d */
    static final class d implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z.N f11464a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f11465b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ mh.q f11466c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f11467d;

        /* renamed from: L9.q$d$a */
        static final class a implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f11468a;

            a(InterfaceC6839p interfaceC6839p) {
                this.f11468a = interfaceC6839p;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1806586901, i10, -1, "com.ui.core.ui.component.toolbar.UiToolbarBase.<anonymous>.<anonymous> (UiToolbarBase.kt:70)");
                }
                AbstractC3211q.m(this.f11468a, interfaceC3540l, 0);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return Yg.J.f24997a;
            }
        }

        /* renamed from: L9.q$d$b */
        static final class b implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ mh.q f11469a;

            b(mh.q qVar) {
                this.f11469a = qVar;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1287239052, i10, -1, "com.ui.core.ui.component.toolbar.UiToolbarBase.<anonymous>.<anonymous> (UiToolbarBase.kt:70)");
                }
                AbstractC3211q.h(this.f11469a, interfaceC3540l, 0);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return Yg.J.f24997a;
            }
        }

        /* renamed from: L9.q$d$c */
        static final class c implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f11470a;

            c(InterfaceC6839p interfaceC6839p) {
                this.f11470a = interfaceC6839p;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-86097709, i10, -1, "com.ui.core.ui.component.toolbar.UiToolbarBase.<anonymous>.<anonymous> (UiToolbarBase.kt:70)");
                }
                AbstractC3211q.p(this.f11470a, interfaceC3540l, 0);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return Yg.J.f24997a;
            }
        }

        /* renamed from: L9.q$d$d, reason: collision with other inner class name */
        static final class C0452d implements C0.G {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f11471a;

            C0452d(float f10) {
                this.f11471a = f10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Yg.J g(androidx.compose.ui.layout.t tVar, long j10, t.a layout) {
                AbstractC6492s.i(layout, "$this$layout");
                t.a.h(layout, tVar, (Y0.b.l(j10) - tVar.I0()) / 2, (Y0.b.k(j10) - tVar.C0()) / 2, 0.0f, 4, null);
                return Yg.J.f24997a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Yg.J h(androidx.compose.ui.layout.t tVar, int i10, int i11, androidx.compose.ui.layout.t tVar2, int i12, androidx.compose.ui.layout.t tVar3, t.a layout) {
                AbstractC6492s.i(layout, "$this$layout");
                if (tVar != null) {
                    t.a.l(layout, tVar, i10, (i11 - tVar.C0()) / 2, 0.0f, 4, null);
                }
                if (tVar2 != null) {
                    t.a.l(layout, tVar2, (i12 - tVar2.I0()) - i10, (i11 - tVar2.C0()) / 2, 0.0f, 4, null);
                }
                t.a.l(layout, tVar3, (i12 - tVar3.I0()) / 2, (i11 - tVar3.C0()) / 2, 0.0f, 4, null);
                return Yg.J.f24997a;
            }

            @Override // C0.G
            public final C0.D b(androidx.compose.ui.layout.m Layout, List measurables, final long j10) {
                AbstractC6492s.i(Layout, "$this$Layout");
                AbstractC6492s.i(measurables, "measurables");
                C0.B b10 = (C0.B) AbstractC3689v.s0((List) measurables.get(0));
                androidx.compose.ui.layout.t tVarT = b10 != null ? b10.T(j10) : null;
                C0.B b11 = (C0.B) AbstractC3689v.s0((List) measurables.get(1));
                final androidx.compose.ui.layout.t tVarT2 = b11 != null ? b11.T(j10) : null;
                int iMax = Math.max(tVarT != null ? tVarT.I0() : 0, tVarT2 != null ? tVarT2.I0() : 0);
                if (iMax == 0) {
                    final androidx.compose.ui.layout.t tVarT3 = ((C0.B) AbstractC3689v.q0((List) measurables.get(2))).T(Y0.b.d(j10, 0, AbstractC7978m.d(Y0.b.l(j10) - (Layout.x1(this.f11471a) * 2), Y0.b.n(j10)), 0, 0, 13, null));
                    return androidx.compose.ui.layout.m.x0(Layout, Y0.b.l(j10), Y0.b.k(j10), null, new InterfaceC6835l() { // from class: L9.u
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return AbstractC3211q.d.C0452d.g(tVarT3, j10, (t.a) obj);
                        }
                    }, 4, null);
                }
                final int iX1 = Layout.x1(Y0.h.j(this.f11471a - Y0.h.j(6)));
                int i10 = iX1 * 2;
                final androidx.compose.ui.layout.t tVarT4 = ((C0.B) AbstractC3689v.q0((List) measurables.get(2))).T(Y0.b.d(j10, 0, AbstractC7978m.d((Y0.b.l(Y0.b.d(j10, 0, AbstractC7978m.d(Y0.b.l(j10) - i10, Y0.b.n(j10)), 0, 0, 13, null)) - (iMax * 2)) - i10, Y0.b.n(j10)), 0, 0, 13, null));
                final int iL = Y0.b.l(j10);
                final int iK = Y0.b.k(j10);
                final androidx.compose.ui.layout.t tVar = tVarT;
                return androidx.compose.ui.layout.m.x0(Layout, iL, iK, null, new InterfaceC6835l() { // from class: L9.v
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return AbstractC3211q.d.C0452d.h(tVar, iX1, iK, tVarT2, iL, tVarT4, (t.a) obj);
                    }
                }, 4, null);
            }
        }

        d(z.N n10, InterfaceC6839p interfaceC6839p, mh.q qVar, InterfaceC6839p interfaceC6839p2) {
            this.f11464a = n10;
            this.f11465b = interfaceC6839p;
            this.f11466c = qVar;
            this.f11467d = interfaceC6839p2;
        }

        public final void a(Y AppBar, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AppBar, "$this$AppBar");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(595792822, i10, -1, "com.ui.core.ui.component.toolbar.UiToolbarBase.<anonymous> (UiToolbarBase.kt:66)");
            }
            float fA = this.f11464a.a((Y0.t) interfaceC3540l.t(AbstractC3932k0.m()));
            e.a aVar = androidx.compose.ui.e.f28771b0;
            List listO = AbstractC3689v.o(b0.c.e(1806586901, true, new a(this.f11465b), interfaceC3540l, 54), b0.c.e(-1287239052, true, new b(this.f11466c), interfaceC3540l, 54), b0.c.e(-86097709, true, new c(this.f11467d), interfaceC3540l, 54));
            interfaceC3540l.U(-992901133);
            boolean zG = interfaceC3540l.g(fA);
            Object objF = interfaceC3540l.f();
            if (zG || objF == InterfaceC3540l.f21100a.a()) {
                objF = new C0452d(fA);
                interfaceC3540l.K(objF);
            }
            C0.G g10 = (C0.G) objF;
            interfaceC3540l.J();
            InterfaceC6839p interfaceC6839pB = C0.w.b(listO);
            boolean zT = interfaceC3540l.T(g10);
            Object objF2 = interfaceC3540l.f();
            if (zT || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = C0.I.a(g10);
                interfaceC3540l.K(objF2);
            }
            C0.C c10 = (C0.C) objF2;
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, aVar);
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
            E1.c(interfaceC3540lA, c10, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB2 = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            interfaceC6839pB.invoke(interfaceC3540l, 0);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(final mh.q qVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-505597143);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-505597143, i11, -1, "com.ui.core.ui.component.toolbar.Actions (UiToolbarBase.kt:170)");
            }
            if (qVar == null) {
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                X0 x0Z = interfaceC3540lR.z();
                if (x0Z != null) {
                    x0Z.a(new InterfaceC6839p() { // from class: L9.m
                        @Override // mh.InterfaceC6839p
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC3211q.i(qVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            AbstractC3561w.a(AbstractC3343s.a().d(Float.valueOf(N.r.f14715a.c(interfaceC3540lR, N.r.f14716b))), b0.c.e(1962317801, true, new a(qVar), interfaceC3540lR, 54), interfaceC3540lR, I0.f20869i | 48);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z2 = interfaceC3540lR.z();
        if (x0Z2 != null) {
            x0Z2.a(new InterfaceC6839p() { // from class: L9.n
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3211q.j(qVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J i(mh.q qVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        h(qVar, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J j(mh.q qVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        h(qVar, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void k(androidx.compose.ui.e r22, final long r23, final long r25, final float r27, float r28, final mh.q r29, T.InterfaceC3540l r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L9.AbstractC3211q.k(androidx.compose.ui.e, long, long, float, float, mh.q, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J l(androidx.compose.ui.e eVar, long j10, long j11, float f10, float f11, mh.q qVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        k(eVar, j10, j11, f10, f11, qVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(final InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1922328485);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(interfaceC6839p) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1922328485, i11, -1, "com.ui.core.ui.component.toolbar.Navigation (UiToolbarBase.kt:127)");
            }
            if (interfaceC6839p == null) {
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                X0 x0Z = interfaceC3540lR.z();
                if (x0Z != null) {
                    x0Z.a(new InterfaceC6839p() { // from class: L9.k
                        @Override // mh.InterfaceC6839p
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC3211q.n(interfaceC6839p, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            f0.c cVarH = f0.c.f46573a.h();
            e.a aVar = androidx.compose.ui.e.f28771b0;
            C0.C cH = androidx.compose.foundation.layout.d.h(cVarH, false);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, aVar);
            InterfaceC2629g.a aVar2 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar2.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA, cH, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            AbstractC3561w.a(AbstractC3343s.a().d(Float.valueOf(N.r.f14715a.c(interfaceC3540lR, N.r.f14716b))), interfaceC6839p, interfaceC3540lR, ((i11 << 3) & 112) | I0.f20869i);
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z2 = interfaceC3540lR.z();
        if (x0Z2 != null) {
            x0Z2.a(new InterfaceC6839p() { // from class: L9.l
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3211q.o(interfaceC6839p, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J n(InterfaceC6839p interfaceC6839p, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        m(interfaceC6839p, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J o(InterfaceC6839p interfaceC6839p, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        m(interfaceC6839p, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(final InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1595146877);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(interfaceC6839p) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1595146877, i11, -1, "com.ui.core.ui.component.toolbar.Title (UiToolbarBase.kt:140)");
            }
            a1.a(C6562a.f52458a.c(interfaceC3540lR, C6562a.f52459b).a().c(), b0.c.e(1986966900, true, new c(interfaceC6839p), interfaceC3540lR, 54), interfaceC3540lR, 48);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: L9.p
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3211q.q(interfaceC6839p, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J q(InterfaceC6839p interfaceC6839p, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        p(interfaceC6839p, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void r(androidx.compose.ui.e r20, mh.InterfaceC6839p r21, mh.InterfaceC6839p r22, mh.q r23, long r24, float r26, long r27, z.N r29, float r30, T.InterfaceC3540l r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L9.AbstractC3211q.r(androidx.compose.ui.e, mh.p, mh.p, mh.q, long, float, long, z.N, float, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J s(androidx.compose.ui.e eVar, InterfaceC6839p interfaceC6839p, InterfaceC6839p interfaceC6839p2, mh.q qVar, long j10, float f10, long j11, z.N n10, float f11, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        r(eVar, interfaceC6839p, interfaceC6839p2, qVar, j10, f10, j11, n10, f11, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }
}
