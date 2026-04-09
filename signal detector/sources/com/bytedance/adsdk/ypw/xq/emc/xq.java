package com.bytedance.adsdk.ypw.xq.emc;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class xq extends qh<com.bytedance.adsdk.ypw.xq.ypw.dg, com.bytedance.adsdk.ypw.xq.ypw.dg> {
    public xq(List<com.bytedance.adsdk.ypw.uym.emc<com.bytedance.adsdk.ypw.xq.ypw.dg>> list) {
        super(emc(list));
    }

    private static List<com.bytedance.adsdk.ypw.uym.emc<com.bytedance.adsdk.ypw.xq.ypw.dg>> emc(List<com.bytedance.adsdk.ypw.uym.emc<com.bytedance.adsdk.ypw.xq.ypw.dg>> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, emc(list.get(i)));
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
        float f2 = Float.NaN;
        int i = 0;
        for (int i3 = 0; i3 < length; i3++) {
            float f5 = fArr3[i3];
            if (f5 != f2) {
                fArr3[i] = f5;
                i++;
                f2 = fArr3[i3];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i);
    }

    @Override // com.bytedance.adsdk.ypw.xq.emc.sz
    public com.bytedance.adsdk.ypw.emc.ypw.emc<com.bytedance.adsdk.ypw.xq.ypw.dg, com.bytedance.adsdk.ypw.xq.ypw.dg> emc() {
        return new com.bytedance.adsdk.ypw.emc.ypw.bw(this.emc);
    }
}
