package ku;

/* loaded from: classes.dex */
public final class j0 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final j0 f14566c = new j0(k0.f14571a);

    @Override // ku.a
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        br.l.e(jArr, "<this>");
        return jArr.length;
    }

    @Override // ku.n, ku.a
    public final void f(ju.a aVar, int i10, Object obj) {
        i0 i0Var = (i0) obj;
        br.l.e(i0Var, "builder");
        long jG = aVar.g(this.f14626b, i10);
        i0Var.b(i0Var.d() + 1);
        long[] jArr = i0Var.f14562a;
        int i11 = i0Var.f14563b;
        i0Var.f14563b = i11 + 1;
        jArr[i11] = jG;
    }

    @Override // ku.a
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        br.l.e(jArr, "<this>");
        i0 i0Var = new i0();
        i0Var.f14562a = jArr;
        i0Var.f14563b = jArr.length;
        i0Var.b(10);
        return i0Var;
    }

    @Override // ku.u0
    public final Object j() {
        return new long[0];
    }

    @Override // ku.u0
    public final void k(ju.b bVar, Object obj, int i10) {
        long[] jArr = (long[]) obj;
        br.l.e(bVar, "encoder");
        br.l.e(jArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            ((mu.y) bVar).v(this.f14626b, i11, jArr[i11]);
        }
    }
}
