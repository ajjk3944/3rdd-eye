package gf;

import Be.AbstractC2487w;
import C.C;
import C.v;
import E0.InterfaceC2629g;
import L9.L;
import L9.z;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import Yg.J;
import Zg.AbstractC3689v;
import androidx.compose.foundation.layout.o;
import androidx.compose.ui.e;
import f0.c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import mh.r;
import q.InterfaceC7386e;
import s9.InterfaceC7929a;
import sa.AbstractC7930a;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.W;
import z.Y;
import z.Z;

/* renamed from: gf.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5909j {

    /* renamed from: gf.j$a */
    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5902c f47895a;

        /* renamed from: gf.j$a$a, reason: collision with other inner class name */
        static final class C1784a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC5902c f47896a;

            /* renamed from: gf.j$a$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1785a extends C6490p implements InterfaceC6824a {
                C1785a(Object obj) {
                    super(0, obj, AbstractC5902c.class, "onCloseClicked", "onCloseClicked()V", 0);
                }

                public final void a() {
                    ((AbstractC5902c) this.receiver).p0();
                }

                @Override // mh.InterfaceC6824a
                public /* bridge */ /* synthetic */ Object invoke() {
                    a();
                    return J.f24997a;
                }
            }

            C1784a(AbstractC5902c abstractC5902c) {
                this.f47896a = abstractC5902c;
            }

            public final void a(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(389136127, i10, -1, "com.ui.wifiman.ui.speedtest.a2a.A2ASpeedtestPopupUi.<anonymous>.<anonymous>.<anonymous> (A2ASpeedtestPopupUi.kt:67)");
                }
                s9.b bVarT = N9.b.f16117a.t();
                AbstractC5902c abstractC5902c = this.f47896a;
                interfaceC3540l.U(-1595065457);
                boolean zT = interfaceC3540l.T(abstractC5902c);
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new C1785a(abstractC5902c);
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                z.c(bVarT, null, 0L, false, (InterfaceC6824a) ((th.g) objF), interfaceC3540l, 0, 14);
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

        a(AbstractC5902c abstractC5902c) {
            this.f47895a = abstractC5902c;
        }

        public final void a(Y UiToolbar, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(UiToolbar, "$this$UiToolbar");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(501381990, i10, -1, "com.ui.wifiman.ui.speedtest.a2a.A2ASpeedtestPopupUi.<anonymous>.<anonymous> (A2ASpeedtestPopupUi.kt:66)");
            }
            L.b(null, b0.c.e(389136127, true, new C1784a(this.f47895a), interfaceC3540l, 54), interfaceC3540l, 48, 1);
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

    /* renamed from: gf.j$b */
    static final class b implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5901b f47897a;

        b(C5901b c5901b) {
            this.f47897a = c5901b;
        }

        public final void a(v HorizontalPager, int i10, InterfaceC3540l interfaceC3540l, int i11) {
            AbstractC6492s.i(HorizontalPager, "$this$HorizontalPager");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1734254194, i11, -1, "com.ui.wifiman.ui.speedtest.a2a.A2ASpeedtestPopupUi.<anonymous>.<anonymous>.<anonymous> (A2ASpeedtestPopupUi.kt:105)");
            }
            AbstractC5909j.m(androidx.compose.ui.e.f28771b0, (C5900a) this.f47897a.a().get(i10), interfaceC3540l, 6, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            a((v) obj, ((Number) obj2).intValue(), (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return J.f24997a;
        }
    }

    /* renamed from: gf.j$c */
    static final class c implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f47898a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5901b f47899b;

        c(C c10, C5901b c5901b) {
            this.f47898a = c10;
            this.f47899b = c5901b;
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1093505212, i10, -1, "com.ui.wifiman.ui.speedtest.a2a.A2ASpeedtestPopupUi.<anonymous>.<anonymous>.<anonymous> (A2ASpeedtestPopupUi.kt:112)");
            }
            Y2.a.a(this.f47898a, this.f47899b.a().size(), null, null, C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().b().f(), 0L, 0.0f, 0.0f, 0.0f, null, interfaceC3540l, 0, 1004);
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

    /* JADX WARN: Removed duplicated region for block: B:103:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(gf.AbstractC5902c r42, T.InterfaceC3540l r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.AbstractC5909j.g(gf.c, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J h(AbstractC5902c abstractC5902c) {
        abstractC5902c.o0();
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J i(AbstractC5902c abstractC5902c, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        g(abstractC5902c, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J j(AbstractC5902c abstractC5902c) {
        abstractC5902c.o0();
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(C5901b c5901b) {
        return c5901b.a().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J l(C5901b c5901b, C c10, AbstractC5902c abstractC5902c) {
        C5900a c5900a = (C5900a) AbstractC3689v.t0(c5901b.a(), c10.v());
        if (c5900a != null) {
            abstractC5902c.q0(c5900a);
        }
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(androidx.compose.ui.e eVar, final C5900a c5900a, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        final androidx.compose.ui.e eVar3;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-643393796);
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
        if ((2 & i11) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(c5900a) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-643393796, i12, -1, "com.ui.wifiman.ui.speedtest.a2a.DeviceItem (A2ASpeedtestPopupUi.kt:145)");
            }
            C6562a c6562a = C6562a.f52458a;
            int i14 = C6562a.f52459b;
            androidx.compose.ui.e eVarJ = o.j(eVar3, c6562a.d(interfaceC3540lR, i14).a().a().d(), Y0.h.j(8));
            c.a aVar = f0.c.f46573a;
            c.InterfaceC1752c interfaceC1752cI = aVar.i();
            C8680c c8680c = C8680c.f66832a;
            C0.C cB = W.b(c8680c.n(Y0.h.j(32)), interfaceC1752cI, interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarJ);
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
            E1.c(interfaceC3540lA, cB, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            Z z10 = Z.f66823a;
            InterfaceC7929a interfaceC7929aB = c5900a.b();
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            AbstractC2487w.b(interfaceC7929aB, androidx.compose.foundation.layout.r.i(aVar3, Y0.h.j(80)), null, null, null, 0.0f, 0L, interfaceC3540lR, 48, 62);
            C0.C cA = AbstractC8685h.a(c8680c.n(Y0.h.j(4)), aVar.k(), interfaceC3540lR, 6);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, eVar3);
            InterfaceC6824a interfaceC6824aA2 = aVar2.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA2);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA2 = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA2, cA, aVar2.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar2.g());
            InterfaceC6839p interfaceC6839pB2 = aVar2.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar2.f());
            C8688k c8688k = C8688k.f66923a;
            a1.c(AbstractC7930a.a(c5900a.d(), interfaceC3540lR, 0), androidx.compose.foundation.layout.r.h(aVar3, 0.0f, 1, null), c6562a.a(interfaceC3540lR, i14).f().a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540lR, i14).b().c(), interfaceC3540lR, 48, 0, 131064);
            a1.c(AbstractC7930a.a(c5900a.c(), interfaceC3540lR, 0), androidx.compose.foundation.layout.r.h(aVar3, 0.0f, 1, null), c6562a.a(interfaceC3540lR, i14).f().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540lR, i14).b().f(), interfaceC3540lR, 48, 0, 131064);
            s9.d dVarE = c5900a.e();
            interfaceC3540lR.U(18528396);
            if (dVarE == null) {
                interfaceC3540l2 = interfaceC3540lR;
            } else {
                interfaceC3540l2 = interfaceC3540lR;
                a1.c(AbstractC7930a.a(dVarE, interfaceC3540lR, 0), androidx.compose.foundation.layout.r.h(aVar3, 0.0f, 1, null), c6562a.a(interfaceC3540lR, i14).f().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540lR, i14).b().f(), interfaceC3540l2, 48, 0, 131064);
            }
            interfaceC3540l2.J();
            interfaceC3540l2.R();
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: gf.i
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC5909j.n(eVar3, c5900a, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J n(androidx.compose.ui.e eVar, C5900a c5900a, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        m(eVar, c5900a, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
