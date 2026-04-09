package va;

import com.google.android.gms.internal.ads.up;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y2 extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public final pa.u f36186a;

    /* renamed from: b, reason: collision with root package name */
    public final up f36187b;

    public y2(pa.u uVar, up upVar) {
        this.f36186a = uVar;
        this.f36187b = upVar;
    }

    @Override // va.b0
    public final void J(w1 w1Var) {
        pa.u uVar = this.f36186a;
        if (uVar != null) {
            uVar.c(w1Var.c());
        }
    }

    @Override // va.b0
    public final void m() {
        up upVar;
        pa.u uVar = this.f36186a;
        if (uVar == null || (upVar = this.f36187b) == null) {
            return;
        }
        uVar.f(upVar);
    }
}
