package De;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Yg.J;
import androidx.compose.foundation.layout.r;
import m0.C6733v0;
import mh.InterfaceC6839p;
import s9.b;
import ta.AbstractC8049c;

/* loaded from: classes4.dex */
public abstract class f {
    public static final void b(final long j10, final int i10, InterfaceC3540l interfaceC3540l, final int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1854439903);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC3540lR.j(j10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC3540lR.i(i10) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1854439903, i12, -1, "com.ui.wifiman.ui.component.label.BadgeIcon (IconBadge.kt:36)");
            }
            AbstractC8049c.c(new b.a(i10, null, null, 6, null), r.v(androidx.compose.ui.e.f28771b0, Y0.h.j(20)), C6733v0.g(j10), null, interfaceC3540lR, ((i12 << 6) & 896) | 48, 4);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: De.e
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return f.c(j10, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(long j10, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(j10, i10, interfaceC3540l, L0.a(i11 | 1));
        return J.f24997a;
    }
}
