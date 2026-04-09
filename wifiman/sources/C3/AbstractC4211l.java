package c3;

import a3.EnumC3757e;
import a3.InterfaceC3760h;
import g3.AbstractC5861a;

/* renamed from: c3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4211l {
    public static void a(InterfaceC3760h interfaceC3760h, EnumC3757e enumC3757e) {
        if (!(interfaceC3760h instanceof C4218s)) {
            AbstractC5861a.f("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", interfaceC3760h);
        } else {
            C4220u.c().e().u(((C4218s) interfaceC3760h).d().f(enumC3757e), 1);
        }
    }
}
