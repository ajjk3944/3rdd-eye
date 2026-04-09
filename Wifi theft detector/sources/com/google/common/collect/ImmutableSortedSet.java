package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableSet;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public abstract class ImmutableSortedSet<E> extends ImmutableSortedSetFauxverideShim<E> implements NavigableSet<E>, p0 {

    /* renamed from: c, reason: collision with root package name */
    public final transient Comparator f11843c;

    /* renamed from: d, reason: collision with root package name */
    public transient ImmutableSortedSet f11844d;

    public static class SerializedForm<E> implements Serializable {
        private static final long serialVersionUID = 0;
        final Comparator<? super E> comparator;
        final Object[] elements;

        public SerializedForm(Comparator comparator, Object[] objArr) {
            this.comparator = comparator;
            this.elements = objArr;
        }

        public Object readResolve() {
            return new a(this.comparator).l(this.elements).j();
        }
    }

    public static final class a extends ImmutableSet.a {

        /* renamed from: f, reason: collision with root package name */
        public final Comparator f11845f;

        public a(Comparator comparator) {
            this.f11845f = (Comparator) com.google.common.base.g.m(comparator);
        }

        @Override // com.google.common.collect.ImmutableSet.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public a f(Object obj) {
            super.f(obj);
            return this;
        }

        public a l(Object... objArr) {
            super.g(objArr);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public a h(Iterator it) {
            super.h(it);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedSet j() {
            ImmutableSortedSet immutableSortedSetJ = ImmutableSortedSet.J(this.f11845f, this.f11783b, this.f11782a);
            this.f11783b = immutableSortedSetJ.size();
            this.f11784c = true;
            return immutableSortedSetJ;
        }
    }

    public ImmutableSortedSet(Comparator comparator) {
        this.f11843c = comparator;
    }

    public static ImmutableSortedSet J(Comparator comparator, int i10, Object... objArr) {
        if (i10 == 0) {
            return N(comparator);
        }
        g0.c(objArr, i10);
        Arrays.sort(objArr, 0, i10, comparator);
        int i11 = 1;
        for (int i12 = 1; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (comparator.compare(obj, objArr[i11 - 1]) != 0) {
                objArr[i11] = obj;
                i11++;
            }
        }
        Arrays.fill(objArr, i11, i10, (Object) null);
        if (i11 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i11);
        }
        return new RegularImmutableSortedSet(ImmutableList.u(objArr, i11), comparator);
    }

    public static RegularImmutableSortedSet N(Comparator comparator) {
        return j0.d().equals(comparator) ? RegularImmutableSortedSet.f11965f : new RegularImmutableSortedSet(ImmutableList.A(), comparator);
    }

    public static int Y(Comparator comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public abstract ImmutableSortedSet K();

    @Override // java.util.NavigableSet
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public abstract v0 descendingIterator();

    @Override // java.util.NavigableSet
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet descendingSet() {
        ImmutableSortedSet immutableSortedSet = this.f11844d;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        ImmutableSortedSet immutableSortedSetK = K();
        this.f11844d = immutableSortedSetK;
        immutableSortedSetK.f11844d = this;
        return immutableSortedSetK;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet headSet(Object obj, boolean z10) {
        return Q(com.google.common.base.g.m(obj), z10);
    }

    public abstract ImmutableSortedSet Q(Object obj, boolean z10);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        com.google.common.base.g.m(obj);
        com.google.common.base.g.m(obj2);
        com.google.common.base.g.d(this.f11843c.compare(obj, obj2) <= 0);
        return T(obj, z10, obj2, z11);
    }

    public abstract ImmutableSortedSet T(Object obj, boolean z10, Object obj2, boolean z11);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet tailSet(Object obj, boolean z10) {
        return W(com.google.common.base.g.m(obj), z10);
    }

    public abstract ImmutableSortedSet W(Object obj, boolean z10);

    public int X(Object obj, Object obj2) {
        return Y(this.f11843c, obj, obj2);
    }

    public Object ceiling(Object obj) {
        return a0.d(tailSet(obj, true), null);
    }

    @Override // java.util.SortedSet, com.google.common.collect.p0
    public Comparator comparator() {
        return this.f11843c;
    }

    @Override // java.util.SortedSet
    public Object first() {
        return iterator().next();
    }

    public Object floor(Object obj) {
        return Iterators.i(headSet(obj, true).descendingIterator(), null);
    }

    public Object higher(Object obj) {
        return a0.d(tailSet(obj, false), null);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: j */
    public abstract v0 iterator();

    @Override // java.util.SortedSet
    public Object last() {
        return descendingIterator().next();
    }

    public Object lower(Object obj) {
        return Iterators.i(headSet(obj, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this.f11843c, toArray());
    }
}
