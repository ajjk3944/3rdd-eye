package com.applovin.impl;

import com.applovin.impl.d6;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j6 extends i5 {

    /* renamed from: g, reason: collision with root package name */
    private final JSONObject f6273g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f6274h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinAdLoadListener f6275i;

    public j6(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderAppLovinAd", kVar);
        this.f6273g = jSONObject;
        this.f6274h = jSONObject2;
        this.f6275i = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Rendering ad...");
        }
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(this.f6273g, this.f6274h, this.f6218a);
        boolean zBooleanValue = JsonUtils.getBoolean(this.f6273g, "gs_load_immediately", Boolean.FALSE).booleanValue();
        boolean zBooleanValue2 = JsonUtils.getBoolean(this.f6273g, "vs_load_immediately", Boolean.TRUE).booleanValue();
        m5 m5Var = new m5(aVar, this.f6218a, this.f6275i);
        m5Var.c(zBooleanValue2);
        m5Var.b(zBooleanValue);
        this.f6218a.q0().a((i5) m5Var, d6.b.CACHING);
    }
}
