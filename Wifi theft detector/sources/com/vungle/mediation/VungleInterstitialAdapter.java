package com.vungle.mediation;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.ads.mediation.vungle.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleBannerView;
import com.vungle.ads.VungleError;
import com.vungle.ads.a0;
import com.vungle.ads.f;
import com.vungle.ads.m;
import com.vungle.ads.n;

@Keep
/* loaded from: classes3.dex */
public class VungleInterstitialAdapter extends VungleMediationAdapter implements MediationInterstitialAdapter, MediationBannerAdapter {
    private VungleBannerView bannerAdView;
    private m interstitialAd;
    private MediationBannerListener mediationBannerListener;
    private MediationInterstitialListener mediationInterstitialListener;

    public class a implements a.InterfaceC0194a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f20254a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f20255b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AdConfig f20256c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MediationInterstitialListener f20257d;

        public a(Context context, String str, AdConfig adConfig, MediationInterstitialListener mediationInterstitialListener) {
            this.f20254a = context;
            this.f20255b = str;
            this.f20256c = adConfig;
            this.f20257d = mediationInterstitialListener;
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0194a
        public void a(AdError adError) {
            this.f20257d.onAdFailedToLoad(VungleInterstitialAdapter.this, adError);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0194a
        public void onInitializeSuccess() {
            VungleInterstitialAdapter.this.interstitialAd = new m(this.f20254a, this.f20255b, this.f20256c);
            VungleInterstitialAdapter.this.interstitialAd.setAdListener(new d());
            VungleInterstitialAdapter.this.interstitialAd.load(null);
        }
    }

    public class b implements a.InterfaceC0194a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f20259a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f20260b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a0 f20261c;

        public b(Context context, String str, a0 a0Var) {
            this.f20259a = context;
            this.f20260b = str;
            this.f20261c = a0Var;
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0194a
        public void a(AdError adError) {
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            if (VungleInterstitialAdapter.this.mediationBannerListener != null) {
                VungleInterstitialAdapter.this.mediationBannerListener.onAdFailedToLoad(VungleInterstitialAdapter.this, adError);
            }
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0194a
        public void onInitializeSuccess() throws Throwable {
            VungleInterstitialAdapter.this.bannerAdView = new VungleBannerView(this.f20259a, this.f20260b, this.f20261c);
            VungleInterstitialAdapter.this.bannerAdView.setAdListener(new c());
            VungleInterstitialAdapter.this.bannerAdView.load(null);
        }
    }

    public class c implements f {
        @Override // com.vungle.ads.f, com.vungle.ads.g
        public void onAdClicked(BaseAd baseAd) {
            if (VungleInterstitialAdapter.this.mediationBannerListener != null) {
                VungleInterstitialAdapter.this.mediationBannerListener.onAdClicked(VungleInterstitialAdapter.this);
                VungleInterstitialAdapter.this.mediationBannerListener.onAdOpened(VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.f, com.vungle.ads.g
        public void onAdEnd(BaseAd baseAd) {
        }

        @Override // com.vungle.ads.f, com.vungle.ads.g
        public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
            AdError adError = VungleMediationAdapter.getAdError(vungleError);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            if (VungleInterstitialAdapter.this.mediationBannerListener != null) {
                VungleInterstitialAdapter.this.mediationBannerListener.onAdFailedToLoad(VungleInterstitialAdapter.this, adError);
            }
        }

        @Override // com.vungle.ads.f, com.vungle.ads.g
        public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
            Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(vungleError).toString());
        }

        @Override // com.vungle.ads.f, com.vungle.ads.g
        public void onAdImpression(BaseAd baseAd) {
        }

        @Override // com.vungle.ads.f, com.vungle.ads.g
        public void onAdLeftApplication(BaseAd baseAd) {
            if (VungleInterstitialAdapter.this.mediationBannerListener != null) {
                VungleInterstitialAdapter.this.mediationBannerListener.onAdLeftApplication(VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.f, com.vungle.ads.g
        public void onAdLoaded(BaseAd baseAd) {
            if (VungleInterstitialAdapter.this.mediationBannerListener != null) {
                VungleInterstitialAdapter.this.mediationBannerListener.onAdLoaded(VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.f, com.vungle.ads.g
        public void onAdStart(BaseAd baseAd) {
        }

        public c() {
        }
    }

    public class d implements n {
        @Override // com.vungle.ads.n, com.vungle.ads.k, com.vungle.ads.g
        public void onAdClicked(BaseAd baseAd) {
            if (VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mediationInterstitialListener.onAdClicked(VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.n, com.vungle.ads.k, com.vungle.ads.g
        public void onAdEnd(BaseAd baseAd) {
            if (VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mediationInterstitialListener.onAdClosed(VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.n, com.vungle.ads.k, com.vungle.ads.g
        public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
            AdError adError = VungleMediationAdapter.getAdError(vungleError);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            if (VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mediationInterstitialListener.onAdFailedToLoad(VungleInterstitialAdapter.this, adError);
            }
        }

        @Override // com.vungle.ads.n, com.vungle.ads.k, com.vungle.ads.g
        public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
            Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(vungleError).toString());
        }

        @Override // com.vungle.ads.n, com.vungle.ads.k, com.vungle.ads.g
        public void onAdImpression(BaseAd baseAd) {
        }

        @Override // com.vungle.ads.n, com.vungle.ads.k, com.vungle.ads.g
        public void onAdLeftApplication(BaseAd baseAd) {
            if (VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mediationInterstitialListener.onAdLeftApplication(VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.n, com.vungle.ads.k, com.vungle.ads.g
        public void onAdLoaded(BaseAd baseAd) {
            if (VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mediationInterstitialListener.onAdLoaded(VungleInterstitialAdapter.this);
            }
        }

        @Override // com.vungle.ads.n, com.vungle.ads.k, com.vungle.ads.g
        public void onAdStart(BaseAd baseAd) {
            if (VungleInterstitialAdapter.this.mediationInterstitialListener != null) {
                VungleInterstitialAdapter.this.mediationInterstitialListener.onAdOpened(VungleInterstitialAdapter.this);
            }
        }

        public d() {
        }
    }

    @NonNull
    public static a0 getVungleBannerAdSizeFromGoogleAdSize(AdSize adSize, String str) {
        a0 validAdSizeFromSize = a0.getValidAdSizeFromSize(adSize.getWidth(), adSize.getHeight(), str);
        Log.d(VungleMediationAdapter.TAG, "The requested ad size: " + adSize + "; placementId=" + str + "; vngAdSize=" + validAdSizeFromSize);
        return validAdSizeFromSize;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @NonNull
    public View getBannerView() {
        Log.d(VungleMediationAdapter.TAG, "getBannerView # instance: " + hashCode());
        return this.bannerAdView;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        Log.d(VungleMediationAdapter.TAG, "onDestroy: " + hashCode());
        VungleBannerView vungleBannerView = this.bannerAdView;
        if (vungleBannerView != null) {
            vungleBannerView.finishAd();
            this.bannerAdView = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@NonNull Context context, @NonNull MediationBannerListener mediationBannerListener, @NonNull Bundle bundle, @NonNull AdSize adSize, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2) {
        this.mediationBannerListener = mediationBannerListener;
        String string = bundle.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load waterfall banner ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            mediationBannerListener.onAdFailedToLoad(this, adError);
            return;
        }
        com.google.ads.mediation.vungle.a.a().c(mediationAdRequest.taggedForChildDirectedTreatment());
        String string2 = bundle.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load waterfall banner ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            mediationBannerListener.onAdFailedToLoad(this, adError2);
            return;
        }
        a0 vungleBannerAdSizeFromGoogleAdSize = getVungleBannerAdSizeFromGoogleAdSize(adSize, string2);
        Log.d(VungleMediationAdapter.TAG, "requestBannerAd for Placement: " + string2 + " ### Adapter instance: " + hashCode());
        com.google.ads.mediation.vungle.a.a().b(string, context, new b(context, string2, vungleBannerAdSizeFromGoogleAdSize));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@NonNull Context context, @NonNull MediationInterstitialListener mediationInterstitialListener, @NonNull Bundle bundle, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2) {
        this.mediationInterstitialListener = mediationInterstitialListener;
        String string = bundle.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load waterfall interstitial ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            mediationInterstitialListener.onAdFailedToLoad(this, adError);
            return;
        }
        String string2 = bundle.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load waterfall interstitial ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            mediationInterstitialListener.onAdFailedToLoad(this, adError2);
        } else {
            com.google.ads.mediation.vungle.a.a().c(mediationAdRequest.taggedForChildDirectedTreatment());
            AdConfig adConfig = new AdConfig();
            if (bundle2 != null && bundle2.containsKey("adOrientation")) {
                adConfig.setAdOrientation(bundle2.getInt("adOrientation", 2));
            }
            com.google.ads.mediation.vungle.a.a().b(string, context, new a(context, string2, adConfig, mediationInterstitialListener));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        m mVar = this.interstitialAd;
        if (mVar != null) {
            mVar.play(null);
        }
    }
}
