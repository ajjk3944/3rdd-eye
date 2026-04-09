package N;

import T.InterfaceC3551q0;
import T.t1;

/* renamed from: N.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3339p0 implements z.f0 {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3551q0 f14652b;

    public C3339p0(z.f0 f0Var) {
        this.f14652b = t1.d(f0Var, null, 2, null);
    }

    @Override // z.f0
    public int a(Y0.d dVar, Y0.t tVar) {
        return e().a(dVar, tVar);
    }

    @Override // z.f0
    public int b(Y0.d dVar) {
        return e().b(dVar);
    }

    @Override // z.f0
    public int c(Y0.d dVar) {
        return e().c(dVar);
    }

    @Override // z.f0
    public int d(Y0.d dVar, Y0.t tVar) {
        return e().d(dVar, tVar);
    }

    public final z.f0 e() {
        return (z.f0) this.f14652b.getValue();
    }

    public final void f(z.f0 f0Var) {
        this.f14652b.setValue(f0Var);
    }
}
