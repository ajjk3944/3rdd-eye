package mq;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class s extends r {
    public static void b0(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void c0(List list, Comparator comparator) {
        br.l.e(list, "<this>");
        br.l.e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
