package i2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a1 extends nk.l implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f25574b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(d1 d1Var, int i4) {
        super(0);
        this.f25573a = i4;
        this.f25574b = d1Var;
    }

    @Override // mk.a
    public final Object invoke() {
        switch (this.f25573a) {
            case 0:
                d1 d1Var = this.f25574b;
                p1.q qVar = d1Var.H;
                nk.k.b(qVar);
                d1Var.t0(qVar, d1Var.G);
                break;
            default:
                d1 d1Var2 = this.f25574b.f25612q;
                if (d1Var2 != null) {
                    d1Var2.G0();
                }
                break;
        }
        return yj.u.f37649a;
    }
}
