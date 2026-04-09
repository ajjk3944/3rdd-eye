package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qe0 {
    public final SparseArray a;
    public q31 b;

    public qe0(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(q31 q31Var, int i, int i2) {
        int iA = q31Var.a(i);
        SparseArray sparseArray = this.a;
        qe0 qe0Var = sparseArray == null ? null : (qe0) sparseArray.get(iA);
        if (qe0Var == null) {
            qe0Var = new qe0(1);
            sparseArray.put(q31Var.a(i), qe0Var);
        }
        if (i2 > i) {
            qe0Var.a(q31Var, i + 1, i2);
        } else {
            qe0Var.b = q31Var;
        }
    }
}
