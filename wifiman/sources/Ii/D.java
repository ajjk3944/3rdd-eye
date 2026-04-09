package Ii;

import Yg.u;
import dh.InterfaceC5380e;

/* loaded from: classes4.dex */
public abstract class D {
    public static final Object a(Object obj, InterfaceC5380e interfaceC5380e) {
        if (!(obj instanceof C)) {
            return Yg.u.c(obj);
        }
        u.a aVar = Yg.u.f25017b;
        return Yg.u.c(Yg.v.a(((C) obj).f9236a));
    }

    public static final Object b(Object obj) {
        Throwable thH = Yg.u.h(obj);
        return thH == null ? obj : new C(thH, false, 2, null);
    }

    public static final Object c(Object obj, InterfaceC3069n interfaceC3069n) {
        Throwable thH = Yg.u.h(obj);
        return thH == null ? obj : new C(thH, false, 2, null);
    }
}
