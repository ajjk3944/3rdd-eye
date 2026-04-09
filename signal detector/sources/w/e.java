package w;

/* loaded from: classes.dex */
public final class e extends R2.a {
    @Override // R2.a
    public final boolean a(g gVar, c cVar, c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f23922b != cVar) {
                    return false;
                }
                gVar.f23922b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // R2.a
    public final boolean b(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f23921a != obj) {
                    return false;
                }
                gVar.f23921a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // R2.a
    public final boolean c(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f23923c != fVar) {
                    return false;
                }
                gVar.f23923c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // R2.a
    public final void y(f fVar, f fVar2) {
        fVar.f23916b = fVar2;
    }

    @Override // R2.a
    public final void z(f fVar, Thread thread) {
        fVar.f23915a = thread;
    }
}
