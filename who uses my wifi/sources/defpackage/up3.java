package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class up3 extends ou1 {
    public static final AtomicReferenceFieldUpdater w = AtomicReferenceFieldUpdater.newUpdater(wp3.class, Set.class, "m");
    public static final AtomicIntegerFieldUpdater x = AtomicIntegerFieldUpdater.newUpdater(wp3.class, "n");

    @Override // defpackage.ou1
    public final void I(tp3 tp3Var, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = w;
            if (atomicReferenceFieldUpdater.compareAndSet(tp3Var, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(tp3Var) == null);
    }

    @Override // defpackage.ou1
    public final int N(tp3 tp3Var) {
        return x.decrementAndGet(tp3Var);
    }
}
