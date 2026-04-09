package Ii;

import Ni.AbstractC3404f;
import Yg.AbstractC3663g;
import dh.InterfaceC5384i;
import kotlinx.coroutines.DispatchException;

/* loaded from: classes4.dex */
public abstract class L {
    public static final void a(InterfaceC5384i interfaceC5384i, Throwable th2) {
        if (th2 instanceof DispatchException) {
            th2 = ((DispatchException) th2).getCause();
        }
        try {
            K k10 = (K) interfaceC5384i.get(K.f9272M);
            if (k10 != null) {
                k10.s(interfaceC5384i, th2);
            } else {
                AbstractC3404f.a(interfaceC5384i, th2);
            }
        } catch (Throwable th3) {
            AbstractC3404f.a(interfaceC5384i, b(th2, th3));
        }
    }

    public static final Throwable b(Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        AbstractC3663g.a(runtimeException, th2);
        return runtimeException;
    }
}
