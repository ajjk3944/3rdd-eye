package u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p1 extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public ca.b f34926b;

    /* renamed from: c, reason: collision with root package name */
    public int f34927c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f34928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1 f34929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r1 f34930f;
    public final /* synthetic */ j2.l0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(s1 s1Var, r1 r1Var, j2.l0 l0Var, ck.c cVar) {
        super(2, cVar);
        this.f34929e = s1Var;
        this.f34930f = r1Var;
        this.g = l0Var;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        p1 p1Var = new p1(this.f34929e, this.f34930f, this.g, cVar);
        p1Var.f34928d = obj;
        return p1Var;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((p1) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.p1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
