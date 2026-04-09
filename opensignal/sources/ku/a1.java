package ku;

/* loaded from: classes.dex */
public final class a1 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a1 f14527c = new a1(b1.f14529a);

    @Override // ku.a
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        br.l.e(sArr, "<this>");
        return sArr.length;
    }

    @Override // ku.n, ku.a
    public final void f(ju.a aVar, int i10, Object obj) {
        z0 z0Var = (z0) obj;
        br.l.e(z0Var, "builder");
        short sO = aVar.o(this.f14626b, i10);
        z0Var.b(z0Var.d() + 1);
        short[] sArr = z0Var.f14641a;
        int i11 = z0Var.f14642b;
        z0Var.f14642b = i11 + 1;
        sArr[i11] = sO;
    }

    @Override // ku.a
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        br.l.e(sArr, "<this>");
        z0 z0Var = new z0();
        z0Var.f14641a = sArr;
        z0Var.f14642b = sArr.length;
        z0Var.b(10);
        return z0Var;
    }

    @Override // ku.u0
    public final Object j() {
        return new short[0];
    }

    @Override // ku.u0
    public final void k(ju.b bVar, Object obj, int i10) {
        short[] sArr = (short[]) obj;
        br.l.e(bVar, "encoder");
        br.l.e(sArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            short s8 = sArr[i11];
            mu.y yVar = (mu.y) bVar;
            t0 t0Var = this.f14626b;
            br.l.e(t0Var, "descriptor");
            yVar.t(t0Var, i11);
            yVar.f(s8);
        }
    }
}
