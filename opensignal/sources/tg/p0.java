package tg;

/* loaded from: classes.dex */
public final class p0 implements m0 {

    /* renamed from: f, reason: collision with root package name */
    public static final double f22827f = Math.random();

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f22828g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final se.f f22829a;

    /* renamed from: b, reason: collision with root package name */
    public final fg.e f22830b;

    /* renamed from: c, reason: collision with root package name */
    public final wg.k f22831c;

    /* renamed from: d, reason: collision with root package name */
    public final l f22832d;

    /* renamed from: e, reason: collision with root package name */
    public final pq.h f22833e;

    public p0(se.f fVar, fg.e eVar, wg.k kVar, l lVar, pq.h hVar) {
        br.l.e(fVar, "firebaseApp");
        br.l.e(eVar, "firebaseInstallations");
        br.l.e(kVar, "sessionSettings");
        br.l.e(lVar, "eventGDTLogger");
        br.l.e(hVar, "backgroundDispatcher");
        this.f22829a = fVar;
        this.f22830b = eVar;
        this.f22831c = kVar;
        this.f22832d = lVar;
        this.f22833e = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (r6.b(r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(tg.p0 r5, rq.c r6) {
        /*
            boolean r0 = r6 instanceof tg.o0
            if (r0 == 0) goto L13
            r0 = r6
            tg.o0 r0 = (tg.o0) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            tg.o0 r0 = new tg.o0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f22825x
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tg.p0 r5 = r0.f22824r
            lf.t1.G(r6)
            goto L85
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            tg.p0 r5 = r0.f22824r
            lf.t1.G(r6)
            goto L4a
        L3a:
            lf.t1.G(r6)
            ug.c r6 = ug.c.f23558a
            r0.f22824r = r5
            r0.B = r4
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L4a
            goto L84
        L4a:
            java.util.Map r6 = (java.util.Map) r6
            java.util.Collection r6 = r6.values()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r2 = r6 instanceof java.util.Collection
            if (r2 == 0) goto L60
            r2 = r6
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L60
            goto Lb7
        L60:
            java.util.Iterator r6 = r6.iterator()
        L64:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto Lb7
            java.lang.Object r2 = r6.next()
            hf.i r2 = (hf.i) r2
            cj.a r2 = r2.f10656a
            boolean r2 = r2.z()
            if (r2 == 0) goto L64
            wg.k r6 = r5.f22831c
            r0.f22824r = r5
            r0.B = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L85
        L84:
            return r1
        L85:
            wg.k r6 = r5.f22831c
            wg.p r0 = r6.f24514a
            java.lang.Boolean r0 = r0.a()
            if (r0 == 0) goto L94
            boolean r4 = r0.booleanValue()
            goto La0
        L94:
            wg.p r6 = r6.f24515b
            java.lang.Boolean r6 = r6.a()
            if (r6 == 0) goto La0
            boolean r4 = r6.booleanValue()
        La0:
            if (r4 != 0) goto La5
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        La5:
            wg.k r5 = r5.f22831c
            double r5 = r5.a()
            double r0 = tg.p0.f22827f
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto Lb4
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        Lb4:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        Lb7:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.p0.a(tg.p0, rq.c):java.lang.Object");
    }
}
