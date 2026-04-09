package pg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import kg.InterfaceC6464a;

/* loaded from: classes4.dex */
public final class l extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC6464a f57970a;

    public l(InterfaceC6464a interfaceC6464a) {
        this.f57970a = interfaceC6464a;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        InterfaceC6043c interfaceC6043cR = InterfaceC6043c.r();
        interfaceC5914d.c(interfaceC6043cR);
        if (interfaceC6043cR.isDisposed()) {
            return;
        }
        try {
            this.f57970a.run();
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
