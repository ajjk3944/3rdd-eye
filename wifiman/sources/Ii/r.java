package Ii;

import Ni.C3405g;
import dh.InterfaceC5380e;

/* loaded from: classes4.dex */
public abstract class r {
    public static final void a(InterfaceC3069n interfaceC3069n, InterfaceC3052e0 interfaceC3052e0) {
        c(interfaceC3069n, new C3054f0(interfaceC3052e0));
    }

    public static final C3073p b(InterfaceC5380e interfaceC5380e) {
        if (!(interfaceC5380e instanceof C3405g)) {
            return new C3073p(interfaceC5380e, 1);
        }
        C3073p c3073pI = ((C3405g) interfaceC5380e).i();
        if (c3073pI != null) {
            if (!c3073pI.L()) {
                c3073pI = null;
            }
            if (c3073pI != null) {
                return c3073pI;
            }
        }
        return new C3073p(interfaceC5380e, 2);
    }

    public static final void c(InterfaceC3069n interfaceC3069n, InterfaceC3067m interfaceC3067m) {
        if (!(interfaceC3069n instanceof C3073p)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((C3073p) interfaceC3069n).E(interfaceC3067m);
    }
}
