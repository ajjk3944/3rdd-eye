package com.bytedance.adsdk.ugeno.ycc;

import java.util.Collection;

/* loaded from: classes.dex */
public class dg {
    public static int emc(boolean z6, int i, int i3) {
        if (i3 == 0 || !z6) {
            return i;
        }
        int i6 = i - 512;
        int iAbs = Math.abs(i6) % i3;
        return (i6 >= 0 || iAbs == 0) ? iAbs : i3 - iAbs;
    }

    public static boolean emc(int i, Collection<?> collection) {
        return i >= 0 && i < collection.size();
    }
}
