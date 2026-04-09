package Qe;

import Be.AbstractC2457a0;
import Be.m0;
import C0.C;
import E0.InterfaceC2629g;
import Ii.F0;
import Ii.N;
import Qe.c;
import Qe.q;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.AbstractC3561w;
import T.E1;
import T.H0;
import T.I0;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.O;
import T.X0;
import T.o1;
import Yg.J;
import Yg.v;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.ui.e;
import d.AbstractC5263a;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import f2.AbstractC5498D;
import f2.C5501G;
import f2.n;
import f2.w;
import f2.z;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import q.AbstractC7385d;
import q.InterfaceC7386e;
import xe.r0;
import xe.t0;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;

/* loaded from: classes4.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    private static final H0 f19331a = AbstractC3561w.f(new InterfaceC6824a() { // from class: Qe.k
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return q.h();
        }
    });

    /* renamed from: b, reason: collision with root package name */
    private static final H0 f19332b = AbstractC3561w.f(new InterfaceC6824a() { // from class: Qe.l
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return q.g();
        }
    });

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC8687j f19333a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f19334b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f19335c;

        /* renamed from: Qe.q$a$a, reason: collision with other inner class name */
        static final class C0683a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f19336a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f19337b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0683a(w wVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f19337b = wVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new C0683a(this.f19337b, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f19336a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                this.f19337b.u(false);
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((C0683a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f19338a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f19339b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f19340c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(w wVar, String str, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f19339b = wVar;
                this.f19340c = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J E(C5501G c5501g) {
                c5501g.d(true);
                return J.f24997a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J v(w wVar, z zVar) {
                zVar.c(f2.t.f46899q.b(wVar.I()).s(), new InterfaceC6835l() { // from class: Qe.s
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return q.a.b.E((C5501G) obj);
                    }
                });
                zVar.g(true);
                zVar.j(true);
                return J.f24997a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new b(this.f19339b, this.f19340c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
                AbstractC5467b.g();
                if (this.f19338a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                final w wVar = this.f19339b;
                wVar.V(this.f19340c, new InterfaceC6835l() { // from class: Qe.r
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj2) {
                        return q.a.b.v(wVar, (z) obj2);
                    }
                });
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f19341a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f19342b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ r0 f19343c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(w wVar, r0 r0Var, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f19342b = wVar;
                this.f19343c = r0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
            java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
             */
            public static final void t(r0 r0Var, f2.n nVar, f2.r rVar, Bundle bundle) {
                String strW = rVar.w();
                if (strW != null) {
                    switch (strW.hashCode()) {
                        case -1849138520:
                            if (strW.equals("SIGNAL")) {
                                r0Var.a(P7.b.ROOT_SIGNAL);
                                break;
                            }
                            break;
                        case -1629579888:
                            if (strW.equals("DISCOVERY")) {
                                r0Var.a(P7.b.ROOT_DISCOVERY);
                                break;
                            }
                            break;
                        case -577575125:
                            if (strW.equals("TELEPORT")) {
                                r0Var.a(P7.b.ROOT_TELEPORT);
                                break;
                            }
                            break;
                        case 2539133:
                            if (strW.equals("SCAN")) {
                                r0Var.a(P7.b.ROOT_SCAN);
                                break;
                            }
                            break;
                        case 79104039:
                            if (strW.equals("SPEED")) {
                                r0Var.a(P7.b.ROOT_SPEED);
                                break;
                            }
                            break;
                    }
                }
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new c(this.f19342b, this.f19343c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f19341a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                w wVar = this.f19342b;
                final r0 r0Var = this.f19343c;
                wVar.r(new n.c() { // from class: Qe.t
                    @Override // f2.n.c
                    public final void a(f2.n nVar, f2.r rVar, Bundle bundle) {
                        q.a.c.t(r0Var, nVar, rVar, bundle);
                    }
                });
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        a(InterfaceC8687j interfaceC8687j, w wVar, d dVar) {
            this.f19333a = interfaceC8687j;
            this.f19334b = wVar;
            this.f19335c = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(f2.u NavHost) {
            AbstractC6492s.i(NavHost, "$this$NavHost");
            Qe.a aVar = Qe.a.f19295a;
            Ae.a.c(NavHost, "SPEED", null, null, aVar.b(), 6, null);
            Ae.a.c(NavHost, "SIGNAL", null, null, aVar.c(), 6, null);
            Ae.a.c(NavHost, "SCAN", null, null, aVar.d(), 6, null);
            Ae.a.c(NavHost, "DISCOVERY", null, null, aVar.e(), 6, null);
            Ae.a.c(NavHost, "TELEPORT", null, null, aVar.f(), 6, null);
            return J.f24997a;
        }

        public final void b(InterfaceC3540l interfaceC3540l, int i10) {
            F0 f02;
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-607708381, i10, -1, "com.ui.wifiman.ui.root.WiFimanRootNavigation.<anonymous>.<anonymous> (WifimanRootUi.kt:74)");
            }
            InterfaceC8687j interfaceC8687j = this.f19333a;
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarA = interfaceC8687j.a(aVar, 1.0f, true);
            w wVar = this.f19334b;
            d dVar = this.f19335c;
            C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.o(), false);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarA);
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
            androidx.compose.ui.e eVarF = androidx.compose.foundation.layout.r.f(aVar, 0.0f, 1, null);
            String strName = Qe.c.f19315a.a().name();
            interfaceC3540l.U(596025284);
            Object objF = interfaceC3540l.f();
            InterfaceC3540l.a aVar3 = InterfaceC3540l.f21100a;
            if (objF == aVar3.a()) {
                objF = new InterfaceC6835l() { // from class: Qe.p
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return q.a.c((f2.u) obj);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            g2.m.b(wVar, strName, eVarF, null, null, null, null, null, null, null, (InterfaceC6835l) objF, interfaceC3540l, 384, 6, 1016);
            interfaceC3540l.U(596044416);
            boolean zL = interfaceC3540l.l(wVar);
            Object objF2 = interfaceC3540l.f();
            if (zL || objF2 == aVar3.a()) {
                f02 = null;
                objF2 = new C0683a(wVar, null);
                interfaceC3540l.K(objF2);
            } else {
                f02 = null;
            }
            interfaceC3540l.J();
            O.f(wVar, (InterfaceC6839p) objF2, interfaceC3540l, 0);
            String strName2 = ((c.a) o1.b(dVar.c(), f02, interfaceC3540l, 0, 1).getValue()).name();
            interfaceC3540l.U(596051227);
            boolean zL2 = interfaceC3540l.l(wVar) | interfaceC3540l.T(strName2);
            Object objF3 = interfaceC3540l.f();
            if (zL2 || objF3 == aVar3.a()) {
                objF3 = new b(wVar, strName2, f02);
                interfaceC3540l.K(objF3);
            }
            interfaceC3540l.J();
            O.f(strName2, (InterfaceC6839p) objF3, interfaceC3540l, 0);
            r0 r0Var = (r0) interfaceC3540l.t(t0.d());
            interfaceC3540l.U(596080933);
            boolean zL3 = interfaceC3540l.l(wVar) | interfaceC3540l.l(r0Var);
            Object objF4 = interfaceC3540l.f();
            if (zL3 || objF4 == aVar3.a()) {
                objF4 = new c(wVar, r0Var, f02);
                interfaceC3540l.K(objF4);
            }
            interfaceC3540l.J();
            O.f(wVar, (InterfaceC6839p) objF4, interfaceC3540l, 0);
            interfaceC3540l.R();
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

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f19344a;

        b(d dVar) {
            this.f19344a = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(d dVar, J9.a tab) {
            AbstractC6492s.i(tab, "tab");
            dVar.b(tab.c());
            return J.f24997a;
        }

        public final void b(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-640963573, i10, -1, "com.ui.wifiman.ui.root.WiFimanRootNavigation.<anonymous>.<anonymous> (WifimanRootUi.kt:133)");
            }
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
            J9.j jVar = (J9.j) o1.b(this.f19344a.d(), null, interfaceC3540l, 0, 1).getValue();
            interfaceC3540l.U(-1632052159);
            boolean zL = interfaceC3540l.l(this.f19344a);
            final d dVar = this.f19344a;
            Object objF = interfaceC3540l.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: Qe.u
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return q.b.c(dVar, (J9.a) obj);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            AbstractC2457a0.g(eVarH, jVar, (InterfaceC6835l) objF, interfaceC3540l, 6, 0);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.ui.wifiman.ui.teleport.consoles.i g() {
        throw new IllegalStateException("No TeleportConsolePickerVM set");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final He.p h() {
        throw new IllegalStateException("No WifimanToolbarDropdown set");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(final androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-180082592);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f28771b0;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-180082592, i12, -1, "com.ui.wifiman.ui.root.WiFimanRootDropdownOverlay (WifimanRootUi.kt:153)");
            }
            He.v.f(eVar, (He.p) interfaceC3540lR.t(f19331a), 0L, Qe.a.f19295a.g(), interfaceC3540lR, (i12 & 14) | 3072, 4);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Qe.m
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return q.j(eVar, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J j(androidx.compose.ui.e eVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        i(eVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        final androidx.compose.ui.e eVar2;
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1876731879);
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
        if ((i12 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            androidx.compose.ui.e eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1876731879, i12, -1, "com.ui.wifiman.ui.root.WiFimanRootNavigation (WifimanRootUi.kt:65)");
            }
            androidx.compose.ui.e eVarF = androidx.compose.foundation.layout.r.f(eVar3, 0.0f, 1, null);
            C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.k(), interfaceC3540lR, 0);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarF);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
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
            E1.c(interfaceC3540lA, cA, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            C8688k c8688k = C8688k.f66923a;
            final d dVar = (d) interfaceC3540lR.t(i.f());
            w wVarD = g2.l.d(new AbstractC5498D[0], interfaceC3540lR, 0);
            AbstractC3561w.a(m0.m().d(m0.q(interfaceC3540lR, 0)), b0.c.e(-607708381, true, new a(c8688k, wVarD, dVar), interfaceC3540lR, 54), interfaceC3540lR, I0.f20869i | 48);
            androidx.compose.ui.e eVar4 = eVar3;
            AbstractC7385d.d(c8688k, !((Boolean) r5.a().getValue()).booleanValue(), null, null, null, null, b0.c.e(-640963573, true, new b(dVar), interfaceC3540lR, 54), interfaceC3540lR, 1572870, 30);
            boolean zBooleanValue = ((Boolean) o1.b(dVar.e(), null, interfaceC3540lR, 0, 1).getValue()).booleanValue();
            interfaceC3540lR.U(-1291041724);
            boolean zL = interfaceC3540lR.l(dVar);
            Object objF = interfaceC3540lR.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: Qe.n
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return q.l(dVar);
                    }
                };
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            AbstractC5263a.a(zBooleanValue, (InterfaceC6824a) objF, interfaceC3540lR, 0, 0);
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar4;
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Qe.o
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return q.m(eVar2, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J l(d dVar) {
        dVar.a();
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J m(androidx.compose.ui.e eVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        k(eVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void n(final com.ui.wifiman.ui.teleport.consoles.i r12, T.InterfaceC3540l r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Qe.q.n(com.ui.wifiman.ui.teleport.consoles.i, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J o(com.ui.wifiman.ui.teleport.consoles.i iVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        n(iVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    public static final H0 r() {
        return f19332b;
    }

    public static final H0 s() {
        return f19331a;
    }
}
