package g3;

import c0.i0;
import i2.h1;
import j0.h0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u extends i2.j implements h1, i2.h {

    /* renamed from: q, reason: collision with root package name */
    public final n1.s f24534q;

    /* renamed from: r, reason: collision with root package name */
    public h0 f24535r;

    public u() {
        n1.s sVar = new n1.s(0, new i0(2, this, u.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0, 1), 9);
        p0(sVar);
        this.f24534q = sVar;
    }

    @Override // i2.h1
    public final void P() {
        nk.u uVar = new nk.u();
        i2.k.p(this, new c2.c(1, uVar, this));
        h0 h0Var = (h0) uVar.f29986a;
        if (this.f24534q.u0().a()) {
            h0 h0Var2 = this.f24535r;
            if (h0Var2 != null) {
                h0Var2.b();
            }
            if (h0Var != null) {
                h0Var.a();
            } else {
                h0Var = null;
            }
            this.f24535r = h0Var;
        }
    }
}
