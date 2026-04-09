package Zg;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class B extends A {
    public static void A(List list) {
        AbstractC6492s.i(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void B(List list, Comparator comparator) {
        AbstractC6492s.i(list, "<this>");
        AbstractC6492s.i(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
