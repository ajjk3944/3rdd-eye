package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class ZC extends AbstractC0582Jp {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f12798b = AtomicReferenceFieldUpdater.newUpdater(C1143fD.class, Thread.class, "a");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f12799c = AtomicReferenceFieldUpdater.newUpdater(C1143fD.class, C1143fD.class, "b");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f12800d = AtomicReferenceFieldUpdater.newUpdater(AbstractC1198gD.class, C1143fD.class, "c");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f12801e = AtomicReferenceFieldUpdater.newUpdater(AbstractC1198gD.class, VC.class, "b");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f12802f = AtomicReferenceFieldUpdater.newUpdater(AbstractC1198gD.class, Object.class, "a");

    @Override // com.google.android.gms.internal.ads.AbstractC0582Jp
    public final boolean M(AbstractC1198gD abstractC1198gD, C1143fD c1143fD, C1143fD c1143fD2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f12800d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1198gD, c1143fD, c1143fD2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1198gD) == c1143fD);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0582Jp
    public final boolean S(YC yc, VC vc, VC vc2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f12801e;
            if (atomicReferenceFieldUpdater.compareAndSet(yc, vc, vc2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(yc) == vc);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0582Jp
    public final C1143fD U(YC yc) {
        return (C1143fD) f12800d.getAndSet(yc, C1143fD.f14042c);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0582Jp
    public final VC a0(YC yc) {
        return (VC) f12801e.getAndSet(yc, VC.f11966d);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0582Jp
    public final boolean e0(AbstractC1198gD abstractC1198gD, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f12802f;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1198gD, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1198gD) == obj);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0582Jp
    public final void k(C1143fD c1143fD, Thread thread) {
        f12798b.lazySet(c1143fD, thread);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0582Jp
    public final void w(C1143fD c1143fD, C1143fD c1143fD2) {
        f12799c.lazySet(c1143fD, c1143fD2);
    }
}
