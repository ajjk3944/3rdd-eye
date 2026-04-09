package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w3 extends u6.t {
    @Override // u6.t
    public final boolean A(y3 y3Var, Object obj, Object obj2) {
        synchronized (y3Var) {
            try {
                if (y3Var.f20267a != obj) {
                    return false;
                }
                y3Var.f20267a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // u6.t
    public final boolean C(y3 y3Var, x3 x3Var, x3 x3Var2) {
        synchronized (y3Var) {
            try {
                if (y3Var.f20269c != x3Var) {
                    return false;
                }
                y3Var.f20269c = x3Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // u6.t
    public final void u(x3 x3Var, x3 x3Var2) {
        x3Var.f20260b = x3Var2;
    }

    @Override // u6.t
    public final void w(x3 x3Var, Thread thread) {
        x3Var.f20259a = thread;
    }

    @Override // u6.t
    public final boolean y(y3 y3Var, n2 n2Var, n2 n2Var2) {
        synchronized (y3Var) {
            try {
                if (y3Var.f20268b != n2Var) {
                    return false;
                }
                y3Var.f20268b = n2Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
