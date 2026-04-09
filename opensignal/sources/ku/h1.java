package ku;

/* loaded from: classes.dex */
public final class h1 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final h1 f14559c = new h1(i1.f14564a);

    @Override // ku.a
    public final int d(Object obj) {
        int[] iArr = ((lq.v) obj).f15586a;
        br.l.e(iArr, "$this$collectionSize");
        return iArr.length;
    }

    @Override // ku.n, ku.a
    public final void f(ju.a aVar, int i10, Object obj) {
        g1 g1Var = (g1) obj;
        br.l.e(g1Var, "builder");
        int iK = aVar.s(this.f14626b, i10).k();
        g1Var.b(g1Var.d() + 1);
        int[] iArr = g1Var.f14555a;
        int i11 = g1Var.f14556b;
        g1Var.f14556b = i11 + 1;
        iArr[i11] = iK;
    }

    @Override // ku.a
    public final Object g(Object obj) {
        int[] iArr = ((lq.v) obj).f15586a;
        br.l.e(iArr, "$this$toBuilder");
        g1 g1Var = new g1();
        g1Var.f14555a = iArr;
        g1Var.f14556b = iArr.length;
        g1Var.b(10);
        return g1Var;
    }

    @Override // ku.u0
    public final Object j() {
        return new lq.v(new int[0]);
    }

    @Override // ku.u0
    public final void k(ju.b bVar, Object obj, int i10) {
        int[] iArr = ((lq.v) obj).f15586a;
        br.l.e(bVar, "encoder");
        for (int i11 = 0; i11 < i10; i11++) {
            ((mu.y) bVar).u(this.f14626b, i11).p(iArr[i11]);
        }
    }
}
