package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class h0 extends uk2 {
    public final AtomicReferenceFieldUpdater p;
    public final AtomicReferenceFieldUpdater q;
    public final AtomicReferenceFieldUpdater r;
    public final AtomicReferenceFieldUpdater s;
    public final AtomicReferenceFieldUpdater t;

    public h0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.p = atomicReferenceFieldUpdater;
        this.q = atomicReferenceFieldUpdater2;
        this.r = atomicReferenceFieldUpdater3;
        this.s = atomicReferenceFieldUpdater4;
        this.t = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.uk2
    public final boolean e(k0 k0Var, g0 g0Var, g0 g0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.s;
            if (atomicReferenceFieldUpdater.compareAndSet(k0Var, g0Var, g0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(k0Var) == g0Var);
        return false;
    }

    @Override // defpackage.uk2
    public final boolean f(k0 k0Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.t;
            if (atomicReferenceFieldUpdater.compareAndSet(k0Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(k0Var) == obj);
        return false;
    }

    @Override // defpackage.uk2
    public final boolean g(k0 k0Var, j0 j0Var, j0 j0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.r;
            if (atomicReferenceFieldUpdater.compareAndSet(k0Var, j0Var, j0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(k0Var) == j0Var);
        return false;
    }

    @Override // defpackage.uk2
    public final void t(j0 j0Var, j0 j0Var2) {
        this.q.lazySet(j0Var, j0Var2);
    }

    @Override // defpackage.uk2
    public final void u(j0 j0Var, Thread thread) {
        this.p.lazySet(j0Var, thread);
    }
}
