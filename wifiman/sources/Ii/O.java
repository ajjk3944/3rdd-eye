package Ii;

import Ni.C3402d;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.util.concurrent.CancellationException;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public abstract class O {
    public static final N a(InterfaceC5384i interfaceC5384i) {
        if (interfaceC5384i.get(InterfaceC3091y0.f9363O) == null) {
            interfaceC5384i = interfaceC5384i.plus(B0.b(null, 1, null));
        }
        return new C3402d(interfaceC5384i);
    }

    public static final N b() {
        return new C3402d(S0.b(null, 1, null).plus(C3048c0.c()));
    }

    public static final void c(N n10, String str, Throwable th2) {
        d(n10, AbstractC3070n0.a(str, th2));
    }

    public static final void d(N n10, CancellationException cancellationException) {
        InterfaceC3091y0 interfaceC3091y0 = (InterfaceC3091y0) n10.getCoroutineContext().get(InterfaceC3091y0.f9363O);
        if (interfaceC3091y0 != null) {
            interfaceC3091y0.cancel(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + n10).toString());
    }

    public static /* synthetic */ void e(N n10, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        c(n10, str, th2);
    }

    public static /* synthetic */ void f(N n10, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        d(n10, cancellationException);
    }

    public static final Object g(InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        Ni.y yVar = new Ni.y(interfaceC5380e.getContext(), interfaceC5380e);
        Object objB = Oi.b.b(yVar, yVar, interfaceC6839p);
        if (objB == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objB;
    }

    public static final void h(N n10) {
        A0.l(n10.getCoroutineContext());
    }

    public static final boolean i(N n10) {
        InterfaceC3091y0 interfaceC3091y0 = (InterfaceC3091y0) n10.getCoroutineContext().get(InterfaceC3091y0.f9363O);
        if (interfaceC3091y0 != null) {
            return interfaceC3091y0.isActive();
        }
        return true;
    }

    public static final N j(N n10, InterfaceC5384i interfaceC5384i) {
        return new C3402d(n10.getCoroutineContext().plus(interfaceC5384i));
    }
}
