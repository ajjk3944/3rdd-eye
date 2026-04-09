package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class a4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f3585a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3586b;

    public a4(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f3585a = JsonUtils.getString(jSONObject, FacebookMediationAdapter.KEY_ID, "");
        this.f3586b = JsonUtils.getString(jSONObject, "price", null);
    }

    public String a() {
        return this.f3585a;
    }

    public String b() {
        return this.f3586b;
    }
}
