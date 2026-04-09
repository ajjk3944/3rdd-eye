package com.bytedance.sdk.component.bw.dg.xq;

import android.content.Context;
import com.bytedance.sdk.component.bw.aa;
import com.bytedance.sdk.component.bw.sba;
import com.bytedance.sdk.component.bw.sup;
import com.bytedance.sdk.component.bw.sz;
import com.bytedance.sdk.component.bw.ul;
import com.bytedance.sdk.component.bw.ylm;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class bw implements sz {
    private sba bw;
    private aa dg;
    private sup emc;
    private ul msw;
    private boolean ru;
    private com.bytedance.sdk.component.bw.ypw uym;
    private com.bytedance.sdk.component.bw.dg xq;
    private com.bytedance.sdk.component.bw.xq ycc;
    private ExecutorService ypw;
    private ylm zz;

    public static class emc {
        private sba bw;
        private aa dg;
        private sup emc;
        private ul msw;
        private boolean ru;
        private com.bytedance.sdk.component.bw.ypw uym;
        private com.bytedance.sdk.component.bw.dg xq;
        private com.bytedance.sdk.component.bw.xq ycc;
        private ExecutorService ypw;
        private ylm zz;

        public emc emc(com.bytedance.sdk.component.bw.ypw ypwVar) {
            this.uym = ypwVar;
            return this;
        }

        public emc emc(ylm ylmVar) {
            this.zz = ylmVar;
            return this;
        }

        public emc emc(ul ulVar) {
            this.msw = ulVar;
            return this;
        }

        public emc emc(com.bytedance.sdk.component.bw.dg dgVar) {
            this.xq = dgVar;
            return this;
        }

        public emc emc(boolean z6) {
            this.ru = z6;
            return this;
        }

        public bw emc() {
            return new bw(this);
        }
    }

    @Override // com.bytedance.sdk.component.bw.sz
    public aa bw() {
        return this.dg;
    }

    @Override // com.bytedance.sdk.component.bw.sz
    public com.bytedance.sdk.component.bw.dg dg() {
        return this.xq;
    }

    @Override // com.bytedance.sdk.component.bw.sz
    public sup emc() {
        return this.emc;
    }

    @Override // com.bytedance.sdk.component.bw.sz
    public com.bytedance.sdk.component.bw.ypw msw() {
        return this.uym;
    }

    @Override // com.bytedance.sdk.component.bw.sz
    public boolean ru() {
        return this.ru;
    }

    @Override // com.bytedance.sdk.component.bw.sz
    public com.bytedance.sdk.component.bw.xq uym() {
        return this.ycc;
    }

    @Override // com.bytedance.sdk.component.bw.sz
    public ul xq() {
        return this.msw;
    }

    @Override // com.bytedance.sdk.component.bw.sz
    public sba ycc() {
        return this.bw;
    }

    @Override // com.bytedance.sdk.component.bw.sz
    public ExecutorService ypw() {
        return this.ypw;
    }

    @Override // com.bytedance.sdk.component.bw.sz
    public ylm zz() {
        return this.zz;
    }

    private bw(emc emcVar) {
        this.emc = emcVar.emc;
        this.ypw = emcVar.ypw;
        this.xq = emcVar.xq;
        this.dg = emcVar.dg;
        this.bw = emcVar.bw;
        this.ycc = emcVar.ycc;
        this.uym = emcVar.uym;
        this.msw = emcVar.msw;
        this.zz = emcVar.zz;
        this.ru = emcVar.ru;
    }

    public static bw emc(Context context) {
        return new emc().emc();
    }
}
