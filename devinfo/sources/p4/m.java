package p4;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31247b;

    /* renamed from: c, reason: collision with root package name */
    public int f31248c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f31249d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(z zVar, ck.c cVar, int i4) {
        super(2, cVar);
        this.f31247b = i4;
        this.f31249d = zVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f31247b) {
            case 0:
                return new m(this.f31249d, cVar, 0);
            case 1:
                return new m(this.f31249d, cVar, 1);
            default:
                return new m(this.f31249d, cVar, 2);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31247b) {
        }
        return ((m) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f31247b) {
            case 0:
                int i4 = this.f31248c;
                if (i4 == 0) {
                    ci.b.D(obj);
                    this.f31248c = 1;
                    Object objD = z.d(this.f31249d, this);
                    dk.a aVar = dk.a.f22275a;
                    if (objD == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                }
                return yj.u.f37649a;
            case 1:
                int i10 = this.f31248c;
                yj.u uVar = yj.u.f37649a;
                z zVar = this.f31249d;
                dk.a aVar2 = dk.a.f22275a;
                if (i10 == 0) {
                    ci.b.D(obj);
                    a0.x0 x0Var = zVar.f31365i;
                    this.f31248c = 1;
                    Object objG0 = ((xk.n) x0Var.f145b).g0(this);
                    if (objG0 != aVar2) {
                        objG0 = uVar;
                    }
                    if (objG0 != aVar2) {
                    }
                    return aVar2;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar;
                }
                ci.b.D(obj);
                al.h hVarF = al.z0.f(zVar.g().d(), -1);
                al.o oVar = new al.o(2, zVar);
                this.f31248c = 2;
                if (hVarF.a(oVar, this) != aVar2) {
                    return uVar;
                }
                return aVar2;
            default:
                z zVar2 = this.f31249d;
                km.y yVar = zVar2.f31364h;
                int i11 = this.f31248c;
                dk.a aVar3 = dk.a.f22275a;
                try {
                    if (i11 == 0) {
                        ci.b.D(obj);
                        if (yVar.y() instanceof j0) {
                            return yVar.y();
                        }
                        this.f31248c = 1;
                        if (zVar2.h(this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ci.b.D(obj);
                            return (b1) obj;
                        }
                        ci.b.D(obj);
                    }
                    this.f31248c = 2;
                    obj = z.e(zVar2, false, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    return (b1) obj;
                } catch (Throwable th2) {
                    return new u0(-1, th2);
                }
        }
    }
}
