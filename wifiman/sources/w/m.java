package w;

import dh.InterfaceC5380e;
import mh.InterfaceC6839p;
import s.EnumC7839L;

/* loaded from: classes.dex */
public interface m {
    static /* synthetic */ Object b(m mVar, EnumC7839L enumC7839L, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
        }
        if ((i10 & 1) != 0) {
            enumC7839L = EnumC7839L.Default;
        }
        return mVar.a(enumC7839L, interfaceC6839p, interfaceC5380e);
    }

    Object a(EnumC7839L enumC7839L, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e);
}
