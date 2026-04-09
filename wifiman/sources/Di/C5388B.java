package di;

import Bh.AbstractC2514y;
import Bh.G;
import Bh.InterfaceC2495e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.builtins.o;
import pi.AbstractC7346d0;
import pi.S;

/* renamed from: di.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5388B extends AbstractC5391E {
    public C5388B(int i10) {
        super(Integer.valueOf(i10));
    }

    @Override // di.AbstractC5398g
    public S a(G module) {
        AbstractC7346d0 abstractC7346d0U;
        AbstractC6492s.i(module, "module");
        InterfaceC2495e interfaceC2495eB = AbstractC2514y.b(module, o.a.f51814F0);
        return (interfaceC2495eB == null || (abstractC7346d0U = interfaceC2495eB.u()) == null) ? kotlin.reflect.jvm.internal.impl.types.error.l.d(kotlin.reflect.jvm.internal.impl.types.error.k.NOT_FOUND_UNSIGNED_TYPE, "UInt") : abstractC7346d0U;
    }

    @Override // di.AbstractC5398g
    public String toString() {
        return ((Number) b()).intValue() + ".toUInt()";
    }
}
