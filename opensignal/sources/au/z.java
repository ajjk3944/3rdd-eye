package au;

/* loaded from: classes.dex */
public final class z implements zt.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2354a = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2355d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2356g;

    /* renamed from: r, reason: collision with root package name */
    public final rq.j f2357r;

    /* JADX WARN: Multi-variable type inference failed */
    public z(br.t tVar, zt.g gVar, ar.n nVar) {
        this.f2355d = tVar;
        this.f2356g = gVar;
        this.f2357r = (rq.j) nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r9v6, types: [ar.n, rq.j] */
    @Override // zt.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.lang.Object r8, pq.c r9) {
        /*
            r7 = this;
            int r0 = r7.f2354a
            switch(r0) {
                case 0: goto L8d;
                default: goto L5;
            }
        L5:
            boolean r0 = r9 instanceof zt.p
            if (r0 == 0) goto L18
            r0 = r9
            zt.p r0 = (zt.p) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.D = r1
            goto L1d
        L18:
            zt.p r0 = new zt.p
            r0.<init>(r7, r9)
        L1d:
            java.lang.Object r9 = r0.f27583y
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.D
            r3 = 3
            r4 = 2
            lq.b0 r5 = lq.b0.f15562a
            r6 = 1
            if (r2 == 0) goto L45
            if (r2 == r6) goto L30
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
        L30:
            lf.t1.G(r9)
        L33:
            r1 = r5
            goto L8c
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            java.lang.Object r8 = r0.f27582x
            au.z r2 = r0.f27581r
            lf.t1.G(r9)
            goto L6d
        L45:
            lf.t1.G(r9)
            java.lang.Object r9 = r7.f2355d
            br.t r9 = (br.t) r9
            boolean r9 = r9.f2914a
            if (r9 == 0) goto L5d
            java.lang.Object r9 = r7.f2356g
            zt.g r9 = (zt.g) r9
            r0.D = r6
            java.lang.Object r8 = r9.i(r8, r0)
            if (r8 != r1) goto L33
            goto L8c
        L5d:
            r0.f27581r = r7
            r0.f27582x = r8
            r0.D = r4
            rq.j r9 = r7.f2357r
            java.lang.Object r9 = r9.w(r8, r0)
            if (r9 != r1) goto L6c
            goto L8c
        L6c:
            r2 = r7
        L6d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L33
            java.lang.Object r9 = r2.f2355d
            br.t r9 = (br.t) r9
            r9.f2914a = r6
            java.lang.Object r9 = r2.f2356g
            zt.g r9 = (zt.g) r9
            r2 = 0
            r0.f27581r = r2
            r0.f27582x = r2
            r0.D = r3
            java.lang.Object r8 = r9.i(r8, r0)
            if (r8 != r1) goto L33
        L8c:
            return r1
        L8d:
            java.lang.Object r0 = r7.f2355d
            pq.h r0 = (pq.h) r0
            rq.j r1 = r7.f2357r
            a8.h r1 = (a8.h) r1
            java.lang.Object r2 = r7.f2356g
            java.lang.Object r8 = au.c.a(r0, r8, r2, r1, r9)
            qq.a r9 = qq.a.COROUTINE_SUSPENDED
            if (r8 != r9) goto La0
            goto La2
        La0:
            lq.b0 r8 = lq.b0.f15562a
        La2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.z.i(java.lang.Object, pq.c):java.lang.Object");
    }

    public z(zt.g gVar, pq.h hVar) {
        this.f2355d = hVar;
        this.f2356g = bu.a.k(hVar);
        this.f2357r = new a8.h(gVar, (pq.c) null, 3);
    }
}
