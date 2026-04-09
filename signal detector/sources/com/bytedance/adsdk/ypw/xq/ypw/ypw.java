package com.bytedance.adsdk.ypw.xq.ypw;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class ypw implements xq {
    private final boolean bw;
    private final boolean dg;
    private final String emc;
    private final com.bytedance.adsdk.ypw.xq.emc.ycc xq;
    private final com.bytedance.adsdk.ypw.xq.emc.sz<PointF, PointF> ypw;

    public ypw(String str, com.bytedance.adsdk.ypw.xq.emc.sz<PointF, PointF> szVar, com.bytedance.adsdk.ypw.xq.emc.ycc yccVar, boolean z6, boolean z7) {
        this.emc = str;
        this.ypw = szVar;
        this.xq = yccVar;
        this.dg = z6;
        this.bw = z7;
    }

    public boolean bw() {
        return this.bw;
    }

    public boolean dg() {
        return this.dg;
    }

    @Override // com.bytedance.adsdk.ypw.xq.ypw.xq
    public com.bytedance.adsdk.ypw.emc.emc.xq emc(com.bytedance.adsdk.ypw.zz zzVar, com.bytedance.adsdk.ypw.uym uymVar, com.bytedance.adsdk.ypw.xq.xq.emc emcVar) {
        return new com.bytedance.adsdk.ypw.emc.emc.ycc(zzVar, emcVar, this);
    }

    public com.bytedance.adsdk.ypw.xq.emc.ycc xq() {
        return this.xq;
    }

    public com.bytedance.adsdk.ypw.xq.emc.sz<PointF, PointF> ypw() {
        return this.ypw;
    }

    public String emc() {
        return this.emc;
    }
}
