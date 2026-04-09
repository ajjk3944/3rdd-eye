package Ii;

import Ni.AbstractC3406h;
import Ni.C3405g;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;

/* loaded from: classes4.dex */
public abstract class c1 {
    public static final Object a(InterfaceC5380e interfaceC5380e) {
        Object objG;
        InterfaceC5384i context = interfaceC5380e.getContext();
        A0.l(context);
        InterfaceC5380e interfaceC5380eD = AbstractC5467b.d(interfaceC5380e);
        C3405g c3405g = interfaceC5380eD instanceof C3405g ? (C3405g) interfaceC5380eD : null;
        if (c3405g == null) {
            objG = Yg.J.f24997a;
        } else {
            if (AbstractC3406h.d(c3405g.f16592d, context)) {
                c3405g.j(context, Yg.J.f24997a);
            } else {
                b1 b1Var = new b1();
                InterfaceC5384i interfaceC5384iPlus = context.plus(b1Var);
                Yg.J j10 = Yg.J.f24997a;
                c3405g.j(interfaceC5384iPlus, j10);
                objG = (!b1Var.f9301b || AbstractC3406h.e(c3405g)) ? AbstractC5467b.g() : j10;
            }
            objG = AbstractC5467b.g();
        }
        if (objG == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objG == AbstractC5467b.g() ? objG : Yg.J.f24997a;
    }
}
