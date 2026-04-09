package z8;

import java.util.Collection;

/* loaded from: classes4.dex */
public abstract class s extends r {
    public static int s(Iterable iterable, int i10) {
        kotlin.jvm.internal.p.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }

    public static final Integer t(Iterable iterable) {
        kotlin.jvm.internal.p.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }
}
