package kotlin.coroutines.jvm.internal;

import dh.C5385j;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;

/* loaded from: classes4.dex */
public abstract class j extends a {
    public j(InterfaceC5380e interfaceC5380e) {
        super(interfaceC5380e);
        if (interfaceC5380e != null && interfaceC5380e.getContext() != C5385j.f46088a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // dh.InterfaceC5380e
    public InterfaceC5384i getContext() {
        return C5385j.f46088a;
    }
}
