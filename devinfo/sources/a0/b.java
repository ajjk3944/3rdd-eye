package a0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends ek.j implements mk.c {

    /* renamed from: b, reason: collision with root package name */
    public m f9b;

    /* renamed from: c, reason: collision with root package name */
    public nk.q f10c;

    /* renamed from: d, reason: collision with root package name */
    public int f11d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f12e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13f;
    public final /* synthetic */ t0 g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f14h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ mk.c f15i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, Object obj, t0 t0Var, long j, mk.c cVar, ck.c cVar2) {
        super(1, cVar2);
        this.f12e = eVar;
        this.f13f = obj;
        this.g = t0Var;
        this.f14h = j;
        this.f15i = cVar;
    }

    @Override // ek.a
    public final ck.c create(ck.c cVar) {
        return new b(this.f12e, this.f13f, this.g, this.f14h, this.f15i, cVar);
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        return ((b) create((ck.c) obj)).invokeSuspend(yj.u.f37649a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008a A[Catch: CancellationException -> 0x008d, TryCatch #0 {CancellationException -> 0x008d, blocks: (B:21:0x0086, B:23:0x008a, B:27:0x0091, B:26:0x008f, B:16:0x0070), top: B:33:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f A[Catch: CancellationException -> 0x008d, TryCatch #0 {CancellationException -> 0x008d, blocks: (B:21:0x0086, B:23:0x008a, B:27:0x0091, B:26:0x008f, B:16:0x0070), top: B:33:0x0070 }] */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            a0.t0 r1 = r14.g
            int r0 = r14.f11d
            r2 = 1
            a0.e r4 = r14.f12e
            if (r0 == 0) goto L22
            if (r0 != r2) goto L1a
            nk.q r0 = r14.f10c
            a0.m r1 = r14.f9b
            ci.b.D(r15)     // Catch: java.util.concurrent.CancellationException -> L15
            r15 = r4
            goto L86
        L15:
            r0 = move-exception
            r15 = r0
        L17:
            r15 = r4
            goto L9d
        L1a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L22:
            ci.b.D(r15)
            a0.m r15 = r4.f29c     // Catch: java.util.concurrent.CancellationException -> L9a
            y4.a r0 = r4.f27a     // Catch: java.util.concurrent.CancellationException -> L9a
            java.lang.Object r0 = r0.f37323a     // Catch: java.util.concurrent.CancellationException -> L9a
            mk.c r0 = (mk.c) r0     // Catch: java.util.concurrent.CancellationException -> L9a
            java.lang.Object r3 = r14.f13f     // Catch: java.util.concurrent.CancellationException -> L9a
            java.lang.Object r0 = r0.invoke(r3)     // Catch: java.util.concurrent.CancellationException -> L9a
            a0.r r0 = (a0.r) r0     // Catch: java.util.concurrent.CancellationException -> L9a
            r15.f82c = r0     // Catch: java.util.concurrent.CancellationException -> L9a
            java.lang.Object r15 = r1.f126c     // Catch: java.util.concurrent.CancellationException -> L9a
            u0.d1 r0 = r4.f31e     // Catch: java.util.concurrent.CancellationException -> L9a
            r0.setValue(r15)     // Catch: java.util.concurrent.CancellationException -> L9a
            u0.d1 r15 = r4.f30d     // Catch: java.util.concurrent.CancellationException -> L9a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.util.concurrent.CancellationException -> L9a
            r15.setValue(r0)     // Catch: java.util.concurrent.CancellationException -> L9a
            a0.m r15 = r4.f29c     // Catch: java.util.concurrent.CancellationException -> L9a
            u0.d1 r0 = r15.f81b     // Catch: java.util.concurrent.CancellationException -> L9a
            java.lang.Object r7 = r0.getValue()     // Catch: java.util.concurrent.CancellationException -> L9a
            a0.r r0 = r15.f82c     // Catch: java.util.concurrent.CancellationException -> L9a
            a0.r r8 = a0.f.g(r0)     // Catch: java.util.concurrent.CancellationException -> L9a
            long r9 = r15.f83d     // Catch: java.util.concurrent.CancellationException -> L9a
            boolean r13 = r15.f85f     // Catch: java.util.concurrent.CancellationException -> L9a
            a0.m r5 = new a0.m     // Catch: java.util.concurrent.CancellationException -> L9a
            y4.a r6 = r15.f80a     // Catch: java.util.concurrent.CancellationException -> L9a
            r11 = -9223372036854775808
            r5.<init>(r6, r7, r8, r9, r11, r13)     // Catch: java.util.concurrent.CancellationException -> L9a
            nk.q r7 = new nk.q     // Catch: java.util.concurrent.CancellationException -> L9a
            r7.<init>()     // Catch: java.util.concurrent.CancellationException -> L9a
            long r9 = r14.f14h     // Catch: java.util.concurrent.CancellationException -> L9a
            mk.c r6 = r14.f15i     // Catch: java.util.concurrent.CancellationException -> L9a
            a0.a r3 = new a0.a     // Catch: java.util.concurrent.CancellationException -> L9a
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.util.concurrent.CancellationException -> L9a
            r15 = r4
            r14.f9b = r5     // Catch: java.util.concurrent.CancellationException -> L8d
            r14.f10c = r7     // Catch: java.util.concurrent.CancellationException -> L8d
            r14.f11d = r2     // Catch: java.util.concurrent.CancellationException -> L8d
            r4 = r3
            r0 = r5
            r2 = r9
            r5 = r14
            java.lang.Object r1 = a0.f.c(r0, r1, r2, r4, r5)     // Catch: java.util.concurrent.CancellationException -> L8d
            r5 = r0
            dk.a r0 = dk.a.f22275a
            if (r1 != r0) goto L84
            return r0
        L84:
            r1 = r5
            r0 = r7
        L86:
            boolean r0 = r0.f29982a     // Catch: java.util.concurrent.CancellationException -> L8d
            if (r0 == 0) goto L8f
            a0.i r0 = a0.i.f61a     // Catch: java.util.concurrent.CancellationException -> L8d
            goto L91
        L8d:
            r0 = move-exception
            goto L9d
        L8f:
            a0.i r0 = a0.i.f62b     // Catch: java.util.concurrent.CancellationException -> L8d
        L91:
            a0.e.b(r15)     // Catch: java.util.concurrent.CancellationException -> L8d
            a0.j r2 = new a0.j     // Catch: java.util.concurrent.CancellationException -> L8d
            r2.<init>(r1, r0)     // Catch: java.util.concurrent.CancellationException -> L8d
            return r2
        L9a:
            r0 = move-exception
            goto L17
        L9d:
            a0.e.b(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
