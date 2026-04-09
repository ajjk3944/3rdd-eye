package Ii;

import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Ii.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3090y extends D0 implements InterfaceC3088x {
    public C3090y(InterfaceC3091y0 interfaceC3091y0) {
        super(true);
        g0(interfaceC3091y0);
    }

    @Override // Ii.InterfaceC3088x
    public boolean S(Object obj) {
        return m0(obj);
    }

    @Override // Ii.D0
    public boolean V() {
        return true;
    }

    @Override // Ii.InterfaceC3088x
    public boolean a(Throwable th2) {
        return m0(new C(th2, false, 2, null));
    }

    @Override // Ii.V
    public Object await(InterfaceC5380e interfaceC5380e) throws Throwable {
        Object objX = x(interfaceC5380e);
        AbstractC5467b.g();
        return objX;
    }

    @Override // Ii.V
    public Object getCompleted() {
        return O();
    }

    @Override // Ii.V
    public Si.c getOnAwait() {
        Si.c cVarU = U();
        AbstractC6492s.g(cVarU, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>");
        return cVarU;
    }
}
