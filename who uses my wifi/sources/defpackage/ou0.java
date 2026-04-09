package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ou0 extends y {
    public final boolean i(Object obj) {
        if (obj == null) {
            obj = y.l;
        }
        if (!y.k.e(this, null, obj)) {
            return false;
        }
        y.b(this);
        return true;
    }

    public final boolean j(Throwable th) {
        if (!y.k.e(this, null, new s(th))) {
            return false;
        }
        y.b(this);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(defpackage.n70 r6) {
        /*
            r5 = this;
            r6.getClass()
            java.lang.Object r0 = r5.f
            r1 = 0
            if (r0 != 0) goto L44
            boolean r0 = r6.isDone()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L20
            java.lang.Object r6 = defpackage.y.f(r6)
            bd2 r0 = defpackage.y.k
            boolean r6 = r0.e(r5, r3, r6)
            if (r6 == 0) goto L4f
            defpackage.y.b(r5)
            return r2
        L20:
            v r0 = new v
            r0.<init>(r5, r6)
            bd2 r4 = defpackage.y.k
            boolean r3 = r4.e(r5, r3, r0)
            if (r3 == 0) goto L42
            bp r1 = defpackage.bp.f     // Catch: java.lang.Throwable -> L33
            r6.c(r0, r1)     // Catch: java.lang.Throwable -> L33
            return r2
        L33:
            r6 = move-exception
            s r1 = new s     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            s r1 = defpackage.s.b
        L3c:
            bd2 r6 = defpackage.y.k
            r6.e(r5, r0, r1)
            return r2
        L42:
            java.lang.Object r0 = r5.f
        L44:
            boolean r2 = r0 instanceof defpackage.q
            if (r2 == 0) goto L4f
            q r0 = (defpackage.q) r0
            boolean r0 = r0.a
            r6.cancel(r0)
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ou0.k(n70):boolean");
    }
}
