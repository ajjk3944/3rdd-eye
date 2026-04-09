package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m51 extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final List f13767a;

    /* renamed from: b, reason: collision with root package name */
    public final z21 f13768b;

    public m51(List list, z21 z21Var) {
        list.getClass();
        this.f13767a = list;
        this.f13768b = z21Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        return this.f13768b.apply(this.f13767a.get(i4));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f13767a.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        return new l51(this, this.f13767a.listIterator(i4), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        return this.f13768b.apply(this.f13767a.remove(i4));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i10) {
        this.f13767a.subList(i4, i10).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13767a.size();
    }
}
