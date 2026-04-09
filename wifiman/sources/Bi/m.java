package bi;

import Bh.InterfaceC2492b;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class m extends n {
    @Override // bi.n
    public void b(InterfaceC2492b first, InterfaceC2492b second) {
        AbstractC6492s.i(first, "first");
        AbstractC6492s.i(second, "second");
        e(first, second);
    }

    @Override // bi.n
    public void c(InterfaceC2492b fromSuper, InterfaceC2492b fromCurrent) {
        AbstractC6492s.i(fromSuper, "fromSuper");
        AbstractC6492s.i(fromCurrent, "fromCurrent");
        e(fromSuper, fromCurrent);
    }

    protected abstract void e(InterfaceC2492b interfaceC2492b, InterfaceC2492b interfaceC2492b2);
}
