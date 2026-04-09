package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.xq.ypw;
import com.bytedance.sdk.openadsdk.core.zz.msw;
import com.bytedance.sdk.openadsdk.core.zz.ul;
import com.bytedance.sdk.openadsdk.core.zz.zz;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw extends xq {
    private boolean cf;
    private com.bytedance.sdk.openadsdk.component.zz.ypw qh;
    private final com.bytedance.sdk.openadsdk.component.ycc.ypw sz;

    public ypw(Activity activity, rie rieVar, FrameLayout frameLayout, emc emcVar, int i10, boolean z10, com.bytedance.sdk.openadsdk.component.msw.emc emcVar2, com.bytedance.sdk.openadsdk.component.ycc.ypw ypwVar) {
        super(activity, rieVar, frameLayout, emcVar, i10, z10, emcVar2);
        this.sz = ypwVar;
    }

    @Override // com.bytedance.sdk.openadsdk.component.xq
    public void bw() {
        com.bytedance.sdk.openadsdk.component.zz.ypw ypwVar = this.qh;
        if (ypwVar != null) {
            ypwVar.sba();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.xq
    public int dg() {
        return this.qh.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.component.xq
    public void xq() {
        super.xq();
        com.bytedance.sdk.openadsdk.component.zz.ypw ypwVar = this.qh;
        if (ypwVar != null) {
            ypwVar.sup();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.xq
    public void ypw() {
        this.qh.yzg();
    }

    @Override // com.bytedance.sdk.openadsdk.component.xq
    public void emc(ViewGroup viewGroup) {
        Pair<Float, Float> pairEmc = com.bytedance.sdk.openadsdk.core.zz.emc.emc.emc(this.emc.getWindow(), this.uym);
        com.bytedance.sdk.openadsdk.component.zz.ypw ypwVar = new com.bytedance.sdk.openadsdk.component.zz.ypw(this.emc, this.ypw, new AdSlot.Builder().setCodeId(String.valueOf(this.ypw.tx())).setExpressViewAcceptedSize(((Float) pairEmc.first).floatValue(), ((Float) pairEmc.second).floatValue()).build(), "open_ad", this.bw, this.sz, this.sup);
        this.qh = ypwVar;
        ypwVar.setTopListener(this.bw);
        this.qh.setExpressVideoListenerProxy(this.bw);
        this.qh.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.ypw.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i10) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i10) {
                ypw.this.bw.dg();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f10, float f11) {
                if (ypw.this.qh.ylm()) {
                    ypw.this.cf = true;
                    ypw ypwVar2 = ypw.this;
                    ypw.super.emc((ViewGroup) ypwVar2.dg);
                    ypw.super.emc();
                    ypw.super.ypw();
                    return;
                }
                if (ypw.this.ypw.xmt()) {
                    ypw.this.bw.xq();
                    return;
                }
                ypw ypwVar3 = ypw.this;
                if (!ypwVar3.xq) {
                    ypwVar3.bw.xq();
                } else if (!ypwVar3.emc(ypwVar3.qh.getVideoFrameLayout())) {
                    ypw.this.bw.dg();
                } else {
                    ypw.this.qh.setVideoManager(ypw.this.uym());
                    ypw.this.bw.xq();
                }
            }
        });
        this.ypw.yzg(1);
        this.dg.addView(this.qh, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.bytedance.sdk.openadsdk.component.xq
    public void emc() {
        zz zzVarEmc = com.bytedance.sdk.openadsdk.component.emc.ypw.emc(this.ypw, this.emc, this.sup, this.qh);
        zzVarEmc.emc(new ypw.emc() { // from class: com.bytedance.sdk.openadsdk.component.ypw.2
            @Override // com.bytedance.sdk.openadsdk.core.xq.ypw.emc
            public void emc(View view, int i10) {
                ypw.this.bw.bw();
            }
        });
        this.qh.setClickListener(zzVarEmc);
        msw mswVarYpw = com.bytedance.sdk.openadsdk.component.emc.ypw.ypw(this.ypw, this.emc, this.sup, this.qh);
        this.qh.setClickCreativeListener(mswVarYpw);
        mswVarYpw.emc(new ypw.emc() { // from class: com.bytedance.sdk.openadsdk.component.ypw.3
            @Override // com.bytedance.sdk.openadsdk.core.xq.ypw.emc
            public void emc(View view, int i10) {
                ypw.this.bw.bw();
            }
        });
        this.qh.setBackupListener(new com.bytedance.sdk.component.adexpress.ypw.xq() { // from class: com.bytedance.sdk.openadsdk.component.ypw.4
            @Override // com.bytedance.sdk.component.adexpress.ypw.xq
            public boolean emc(ViewGroup viewGroup, int i10) {
                StringBuilder sb = new StringBuilder("isUseBackup() called with: view = [");
                sb.append(viewGroup);
                sb.append("], errCode = [");
                sb.append(i10);
                sb.append("]");
                try {
                    ((ul) viewGroup).ul();
                    new com.bytedance.sdk.openadsdk.component.zz.emc(ypw.this.emc).emc((ul) ypw.this.qh);
                    return true;
                } catch (Exception e10) {
                    Log.e("AppOpenAdExpressManager", "", e10);
                    return false;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.component.xq
    public void emc(int i10, boolean z10) throws NumberFormatException {
        super.emc(i10, z10);
        com.bytedance.sdk.openadsdk.component.zz.ypw ypwVar = this.qh;
        if (ypwVar != null) {
            ypwVar.setTime(String.valueOf(i10), (int) (this.sup.xq() / 1000), i10, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.xq
    public JSONObject emc(JSONObject jSONObject) {
        return this.qh.emc(jSONObject, this.ypw);
    }

    public void emc(long j10, long j11) {
        com.bytedance.sdk.openadsdk.component.zz.ypw ypwVar = this.qh;
        if (ypwVar != null) {
            ypwVar.emc(j10, j11);
        }
    }
}
