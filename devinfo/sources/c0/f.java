package c0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2411b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f2412c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(a0 a0Var, ck.c cVar, int i4) {
        super(2, cVar);
        this.f2411b = i4;
        this.f2412c = a0Var;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f2411b) {
            case 0:
                return new f(this.f2412c, cVar, 0);
            default:
                return new f(this.f2412c, cVar, 1);
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        xk.v vVar = (xk.v) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f2411b) {
            case 0:
                f fVar = (f) create(vVar, cVar);
                yj.u uVar = yj.u.f37649a;
                fVar.invokeSuspend(uVar);
                return uVar;
            default:
                f fVar2 = (f) create(vVar, cVar);
                yj.u uVar2 = yj.u.f37649a;
                fVar2.invokeSuspend(uVar2);
                return uVar2;
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2411b) {
            case 0:
                ci.b.D(obj);
                a0 a0Var = this.f2412c;
                if (a0Var.f2362y == null) {
                    e0.f fVar = new e0.f();
                    e0.i iVar = a0Var.f2354q;
                    if (iVar != null) {
                        xk.x.v(a0Var.b0(), null, null, new al.p(iVar, fVar, null, 9), 3);
                    }
                    a0Var.f2362y = fVar;
                }
                break;
            default:
                ci.b.D(obj);
                a0 a0Var2 = this.f2412c;
                e0.f fVar2 = a0Var2.f2362y;
                if (fVar2 != null) {
                    e0.g gVar = new e0.g(fVar2);
                    e0.i iVar2 = a0Var2.f2354q;
                    ck.c cVar = null;
                    if (iVar2 != null) {
                        xk.x.v(a0Var2.b0(), null, null, new al.p(iVar2, gVar, cVar, 10), 3);
                    }
                    a0Var2.f2362y = null;
                }
                break;
        }
        return yj.u.f37649a;
    }
}
