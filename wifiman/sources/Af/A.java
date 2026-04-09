package Af;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import m8.AbstractC6780c;
import mh.InterfaceC6839p;
import s9.d;

/* loaded from: classes4.dex */
public abstract class A {
    public static final void b(final androidx.compose.ui.e eVar, final S8.c cVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-511167859);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(cVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f28771b0;
            }
            if (i14 != 0) {
                cVar = null;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-511167859, i12, -1, "com.ui.wifiman.ui.wifi.component.WifiSpectrumChartHeader (WifiSpectrumChartHeader.kt:16)");
            }
            G.b(eVar, new d.b(AbstractC6780c.f53544n5), Ne.h.d(cVar), interfaceC3540lR, i12 & 14, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Af.z
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return A.c(eVar, cVar, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, S8.c cVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, cVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }
}
