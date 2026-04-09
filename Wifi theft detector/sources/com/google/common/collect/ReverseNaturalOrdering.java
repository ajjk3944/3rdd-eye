package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
final class ReverseNaturalOrdering extends j0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final ReverseNaturalOrdering f11967a = new ReverseNaturalOrdering();
    private static final long serialVersionUID = 0;

    private ReverseNaturalOrdering() {
    }

    private Object readResolve() {
        return f11967a;
    }

    @Override // com.google.common.collect.j0
    public j0 i() {
        return j0.d();
    }

    @Override // com.google.common.collect.j0, java.util.Comparator
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        com.google.common.base.g.m(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
