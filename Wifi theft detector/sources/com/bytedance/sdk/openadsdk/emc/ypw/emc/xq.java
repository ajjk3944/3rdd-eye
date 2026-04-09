package com.bytedance.sdk.openadsdk.emc.ypw.emc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.core.gbl.bw;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.zz.ul;
import com.bytedance.sdk.openadsdk.core.zz.yzg;
import com.bytedance.sdk.openadsdk.emc.ypw.msw;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class xq extends msw {
    protected String gbl;
    protected final Context msw;
    protected ul ru;
    private boolean sup;
    protected AdSlot zz;

    public xq(@NonNull Context context, rie rieVar, AdSlot adSlot) {
        super(context, rieVar, 5, true);
        this.gbl = "embeded_ad";
        this.sup = false;
        this.ypw.yzg(1);
        this.dg.emc(this);
        this.msw = context;
        this.zz = adSlot;
        emc();
        ypw();
    }

    private void ypw() {
        ul ulVar = this.ru;
        if (ulVar != null) {
            ulVar.setBackupListener(new com.bytedance.sdk.component.adexpress.ypw.xq() { // from class: com.bytedance.sdk.openadsdk.emc.ypw.emc.xq.1
                @Override // com.bytedance.sdk.component.adexpress.ypw.xq
                public boolean emc(ViewGroup viewGroup, int i10) {
                    emc emcVar = new emc(xq.this.ru.getContext());
                    emcVar.setExtraFuncationHelper(((msw) xq.this).dg);
                    emcVar.emc(xq.this.ru);
                    return true;
                }
            });
        }
    }

    public void bw() {
        ul ulVar = this.ru;
        if (ulVar != null) {
            ulVar.yzg();
        }
    }

    public ul dg() {
        return this.ru;
    }

    public void xq() {
        ul ulVar = this.ru;
        if (ulVar != null) {
            ulVar.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.emc.ypw.emc.xq.2
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
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f10, float f11) {
                    if (!xq.this.ru.ylm()) {
                        xq.this.emc(f10, f11);
                        if (xq.this.sup) {
                            xq.this.ru.sba();
                            return;
                        }
                        return;
                    }
                    xq xqVar = xq.this;
                    Context context = xqVar.msw;
                    rie rieVar = ((msw) xqVar).ypw;
                    xq xqVar2 = xq.this;
                    com.bytedance.sdk.openadsdk.emc.ypw.ypw ypwVar = new com.bytedance.sdk.openadsdk.emc.ypw.ypw(context, rieVar, 5, xqVar2.zz, ((msw) xqVar2).dg, ((msw) xq.this).emc);
                    xq xqVar3 = xq.this;
                    if (xqVar3 instanceof ypw) {
                        ypwVar.emc(((yzg) xqVar3.dg()).getVideoAdListener());
                    }
                    ((msw) xq.this).dg.emc((com.bytedance.sdk.openadsdk.core.xq.emc) xq.this.ru.getClickCreativeListener());
                    PAGMediaView pAGMediaViewZz = ((msw) xq.this).dg.zz();
                    if (pAGMediaViewZz == null) {
                        pAGMediaViewZz = new PAGMediaView(xq.this.msw);
                    }
                    xq.this.ru.addView(pAGMediaViewZz);
                }
            });
        }
    }

    public void emc() {
        this.ru = new ul(this.msw, this.ypw, this.zz, this.gbl);
        xq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(float f10, float f11) {
        ul ulVar = this.ru;
        if (ulVar != null && bw.emc(ulVar.getDynamicShowType())) {
            ViewGroup.LayoutParams layoutParams = this.ru.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            } else {
                layoutParams.width = -1;
                layoutParams.height = -1;
            }
            this.ru.setLayoutParams(layoutParams);
            return;
        }
        int iYpw = vw.ypw(this.msw, f10);
        int iYpw2 = vw.ypw(this.msw, f11);
        ViewGroup.LayoutParams layoutParams2 = this.ru.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new ViewGroup.LayoutParams(iYpw, iYpw2);
        } else {
            layoutParams2.width = iYpw;
            layoutParams2.height = iYpw2;
        }
        this.ru.setLayoutParams(layoutParams2);
    }

    public void emc(boolean z10) {
        this.sup = z10;
    }
}
