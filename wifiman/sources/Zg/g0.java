package Zg;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class g0 extends f0 {
    public static Set j(Set set, Iterable elements) {
        AbstractC6492s.i(set, "<this>");
        AbstractC6492s.i(elements, "elements");
        Collection<?> collectionF = C.F(elements);
        if (collectionF.isEmpty()) {
            return AbstractC3689v.n1(set);
        }
        if (!(collectionF instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionF);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionF).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static Set k(Set set, Object obj) {
        AbstractC6492s.i(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(U.d(set.size()));
        boolean z10 = false;
        for (Object obj2 : set) {
            boolean z11 = true;
            if (!z10 && AbstractC6492s.d(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set l(Set set, Iterable elements) {
        int size;
        AbstractC6492s.i(set, "<this>");
        AbstractC6492s.i(elements, "elements");
        Integer numX = AbstractC3692y.x(elements);
        if (numX != null) {
            size = set.size() + numX.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(U.d(size));
        linkedHashSet.addAll(set);
        AbstractC3689v.C(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static Set m(Set set, Object obj) {
        AbstractC6492s.i(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(U.d(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
