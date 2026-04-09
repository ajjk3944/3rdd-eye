package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.d;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes.dex */
public class k extends e implements MediationInterstitialAd {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f9497c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public AppLovinSdk f9498a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9499b;

    public class a implements d.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f9500a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f9501b;

        public a(Bundle bundle, Context context) {
            this.f9500a = bundle;
            this.f9501b = context;
        }

        @Override // com.google.ads.mediation.applovin.d.b
        public void onInitializeSuccess() {
            k.this.zoneId = AppLovinUtils.retrieveZoneId(this.f9500a);
            HashMap map = k.f9497c;
            if (map.containsKey(k.this.zoneId) && ((WeakReference) map.get(k.this.zoneId)).get() != null) {
                AdError adError = new AdError(105, e.ERROR_MSG_MULTIPLE_INTERSTITIAL_AD, AppLovinMediationAdapter.ERROR_DOMAIN);
                Log.e(e.TAG, adError.getMessage());
                k.this.interstitialAdLoadCallback.onFailure(adError);
                return;
            }
            map.put(k.this.zoneId, new WeakReference(k.this));
            k kVar = k.this;
            kVar.f9498a = kVar.appLovinInitializer.c(this.f9501b);
            Log.d(e.TAG, "Requesting interstitial for zone: " + k.this.zoneId);
            if (TextUtils.isEmpty(k.this.zoneId)) {
                k.this.f9498a.getAdService().loadNextAd(AppLovinAdSize.INTERSTITIAL, k.this);
                return;
            }
            AppLovinAdService adService = k.this.f9498a.getAdService();
            k kVar2 = k.this;
            adService.loadNextAdForZoneId(kVar2.zoneId, kVar2);
        }
    }

    public k(MediationAdLoadCallback mediationAdLoadCallback, d dVar, com.google.ads.mediation.applovin.a aVar) {
        super(mediationAdLoadCallback, dVar, aVar);
        this.f9499b = false;
    }

    @Override // com.google.ads.mediation.applovin.e, com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        c();
        super.adHidden(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.e, com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (this.f9499b) {
            c();
        }
        super.adReceived(appLovinAd);
    }

    public void c() {
        if (TextUtils.isEmpty(this.zoneId)) {
            return;
        }
        HashMap map = f9497c;
        if (map.containsKey(this.zoneId) && equals(((WeakReference) map.get(this.zoneId)).get())) {
            map.remove(this.zoneId);
        }
    }

    @Override // com.google.ads.mediation.applovin.e, com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        c();
        super.failedToReceiveAd(i10);
    }

    public void loadAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        Context context = mediationInterstitialAdConfiguration.getContext();
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN);
            Log.e(e.TAG, adError.getMessage());
            this.interstitialAdLoadCallback.onFailure(adError);
        } else {
            if (AppLovinUtils.isMultiAdsEnabled()) {
                this.f9499b = true;
            }
            this.networkExtras = mediationInterstitialAdConfiguration.getMediationExtras();
            this.appLovinInitializer.b(context, string, new a(serverParameters, context));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        this.f9498a.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.networkExtras));
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogD = this.appLovinAdFactory.d(this.f9498a, context);
        appLovinInterstitialAdDialogD.setAdDisplayListener(this);
        appLovinInterstitialAdDialogD.setAdClickListener(this);
        appLovinInterstitialAdDialogD.setAdVideoPlaybackListener(this);
        if (this.appLovinInterstitialAd == null) {
            String str = e.TAG;
            Log.d(str, "Attempting to show interstitial before one was loaded.");
            if (TextUtils.isEmpty(this.zoneId)) {
                Log.d(str, "Showing interstitial preloaded by SDK.");
                appLovinInterstitialAdDialogD.show();
                return;
            }
            return;
        }
        Log.d(e.TAG, "Showing interstitial for zone: " + this.zoneId);
        appLovinInterstitialAdDialogD.showAndRender(this.appLovinInterstitialAd);
    }
}
