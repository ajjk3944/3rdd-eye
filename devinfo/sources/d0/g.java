package d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public int f21724b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f21725c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e2 f21726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f21727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f21728f;
    public final /* synthetic */ long g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xk.y0 f21729h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e2 e2Var, i iVar, c cVar, long j, xk.y0 y0Var, ck.c cVar2) {
        super(2, cVar2);
        this.f21726d = e2Var;
        this.f21727e = iVar;
        this.f21728f = cVar;
        this.g = j;
        this.f21729h = y0Var;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        g gVar = new g(this.f21726d, this.f21727e, this.f21728f, this.g, this.f21729h, cVar);
        gVar.f21725c = obj;
        return gVar;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((x1) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        int i4 = this.f21724b;
        if (i4 == 0) {
            ci.b.D(obj);
            x1 x1Var = (x1) this.f21725c;
            long j = this.g;
            i iVar = this.f21727e;
            c cVar = this.f21728f;
            float fP0 = i.p0(iVar, cVar, j);
            e2 e2Var = this.f21726d;
            e2Var.f21716e = fP0;
            f fVar = new f(iVar, e2Var, this.f21729h, x1Var);
            c1.b bVar = new c1.b(iVar, e2Var, cVar, 2);
            this.f21724b = 1;
            Object objA = e2Var.a(fVar, bVar, this);
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
    }
}
