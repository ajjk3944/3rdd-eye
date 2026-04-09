package nm;

import u0.u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g extends nk.l implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30039a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f30040b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xk.v f30041c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0 f30042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yj.c f30043e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(mk.a aVar, u0 u0Var, u0 u0Var2, xk.v vVar) {
        super(1);
        this.f30043e = aVar;
        this.f30040b = u0Var;
        this.f30042d = u0Var2;
        this.f30041c = vVar;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        switch (this.f30039a) {
            case 0:
                nk.k.e((u0.g0) obj, "$this$DisposableEffect");
                return new f((mk.a) this.f30043e, this.f30040b, this.f30042d, this.f30041c);
            default:
                long j = ((o1.b) obj).f30364a;
                this.f30040b.setValue(Boolean.TRUE);
                e0.b bVar = new e0.b();
                xk.x.v(this.f30041c, null, null, new e(bVar, null, 1), 3);
                this.f30042d.setValue(bVar);
                ((mk.c) this.f30043e).invoke(new o1.b(j));
                return yj.u.f37649a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(mk.c cVar, u0 u0Var, xk.v vVar, u0 u0Var2) {
        super(1);
        this.f30043e = cVar;
        this.f30040b = u0Var;
        this.f30041c = vVar;
        this.f30042d = u0Var2;
    }
}
