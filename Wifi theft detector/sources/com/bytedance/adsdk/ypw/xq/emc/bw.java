package com.bytedance.adsdk.ypw.xq.emc;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class bw implements sz<PointF, PointF> {
    private final List<com.bytedance.adsdk.ypw.uym.emc<PointF>> emc;

    public bw(List<com.bytedance.adsdk.ypw.uym.emc<PointF>> list) {
        this.emc = list;
    }

    @Override // com.bytedance.adsdk.ypw.xq.emc.sz
    public com.bytedance.adsdk.ypw.emc.ypw.emc<PointF, PointF> emc() {
        return this.emc.get(0).bw() ? new com.bytedance.adsdk.ypw.emc.ypw.gbl(this.emc) : new com.bytedance.adsdk.ypw.emc.ypw.ru(this.emc);
    }

    @Override // com.bytedance.adsdk.ypw.xq.emc.sz
    public List<com.bytedance.adsdk.ypw.uym.emc<PointF>> xq() {
        return this.emc;
    }

    @Override // com.bytedance.adsdk.ypw.xq.emc.sz
    public boolean ypw() {
        return this.emc.size() == 1 && this.emc.get(0).bw();
    }
}
