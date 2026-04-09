package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n51 extends AbstractSequentialList implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final List f14160a;

    /* renamed from: b, reason: collision with root package name */
    public final z21 f14161b;

    public n51(List list, z21 z21Var) {
        list.getClass();
        this.f14160a = list;
        this.f14161b = z21Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f14160a.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        return new l51(this, this.f14160a.listIterator(i4), 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i10) {
        this.f14160a.subList(i4, i10).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14160a.size();
    }
}
