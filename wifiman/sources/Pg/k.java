package pg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import lg.EnumC6593c;

/* loaded from: classes4.dex */
public final class k extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final Throwable f57969a;

    public k(Throwable th2) {
        this.f57969a = th2;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        EnumC6593c.error(this.f57969a, interfaceC5914d);
    }
}
