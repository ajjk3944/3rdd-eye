package d4;

/* loaded from: classes.dex */
public final class q implements zt.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6862a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6863d;

    public /* synthetic */ q(int i10, Object obj) {
        this.f6862a = i10;
        this.f6863d = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    @Override // zt.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.lang.Object r5, pq.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            int r0 = r4.f6862a
            switch(r0) {
                case 0: goto L53;
                case 1: goto L36;
                case 2: goto L17;
                default: goto L5;
            }
        L5:
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            java.lang.Object r6 = r4.f6863d
            y1.m1 r6 = (y1.m1) r6
            n0.x1 r6 = r6.f25744a
            r6.m(r5)
            lq.b0 r5 = lq.b0.f15562a
            return r5
        L17:
            tg.f0 r5 = (tg.f0) r5
            java.lang.Object r0 = r4.f6863d
            tg.a1 r0 = (tg.a1) r0
            java.lang.String r1 = "<set-?>"
            br.l.e(r5, r1)
            r0.f22732h = r5
            tg.j0 r5 = r5.f22774a
            java.lang.String r5 = r5.f22806a
            tg.w0 r1 = tg.w0.GENERAL
            java.lang.Object r5 = tg.a1.a(r0, r5, r1, r6)
            qq.a r6 = qq.a.COROUTINE_SUSPENDED
            if (r5 != r6) goto L33
            goto L35
        L33:
            lq.b0 r5 = lq.b0.f15562a
        L35:
            return r5
        L36:
            lq.b0 r5 = (lq.b0) r5
            java.lang.Object r5 = r4.f6863d
            d4.c0 r5 = (d4.c0) r5
            a2.g r0 = r5.f6781h
            d4.f1 r0 = r0.e()
            boolean r0 = r0 instanceof d4.m0
            if (r0 != 0) goto L50
            r0 = 1
            java.lang.Object r5 = d4.c0.f(r5, r0, r6)
            qq.a r6 = qq.a.COROUTINE_SUSPENDED
            if (r5 != r6) goto L50
            goto L52
        L50:
            lq.b0 r5 = lq.b0.f15562a
        L52:
            return r5
        L53:
            boolean r0 = r6 instanceof d4.p
            if (r0 == 0) goto L66
            r0 = r6
            d4.p r0 = (d4.p) r0
            int r1 = r0.f6857x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L66
            int r1 = r1 - r2
            r0.f6857x = r1
            goto L6b
        L66:
            d4.p r0 = new d4.p
            r0.<init>(r4, r6)
        L6b:
            java.lang.Object r6 = r0.f6856r
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.f6857x
            r3 = 1
            if (r2 == 0) goto L82
            if (r2 != r3) goto L7a
            lf.t1.G(r6)
            goto La0
        L7a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L82:
            lf.t1.G(r6)
            java.lang.Object r6 = r4.f6863d
            zt.g r6 = (zt.g) r6
            d4.f1 r5 = (d4.f1) r5
            boolean r2 = r5 instanceof d4.x0
            if (r2 != 0) goto Lba
            boolean r2 = r5 instanceof d4.c
            if (r2 == 0) goto La3
            d4.c r5 = (d4.c) r5
            java.lang.Object r5 = r5.f6772b
            r0.f6857x = r3
            java.lang.Object r5 = r6.i(r5, r0)
            if (r5 != r1) goto La0
            goto La2
        La0:
            lq.b0 r1 = lq.b0.f15562a
        La2:
            return r1
        La3:
            boolean r6 = r5 instanceof d4.m0
            if (r6 == 0) goto La8
            goto Laa
        La8:
            boolean r3 = r5 instanceof d4.g1
        Laa:
            if (r3 == 0) goto Lb4
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r5.<init>(r6)
            throw r5
        Lb4:
            bf.n r5 = new bf.n
            r5.<init>()
            throw r5
        Lba:
            d4.x0 r5 = (d4.x0) r5
            java.lang.Throwable r5 = r5.f6907b
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.q.i(java.lang.Object, pq.c):java.lang.Object");
    }
}
