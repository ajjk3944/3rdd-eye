package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2110b1 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f19083a;

    public C2110b1(JSONObject jSONObject) {
        this.f19083a = jSONObject;
    }

    public Integer a() {
        return JsonUtils.getInteger(this.f19083a, "dark_mode_toolbar_color", null);
    }

    public String b() {
        return JsonUtils.getString(this.f19083a, "digital_asset_link_url", null);
    }

    public Boolean c() {
        return JsonUtils.getBoolean(this.f19083a, "instant_apps_enabled", null);
    }

    public String d() {
        return JsonUtils.getString(this.f19083a, "referrer", null);
    }

    public Integer e() {
        return JsonUtils.getInteger(this.f19083a, "session_url_relation", null);
    }

    public Integer f() {
        return JsonUtils.getInteger(this.f19083a, "share_state", null);
    }

    public Boolean g() {
        return JsonUtils.getBoolean(this.f19083a, "should_show_title", null);
    }

    public Integer h() {
        return JsonUtils.getInteger(this.f19083a, "toolbar_color", null);
    }

    public Boolean i() {
        return JsonUtils.getBoolean(this.f19083a, "url_bar_hiding_enabled", null);
    }
}
