package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class w extends bd2 {
    @Override // defpackage.bd2
    public final boolean c(y yVar, t tVar, t tVar2) {
        synchronized (yVar) {
            try {
                if (yVar.g != tVar) {
                    return false;
                }
                yVar.g = tVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bd2
    public final boolean e(y yVar, Object obj, Object obj2) {
        synchronized (yVar) {
            try {
                if (yVar.f != obj) {
                    return false;
                }
                yVar.f = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bd2
    public final boolean f(y yVar, x xVar, x xVar2) {
        synchronized (yVar) {
            try {
                if (yVar.h != xVar) {
                    return false;
                }
                yVar.h = xVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bd2
    public final void o(x xVar, x xVar2) {
        xVar.b = xVar2;
    }

    @Override // defpackage.bd2
    public final void p(x xVar, Thread thread) {
        xVar.a = thread;
    }
}
