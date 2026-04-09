package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mo0 {
    public SparseArray a;
    public int b;

    public final lo0 a(int i) {
        SparseArray sparseArray = this.a;
        lo0 lo0Var = (lo0) sparseArray.get(i);
        if (lo0Var != null) {
            return lo0Var;
        }
        lo0 lo0Var2 = new lo0();
        sparseArray.put(i, lo0Var2);
        return lo0Var2;
    }
}
