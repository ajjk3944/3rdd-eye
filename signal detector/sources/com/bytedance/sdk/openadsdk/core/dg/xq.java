package com.bytedance.sdk.openadsdk.core.dg;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.zz.ul;
import com.bytedance.sdk.openadsdk.core.zz.yzg;
import com.bytedance.sdk.openadsdk.ee.ypw.bw;

/* loaded from: classes.dex */
public class xq extends dg {
    private com.bytedance.sdk.openadsdk.emc.emc.ypw msw;
    private int ru;
    private int zz;

    public xq(Context context, rie rieVar, AdSlot adSlot, boolean z6) {
        super(context, rieVar, adSlot, z6);
        this.zz = 1;
        this.ru = -1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.dg.dg
    public void dg() {
        com.bytedance.sdk.openadsdk.core.sz.ypw.xq videoController;
        ul ulVar = this.ypw;
        if ((ulVar instanceof yzg) && (videoController = ((yzg) ulVar).getVideoController()) != null) {
            this.zz = videoController.vw();
        }
        super.dg();
    }

    public com.bytedance.sdk.openadsdk.multipro.ypw.emc getVideoModel() {
        ul ulVar = this.ypw;
        if (ulVar != null) {
            return ((yzg) ulVar).getVideoModel();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.dg.dg
    public void xq() {
        yzg yzgVar = new yzg(this.emc, this.xq, this.dg, this.ycc, this.uym) { // from class: com.bytedance.sdk.openadsdk.core.dg.xq.1
            @Override // com.bytedance.sdk.openadsdk.core.zz.ul
            public bw.emc xq(int i) {
                return xq.this.emc(super.xq(i));
            }
        };
        this.ypw = yzgVar;
        com.bytedance.sdk.openadsdk.core.sz.ypw.xq videoController = yzgVar.getVideoController();
        if (videoController != null) {
            videoController.dg(this.zz);
        }
        addView(this.ypw, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.bw;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
        ul ulVar = this.ypw;
        if (ulVar != null) {
            ((yzg) ulVar).setVideoAdListener(new com.bytedance.sdk.openadsdk.emc.ypw.xq() { // from class: com.bytedance.sdk.openadsdk.core.dg.xq.2
                @Override // com.bytedance.sdk.openadsdk.emc.ypw.xq
                public void emc(int i, int i3) {
                }

                @Override // com.bytedance.sdk.openadsdk.emc.ypw.xq
                public void xq(PAGNativeAd pAGNativeAd) {
                    if (xq.this.msw != null) {
                        xq.this.msw.emc();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.emc.ypw.xq
                public void ypw(PAGNativeAd pAGNativeAd) {
                }

                @Override // com.bytedance.sdk.openadsdk.emc.ypw.xq
                public void emc(PAGNativeAd pAGNativeAd) {
                    if (xq.this.ru == 3) {
                        xq xqVar = xq.this;
                        xqVar.emc(xqVar.msw);
                    } else if (xq.this.ru == 2) {
                        xq.this.emc();
                    }
                }
            });
        }
    }

    public void emc(com.bytedance.sdk.openadsdk.emc.emc.ypw ypwVar) {
        ul ulVar = this.ypw;
        if (ulVar != null) {
            ((yzg) ulVar).vk();
            this.msw = ypwVar;
            this.ru = 3;
        }
    }

    public void ypw() {
        ul ulVar = this.ypw;
        if (ulVar != null) {
            ((yzg) ulVar).aa();
        }
    }

    public void emc() {
        ul ulVar = this.ypw;
        if (ulVar != null) {
            ((yzg) ulVar).cf();
            this.ru = 2;
        }
    }
}
