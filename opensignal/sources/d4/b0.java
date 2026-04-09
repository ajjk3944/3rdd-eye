package d4;

/* loaded from: classes.dex */
public final class b0 extends rq.j implements ar.n {
    public /* synthetic */ Object B;
    public final /* synthetic */ br.u D;
    public final /* synthetic */ c0 E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ boolean G;

    /* renamed from: x, reason: collision with root package name */
    public br.u f6767x;

    /* renamed from: y, reason: collision with root package name */
    public int f6768y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(br.u uVar, c0 c0Var, Object obj, boolean z10, pq.c cVar) {
        super(2, cVar);
        this.D = uVar;
        this.E = c0Var;
        this.F = obj;
        this.G = z10;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        b0 b0Var = new b0(this.D, this.E, this.F, this.G, cVar);
        b0Var.B = obj;
        return b0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r6.b(r2, r7) == r0) goto L16;
     */
    @Override // rq.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(java.lang.Object r8) {
        /*
            r7 = this;
            qq.a r0 = qq.a.COROUTINE_SUSPENDED
            int r1 = r7.f6768y
            java.lang.Object r2 = r7.F
            d4.c0 r3 = r7.E
            br.u r4 = r7.D
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L28
            if (r1 == r6) goto L1e
            if (r1 != r5) goto L16
            lf.t1.G(r8)
            goto L59
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            br.u r1 = r7.f6767x
            java.lang.Object r6 = r7.B
            d4.l0 r6 = (d4.l0) r6
            lf.t1.G(r8)
            goto L43
        L28:
            lf.t1.G(r8)
            java.lang.Object r8 = r7.B
            d4.l0 r8 = (d4.l0) r8
            d4.n0 r1 = r3.h()
            r7.B = r8
            r7.f6767x = r4
            r7.f6768y = r6
            java.lang.Object r1 = r1.a(r7)
            if (r1 != r0) goto L40
            goto L58
        L40:
            r6 = r8
            r8 = r1
            r1 = r4
        L43:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r1.f2915a = r8
            r8 = 0
            r7.B = r8
            r7.f6767x = r8
            r7.f6768y = r5
            java.lang.Object r8 = r6.b(r2, r7)
            if (r8 != r0) goto L59
        L58:
            return r0
        L59:
            boolean r8 = r7.G
            if (r8 == 0) goto L71
            a2.g r8 = r3.f6781h
            d4.c r0 = new d4.c
            if (r2 == 0) goto L68
            int r1 = r2.hashCode()
            goto L69
        L68:
            r1 = 0
        L69:
            int r3 = r4.f2915a
            r0.<init>(r1, r3, r2)
            r8.k(r0)
        L71:
            lq.b0 r8 = lq.b0.f15562a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.b0.q(java.lang.Object):java.lang.Object");
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        return ((b0) o((l0) obj, (pq.c) obj2)).q(lq.b0.f15562a);
    }
}
