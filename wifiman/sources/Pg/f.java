package pg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import ig.AbstractC6152a;
import java.util.Objects;
import lg.EnumC6593c;

/* loaded from: classes4.dex */
public final class f extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final kg.q f57945a;

    public f(kg.q qVar) {
        this.f57945a = qVar;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        try {
            Object obj = this.f57945a.get();
            Objects.requireNonNull(obj, "The completableSupplier returned a null CompletableSource");
            ((gg.f) obj).e(interfaceC5914d);
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            EnumC6593c.error(th2, interfaceC5914d);
        }
    }
}
