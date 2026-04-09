package lr;

/* loaded from: classes.dex */
public final class b1 extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15601d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c1 f15602g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(c1 c1Var, int i10) {
        super(0);
        this.f15601d = i10;
        this.f15602g = c1Var;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f15601d) {
            case 0:
                return new a1(this.f15602g);
            default:
                return this.f15602g.F();
        }
    }
}
