package sf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final o f33587a;

    /* renamed from: b, reason: collision with root package name */
    public final o f33588b;

    public j(o oVar, o oVar2) {
        nk.k.e(oVar, "localOverrideSettings");
        nk.k.e(oVar2, "remoteSettings");
        this.f33587a = oVar;
        this.f33588b = oVar2;
    }

    public final double a() {
        Double d10 = this.f33587a.d();
        if (d10 != null) {
            double dDoubleValue = d10.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double d11 = this.f33588b.d();
        if (d11 != null) {
            double dDoubleValue2 = d11.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r6.b(r0) == r4) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(ek.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof sf.i
            if (r0 == 0) goto L13
            r0 = r6
            sf.i r0 = (sf.i) r0
            int r1 = r0.f33586d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33586d = r1
            goto L18
        L13:
            sf.i r0 = new sf.i
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f33584b
            int r1 = r0.f33586d
            r2 = 2
            r3 = 1
            dk.a r4 = dk.a.f22275a
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            ci.b.D(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            sf.j r1 = r0.f33583a
            ci.b.D(r6)
            goto L49
        L38:
            ci.b.D(r6)
            r0.f33583a = r5
            r0.f33586d = r3
            sf.o r6 = r5.f33587a
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r4) goto L48
            goto L56
        L48:
            r1 = r5
        L49:
            sf.o r6 = r1.f33588b
            r1 = 0
            r0.f33583a = r1
            r0.f33586d = r2
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r4) goto L57
        L56:
            return r4
        L57:
            yj.u r6 = yj.u.f37649a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sf.j.b(ek.c):java.lang.Object");
    }
}
