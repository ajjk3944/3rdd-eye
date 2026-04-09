package ku;

/* loaded from: classes.dex */
public final class k1 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final k1 f14573c = new k1(l1.f14576a);

    @Override // ku.a
    public final int d(Object obj) {
        long[] jArr = ((lq.x) obj).f15588a;
        br.l.e(jArr, "$this$collectionSize");
        return jArr.length;
    }

    @Override // ku.n, ku.a
    public final void f(ju.a aVar, int i10, Object obj) {
        j1 j1Var = (j1) obj;
        br.l.e(j1Var, "builder");
        long jR = aVar.s(this.f14626b, i10).r();
        j1Var.b(j1Var.d() + 1);
        long[] jArr = j1Var.f14567a;
        int i11 = j1Var.f14568b;
        j1Var.f14568b = i11 + 1;
        jArr[i11] = jR;
    }

    @Override // ku.a
    public final Object g(Object obj) {
        long[] jArr = ((lq.x) obj).f15588a;
        br.l.e(jArr, "$this$toBuilder");
        j1 j1Var = new j1();
        j1Var.f14567a = jArr;
        j1Var.f14568b = jArr.length;
        j1Var.b(10);
        return j1Var;
    }

    @Override // ku.u0
    public final Object j() {
        return new lq.x(new long[0]);
    }

    @Override // ku.u0
    public final void k(ju.b bVar, Object obj, int i10) {
        long[] jArr = ((lq.x) obj).f15588a;
        br.l.e(bVar, "encoder");
        for (int i11 = 0; i11 < i10; i11++) {
            ((mu.y) bVar).u(this.f14626b, i11).q(jArr[i11]);
        }
    }
}
