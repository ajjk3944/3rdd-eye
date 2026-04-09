package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.adview.AppLovinAdView;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.d;

/* compiled from: AppLovinBannerAd.java */
/* loaded from: classes.dex */
public final class b implements d.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f22390a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdSize f22391b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f22392c;

    public b(c cVar, Bundle bundle, AppLovinAdSize appLovinAdSize) {
        this.f22392c = cVar;
        this.f22390a = bundle;
        this.f22391b = appLovinAdSize;
    }

    @Override // com.google.ads.mediation.applovin.d.b
    public final void onInitializeSuccess() {
        c cVar = this.f22392c;
        cVar.f22395c = cVar.f22398f.c(cVar.f22396d);
        cVar.f22397e = AppLovinUtils.retrieveZoneId(this.f22390a);
        StringBuilder sb = new StringBuilder("Requesting banner of size ");
        AppLovinAdSize appLovinAdSize = this.f22391b;
        sb.append(appLovinAdSize);
        sb.append(" for zone: ");
        sb.append(cVar.f22397e);
        Log.d("c", sb.toString());
        AppLovinSdk appLovinSdk = cVar.f22395c;
        Context context = cVar.f22396d;
        cVar.f22399g.getClass();
        F3.f fVar = new F3.f();
        fVar.f1607b = new AppLovinAdView(appLovinSdk, appLovinAdSize, context);
        cVar.f22394b = fVar;
        ((AppLovinAdView) fVar.f1607b).setAdDisplayListener(cVar);
        ((AppLovinAdView) cVar.f22394b.f1607b).setAdClickListener(cVar);
        ((AppLovinAdView) cVar.f22394b.f1607b).setAdViewEventListener(cVar);
        if (TextUtils.isEmpty(cVar.f22397e)) {
            cVar.f22395c.getAdService().loadNextAd(appLovinAdSize, cVar);
        } else {
            cVar.f22395c.getAdService().loadNextAdForZoneId(cVar.f22397e, cVar);
        }
    }
}
