package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
final class NaturalOrdering extends j0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final NaturalOrdering f11927a = new NaturalOrdering();
    private static final long serialVersionUID = 0;

    private NaturalOrdering() {
    }

    private Object readResolve() {
        return f11927a;
    }

    @Override // com.google.common.collect.j0
    public j0 i() {
        return ReverseNaturalOrdering.f11967a;
    }

    @Override // com.google.common.collect.j0, java.util.Comparator
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        com.google.common.base.g.m(comparable);
        com.google.common.base.g.m(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
