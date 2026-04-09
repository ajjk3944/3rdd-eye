package Re;

import L0.C3174d;
import N.a1;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import sa.AbstractC7930a;

/* loaded from: classes4.dex */
public abstract class h {
    public static final void b(androidx.compose.ui.e eVar, final s9.d text, final InterfaceC6824a onClick, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        AbstractC6492s.i(text, "text");
        AbstractC6492s.i(onClick, "onClick");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1460948490);
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
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.l(onClick) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i14 = i12;
        if ((i14 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            androidx.compose.ui.e eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1460948490, i14, -1, "com.ui.wifiman.ui.settings.AppSettingsFooterButton (AppSettingsFooterButton.kt:17)");
            }
            androidx.compose.ui.e eVarD = androidx.compose.foundation.d.d(eVar3, true, null, null, onClick, 6, null);
            C3174d c3174dA = AbstractC7930a.a(text, interfaceC3540lR, (i14 >> 3) & 14);
            C6562a c6562a = C6562a.f52458a;
            int i15 = C6562a.f52459b;
            a1.c(c3174dA, eVarD, c6562a.a(interfaceC3540lR, i15).a().b().f(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540lR, i15).b().f(), interfaceC3540lR, 0, 0, 131064);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar3;
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            final androidx.compose.ui.e eVar4 = eVar2;
            x0Z.a(new InterfaceC6839p() { // from class: Re.g
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return h.c(eVar4, text, onClick, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(androidx.compose.ui.e eVar, s9.d dVar, InterfaceC6824a interfaceC6824a, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(eVar, dVar, interfaceC6824a, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
