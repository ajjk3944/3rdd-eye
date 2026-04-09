package x0;

import n0.q0;
import w.b0;

/* loaded from: classes.dex */
public final class a extends b {
    @Override // x0.b
    public final b C(ar.k kVar, ar.k kVar2) {
        return (b) ((f) l.f(new b0(new q0(kVar, 3, kVar2), 1)));
    }

    @Override // x0.b, x0.f
    public final void c() {
        synchronized (l.f24717c) {
            o();
        }
    }

    @Override // x0.b, x0.f
    public final void k() {
        p.j();
        throw null;
    }

    @Override // x0.b, x0.f
    public final void l() {
        p.j();
        throw null;
    }

    @Override // x0.b, x0.f
    public final void m() {
        l.a();
    }

    @Override // x0.b, x0.f
    public final f u(ar.k kVar) {
        return (e) ((f) l.f(new b0(new bs.a(3, kVar), 1)));
    }

    @Override // x0.b
    public final p w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
