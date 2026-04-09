package com.yandex.mobile.ads.impl;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
class kq<E> extends AbstractCollection<E> {

    /* renamed from: b, reason: collision with root package name */
    final Collection<E> f29753b;

    /* renamed from: c, reason: collision with root package name */
    final qj1<? super E> f29754c;

    public kq(Collection<E> collection, qj1<? super E> qj1Var) {
        this.f29753b = collection;
        this.f29754c = qj1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e4) {
        if (this.f29754c.apply(e4)) {
            return this.f29753b.add(e4);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f29754c.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f29753b.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        wp0.a(this.f29753b, this.f29754c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Collection<E> collection = this.f29753b;
        collection.getClass();
        try {
            if (collection.contains(obj)) {
                return this.f29754c.apply(obj);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Collection<E> collection = this.f29753b;
        qj1<? super E> qj1Var = this.f29754c;
        Iterator<T> it = collection.iterator();
        if (qj1Var == null) {
            throw new NullPointerException("predicate");
        }
        boolean z10 = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!qj1Var.apply((Object) it.next())) {
                i++;
            } else if (i != -1) {
                z10 = true;
            }
        }
        return !z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it = this.f29753b.iterator();
        qj1<? super E> qj1Var = this.f29754c;
        it.getClass();
        qj1Var.getClass();
        return new xp0(it, qj1Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.f29753b.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<E> it = this.f29753b.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.f29754c.apply(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        Iterator<E> it = this.f29753b.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.f29754c.apply(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator<E> it = this.f29753b.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f29754c.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator<E> it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC4110g abstractC4110g = (AbstractC4110g) it;
            if (!abstractC4110g.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(abstractC4110g.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Iterator<E> it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC4110g abstractC4110g = (AbstractC4110g) it;
            if (abstractC4110g.hasNext()) {
                arrayList.add(abstractC4110g.next());
            } else {
                return (T[]) arrayList.toArray(tArr);
            }
        }
    }
}
