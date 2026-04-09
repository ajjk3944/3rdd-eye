package com.bytedance.adsdk.ugeno.ycc;

import java.util.Collection;

/* loaded from: classes.dex */
public class dg {
    public static int emc(boolean z10, int i10, int i11) {
        if (i11 == 0 || !z10) {
            return i10;
        }
        int i12 = i10 - 512;
        int iAbs = Math.abs(i12) % i11;
        return (i12 >= 0 || iAbs == 0) ? iAbs : i11 - iAbs;
    }

    public static boolean emc(int i10, Collection<?> collection) {
        return i10 >= 0 && i10 < collection.size();
    }
}
