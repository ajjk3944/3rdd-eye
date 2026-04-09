package com.google.ads.mediation.applovin;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p extends g {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f8993c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public AppLovinSdk f8994a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8995b;

    public final void a() {
        if (TextUtils.isEmpty(this.zoneId)) {
            return;
        }
        String str = this.zoneId;
        HashMap map = f8993c;
        if (map.containsKey(str) && equals(((WeakReference) map.get(this.zoneId)).get())) {
            map.remove(this.zoneId);
        }
    }

    @Override // com.google.ads.mediation.applovin.g, com.applovin.sdk.AppLovinAdDisplayListener
    public final void adHidden(AppLovinAd appLovinAd) {
        a();
        super.adHidden(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.g, com.applovin.sdk.AppLovinAdLoadListener
    public final void adReceived(AppLovinAd appLovinAd) {
        if (this.f8995b) {
            a();
        }
        super.adReceived(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.g, com.applovin.sdk.AppLovinAdLoadListener
    public final void failedToReceiveAd(int i4) {
        a();
        super.failedToReceiveAd(i4);
    }

    @Override // bb.p
    public final void showAd(Context context) {
        this.f8994a.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.networkExtras));
        a aVar = this.appLovinAdFactory;
        AppLovinSdk appLovinSdk = this.f8994a;
        aVar.getClass();
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(appLovinSdk, context);
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(this);
        appLovinInterstitialAdDialogCreate.setAdClickListener(this);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(this);
        if (this.appLovinInterstitialAd != null) {
            Log.d(g.TAG, "Showing interstitial for zone: " + this.zoneId);
            appLovinInterstitialAdDialogCreate.showAndRender(this.appLovinInterstitialAd);
            return;
        }
        String str = g.TAG;
        Log.d(str, "Attempting to show interstitial before one was loaded.");
        if (TextUtils.isEmpty(this.zoneId)) {
            Log.d(str, "Showing interstitial preloaded by SDK.");
            appLovinInterstitialAdDialogCreate.show();
        }
    }
}
