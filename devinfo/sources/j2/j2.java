package j2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j2 extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27201b;

    /* renamed from: c, reason: collision with root package name */
    public int f27202c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l2 f27203d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2(l2 l2Var, ck.c cVar, int i4) {
        super(2, cVar);
        this.f27201b = i4;
        this.f27203d = l2Var;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f27201b) {
            case 0:
                return new j2(this.f27203d, cVar, 0);
            default:
                return new j2(this.f27203d, cVar, 1);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        xk.v vVar = (xk.v) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f27201b) {
        }
        return ((j2) create(vVar, cVar)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f27201b) {
            case 0:
                int i4 = this.f27202c;
                yj.u uVar = yj.u.f37649a;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar;
                }
                ci.b.D(obj);
                r rVar = this.f27203d.f27221a;
                this.f27202c = 1;
                Object objL = rVar.f27298y.l(this);
                dk.a aVar = dk.a.f22275a;
                if (objL != aVar) {
                    objL = uVar;
                }
                return objL == aVar ? aVar : uVar;
            default:
                int i10 = this.f27202c;
                yj.u uVar2 = yj.u.f37649a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return uVar2;
                }
                ci.b.D(obj);
                r rVar2 = this.f27203d.f27221a;
                this.f27202c = 1;
                Object objA = rVar2.f27300z.a(this);
                dk.a aVar2 = dk.a.f22275a;
                if (objA != aVar2) {
                    objA = uVar2;
                }
                return objA == aVar2 ? aVar2 : uVar2;
        }
    }
}
