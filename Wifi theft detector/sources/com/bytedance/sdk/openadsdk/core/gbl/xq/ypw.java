package com.bytedance.sdk.openadsdk.core.gbl.xq;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.rtt;
import com.bytedance.sdk.openadsdk.core.zz.cf;

/* loaded from: classes.dex */
public class ypw {
    private final boolean bw;
    private com.bytedance.sdk.openadsdk.core.gbl.xq.emc dg;
    private xq emc;
    private rie xq;
    private Context ypw;

    public static class emc {
        public static xq emc(Context context, rie rieVar, boolean z10) {
            if (aa.emc(rieVar, z10)) {
                return new dg(context, rieVar, z10);
            }
            return null;
        }
    }

    public ypw(Context context, rie rieVar) {
        this(context, rieVar, false);
    }

    public void dg() {
        xq xqVar = this.emc;
        if (xqVar != null) {
            xqVar.xq();
        }
    }

    public void emc(cf cfVar) {
        xq xqVarEmc = emc.emc(this.ypw, this.xq, this.bw);
        this.emc = xqVarEmc;
        if (xqVarEmc != null) {
            xqVarEmc.emc();
            this.emc.emc(cfVar);
        }
    }

    public View xq() {
        xq xqVar = this.emc;
        if (xqVar != null) {
            return xqVar.dg();
        }
        return null;
    }

    public void ypw() {
        xq xqVar = this.emc;
        if (xqVar != null) {
            xqVar.ypw();
        }
    }

    public ypw(Context context, rie rieVar, boolean z10) {
        this.ypw = context;
        this.xq = rieVar;
        this.bw = z10;
    }

    public void emc(com.bytedance.sdk.openadsdk.core.gbl.xq.emc emcVar) {
        this.dg = emcVar;
        xq xqVar = this.emc;
        if (xqVar != null) {
            xqVar.emc(emcVar);
        }
    }

    public void emc(int i10) {
        rtt rttVarBw;
        xq xqVar = this.emc;
        if (!(xqVar instanceof dg) || (rttVarBw = ((dg) xqVar).bw()) == null || rttVarBw.emc() == null) {
            return;
        }
        rttVarBw.emc().emc(i10);
    }

    public xq emc() {
        return this.emc;
    }
}
