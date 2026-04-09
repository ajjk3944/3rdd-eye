package com.applovin.impl;

import com.applovin.impl.r5;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class x5 extends w4 {

    /* renamed from: g, reason: collision with root package name */
    private final JSONObject f21736g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f21737h;
    private final AppLovinAdLoadListener i;

    public x5(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderAppLovinAd", kVar);
        this.f21736g = jSONObject;
        this.f21737h = jSONObject2;
        this.i = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.a(this.f21693b, "Rendering ad...");
        }
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(this.f21736g, this.f21737h, this.f21692a);
        boolean zBooleanValue = JsonUtils.getBoolean(this.f21736g, "gs_load_immediately", Boolean.FALSE).booleanValue();
        boolean zBooleanValue2 = JsonUtils.getBoolean(this.f21736g, "vs_load_immediately", Boolean.TRUE).booleanValue();
        a5 a5Var = new a5(aVar, this.f21692a, this.i);
        a5Var.c(zBooleanValue2);
        a5Var.b(zBooleanValue);
        this.f21692a.q0().a((w4) a5Var, r5.b.CACHING);
    }
}
