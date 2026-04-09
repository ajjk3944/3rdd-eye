package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class jp3 {
    public static /* synthetic */ boolean a(Unsafe unsafe, op3 op3Var, long j, np3 np3Var, np3 np3Var2) {
        while (!unsafe.compareAndSwapObject(op3Var, j, np3Var, np3Var2)) {
            if (unsafe.getObject(op3Var, j) != np3Var) {
                return false;
            }
        }
        return true;
    }
}
