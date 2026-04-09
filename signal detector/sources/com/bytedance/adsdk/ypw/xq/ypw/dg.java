package com.bytedance.adsdk.ypw.xq.ypw;

import java.util.Arrays;
import o4.AbstractC2763b;

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

    public void emc(dg dgVar, dg dgVar2, float f2) {
        if (dgVar.ypw.length != dgVar2.ypw.length) {
            StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb.append(dgVar.ypw.length);
            sb.append(" vs ");
            throw new IllegalArgumentException(AbstractC2763b.d(dgVar2.ypw.length, ")", sb));
        }
        for (int i = 0; i < dgVar.ypw.length; i++) {
            this.emc[i] = com.bytedance.adsdk.ypw.ycc.bw.emc(dgVar.emc[i], dgVar2.emc[i], f2);
            this.ypw[i] = com.bytedance.adsdk.ypw.ycc.ypw.emc(f2, dgVar.ypw[i], dgVar2.ypw[i]);
        }
    }

    public dg emc(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = emc(fArr[i]);
        }
        return new dg(fArr, iArr);
    }

    private int emc(float f2) {
        int iBinarySearch = Arrays.binarySearch(this.emc, f2);
        if (iBinarySearch >= 0) {
            return this.ypw[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        if (i == 0) {
            return this.ypw[0];
        }
        int[] iArr = this.ypw;
        if (i == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.emc;
        int i3 = i - 1;
        float f5 = fArr[i3];
        return com.bytedance.adsdk.ypw.ycc.ypw.emc((f2 - f5) / (fArr[i] - f5), iArr[i3], iArr[i]);
    }
}
