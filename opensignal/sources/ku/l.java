package ku;

/* loaded from: classes.dex */
public final class l extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final l f14574c = new l(m.f14578a);

    @Override // ku.a
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        br.l.e(cArr, "<this>");
        return cArr.length;
    }

    @Override // ku.n, ku.a
    public final void f(ju.a aVar, int i10, Object obj) {
        k kVar = (k) obj;
        br.l.e(kVar, "builder");
        char cL = aVar.l(this.f14626b, i10);
        kVar.b(kVar.d() + 1);
        char[] cArr = kVar.f14569a;
        int i11 = kVar.f14570b;
        kVar.f14570b = i11 + 1;
        cArr[i11] = cL;
    }

    @Override // ku.a
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        br.l.e(cArr, "<this>");
        k kVar = new k();
        kVar.f14569a = cArr;
        kVar.f14570b = cArr.length;
        kVar.b(10);
        return kVar;
    }

    @Override // ku.u0
    public final Object j() {
        return new char[0];
    }

    @Override // ku.u0
    public final void k(ju.b bVar, Object obj, int i10) {
        char[] cArr = (char[]) obj;
        br.l.e(bVar, "encoder");
        br.l.e(cArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            char c4 = cArr[i11];
            mu.y yVar = (mu.y) bVar;
            t0 t0Var = this.f14626b;
            br.l.e(t0Var, "descriptor");
            yVar.t(t0Var, i11);
            yVar.k(c4);
        }
    }
}
