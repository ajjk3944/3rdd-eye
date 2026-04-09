package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

/* loaded from: classes.dex */
public final class Ov extends Cr implements Queue, Collection {

    /* renamed from: c, reason: collision with root package name */
    public final LinkedList f10274c;

    public Ov() {
        super(7);
        this.f10274c = new LinkedList();
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        Kv kv = (Kv) obj;
        int i = kv.f9584f;
        LinkedList linkedList = this.f10274c;
        if (i != 3) {
            linkedList.add(kv);
            return true;
        }
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            Kv kv2 = (Kv) listIterator.next();
            if (kv2.f9584f == 3) {
                double d6 = kv2.f9583e;
                double d7 = kv.f9583e;
                if (d6 < d7 || (d6 == d7 && kv2.a() > kv.a())) {
                    listIterator.set(kv);
                    kv = kv2;
                }
            }
        }
        linkedList.add(kv);
        return true;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f10274c.addAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f10274c.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f10274c.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f10274c.containsAll(collection);
    }

    @Override // java.util.Queue
    public final Object element() {
        return this.f10274c.element();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f10274c.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f10274c.iterator();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        return this.f10274c.offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return this.f10274c.peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return this.f10274c.poll();
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final /* synthetic */ Object r() {
        return this.f10274c;
    }

    @Override // java.util.Queue
    public final Object remove() {
        return this.f10274c.remove();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f10274c.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f10274c.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f10274c.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.f10274c.toArray();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f10274c.remove(obj);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f10274c.toArray(objArr);
    }
}
