package com.bytedance.adsdk.ypw.emc.ypw;

import android.graphics.PointF;
import com.google.android.gms.internal.ads.AbstractC1135f5;
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
    public PointF emc(com.bytedance.adsdk.ypw.uym.emc<PointF> emcVar, float f2) {
        return emc(emcVar, f2, f2, f2);
    }

    @Override // com.bytedance.adsdk.ypw.emc.ypw.emc
    /* renamed from: ypw, reason: merged with bridge method [inline-methods] */
    public PointF emc(com.bytedance.adsdk.ypw.uym.emc<PointF> emcVar, float f2, float f5, float f6) {
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
        float f7 = pointF3.x;
        float fH = AbstractC1135f5.h(pointF4.x, f7, f5, f7);
        float f8 = pointF3.y;
        pointF5.set(fH, AbstractC1135f5.h(pointF4.y, f8, f6, f8));
        return this.dg;
    }
}
