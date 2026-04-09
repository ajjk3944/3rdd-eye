package x1;

/* loaded from: classes.dex */
public final class k0 extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f24872d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f24873g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f24874r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p1 f24875x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(m0 m0Var, long j, long j7, p1 p1Var) {
        super(0);
        this.f24872d = m0Var;
        this.f24873g = j;
        this.f24874r = j7;
        this.f24875x = p1Var;
    }

    @Override // ar.a
    public final Object c() {
        m0 m0Var = this.f24872d;
        m0Var.d0().f24864b = false;
        m0Var.d0().f24865c = this.f24873g;
        m0Var.d0().f24866d = this.f24874r;
        ar.k kVarC = this.f24875x.f24911b.c();
        if (kVarC != null) {
            kVarC.a(m0Var.d0());
        }
        return lq.b0.f15562a;
    }
}
