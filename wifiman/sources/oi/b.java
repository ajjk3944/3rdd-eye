package Oi;

import Ii.C;
import Ii.E0;
import Ni.J;
import Ni.y;
import Yg.u;
import Yg.v;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public abstract class b {
    public static final void a(InterfaceC6839p interfaceC6839p, Object obj, InterfaceC5380e interfaceC5380e) {
        InterfaceC5380e interfaceC5380eA = h.a(interfaceC5380e);
        try {
            InterfaceC5384i context = interfaceC5380eA.getContext();
            Object objI = J.i(context, null);
            try {
                h.b(interfaceC5380eA);
                Object objE = !(interfaceC6839p instanceof kotlin.coroutines.jvm.internal.a) ? AbstractC5467b.e(interfaceC6839p, obj, interfaceC5380eA) : ((InterfaceC6839p) V.f(interfaceC6839p, 2)).invoke(obj, interfaceC5380eA);
                J.f(context, objI);
                if (objE != AbstractC5467b.g()) {
                    interfaceC5380eA.resumeWith(u.c(objE));
                }
            } catch (Throwable th2) {
                J.f(context, objI);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getCause();
            }
            u.a aVar = u.f25017b;
            interfaceC5380eA.resumeWith(u.c(v.a(th)));
        }
    }

    public static final Object b(y yVar, Object obj, InterfaceC6839p interfaceC6839p) {
        Object c10;
        Object objN0;
        try {
            c10 = !(interfaceC6839p instanceof kotlin.coroutines.jvm.internal.a) ? AbstractC5467b.e(interfaceC6839p, obj, yVar) : ((InterfaceC6839p) V.f(interfaceC6839p, 2)).invoke(obj, yVar);
        } catch (Throwable th2) {
            c10 = new C(th2, false, 2, null);
        }
        if (c10 != AbstractC5467b.g() && (objN0 = yVar.n0(c10)) != E0.f9260b) {
            yVar.R0();
            if (objN0 instanceof C) {
                throw ((C) objN0).f9236a;
            }
            return E0.h(objN0);
        }
        return AbstractC5467b.g();
    }

    public static final Object c(y yVar, Object obj, InterfaceC6839p interfaceC6839p) throws Throwable {
        Object c10;
        Object objN0;
        try {
            c10 = !(interfaceC6839p instanceof kotlin.coroutines.jvm.internal.a) ? AbstractC5467b.e(interfaceC6839p, obj, yVar) : ((InterfaceC6839p) V.f(interfaceC6839p, 2)).invoke(obj, yVar);
        } catch (Throwable th2) {
            c10 = new C(th2, false, 2, null);
        }
        if (c10 != AbstractC5467b.g() && (objN0 = yVar.n0(c10)) != E0.f9260b) {
            yVar.R0();
            if (objN0 instanceof C) {
                Throwable th3 = ((C) objN0).f9236a;
                if (!(th3 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th3).coroutine != yVar) {
                    throw th3;
                }
                if (c10 instanceof C) {
                    throw ((C) c10).f9236a;
                }
            } else {
                c10 = E0.h(objN0);
            }
            return c10;
        }
        return AbstractC5467b.g();
    }
}
