package pf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a1 extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31761b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f31762c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1 f31763d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(c1 c1Var, ck.c cVar, int i4) {
        super(2, cVar);
        this.f31761b = i4;
        this.f31763d = c1Var;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f31761b) {
            case 0:
                a1 a1Var = new a1(this.f31763d, cVar, 0);
                a1Var.f31762c = obj;
                return a1Var;
            default:
                a1 a1Var2 = new a1(this.f31763d, cVar, 1);
                a1Var2.f31762c = obj;
                return a1Var2;
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f31761b) {
        }
        return ((a1) create(j0Var, cVar)).invokeSuspend(yj.u.f37649a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.a1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
