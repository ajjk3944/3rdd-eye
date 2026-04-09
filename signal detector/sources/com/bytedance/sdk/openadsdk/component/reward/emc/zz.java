package com.bytedance.sdk.openadsdk.component.reward.emc;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.activity.dg;
import com.bytedance.sdk.openadsdk.core.db;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.rtt;
import com.bytedance.sdk.openadsdk.core.widget.sba;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zz {
    protected FrameLayout aa;
    protected boolean cf;
    private sba emc;
    protected final String gbl;
    protected volatile boolean msw;
    protected boolean qh;
    protected final rie ru;
    protected com.bytedance.sdk.openadsdk.ylm.emc.emc sba;
    protected final emc sup;
    protected boolean sz;
    protected boolean vk;
    private boolean xq;
    private dg.ycc ypw;
    protected AtomicBoolean yzg = new AtomicBoolean(false);
    protected final Activity zz;

    public zz(emc emcVar) {
        this.sup = emcVar;
        this.zz = emcVar.mxo;
        this.gbl = emcVar.bw;
        rie rieVar = emcVar.ypw;
        this.ru = rieVar;
        this.qh = dr.bw(rieVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aa() {
        com.bytedance.sdk.openadsdk.activity.ypw ypwVarWo;
        emc emcVar = this.sup;
        if (emcVar.wbn) {
            com.bytedance.sdk.openadsdk.activity.msw mswVar = emcVar.pe;
            if (mswVar == null || (ypwVarWo = mswVar.wo()) == null) {
                return;
            }
            ypwVarWo.emc(2);
            return;
        }
        if (this instanceof uym) {
            zz();
        } else {
            dg.ycc yccVar = this.ypw;
            if (yccVar != null) {
                yccVar.ypw();
            }
        }
        this.xq = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dg(boolean z6) {
        com.bytedance.sdk.openadsdk.activity.ypw ypwVarWo;
        emc emcVar = this.sup;
        if (!emcVar.wbn) {
            if (this instanceof uym) {
                emc(0L);
            } else {
                dg.ycc yccVar = this.ypw;
                if (yccVar != null) {
                    yccVar.xq();
                }
            }
            this.xq = false;
            return;
        }
        com.bytedance.sdk.openadsdk.activity.msw mswVar = emcVar.pe;
        if (mswVar == null || (ypwVarWo = mswVar.wo()) == null) {
            return;
        }
        if (z6) {
            ypwVarWo.dr();
        }
        ypwVarWo.emc(1);
    }

    private void sba() {
        int iLce = this.ru.lce();
        if (iLce == -1) {
            if (dr.uym(this.ru)) {
                com.bytedance.sdk.openadsdk.ylm.emc.emc emcVar = this.sba;
                if (emcVar == null || !emcVar.bw()) {
                    this.sup.cn.ylm();
                    return;
                } else {
                    this.sup.vk.set(true);
                    this.sup.cn.sz();
                }
            } else {
                this.sup.vk.set(true);
                this.sup.cn.sz();
            }
        } else {
            if (iLce < 0) {
                return;
            }
            this.sup.cuf.dg(false);
            if (dr.uym(this.ru)) {
                com.bytedance.sdk.openadsdk.ylm.emc.emc emcVar2 = this.sba;
                if (emcVar2 == null || !emcVar2.bw()) {
                    dg.ycc yccVar = new dg.ycc(iLce) { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.zz.5
                        @Override // com.bytedance.sdk.openadsdk.activity.dg.ycc
                        public void emc() {
                            zz.this.sup.ra.sendEmptyMessage(1);
                        }
                    };
                    this.ypw = yccVar;
                    yccVar.bw();
                    return;
                } else {
                    dg.ycc yccVar2 = new dg.ycc(iLce) { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.zz.4
                        @Override // com.bytedance.sdk.openadsdk.activity.dg.ycc
                        public void emc() {
                            zz.this.sup.ra.sendEmptyMessage(600);
                        }
                    };
                    this.ypw = yccVar2;
                    yccVar2.bw();
                }
            } else {
                dg.ycc yccVar3 = new dg.ycc(iLce) { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.zz.6
                    @Override // com.bytedance.sdk.openadsdk.activity.dg.ycc
                    public void emc() {
                        zz.this.sup.ra.sendEmptyMessage(600);
                    }
                };
                this.ypw = yccVar3;
                yccVar3.bw();
            }
        }
        emc emcVar3 = this.sup;
        if (emcVar3.nw == null || !emcVar3.uym()) {
            return;
        }
        this.sup.nw.emc(iLce);
    }

    private void vk() {
        if (this.sup.ypw.vcl()) {
            sba sbaVar = new sba(this.sup, new sba.emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.zz.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.sba.emc
                public void bw() {
                    zz.this.aa();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.sba.emc
                public int dg() {
                    zz zzVar = zz.this;
                    return zzVar.sup.wbn ? zzVar.sup() : zzVar.msw();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.sba.emc
                public void emc() {
                    zz.this.sup.tp.emc("skipToNextAd", (JSONObject) null);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.sba.emc
                public void xq() {
                    com.bytedance.sdk.openadsdk.activity.msw mswVar;
                    com.bytedance.sdk.openadsdk.activity.ypw ypwVarWo;
                    rtt rttVarUym = zz.this.sba.uym();
                    if (rttVarUym != null) {
                        rttVarUym.emc("popupDidShow", (JSONObject) null);
                    }
                    emc emcVar = zz.this.sup;
                    if (!emcVar.wbn || (mswVar = emcVar.pe) == null || (ypwVarWo = mswVar.wo()) == null) {
                        return;
                    }
                    ypwVarWo.xmt();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.sba.emc
                public void ycc() {
                    zz.this.dg(false);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.sba.emc
                public void ypw() {
                    rtt rttVarUym = zz.this.sba.uym();
                    if (rttVarUym != null) {
                        rttVarUym.emc("popupDidDismiss", (JSONObject) null);
                    }
                    zz.this.dg(true);
                }
            });
            this.emc = sbaVar;
            sbaVar.emc(this.sup.iyl);
            rtt rttVarUym = this.sba.uym();
            if (rttVarUym != null) {
                rttVarUym.emc(new db() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.zz.2
                    @Override // com.bytedance.sdk.openadsdk.core.db
                    public void m_() throws JSONException {
                        if (zz.this.emc != null) {
                            zz.this.emc.emc(zz.this.sup.mxo);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.db
                    public void n_() {
                        if (zz.this.emc != null) {
                            zz.this.emc.n_();
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.db
                    public int o_() {
                        zz zzVar = zz.this;
                        return zzVar.sup.wbn ? zzVar.sup() : zzVar.msw();
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.db
                    public void p_() {
                        zz.this.aa();
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.db
                    public void q_() {
                        zz.this.dg(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.db
                    public void r_() {
                    }
                });
            }
        }
    }

    public void bw() {
        if (!this.qh || this.yzg.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.ylm.emc.emc emcVar = this.sba;
        if (emcVar != null) {
            emcVar.xq();
        }
        dg.ycc yccVar = this.ypw;
        if (yccVar != null) {
            yccVar.ypw();
        }
    }

    public boolean cf() {
        sba sbaVar = this.emc;
        if (sbaVar != null) {
            return sbaVar.zz();
        }
        return false;
    }

    public void emc(int i) {
    }

    public boolean gbl() {
        return !this.xq;
    }

    public int msw() {
        dg.ycc yccVar = this.ypw;
        if (yccVar != null) {
            return (int) (yccVar.ycc() / 1000);
        }
        return 0;
    }

    public void qh() throws JSONException {
        if (!this.yzg.compareAndSet(false, true)) {
            this.sup.xmt.uym();
            return;
        }
        com.bytedance.sdk.openadsdk.ylm.emc.emc emcVar = this.sba;
        if (emcVar != null) {
            emcVar.emc(true);
        }
        this.sup.xmt.uym(true);
        emc emcVar2 = this.sup;
        emcVar2.rtt.emc(true, emcVar2.cn);
        if (this.sup.rtt.bw()) {
            this.sup.nw.emc(r0.uym);
            return;
        }
        emc emcVar3 = this.sup;
        emcVar3.xmt.emc(emcVar3.yz, true);
        this.sup.xmt.xq(true);
        this.sup.xmt.ypw(true);
        this.sup.ra.removeMessages(600);
    }

    public boolean ru() {
        return false;
    }

    public int sup() {
        com.bytedance.sdk.openadsdk.activity.ypw ypwVarWo;
        com.bytedance.sdk.openadsdk.activity.msw mswVar = this.sup.pe;
        if (mswVar == null || (ypwVarWo = mswVar.wo()) == null) {
            return 0;
        }
        return ypwVarWo.lt();
    }

    public boolean sz() {
        return this.msw;
    }

    public int uym() {
        return 0;
    }

    public void xq() {
        if (this.qh) {
            this.msw = true;
            xq(this.sup.yz);
            this.sba.emc();
            sba();
            if (dr.msw(this.ru)) {
                this.sup.xmt.ycc();
            }
        }
    }

    public void ycc() {
        if (this.qh && !this.vk) {
            this.vk = true;
            com.bytedance.sdk.openadsdk.ylm.emc.emc emcVar = this.sba;
            if (emcVar != null) {
                emcVar.dg();
            }
            FrameLayout frameLayout = this.aa;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            sba sbaVar = this.emc;
            if (sbaVar != null) {
                sbaVar.msw();
                this.emc = null;
            }
            dg.ycc yccVar = this.ypw;
            if (yccVar != null) {
                yccVar.dg();
                this.ypw = null;
            }
        }
    }

    public void zz() {
        dg.ycc yccVar = this.ypw;
        if (yccVar != null) {
            yccVar.ypw();
        }
    }

    public void ypw(boolean z6) {
        if (this.qh) {
            emc emcVar = this.sup;
            if (emcVar.wo) {
                this.aa = (FrameLayout) emcVar.iyl.findViewById(com.bytedance.sdk.openadsdk.utils.vk.lce);
                emc(z6);
                vk();
            }
        }
    }

    public void emc() {
        if (this.qh && !this.sz) {
            this.sz = true;
        }
    }

    public com.bytedance.sdk.openadsdk.sz.ycc ypw() {
        return new com.bytedance.sdk.openadsdk.sz.ycc() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.zz.3
            @Override // com.bytedance.sdk.openadsdk.sz.ycc
            public void emc() {
                zz.this.sup.tp.ypw(false);
            }
        };
    }

    public void emc(boolean z6) {
        FrameLayout frameLayout = this.aa;
        if (frameLayout != null) {
            emc emcVar = this.sup;
            Context context = emcVar.vw;
            rie rieVar = this.ru;
            int i = emcVar.rqm;
            com.bytedance.sdk.openadsdk.activity.msw mswVar = emcVar.pe;
            com.bytedance.sdk.openadsdk.ylm.emc.emc emcVar2 = new com.bytedance.sdk.openadsdk.ylm.emc.emc(context, rieVar, i, z6, frameLayout, false, mswVar != null ? mswVar.ra() : 0);
            this.sba = emcVar2;
            emcVar2.emc(this.sup.tp);
            this.sba.emc(true, ypw());
        }
    }

    public void xq(boolean z6) {
        if (this.qh && this.sba != null && this.msw) {
            this.sba.emc(z6);
        }
    }

    public void dg() {
        if (!this.qh || this.yzg.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.ylm.emc.emc emcVar = this.sba;
        if (emcVar != null) {
            emcVar.ypw();
        }
        if (this.ypw == null || !gbl()) {
            return;
        }
        this.ypw.xq();
    }

    public void emc(long j6) {
        dg.ycc yccVar = this.ypw;
        if (yccVar != null) {
            yccVar.xq();
        }
    }

    public void emc(com.bytedance.sdk.openadsdk.core.xq.bw bwVar) {
        com.bytedance.sdk.openadsdk.ylm.emc.emc emcVar;
        if (this.qh && (emcVar = this.sba) != null) {
            emcVar.emc(bwVar);
        }
    }
}
