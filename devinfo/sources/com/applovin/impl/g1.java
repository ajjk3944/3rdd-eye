package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class g1 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f4141a;

    public g1(JSONObject jSONObject) {
        this.f4141a = jSONObject;
    }

    public Integer a() {
        return JsonUtils.getInteger(this.f4141a, "dark_mode_toolbar_color", null);
    }

    public String b() {
        return JsonUtils.getString(this.f4141a, "digital_asset_link_url", null);
    }

    public Boolean c() {
        return JsonUtils.getBoolean(this.f4141a, "instant_apps_enabled", null);
    }

    public String d() {
        return JsonUtils.getString(this.f4141a, "referrer", null);
    }

    public Integer e() {
        return JsonUtils.getInteger(this.f4141a, "session_url_relation", null);
    }

    public Integer f() {
        return JsonUtils.getInteger(this.f4141a, "share_state", null);
    }

    public Boolean g() {
        return JsonUtils.getBoolean(this.f4141a, "should_show_title", null);
    }

    public Integer h() {
        return JsonUtils.getInteger(this.f4141a, "toolbar_color", null);
    }

    public Boolean i() {
        return JsonUtils.getBoolean(this.f4141a, "url_bar_hiding_enabled", null);
    }
}
