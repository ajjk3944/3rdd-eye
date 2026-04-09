package com.google.ads.mediation.applovin;

import android.util.Log;
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
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.util.Map;

/* compiled from: AppLovinRewardedRenderer.java */
/* loaded from: classes.dex */
public abstract class f implements MediationRewardedAd, AppLovinAdLoadListener, AppLovinAdRewardListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener {
    protected static final String ERROR_MSG_AD_NOT_READY = "Ad not ready to show.";
    protected static final String ERROR_MSG_MULTIPLE_REWARDED_AD = "Cannot load multiple rewarded ads with the same Zone ID. Let the first ad finish loading before attempting to load another.";
    protected static final String TAG = "f";
    protected final MediationRewardedAdConfiguration adConfiguration;
    protected final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> adLoadCallback;
    protected final com.google.ads.mediation.applovin.a appLovinAdFactory;
    protected final d appLovinInitializer;
    protected AppLovinSdk appLovinSdk;
    protected final g appLovinSdkUtilsWrapper;
    protected AppLovinIncentivizedInterstitial incentivizedInterstitial;
    protected MediationRewardedAdCallback rewardedAdCallback;

    /* compiled from: AppLovinRewardedRenderer.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f fVar = f.this;
            fVar.rewardedAdCallback = fVar.adLoadCallback.onSuccess(fVar);
        }
    }

    /* compiled from: AppLovinRewardedRenderer.java */
    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdError f22405b;

        public b(AdError adError) {
            this.f22405b = adError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f.this.adLoadCallback.onFailure(this.f22405b);
        }
    }

    public f(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, d dVar, com.google.ads.mediation.applovin.a aVar, g gVar) {
        this.adConfiguration = mediationRewardedAdConfiguration;
        this.adLoadCallback = mediationAdLoadCallback;
        this.appLovinInitializer = dVar;
        this.appLovinAdFactory = aVar;
        this.appLovinSdkUtilsWrapper = gVar;
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(AppLovinAd appLovinAd) {
        Log.d(TAG, "Rewarded video clicked.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(AppLovinAd appLovinAd) {
        Log.d(TAG, "Rewarded video displayed.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback == null) {
            return;
        }
        mediationRewardedAdCallback.onAdOpened();
        this.rewardedAdCallback.reportAdImpression();
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        Log.d(TAG, "Rewarded video dismissed.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    public void adReceived(AppLovinAd appLovinAd) {
        Log.i(TAG, "Rewarded video did load ad.");
        g gVar = this.appLovinSdkUtilsWrapper;
        a aVar = new a();
        gVar.getClass();
        AppLovinSdkUtils.runOnUiThread(aVar);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        AdError adError = AppLovinUtils.getAdError(i);
        Log.w(TAG, adError.toString());
        g gVar = this.appLovinSdkUtilsWrapper;
        b bVar = new b(adError);
        gVar.getClass();
        AppLovinSdkUtils.runOnUiThread(bVar);
    }

    public abstract void loadAd();

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
        int i = (int) Double.parseDouble(map.get(AppLovinEventParameters.REVENUE_AMOUNT));
        Log.d(TAG, "Rewarded " + i + " " + str);
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
        Log.e(TAG, "Rewarded video validation request for ad failed with error code: " + i);
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackBegan(AppLovinAd appLovinAd) {
        Log.d(TAG, "Rewarded video playback began.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoStart();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
        Log.d(TAG, "Rewarded video playback ended at playback percent: " + d10 + "%.");
        MediationRewardedAdCallback mediationRewardedAdCallback = this.rewardedAdCallback;
        if (mediationRewardedAdCallback == null || !z10) {
            return;
        }
        mediationRewardedAdCallback.onUserEarnedReward();
        this.rewardedAdCallback.onVideoComplete();
    }
}
