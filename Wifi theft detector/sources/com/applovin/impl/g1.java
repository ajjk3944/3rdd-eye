package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g1 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f6041a;

    public g1(JSONObject jSONObject) {
        this.f6041a = jSONObject;
    }

    public Integer a() {
        return JsonUtils.getInteger(this.f6041a, "dark_mode_toolbar_color", null);
    }

    public String b() {
        return JsonUtils.getString(this.f6041a, "digital_asset_link_url", null);
    }

    public Boolean c() {
        return JsonUtils.getBoolean(this.f6041a, "instant_apps_enabled", null);
    }

    public String d() {
        return JsonUtils.getString(this.f6041a, "referrer", null);
    }

    public Integer e() {
        return JsonUtils.getInteger(this.f6041a, "session_url_relation", null);
    }

    public Integer f() {
        return JsonUtils.getInteger(this.f6041a, "share_state", null);
    }

    public Boolean g() {
        return JsonUtils.getBoolean(this.f6041a, "should_show_title", null);
    }

    public Integer h() {
        return JsonUtils.getInteger(this.f6041a, "toolbar_color", null);
    }

    public Boolean i() {
        return JsonUtils.getBoolean(this.f6041a, "url_bar_hiding_enabled", null);
    }
}
