package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class x7 {

    /* renamed from: a, reason: collision with root package name */
    private final String f21741a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21742b;

    /* renamed from: c, reason: collision with root package name */
    private final List f21743c;

    public x7(JSONObject jSONObject) {
        this.f21741a = JsonUtils.getString(jSONObject, "user_type", "all");
        this.f21742b = JsonUtils.getString(jSONObject, CommonUrlParts.DEVICE_TYPE, "all");
        this.f21743c = JsonUtils.getStringList(jSONObject, "segments", null);
    }

    public String a() {
        return this.f21741a;
    }

    public String b() {
        return this.f21742b;
    }

    public List c() {
        return this.f21743c;
    }
}
