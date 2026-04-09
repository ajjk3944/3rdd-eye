package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class q71 {
    public static /* synthetic */ boolean a(Unsafe unsafe, u71 u71Var, long j, t71 t71Var, t71 t71Var2) {
        while (!unsafe.compareAndSwapObject(u71Var, j, t71Var, t71Var2)) {
            if (unsafe.getObject(u71Var, j) != t71Var) {
                return false;
            }
        }
        return true;
    }
}
