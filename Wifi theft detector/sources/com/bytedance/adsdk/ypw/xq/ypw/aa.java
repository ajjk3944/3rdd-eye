package com.bytedance.adsdk.ypw.xq.ypw;

/* loaded from: classes.dex */
public class aa implements xq {
    private final boolean dg;
    private final String emc;
    private final com.bytedance.adsdk.ypw.xq.emc.msw xq;
    private final int ypw;

    public aa(String str, int i10, com.bytedance.adsdk.ypw.xq.emc.msw mswVar, boolean z10) {
        this.emc = str;
        this.ypw = i10;
        this.xq = mswVar;
        this.dg = z10;
    }

    public String emc() {
        return this.emc;
    }

    public String toString() {
        return "ShapePath{name=" + this.emc + ", index=" + this.ypw + '}';
    }

    public boolean xq() {
        return this.dg;
    }

    public com.bytedance.adsdk.ypw.xq.emc.msw ypw() {
        return this.xq;
    }

    @Override // com.bytedance.adsdk.ypw.xq.ypw.xq
    public com.bytedance.adsdk.ypw.emc.emc.xq emc(com.bytedance.adsdk.ypw.zz zzVar, com.bytedance.adsdk.ypw.uym uymVar, com.bytedance.adsdk.ypw.xq.xq.emc emcVar) {
        return new com.bytedance.adsdk.ypw.emc.emc.sba(zzVar, emcVar, this);
    }
}
