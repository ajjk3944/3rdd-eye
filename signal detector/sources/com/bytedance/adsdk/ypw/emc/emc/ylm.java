package com.bytedance.adsdk.ypw.emc.emc;

import com.bytedance.adsdk.ypw.emc.ypw.emc;
import com.bytedance.adsdk.ypw.xq.ypw.yzg;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ylm implements xq, emc.InterfaceC0021emc {
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<?, Float> bw;
    private final yzg.emc dg;
    private final String emc;
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<?, Float> uym;
    private final List<emc.InterfaceC0021emc> xq = new ArrayList();
    private final com.bytedance.adsdk.ypw.emc.ypw.emc<?, Float> ycc;
    private final boolean ypw;

    public ylm(com.bytedance.adsdk.ypw.xq.xq.emc emcVar, com.bytedance.adsdk.ypw.xq.ypw.yzg yzgVar) {
        this.emc = yzgVar.emc();
        this.ypw = yzgVar.ycc();
        this.dg = yzgVar.ypw();
        com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> emcVarEmc = yzgVar.dg().emc();
        this.bw = emcVarEmc;
        com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> emcVarEmc2 = yzgVar.xq().emc();
        this.ycc = emcVarEmc2;
        com.bytedance.adsdk.ypw.emc.ypw.emc<Float, Float> emcVarEmc3 = yzgVar.bw().emc();
        this.uym = emcVarEmc3;
        emcVar.emc(emcVarEmc);
        emcVar.emc(emcVarEmc2);
        emcVar.emc(emcVarEmc3);
        emcVarEmc.emc(this);
        emcVarEmc2.emc(this);
        emcVarEmc3.emc(this);
    }

    public com.bytedance.adsdk.ypw.emc.ypw.emc<?, Float> bw() {
        return this.uym;
    }

    public com.bytedance.adsdk.ypw.emc.ypw.emc<?, Float> dg() {
        return this.ycc;
    }

    @Override // com.bytedance.adsdk.ypw.emc.emc.xq
    public void emc(List<xq> list, List<xq> list2) {
    }

    public com.bytedance.adsdk.ypw.emc.ypw.emc<?, Float> xq() {
        return this.bw;
    }

    public boolean ycc() {
        return this.ypw;
    }

    public yzg.emc ypw() {
        return this.dg;
    }

    @Override // com.bytedance.adsdk.ypw.emc.ypw.emc.InterfaceC0021emc
    public void emc() {
        for (int i = 0; i < this.xq.size(); i++) {
            this.xq.get(i).emc();
        }
    }

    public void emc(emc.InterfaceC0021emc interfaceC0021emc) {
        this.xq.add(interfaceC0021emc);
    }
}
