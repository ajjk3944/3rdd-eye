package wl;

import ec.y;
import nk.k;
import rl.z;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class g {
    static {
        hm.h hVar = hm.h.f25175d;
        y.f("\"\\");
        y.f("\t ,=");
    }

    public static final boolean a(z zVar) {
        if (k.a((String) zVar.f33204a.f36147c, "HEAD")) {
            return false;
        }
        int i4 = zVar.f33207d;
        if (((i4 < 100 || i4 >= 200) && i4 != 204 && i4 != 304) || sl.h.e(zVar) != -1) {
            return true;
        }
        String strA = zVar.f33209f.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        return "chunked".equalsIgnoreCase(strA);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(rl.b r37, rl.n r38, rl.m r39) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wl.g.b(rl.b, rl.n, rl.m):void");
    }
}
