package com.bytedance.sdk.component.ypw.emc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class gbl implements Cloneable {
    public TimeUnit bw;
    public long dg;
    public List<msw> emc;
    public TimeUnit uym;
    public TimeUnit xq;
    public long ycc;
    public long ypw;

    public gbl(emc emcVar) {
        this.ypw = emcVar.ypw;
        this.dg = emcVar.dg;
        this.ycc = emcVar.ycc;
        List<msw> list = emcVar.emc;
        this.xq = emcVar.xq;
        this.bw = emcVar.bw;
        this.uym = emcVar.uym;
        this.emc = list;
    }

    public abstract dg emc();

    public abstract ypw emc(sup supVar);

    public emc ypw() {
        return new emc(this);
    }

    public static final class emc {
        public TimeUnit bw;
        public long dg;
        public final List<msw> emc;
        public TimeUnit uym;
        public TimeUnit xq;
        public long ycc;
        public long ypw;

        public emc() {
            this.emc = new ArrayList();
            this.ypw = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.xq = timeUnit;
            this.dg = 10000L;
            this.bw = timeUnit;
            this.ycc = 10000L;
            this.uym = timeUnit;
        }

        public emc emc(long j10, TimeUnit timeUnit) {
            this.ypw = j10;
            this.xq = timeUnit;
            return this;
        }

        public emc xq(long j10, TimeUnit timeUnit) {
            this.ycc = j10;
            this.uym = timeUnit;
            return this;
        }

        public emc ypw(long j10, TimeUnit timeUnit) {
            this.dg = j10;
            this.bw = timeUnit;
            return this;
        }

        public emc emc(msw mswVar) {
            this.emc.add(mswVar);
            return this;
        }

        public gbl emc() {
            return com.bytedance.sdk.component.ypw.emc.emc.emc.emc(this);
        }

        public emc(String str) {
            this.emc = new ArrayList();
            this.ypw = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.xq = timeUnit;
            this.dg = 10000L;
            this.bw = timeUnit;
            this.ycc = 10000L;
            this.uym = timeUnit;
        }

        public emc(gbl gblVar) {
            this.emc = new ArrayList();
            this.ypw = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.xq = timeUnit;
            this.dg = 10000L;
            this.bw = timeUnit;
            this.ycc = 10000L;
            this.uym = timeUnit;
            this.ypw = gblVar.ypw;
            this.xq = gblVar.xq;
            this.dg = gblVar.dg;
            this.bw = gblVar.bw;
            this.ycc = gblVar.ycc;
            this.uym = gblVar.uym;
        }
    }
}
