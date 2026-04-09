package com.google.ads.mediation.applovin;

import android.os.Bundle;
import android.util.Log;
import bb.w;
import bb.x;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class k implements w, AppLovinAdLoadListener, AppLovinAdRewardListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener {
    protected static final String ERROR_MSG_AD_NOT_READY = "Ad not ready to show.";
    protected static final String ERROR_MSG_MULTIPLE_REWARDED_AD = "Cannot load multiple rewarded ads with the same Zone ID. Let the first ad finish loading before attempting to load another.";
    protected static final String TAG = "k";
    protected final bb.e adLoadCallback;
    protected final a appLovinAdFactory;
    protected final f appLovinInitializer;
    protected AppLovinSdk appLovinSdk;
    protected final l appLovinSdkUtilsWrapper;
    protected AppLovinIncentivizedInterstitial incentivizedInterstitial;
    protected Bundle networkExtras;
    protected x rewardedAdCallback;

    public k(bb.e eVar, f fVar, a aVar, l lVar) {
        this.adLoadCallback = eVar;
        this.appLovinInitializer = fVar;
        this.appLovinAdFactory = aVar;
        this.appLovinSdkUtilsWrapper = lVar;
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(AppLovinAd appLovinAd) {
        Log.d(TAG, "Rewarded video clicked.");
        x xVar = this.rewardedAdCallback;
        if (xVar != null) {
            xVar.h();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(AppLovinAd appLovinAd) {
        Log.d(TAG, "Rewarded video displayed.");
        x xVar = this.rewardedAdCallback;
        if (xVar == null) {
            return;
        }
        xVar.e();
        this.rewardedAdCallback.g();
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        Log.d(TAG, "Rewarded video dismissed.");
        x xVar = this.rewardedAdCallback;
        if (xVar != null) {
            xVar.onAdClosed();
        }
    }

    public void adReceived(AppLovinAd appLovinAd) {
        Log.i(TAG, "Rewarded video did load ad.");
        l lVar = this.appLovinSdkUtilsWrapper;
        i iVar = new i(this);
        lVar.getClass();
        AppLovinSdkUtils.runOnUiThread(iVar);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i4) {
        pa.a adError = AppLovinUtils.getAdError(i4);
        Log.w(TAG, adError.toString());
        l lVar = this.appLovinSdkUtilsWrapper;
        j jVar = new j(this, adError);
        lVar.getClass();
        AppLovinSdkUtils.runOnUiThread(jVar);
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
        Log.e(TAG, "Rewarded video validation request for ad did exceed quota with response: " + map);
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
        Log.e(TAG, "Rewarded video validation request was rejected with response: " + map);
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
        String str = map.get(AppLovinEventParameters.REVENUE_CURRENCY);
        int i4 = (int) Double.parseDouble(map.get(AppLovinEventParameters.REVENUE_AMOUNT));
        Log.d(TAG, "Rewarded " + i4 + " " + str);
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void validationRequestFailed(AppLovinAd appLovinAd, int i4) {
        Log.e(TAG, "Rewarded video validation request for ad failed with error code: " + i4);
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackBegan(AppLovinAd appLovinAd) {
        Log.d(TAG, "Rewarded video playback began.");
        x xVar = this.rewardedAdCallback;
        if (xVar != null) {
            xVar.f();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z3) {
        Log.d(TAG, "Rewarded video playback ended at playback percent: " + d10 + "%.");
        x xVar = this.rewardedAdCallback;
        if (xVar == null || !z3) {
            return;
        }
        xVar.d();
        this.rewardedAdCallback.c();
    }
}
