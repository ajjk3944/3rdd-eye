package sf;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Yg.J;
import la.C6562a;
import mh.InterfaceC6839p;

/* renamed from: sf.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7954e {
    public static final void b(final androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1415691423);
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
                AbstractC3546o.Q(-1415691423, i12, -1, "com.ui.wifiman.ui.teleport.invitation.TeleportInvitationPasteFailedUi (TeleportInvitationPasteFailedUi.kt:22)");
            }
            long jA = C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).e().a();
            C7950a c7950a = C7950a.f61472a;
            Fe.g.b(eVar, jA, c7950a.a(), false, 0.0f, c7950a.b(), interfaceC3540lR, (i12 & 14) | 196992, 24);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: sf.d
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7954e.c(eVar, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
