package com.bytedance.adsdk.ypw.emc.ypw;

import android.graphics.PointF;
import java.util.Collections;

/* loaded from: classes.dex */
public class qh extends emc<PointF, PointF> {
    protected com.bytedance.adsdk.ypw.uym.ypw<Float> bw;
    protected com.bytedance.adsdk.ypw.uym.ypw<Float> dg;
    private final emc<Float, Float> msw;
    private final PointF uym;
    private final PointF ycc;
    private final emc<Float, Float> zz;

    public qh(emc<Float, Float> emcVar, emc<Float, Float> emcVar2) {
        super(Collections.EMPTY_LIST);
        this.ycc = new PointF();
        this.uym = new PointF();
        this.msw = emcVar;
        this.zz = emcVar2;
        emc(msw());
    }

    @Override // com.bytedance.adsdk.ypw.emc.ypw.emc
    /* renamed from: ypw, reason: merged with bridge method [inline-methods] */
    public PointF emc(com.bytedance.adsdk.ypw.uym.emc<PointF> emcVar, float f10) {
        if (this.dg != null && this.msw.xq() != null) {
            this.msw.bw();
            throw null;
        }
        if (this.bw != null && this.zz.xq() != null) {
            this.zz.bw();
            throw null;
        }
        this.uym.set(this.ycc.x, 0.0f);
        PointF pointF = this.uym;
        pointF.set(pointF.x, this.ycc.y);
        return this.uym;
    }

    @Override // com.bytedance.adsdk.ypw.emc.ypw.emc
    /* renamed from: zz, reason: merged with bridge method [inline-methods] */
    public PointF uym() {
        return emc(null, 0.0f);
    }

    @Override // com.bytedance.adsdk.ypw.emc.ypw.emc
    public void emc(float f10) {
        this.msw.emc(f10);
        this.zz.emc(f10);
        this.ycc.set(this.msw.uym().floatValue(), this.zz.uym().floatValue());
        for (int i10 = 0; i10 < this.emc.size(); i10++) {
            this.emc.get(i10).emc();
        }
    }
}
