package N6;

/* loaded from: classes3.dex */
public class G implements B {

    /* renamed from: a, reason: collision with root package name */
    private final P6.G f15336a;

    /* renamed from: b, reason: collision with root package name */
    private final C3371f f15337b;

    /* renamed from: c, reason: collision with root package name */
    private final y f15338c;

    /* renamed from: d, reason: collision with root package name */
    private final C3366a f15339d;

    G(P6.G g10, C3371f c3371f, y yVar, C3366a c3366a) {
        this.f15336a = g10;
        this.f15337b = c3371f;
        this.f15338c = yVar;
        this.f15339d = c3366a;
    }

    private static boolean b(Q6.d[] dVarArr) {
        boolean zB = true;
        for (Q6.d dVar : dVarArr) {
            zB &= dVar.b();
        }
        return !zB;
    }

    @Override // N6.B
    public A a(Q6.g gVar, Q6.d... dVarArr) {
        boolean zB = b(dVarArr);
        boolean z10 = gVar.b() != 1;
        gg.w wVarA = P6.E.a();
        if (z10 && !zB) {
            I6.q.b("ScanSettings.callbackType != CALLBACK_TYPE_ALL_MATCHES but no (or only empty) filters are specified. Falling back to callbackType emulation.", new Object[0]);
            wVarA = this.f15338c.a(gVar.b());
            gVar = gVar.a(1);
        }
        return new A(new M6.r(this.f15336a, this.f15337b, this.f15339d, gVar, new C3370e(new p[0]), dVarArr), wVarA);
    }
}
