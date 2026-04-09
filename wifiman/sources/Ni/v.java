package Ni;

import Yg.AbstractC3663g;
import dh.InterfaceC5384i;
import kotlinx.coroutines.internal.UndeliveredElementException;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public abstract class v {
    public static final void a(InterfaceC6835l interfaceC6835l, Object obj, InterfaceC5384i interfaceC5384i) {
        UndeliveredElementException undeliveredElementExceptionB = b(interfaceC6835l, obj, null);
        if (undeliveredElementExceptionB != null) {
            Ii.L.a(interfaceC5384i, undeliveredElementExceptionB);
        }
    }

    public static final UndeliveredElementException b(InterfaceC6835l interfaceC6835l, Object obj, UndeliveredElementException undeliveredElementException) {
        try {
            interfaceC6835l.invoke(obj);
        } catch (Throwable th2) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th2) {
                return new UndeliveredElementException("Exception in undelivered element handler for " + obj, th2);
            }
            AbstractC3663g.a(undeliveredElementException, th2);
        }
        return undeliveredElementException;
    }

    public static /* synthetic */ UndeliveredElementException c(InterfaceC6835l interfaceC6835l, Object obj, UndeliveredElementException undeliveredElementException, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            undeliveredElementException = null;
        }
        return b(interfaceC6835l, obj, undeliveredElementException);
    }
}
