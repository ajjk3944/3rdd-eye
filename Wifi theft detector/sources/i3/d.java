package i3;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import h3.e;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class d implements MediationAppOpenAd, InterstitialAdExtendedListener {

    /* renamed from: a, reason: collision with root package name */
    public final MediationAdLoadCallback f21592a;

    /* renamed from: b, reason: collision with root package name */
    public final e f21593b;

    /* renamed from: c, reason: collision with root package name */
    public InterstitialAd f21594c;

    /* renamed from: d, reason: collision with root package name */
    public MediationAppOpenAdCallback f21595d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f21596e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f21597f;

    public d(MediationAdLoadCallback loadCallback, e metaFactory) {
        p.e(loadCallback, "loadCallback");
        p.e(metaFactory, "metaFactory");
        this.f21592a = loadCallback;
        this.f21593b = metaFactory;
        this.f21596e = new AtomicBoolean();
        this.f21597f = new AtomicBoolean();
    }

    public final void a(MediationAppOpenAdConfiguration adConfiguration) {
        InterstitialAd.InterstitialAdLoadConfigBuilder interstitialAdLoadConfigBuilderBuildLoadAdConfig;
        InterstitialAd.InterstitialAdLoadConfigBuilder interstitialAdLoadConfigBuilderWithBid;
        InterstitialAd.InterstitialAdLoadConfigBuilder interstitialAdLoadConfigBuilderWithAdListener;
        InterstitialAd interstitialAd;
        p.e(adConfiguration, "adConfiguration");
        Bundle serverParameters = adConfiguration.getServerParameters();
        p.d(serverParameters, "getServerParameters(...)");
        String placementID = FacebookMediationAdapter.getPlacementID(serverParameters);
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty. ", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.f21592a.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(adConfiguration);
        this.f21594c = this.f21593b.a(adConfiguration.getContext(), placementID);
        if (!TextUtils.isEmpty(adConfiguration.getWatermark()) && (interstitialAd = this.f21594c) != null) {
            interstitialAd.setExtraHints(new ExtraHints.Builder().mediationData(adConfiguration.getWatermark()).build());
        }
        InterstitialAd interstitialAd2 = this.f21594c;
        if (interstitialAd2 != null) {
            interstitialAd2.loadAd((interstitialAd2 == null || (interstitialAdLoadConfigBuilderBuildLoadAdConfig = interstitialAd2.buildLoadAdConfig()) == null || (interstitialAdLoadConfigBuilderWithBid = interstitialAdLoadConfigBuilderBuildLoadAdConfig.withBid(adConfiguration.getBidResponse())) == null || (interstitialAdLoadConfigBuilderWithAdListener = interstitialAdLoadConfigBuilderWithBid.withAdListener(this)) == null) ? null : interstitialAdLoadConfigBuilderWithAdListener.build());
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad) {
        p.e(ad, "ad");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f21595d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdClicked();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad) {
        p.e(ad, "ad");
        this.f21595d = (MediationAppOpenAdCallback) this.f21592a.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad, com.facebook.ads.AdError adError) {
        p.e(ad, "ad");
        p.e(adError, "adError");
        AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        p.d(adError2, "getAdError(...)");
        Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
        if (!this.f21596e.get()) {
            this.f21592a.onFailure(adError2);
            return;
        }
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f21595d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(adError2);
        }
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public void onInterstitialActivityDestroyed() {
        MediationAppOpenAdCallback mediationAppOpenAdCallback;
        if (this.f21597f.getAndSet(true) || (mediationAppOpenAdCallback = this.f21595d) == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDismissed(Ad ad) {
        MediationAppOpenAdCallback mediationAppOpenAdCallback;
        p.e(ad, "ad");
        if (this.f21597f.getAndSet(true) || (mediationAppOpenAdCallback = this.f21595d) == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDisplayed(Ad ad) {
        p.e(ad, "ad");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f21595d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdOpened();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad) {
        p.e(ad, "ad");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f21595d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(Context context) {
        p.e(context, "context");
        this.f21596e.set(true);
        InterstitialAd interstitialAd = this.f21594c;
        if (interstitialAd == null || interstitialAd.show()) {
            return;
        }
        AdError adError = new AdError(110, "Failed to present app open ad.", FacebookMediationAdapter.ERROR_DOMAIN);
        Log.w(FacebookMediationAdapter.TAG, adError.toString());
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f21595d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdCompleted() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerFailed() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerSucceeded() {
    }
}
