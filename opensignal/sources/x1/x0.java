package x1;

/* loaded from: classes.dex */
public final class x0 extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24957d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y0 f24958g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(y0 y0Var, int i10) {
        super(0);
        this.f24957d = i10;
        this.f24958g = y0Var;
    }

    @Override // ar.a
    public final Object c() {
        v1.u placementScope;
        switch (this.f24957d) {
            case 0:
                y0 y0Var = this.f24958g;
                i0 i0Var = y0Var.f24960g;
                i0Var.f24854i = 0;
                p0.e eVarI = i0Var.f24846a.I();
                Object[] objArr = eVarI.f20230a;
                int i10 = eVarI.f20232g;
                for (int i11 = 0; i11 < i10; i11++) {
                    y0 y0VarX = ((f0) objArr[i11]).x();
                    y0VarX.f24962i = y0VarX.j;
                    y0VarX.j = Integer.MAX_VALUE;
                    y0VarX.f24970s = false;
                    if (y0VarX.f24964m == d0.InLayoutBlock) {
                        y0VarX.f24964m = d0.NotUsed;
                    }
                }
                f0 f0Var = i0Var.f24846a;
                f0 f0Var2 = i0Var.f24846a;
                p0.e eVarI2 = f0Var.I();
                Object[] objArr2 = eVarI2.f20230a;
                int i12 = eVarI2.f20232g;
                for (int i13 = 0; i13 < i12; i13++) {
                    ((f0) objArr2[i13]).r().f24859p.f24974w.f24837d = false;
                }
                y0Var.d().a0().e();
                p0.e eVarI3 = f0Var2.I();
                Object[] objArr3 = eVarI3.f20230a;
                int i14 = eVarI3.f20232g;
                for (int i15 = 0; i15 < i14; i15++) {
                    f0 f0Var3 = (f0) objArr3[i15];
                    if (f0Var3.x().f24962i != f0Var3.D()) {
                        f0Var2.f0();
                        f0Var2.L();
                        if (f0Var3.D() == Integer.MAX_VALUE) {
                            if (f0Var3.r().f24848c) {
                                s0 s0VarW = f0Var3.w();
                                br.l.b(s0VarW);
                                s0VarW.R(false);
                            }
                            f0Var3.x().S();
                        }
                    }
                }
                p0.e eVarI4 = f0Var2.I();
                Object[] objArr4 = eVarI4.f20230a;
                int i16 = eVarI4.f20232g;
                for (int i17 = 0; i17 < i16; i17++) {
                    g0 g0Var = ((f0) objArr4[i17]).r().f24859p.f24974w;
                    g0Var.f24838e = g0Var.f24837d;
                }
                break;
            case 1:
                y0 y0Var2 = this.f24958g;
                y0Var2.f24960g.a().s(y0Var2.A);
                break;
            default:
                y0 y0Var3 = this.f24958g;
                i0 i0Var2 = y0Var3.f24960g;
                f1 f1Var = i0Var2.a().f24823q;
                if (f1Var == null || (placementScope = f1Var.f24886l) == null) {
                    placementScope = k.t(i0Var2.f24846a).getPlacementScope();
                }
                ar.k kVar = y0Var3.F;
                if (kVar == null) {
                    f1 f1VarA = i0Var2.a();
                    long j = y0Var3.G;
                    placementScope.getClass();
                    v1.u.a(placementScope, f1VarA);
                    f1VarA.N(i3.g.A(j, f1VarA.f23813f), 0.0f, null);
                } else {
                    f1 f1VarA2 = i0Var2.a();
                    long j7 = y0Var3.G;
                    placementScope.getClass();
                    v1.u.a(placementScope, f1VarA2);
                    f1VarA2.N(i3.g.A(j7, f1VarA2.f23813f), 0.0f, kVar);
                }
                break;
        }
        return lq.b0.f15562a;
    }
}
