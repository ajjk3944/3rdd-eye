package com.bytedance.adsdk.vt.lh.vt;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu {
    public final float[] ouw;
    public final int[] vt;

    public yu(float[] fArr, int[] iArr) {
        this.ouw = fArr;
        this.vt = iArr;
    }

    public final yu ouw(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i4 = 0; i4 < fArr.length; i4++) {
            iArr[i4] = ouw(fArr[i4]);
        }
        return new yu(fArr, iArr);
    }

    private int ouw(float f10) {
        int iBinarySearch = Arrays.binarySearch(this.ouw, f10);
        if (iBinarySearch >= 0) {
            return this.vt[iBinarySearch];
        }
        int i4 = -(iBinarySearch + 1);
        if (i4 == 0) {
            return this.vt[0];
        }
        int[] iArr = this.vt;
        if (i4 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.ouw;
        int i10 = i4 - 1;
        float f11 = fArr[i10];
        return com.bytedance.adsdk.vt.le.vt.ouw((f10 - f11) / (fArr[i4] - f11), iArr[i10], iArr[i4]);
    }
}
