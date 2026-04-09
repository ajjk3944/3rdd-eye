package d4;

/* loaded from: classes.dex */
public final class l0 extends e0 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r7, rq.c r8) throws java.io.IOException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof d4.k0
            if (r0 == 0) goto L13
            r0 = r8
            d4.k0 r0 = (d4.k0) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            d4.k0 r0 = new d4.k0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f6842y
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.D
            lq.b0 r3 = lq.b0.f15562a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.io.FileOutputStream r7 = r0.f6841x
            java.io.FileOutputStream r0 = r0.f6840r
            lf.t1.G(r8)     // Catch: java.lang.Throwable -> L2d
            goto L62
        L2d:
            r7 = move-exception
            goto L70
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            lf.t1.G(r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = r6.f6798c
            boolean r8 = r8.get()
            if (r8 != 0) goto L76
            java.io.FileOutputStream r8 = new java.io.FileOutputStream
            java.io.File r2 = r6.f6796a
            r8.<init>(r2)
            java.io.FileOutputStream r8 = xu.l.k(r8, r2)
            d4.z0 r2 = r6.f6797b     // Catch: java.lang.Throwable -> L6e
            d4.h1 r5 = new d4.h1     // Catch: java.lang.Throwable -> L6e
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L6e
            r0.f6840r = r8     // Catch: java.lang.Throwable -> L6e
            r0.f6841x = r8     // Catch: java.lang.Throwable -> L6e
            r0.D = r4     // Catch: java.lang.Throwable -> L6e
            r2.c(r7, r5)     // Catch: java.lang.Throwable -> L6e
            if (r3 != r1) goto L60
            return r1
        L60:
            r7 = r8
            r0 = r7
        L62:
            java.io.FileDescriptor r7 = r7.getFD()     // Catch: java.lang.Throwable -> L2d
            r7.sync()     // Catch: java.lang.Throwable -> L2d
            r7 = 0
            ic.a.g(r0, r7)
            return r3
        L6e:
            r7 = move-exception
            r0 = r8
        L70:
            throw r7     // Catch: java.lang.Throwable -> L71
        L71:
            r8 = move-exception
            ic.a.g(r0, r7)
            throw r8
        L76:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "This scope has already been closed."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.l0.b(java.lang.Object, rq.c):java.lang.Object");
    }
}
