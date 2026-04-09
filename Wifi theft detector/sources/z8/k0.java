package z8;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class k0 extends j0 {
    public static Set g(Set set, Object obj) {
        kotlin.jvm.internal.p.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(h0.e(set.size()));
        boolean z10 = false;
        for (Object obj2 : set) {
            boolean z11 = true;
            if (!z10 && kotlin.jvm.internal.p.a(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set h(Set set, Iterable elements) {
        int size;
        kotlin.jvm.internal.p.e(set, "<this>");
        kotlin.jvm.internal.p.e(elements, "elements");
        Integer numT = s.t(elements);
        if (numT != null) {
            size = set.size() + numT.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(h0.e(size));
        linkedHashSet.addAll(set);
        w.w(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static Set i(Set set, Object obj) {
        kotlin.jvm.internal.p.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(h0.e(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
