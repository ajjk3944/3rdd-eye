package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hp3 extends ob1 {
    public static final AtomicReferenceFieldUpdater q = AtomicReferenceFieldUpdater.newUpdater(np3.class, Thread.class, "a");
    public static final AtomicReferenceFieldUpdater r = AtomicReferenceFieldUpdater.newUpdater(np3.class, np3.class, "b");
    public static final AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(op3.class, np3.class, "h");
    public static final AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(op3.class, dp3.class, "g");
    public static final AtomicReferenceFieldUpdater u = AtomicReferenceFieldUpdater.newUpdater(op3.class, Object.class, "f");

    @Override // defpackage.ob1
    public final void A(np3 np3Var, np3 np3Var2) {
        r.lazySet(np3Var, np3Var2);
    }

    @Override // defpackage.ob1
    public final boolean E(op3 op3Var, np3 np3Var, np3 np3Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = s;
            if (atomicReferenceFieldUpdater.compareAndSet(op3Var, np3Var, np3Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(op3Var) == np3Var);
        return false;
    }

    @Override // defpackage.ob1
    public final boolean G(gp3 gp3Var, dp3 dp3Var, dp3 dp3Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = t;
            if (atomicReferenceFieldUpdater.compareAndSet(gp3Var, dp3Var, dp3Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gp3Var) == dp3Var);
        return false;
    }

    @Override // defpackage.ob1
    public final np3 H(gp3 gp3Var) {
        return (np3) s.getAndSet(gp3Var, np3.c);
    }

    @Override // defpackage.ob1
    public final dp3 K(gp3 gp3Var) {
        return (dp3) t.getAndSet(gp3Var, dp3.d);
    }

    @Override // defpackage.ob1
    public final boolean L(op3 op3Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = u;
            if (atomicReferenceFieldUpdater.compareAndSet(op3Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(op3Var) == obj);
        return false;
    }

    @Override // defpackage.ob1
    public final void x(np3 np3Var, Thread thread) {
        q.lazySet(np3Var, thread);
    }
}
