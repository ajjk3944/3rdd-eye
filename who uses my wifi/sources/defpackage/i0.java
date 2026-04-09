package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class i0 extends uk2 {
    @Override // defpackage.uk2
    public final boolean e(k0 k0Var, g0 g0Var, g0 g0Var2) {
        synchronized (k0Var) {
            try {
                if (k0Var.g != g0Var) {
                    return false;
                }
                k0Var.g = g0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.uk2
    public final boolean f(k0 k0Var, Object obj, Object obj2) {
        synchronized (k0Var) {
            try {
                if (k0Var.f != obj) {
                    return false;
                }
                k0Var.f = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.uk2
    public final boolean g(k0 k0Var, j0 j0Var, j0 j0Var2) {
        synchronized (k0Var) {
            try {
                if (k0Var.h != j0Var) {
                    return false;
                }
                k0Var.h = j0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.uk2
    public final void t(j0 j0Var, j0 j0Var2) {
        j0Var.b = j0Var2;
    }

    @Override // defpackage.uk2
    public final void u(j0 j0Var, Thread thread) {
        j0Var.a = thread;
    }
}
