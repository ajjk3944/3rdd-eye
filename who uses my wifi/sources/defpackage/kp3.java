package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class kp3 {
    public static /* synthetic */ boolean a(Unsafe unsafe, gp3 gp3Var, long j, dp3 dp3Var, dp3 dp3Var2) {
        while (!unsafe.compareAndSwapObject(gp3Var, j, dp3Var, dp3Var2)) {
            if (unsafe.getObject(gp3Var, j) != dp3Var) {
                return false;
            }
        }
        return true;
    }
}
