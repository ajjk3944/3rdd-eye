package com.bytedance.adsdk.ypw.xq.ypw;

import com.bytedance.adsdk.ypw.emc.emc.ylm;

/* loaded from: classes.dex */
public class yzg implements xq {
    private final com.bytedance.adsdk.ypw.xq.emc.ypw bw;
    private final com.bytedance.adsdk.ypw.xq.emc.ypw dg;
    private final String emc;
    private final com.bytedance.adsdk.ypw.xq.emc.ypw xq;
    private final boolean ycc;
    private final emc ypw;

    public enum emc {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static emc emc(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i)));
        }
    }

    public yzg(String str, emc emcVar, com.bytedance.adsdk.ypw.xq.emc.ypw ypwVar, com.bytedance.adsdk.ypw.xq.emc.ypw ypwVar2, com.bytedance.adsdk.ypw.xq.emc.ypw ypwVar3, boolean z6) {
        this.emc = str;
        this.ypw = emcVar;
        this.xq = ypwVar;
        this.dg = ypwVar2;
        this.bw = ypwVar3;
        this.ycc = z6;
    }

    public com.bytedance.adsdk.ypw.xq.emc.ypw bw() {
        return this.bw;
    }

    public com.bytedance.adsdk.ypw.xq.emc.ypw dg() {
        return this.xq;
    }

    public String emc() {
        return this.emc;
    }

    public String toString() {
        return "Trim Path: {start: " + this.xq + ", end: " + this.dg + ", offset: " + this.bw + "}";
    }

    public com.bytedance.adsdk.ypw.xq.emc.ypw xq() {
        return this.dg;
    }

    public boolean ycc() {
        return this.ycc;
    }

    public emc ypw() {
        return this.ypw;
    }

    @Override // com.bytedance.adsdk.ypw.xq.ypw.xq
    public com.bytedance.adsdk.ypw.emc.emc.xq emc(com.bytedance.adsdk.ypw.zz zzVar, com.bytedance.adsdk.ypw.uym uymVar, com.bytedance.adsdk.ypw.xq.xq.emc emcVar) {
        return new ylm(emcVar, this);
    }
}
