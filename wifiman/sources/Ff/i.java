package Ff;

import Af.A;
import Af.B;
import Af.E;
import Be.M;
import Be.m0;
import Be.n0;
import C0.C;
import E0.InterfaceC2629g;
import Ee.C2706g;
import Ee.F;
import Ff.c;
import Ff.i;
import Gf.i;
import N.AbstractC3313c0;
import N.C0;
import N.Z;
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
import androidx.compose.ui.e;
import dh.InterfaceC5380e;
import f0.c;
import ic.EnumC6141b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import q.AbstractC7385d;
import q.InterfaceC7383b;
import q.InterfaceC7386e;
import z.AbstractC8682e;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8683f;
import z.InterfaceC8687j;
import z.N;
import z.W;
import z.Y;
import z.a0;
import z.f0;
import z.h0;

/* loaded from: classes4.dex */
public abstract class i {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f6540a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f6541b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC3547o0 f6542c;

        /* renamed from: Ff.i$a$a, reason: collision with other inner class name */
        static final class C0259a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f6543a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3547o0 f6544b;

            C0259a(e eVar, InterfaceC3547o0 interfaceC3547o0) {
                this.f6543a = eVar;
                this.f6544b = interfaceC3547o0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J c(e eVar, InterfaceC3547o0 interfaceC3547o0, S8.c cVar) {
                eVar.F0(cVar);
                i.e(interfaceC3547o0, System.currentTimeMillis());
                return J.f24997a;
            }

            public final void b(InterfaceC8687j UiCardCollapsible, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(UiCardCollapsible, "$this$UiCardCollapsible");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(670274602, i10, -1, "com.ui.wifiman.ui.wifi.scan.WifiScanUiContent.<anonymous>.<anonymous> (WifiScanUiContent.kt:88)");
                }
                e.a aVar = androidx.compose.ui.e.f28771b0;
                C6562a c6562a = C6562a.f52458a;
                int i11 = C6562a.f52459b;
                androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(aVar, c6562a.d(interfaceC3540l, i11).a().a().c(), c6562a.d(interfaceC3540l, i11).a().b().d());
                B b10 = (B) o1.b(this.f6543a.u0(), null, interfaceC3540l, 0, 1).getValue();
                interfaceC3540l.U(-1468436418);
                boolean zT = interfaceC3540l.T(this.f6543a);
                final e eVar = this.f6543a;
                final InterfaceC3547o0 interfaceC3547o0 = this.f6544b;
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6835l() { // from class: Ff.h
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return i.a.C0259a.c(eVar, interfaceC3547o0, (S8.c) obj);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                E.c(eVarJ, b10, (InterfaceC6835l) objF, interfaceC3540l, 0, 0);
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

        static final class b implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f6545a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3547o0 f6546b;

            /* renamed from: Ff.i$a$b$a, reason: collision with other inner class name */
            static final class C0260a implements mh.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ e f6547a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC3547o0 f6548b;

                /* renamed from: Ff.i$a$b$a$a, reason: collision with other inner class name */
                static final class C0261a implements InterfaceC6839p {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ e f6549a;

                    /* renamed from: Ff.i$a$b$a$a$a, reason: collision with other inner class name */
                    /* synthetic */ class C0262a extends C6490p implements InterfaceC6824a {
                        C0262a(Object obj) {
                            super(0, obj, e.class, "onSortClicked", "onSortClicked()V", 0);
                        }

                        public final void a() {
                            ((e) this.receiver).C0();
                        }

                        @Override // mh.InterfaceC6824a
                        public /* bridge */ /* synthetic */ Object invoke() {
                            a();
                            return J.f24997a;
                        }
                    }

                    C0261a(e eVar) {
                        this.f6549a = eVar;
                    }

                    public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                        if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                            interfaceC3540l.C();
                            return;
                        }
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.Q(313583767, i10, -1, "com.ui.wifiman.ui.wifi.scan.WifiScanUiContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WifiScanUiContent.kt:190)");
                        }
                        androidx.compose.ui.e eVarV = androidx.compose.foundation.layout.r.v(androidx.compose.ui.e.f28771b0, Y0.h.j(24));
                        e eVar = this.f6549a;
                        interfaceC3540l.U(-960197470);
                        boolean zT = interfaceC3540l.T(eVar);
                        Object objF = interfaceC3540l.f();
                        if (zT || objF == InterfaceC3540l.f21100a.a()) {
                            objF = new C0262a(eVar);
                            interfaceC3540l.K(objF);
                        }
                        interfaceC3540l.J();
                        Z.a((InterfaceC6824a) ((th.g) objF), eVarV, false, null, Ff.a.f6514a.a(), interfaceC3540l, 24624, 12);
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

                C0260a(e eVar, InterfaceC3547o0 interfaceC3547o0) {
                    this.f6547a = eVar;
                    this.f6548b = interfaceC3547o0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final J c(e eVar, InterfaceC3547o0 interfaceC3547o0, EnumC6141b it) {
                    AbstractC6492s.i(it, "it");
                    eVar.z0(it);
                    i.e(interfaceC3547o0, System.currentTimeMillis());
                    return J.f24997a;
                }

                public final void b(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-200960143, i10, -1, "com.ui.wifiman.ui.wifi.scan.WifiScanUiContent.<anonymous>.<anonymous>.<anonymous> (WifiScanUiContent.kt:170)");
                    }
                    final e eVar = this.f6547a;
                    final InterfaceC3547o0 interfaceC3547o0 = this.f6548b;
                    e.a aVar = androidx.compose.ui.e.f28771b0;
                    C8680c c8680c = C8680c.f66832a;
                    C8680c.m mVarG = c8680c.g();
                    c.a aVar2 = f0.c.f46573a;
                    C cA = AbstractC8685h.a(mVarG, aVar2.k(), interfaceC3540l, 0);
                    int iA = AbstractC3536j.a(interfaceC3540l, 0);
                    InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
                    androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, aVar);
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
                    E1.c(interfaceC3540lA, cA, aVar3.e());
                    E1.c(interfaceC3540lA, interfaceC3563xG, aVar3.g());
                    InterfaceC6839p interfaceC6839pB = aVar3.b();
                    if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                        interfaceC3540lA.K(Integer.valueOf(iA));
                        interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
                    }
                    E1.c(interfaceC3540lA, eVarE, aVar3.f());
                    C8688k c8688k = C8688k.f66923a;
                    a0.a(androidx.compose.foundation.layout.r.i(aVar, Y0.h.j(16)), interfaceC3540l, 6);
                    androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(aVar, C6562a.f52458a.d(interfaceC3540l, C6562a.f52459b).a().a().c(), 0.0f, 2, null);
                    C cB = W.b(c8680c.f(), aVar2.i(), interfaceC3540l, 48);
                    int iA2 = AbstractC3536j.a(interfaceC3540l, 0);
                    InterfaceC3563x interfaceC3563xG2 = interfaceC3540l.G();
                    androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540l, eVarK);
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
                    E1.c(interfaceC3540lA2, cB, aVar3.e());
                    E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar3.g());
                    InterfaceC6839p interfaceC6839pB2 = aVar3.b();
                    if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                        interfaceC3540lA2.K(Integer.valueOf(iA2));
                        interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
                    }
                    E1.c(interfaceC3540lA2, eVarE2, aVar3.f());
                    z.Z z10 = z.Z.f66823a;
                    Gf.h hVar = (Gf.h) o1.b(eVar.s0(), null, interfaceC3540l, 0, 1).getValue();
                    interfaceC3540l.U(-2047035030);
                    boolean zT = interfaceC3540l.T(eVar);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new InterfaceC6835l() { // from class: Ff.j
                            @Override // mh.InterfaceC6835l
                            public final Object invoke(Object obj) {
                                return i.a.b.C0260a.c(eVar, interfaceC3547o0, (EnumC6141b) obj);
                            }
                        };
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    Gf.g.c(null, hVar, (InterfaceC6835l) objF, interfaceC3540l, 0, 1);
                    a0.a(Y.b(z10, aVar, 1.0f, false, 2, null), interfaceC3540l, 0);
                    AbstractC3561w.a(AbstractC3313c0.b().d(Boolean.FALSE), b0.c.e(313583767, true, new C0261a(eVar), interfaceC3540l, 54), interfaceC3540l, 48 | I0.f20869i);
                    interfaceC3540l.R();
                    interfaceC3540l.R();
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

            b(e eVar, InterfaceC3547o0 interfaceC3547o0) {
                this.f6545a = eVar;
                this.f6546b = interfaceC3547o0;
            }

            public final void a(InterfaceC8687j UiCardCollapsible, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(UiCardCollapsible, "$this$UiCardCollapsible");
                if ((i10 & 6) == 0) {
                    i10 |= interfaceC3540l.T(UiCardCollapsible) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(364640073, i10, -1, "com.ui.wifiman.ui.wifi.scan.WifiScanUiContent.<anonymous>.<anonymous> (WifiScanUiContent.kt:169)");
                }
                AbstractC7385d.d(UiCardCollapsible, !((Boolean) ((n0) interfaceC3540l.t(m0.m())).a().getValue()).booleanValue(), null, null, null, null, b0.c.e(-200960143, true, new C0260a(this.f6545a, this.f6546b), interfaceC3540l, 54), interfaceC3540l, (i10 & 14) | 1572864, 30);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        static final class c implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f6550a;

            /* renamed from: Ff.i$a$c$a, reason: collision with other inner class name */
            static final class C0263a implements mh.r {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Gf.k f6551a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ e f6552b;

                /* renamed from: Ff.i$a$c$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C0264a {

                    /* renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f6553a;

                    static {
                        int[] iArr = new int[Ff.b.values().length];
                        try {
                            iArr[Ff.b.VISIBLE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[Ff.b.SPACER.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[Ff.b.HIDDEN.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        f6553a = iArr;
                    }
                }

                C0263a(Gf.k kVar, e eVar) {
                    this.f6551a = kVar;
                    this.f6552b = eVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final J c(e eVar) {
                    eVar.D0();
                    return J.f24997a;
                }

                public final void b(InterfaceC7383b AnimatedContent, Ff.b state, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(AnimatedContent, "$this$AnimatedContent");
                    AbstractC6492s.i(state, "state");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-1726131443, i10, -1, "com.ui.wifiman.ui.wifi.scan.WifiScanUiContent.<anonymous>.<anonymous>.<anonymous> (WifiScanUiContent.kt:146)");
                    }
                    int i11 = C0264a.f6553a[state.ordinal()];
                    if (i11 == 1) {
                        interfaceC3540l.U(1974358844);
                        Gf.k kVar = this.f6551a;
                        if (kVar != null) {
                            final e eVar = this.f6552b;
                            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
                            interfaceC3540l.U(-1392425838);
                            boolean zT = interfaceC3540l.T(eVar);
                            Object objF = interfaceC3540l.f();
                            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                                objF = new InterfaceC6824a() { // from class: Ff.k
                                    @Override // mh.InterfaceC6824a
                                    public final Object invoke() {
                                        return i.a.c.C0263a.c(eVar);
                                    }
                                };
                                interfaceC3540l.K(objF);
                            }
                            interfaceC3540l.J();
                            Gf.m.b(androidx.compose.foundation.layout.o.k(androidx.compose.foundation.d.d(eVarH, false, null, null, (InterfaceC6824a) objF, 7, null), 0.0f, C6562a.f52458a.d(interfaceC3540l, C6562a.f52459b).a().b().c(), 1, null), kVar, interfaceC3540l, 0, 0);
                            J j10 = J.f24997a;
                        }
                        interfaceC3540l.J();
                    } else if (i11 == 2) {
                        interfaceC3540l.U(1974994437);
                        a0.a(androidx.compose.foundation.layout.r.i(androidx.compose.ui.e.f28771b0, Y0.h.j(16)), interfaceC3540l, 6);
                        interfaceC3540l.J();
                    } else {
                        if (i11 != 3) {
                            interfaceC3540l.U(-906144460);
                            interfaceC3540l.J();
                            throw new NoWhenBranchMatchedException();
                        }
                        interfaceC3540l.U(1975156908);
                        interfaceC3540l.J();
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.r
                public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
                    b((InterfaceC7383b) obj, (Ff.b) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
                    return J.f24997a;
                }
            }

            c(e eVar) {
                this.f6550a = eVar;
            }

            public final void a(InterfaceC8687j UiCardCollapsible, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(UiCardCollapsible, "$this$UiCardCollapsible");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-552263514, i10, -1, "com.ui.wifiman.ui.wifi.scan.WifiScanUiContent.<anonymous>.<anonymous> (WifiScanUiContent.kt:138)");
                }
                Gf.k kVar = (Gf.k) o1.b(this.f6550a.p0(), null, interfaceC3540l, 0, 1).getValue();
                boolean zBooleanValue = ((Boolean) ((n0) interfaceC3540l.t(m0.m())).a().getValue()).booleanValue();
                androidx.compose.animation.a.a((zBooleanValue || kVar == null) ? !zBooleanValue ? Ff.b.SPACER : Ff.b.HIDDEN : Ff.b.VISIBLE, null, null, null, "networkAppear", null, b0.c.e(-1726131443, true, new C0263a(kVar, this.f6550a), interfaceC3540l, 54), interfaceC3540l, 1597440, 46);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        static final class d implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f6554a;

            d(e eVar) {
                this.f6554a = eVar;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1028786067, i10, -1, "com.ui.wifiman.ui.wifi.scan.WifiScanUiContent.<anonymous>.<anonymous> (WifiScanUiContent.kt:116)");
                }
                e.a aVar = androidx.compose.ui.e.f28771b0;
                androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), C6562a.f52458a.d(interfaceC3540l, C6562a.f52459b).a().a().c(), 0.0f, 2, null);
                e eVar = this.f6554a;
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
                a0.a(androidx.compose.foundation.layout.r.i(aVar, Y0.h.j(f10)), interfaceC3540l, 6);
                A.b(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), ((B) o1.b(eVar.u0(), null, interfaceC3540l, 0, 1).getValue()).b(), interfaceC3540l, 6, 0);
                a0.a(androidx.compose.foundation.layout.r.i(aVar, Y0.h.j(f10)), interfaceC3540l, 6);
                Bf.k.e(androidx.compose.foundation.layout.r.i(androidx.compose.foundation.layout.r.h(aVar, 0.0f, 1, null), Y0.h.j(164)), (Bf.b) o1.b(eVar.n0(), null, interfaceC3540l, 0, 1).getValue(), interfaceC3540l, 6);
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

        a(e eVar, z zVar, InterfaceC3547o0 interfaceC3547o0) {
            this.f6540a = eVar;
            this.f6541b = zVar;
            this.f6542c = interfaceC3547o0;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-983769919, i10, -1, "com.ui.wifiman.ui.wifi.scan.WifiScanUiContent.<anonymous> (WifiScanUiContent.kt:84)");
            }
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
            interfaceC3540l.U(1633846585);
            boolean z10 = ((Boolean) o1.b(this.f6540a.o0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue() && !((Boolean) ((n0) interfaceC3540l.t(m0.m())).a().getValue()).booleanValue();
            interfaceC3540l.J();
            M.d(eVarH, this.f6541b, b0.c.e(670274602, true, new C0259a(this.f6540a, this.f6542c), interfaceC3540l, 54), b0.c.e(364640073, true, new b(this.f6540a, this.f6542c), interfaceC3540l, 54), null, o1.b(this.f6540a.p0(), null, interfaceC3540l, 0, 1).getValue() != null, b0.c.e(-552263514, true, new c(this.f6540a), interfaceC3540l, 54), z10, Ff.a.f6514a.b(), b0.c.e(1028786067, true, new d(this.f6540a), interfaceC3540l, 54), interfaceC3540l, 907545990, 16);
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
        final /* synthetic */ e f6555a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A.B f6556b;

        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ N f6557a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f6558b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ A.B f6559c;

            /* renamed from: Ff.i$b$a$a, reason: collision with other inner class name */
            static final class C0265a implements mh.r {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Ff.c f6560a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ e f6561b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Gf.u f6562c;

                C0265a(Ff.c cVar, e eVar, Gf.u uVar) {
                    this.f6560a = cVar;
                    this.f6561b = eVar;
                    this.f6562c = uVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final J f(e eVar, Gf.i iVar) {
                    eVar.E0(((i.c) iVar).getId());
                    return J.f24997a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final J h(e eVar, Gf.i iVar) {
                    eVar.E0(((i.c) iVar).getId());
                    return J.f24997a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final J i(e eVar, Gf.i iVar) {
                    eVar.w0(((i.a) iVar).getId());
                    return J.f24997a;
                }

                public final void e(androidx.compose.ui.e itemModifier, final Gf.i item, InterfaceC3540l interfaceC3540l, int i10) {
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
                        AbstractC3546o.Q(140541097, i11, -1, "com.ui.wifiman.ui.wifi.scan.WifiScanUiContent.<anonymous>.<anonymous>.<anonymous> (WifiScanUiContent.kt:230)");
                    }
                    boolean z10 = true;
                    if (item instanceof i.c) {
                        interfaceC3540l.U(1978493252);
                        Ff.c cVar = this.f6560a;
                        if (cVar instanceof c.b) {
                            interfaceC3540l.U(-906007061);
                            interfaceC3540l.U(-906003048);
                            boolean zT = interfaceC3540l.T(this.f6561b);
                            if ((i11 & 112) != 32 && ((i11 & 64) == 0 || !interfaceC3540l.l(item))) {
                                z10 = false;
                            }
                            boolean z11 = zT | z10;
                            final e eVar = this.f6561b;
                            Object objF = interfaceC3540l.f();
                            if (z11 || objF == InterfaceC3540l.f21100a.a()) {
                                objF = new InterfaceC6824a() { // from class: Ff.l
                                    @Override // mh.InterfaceC6824a
                                    public final Object invoke() {
                                        return i.b.a.C0265a.f(eVar, item);
                                    }
                                };
                                interfaceC3540l.K(objF);
                            }
                            interfaceC3540l.J();
                            Gf.t.k(androidx.compose.foundation.d.d(itemModifier, false, null, null, (InterfaceC6824a) objF, 7, null), ((i.c) item).a(), this.f6562c, interfaceC3540l, 0);
                            interfaceC3540l.J();
                        } else {
                            if (!(cVar instanceof c.a)) {
                                interfaceC3540l.U(-906008962);
                                interfaceC3540l.J();
                                throw new NoWhenBranchMatchedException();
                            }
                            interfaceC3540l.U(-905995441);
                            interfaceC3540l.U(-905991400);
                            boolean zT2 = interfaceC3540l.T(this.f6561b);
                            if ((i11 & 112) != 32 && ((i11 & 64) == 0 || !interfaceC3540l.l(item))) {
                                z10 = false;
                            }
                            boolean z12 = zT2 | z10;
                            final e eVar2 = this.f6561b;
                            Object objF2 = interfaceC3540l.f();
                            if (z12 || objF2 == InterfaceC3540l.f21100a.a()) {
                                objF2 = new InterfaceC6824a() { // from class: Ff.m
                                    @Override // mh.InterfaceC6824a
                                    public final Object invoke() {
                                        return i.b.a.C0265a.h(eVar2, item);
                                    }
                                };
                                interfaceC3540l.K(objF2);
                            }
                            interfaceC3540l.J();
                            Gf.t.g(androidx.compose.foundation.d.d(itemModifier, false, null, null, (InterfaceC6824a) objF2, 7, null), ((i.c) item).a(), interfaceC3540l, 0);
                            interfaceC3540l.J();
                        }
                        interfaceC3540l.J();
                    } else if (item instanceof i.a) {
                        interfaceC3540l.U(-905974683);
                        interfaceC3540l.U(-905970945);
                        boolean zT3 = interfaceC3540l.T(this.f6561b);
                        if ((i11 & 112) != 32 && ((i11 & 64) == 0 || !interfaceC3540l.l(item))) {
                            z10 = false;
                        }
                        boolean z13 = zT3 | z10;
                        final e eVar3 = this.f6561b;
                        Object objF3 = interfaceC3540l.f();
                        if (z13 || objF3 == InterfaceC3540l.f21100a.a()) {
                            objF3 = new InterfaceC6824a() { // from class: Ff.n
                                @Override // mh.InterfaceC6824a
                                public final Object invoke() {
                                    return i.b.a.C0265a.i(eVar3, item);
                                }
                            };
                            interfaceC3540l.K(objF3);
                        }
                        interfaceC3540l.J();
                        Gf.d.b(androidx.compose.foundation.d.d(itemModifier, false, null, null, (InterfaceC6824a) objF3, 7, null), ((i.a) item).a(), interfaceC3540l, 0);
                        interfaceC3540l.J();
                    } else {
                        if (!(item instanceof i.b)) {
                            interfaceC3540l.U(-906010401);
                            interfaceC3540l.J();
                            throw new NoWhenBranchMatchedException();
                        }
                        interfaceC3540l.U(-905965163);
                        F.b(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), ((i.b) item).a(), interfaceC3540l, 6);
                        interfaceC3540l.J();
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.r
                public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
                    e((androidx.compose.ui.e) obj, (Gf.i) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
                    return J.f24997a;
                }
            }

            a(N n10, e eVar, A.B b10) {
                this.f6557a = n10;
                this.f6558b = eVar;
                this.f6559c = b10;
            }

            public final void a(Ff.c itemType, InterfaceC3540l interfaceC3540l, int i10) {
                int i11;
                Gf.u uVar;
                AbstractC6492s.i(itemType, "itemType");
                if ((i10 & 6) == 0) {
                    i11 = i10 | (interfaceC3540l.T(itemType) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-673990098, i11, -1, "com.ui.wifiman.ui.wifi.scan.WifiScanUiContent.<anonymous>.<anonymous> (WifiScanUiContent.kt:209)");
                }
                interfaceC3540l.U(-1468244932);
                boolean z10 = (i11 & 14) == 4;
                Object objF = interfaceC3540l.f();
                if (z10 || objF == InterfaceC3540l.f21100a.a()) {
                    if (itemType instanceof c.b) {
                        c.b bVar = (c.b) itemType;
                        uVar = new Gf.u(bVar.b(), bVar.a(), null);
                    } else {
                        if (!(itemType instanceof c.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        float f10 = 0;
                        uVar = new Gf.u(Y0.h.j(f10), Y0.h.j(f10), null);
                    }
                    objF = uVar;
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                Ee.z.L(androidx.compose.foundation.layout.o.h(androidx.compose.foundation.layout.r.f(androidx.compose.foundation.b.d(androidx.compose.ui.e.f28771b0, C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).e().a(), null, 2, null), 0.0f, 1, null), this.f6557a), (C2706g) o1.b(this.f6558b.q0(), null, interfaceC3540l, 0, 1).getValue(), this.f6559c, false, false, null, null, b0.c.e(140541097, true, new C0265a(itemType, this.f6558b, (Gf.u) objF), interfaceC3540l, 54), interfaceC3540l, 12582912, 120);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((Ff.c) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        b(e eVar, A.B b10) {
            this.f6555a = eVar;
            this.f6556b = b10;
        }

        public final void a(N innerPadding, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(innerPadding, "innerPadding");
            if ((i10 & 6) == 0) {
                i10 |= interfaceC3540l.T(innerPadding) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(771941882, i10, -1, "com.ui.wifiman.ui.wifi.scan.WifiScanUiContent.<anonymous> (WifiScanUiContent.kt:206)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            i.g(androidx.compose.foundation.layout.r.f(aVar, 0.0f, 1, null), b0.c.e(-673990098, true, new a(innerPadding, this.f6555a, this.f6556b), interfaceC3540l, 54), interfaceC3540l, 54);
            Ee.B.b(androidx.compose.foundation.layout.o.h(aVar, innerPadding), C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).e().a(), interfaceC3540l, 0, 0);
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

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f6563a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A.B f6564b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z f6565c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3547o0 f6566d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(A.B b10, z zVar, InterfaceC3547o0 interfaceC3547o0, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f6564b = b10;
            this.f6565c = zVar;
            this.f6566d = interfaceC3547o0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J t(z zVar, float f10, float f11) {
            zVar.getState().g(f10);
            return J.f24997a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new c(this.f6564b, this.f6565c, this.f6566d, interfaceC5380e);
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
                int r1 = r11.f6563a
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
                T.o0 r12 = r11.f6566d
                long r4 = Ff.i.i(r12)
                r6 = 0
                int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r12 == 0) goto L5c
                A.B r12 = r11.f6564b
                r11.f6563a = r3
                r1 = 0
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                java.lang.Object r12 = r12.l(r1, r3, r11)
                if (r12 != r0) goto L3b
                return r0
            L3b:
                Q.z r12 = r11.f6565c
                Q.A r12 = r12.getState()
                float r3 = r12.d()
                Q.z r12 = r11.f6565c
                Ff.o r7 = new Ff.o
                r7.<init>()
                r11.f6563a = r2
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
            throw new UnsupportedOperationException("Method not decompiled: Ff.i.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class d implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f6567a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ mh.q f6568b;

        static final class a implements mh.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.e f6569a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ mh.q f6570b;

            /* renamed from: Ff.i$d$a$a, reason: collision with other inner class name */
            static final class C0266a implements mh.r {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ mh.q f6571a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ float f6572b;

                C0266a(mh.q qVar, float f10) {
                    this.f6571a = qVar;
                    this.f6572b = f10;
                }

                public final void a(float f10, float f11, InterfaceC3540l interfaceC3540l, int i10) {
                    if ((i10 & 6) == 0) {
                        i10 |= interfaceC3540l.g(f10) ? 4 : 2;
                    }
                    if ((i10 & 131) == 130 && interfaceC3540l.v()) {
                        interfaceC3540l.C();
                        return;
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-34812762, i10, -1, "com.ui.wifiman.ui.wifi.scan.WithItemType.<anonymous>.<anonymous>.<anonymous> (WifiScanUiContent.kt:329)");
                    }
                    this.f6571a.s(new c.b(this.f6572b, f10, null), interfaceC3540l, 0);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.r
                public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
                    a(((Y0.h) obj).s(), ((Y0.h) obj2).s(), (InterfaceC3540l) obj3, ((Number) obj4).intValue());
                    return J.f24997a;
                }
            }

            a(androidx.compose.ui.e eVar, mh.q qVar) {
                this.f6569a = eVar;
                this.f6570b = qVar;
            }

            public final void a(float f10, float f11, InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= interfaceC3540l.g(f10) ? 4 : 2;
                }
                if ((i10 & 131) == 130 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1643736892, i10, -1, "com.ui.wifiman.ui.wifi.scan.WithItemType.<anonymous>.<anonymous> (WifiScanUiContent.kt:320)");
                }
                qa.d.d(this.f6569a, Ff.a.f6514a.d(), b0.c.e(-34812762, true, new C0266a(this.f6570b, f10), interfaceC3540l, 54), interfaceC3540l, 432);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.r
            public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
                a(((Y0.h) obj).s(), ((Y0.h) obj2).s(), (InterfaceC3540l) obj3, ((Number) obj4).intValue());
                return J.f24997a;
            }
        }

        d(androidx.compose.ui.e eVar, mh.q qVar) {
            this.f6567a = eVar;
            this.f6568b = qVar;
        }

        public final void a(InterfaceC8683f BoxWithConstraints, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i10 & 6) == 0) {
                i10 |= interfaceC3540l.T(BoxWithConstraints) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(385453985, i10, -1, "com.ui.wifiman.ui.wifi.scan.WithItemType.<anonymous> (WifiScanUiContent.kt:309)");
            }
            if (Y0.h.h(BoxWithConstraints.b(), Y0.h.j(400)) > 0) {
                interfaceC3540l.U(1123744481);
                qa.d.d(this.f6567a, Ff.a.f6514a.c(), b0.c.e(1643736892, true, new a(this.f6567a, this.f6568b), interfaceC3540l, 54), interfaceC3540l, 432);
                interfaceC3540l.J();
            } else {
                interfaceC3540l.U(1124849476);
                this.f6568b.s(c.a.f6525a, interfaceC3540l, 6);
                interfaceC3540l.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8683f) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    public static final void c(final e vm, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1114846331);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(vm) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1114846331, i11, -1, "com.ui.wifiman.ui.wifi.scan.WifiScanUiContent (WifiScanUiContent.kt:74)");
            }
            z zVarA = Q.y.f18962a.a(null, null, null, null, interfaceC3540lR, Q.y.f18968g << 12, 15);
            A.B bC = A.C.c(0, 0, interfaceC3540lR, 0, 3);
            interfaceC3540lR.U(1795201913);
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                objF = h1.a(0L);
                interfaceC3540lR.K(objF);
            }
            InterfaceC3547o0 interfaceC3547o0 = (InterfaceC3547o0) objF;
            interfaceC3540lR.J();
            interfaceC3540lR.U(1795203836);
            Object objF2 = interfaceC3540lR.f();
            if (objF2 == aVar.a()) {
                objF2 = h0.a(0, 0, 0, 0);
                interfaceC3540lR.K(objF2);
            }
            interfaceC3540lR.J();
            C0.b((f0) objF2, androidx.compose.ui.input.nestedscroll.a.b(androidx.compose.ui.e.f28771b0, zVarA.a(), null, 2, null), null, b0.c.e(-983769919, true, new a(vm, zVarA, interfaceC3547o0), interfaceC3540lR, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).e().a(), 0L, b0.c.e(771941882, true, new b(vm, bC), interfaceC3540lR, 54), interfaceC3540lR, 3078, 100663296, 196596);
            Long lValueOf = Long.valueOf(d(interfaceC3547o0));
            interfaceC3540l2 = interfaceC3540lR;
            interfaceC3540l2.U(1795512024);
            boolean zT = interfaceC3540l2.T(bC) | interfaceC3540l2.T(zVarA);
            Object objF3 = interfaceC3540l2.f();
            if (zT || objF3 == aVar.a()) {
                objF3 = new c(bC, zVarA, interfaceC3547o0, null);
                interfaceC3540l2.K(objF3);
            }
            interfaceC3540l2.J();
            O.f(lValueOf, (InterfaceC6839p) objF3, interfaceC3540l2, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Ff.f
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return i.f(vm, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
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
    public static final J f(e eVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        c(eVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final androidx.compose.ui.e eVar, final mh.q qVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-2062665033);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(qVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-2062665033, i11, -1, "com.ui.wifiman.ui.wifi.scan.WithItemType (WifiScanUiContent.kt:302)");
            }
            AbstractC8682e.a(eVar, null, false, b0.c.e(385453985, true, new d(eVar, qVar), interfaceC3540lR, 54), interfaceC3540lR, (i11 & 14) | 3072, 6);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Ff.g
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return i.h(eVar, qVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J h(androidx.compose.ui.e eVar, mh.q qVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        g(eVar, qVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
