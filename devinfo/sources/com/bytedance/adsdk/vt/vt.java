package com.bytedance.adsdk.vt;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class vt {
    static final int[] ouw = new int[0];
    static final long[] vt = new long[0];

    /* renamed from: lh, reason: collision with root package name */
    static final Object[] f7216lh = new Object[0];

    public static int ouw(int[] iArr, int i4, int i10) {
        int i11 = i4 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = iArr[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else {
                if (i14 <= i10) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }
}
