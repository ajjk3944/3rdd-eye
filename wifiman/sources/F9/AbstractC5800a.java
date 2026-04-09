package f9;

import e9.C5430b;
import i9.InterfaceC6137a;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;

/* renamed from: f9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5800a {
    private static final InterfaceC6137a a() {
        return C5430b.f46259a.a();
    }

    public static final void b(InterfaceC6824a message) {
        AbstractC6492s.i(message, "message");
        InterfaceC6137a interfaceC6137aA = a();
        if (interfaceC6137aA != null) {
            interfaceC6137aA.b((String) message.invoke());
        }
    }
}
