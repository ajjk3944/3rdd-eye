package tg;

import java.util.Map;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final wg.k f22725a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f22726b;

    /* renamed from: c, reason: collision with root package name */
    public final m0 f22727c;

    /* renamed from: d, reason: collision with root package name */
    public final e1 f22728d;

    /* renamed from: e, reason: collision with root package name */
    public final d4.g f22729e;

    /* renamed from: f, reason: collision with root package name */
    public final a0 f22730f;

    /* renamed from: g, reason: collision with root package name */
    public final pq.h f22731g;

    /* renamed from: h, reason: collision with root package name */
    public f0 f22732h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f22733i;
    public String j;

    public a1(wg.k kVar, q0 q0Var, m0 m0Var, e1 e1Var, d4.g gVar, a0 a0Var, pq.h hVar) {
        br.l.e(kVar, "sessionsSettings");
        br.l.e(q0Var, "sessionGenerator");
        br.l.e(m0Var, "sessionFirelogPublisher");
        br.l.e(e1Var, "timeProvider");
        br.l.e(gVar, "sessionDataStore");
        br.l.e(a0Var, "processDataManager");
        br.l.e(hVar, "backgroundDispatcher");
        this.f22725a = kVar;
        this.f22726b = q0Var;
        this.f22727c = m0Var;
        this.f22728d = e1Var;
        this.f22729e = gVar;
        this.f22730f = a0Var;
        this.f22731g = hVar;
        w0 w0Var = w0.GENERAL;
        this.j = "";
        wt.w.s(wt.w.b(hVar), null, null, new v0(this, null, 0), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(tg.a1 r4, java.lang.String r5, tg.w0 r6, pq.c r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof tg.z0
            if (r0 == 0) goto L16
            r0 = r7
            tg.z0 r0 = (tg.z0) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.D = r1
            goto L1b
        L16:
            tg.z0 r0 = new tg.z0
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r7 = r0.f22871y
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.D
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            tg.w0 r6 = r0.f22870x
            java.lang.String r5 = r0.f22869r
            lf.t1.G(r7)
            goto L55
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            lf.t1.G(r7)
            java.lang.String r7 = r4.j
            boolean r7 = br.l.a(r7, r5)
            if (r7 == 0) goto L44
            lq.b0 r4 = lq.b0.f15562a
            return r4
        L44:
            r4.j = r5
            ug.c r4 = ug.c.f23558a
            r0.f22869r = r5
            r0.f22870x = r6
            r0.D = r3
            java.lang.Object r7 = r4.b(r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Collection r4 = r7.values()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L61:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto Lb7
            java.lang.Object r7 = r4.next()
            hf.i r7 = (hf.i) r7
            ug.e r0 = new ug.e
            r0.<init>(r5)
            r7.getClass()
            java.util.Objects.toString(r0)
            r0 = 3
            java.lang.String r1 = "FirebaseCrashlytics"
            android.util.Log.isLoggable(r1, r0)
            hf.h r7 = r7.f10657b
            monitor-enter(r7)
            java.lang.String r0 = r7.f10655c     // Catch: java.lang.Throwable -> L93
            boolean r0 = java.util.Objects.equals(r0, r5)     // Catch: java.lang.Throwable -> L93
            if (r0 != 0) goto L95
            of.b r0 = r7.f10653a     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = r7.f10654b     // Catch: java.lang.Throwable -> L93
            hf.h.a(r0, r1, r5)     // Catch: java.lang.Throwable -> L93
            r7.f10655c = r5     // Catch: java.lang.Throwable -> L93
            goto L95
        L93:
            r4 = move-exception
            goto Lb5
        L95:
            monitor-exit(r7)
            int[] r7 = tg.x0.f22862a
            int r0 = r6.ordinal()
            r7 = r7[r0]
            if (r7 == r3) goto Laf
            r0 = 2
            if (r7 != r0) goto La9
            ug.d r7 = ug.d.CRASHLYTICS
            java.util.Objects.toString(r7)
            goto L61
        La9:
            bf.n r4 = new bf.n
            r4.<init>()
            throw r4
        Laf:
            ug.d r7 = ug.d.CRASHLYTICS
            java.util.Objects.toString(r7)
            goto L61
        Lb5:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L93
            throw r4
        Lb7:
            lq.b0 r4 = lq.b0.f15562a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.a1.a(tg.a1, java.lang.String, tg.w0, pq.c):java.lang.Object");
    }

    public final void b() {
        this.f22733i = false;
        if (this.f22732h == null) {
            return;
        }
        this.f22730f.a();
        wt.w.s(wt.w.b(this.f22731g), null, null, new v0(this, null, 1), 3);
    }

    public final boolean c(f0 f0Var) {
        Map map = f0Var.f22776c;
        boolean z10 = true;
        a0 a0Var = this.f22730f;
        if (map == null) {
            a0Var.a();
            return true;
        }
        a0Var.getClass();
        y yVar = (y) map.get(a0Var.a());
        if (yVar != null && yVar.f22863a == a0Var.f22721c && br.l.a(yVar.f22864b, (String) a0Var.f22722d.getValue())) {
            z10 = false;
        }
        if (z10) {
            a0Var.a();
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(tg.f0 r10) {
        /*
            r9 = this;
            tg.d1 r0 = r10.f22775b
            tg.j0 r10 = r10.f22774a
            r1 = 0
            if (r0 == 0) goto L5c
            tg.e1 r2 = r9.f22728d
            tg.d1 r2 = r2.a()
            int r3 = ut.a.f23695r
            long r2 = r2.f22760a
            long r4 = r0.f22760a
            long r2 = r2 - r4
            ut.c r0 = ut.c.MILLISECONDS
            long r2 = com.google.android.gms.internal.measurement.y3.Q(r2, r0)
            wg.k r0 = r9.f22725a
            wg.p r4 = r0.f24514a
            ut.a r4 = r4.b()
            r5 = 0
            if (r4 == 0) goto L33
            long r7 = r4.f23696a
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 <= 0) goto L33
            boolean r4 = ut.a.f(r7)
            if (r4 != 0) goto L33
            goto L50
        L33:
            wg.p r0 = r0.f24515b
            ut.a r0 = r0.b()
            if (r0 == 0) goto L48
            long r7 = r0.f23696a
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L48
            boolean r0 = ut.a.f(r7)
            if (r0 != 0) goto L48
            goto L50
        L48:
            r0 = 30
            ut.c r4 = ut.c.MINUTES
            long r7 = com.google.android.gms.internal.measurement.y3.P(r0, r4)
        L50:
            int r0 = ut.a.c(r2, r7)
            if (r0 <= 0) goto L57
            r1 = 1
        L57:
            if (r1 == 0) goto L5b
            java.lang.String r10 = r10.f22806a
        L5b:
            return r1
        L5c:
            java.lang.String r10 = r10.f22806a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.a1.d(tg.f0):boolean");
    }
}
