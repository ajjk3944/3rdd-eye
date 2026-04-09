package N6;

/* loaded from: classes3.dex */
public class E implements B {

    /* renamed from: a, reason: collision with root package name */
    private final P6.G f15328a;

    /* renamed from: b, reason: collision with root package name */
    private final C3371f f15329b;

    /* renamed from: c, reason: collision with root package name */
    private final y f15330c;

    /* renamed from: d, reason: collision with root package name */
    private final C3366a f15331d;

    E(P6.G g10, C3371f c3371f, y yVar, C3366a c3366a) {
        this.f15328a = g10;
        this.f15329b = c3371f;
        this.f15330c = yVar;
        this.f15331d = c3366a;
    }

    @Override // N6.B
    public A a(Q6.g gVar, Q6.d... dVarArr) {
        return new A(new M6.r(this.f15328a, this.f15329b, this.f15331d, gVar, new C3370e(dVarArr), null), this.f15330c.a(gVar.b()));
    }
}
