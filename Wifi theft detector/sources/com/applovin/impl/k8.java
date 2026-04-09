package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k8 {

    /* renamed from: a, reason: collision with root package name */
    private final String f6331a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6332b;

    /* renamed from: c, reason: collision with root package name */
    private final List f6333c;

    public k8(JSONObject jSONObject) {
        this.f6331a = JsonUtils.getString(jSONObject, "user_type", "all");
        this.f6332b = JsonUtils.getString(jSONObject, "device_type", "all");
        this.f6333c = JsonUtils.getStringList(jSONObject, "segments", null);
    }

    public String a() {
        return this.f6331a;
    }

    public String b() {
        return this.f6332b;
    }

    public List c() {
        return this.f6333c;
    }
}
