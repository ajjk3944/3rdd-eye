package Ii;

import Ii.InterfaceC3091y0;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6835l;
import zi.InterfaceC8780j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class B0 {

    /* synthetic */ class a extends C6490p implements InterfaceC6835l {
        a(Object obj) {
            super(1, obj, C0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((C0) this.receiver).v(th2);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Yg.J.f24997a;
        }
    }

    public static final A a(InterfaceC3091y0 interfaceC3091y0) {
        return new C3093z0(interfaceC3091y0);
    }

    public static /* synthetic */ A b(InterfaceC3091y0 interfaceC3091y0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC3091y0 = null;
        }
        return A0.a(interfaceC3091y0);
    }

    public static final void c(InterfaceC3091y0 interfaceC3091y0, String str, Throwable th2) {
        interfaceC3091y0.cancel(AbstractC3070n0.a(str, th2));
    }

    public static final void d(InterfaceC5384i interfaceC5384i, CancellationException cancellationException) {
        InterfaceC3091y0 interfaceC3091y0 = (InterfaceC3091y0) interfaceC5384i.get(InterfaceC3091y0.f9363O);
        if (interfaceC3091y0 != null) {
            interfaceC3091y0.cancel(cancellationException);
        }
    }

    public static /* synthetic */ void e(InterfaceC3091y0 interfaceC3091y0, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        A0.c(interfaceC3091y0, str, th2);
    }

    public static /* synthetic */ void f(InterfaceC5384i interfaceC5384i, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        A0.d(interfaceC5384i, cancellationException);
    }

    public static final Object g(InterfaceC3091y0 interfaceC3091y0, InterfaceC5380e interfaceC5380e) {
        InterfaceC3091y0.a.b(interfaceC3091y0, null, 1, null);
        Object objJoin = interfaceC3091y0.join(interfaceC5380e);
        return objJoin == AbstractC5467b.g() ? objJoin : Yg.J.f24997a;
    }

    public static final void h(InterfaceC5384i interfaceC5384i, CancellationException cancellationException) {
        InterfaceC8780j children;
        InterfaceC3091y0 interfaceC3091y0 = (InterfaceC3091y0) interfaceC5384i.get(InterfaceC3091y0.f9363O);
        if (interfaceC3091y0 == null || (children = interfaceC3091y0.getChildren()) == null) {
            return;
        }
        Iterator it = children.iterator();
        while (it.hasNext()) {
            ((InterfaceC3091y0) it.next()).cancel(cancellationException);
        }
    }

    public static /* synthetic */ void i(InterfaceC5384i interfaceC5384i, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        A0.h(interfaceC5384i, cancellationException);
    }

    public static final InterfaceC3052e0 j(InterfaceC3091y0 interfaceC3091y0, InterfaceC3052e0 interfaceC3052e0) {
        return o(interfaceC3091y0, false, new C3056g0(interfaceC3052e0), 1, null);
    }

    public static final void k(InterfaceC3091y0 interfaceC3091y0) {
        if (!interfaceC3091y0.isActive()) {
            throw interfaceC3091y0.getCancellationException();
        }
    }

    public static final void l(InterfaceC5384i interfaceC5384i) {
        InterfaceC3091y0 interfaceC3091y0 = (InterfaceC3091y0) interfaceC5384i.get(InterfaceC3091y0.f9363O);
        if (interfaceC3091y0 != null) {
            A0.k(interfaceC3091y0);
        }
    }

    public static final InterfaceC3091y0 m(InterfaceC5384i interfaceC5384i) {
        InterfaceC3091y0 interfaceC3091y0 = (InterfaceC3091y0) interfaceC5384i.get(InterfaceC3091y0.f9363O);
        if (interfaceC3091y0 != null) {
            return interfaceC3091y0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + interfaceC5384i).toString());
    }

    public static final InterfaceC3052e0 n(InterfaceC3091y0 interfaceC3091y0, boolean z10, C0 c02) {
        return interfaceC3091y0 instanceof D0 ? ((D0) interfaceC3091y0).h0(z10, c02) : interfaceC3091y0.invokeOnCompletion(c02.u(), z10, new a(c02));
    }

    public static /* synthetic */ InterfaceC3052e0 o(InterfaceC3091y0 interfaceC3091y0, boolean z10, C0 c02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return A0.n(interfaceC3091y0, z10, c02);
    }

    public static final boolean p(InterfaceC5384i interfaceC5384i) {
        InterfaceC3091y0 interfaceC3091y0 = (InterfaceC3091y0) interfaceC5384i.get(InterfaceC3091y0.f9363O);
        if (interfaceC3091y0 != null) {
            return interfaceC3091y0.isActive();
        }
        return true;
    }
}
