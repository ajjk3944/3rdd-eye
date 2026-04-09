package Oi;

import Ni.AbstractC3406h;
import Yg.J;
import Yg.u;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlinx.coroutines.DispatchException;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public abstract class a {
    private static final void a(InterfaceC5380e interfaceC5380e, Throwable th2) throws Throwable {
        if (th2 instanceof DispatchException) {
            th2 = ((DispatchException) th2).getCause();
        }
        u.a aVar = u.f25017b;
        interfaceC5380e.resumeWith(u.c(v.a(th2)));
        throw th2;
    }

    public static final void b(InterfaceC5380e interfaceC5380e, InterfaceC5380e interfaceC5380e2) throws Throwable {
        try {
            InterfaceC5380e interfaceC5380eD = AbstractC5467b.d(interfaceC5380e);
            u.a aVar = u.f25017b;
            AbstractC3406h.b(interfaceC5380eD, u.c(J.f24997a));
        } catch (Throwable th2) {
            a(interfaceC5380e2, th2);
        }
    }

    public static final void c(InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) throws Throwable {
        try {
            InterfaceC5380e interfaceC5380eD = AbstractC5467b.d(AbstractC5467b.a(interfaceC6835l, interfaceC5380e));
            u.a aVar = u.f25017b;
            AbstractC3406h.b(interfaceC5380eD, u.c(J.f24997a));
        } catch (Throwable th2) {
            a(interfaceC5380e, th2);
        }
    }

    public static final void d(InterfaceC6839p interfaceC6839p, Object obj, InterfaceC5380e interfaceC5380e) {
        try {
            InterfaceC5380e interfaceC5380eD = AbstractC5467b.d(AbstractC5467b.b(interfaceC6839p, obj, interfaceC5380e));
            u.a aVar = u.f25017b;
            AbstractC3406h.b(interfaceC5380eD, u.c(J.f24997a));
        } catch (Throwable th2) {
            a(interfaceC5380e, th2);
        }
    }
}
