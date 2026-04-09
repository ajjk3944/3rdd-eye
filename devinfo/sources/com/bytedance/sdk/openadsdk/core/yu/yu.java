package com.bytedance.sdk.openadsdk.core.yu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.tc.vt.fkw;
import com.bytedance.sdk.openadsdk.utils.osn;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class yu extends com.bytedance.sdk.openadsdk.core.le.lh {
    private boolean bly;
    protected PAGBannerAdWrapperListener fkw;

    /* renamed from: le, reason: collision with root package name */
    protected String f8543le;

    /* renamed from: lh, reason: collision with root package name */
    protected vpp f8544lh;
    protected final Context ouw;
    private int pno;
    protected boolean ra;
    protected qbp vt;
    protected AdSlot yu;

    public yu(Context context, vpp vppVar, AdSlot adSlot, boolean z3) {
        super(context);
        this.f8543le = "banner_ad";
        this.ra = false;
        this.pno = -1;
        this.bly = false;
        if (vppVar != null && vppVar.rn() != 2) {
            vppVar.yw = 1;
        }
        this.ra = z3;
        this.ouw = context;
        this.f8544lh = vppVar;
        this.yu = adSlot;
        lh();
        AdSlot adSlot2 = this.yu;
        if (adSlot2 != null) {
            ouw(adSlot2.getExpressViewAcceptedWidth(), this.yu.getExpressViewAcceptedHeight());
        }
    }

    public final void fkw() {
        qbp qbpVar = this.vt;
        if (qbpVar != null) {
            qbpVar.ko();
        }
    }

    public qbp getCurView() {
        return this.vt;
    }

    public void lh() {
        qbp qbpVar = new qbp(this.ouw, this.f8544lh, this.yu, this.f8543le) { // from class: com.bytedance.sdk.openadsdk.core.yu.yu.1
            @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
            public final fkw.ouw lh(int i4) {
                return yu.this.ouw(super.lh(i4));
            }
        };
        this.vt = qbpVar;
        addView(qbpVar, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.fkw;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.vt == null) {
            lh();
        }
        com.bytedance.sdk.openadsdk.utils.yu.ouw(this, this.f8544lh);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setCurrentIndex(int i4) {
        this.pno = i4;
    }

    public void setExpressInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.fkw = pAGBannerAdWrapperListener;
        qbp qbpVar = this.vt;
        if (qbpVar != null) {
            qbpVar.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.fkw() { // from class: com.bytedance.sdk.openadsdk.core.yu.yu.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.fkw
                public final void ouw() {
                    yu.this.fkw.onAdClicked();
                }
            });
            this.vt.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.core.yu.yu.3
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public final void onAdClicked() {
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2;
                    vpp vppVar = yu.this.f8544lh;
                    if (vppVar == null || !vppVar.pd() || (pAGBannerAdWrapperListener2 = yu.this.fkw) == null) {
                        return;
                    }
                    pAGBannerAdWrapperListener2.onAdClicked();
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public final void onRenderFail(View view, String str, int i4) {
                    yu yuVar = yu.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = yuVar.fkw;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderFail(yuVar, str, i4);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public final void onRenderSuccess(View view, float f10, float f11) {
                    qbp qbpVar2 = yu.this.vt;
                    if (qbpVar2 != null) {
                        qbpVar2.setSoundMute(true);
                        if (com.bytedance.sdk.openadsdk.core.cf.yu.ouw(yu.this.vt.getDynamicShowType())) {
                            yu yuVar = yu.this;
                            AdSlot adSlot = yuVar.yu;
                            if (adSlot != null) {
                                yuVar.ouw(adSlot.getExpressViewAcceptedWidth(), yu.this.yu.getExpressViewAcceptedHeight());
                            }
                        } else {
                            yu.this.ouw(f10, f11);
                        }
                    }
                    if (yu.this.bly) {
                        yu.this.vt.jg();
                    }
                    yu yuVar2 = yu.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = yuVar2.fkw;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderSuccess(yuVar2, f10, f11);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public final void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public final void onAdShow(View view, int i4) {
                }
            });
        }
    }

    public void setIsShow(boolean z3) {
        this.bly = z3;
    }

    public void yu() {
        if (this.vt != null) {
            com.bytedance.sdk.openadsdk.core.bly.ouw().yu(this.vt.getClosedListenerKey());
            removeView(this.vt);
            this.vt.mwh();
            this.vt = null;
        }
        com.bytedance.sdk.openadsdk.core.bly blyVarOuw = com.bytedance.sdk.openadsdk.core.bly.ouw();
        try {
            if (blyVarOuw.mwh == null || blyVarOuw.mwh.size() != 0) {
                return;
            }
            blyVarOuw.mwh = null;
        } catch (Throwable th2) {
            ko.ouw("TTAD.GlobalInfo", "removeClickCloseListenerObj()", th2.getMessage());
        }
    }

    public final fkw.ouw ouw(fkw.ouw ouwVar) {
        int i4;
        if (this.ra && (i4 = this.pno) >= 0) {
            ouwVar.vt = i4;
        }
        return ouwVar;
    }

    public final void ouw(float f10, float f11) {
        int iOuw = osn.ouw(this.ouw, f10);
        int iOuw2 = osn.ouw(this.ouw, f11);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iOuw, iOuw2);
        }
        layoutParams.width = iOuw;
        layoutParams.height = iOuw2;
        setLayoutParams(layoutParams);
    }
}
