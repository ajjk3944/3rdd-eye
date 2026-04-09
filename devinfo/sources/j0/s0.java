package j0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s0 extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public int f26974b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t0 f26975c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26976d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(t0 t0Var, int i4, ck.c cVar) {
        super(2, cVar);
        this.f26975c = t0Var;
        this.f26976d = i4;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        return new s0(this.f26975c, this.f26976d, cVar);
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((s0) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i4 = this.f26974b;
        yj.u uVar = yj.u.f37649a;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ci.b.D(obj);
            return uVar;
        }
        ci.b.D(obj);
        i0.d dVar = this.f26975c.f26979p;
        this.f26974b = 1;
        i0.u uVar2 = dVar.f25413b;
        yb.i iVar = i0.u.f25507x;
        uVar2.getClass();
        Object objF = uVar2.f(c0.v0.f2516a, new i0.s(uVar2, this.f26976d, null), this);
        dk.a aVar = dk.a.f22275a;
        if (objF != aVar) {
            objF = uVar;
        }
        if (objF != aVar) {
            objF = uVar;
        }
        return objF == aVar ? aVar : uVar;
    }
}
