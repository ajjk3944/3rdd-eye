package z8;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class w extends v {
    public static Object A(List list) {
        kotlin.jvm.internal.p.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(r.k(list));
    }

    public static boolean w(Collection collection, Iterable elements) {
        kotlin.jvm.internal.p.e(collection, "<this>");
        kotlin.jvm.internal.p.e(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean x(Collection collection, Object[] elements) {
        kotlin.jvm.internal.p.e(collection, "<this>");
        kotlin.jvm.internal.p.e(elements, "elements");
        return collection.addAll(m.c(elements));
    }

    public static Object y(List list) {
        kotlin.jvm.internal.p.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static Object z(List list) {
        kotlin.jvm.internal.p.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(r.k(list));
    }
}
