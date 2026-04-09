package p3;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: FacebookRtbInterstitialAd.java */
/* renamed from: p3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5449b implements MediationInterstitialAd, InterstitialAdExtendedListener {

    /* renamed from: b, reason: collision with root package name */
    public final MediationInterstitialAdConfiguration f45105b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> f45106c;

    /* renamed from: d, reason: collision with root package name */
    public InterstitialAd f45107d;

    /* renamed from: e, reason: collision with root package name */
    public MediationInterstitialAdCallback f45108e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f45109f = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f45110g = new AtomicBoolean();

    public C5449b(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.f45105b = mediationInterstitialAdConfiguration;
        this.f45106c = mediationAdLoadCallback;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f45108e;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
            this.f45108e.onAdLeftApplication();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        this.f45108e = this.f45106c.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        com.google.android.gms.ads.AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
        if (!this.f45109f.get()) {
            this.f45106c.onFailure(adError2);
            return;
        }
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f45108e;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
            this.f45108e.onAdClosed();
        }
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public final void onInterstitialActivityDestroyed() {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        if (this.f45110g.getAndSet(true) || (mediationInterstitialAdCallback = this.f45108e) == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        if (this.f45110g.getAndSet(true) || (mediationInterstitialAdCallback = this.f45108e) == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f45108e;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f45108e;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public final void showAd(Context context) {
        this.f45109f.set(true);
        if (this.f45107d.show()) {
            return;
        }
        com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(110, "Failed to present interstitial ad.", FacebookMediationAdapter.ERROR_DOMAIN);
        Log.w(FacebookMediationAdapter.TAG, adError.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f45108e;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdCompleted() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerFailed() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerSucceeded() {
    }
}
