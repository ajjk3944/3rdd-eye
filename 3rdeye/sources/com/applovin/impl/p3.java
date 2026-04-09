package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class p3 {

    /* renamed from: a, reason: collision with root package name */
    private final String f20661a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20662b;

    public p3(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f20661a = JsonUtils.getString(jSONObject, FacebookMediationAdapter.KEY_ID, "");
        this.f20662b = JsonUtils.getString(jSONObject, "price", null);
    }

    public String a() {
        return this.f20661a;
    }

    public String b() {
        return this.f20662b;
    }
}
