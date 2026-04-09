package r;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public abstract class d {
    public static final void a(b bVar, int i10) {
        p.e(bVar, "<this>");
        bVar.j(new int[i10]);
        bVar.i(new Object[i10]);
    }

    public static final int b(b bVar, int i10) {
        p.e(bVar, "<this>");
        try {
            return s.a.a(bVar.e(), bVar.g(), i10);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int c(b bVar, Object obj, int i10) {
        p.e(bVar, "<this>");
        int iG = bVar.g();
        if (iG == 0) {
            return -1;
        }
        int iB = b(bVar, i10);
        if (iB < 0 || p.a(obj, bVar.d()[iB])) {
            return iB;
        }
        int i11 = iB + 1;
        while (i11 < iG && bVar.e()[i11] == i10) {
            if (p.a(obj, bVar.d()[i11])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iB - 1; i12 >= 0 && bVar.e()[i12] == i10; i12--) {
            if (p.a(obj, bVar.d()[i12])) {
                return i12;
            }
        }
        return ~i11;
    }

    public static final int d(b bVar) {
        p.e(bVar, "<this>");
        return c(bVar, null, 0);
    }
}
