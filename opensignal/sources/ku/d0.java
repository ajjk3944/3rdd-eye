package ku;

/* loaded from: classes.dex */
public final class d0 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f14538c = new d0(e0.f14542a);

    @Override // ku.a
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        br.l.e(iArr, "<this>");
        return iArr.length;
    }

    @Override // ku.n, ku.a
    public final void f(ju.a aVar, int i10, Object obj) {
        c0 c0Var = (c0) obj;
        br.l.e(c0Var, "builder");
        int iH = aVar.h(this.f14626b, i10);
        c0Var.b(c0Var.d() + 1);
        int[] iArr = c0Var.f14532a;
        int i11 = c0Var.f14533b;
        c0Var.f14533b = i11 + 1;
        iArr[i11] = iH;
    }

    @Override // ku.a
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        br.l.e(iArr, "<this>");
        c0 c0Var = new c0();
        c0Var.f14532a = iArr;
        c0Var.f14533b = iArr.length;
        c0Var.b(10);
        return c0Var;
    }

    @Override // ku.u0
    public final Object j() {
        return new int[0];
    }

    @Override // ku.u0
    public final void k(ju.b bVar, Object obj, int i10) {
        int[] iArr = (int[]) obj;
        br.l.e(bVar, "encoder");
        br.l.e(iArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            mu.y yVar = (mu.y) bVar;
            t0 t0Var = this.f14626b;
            br.l.e(t0Var, "descriptor");
            yVar.t(t0Var, i11);
            yVar.p(i12);
        }
    }
}
