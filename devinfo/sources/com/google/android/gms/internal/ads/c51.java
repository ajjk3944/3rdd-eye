package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c51 extends t41 {

    /* renamed from: b, reason: collision with root package name */
    public final transient g51 f9981b;

    public c51(g51 g51Var) {
        this.f9981b = g51Var;
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final h61 a() {
        return new b51(this.f9981b);
    }

    @Override // com.google.android.gms.internal.ads.t41, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f9981b.c(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new b51(this.f9981b);
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final int j(Object[] objArr, int i4) {
        v41 v41VarListIterator = ((x41) this.f9981b.f11381d.values()).listIterator(0);
        while (v41VarListIterator.hasNext()) {
            i4 = ((t41) v41VarListIterator.next()).j(objArr, i4);
        }
        return i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f9981b.f11382e;
    }
}
