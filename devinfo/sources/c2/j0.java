package c2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j0 extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2630b;

    /* renamed from: c, reason: collision with root package name */
    public int f2631c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f2632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2633e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(long j, k0 k0Var, ck.c cVar) {
        super(2, cVar);
        this.f2630b = 0;
        this.f2632d = j;
        this.f2633e = k0Var;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f2630b) {
            case 0:
                return new j0(this.f2632d, (k0) this.f2633e, cVar);
            case 1:
                return new j0((g3.j) this.f2633e, this.f2632d, cVar, 1);
            default:
                return new j0((nm.e0) this.f2633e, this.f2632d, cVar, 2);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        xk.v vVar = (xk.v) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f2630b) {
        }
        return ((j0) create(vVar, cVar)).invokeSuspend(yj.u.f37649a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        if (a0.e.c(r0, r2, r3, null, r16, 12) == r7) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ce, code lost:
    
        if (xk.x.i(8, r16) == r7) goto L43;
     */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(Object obj, long j, ck.c cVar, int i4) {
        super(2, cVar);
        this.f2630b = i4;
        this.f2633e = obj;
        this.f2632d = j;
    }
}
