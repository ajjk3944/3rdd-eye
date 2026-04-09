package Df;

import Af.u;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Yg.J;
import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public abstract class d {
    public static final void b(final e eVar, final b model, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        int i12;
        AbstractC6492s.i(model, "model");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(388247132);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(model) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                eVar = e.f28771b0;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(388247132, i12, -1, "com.ui.wifiman.ui.wifi.network.component.WifiNetworkGeneralInfoHeader (WifiNetworkGeneralInfoHeader.kt:38)");
            }
            u.e(eVar, model.a(), interfaceC3540lR, i12 & 14, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Df.c
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return d.c(eVar, model, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(e eVar, b bVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, bVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
