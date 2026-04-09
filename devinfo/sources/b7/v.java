package b7;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f2061b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d6.a f2062c;

    public /* synthetic */ v(y yVar, d6.a aVar, int i4) {
        this.f2060a = i4;
        this.f2061b = yVar;
        this.f2062c = aVar;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        x.e eVar = (x.e) obj;
        switch (this.f2060a) {
            case 0:
                nk.k.e(eVar, "_tmpMap");
                this.f2061b.a(this.f2062c, eVar);
                break;
            default:
                nk.k.e(eVar, "_tmpMap");
                this.f2061b.b(this.f2062c, eVar);
                break;
        }
        return yj.u.f37649a;
    }
}
