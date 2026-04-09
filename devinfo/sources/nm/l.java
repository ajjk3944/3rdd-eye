package nm;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l extends nk.l implements mk.a {

    /* renamed from: b, reason: collision with root package name */
    public static final l f30084b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f30085c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f30086d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30087a;

    static {
        int i4 = 0;
        f30084b = new l(i4, 0);
        f30085c = new l(i4, 1);
        f30086d = new l(i4, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i4, int i10) {
        super(i4);
        this.f30087a = i10;
    }

    @Override // mk.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f30087a) {
            case 0:
                return yj.u.f37649a;
            case 1:
                return yj.u.f37649a;
            default:
                return Float.valueOf(0.0f);
        }
    }
}
