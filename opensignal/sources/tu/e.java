package tu;

import br.l;
import cv.j;
import ou.c0;
import sm.m;

/* loaded from: classes.dex */
public abstract class e {
    static {
        j jVar = j.f6715r;
        m.m("\"\\");
        m.m("\t ,=");
    }

    public static final boolean a(c0 c0Var) {
        if (l.a(c0Var.f19884a.f19861b, "HEAD")) {
            return false;
        }
        int i10 = c0Var.f19887r;
        return (((i10 >= 100 && i10 < 200) || i10 == 204 || i10 == 304) && pu.b.j(c0Var) == -1 && !"chunked".equalsIgnoreCase(c0.f("Transfer-Encoding", c0Var))) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(ou.b r34, ou.t r35, ou.s r36) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tu.e.b(ou.b, ou.t, ou.s):void");
    }
}
