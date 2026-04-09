package i2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t0 extends nk.l implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25784a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f25785b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(u0 u0Var, int i4) {
        super(0);
        this.f25784a = i4;
        this.f25785b = u0Var;
    }

    @Override // mk.a
    public final Object invoke() {
        g2.r0 placementScope;
        switch (this.f25784a) {
            case 0:
                u0 u0Var = this.f25785b;
                i0 i0Var = u0Var.f25786f;
                i0Var.f25681i = 0;
                w0.e eVarZ = i0Var.f25674a.z();
                Object[] objArr = eVarZ.f36397a;
                int i4 = eVarZ.f36399c;
                for (int i10 = 0; i10 < i4; i10++) {
                    u0 u0Var2 = ((e0) objArr[i10]).H.f25687p;
                    u0Var2.f25787h = u0Var2.f25788i;
                    u0Var2.f25788i = Integer.MAX_VALUE;
                    u0Var2.f25798t = false;
                    if (u0Var2.f25790l == c0.f25588b) {
                        u0Var2.f25790l = c0.f25589c;
                    }
                }
                e0 e0Var = i0Var.f25674a;
                e0 e0Var2 = i0Var.f25674a;
                w0.e eVarZ2 = e0Var.z();
                Object[] objArr2 = eVarZ2.f36397a;
                int i11 = eVarZ2.f36399c;
                for (int i12 = 0; i12 < i11; i12++) {
                    ((e0) objArr2[i12]).H.f25687p.f25802x.getClass();
                }
                if (u0Var.h().f25712k) {
                    w0.b bVar = (w0.b) e0Var2.o();
                    int i13 = bVar.f36391a.f36399c;
                    for (int i14 = 0; i14 < i13; i14++) {
                        ((d1) ((e0) bVar.get(i14)).G.f19258e).f25712k = true;
                    }
                }
                u0Var.h().h0().c();
                if (u0Var.h().f25712k) {
                    w0.b bVar2 = (w0.b) e0Var2.o();
                    int i15 = bVar2.f36391a.f36399c;
                    for (int i16 = 0; i16 < i15; i16++) {
                        ((d1) ((e0) bVar2.get(i16)).G.f19258e).f25712k = false;
                    }
                }
                w0.e eVarZ3 = e0Var2.z();
                Object[] objArr3 = eVarZ3.f36397a;
                int i17 = eVarZ3.f36399c;
                for (int i18 = 0; i18 < i17; i18++) {
                    e0 e0Var3 = (e0) objArr3[i18];
                    i0 i0Var2 = e0Var3.H;
                    if (i0Var2.f25687p.f25787h != e0Var3.w()) {
                        e0Var2.O();
                        e0Var2.C();
                        if (e0Var3.w() == Integer.MAX_VALUE) {
                            if (i0Var2.f25676c || k.o(e0Var3)) {
                                q0 q0Var = i0Var2.f25688q;
                                nk.k.b(q0Var);
                                q0Var.Z(false);
                            }
                            i0Var2.f25687p.a0();
                        }
                    }
                }
                w0.e eVarZ4 = e0Var2.z();
                Object[] objArr4 = eVarZ4.f36397a;
                int i19 = eVarZ4.f36399c;
                for (int i20 = 0; i20 < i19; i20++) {
                    f0 f0Var = ((e0) objArr4[i20]).H.f25687p.f25802x;
                    f0Var.getClass();
                    f0Var.f25660c = false;
                }
                break;
            case 1:
                u0 u0Var3 = this.f25785b;
                u0Var3.f25786f.a().v(u0Var3.B);
                break;
            default:
                u0 u0Var4 = this.f25785b;
                i0 i0Var3 = u0Var4.f25786f;
                d1 d1Var = i0Var3.a().f25612q;
                if (d1Var == null || (placementScope = d1Var.f25713l) == null) {
                    placementScope = ((j2.r) h0.a(i0Var3.f25674a)).getPlacementScope();
                }
                mk.c cVar = u0Var4.G;
                s1.b bVar3 = u0Var4.H;
                if (bVar3 != null) {
                    d1 d1VarA = i0Var3.a();
                    long j = u0Var4.I;
                    float f10 = u0Var4.J;
                    placementScope.getClass();
                    g2.r0.b(placementScope, d1VarA);
                    d1VarA.S(d3.i.c(j, d1VarA.f24412e), f10, bVar3);
                } else if (cVar == null) {
                    d1 d1VarA2 = i0Var3.a();
                    long j8 = u0Var4.I;
                    float f11 = u0Var4.J;
                    placementScope.getClass();
                    g2.r0.b(placementScope, d1VarA2);
                    d1VarA2.R(d3.i.c(j8, d1VarA2.f24412e), f11, null);
                } else {
                    d1 d1VarA3 = i0Var3.a();
                    long j9 = u0Var4.I;
                    float f12 = u0Var4.J;
                    placementScope.getClass();
                    g2.r0.b(placementScope, d1VarA3);
                    d1VarA3.R(d3.i.c(j9, d1VarA3.f24412e), f12, cVar);
                }
                break;
        }
        return yj.u.f37649a;
    }
}
