package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o71 extends mq0 {
    @Override // com.google.android.gms.internal.ads.mq0
    public final boolean L(u71 u71Var, t71 t71Var, t71 t71Var2) {
        synchronized (u71Var) {
            try {
                if (u71Var.f17115c != t71Var) {
                    return false;
                }
                u71Var.f17115c = t71Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.mq0
    public final boolean R(m71 m71Var, j71 j71Var, j71 j71Var2) {
        synchronized (m71Var) {
            try {
                if (m71Var.f17114b != j71Var) {
                    return false;
                }
                m71Var.f17114b = j71Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.mq0
    public final t71 T(m71 m71Var) {
        t71 t71Var;
        t71 t71Var2 = t71.f16728c;
        synchronized (m71Var) {
            try {
                t71Var = m71Var.f17115c;
                if (t71Var != t71Var2) {
                    m71Var.f17115c = t71Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t71Var;
    }

    @Override // com.google.android.gms.internal.ads.mq0
    public final j71 Y(m71 m71Var) {
        j71 j71Var;
        j71 j71Var2 = j71.f12670d;
        synchronized (m71Var) {
            try {
                j71Var = m71Var.f17114b;
                if (j71Var != j71Var2) {
                    m71Var.f17114b = j71Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j71Var;
    }

    @Override // com.google.android.gms.internal.ads.mq0
    public final boolean b0(u71 u71Var, Object obj, Object obj2) {
        synchronized (u71Var) {
            try {
                if (u71Var.f17113a != obj) {
                    return false;
                }
                u71Var.f17113a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.mq0
    public final void k(t71 t71Var, Thread thread) {
        t71Var.f16729a = thread;
    }

    @Override // com.google.android.gms.internal.ads.mq0
    public final void w(t71 t71Var, t71 t71Var2) {
        t71Var.f16730b = t71Var2;
    }
}
