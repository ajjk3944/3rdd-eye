package Be;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import m0.C6733v0;
import mh.InterfaceC6839p;
import q.AbstractC7402u;

/* loaded from: classes4.dex */
public abstract class E {
    public static final void b(androidx.compose.ui.e eVar, final long j10, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1917688693);
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
            i12 |= interfaceC3540lR.j(j10) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                eVar = androidx.compose.ui.e.f28771b0;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1917688693, i12, -1, "com.ui.wifiman.ui.component.StatusDot (StatusDot.kt:22)");
            }
            z.a0.a(androidx.compose.foundation.b.c(androidx.compose.foundation.layout.r.o(eVar, Y0.h.j(8)), ((C6733v0) AbstractC7402u.a(j10, null, "dot color", null, interfaceC3540lR, ((i12 >> 3) & 14) | 384, 10).getValue()).u(), E.h.g()), interfaceC3540lR, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        final androidx.compose.ui.e eVar2 = eVar;
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Be.D
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return E.c(eVar2, j10, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, long j10, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, j10, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }
}
