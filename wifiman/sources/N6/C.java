package N6;

/* loaded from: classes3.dex */
public class C implements B {

    /* renamed from: a, reason: collision with root package name */
    private final P6.G f15319a;

    /* renamed from: b, reason: collision with root package name */
    private final C3371f f15320b;

    /* renamed from: c, reason: collision with root package name */
    private final y f15321c;

    class a implements gg.w {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ gg.w f15322a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ gg.w f15323b;

        a(gg.w wVar, gg.w wVar2) {
            this.f15322a = wVar;
            this.f15323b = wVar2;
        }

        @Override // gg.w
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public gg.s b(gg.s sVar) {
            return sVar.g(this.f15322a).g(this.f15323b);
        }
    }

    C(P6.G g10, C3371f c3371f, y yVar) {
        this.f15319a = g10;
        this.f15320b = c3371f;
        this.f15321c = yVar;
    }

    @Override // N6.B
    public A a(Q6.g gVar, Q6.d... dVarArr) {
        return new A(new M6.q(this.f15319a, this.f15320b, new C3370e(dVarArr)), new a(this.f15321c.b(gVar.g()), this.f15321c.a(gVar.b())));
    }
}
