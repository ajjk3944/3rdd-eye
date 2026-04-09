package com.google.common.collect;

import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class j0 implements Comparator {
    public static j0 a(Comparator comparator) {
        return comparator instanceof j0 ? (j0) comparator : new ComparatorOrdering(comparator);
    }

    public static j0 d() {
        return NaturalOrdering.f11927a;
    }

    public ImmutableList b(Iterable iterable) {
        return ImmutableList.D(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public j0 g() {
        return h(Maps.f());
    }

    public j0 h(com.google.common.base.c cVar) {
        return new ByFunctionOrdering(cVar, this);
    }

    public j0 i() {
        return new ReverseOrdering(this);
    }
}
