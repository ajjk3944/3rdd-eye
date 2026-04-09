package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.google.android.gms.internal.ads.mD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1520mD extends Cr {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f15600c = AtomicReferenceFieldUpdater.newUpdater(AbstractC1628oD.class, Set.class, "h");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f15601d = AtomicIntegerFieldUpdater.newUpdater(AbstractC1628oD.class, "i");

    @Override // com.google.android.gms.internal.ads.Cr
    public final void k(AbstractC1466lD abstractC1466lD, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f15600c;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1466lD, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1466lD) == null);
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final int p(AbstractC1466lD abstractC1466lD) {
        return f15601d.decrementAndGet(abstractC1466lD);
    }
}
