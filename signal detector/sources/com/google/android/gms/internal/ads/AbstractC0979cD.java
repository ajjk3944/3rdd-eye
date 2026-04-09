package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.cD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0979cD {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractC1198gD abstractC1198gD, long j6, C1143fD c1143fD, C1143fD c1143fD2) {
        while (!unsafe.compareAndSwapObject(abstractC1198gD, j6, c1143fD, c1143fD2)) {
            if (unsafe.getObject(abstractC1198gD, j6) != c1143fD) {
                return false;
            }
        }
        return true;
    }
}
