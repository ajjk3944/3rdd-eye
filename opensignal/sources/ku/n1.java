package ku;

/* loaded from: classes.dex */
public final class n1 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final n1 f14587c = new n1(o1.f14591a);

    @Override // ku.a
    public final int d(Object obj) {
        short[] sArr = ((lq.a0) obj).f15558a;
        br.l.e(sArr, "$this$collectionSize");
        return sArr.length;
    }

    @Override // ku.n, ku.a
    public final void f(ju.a aVar, int i10, Object obj) {
        m1 m1Var = (m1) obj;
        br.l.e(m1Var, "builder");
        short sA = aVar.s(this.f14626b, i10).A();
        m1Var.b(m1Var.d() + 1);
        short[] sArr = m1Var.f14582a;
        int i11 = m1Var.f14583b;
        m1Var.f14583b = i11 + 1;
        sArr[i11] = sA;
    }

    @Override // ku.a
    public final Object g(Object obj) {
        short[] sArr = ((lq.a0) obj).f15558a;
        br.l.e(sArr, "$this$toBuilder");
        m1 m1Var = new m1();
        m1Var.f14582a = sArr;
        m1Var.f14583b = sArr.length;
        m1Var.b(10);
        return m1Var;
    }

    @Override // ku.u0
    public final Object j() {
        return new lq.a0(new short[0]);
    }

    @Override // ku.u0
    public final void k(ju.b bVar, Object obj, int i10) {
        short[] sArr = ((lq.a0) obj).f15558a;
        br.l.e(bVar, "encoder");
        for (int i11 = 0; i11 < i10; i11++) {
            ((mu.y) bVar).u(this.f14626b, i11).f(sArr[i11]);
        }
    }
}
