package Ke;

import C0.C;
import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import w9.AbstractC8288e;
import w9.EnumC8286c;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;

/* loaded from: classes4.dex */
public abstract class u {
    public static final void b(final androidx.compose.ui.e modifier, final InterfaceC6824a onClick, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(onClick, "onClick");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1484955009);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(onClick) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1484955009, i11, -1, "com.ui.wifiman.ui.device.card.DeviceDetailCardSpeedtestButton (DeviceDetailCardSpeedtestButton.kt:15)");
            }
            C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.g(), interfaceC3540lR, 48);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, modifier);
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
            AbstractC8288e.b(androidx.compose.ui.e.f28771b0, EnumC8286c.CLEAR, N9.b.f16117a.K(), H0.f.a(AbstractC6780c.f53429X, interfaceC3540lR, 0), false, false, onClick, interfaceC3540lR, ((i11 << 15) & 3670016) | 54, 48);
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Ke.t
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return u.c(modifier, onClick, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, InterfaceC6824a interfaceC6824a, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, interfaceC6824a, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
