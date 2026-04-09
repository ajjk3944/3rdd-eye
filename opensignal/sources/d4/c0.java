package d4;

import java.util.List;

/* loaded from: classes.dex */
public final class c0 implements g {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f6774a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.g f6775b;

    /* renamed from: c, reason: collision with root package name */
    public final wt.t f6776c;

    /* renamed from: d, reason: collision with root package name */
    public final z7.j f6777d;

    /* renamed from: f, reason: collision with root package name */
    public int f6779f;

    /* renamed from: g, reason: collision with root package name */
    public wt.z f6780g;

    /* renamed from: i, reason: collision with root package name */
    public final kg.r f6782i;
    public final lq.q j;
    public final lq.q k;

    /* renamed from: l, reason: collision with root package name */
    public final kg.r f6783l;

    /* renamed from: e, reason: collision with root package name */
    public final eu.d f6778e = eu.e.a();

    /* renamed from: h, reason: collision with root package name */
    public final a2.g f6781h = new a2.g(11);

    public c0(g0 g0Var, List list, a2.g gVar, wt.t tVar) {
        this.f6774a = g0Var;
        this.f6775b = gVar;
        this.f6776c = tVar;
        pq.c cVar = null;
        this.f6777d = new z7.j(new au.e(this, cVar, 2));
        kg.r rVar = new kg.r();
        rVar.f14398r = this;
        rVar.f14395a = eu.e.a();
        rVar.f14396d = wt.w.a();
        rVar.f14397g = mq.o.Q0(list);
        this.f6782i = rVar;
        this.j = kc.f.F(new l(this, 1));
        this.k = kc.f.F(new l(this, 0));
        as.d dVar = new as.d(6, this);
        a8.h hVar = new a8.h(this, cVar, 7);
        kg.r rVar2 = new kg.r();
        rVar2.f14395a = tVar;
        rVar2.f14396d = hVar;
        rVar2.f14397g = a.a.b(Integer.MAX_VALUE, 6, null);
        rVar2.f14398r = new b9.c(13);
        wt.t0 t0Var = (wt.t0) tVar.getCoroutineContext().Y(wt.r.f24653d);
        if (t0Var != null) {
            t0Var.R(new c7.b(dVar, 2, rVar2));
        }
        this.f6783l = rVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(d4.c0 r4, rq.c r5) {
        /*
            boolean r0 = r5 instanceof d4.r
            if (r0 == 0) goto L13
            r0 = r5
            d4.r r0 = (d4.r) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            d4.r r0 = new d4.r
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f6868y
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.D
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            eu.d r4 = r0.f6867x
            d4.c0 r0 = r0.f6866r
            lf.t1.G(r5)
            r5 = r4
            r4 = r0
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            lf.t1.G(r5)
            eu.d r5 = r4.f6778e
            r0.f6866r = r4
            r0.f6867x = r5
            r0.D = r3
            java.lang.Object r0 = r5.d(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = 0
            int r1 = r4.f6779f     // Catch: java.lang.Throwable -> L58
            int r1 = r1 + (-1)
            r4.f6779f = r1     // Catch: java.lang.Throwable -> L58
            if (r1 != 0) goto L5c
            wt.z r1 = r4.f6780g     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L5a
            r1.h(r0)     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r4 = move-exception
            goto L62
        L5a:
            r4.f6780g = r0     // Catch: java.lang.Throwable -> L58
        L5c:
            r5.f(r0)
            lq.b0 r4 = lq.b0.f15562a
            return r4
        L62:
            r5.f(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.c0.c(d4.c0, rq.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(0)|8|(8:68|(1:(1:(2:18|19))(3:20|21|22))|13|14|62|(1:64)(1:65)|66|67)(5:23|73|24|(3:26|71|27)(3:37|(1:39)(1:40)|(2:42|(2:44|(1:46))(2:53|54))(2:55|(2:57|58)(2:59|60)))|50)|47|69|48|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r9 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b5, code lost:
    
        if (r9 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b8, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v3, types: [ar.n, rq.j] */
    /* JADX WARN: Type inference failed for: r2v9, types: [ar.n, rq.j] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(d4.c0 r9, d4.o0 r10, rq.c r11) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.c0.d(d4.c0, d4.o0, rq.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(d4.c0 r4, rq.c r5) {
        /*
            boolean r0 = r5 instanceof d4.t
            if (r0 == 0) goto L13
            r0 = r5
            d4.t r0 = (d4.t) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            d4.t r0 = new d4.t
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f6879y
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.D
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            eu.d r4 = r0.f6878x
            d4.c0 r0 = r0.f6877r
            lf.t1.G(r5)
            r5 = r4
            r4 = r0
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            lf.t1.G(r5)
            eu.d r5 = r4.f6778e
            r0.f6877r = r4
            r0.f6878x = r5
            r0.D = r3
            java.lang.Object r0 = r5.d(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = 0
            int r1 = r4.f6779f     // Catch: java.lang.Throwable -> L5f
            int r1 = r1 + r3
            r4.f6779f = r1     // Catch: java.lang.Throwable -> L5f
            if (r1 != r3) goto L61
            wt.t r1 = r4.f6776c     // Catch: java.lang.Throwable -> L5f
            d4.m r2 = new d4.m     // Catch: java.lang.Throwable -> L5f
            r3 = 1
            r2.<init>(r4, r0, r3)     // Catch: java.lang.Throwable -> L5f
            r3 = 3
            wt.z r1 = wt.w.s(r1, r0, r0, r2, r3)     // Catch: java.lang.Throwable -> L5f
            r4.f6780g = r1     // Catch: java.lang.Throwable -> L5f
            goto L61
        L5f:
            r4 = move-exception
            goto L67
        L61:
            r5.f(r0)
            lq.b0 r4 = lq.b0.f15562a
            return r4
        L67:
            r5.f(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.c0.e(d4.c0, rq.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(d4.c0 r8, boolean r9, pq.c r10) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.c0.f(d4.c0, boolean, pq.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009f A[Catch: b -> 0x005f, TryCatch #1 {b -> 0x005f, blocks: (B:19:0x005a, B:54:0x00ff, B:24:0x0068, B:51:0x00e0, B:32:0x0085, B:40:0x009f, B:42:0x00a5, B:36:0x008e, B:48:0x00cd), top: B:80:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0140 A[Catch: all -> 0x016d, TryCatch #3 {all -> 0x016d, blocks: (B:61:0x012e, B:63:0x0140, B:64:0x0148), top: B:83:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0148 A[Catch: all -> 0x016d, TRY_LEAVE, TryCatch #3 {all -> 0x016d, blocks: (B:61:0x012e, B:63:0x0140, B:64:0x0148), top: B:83:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(d4.c0 r9, boolean r10, rq.c r11) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.c0.g(d4.c0, boolean, rq.c):java.lang.Object");
    }

    @Override // d4.g
    public final zt.f a() {
        return this.f6777d;
    }

    @Override // d4.g
    public final Object b(ar.n nVar, rq.c cVar) {
        j1 j1Var = (j1) cVar.m().Y(i1.f6825a);
        if (j1Var != null) {
            j1Var.a(this);
        }
        return wt.w.B(new j1(j1Var, this), new au.e(this, nVar, (pq.c) null), cVar);
    }

    public final n0 h() {
        return (n0) this.k.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r4.u(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(rq.c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof d4.u
            if (r0 == 0) goto L13
            r0 = r6
            d4.u r0 = (d4.u) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            d4.u r0 = new d4.u
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f6885y
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.D
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r1 = r0.f6884x
            d4.c0 r0 = r0.f6883r
            lf.t1.G(r6)     // Catch: java.lang.Throwable -> L2e
            goto L66
        L2e:
            r6 = move-exception
            goto L6d
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            d4.c0 r2 = r0.f6883r
            lf.t1.G(r6)
            goto L51
        L3e:
            lf.t1.G(r6)
            d4.n0 r6 = r5.h()
            r0.f6883r = r5
            r0.D = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L50
            goto L65
        L50:
            r2 = r5
        L51:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            kg.r r4 = r2.f6782i     // Catch: java.lang.Throwable -> L69
            r0.f6883r = r2     // Catch: java.lang.Throwable -> L69
            r0.f6884x = r6     // Catch: java.lang.Throwable -> L69
            r0.D = r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r6 = r4.u(r0)     // Catch: java.lang.Throwable -> L69
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            lq.b0 r6 = lq.b0.f15562a
            return r6
        L69:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L6d:
            a2.g r0 = r0.f6781h
            d4.x0 r2 = new d4.x0
            r2.<init>(r6, r1)
            r0.k(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.c0.i(rq.c):java.lang.Object");
    }

    public final Object j(rq.c cVar) {
        return ((j0) this.j.getValue()).a(new o(3, (pq.c) null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(java.lang.Object r11, boolean r12, rq.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof d4.a0
            if (r0 == 0) goto L13
            r0 = r13
            d4.a0 r0 = (d4.a0) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            d4.a0 r0 = new d4.a0
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f6763x
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            br.u r11 = r0.f6762r
            lf.t1.G(r13)
            goto L56
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            lf.t1.G(r13)
            br.u r5 = new br.u
            r5.<init>()
            lq.q r13 = r10.j
            java.lang.Object r13 = r13.getValue()
            d4.j0 r13 = (d4.j0) r13
            d4.b0 r4 = new d4.b0
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f6762r = r5
            r0.B = r3
            java.lang.Object r11 = r13.b(r4, r0)
            if (r11 != r1) goto L55
            return r1
        L55:
            r11 = r5
        L56:
            int r11 = r11.f2915a
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.c0.k(java.lang.Object, boolean, rq.c):java.lang.Object");
    }
}
