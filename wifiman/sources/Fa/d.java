package fa;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Yg.J;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.P;
import com.ui.core.ui.sso.SSOAccountVM;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;
import q2.InterfaceC7418f;

/* loaded from: classes3.dex */
public abstract class d {
    public static final void c(final Fragment fragment, final SSOAccountVM sessionVM, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(fragment, "<this>");
        AbstractC6492s.i(sessionVM, "sessionVM");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1282848233);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(fragment) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(sessionVM) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1282848233, i11, -1, "com.ui.core.ui.sso.trusted.UiTrustedDevice (UiTrustedDevice.kt:16)");
            }
            interfaceC3540lR.U(1803490216);
            boolean zL = interfaceC3540lR.l(sessionVM);
            Object objF = interfaceC3540lR.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6839p() { // from class: fa.b
                    @Override // mh.InterfaceC6839p
                    public final Object invoke(Object obj, Object obj2) {
                        return d.d(sessionVM, (InterfaceC7418f) obj, (Bundle) obj2);
                    }
                };
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            R9.i.c(fragment, (InterfaceC6839p) objF, C5801a.f47199a.b(), interfaceC3540lR, (i11 & 14) | 384);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: fa.c
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return d.e(fragment, sessionVM, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final P.c d(SSOAccountVM sSOAccountVM, InterfaceC7418f savedStateRegistryOwner, Bundle arguments) {
        AbstractC6492s.i(savedStateRegistryOwner, "savedStateRegistryOwner");
        AbstractC6492s.i(arguments, "arguments");
        return new k(sSOAccountVM, savedStateRegistryOwner, arguments);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(Fragment fragment, SSOAccountVM sSOAccountVM, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        c(fragment, sSOAccountVM, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
