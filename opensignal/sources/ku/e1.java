package ku;

/* loaded from: classes.dex */
public final class e1 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final e1 f14544c = new e1(f1.f14549a);

    @Override // ku.a
    public final int d(Object obj) {
        byte[] bArr = ((lq.t) obj).f15584a;
        br.l.e(bArr, "$this$collectionSize");
        return bArr.length;
    }

    @Override // ku.n, ku.a
    public final void f(ju.a aVar, int i10, Object obj) {
        d1 d1Var = (d1) obj;
        br.l.e(d1Var, "builder");
        byte bZ = aVar.s(this.f14626b, i10).z();
        d1Var.b(d1Var.d() + 1);
        byte[] bArr = d1Var.f14539a;
        int i11 = d1Var.f14540b;
        d1Var.f14540b = i11 + 1;
        bArr[i11] = bZ;
    }

    @Override // ku.a
    public final Object g(Object obj) {
        byte[] bArr = ((lq.t) obj).f15584a;
        br.l.e(bArr, "$this$toBuilder");
        d1 d1Var = new d1();
        d1Var.f14539a = bArr;
        d1Var.f14540b = bArr.length;
        d1Var.b(10);
        return d1Var;
    }

    @Override // ku.u0
    public final Object j() {
        return new lq.t(new byte[0]);
    }

    @Override // ku.u0
    public final void k(ju.b bVar, Object obj, int i10) {
        byte[] bArr = ((lq.t) obj).f15584a;
        br.l.e(bVar, "encoder");
        for (int i11 = 0; i11 < i10; i11++) {
            ((mu.y) bVar).u(this.f14626b, i11).g(bArr[i11]);
        }
    }
}
