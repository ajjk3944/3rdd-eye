package com.bytedance.adsdk.ypw.bw;

import android.graphics.Color;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class cf implements wo<com.bytedance.adsdk.ypw.xq.ypw.dg> {
    private int emc;

    public cf(int i) {
        this.emc = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
    @Override // com.bytedance.adsdk.ypw.bw.wo
    /* renamed from: emc, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.adsdk.ypw.xq.ypw.dg ypw(android.util.JsonReader r18, float r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ypw.bw.cf.ypw(android.util.JsonReader, float):com.bytedance.adsdk.ypw.xq.ypw.dg");
    }

    private com.bytedance.adsdk.ypw.xq.ypw.dg emc(com.bytedance.adsdk.ypw.xq.ypw.dg dgVar, List<Float> list) {
        int i = this.emc * 4;
        if (list.size() <= i) {
            return dgVar;
        }
        float[] fArrEmc = dgVar.emc();
        int[] iArrYpw = dgVar.ypw();
        int size = (list.size() - i) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i3 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                fArr[i3] = list.get(i).floatValue();
            } else {
                fArr2[i3] = list.get(i).floatValue();
                i3++;
            }
            i++;
        }
        float[] fArrEmc2 = emc(dgVar.emc(), fArr);
        int length = fArrEmc2.length;
        int[] iArr = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            float f2 = fArrEmc2[i6];
            int iBinarySearch = Arrays.binarySearch(fArrEmc, f2);
            int iBinarySearch2 = Arrays.binarySearch(fArr, f2);
            if (iBinarySearch >= 0 && iBinarySearch2 <= 0) {
                iArr[i6] = emc(f2, iArrYpw[iBinarySearch], fArr, fArr2);
            } else {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                iArr[i6] = emc(f2, fArr2[iBinarySearch2], fArrEmc, iArrYpw);
            }
        }
        return new com.bytedance.adsdk.ypw.xq.ypw.dg(fArrEmc2, iArr);
    }

    public int emc(float f2, float f5, float[] fArr, int[] iArr) {
        if (iArr.length >= 2 && f2 != fArr[0]) {
            for (int i = 1; i < fArr.length; i++) {
                float f6 = fArr[i];
                if (f6 >= f2 || i == fArr.length - 1) {
                    int i3 = i - 1;
                    float f7 = fArr[i3];
                    float f8 = (f2 - f7) / (f6 - f7);
                    int i6 = iArr[i];
                    int i7 = iArr[i3];
                    return Color.argb((int) (f5 * 255.0f), com.bytedance.adsdk.ypw.ycc.ypw.emc(f8, Color.red(i7), Color.red(i6)), com.bytedance.adsdk.ypw.ycc.ypw.emc(f8, Color.green(i7), Color.green(i6)), com.bytedance.adsdk.ypw.ycc.ypw.emc(f8, Color.blue(i7), Color.blue(i6)));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return iArr[0];
    }

    private int emc(float f2, int i, float[] fArr, float[] fArr2) {
        float fEmc;
        if (fArr2.length >= 2 && f2 > fArr[0]) {
            for (int i3 = 1; i3 < fArr.length; i3++) {
                float f5 = fArr[i3];
                if (f5 >= f2 || i3 == fArr.length - 1) {
                    if (f5 <= f2) {
                        fEmc = fArr2[i3];
                    } else {
                        int i6 = i3 - 1;
                        float f6 = fArr[i6];
                        fEmc = com.bytedance.adsdk.ypw.ycc.bw.emc(fArr2[i6], fArr2[i3], (f2 - f6) / (f5 - f6));
                    }
                    return Color.argb((int) (fEmc * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static float[] emc(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i = 0;
        int i3 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            float f2 = i3 < fArr.length ? fArr[i3] : Float.NaN;
            float f5 = i6 < fArr2.length ? fArr2[i6] : Float.NaN;
            if (!Float.isNaN(f5) && f2 >= f5) {
                if (!Float.isNaN(f2) && f5 >= f2) {
                    fArr3[i7] = f2;
                    i3++;
                    i6++;
                    i++;
                } else {
                    fArr3[i7] = f5;
                    i6++;
                }
            } else {
                fArr3[i7] = f2;
                i3++;
            }
        }
        return i == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i);
    }
}
