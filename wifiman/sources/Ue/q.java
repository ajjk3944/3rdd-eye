package Ue;

import C0.C;
import E0.InterfaceC2629g;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import W0.t;
import Yg.J;
import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import z.C8680c;
import z.W;
import z.Z;
import z.a0;

/* loaded from: classes4.dex */
public abstract class q {
    public static final void b(androidx.compose.ui.e eVar, final s9.d ssid, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        final androidx.compose.ui.e eVar3;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(ssid, "ssid");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(2039684661);
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
            i12 |= interfaceC3540lR.T(ssid) ? 32 : 16;
        }
        int i14 = i12;
        if ((i14 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            androidx.compose.ui.e eVar4 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2039684661, i14, -1, "com.ui.wifiman.ui.signal.floorplan.component.FloorplanConnectionInfoBar (FloorplanConnectionInfoBar.kt:23)");
            }
            C cB = W.b(C8680c.f66832a.b(), f0.c.f46573a.i(), interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar4);
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
            Z z10 = Z.f66823a;
            s9.b bVarD0 = Pe.a.f18599a.d0();
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarV = androidx.compose.foundation.layout.r.v(aVar2, Y0.h.j(20));
            C6562a c6562a = C6562a.f52458a;
            int i15 = C6562a.f52459b;
            AbstractC8049c.c(bVarD0, eVarV, C6733v0.g(c6562a.a(interfaceC3540lR, i15).a().d().f()), null, interfaceC3540lR, 54, 4);
            a0.a(androidx.compose.foundation.layout.r.z(aVar2, Y0.h.j(6)), interfaceC3540lR, 6);
            eVar3 = eVar4;
            interfaceC3540l2 = interfaceC3540lR;
            a1.c(AbstractC7930a.a(ssid, interfaceC3540lR, (i14 >> 3) & 14), null, c6562a.a(interfaceC3540lR, i15).f().c(), 0L, null, null, null, 0L, null, null, 0L, t.f23567a.b(), false, 1, 0, null, null, c6562a.c(interfaceC3540lR, i15).b().a(), interfaceC3540l2, 0, 3120, 120826);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Ue.p
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return q.c(eVar3, ssid, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, s9.d dVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, dVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
