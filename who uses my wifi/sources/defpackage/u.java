package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class u extends bd2 {
    public final AtomicReferenceFieldUpdater q;
    public final AtomicReferenceFieldUpdater r;
    public final AtomicReferenceFieldUpdater s;
    public final AtomicReferenceFieldUpdater t;
    public final AtomicReferenceFieldUpdater u;

    public u(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.q = atomicReferenceFieldUpdater;
        this.r = atomicReferenceFieldUpdater2;
        this.s = atomicReferenceFieldUpdater3;
        this.t = atomicReferenceFieldUpdater4;
        this.u = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.bd2
    public final boolean c(y yVar, t tVar, t tVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.t;
            if (atomicReferenceFieldUpdater.compareAndSet(yVar, tVar, tVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(yVar) == tVar);
        return false;
    }

    @Override // defpackage.bd2
    public final boolean e(y yVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.u;
            if (atomicReferenceFieldUpdater.compareAndSet(yVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(yVar) == obj);
        return false;
    }

    @Override // defpackage.bd2
    public final boolean f(y yVar, x xVar, x xVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.s;
            if (atomicReferenceFieldUpdater.compareAndSet(yVar, xVar, xVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(yVar) == xVar);
        return false;
    }

    @Override // defpackage.bd2
    public final void o(x xVar, x xVar2) {
        this.r.lazySet(xVar, xVar2);
    }

    @Override // defpackage.bd2
    public final void p(x xVar, Thread thread) {
        this.q.lazySet(xVar, thread);
    }
}
