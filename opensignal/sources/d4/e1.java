package d4;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class e1 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final eu.d f6799a = eu.e.a();

    /* renamed from: b, reason: collision with root package name */
    public final b9.c f6800b = new b9.c(13);

    /* renamed from: c, reason: collision with root package name */
    public final z7.j f6801c = new z7.j(new d1(2, null, 0));

    public e1(String str) {
    }

    @Override // d4.n0
    public final Object a(b0 b0Var) {
        return new Integer(((AtomicInteger) this.f6800b.f2478d).incrementAndGet());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // d4.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(ar.n r7, rq.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof d4.c1
            if (r0 == 0) goto L13
            r0 = r8
            d4.c1 r0 = (d4.c1) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            d4.c1 r0 = new d4.c1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f6786y
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.D
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            boolean r7 = r0.f6785x
            eu.d r0 = r0.f6784r
            lf.t1.G(r8)     // Catch: java.lang.Throwable -> L2c
            goto L53
        L2c:
            r8 = move-exception
            goto L5d
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            lf.t1.G(r8)
            eu.d r8 = r6.f6799a
            boolean r2 = r8.e()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L59
            r0.f6784r = r8     // Catch: java.lang.Throwable -> L59
            r0.f6785x = r2     // Catch: java.lang.Throwable -> L59
            r0.D = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r7 = r7.w(r5, r0)     // Catch: java.lang.Throwable -> L59
            if (r7 != r1) goto L50
            return r1
        L50:
            r0 = r8
            r8 = r7
            r7 = r2
        L53:
            if (r7 == 0) goto L58
            r0.f(r4)
        L58:
            return r8
        L59:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L5d:
            if (r7 == 0) goto L62
            r0.f(r4)
        L62:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.e1.b(ar.n, rq.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // d4.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(ar.k r8, rq.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof d4.b1
            if (r0 == 0) goto L13
            r0 = r9
            d4.b1 r0 = (d4.b1) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            d4.b1 r0 = new d4.b1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f6771y
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.D
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.f6769r
            eu.a r8 = (eu.a) r8
            lf.t1.G(r9)     // Catch: java.lang.Throwable -> L2f
            goto L67
        L2f:
            r9 = move-exception
            goto L71
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            eu.d r8 = r0.f6770x
            java.lang.Object r2 = r0.f6769r
            ar.k r2 = (ar.k) r2
            lf.t1.G(r9)
            r9 = r8
            r8 = r2
            goto L57
        L45:
            lf.t1.G(r9)
            r0.f6769r = r8
            eu.d r9 = r7.f6799a
            r0.f6770x = r9
            r0.D = r4
            java.lang.Object r2 = r9.d(r0)
            if (r2 != r1) goto L57
            goto L63
        L57:
            r0.f6769r = r9     // Catch: java.lang.Throwable -> L6d
            r0.f6770x = r5     // Catch: java.lang.Throwable -> L6d
            r0.D = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r8 = r8.a(r0)     // Catch: java.lang.Throwable -> L6d
            if (r8 != r1) goto L64
        L63:
            return r1
        L64:
            r6 = r9
            r9 = r8
            r8 = r6
        L67:
            eu.d r8 = (eu.d) r8
            r8.f(r5)
            return r9
        L6d:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L71:
            eu.d r8 = (eu.d) r8
            r8.f(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.e1.c(ar.k, rq.c):java.lang.Object");
    }

    @Override // d4.n0
    public final Object d(rq.c cVar) {
        return new Integer(((AtomicInteger) this.f6800b.f2478d).get());
    }

    @Override // d4.n0
    public final zt.f e() {
        return this.f6801c;
    }
}
