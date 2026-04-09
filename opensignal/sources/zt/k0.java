package zt;

/* loaded from: classes.dex */
public final class k0 extends rq.j implements ar.o {
    public /* synthetic */ int B;
    public final /* synthetic */ l0 D;

    /* renamed from: x, reason: collision with root package name */
    public int f27562x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ g f27563y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l0 l0Var, pq.c cVar) {
        super(3, cVar);
        this.D = l0Var;
    }

    @Override // ar.o
    public final Object h(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        k0 k0Var = new k0(this.D, (pq.c) obj3);
        k0Var.f27563y = (g) obj;
        k0Var.B = iIntValue;
        return k0Var.q(lq.b0.f15562a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r1.i(r8, r7) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (r1.i(r8, r7) != r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[PHI: r1
  0x0062: PHI (r1v3 zt.g) = (r1v2 zt.g), (r1v6 zt.g) binds: [B:25:0x005f, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[PHI: r1
  0x0072: PHI (r1v4 zt.g) = (r1v3 zt.g), (r1v7 zt.g) binds: [B:28:0x006f, B:12:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // rq.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(java.lang.Object r8) {
        /*
            r7 = this;
            qq.a r0 = qq.a.COROUTINE_SUSPENDED
            int r1 = r7.f27562x
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L34
            if (r1 == r6) goto L30
            if (r1 == r5) goto L2a
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            goto L30
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            zt.g r1 = r7.f27563y
            lf.t1.G(r8)
            goto L72
        L24:
            zt.g r1 = r7.f27563y
            lf.t1.G(r8)
            goto L62
        L2a:
            zt.g r1 = r7.f27563y
            lf.t1.G(r8)
            goto L55
        L30:
            lf.t1.G(r8)
            goto L80
        L34:
            lf.t1.G(r8)
            zt.g r1 = r7.f27563y
            int r8 = r7.B
            if (r8 <= 0) goto L48
            zt.h0 r8 = zt.h0.START
            r7.f27562x = r6
            java.lang.Object r8 = r1.i(r8, r7)
            if (r8 != r0) goto L80
            goto L7f
        L48:
            r7.f27563y = r1
            r7.f27562x = r5
            r5 = 0
            java.lang.Object r8 = wt.w.h(r5, r7)
            if (r8 != r0) goto L55
            goto L7f
        L55:
            zt.h0 r8 = zt.h0.STOP
            r7.f27563y = r1
            r7.f27562x = r4
            java.lang.Object r8 = r1.i(r8, r7)
            if (r8 != r0) goto L62
            goto L7f
        L62:
            r7.f27563y = r1
            r7.f27562x = r3
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r8 = wt.w.h(r3, r7)
            if (r8 != r0) goto L72
            goto L7f
        L72:
            zt.h0 r8 = zt.h0.STOP_AND_RESET_REPLAY_CACHE
            r3 = 0
            r7.f27563y = r3
            r7.f27562x = r2
            java.lang.Object r8 = r1.i(r8, r7)
            if (r8 != r0) goto L80
        L7f:
            return r0
        L80:
            lq.b0 r8 = lq.b0.f15562a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zt.k0.q(java.lang.Object):java.lang.Object");
    }
}
