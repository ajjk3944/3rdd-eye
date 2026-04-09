package com.bytedance.sdk.openadsdk.activity;

import A2.C0115c;
import K1.c;
import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.bykv.vk.openvk.emc.emc.emc.xq.b;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.ypw;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.common.emc;
import com.bytedance.sdk.openadsdk.common.qh;
import com.bytedance.sdk.openadsdk.common.vk;
import com.bytedance.sdk.openadsdk.component.reward.sup;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.rie;
import com.bytedance.sdk.openadsdk.core.sra;
import com.bytedance.sdk.openadsdk.core.widget.sba;
import com.bytedance.sdk.openadsdk.dg.ru;
import com.bytedance.sdk.openadsdk.utils.db;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.tp;
import j$.util.Objects;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class msw implements com.bytedance.sdk.openadsdk.core.sz.dg.ypw {
    public boolean aa;
    public String cf;
    private boolean emc;
    public int gbl;
    public String qh;
    public int ru;
    protected IListenerManager sba;
    public boolean sup;
    public boolean sz;
    protected vk ul;
    protected final ypw uym;
    private sba xq;
    protected rie ycc;
    private boolean ypw;
    protected boolean yzg;
    protected com.bytedance.sdk.openadsdk.component.reward.emc.emc zz;
    protected final AtomicBoolean msw = new AtomicBoolean(false);
    public boolean vk = false;

    public msw(ypw ypwVar, rie rieVar, int i, int i3, boolean z6) {
        this.uym = ypwVar;
        this.ycc = rieVar;
        this.ru = i;
        this.gbl = i3;
        this.aa = z6;
    }

    private emc.InterfaceC0050emc dr() {
        return new emc.InterfaceC0050emc() { // from class: com.bytedance.sdk.openadsdk.activity.msw.4
            @Override // com.bytedance.sdk.openadsdk.common.emc.InterfaceC0050emc
            public void emc(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar, View view) {
                msw.this.ypw(emcVar);
            }
        };
    }

    private emc.ypw hxp() {
        return new emc.ypw() { // from class: com.bytedance.sdk.openadsdk.activity.msw.3
            @Override // com.bytedance.sdk.openadsdk.common.emc.ypw
            public void emc(boolean z6, int i) {
                msw mswVar = msw.this;
                if (mswVar instanceof emc) {
                    ((emc) mswVar).emc(z6, i);
                } else if (mswVar instanceof bw) {
                    mswVar.gbl();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.common.emc.ypw
            public void emc() {
                msw.this.yz();
            }
        };
    }

    private vk msw() {
        return new vk(this.zz) { // from class: com.bytedance.sdk.openadsdk.activity.msw.1
            @Override // com.bytedance.sdk.openadsdk.common.vk
            public boolean emc() {
                return msw.this.uym.sup().getBoolean("user_has_give_up_reward", false);
            }

            @Override // com.bytedance.sdk.openadsdk.common.vk
            public void xq() {
                msw.this.yz();
            }

            @Override // com.bytedance.sdk.openadsdk.common.vk
            public boolean ypw() {
                return msw.this.uym.sup().getBoolean("reward_verify", false);
            }

            @Override // com.bytedance.sdk.openadsdk.common.vk
            public void emc(boolean z6) {
                msw.this.uym.sup().putBoolean("user_has_give_up_reward", z6);
            }

            @Override // com.bytedance.sdk.openadsdk.common.vk
            public void emc(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
                msw.this.emc(emcVar);
            }
        };
    }

    private Runnable ylm() {
        return new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.msw.2
            @Override // java.lang.Runnable
            public void run() {
                msw.this.yz();
            }
        };
    }

    public void a_() {
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar;
        ypw ypwVar = this.uym;
        boolean z6 = ypwVar != null && ypwVar.xq();
        if (z6 && (emcVar = this.zz) != null && !(emcVar.pe instanceof ycc)) {
            this.ul = msw();
        }
        if (z6) {
            emc(this.ul);
        }
    }

    public boolean b_() {
        return false;
    }

    public void but() {
        com.bytedance.sdk.openadsdk.core.sz.emc.ypw ypwVarEmc = rie.emc(((C0115c) CacheDirFactory.getICacheDir(this.ycc.zxw())).b(), this.ycc);
        ypwVarEmc.emc("material_meta", this.ycc);
        ypwVarEmc.emc("ad_slot", this.ycc.vaf());
        com.bytedance.sdk.openadsdk.core.sz.bw.emc.emc(ypwVarEmc, new c() { // from class: com.bytedance.sdk.openadsdk.activity.msw.8
            @Override // K1.a
            public void emc(b bVar, int i) {
            }

            @Override // K1.a
            public void emc(b bVar, int i, String str) {
            }
        });
    }

    public void bw(boolean z6) {
        this.ypw = z6;
    }

    public abstract boolean c_();

    public void cn() {
        if (vw() || ee() == null || ee().iyl == null || !ee().ypw.vcl()) {
            return;
        }
        sba sbaVar = new sba(ee(), new sba.emc() { // from class: com.bytedance.sdk.openadsdk.activity.msw.9
            @Override // com.bytedance.sdk.openadsdk.core.widget.sba.emc
            public void bw() {
                msw.this.bw(2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.sba.emc
            public int dg() {
                ypw ypwVar = msw.this.uym;
                if (ypwVar != null) {
                    return ypwVar.lt();
                }
                return 0;
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.sba.emc
            public void emc() {
                msw mswVar = msw.this;
                mswVar.xq(mswVar.ee());
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.sba.emc
            public void xq() {
                ypw ypwVar = msw.this.uym;
                if (ypwVar != null) {
                    ypwVar.xmt();
                }
                msw.this.bw(2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.sba.emc
            public void ycc() {
                msw.this.bw(1);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.sba.emc
            public void ypw() {
                ypw ypwVar = msw.this.uym;
                if (ypwVar != null) {
                    ypwVar.dr();
                }
                msw.this.bw(1);
            }
        });
        this.xq = sbaVar;
        sbaVar.emc(ee().iyl);
    }

    public boolean cuf() {
        return false;
    }

    public abstract String d_();

    public boolean db() {
        return false;
    }

    public void dg() {
    }

    public abstract void e_();

    public abstract com.bytedance.sdk.openadsdk.component.reward.emc.emc ee();

    public abstract com.bytedance.sdk.openadsdk.component.reward.view.msw emc();

    public void emc(Activity activity) {
    }

    public abstract void emc(Activity activity, ypw.bw bwVar);

    public abstract void emc(String str);

    public abstract boolean f_();

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public List<rie> ffd() {
        return this.uym.sb();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void fu() {
        if (ee() != null) {
            ee().db.emc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public final void hj() {
        rie rieVar;
        wa();
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.zz;
        if (emcVar == null || (rieVar = emcVar.ypw) == null) {
            return;
        }
        rieVar.fwh();
        this.zz.ypw.xq(true);
        if (rie.bw(this.zz.ypw)) {
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = this.zz;
            rie rieVar2 = emcVar2.ypw;
            com.bytedance.sdk.openadsdk.dg.xq.ypw(rieVar2, emcVar2.bw, rieVar2.ph());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void iyl() {
        dg(2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void mkp() {
        wa();
    }

    public void mxo() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void ndl() {
        ypw ypwVar = this.uym;
        if (ypwVar != null) {
            ypwVar.emc(this, true);
        }
    }

    public void pxa() {
        ypw ypwVar = this.uym;
        if (ypwVar == null || ypwVar.sba()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            ypw("onAdShow");
        } else {
            this.uym.cf();
        }
        this.uym.ul();
    }

    public void qh() {
    }

    public int ra() {
        return this.gbl;
    }

    public abstract String rie();

    public void rqm() {
        dg(0);
    }

    public boolean rtt() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void ru() {
        toString();
        pxa();
    }

    public void sf() {
    }

    public abstract boolean sra();

    public void sz() {
    }

    public boolean tp() {
        ypw ypwVar = this.uym;
        return ypwVar != null && ypwVar.emc(this, this.ru);
    }

    public void ul() {
    }

    public boolean vw() {
        return this.aa;
    }

    public final void wa() {
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            ypw("onAdVideoBarClick");
        } else {
            this.uym.sz();
        }
    }

    public JSONObject wad() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("media_extra", this.cf);
            jSONObject.put("play_start_ts", 0);
            jSONObject.put("play_end_ts", 0);
            jSONObject.put("user_id", this.qh);
            jSONObject.put("trans_id", db.emc().replace("-", ""));
            if (ee() != null) {
                com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVarEe = ee();
                jSONObject.put("duration", (int) emcVarEe.ylm.db());
                jSONObject.put("reward_name", emcVarEe.ypw.rig());
                jSONObject.put("reward_amount", emcVarEe.ypw.pe());
                jSONObject.put("network", com.bytedance.sdk.component.utils.sba.xq(emcVarEe.vw));
                JSONObject jSONObjectLdy = emcVarEe.ypw.ldy();
                jSONObjectLdy.put("gaid", com.bytedance.sdk.openadsdk.ul.emc.ypw.emc.emc().ypw());
                jSONObject.put("extra", jSONObjectLdy);
                jSONObject.put("video_duration", emcVarEe.ypw.iat().f6583d);
                String strDg = "unKnow";
                int iNx = emcVarEe.ypw.nx();
                if (iNx == 2) {
                    strDg = tp.ypw();
                } else if (iNx == 1) {
                    strDg = tp.dg();
                }
                jSONObject.put("user_agent", strDg);
            }
            return jSONObject;
        } catch (Throwable th) {
            ul.emc("Scene", "", th);
            return null;
        }
    }

    public boolean wd() {
        return this.ypw;
    }

    public ypw wo() {
        return this.uym;
    }

    public boolean wpn() {
        rie rieVarEmc = this.uym.emc();
        if (rieVarEmc != null) {
            List<rie> listJi = rieVarEmc.ji();
            for (int i = 0; i < listJi.size(); i++) {
                rie rieVar = listJi.get(i);
                if (rieVar != null && rieVar.yz()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean xhi() {
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVarEe;
        sba sbaVar;
        if (vw() || (emcVarEe = ee()) == null || !emcVarEe.ypw.vcl() || (sbaVar = this.xq) == null) {
            return false;
        }
        return sbaVar.emc(emcVarEe.mxo);
    }

    public void xq() {
    }

    public abstract void xq(boolean z6);

    public Activity xxg() {
        return this.uym.msw();
    }

    public void ycc(boolean z6) {
        this.yzg = z6;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void ypw(int i) {
    }

    public void yz() {
        if (this.ycc != null) {
            com.bytedance.sdk.openadsdk.ycc.ypw.emc().emc("videoForceBreak", this.ycc);
        }
        this.uym.uym();
    }

    public void yzg() {
        sba sbaVar = this.xq;
        if (sbaVar != null) {
            sbaVar.msw();
            this.xq = null;
        }
        this.emc = false;
    }

    private void xq(final String str) {
        iyl.xq(new com.bytedance.sdk.component.msw.msw("FullScreen_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.msw.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    msw.this.xq(1).executeFullVideoCallback(msw.this.rie(), str);
                } catch (Throwable th) {
                    ul.xq("Scene", "fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    public void bw(int i) {
        ypw ypwVar = this.uym;
        if (ypwVar != null) {
            ypwVar.emc(i);
        }
    }

    public void dg(final int i) {
        if (!this.uym.sup().getBoolean("reward_verify", false) && !this.uym.vk() && !this.uym.sup().getBoolean("user_has_give_up_reward", false)) {
            this.uym.sup().putBoolean("reward_verify", true);
            if (ee() != null) {
                com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVarEe = ee();
                if (aa.dg().vk(String.valueOf(emcVarEe.ycc))) {
                    emc(true, emcVarEe.ypw.pe(), emcVarEe.ypw.rig(), 0, "", i);
                } else {
                    aa.xq().emc(wad(), new sra.ypw() { // from class: com.bytedance.sdk.openadsdk.activity.msw.7
                        @Override // com.bytedance.sdk.openadsdk.core.sra.ypw
                        public void emc(int i3, String str) {
                            msw.this.emc(false, 0, "", i3, str, i);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.sra.ypw
                        public void emc(rie.ypw ypwVar) {
                            msw.this.emc(ypwVar.ypw, ypwVar.xq.emc(), ypwVar.xq.ypw(), 0, "", i);
                        }
                    });
                }
            }
        }
    }

    public void emc(Activity activity, Bundle bundle) {
    }

    public final void ypw(Activity activity, ypw.bw bwVar) {
        if (this.emc) {
            return;
        }
        this.emc = true;
        emc(activity, bwVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void emc(Bundle bundle) {
    }

    public final IListenerManager xq(int i) {
        if (this.sba == null) {
            this.sba = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.emc.emc().emc(i));
        }
        return this.sba;
    }

    public void emc(msw mswVar, msw mswVar2, ypw.bw bwVar) {
    }

    public void emc(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
    }

    public void ypw(String str) {
        if (c_()) {
            emc(str, false, 0, "", 0, "");
        } else {
            xq(str);
        }
    }

    public void emc(Map<String, Object> map, float f2, float f5) {
    }

    private void emc(vk vkVar) {
        com.bytedance.sdk.openadsdk.common.emc.ypw(new qh.emc(this.zz, "BVA", ylm(), hxp()).emc(b_()).emc(vkVar).emc(dr()).emc());
    }

    public void xq(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        if (tp()) {
            return;
        }
        ypw.bw bwVar = new ypw.bw(8, emcVar);
        bwVar.dg = emcVar.yz;
        ypw ypwVar = this.uym;
        if (ypwVar != null) {
            ypwVar.ypw(this, bwVar);
        }
    }

    public void ypw(Activity activity) {
        if (com.bytedance.sdk.openadsdk.sra.emc.msw() && activity != null && activity.isChangingConfigurations()) {
            ypw ypwVar = this.uym;
            if (ypwVar == null || ypwVar.emc() == null) {
                return;
            }
            ru.emc(this.uym.emc(), "close_interception_config_change", this.uym.emc().bw(), (String) null);
            return;
        }
        Objects.toString(this.uym);
        if (!this.uym.sba() && !wpn()) {
            long jZz = this.uym.emc().zz();
            if (jZz > 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - jZz;
                if (jElapsedRealtime > 0) {
                    this.ycc.ypw(jElapsedRealtime);
                }
            }
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVarEe = ee();
            if (emcVarEe != null) {
                emcVarEe.emc(BackupConstant.CLOSE_NOT_SHOW_ONE_TO_N_CODE, BackupConstant.CLOSE_NOT_SHOW_CODE_MSG, 1004);
                emcVarEe.db.emc();
            }
        }
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            ypw("onAdClose");
        } else {
            this.uym.qh();
        }
    }

    public void emc(boolean z6, boolean z7, boolean z8, int i) {
        this.uym.emc(this, z6, z7, z8, i);
    }

    private void emc(final String str, final boolean z6, final int i, final String str2, final int i3, final String str3) {
        iyl.xq(new com.bytedance.sdk.component.msw.msw("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.msw.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    msw.this.xq(0).executeRewardVideoCallback(msw.this.rie(), str, z6, i, str2, i3, str3);
                } catch (Throwable th) {
                    ul.xq("Scene", "rewarded_video", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    public final void emc(boolean z6, int i, String str, int i3, String str2, int i6) {
        if (this.uym.vk()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.ypw.xq()) {
            emc("onRewardVerify", z6, i, str, i3, str2);
        } else {
            this.uym.emc(this, z6, i, str, i3, str2);
        }
        sup.emc(this.ycc, z6, i6);
    }

    public void emc(com.bytedance.sdk.openadsdk.core.model.rie rieVar, int i, int i3) {
        this.ycc = rieVar;
        this.ru = i;
        this.gbl = i3;
    }

    public void ypw(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        if (emcVar == null) {
            return;
        }
        try {
            int iLt = this.uym.lt();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_countdown_remaining", Math.max(iLt, 0));
            com.bytedance.sdk.openadsdk.dg.xq.bw(this.ycc, emcVar.bw, jSONObject);
        } catch (Throwable unused) {
        }
        xq(emcVar);
    }
}
