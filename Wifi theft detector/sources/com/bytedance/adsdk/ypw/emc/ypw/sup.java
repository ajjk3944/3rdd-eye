package com.bytedance.adsdk.ypw.emc.ypw;

import java.util.List;

/* loaded from: classes.dex */
public class sup extends uym<com.bytedance.adsdk.ypw.uym.xq> {
    private final com.bytedance.adsdk.ypw.uym.xq dg;

    public sup(List<com.bytedance.adsdk.ypw.uym.emc<com.bytedance.adsdk.ypw.uym.xq>> list) {
        super(list);
        this.dg = new com.bytedance.adsdk.ypw.uym.xq();
    }

    @Override // com.bytedance.adsdk.ypw.emc.ypw.emc
    /* renamed from: ypw, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ypw.uym.xq emc(com.bytedance.adsdk.ypw.uym.emc<com.bytedance.adsdk.ypw.uym.xq> emcVar, float f10) {
        com.bytedance.adsdk.ypw.uym.xq xqVar;
        com.bytedance.adsdk.ypw.uym.xq xqVar2 = emcVar.emc;
        if (xqVar2 == null || (xqVar = emcVar.ypw) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.bytedance.adsdk.ypw.uym.xq xqVar3 = xqVar2;
        com.bytedance.adsdk.ypw.uym.xq xqVar4 = xqVar;
        if (this.xq == null) {
            this.dg.emc(com.bytedance.adsdk.ypw.ycc.bw.emc(xqVar3.emc(), xqVar4.emc(), f10), com.bytedance.adsdk.ypw.ycc.bw.emc(xqVar3.ypw(), xqVar4.ypw(), f10));
            return this.dg;
        }
        emcVar.uym.getClass();
        dg();
        msw();
        throw null;
    }
}
