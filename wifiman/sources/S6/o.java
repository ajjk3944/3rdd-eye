package S6;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import r0.AbstractC7554d;
import s.AbstractC7833F;

/* loaded from: classes3.dex */
public abstract class o {
    public static final void b(final k kVar, final androidx.compose.ui.e modifier, final AbstractC7554d painter, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(kVar, "<this>");
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(painter, "painter");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1825163718);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(kVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.l(painter) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1825163718, i11, -1, "com.skydoves.landscapist.LandscapistImage (LandscapistImage.kt:28)");
            }
            AbstractC7833F.a(painter, kVar.f(), modifier, kVar.c(), kVar.g(), kVar.d(), kVar.e(), interfaceC3540lR, ((i11 >> 6) & 14) | ((i11 << 3) & 896), 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: S6.n
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return o.c(kVar, modifier, painter, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(k kVar, androidx.compose.ui.e eVar, AbstractC7554d abstractC7554d, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(kVar, eVar, abstractC7554d, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
