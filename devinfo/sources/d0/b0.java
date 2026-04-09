package d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b0 extends ek.i implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public int f21673a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21674b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nm.g f21675c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nm.h f21676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nm.h f21677e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mk.e f21678f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(nm.g gVar, nm.h hVar, nm.h hVar2, mk.e eVar, ck.c cVar) {
        super(2, cVar);
        this.f21675c = gVar;
        this.f21676d = hVar;
        this.f21677e = hVar2;
        this.f21678f = eVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        b0 b0Var = new b0(this.f21675c, this.f21676d, this.f21677e, this.f21678f, cVar);
        b0Var.f21674b = obj;
        return b0Var;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((c2.k0) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        if (r14 == r5) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b A[Catch: CancellationException -> 0x001a, TryCatch #0 {CancellationException -> 0x001a, blocks: (B:8:0x0015, B:32:0x009d, B:34:0x00a5, B:36:0x00b2, B:38:0x00be, B:39:0x00c1, B:40:0x00c4, B:41:0x00ca, B:15:0x0029, B:27:0x0057, B:29:0x005b, B:18:0x0031, B:24:0x0048, B:21:0x003d), top: B:46:0x0009 }] */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.f21673a
            nm.h r1 = r13.f21677e
            r2 = 3
            r3 = 2
            r4 = 1
            dk.a r5 = dk.a.f22275a
            if (r0 == 0) goto L35
            if (r0 == r4) goto L2d
            if (r0 == r3) goto L25
            if (r0 != r2) goto L1d
            java.lang.Object r0 = r13.f21674b
            c2.k0 r0 = (c2.k0) r0
            ci.b.D(r14)     // Catch: java.util.concurrent.CancellationException -> L1a
            goto L9d
        L1a:
            r14 = move-exception
            goto Ld0
        L1d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L25:
            java.lang.Object r0 = r13.f21674b
            c2.k0 r0 = (c2.k0) r0
            ci.b.D(r14)     // Catch: java.util.concurrent.CancellationException -> L1a
            goto L57
        L2d:
            java.lang.Object r0 = r13.f21674b
            c2.k0 r0 = (c2.k0) r0
            ci.b.D(r14)     // Catch: java.util.concurrent.CancellationException -> L1a
            goto L48
        L35:
            ci.b.D(r14)
            java.lang.Object r14 = r13.f21674b
            r0 = r14
            c2.k0 r0 = (c2.k0) r0
            r13.f21674b = r0     // Catch: java.util.concurrent.CancellationException -> L1a
            r13.f21673a = r4     // Catch: java.util.concurrent.CancellationException -> L1a
            java.lang.Object r14 = d0.b2.b(r0, r13, r3)     // Catch: java.util.concurrent.CancellationException -> L1a
            if (r14 != r5) goto L48
            goto L9c
        L48:
            c2.p r14 = (c2.p) r14     // Catch: java.util.concurrent.CancellationException -> L1a
            long r6 = r14.f2658a     // Catch: java.util.concurrent.CancellationException -> L1a
            r13.f21674b = r0     // Catch: java.util.concurrent.CancellationException -> L1a
            r13.f21673a = r3     // Catch: java.util.concurrent.CancellationException -> L1a
            java.lang.Object r14 = d0.d0.b(r0, r6, r13)     // Catch: java.util.concurrent.CancellationException -> L1a
            if (r14 != r5) goto L57
            goto L9c
        L57:
            c2.p r14 = (c2.p) r14     // Catch: java.util.concurrent.CancellationException -> L1a
            if (r14 == 0) goto Lcd
            nm.g r3 = r13.f21675c     // Catch: java.util.concurrent.CancellationException -> L1a
            long r6 = r14.f2660c     // Catch: java.util.concurrent.CancellationException -> L1a
            u0.u0 r4 = r3.f30040b     // Catch: java.util.concurrent.CancellationException -> L1a
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.util.concurrent.CancellationException -> L1a
            r4.setValue(r8)     // Catch: java.util.concurrent.CancellationException -> L1a
            u0.u0 r4 = r3.f30042d     // Catch: java.util.concurrent.CancellationException -> L1a
            e0.b r8 = new e0.b     // Catch: java.util.concurrent.CancellationException -> L1a
            r8.<init>()     // Catch: java.util.concurrent.CancellationException -> L1a
            xk.v r9 = r3.f30041c     // Catch: java.util.concurrent.CancellationException -> L1a
            nm.e r10 = new nm.e     // Catch: java.util.concurrent.CancellationException -> L1a
            r11 = 1
            r12 = 0
            r10.<init>(r8, r12, r11)     // Catch: java.util.concurrent.CancellationException -> L1a
            xk.x.v(r9, r12, r12, r10, r2)     // Catch: java.util.concurrent.CancellationException -> L1a
            r4.setValue(r8)     // Catch: java.util.concurrent.CancellationException -> L1a
            yj.c r3 = r3.f30043e     // Catch: java.util.concurrent.CancellationException -> L1a
            mk.c r3 = (mk.c) r3     // Catch: java.util.concurrent.CancellationException -> L1a
            o1.b r4 = new o1.b     // Catch: java.util.concurrent.CancellationException -> L1a
            r4.<init>(r6)     // Catch: java.util.concurrent.CancellationException -> L1a
            r3.invoke(r4)     // Catch: java.util.concurrent.CancellationException -> L1a
            long r3 = r14.f2658a     // Catch: java.util.concurrent.CancellationException -> L1a
            mk.e r14 = r13.f21678f     // Catch: java.util.concurrent.CancellationException -> L1a
            a0.r0 r6 = new a0.r0     // Catch: java.util.concurrent.CancellationException -> L1a
            r7 = 1
            r6.<init>(r7, r14)     // Catch: java.util.concurrent.CancellationException -> L1a
            r13.f21674b = r0     // Catch: java.util.concurrent.CancellationException -> L1a
            r13.f21673a = r2     // Catch: java.util.concurrent.CancellationException -> L1a
            java.lang.Object r14 = d0.d0.c(r0, r3, r6, r13)     // Catch: java.util.concurrent.CancellationException -> L1a
            if (r14 != r5) goto L9d
        L9c:
            return r5
        L9d:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.util.concurrent.CancellationException -> L1a
            boolean r14 = r14.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L1a
            if (r14 == 0) goto Lca
            c2.m0 r14 = r0.f2643f     // Catch: java.util.concurrent.CancellationException -> L1a
            c2.j r14 = r14.f2651s     // Catch: java.util.concurrent.CancellationException -> L1a
            java.lang.Object r14 = r14.f2626a     // Catch: java.util.concurrent.CancellationException -> L1a
            int r0 = r14.size()     // Catch: java.util.concurrent.CancellationException -> L1a
            r2 = 0
        Lb0:
            if (r2 >= r0) goto Lc4
            java.lang.Object r3 = r14.get(r2)     // Catch: java.util.concurrent.CancellationException -> L1a
            c2.p r3 = (c2.p) r3     // Catch: java.util.concurrent.CancellationException -> L1a
            boolean r4 = c2.h0.b(r3)     // Catch: java.util.concurrent.CancellationException -> L1a
            if (r4 == 0) goto Lc1
            r3.a()     // Catch: java.util.concurrent.CancellationException -> L1a
        Lc1:
            int r2 = r2 + 1
            goto Lb0
        Lc4:
            nm.h r14 = r13.f21676d     // Catch: java.util.concurrent.CancellationException -> L1a
            r14.invoke()     // Catch: java.util.concurrent.CancellationException -> L1a
            goto Lcd
        Lca:
            r1.invoke()     // Catch: java.util.concurrent.CancellationException -> L1a
        Lcd:
            yj.u r14 = yj.u.f37649a
            return r14
        Ld0:
            r1.invoke()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
