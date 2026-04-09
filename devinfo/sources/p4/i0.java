package p4;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i0 extends b0 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r6, ek.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p4.h0
            if (r0 == 0) goto L13
            r0 = r7
            p4.h0 r0 = (p4.h0) r0
            int r1 = r0.f31221e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31221e = r1
            goto L18
        L13:
            p4.h0 r0 = new p4.h0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f31219c
            int r1 = r0.f31221e
            yj.u r2 = yj.u.f37649a
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2d
            java.io.FileOutputStream r6 = r0.f31218b
            java.io.FileOutputStream r0 = r0.f31217a
            ci.b.D(r7)     // Catch: java.lang.Throwable -> L2b
            goto L5e
        L2b:
            r6 = move-exception
            goto L6c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            ci.b.D(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = r5.f31174c
            boolean r7 = r7.get()
            if (r7 != 0) goto L72
            java.io.FileOutputStream r7 = new java.io.FileOutputStream
            java.io.File r1 = r5.f31172a
            r7.<init>(r1)
            p4.w0 r1 = r5.f31173b     // Catch: java.lang.Throwable -> L6a
            hm.d r4 = new hm.d     // Catch: java.lang.Throwable -> L6a
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L6a
            r0.f31217a = r7     // Catch: java.lang.Throwable -> L6a
            r0.f31218b = r7     // Catch: java.lang.Throwable -> L6a
            r0.f31221e = r3     // Catch: java.lang.Throwable -> L6a
            r1.c(r6, r4)     // Catch: java.lang.Throwable -> L6a
            dk.a r6 = dk.a.f22275a
            if (r2 != r6) goto L5c
            return r6
        L5c:
            r6 = r7
            r0 = r6
        L5e:
            java.io.FileDescriptor r6 = r6.getFD()     // Catch: java.lang.Throwable -> L2b
            r6.sync()     // Catch: java.lang.Throwable -> L2b
            r6 = 0
            cm.g.e(r0, r6)
            return r2
        L6a:
            r6 = move-exception
            r0 = r7
        L6c:
            throw r6     // Catch: java.lang.Throwable -> L6d
        L6d:
            r7 = move-exception
            cm.g.e(r0, r6)
            throw r7
        L72:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "This scope has already been closed."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.i0.b(java.lang.Object, ek.c):java.lang.Object");
    }
}
