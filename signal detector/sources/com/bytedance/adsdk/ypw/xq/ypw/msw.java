package com.bytedance.adsdk.ypw.xq.ypw;

/* loaded from: classes.dex */
public class msw {
    private final boolean dg;
    private final emc emc;
    private final com.bytedance.adsdk.ypw.xq.emc.dg xq;
    private final com.bytedance.adsdk.ypw.xq.emc.msw ypw;

    public enum emc {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public msw(emc emcVar, com.bytedance.adsdk.ypw.xq.emc.msw mswVar, com.bytedance.adsdk.ypw.xq.emc.dg dgVar, boolean z6) {
        this.emc = emcVar;
        this.ypw = mswVar;
        this.xq = dgVar;
        this.dg = z6;
    }

    public boolean dg() {
        return this.dg;
    }

    public emc emc() {
        return this.emc;
    }

    public com.bytedance.adsdk.ypw.xq.emc.dg xq() {
        return this.xq;
    }

    public com.bytedance.adsdk.ypw.xq.emc.msw ypw() {
        return this.ypw;
    }
}
