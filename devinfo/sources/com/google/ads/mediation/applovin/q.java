package com.google.ads.mediation.applovin;

import android.content.Context;
import android.util.Log;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q extends k {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f8996c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public String f8997a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8998b;

    @Override // com.google.ads.mediation.applovin.k, com.applovin.sdk.AppLovinAdDisplayListener
    public final void adHidden(AppLovinAd appLovinAd) {
        f8996c.remove(this.f8997a);
        super.adHidden(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.k, com.applovin.sdk.AppLovinAdLoadListener
    public final void adReceived(AppLovinAd appLovinAd) {
        if (this.f8998b) {
            f8996c.remove(this.f8997a);
        }
        super.adReceived(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.k, com.applovin.sdk.AppLovinAdLoadListener
    public final void failedToReceiveAd(int i4) {
        f8996c.remove(this.f8997a);
        super.failedToReceiveAd(i4);
    }

    @Override // bb.w
    public final void showAd(Context context) {
        this.appLovinSdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.networkExtras));
        String str = this.f8997a;
        if (str != null) {
            Log.d(k.TAG, d.h.t("Showing rewarded video for zone '", str, "'"));
        }
        if (this.incentivizedInterstitial.isAdReadyToDisplay()) {
            this.incentivizedInterstitial.show(context, this, this, this, this);
            return;
        }
        pa.a aVar = new pa.a(106, "Ad not ready to show.", AppLovinMediationAdapter.ERROR_DOMAIN, null);
        Log.e(k.TAG, aVar.toString());
        this.rewardedAdCallback.b(aVar);
    }
}
