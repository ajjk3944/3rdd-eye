package If;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public abstract class W {
    public static final void b(final androidx.compose.ui.e modifier, final U vm, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1954388525);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(vm) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1954388525, i11, -1, "com.ui.wifiman.ui.wmw.WmwStatusProductCompliance (WmwStatusProductCompliance.kt:23)");
            }
            Ce.j.t(androidx.compose.foundation.m.d(androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.o.m(androidx.compose.foundation.layout.r.h(modifier, 0.0f, 1, null), 0.0f, Y0.h.j(32), 0.0f, 0.0f, 13, null), C6562a.f52458a.d(interfaceC3540lR, C6562a.f52459b).a().a().a(Y0.h.j(20)), 0.0f, 2, null), androidx.compose.foundation.m.a(0, interfaceC3540lR, 0, 1), false, null, false, 14, null), vm, interfaceC3540lR, i11 & 112, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: If.V
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return W.c(modifier, vm, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, U u10, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, u10, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }
}
