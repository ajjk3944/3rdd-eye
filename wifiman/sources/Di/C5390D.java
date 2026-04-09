package di;

import Bh.AbstractC2514y;
import Bh.G;
import Bh.InterfaceC2495e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.builtins.o;
import pi.AbstractC7346d0;
import pi.S;

/* renamed from: di.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5390D extends AbstractC5391E {
    public C5390D(short s10) {
        super(Short.valueOf(s10));
    }

    @Override // di.AbstractC5398g
    public S a(G module) {
        AbstractC7346d0 abstractC7346d0U;
        AbstractC6492s.i(module, "module");
        InterfaceC2495e interfaceC2495eB = AbstractC2514y.b(module, o.a.f51812E0);
        return (interfaceC2495eB == null || (abstractC7346d0U = interfaceC2495eB.u()) == null) ? kotlin.reflect.jvm.internal.impl.types.error.l.d(kotlin.reflect.jvm.internal.impl.types.error.k.NOT_FOUND_UNSIGNED_TYPE, "UShort") : abstractC7346d0U;
    }

    @Override // di.AbstractC5398g
    public String toString() {
        return ((Number) b()).intValue() + ".toUShort()";
    }
}
