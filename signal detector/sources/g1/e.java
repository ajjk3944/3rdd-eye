package g1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class e extends com.bumptech.glide.c {

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f20150e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f20151f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f20152g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f20153h;
    public final AtomicReferenceFieldUpdater i;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f20150e = atomicReferenceFieldUpdater;
        this.f20151f = atomicReferenceFieldUpdater2;
        this.f20152g = atomicReferenceFieldUpdater3;
        this.f20153h = atomicReferenceFieldUpdater4;
        this.i = atomicReferenceFieldUpdater5;
    }

    @Override // com.bumptech.glide.c
    public final void H(h hVar, h hVar2) {
        this.f20151f.lazySet(hVar, hVar2);
    }

    @Override // com.bumptech.glide.c
    public final void I(h hVar, Thread thread) {
        this.f20150e.lazySet(hVar, thread);
    }

    @Override // com.bumptech.glide.c
    public final boolean d(i iVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f20153h;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == dVar);
        return false;
    }

    @Override // com.bumptech.glide.c
    public final boolean e(i iVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.i;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == obj);
        return false;
    }

    @Override // com.bumptech.glide.c
    public final boolean f(i iVar, h hVar, h hVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f20152g;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, hVar, hVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == hVar);
        return false;
    }
}
