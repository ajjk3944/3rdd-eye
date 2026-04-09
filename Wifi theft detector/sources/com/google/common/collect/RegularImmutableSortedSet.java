package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
final class RegularImmutableSortedSet<E> extends ImmutableSortedSet<E> {

    /* renamed from: f, reason: collision with root package name */
    public static final RegularImmutableSortedSet f11965f = new RegularImmutableSortedSet(ImmutableList.A(), j0.d());

    /* renamed from: e, reason: collision with root package name */
    public final transient ImmutableList f11966e;

    public RegularImmutableSortedSet(ImmutableList immutableList, Comparator comparator) {
        super(comparator);
        this.f11966e = immutableList;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet K() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f11843c);
        return isEmpty() ? ImmutableSortedSet.N(comparatorReverseOrder) : new RegularImmutableSortedSet(this.f11966e.C(), comparatorReverseOrder);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    /* renamed from: L */
    public v0 descendingIterator() {
        return this.f11966e.C().iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet Q(Object obj, boolean z10) {
        return Z(0, a0(obj, z10));
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet T(Object obj, boolean z10, Object obj2, boolean z11) {
        return W(obj, z10).Q(obj2, z11);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet W(Object obj, boolean z10) {
        return Z(b0(obj, z10), size());
    }

    public RegularImmutableSortedSet Z(int i10, int i11) {
        return (i10 == 0 && i11 == size()) ? this : i10 < i11 ? new RegularImmutableSortedSet(this.f11966e.subList(i10, i11), this.f11843c) : ImmutableSortedSet.N(this.f11843c);
    }

    public int a0(Object obj, boolean z10) {
        int iBinarySearch = Collections.binarySearch(this.f11966e, com.google.common.base.g.m(obj), comparator());
        return iBinarySearch >= 0 ? z10 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int b(Object[] objArr, int i10) {
        return this.f11966e.b(objArr, i10);
    }

    public int b0(Object obj, boolean z10) {
        int iBinarySearch = Collections.binarySearch(this.f11966e, com.google.common.base.g.m(obj), comparator());
        return iBinarySearch >= 0 ? z10 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    public final int c0(Object obj) {
        return Collections.binarySearch(this.f11966e, obj, d0());
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public Object ceiling(Object obj) {
        int iB0 = b0(obj, true);
        if (iB0 == size()) {
            return null;
        }
        return this.f11966e.get(iB0);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (c0(obj) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        if (collection instanceof e0) {
            collection = ((e0) collection).k();
        }
        if (!q0.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        v0 it = iterator();
        Iterator<E> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        E next = it2.next();
        Object next2 = it.next();
        while (true) {
            try {
                int iX = X(next2, next);
                if (iX < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iX == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iX > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object[] d() {
        return this.f11966e.d();
    }

    public Comparator d0() {
        return this.f11843c;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
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
        if (!q0.b(this.f11843c, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            v0 it2 = iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                E next2 = it.next();
                if (next2 == null || X(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f11966e.get(0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public Object floor(Object obj) {
        int iA0 = a0(obj, true) - 1;
        if (iA0 == -1) {
            return null;
        }
        return this.f11966e.get(iA0);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int g() {
        return this.f11966e.g();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int h() {
        return this.f11966e.h();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public Object higher(Object obj) {
        int iB0 = b0(obj, false);
        if (iB0 == size()) {
            return null;
        }
        return this.f11966e.get(iB0);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean i() {
        return this.f11966e.i();
    }

    public int indexOf(Object obj) {
        int iBinarySearch;
        if (obj == null) {
            return -1;
        }
        try {
            iBinarySearch = Collections.binarySearch(this.f11966e, obj, d0());
        } catch (ClassCastException unused) {
        }
        if (iBinarySearch >= 0) {
            return iBinarySearch;
        }
        return -1;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: j */
    public v0 iterator() {
        return this.f11966e.iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f11966e.get(size() - 1);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public Object lower(Object obj) {
        int iA0 = a0(obj, false) - 1;
        if (iA0 == -1) {
            return null;
        }
        return this.f11966e.get(iA0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f11966e.size();
    }

    @Override // com.google.common.collect.ImmutableSet
    public ImmutableList v() {
        return this.f11966e;
    }
}
