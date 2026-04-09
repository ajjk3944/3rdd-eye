package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes.dex */
public class zz {
    public static long emc(float f2, float f5) {
        return Float.floatToRawIntBits(f5) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static long emc(int i, int i3) {
        return emc(i, i3);
    }
}
