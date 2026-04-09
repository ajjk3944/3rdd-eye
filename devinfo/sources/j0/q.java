package j0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26946b;

    /* renamed from: c, reason: collision with root package name */
    public int f26947c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f26948d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(s sVar, ck.c cVar, int i4) {
        super(2, cVar);
        this.f26946b = i4;
        this.f26948d = sVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f26946b) {
            case 0:
                return new q(this.f26948d, cVar, 0);
            case 1:
                return new q(this.f26948d, cVar, 1);
            case 2:
                return new q(this.f26948d, cVar, 2);
            case 3:
                return new q(this.f26948d, cVar, 3);
            default:
                return new q(this.f26948d, cVar, 4);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        xk.v vVar = (xk.v) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f26946b) {
        }
        return ((q) create(vVar, cVar)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        int i4 = this.f26946b;
        yj.u uVar = yj.u.f37649a;
        s sVar = this.f26948d;
        dk.a aVar = dk.a.f22275a;
        switch (i4) {
            case 0:
                int i10 = this.f26947c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar;
                }
                ci.b.D(obj);
                a0.e eVar = sVar.f26971p;
                Float f10 = new Float(1.0f);
                this.f26947c = 1;
                return eVar.e(f10, this) == aVar ? aVar : uVar;
            case 1:
                int i11 = this.f26947c;
                if (i11 == 0) {
                    ci.b.D(obj);
                    a0.e eVar2 = sVar.f26970o;
                    d3.i iVar = new d3.i(0L);
                    this.f26947c = 1;
                    if (eVar2.e(iVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                }
                int i12 = s.f26957t;
                sVar.g(0L);
                sVar.f(false);
                return uVar;
            case 2:
                int i13 = this.f26947c;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar;
                }
                ci.b.D(obj);
                a0.e eVar3 = sVar.f26970o;
                this.f26947c = 1;
                return eVar3.f(this) == aVar ? aVar : uVar;
            case 3:
                int i14 = this.f26947c;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar;
                }
                ci.b.D(obj);
                a0.e eVar4 = sVar.f26971p;
                this.f26947c = 1;
                return eVar4.f(this) == aVar ? aVar : uVar;
            default:
                int i15 = this.f26947c;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar;
                }
                ci.b.D(obj);
                a0.e eVar5 = sVar.f26971p;
                this.f26947c = 1;
                return eVar5.f(this) == aVar ? aVar : uVar;
        }
    }
}
