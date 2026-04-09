package zc;

/* loaded from: classes.dex */
public final class t2 extends m {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f27157e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x2 f27158f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t2(x2 x2Var, c1 c1Var, int i10) {
        super(c1Var);
        this.f27157e = i10;
        this.f27158f = x2Var;
    }

    @Override // zc.m
    public final void a() {
        switch (this.f27157e) {
            case 0:
                x2 x2Var = this.f27158f;
                x2Var.s1();
                if (x2Var.J1()) {
                    j0 j0Var = ((c1) x2Var.f1504d).f26889y;
                    c1.g(j0Var);
                    j0Var.K.b("Inactivity, disconnecting from the service");
                    x2Var.A1();
                    break;
                }
                break;
            default:
                j0 j0Var2 = ((c1) this.f27158f.f1504d).f26889y;
                c1.g(j0Var2);
                j0Var2.F.b("Tasks have been queued for a long time");
                break;
        }
    }
}
