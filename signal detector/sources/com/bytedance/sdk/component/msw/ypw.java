package com.bytedance.sdk.component.msw;

import android.os.SystemClock;
import com.bytedance.sdk.component.utils.cf;

/* loaded from: classes.dex */
class ypw implements Comparable, Runnable {
    private Thread dg = null;
    private msw emc;
    private long xq;
    private emc ypw;

    public ypw(msw mswVar, emc emcVar) {
        this.xq = 0L;
        this.emc = mswVar;
        this.ypw = emcVar;
        this.xq = SystemClock.uptimeMillis();
    }

    private void emc(String str, String str2, long j6) {
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof ypw) {
            return this.emc.compareTo(((ypw) obj).emc());
        }
        return 0;
    }

    public boolean equals(Object obj) {
        msw mswVar;
        return (obj instanceof ypw) && (mswVar = this.emc) != null && mswVar.equals(((ypw) obj).emc());
    }

    public int hashCode() {
        return this.emc.hashCode();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.Runnable
    public void run() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.dg = Thread.currentThread();
        msw mswVar = this.emc;
        if (mswVar != null) {
            mswVar.run();
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
        if (this.ypw != null) {
            dg.emc();
        }
        if (cf.emc()) {
            emc emcVar = this.ypw;
            if (emcVar != null) {
                emcVar.emc();
            }
            msw mswVar2 = this.emc;
            if (mswVar2 != null) {
                mswVar2.getName();
            }
            String strEmc = this.ypw.emc();
            strEmc.getClass();
            char c6 = 65535;
            switch (strEmc.hashCode()) {
                case 3107:
                    if (strEmc.equals("ad")) {
                        c6 = 0;
                        break;
                    }
                    break;
                case 3366:
                    if (strEmc.equals("io")) {
                        c6 = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (strEmc.equals("log")) {
                        c6 = 2;
                        break;
                    }
                    break;
                case 3237136:
                    if (strEmc.equals("init")) {
                        c6 = 3;
                        break;
                    }
                    break;
                case 212371911:
                    if (strEmc.equals("computation")) {
                        c6 = 4;
                        break;
                    }
                    break;
            }
            switch (c6) {
                case 0:
                case 3:
                    if (jUptimeMillis2 > 2000) {
                        emc emcVar2 = this.ypw;
                        String strEmc2 = emcVar2 != null ? emcVar2.emc() : "null";
                        msw mswVar3 = this.emc;
                        emc(strEmc2, mswVar3 != null ? mswVar3.getName() : "null", jUptimeMillis2);
                        break;
                    }
                    break;
                case 1:
                    if (jUptimeMillis2 > 5000) {
                        emc emcVar3 = this.ypw;
                        String strEmc3 = emcVar3 != null ? emcVar3.emc() : "null";
                        msw mswVar4 = this.emc;
                        emc(strEmc3, mswVar4 != null ? mswVar4.getName() : "null", jUptimeMillis2);
                        break;
                    }
                    break;
                case 2:
                    if (jUptimeMillis2 > 3000) {
                        emc emcVar4 = this.ypw;
                        String strEmc4 = emcVar4 != null ? emcVar4.emc() : "null";
                        msw mswVar5 = this.emc;
                        emc(strEmc4, mswVar5 != null ? mswVar5.getName() : "null", jUptimeMillis2);
                        break;
                    }
                    break;
                case 4:
                    if (jUptimeMillis2 > 1000) {
                        emc emcVar5 = this.ypw;
                        String strEmc5 = emcVar5 != null ? emcVar5.emc() : "null";
                        msw mswVar6 = this.emc;
                        emc(strEmc5, mswVar6 != null ? mswVar6.getName() : "null", jUptimeMillis2);
                        break;
                    }
                    break;
            }
        }
    }

    public msw emc() {
        return this.emc;
    }
}
