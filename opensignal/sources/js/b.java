package js;

/* loaded from: classes.dex */
public final class b extends br.n implements ar.n {

    /* renamed from: g, reason: collision with root package name */
    public static final b f13792g;

    /* renamed from: r, reason: collision with root package name */
    public static final b f13793r;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13794d;

    static {
        int i10 = 2;
        f13792g = new b(i10, 0);
        f13793r = new b(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        super(i10);
        this.f13794d = i11;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        switch (this.f13794d) {
            case 0:
                a aVar = (a) obj;
                s sVar = (s) obj2;
                br.l.e(aVar, "$this$loadConstantFromProperty");
                br.l.e(sVar, "it");
                return aVar.f13791c.get(sVar);
            default:
                a aVar2 = (a) obj;
                s sVar2 = (s) obj2;
                br.l.e(aVar2, "$this$loadConstantFromProperty");
                br.l.e(sVar2, "it");
                return aVar2.f13790b.get(sVar2);
        }
    }
}
