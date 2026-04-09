package Ge;

import N.O0;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Yg.J;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import com.google.ar.core.ImageMetadata;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public abstract class n {
    public static final void b(final androidx.compose.ui.e modifier, final InterfaceC6839p content, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(content, "content");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1629603002);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(content) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1629603002, i11, -1, "com.ui.wifiman.ui.component.notification.InAppNotification (InAppNotification.kt:34)");
            }
            androidx.compose.ui.e eVarB = r.B(modifier, 0.0f, Y0.h.j(640), 1, null);
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            O0.a(o.j(eVarB, c6562a.d(interfaceC3540lR, i12).a().a().c(), c6562a.d(interfaceC3540lR, i12).a().b().c()), E.h.d(Y0.h.j(32)), c6562a.a(interfaceC3540lR, i12).e().e(), 0L, null, Y0.h.j(5), content, interfaceC3540lR, ((i11 << 15) & 3670016) | ImageMetadata.EDGE_MODE, 24);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Ge.m
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return n.c(modifier, content, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, InterfaceC6839p interfaceC6839p, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, interfaceC6839p, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
