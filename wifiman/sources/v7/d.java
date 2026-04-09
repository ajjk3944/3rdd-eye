package v7;

import i9.InterfaceC6137a;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import o7.o;

/* loaded from: classes3.dex */
public abstract class d {
    private static final InterfaceC6137a a() {
        return o.f55558a.a();
    }

    public static final void b(InterfaceC6824a message) {
        AbstractC6492s.i(message, "message");
        InterfaceC6137a interfaceC6137aA = a();
        if (interfaceC6137aA != null) {
            interfaceC6137aA.b((String) message.invoke());
        }
    }

    public static final void c(InterfaceC6824a message, Throwable th2) {
        AbstractC6492s.i(message, "message");
        InterfaceC6137a interfaceC6137aA = a();
        if (interfaceC6137aA != null) {
            interfaceC6137aA.c((String) message.invoke(), th2);
        }
    }

    public static /* synthetic */ void d(InterfaceC6824a interfaceC6824a, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        c(interfaceC6824a, th2);
    }
}
