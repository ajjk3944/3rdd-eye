package com.bytedance.sdk.openadsdk.component.reward.emc;

import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;

/* loaded from: classes.dex */
public class msw {
    public static int emc = 0;
    public static int xq = 2;
    public static int ypw = 1;
    private zz bw;
    private final boolean dg;

    public msw(emc emcVar, rie rieVar) {
        this.dg = rieVar.yo();
        this.bw = dr.ycc(rieVar) ? new uym(emcVar) : new zz(emcVar);
    }

    public void bw() {
        zz zzVar = this.bw;
        if (zzVar != null) {
            zzVar.dg();
        }
    }

    public boolean dg() {
        zz zzVar = this.bw;
        if (zzVar != null) {
            return zzVar.ru();
        }
        return false;
    }

    public com.bytedance.sdk.openadsdk.ylm.msw emc() {
        return null;
    }

    public boolean gbl() {
        zz zzVar = this.bw;
        if (zzVar != null) {
            return zzVar.cf();
        }
        return false;
    }

    public void msw() {
        zz zzVar = this.bw;
        if (zzVar != null) {
            zzVar.bw();
        }
    }

    public void ru() {
        zz zzVar = this.bw;
        if (zzVar != null) {
            zzVar.xq();
        }
    }

    public void uym() {
        zz zzVar = this.bw;
        if (zzVar != null) {
            zzVar.emc();
        }
    }

    public com.bytedance.sdk.openadsdk.sz.bw xq() {
        return null;
    }

    public void ycc() {
        zz zzVar = this.bw;
        if (zzVar != null) {
            zzVar.zz();
        }
    }

    public boolean ypw() {
        return false;
    }

    public void zz() {
        zz zzVar = this.bw;
        if (zzVar != null) {
            zzVar.qh();
        }
    }

    public void emc(int i) {
        zz zzVar = this.bw;
        if (zzVar != null) {
            zzVar.emc(i);
        }
    }

    public void xq(int i) {
        zz zzVar;
        if (i == xq || (zzVar = this.bw) == null) {
            return;
        }
        zzVar.ycc();
    }

    public void ypw(int i) {
        zz zzVar = this.bw;
        if (zzVar != null) {
            zzVar.emc(i);
        }
    }

    public boolean dg(int i) {
        zz zzVar;
        if (i != ypw || (zzVar = this.bw) == null) {
            return false;
        }
        return zzVar.sz();
    }

    public void emc(com.bytedance.sdk.openadsdk.core.xq.bw bwVar) {
        zz zzVar = this.bw;
        if (zzVar != null) {
            zzVar.emc(bwVar);
        }
    }

    public void ypw(boolean z6) {
        zz zzVar = this.bw;
        if (zzVar != null) {
            zzVar.xq(z6);
        }
    }

    public void emc(boolean z6) {
        zz zzVar = this.bw;
        if (zzVar != null) {
            zzVar.ypw(z6);
        }
    }
}
