package ku;

/* loaded from: classes.dex */
public final class h extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public static final h f14557c = new h(i.f14560a);

    @Override // ku.a
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        br.l.e(bArr, "<this>");
        return bArr.length;
    }

    @Override // ku.n, ku.a
    public final void f(ju.a aVar, int i10, Object obj) {
        g gVar = (g) obj;
        br.l.e(gVar, "builder");
        byte bX = aVar.x(this.f14626b, i10);
        gVar.b(gVar.d() + 1);
        byte[] bArr = gVar.f14551a;
        int i11 = gVar.f14552b;
        gVar.f14552b = i11 + 1;
        bArr[i11] = bX;
    }

    @Override // ku.a
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        br.l.e(bArr, "<this>");
        g gVar = new g();
        gVar.f14551a = bArr;
        gVar.f14552b = bArr.length;
        gVar.b(10);
        return gVar;
    }

    @Override // ku.u0
    public final Object j() {
        return new byte[0];
    }

    @Override // ku.u0
    public final void k(ju.b bVar, Object obj, int i10) {
        byte[] bArr = (byte[]) obj;
        br.l.e(bVar, "encoder");
        br.l.e(bArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            byte b2 = bArr[i11];
            mu.y yVar = (mu.y) bVar;
            t0 t0Var = this.f14626b;
            br.l.e(t0Var, "descriptor");
            yVar.t(t0Var, i11);
            yVar.g(b2);
        }
    }
}
