package d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class w1 extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public z1 f21876b;

    /* renamed from: c, reason: collision with root package name */
    public nk.t f21877c;

    /* renamed from: d, reason: collision with root package name */
    public long f21878d;

    /* renamed from: e, reason: collision with root package name */
    public int f21879e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f21880f;
    public final /* synthetic */ z1 g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nk.t f21881h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f21882i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(z1 z1Var, nk.t tVar, long j, ck.c cVar) {
        super(2, cVar);
        this.g = z1Var;
        this.f21881h = tVar;
        this.f21882i = j;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        w1 w1Var = new w1(this.g, this.f21881h, this.f21882i, cVar);
        w1Var.f21880f = obj;
        return w1Var;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((w1) create((x1) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        z1 z1Var;
        nk.t tVar;
        long j;
        z1 z1Var2;
        int i4 = this.f21879e;
        a1 a1Var = a1.f21663b;
        if (i4 == 0) {
            ci.b.D(obj);
            x1 x1Var = (x1) this.f21880f;
            z1Var = this.g;
            v1 v1Var = new v1(z1Var, x1Var);
            k kVar = z1Var.f21921c;
            nk.t tVar2 = this.f21881h;
            long j8 = tVar2.f29985a;
            a1 a1Var2 = z1Var.f21922d;
            long j9 = this.f21882i;
            float fD = z1Var.d(a1Var2 == a1Var ? d3.p.b(j9) : d3.p.c(j9));
            this.f21880f = z1Var;
            this.f21876b = z1Var;
            this.f21877c = tVar2;
            this.f21878d = j8;
            this.f21879e = 1;
            kVar.getClass();
            obj = xk.x.E(m1.f21793c, new j(fD, kVar, v1Var, null), this);
            dk.a aVar = dk.a.f22275a;
            if (obj == aVar) {
                return aVar;
            }
            tVar = tVar2;
            j = j8;
            z1Var2 = z1Var;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.f21878d;
            tVar = this.f21877c;
            z1Var = this.f21876b;
            z1Var2 = (z1) this.f21880f;
            ci.b.D(obj);
        }
        float fD2 = z1Var2.d(((Number) obj).floatValue());
        tVar.f29985a = z1Var.f21922d == a1Var ? d3.p.a(j, fD2, 0.0f, 2) : d3.p.a(j, 0.0f, fD2, 1);
        return yj.u.f37649a;
    }
}
