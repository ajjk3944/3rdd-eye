package Te;

import E0.InterfaceC2629g;
import L0.C3174d;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.X0;
import W0.t;
import androidx.compose.ui.e;
import f0.c;
import j0.AbstractC6230a;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import tf.C8085a;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;

/* renamed from: Te.d0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3576d0 {
    public static final void b(final androidx.compose.ui.e modifier, final C3572b0 model, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        float fA;
        int i12;
        e.a aVar;
        InterfaceC3540l interfaceC3540l2;
        int i13;
        e.a aVar2;
        InterfaceC3540l interfaceC3540l3;
        InterfaceC3540l interfaceC3540l4;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(model, "model");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-847591388);
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
            interfaceC3540l4 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-847591388, i11, -1, "com.ui.wifiman.ui.signal.components.SignalMapperPlaceItem (SignalStrengthPlaceItem.kt:57)");
            }
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.i.a(androidx.compose.foundation.layout.r.k(modifier, Y0.h.j(48), 0.0f, 2, null), z.J.Min), Y0.h.j(16), 0.0f, 2, null);
            if (model.b()) {
                interfaceC3540lR.U(1680485378);
                fA = C8085a.f62104a.b(interfaceC3540lR, 6);
            } else {
                interfaceC3540lR.U(1680486275);
                fA = C8085a.f62104a.a(interfaceC3540lR, 6);
            }
            interfaceC3540lR.J();
            androidx.compose.ui.e eVarA = AbstractC6230a.a(eVarK, fA);
            C8680c c8680c = C8680c.f66832a;
            C8680c.f fVarN = c8680c.n(Y0.h.j(8));
            c.a aVar3 = f0.c.f46573a;
            C0.C cB = z.W.b(fVarN, aVar3.i(), interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarA);
            InterfaceC2629g.a aVar4 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar4.a();
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
            E1.c(interfaceC3540lA, cB, aVar4.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar4.g());
            InterfaceC6839p interfaceC6839pB = aVar4.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar4.f());
            z.Z z10 = z.Z.f66823a;
            e.a aVar5 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarA2 = z10.a(aVar5, 1.0f, true);
            C0.C cA = AbstractC8685h.a(c8680c.b(), aVar3.k(), interfaceC3540lR, 6);
            int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, eVarA2);
            InterfaceC6824a interfaceC6824aA2 = aVar4.a();
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
            E1.c(interfaceC3540lA2, cA, aVar4.e());
            E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar4.g());
            InterfaceC6839p interfaceC6839pB2 = aVar4.b();
            if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                interfaceC3540lA2.K(Integer.valueOf(iA2));
                interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
            }
            E1.c(interfaceC3540lA2, eVarE2, aVar4.f());
            C8688k c8688k = C8688k.f66923a;
            C3174d c3174dA = AbstractC7930a.a(model.e(), interfaceC3540lR, 0);
            C6562a c6562a = C6562a.f52458a;
            int i14 = C6562a.f52459b;
            L0.U uB = c6562a.c(interfaceC3540lR, i14).b().b();
            long jA = c6562a.a(interfaceC3540lR, i14).f().a();
            t.a aVar6 = W0.t.f23567a;
            a1.c(c3174dA, null, jA, 0L, null, null, null, 0L, null, null, 0L, aVar6.b(), false, 1, 0, null, null, uB, interfaceC3540lR, 0, 3120, 120826);
            s9.d dVarD = model.d();
            interfaceC3540lR.U(-2131166947);
            if (dVarD == null) {
                interfaceC3540l2 = interfaceC3540lR;
                aVar = aVar5;
                i12 = i14;
            } else {
                z.a0.a(androidx.compose.foundation.layout.r.i(aVar5, Y0.h.j(4)), interfaceC3540lR, 6);
                C0.C cB2 = z.W.b(c8680c.n(Y0.h.j(2)), aVar3.i(), interfaceC3540lR, 54);
                int iA3 = AbstractC3536j.a(interfaceC3540lR, 0);
                InterfaceC3563x interfaceC3563xG3 = interfaceC3540lR.G();
                androidx.compose.ui.e eVarE3 = androidx.compose.ui.c.e(interfaceC3540lR, aVar5);
                InterfaceC6824a interfaceC6824aA3 = aVar4.a();
                if (interfaceC3540lR.x() == null) {
                    AbstractC3536j.c();
                }
                interfaceC3540lR.u();
                if (interfaceC3540lR.o()) {
                    interfaceC3540lR.D(interfaceC6824aA3);
                } else {
                    interfaceC3540lR.I();
                }
                InterfaceC3540l interfaceC3540lA3 = E1.a(interfaceC3540lR);
                E1.c(interfaceC3540lA3, cB2, aVar4.e());
                E1.c(interfaceC3540lA3, interfaceC3563xG3, aVar4.g());
                InterfaceC6839p interfaceC6839pB3 = aVar4.b();
                if (interfaceC3540lA3.o() || !AbstractC6492s.d(interfaceC3540lA3.f(), Integer.valueOf(iA3))) {
                    interfaceC3540lA3.K(Integer.valueOf(iA3));
                    interfaceC3540lA3.Q(Integer.valueOf(iA3), interfaceC6839pB3);
                }
                E1.c(interfaceC3540lA3, eVarE3, aVar4.f());
                AbstractC8049c.c(model.a(), androidx.compose.foundation.layout.r.v(aVar5, Y0.h.j(20)), C6733v0.g(c6562a.a(interfaceC3540lR, i14).a().d().f()), null, interfaceC3540lR, 48, 4);
                i12 = i14;
                aVar = aVar5;
                interfaceC3540l2 = interfaceC3540lR;
                a1.c(AbstractC7930a.a(model.d(), interfaceC3540lR, 0), null, c6562a.a(interfaceC3540lR, i14).f().b(), 0L, null, null, null, 0L, null, null, 0L, aVar6.b(), false, 1, 0, null, null, c6562a.c(interfaceC3540lR, i14).b().f(), interfaceC3540l2, 0, 3120, 120826);
                interfaceC3540l2.R();
                Yg.J j10 = Yg.J.f24997a;
            }
            interfaceC3540l2.J();
            interfaceC3540l2.R();
            InterfaceC3540l interfaceC3540l5 = interfaceC3540l2;
            C0.C cA2 = AbstractC8685h.a(c8680c.b(), aVar3.j(), interfaceC3540l5, 54);
            int iA4 = AbstractC3536j.a(interfaceC3540l5, 0);
            InterfaceC3563x interfaceC3563xG4 = interfaceC3540l5.G();
            e.a aVar7 = aVar;
            androidx.compose.ui.e eVarE4 = androidx.compose.ui.c.e(interfaceC3540l5, aVar7);
            InterfaceC6824a interfaceC6824aA4 = aVar4.a();
            if (interfaceC3540l5.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l5.u();
            if (interfaceC3540l5.o()) {
                interfaceC3540l5.D(interfaceC6824aA4);
            } else {
                interfaceC3540l5.I();
            }
            InterfaceC3540l interfaceC3540lA4 = E1.a(interfaceC3540l5);
            E1.c(interfaceC3540lA4, cA2, aVar4.e());
            E1.c(interfaceC3540lA4, interfaceC3563xG4, aVar4.g());
            InterfaceC6839p interfaceC6839pB4 = aVar4.b();
            if (interfaceC3540lA4.o() || !AbstractC6492s.d(interfaceC3540lA4.f(), Integer.valueOf(iA4))) {
                interfaceC3540lA4.K(Integer.valueOf(iA4));
                interfaceC3540lA4.Q(Integer.valueOf(iA4), interfaceC6839pB4);
            }
            E1.c(interfaceC3540lA4, eVarE4, aVar4.f());
            s9.d dVarF = model.f();
            interfaceC3540l5.U(-2131135399);
            if (dVarF == null) {
                aVar2 = aVar7;
                interfaceC3540l3 = interfaceC3540l5;
                i13 = i12;
            } else {
                i13 = i12;
                aVar2 = aVar7;
                interfaceC3540l3 = interfaceC3540l5;
                a1.c(AbstractC7930a.a(model.f(), interfaceC3540l5, 0), null, c6562a.a(interfaceC3540l5, i13).f().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540l5, i13).b().b(), interfaceC3540l3, 0, 0, 131066);
                Yg.J j11 = Yg.J.f24997a;
            }
            interfaceC3540l3.J();
            s9.d dVarG = model.g();
            InterfaceC3540l interfaceC3540l6 = interfaceC3540l3;
            interfaceC3540l6.U(-2131126990);
            if (dVarG == null) {
                interfaceC3540l4 = interfaceC3540l6;
            } else {
                z.a0.a(androidx.compose.foundation.layout.r.i(aVar2, Y0.h.j(4)), interfaceC3540l6, 6);
                interfaceC3540l4 = interfaceC3540l6;
                a1.c(AbstractC7930a.a(model.g(), interfaceC3540l6, 0), null, c6562a.a(interfaceC3540l6, i13).f().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540l6, i13).b().f(), interfaceC3540l4, 0, 0, 131066);
                Yg.J j12 = Yg.J.f24997a;
            }
            interfaceC3540l4.J();
            interfaceC3540l4.R();
            interfaceC3540l4.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l4.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Te.c0
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3576d0.c(modifier, model, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, C3572b0 c3572b0, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, c3572b0, interfaceC3540l, T.L0.a(i10 | 1));
        return Yg.J.f24997a;
    }
}
