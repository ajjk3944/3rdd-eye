package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g6 extends i5 {

    /* renamed from: g, reason: collision with root package name */
    private final JSONObject f6061g;

    /* renamed from: h, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f6062h;

    public g6(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskProcessNativeAdResponse", kVar);
        this.f6061g = jSONObject;
        this.f6062h = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f6061g, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray());
        if (jSONArray.length() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "Processing ad...");
            }
            this.f6218a.q0().a(new com.applovin.impl.sdk.nativeAd.b(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()), this.f6061g, this.f6062h, this.f6218a));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.k(this.f6219b, "No ads were returned from the server");
        }
        n7.a("native_native", MaxAdFormat.NATIVE, this.f6061g, this.f6218a);
        this.f6062h.onNativeAdLoadFailed(AppLovinError.NO_FILL);
    }
}
