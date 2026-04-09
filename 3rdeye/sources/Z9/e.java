package Z9;

import U9.E;
import ia.h;
import kotlin.jvm.internal.l;

/* compiled from: HttpHeaders.kt */
/* loaded from: classes3.dex */
public final class e {
    static {
        ia.h hVar = ia.h.f38646e;
        h.a.c("\"\\");
        h.a.c("\t ,=");
    }

    public static final boolean a(E e4) {
        if (l.b(e4.f12562b.f12796b, "HEAD")) {
            return false;
        }
        int i = e4.f12565e;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && V9.b.j(e4) == -1 && !"chunked".equalsIgnoreCase(E.c(e4, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0050  */
    /* JADX WARN: Type inference failed for: r24v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(U9.l r35, U9.t r36, U9.s r37) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z9.e.b(U9.l, U9.t, U9.s):void");
    }
}
