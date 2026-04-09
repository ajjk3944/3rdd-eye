package com.bytedance.adsdk.ypw.xq.ypw;

import java.util.Arrays;

/* loaded from: classes.dex */
public class dg {
    private final float[] emc;
    private final int[] ypw;

    public dg(float[] fArr, int[] iArr) {
        this.emc = fArr;
        this.ypw = iArr;
    }

    public float[] emc() {
        return this.emc;
    }

    public int xq() {
        return this.ypw.length;
    }

    public int[] ypw() {
        return this.ypw;
    }

    public void emc(dg dgVar, dg dgVar2, float f10) {
        if (dgVar.ypw.length == dgVar2.ypw.length) {
            for (int i10 = 0; i10 < dgVar.ypw.length; i10++) {
                this.emc[i10] = com.bytedance.adsdk.ypw.ycc.bw.emc(dgVar.emc[i10], dgVar2.emc[i10], f10);
                this.ypw[i10] = com.bytedance.adsdk.ypw.ycc.ypw.emc(f10, dgVar.ypw[i10], dgVar2.ypw[i10]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dgVar.ypw.length + " vs " + dgVar2.ypw.length + ")");
    }

    public dg emc(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            iArr[i10] = emc(fArr[i10]);
        }
        return new dg(fArr, iArr);
    }

    private int emc(float f10) {
        int iBinarySearch = Arrays.binarySearch(this.emc, f10);
        if (iBinarySearch >= 0) {
            return this.ypw[iBinarySearch];
        }
        int i10 = -(iBinarySearch + 1);
        if (i10 == 0) {
            return this.ypw[0];
        }
        int[] iArr = this.ypw;
        if (i10 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.emc;
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        return com.bytedance.adsdk.ypw.ycc.ypw.emc((f10 - f11) / (fArr[i10] - f11), iArr[i11], iArr[i10]);
    }
}
