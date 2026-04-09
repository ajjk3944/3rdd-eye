package com.google.ads.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
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
public class i implements MediationRewardedAd {

    /* renamed from: a, reason: collision with root package name */
    public final MediationAdLoadCallback f9606a;

    /* renamed from: b, reason: collision with root package name */
    public final e f9607b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.ads.mediation.unity.a f9608c;

    /* renamed from: d, reason: collision with root package name */
    public MediationRewardedAdCallback f9609d;

    /* renamed from: e, reason: collision with root package name */
    public String f9610e;

    /* renamed from: f, reason: collision with root package name */
    public String f9611f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9612g;

    /* renamed from: h, reason: collision with root package name */
    public final IUnityAdsLoadListener f9613h = new a();

    /* renamed from: i, reason: collision with root package name */
    public final IUnityAdsShowListener f9614i = new b();

    public class a implements IUnityAdsLoadListener {
        public a() {
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsAdLoaded(String str) {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads rewarded ad successfully loaded placement ID: %s", str));
            i.this.f9610e = str;
            i iVar = i.this;
            iVar.f9609d = (MediationRewardedAdCallback) iVar.f9606a.onSuccess(i.this);
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
            i.this.f9610e = str;
            AdError adErrorD = UnityAdsAdapterUtils.d(unityAdsLoadError, str2);
            Log.w(UnityMediationAdapter.TAG, adErrorD.toString());
            i.this.f9606a.onFailure(adErrorD);
        }
    }

    public class b implements IUnityAdsShowListener {
        public b() {
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowClick(String str) {
            if (i.this.f9609d != null) {
                i.this.f9609d.reportAdClicked();
            }
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            if (i.this.f9609d == null) {
                return;
            }
            if (unityAdsShowCompletionState == UnityAds.UnityAdsShowCompletionState.COMPLETED) {
                i.this.f9609d.onVideoComplete();
                i.this.f9609d.onUserEarnedReward();
            }
            i.this.f9609d.onAdClosed();
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            if (i.this.f9609d != null) {
                i.this.f9609d.onAdFailedToShow(UnityAdsAdapterUtils.e(unityAdsShowError, str2));
            }
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowStart(String str) {
            if (i.this.f9609d == null) {
                return;
            }
            i.this.f9609d.onAdOpened();
            i.this.f9609d.reportAdImpression();
            i.this.f9609d.onVideoStart();
        }
    }

    public class c implements IUnityAdsInitializationListener {

        /* renamed from: a, reason: collision with root package name */
        public final Context f9617a;

        /* renamed from: b, reason: collision with root package name */
        public final String f9618b;

        /* renamed from: c, reason: collision with root package name */
        public final String f9619c;

        /* renamed from: d, reason: collision with root package name */
        public final String f9620d;

        public c(Context context, String str, String str2, String str3) {
            this.f9617a = context;
            this.f9618b = str;
            this.f9619c = str2;
            this.f9620d = str3;
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationComplete() throws IllegalAccessException, JSONException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads is initialized for game ID '%s' and can now load rewarded ad with placement ID: %s", this.f9618b, this.f9619c));
            UnityAdsAdapterUtils.l(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment(), this.f9617a);
            i.this.f9611f = UUID.randomUUID().toString();
            UnityAdsLoadOptions unityAdsLoadOptionsA = i.this.f9608c.a(i.this.f9611f);
            String str = this.f9620d;
            if (str != null) {
                unityAdsLoadOptionsA.setAdMarkup(str);
            }
            i.this.f9608c.c(this.f9619c, unityAdsLoadOptionsA, i.this.f9613h);
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            AdError adErrorC = UnityAdsAdapterUtils.c(unityAdsInitializationError, String.format("Unity Ads initialization failed for game ID '%s' with error message: %s", this.f9618b, str));
            Log.w(UnityMediationAdapter.TAG, adErrorC.toString());
            i.this.f9606a.onFailure(adErrorC);
        }
    }

    public i(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback, e eVar, com.google.ads.mediation.unity.a aVar) {
        this.f9612g = mediationRewardedAdConfiguration.getWatermark();
        this.f9606a = mediationAdLoadCallback;
        this.f9607b = eVar;
        this.f9608c = aVar;
    }

    public void h(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Context context = mediationRewardedAdConfiguration.getContext();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString(AndroidGetAdPlayerContext.KEY_GAME_ID);
        String string2 = serverParameters.getString("zoneId");
        if (UnityAdsAdapterUtils.a(string, string2)) {
            this.f9607b.b(context, string, new c(context, string, string2, mediationRewardedAdConfiguration.getBidResponse()));
        } else {
            AdError adError = new AdError(101, "Missing or invalid server parameters.", UnityMediationAdapter.ADAPTER_ERROR_DOMAIN);
            Log.w(UnityMediationAdapter.TAG, adError.toString());
            this.f9606a.onFailure(adError);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) throws JSONException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (this.f9610e == null) {
                Log.w(UnityMediationAdapter.TAG, "Unity Ads received call to show before successfully loading an ad.");
            }
            UnityAdsShowOptions unityAdsShowOptionsB = this.f9608c.b(this.f9611f);
            unityAdsShowOptionsB.set(MBridgeConstans.EXTRA_KEY_WM, this.f9612g);
            this.f9608c.d(activity, this.f9610e, unityAdsShowOptionsB, this.f9614i);
            return;
        }
        AdError adError = new AdError(105, "Unity Ads requires an Activity context to load ads.", UnityMediationAdapter.ADAPTER_ERROR_DOMAIN);
        Log.e(UnityMediationAdapter.TAG, adError.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f9609d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }
}
