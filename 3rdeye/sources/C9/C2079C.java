package c9;

import d9.C4285c;
import d9.C4289g;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: c9.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2079C {
    public static C4289g a(C4289g c4289g) {
        C4285c<E, ?> c4285c = c4289g.f37576b;
        c4285c.c();
        return c4285c.f37560j > 0 ? c4289g : C4289g.f37575c;
    }

    public static Set b(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(C2077A.l(objArr.length));
        C2091l.s(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet c(Set set, Iterable elements) {
        kotlin.jvm.internal.l.f(set, "<this>");
        kotlin.jvm.internal.l.f(elements, "elements");
        Integer numValueOf = elements instanceof Collection ? Integer.valueOf(((Collection) elements).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(C2077A.l(numValueOf != null ? set.size() + numValueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        C2095p.b0(elements, linkedHashSet);
        return linkedHashSet;
    }

    public static Set d(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        kotlin.jvm.internal.l.e(setSingleton, "singleton(...)");
        return setSingleton;
    }

    public static Set e(Object... elements) {
        kotlin.jvm.internal.l.f(elements, "elements");
        int length = elements.length;
        if (length == 0) {
            return C2101v.f18583b;
        }
        if (length == 1) {
            return d(elements[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C2077A.l(elements.length));
        C2091l.s(elements, linkedHashSet);
        return linkedHashSet;
    }
}
