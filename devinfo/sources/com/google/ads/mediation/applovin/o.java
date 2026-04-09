package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8989a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f8990b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f8991c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8992d;

    public /* synthetic */ o(Object obj, Bundle bundle, Context context, int i4) {
        this.f8989a = i4;
        this.f8992d = obj;
        this.f8990b = bundle;
        this.f8991c = context;
    }

    @Override // com.google.ads.mediation.applovin.e
    public final void onInitializeSuccess() {
        switch (this.f8989a) {
            case 0:
                p pVar = (p) this.f8992d;
                pVar.zoneId = AppLovinUtils.retrieveZoneId(this.f8990b);
                HashMap map = p.f8993c;
                if (map.containsKey(pVar.zoneId) && ((WeakReference) map.get(pVar.zoneId)).get() != null) {
                    pa.a aVar = new pa.a(105, g.ERROR_MSG_MULTIPLE_INTERSTITIAL_AD, AppLovinMediationAdapter.ERROR_DOMAIN, null);
                    Log.e(g.TAG, g.ERROR_MSG_MULTIPLE_INTERSTITIAL_AD);
                    pVar.interstitialAdLoadCallback.i(aVar);
                    break;
                } else {
                    map.put(pVar.zoneId, new WeakReference(pVar));
                    pVar.f8994a = pVar.appLovinInitializer.b(this.f8991c);
                    Log.d(g.TAG, "Requesting interstitial for zone: " + pVar.zoneId);
                    if (!TextUtils.isEmpty(pVar.zoneId)) {
                        pVar.f8994a.getAdService().loadNextAdForZoneId(pVar.zoneId, pVar);
                        break;
                    } else {
                        pVar.f8994a.getAdService().loadNextAd(AppLovinAdSize.INTERSTITIAL, pVar);
                        break;
                    }
                }
            default:
                q qVar = (q) this.f8992d;
                qVar.f8997a = AppLovinUtils.retrieveZoneId(this.f8990b);
                qVar.appLovinSdk = qVar.appLovinInitializer.b(this.f8991c);
                String strT = d.h.t("Requesting rewarded video for zone '", qVar.f8997a, "'");
                String str = k.TAG;
                Log.d(str, strT);
                HashMap map2 = q.f8996c;
                if (!map2.containsKey(qVar.f8997a)) {
                    map2.put(qVar.f8997a, new WeakReference(qVar));
                    if (Objects.equals(qVar.f8997a, "")) {
                        a aVar2 = qVar.appLovinAdFactory;
                        AppLovinSdk appLovinSdk = qVar.appLovinSdk;
                        aVar2.getClass();
                        qVar.incentivizedInterstitial = AppLovinIncentivizedInterstitial.create(appLovinSdk);
                    } else {
                        a aVar3 = qVar.appLovinAdFactory;
                        String str2 = qVar.f8997a;
                        AppLovinSdk appLovinSdk2 = qVar.appLovinSdk;
                        aVar3.getClass();
                        qVar.incentivizedInterstitial = AppLovinIncentivizedInterstitial.create(str2, appLovinSdk2);
                    }
                    qVar.incentivizedInterstitial.preload(qVar);
                    break;
                } else {
                    pa.a aVar4 = new pa.a(105, "Cannot load multiple rewarded ads with the same Zone ID. Let the first ad finish loading before attempting to load another.", AppLovinMediationAdapter.ERROR_DOMAIN, null);
                    Log.e(str, aVar4.toString());
                    qVar.adLoadCallback.i(aVar4);
                    break;
                }
        }
    }
}
