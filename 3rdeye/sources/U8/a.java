package U8;

import T1.B;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CancellableDisposable.java */
/* loaded from: classes3.dex */
public final class a extends AtomicReference<T8.a> implements R8.a {
    @Override // R8.a
    public final void dispose() {
        T8.a andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Exception e4) {
            B.A(e4);
            Z8.a.a(e4);
        }
    }
}
