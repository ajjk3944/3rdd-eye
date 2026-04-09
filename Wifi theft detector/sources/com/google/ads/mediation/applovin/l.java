package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.google.ads.mediation.applovin.d;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public class l extends f implements MediationRewardedAd {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f9503c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public String f9504a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9505b;

    public class a implements d.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f9506a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f9507b;

        public a(Bundle bundle, Context context) {
            this.f9506a = bundle;
            this.f9507b = context;
        }

        @Override // com.google.ads.mediation.applovin.d.b
        public void onInitializeSuccess() {
            l.this.f9504a = AppLovinUtils.retrieveZoneId(this.f9506a);
            l lVar = l.this;
            lVar.appLovinSdk = lVar.appLovinInitializer.c(this.f9507b);
            String str = String.format("Requesting rewarded video for zone '%s'", l.this.f9504a);
            String str2 = f.TAG;
            Log.d(str2, str);
            HashMap map = l.f9503c;
            if (map.containsKey(l.this.f9504a)) {
                AdError adError = new AdError(105, "Cannot load multiple rewarded ads with the same Zone ID. Let the first ad finish loading before attempting to load another.", AppLovinMediationAdapter.ERROR_DOMAIN);
                Log.e(str2, adError.toString());
                l.this.adLoadCallback.onFailure(adError);
                return;
            }
            map.put(l.this.f9504a, new WeakReference(l.this));
            if (Objects.equals(l.this.f9504a, "")) {
                l lVar2 = l.this;
                lVar2.incentivizedInterstitial = lVar2.appLovinAdFactory.b(lVar2.appLovinSdk);
            } else {
                l lVar3 = l.this;
                lVar3.incentivizedInterstitial = lVar3.appLovinAdFactory.c(lVar3.f9504a, l.this.appLovinSdk);
            }
            l lVar4 = l.this;
            lVar4.incentivizedInterstitial.preload(lVar4);
        }
    }

    public l(MediationAdLoadCallback mediationAdLoadCallback, d dVar, com.google.ads.mediation.applovin.a aVar, g gVar) {
        super(mediationAdLoadCallback, dVar, aVar, gVar);
        this.f9505b = false;
    }

    @Override // com.google.ads.mediation.applovin.f, com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        f9503c.remove(this.f9504a);
        super.adHidden(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.f, com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (this.f9505b) {
            f9503c.remove(this.f9504a);
        }
        super.adReceived(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.f, com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        f9503c.remove(this.f9504a);
        super.failedToReceiveAd(i10);
    }

    public void loadAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        Context context = mediationRewardedAdConfiguration.getContext();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, "Missing or invalid SDK Key.", AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN);
            Log.e(f.TAG, adError.toString());
            this.adLoadCallback.onFailure(adError);
        } else {
            if (AppLovinUtils.isMultiAdsEnabled()) {
                this.f9505b = true;
            }
            this.networkExtras = mediationRewardedAdConfiguration.getMediationExtras();
            this.appLovinInitializer.b(context, string, new a(serverParameters, context));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        this.appLovinSdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.networkExtras));
        String str = this.f9504a;
        if (str != null) {
            Log.d(f.TAG, String.format("Showing rewarded video for zone '%s'", str));
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
