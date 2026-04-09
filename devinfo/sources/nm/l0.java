package nm;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l0 extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30088b;

    /* renamed from: c, reason: collision with root package name */
    public int f30089c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0 f30090d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(n0 n0Var, ck.c cVar, int i4) {
        super(2, cVar);
        this.f30088b = i4;
        this.f30090d = n0Var;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f30088b) {
            case 0:
                return new l0(this.f30090d, cVar, 0);
            default:
                return new l0(this.f30090d, cVar, 1);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        xk.v vVar = (xk.v) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f30088b) {
        }
        return ((l0) create(vVar, cVar)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f30088b) {
            case 0:
                int i4 = this.f30089c;
                if (i4 == 0) {
                    ci.b.D(obj);
                    this.f30089c = 1;
                    Object objA = n0.a(this.f30090d, this);
                    dk.a aVar = dk.a.f22275a;
                    if (objA == aVar) {
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
                int i10 = this.f30089c;
                if (i10 == 0) {
                    ci.b.D(obj);
                    this.f30089c = 1;
                    Object objC = this.f30090d.c(this);
                    dk.a aVar2 = dk.a.f22275a;
                    if (objC == aVar2) {
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
