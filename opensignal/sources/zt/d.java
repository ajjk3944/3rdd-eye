package zt;

/* loaded from: classes.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27534a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f27535d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ br.w f27536g;

    public d(e eVar, br.w wVar, g gVar) {
        this.f27536g = wVar;
        this.f27535d = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // zt.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.lang.Object r7, pq.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.f27534a
            switch(r0) {
                case 0: goto L52;
                default: goto L5;
            }
        L5:
            boolean r0 = r8 instanceof zt.o
            if (r0 == 0) goto L18
            r0 = r8
            zt.o r0 = (zt.o) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.B = r1
            goto L1d
        L18:
            zt.o r0 = new zt.o
            r0.<init>(r6, r8)
        L1d:
            java.lang.Object r8 = r0.f27577x
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            zt.d r7 = r0.f27576r
            lf.t1.G(r8)     // Catch: java.lang.Throwable -> L2e
            goto L48
        L2e:
            r8 = move-exception
            goto L4d
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            lf.t1.G(r8)
            zt.g r8 = r6.f27535d     // Catch: java.lang.Throwable -> L4b
            r0.f27576r = r6     // Catch: java.lang.Throwable -> L4b
            r0.B = r3     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r7 = r8.i(r7, r0)     // Catch: java.lang.Throwable -> L4b
            if (r7 != r1) goto L48
            goto L4a
        L48:
            lq.b0 r1 = lq.b0.f15562a
        L4a:
            return r1
        L4b:
            r8 = move-exception
            r7 = r6
        L4d:
            br.w r7 = r7.f27536g
            r7.f2917a = r8
            throw r8
        L52:
            boolean r0 = r8 instanceof zt.c
            if (r0 == 0) goto L65
            r0 = r8
            zt.c r0 = (zt.c) r0
            int r1 = r0.f27532y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L65
            int r1 = r1 - r2
            r0.f27532y = r1
            goto L6a
        L65:
            zt.c r0 = new zt.c
            r0.<init>(r6, r8)
        L6a:
            java.lang.Object r8 = r0.f27530r
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.f27532y
            lq.b0 r3 = lq.b0.f15562a
            r4 = 1
            if (r2 == 0) goto L84
            if (r2 != r4) goto L7c
            lf.t1.G(r8)
        L7a:
            r1 = r3
            goto La1
        L7c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L84:
            lf.t1.G(r8)
            br.w r8 = r6.f27536g
            java.lang.Object r2 = r8.f2917a
            bu.t r5 = au.c.f2321b
            if (r2 == r5) goto L95
            boolean r2 = br.l.a(r2, r7)
            if (r2 != 0) goto L7a
        L95:
            r8.f2917a = r7
            r0.f27532y = r4
            zt.g r8 = r6.f27535d
            java.lang.Object r7 = r8.i(r7, r0)
            if (r7 != r1) goto L7a
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zt.d.i(java.lang.Object, pq.c):java.lang.Object");
    }

    public d(g gVar, br.w wVar) {
        this.f27535d = gVar;
        this.f27536g = wVar;
    }
}
