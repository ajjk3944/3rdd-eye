package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.bD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0925bD {
    public static /* synthetic */ boolean a(Unsafe unsafe, YC yc, long j6, VC vc, VC vc2) {
        while (!unsafe.compareAndSwapObject(yc, j6, vc, vc2)) {
            if (unsafe.getObject(yc, j6) != vc) {
                return false;
            }
        }
        return true;
    }
}
