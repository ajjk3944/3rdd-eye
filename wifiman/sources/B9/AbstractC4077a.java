package b9;

import i9.InterfaceC6137a;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;

/* renamed from: b9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4077a {
    private static final InterfaceC6137a a() {
        return T8.a.f21453a.a();
    }

    public static final void b(InterfaceC6824a message, Throwable th2) {
        AbstractC6492s.i(message, "message");
        InterfaceC6137a interfaceC6137aA = a();
        if (interfaceC6137aA != null) {
            interfaceC6137aA.a((String) message.invoke(), th2);
        }
    }

    public static final void c(InterfaceC6824a message) {
        AbstractC6492s.i(message, "message");
        InterfaceC6137a interfaceC6137aA = a();
        if (interfaceC6137aA != null) {
            interfaceC6137aA.b((String) message.invoke());
        }
    }
}
