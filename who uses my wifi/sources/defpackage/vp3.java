package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vp3 extends ou1 {
    @Override // defpackage.ou1
    public final void I(tp3 tp3Var, Set set) {
        synchronized (tp3Var) {
            try {
                if (tp3Var.m == null) {
                    tp3Var.m = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ou1
    public final int N(tp3 tp3Var) {
        int i;
        synchronized (tp3Var) {
            i = tp3Var.n - 1;
            tp3Var.n = i;
        }
        return i;
    }
}
