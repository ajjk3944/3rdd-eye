package Af;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import h9.C5969a;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;

/* renamed from: Af.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2431f {
    public static final void c(final androidx.compose.ui.e modifier, final C2428c model, InterfaceC6835l interfaceC6835l, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        int i12;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(model, "model");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1664876779);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(model) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6835l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i12 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                interfaceC3540lR.U(-220299514);
                Object objF = interfaceC3540lR.f();
                if (objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6835l() { // from class: Af.d
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return AbstractC2431f.d((C5969a) obj);
                        }
                    };
                    interfaceC3540lR.K(objF);
                }
                interfaceC6835l = (InterfaceC6835l) objF;
                interfaceC3540lR.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1664876779, i12, -1, "com.ui.wifiman.ui.wifi.component.WifiAccessPointItem (WifiAccessPointItem.kt:13)");
            }
            float f10 = 8;
            l.f(androidx.compose.foundation.layout.o.j(modifier, Y0.h.j(f10), Y0.h.j(f10)), model, interfaceC6835l, interfaceC3540lR, i12 & 1008, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        final InterfaceC6835l interfaceC6835l2 = interfaceC6835l;
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Af.e
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC2431f.e(modifier, model, interfaceC6835l2, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J d(C5969a it) {
        AbstractC6492s.i(it, "it");
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(androidx.compose.ui.e eVar, C2428c c2428c, InterfaceC6835l interfaceC6835l, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(eVar, c2428c, interfaceC6835l, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }
}
