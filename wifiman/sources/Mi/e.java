package Mi;

import Li.InterfaceC3221h;
import Ni.J;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import kotlin.jvm.internal.V;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public abstract class e {
    public static final Object b(InterfaceC5384i interfaceC5384i, Object obj, Object obj2, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        Object objI = J.i(interfaceC5384i, obj2);
        try {
            y yVar = new y(interfaceC5380e, interfaceC5384i);
            Object objE = !(interfaceC6839p instanceof kotlin.coroutines.jvm.internal.a) ? AbstractC5467b.e(interfaceC6839p, obj, yVar) : ((InterfaceC6839p) V.f(interfaceC6839p, 2)).invoke(obj, yVar);
            J.f(interfaceC5384i, objI);
            if (objE == AbstractC5467b.g()) {
                kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
            }
            return objE;
        } catch (Throwable th2) {
            J.f(interfaceC5384i, objI);
            throw th2;
        }
    }

    public static /* synthetic */ Object c(InterfaceC5384i interfaceC5384i, Object obj, Object obj2, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = J.g(interfaceC5384i);
        }
        return b(interfaceC5384i, obj, obj2, interfaceC6839p, interfaceC5380e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3221h d(InterfaceC3221h interfaceC3221h, InterfaceC5384i interfaceC5384i) {
        return ((interfaceC3221h instanceof x) || (interfaceC3221h instanceof q)) ? interfaceC3221h : new A(interfaceC3221h, interfaceC5384i);
    }
}
