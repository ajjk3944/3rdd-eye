package zt;

/* loaded from: classes.dex */
public final class k implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b9.e f27560a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d4.o f27561d;

    public k(b9.e eVar, d4.o oVar) {
        this.f27560a = eVar;
        this.f27561d = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // zt.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(zt.g r9, pq.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof zt.j
            if (r0 == 0) goto L13
            r0 = r10
            zt.j r0 = (zt.j) r0
            int r1 = r0.f27557x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27557x = r1
            goto L18
        L13:
            zt.j r0 = new zt.j
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f27556r
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.f27557x
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.B
            au.s r9 = (au.s) r9
            lf.t1.G(r10)     // Catch: java.lang.Throwable -> L32
            goto L7d
        L32:
            r10 = move-exception
            goto L87
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.B
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            lf.t1.G(r10)
            goto La1
        L44:
            zt.g r9 = r0.D
            java.lang.Object r2 = r0.B
            zt.k r2 = (zt.k) r2
            lf.t1.G(r10)     // Catch: java.lang.Throwable -> L4e
            goto L63
        L4e:
            r9 = move-exception
            goto L8d
        L50:
            lf.t1.G(r10)
            b9.e r10 = r8.f27560a     // Catch: java.lang.Throwable -> L8b
            r0.B = r8     // Catch: java.lang.Throwable -> L8b
            r0.D = r9     // Catch: java.lang.Throwable -> L8b
            r0.f27557x = r5     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r10 = r10.l(r9, r0)     // Catch: java.lang.Throwable -> L8b
            if (r10 != r1) goto L62
            goto La0
        L62:
            r2 = r8
        L63:
            au.s r10 = new au.s
            pq.h r4 = r0.f21666d
            br.l.b(r4)
            r10.<init>(r9, r4)
            d4.o r9 = r2.f27561d     // Catch: java.lang.Throwable -> L83
            r0.B = r10     // Catch: java.lang.Throwable -> L83
            r0.D = r6     // Catch: java.lang.Throwable -> L83
            r0.f27557x = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r9 = r9.h(r10, r6, r0)     // Catch: java.lang.Throwable -> L83
            if (r9 != r1) goto L7c
            goto La0
        L7c:
            r9 = r10
        L7d:
            r9.r()
            lq.b0 r9 = lq.b0.f15562a
            return r9
        L83:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L87:
            r9.r()
            throw r10
        L8b:
            r9 = move-exception
            r2 = r8
        L8d:
            zt.q0 r10 = new zt.q0
            r10.<init>(r9)
            d4.o r2 = r2.f27561d
            r0.B = r9
            r0.D = r6
            r0.f27557x = r4
            java.lang.Object r10 = zt.f0.b(r10, r2, r9, r0)
            if (r10 != r1) goto La1
        La0:
            return r1
        La1:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zt.k.l(zt.g, pq.c):java.lang.Object");
    }
}
