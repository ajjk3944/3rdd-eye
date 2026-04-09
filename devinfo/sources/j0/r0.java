package j0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f26955b;

    public /* synthetic */ r0(t0 t0Var, int i4) {
        this.f26954a = i4;
        this.f26955b = t0Var;
    }

    @Override // mk.a
    public final Object invoke() {
        switch (this.f26954a) {
            case 0:
                i0.u uVar = this.f26955b.f26979p.f25413b;
                return Float.valueOf((((u0.a1) uVar.f25512e.f2684b).g() * 500) + ((u0.a1) uVar.f25512e.f2685c).g());
            case 1:
                i0.u uVar2 = this.f26955b.f26979p.f25413b;
                int iG = ((u0.a1) uVar2.f25512e.f2684b).g();
                int iG2 = ((u0.a1) uVar2.f25512e.f2685c).g();
                return Float.valueOf(uVar2.d() ? (iG * 500) + iG2 + 100 : (iG * 500) + iG2);
            default:
                t0 t0Var = this.f26955b;
                i0.u uVar3 = t0Var.f26979p.f25413b;
                int iE = (int) (uVar3.g().f25476o == d0.a1.f21662a ? uVar3.g().e() & 4294967295L : uVar3.g().e() >> 32);
                i0.u uVar4 = t0Var.f26979p.f25413b;
                return Float.valueOf(iE - ((-uVar4.g().f25473l) + uVar4.g().f25477p));
        }
    }
}
