package If;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import T.o1;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public abstract class A {
    public static final void b(final androidx.compose.ui.e modifier, final y vm, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-403712787);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(vm) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-403712787, i11, -1, "com.ui.wifiman.ui.wmw.WmwStatusPopupConnection (WmwStatusPopupConnection.kt:33)");
            }
            Jf.i.b(androidx.compose.foundation.layout.o.k(modifier, C6562a.f52458a.d(interfaceC3540lR, C6562a.f52459b).a().a().c(), 0.0f, 2, null), ((Number) o1.b(vm.o0(), null, interfaceC3540lR, 0, 1).getValue()).floatValue(), null, (s9.d) o1.b(vm.getTitle(), null, interfaceC3540lR, 0, 1).getValue(), (s9.d) o1.b(vm.n0(), null, interfaceC3540lR, 0, 1).getValue(), interfaceC3540lR, 384);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: If.z
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return A.c(modifier, vm, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, y yVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, yVar, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }
}
