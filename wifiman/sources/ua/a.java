package Ua;

import i9.InterfaceC6137a;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;

/* loaded from: classes3.dex */
public abstract class a {
    private static final String a(String str) {
        return str;
    }

    private static final InterfaceC6137a b() {
        return Ma.a.f13069a.b();
    }

    public static final void c(InterfaceC6824a message, Throwable th2) {
        AbstractC6492s.i(message, "message");
        InterfaceC6137a interfaceC6137aB = b();
        if (interfaceC6137aB != null) {
            interfaceC6137aB.a(a((String) message.invoke()), th2);
        }
    }

    public static /* synthetic */ void d(InterfaceC6824a interfaceC6824a, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        c(interfaceC6824a, th2);
    }

    public static final void e(InterfaceC6824a message) {
        AbstractC6492s.i(message, "message");
        InterfaceC6137a interfaceC6137aB = b();
        if (interfaceC6137aB != null) {
            interfaceC6137aB.b(a((String) message.invoke()));
        }
    }

    public static final void f(InterfaceC6824a message, Throwable th2) {
        AbstractC6492s.i(message, "message");
        InterfaceC6137a interfaceC6137aB = b();
        if (interfaceC6137aB != null) {
            interfaceC6137aB.c(a((String) message.invoke()), th2);
        }
    }

    public static /* synthetic */ void g(InterfaceC6824a interfaceC6824a, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        f(interfaceC6824a, th2);
    }
}
