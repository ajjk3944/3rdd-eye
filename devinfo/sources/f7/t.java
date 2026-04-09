package f7;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f23794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23796c;

    public /* synthetic */ t(x xVar, int i4, int i10) {
        this.f23794a = xVar;
        this.f23795b = i4;
        this.f23796c = i10;
    }

    @Override // f7.w
    public final void run() {
        x xVar = this.f23794a;
        j jVar = xVar.f23801a;
        int i4 = this.f23795b;
        int i10 = this.f23796c;
        if (jVar == null) {
            xVar.f23806f.add(new t(xVar, i4, i10));
        } else {
            xVar.f23802b.k(i4, i10 + 0.99f);
        }
    }
}
