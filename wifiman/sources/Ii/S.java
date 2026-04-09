package Ii;

import Ni.C3405g;
import Yg.u;
import dh.InterfaceC5380e;

/* loaded from: classes4.dex */
public abstract class S {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(InterfaceC5380e interfaceC5380e) {
        Object objC;
        if (interfaceC5380e instanceof C3405g) {
            return ((C3405g) interfaceC5380e).toString();
        }
        try {
            u.a aVar = Yg.u.f25017b;
            objC = Yg.u.c(interfaceC5380e + '@' + b(interfaceC5380e));
        } catch (Throwable th2) {
            u.a aVar2 = Yg.u.f25017b;
            objC = Yg.u.c(Yg.v.a(th2));
        }
        if (Yg.u.h(objC) != null) {
            objC = interfaceC5380e.getClass().getName() + '@' + b(interfaceC5380e);
        }
        return (String) objC;
    }
}
