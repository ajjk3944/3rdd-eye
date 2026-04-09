package z8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class r extends q {
    public static final Collection g(Object[] objArr) {
        kotlin.jvm.internal.p.e(objArr, "<this>");
        return new i(objArr, false);
    }

    public static final int h(List list, Comparable comparable, int i10, int i11) {
        kotlin.jvm.internal.p.e(list, "<this>");
        p(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iA = b9.a.a((Comparable) list.get(i13), comparable);
            if (iA < 0) {
                i10 = i13 + 1;
            } else {
                if (iA <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int i(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return h(list, comparable, i10, i11);
    }

    public static List j() {
        return EmptyList.f21943a;
    }

    public static int k(List list) {
        kotlin.jvm.internal.p.e(list, "<this>");
        return list.size() - 1;
    }

    public static List l(Object... elements) {
        kotlin.jvm.internal.p.e(elements, "elements");
        return elements.length > 0 ? m.c(elements) : j();
    }

    public static List m(Object... elements) {
        kotlin.jvm.internal.p.e(elements, "elements");
        return o.y(elements);
    }

    public static List n(Object... elements) {
        kotlin.jvm.internal.p.e(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new i(elements, true));
    }

    public static final List o(List list) {
        kotlin.jvm.internal.p.e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : q.e(list.get(0)) : j();
    }

    public static final void p(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        }
        if (i12 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
    }

    public static void q() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void r() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
