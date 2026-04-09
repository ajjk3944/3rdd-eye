package wg;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final p f24514a;

    /* renamed from: b, reason: collision with root package name */
    public final p f24515b;

    public k(p pVar, p pVar2) {
        br.l.e(pVar, "localOverrideSettings");
        br.l.e(pVar2, "remoteSettings");
        this.f24514a = pVar;
        this.f24515b = pVar2;
    }

    public final double a() {
        Double d6 = this.f24514a.d();
        if (d6 != null) {
            double dDoubleValue = d6.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double d10 = this.f24515b.d();
        if (d10 != null) {
            double dDoubleValue2 = d10.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r6.c(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(rq.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof wg.j
            if (r0 == 0) goto L13
            r0 = r6
            wg.j r0 = (wg.j) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            wg.j r0 = new wg.j
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f24512x
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            lf.t1.G(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            wg.k r2 = r0.f24511r
            lf.t1.G(r6)
            goto L49
        L38:
            lf.t1.G(r6)
            r0.f24511r = r5
            r0.B = r4
            wg.p r6 = r5.f24514a
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L48
            goto L56
        L48:
            r2 = r5
        L49:
            wg.p r6 = r2.f24515b
            r2 = 0
            r0.f24511r = r2
            r0.B = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            lq.b0 r6 = lq.b0.f15562a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.k.b(rq.c):java.lang.Object");
    }
}
