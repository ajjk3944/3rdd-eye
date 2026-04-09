package pg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class m extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final Callable f57971a;

    public m(Callable callable) {
        this.f57971a = callable;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        InterfaceC6043c interfaceC6043cR = InterfaceC6043c.r();
        interfaceC5914d.c(interfaceC6043cR);
        try {
            this.f57971a.call();
            if (interfaceC6043cR.isDisposed()) {
                return;
            }
            interfaceC5914d.a();
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            if (interfaceC6043cR.isDisposed()) {
                Eg.a.v(th2);
            } else {
                interfaceC5914d.onError(th2);
            }
        }
    }
}
