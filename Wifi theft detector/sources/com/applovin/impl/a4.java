package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f5378a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5379b;

    public a4(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.f5378a = JsonUtils.getString(jSONObject, "id", "");
        this.f5379b = JsonUtils.getString(jSONObject, "price", null);
    }

    public String a() {
        return this.f5378a;
    }

    public String b() {
        return this.f5379b;
    }
}
