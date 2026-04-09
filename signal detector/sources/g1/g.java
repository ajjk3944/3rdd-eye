package g1;

/* loaded from: classes.dex */
public final class g extends com.bumptech.glide.c {
    @Override // com.bumptech.glide.c
    public final void H(h hVar, h hVar2) {
        hVar.f20158b = hVar2;
    }

    @Override // com.bumptech.glide.c
    public final void I(h hVar, Thread thread) {
        hVar.f20157a = thread;
    }

    @Override // com.bumptech.glide.c
    public final boolean d(i iVar, d dVar, d dVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f20164b != dVar) {
                    return false;
                }
                iVar.f20164b = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.c
    public final boolean e(i iVar, Object obj, Object obj2) {
        synchronized (iVar) {
            try {
                if (iVar.f20163a != obj) {
                    return false;
                }
                iVar.f20163a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.c
    public final boolean f(i iVar, h hVar, h hVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f20165c != hVar) {
                    return false;
                }
                iVar.f20165c = hVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
