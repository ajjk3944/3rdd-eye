package j0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1.b f26952b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f26953c;

    public /* synthetic */ r(s1.b bVar, s sVar, int i4) {
        this.f26951a = i4;
        this.f26952b = bVar;
        this.f26953c = sVar;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        a0.e eVar = (a0.e) obj;
        switch (this.f26951a) {
            case 0:
                this.f26952b.e(((Number) eVar.d()).floatValue());
                this.f26953c.f26960c.invoke();
                break;
            default:
                this.f26952b.e(((Number) eVar.d()).floatValue());
                this.f26953c.f26960c.invoke();
                break;
        }
        return yj.u.f37649a;
    }
}
