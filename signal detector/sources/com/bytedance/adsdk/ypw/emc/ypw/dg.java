package com.bytedance.adsdk.ypw.emc.ypw;

import java.util.List;

/* loaded from: classes.dex */
public class dg extends uym<Float> {
    public dg(List<com.bytedance.adsdk.ypw.uym.emc<Float>> list) {
        super(list);
    }

    public float xq(com.bytedance.adsdk.ypw.uym.emc<Float> emcVar, float f2) {
        if (emcVar.emc == null || emcVar.ypw == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.xq == null) {
            return com.bytedance.adsdk.ypw.ycc.bw.emc(emcVar.ycc(), emcVar.uym(), f2);
        }
        emcVar.uym.getClass();
        dg();
        msw();
        throw null;
    }

    @Override // com.bytedance.adsdk.ypw.emc.ypw.emc
    /* renamed from: ypw, reason: merged with bridge method [inline-methods] */
    public Float emc(com.bytedance.adsdk.ypw.uym.emc<Float> emcVar, float f2) {
        return Float.valueOf(xq(emcVar, f2));
    }

    public float zz() {
        return xq(xq(), bw());
    }
}
