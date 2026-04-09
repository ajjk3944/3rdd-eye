package com.bytedance.sdk.openadsdk.component.reward.emc;

import android.R;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.aa;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.ul;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes.dex */
public class xq {
    private final emc emc;
    private TTAdDislikeToast xq;
    private com.bytedance.sdk.openadsdk.common.aa ypw;

    public xq(emc emcVar) {
        this.emc = emcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dg() {
        TTAdDislikeToast tTAdDislikeToast = this.xq;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean xq() {
        return this.emc.rgy;
    }

    public void emc(com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar) {
        com.bytedance.sdk.openadsdk.activity.msw mswVar;
        if (this.emc.mxo.isFinishing()) {
            return;
        }
        emc emcVar = this.emc;
        com.bytedance.sdk.openadsdk.activity.msw mswVar2 = emcVar.pe;
        boolean z10 = (mswVar2 instanceof com.bytedance.sdk.openadsdk.activity.bw) && ((com.bytedance.sdk.openadsdk.activity.bw) mswVar2).emc;
        if (emcVar.gbl.get() || !((mswVar = this.emc.pe) == null || !mswVar.wo().db() || z10)) {
            if (this.xq == null) {
                this.xq = new TTAdDislikeToast(this.emc.mxo);
                ((FrameLayout) this.emc.mxo.findViewById(R.id.content)).addView(this.xq);
            }
            this.xq.show(TTAdDislikeToast.getDislikeTip());
            this.emc.gbl.set(true);
            return;
        }
        if (this.ypw == null) {
            try {
                ypw(ypwVar);
            } catch (Throwable th) {
                ApmHelper.reportCustomError("initDislike error", "RewardFullDislikeManager", th);
            }
        }
        com.bytedance.sdk.openadsdk.common.aa aaVar = this.ypw;
        if (aaVar != null) {
            aaVar.emc();
        }
    }

    public void ypw() {
        TTAdDislikeToast tTAdDislikeToast = this.xq;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.onDestroy();
        }
    }

    private void ypw(final com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar) {
        if (this.ypw == null) {
            emc emcVar = this.emc;
            com.bytedance.sdk.openadsdk.common.aa aaVar = new com.bytedance.sdk.openadsdk.common.aa(emcVar.mxo, emcVar.ypw);
            this.ypw = aaVar;
            aaVar.setCallback(new aa.emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.xq.1
                @Override // com.bytedance.sdk.openadsdk.common.aa.emc
                public void emc(View view) {
                    xq.this.emc.ru.set(true);
                    String str = "landing_page";
                    if (!ul.ypw(xq.this.emc.ypw) && !ul.dg(xq.this.emc.ypw) && !ul.ycc(xq.this.emc.ypw) && !ul.uym(xq.this.emc.ypw)) {
                        if (!xq.this.emc.zz.get()) {
                            str = "video_player";
                        } else if (dr.ypw(xq.this.emc.ypw)) {
                            str = "playable";
                        } else if (!xq.this.emc.ypw.oa()) {
                            str = CampaignEx.JSON_NATIVE_VIDEO_ENDCARD;
                        }
                    }
                    xq.this.ypw.setDislikeSource(str);
                    if (xq.this.emc.ylm.bw) {
                        if (xq.this.emc.hxp != null) {
                            xq.this.emc.hxp.emc(8, false);
                            return;
                        }
                        return;
                    }
                    ypwVar.qh();
                    if (xq.this.emc.ylm.ycc()) {
                        xq.this.emc.ylm.ylm();
                    }
                    if (xq.this.xq()) {
                        xq.this.emc.pe.wo().ypw(xq.this.emc.pe, 2);
                    }
                    com.bytedance.sdk.openadsdk.ee.emc.xq.emc(xq.this.emc.ypw, 8);
                    xq.this.emc.rie.ycc();
                    xq.this.emc.rie.msw();
                    if (xq.this.emc.nw != null) {
                        xq.this.emc.nw.ypw();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.aa.emc
                public void ypw(View view) {
                    xq.this.emc.ru.set(false);
                    if (xq.this.emc.ylm.bw) {
                        if (xq.this.emc.hxp != null) {
                            xq.this.emc.hxp.emc(0, true);
                            return;
                        }
                        return;
                    }
                    xq.this.emc.ylm.emc(ypwVar);
                    if (xq.this.emc.ylm.zz()) {
                        xq.this.emc.ylm.ul();
                    }
                    if (xq.this.xq()) {
                        xq.this.emc.pe.wo().ypw(xq.this.emc.pe, 1);
                    }
                    com.bytedance.sdk.openadsdk.ee.emc.xq.emc(xq.this.emc.ypw, 4);
                    xq.this.emc.rie.emc(0);
                    xq.this.emc.rie.bw();
                    if (xq.this.emc.nw != null) {
                        xq.this.emc.nw.emc();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.aa.emc
                public void emc(FilterWord filterWord) {
                    if (xq.this.emc.gbl.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    xq.this.emc.gbl.set(true);
                    if (xq.this.emc.pe != null) {
                        xq.this.emc.pe.wo().ypw(true);
                    }
                    xq.this.dg();
                }
            });
            ((FrameLayout) this.emc.mxo.findViewById(R.id.content)).addView(this.ypw);
        }
        if (this.xq == null) {
            this.xq = new TTAdDislikeToast(this.emc.mxo);
            ((FrameLayout) this.emc.mxo.findViewById(R.id.content)).addView(this.xq);
        }
    }

    public void emc() {
        TTAdDislikeToast tTAdDislikeToast = this.xq;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.hide();
        }
    }
}
