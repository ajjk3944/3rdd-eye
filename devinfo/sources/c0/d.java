package c0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2380b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2381c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f2382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2383e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2384f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e0.i iVar, e0.k kVar, boolean z3, a0 a0Var, ck.c cVar) {
        super(2, cVar);
        this.f2383e = iVar;
        this.f2384f = kVar;
        this.f2382d = z3;
        this.g = a0Var;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f2380b) {
            case 0:
                return new d((e0.i) this.f2383e, (e0.k) this.f2384f, this.f2382d, (a0) this.g, cVar);
            default:
                return new d(this.f2382d, (j0.s) this.f2383e, (a0.z) this.f2384f, (s1.b) this.g, cVar);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        xk.v vVar = (xk.v) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f2380b) {
        }
        return ((d) create(vVar, cVar)).invokeSuspend(yj.u.f37649a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r0 == r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a8, code lost:
    
        if (((e0.i) r8).a(r2, r13) == r7) goto L42;
     */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.f2380b
            yj.u r6 = yj.u.f37649a
            java.lang.Object r1 = r13.g
            java.lang.Object r2 = r13.f2384f
            boolean r3 = r13.f2382d
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dk.a r7 = dk.a.f22275a
            java.lang.Object r8 = r13.f2383e
            r9 = 1
            r10 = 2
            switch(r0) {
                case 0: goto L76;
                default: goto L15;
            }
        L15:
            j0.s r8 = (j0.s) r8
            int r0 = r13.f2381c
            r11 = 0
            if (r0 == 0) goto L31
            if (r0 == r9) goto L2d
            if (r0 != r10) goto L27
            ci.b.D(r14)     // Catch: java.lang.Throwable -> L25
            r0 = r14
            goto L68
        L25:
            r0 = move-exception
            goto L70
        L27:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L2d:
            ci.b.D(r14)     // Catch: java.lang.Throwable -> L25
            goto L47
        L31:
            ci.b.D(r14)
            if (r3 == 0) goto L47
            a0.e r0 = r8.f26971p     // Catch: java.lang.Throwable -> L25
            java.lang.Float r3 = new java.lang.Float     // Catch: java.lang.Throwable -> L25
            r5 = 0
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L25
            r13.f2381c = r9     // Catch: java.lang.Throwable -> L25
            java.lang.Object r0 = r0.e(r3, r13)     // Catch: java.lang.Throwable -> L25
            if (r0 != r7) goto L47
            goto L66
        L47:
            a0.e r0 = r8.f26971p     // Catch: java.lang.Throwable -> L25
            r12 = r1
            java.lang.Float r1 = new java.lang.Float     // Catch: java.lang.Throwable -> L25
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L25
            a0.z r2 = (a0.z) r2     // Catch: java.lang.Throwable -> L25
            r3 = r12
            s1.b r3 = (s1.b) r3     // Catch: java.lang.Throwable -> L25
            j0.r r5 = new j0.r     // Catch: java.lang.Throwable -> L25
            r5.<init>(r3, r8, r11)     // Catch: java.lang.Throwable -> L25
            r13.f2381c = r10     // Catch: java.lang.Throwable -> L25
            r3 = r5
            r5 = 4
            r4 = r13
            java.lang.Object r0 = a0.e.c(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L25
            if (r0 != r7) goto L68
        L66:
            r6 = r7
            goto L6f
        L68:
            a0.j r0 = (a0.j) r0     // Catch: java.lang.Throwable -> L25
            int r0 = j0.s.f26957t
            r8.d(r11)
        L6f:
            return r6
        L70:
            int r1 = j0.s.f26957t
            r8.d(r11)
            throw r0
        L76:
            r12 = r1
            r1 = r12
            c0.a0 r1 = (c0.a0) r1
            e0.k r2 = (e0.k) r2
            int r0 = r13.f2381c
            if (r0 == 0) goto L92
            if (r0 == r9) goto L8e
            if (r0 != r10) goto L88
            ci.b.D(r14)
            goto Lac
        L88:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L8e:
            ci.b.D(r14)
            goto La0
        L92:
            ci.b.D(r14)
            long r11 = c0.b0.f2371a
            r13.f2381c = r9
            java.lang.Object r0 = xk.x.i(r11, r13)
            if (r0 != r7) goto La0
            goto Laa
        La0:
            e0.i r8 = (e0.i) r8
            r13.f2381c = r10
            java.lang.Object r0 = r8.a(r2, r13)
            if (r0 != r7) goto Lac
        Laa:
            r6 = r7
            goto Lb3
        Lac:
            if (r3 == 0) goto Lb1
            r1.B = r2
            goto Lb3
        Lb1:
            r1.f2361x = r2
        Lb3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z3, j0.s sVar, a0.z zVar, s1.b bVar, ck.c cVar) {
        super(2, cVar);
        this.f2382d = z3;
        this.f2383e = sVar;
        this.f2384f = zVar;
        this.g = bVar;
    }
}
