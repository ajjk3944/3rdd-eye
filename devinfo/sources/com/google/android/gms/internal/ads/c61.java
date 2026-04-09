package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c61 extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f10006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f10007b;

    public c61(Set set, Set set2) {
        this.f10006a = set;
        this.f10007b = set2;
    }

    public final int a() {
        Set set = this.f10006a;
        int iA = set instanceof c61 ? ((c61) set).a() : set.size();
        Set set2 = this.f10007b;
        return Math.min(iA, set2 instanceof c61 ? ((c61) set2).a() : set2.size());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f10006a.contains(obj) && this.f10007b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f10006a.containsAll(collection) && this.f10007b.containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        int size;
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                boolean z3 = set instanceof c61;
                int iA = z3 ? ((c61) set).a() : set.size();
                if (iA >= 0) {
                    if (z3) {
                        size = 0;
                    } else {
                        size = set.size();
                    }
                    if (a() >= size) {
                        h51 h51Var = new h51(this, this.f10006a, this.f10007b);
                        int i4 = 0;
                        while (true) {
                            if (h51Var.hasNext()) {
                                try {
                                    if (!set.contains(h51Var.next())) {
                                        break;
                                    }
                                    i4++;
                                } catch (ClassCastException | NullPointerException unused) {
                                }
                            } else if (i4 != iA) {
                                if (i4 >= size) {
                                    Iterator it = set.iterator();
                                    int i10 = 0;
                                    while (it.hasNext()) {
                                        it.next();
                                        i10++;
                                        if (i10 > i4) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f10007b, this.f10006a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new h51(this, this.f10006a, this.f10007b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f10006a.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (this.f10007b.contains(it.next())) {
                i4++;
            }
        }
        return i4;
    }
}
