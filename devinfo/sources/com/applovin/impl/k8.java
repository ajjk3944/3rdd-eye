package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class k8 {

    /* renamed from: a, reason: collision with root package name */
    private final String f4376a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4377b;

    /* renamed from: c, reason: collision with root package name */
    private final List f4378c;

    public k8(JSONObject jSONObject) {
        this.f4376a = JsonUtils.getString(jSONObject, "user_type", "all");
        this.f4377b = JsonUtils.getString(jSONObject, "device_type", "all");
        this.f4378c = JsonUtils.getStringList(jSONObject, "segments", null);
    }

    public String a() {
        return this.f4376a;
    }

    public String b() {
        return this.f4377b;
    }

    public List c() {
        return this.f4378c;
    }
}
