package ku;

/* loaded from: classes.dex */
public final class x extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final x f14635c = new x(y.f14639a);

    @Override // ku.a
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        br.l.e(fArr, "<this>");
        return fArr.length;
    }

    @Override // ku.n, ku.a
    public final void f(ju.a aVar, int i10, Object obj) {
        w wVar = (w) obj;
        br.l.e(wVar, "builder");
        float fI = aVar.i(this.f14626b, i10);
        wVar.b(wVar.d() + 1);
        float[] fArr = wVar.f14632a;
        int i11 = wVar.f14633b;
        wVar.f14633b = i11 + 1;
        fArr[i11] = fI;
    }

    @Override // ku.a
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        br.l.e(fArr, "<this>");
        w wVar = new w();
        wVar.f14632a = fArr;
        wVar.f14633b = fArr.length;
        wVar.b(10);
        return wVar;
    }

    @Override // ku.u0
    public final Object j() {
        return new float[0];
    }

    @Override // ku.u0
    public final void k(ju.b bVar, Object obj, int i10) {
        float[] fArr = (float[]) obj;
        br.l.e(bVar, "encoder");
        br.l.e(fArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            float f10 = fArr[i11];
            mu.y yVar = (mu.y) bVar;
            t0 t0Var = this.f14626b;
            br.l.e(t0Var, "descriptor");
            yVar.t(t0Var, i11);
            yVar.j(f10);
        }
    }
}
