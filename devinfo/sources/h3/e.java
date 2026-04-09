package h3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends ii.a {
    @Override // ii.a
    public final boolean d(g gVar, c cVar, c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f24831b != cVar) {
                    return false;
                }
                gVar.f24831b = cVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ii.a
    public final boolean e(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f24830a != obj) {
                    return false;
                }
                gVar.f24830a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ii.a
    public final boolean f(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f24832c != fVar) {
                    return false;
                }
                gVar.f24832c = fVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ii.a
    public final void u(f fVar, f fVar2) {
        fVar.f24826b = fVar2;
    }

    @Override // ii.a
    public final void v(f fVar, Thread thread) {
        fVar.f24825a = thread;
    }
}
