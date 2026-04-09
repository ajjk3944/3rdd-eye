package ku;

/* loaded from: classes.dex */
public final class p extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final p f14593c = new p(q.f14598a);

    @Override // ku.a
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        br.l.e(dArr, "<this>");
        return dArr.length;
    }

    @Override // ku.n, ku.a
    public final void f(ju.a aVar, int i10, Object obj) {
        o oVar = (o) obj;
        br.l.e(oVar, "builder");
        double dW = aVar.w(this.f14626b, i10);
        oVar.b(oVar.d() + 1);
        double[] dArr = oVar.f14588a;
        int i11 = oVar.f14589b;
        oVar.f14589b = i11 + 1;
        dArr[i11] = dW;
    }

    @Override // ku.a
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        br.l.e(dArr, "<this>");
        o oVar = new o();
        oVar.f14588a = dArr;
        oVar.f14589b = dArr.length;
        oVar.b(10);
        return oVar;
    }

    @Override // ku.u0
    public final Object j() {
        return new double[0];
    }

    @Override // ku.u0
    public final void k(ju.b bVar, Object obj, int i10) {
        double[] dArr = (double[]) obj;
        br.l.e(bVar, "encoder");
        br.l.e(dArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            double d6 = dArr[i11];
            mu.y yVar = (mu.y) bVar;
            t0 t0Var = this.f14626b;
            br.l.e(t0Var, "descriptor");
            yVar.t(t0Var, i11);
            yVar.e(d6);
        }
    }
}
