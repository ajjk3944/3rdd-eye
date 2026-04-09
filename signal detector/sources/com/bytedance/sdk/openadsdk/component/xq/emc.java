package com.bytedance.sdk.openadsdk.component.xq;

import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.dg.ru;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class emc implements com.bytedance.sdk.openadsdk.emc.xq.ypw {
    private final rie dg;
    private final PAGInterstitialAdInteractionListener emc;
    private final AtomicBoolean ypw = new AtomicBoolean(false);
    private final AtomicBoolean xq = new AtomicBoolean(false);

    public emc(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener, com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
        this.emc = pAGInterstitialAdInteractionListener;
        this.dg = emcVar != null ? emcVar.ycc() : null;
    }

    @Override // com.bytedance.sdk.openadsdk.emc.xq.ypw
    public void emc() {
        ru.emc("show_callback", this.xq.get(), this.ypw.get(), this.dg);
        if (this.ypw.compareAndSet(false, true)) {
            ul.emc("BVA", "full video onAdShow");
            PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.emc;
            if (pAGInterstitialAdInteractionListener != null) {
                pAGInterstitialAdInteractionListener.onAdShowed();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.emc;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.emc.xq.ypw
    public void ypw() {
        ru.emc("close_callback", this.xq.get(), this.ypw.get(), this.dg);
        if (this.xq.compareAndSet(false, true)) {
            ul.emc("BVA", "full video onAdClose");
            PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.emc;
            if (pAGInterstitialAdInteractionListener != null) {
                pAGInterstitialAdInteractionListener.onAdDismissed();
            }
        }
    }
}
