package com.bytedance.adsdk.emc.ypw.ypw.emc;

/* loaded from: classes.dex */
public abstract class aa implements com.bytedance.adsdk.emc.ypw.ypw.emc {
    protected com.bytedance.adsdk.emc.ypw.ypw.emc emc;
    protected com.bytedance.adsdk.emc.ypw.dg.xq xq;
    protected com.bytedance.adsdk.emc.ypw.ypw.emc ypw;

    public aa(com.bytedance.adsdk.emc.ypw.dg.xq xqVar) {
        this.xq = xqVar;
    }

    public void emc(com.bytedance.adsdk.emc.ypw.ypw.emc emcVar) {
        this.emc = emcVar;
    }

    public String toString() {
        return ypw();
    }

    public void ypw(com.bytedance.adsdk.emc.ypw.ypw.emc emcVar) {
        this.ypw = emcVar;
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public com.bytedance.adsdk.emc.ypw.dg.bw emc() {
        return com.bytedance.adsdk.emc.ypw.dg.ycc.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public String ypw() {
        return this.emc.ypw() + this.xq.emc() + this.ypw.ypw();
    }
}
