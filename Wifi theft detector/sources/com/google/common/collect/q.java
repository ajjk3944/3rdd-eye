package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class q extends v implements Collection {
    public boolean add(Object obj) {
        return x().add(obj);
    }

    public boolean addAll(Collection collection) {
        return x().addAll(collection);
    }

    public void clear() {
        x().clear();
    }

    public boolean contains(Object obj) {
        return x().contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return x().containsAll(collection);
    }

    /* renamed from: h */
    public abstract Collection x();

    public boolean i(Collection collection) {
        return Iterators.a(this, collection.iterator());
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return x().isEmpty();
    }

    public Iterator iterator() {
        return x().iterator();
    }

    public boolean j(Collection collection) {
        return k.a(this, collection);
    }

    public boolean remove(Object obj) {
        return x().remove(obj);
    }

    public boolean removeAll(Collection collection) {
        return x().removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        return x().retainAll(collection);
    }

    public boolean s(Collection collection) {
        return Iterators.l(iterator(), collection);
    }

    @Override // java.util.Collection
    public int size() {
        return x().size();
    }

    public Object[] toArray() {
        return x().toArray();
    }

    public Object[] u() {
        return toArray(new Object[size()]);
    }

    public Object[] v(Object[] objArr) {
        return g0.g(this, objArr);
    }

    public String w() {
        return k.e(this);
    }

    public Object[] toArray(Object[] objArr) {
        return x().toArray(objArr);
    }
}
