package v1;

import x1.l0;
import x1.m0;
import x1.y1;

/* loaded from: classes.dex */
public final class z extends z0.l implements x1.v, y1 {

    /* renamed from: p, reason: collision with root package name */
    public l f23820p;

    /* renamed from: q, reason: collision with root package name */
    public final c7.b f23821q;

    public z(l lVar) {
        this.f23820p = lVar;
        this.f23821q = new c7.b(this, 22, lVar);
    }

    @Override // x1.v
    public final l0 K(m0 m0Var, q qVar, long j) {
        v vVarS = qVar.s(j);
        return m0Var.h0(vVarS.f23809b, vVarS.f23810c, mq.x.f16946a, this.f23821q, new d1.b(vVarS, 2));
    }

    @Override // x1.y1
    public final Object f() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }
}
