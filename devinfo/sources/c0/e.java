package c0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2395b;

    /* renamed from: c, reason: collision with root package name */
    public int f2396c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f2397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0.k f2398e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(a0 a0Var, e0.k kVar, ck.c cVar, int i4) {
        super(2, cVar);
        this.f2395b = i4;
        this.f2397d = a0Var;
        this.f2398e = kVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f2395b) {
            case 0:
                return new e(this.f2397d, this.f2398e, cVar, 0);
            case 1:
                return new e(this.f2397d, this.f2398e, cVar, 1);
            case 2:
                return new e(this.f2397d, this.f2398e, cVar, 2);
            default:
                return new e(this.f2397d, this.f2398e, cVar, 3);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        xk.v vVar = (xk.v) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f2395b) {
        }
        return ((e) create(vVar, cVar)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f2395b) {
            case 0:
                int i4 = this.f2396c;
                if (i4 == 0) {
                    ci.b.D(obj);
                    e0.i iVar = this.f2397d.f2354q;
                    if (iVar != null) {
                        e0.j jVar = new e0.j(this.f2398e);
                        this.f2396c = 1;
                        Object objA = iVar.a(jVar, this);
                        dk.a aVar = dk.a.f22275a;
                        if (objA == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                }
                return yj.u.f37649a;
            case 1:
                int i10 = this.f2396c;
                if (i10 == 0) {
                    ci.b.D(obj);
                    e0.i iVar2 = this.f2397d.f2354q;
                    if (iVar2 != null) {
                        e0.j jVar2 = new e0.j(this.f2398e);
                        this.f2396c = 1;
                        Object objA2 = iVar2.a(jVar2, this);
                        dk.a aVar2 = dk.a.f22275a;
                        if (objA2 == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                }
                return yj.u.f37649a;
            case 2:
                int i11 = this.f2396c;
                if (i11 == 0) {
                    ci.b.D(obj);
                    e0.i iVar3 = this.f2397d.f2354q;
                    if (iVar3 != null) {
                        this.f2396c = 1;
                        Object objA3 = iVar3.a(this.f2398e, this);
                        dk.a aVar3 = dk.a.f22275a;
                        if (objA3 == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                }
                return yj.u.f37649a;
            default:
                int i12 = this.f2396c;
                if (i12 == 0) {
                    ci.b.D(obj);
                    e0.i iVar4 = this.f2397d.f2354q;
                    if (iVar4 != null) {
                        e0.l lVar = new e0.l(this.f2398e);
                        this.f2396c = 1;
                        Object objA4 = iVar4.a(lVar, this);
                        dk.a aVar4 = dk.a.f22275a;
                        if (objA4 == aVar4) {
                            return aVar4;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                }
                return yj.u.f37649a;
        }
    }
}
