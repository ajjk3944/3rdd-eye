package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h0 extends pk.a {
    @Override // pk.a
    public final e0 B(t0 t0Var) {
        e0 e0Var;
        e0 e0Var2 = e0.f20102d;
        synchronized (t0Var) {
            try {
                e0Var = t0Var.f20170b;
                if (e0Var != e0Var2) {
                    t0Var.f20170b = e0Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return e0Var;
    }

    @Override // pk.a
    public final j0 D(t0 t0Var) {
        j0 j0Var;
        j0 j0Var2 = j0.f20156c;
        synchronized (t0Var) {
            try {
                j0Var = t0Var.f20171c;
                if (j0Var != j0Var2) {
                    t0Var.f20171c = j0Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j0Var;
    }

    @Override // pk.a
    public final void G(j0 j0Var, j0 j0Var2) {
        j0Var.f20158b = j0Var2;
    }

    @Override // pk.a
    public final void I(j0 j0Var, Thread thread) {
        j0Var.f20157a = thread;
    }

    @Override // pk.a
    public final boolean K(t0 t0Var, e0 e0Var, e0 e0Var2) {
        synchronized (t0Var) {
            try {
                if (t0Var.f20170b != e0Var) {
                    return false;
                }
                t0Var.f20170b = e0Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // pk.a
    public final boolean M(k0 k0Var, Object obj, Object obj2) {
        synchronized (k0Var) {
            try {
                if (k0Var.f20169a != obj) {
                    return false;
                }
                k0Var.f20169a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // pk.a
    public final boolean N(k0 k0Var, j0 j0Var, j0 j0Var2) {
        synchronized (k0Var) {
            try {
                if (k0Var.f20171c != j0Var) {
                    return false;
                }
                k0Var.f20171c = j0Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
