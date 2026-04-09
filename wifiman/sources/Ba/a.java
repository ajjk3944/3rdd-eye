package Ba;

import i9.InterfaceC6137a;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import xa.InterfaceC8439a;

/* loaded from: classes3.dex */
public abstract class a {
    private static final InterfaceC6137a a() {
        return InterfaceC8439a.f65486a.a();
    }

    public static final void b(InterfaceC6824a message) {
        AbstractC6492s.i(message, "message");
        InterfaceC6137a interfaceC6137aA = a();
        if (interfaceC6137aA != null) {
            interfaceC6137aA.b((String) message.invoke());
        }
    }
}
