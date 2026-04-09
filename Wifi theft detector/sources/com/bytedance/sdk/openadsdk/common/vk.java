package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.component.utils.rie;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.widget.ypw;

/* loaded from: classes.dex */
public abstract class vk {
    protected String bw;
    protected String dg;
    protected final com.bytedance.sdk.openadsdk.component.reward.emc.emc uym;
    protected String xq;
    protected String ycc;
    protected String ypw;

    public vk(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        this.uym = emcVar;
        bw();
    }

    private void bw() {
        if (this.ypw != null) {
            return;
        }
        try {
            this.ypw = rie.emc(this.uym.vw, "tt_reward_msg");
            this.xq = rie.emc(this.uym.vw, "tt_msgPlayable");
            this.ycc = rie.emc(this.uym.vw, "tt_negtiveBtnBtnText");
            this.dg = rie.emc(this.uym.vw, "tt_postiveBtnText");
            this.bw = rie.emc(this.uym.vw, "tt_postiveBtnTextPlayable");
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.xq("RewardTipDialogHelper", "init res text failed：" + th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean msw() {
        if (!dr.msw(this.uym.ypw)) {
            return false;
        }
        this.uym.rie.zz();
        return true;
    }

    private boolean uym() {
        return com.bytedance.sdk.openadsdk.core.aa.dg().msw(String.valueOf(this.uym.ycc));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xq(boolean z10) {
        this.uym.ylm.ul();
        if (z10) {
            this.uym.rie.emc(1000);
        }
        this.uym.f9273aa.set(false);
    }

    private boolean ycc() {
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.uym;
        return !emcVar.wbn && emcVar.zz.get();
    }

    private boolean ypw(boolean z10, boolean z11, Runnable runnable) {
        if ((z10 || !ycc() || !msw()) && runnable == null) {
            if (z11) {
                xq();
                return true;
            }
            dg();
        }
        return false;
    }

    private boolean zz() {
        return !this.uym.ypw.wpn() && dr.msw(this.uym.ypw) && this.uym.xmt.msw().getVisibility() == 0;
    }

    public void dg() {
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.uym;
        if (emcVar == null) {
            com.bytedance.sdk.component.utils.ul.xq("execSkipTaskBaseImpl adContext is null", new Object[0]);
            return;
        }
        com.bytedance.sdk.openadsdk.activity.msw mswVar = emcVar.pe;
        if (mswVar == null || !(mswVar instanceof com.bytedance.sdk.openadsdk.activity.bw)) {
            emcVar.ylm.xmt();
            emc.emc(this.uym);
            emc(this.uym);
        } else {
            if (((com.bytedance.sdk.openadsdk.activity.bw) mswVar).msw()) {
                return;
            }
            xq();
        }
    }

    public abstract void emc(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar);

    public abstract void emc(boolean z10);

    public abstract boolean emc();

    public abstract void xq();

    public abstract boolean ypw();

    public final boolean emc(boolean z10, boolean z11, Runnable runnable) {
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.uym;
        if (emcVar.pe instanceof com.bytedance.sdk.openadsdk.activity.bw) {
            if (!emcVar.dg || ypw() || (this.uym.pe.wo() != null && this.uym.pe.wo().vk())) {
                return false;
            }
            if (!z11 && emc()) {
                return false;
            }
            if (!uym()) {
                if (!z11) {
                    return false;
                }
                if (runnable == null && z10) {
                    xq();
                    return true;
                }
            }
        } else {
            if (emc(z11, runnable)) {
                return false;
            }
            if (!uym()) {
                return ypw(z11, z10, runnable);
            }
            if (ypw()) {
                ypw(z10, runnable);
                return false;
            }
            if (zz()) {
                this.uym.rie.zz();
                return false;
            }
        }
        xq(z10, runnable);
        return true;
    }

    private void xq(final boolean z10, final Runnable runnable) {
        ypw(z10);
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.uym;
        if (emcVar != null && !emcVar.mxo.isFinishing() && !this.uym.mxo.isDestroyed()) {
            final com.bytedance.sdk.openadsdk.core.widget.ypw ypwVar = new com.bytedance.sdk.openadsdk.core.widget.ypw(this.uym.mxo);
            com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar2 = this.uym.cn;
            if (ypwVar2 == null) {
                com.bytedance.sdk.component.utils.ul.xq("RewardTipDialogHelper", "adContext or  adType == null");
                return;
            }
            ypwVar2.sup = ypwVar;
            if (z10) {
                ypwVar.emc(this.xq).ypw(this.bw).xq(this.ycc);
            } else {
                ypwVar.emc(this.ypw).ypw(this.dg).xq(this.ycc);
            }
            ypwVar.emc(new ypw.InterfaceC0165ypw() { // from class: com.bytedance.sdk.openadsdk.common.vk.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.ypw.InterfaceC0165ypw
                public void emc() {
                    vk.this.xq(z10);
                    ypwVar.dismiss();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.ypw.InterfaceC0165ypw
                public void ypw() {
                    ypwVar.dismiss();
                    vk.this.emc(true);
                    vk.this.uym.f9273aa.set(false);
                    vk.this.uym.rie.ypw(Integer.MAX_VALUE);
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    if (!z10) {
                        vk.this.dg();
                        return;
                    }
                    vk vkVar = vk.this;
                    if (vkVar.uym.wbn || !vkVar.msw()) {
                        vk.this.uym.db.ycc();
                        vk.this.xq();
                    }
                }
            }).show();
            return;
        }
        com.bytedance.sdk.component.utils.ul.xq("RewardTipDialogHelper", "adContext or activity is null");
    }

    private void ypw(boolean z10, Runnable runnable) {
        if (!(ycc() && msw()) && runnable == null) {
            if (z10) {
                xq();
            } else {
                dg();
            }
        }
    }

    private void ypw(boolean z10) {
        this.uym.ylm.ylm();
        if (z10) {
            this.uym.rie.ycc();
        }
        this.uym.f9273aa.set(true);
    }

    private boolean emc(boolean z10, Runnable runnable) {
        if (z10 || !emc()) {
            return false;
        }
        if (!this.uym.wbn) {
            if (ycc()) {
                return msw();
            }
            return false;
        }
        if (runnable != null) {
            return true;
        }
        dg();
        return true;
    }
}
