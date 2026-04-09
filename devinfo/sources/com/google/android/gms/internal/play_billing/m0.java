package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class m0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, k0 k0Var, long j, Object obj, Object obj2) {
        while (!l0.a(unsafe, k0Var, j, obj, obj2)) {
            if (unsafe.getObject(k0Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
