package G9;

import F9.Y;
import N.AbstractC3343s;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Yg.J;
import androidx.compose.foundation.layout.r;
import la.C6562a;
import m0.C6733v0;
import mh.InterfaceC6839p;
import ta.AbstractC8049c;

/* loaded from: classes3.dex */
public abstract class m {
    public static final void b(s9.b bVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        final s9.b bVar2;
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1378822894);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            bVar2 = bVar;
        } else if ((i10 & 6) == 0) {
            bVar2 = bVar;
            i12 = (interfaceC3540lR.T(bVar2) ? 4 : 2) | i10;
        } else {
            bVar2 = bVar;
            i12 = i10;
        }
        if ((i12 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            s9.b bVarA = i13 != 0 ? Y.f6148a.a() : bVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1378822894, i12, -1, "com.ui.core.ui.component.settings.widget.UiSettingsWidgetTrailingIcon (UiSettingsWidgetTrailingIcon.kt:14)");
            }
            float f10 = 4;
            AbstractC8049c.c(bVarA, androidx.compose.foundation.layout.o.m(r.i(androidx.compose.ui.e.f28771b0, Y0.h.j(24)), Y0.h.j(7), Y0.h.j(f10), 0.0f, Y0.h.j(f10), 4, null), C6733v0.g(C6733v0.k(C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).c().a(), ((Number) interfaceC3540lR.t(AbstractC3343s.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null)), null, interfaceC3540lR, (i12 & 14) | 48, 4);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            bVar2 = bVarA;
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: G9.l
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return m.c(bVar2, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(s9.b bVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(bVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
