package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class z5 extends r5 {

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f6335i;

    public z5(u uVar, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super(uVar, str, kVar);
        this.f6335i = appLovinNativeAdLoadListener;
    }

    @Override // com.applovin.impl.r5
    public i5 a(JSONObject jSONObject) {
        return new g6(jSONObject, this.f6335i, this.f4287a);
    }

    @Override // com.applovin.impl.r5
    public String e() {
        return r0.d(this.f4287a);
    }

    @Override // com.applovin.impl.r5
    public String f() {
        return r0.e(this.f4287a);
    }

    @Override // com.applovin.impl.r5
    public void a(int i4, String str) {
        super.a(i4, str);
        this.f6335i.onNativeAdLoadFailed(new AppLovinError(i4, str));
    }
}
