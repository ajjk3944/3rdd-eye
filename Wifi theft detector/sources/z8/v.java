package z8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class v extends u {
    public static void u(List list) {
        kotlin.jvm.internal.p.e(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void v(List list, Comparator comparator) {
        kotlin.jvm.internal.p.e(list, "<this>");
        kotlin.jvm.internal.p.e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
