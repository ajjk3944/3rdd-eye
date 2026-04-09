package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.d;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* loaded from: classes.dex */
public class c implements MediationBannerAd, AppLovinAdLoadListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdViewEventListener {

    /* renamed from: h, reason: collision with root package name */
    public static final String f9470h = "c";

    /* renamed from: a, reason: collision with root package name */
    public b f9471a;

    /* renamed from: b, reason: collision with root package name */
    public AppLovinSdk f9472b;

    /* renamed from: c, reason: collision with root package name */
    public String f9473c;

    /* renamed from: d, reason: collision with root package name */
    public final d f9474d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.ads.mediation.applovin.a f9475e;

    /* renamed from: f, reason: collision with root package name */
    public final MediationAdLoadCallback f9476f;

    /* renamed from: g, reason: collision with root package name */
    public MediationBannerAdCallback f9477g;

    public class a implements d.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f9478a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f9479b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AppLovinAdSize f9480c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AdSize f9481d;

        public a(Context context, Bundle bundle, AppLovinAdSize appLovinAdSize, AdSize adSize) {
            this.f9478a = context;
            this.f9479b = bundle;
            this.f9480c = appLovinAdSize;
            this.f9481d = adSize;
        }

        @Override // com.google.ads.mediation.applovin.d.b
        public void onInitializeSuccess() {
            c cVar = c.this;
            cVar.f9472b = cVar.f9474d.c(this.f9478a);
            c.this.f9473c = AppLovinUtils.retrieveZoneId(this.f9479b);
            Log.d(c.f9470h, "Requesting banner of size " + this.f9480c + " for zone: " + c.this.f9473c);
            c cVar2 = c.this;
            cVar2.f9471a = cVar2.f9475e.a(c.this.f9472b, this.f9480c, this.f9481d, this.f9478a);
            c.this.f9471a.e(c.this);
            c.this.f9471a.d(c.this);
            c.this.f9471a.f(c.this);
            if (TextUtils.isEmpty(c.this.f9473c)) {
                c.this.f9472b.getAdService().loadNextAd(this.f9480c, c.this);
            } else {
                c.this.f9472b.getAdService().loadNextAdForZoneId(c.this.f9473c, c.this);
            }
        }
    }

    public c(MediationAdLoadCallback mediationAdLoadCallback, d dVar, com.google.ads.mediation.applovin.a aVar) {
        this.f9476f = mediationAdLoadCallback;
        this.f9474d = dVar;
        this.f9475e = aVar;
    }

    public static c k(MediationAdLoadCallback mediationAdLoadCallback, d dVar, com.google.ads.mediation.applovin.a aVar) {
        return new c(mediationAdLoadCallback, dVar, aVar);
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(AppLovinAd appLovinAd) {
        Log.d(f9470h, "Banner clicked.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f9477g;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adClosedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(f9470h, "Banner closed fullscreen.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f9477g;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(AppLovinAd appLovinAd) {
        Log.d(f9470h, "Banner displayed.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f9477g;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adFailedToDisplay(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        Log.w(f9470h, "Banner failed to display: " + appLovinAdViewDisplayErrorCode);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        Log.d(f9470h, "Banner dismissed.");
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adLeftApplication(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(f9470h, "Banner left application.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f9477g;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adOpenedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(f9470h, "Banner opened fullscreen.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f9477g;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        Log.d(f9470h, "Banner did load ad for zone: " + this.f9473c);
        this.f9471a.c(appLovinAd);
        this.f9477g = (MediationBannerAdCallback) this.f9476f.onSuccess(this);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        AdError adError = AppLovinUtils.getAdError(i10);
        Log.w(f9470h, "Failed to load banner ad with error: " + i10);
        this.f9476f.onFailure(adError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.f9471a.a();
    }

    public void j(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        Context context = mediationBannerAdConfiguration.getContext();
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        AdSize adSize = mediationBannerAdConfiguration.getAdSize();
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.ERROR_DOMAIN);
            Log.e(f9470h, adError.getMessage());
            this.f9476f.onFailure(adError);
            return;
        }
        AppLovinAdSize appLovinAdSizeAppLovinAdSizeFromAdMobAdSize = AppLovinUtils.appLovinAdSizeFromAdMobAdSize(context, adSize);
        if (appLovinAdSizeAppLovinAdSizeFromAdMobAdSize != null) {
            this.f9474d.b(context, string, new a(context, serverParameters, appLovinAdSizeAppLovinAdSizeFromAdMobAdSize, adSize));
            return;
        }
        AdError adError2 = new AdError(101, "Failed to request banner with unsupported size.", AppLovinMediationAdapter.ERROR_DOMAIN);
        Log.e(f9470h, adError2.getMessage());
        this.f9476f.onFailure(adError2);
    }
}
