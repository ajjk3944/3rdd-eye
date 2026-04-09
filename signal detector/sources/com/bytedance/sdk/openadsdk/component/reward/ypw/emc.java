package com.bytedance.sdk.openadsdk.component.reward.ypw;

import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.openadsdk.component.reward.emc.cf;
import com.bytedance.sdk.openadsdk.component.reward.emc.sup;
import com.bytedance.sdk.openadsdk.component.reward.emc.vk;
import com.bytedance.sdk.openadsdk.component.reward.view.gbl;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.ul;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* loaded from: classes.dex */
public class emc {
    protected final cf bw;
    protected int dg;
    protected com.bytedance.sdk.openadsdk.component.reward.emc.emc emc;
    protected final sup msw;
    protected sf ru;
    protected final vk uym;
    protected int xq;
    protected final gbl ycc;
    protected rie ypw;
    protected com.bytedance.sdk.openadsdk.core.sz.dg.ypw zz;

    public emc(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        this.emc = emcVar;
        this.ypw = emcVar.ypw;
        this.xq = emcVar.but;
        this.dg = emcVar.wd;
        this.bw = emcVar.ylm;
        this.ycc = emcVar.mkp;
        this.uym = emcVar.xmt;
        this.msw = emcVar.cuf;
    }

    public void emc(com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar, sf sfVar) {
        this.zz = ypwVar;
        this.ru = sfVar;
    }

    public void xq() {
        if (dr.ypw(this.emc.ypw) && DeviceUtils.uym() == 0) {
            this.emc.yz = true;
        }
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.emc;
        emcVar.cuf.ypw(emcVar.yz);
    }

    public boolean ypw() {
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.emc;
        boolean z6 = emcVar.pe == null;
        boolean zUym = emcVar.ylm.uym();
        boolean z7 = ul.xq(this.emc.ypw) || !rie.bw(this.emc.ypw);
        if (z6 && zUym && z7) {
            return false;
        }
        boolean zYpw = ul.ypw(this.emc.ypw);
        boolean z8 = this.emc.vk.get();
        if (!zYpw || !z8) {
            return (this.emc.zz.get() || this.emc.ru.get() || !this.emc.ylm.zz()) ? false : true;
        }
        FrameLayout frameLayoutYcc = this.emc.mkp.ycc();
        frameLayoutYcc.setVisibility(4);
        frameLayoutYcc.setVisibility(0);
        return false;
    }

    public boolean emc() {
        return this.emc.ypw.ak() || this.emc.ypw.in() == 15 || this.emc.ypw.in() == 5 || this.emc.ypw.in() == 50;
    }

    public void emc(boolean z6) {
        if (this.emc.zz.get()) {
            return;
        }
        rie rieVar = this.ypw;
        if (rieVar != null && rieVar.tze()) {
            this.msw.xq(false);
            this.msw.emc(true);
            this.emc.mkp.ypw(8);
            this.emc.mkp.dg(8);
            return;
        }
        if (!z6) {
            this.msw.xq(false);
            this.msw.emc(false);
            this.msw.dg(false);
            this.emc.mkp.ycc(8);
        } else {
            this.msw.emc(this.emc.ypw.lr());
            if (emc()) {
                this.msw.xq(true);
            }
            if (!emc() && (!(this instanceof uym) || !this.emc.ypw.ycc())) {
                this.msw.bw();
                this.emc.mkp.ycc(0);
            } else {
                this.msw.dg(true);
            }
        }
        if (z6) {
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.emc;
            if (emcVar.wad != com.bytedance.sdk.openadsdk.component.reward.view.xq.emc) {
                emcVar.mkp.ypw(8);
                this.emc.mkp.dg(8);
                return;
            } else {
                emcVar.mkp.ypw(0);
                this.emc.mkp.xq(0);
                this.emc.mkp.dg(0);
                return;
            }
        }
        this.emc.mkp.ypw(4);
        this.emc.mkp.xq(8);
        this.emc.mkp.dg(8);
    }
}
