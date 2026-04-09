package com.bytedance.sdk.openadsdk.component.bw;

import com.bytedance.sdk.openadsdk.core.model.rie;

/* loaded from: classes.dex */
public class xq {
    private int bw;
    private com.bytedance.sdk.openadsdk.core.model.emc dg;
    private int emc;
    private boolean uym;
    private rie xq;
    private String ycc;
    private int ypw;

    public xq(int i10, int i11, rie rieVar, com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
        this.emc = i10;
        this.ypw = i11;
        this.xq = rieVar;
        this.dg = emcVar;
    }

    public int bw() {
        return this.bw;
    }

    public rie dg() {
        return this.xq;
    }

    public com.bytedance.sdk.openadsdk.core.model.emc emc() {
        return this.dg;
    }

    public int xq() {
        return this.ypw;
    }

    public String ycc() {
        return this.ycc;
    }

    public int ypw() {
        return this.emc;
    }

    public void emc(boolean z10) {
        this.uym = z10;
    }

    public xq(int i10, int i11, int i12, String str) {
        this.emc = i10;
        this.ypw = i11;
        this.bw = i12;
        this.ycc = str;
    }
}
