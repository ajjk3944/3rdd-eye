package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.dD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1034dD {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractC1198gD abstractC1198gD, long j6, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractC1198gD, j6, obj, obj2)) {
            if (unsafe.getObject(abstractC1198gD, j6) != obj) {
                return false;
            }
        }
        return true;
    }
}
