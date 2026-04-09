package Ze;

import E0.InterfaceC2629g;
import Ee.B;
import He.C;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.o1;
import Yg.J;
import Ze.c;
import af.AbstractC3793B;
import af.AbstractC3799H;
import af.AbstractC3805N;
import af.C3800I;
import af.C3807P;
import af.d0;
import af.e0;
import af.m0;
import af.q0;
import af.u0;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import androidx.compose.foundation.m;
import androidx.compose.ui.e;
import com.ui.wifiman.ui.component.network.C5205c;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import of.C7125a;
import q.AbstractC7385d;
import q.InterfaceC7386e;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.N;
import z.a0;
import z.j0;

/* loaded from: classes4.dex */
public abstract class c {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7125a.c f25298a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5205c.b f25299b;

        a(C7125a.c cVar, C5205c.b bVar) {
            this.f25298a = cVar;
            this.f25299b = bVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(377381346, i10, -1, "com.ui.wifiman.ui.speed.SpeedTabUi.<anonymous> (SpeedTabUi.kt:42)");
            }
            C.b(j0.c(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null)), this.f25298a, this.f25299b, null, interfaceC3540l, 0, 8);
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
        final /* synthetic */ androidx.compose.ui.e f25300a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ze.a f25301b;

        static final class a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3800I f25302a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ze.a f25303b;

            /* renamed from: Ze.c$b$a$a, reason: collision with other inner class name */
            /* synthetic */ class C0973a extends C6490p implements InterfaceC6835l {
                C0973a(Object obj) {
                    super(1, obj, Ze.a.class, "onPermissionWarningClicked", "onPermissionWarningClicked(Ljava/lang/String;)V", 0);
                }

                public final void a(String p02) {
                    AbstractC6492s.i(p02, "p0");
                    ((Ze.a) this.receiver).u0(p02);
                }

                @Override // mh.InterfaceC6835l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((String) obj);
                    return J.f24997a;
                }
            }

            a(C3800I c3800i, Ze.a aVar) {
                this.f25302a = c3800i;
                this.f25303b = aVar;
            }

            public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(809817077, i10, -1, "com.ui.wifiman.ui.speed.SpeedTabUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SpeedTabUi.kt:68)");
                }
                C3800I c3800i = this.f25302a;
                if (c3800i != null) {
                    Ze.a aVar = this.f25303b;
                    androidx.compose.ui.e eVarH = r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
                    interfaceC3540l.U(-1424862778);
                    boolean zT = interfaceC3540l.T(aVar);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C0973a(aVar);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    AbstractC3805N.b(eVarH, c3800i, (InterfaceC6835l) ((th.g) objF), interfaceC3540l, 6);
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

        /* renamed from: Ze.c$b$b, reason: collision with other inner class name */
        static final class C0974b implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3807P f25304a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ze.a f25305b;

            C0974b(C3807P c3807p, Ze.a aVar) {
                this.f25304a = c3807p;
                this.f25305b = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J c(Ze.a aVar, String it) {
                AbstractC6492s.i(it, "it");
                aVar.w0(it);
                return J.f24997a;
            }

            public final void b(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(2051042173, i10, -1, "com.ui.wifiman.ui.speed.SpeedTabUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SpeedTabUi.kt:115)");
                }
                C3807P c3807p = this.f25304a;
                if (c3807p != null) {
                    final Ze.a aVar = this.f25305b;
                    interfaceC3540l.U(-1424794828);
                    boolean zT = interfaceC3540l.T(aVar);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new InterfaceC6835l() { // from class: Ze.d
                            @Override // mh.InterfaceC6835l
                            public final Object invoke(Object obj) {
                                return c.b.C0974b.c(aVar, (String) obj);
                            }
                        };
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    d0.w(null, c3807p, null, (InterfaceC6835l) objF, null, interfaceC3540l, 0, 21);
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                b((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        /* renamed from: Ze.c$b$c, reason: collision with other inner class name */
        /* synthetic */ class C0975c extends C6490p implements InterfaceC6824a {
            C0975c(Object obj) {
                super(0, obj, Ze.a.class, "onLatencyCardClicked", "onLatencyCardClicked()V", 0);
            }

            public final void a() {
                ((Ze.a) this.receiver).t0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        /* synthetic */ class d extends C6490p implements InterfaceC6835l {
            d(Object obj) {
                super(1, obj, Ze.a.class, "onTopologyItemSpeedtestClicked", "onTopologyItemSpeedtestClicked(Ljava/lang/String;)V", 0);
            }

            public final void a(String p02) {
                AbstractC6492s.i(p02, "p0");
                ((Ze.a) this.receiver).F0(p02);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return J.f24997a;
            }
        }

        /* synthetic */ class e extends C6490p implements InterfaceC6835l {
            e(Object obj) {
                super(1, obj, Ze.a.class, "onTopologyItemClicked", "onTopologyItemClicked(Ljava/lang/String;)V", 0);
            }

            public final void a(String p02) {
                AbstractC6492s.i(p02, "p0");
                ((Ze.a) this.receiver).E0(p02);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((String) obj);
                return J.f24997a;
            }
        }

        /* synthetic */ class f extends C6490p implements InterfaceC6824a {
            f(Object obj) {
                super(0, obj, Ze.a.class, "onSpeedtestStartClicked", "onSpeedtestStartClicked()V", 0);
            }

            public final void a() {
                ((Ze.a) this.receiver).D0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        /* synthetic */ class g extends C6490p implements InterfaceC6824a {
            g(Object obj) {
                super(0, obj, Ze.a.class, "onServerSelectionClicked", "onServerSelectionClicked()V", 0);
            }

            public final void a() {
                ((Ze.a) this.receiver).v0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        /* synthetic */ class h extends C6490p implements InterfaceC6824a {
            h(Object obj) {
                super(0, obj, Ze.a.class, "onSpeedtestHistoryClicked", "onSpeedtestHistoryClicked()V", 0);
            }

            public final void a() {
                ((Ze.a) this.receiver).C0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        /* synthetic */ class i extends C6490p implements InterfaceC6824a {
            i(Object obj) {
                super(0, obj, Ze.a.class, "onSpeedtestDetailClicked", "onSpeedtestDetailClicked()V", 0);
            }

            public final void a() {
                ((Ze.a) this.receiver).B0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return J.f24997a;
            }
        }

        /* synthetic */ class j extends C6490p implements InterfaceC6835l {
            j(Object obj) {
                super(1, obj, Ze.a.class, "onSpeedtestAdvancedEnabledChanged", "onSpeedtestAdvancedEnabledChanged(Z)V", 0);
            }

            public final void a(boolean z10) {
                ((Ze.a) this.receiver).A0(z10);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Boolean) obj).booleanValue());
                return J.f24997a;
            }
        }

        static final class k implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C3807P f25306a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ze.a f25307b;

            /* synthetic */ class a extends C6490p implements InterfaceC6824a {
                a(Object obj) {
                    super(0, obj, Ze.a.class, "onSpeedFactorsWifiOverallRatingClicked", "onSpeedFactorsWifiOverallRatingClicked()V", 0);
                }

                public final void a() {
                    ((Ze.a) this.receiver).z0();
                }

                @Override // mh.InterfaceC6824a
                public /* bridge */ /* synthetic */ Object invoke() {
                    a();
                    return J.f24997a;
                }
            }

            k(C3807P c3807p, Ze.a aVar) {
                this.f25306a = c3807p;
                this.f25307b = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J e(Ze.a aVar, S8.c it) {
                AbstractC6492s.i(it, "it");
                aVar.x0(it);
                return J.f24997a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J f(Ze.a aVar, String it) {
                AbstractC6492s.i(it, "it");
                aVar.y0(it);
                return J.f24997a;
            }

            public final void c(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(879833502, i10, -1, "com.ui.wifiman.ui.speed.SpeedTabUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SpeedTabUi.kt:103)");
                }
                C3807P c3807p = this.f25306a;
                if (c3807p != null) {
                    final Ze.a aVar = this.f25307b;
                    interfaceC3540l.U(-1424809550);
                    boolean zT = interfaceC3540l.T(aVar);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new a(aVar);
                        interfaceC3540l.K(objF);
                    }
                    th.g gVar = (th.g) objF;
                    interfaceC3540l.J();
                    interfaceC3540l.U(-1424812592);
                    boolean zT2 = interfaceC3540l.T(aVar);
                    Object objF2 = interfaceC3540l.f();
                    if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                        objF2 = new InterfaceC6835l() { // from class: Ze.e
                            @Override // mh.InterfaceC6835l
                            public final Object invoke(Object obj) {
                                return c.b.k.e(aVar, (S8.c) obj);
                            }
                        };
                        interfaceC3540l.K(objF2);
                    }
                    InterfaceC6835l interfaceC6835l = (InterfaceC6835l) objF2;
                    interfaceC3540l.J();
                    interfaceC3540l.U(-1424815376);
                    boolean zT3 = interfaceC3540l.T(aVar);
                    Object objF3 = interfaceC3540l.f();
                    if (zT3 || objF3 == InterfaceC3540l.f21100a.a()) {
                        objF3 = new InterfaceC6835l() { // from class: Ze.f
                            @Override // mh.InterfaceC6835l
                            public final Object invoke(Object obj) {
                                return c.b.k.f(aVar, (String) obj);
                            }
                        };
                        interfaceC3540l.K(objF3);
                    }
                    interfaceC3540l.J();
                    d0.w(null, c3807p, interfaceC6835l, (InterfaceC6835l) objF3, (InterfaceC6824a) gVar, interfaceC3540l, 0, 1);
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                c((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        b(androidx.compose.ui.e eVar, Ze.a aVar) {
            this.f25300a = eVar;
            this.f25301b = aVar;
        }

        public final void a(N padding, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(padding, "padding");
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC3540l.T(padding) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1322611895, i11, -1, "com.ui.wifiman.ui.speed.SpeedTabUi.<anonymous> (SpeedTabUi.kt:51)");
            }
            androidx.compose.ui.e eVarH = o.h(r.f(this.f25300a, 0.0f, 1, null), padding);
            androidx.compose.ui.e eVar = this.f25300a;
            Ze.a aVar = this.f25301b;
            c.a aVar2 = f0.c.f46573a;
            C0.C cH = androidx.compose.foundation.layout.d.h(aVar2.o(), false);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarH);
            InterfaceC2629g.a aVar3 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar3.a();
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
            E1.c(interfaceC3540lA, cH, aVar3.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar3.g());
            InterfaceC6839p interfaceC6839pB = aVar3.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar3.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            androidx.compose.ui.e eVarD = m.d(r.f(eVar, 0.0f, 1, null), m.a(0, interfaceC3540l, 0, 1), false, null, false, 14, null);
            float f10 = 8;
            C0.C cA = AbstractC8685h.a(C8680c.f66832a.n(Y0.h.j(f10)), aVar2.k(), interfaceC3540l, 6);
            int iA2 = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540l.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540l, eVarD);
            InterfaceC6824a interfaceC6824aA2 = aVar3.a();
            if (interfaceC3540l.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l.u();
            if (interfaceC3540l.o()) {
                interfaceC3540l.D(interfaceC6824aA2);
            } else {
                interfaceC3540l.I();
            }
            InterfaceC3540l interfaceC3540lA2 = E1.a(interfaceC3540l);
            E1.c(interfaceC3540lA2, cA, aVar3.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar3.g());
            InterfaceC6839p interfaceC6839pB2 = aVar3.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar3.f());
            C8688k c8688k = C8688k.f66923a;
            e.a aVar4 = androidx.compose.ui.e.f28771b0;
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            a0.a(r.i(aVar4, c6562a.d(interfaceC3540l, i12).a().b().e()), interfaceC3540l, 0);
            C3800I c3800i = (C3800I) o1.b(aVar.o0(), null, interfaceC3540l, 0, 1).getValue();
            AbstractC7385d.d(c8688k, c3800i != null, null, null, null, null, b0.c.e(809817077, true, new a(c3800i, aVar), interfaceC3540l, 54), interfaceC3540l, 1572870, 30);
            androidx.compose.ui.e eVarH2 = r.h(aVar4, 0.0f, 1, null);
            q0 q0Var = (q0) o1.b(aVar.s0(), null, interfaceC3540l, 0, 1).getValue();
            interfaceC3540l.U(-31974580);
            boolean zT = interfaceC3540l.T(aVar);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new d(aVar);
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            InterfaceC6835l interfaceC6835l = (InterfaceC6835l) ((th.g) objF);
            interfaceC3540l.U(-31972285);
            boolean zT2 = interfaceC3540l.T(aVar);
            Object objF2 = interfaceC3540l.f();
            if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new e(aVar);
                interfaceC3540l.K(objF2);
            }
            interfaceC3540l.J();
            u0.h(eVarH2, q0Var, interfaceC6835l, (InterfaceC6835l) ((th.g) objF2), interfaceC3540l, 6);
            a0.a(r.i(aVar4, Y0.h.j(f10)), interfaceC3540l, 6);
            androidx.compose.ui.e eVarH3 = r.h(aVar4, 0.0f, 1, null);
            e0.a aVar5 = (e0.a) o1.b(aVar.r0(), null, interfaceC3540l, 0, 1).getValue();
            interfaceC3540l.U(-31961563);
            boolean zT3 = interfaceC3540l.T(aVar);
            Object objF3 = interfaceC3540l.f();
            if (zT3 || objF3 == InterfaceC3540l.f21100a.a()) {
                objF3 = new f(aVar);
                interfaceC3540l.K(objF3);
            }
            interfaceC3540l.J();
            InterfaceC6824a interfaceC6824a = (InterfaceC6824a) ((th.g) objF3);
            interfaceC3540l.U(-31959226);
            boolean zT4 = interfaceC3540l.T(aVar);
            Object objF4 = interfaceC3540l.f();
            if (zT4 || objF4 == InterfaceC3540l.f21100a.a()) {
                objF4 = new g(aVar);
                interfaceC3540l.K(objF4);
            }
            interfaceC3540l.J();
            InterfaceC6824a interfaceC6824a2 = (InterfaceC6824a) ((th.g) objF4);
            interfaceC3540l.U(-31956889);
            boolean zT5 = interfaceC3540l.T(aVar);
            Object objF5 = interfaceC3540l.f();
            if (zT5 || objF5 == InterfaceC3540l.f21100a.a()) {
                objF5 = new h(aVar);
                interfaceC3540l.K(objF5);
            }
            interfaceC3540l.J();
            InterfaceC6824a interfaceC6824a3 = (InterfaceC6824a) ((th.g) objF5);
            interfaceC3540l.U(-31954426);
            boolean zT6 = interfaceC3540l.T(aVar);
            Object objF6 = interfaceC3540l.f();
            if (zT6 || objF6 == InterfaceC3540l.f21100a.a()) {
                objF6 = new i(aVar);
                interfaceC3540l.K(objF6);
            }
            interfaceC3540l.J();
            InterfaceC6824a interfaceC6824a4 = (InterfaceC6824a) ((th.g) objF6);
            interfaceC3540l.U(-31952049);
            boolean zT7 = interfaceC3540l.T(aVar);
            Object objF7 = interfaceC3540l.f();
            if (zT7 || objF7 == InterfaceC3540l.f21100a.a()) {
                objF7 = new j(aVar);
                interfaceC3540l.K(objF7);
            }
            interfaceC3540l.J();
            m0.q(eVarH3, aVar5, interfaceC6824a, interfaceC6824a2, interfaceC6824a3, interfaceC6824a4, (InterfaceC6835l) ((th.g) objF7), interfaceC3540l, 6);
            a0.a(r.i(aVar4, Y0.h.j(f10)), interfaceC3540l, 6);
            C3807P c3807p = (C3807P) o1.b(aVar.q0(), null, interfaceC3540l, 0, 1).getValue();
            AbstractC7385d.d(c8688k, c3807p != null, null, null, null, null, b0.c.e(879833502, true, new k(c3807p, aVar), interfaceC3540l, 54), interfaceC3540l, 1572870, 30);
            C3807P c3807p2 = (C3807P) o1.b(aVar.p0(), null, interfaceC3540l, 0, 1).getValue();
            AbstractC7385d.d(c8688k, c3807p2 != null, null, null, null, null, b0.c.e(2051042173, true, new C0974b(c3807p2, aVar), interfaceC3540l, 54), interfaceC3540l, 1572870, 30);
            androidx.compose.ui.e eVarH4 = r.h(aVar4, 0.0f, 1, null);
            AbstractC3793B abstractC3793B = (AbstractC3793B) o1.b(aVar.n0(), null, interfaceC3540l, 0, 1).getValue();
            interfaceC3540l.U(-31906430);
            boolean zT8 = interfaceC3540l.T(aVar);
            Object objF8 = interfaceC3540l.f();
            if (zT8 || objF8 == InterfaceC3540l.f21100a.a()) {
                objF8 = new C0975c(aVar);
                interfaceC3540l.K(objF8);
            }
            interfaceC3540l.J();
            AbstractC3799H.o(eVarH4, abstractC3793B, (InterfaceC6824a) ((th.g) objF8), interfaceC3540l, 6);
            a0.a(r.i(aVar4, Y0.h.j(40)), interfaceC3540l, 6);
            interfaceC3540l.R();
            B.b(null, c6562a.a(interfaceC3540l, i12).e().b(), interfaceC3540l, 0, 1);
            interfaceC3540l.R();
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

    /* JADX WARN: Removed duplicated region for block: B:111:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.compose.ui.e r36, Ze.a r37, of.C7125a.c r38, com.ui.wifiman.ui.component.network.C5205c.b r39, T.InterfaceC3540l r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ze.c.b(androidx.compose.ui.e, Ze.a, of.a$c, com.ui.wifiman.ui.component.network.c$b, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, Ze.a aVar, C7125a.c cVar, C5205c.b bVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, aVar, cVar, bVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
