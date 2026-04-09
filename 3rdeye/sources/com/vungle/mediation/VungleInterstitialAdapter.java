package com.vungle.mediation;

import N7.B8;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Keep;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.ads.mediation.vungle.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.vungle.ads.AbstractC4059q;
import com.vungle.ads.C4045c;
import com.vungle.ads.D;
import com.vungle.ads.F;
import com.vungle.ads.InterfaceC4058p;
import com.vungle.ads.i0;
import com.vungle.ads.j0;
import com.vungle.ads.k0;

@Keep
/* loaded from: classes2.dex */
public class VungleInterstitialAdapter extends VungleMediationAdapter implements MediationInterstitialAdapter, MediationBannerAdapter {
    private j0 bannerAdView;
    private RelativeLayout bannerLayout;
    private D interstitialAd;
    private MediationBannerListener mediationBannerListener;
    private MediationInterstitialListener mediationInterstitialListener;

    public class a implements a.InterfaceC0332a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f23843a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f23844b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C4045c f23845c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MediationInterstitialListener f23846d;

        public a(Context context, String str, C4045c c4045c, MediationInterstitialListener mediationInterstitialListener) {
            this.f23843a = context;
            this.f23844b = str;
            this.f23845c = c4045c;
            this.f23846d = mediationInterstitialListener;
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0332a
        public final void a(AdError adError) {
            this.f23846d.onAdFailedToLoad(VungleInterstitialAdapter.this, adError);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0332a
        public final void onInitializeSuccess() {
            D d10 = new D(this.f23843a, this.f23844b, this.f23845c);
            VungleInterstitialAdapter vungleInterstitialAdapter = VungleInterstitialAdapter.this;
            vungleInterstitialAdapter.interstitialAd = d10;
            vungleInterstitialAdapter.interstitialAd.setAdListener(vungleInterstitialAdapter.new d());
            vungleInterstitialAdapter.interstitialAd.load(null);
        }
    }

    public class b implements a.InterfaceC0332a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f23848a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdSize f23849b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i0 f23850c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f23851d;

        public b(Context context, AdSize adSize, i0 i0Var, String str) {
            this.f23848a = context;
            this.f23849b = adSize;
            this.f23850c = i0Var;
            this.f23851d = str;
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0332a
        public final void a(AdError adError) {
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            VungleInterstitialAdapter vungleInterstitialAdapter = VungleInterstitialAdapter.this;
            if (vungleInterstitialAdapter.mediationBannerListener != null) {
                vungleInterstitialAdapter.mediationBannerListener.onAdFailedToLoad(vungleInterstitialAdapter, adError);
            }
        }

        @Override // com.google.ads.mediation.vungle.a.InterfaceC0332a
        public final void onInitializeSuccess() {
            Context context = this.f23848a;
            RelativeLayout relativeLayout = new RelativeLayout(context);
            VungleInterstitialAdapter vungleInterstitialAdapter = VungleInterstitialAdapter.this;
            vungleInterstitialAdapter.bannerLayout = relativeLayout;
            AdSize adSize = this.f23849b;
            int heightInPixels = adSize.getHeightInPixels(context);
            i0 i0Var = this.f23850c;
            if (heightInPixels <= 0) {
                heightInPixels = Math.round(i0Var.getHeight() * context.getResources().getDisplayMetrics().density);
            }
            vungleInterstitialAdapter.bannerLayout.setLayoutParams(new RelativeLayout.LayoutParams(adSize.getWidthInPixels(context), heightInPixels));
            vungleInterstitialAdapter.bannerAdView = new j0(context, this.f23851d, i0Var);
            vungleInterstitialAdapter.bannerAdView.setAdListener(vungleInterstitialAdapter.new c());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(14, -1);
            layoutParams.addRule(15, -1);
            vungleInterstitialAdapter.bannerLayout.addView(vungleInterstitialAdapter.bannerAdView, layoutParams);
            vungleInterstitialAdapter.bannerAdView.load(null);
        }
    }

    public static i0 getVungleBannerAdSizeFromGoogleAdSize(AdSize adSize, String str) {
        i0 validAdSizeFromSize = i0.getValidAdSizeFromSize(adSize.getWidth(), adSize.getHeight(), str);
        Log.d(VungleMediationAdapter.TAG, "The requested ad size: " + adSize + "; placementId=" + str + "; vngAdSize=" + validAdSizeFromSize);
        return validAdSizeFromSize;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        Log.d(VungleMediationAdapter.TAG, "getBannerView # instance: " + hashCode());
        return this.bannerLayout;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        Log.d(VungleMediationAdapter.TAG, "onDestroy: " + hashCode());
        if (this.bannerAdView != null) {
            this.bannerLayout.removeAllViews();
            this.bannerAdView.finishAd();
            this.bannerAdView = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mediationBannerListener = mediationBannerListener;
        String string = bundle.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load waterfall banner ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            mediationBannerListener.onAdFailedToLoad(this, adError);
            return;
        }
        com.google.ads.mediation.vungle.a aVar = com.google.ads.mediation.vungle.a.f22436c;
        int iTaggedForChildDirectedTreatment = mediationAdRequest.taggedForChildDirectedTreatment();
        aVar.getClass();
        com.google.ads.mediation.vungle.a.b(iTaggedForChildDirectedTreatment);
        String string2 = bundle.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load waterfall banner ad from Liftoff Monetize. Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            mediationBannerListener.onAdFailedToLoad(this, adError2);
        } else {
            i0 vungleBannerAdSizeFromGoogleAdSize = getVungleBannerAdSizeFromGoogleAdSize(adSize, string2);
            String str = VungleMediationAdapter.TAG;
            StringBuilder sbK = B8.k("requestBannerAd for Placement: ", string2, " ### Adapter instance: ");
            sbK.append(hashCode());
            Log.d(str, sbK.toString());
            aVar.a(string, context, new b(context, adSize, vungleBannerAdSizeFromGoogleAdSize, string2));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
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
            return;
        }
        com.google.ads.mediation.vungle.a aVar = com.google.ads.mediation.vungle.a.f22436c;
        int iTaggedForChildDirectedTreatment = mediationAdRequest.taggedForChildDirectedTreatment();
        aVar.getClass();
        com.google.ads.mediation.vungle.a.b(iTaggedForChildDirectedTreatment);
        C4045c c4045c = new C4045c();
        if (bundle2 != null && bundle2.containsKey("adOrientation")) {
            c4045c.setAdOrientation(bundle2.getInt("adOrientation", 2));
        }
        aVar.a(string, context, new a(context, string2, c4045c, mediationInterstitialListener));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() throws Throwable {
        D d10 = this.interstitialAd;
        if (d10 != null) {
            d10.play(null);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    public class c implements InterfaceC4058p {
        public c() {
        }

        @Override // com.vungle.ads.InterfaceC4058p, com.vungle.ads.r
        public final void onAdClicked(AbstractC4059q abstractC4059q) {
            VungleInterstitialAdapter vungleInterstitialAdapter = VungleInterstitialAdapter.this;
            if (vungleInterstitialAdapter.mediationBannerListener != null) {
                vungleInterstitialAdapter.mediationBannerListener.onAdClicked(vungleInterstitialAdapter);
                vungleInterstitialAdapter.mediationBannerListener.onAdOpened(vungleInterstitialAdapter);
            }
        }

        @Override // com.vungle.ads.InterfaceC4058p, com.vungle.ads.r
        public final void onAdFailedToLoad(AbstractC4059q abstractC4059q, k0 k0Var) {
            AdError adError = VungleMediationAdapter.getAdError(k0Var);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            VungleInterstitialAdapter vungleInterstitialAdapter = VungleInterstitialAdapter.this;
            if (vungleInterstitialAdapter.mediationBannerListener != null) {
                vungleInterstitialAdapter.mediationBannerListener.onAdFailedToLoad(vungleInterstitialAdapter, adError);
            }
        }

        @Override // com.vungle.ads.InterfaceC4058p, com.vungle.ads.r
        public final void onAdFailedToPlay(AbstractC4059q abstractC4059q, k0 k0Var) {
            Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(k0Var).toString());
        }

        @Override // com.vungle.ads.InterfaceC4058p, com.vungle.ads.r
        public final void onAdLeftApplication(AbstractC4059q abstractC4059q) {
            VungleInterstitialAdapter vungleInterstitialAdapter = VungleInterstitialAdapter.this;
            if (vungleInterstitialAdapter.mediationBannerListener != null) {
                vungleInterstitialAdapter.mediationBannerListener.onAdLeftApplication(vungleInterstitialAdapter);
            }
        }

        @Override // com.vungle.ads.InterfaceC4058p, com.vungle.ads.r
        public final void onAdLoaded(AbstractC4059q abstractC4059q) {
            VungleInterstitialAdapter vungleInterstitialAdapter = VungleInterstitialAdapter.this;
            if (vungleInterstitialAdapter.mediationBannerListener != null) {
                vungleInterstitialAdapter.mediationBannerListener.onAdLoaded(vungleInterstitialAdapter);
            }
        }

        @Override // com.vungle.ads.InterfaceC4058p, com.vungle.ads.r
        public final void onAdEnd(AbstractC4059q abstractC4059q) {
        }

        @Override // com.vungle.ads.InterfaceC4058p, com.vungle.ads.r
        public final void onAdImpression(AbstractC4059q abstractC4059q) {
        }

        @Override // com.vungle.ads.InterfaceC4058p, com.vungle.ads.r
        public final void onAdStart(AbstractC4059q abstractC4059q) {
        }
    }

    public class d implements F {
        public d() {
        }

        @Override // com.vungle.ads.F, com.vungle.ads.A, com.vungle.ads.r
        public final void onAdClicked(AbstractC4059q abstractC4059q) {
            VungleInterstitialAdapter vungleInterstitialAdapter = VungleInterstitialAdapter.this;
            if (vungleInterstitialAdapter.mediationInterstitialListener != null) {
                vungleInterstitialAdapter.mediationInterstitialListener.onAdClicked(vungleInterstitialAdapter);
            }
        }

        @Override // com.vungle.ads.F, com.vungle.ads.A, com.vungle.ads.r
        public final void onAdEnd(AbstractC4059q abstractC4059q) {
            VungleInterstitialAdapter vungleInterstitialAdapter = VungleInterstitialAdapter.this;
            if (vungleInterstitialAdapter.mediationInterstitialListener != null) {
                vungleInterstitialAdapter.mediationInterstitialListener.onAdClosed(vungleInterstitialAdapter);
            }
        }

        @Override // com.vungle.ads.F, com.vungle.ads.A, com.vungle.ads.r
        public final void onAdFailedToLoad(AbstractC4059q abstractC4059q, k0 k0Var) {
            AdError adError = VungleMediationAdapter.getAdError(k0Var);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            VungleInterstitialAdapter vungleInterstitialAdapter = VungleInterstitialAdapter.this;
            if (vungleInterstitialAdapter.mediationInterstitialListener != null) {
                vungleInterstitialAdapter.mediationInterstitialListener.onAdFailedToLoad(vungleInterstitialAdapter, adError);
            }
        }

        @Override // com.vungle.ads.F, com.vungle.ads.A, com.vungle.ads.r
        public final void onAdFailedToPlay(AbstractC4059q abstractC4059q, k0 k0Var) {
            Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(k0Var).toString());
        }

        @Override // com.vungle.ads.F, com.vungle.ads.A, com.vungle.ads.r
        public final void onAdLeftApplication(AbstractC4059q abstractC4059q) {
            VungleInterstitialAdapter vungleInterstitialAdapter = VungleInterstitialAdapter.this;
            if (vungleInterstitialAdapter.mediationInterstitialListener != null) {
                vungleInterstitialAdapter.mediationInterstitialListener.onAdLeftApplication(vungleInterstitialAdapter);
            }
        }

        @Override // com.vungle.ads.F, com.vungle.ads.A, com.vungle.ads.r
        public final void onAdLoaded(AbstractC4059q abstractC4059q) {
            VungleInterstitialAdapter vungleInterstitialAdapter = VungleInterstitialAdapter.this;
            if (vungleInterstitialAdapter.mediationInterstitialListener != null) {
                vungleInterstitialAdapter.mediationInterstitialListener.onAdLoaded(vungleInterstitialAdapter);
            }
        }

        @Override // com.vungle.ads.F, com.vungle.ads.A, com.vungle.ads.r
        public final void onAdStart(AbstractC4059q abstractC4059q) {
            VungleInterstitialAdapter vungleInterstitialAdapter = VungleInterstitialAdapter.this;
            if (vungleInterstitialAdapter.mediationInterstitialListener != null) {
                vungleInterstitialAdapter.mediationInterstitialListener.onAdOpened(vungleInterstitialAdapter);
            }
        }

        @Override // com.vungle.ads.F, com.vungle.ads.A, com.vungle.ads.r
        public final void onAdImpression(AbstractC4059q abstractC4059q) {
        }
    }
}
