package com.bytedance.adsdk.ypw.emc.ypw;

import java.util.List;

/* loaded from: classes.dex */
public class ycc extends uym<Integer> {
    public ycc(List<com.bytedance.adsdk.ypw.uym.emc<Integer>> list) {
        super(list);
    }

    public int xq(com.bytedance.adsdk.ypw.uym.emc<Integer> emcVar, float f10) {
        if (emcVar.emc == null || emcVar.ypw == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.xq == null) {
            return com.bytedance.adsdk.ypw.ycc.bw.emc(emcVar.msw(), emcVar.zz(), f10);
        }
        emcVar.uym.getClass();
        dg();
        msw();
        throw null;
    }

    @Override // com.bytedance.adsdk.ypw.emc.ypw.emc
    /* renamed from: ypw, reason: merged with bridge method [inline-methods] */
    public Integer emc(com.bytedance.adsdk.ypw.uym.emc<Integer> emcVar, float f10) {
        return Integer.valueOf(xq(emcVar, f10));
    }

    public int zz() {
        return xq(xq(), bw());
    }
}
