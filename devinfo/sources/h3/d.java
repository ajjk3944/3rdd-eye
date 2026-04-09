package h3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d extends ii.a {

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24820c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24821d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24822e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f24823f;
    public final AtomicReferenceFieldUpdater g;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(6);
        this.f24820c = atomicReferenceFieldUpdater;
        this.f24821d = atomicReferenceFieldUpdater2;
        this.f24822e = atomicReferenceFieldUpdater3;
        this.f24823f = atomicReferenceFieldUpdater4;
        this.g = atomicReferenceFieldUpdater5;
    }

    @Override // ii.a
    public final boolean d(g gVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f24823f;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // ii.a
    public final boolean e(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.g;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // ii.a
    public final boolean f(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f24822e;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // ii.a
    public final void u(f fVar, f fVar2) {
        this.f24821d.lazySet(fVar, fVar2);
    }

    @Override // ii.a
    public final void v(f fVar, Thread thread) {
        this.f24820c.lazySet(fVar, thread);
    }
}
