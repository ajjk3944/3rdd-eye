package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;
import m4.AbstractC6769h;

/* loaded from: classes3.dex */
abstract class P {
    public static Comparator a(SortedSet sortedSet) {
        Comparator comparator = sortedSet.comparator();
        return comparator == null ? G.d() : comparator;
    }

    public static boolean b(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        AbstractC6769h.i(comparator);
        AbstractC6769h.i(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else {
            if (!(iterable instanceof O)) {
                return false;
            }
            comparator2 = ((O) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
