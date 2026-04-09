package com.applovin.mediation.rtb;

import android.content.Context;
import bb.e;
import bb.y;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.mediation.AppLovinExtras;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.a;
import com.google.ads.mediation.applovin.f;
import com.google.ads.mediation.applovin.k;
import com.google.ads.mediation.applovin.l;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class AppLovinRtbRewardedRenderer extends k {
    private AppLovinAd appLovinAd;

    public AppLovinRtbRewardedRenderer(e eVar, f fVar, a aVar, l lVar) {
        super(eVar, fVar, aVar, lVar);
    }

    @Override // com.google.ads.mediation.applovin.k, com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        this.appLovinAd = appLovinAd;
        super.adReceived(appLovinAd);
    }

    public void loadAd(y yVar) {
        AppLovinSdk appLovinSdkB = this.appLovinInitializer.b(yVar.f2112d);
        this.appLovinSdk = appLovinSdkB;
        this.appLovinAdFactory.getClass();
        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitialCreate = AppLovinIncentivizedInterstitial.create(appLovinSdkB);
        this.incentivizedInterstitial = appLovinIncentivizedInterstitialCreate;
        appLovinIncentivizedInterstitialCreate.setExtraInfo(AppLovinExtras.Keys.KEY_WATERMARK, yVar.f2114f);
        this.networkExtras = yVar.f2111c;
        this.appLovinSdk.getAdService().loadNextAdForAdToken(yVar.f2109a, this);
    }

    @Override // bb.w
    public void showAd(Context context) {
        this.appLovinSdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.networkExtras));
        this.incentivizedInterstitial.show(this.appLovinAd, context, this, this, this, this);
    }
}
