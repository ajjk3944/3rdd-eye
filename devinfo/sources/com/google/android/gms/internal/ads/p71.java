package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class p71 {
    public static /* synthetic */ boolean a(Unsafe unsafe, m71 m71Var, long j, j71 j71Var, j71 j71Var2) {
        while (!unsafe.compareAndSwapObject(m71Var, j, j71Var, j71Var2)) {
            if (unsafe.getObject(m71Var, j) != j71Var) {
                return false;
            }
        }
        return true;
    }
}
