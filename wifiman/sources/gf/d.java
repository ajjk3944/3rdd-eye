package Gf;

import C0.C;
import E0.InterfaceC2629g;
import Ee.K;
import L0.C3174d;
import L0.U;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import sa.AbstractC7930a;
import z.C8680c;
import z.W;
import z.Y;
import z.Z;

/* loaded from: classes4.dex */
public abstract class d {
    public static final void b(final androidx.compose.ui.e modifier, final b model, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        U uB;
        int i12;
        C6562a c6562a;
        U uC;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(model, "model");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1751137757);
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
                AbstractC3546o.Q(-1751137757, i11, -1, "com.ui.wifiman.ui.wifi.scan.component.WifiScanChannelQualityItem (WifiScanChannelQualityItem.kt:35)");
            }
            float f10 = 16;
            float f11 = 8;
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.o.m(androidx.compose.foundation.layout.r.b(modifier, 0.0f, Y0.h.j(48), 1, null), Y0.h.j(Y0.h.j(f10) + Y0.h.j(f11)), 0.0f, Y0.h.j(f10), 0.0f, 10, null), 0.0f, Y0.h.j(f11), 1, null);
            C cB = W.b(C8680c.f66832a.n(Y0.h.j(f11)), f0.c.f46573a.i(), interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarK);
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
            androidx.compose.ui.e eVarB = Y.b(Z.f66823a, androidx.compose.ui.e.f28771b0, 1.0f, false, 2, null);
            C3174d c3174dA = AbstractC7930a.a(model.b(), interfaceC3540lR, 0);
            if (model.a()) {
                interfaceC3540lR.U(328106389);
                uB = C6562a.f52458a.c(interfaceC3540lR, C6562a.f52459b).a().b();
                interfaceC3540lR.J();
            } else {
                interfaceC3540lR.U(328175922);
                uB = C6562a.f52458a.c(interfaceC3540lR, C6562a.f52459b).b().b();
                interfaceC3540lR.J();
            }
            U u10 = uB;
            C6562a c6562a2 = C6562a.f52458a;
            int i13 = C6562a.f52459b;
            a1.c(c3174dA, eVarB, c6562a2.a(interfaceC3540lR, i13).f().a(), 0L, null, null, null, 0L, null, null, 0L, W0.t.f23567a.b(), false, 1, 0, null, null, u10, interfaceC3540lR, 0, 3120, 120824);
            C3174d c3174dA2 = AbstractC7930a.a(model.c(), interfaceC3540lR, 0);
            if (model.a()) {
                interfaceC3540lR.U(328468469);
                i12 = i13;
                c6562a = c6562a2;
                uC = c6562a.c(interfaceC3540lR, i12).a().c();
                interfaceC3540lR.J();
            } else {
                i12 = i13;
                c6562a = c6562a2;
                interfaceC3540lR.U(328538002);
                uC = c6562a.c(interfaceC3540lR, i12).b().c();
                interfaceC3540lR.J();
            }
            a1.c(c3174dA2, null, c6562a.a(interfaceC3540lR, i12).f().a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, uC, interfaceC3540lR, 0, 3072, 122874);
            interfaceC3540l2 = interfaceC3540lR;
            K.b(null, interfaceC3540l2, 0, 1);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Gf.c
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return d.c(modifier, model, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, b bVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, bVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
