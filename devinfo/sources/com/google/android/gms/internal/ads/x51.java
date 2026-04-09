package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class x51 extends e51 {

    /* renamed from: d, reason: collision with root package name */
    public final transient z41 f18310d;

    /* renamed from: e, reason: collision with root package name */
    public final transient y51 f18311e;

    public x51(z41 z41Var, y51 y51Var) {
        this.f18310d = z41Var;
        this.f18311e = y51Var;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final h61 a() {
        return this.f18311e.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.t41, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f18310d.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.e51, com.google.android.gms.internal.ads.t41
    public final x41 g() {
        return this.f18311e;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f18311e.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final int j(Object[] objArr, int i4) {
        return this.f18311e.j(objArr, i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((z51) this.f18310d).f19024f;
    }
}
