package com.applovin.mediation.rtb;

import android.content.Context;
import bb.e;
import bb.r;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.mediation.AppLovinExtras;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.a;
import com.google.ads.mediation.applovin.f;
import com.google.ads.mediation.applovin.g;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class AppLovinRtbInterstitialRenderer extends g {
    private AppLovinInterstitialAdDialog interstitialAd;
    private AppLovinSdk sdk;

    public AppLovinRtbInterstitialRenderer(e eVar, f fVar, a aVar) {
        super(eVar, fVar, aVar);
    }

    public void loadAd(r rVar) {
        AppLovinSdk appLovinSdkB = this.appLovinInitializer.b(rVar.f2112d);
        this.sdk = appLovinSdkB;
        a aVar = this.appLovinAdFactory;
        Context context = rVar.f2112d;
        aVar.getClass();
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(appLovinSdkB, context);
        this.interstitialAd = appLovinInterstitialAdDialogCreate;
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(this);
        this.interstitialAd.setAdClickListener(this);
        this.interstitialAd.setAdVideoPlaybackListener(this);
        this.interstitialAd.setExtraInfo(AppLovinExtras.Keys.KEY_WATERMARK, rVar.f2114f);
        this.networkExtras = rVar.f2111c;
        this.sdk.getAdService().loadNextAdForAdToken(rVar.f2109a, this);
    }

    @Override // bb.p
    public void showAd(Context context) {
        this.sdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.networkExtras));
        this.interstitialAd.showAndRender(this.appLovinInterstitialAd);
    }
}
