package Le;

import Be.C2459b0;
import Be.m0;
import C0.C;
import E0.InterfaceC2629g;
import L9.L;
import L9.z;
import Le.a;
import Le.s;
import N.C0;
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
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC4017o;
import androidx.lifecycle.P;
import androidx.lifecycle.S;
import b8.EnumC4076c;
import c2.AbstractC4197c;
import c2.C4195a;
import com.ui.wifiman.ui.component.network.AbstractC5218p;
import com.ui.wifiman.ui.component.network.C5205c;
import d.AbstractC5263a;
import d.AbstractC5265c;
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
import q.AbstractC7385d;
import q.AbstractC7391j;
import q.InterfaceC7386e;
import s9.d;
import ye.AbstractC8664j;
import ye.C8663i;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8687j;
import z.N;
import z.Y;
import z.a0;
import z.j0;

/* loaded from: classes4.dex */
public abstract class s {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2459b0 f11637a;

        /* renamed from: Le.s$a$a, reason: collision with other inner class name */
        static final class C0463a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C2459b0 f11638a;

            C0463a(C2459b0 c2459b0) {
                this.f11638a = c2459b0;
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
                    AbstractC3546o.Q(-364968508, i10, -1, "com.ui.wifiman.ui.discovery.DiscoveryHomeToolbar.<anonymous>.<anonymous> (DiscoveryHomeUi.kt:162)");
                }
                s9.b bVarH = N9.b.f16117a.H();
                long jA = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).c().a();
                interfaceC3540l.U(101409322);
                boolean zT = interfaceC3540l.T(this.f11638a);
                final C2459b0 c2459b0 = this.f11638a;
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6824a() { // from class: Le.r
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return s.a.C0463a.c(c2459b0);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                z.c(bVarH, null, jA, false, (InterfaceC6824a) objF, interfaceC3540l, 0, 10);
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

        a(C2459b0 c2459b0) {
            this.f11637a = c2459b0;
        }

        public final void a(Y WifimanNetworkConnectionToolbar, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(WifimanNetworkConnectionToolbar, "$this$WifimanNetworkConnectionToolbar");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1693779267, i10, -1, "com.ui.wifiman.ui.discovery.DiscoveryHomeToolbar.<anonymous> (DiscoveryHomeUi.kt:161)");
            }
            L.b(null, b0.c.e(-364968508, true, new C0463a(this.f11637a), interfaceC3540l, 54), interfaceC3540l, 48, 1);
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

    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z1 f11639a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C7125a.c f11640b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C5205c.b f11641c;

        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C7125a.c f11642a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C5205c.b f11643b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z1 f11644c;

            a(C7125a.c cVar, C5205c.b bVar, z1 z1Var) {
                this.f11642a = cVar;
                this.f11643b = bVar;
                this.f11644c = z1Var;
            }

            public final void a(boolean z10, InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= interfaceC3540l.c(z10) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-664102302, i10, -1, "com.ui.wifiman.ui.discovery.DiscoveryHomeUi.<anonymous>.<anonymous> (DiscoveryHomeUi.kt:62)");
                }
                if (z10) {
                    interfaceC3540l.U(1443678243);
                    He.f.b(j0.c(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null)), s.f(this.f11644c), new d.b(AbstractC6780c.f53595v0), interfaceC3540l, 0);
                    interfaceC3540l.J();
                } else {
                    interfaceC3540l.U(1444065650);
                    s.c(j0.c(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null)), this.f11642a, this.f11643b, s.f(this.f11644c), interfaceC3540l, 0);
                    interfaceC3540l.J();
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a(((Boolean) obj).booleanValue(), (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        b(z1 z1Var, C7125a.c cVar, C5205c.b bVar) {
            this.f11639a = z1Var;
            this.f11640b = cVar;
            this.f11641c = bVar;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1521503743, i10, -1, "com.ui.wifiman.ui.discovery.DiscoveryHomeUi.<anonymous> (DiscoveryHomeUi.kt:61)");
            }
            AbstractC7391j.a(s.f(this.f11639a).c().getValue(), null, null, "toolbarCrossfade", b0.c.e(-664102302, true, new a(this.f11640b, this.f11641c, this.f11639a), interfaceC3540l, 54), interfaceC3540l, 27648, 6);
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

    static final class c implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z1 f11645a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Le.d f11646b;

        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ J9.j f11647a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Le.d f11648b;

            a(J9.j jVar, Le.d dVar) {
                this.f11647a = jVar;
                this.f11648b = dVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J c(Le.d dVar, J9.a tab) {
                Le.c cVar;
                AbstractC6492s.i(tab, "tab");
                int iC = tab.c();
                if (iC == 0) {
                    cVar = Le.c.LAN;
                } else {
                    if (iC != 1) {
                        throw new IllegalStateException("unknown tab id " + tab.c());
                    }
                    cVar = Le.c.BLUETOOTH;
                }
                dVar.s0(cVar);
                return J.f24997a;
            }

            public final void b(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(636906138, i10, -1, "com.ui.wifiman.ui.discovery.DiscoveryHomeUi.<anonymous>.<anonymous>.<anonymous> (DiscoveryHomeUi.kt:96)");
                }
                androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
                C6562a c6562a = C6562a.f52458a;
                int i11 = C6562a.f52459b;
                androidx.compose.ui.e eVarM = androidx.compose.foundation.layout.o.m(eVarH, c6562a.d(interfaceC3540l, i11).a().a().c(), 0.0f, c6562a.d(interfaceC3540l, i11).a().a().c(), 0.0f, 10, null);
                J9.j jVar = this.f11647a;
                interfaceC3540l.U(-175044851);
                boolean zT = interfaceC3540l.T(this.f11648b);
                final Le.d dVar = this.f11648b;
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6835l() { // from class: Le.u
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return s.c.a.c(dVar, (J9.a) obj);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                J9.h.g(eVarM, jVar, false, null, (InterfaceC6835l) objF, interfaceC3540l, 0, 12);
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

        static final class b implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Le.d f11649a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z1 f11650b;

            b(Le.d dVar, z1 z1Var) {
                this.f11649a = dVar;
                this.f11650b = z1Var;
            }

            public final void a(Le.a cnt, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(cnt, "cnt");
                if ((i10 & 6) == 0) {
                    i10 |= interfaceC3540l.T(cnt) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(2138281032, i10, -1, "com.ui.wifiman.ui.discovery.DiscoveryHomeUi.<anonymous>.<anonymous>.<anonymous> (DiscoveryHomeUi.kt:124)");
                }
                if (cnt instanceof a.AbstractC0459a) {
                    interfaceC3540l.U(-175018675);
                    f.b(androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), (a.AbstractC0459a) cnt, this.f11649a, interfaceC3540l, 6);
                    interfaceC3540l.J();
                } else if (cnt instanceof a.b) {
                    interfaceC3540l.U(-175011197);
                    j.d(androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), interfaceC3540l, 6);
                    interfaceC3540l.J();
                } else {
                    if (!(cnt instanceof a.c)) {
                        interfaceC3540l.U(-175020349);
                        interfaceC3540l.J();
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC3540l.U(-1130213370);
                    m.c(androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), !((Boolean) s.f(this.f11650b).c().getValue()).booleanValue(), this.f11649a, interfaceC3540l, 6);
                    interfaceC3540l.J();
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((Le.a) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        c(z1 z1Var, Le.d dVar) {
            this.f11645a = z1Var;
            this.f11646b = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(z1 z1Var) {
            s.f(z1Var).d();
            return J.f24997a;
        }

        public final void b(N padding, InterfaceC3540l interfaceC3540l, int i10) {
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
                AbstractC3546o.Q(1850202920, i11, -1, "com.ui.wifiman.ui.discovery.DiscoveryHomeUi.<anonymous> (DiscoveryHomeUi.kt:83)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.o.h(aVar, padding);
            Le.d dVar = this.f11646b;
            z1 z1Var = this.f11645a;
            C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.k(), interfaceC3540l, 0);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarH);
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
            a0.a(androidx.compose.foundation.layout.r.i(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), C6562a.f52458a.d(interfaceC3540l, C6562a.f52459b).a().b().d()), interfaceC3540l, 0);
            Le.c cVar = (Le.c) o1.b(dVar.r0(), null, interfaceC3540l, 0, 1).getValue();
            J9.j jVarK = s.k(cVar, (EnumC4076c) o1.b(dVar.q0(), null, interfaceC3540l, 0, 1).getValue(), interfaceC3540l, 0);
            AbstractC7385d.d(c8688k, (cVar == null || ((Boolean) s.f(z1Var).c().getValue()).booleanValue()) ? false : true, null, null, null, null, b0.c.e(636906138, true, new a(jVarK, dVar), interfaceC3540l, 54), interfaceC3540l, 1572870, 30);
            AbstractC7391j.a((Le.a) o1.b(dVar.o0(), null, interfaceC3540l, 0, 1).getValue(), InterfaceC8687j.b(c8688k, androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), 1.0f, false, 2, null), null, "contentCrossfade", b0.c.e(2138281032, true, new b(dVar, z1Var), interfaceC3540l, 54), interfaceC3540l, 27648, 4);
            interfaceC3540l.R();
            boolean zBooleanValue = ((Boolean) s.f(this.f11645a).c().getValue()).booleanValue();
            interfaceC3540l.U(-2136092046);
            boolean zT = interfaceC3540l.T(this.f11645a);
            final z1 z1Var2 = this.f11645a;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: Le.t
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return s.c.c(z1Var2);
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

    /* synthetic */ class d extends C6490p implements InterfaceC6835l {
        d(Object obj) {
            super(1, obj, Le.d.class, "onSearchQueryChanged", "onSearchQueryChanged(Ljava/lang/String;)V", 0);
        }

        public final void a(String p02) {
            AbstractC6492s.i(p02, "p0");
            ((Le.d) this.receiver).y0(p02);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final androidx.compose.ui.e eVar, final C7125a.c cVar, final C5205c.b bVar, final C2459b0 c2459b0, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1214890747);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(bVar) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC3540lR.T(c2459b0) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1214890747, i11, -1, "com.ui.wifiman.ui.discovery.DiscoveryHomeToolbar (DiscoveryHomeUi.kt:155)");
            }
            He.C.b(eVar, cVar, bVar, b0.c.e(-1693779267, true, new a(c2459b0), interfaceC3540lR, 54), interfaceC3540lR, (i11 & 14) | 3072 | (i11 & 112) | (i11 & 896), 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Le.q
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return s.d(eVar, cVar, bVar, c2459b0, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d(androidx.compose.ui.e eVar, C7125a.c cVar, C5205c.b bVar, C2459b0 c2459b0, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        c(eVar, cVar, bVar, c2459b0, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    public static final void e(androidx.compose.ui.e eVar, Le.d dVar, C7125a.c cVar, C5205c.b bVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        Le.d dVar2;
        C7125a.c cVar2;
        C5205c.b bVar2;
        androidx.compose.ui.e eVar3;
        String str;
        String str2;
        int i13;
        int i14;
        Le.d dVar3;
        int i15;
        int i16;
        C7125a.c cVar3;
        C5205c.b bVar3;
        final C7125a.c cVar4;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-261599194);
        int i17 = i11 & 1;
        if (i17 != 0) {
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
                int i18 = interfaceC3540lR.T(dVar2) ? 32 : 16;
                i12 |= i18;
            } else {
                dVar2 = dVar;
            }
            i12 |= i18;
        } else {
            dVar2 = dVar;
        }
        if ((i10 & 384) == 0) {
            cVar2 = cVar;
            i12 |= ((i11 & 4) == 0 && interfaceC3540lR.T(cVar2)) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        } else {
            cVar2 = cVar;
        }
        if ((i10 & 3072) == 0) {
            bVar2 = bVar;
            i12 |= ((i11 & 8) == 0 && interfaceC3540lR.T(bVar2)) ? 2048 : 1024;
        } else {
            bVar2 = bVar;
        }
        if ((i12 & 1171) == 1170 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
            dVar3 = dVar2;
            cVar4 = cVar2;
        } else {
            interfaceC3540lR.q();
            if ((i10 & 1) == 0 || interfaceC3540lR.H()) {
                eVar3 = i17 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
                if ((i11 & 2) != 0) {
                    interfaceC3540lR.U(-1927673007);
                    S sA = C4195a.f33733a.a(interfaceC3540lR, C4195a.f33735c);
                    if (sA == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    str = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
                    str2 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity";
                    i13 = 831146569;
                    androidx.lifecycle.N nB = AbstractC4197c.b(Le.d.class, sA, null, (P.c) interfaceC3540lR.t(AbstractC8664j.c()), null, interfaceC3540lR, 0, 16);
                    InterfaceC4017o interfaceC4017o = (InterfaceC4017o) interfaceC3540lR.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    Object objT = interfaceC3540lR.t(AbstractC5265c.a());
                    AbstractC6492s.g(objT, str2);
                    androidx.appcompat.app.c cVar5 = (androidx.appcompat.app.c) objT;
                    Object objT2 = interfaceC3540lR.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    interfaceC3540lR.U(831146569);
                    boolean zL = interfaceC3540lR.l(nB) | interfaceC3540lR.l(cVar5) | interfaceC3540lR.l(interfaceC4017o);
                    Object objF = interfaceC3540lR.f();
                    if (zL || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C8663i(nB, interfaceC4017o, cVar5);
                        interfaceC3540lR.K(objF);
                    }
                    interfaceC3540lR.J();
                    i14 = 0;
                    O.c(objT2, (InterfaceC6835l) objF, interfaceC3540lR, 0);
                    interfaceC3540lR.J();
                    dVar2 = (Le.d) nB;
                    i12 &= -113;
                } else {
                    str = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
                    str2 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity";
                    i13 = 831146569;
                    i14 = 0;
                }
                int i19 = i12;
                dVar3 = dVar2;
                if ((i11 & 4) != 0) {
                    interfaceC3540lR.U(-1927673007);
                    S sA2 = C4195a.f33733a.a(interfaceC3540lR, C4195a.f33735c);
                    if (sA2 == null) {
                        throw new IllegalStateException(str);
                    }
                    int i20 = i14;
                    androidx.lifecycle.N nB2 = AbstractC4197c.b(C7125a.c.class, sA2, null, (P.c) interfaceC3540lR.t(AbstractC8664j.c()), null, interfaceC3540lR, 0, 16);
                    InterfaceC4017o interfaceC4017o2 = (InterfaceC4017o) interfaceC3540lR.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    Object objT3 = interfaceC3540lR.t(AbstractC5265c.a());
                    AbstractC6492s.g(objT3, str2);
                    androidx.appcompat.app.c cVar6 = (androidx.appcompat.app.c) objT3;
                    Object objT4 = interfaceC3540lR.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    interfaceC3540lR.U(i13);
                    boolean zL2 = interfaceC3540lR.l(nB2) | interfaceC3540lR.l(cVar6) | interfaceC3540lR.l(interfaceC4017o2);
                    Object objF2 = interfaceC3540lR.f();
                    if (zL2 || objF2 == InterfaceC3540l.f21100a.a()) {
                        objF2 = new C8663i(nB2, interfaceC4017o2, cVar6);
                        interfaceC3540lR.K(objF2);
                    }
                    interfaceC3540lR.J();
                    O.c(objT4, (InterfaceC6835l) objF2, interfaceC3540lR, i20);
                    interfaceC3540lR.J();
                    i19 &= -897;
                    i14 = i20;
                    cVar2 = (C7125a.c) nB2;
                }
                if ((i11 & 8) != 0) {
                    interfaceC3540lR.U(-1927673007);
                    S sA3 = C4195a.f33733a.a(interfaceC3540lR, C4195a.f33735c);
                    if (sA3 == null) {
                        throw new IllegalStateException(str);
                    }
                    int i21 = i19;
                    int i22 = i14;
                    androidx.lifecycle.N nB3 = AbstractC4197c.b(C5205c.b.class, sA3, null, (P.c) interfaceC3540lR.t(AbstractC8664j.c()), null, interfaceC3540lR, 0, 16);
                    InterfaceC4017o interfaceC4017o3 = (InterfaceC4017o) interfaceC3540lR.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    Object objT5 = interfaceC3540lR.t(AbstractC5265c.a());
                    AbstractC6492s.g(objT5, str2);
                    androidx.appcompat.app.c cVar7 = (androidx.appcompat.app.c) objT5;
                    Object objT6 = interfaceC3540lR.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    interfaceC3540lR.U(i13);
                    boolean zL3 = interfaceC3540lR.l(nB3) | interfaceC3540lR.l(cVar7) | interfaceC3540lR.l(interfaceC4017o3);
                    Object objF3 = interfaceC3540lR.f();
                    if (zL3 || objF3 == InterfaceC3540l.f21100a.a()) {
                        objF3 = new C8663i(nB3, interfaceC4017o3, cVar7);
                        interfaceC3540lR.K(objF3);
                    }
                    interfaceC3540lR.J();
                    O.c(objT6, (InterfaceC6835l) objF3, interfaceC3540lR, i22);
                    interfaceC3540lR.J();
                    i16 = i21 & (-7169);
                    i15 = i22;
                    cVar3 = cVar2;
                    bVar3 = (C5205c.b) nB3;
                } else {
                    i15 = i14;
                    i16 = i19;
                    cVar3 = cVar2;
                    bVar3 = bVar;
                }
            } else {
                interfaceC3540lR.C();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                }
                eVar3 = eVar2;
                i15 = 0;
                cVar3 = cVar2;
                bVar3 = bVar2;
                i16 = i12;
                dVar3 = dVar2;
            }
            interfaceC3540lR.S();
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-261599194, i16, -1, "com.ui.wifiman.ui.discovery.DiscoveryHomeUi (DiscoveryHomeUi.kt:52)");
            }
            interfaceC3540lR.U(-1605157383);
            int i23 = ((((i16 & 112) ^ 48) <= 32 || !interfaceC3540lR.T(dVar3)) && (i16 & 48) != 32) ? i15 : 1;
            Object objF4 = interfaceC3540lR.f();
            if (i23 != 0 || objF4 == InterfaceC3540l.f21100a.a()) {
                objF4 = new d(dVar3);
                interfaceC3540lR.K(objF4);
            }
            interfaceC3540lR.J();
            z1 z1VarN = m0.n(false, true, null, (InterfaceC6835l) ((th.g) objF4), interfaceC3540lR, 48, 5);
            C5205c.b bVar4 = bVar3;
            C0.a(eVar3, null, b0.c.e(-1521503743, true, new b(z1VarN, cVar3, bVar3), interfaceC3540lR, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).e().a(), 0L, b0.c.e(1850202920, true, new c(z1VarN, dVar3), interfaceC3540lR, 54), interfaceC3540lR, (i16 & 14) | 384, 12582912, 98298);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            cVar4 = cVar3;
            bVar2 = bVar4;
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            final androidx.compose.ui.e eVar4 = eVar3;
            final Le.d dVar4 = dVar3;
            final C5205c.b bVar5 = bVar2;
            x0Z.a(new InterfaceC6839p() { // from class: Le.p
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return s.g(eVar4, dVar4, cVar4, bVar5, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2459b0 f(z1 z1Var) {
        return (C2459b0) z1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J g(androidx.compose.ui.e eVar, Le.d dVar, C7125a.c cVar, C5205c.b bVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        e(eVar, dVar, cVar, bVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J9.j k(Le.c cVar, EnumC4076c enumC4076c, InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(-2052447542);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-2052447542, i10, -1, "com.ui.wifiman.ui.discovery.rememberContentTabs (DiscoveryHomeUi.kt:173)");
        }
        interfaceC3540l.U(231118705);
        boolean z10 = ((((i10 & 112) ^ 48) > 32 && interfaceC3540l.T(enumC4076c)) || (i10 & 48) == 32) | ((((i10 & 14) ^ 6) > 4 && interfaceC3540l.T(cVar)) || (i10 & 6) == 4);
        Object objF = interfaceC3540l.f();
        if (z10 || objF == InterfaceC3540l.f21100a.a()) {
            objF = new J9.j(new J9.a(0, AbstractC5218p.c(enumC4076c, null, 1, null), AbstractC5218p.a(enumC4076c), cVar == Le.c.LAN, null, null, 48, null), new J9.a(1, new d.b(AbstractC6780c.f53608x), Pe.a.f18599a.f(), cVar == Le.c.BLUETOOTH, null, null, 48, null));
            interfaceC3540l.K(objF);
        }
        J9.j jVar = (J9.j) objF;
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return jVar;
    }
}
