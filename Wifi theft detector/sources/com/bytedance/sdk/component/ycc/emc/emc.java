package com.bytedance.sdk.component.ycc.emc;

/* loaded from: classes.dex */
public class emc {
    private com.bytedance.sdk.component.ycc.emc.dg.ypw.emc bw;
    private com.bytedance.sdk.component.ycc.emc.dg.ypw.emc dg;
    private com.bytedance.sdk.component.ycc.emc.emc.bw emc;
    private int gbl;
    private boolean msw;
    private boolean ru;
    private int sup;
    private long sz;
    private com.bytedance.sdk.component.ycc.emc.dg.ypw.emc uym;
    private com.bytedance.sdk.component.ycc.emc.dg.ypw.emc xq;
    private com.bytedance.sdk.component.ycc.emc.dg.ypw.emc ycc;
    private com.bytedance.sdk.component.ycc.emc.ypw.xq ypw;
    private bw zz;

    /* renamed from: com.bytedance.sdk.component.ycc.emc.emc$emc, reason: collision with other inner class name */
    public static class C0125emc {
        private com.bytedance.sdk.component.ycc.emc.dg.ypw.emc bw;
        private com.bytedance.sdk.component.ycc.emc.dg.ypw.emc dg;
        private com.bytedance.sdk.component.ycc.emc.ypw.xq emc;
        private com.bytedance.sdk.component.ycc.emc.emc.bw msw;
        private long sup;
        private bw uym;
        private com.bytedance.sdk.component.ycc.emc.dg.ypw.emc xq;
        private boolean ycc;
        private com.bytedance.sdk.component.ycc.emc.dg.ypw.emc ypw;
        private boolean zz;
        private int ru = 5000;
        private int gbl = 10;

        public C0125emc emc(long j10) {
            this.sup = j10;
            return this;
        }

        public C0125emc xq(com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emcVar) {
            this.dg = emcVar;
            return this;
        }

        public C0125emc ypw(com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emcVar) {
            this.xq = emcVar;
            return this;
        }

        public C0125emc emc(com.bytedance.sdk.component.ycc.emc.emc.bw bwVar) {
            this.msw = bwVar;
            return this;
        }

        public C0125emc ypw(int i10) {
            this.gbl = i10;
            return this;
        }

        public C0125emc emc(bw bwVar) {
            this.uym = bwVar;
            return this;
        }

        public C0125emc emc(boolean z10) {
            this.ycc = z10;
            return this;
        }

        public C0125emc emc(com.bytedance.sdk.component.ycc.emc.dg.ypw.emc emcVar) {
            this.ypw = emcVar;
            return this;
        }

        public C0125emc emc(com.bytedance.sdk.component.ycc.emc.ypw.xq xqVar) {
            this.emc = xqVar;
            return this;
        }

        public C0125emc emc(int i10) {
            this.ru = i10;
            return this;
        }

        public emc emc() {
            emc emcVar = new emc();
            emcVar.ypw = this.emc;
            emcVar.xq = this.ypw;
            emcVar.dg = this.xq;
            emcVar.bw = this.dg;
            emcVar.ycc = this.bw;
            emcVar.msw = this.ycc;
            emcVar.zz = this.uym;
            emcVar.emc = this.msw;
            emcVar.ru = this.zz;
            emcVar.sup = this.gbl;
            emcVar.gbl = this.ru;
            emcVar.sz = this.sup;
            return emcVar;
        }
    }

    public long bw() {
        return this.sz;
    }

    public boolean gbl() {
        return this.msw;
    }

    public com.bytedance.sdk.component.ycc.emc.dg.ypw.emc msw() {
        return this.dg;
    }

    public com.bytedance.sdk.component.ycc.emc.ypw.xq ru() {
        return this.ypw;
    }

    public int sup() {
        return this.gbl;
    }

    public int sz() {
        return this.sup;
    }

    public com.bytedance.sdk.component.ycc.emc.dg.ypw.emc uym() {
        return this.xq;
    }

    public com.bytedance.sdk.component.ycc.emc.dg.ypw.emc ycc() {
        return this.uym;
    }

    public com.bytedance.sdk.component.ycc.emc.dg.ypw.emc zz() {
        return this.bw;
    }

    private emc() {
        this.gbl = 200;
        this.sup = 10;
    }

    public bw dg() {
        return this.zz;
    }

    public boolean xq() {
        return this.ru;
    }

    public com.bytedance.sdk.component.ycc.emc.dg.ypw.emc ypw() {
        return this.ycc;
    }

    public com.bytedance.sdk.component.ycc.emc.emc.bw emc() {
        return this.emc;
    }
}
