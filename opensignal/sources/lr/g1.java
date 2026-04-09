package lr;

/* loaded from: classes.dex */
public final class g1 extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15617d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h1 f15618g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(h1 h1Var, int i10) {
        super(0);
        this.f15617d = i10;
        this.f15618g = h1Var;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f15617d) {
            case 0:
                return t1.e(this.f15618g, false);
            default:
                h1 h1Var = this.f15618g;
                ur.j0 j0VarD = h1Var.G().C().d();
                return j0VarD == null ? ts.o.g(h1Var.G().C(), sr.g.f22217a) : j0VarD;
        }
    }
}
