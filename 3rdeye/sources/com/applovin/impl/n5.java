package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class n5 extends f5 {
    private final AppLovinNativeAdLoadListener i;

    public n5(C2145t c2145t, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super(c2145t, str, kVar);
        this.i = appLovinNativeAdLoadListener;
    }

    @Override // com.applovin.impl.f5
    public w4 a(JSONObject jSONObject) {
        return new u5(jSONObject, this.i, this.f21692a);
    }

    @Override // com.applovin.impl.f5
    public String e() {
        return AbstractC2135n0.d(this.f21692a);
    }

    @Override // com.applovin.impl.f5
    public String f() {
        return AbstractC2135n0.e(this.f21692a);
    }

    @Override // com.applovin.impl.f5
    public void a(int i, String str) {
        super.a(i, str);
        this.i.onNativeAdLoadFailed(new AppLovinError(i, str));
    }
}
