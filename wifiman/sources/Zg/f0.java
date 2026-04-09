package Zg;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class f0 extends e0 {
    public static Set e() {
        return L.f25339a;
    }

    public static HashSet f(Object... elements) {
        AbstractC6492s.i(elements, "elements");
        return (HashSet) AbstractC3686s.W0(elements, new HashSet(U.d(elements.length)));
    }

    public static LinkedHashSet g(Object... elements) {
        AbstractC6492s.i(elements, "elements");
        return (LinkedHashSet) AbstractC3686s.W0(elements, new LinkedHashSet(U.d(elements.length)));
    }

    public static final Set h(Set set) {
        AbstractC6492s.i(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : d0.c(set.iterator().next()) : d0.e();
    }

    public static Set i(Object... elements) {
        AbstractC6492s.i(elements, "elements");
        return AbstractC3682n.p1(elements);
    }
}
