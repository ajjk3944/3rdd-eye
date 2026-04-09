package com.bytedance.sdk.component.uym;

import android.os.Bundle;
import com.bytedance.sdk.component.uym.xq.xq;
import com.bytedance.sdk.component.uym.ypw.dg;
import com.bytedance.sdk.component.ypw.emc.emc.emc.bw;
import com.bytedance.sdk.component.ypw.emc.gbl;
import com.bytedance.sdk.component.ypw.emc.msw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.xbill.DNS.TTL;

/* loaded from: classes.dex */
public class emc {
    private static bw emc;
    private gbl ypw;

    /* renamed from: com.bytedance.sdk.component.uym.emc$emc, reason: collision with other inner class name */
    public static final class C0123emc {
        private Set<String> bw;
        private Bundle ycc;
        final List<msw> dg = new ArrayList();
        int emc = 10000;
        int ypw = 10000;
        int xq = 10000;

        public C0123emc emc(boolean z10) {
            return this;
        }

        public C0123emc xq(long j10, TimeUnit timeUnit) {
            this.xq = emc("timeout", j10, timeUnit);
            return this;
        }

        public C0123emc ypw(long j10, TimeUnit timeUnit) {
            this.ypw = emc("timeout", j10, timeUnit);
            return this;
        }

        public C0123emc emc(long j10, TimeUnit timeUnit) {
            this.emc = emc("timeout", j10, timeUnit);
            return this;
        }

        public C0123emc emc(msw mswVar) {
            this.dg.add(mswVar);
            return this;
        }

        private static int emc(String str, long j10, TimeUnit timeUnit) {
            if (j10 < 0) {
                throw new IllegalArgumentException(str + " < 0");
            }
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j10);
                if (millis > TTL.MAX_VALUE) {
                    throw new IllegalArgumentException(str + " too large.");
                }
                if (millis != 0 || j10 <= 0) {
                    return (int) millis;
                }
                throw new IllegalArgumentException(str + " too small.");
            }
            throw new NullPointerException("unit == null");
        }

        public emc emc() {
            return new emc(this);
        }
    }

    public static boolean bw() {
        bw bwVar = emc;
        if (bwVar == null) {
            return false;
        }
        return bwVar.emc();
    }

    public static void emc() {
        xq.emc(xq.emc.DEBUG);
    }

    public com.bytedance.sdk.component.uym.ypw.emc dg() {
        return new com.bytedance.sdk.component.uym.ypw.emc(this.ypw);
    }

    public com.bytedance.sdk.component.uym.ypw.ypw xq() {
        return new com.bytedance.sdk.component.uym.ypw.ypw(this.ypw);
    }

    public gbl ycc() {
        return this.ypw;
    }

    public dg ypw() {
        return new dg(this.ypw);
    }

    private emc(C0123emc c0123emc) {
        gbl.emc emcVar = new gbl.emc();
        long j10 = c0123emc.emc;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        gbl.emc emcVarYpw = emcVar.emc(j10, timeUnit).xq(c0123emc.xq, timeUnit).ypw(c0123emc.ypw, timeUnit);
        List<msw> list = c0123emc.dg;
        if (list != null && list.size() > 0) {
            Iterator<msw> it = c0123emc.dg.iterator();
            while (it.hasNext()) {
                emcVarYpw.emc(it.next());
            }
        }
        if (c0123emc.ycc != null) {
            Bundle unused = c0123emc.ycc;
        }
        Set unused2 = c0123emc.bw;
        this.ypw = emcVarYpw.emc();
    }

    public static void emc(bw bwVar) {
        emc = bwVar;
    }
}
