package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k3 extends u6.t {
    public final AtomicReferenceFieldUpdater j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f20177k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f20178l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f20179m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f20180n;

    public k3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.j = atomicReferenceFieldUpdater;
        this.f20177k = atomicReferenceFieldUpdater2;
        this.f20178l = atomicReferenceFieldUpdater3;
        this.f20179m = atomicReferenceFieldUpdater4;
        this.f20180n = atomicReferenceFieldUpdater5;
    }

    @Override // u6.t
    public final boolean A(y3 y3Var, Object obj, Object obj2) {
        return cm.g.S(this.f20180n, y3Var, obj, obj2);
    }

    @Override // u6.t
    public final boolean C(y3 y3Var, x3 x3Var, x3 x3Var2) {
        return cm.g.S(this.f20178l, y3Var, x3Var, x3Var2);
    }

    @Override // u6.t
    public final void u(x3 x3Var, x3 x3Var2) {
        this.f20177k.lazySet(x3Var, x3Var2);
    }

    @Override // u6.t
    public final void w(x3 x3Var, Thread thread) {
        this.j.lazySet(x3Var, thread);
    }

    @Override // u6.t
    public final boolean y(y3 y3Var, n2 n2Var, n2 n2Var2) {
        return cm.g.S(this.f20179m, y3Var, n2Var, n2Var2);
    }
}
