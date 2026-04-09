package com.bytedance.adsdk.vt.fkw;

import android.graphics.Color;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class mwh implements osn<com.bytedance.adsdk.vt.lh.vt.yu> {
    private int ouw;

    public mwh(int i4) {
        this.ouw = i4;
    }

    private com.bytedance.adsdk.vt.lh.vt.yu ouw(com.bytedance.adsdk.vt.lh.vt.yu yuVar, List<Float> list) {
        char c9;
        int iArgb;
        int i4 = this.ouw * 4;
        if (list.size() <= i4) {
            return yuVar;
        }
        float[] fArr = yuVar.ouw;
        int[] iArr = yuVar.vt;
        int i10 = 2;
        int size = (list.size() - i4) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        char c10 = 0;
        int i11 = 0;
        while (i4 < list.size()) {
            if (i4 % 2 == 0) {
                fArr2[i11] = list.get(i4).floatValue();
            } else {
                fArr3[i11] = list.get(i4).floatValue();
                i11++;
            }
            i4++;
        }
        float[] fArrCopyOf = yuVar.ouw;
        if (fArrCopyOf.length == 0) {
            fArrCopyOf = fArr2;
        } else if (size != 0) {
            int length = fArrCopyOf.length + size;
            float[] fArr4 = new float[length];
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < length; i15++) {
                float f10 = i13 < fArrCopyOf.length ? fArrCopyOf[i13] : Float.NaN;
                float f11 = i14 < size ? fArr2[i14] : Float.NaN;
                if (Float.isNaN(f11) || f10 < f11) {
                    fArr4[i15] = f10;
                    i13++;
                } else if (Float.isNaN(f10) || f11 < f10) {
                    fArr4[i15] = f11;
                    i14++;
                } else {
                    fArr4[i15] = f10;
                    i13++;
                    i14++;
                    i12++;
                }
            }
            fArrCopyOf = i12 == 0 ? fArr4 : Arrays.copyOf(fArr4, length - i12);
        }
        int length2 = fArrCopyOf.length;
        int[] iArr2 = new int[length2];
        int i16 = 0;
        while (i16 < length2) {
            float f12 = fArrCopyOf[i16];
            int iBinarySearch = Arrays.binarySearch(fArr, f12);
            int iBinarySearch2 = Arrays.binarySearch(fArr2, f12);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f13 = fArr3[iBinarySearch2];
                if (iArr.length >= i10 && f12 != fArr[c10]) {
                    for (int i17 = 1; i17 < fArr.length; i17++) {
                        float f14 = fArr[i17];
                        if (f14 >= f12 || i17 == fArr.length - 1) {
                            int i18 = i17 - 1;
                            float f15 = fArr[i18];
                            float f16 = (f12 - f15) / (f14 - f15);
                            int i19 = iArr[i17];
                            int i20 = iArr[i18];
                            c9 = c10;
                            iArgb = Color.argb((int) (f13 * 255.0f), com.bytedance.adsdk.vt.le.vt.ouw(f16, Color.red(i20), Color.red(i19)), com.bytedance.adsdk.vt.le.vt.ouw(f16, Color.green(i20), Color.green(i19)), com.bytedance.adsdk.vt.le.vt.ouw(f16, Color.blue(i20), Color.blue(i19)));
                        }
                    }
                    throw new IllegalArgumentException("Unreachable code.");
                }
                c9 = c10;
                iArgb = iArr[c9];
                iArr2[i16] = iArgb;
            } else {
                iArr2[i16] = ouw(f12, iArr[iBinarySearch], fArr2, fArr3);
                c9 = c10;
            }
            i16++;
            c10 = c9;
            i10 = 2;
        }
        return new com.bytedance.adsdk.vt.lh.vt.yu(fArrCopyOf, iArr2);
    }

    private static int ouw(float f10, int i4, float[] fArr, float[] fArr2) {
        float fOuw;
        if (fArr2.length >= 2 && f10 > fArr[0]) {
            for (int i10 = 1; i10 < fArr.length; i10++) {
                float f11 = fArr[i10];
                if (f11 >= f10 || i10 == fArr.length - 1) {
                    if (f11 <= f10) {
                        fOuw = fArr2[i10];
                    } else {
                        int i11 = i10 - 1;
                        float f12 = fArr[i11];
                        fOuw = com.bytedance.adsdk.vt.le.ra.ouw(fArr2[i11], fArr2[i10], (f10 - f12) / (f11 - f12));
                    }
                    return Color.argb((int) (fOuw * 255.0f), Color.red(i4), Color.green(i4), Color.blue(i4));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i4), Color.green(i4), Color.blue(i4));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
    @Override // com.bytedance.adsdk.vt.fkw.osn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.bytedance.adsdk.vt.lh.vt.yu ouw(android.util.JsonReader r18, float r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.fkw.mwh.ouw(android.util.JsonReader, float):java.lang.Object");
    }
}
