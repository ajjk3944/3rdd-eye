package com.google.ads.mediation.applovin;

import android.content.Context;
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
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* compiled from: AppLovinBannerAd.java */
/* loaded from: classes.dex */
public final class c implements MediationBannerAd, AppLovinAdLoadListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdViewEventListener {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f22393j = 0;

    /* renamed from: b, reason: collision with root package name */
    public F3.f f22394b;

    /* renamed from: c, reason: collision with root package name */
    public AppLovinSdk f22395c;

    /* renamed from: d, reason: collision with root package name */
    public Context f22396d;

    /* renamed from: e, reason: collision with root package name */
    public String f22397e;

    /* renamed from: f, reason: collision with root package name */
    public final d f22398f;

    /* renamed from: g, reason: collision with root package name */
    public final a f22399g;

    /* renamed from: h, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f22400h;
    public MediationBannerAdCallback i;

    public c(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, d dVar, a aVar) {
        this.f22400h = mediationAdLoadCallback;
        this.f22398f = dVar;
        this.f22399g = aVar;
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public final void adClicked(AppLovinAd appLovinAd) {
        Log.d("c", "Banner clicked.");
        MediationBannerAdCallback mediationBannerAdCallback = this.i;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public final void adClosedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d("c", "Banner closed fullscreen.");
        MediationBannerAdCallback mediationBannerAdCallback = this.i;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public final void adDisplayed(AppLovinAd appLovinAd) {
        Log.d("c", "Banner displayed.");
        MediationBannerAdCallback mediationBannerAdCallback = this.i;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public final void adFailedToDisplay(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        Log.w("c", "Banner failed to display: " + appLovinAdViewDisplayErrorCode);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public final void adHidden(AppLovinAd appLovinAd) {
        Log.d("c", "Banner dismissed.");
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public final void adLeftApplication(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d("c", "Banner left application.");
        MediationBannerAdCallback mediationBannerAdCallback = this.i;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public final void adOpenedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d("c", "Banner opened fullscreen.");
        MediationBannerAdCallback mediationBannerAdCallback = this.i;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public final void adReceived(AppLovinAd appLovinAd) {
        Log.d("c", "Banner did load ad for zone: " + this.f22397e);
        ((AppLovinAdView) this.f22394b.f1607b).renderAd(appLovinAd);
        this.i = this.f22400h.onSuccess(this);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public final void failedToReceiveAd(int i) {
        AdError adError = AppLovinUtils.getAdError(i);
        Log.w("c", "Failed to load banner ad with error: " + i);
        this.f22400h.onFailure(adError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public final View getView() {
        return (AppLovinAdView) this.f22394b.f1607b;
    }
}
