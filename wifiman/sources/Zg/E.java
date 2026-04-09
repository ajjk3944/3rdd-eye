package Zg;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.jvm.internal.AbstractC6492s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class E extends D {
    public static void X(List list) {
        AbstractC6492s.i(list, "<this>");
        Collections.reverse(list);
    }

    public static SortedSet Y(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        return (SortedSet) H.e1(iterable, new TreeSet());
    }

    public static SortedSet Z(Iterable iterable, Comparator comparator) {
        AbstractC6492s.i(iterable, "<this>");
        AbstractC6492s.i(comparator, "comparator");
        return (SortedSet) H.e1(iterable, new TreeSet(comparator));
    }
}
