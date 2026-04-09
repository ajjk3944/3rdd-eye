package lr;

/* loaded from: classes.dex */
public final class y0 extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15715d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z0 f15716g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(z0 z0Var, int i10) {
        super(0);
        this.f15715d = i10;
        this.f15716g = z0Var;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f15715d) {
            case 0:
                return new x0(this.f15716g);
            default:
                return this.f15716g.F();
        }
    }
}
