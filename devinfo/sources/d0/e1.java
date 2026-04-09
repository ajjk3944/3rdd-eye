package d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e1 extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public int f21706b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f21707c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f21708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0.l f21709e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nk.r f21710f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(float f10, a0.l lVar, nk.r rVar, ck.c cVar) {
        super(2, cVar);
        this.f21708d = f10;
        this.f21709e = lVar;
        this.f21710f = rVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        e1 e1Var = new e1(this.f21708d, this.f21709e, this.f21710f, cVar);
        e1Var.f21707c = obj;
        return e1Var;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e1) create((f1) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        int i4 = this.f21706b;
        if (i4 == 0) {
            ci.b.D(obj);
            d1 d1Var = new d1(0, this.f21710f, (f1) this.f21707c);
            this.f21706b = 1;
            Object objD = a0.f.d(this.f21708d, this.f21709e, d1Var, this, 4);
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
    }
}
