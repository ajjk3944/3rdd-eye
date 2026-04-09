package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.d;
import com.google.android.gms.ads.AdError;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: AppLovinWaterfallInterstitialAd.java */
/* loaded from: classes.dex */
public final class i extends e {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap<String, WeakReference<i>> f22407e = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public AppLovinSdk f22408b;

    /* renamed from: c, reason: collision with root package name */
    public Context f22409c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22410d;

    /* compiled from: AppLovinWaterfallInterstitialAd.java */
    public class a implements d.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f22411a;

        public a(Bundle bundle) {
            this.f22411a = bundle;
        }

        @Override // com.google.ads.mediation.applovin.d.b
        public final void onInitializeSuccess() {
            String strRetrieveZoneId = AppLovinUtils.retrieveZoneId(this.f22411a);
            i iVar = i.this;
            iVar.zoneId = strRetrieveZoneId;
            HashMap<String, WeakReference<i>> map = i.f22407e;
            if (map.containsKey(strRetrieveZoneId) && map.get(iVar.zoneId).get() != null) {
                AdError adError = new AdError(105, e.ERROR_MSG_MULTIPLE_INTERSTITIAL_AD, AppLovinMediationAdapter.ERROR_DOMAIN);
                Log.e(e.TAG, adError.getMessage());
                iVar.interstitialAdLoadCallback.onFailure(adError);
                return;
            }
            map.put(iVar.zoneId, new WeakReference<>(iVar));
            iVar.f22408b = iVar.appLovinInitializer.c(iVar.f22409c);
            Log.d(e.TAG, "Requesting interstitial for zone: " + iVar.zoneId);
            if (TextUtils.isEmpty(iVar.zoneId)) {
                iVar.f22408b.getAdService().loadNextAd(AppLovinAdSize.INTERSTITIAL, iVar);
            } else {
                iVar.f22408b.getAdService().loadNextAdForZoneId(iVar.zoneId, iVar);
            }
        }
    }

    public final void a() {
        if (TextUtils.isEmpty(this.zoneId)) {
            return;
        }
        HashMap<String, WeakReference<i>> map = f22407e;
        if (map.containsKey(this.zoneId) && equals(map.get(this.zoneId).get())) {
            map.remove(this.zoneId);
        }
    }

    @Override // com.google.ads.mediation.applovin.e, com.applovin.sdk.AppLovinAdDisplayListener
    public final void adHidden(AppLovinAd appLovinAd) {
        a();
        super.adHidden(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.e, com.applovin.sdk.AppLovinAdLoadListener
    public final void adReceived(AppLovinAd appLovinAd) {
        if (this.f22410d) {
            a();
        }
        super.adReceived(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.e, com.applovin.sdk.AppLovinAdLoadListener
    public final void failedToReceiveAd(int i) {
        a();
        super.failedToReceiveAd(i);
    }

    @Override // com.google.ads.mediation.applovin.e
    public final void loadAd() {
        this.f22409c = this.interstitialAdConfiguration.getContext();
        Bundle serverParameters = this.interstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN);
            Log.e(e.TAG, adError.getMessage());
            this.interstitialAdLoadCallback.onFailure(adError);
        } else {
            if (AppLovinUtils.isMultiAdsEnabled()) {
                this.f22410d = true;
            }
            this.appLovinInitializer.b(this.f22409c, string, new a(serverParameters));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public final void showAd(Context context) {
        this.f22408b.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(null));
        com.google.ads.mediation.applovin.a aVar = this.appLovinAdFactory;
        AppLovinSdk appLovinSdk = this.f22408b;
        aVar.getClass();
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(appLovinSdk, context);
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(this);
        appLovinInterstitialAdDialogCreate.setAdClickListener(this);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(this);
        if (this.appLovinInterstitialAd != null) {
            Log.d(e.TAG, "Showing interstitial for zone: " + this.zoneId);
            appLovinInterstitialAdDialogCreate.showAndRender(this.appLovinInterstitialAd);
            return;
        }
        String str = e.TAG;
        Log.d(str, "Attempting to show interstitial before one was loaded.");
        if (TextUtils.isEmpty(this.zoneId)) {
            Log.d(str, "Showing interstitial preloaded by SDK.");
            appLovinInterstitialAdDialogCreate.show();
        }
    }
}
