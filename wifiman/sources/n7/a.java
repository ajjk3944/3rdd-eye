package N7;

import I7.C2997g;
import i9.InterfaceC6137a;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;

/* loaded from: classes3.dex */
public abstract class a {
    private static final InterfaceC6137a a() {
        return C2997g.f8908a.e();
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
}
