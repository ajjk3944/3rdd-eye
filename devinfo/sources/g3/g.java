package g3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public int f24468b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f24469c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f24470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f24471e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z3, j jVar, long j, ck.c cVar) {
        super(2, cVar);
        this.f24469c = z3;
        this.f24470d = jVar;
        this.f24471e = j;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        return new g(this.f24469c, this.f24470d, this.f24471e, cVar);
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r11 == r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r11 == r3) goto L18;
     */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f24468b
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L16
            if (r0 != r1) goto Le
            ci.b.D(r11)
            goto L4c
        Le:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L16:
            ci.b.D(r11)
            r9 = r10
            goto L36
        L1b:
            ci.b.D(r11)
            boolean r11 = r10.f24469c
            g3.j r0 = r10.f24470d
            dk.a r3 = dk.a.f22275a
            if (r11 != 0) goto L3c
            b2.e r4 = r0.f24478a
            r10.f24468b = r2
            r5 = 0
            long r7 = r10.f24471e
            r9 = r10
            java.lang.Object r11 = r4.a(r5, r7, r9)
            if (r11 != r3) goto L36
            goto L4b
        L36:
            d3.p r11 = (d3.p) r11
            r11.getClass()
            goto L51
        L3c:
            r9 = r10
            b2.e r4 = r0.f24478a
            r9.f24468b = r1
            long r5 = r9.f24471e
            r7 = 0
            java.lang.Object r11 = r4.a(r5, r7, r9)
            if (r11 != r3) goto L4c
        L4b:
            return r3
        L4c:
            d3.p r11 = (d3.p) r11
            r11.getClass()
        L51:
            yj.u r11 = yj.u.f37649a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
