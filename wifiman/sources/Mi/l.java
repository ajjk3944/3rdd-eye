package Mi;

import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* loaded from: classes4.dex */
final class l extends Ni.y {
    public l(InterfaceC5384i interfaceC5384i, InterfaceC5380e interfaceC5380e) {
        super(interfaceC5384i, interfaceC5380e);
    }

    @Override // Ii.D0
    public boolean I(Throwable th2) {
        if (th2 instanceof ChildCancelledException) {
            return true;
        }
        return D(th2);
    }
}
