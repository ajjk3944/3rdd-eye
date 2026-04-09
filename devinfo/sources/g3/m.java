package g3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m extends nk.l implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mk.c f24512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1.n f24513b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mk.c f24514c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mk.c f24515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mk.c f24516e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(mk.c cVar, i1.n nVar, mk.c cVar2, mk.c cVar3, mk.c cVar4, int i4) {
        super(2);
        this.f24512a = cVar;
        this.f24513b = nVar;
        this.f24514c = cVar2;
        this.f24515d = cVar3;
        this.f24516e = cVar4;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iZ = u0.q.z(3505);
        k.a(this.f24512a, this.f24513b, this.f24514c, this.f24515d, this.f24516e, (u0.p) obj, iZ);
        return yj.u.f37649a;
    }
}
