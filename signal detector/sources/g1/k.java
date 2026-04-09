package g1;

/* loaded from: classes.dex */
public final class k extends i {
    public final boolean i(Object obj) {
        if (obj == null) {
            obj = i.f20162g;
        }
        if (!i.f20161f.e(this, null, obj)) {
            return false;
        }
        i.c(this);
        return true;
    }

    public final boolean j(Throwable th) {
        if (!i.f20161f.e(this, null, new c(th))) {
            return false;
        }
        i.c(this);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(f4.InterfaceFutureC2326a r6) {
        /*
            r5 = this;
            r6.getClass()
            java.lang.Object r0 = r5.f20163a
            r1 = 0
            if (r0 != 0) goto L44
            boolean r0 = r6.isDone()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L20
            java.lang.Object r6 = g1.i.f(r6)
            com.bumptech.glide.c r0 = g1.i.f20161f
            boolean r6 = r0.e(r5, r3, r6)
            if (r6 == 0) goto L4f
            g1.i.c(r5)
            return r2
        L20:
            g1.f r0 = new g1.f
            r0.<init>(r5, r6)
            com.bumptech.glide.c r4 = g1.i.f20161f
            boolean r3 = r4.e(r5, r3, r0)
            if (r3 == 0) goto L42
            g1.j r1 = g1.j.f20166a     // Catch: java.lang.Throwable -> L33
            r6.a(r0, r1)     // Catch: java.lang.Throwable -> L33
            return r2
        L33:
            r6 = move-exception
            g1.c r1 = new g1.c     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            g1.c r1 = g1.c.f20144b
        L3c:
            com.bumptech.glide.c r6 = g1.i.f20161f
            r6.e(r5, r0, r1)
            return r2
        L42:
            java.lang.Object r0 = r5.f20163a
        L44:
            boolean r2 = r0 instanceof g1.C2330a
            if (r2 == 0) goto L4f
            g1.a r0 = (g1.C2330a) r0
            boolean r0 = r0.f20141a
            r6.cancel(r0)
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.k.k(f4.a):boolean");
    }
}
