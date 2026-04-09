package com.applovin.impl;

import N7.H7;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class u5 extends w4 {

    /* renamed from: g, reason: collision with root package name */
    private final JSONObject f21545g;

    /* renamed from: h, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f21546h;

    public u5(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessNativeAdResponse", kVar);
        this.f21545g = jSONObject;
        this.f21546h = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArrayQ = H7.q("ads", this.f21545g);
        if (jSONArrayQ.length() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Processing ad...");
            }
            this.f21692a.q0().a(new com.applovin.impl.sdk.nativeAd.b(JsonUtils.getJSONObject(jSONArrayQ, 0, new JSONObject()), this.f21545g, this.f21546h, this.f21692a));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.k(this.f21693b, "No ads were returned from the server");
        }
        a7.a("native_native", MaxAdFormat.NATIVE, this.f21545g, this.f21692a);
        this.f21546h.onNativeAdLoadFailed(AppLovinError.NO_FILL);
    }
}
