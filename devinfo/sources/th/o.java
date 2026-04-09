package th;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.liuzh.deviceinfo.utilities.n f34644b;

    public /* synthetic */ o(com.liuzh.deviceinfo.utilities.n nVar, int i4) {
        this.f34643a = i4;
        this.f34644b = nVar;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        int iA;
        gg.a aVar = (gg.a) obj;
        gg.a aVar2 = (gg.a) obj2;
        switch (this.f34643a) {
            case 0:
                iA = this.f34644b.a(aVar.f24702b, aVar2.f24702b);
                break;
            default:
                iA = -this.f34644b.a(aVar.f24702b, aVar2.f24702b);
                break;
        }
        return Integer.valueOf(iA);
    }
}
