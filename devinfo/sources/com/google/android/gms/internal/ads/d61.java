package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class d61 extends AbstractCollection implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final Set f10345a;

    /* renamed from: b, reason: collision with root package name */
    public final d31 f10346b;

    public d61(Set set, d31 d31Var) {
        this.f10345a = set;
        this.f10346b = d31Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        mq0.m(this.f10346b.c(obj));
        return this.f10345a.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            mq0.m(this.f10346b.c(it.next()));
        }
        return this.f10345a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f10345a;
        boolean z3 = set instanceof RandomAccess;
        d31 d31Var = this.f10346b;
        if (!z3 || !(set instanceof List)) {
            Iterator it = set.iterator();
            d31Var.getClass();
            while (it.hasNext()) {
                if (d31Var.c(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        d31Var.getClass();
        int i4 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj = list.get(i10);
            if (!d31Var.c(obj)) {
                if (i10 > i4) {
                    try {
                        list.set(i4, obj);
                    } catch (IllegalArgumentException unused) {
                        yr1.D(list, d31Var, i4, i10);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        yr1.D(list, d31Var, i4, i10);
                        return;
                    }
                }
                i4++;
            }
        }
        list.subList(i4, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.f10345a;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f10346b.c(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return yr1.E(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return yr1.y(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f10345a.iterator();
        d31 d31Var = this.f10346b;
        mq0.e0(d31Var, "predicate");
        int i4 = 0;
        while (it.hasNext()) {
            if (d31Var.c(it.next())) {
                return i4 == -1;
            }
            i4++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f10345a.iterator();
        it.getClass();
        d31 d31Var = this.f10346b;
        d31Var.getClass();
        return new h51(it, d31Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f10345a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f10345a.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f10346b.c(next) && collection.contains(next)) {
                it.remove();
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f10345a.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f10346b.c(next) && !collection.contains(next)) {
                it.remove();
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f10345a.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (this.f10346b.c(it.next())) {
                i4++;
            }
        }
        return i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return mq0.i((h61) iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return mq0.i((h61) iterator()).toArray(objArr);
    }
}
