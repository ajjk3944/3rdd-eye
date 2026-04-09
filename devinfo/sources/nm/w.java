package nm;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w extends ek.j implements mk.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30141b;

    /* renamed from: c, reason: collision with root package name */
    public int f30142c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f30143d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(e0 e0Var, ck.c cVar, int i4) {
        super(1, cVar);
        this.f30141b = i4;
        this.f30143d = e0Var;
    }

    @Override // ek.a
    public final ck.c create(ck.c cVar) {
        switch (this.f30141b) {
            case 0:
                return new w(this.f30143d, cVar, 0);
            default:
                return new w(this.f30143d, cVar, 1);
        }
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        ck.c cVar = (ck.c) obj;
        switch (this.f30141b) {
        }
        return ((w) create(cVar)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f30141b) {
            case 0:
                int i4 = this.f30142c;
                if (i4 == 0) {
                    ci.b.D(obj);
                    this.f30142c = 1;
                    Object objA = e0.a(this.f30143d, h0.f30051a, this);
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
                int i10 = this.f30142c;
                if (i10 == 0) {
                    ci.b.D(obj);
                    this.f30142c = 1;
                    Object objA2 = e0.a(this.f30143d, h0.f30052b, this);
                    dk.a aVar2 = dk.a.f22275a;
                    if (objA2 == aVar2) {
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
