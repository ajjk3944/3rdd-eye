package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import m4.AbstractC6769h;

/* renamed from: com.google.common.collect.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5073t extends u implements NavigableSet, O {

    /* renamed from: c, reason: collision with root package name */
    final transient Comparator f38414c;

    /* renamed from: d, reason: collision with root package name */
    transient AbstractC5073t f38415d;

    AbstractC5073t(Comparator comparator) {
        this.f38414c = comparator;
    }

    static AbstractC5073t U0(Comparator comparator, int i10, Object... objArr) {
        if (i10 == 0) {
            return Z0(comparator);
        }
        F.c(objArr, i10);
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
        return new L(AbstractC5069o.y(objArr, i11), comparator);
    }

    public static AbstractC5073t V0(Comparator comparator, Iterable iterable) {
        AbstractC6769h.i(comparator);
        if (P.b(comparator, iterable) && (iterable instanceof AbstractC5073t)) {
            AbstractC5073t abstractC5073t = (AbstractC5073t) iterable;
            if (!abstractC5073t.s()) {
                return abstractC5073t;
            }
        }
        Object[] objArrB = v.b(iterable);
        return U0(comparator, objArrB.length, objArrB);
    }

    public static AbstractC5073t W0(Comparator comparator, Collection collection) {
        return V0(comparator, collection);
    }

    static L Z0(Comparator comparator) {
        return G.d().equals(comparator) ? L.f38345f : new L(AbstractC5069o.T(), comparator);
    }

    static int k1(Comparator comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    abstract AbstractC5073t X0();

    @Override // java.util.NavigableSet
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public AbstractC5073t descendingSet() {
        AbstractC5073t abstractC5073t = this.f38415d;
        if (abstractC5073t != null) {
            return abstractC5073t;
        }
        AbstractC5073t abstractC5073tX0 = X0();
        this.f38415d = abstractC5073tX0;
        abstractC5073tX0.f38415d = this;
        return abstractC5073tX0;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public AbstractC5073t headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public AbstractC5073t headSet(Object obj, boolean z10) {
        return c1(AbstractC6769h.i(obj), z10);
    }

    abstract AbstractC5073t c1(Object obj, boolean z10);

    @Override // java.util.SortedSet, com.google.common.collect.O
    public Comparator comparator() {
        return this.f38414c;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public AbstractC5073t subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: e1, reason: merged with bridge method [inline-methods] */
    public AbstractC5073t subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        AbstractC6769h.i(obj);
        AbstractC6769h.i(obj2);
        AbstractC6769h.d(this.f38414c.compare(obj, obj2) <= 0);
        return f1(obj, z10, obj2, z11);
    }

    abstract AbstractC5073t f1(Object obj, boolean z10, Object obj2, boolean z11);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: g1, reason: merged with bridge method [inline-methods] */
    public AbstractC5073t tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    /* renamed from: h1, reason: merged with bridge method [inline-methods] */
    public AbstractC5073t tailSet(Object obj, boolean z10) {
        return i1(AbstractC6769h.i(obj), z10);
    }

    abstract AbstractC5073t i1(Object obj, boolean z10);

    int j1(Object obj, Object obj2) {
        return k1(this.f38414c, obj, obj2);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }
}
