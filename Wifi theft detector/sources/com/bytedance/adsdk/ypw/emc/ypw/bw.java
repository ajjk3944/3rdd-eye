package com.bytedance.adsdk.ypw.emc.ypw;

import java.util.List;

/* loaded from: classes.dex */
public class bw extends uym<com.bytedance.adsdk.ypw.xq.ypw.dg> {
    private final com.bytedance.adsdk.ypw.xq.ypw.dg dg;

    public bw(List<com.bytedance.adsdk.ypw.uym.emc<com.bytedance.adsdk.ypw.xq.ypw.dg>> list) {
        super(list);
        com.bytedance.adsdk.ypw.xq.ypw.dg dgVar = list.get(0).emc;
        int iXq = dgVar != null ? dgVar.xq() : 0;
        this.dg = new com.bytedance.adsdk.ypw.xq.ypw.dg(new float[iXq], new int[iXq]);
    }

    @Override // com.bytedance.adsdk.ypw.emc.ypw.emc
    /* renamed from: ypw, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ypw.xq.ypw.dg emc(com.bytedance.adsdk.ypw.uym.emc<com.bytedance.adsdk.ypw.xq.ypw.dg> emcVar, float f10) {
        this.dg.emc(emcVar.emc, emcVar.ypw, f10);
        return this.dg;
    }
}
