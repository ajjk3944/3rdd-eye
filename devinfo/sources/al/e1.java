package al;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e1 extends ek.j implements mk.f {

    /* renamed from: b, reason: collision with root package name */
    public int f506b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ i f507c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1 f509e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, ck.c cVar) {
        super(3, cVar);
        this.f509e = f1Var;
    }

    @Override // mk.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        e1 e1Var = new e1(this.f509e, (ck.c) obj3);
        e1Var.f507c = (i) obj;
        e1Var.f508d = iIntValue;
        return e1Var.invokeSuspend(yj.u.f37649a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r0.c(al.b1.f483a, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (r0.c(al.b1.f485c, r7) != r6) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[PHI: r0
  0x0062: PHI (r0v3 al.i) = (r0v2 al.i), (r0v6 al.i) binds: [B:25:0x005f, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[PHI: r0
  0x0072: PHI (r0v4 al.i) = (r0v3 al.i), (r0v7 al.i) binds: [B:28:0x006f, B:12:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f506b
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            dk.a r6 = dk.a.f22275a
            if (r0 == 0) goto L34
            if (r0 == r5) goto L30
            if (r0 == r4) goto L2a
            if (r0 == r3) goto L24
            if (r0 == r2) goto L1e
            if (r0 != r1) goto L16
            goto L30
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            al.i r0 = r7.f507c
            ci.b.D(r8)
            goto L72
        L24:
            al.i r0 = r7.f507c
            ci.b.D(r8)
            goto L62
        L2a:
            al.i r0 = r7.f507c
            ci.b.D(r8)
            goto L55
        L30:
            ci.b.D(r8)
            goto L80
        L34:
            ci.b.D(r8)
            al.i r0 = r7.f507c
            int r8 = r7.f508d
            if (r8 <= 0) goto L48
            r7.f506b = r5
            al.b1 r8 = al.b1.f483a
            java.lang.Object r8 = r0.c(r8, r7)
            if (r8 != r6) goto L80
            goto L7f
        L48:
            r7.f507c = r0
            r7.f506b = r4
            r4 = 0
            java.lang.Object r8 = xk.x.i(r4, r7)
            if (r8 != r6) goto L55
            goto L7f
        L55:
            r7.f507c = r0
            r7.f506b = r3
            al.b1 r8 = al.b1.f484b
            java.lang.Object r8 = r0.c(r8, r7)
            if (r8 != r6) goto L62
            goto L7f
        L62:
            r7.f507c = r0
            r7.f506b = r2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r8 = xk.x.i(r2, r7)
            if (r8 != r6) goto L72
            goto L7f
        L72:
            r8 = 0
            r7.f507c = r8
            r7.f506b = r1
            al.b1 r8 = al.b1.f485c
            java.lang.Object r8 = r0.c(r8, r7)
            if (r8 != r6) goto L80
        L7f:
            return r6
        L80:
            yj.u r8 = yj.u.f37649a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: al.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
