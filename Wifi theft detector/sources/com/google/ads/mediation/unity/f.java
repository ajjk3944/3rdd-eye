package com.google.ads.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import org.json.JSONException;

/* loaded from: classes.dex */
public class f implements MediationInterstitialAd, IUnityAdsLoadListener, IUnityAdsShowListener {

    /* renamed from: a, reason: collision with root package name */
    public String f9593a;

    /* renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback f9594b;

    /* renamed from: c, reason: collision with root package name */
    public final e f9595c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.ads.mediation.unity.a f9596d;

    /* renamed from: e, reason: collision with root package name */
    public MediationInterstitialAdCallback f9597e;

    /* renamed from: f, reason: collision with root package name */
    public String f9598f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9599g;

    public class a implements IUnityAdsInitializationListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f9600a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f9601b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f9602c;

        public a(String str, Context context, String str2) {
            this.f9600a = str;
            this.f9601b = context;
            this.f9602c = str2;
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationComplete() throws IllegalAccessException, JSONException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads is initialized for game ID '%s' and can now load interstitial ad with placement ID: %s", this.f9600a, f.this.f9598f));
            UnityAdsAdapterUtils.l(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment(), this.f9601b);
            f.this.f9593a = UUID.randomUUID().toString();
            UnityAdsLoadOptions unityAdsLoadOptionsA = f.this.f9596d.a(f.this.f9593a);
            String str = this.f9602c;
            if (str != null) {
                unityAdsLoadOptionsA.setAdMarkup(str);
            }
            f.this.f9596d.c(f.this.f9598f, unityAdsLoadOptionsA, f.this);
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            AdError adErrorC = UnityAdsAdapterUtils.c(unityAdsInitializationError, String.format("Unity Ads initialization failed for game ID '%s' with error message: %s", this.f9600a, str));
            Log.w(UnityMediationAdapter.TAG, adErrorC.toString());
            f.this.f9594b.onFailure(adErrorC);
        }
    }

    public f(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, e eVar, com.google.ads.mediation.unity.a aVar) {
        this.f9599g = mediationInterstitialAdConfiguration.getWatermark();
        this.f9594b = mediationAdLoadCallback;
        this.f9595c = eVar;
        this.f9596d = aVar;
    }

    public void f(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Context context = mediationInterstitialAdConfiguration.getContext();
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString(AndroidGetAdPlayerContext.KEY_GAME_ID);
        String string2 = serverParameters.getString("zoneId");
        this.f9598f = string2;
        if (UnityAdsAdapterUtils.a(string, string2)) {
            this.f9595c.b(context, string, new a(string, context, mediationInterstitialAdConfiguration.getBidResponse()));
        } else {
            this.f9594b.onFailure(new AdError(101, "Missing or invalid server parameters.", UnityMediationAdapter.ADAPTER_ERROR_DOMAIN));
        }
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public void onUnityAdsAdLoaded(String str) {
        Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad successfully loaded for placement ID: %s", str));
        this.f9598f = str;
        this.f9597e = (MediationInterstitialAdCallback) this.f9594b.onSuccess(this);
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        this.f9598f = str;
        AdError adErrorD = UnityAdsAdapterUtils.d(unityAdsLoadError, str2);
        Log.w(UnityMediationAdapter.TAG, adErrorD.toString());
        this.f9594b.onFailure(adErrorD);
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowClick(String str) {
        Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad was clicked for placement ID: %s", str));
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f9597e;
        if (mediationInterstitialAdCallback == null) {
            return;
        }
        mediationInterstitialAdCallback.reportAdClicked();
        this.f9597e.onAdLeftApplication();
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad finished playing for placement ID: %s", str));
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f9597e;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        AdError adErrorE = UnityAdsAdapterUtils.e(unityAdsShowError, str2);
        Log.w(UnityMediationAdapter.TAG, adErrorE.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f9597e;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adErrorE);
        }
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowStart(String str) {
        Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad started for placement ID: %s", str));
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f9597e;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) throws JSONException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f9598f == null) {
            Log.w(UnityMediationAdapter.TAG, "Unity Ads received call to show before successfully loading an ad.");
        }
        UnityAdsShowOptions unityAdsShowOptionsB = this.f9596d.b(this.f9593a);
        unityAdsShowOptionsB.set(MBridgeConstans.EXTRA_KEY_WM, this.f9599g);
        this.f9596d.d((Activity) context, this.f9598f, unityAdsShowOptionsB, this);
    }
}
