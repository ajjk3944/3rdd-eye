package R9;

import T.AbstractC3546o;
import T.AbstractC3561w;
import T.I0;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Yg.J;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.P;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import q2.InterfaceC7418f;

/* loaded from: classes3.dex */
public abstract class i {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f19610a;

        a(InterfaceC6839p interfaceC6839p) {
            this.f19610a = interfaceC6839p;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(580114436, i10, -1, "com.ui.core.ui.sso.arch.vm.withVmFactoryProvider.<anonymous> (ViewModelFactoryProvider.kt:33)");
            }
            this.f19610a.invoke(interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    public static final void c(final Fragment fragment, final InterfaceC6839p vmFactoryProvider, final InterfaceC6839p content, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(fragment, "<this>");
        AbstractC6492s.i(vmFactoryProvider, "vmFactoryProvider");
        AbstractC6492s.i(content, "content");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1997798588);
        if ((i10 & 48) == 0) {
            i11 = (interfaceC3540lR.l(vmFactoryProvider) ? 32 : 16) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.l(content) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 145) == 144 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1997798588, i11, -1, "com.ui.core.ui.sso.arch.vm.withVmFactoryProvider (ViewModelFactoryProvider.kt:19)");
            }
            interfaceC3540lR.U(-1547055912);
            Object objF = interfaceC3540lR.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new f(new InterfaceC6839p() { // from class: R9.g
                    @Override // mh.InterfaceC6839p
                    public final Object invoke(Object obj, Object obj2) {
                        return i.d(vmFactoryProvider, (InterfaceC7418f) obj, (Bundle) obj2);
                    }
                });
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            AbstractC3561w.a(Q9.h.k().d((f) objF), b0.c.e(580114436, true, new a(content), interfaceC3540lR, 54), interfaceC3540lR, I0.f20869i | 48);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: R9.h
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return i.e(fragment, vmFactoryProvider, content, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final P.c d(InterfaceC6839p interfaceC6839p, InterfaceC7418f savedStateRegistryOwner, Bundle arguments) {
        AbstractC6492s.i(savedStateRegistryOwner, "savedStateRegistryOwner");
        AbstractC6492s.i(arguments, "arguments");
        return (P.c) interfaceC6839p.invoke(savedStateRegistryOwner, arguments);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(Fragment fragment, InterfaceC6839p interfaceC6839p, InterfaceC6839p interfaceC6839p2, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        c(fragment, interfaceC6839p, interfaceC6839p2, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
