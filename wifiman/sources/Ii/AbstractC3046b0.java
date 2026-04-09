package Ii;

import Ni.AbstractC3406h;
import Ni.C3405g;
import Yg.u;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Ii.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3046b0 {
    public static final void a(AbstractC3044a0 abstractC3044a0, int i10) {
        InterfaceC5380e interfaceC5380eC = abstractC3044a0.c();
        boolean z10 = i10 == 4;
        if (z10 || !(interfaceC5380eC instanceof C3405g) || b(i10) != b(abstractC3044a0.f9299c)) {
            d(abstractC3044a0, interfaceC5380eC, z10);
            return;
        }
        C3405g c3405g = (C3405g) interfaceC5380eC;
        J j10 = c3405g.f16592d;
        InterfaceC5384i context = c3405g.getContext();
        if (AbstractC3406h.d(j10, context)) {
            AbstractC3406h.c(j10, context, abstractC3044a0);
        } else {
            e(abstractC3044a0);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final void d(AbstractC3044a0 abstractC3044a0, InterfaceC5380e interfaceC5380e, boolean z10) {
        Object objE;
        Object objG = abstractC3044a0.g();
        Throwable thD = abstractC3044a0.d(objG);
        if (thD != null) {
            u.a aVar = Yg.u.f25017b;
            objE = Yg.v.a(thD);
        } else {
            u.a aVar2 = Yg.u.f25017b;
            objE = abstractC3044a0.e(objG);
        }
        Object objC = Yg.u.c(objE);
        if (!z10) {
            interfaceC5380e.resumeWith(objC);
            return;
        }
        AbstractC6492s.g(interfaceC5380e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C3405g c3405g = (C3405g) interfaceC5380e;
        InterfaceC5380e interfaceC5380e2 = c3405g.f16593e;
        Object obj = c3405g.f16595g;
        InterfaceC5384i context = interfaceC5380e2.getContext();
        Object objI = Ni.J.i(context, obj);
        Y0 y0M = objI != Ni.J.f16576a ? H.m(interfaceC5380e2, context, objI) : null;
        try {
            c3405g.f16593e.resumeWith(objC);
            Yg.J j10 = Yg.J.f24997a;
        } finally {
            if (y0M == null || y0M.S0()) {
                Ni.J.f(context, objI);
            }
        }
    }

    private static final void e(AbstractC3044a0 abstractC3044a0) {
        AbstractC3060i0 abstractC3060i0B = U0.f9286a.b();
        if (abstractC3060i0B.w0()) {
            abstractC3060i0B.s0(abstractC3044a0);
            return;
        }
        abstractC3060i0B.u0(true);
        try {
            d(abstractC3044a0, abstractC3044a0.c(), true);
            do {
            } while (abstractC3060i0B.z0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
