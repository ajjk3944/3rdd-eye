package com.bytedance.adsdk.ypw.emc.ypw;

import android.graphics.Path;
import com.bytedance.adsdk.ypw.emc.emc.yzg;
import java.util.List;

/* loaded from: classes.dex */
public class sz extends emc<com.bytedance.adsdk.ypw.xq.ypw.qh, Path> {
    private final Path bw;
    private final com.bytedance.adsdk.ypw.xq.ypw.qh dg;
    private List<yzg> ycc;

    public sz(List<com.bytedance.adsdk.ypw.uym.emc<com.bytedance.adsdk.ypw.xq.ypw.qh>> list) {
        super(list);
        this.dg = new com.bytedance.adsdk.ypw.xq.ypw.qh();
        this.bw = new Path();
    }

    @Override // com.bytedance.adsdk.ypw.emc.ypw.emc
    /* renamed from: ypw, reason: merged with bridge method [inline-methods] */
    public Path emc(com.bytedance.adsdk.ypw.uym.emc<com.bytedance.adsdk.ypw.xq.ypw.qh> emcVar, float f2) {
        this.dg.emc(emcVar.emc, emcVar.ypw, f2);
        com.bytedance.adsdk.ypw.xq.ypw.qh qhVarEmc = this.dg;
        List<yzg> list = this.ycc;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                qhVarEmc = this.ycc.get(size).emc(qhVarEmc);
            }
        }
        com.bytedance.adsdk.ypw.ycc.bw.emc(qhVarEmc, this.bw);
        return this.bw;
    }

    public void emc(List<yzg> list) {
        this.ycc = list;
    }
}
