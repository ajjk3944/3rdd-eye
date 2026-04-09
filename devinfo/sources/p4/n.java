package p4;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n extends ek.j implements mk.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31254b = 1;

    /* renamed from: c, reason: collision with root package name */
    public int f31255c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f31256d;

    public /* synthetic */ n(int i4, ck.c cVar) {
        super(i4, cVar);
    }

    @Override // mk.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        switch (this.f31254b) {
            case 0:
                return new n((z) this.f31256d, (ck.c) obj3).invokeSuspend(yj.u.f37649a);
            default:
                ((Boolean) obj2).getClass();
                n nVar = new n(3, (ck.c) obj3);
                nVar.f31256d = (b0) obj;
                return nVar.invokeSuspend(yj.u.f37649a);
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f31254b) {
            case 0:
                int i4 = this.f31255c;
                if (i4 == 0) {
                    ci.b.D(obj);
                    z zVar = (z) this.f31256d;
                    this.f31255c = 1;
                    Object objB = z.b(zVar, this);
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
                int i10 = this.f31255c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return obj;
                }
                ci.b.D(obj);
                b0 b0Var = (b0) this.f31256d;
                this.f31255c = 1;
                b0Var.getClass();
                Object objA = b0.a(b0Var, this);
                dk.a aVar2 = dk.a.f22275a;
                return objA == aVar2 ? aVar2 : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(z zVar, ck.c cVar) {
        super(3, cVar);
        this.f31256d = zVar;
    }
}
