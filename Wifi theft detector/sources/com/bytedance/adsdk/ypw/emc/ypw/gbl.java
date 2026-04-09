package com.bytedance.adsdk.ypw.emc.ypw;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class gbl extends uym<PointF> {
    private final PointF dg;

    public gbl(List<com.bytedance.adsdk.ypw.uym.emc<PointF>> list) {
        super(list);
        this.dg = new PointF();
    }

    @Override // com.bytedance.adsdk.ypw.emc.ypw.emc
    /* renamed from: ypw, reason: merged with bridge method [inline-methods] */
    public PointF emc(com.bytedance.adsdk.ypw.uym.emc<PointF> emcVar, float f10) {
        return emc(emcVar, f10, f10, f10);
    }

    @Override // com.bytedance.adsdk.ypw.emc.ypw.emc
    /* renamed from: ypw, reason: merged with bridge method [inline-methods] */
    public PointF emc(com.bytedance.adsdk.ypw.uym.emc<PointF> emcVar, float f10, float f11, float f12) {
        PointF pointF;
        PointF pointF2 = emcVar.emc;
        if (pointF2 == null || (pointF = emcVar.ypw) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        if (this.xq != null) {
            emcVar.uym.getClass();
            dg();
            msw();
            throw null;
        }
        PointF pointF5 = this.dg;
        float f13 = pointF3.x;
        float f14 = f13 + (f11 * (pointF4.x - f13));
        float f15 = pointF3.y;
        pointF5.set(f14, f15 + (f12 * (pointF4.y - f15)));
        return this.dg;
    }
}
