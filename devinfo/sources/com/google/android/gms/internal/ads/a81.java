package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a81 extends al0 {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9275c = AtomicReferenceFieldUpdater.newUpdater(c81.class, Set.class, "h");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f9276d = AtomicIntegerFieldUpdater.newUpdater(c81.class, "i");

    @Override // com.google.android.gms.internal.ads.al0
    public final void p(z71 z71Var, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f9275c;
            if (atomicReferenceFieldUpdater.compareAndSet(z71Var, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(z71Var) == null);
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final int t(z71 z71Var) {
        return f9276d.decrementAndGet(z71Var);
    }
}
