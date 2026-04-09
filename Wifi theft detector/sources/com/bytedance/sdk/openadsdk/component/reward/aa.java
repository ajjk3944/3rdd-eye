package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.component.reward.qh;

/* loaded from: classes.dex */
public class aa extends emc<PAGRewardedAdLoadListener, TTClientBidding> {
    public aa(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc
    public int ycc() {
        return 6;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc
    public int ypw() {
        return 7;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc
    /* renamed from: ypw, reason: merged with bridge method [inline-methods] */
    public TTClientBidding emc(Context context, com.bytedance.sdk.openadsdk.core.model.emc emcVar, AdSlot adSlot) {
        return new yzg(context, emcVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc
    public void ypw(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof yzg) {
            ((yzg) tTClientBidding).ypw();
        }
    }

    public static aa emc(Context context) {
        return (aa) ul.emc(context, 7);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc
    public qh emc() {
        return qh.emc(this.emc, qh.emc.REWARD_VIDEO);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc
    public Object emc(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof yzg) {
            return ((yzg) tTClientBidding).emc();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc
    public void emc(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, int i10, String str) {
        pAGRewardedAdLoadListener.onError(i10, str);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc
    public void emc(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, Object obj) {
        if (pAGRewardedAdLoadListener == null || obj == null || !(obj instanceof PAGRewardedAd)) {
            return;
        }
        pAGRewardedAdLoadListener.onAdLoaded((PAGRewardedAd) obj);
    }
}
