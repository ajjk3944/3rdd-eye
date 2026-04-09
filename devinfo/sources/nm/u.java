package nm;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30130b;

    /* renamed from: c, reason: collision with root package name */
    public int f30131c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f30132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0 f30133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0 f30134f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(e0 e0Var, c0 c0Var, c0 c0Var2, ck.c cVar, int i4) {
        super(2, cVar);
        this.f30130b = i4;
        this.f30132d = e0Var;
        this.f30133e = c0Var;
        this.f30134f = c0Var2;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f30130b) {
            case 0:
                return new u(this.f30132d, this.f30133e, this.f30134f, cVar, 0);
            default:
                return new u(this.f30132d, this.f30133e, this.f30134f, cVar, 1);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        xk.v vVar = (xk.v) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f30130b) {
        }
        return ((u) create(vVar, cVar)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f30130b) {
            case 0:
                int i4 = this.f30131c;
                if (i4 == 0) {
                    ci.b.D(obj);
                    this.f30131c = 1;
                    Object objB = e0.b(this.f30132d, this.f30133e, this.f30134f, this);
                    dk.a aVar = dk.a.f22275a;
                    if (objB == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                }
                return yj.u.f37649a;
            default:
                int i10 = this.f30131c;
                if (i10 == 0) {
                    ci.b.D(obj);
                    this.f30131c = 1;
                    Object objB2 = e0.b(this.f30132d, this.f30133e, this.f30134f, this);
                    dk.a aVar2 = dk.a.f22275a;
                    if (objB2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                }
                return yj.u.f37649a;
        }
    }
}
