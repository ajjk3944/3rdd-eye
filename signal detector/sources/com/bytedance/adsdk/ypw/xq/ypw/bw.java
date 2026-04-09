package com.bytedance.adsdk.ypw.xq.ypw;

import android.graphics.Path;

/* loaded from: classes.dex */
public class bw implements xq {
    private final com.bytedance.adsdk.ypw.xq.emc.ycc bw;
    private final com.bytedance.adsdk.ypw.xq.emc.dg dg;
    private final uym emc;
    private final com.bytedance.adsdk.ypw.xq.emc.ypw msw;
    private final boolean ru;
    private final String uym;
    private final com.bytedance.adsdk.ypw.xq.emc.xq xq;
    private final com.bytedance.adsdk.ypw.xq.emc.ycc ycc;
    private final Path.FillType ypw;
    private final com.bytedance.adsdk.ypw.xq.emc.ypw zz;

    public bw(String str, uym uymVar, Path.FillType fillType, com.bytedance.adsdk.ypw.xq.emc.xq xqVar, com.bytedance.adsdk.ypw.xq.emc.dg dgVar, com.bytedance.adsdk.ypw.xq.emc.ycc yccVar, com.bytedance.adsdk.ypw.xq.emc.ycc yccVar2, com.bytedance.adsdk.ypw.xq.emc.ypw ypwVar, com.bytedance.adsdk.ypw.xq.emc.ypw ypwVar2, boolean z6) {
        this.emc = uymVar;
        this.ypw = fillType;
        this.xq = xqVar;
        this.dg = dgVar;
        this.bw = yccVar;
        this.ycc = yccVar2;
        this.uym = str;
        this.msw = ypwVar;
        this.zz = ypwVar2;
        this.ru = z6;
    }

    public com.bytedance.adsdk.ypw.xq.emc.dg bw() {
        return this.dg;
    }

    public com.bytedance.adsdk.ypw.xq.emc.xq dg() {
        return this.xq;
    }

    public String emc() {
        return this.uym;
    }

    public boolean msw() {
        return this.ru;
    }

    public com.bytedance.adsdk.ypw.xq.emc.ycc uym() {
        return this.ycc;
    }

    public Path.FillType xq() {
        return this.ypw;
    }

    public com.bytedance.adsdk.ypw.xq.emc.ycc ycc() {
        return this.bw;
    }

    public uym ypw() {
        return this.emc;
    }

    @Override // com.bytedance.adsdk.ypw.xq.ypw.xq
    public com.bytedance.adsdk.ypw.emc.emc.xq emc(com.bytedance.adsdk.ypw.zz zzVar, com.bytedance.adsdk.ypw.uym uymVar, com.bytedance.adsdk.ypw.xq.xq.emc emcVar) {
        return new com.bytedance.adsdk.ypw.emc.emc.msw(zzVar, uymVar, emcVar, this);
    }
}
