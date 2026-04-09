package ku;

/* loaded from: classes.dex */
public final class e extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final e f14541c = new e(f.f14545a);

    @Override // ku.a
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        br.l.e(zArr, "<this>");
        return zArr.length;
    }

    @Override // ku.n, ku.a
    public final void f(ju.a aVar, int i10, Object obj) {
        d dVar = (d) obj;
        br.l.e(dVar, "builder");
        boolean zV = aVar.v(this.f14626b, i10);
        dVar.b(dVar.d() + 1);
        boolean[] zArr = dVar.f14536a;
        int i11 = dVar.f14537b;
        dVar.f14537b = i11 + 1;
        zArr[i11] = zV;
    }

    @Override // ku.a
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        br.l.e(zArr, "<this>");
        d dVar = new d();
        dVar.f14536a = zArr;
        dVar.f14537b = zArr.length;
        dVar.b(10);
        return dVar;
    }

    @Override // ku.u0
    public final Object j() {
        return new boolean[0];
    }

    @Override // ku.u0
    public final void k(ju.b bVar, Object obj, int i10) {
        boolean[] zArr = (boolean[]) obj;
        br.l.e(bVar, "encoder");
        br.l.e(zArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            ((mu.y) bVar).s(this.f14626b, i11, zArr[i11]);
        }
    }
}
