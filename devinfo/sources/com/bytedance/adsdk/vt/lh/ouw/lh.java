package com.bytedance.adsdk.vt.lh.ouw;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh extends jg<com.bytedance.adsdk.vt.lh.vt.yu, com.bytedance.adsdk.vt.lh.vt.yu> {
    public lh(List<com.bytedance.adsdk.vt.ra.ouw<com.bytedance.adsdk.vt.lh.vt.yu>> list) {
        super(ouw(list));
    }

    private static List<com.bytedance.adsdk.vt.ra.ouw<com.bytedance.adsdk.vt.lh.vt.yu>> ouw(List<com.bytedance.adsdk.vt.ra.ouw<com.bytedance.adsdk.vt.lh.vt.yu>> list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            com.bytedance.adsdk.vt.ra.ouw<com.bytedance.adsdk.vt.lh.vt.yu> ouwVar = list.get(i4);
            com.bytedance.adsdk.vt.lh.vt.yu yuVar = ouwVar.vt;
            com.bytedance.adsdk.vt.lh.vt.yu yuVar2 = ouwVar.f7205lh;
            if (yuVar != null && yuVar2 != null) {
                float[] fArr = yuVar.ouw;
                int length = fArr.length;
                float[] fArr2 = yuVar2.ouw;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f10 = Float.NaN;
                    int i10 = 0;
                    for (int i11 = 0; i11 < length2; i11++) {
                        float f11 = fArr3[i11];
                        if (f11 != f10) {
                            fArr3[i10] = f11;
                            i10++;
                            f10 = fArr3[i11];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i10);
                    ouwVar = new com.bytedance.adsdk.vt.ra.ouw<>(yuVar.ouw(fArrCopyOfRange), yuVar2.ouw(fArrCopyOfRange));
                }
            }
            list.set(i4, ouwVar);
        }
        return list;
    }

    @Override // com.bytedance.adsdk.vt.lh.ouw.jg, com.bytedance.adsdk.vt.lh.ouw.mwh
    public final /* bridge */ /* synthetic */ List lh() {
        return super.lh();
    }

    @Override // com.bytedance.adsdk.vt.lh.ouw.jg
    public final /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.bytedance.adsdk.vt.lh.ouw.jg, com.bytedance.adsdk.vt.lh.ouw.mwh
    public final /* bridge */ /* synthetic */ boolean vt() {
        return super.vt();
    }

    @Override // com.bytedance.adsdk.vt.lh.ouw.mwh
    public final com.bytedance.adsdk.vt.ouw.vt.ouw<com.bytedance.adsdk.vt.lh.vt.yu, com.bytedance.adsdk.vt.lh.vt.yu> ouw() {
        return new com.bytedance.adsdk.vt.ouw.vt.fkw(this.ouw);
    }
}
