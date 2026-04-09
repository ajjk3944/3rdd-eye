package i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25422a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f25423b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25424c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25425d;

    public /* synthetic */ i(int i4, j jVar, Object obj) {
        this.f25423b = jVar;
        this.f25424c = i4;
        this.f25425d = obj;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        u0.p pVar = (u0.p) obj;
        Integer num = (Integer) obj2;
        switch (this.f25422a) {
            case 0:
                num.getClass();
                this.f25423b.a(this.f25424c, this.f25425d, pVar, u0.q.z(1));
                break;
            default:
                int iIntValue = num.intValue();
                if (pVar.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.f25423b.a(this.f25424c, this.f25425d, pVar, 0);
                } else {
                    pVar.R();
                }
                break;
        }
        return yj.u.f37649a;
    }

    public /* synthetic */ i(j jVar, int i4, Object obj, int i10) {
        this.f25423b = jVar;
        this.f25424c = i4;
        this.f25425d = obj;
    }
}
