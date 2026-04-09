package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Ut {

    /* renamed from: a, reason: collision with root package name */
    public final String f11811a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11812b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f11813c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f11814d;

    public Ut(JsonReader jsonReader) {
        JSONObject jSONObjectX = a4.p.x(jsonReader);
        this.f11814d = jSONObjectX;
        this.f11811a = jSONObjectX.optString("ad_html", null);
        this.f11812b = jSONObjectX.optString("ad_base_url", null);
        this.f11813c = jSONObjectX.optJSONObject("ad_json");
    }
}
