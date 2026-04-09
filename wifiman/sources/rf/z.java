package rf;

import L0.U;
import N.a1;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6839p;
import sa.AbstractC7930a;

/* loaded from: classes4.dex */
public abstract class z {
    public static final void c(androidx.compose.ui.e eVar, final s9.d text, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        final androidx.compose.ui.e eVar2;
        int i12;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(text, "text");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-283971681);
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
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(text) ? 32 : 16;
        }
        int i14 = i12;
        if ((i14 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            androidx.compose.ui.e eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-283971681, i14, -1, "com.ui.wifiman.ui.teleport.component.TeleportWizardHeaderSubtitle (TeleportWizardHeader.kt:26)");
            }
            C6562a c6562a = C6562a.f52458a;
            int i15 = C6562a.f52459b;
            U uA = c6562a.c(interfaceC3540lR, i15).b().a();
            long jC = c6562a.a(interfaceC3540lR, i15).f().c();
            interfaceC3540l2 = interfaceC3540lR;
            a1.c(AbstractC7930a.a(text, interfaceC3540lR, (i14 >> 3) & 14), eVar3, jC, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, uA, interfaceC3540l2, (i14 << 3) & 112, 0, 131064);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar3;
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: rf.x
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return z.d(eVar2, text, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d(androidx.compose.ui.e eVar, s9.d dVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(eVar, dVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    public static final void e(androidx.compose.ui.e eVar, final s9.d text, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        final androidx.compose.ui.e eVar2;
        int i12;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(text, "text");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(407750241);
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
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(text) ? 32 : 16;
        }
        int i14 = i12;
        if ((i14 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            androidx.compose.ui.e eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(407750241, i14, -1, "com.ui.wifiman.ui.teleport.component.TeleportWizardHeaderTitle (TeleportWizardHeader.kt:13)");
            }
            C6562a c6562a = C6562a.f52458a;
            int i15 = C6562a.f52459b;
            U uE = c6562a.c(interfaceC3540lR, i15).a().e();
            interfaceC3540l2 = interfaceC3540lR;
            a1.c(AbstractC7930a.a(text, interfaceC3540lR, (i14 >> 3) & 14), eVar3, c6562a.a(interfaceC3540lR, i15).f().a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, uE, interfaceC3540l2, (i14 << 3) & 112, 0, 131064);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar3;
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: rf.y
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return z.f(eVar2, text, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(androidx.compose.ui.e eVar, s9.d dVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        e(eVar, dVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
