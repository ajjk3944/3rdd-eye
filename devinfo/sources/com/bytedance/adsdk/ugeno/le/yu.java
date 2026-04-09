package com.bytedance.adsdk.ugeno.le;

import java.util.Collection;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu {
    public static int ouw(boolean z3, int i4, int i10) {
        if (i10 == 0 || !z3) {
            return i4;
        }
        int i11 = i4 - 512;
        int iAbs = Math.abs(i11) % i10;
        return (i11 >= 0 || iAbs == 0) ? iAbs : i10 - iAbs;
    }

    public static boolean ouw(int i4, Collection<?> collection) {
        return i4 >= 0 && i4 < collection.size();
    }
}
