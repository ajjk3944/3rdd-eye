package defpackage;

import android.os.Looper;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sj0 {
    public static final rj0 c = new rj0();
    public static final qj0 d = new qj0();
    public final nf0 a = new nf0();
    public final ou0 b = new ou0();

    public sj0() {
        a(d);
    }

    public final void a(yc0 yc0Var) {
        boolean z;
        nf0 nf0Var = this.a;
        synchronized (nf0Var.a) {
            z = nf0Var.f == nf0.k;
            nf0Var.f = yc0Var;
        }
        if (z) {
            j8 j8VarT = j8.T();
            a9 a9Var = nf0Var.j;
            wn wnVar = j8VarT.D;
            if (wnVar.F == null) {
                synchronized (wnVar.D) {
                    try {
                        if (wnVar.F == null) {
                            wnVar.F = wn.T(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            wnVar.F.post(a9Var);
        }
        if (yc0Var instanceof rj0) {
            this.b.i((rj0) yc0Var);
        } else if (yc0Var instanceof pj0) {
            this.b.j(((pj0) yc0Var).n);
        }
    }
}
