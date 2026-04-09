package Ii;

import dh.InterfaceC5380e;
import dh.InterfaceC5381f;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;

/* loaded from: classes4.dex */
public abstract class Y {
    public static final Object a(long j10, InterfaceC5380e interfaceC5380e) {
        if (j10 <= 0) {
            return Yg.J.f24997a;
        }
        C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
        c3073p.A();
        if (j10 < Long.MAX_VALUE) {
            b(c3073p.getContext()).J(j10, c3073p);
        }
        Object objU = c3073p.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU == AbstractC5467b.g() ? objU : Yg.J.f24997a;
    }

    public static final X b(InterfaceC5384i interfaceC5384i) {
        InterfaceC5384i.b bVar = interfaceC5384i.get(InterfaceC5381f.f46086m0);
        X x10 = bVar instanceof X ? (X) bVar : null;
        return x10 == null ? U.a() : x10;
    }
}
