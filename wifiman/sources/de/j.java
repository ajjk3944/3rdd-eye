package De;

import N.a1;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Yg.J;
import androidx.compose.foundation.layout.o;
import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6839p;
import sa.AbstractC7930a;

/* loaded from: classes4.dex */
public abstract class j {
    public static final void b(final s9.d text, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(text, "text");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1236661379);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(text) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1236661379, i11, -1, "com.ui.wifiman.ui.component.label.Tag (Tag.kt:28)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            interfaceC3540l2 = interfaceC3540lR;
            a1.c(AbstractC7930a.a(text, interfaceC3540lR, i11 & 14), o.k(androidx.compose.foundation.b.c(aVar, c6562a.a(interfaceC3540lR, i12).a().b().a(), E.h.d(Y0.h.j(16))), Y0.h.j(8), 0.0f, 2, null), c6562a.a(interfaceC3540lR, i12).a().b().f(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540lR, i12).a().f(), interfaceC3540l2, 0, 0, 131064);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: De.i
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return j.c(text, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(s9.d dVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(dVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
