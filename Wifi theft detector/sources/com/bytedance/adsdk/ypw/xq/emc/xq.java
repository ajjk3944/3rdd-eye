package com.bytedance.adsdk.ypw.xq.emc;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class xq extends qh<com.bytedance.adsdk.ypw.xq.ypw.dg, com.bytedance.adsdk.ypw.xq.ypw.dg> {
    public xq(List<com.bytedance.adsdk.ypw.uym.emc<com.bytedance.adsdk.ypw.xq.ypw.dg>> list) {
        super(emc(list));
    }

    private static List<com.bytedance.adsdk.ypw.uym.emc<com.bytedance.adsdk.ypw.xq.ypw.dg>> emc(List<com.bytedance.adsdk.ypw.uym.emc<com.bytedance.adsdk.ypw.xq.ypw.dg>> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.set(i10, emc(list.get(i10)));
        }
        return list;
    }

    @Override // com.bytedance.adsdk.ypw.xq.emc.qh
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.bytedance.adsdk.ypw.xq.emc.qh, com.bytedance.adsdk.ypw.xq.emc.sz
    public /* bridge */ /* synthetic */ List xq() {
        return super.xq();
    }

    @Override // com.bytedance.adsdk.ypw.xq.emc.qh, com.bytedance.adsdk.ypw.xq.emc.sz
    public /* bridge */ /* synthetic */ boolean ypw() {
        return super.ypw();
    }

    private static com.bytedance.adsdk.ypw.uym.emc<com.bytedance.adsdk.ypw.xq.ypw.dg> emc(com.bytedance.adsdk.ypw.uym.emc<com.bytedance.adsdk.ypw.xq.ypw.dg> emcVar) {
        com.bytedance.adsdk.ypw.xq.ypw.dg dgVar = emcVar.emc;
        com.bytedance.adsdk.ypw.xq.ypw.dg dgVar2 = emcVar.ypw;
        if (dgVar == null || dgVar2 == null || dgVar.emc().length == dgVar2.emc().length) {
            return emcVar;
        }
        float[] fArrEmc = emc(dgVar.emc(), dgVar2.emc());
        return emcVar.emc(dgVar.emc(fArrEmc), dgVar2.emc(fArrEmc));
    }

    public static float[] emc(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f10 = Float.NaN;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            float f11 = fArr3[i11];
            if (f11 != f10) {
                fArr3[i10] = f11;
                i10++;
                f10 = fArr3[i11];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i10);
    }

    @Override // com.bytedance.adsdk.ypw.xq.emc.sz
    public com.bytedance.adsdk.ypw.emc.ypw.emc<com.bytedance.adsdk.ypw.xq.ypw.dg, com.bytedance.adsdk.ypw.xq.ypw.dg> emc() {
        return new com.bytedance.adsdk.ypw.emc.ypw.bw(this.emc);
    }
}
