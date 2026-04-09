package nm;

import u0.u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public int f30054b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f30055c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f30056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f30057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mk.e f30058f;
    public final /* synthetic */ mk.c g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u0 f30059h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ xk.v f30060i;
    public final /* synthetic */ u0 j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ mk.a f30061k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z3, d dVar, mk.e eVar, mk.c cVar, u0 u0Var, xk.v vVar, u0 u0Var2, mk.a aVar, ck.c cVar2) {
        super(2, cVar2);
        this.f30056d = z3;
        this.f30057e = dVar;
        this.f30058f = eVar;
        this.g = cVar;
        this.f30059h = u0Var;
        this.f30060i = vVar;
        this.j = u0Var2;
        this.f30061k = aVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        i iVar = new i(this.f30056d, this.f30057e, this.f30058f, this.g, this.f30059h, this.f30060i, this.j, this.f30061k, cVar);
        iVar.f30055c = obj;
        return iVar;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((c2.u) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        int i4 = this.f30054b;
        yj.u uVar = yj.u.f37649a;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ci.b.D(obj);
            return uVar;
        }
        ci.b.D(obj);
        c2.u uVar2 = (c2.u) this.f30055c;
        if (this.f30056d) {
            mk.c cVar = this.g;
            u0 u0Var = this.f30059h;
            xk.v vVar = this.f30060i;
            u0 u0Var2 = this.j;
            g gVar = new g(cVar, u0Var, vVar, u0Var2);
            mk.a aVar = this.f30061k;
            h hVar = new h(aVar, u0Var2, vVar, u0Var, 0);
            h hVar2 = new h(aVar, u0Var2, vVar, u0Var, 1);
            this.f30054b = 1;
            Object objA = this.f30057e.a(uVar2, gVar, hVar, hVar2, this.f30058f, this);
            dk.a aVar2 = dk.a.f22275a;
            if (objA == aVar2) {
                return aVar2;
            }
        }
        return uVar;
    }
}
