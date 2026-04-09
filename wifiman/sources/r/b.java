package R;

import T.InterfaceC3551q0;
import T.t1;
import Y0.d;
import Y0.t;
import z.f0;

/* loaded from: classes.dex */
public final class b implements f0 {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3551q0 f19388b;

    public b(f0 f0Var) {
        this.f19388b = t1.d(f0Var, null, 2, null);
    }

    @Override // z.f0
    public int a(d dVar, t tVar) {
        return e().a(dVar, tVar);
    }

    @Override // z.f0
    public int b(d dVar) {
        return e().b(dVar);
    }

    @Override // z.f0
    public int c(d dVar) {
        return e().c(dVar);
    }

    @Override // z.f0
    public int d(d dVar, t tVar) {
        return e().d(dVar, tVar);
    }

    public final f0 e() {
        return (f0) this.f19388b.getValue();
    }

    public final void f(f0 f0Var) {
        this.f19388b.setValue(f0Var);
    }
}
