package z8;

import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes4.dex */
public abstract class j0 extends i0 {
    public static Set d() {
        return EmptySet.f21945a;
    }

    public static final Set e(Set set) {
        kotlin.jvm.internal.p.e(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : i0.c(set.iterator().next()) : d();
    }

    public static Set f(Object... elements) {
        kotlin.jvm.internal.p.e(elements, "elements");
        return o.T(elements);
    }
}
