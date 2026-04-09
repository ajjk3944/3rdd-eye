package com.bytedance.adsdk.ypw;

/* loaded from: classes.dex */
class ypw {
    static final int[] emc = new int[0];
    static final long[] ypw = new long[0];
    static final Object[] xq = new Object[0];

    public static int emc(int[] iArr, int i, int i3) {
        int i6 = i - 1;
        int i7 = 0;
        while (i7 <= i6) {
            int i8 = (i7 + i6) >>> 1;
            int i9 = iArr[i8];
            if (i9 < i3) {
                i7 = i8 + 1;
            } else {
                if (i9 <= i3) {
                    return i8;
                }
                i6 = i8 - 1;
            }
        }
        return ~i7;
    }
}
