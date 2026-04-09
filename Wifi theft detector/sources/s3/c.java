package s3;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.ads.mediation.vungle.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleError;
import com.vungle.ads.m;
import com.vungle.ads.n;

/* loaded from: classes.dex */
public class c implements MediationInterstitialAd, n {

    /* renamed from: a, reason: collision with root package name */
    public final MediationAdLoadCallback f24255a;

    /* renamed from: b, reason: collision with root package name */
    public MediationInterstitialAdCallback f24256b;

    /* renamed from: c, reason: collision with root package name */
    public m f24257c;

    /* renamed from: d, reason: collision with root package name */
    public final q3.b f24258d;

    public class a implements a.InterfaceC0194a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f24259a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f24260b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AdConfig f24261c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f24262d;

        public a(Context context, String str, AdConfig adConfig, String str2) {
            this.f24259a = context;
            this.f24260b = str;
            this.f24261c = adConfig;
            this.f24262d = str2;
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0194a
        public void a(AdError adError) {
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            c.this.f24255a.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0194a
        public void onInitializeSuccess() {
            c cVar = c.this;
            cVar.f24257c = cVar.f24258d.c(this.f24259a, this.f24260b, this.f24261c);
            c.this.f24257c.setAdListener(c.this);
            c.this.f24257c.load(this.f24262d);
        }
    }

    public c(MediationAdLoadCallback mediationAdLoadCallback, q3.b bVar) {
        this.f24255a = mediationAdLoadCallback;
        this.f24258d = bVar;
    }

    public void e(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        Bundle mediationExtras = mediationInterstitialAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load bidding interstitial ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f24255a.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding interstitial ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            this.f24255a.onFailure(adError2);
            return;
        }
        String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
        AdConfig adConfigA = this.f24258d.a();
        if (mediationExtras.containsKey("adOrientation")) {
            adConfigA.setAdOrientation(mediationExtras.getInt("adOrientation", 2));
        }
        String watermark = mediationInterstitialAdConfiguration.getWatermark();
        if (!TextUtils.isEmpty(watermark)) {
            adConfigA.setWatermark(watermark);
        }
        Context context = mediationInterstitialAdConfiguration.getContext();
        com.google.ads.mediation.vungle.a.a().b(string, context, new a(context, string2, adConfigA, bidResponse));
    }

    @Override // com.vungle.ads.n, com.vungle.ads.k, com.vungle.ads.g
    public void onAdClicked(BaseAd baseAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f24256b;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.vungle.ads.n, com.vungle.ads.k, com.vungle.ads.g
    public void onAdEnd(BaseAd baseAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f24256b;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.vungle.ads.n, com.vungle.ads.k, com.vungle.ads.g
    public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f24255a.onFailure(adError);
    }

    @Override // com.vungle.ads.n, com.vungle.ads.k, com.vungle.ads.g
    public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f24256b;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }

    @Override // com.vungle.ads.n, com.vungle.ads.k, com.vungle.ads.g
    public void onAdImpression(BaseAd baseAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f24256b;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.n, com.vungle.ads.k, com.vungle.ads.g
    public void onAdLeftApplication(BaseAd baseAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f24256b;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.n, com.vungle.ads.k, com.vungle.ads.g
    public void onAdLoaded(BaseAd baseAd) {
        this.f24256b = (MediationInterstitialAdCallback) this.f24255a.onSuccess(this);
    }

    @Override // com.vungle.ads.n, com.vungle.ads.k, com.vungle.ads.g
    public void onAdStart(BaseAd baseAd) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f24256b;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        m mVar = this.f24257c;
        if (mVar != null) {
            mVar.play(context);
        } else if (this.f24256b != null) {
            AdError adError = new AdError(107, "Failed to show bidding rewarded ad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f24256b.onAdFailedToShow(adError);
        }
    }
}
