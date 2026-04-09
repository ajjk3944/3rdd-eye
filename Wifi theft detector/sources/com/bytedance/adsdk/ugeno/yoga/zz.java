package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes.dex */
public class zz {
    public static long emc(float f10, float f11) {
        return Float.floatToRawIntBits(f11) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static long emc(int i10, int i11) {
        return emc(i10, i11);
    }
}
