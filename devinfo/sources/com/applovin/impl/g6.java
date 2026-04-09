package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class g6 extends i5 {
    private final JSONObject g;

    /* renamed from: h, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f4158h;

    public g6(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessNativeAdResponse", kVar);
        this.g = jSONObject;
        this.f4158h = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArrayS = a0.g.s("ads", this.g);
        if (jSONArrayS.length() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.a(this.f4288b, "Processing ad...");
            }
            this.f4287a.q0().a(new com.applovin.impl.sdk.nativeAd.b(JsonUtils.getJSONObject(jSONArrayS, 0, new JSONObject()), this.g, this.f4158h, this.f4287a));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.k(this.f4288b, "No ads were returned from the server");
        }
        n7.a("native_native", MaxAdFormat.NATIVE, this.g, this.f4287a);
        this.f4158h.onNativeAdLoadFailed(AppLovinError.NO_FILL);
    }
}
