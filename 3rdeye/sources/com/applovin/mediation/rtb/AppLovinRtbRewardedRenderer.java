package com.applovin.mediation.rtb;

import android.content.Context;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.mediation.AppLovinExtras;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.a;
import com.google.ads.mediation.applovin.d;
import com.google.ads.mediation.applovin.f;
import com.google.ads.mediation.applovin.g;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;

/* loaded from: classes.dex */
public final class AppLovinRtbRewardedRenderer extends f {
    private AppLovinAd appLovinAd;

    public AppLovinRtbRewardedRenderer(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, d dVar, a aVar, g gVar) {
        super(mediationRewardedAdConfiguration, mediationAdLoadCallback, dVar, aVar, gVar);
    }

    @Override // com.google.ads.mediation.applovin.f, com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        this.appLovinAd = appLovinAd;
        super.adReceived(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.f
    public void loadAd() {
        AppLovinSdk appLovinSdkC = this.appLovinInitializer.c(this.adConfiguration.getContext());
        this.appLovinSdk = appLovinSdkC;
        this.appLovinAdFactory.getClass();
        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitialCreate = AppLovinIncentivizedInterstitial.create(appLovinSdkC);
        this.incentivizedInterstitial = appLovinIncentivizedInterstitialCreate;
        appLovinIncentivizedInterstitialCreate.setExtraInfo(AppLovinExtras.Keys.KEY_WATERMARK, this.adConfiguration.getWatermark());
        this.appLovinSdk.getAdService().loadNextAdForAdToken(this.adConfiguration.getBidResponse(), this);
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        this.appLovinSdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.adConfiguration.getMediationExtras()));
        this.incentivizedInterstitial.show(this.appLovinAd, context, this, this, this, this);
    }
}
