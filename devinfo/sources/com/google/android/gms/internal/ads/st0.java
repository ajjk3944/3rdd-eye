package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class st0 extends al0 implements Queue, Collection {

    /* renamed from: c, reason: collision with root package name */
    public final LinkedList f16546c;

    public st0() {
        super(7);
        this.f16546c = new LinkedList();
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        ot0 ot0Var = (ot0) obj;
        int i4 = ot0Var.f14793f;
        LinkedList linkedList = this.f16546c;
        if (i4 != 3) {
            linkedList.add(ot0Var);
            return true;
        }
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            ot0 ot0Var2 = (ot0) listIterator.next();
            if (ot0Var2.f14793f == 3) {
                double d10 = ot0Var2.f14792e;
                double d11 = ot0Var.f14792e;
                if (d10 < d11 || (d10 == d11 && ot0Var2.a() > ot0Var.a())) {
                    listIterator.set(ot0Var);
                    ot0Var = ot0Var2;
                }
            }
        }
        linkedList.add(ot0Var);
        return true;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.f16546c.addAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f16546c.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f16546c.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f16546c.containsAll(collection);
    }

    @Override // java.util.Queue
    public final Object element() {
        return this.f16546c.element();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f16546c.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f16546c.iterator();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        return this.f16546c.offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return this.f16546c.peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return this.f16546c.poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return this.f16546c.remove();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f16546c.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f16546c.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f16546c.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.f16546c.toArray();
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final /* synthetic */ Object v() {
        return this.f16546c;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f16546c.remove(obj);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f16546c.toArray(objArr);
    }
}
