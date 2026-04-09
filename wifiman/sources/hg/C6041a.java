package hg;

import kg.InterfaceC6464a;
import zg.AbstractC8755h;

/* renamed from: hg.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C6041a extends AbstractC6045e {
    C6041a(InterfaceC6464a interfaceC6464a) {
        super(interfaceC6464a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // hg.AbstractC6045e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(InterfaceC6464a interfaceC6464a) {
        try {
            interfaceC6464a.run();
        } catch (Throwable th2) {
            throw AbstractC8755h.h(th2);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "ActionDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }
}
