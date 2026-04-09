package lr;

/* loaded from: classes.dex */
public final class e1 extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15609d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f1 f15610g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(f1 f1Var, int i10) {
        super(0);
        this.f15609d = i10;
        this.f15610g = f1Var;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f15609d) {
            case 0:
                return t1.e(this.f15610g, true);
            default:
                f1 f1Var = this.f15610g;
                ur.i0 i0VarB = f1Var.G().C().b();
                return i0VarB == null ? ts.o.f(f1Var.G().C(), sr.g.f22217a) : i0VarB;
        }
    }
}
