package g1;

import a0.p0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends c {
    @Override // g1.c
    public final c D(mk.c cVar, mk.c cVar2) {
        return (c) ((g) m.e(new p0(new a(0, cVar, cVar2), 1)));
    }

    @Override // g1.c, g1.g
    public final void c() {
        synchronized (m.f24260c) {
            o();
        }
    }

    @Override // g1.c, g1.g
    public final void k() {
        r.q();
        throw null;
    }

    @Override // g1.c, g1.g
    public final void l() {
        r.q();
        throw null;
    }

    @Override // g1.c, g1.g
    public final void m() {
        m.a();
    }

    @Override // g1.c, g1.g
    public final g u(mk.c cVar) {
        int i4 = 1;
        return (f) ((g) m.e(new p0(new c2.d0(i4, cVar), i4)));
    }

    @Override // g1.c
    public final r w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
