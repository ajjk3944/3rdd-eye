package g3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends nk.l implements mk.c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f24454b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f24455c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f24456d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f24457e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24458a;

    static {
        int i4 = 1;
        f24454b = new c(i4, 0);
        f24455c = new c(i4, 1);
        f24456d = new c(i4, 2);
        f24457e = new c(i4, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i4, int i10) {
        super(i4);
        this.f24458a = i10;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        switch (this.f24458a) {
            case 0:
                j jVar = (j) obj;
                jVar.getHandler().post(new a(1, jVar.f24493r));
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return yj.u.f37649a;
    }
}
