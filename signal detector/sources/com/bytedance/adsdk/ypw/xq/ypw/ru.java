package com.bytedance.adsdk.ypw.xq.ypw;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class ru implements xq {
    private final com.bytedance.adsdk.ypw.xq.emc.ypw bw;
    private final com.bytedance.adsdk.ypw.xq.emc.sz<PointF, PointF> dg;
    private final String emc;
    private final boolean gbl;
    private final com.bytedance.adsdk.ypw.xq.emc.ypw msw;
    private final boolean ru;
    private final com.bytedance.adsdk.ypw.xq.emc.ypw uym;
    private final com.bytedance.adsdk.ypw.xq.emc.ypw xq;
    private final com.bytedance.adsdk.ypw.xq.emc.ypw ycc;
    private final emc ypw;
    private final com.bytedance.adsdk.ypw.xq.emc.ypw zz;

    public enum emc {
        STAR(1),
        POLYGON(2);

        private final int xq;

        emc(int i) {
            this.xq = i;
        }

        public static emc emc(int i) {
            for (emc emcVar : values()) {
                if (emcVar.xq == i) {
                    return emcVar;
                }
            }
            return null;
        }
    }

    public ru(String str, emc emcVar, com.bytedance.adsdk.ypw.xq.emc.ypw ypwVar, com.bytedance.adsdk.ypw.xq.emc.sz<PointF, PointF> szVar, com.bytedance.adsdk.ypw.xq.emc.ypw ypwVar2, com.bytedance.adsdk.ypw.xq.emc.ypw ypwVar3, com.bytedance.adsdk.ypw.xq.emc.ypw ypwVar4, com.bytedance.adsdk.ypw.xq.emc.ypw ypwVar5, com.bytedance.adsdk.ypw.xq.emc.ypw ypwVar6, boolean z6, boolean z7) {
        this.emc = str;
        this.ypw = emcVar;
        this.xq = ypwVar;
        this.dg = szVar;
        this.bw = ypwVar2;
        this.ycc = ypwVar3;
        this.uym = ypwVar4;
        this.msw = ypwVar5;
        this.zz = ypwVar6;
        this.ru = z6;
        this.gbl = z7;
    }

    public com.bytedance.adsdk.ypw.xq.emc.ypw bw() {
        return this.bw;
    }

    public com.bytedance.adsdk.ypw.xq.emc.sz<PointF, PointF> dg() {
        return this.dg;
    }

    public String emc() {
        return this.emc;
    }

    public boolean gbl() {
        return this.gbl;
    }

    public com.bytedance.adsdk.ypw.xq.emc.ypw msw() {
        return this.msw;
    }

    public boolean ru() {
        return this.ru;
    }

    public com.bytedance.adsdk.ypw.xq.emc.ypw uym() {
        return this.uym;
    }

    public com.bytedance.adsdk.ypw.xq.emc.ypw xq() {
        return this.xq;
    }

    public com.bytedance.adsdk.ypw.xq.emc.ypw ycc() {
        return this.ycc;
    }

    public emc ypw() {
        return this.ypw;
    }

    public com.bytedance.adsdk.ypw.xq.emc.ypw zz() {
        return this.zz;
    }

    @Override // com.bytedance.adsdk.ypw.xq.ypw.xq
    public com.bytedance.adsdk.ypw.emc.emc.xq emc(com.bytedance.adsdk.ypw.zz zzVar, com.bytedance.adsdk.ypw.uym uymVar, com.bytedance.adsdk.ypw.xq.xq.emc emcVar) {
        return new com.bytedance.adsdk.ypw.emc.emc.qh(zzVar, emcVar, this);
    }
}
