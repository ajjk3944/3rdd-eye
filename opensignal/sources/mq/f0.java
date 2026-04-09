package mq;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class f0 extends i3.g {
    public static LinkedHashSet M(Set set, Object obj) {
        br.l.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(b0.P(set.size()));
        boolean z10 = false;
        for (Object obj2 : set) {
            boolean z11 = true;
            if (!z10 && br.l.a(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static LinkedHashSet N(Set set, Iterable iterable) {
        br.l.e(set, "<this>");
        br.l.e(iterable, "elements");
        Integer numValueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(b0.P(numValueOf != null ? set.size() + numValueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        t.d0(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static LinkedHashSet O(Set set, Object obj) {
        br.l.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(b0.P(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
