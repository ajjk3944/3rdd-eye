package x1;

import androidx.compose.ui.node.Owner;

/* loaded from: classes.dex */
public final class r0 extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s0 f24915d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Owner f24916g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f24917r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, Owner owner, long j) {
        super(0);
        this.f24915d = s0Var;
        this.f24916g = owner;
        this.f24917r = j;
    }

    @Override // ar.a
    public final Object c() {
        n0 n0VarT0;
        i0 i0Var = this.f24915d.f24918g;
        v1.u placementScope = null;
        if (k.o(i0Var.f24846a) || i0Var.f24848c) {
            f1 f1Var = i0Var.a().f24823q;
            if (f1Var != null) {
                placementScope = f1Var.f24886l;
            }
        } else {
            f1 f1Var2 = i0Var.a().f24823q;
            if (f1Var2 != null && (n0VarT0 = f1Var2.t0()) != null) {
                placementScope = n0VarT0.f24886l;
            }
        }
        if (placementScope == null) {
            placementScope = this.f24916g.getPlacementScope();
        }
        n0 n0VarT02 = i0Var.a().t0();
        br.l.b(n0VarT02);
        v1.u.f(placementScope, n0VarT02, this.f24917r);
        return lq.b0.f15562a;
    }
}
