package i2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k0 extends nk.l implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f25699a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f25700b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f25701c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q1 f25702d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(m0 m0Var, long j, long j8, q1 q1Var) {
        super(0);
        this.f25699a = m0Var;
        this.f25700b = j;
        this.f25701c = j8;
        this.f25702d = q1Var;
    }

    @Override // mk.a
    public final Object invoke() {
        m0 m0Var = this.f25699a;
        m0Var.k0().f25692a = false;
        m0Var.k0().f25693b = this.f25700b;
        m0Var.k0().f25694c = this.f25701c;
        mk.c cVarD = this.f25702d.f25760a.d();
        if (cVarD != null) {
            cVarD.invoke(m0Var.k0());
        }
        return yj.u.f37649a;
    }
}
