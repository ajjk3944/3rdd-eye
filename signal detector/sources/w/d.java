package w;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends R2.a {

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f23910e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f23911f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f23912g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f23913h;
    public final AtomicReferenceFieldUpdater i;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f23910e = atomicReferenceFieldUpdater;
        this.f23911f = atomicReferenceFieldUpdater2;
        this.f23912g = atomicReferenceFieldUpdater3;
        this.f23913h = atomicReferenceFieldUpdater4;
        this.i = atomicReferenceFieldUpdater5;
    }

    @Override // R2.a
    public final boolean a(g gVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f23913h;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // R2.a
    public final boolean b(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.i;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // R2.a
    public final boolean c(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f23912g;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // R2.a
    public final void y(f fVar, f fVar2) {
        this.f23911f.lazySet(fVar, fVar2);
    }

    @Override // R2.a
    public final void z(f fVar, Thread thread) {
        this.f23910e.lazySet(fVar, thread);
    }
}
