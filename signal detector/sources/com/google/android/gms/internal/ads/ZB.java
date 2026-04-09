package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class ZB extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final List f12796a;

    /* renamed from: b, reason: collision with root package name */
    public final NA f12797b;

    public ZB(List list, NA na) {
        list.getClass();
        this.f12796a = list;
        this.f12797b = na;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f12797b.apply(this.f12796a.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f12796a.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new YB(this, this.f12796a.listIterator(i), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.f12797b.apply(this.f12796a.remove(i));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i3) {
        this.f12796a.subList(i, i3).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12796a.size();
    }
}
