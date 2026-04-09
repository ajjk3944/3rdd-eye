package Ii;

import dh.C5385j;
import dh.InterfaceC5380e;
import dh.InterfaceC5381f;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: Ii.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC3063k {
    public static final V a(N n10, InterfaceC5384i interfaceC5384i, P p10, InterfaceC6839p interfaceC6839p) {
        InterfaceC5384i interfaceC5384iJ = H.j(n10, interfaceC5384i);
        W f02 = p10.isLazy() ? new F0(interfaceC5384iJ, interfaceC6839p) : new W(interfaceC5384iJ, true);
        f02.Q0(p10, f02, interfaceC6839p);
        return f02;
    }

    public static /* synthetic */ V b(N n10, InterfaceC5384i interfaceC5384i, P p10, InterfaceC6839p interfaceC6839p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC5384i = C5385j.f46088a;
        }
        if ((i10 & 2) != 0) {
            p10 = P.DEFAULT;
        }
        return AbstractC3059i.a(n10, interfaceC5384i, p10, interfaceC6839p);
    }

    public static final InterfaceC3091y0 c(N n10, InterfaceC5384i interfaceC5384i, P p10, InterfaceC6839p interfaceC6839p) {
        InterfaceC5384i interfaceC5384iJ = H.j(n10, interfaceC5384i);
        Q0 g02 = p10.isLazy() ? new G0(interfaceC5384iJ, interfaceC6839p) : new Q0(interfaceC5384iJ, true);
        g02.Q0(p10, g02, interfaceC6839p);
        return g02;
    }

    public static /* synthetic */ InterfaceC3091y0 d(N n10, InterfaceC5384i interfaceC5384i, P p10, InterfaceC6839p interfaceC6839p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC5384i = C5385j.f46088a;
        }
        if ((i10 & 2) != 0) {
            p10 = P.DEFAULT;
        }
        return AbstractC3059i.c(n10, interfaceC5384i, p10, interfaceC6839p);
    }

    public static final Object e(InterfaceC5384i interfaceC5384i, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        Object objS0;
        InterfaceC5384i context = interfaceC5380e.getContext();
        InterfaceC5384i interfaceC5384iK = H.k(context, interfaceC5384i);
        A0.l(interfaceC5384iK);
        if (interfaceC5384iK == context) {
            Ni.y yVar = new Ni.y(interfaceC5384iK, interfaceC5380e);
            objS0 = Oi.b.b(yVar, yVar, interfaceC6839p);
        } else {
            InterfaceC5381f.b bVar = InterfaceC5381f.f46086m0;
            if (AbstractC6492s.d(interfaceC5384iK.get(bVar), context.get(bVar))) {
                Y0 y02 = new Y0(interfaceC5384iK, interfaceC5380e);
                InterfaceC5384i context2 = y02.getContext();
                Object objI = Ni.J.i(context2, null);
                try {
                    Object objB = Oi.b.b(y02, y02, interfaceC6839p);
                    Ni.J.f(context2, objI);
                    objS0 = objB;
                } catch (Throwable th2) {
                    Ni.J.f(context2, objI);
                    throw th2;
                }
            } else {
                Z z10 = new Z(interfaceC5384iK, interfaceC5380e);
                Oi.a.d(interfaceC6839p, z10, z10);
                objS0 = z10.S0();
            }
        }
        if (objS0 == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objS0;
    }
}
