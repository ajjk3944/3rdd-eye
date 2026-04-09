package lr;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class s0 extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15682d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t0 f15683g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(t0 t0Var, int i10) {
        super(0);
        this.f15682d = i10;
        this.f15683g = t0Var;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f15682d) {
            case 0:
                return z1.d(this.f15683g.a());
            default:
                t0 t0Var = this.f15683g;
                rr.k0 k0VarA = t0Var.a();
                r rVar = t0Var.f15689a;
                if (!(k0VarA instanceof ur.v) || !br.l.a(z1.g(rVar.C()), k0VarA) || rVar.C().f() != rr.c.FAKE_OVERRIDE) {
                    return (Type) rVar.z().a().get(t0Var.f15690d);
                }
                rr.l lVarO = rVar.C().o();
                br.l.c(lVarO, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                Class clsJ = z1.j((rr.f) lVarO);
                if (clsJ != null) {
                    return clsJ;
                }
                throw new lq.k("Cannot determine receiver Java type of inherited declaration: " + k0VarA, 1);
        }
    }
}
