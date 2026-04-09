package Be;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public abstract class v0 {
    public static final void b(final androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-457393814);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f28771b0;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-457393814, i12, -1, "com.ui.wifiman.ui.component.UiSettingsCardSpacer (UiSettingsCardSpacer.kt:9)");
            }
            z.a0.a(androidx.compose.foundation.layout.r.l(eVar, Y0.h.j(16)), interfaceC3540lR, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Be.u0
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return v0.c(eVar, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }
}
