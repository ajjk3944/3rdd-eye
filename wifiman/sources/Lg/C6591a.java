package lg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.concurrent.atomic.AtomicReference;
import kg.InterfaceC6468e;

/* renamed from: lg.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6591a extends AtomicReference implements InterfaceC6043c {
    public C6591a(InterfaceC6468e interfaceC6468e) {
        super(interfaceC6468e);
    }

    @Override // hg.InterfaceC6043c
    public void dispose() {
        InterfaceC6468e interfaceC6468e;
        if (get() == null || (interfaceC6468e = (InterfaceC6468e) getAndSet(null)) == null) {
            return;
        }
        try {
            interfaceC6468e.cancel();
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            Eg.a.v(th2);
        }
    }

    @Override // hg.InterfaceC6043c
    public boolean isDisposed() {
        return get() == null;
    }
}
