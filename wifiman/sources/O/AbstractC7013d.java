package o;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.AbstractC6492s;
import p.AbstractC7173a;

/* renamed from: o.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7013d {
    public static final void a(C7011b c7011b, int i10) {
        AbstractC6492s.i(c7011b, "<this>");
        c7011b.q(new int[i10]);
        c7011b.k(new Object[i10]);
    }

    public static final int b(C7011b c7011b, int i10) {
        AbstractC6492s.i(c7011b, "<this>");
        try {
            return AbstractC7173a.a(c7011b.f(), c7011b.i(), i10);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int c(C7011b c7011b, Object obj, int i10) {
        AbstractC6492s.i(c7011b, "<this>");
        int i11 = c7011b.i();
        if (i11 == 0) {
            return -1;
        }
        int iB = b(c7011b, i10);
        if (iB < 0 || AbstractC6492s.d(obj, c7011b.e()[iB])) {
            return iB;
        }
        int i12 = iB + 1;
        while (i12 < i11 && c7011b.f()[i12] == i10) {
            if (AbstractC6492s.d(obj, c7011b.e()[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iB - 1; i13 >= 0 && c7011b.f()[i13] == i10; i13--) {
            if (AbstractC6492s.d(obj, c7011b.e()[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    public static final int d(C7011b c7011b) {
        AbstractC6492s.i(c7011b, "<this>");
        return c(c7011b, null, 0);
    }
}
