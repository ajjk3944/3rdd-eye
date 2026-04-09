package w2;

import ba.m;

/* loaded from: classes.dex */
public final class e extends m {
    @Override // ba.m
    public final void J(f fVar, f fVar2) {
        fVar.f24177b = fVar2;
    }

    @Override // ba.m
    public final void K(f fVar, Thread thread) {
        fVar.f24176a = thread;
    }

    @Override // ba.m
    public final boolean g(g gVar, c cVar, c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f24182d != cVar) {
                    return false;
                }
                gVar.f24182d = cVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ba.m
    public final boolean h(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f24181a != obj) {
                    return false;
                }
                gVar.f24181a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ba.m
    public final boolean i(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f24183g != fVar) {
                    return false;
                }
                gVar.f24183g = fVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
