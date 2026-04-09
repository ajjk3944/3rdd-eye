package com.bytedance.sdk.openadsdk.api.reward;

import android.app.Activity;
import com.bytedance.sdk.openadsdk.api.PAGClientBidding;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.common.le;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class PAGRewardedAd implements PAGClientBidding, PangleAd {
    public static void loadAd(String str, PAGRewardedRequest pAGRewardedRequest, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        ISDKTypeFactory iSDKTypeFactoryOuw = le.ouw(pAGRewardedAdLoadListener);
        if (iSDKTypeFactoryOuw != null) {
            iSDKTypeFactoryOuw.createADTypeLoaderFactory(str).createRewardAdLoader().loadAd(str, pAGRewardedRequest, pAGRewardedAdLoadListener);
        }
    }

    public abstract void setAdInteractionCallback(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback);

    public abstract void setAdInteractionListener(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener);

    public abstract void show(Activity activity);

    public static void loadAd(String str, PAGRewardedRequest pAGRewardedRequest, final PAGRewardedAdLoadCallback pAGRewardedAdLoadCallback) {
        loadAd(str, pAGRewardedRequest, new PAGRewardedAdLoadListener() { // from class: com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
            public final void onError(int i4, String str2) {
                pAGRewardedAdLoadCallback.onError(new PAGErrorModel(i4, str2));
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public final void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
                pAGRewardedAdLoadCallback.onAdLoaded(pAGRewardedAd);
            }
        });
    }
}
