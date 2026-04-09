package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public abstract class q0 {
    public static Comparator a(SortedSet sortedSet) {
        Comparator comparator = sortedSet.comparator();
        return comparator == null ? j0.d() : comparator;
    }

    public static boolean b(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        com.google.common.base.g.m(comparator);
        com.google.common.base.g.m(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else {
            if (!(iterable instanceof p0)) {
                return false;
            }
            comparator2 = ((p0) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
