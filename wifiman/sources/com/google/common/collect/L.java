package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import m4.AbstractC6769h;

/* loaded from: classes3.dex */
final class L extends AbstractC5073t {

    /* renamed from: f, reason: collision with root package name */
    static final L f38345f = new L(AbstractC5069o.T(), G.d());

    /* renamed from: e, reason: collision with root package name */
    final transient AbstractC5069o f38346e;

    L(AbstractC5069o abstractC5069o, Comparator comparator) {
        super(comparator);
        this.f38346e = abstractC5069o;
    }

    private int p1(Object obj) {
        return Collections.binarySearch(this.f38346e, obj, q1());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: T */
    public S iterator() {
        return this.f38346e.iterator();
    }

    @Override // com.google.common.collect.AbstractC5073t
    AbstractC5073t X0() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f38414c);
        return isEmpty() ? AbstractC5073t.Z0(comparatorReverseOrder) : new L(this.f38346e.N0(), comparatorReverseOrder);
    }

    @Override // com.google.common.collect.AbstractC5073t
    AbstractC5073t c1(Object obj, boolean z10) {
        return m1(0, n1(obj, z10));
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        int iO1 = o1(obj, true);
        if (iO1 == size()) {
            return null;
        }
        return this.f38346e.get(iO1);
    }

    @Override // com.google.common.collect.AbstractC5068n, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return p1(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        if (collection instanceof C) {
            collection = ((C) collection).K();
        }
        if (!P.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        S it = iterator();
        Iterator it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = it.next();
        while (true) {
            try {
                int iJ1 = j1(next2, next);
                if (iJ1 < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iJ1 == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iJ1 > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.common.collect.r, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!P.b(this.f38414c, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            S it2 = iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                Object next2 = it.next();
                if (next2 == null || j1(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.common.collect.AbstractC5073t
    AbstractC5073t f1(Object obj, boolean z10, Object obj2, boolean z11) {
        return i1(obj, z10).c1(obj2, z11);
    }

    @Override // java.util.SortedSet
    public Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f38346e.get(0);
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        int iN1 = n1(obj, true) - 1;
        if (iN1 == -1) {
            return null;
        }
        return this.f38346e.get(iN1);
    }

    @Override // com.google.common.collect.AbstractC5068n
    int g(Object[] objArr, int i10) {
        return this.f38346e.g(objArr, i10);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        int iO1 = o1(obj, false);
        if (iO1 == size()) {
            return null;
        }
        return this.f38346e.get(iO1);
    }

    @Override // com.google.common.collect.AbstractC5073t
    AbstractC5073t i1(Object obj, boolean z10) {
        return m1(o1(obj, z10), size());
    }

    @Override // com.google.common.collect.AbstractC5068n
    Object[] j() {
        return this.f38346e.j();
    }

    @Override // java.util.NavigableSet
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public S descendingIterator() {
        return this.f38346e.N0().iterator();
    }

    @Override // java.util.SortedSet
    public Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f38346e.get(size() - 1);
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        int iN1 = n1(obj, false) - 1;
        if (iN1 == -1) {
            return null;
        }
        return this.f38346e.get(iN1);
    }

    @Override // com.google.common.collect.AbstractC5068n
    int m() {
        return this.f38346e.m();
    }

    L m1(int i10, int i11) {
        return (i10 == 0 && i11 == size()) ? this : i10 < i11 ? new L(this.f38346e.subList(i10, i11), this.f38414c) : AbstractC5073t.Z0(this.f38414c);
    }

    int n1(Object obj, boolean z10) {
        int iBinarySearch = Collections.binarySearch(this.f38346e, AbstractC6769h.i(obj), comparator());
        return iBinarySearch >= 0 ? z10 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    @Override // com.google.common.collect.AbstractC5068n
    int o() {
        return this.f38346e.o();
    }

    int o1(Object obj, boolean z10) {
        int iBinarySearch = Collections.binarySearch(this.f38346e, AbstractC6769h.i(obj), comparator());
        return iBinarySearch >= 0 ? z10 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    Comparator q1() {
        return this.f38414c;
    }

    @Override // com.google.common.collect.AbstractC5068n
    boolean s() {
        return this.f38346e.s();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f38346e.size();
    }
}
