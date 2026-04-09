package C9;

/* compiled from: Produce.kt */
/* loaded from: classes3.dex */
public final class s {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(C9.u r4, p9.InterfaceC5480a r5, h9.c r6) {
        /*
            boolean r0 = r6 instanceof C9.p
            if (r0 == 0) goto L13
            r0 = r6
            C9.p r0 = (C9.p) r0
            int r1 = r0.f1013o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1013o = r1
            goto L18
        L13:
            C9.p r0 = new C9.p
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1012n
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f1013o
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            p9.a r4 = r0.f1011m
            r5 = r4
            p9.a r5 = (p9.InterfaceC5480a) r5
            b9.n.b(r6)     // Catch: java.lang.Throwable -> L2c
            goto L6a
        L2c:
            r4 = move-exception
            goto L70
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            b9.n.b(r6)
            f9.h r6 = r0.getContext()
            A9.o0$a r2 = A9.InterfaceC0594o0.a.f263b
            f9.h$a r6 = r6.get(r2)
            if (r6 != r4) goto L74
            r0.f1010l = r4     // Catch: java.lang.Throwable -> L2c
            r6 = r5
            p9.a r6 = (p9.InterfaceC5480a) r6     // Catch: java.lang.Throwable -> L2c
            r0.f1011m = r6     // Catch: java.lang.Throwable -> L2c
            r0.f1013o = r3     // Catch: java.lang.Throwable -> L2c
            A9.j r6 = new A9.j     // Catch: java.lang.Throwable -> L2c
            f9.e r0 = com.google.gson.internal.c.r(r0)     // Catch: java.lang.Throwable -> L2c
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L2c
            r6.s()     // Catch: java.lang.Throwable -> L2c
            C9.r r0 = new C9.r     // Catch: java.lang.Throwable -> L2c
            r2 = 0
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L2c
            r4.b(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r4 = r6.r()     // Catch: java.lang.Throwable -> L2c
            if (r4 != r1) goto L6a
            return r1
        L6a:
            r5.invoke()
            b9.A r4 = b9.C1992A.f18074a
            return r4
        L70:
            r5.invoke()
            throw r4
        L74:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: C9.s.a(C9.u, p9.a, h9.c):java.lang.Object");
    }
}
