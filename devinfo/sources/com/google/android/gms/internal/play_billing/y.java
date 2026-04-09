package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y extends t {

    /* renamed from: c, reason: collision with root package name */
    public final transient a0 f20261c;

    /* renamed from: d, reason: collision with root package name */
    public final transient z f20262d;

    public y(a0 a0Var, z zVar) {
        this.f20261c = a0Var;
        this.f20262d = zVar;
    }

    @Override // com.google.android.gms.internal.play_billing.n
    public final int a(Object[] objArr) {
        return this.f20262d.a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f20261c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.t, com.google.android.gms.internal.play_billing.n
    public final q f() {
        return this.f20262d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f20262d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20261c.g;
    }
}
