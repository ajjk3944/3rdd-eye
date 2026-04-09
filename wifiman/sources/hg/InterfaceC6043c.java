package hg;

import java.util.Objects;
import kg.InterfaceC6464a;
import lg.EnumC6593c;
import mg.AbstractC6822a;

/* renamed from: hg.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6043c {
    static InterfaceC6043c l(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        return new f(runnable);
    }

    static InterfaceC6043c n() {
        return EnumC6593c.INSTANCE;
    }

    static InterfaceC6043c p(InterfaceC6464a interfaceC6464a) {
        Objects.requireNonNull(interfaceC6464a, "action is null");
        return new C6041a(interfaceC6464a);
    }

    static InterfaceC6043c r() {
        return l(AbstractC6822a.f54015b);
    }

    void dispose();

    boolean isDisposed();
}
