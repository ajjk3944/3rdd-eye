package i2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p0 extends nk.l implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f25740b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(q0 q0Var, int i4) {
        super(0);
        this.f25739a = i4;
        this.f25740b = q0Var;
    }

    @Override // mk.a
    public final Object invoke() {
        n0 n0VarX0;
        switch (this.f25739a) {
            case 0:
                q0 q0Var = this.f25740b;
                i0 i0Var = q0Var.f25741f;
                i0Var.f25680h = 0;
                w0.e eVarZ = i0Var.f25674a.z();
                Object[] objArr = eVarZ.f36397a;
                int i4 = eVarZ.f36399c;
                for (int i10 = 0; i10 < i4; i10++) {
                    q0 q0Var2 = ((e0) objArr[i10]).H.f25688q;
                    nk.k.b(q0Var2);
                    q0Var2.f25742h = q0Var2.f25743i;
                    q0Var2.f25743i = Integer.MAX_VALUE;
                    if (q0Var2.j == c0.f25588b) {
                        q0Var2.j = c0.f25589c;
                    }
                }
                e0 e0Var = i0Var.f25674a;
                e0 e0Var2 = i0Var.f25674a;
                w0.e eVarZ2 = e0Var.z();
                Object[] objArr2 = eVarZ2.f36397a;
                int i11 = eVarZ2.f36399c;
                for (int i12 = 0; i12 < i11; i12++) {
                    q0 q0Var3 = ((e0) objArr2[i12]).H.f25688q;
                    nk.k.b(q0Var3);
                    q0Var3.f25751r.getClass();
                }
                p pVar = q0Var.h().S;
                if (pVar != null) {
                    boolean z3 = pVar.f25712k;
                    w0.b bVar = (w0.b) e0Var2.o();
                    int i13 = bVar.f36391a.f36399c;
                    for (int i14 = 0; i14 < i13; i14++) {
                        n0 n0VarX02 = ((d1) ((e0) bVar.get(i14)).G.f19258e).x0();
                        if (n0VarX02 != null) {
                            n0VarX02.f25712k = z3;
                        }
                    }
                }
                p pVar2 = q0Var.h().S;
                nk.k.b(pVar2);
                pVar2.h0().c();
                if (q0Var.h().S != null) {
                    w0.b bVar2 = (w0.b) e0Var2.o();
                    int i15 = bVar2.f36391a.f36399c;
                    for (int i16 = 0; i16 < i15; i16++) {
                        n0 n0VarX03 = ((d1) ((e0) bVar2.get(i16)).G.f19258e).x0();
                        if (n0VarX03 != null) {
                            n0VarX03.f25712k = false;
                        }
                    }
                }
                w0.e eVarZ3 = e0Var2.z();
                Object[] objArr3 = eVarZ3.f36397a;
                int i17 = eVarZ3.f36399c;
                for (int i18 = 0; i18 < i17; i18++) {
                    q0 q0Var4 = ((e0) objArr3[i18]).H.f25688q;
                    nk.k.b(q0Var4);
                    int i19 = q0Var4.f25742h;
                    int i20 = q0Var4.f25743i;
                    if (i19 != i20 && i20 == Integer.MAX_VALUE) {
                        q0Var4.Z(true);
                    }
                }
                w0.e eVarZ4 = e0Var2.z();
                Object[] objArr4 = eVarZ4.f36397a;
                int i21 = eVarZ4.f36399c;
                for (int i22 = 0; i22 < i21; i22++) {
                    q0 q0Var5 = ((e0) objArr4[i22]).H.f25688q;
                    nk.k.b(q0Var5);
                    f0 f0Var = q0Var5.f25751r;
                    f0Var.getClass();
                    f0Var.f25660c = false;
                }
                break;
            case 1:
                q0 q0Var6 = this.f25740b;
                i0 i0Var2 = q0Var6.f25741f;
                g2.r0 placementScope = null;
                if (k.o(i0Var2.f25674a) || i0Var2.f25676c) {
                    d1 d1Var = i0Var2.a().f25612q;
                    if (d1Var != null) {
                        placementScope = d1Var.f25713l;
                    }
                } else {
                    d1 d1Var2 = i0Var2.a().f25612q;
                    if (d1Var2 != null && (n0VarX0 = d1Var2.x0()) != null) {
                        placementScope = n0VarX0.f25713l;
                    }
                }
                if (placementScope == null) {
                    placementScope = ((j2.r) h0.a(i0Var2.f25674a)).getPlacementScope();
                }
                n0 n0VarX04 = i0Var2.a().x0();
                nk.k.b(n0VarX04);
                g2.r0.h(placementScope, n0VarX04, q0Var6.f25747n);
                break;
            default:
                q0 q0Var7 = this.f25740b;
                n0 n0VarX05 = q0Var7.f25741f.a().x0();
                nk.k.b(n0VarX05);
                n0VarX05.v(q0Var7.f25758y);
                break;
        }
        return yj.u.f37649a;
    }
}
