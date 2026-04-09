package g2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b1 extends nk.l implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f24311b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(c1 c1Var, int i4) {
        super(2);
        this.f24310a = i4;
        this.f24311b = c1Var;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24310a) {
            case 0:
                this.f24311b.a().f24330b = (u0.t) obj2;
                break;
            case 1:
                f0 f0VarA = this.f24311b.a();
                ((i2.e0) obj).c0(new b0(f0VarA, (mk.e) obj2, f0VarA.f24342p));
                break;
            default:
                i2.e0 e0Var = (i2.e0) obj;
                c1 c1Var = this.f24311b;
                yb.i iVar = c1Var.f24313a;
                f0 f0Var = e0Var.I;
                if (f0Var == null) {
                    f0Var = new f0(e0Var, iVar);
                    e0Var.I = f0Var;
                }
                c1Var.f24314b = f0Var;
                c1Var.a().h();
                f0 f0VarA2 = c1Var.a();
                if (f0VarA2.f24331c != iVar) {
                    f0VarA2.f24331c = iVar;
                    f0VarA2.i(false);
                    i2.e0.V(f0VarA2.f24329a, false, 7);
                }
                break;
        }
        return yj.u.f37649a;
    }
}
