package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n71 extends mq0 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14168a = AtomicReferenceFieldUpdater.newUpdater(t71.class, Thread.class, "a");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14169b = AtomicReferenceFieldUpdater.newUpdater(t71.class, t71.class, "b");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14170c = AtomicReferenceFieldUpdater.newUpdater(u71.class, t71.class, "c");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14171d = AtomicReferenceFieldUpdater.newUpdater(u71.class, j71.class, "b");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14172e = AtomicReferenceFieldUpdater.newUpdater(u71.class, Object.class, "a");

    @Override // com.google.android.gms.internal.ads.mq0
    public final boolean L(u71 u71Var, t71 t71Var, t71 t71Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f14170c;
            if (atomicReferenceFieldUpdater.compareAndSet(u71Var, t71Var, t71Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(u71Var) == t71Var);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.mq0
    public final boolean R(m71 m71Var, j71 j71Var, j71 j71Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f14171d;
            if (atomicReferenceFieldUpdater.compareAndSet(m71Var, j71Var, j71Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(m71Var) == j71Var);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.mq0
    public final t71 T(m71 m71Var) {
        return (t71) f14170c.getAndSet(m71Var, t71.f16728c);
    }

    @Override // com.google.android.gms.internal.ads.mq0
    public final j71 Y(m71 m71Var) {
        return (j71) f14171d.getAndSet(m71Var, j71.f12670d);
    }

    @Override // com.google.android.gms.internal.ads.mq0
    public final boolean b0(u71 u71Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f14172e;
            if (atomicReferenceFieldUpdater.compareAndSet(u71Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(u71Var) == obj);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.mq0
    public final void k(t71 t71Var, Thread thread) {
        f14168a.lazySet(t71Var, thread);
    }

    @Override // com.google.android.gms.internal.ads.mq0
    public final void w(t71 t71Var, t71 t71Var2) {
        f14169b.lazySet(t71Var, t71Var2);
    }
}
