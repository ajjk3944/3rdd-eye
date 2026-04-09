package com.bytedance.adsdk.ypw.xq.ypw;

import android.graphics.Path;

/* loaded from: classes.dex */
public class cf implements xq {
    private final com.bytedance.adsdk.ypw.xq.emc.dg bw;
    private final com.bytedance.adsdk.ypw.xq.emc.emc dg;
    private final boolean emc;
    private final String xq;
    private final boolean ycc;
    private final Path.FillType ypw;

    public cf(String str, boolean z10, Path.FillType fillType, com.bytedance.adsdk.ypw.xq.emc.emc emcVar, com.bytedance.adsdk.ypw.xq.emc.dg dgVar, boolean z11) {
        this.xq = str;
        this.emc = z10;
        this.ypw = fillType;
        this.dg = emcVar;
        this.bw = dgVar;
        this.ycc = z11;
    }

    public boolean bw() {
        return this.ycc;
    }

    public Path.FillType dg() {
        return this.ypw;
    }

    public String emc() {
        return this.xq;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.emc + '}';
    }

    public com.bytedance.adsdk.ypw.xq.emc.dg xq() {
        return this.bw;
    }

    public com.bytedance.adsdk.ypw.xq.emc.emc ypw() {
        return this.dg;
    }

    @Override // com.bytedance.adsdk.ypw.xq.ypw.xq
    public com.bytedance.adsdk.ypw.emc.emc.xq emc(com.bytedance.adsdk.ypw.zz zzVar, com.bytedance.adsdk.ypw.uym uymVar, com.bytedance.adsdk.ypw.xq.xq.emc emcVar) {
        return new com.bytedance.adsdk.ypw.emc.emc.uym(zzVar, emcVar, this);
    }
}
