package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.component.reward.qh;

/* loaded from: classes.dex */
public class uym extends emc<PAGInterstitialAdLoadListener, TTClientBidding> {
    public uym(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc
    public int ycc() {
        return 5;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc
    public int ypw() {
        return 8;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc
    /* renamed from: ypw, reason: merged with bridge method [inline-methods] */
    public TTClientBidding emc(Context context, com.bytedance.sdk.openadsdk.core.model.emc emcVar, AdSlot adSlot) {
        return new sba(context, emcVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc
    public void ypw(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof sba) {
            ((sba) tTClientBidding).ypw();
        }
    }

    public static uym emc(Context context) {
        return (uym) ul.emc(context, 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc
    public qh emc() {
        return qh.emc(this.emc, qh.emc.FULL_SCREEN_VIDEO);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc
    public Object emc(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof sba) {
            return ((sba) tTClientBidding).emc();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc
    public void emc(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, int i10, String str) {
        pAGInterstitialAdLoadListener.onError(i10, str);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc
    public void emc(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, Object obj) {
        if (pAGInterstitialAdLoadListener == null || obj == null || !(obj instanceof PAGInterstitialAd)) {
            return;
        }
        pAGInterstitialAdLoadListener.onAdLoaded((PAGInterstitialAd) obj);
    }
}
