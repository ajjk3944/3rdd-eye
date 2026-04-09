package s3;

import android.content.Context;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.vungle.ads.AbstractC4059q;
import com.vungle.ads.D;
import com.vungle.ads.F;
import com.vungle.ads.k0;
import q3.C5490a;

/* compiled from: VungleRtbInterstitialAd.java */
/* renamed from: s3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5570e implements MediationInterstitialAd, F {

    /* renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> f46035b;

    /* renamed from: c, reason: collision with root package name */
    public MediationInterstitialAdCallback f46036c;

    /* renamed from: d, reason: collision with root package name */
    public D f46037d;

    /* renamed from: e, reason: collision with root package name */
    public final C5490a f46038e;

    public C5570e(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, C5490a c5490a) {
        this.f46035b = mediationAdLoadCallback;
        this.f46038e = c5490a;
    }

    @Override // com.vungle.ads.F, com.vungle.ads.A, com.vungle.ads.r
    public final void onAdClicked(AbstractC4059q abstractC4059q) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f46036c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.F, com.vungle.ads.A, com.vungle.ads.r
    public final void onAdEnd(AbstractC4059q abstractC4059q) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f46036c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.F, com.vungle.ads.A, com.vungle.ads.r
    public final void onAdFailedToLoad(AbstractC4059q abstractC4059q, k0 k0Var) {
        AdError adError = VungleMediationAdapter.getAdError(k0Var);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f46035b.onFailure(adError);
    }

    @Override // com.vungle.ads.F, com.vungle.ads.A, com.vungle.ads.r
    public final void onAdFailedToPlay(AbstractC4059q abstractC4059q, k0 k0Var) {
        AdError adError = VungleMediationAdapter.getAdError(k0Var);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f46036c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.F, com.vungle.ads.A, com.vungle.ads.r
    public final void onAdImpression(AbstractC4059q abstractC4059q) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f46036c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.F, com.vungle.ads.A, com.vungle.ads.r
    public final void onAdLeftApplication(AbstractC4059q abstractC4059q) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f46036c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.F, com.vungle.ads.A, com.vungle.ads.r
    public final void onAdLoaded(AbstractC4059q abstractC4059q) {
        this.f46036c = this.f46035b.onSuccess(this);
    }

    @Override // com.vungle.ads.F, com.vungle.ads.A, com.vungle.ads.r
    public final void onAdStart(AbstractC4059q abstractC4059q) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f46036c;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public final void showAd(Context context) throws Throwable {
        D d10 = this.f46037d;
        if (d10 != null) {
            d10.play(context);
        } else if (this.f46036c != null) {
            AdError adError = new AdError(107, "Failed to show bidding rewarded ad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f46036c.onAdFailedToShow(adError);
        }
    }
}
