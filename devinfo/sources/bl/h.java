package bl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2292b = 1;

    /* renamed from: c, reason: collision with root package name */
    public int f2293c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f2295e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ al.i f2296f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, al.i iVar, ck.c cVar) {
        super(2, cVar);
        this.f2295e = kVar;
        this.f2296f = iVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f2292b) {
            case 0:
                return new h(this.f2295e, this.f2296f, this.f2294d, cVar);
            default:
                h hVar = new h(this.f2295e, this.f2296f, cVar);
                hVar.f2294d = obj;
                return hVar;
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        xk.v vVar = (xk.v) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f2292b) {
        }
        return ((h) create(vVar, cVar)).invokeSuspend(yj.u.f37649a);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [ek.j, mk.f] */
    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2292b) {
            case 0:
                int i4 = this.f2293c;
                if (i4 == 0) {
                    ci.b.D(obj);
                    ?? r92 = this.f2295e.f2307e;
                    Object obj2 = this.f2294d;
                    this.f2293c = 1;
                    Object objA = r92.a(this.f2296f, obj2, this);
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
            default:
                int i10 = this.f2293c;
                if (i10 == 0) {
                    ci.b.D(obj);
                    xk.v vVar = (xk.v) this.f2294d;
                    nk.u uVar = new nk.u();
                    k kVar = this.f2295e;
                    al.h hVar = kVar.f2291d;
                    j jVar = new j(uVar, vVar, kVar, this.f2296f, 0);
                    this.f2293c = 1;
                    Object objA2 = hVar.a(jVar, this);
                    dk.a aVar2 = dk.a.f22275a;
                    if (objA2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                }
                return yj.u.f37649a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, al.i iVar, Object obj, ck.c cVar) {
        super(2, cVar);
        this.f2295e = kVar;
        this.f2296f = iVar;
        this.f2294d = obj;
    }
}
