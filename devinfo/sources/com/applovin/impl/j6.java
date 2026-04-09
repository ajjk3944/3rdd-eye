package com.applovin.impl;

import com.applovin.impl.d6;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class j6 extends i5 {
    private final JSONObject g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f4334h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinAdLoadListener f4335i;

    public j6(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderAppLovinAd", kVar);
        this.g = jSONObject;
        this.f4334h = jSONObject2;
        this.f4335i = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.a(this.f4288b, "Rendering ad...");
        }
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(this.g, this.f4334h, this.f4287a);
        boolean zBooleanValue = JsonUtils.getBoolean(this.g, "gs_load_immediately", Boolean.FALSE).booleanValue();
        boolean zBooleanValue2 = JsonUtils.getBoolean(this.g, "vs_load_immediately", Boolean.TRUE).booleanValue();
        m5 m5Var = new m5(aVar, this.f4287a, this.f4335i);
        m5Var.c(zBooleanValue2);
        m5Var.b(zBooleanValue);
        this.f4287a.q0().a((i5) m5Var, d6.b.CACHING);
    }
}
