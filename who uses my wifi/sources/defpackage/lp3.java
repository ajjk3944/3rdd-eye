package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class lp3 {
    public static /* synthetic */ boolean a(Unsafe unsafe, op3 op3Var, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(op3Var, j, obj, obj2)) {
            if (unsafe.getObject(op3Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
