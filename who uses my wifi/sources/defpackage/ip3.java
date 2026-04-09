package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ip3 extends ob1 {
    @Override // defpackage.ob1
    public final void A(np3 np3Var, np3 np3Var2) {
        np3Var.b = np3Var2;
    }

    @Override // defpackage.ob1
    public final boolean E(op3 op3Var, np3 np3Var, np3 np3Var2) {
        synchronized (op3Var) {
            try {
                if (op3Var.h != np3Var) {
                    return false;
                }
                op3Var.h = np3Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ob1
    public final boolean G(gp3 gp3Var, dp3 dp3Var, dp3 dp3Var2) {
        synchronized (gp3Var) {
            try {
                if (gp3Var.g != dp3Var) {
                    return false;
                }
                gp3Var.g = dp3Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ob1
    public final np3 H(gp3 gp3Var) {
        np3 np3Var;
        np3 np3Var2 = np3.c;
        synchronized (gp3Var) {
            try {
                np3Var = gp3Var.h;
                if (np3Var != np3Var2) {
                    gp3Var.h = np3Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return np3Var;
    }

    @Override // defpackage.ob1
    public final dp3 K(gp3 gp3Var) {
        dp3 dp3Var;
        dp3 dp3Var2 = dp3.d;
        synchronized (gp3Var) {
            try {
                dp3Var = gp3Var.g;
                if (dp3Var != dp3Var2) {
                    gp3Var.g = dp3Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dp3Var;
    }

    @Override // defpackage.ob1
    public final boolean L(op3 op3Var, Object obj, Object obj2) {
        synchronized (op3Var) {
            try {
                if (op3Var.f != obj) {
                    return false;
                }
                op3Var.f = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ob1
    public final void x(np3 np3Var, Thread thread) {
        np3Var.a = thread;
    }
}
