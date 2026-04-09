package com.bytedance.adsdk.ypw.xq.emc;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class zz implements sz<PointF, PointF> {
    private final ypw emc;
    private final ypw ypw;

    public zz(ypw ypwVar, ypw ypwVar2) {
        this.emc = ypwVar;
        this.ypw = ypwVar2;
    }

    @Override // com.bytedance.adsdk.ypw.xq.emc.sz
    public com.bytedance.adsdk.ypw.emc.ypw.emc<PointF, PointF> emc() {
        return new com.bytedance.adsdk.ypw.emc.ypw.qh(this.emc.emc(), this.ypw.emc());
    }

    @Override // com.bytedance.adsdk.ypw.xq.emc.sz
    public List<com.bytedance.adsdk.ypw.uym.emc<PointF>> xq() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.bytedance.adsdk.ypw.xq.emc.sz
    public boolean ypw() {
        return this.emc.ypw() && this.ypw.ypw();
    }
}
