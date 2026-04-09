package com.bytedance.adsdk.ypw.xq.ypw;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class gbl implements xq {
    private final boolean bw;
    private final com.bytedance.adsdk.ypw.xq.emc.ypw dg;
    private final String emc;
    private final com.bytedance.adsdk.ypw.xq.emc.sz<PointF, PointF> xq;
    private final com.bytedance.adsdk.ypw.xq.emc.sz<PointF, PointF> ypw;

    public gbl(String str, com.bytedance.adsdk.ypw.xq.emc.sz<PointF, PointF> szVar, com.bytedance.adsdk.ypw.xq.emc.sz<PointF, PointF> szVar2, com.bytedance.adsdk.ypw.xq.emc.ypw ypwVar, boolean z10) {
        this.emc = str;
        this.ypw = szVar;
        this.xq = szVar2;
        this.dg = ypwVar;
        this.bw = z10;
    }

    public boolean bw() {
        return this.bw;
    }

    public com.bytedance.adsdk.ypw.xq.emc.sz<PointF, PointF> dg() {
        return this.ypw;
    }

    public String emc() {
        return this.emc;
    }

    public String toString() {
        return "RectangleShape{position=" + this.ypw + ", size=" + this.xq + '}';
    }

    public com.bytedance.adsdk.ypw.xq.emc.sz<PointF, PointF> xq() {
        return this.xq;
    }

    public com.bytedance.adsdk.ypw.xq.emc.ypw ypw() {
        return this.dg;
    }

    @Override // com.bytedance.adsdk.ypw.xq.ypw.xq
    public com.bytedance.adsdk.ypw.emc.emc.xq emc(com.bytedance.adsdk.ypw.zz zzVar, com.bytedance.adsdk.ypw.uym uymVar, com.bytedance.adsdk.ypw.xq.xq.emc emcVar) {
        return new com.bytedance.adsdk.ypw.emc.emc.cf(zzVar, emcVar, this);
    }
}
