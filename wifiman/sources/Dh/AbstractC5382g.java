package dh;

import Yg.J;
import Yg.u;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;

/* renamed from: dh.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5382g {
    public static final InterfaceC5380e a(InterfaceC6839p interfaceC6839p, Object obj, InterfaceC5380e completion) {
        AbstractC6492s.i(interfaceC6839p, "<this>");
        AbstractC6492s.i(completion, "completion");
        return new C5386k(AbstractC5467b.d(AbstractC5467b.b(interfaceC6839p, obj, completion)), AbstractC5467b.g());
    }

    public static final void b(InterfaceC6839p interfaceC6839p, Object obj, InterfaceC5380e completion) {
        AbstractC6492s.i(interfaceC6839p, "<this>");
        AbstractC6492s.i(completion, "completion");
        InterfaceC5380e interfaceC5380eD = AbstractC5467b.d(AbstractC5467b.b(interfaceC6839p, obj, completion));
        u.a aVar = u.f25017b;
        interfaceC5380eD.resumeWith(u.c(J.f24997a));
    }
}
