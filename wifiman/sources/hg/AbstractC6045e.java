package hg;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: hg.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC6045e extends AtomicReference implements InterfaceC6043c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractC6045e(Object obj) {
        super(obj);
        Objects.requireNonNull(obj, "value is null");
    }

    protected abstract void a(Object obj);

    @Override // hg.InterfaceC6043c
    public final void dispose() {
        Object andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        a(andSet);
    }

    @Override // hg.InterfaceC6043c
    public final boolean isDisposed() {
        return get() == null;
    }
}
