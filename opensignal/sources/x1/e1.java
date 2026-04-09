package x1;

/* loaded from: classes.dex */
public final class e1 extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24790d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f1 f24791g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(f1 f1Var, int i10) {
        super(0);
        this.f24790d = i10;
        this.f24791g = f1Var;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f24790d) {
            case 0:
                f1 f1Var = this.f24791g;
                g1.p pVar = f1Var.E;
                br.l.b(pVar);
                f1Var.p0(pVar, f1Var.D);
                break;
            default:
                f1 f1Var2 = this.f24791g.f24823q;
                if (f1Var2 != null) {
                    f1Var2.C0();
                }
                break;
        }
        return lq.b0.f15562a;
    }
}
