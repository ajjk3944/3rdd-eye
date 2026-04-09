package T;

import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import mh.InterfaceC6835l;

/* renamed from: T.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3535i0 {
    public static final InterfaceC3530g0 a(InterfaceC5384i interfaceC5384i) {
        InterfaceC3530g0 interfaceC3530g0 = (InterfaceC3530g0) interfaceC5384i.get(InterfaceC3530g0.f21076a0);
        if (interfaceC3530g0 != null) {
            return interfaceC3530g0;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final Object b(InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
        return a(interfaceC5380e.getContext()).j(new C3533h0(interfaceC6835l), interfaceC5380e);
    }

    public static final Object c(InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
        return a(interfaceC5380e.getContext()).j(interfaceC6835l, interfaceC5380e);
    }
}
