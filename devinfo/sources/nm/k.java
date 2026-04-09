package nm;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k extends nk.l implements mk.c {

    /* renamed from: b, reason: collision with root package name */
    public static final k f30073b;

    /* renamed from: c, reason: collision with root package name */
    public static final k f30074c;

    /* renamed from: d, reason: collision with root package name */
    public static final k f30075d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30076a;

    static {
        int i4 = 1;
        f30073b = new k(i4, 0);
        f30074c = new k(i4, 1);
        f30075d = new k(i4, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i4, int i10) {
        super(i4);
        this.f30076a = i10;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        switch (this.f30076a) {
            case 0:
                long j = ((o1.b) obj).f30364a;
                return yj.u.f37649a;
            case 1:
                long j8 = ((o1.b) obj).f30364a;
                return yj.u.f37649a;
            default:
                nk.k.e((c0) obj, "it");
                return Boolean.TRUE;
        }
    }
}
