package bi;

import Bh.InterfaceC2492b;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class n {
    public abstract void a(InterfaceC2492b interfaceC2492b);

    public abstract void b(InterfaceC2492b interfaceC2492b, InterfaceC2492b interfaceC2492b2);

    public abstract void c(InterfaceC2492b interfaceC2492b, InterfaceC2492b interfaceC2492b2);

    public void d(InterfaceC2492b member, Collection overridden) {
        AbstractC6492s.i(member, "member");
        AbstractC6492s.i(overridden, "overridden");
        member.x0(overridden);
    }
}
