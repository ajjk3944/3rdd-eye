package w0;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class f {
    public static final void a(int i4, List list) {
        int size = list.size();
        if (i4 < 0 || i4 >= size) {
            c(i4, size);
        }
    }

    public static final void b(int i4, int i10, List list) {
        if (i4 > i10) {
            f(i4, i10);
        }
        if (i4 < 0) {
            d(i4);
        }
        if (i10 > list.size()) {
            e(i10, list.size());
        }
    }

    private static final void c(int i4, int i10) {
        throw new IndexOutOfBoundsException(r5.c.i(i4, "Index ", " is out of bounds. The list has ", i10, " elements."));
    }

    private static final void d(int i4) {
        throw new IndexOutOfBoundsException(r5.c.h(i4, "fromIndex (", ") is less than 0."));
    }

    private static final void e(int i4, int i10) {
        throw new IndexOutOfBoundsException("toIndex (" + i4 + ") is more than than the list size (" + i10 + ')');
    }

    private static final void f(int i4, int i10) {
        throw new IllegalArgumentException(r5.c.i(i4, "Indices are out of order. fromIndex (", ") is greater than toIndex (", i10, ")."));
    }
}
