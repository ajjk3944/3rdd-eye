package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g0 extends pk.a {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20127e = AtomicReferenceFieldUpdater.newUpdater(j0.class, Thread.class, "a");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20128f = AtomicReferenceFieldUpdater.newUpdater(j0.class, j0.class, "b");
    public static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(k0.class, j0.class, "c");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20129h = AtomicReferenceFieldUpdater.newUpdater(k0.class, e0.class, "b");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20130i = AtomicReferenceFieldUpdater.newUpdater(k0.class, Object.class, "a");

    @Override // pk.a
    public final e0 B(t0 t0Var) {
        return (e0) f20129h.getAndSet(t0Var, e0.f20102d);
    }

    @Override // pk.a
    public final j0 D(t0 t0Var) {
        return (j0) g.getAndSet(t0Var, j0.f20156c);
    }

    @Override // pk.a
    public final void G(j0 j0Var, j0 j0Var2) {
        f20128f.lazySet(j0Var, j0Var2);
    }

    @Override // pk.a
    public final void I(j0 j0Var, Thread thread) {
        f20127e.lazySet(j0Var, thread);
    }

    @Override // pk.a
    public final boolean K(t0 t0Var, e0 e0Var, e0 e0Var2) {
        return t6.i0.z(f20129h, t0Var, e0Var, e0Var2);
    }

    @Override // pk.a
    public final boolean M(k0 k0Var, Object obj, Object obj2) {
        return t6.i0.z(f20130i, k0Var, obj, obj2);
    }

    @Override // pk.a
    public final boolean N(k0 k0Var, j0 j0Var, j0 j0Var2) {
        return t6.i0.z(g, k0Var, j0Var, j0Var2);
    }
}
