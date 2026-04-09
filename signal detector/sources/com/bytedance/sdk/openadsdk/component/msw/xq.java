package com.bytedance.sdk.openadsdk.component.msw;

import A2.C0115c;
import L1.c;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.xq.emc;
import com.bytedance.sdk.openadsdk.dg.bw.ypw.cf;

/* loaded from: classes.dex */
public class xq implements emc.InterfaceC0081emc {
    private boolean bw = false;
    private ypw dg;
    private Context emc;
    private rie xq;
    private FrameLayout ypw;

    public xq(Context context) {
        this.emc = context.getApplicationContext();
    }

    public boolean bw() {
        ypw ypwVar = this.dg;
        return (ypwVar == null || ypwVar.gbl() == null || !this.dg.gbl().ycc()) ? false : true;
    }

    public long cf() {
        ypw ypwVar = this.dg;
        if (ypwVar == null) {
            return 0L;
        }
        return this.dg.uym() + ypwVar.zz();
    }

    public boolean dg() {
        ypw ypwVar = this.dg;
        return (ypwVar == null || ypwVar.gbl() == null || !this.dg.gbl().ypw()) ? false : true;
    }

    public void emc(FrameLayout frameLayout, rie rieVar) {
        this.ypw = frameLayout;
        this.xq = rieVar;
        this.dg = new ypw(this.emc, frameLayout, rieVar);
    }

    public void gbl() {
        ypw ypwVar = this.dg;
        if (ypwVar != null) {
            ypwVar.xq();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.xq.emc.InterfaceC0081emc
    public long getVideoProgress() {
        return sz();
    }

    public void msw() {
        try {
            if (bw()) {
                this.dg.ypw();
            }
        } catch (Throwable th) {
            ul.xq("TTAppOpenVideoManager", "open_ad", "AppOpenVideoManager onPause throw Exception :" + th.getMessage());
        }
    }

    public long qh() {
        ypw ypwVar = this.dg;
        if (ypwVar != null) {
            return ypwVar.uym();
        }
        return 0L;
    }

    public void ru() {
        ypw ypwVar = this.dg;
        if (ypwVar == null) {
            return;
        }
        ypwVar.dg();
        this.dg = null;
    }

    public void sup() {
        ypw ypwVar = this.dg;
        if (ypwVar == null) {
            return;
        }
        this.emc = null;
        ypwVar.dg();
        this.dg = null;
    }

    public long sz() {
        ypw ypwVar = this.dg;
        if (ypwVar != null) {
            return ypwVar.ycc();
        }
        return 0L;
    }

    public boolean uym() {
        ypw ypwVar = this.dg;
        return ypwVar != null && ypwVar.qh();
    }

    public boolean xq() {
        return this.bw;
    }

    public boolean ycc() {
        ypw ypwVar = this.dg;
        return (ypwVar == null || ypwVar.gbl() == null || !this.dg.gbl().uym()) ? false : true;
    }

    public ypw ypw() {
        return this.dg;
    }

    public void zz() {
        try {
            if (ycc()) {
                gbl();
            }
        } catch (Throwable th) {
            ul.xq("TTAppOpenVideoManager", "onContinue throw Exception :" + th.getMessage());
        }
    }

    public boolean emc() {
        com.bytedance.sdk.openadsdk.core.sz.emc.ypw ypwVarEmc = rie.emc(((C0115c) CacheDirFactory.getICacheDir(0)).g(), this.xq);
        ypwVarEmc.ypw(this.xq.ye());
        ypwVarEmc.ypw(this.ypw.getWidth());
        ypwVarEmc.xq(this.ypw.getHeight());
        ypwVarEmc.xq(this.xq.wdp());
        ypwVarEmc.emc(0L);
        ypwVarEmc.emc(true);
        return this.dg.emc(ypwVarEmc);
    }

    public void emc(boolean z6) {
        this.bw = z6;
    }

    public void emc(c cVar) {
        ypw ypwVar = this.dg;
        if (ypwVar != null) {
            ypwVar.emc(cVar);
        }
    }

    public boolean emc(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.emc emcVar, rie rieVar) {
        emc(frameLayout, rieVar);
        emc(emcVar);
        try {
            return emc();
        } catch (Throwable th) {
            ul.xq("TTAppOpenVideoManager", "open_ad", "ttAppOpenAd playVideo error: " + th.getMessage());
            return false;
        }
    }

    public boolean emc(float f2) {
        try {
            ypw ypwVar = this.dg;
            if (ypwVar != null) {
                return ypwVar.emc(f2);
            }
        } catch (Throwable th) {
            ul.xq("TTAppOpenVideoManager", "open_ad", "setPlaybackSpeed error: " + th.getMessage());
        }
        return false;
    }

    public void emc(int i) {
        if (this.dg != null) {
            cf.emc emcVar = new cf.emc();
            emcVar.ypw(sz());
            emcVar.dg(cf());
            emcVar.xq(qh());
            emcVar.xq(i);
            emcVar.dg(this.dg.msw());
            emcVar.emc(this.dg.aa());
            this.dg.emc(emcVar);
        }
    }
}
