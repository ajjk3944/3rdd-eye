package n0;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements ar.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17358a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17359d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17360g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f17361r;

    public /* synthetic */ x(Object obj, Object obj2, int i10, int i11) {
        this.f17358a = i11;
        this.f17361r = obj;
        this.f17359d = obj2;
        this.f17360g = i10;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        switch (this.f17358a) {
            case 0:
                ((Integer) obj2).getClass();
                w.a((i1) this.f17361r, (ar.n) this.f17359d, (p) obj, w.m(this.f17360g | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                w.b((i1[]) this.f17361r, (ar.n) this.f17359d, (p) obj, w.m(this.f17360g | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                int iM = w.m(this.f17360g) | 1;
                ((v0.d) this.f17361r).i(this.f17359d, (p) obj, iM);
                break;
        }
        return lq.b0.f15562a;
    }
}
