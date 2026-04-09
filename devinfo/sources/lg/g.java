package lg;

import java.util.HashSet;
import java.util.Locale;
import vk.p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f28812b = new HashSet();

    static {
        c("Android/data");
        c("Android/obb");
        c("Download");
        c("Pictures");
        c("DCIM");
    }

    public static final void c(String str) {
        String str2 = com.liuzh.deviceinfo.utilities.c.f21249b;
        nk.k.d(str2, "EXTERNAL_ROOT_PATH");
        String strC = com.liuzh.deviceinfo.utilities.h.c(p.p0(str2, "/", false) ? str2.concat(str) : d.h.E(str2, "/", str));
        nk.k.d(strC, "trimSeparator(...)");
        String lowerCase = strC.toLowerCase(Locale.ROOT);
        nk.k.d(lowerCase, "toLowerCase(...)");
        f28812b.add(lowerCase);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // lg.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(aj.b r8) {
        /*
            r7 = this;
            java.lang.String r0 = ".nomedia"
            java.lang.String r1 = r8.f410e
            boolean r0 = r0.equalsIgnoreCase(r1)
            r1 = 0
            if (r0 == 0) goto Lc
            goto L6d
        Lc:
            boolean r0 = r8.f409d
            r2 = 1
            if (r0 == 0) goto L64
            java.lang.String r0 = r8.c()
            java.lang.String r3 = "getPath(...)"
            nk.k.d(r0, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L22
        L20:
            r0 = r1
            goto L55
        L22:
            java.lang.String r0 = com.liuzh.deviceinfo.utilities.h.c(r0)
            java.lang.String r3 = com.liuzh.deviceinfo.utilities.c.f21249b
            if (r3 == 0) goto L3a
            if (r0 != 0) goto L2d
            goto L3a
        L2d:
            java.lang.String r3 = com.liuzh.deviceinfo.utilities.h.c(r3)
            java.lang.String r4 = com.liuzh.deviceinfo.utilities.h.c(r0)
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            goto L3b
        L3a:
            r3 = r1
        L3b:
            if (r3 == 0) goto L3e
            goto L20
        L3e:
            nk.k.b(r0)
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r3)
            java.lang.String r3 = "toLowerCase(...)"
            nk.k.d(r0, r3)
            java.util.HashSet r3 = lg.g.f28812b
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L20
            r0 = r2
        L55:
            if (r0 == 0) goto L6d
            java.util.HashMap r8 = r8.f412h
            if (r8 == 0) goto L63
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L62
            goto L63
        L62:
            return r1
        L63:
            return r2
        L64:
            long r3 = r8.f406a
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L6d
            return r2
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lg.g.a(aj.b):boolean");
    }

    @Override // lg.e
    public final kg.d b(aj.b bVar) {
        String strC = bVar.c();
        nk.k.d(strC, "getPath(...)");
        return new kg.e(strC, -1L, 2, bVar);
    }
}
