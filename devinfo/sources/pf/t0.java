package pf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t0 implements q0 {

    /* renamed from: f, reason: collision with root package name */
    public static final double f31897f = Math.random();
    public static final /* synthetic */ int g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final wd.f f31898a;

    /* renamed from: b, reason: collision with root package name */
    public final df.d f31899b;

    /* renamed from: c, reason: collision with root package name */
    public final sf.j f31900c;

    /* renamed from: d, reason: collision with root package name */
    public final l f31901d;

    /* renamed from: e, reason: collision with root package name */
    public final ck.h f31902e;

    public t0(wd.f fVar, df.d dVar, sf.j jVar, l lVar, ck.h hVar) {
        nk.k.e(fVar, "firebaseApp");
        nk.k.e(dVar, "firebaseInstallations");
        nk.k.e(jVar, "sessionSettings");
        nk.k.e(lVar, "eventGDTLogger");
        nk.k.e(hVar, "backgroundDispatcher");
        this.f31898a = fVar;
        this.f31899b = dVar;
        this.f31900c = jVar;
        this.f31901d = lVar;
        this.f31902e = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (r7.b(r0) == r5) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(pf.t0 r6, ek.c r7) {
        /*
            boolean r0 = r7 instanceof pf.s0
            if (r0 == 0) goto L13
            r0 = r7
            pf.s0 r0 = (pf.s0) r0
            int r1 = r0.f31895d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31895d = r1
            goto L18
        L13:
            pf.s0 r0 = new pf.s0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f31893b
            int r1 = r0.f31895d
            r2 = 2
            r3 = 1
            java.lang.String r4 = "FirebaseSessions"
            dk.a r5 = dk.a.f22275a
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            pf.t0 r6 = r0.f31892a
            ci.b.D(r7)
            goto L87
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            pf.t0 r6 = r0.f31892a
            ci.b.D(r7)
            goto L4c
        L3c:
            ci.b.D(r7)
            qf.c r7 = qf.c.f32296a
            r0.f31892a = r6
            r0.f31895d = r3
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r5) goto L4c
            goto L86
        L4c:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Collection r7 = r7.values()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r1 = r7 instanceof java.util.Collection
            if (r1 == 0) goto L62
            r1 = r7
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L62
            goto Lc3
        L62:
            java.util.Iterator r7 = r7.iterator()
        L66:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lc3
            java.lang.Object r1 = r7.next()
            je.j r1 = (je.j) r1
            je.t r1 = r1.f27557a
            boolean r1 = r1.f()
            if (r1 == 0) goto L66
            sf.j r7 = r6.f31900c
            r0.f31892a = r6
            r0.f31895d = r2
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r5) goto L87
        L86:
            return r5
        L87:
            sf.j r7 = r6.f31900c
            sf.o r0 = r7.f33587a
            java.lang.Boolean r0 = r0.a()
            if (r0 == 0) goto L96
            boolean r3 = r0.booleanValue()
            goto La2
        L96:
            sf.o r7 = r7.f33588b
            java.lang.Boolean r7 = r7.a()
            if (r7 == 0) goto La2
            boolean r3 = r7.booleanValue()
        La2:
            if (r3 != 0) goto Lac
            java.lang.String r6 = "Sessions SDK disabled through settings API. Events will not be sent."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        Lac:
            sf.j r6 = r6.f31900c
            double r6 = r6.a()
            double r0 = pf.t0.f31897f
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto Lbb
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        Lbb:
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        Lc3:
            java.lang.String r6 = "Sessions SDK disabled through data collection. Events will not be sent."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.t0.a(pf.t0, ek.c):java.lang.Object");
    }
}
