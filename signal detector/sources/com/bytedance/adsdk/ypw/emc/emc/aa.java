package com.bytedance.adsdk.ypw.emc.emc;

import android.graphics.PointF;
import com.bytedance.adsdk.ypw.emc.ypw.emc;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class aa implements yzg, emc.InterfaceC0021emc {
    private com.bytedance.adsdk.ypw.xq.ypw.qh dg;
    private final com.bytedance.adsdk.ypw.zz emc;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> xq;
    private final String ypw;

    public aa(com.bytedance.adsdk.ypw.zz zzVar, com.bytedance.adsdk.ypw.xq.xq.emc emcVar, com.bytedance.adsdk.ypw.xq.ypw.sz szVar) {
        this.emc = zzVar;
        this.ypw = szVar.emc();
        com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> emcVarEmc = szVar.ypw().emc();
        this.xq = emcVarEmc;
        emcVar.emc(emcVarEmc);
        emcVarEmc.emc(this);
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.xq
    public void emc(List<xq> list, List<xq> list2) {
    }

    public com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> ypw() {
        return this.xq;
    }

    private com.bytedance.adsdk.ypw.xq.ypw.qh ypw(com.bytedance.adsdk.ypw.xq.ypw.qh qhVar) {
        List<com.bytedance.adsdk.ypw.xq.emc> listXq = qhVar.xq();
        boolean zYpw = qhVar.ypw();
        int size = listXq.size() - 1;
        int i = 0;
        while (size >= 0) {
            com.bytedance.adsdk.ypw.xq.emc emcVar = listXq.get(size);
            com.bytedance.adsdk.ypw.xq.emc emcVar2 = listXq.get(emc(size - 1, listXq.size()));
            PointF pointFXq = (size != 0 || zYpw) ? emcVar2.xq() : qhVar.emc();
            i = (((size != 0 || zYpw) ? emcVar2.ypw() : pointFXq).equals(pointFXq) && emcVar.emc().equals(pointFXq) && !(!qhVar.ypw() && size == 0 && size == listXq.size() - 1)) ? i + 2 : i + 1;
            size--;
        }
        com.bytedance.adsdk.ypw.xq.ypw.qh qhVar2 = this.dg;
        if (qhVar2 == null || qhVar2.xq().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i3 = 0; i3 < i; i3++) {
                arrayList.add(new com.bytedance.adsdk.ypw.xq.emc());
            }
            this.dg = new com.bytedance.adsdk.ypw.xq.ypw.qh(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.dg.emc(zYpw);
        return this.dg;
    }

    @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.InterfaceC0021emc
    public void emc() {
        this.emc.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    @Override // com.bytedance.adsdk.ypw.emc.emc.yzg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.adsdk.ypw.xq.ypw.qh emc(com.bytedance.adsdk.ypw.xq.ypw.qh r19) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ypw.emc.emc.aa.emc(com.bytedance.adsdk.ypw.xq.ypw.qh):com.bytedance.adsdk.ypw.xq.ypw.qh");
    }

    private static int ypw(int i, int i3) {
        int i6 = i / i3;
        return ((i ^ i3) >= 0 || i3 * i6 == i) ? i6 : i6 - 1;
    }

    private static int emc(int i, int i3) {
        return i - (ypw(i, i3) * i3);
    }
}
