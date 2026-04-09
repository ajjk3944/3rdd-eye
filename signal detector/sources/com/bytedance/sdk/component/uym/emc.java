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
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public class emc {
    private static bw emc;
    private gbl ypw;

    /* renamed from: com.bytedance.sdk.component.uym.emc$emc, reason: collision with other inner class name */
    public static final class C0038emc {
        private Set<String> bw;
        private Bundle ycc;
        final List<msw> dg = new ArrayList();
        int emc = 10000;
        int ypw = 10000;
        int xq = 10000;

        public C0038emc emc(boolean z6) {
            return this;
        }

        public C0038emc xq(long j6, TimeUnit timeUnit) {
            this.xq = emc("timeout", j6, timeUnit);
            return this;
        }

        public C0038emc ypw(long j6, TimeUnit timeUnit) {
            this.ypw = emc("timeout", j6, timeUnit);
            return this;
        }

        public C0038emc emc(long j6, TimeUnit timeUnit) {
            this.emc = emc("timeout", j6, timeUnit);
            return this;
        }

        public C0038emc emc(msw mswVar) {
            this.dg.add(mswVar);
            return this;
        }

        private static int emc(String str, long j6, TimeUnit timeUnit) {
            if (j6 < 0) {
                throw new IllegalArgumentException(AbstractC2763b.e(str, " < 0"));
            }
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j6);
                if (millis > 2147483647L) {
                    throw new IllegalArgumentException(AbstractC2763b.e(str, " too large."));
                }
                if (millis != 0 || j6 <= 0) {
                    return (int) millis;
                }
                throw new IllegalArgumentException(AbstractC2763b.e(str, " too small."));
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

    private emc(C0038emc c0038emc) {
        gbl.emc emcVar = new gbl.emc();
        long j6 = c0038emc.emc;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        gbl.emc emcVarYpw = emcVar.emc(j6, timeUnit).xq(c0038emc.xq, timeUnit).ypw(c0038emc.ypw, timeUnit);
        List<msw> list = c0038emc.dg;
        if (list != null && list.size() > 0) {
            Iterator<msw> it = c0038emc.dg.iterator();
            while (it.hasNext()) {
                emcVarYpw.emc(it.next());
            }
        }
        if (c0038emc.ycc != null) {
            Bundle unused = c0038emc.ycc;
        }
        Set unused2 = c0038emc.bw;
        this.ypw = emcVarYpw.emc();
    }

    public static void emc(bw bwVar) {
        emc = bwVar;
    }
}
