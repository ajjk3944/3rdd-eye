package lr;

/* loaded from: classes.dex */
public final class m0 extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15641d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r0 f15642g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(r0 r0Var, int i10) {
        super(0);
        this.f15641d = i10;
        this.f15642g = r0Var;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f15641d) {
            case 0:
                return lf.t1.j(this.f15642g.f15676d);
            default:
                return new p0(this.f15642g);
        }
    }
}
