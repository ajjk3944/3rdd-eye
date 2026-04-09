package d2;

import d2.AbstractC4266a;

/* compiled from: SettableFuture.java */
/* renamed from: d2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4268c<V> extends AbstractC4266a<V> {
    public final boolean i(V v10) {
        if (v10 == null) {
            v10 = (V) AbstractC4266a.f37348h;
        }
        if (!AbstractC4266a.f37347g.b(this, null, v10)) {
            return false;
        }
        AbstractC4266a.b(this);
        return true;
    }

    public final boolean j(Throwable th) {
        th.getClass();
        if (!AbstractC4266a.f37347g.b(this, null, new AbstractC4266a.c(th))) {
            return false;
        }
        AbstractC4266a.b(this);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(A4.a<? extends V> r6) {
        /*
            r5 = this;
            r6.getClass()
            java.lang.Object r0 = r5.f37349b
            r1 = 0
            if (r0 != 0) goto L44
            boolean r0 = r6.isDone()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L20
            java.lang.Object r6 = d2.AbstractC4266a.e(r6)
            d2.a$a r0 = d2.AbstractC4266a.f37347g
            boolean r6 = r0.b(r5, r3, r6)
            if (r6 == 0) goto L4f
            d2.AbstractC4266a.b(r5)
            return r2
        L20:
            d2.a$f r0 = new d2.a$f
            r0.<init>(r5, r6)
            d2.a$a r4 = d2.AbstractC4266a.f37347g
            boolean r3 = r4.b(r5, r3, r0)
            if (r3 == 0) goto L42
            d2.b r1 = d2.EnumC4267b.INSTANCE     // Catch: java.lang.Throwable -> L33
            r6.addListener(r0, r1)     // Catch: java.lang.Throwable -> L33
            return r2
        L33:
            r6 = move-exception
            d2.a$c r1 = new d2.a$c     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            d2.a$c r1 = d2.AbstractC4266a.c.f37356b
        L3c:
            d2.a$a r6 = d2.AbstractC4266a.f37347g
            r6.b(r5, r0, r1)
            return r2
        L42:
            java.lang.Object r0 = r5.f37349b
        L44:
            boolean r2 = r0 instanceof d2.AbstractC4266a.b
            if (r2 == 0) goto L4f
            d2.a$b r0 = (d2.AbstractC4266a.b) r0
            boolean r0 = r0.f37354a
            r6.cancel(r0)
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.C4268c.k(A4.a):boolean");
    }
}
