package com.bytedance.sdk.component.emc;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class qh {
    public final String bw;
    public final String dg;
    public final int emc;
    public final String msw;
    public final String uym;
    public final String xq;
    public final String ycc;
    public final String ypw;

    public static final class emc {
        private String bw;
        private String dg;
        private String emc;
        private String uym;
        private String xq;
        private String ycc;
        private String ypw;

        private emc() {
        }

        public emc bw(String str) {
            this.bw = str;
            return this;
        }

        public emc dg(String str) {
            this.dg = str;
            return this;
        }

        public emc emc(String str) {
            this.emc = str;
            return this;
        }

        public emc uym(String str) {
            this.uym = str;
            return this;
        }

        public emc xq(String str) {
            this.xq = str;
            return this;
        }

        public emc ycc(String str) {
            this.ycc = str;
            return this;
        }

        public emc ypw(String str) {
            this.ypw = str;
            return this;
        }

        public qh emc() {
            return new qh(this);
        }
    }

    public static emc emc() {
        return new emc();
    }

    public String toString() {
        return "methodName: " + this.dg + ", params: " + this.bw + ", callbackId: " + this.ycc + ", type: " + this.xq + ", version: " + this.ypw + ", ";
    }

    private qh(String str, int i10) {
        this.ypw = null;
        this.xq = null;
        this.dg = null;
        this.bw = null;
        this.ycc = str;
        this.uym = null;
        this.emc = i10;
        this.msw = null;
    }

    public static qh emc(String str, int i10) {
        return new qh(str, i10);
    }

    public static boolean emc(qh qhVar) {
        return qhVar == null || qhVar.emc != 1 || TextUtils.isEmpty(qhVar.dg) || TextUtils.isEmpty(qhVar.bw);
    }

    private qh(emc emcVar) {
        this.ypw = emcVar.emc;
        this.xq = emcVar.ypw;
        this.dg = emcVar.xq;
        this.bw = emcVar.dg;
        this.ycc = emcVar.bw;
        this.uym = emcVar.ycc;
        this.emc = 1;
        this.msw = emcVar.uym;
    }
}
