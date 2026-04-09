package com.bytedance.sdk.openadsdk.core.gbl.emc;

/* loaded from: classes.dex */
public class emc {
    private String bw;
    private Long dg;
    private String emc;
    private String xq;
    private String ycc;
    private String ypw;

    public String bw() {
        return this.bw;
    }

    public Long dg() {
        return this.dg;
    }

    public String emc() {
        return this.emc;
    }

    public String xq() {
        return this.xq;
    }

    public String ycc() {
        return this.ycc;
    }

    public String ypw() {
        return this.ypw;
    }

    public emc bw(String str) {
        this.ycc = str;
        return this;
    }

    public emc dg(String str) {
        this.bw = str;
        return this;
    }

    public emc emc(String str) {
        this.emc = str;
        return this;
    }

    public emc xq(String str) {
        this.xq = str;
        return this;
    }

    public emc ypw(String str) {
        this.ypw = str;
        return this;
    }

    public emc emc(Long l10) {
        this.dg = l10;
        return this;
    }
}
