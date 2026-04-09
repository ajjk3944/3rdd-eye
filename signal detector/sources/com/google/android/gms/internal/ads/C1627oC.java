package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.oC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1627oC extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f15915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f15916b;

    public C1627oC(Set set, Set set2) {
        this.f15915a = set;
        this.f15916b = set2;
    }

    public final int a() {
        Set set = this.f15915a;
        int iA = set instanceof C1627oC ? ((C1627oC) set).a() : set.size();
        Set set2 = this.f15916b;
        return Math.min(iA, set2 instanceof C1627oC ? ((C1627oC) set2).a() : set2.size());
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
        return this.f15915a.contains(obj) && this.f15916b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f15915a.containsAll(collection) && this.f15916b.containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        int size;
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                boolean z6 = set instanceof C1627oC;
                int iA = z6 ? ((C1627oC) set).a() : set.size();
                if (iA >= 0) {
                    if (z6) {
                        ((C1627oC) set).getClass();
                        size = 0;
                    } else {
                        size = set.size();
                    }
                    if (a() >= size) {
                        UB ub = new UB(this, this.f15915a, this.f15916b);
                        int i = 0;
                        while (true) {
                            if (ub.hasNext()) {
                                try {
                                    if (!set.contains(ub.next())) {
                                        break;
                                    }
                                    i++;
                                } catch (ClassCastException | NullPointerException unused) {
                                }
                            } else if (i != iA) {
                                if (i >= size) {
                                    Iterator it = set.iterator();
                                    int i3 = 0;
                                    while (it.hasNext()) {
                                        it.next();
                                        i3++;
                                        if (i3 > i) {
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
        return Collections.disjoint(this.f15916b, this.f15915a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new UB(this, this.f15915a, this.f15916b);
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
        Iterator it = this.f15915a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f15916b.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
