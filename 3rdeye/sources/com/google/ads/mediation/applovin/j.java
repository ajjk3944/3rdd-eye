package com.google.ads.mediation.applovin;

import N7.C1154e9;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.d;
import com.google.android.gms.ads.AdError;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: AppLovinWaterfallRewardedRenderer.java */
/* loaded from: classes.dex */
public final class j extends f {

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap<String, WeakReference<j>> f22413d = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public String f22414b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22415c;

    /* compiled from: AppLovinWaterfallRewardedRenderer.java */
    public class a implements d.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f22416a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f22417b;

        public a(Bundle bundle, Context context) {
            this.f22416a = bundle;
            this.f22417b = context;
        }

        @Override // com.google.ads.mediation.applovin.d.b
        public final void onInitializeSuccess() {
            String strRetrieveZoneId = AppLovinUtils.retrieveZoneId(this.f22416a);
            j jVar = j.this;
            jVar.f22414b = strRetrieveZoneId;
            jVar.appLovinSdk = jVar.appLovinInitializer.c(this.f22417b);
            String strI = C1154e9.i("Requesting rewarded video for zone '", jVar.f22414b, "'");
            String str = f.TAG;
            Log.d(str, strI);
            HashMap<String, WeakReference<j>> map = j.f22413d;
            if (map.containsKey(jVar.f22414b)) {
                AdError adError = new AdError(105, "Cannot load multiple rewarded ads with the same Zone ID. Let the first ad finish loading before attempting to load another.", AppLovinMediationAdapter.ERROR_DOMAIN);
                Log.e(str, adError.toString());
                jVar.adLoadCallback.onFailure(adError);
                return;
            }
            map.put(jVar.f22414b, new WeakReference<>(jVar));
            if (Objects.equals(jVar.f22414b, "")) {
                com.google.ads.mediation.applovin.a aVar = jVar.appLovinAdFactory;
                AppLovinSdk appLovinSdk = jVar.appLovinSdk;
                aVar.getClass();
                jVar.incentivizedInterstitial = AppLovinIncentivizedInterstitial.create(appLovinSdk);
            } else {
                com.google.ads.mediation.applovin.a aVar2 = jVar.appLovinAdFactory;
                String str2 = jVar.f22414b;
                AppLovinSdk appLovinSdk2 = jVar.appLovinSdk;
                aVar2.getClass();
                jVar.incentivizedInterstitial = AppLovinIncentivizedInterstitial.create(str2, appLovinSdk2);
            }
            jVar.incentivizedInterstitial.preload(jVar);
        }
    }

    @Override // com.google.ads.mediation.applovin.f, com.applovin.sdk.AppLovinAdDisplayListener
    public final void adHidden(AppLovinAd appLovinAd) {
        f22413d.remove(this.f22414b);
        super.adHidden(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.f, com.applovin.sdk.AppLovinAdLoadListener
    public final void adReceived(AppLovinAd appLovinAd) {
        if (this.f22415c) {
            f22413d.remove(this.f22414b);
        }
        super.adReceived(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.f, com.applovin.sdk.AppLovinAdLoadListener
    public final void failedToReceiveAd(int i) {
        f22413d.remove(this.f22414b);
        super.failedToReceiveAd(i);
    }

    @Override // com.google.ads.mediation.applovin.f
    public final void loadAd() {
        Context context = this.adConfiguration.getContext();
        Bundle serverParameters = this.adConfiguration.getServerParameters();
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN);
            Log.e(f.TAG, adError.toString());
            this.adLoadCallback.onFailure(adError);
        } else {
            if (AppLovinUtils.isMultiAdsEnabled()) {
                this.f22415c = true;
            }
            this.appLovinInitializer.b(context, string, new a(serverParameters, context));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public final void showAd(Context context) {
        this.appLovinSdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.adConfiguration.getMediationExtras()));
        String str = this.f22414b;
        if (str != null) {
            Log.d(f.TAG, C1154e9.i("Showing rewarded video for zone '", str, "'"));
        }
        if (this.incentivizedInterstitial.isAdReadyToDisplay()) {
            this.incentivizedInterstitial.show(context, this, this, this, this);
            return;
        }
        AdError adError = new AdError(106, "Ad not ready to show.", AppLovinMediationAdapter.ERROR_DOMAIN);
        Log.e(f.TAG, adError.toString());
        this.rewardedAdCallback.onAdFailedToShow(adError);
    }
}
