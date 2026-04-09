package Ie;

import L0.C3174d;
import L0.U;
import N.a1;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Yg.J;
import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6839p;
import sa.AbstractC7930a;

/* loaded from: classes4.dex */
public abstract class b {
    public static final void b(e eVar, final s9.d text, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        final e eVar2;
        int i12;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(text, "text");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(45440075);
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
            e eVar3 = i13 != 0 ? e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(45440075, i14, -1, "com.ui.wifiman.ui.component.vico.UiSettingsCardTitle (UiSettingsCardTitle.kt:13)");
            }
            C3174d c3174dA = AbstractC7930a.a(text, interfaceC3540lR, (i14 >> 3) & 14);
            C6562a c6562a = C6562a.f52458a;
            int i15 = C6562a.f52459b;
            U uA = c6562a.c(interfaceC3540lR, i15).a().a();
            interfaceC3540l2 = interfaceC3540lR;
            a1.c(c3174dA, eVar3, c6562a.a(interfaceC3540lR, i15).f().a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, uA, interfaceC3540l2, (i14 << 3) & 112, 0, 131064);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar3;
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Ie.a
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return b.c(eVar2, text, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(e eVar, s9.d dVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, dVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
