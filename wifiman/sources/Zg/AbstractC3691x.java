package Zg;

import ch.AbstractC4260a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import sh.C7974i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: Zg.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3691x extends AbstractC3690w {
    public static ArrayList h(Object... elements) {
        AbstractC6492s.i(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C3680l(elements, true));
    }

    public static final Collection i(Object[] objArr) {
        AbstractC6492s.i(objArr, "<this>");
        return new C3680l(objArr, false);
    }

    public static final int j(List list, Comparable comparable, int i10, int i11) {
        AbstractC6492s.i(list, "<this>");
        t(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iE = AbstractC4260a.e((Comparable) list.get(i13), comparable);
            if (iE < 0) {
                i10 = i13 + 1;
            } else {
                if (iE <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int k(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return j(list, comparable, i10, i11);
    }

    public static List l() {
        return J.f25337a;
    }

    public static C7974i m(Collection collection) {
        AbstractC6492s.i(collection, "<this>");
        return new C7974i(0, collection.size() - 1);
    }

    public static int n(List list) {
        AbstractC6492s.i(list, "<this>");
        return list.size() - 1;
    }

    public static List o(Object... elements) {
        AbstractC6492s.i(elements, "elements");
        return elements.length > 0 ? AbstractC3682n.e(elements) : AbstractC3689v.l();
    }

    public static List p(Object obj) {
        return obj != null ? AbstractC3689v.e(obj) : AbstractC3689v.l();
    }

    public static List q(Object... elements) {
        AbstractC6492s.i(elements, "elements");
        return AbstractC3682n.X(elements);
    }

    public static List r(Object... elements) {
        AbstractC6492s.i(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C3680l(elements, true));
    }

    public static final List s(List list) {
        AbstractC6492s.i(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : AbstractC3689v.e(list.get(0)) : AbstractC3689v.l();
    }

    private static final void t(int i10, int i11, int i12) {
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

    public static void u() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void v() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
