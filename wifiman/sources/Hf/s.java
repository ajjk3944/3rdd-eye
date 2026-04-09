package hf;

import E0.InterfaceC2629g;
import L0.C3174d;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import androidx.compose.ui.e;
import b8.AbstractC4075b;
import f0.c;
import ff.EnumC5820a;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.W;
import z.Z;
import z.a0;

/* loaded from: classes4.dex */
public abstract class s {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48709a;

        static {
            int[] iArr = new int[EnumC5820a.values().length];
            try {
                iArr[EnumC5820a.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5820a.UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f48709a = iArr;
        }
    }

    private static final void d(final androidx.compose.ui.e eVar, final C6030b c6030b, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        C3174d c3174dA;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(978931730);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(c6030b) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(978931730, i11, -1, "com.ui.wifiman.ui.speedtest.component.MeasurementDirectionRow (SpeedtestResultListItem.kt:128)");
            }
            C0.C cB = W.b(C8680c.f66832a.n(Y0.h.j(16)), f0.c.f46573a.i(), interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar);
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
            E1.c(interfaceC3540lA, cB, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            AbstractC6035g.c(Z.f66823a.a(androidx.compose.foundation.layout.r.i(androidx.compose.ui.e.f28771b0, Y0.h.j(13)), 1.0f, true), c6030b.b().c() / c6030b.c().c(), c6030b.a(), interfaceC3540lR, 0, 0);
            int i12 = a.f48709a[c6030b.a().ordinal()];
            if (i12 == 1) {
                interfaceC3540lR.U(-853429124);
                c3174dA = C6031c.f48649a.a(c6030b.b(), false, null, false, null, null, interfaceC3540lR, 1769856, 26);
                interfaceC3540lR.J();
            } else {
                if (i12 != 2) {
                    interfaceC3540lR.U(-853431632);
                    interfaceC3540lR.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540lR.U(-853422532);
                c3174dA = C6031c.f48649a.a(null, false, c6030b.b(), false, null, null, interfaceC3540lR, 1769478, 26);
                interfaceC3540lR.J();
            }
            C3174d c3174d = c3174dA;
            C6031c c6031c = C6031c.f48649a;
            C6562a c6562a = C6562a.f52458a;
            int i13 = C6562a.f52459b;
            long jL = c6562a.c(interfaceC3540lR, i13).b().f().l();
            Y0.w.b(jL);
            interfaceC3540l2 = interfaceC3540lR;
            a1.c(c3174d, null, c6562a.a(interfaceC3540lR, i13).f().a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, c6031c.f(Y0.w.j(Y0.v.f(jL), Y0.v.h(jL) * 0.8f), interfaceC3540lR, 48), null, c6562a.c(interfaceC3540lR, i13).b().f(), interfaceC3540l2, 0, 0, 98298);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: hf.r
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return s.e(eVar, c6030b, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(androidx.compose.ui.e eVar, C6030b c6030b, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        d(eVar, c6030b, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    public static final void f(final androidx.compose.ui.e modifier, final o model, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(model, "model");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1602852336);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(model) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1602852336, i11, -1, "com.ui.wifiman.ui.speedtest.component.SpeedtestResultListItem (SpeedtestResultListItem.kt:68)");
            }
            C8680c c8680c = C8680c.f66832a;
            C8680c.f fVarN = c8680c.n(Y0.h.j(8));
            c.a aVar = f0.c.f46573a;
            C0.C cA = AbstractC8685h.a(fVarN, aVar.k(), interfaceC3540lR, 6);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, modifier);
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
            E1.c(interfaceC3540lA, cA, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            C8688k c8688k = C8688k.f66923a;
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(aVar3, 0.0f, 1, null);
            C0.C cB = W.b(c8680c.f(), aVar.i(), interfaceC3540lR, 48);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, eVarH);
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
            E1.c(interfaceC3540lA2, cB, aVar2.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar2.g());
            InterfaceC6839p interfaceC6839pB2 = aVar2.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar2.f());
            Z z10 = Z.f66823a;
            androidx.compose.ui.e eVarA = z10.a(aVar3, 1.0f, false);
            C3174d c3174dA = AbstractC7930a.a(model.d(), interfaceC3540lR, 0);
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            a1.c(c3174dA, eVarA, c6562a.a(interfaceC3540lR, i12).f().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540lR, i12).a().f(), interfaceC3540lR, 0, 0, 131064);
            a0.a(androidx.compose.foundation.layout.r.z(aVar3, Y0.h.j(16)), interfaceC3540lR, 6);
            AbstractC8049c.c(model.a(), androidx.compose.foundation.layout.r.v(aVar3, Y0.h.j(20)), C6733v0.g(c6562a.a(interfaceC3540lR, i12).c().a()), null, interfaceC3540lR, 48, 4);
            a0.a(androidx.compose.foundation.layout.r.z(aVar3, Y0.h.j(2)), interfaceC3540lR, 6);
            a1.c(AbstractC7930a.a(model.b(), interfaceC3540lR, 0), z10.a(aVar3, 1.0f, false), c6562a.a(interfaceC3540lR, i12).f().b(), 0L, null, null, null, 0L, null, null, 0L, W0.t.f23567a.b(), false, 1, 0, null, null, c6562a.c(interfaceC3540lR, i12).b().f(), interfaceC3540lR, 0, 3120, 120824);
            interfaceC3540lR.R();
            interfaceC3540l2 = interfaceC3540lR;
            interfaceC3540l2.U(1558574132);
            Iterator it = model.c().iterator();
            while (it.hasNext()) {
                h(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), (n) it.next(), interfaceC3540l2, 6);
            }
            interfaceC3540l2.J();
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: hf.p
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return s.g(modifier, model, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J g(androidx.compose.ui.e eVar, o oVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        f(eVar, oVar, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    public static final void h(final androidx.compose.ui.e modifier, final n model, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        Object obj;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(model, "model");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1262647621);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(model) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1262647621, i11, -1, "com.ui.wifiman.ui.speedtest.component.SpeedtestResultMeasurement (SpeedtestResultListItem.kt:171)");
            }
            C8680c c8680c = C8680c.f66832a;
            float f10 = 8;
            C8680c.f fVarN = c8680c.n(Y0.h.j(f10));
            c.a aVar = f0.c.f46573a;
            C0.C cA = AbstractC8685h.a(fVarN, aVar.k(), interfaceC3540lR, 6);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, modifier);
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
            E1.c(interfaceC3540lA, cA, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            C8688k c8688k = C8688k.f66923a;
            W7.a aVarA = model.a();
            interfaceC3540lR.U(1891349304);
            if (aVarA != null) {
                d(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), new C6030b(EnumC5820a.DOWN, aVarA, model.e()), interfaceC3540lR, 6);
                Yg.J j10 = Yg.J.f24997a;
            }
            interfaceC3540lR.J();
            W7.a aVarF = model.f();
            interfaceC3540lR.U(1891360470);
            if (aVarF == null) {
                obj = null;
            } else {
                obj = null;
                d(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), new C6030b(EnumC5820a.UP, aVarF, model.e()), interfaceC3540lR, 6);
                Yg.J j11 = Yg.J.f24997a;
            }
            interfaceC3540lR.J();
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(aVar3, 0.0f, 1, obj);
            C0.C cB = W.b(c8680c.n(Y0.h.j(f10)), aVar.i(), interfaceC3540lR, 54);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, eVarH);
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
            E1.c(interfaceC3540lA2, cB, aVar2.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar2.g());
            InterfaceC6839p interfaceC6839pB2 = aVar2.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar2.f());
            Z z10 = Z.f66823a;
            s9.b bVarC = model.c();
            androidx.compose.ui.e eVarV = androidx.compose.foundation.layout.r.v(aVar3, Y0.h.j(24));
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            AbstractC8049c.c(bVarC, eVarV, C6733v0.g(c6562a.a(interfaceC3540lR, i12).c().a()), null, interfaceC3540lR, 48, 4);
            a1.c(AbstractC7930a.a(model.b(), interfaceC3540lR, 0), z10.a(aVar3, 1.0f, false), c6562a.a(interfaceC3540lR, i12).f().c(), 0L, null, null, null, 0L, null, null, 0L, W0.t.f23567a.b(), false, 1, 0, null, null, c6562a.c(interfaceC3540lR, i12).b().f(), interfaceC3540lR, 0, 3120, 120824);
            AbstractC4075b abstractC4075bD = model.d();
            interfaceC3540lR.U(804362013);
            if (abstractC4075bD == null) {
                interfaceC3540l2 = interfaceC3540lR;
            } else {
                androidx.compose.foundation.layout.d.a(androidx.compose.foundation.b.c(androidx.compose.foundation.layout.r.w(aVar3, Y0.h.j(1), Y0.h.j(10)), c6562a.a(interfaceC3540lR, i12).f().c(), E.h.d(Y0.h.j(2))), interfaceC3540lR, 0);
                interfaceC3540l2 = interfaceC3540lR;
                a1.c(AbstractC7930a.a(Ne.d.c(model.d(), false), interfaceC3540lR, 0), aVar3, c6562a.a(interfaceC3540lR, i12).f().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540lR, i12).b().f(), interfaceC3540l2, 48, 0, 131064);
                Yg.J j12 = Yg.J.f24997a;
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
            x0Z.a(new InterfaceC6839p() { // from class: hf.q
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj2, Object obj3) {
                    return s.i(modifier, model, i10, (InterfaceC3540l) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J i(androidx.compose.ui.e eVar, n nVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        h(eVar, nVar, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }
}
