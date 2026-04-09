package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.github.appintro.AppIntroBaseFragmentKt;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2144s0 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f20918a;

    /* renamed from: com.applovin.impl.s0$a */
    public enum a {
        NEUTRAL,
        POSITIVE,
        NEGATIVE
    }

    private C2144s0(JSONObject jSONObject) {
        this.f20918a = jSONObject;
    }

    public static C2144s0 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        String string = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, AppIntroBaseFragmentKt.ARG_TITLE, (JSONObject) null), "key", null);
        if ("TOS".equalsIgnoreCase(string) && kVar.y().h() == null) {
            return null;
        }
        if ("PP".equalsIgnoreCase(string) && kVar.y().f() == null) {
            return null;
        }
        return new C2144s0(jSONObject);
    }

    public String b() {
        return JsonUtils.getString(this.f20918a, "event", null);
    }

    public a c() {
        String string = JsonUtils.getString(this.f20918a, "style", null);
        return "default".equalsIgnoreCase(string) ? a.POSITIVE : ("destructive".equalsIgnoreCase(string) || "cancel".equalsIgnoreCase(string)) ? a.NEGATIVE : a.NEUTRAL;
    }

    public String d() {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f20918a, AppIntroBaseFragmentKt.ARG_TITLE, (JSONObject) null);
        return com.applovin.impl.sdk.k.a(JsonUtils.getString(jSONObject, "key", ""), JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "replacements", null), null));
    }

    public String toString() {
        return "ConsentFlowStateAlertAction{title=" + d() + ", destinationStateId=" + a() + ", event=" + b() + "}";
    }

    public int a() {
        return JsonUtils.getInt(this.f20918a, "destination_state_id", -1);
    }
}
