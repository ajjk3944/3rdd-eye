package com.bytedance.sdk.openadsdk.core.dg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.zz.ul;
import com.bytedance.sdk.openadsdk.ee.ypw.bw;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class dg extends com.bytedance.sdk.openadsdk.core.ycc.xq {
    protected PAGBannerAdWrapperListener bw;
    protected AdSlot dg;
    protected final Context emc;
    private int msw;
    protected boolean uym;
    protected rie xq;
    protected String ycc;
    protected ul ypw;
    private boolean zz;

    public dg(Context context, rie rieVar, AdSlot adSlot, boolean z6) {
        super(context);
        this.ycc = "banner_ad";
        this.uym = false;
        this.msw = -1;
        this.zz = false;
        if (rieVar != null && rieVar.yid() != 2) {
            rieVar.yzg(1);
        }
        this.uym = z6;
        this.emc = context;
        this.xq = rieVar;
        this.dg = adSlot;
        xq();
        AdSlot adSlot2 = this.dg;
        if (adSlot2 != null) {
            emc(adSlot2.getExpressViewAcceptedWidth(), this.dg.getExpressViewAcceptedHeight());
        }
    }

    public void bw() {
        ul ulVar = this.ypw;
        if (ulVar != null) {
            ulVar.yzg();
        }
    }

    public void dg() {
        if (this.ypw != null) {
            com.bytedance.sdk.openadsdk.core.zz.ypw().ycc(this.ypw.getClosedListenerKey());
            removeView(this.ypw);
            this.ypw.sup();
            this.ypw = null;
        }
        com.bytedance.sdk.openadsdk.core.zz.ypw().ylm();
    }

    public ul getCurView() {
        return this.ypw;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.ypw == null) {
            xq();
        }
        com.bytedance.sdk.openadsdk.utils.dg.emc(this, this.xq);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setCurrentIndex(int i) {
        this.msw = i;
    }

    public void setExpressInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.bw = pAGBannerAdWrapperListener;
        ul ulVar = this.ypw;
        if (ulVar != null) {
            ulVar.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.bw() { // from class: com.bytedance.sdk.openadsdk.core.dg.dg.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.bw
                public void emc() {
                    dg.this.bw.onAdClicked();
                }
            });
            this.ypw.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.core.dg.dg.3
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2;
                    rie rieVar = dg.this.xq;
                    if (rieVar == null || !rieVar.yvi() || (pAGBannerAdWrapperListener2 = dg.this.bw) == null) {
                        return;
                    }
                    pAGBannerAdWrapperListener2.onAdClicked();
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view, int i) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view, String str, int i) {
                    dg dgVar = dg.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = dgVar.bw;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderFail(dgVar, str, i);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f2, float f5) {
                    ul ulVar2 = dg.this.ypw;
                    if (ulVar2 != null) {
                        ulVar2.setSoundMute(true);
                        if (com.bytedance.sdk.openadsdk.core.gbl.bw.emc(dg.this.ypw.getDynamicShowType())) {
                            dg dgVar = dg.this;
                            AdSlot adSlot = dgVar.dg;
                            if (adSlot != null) {
                                dgVar.emc(adSlot.getExpressViewAcceptedWidth(), dg.this.dg.getExpressViewAcceptedHeight());
                            }
                        } else {
                            dg.this.emc(f2, f5);
                        }
                    }
                    if (dg.this.zz) {
                        dg.this.ypw.sba();
                    }
                    dg dgVar2 = dg.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = dgVar2.bw;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderSuccess(dgVar2, f2, f5);
                    }
                }
            });
        }
    }

    public void setIsShow(boolean z6) {
        this.zz = z6;
    }

    public void xq() {
        ul ulVar = new ul(this.emc, this.xq, this.dg, this.ycc) { // from class: com.bytedance.sdk.openadsdk.core.dg.dg.1
            @Override // com.bytedance.sdk.openadsdk.core.zz.ul
            public bw.emc xq(int i) {
                return dg.this.emc(super.xq(i));
            }
        };
        this.ypw = ulVar;
        addView(ulVar, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.bw;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
    }

    public bw.emc emc(bw.emc emcVar) {
        int i;
        if (this.uym && (i = this.msw) >= 0) {
            emcVar.ypw = i;
        }
        return emcVar;
    }

    public void emc(float f2, float f5) {
        int iYpw = vw.ypw(this.emc, f2);
        int iYpw2 = vw.ypw(this.emc, f5);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iYpw, iYpw2);
        }
        layoutParams.width = iYpw;
        layoutParams.height = iYpw2;
        setLayoutParams(layoutParams);
    }
}
