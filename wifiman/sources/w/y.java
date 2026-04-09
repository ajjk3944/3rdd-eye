package w;

import dh.InterfaceC5380e;
import mh.InterfaceC6839p;
import s.EnumC7839L;

/* loaded from: classes.dex */
public interface y {
    static /* synthetic */ Object b(y yVar, EnumC7839L enumC7839L, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
        if ((i10 & 1) != 0) {
            enumC7839L = EnumC7839L.Default;
        }
        return yVar.c(enumC7839L, interfaceC6839p, interfaceC5380e);
    }

    boolean a();

    Object c(EnumC7839L enumC7839L, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e);

    default boolean d() {
        return true;
    }

    default boolean e() {
        return true;
    }

    float f(float f10);
}
