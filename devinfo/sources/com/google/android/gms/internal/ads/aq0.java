package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class aq0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9386a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9387b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f9388c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f9389d;

    public aq0(JsonReader jsonReader) {
        JSONObject jSONObjectY = pd.b.y(jsonReader);
        this.f9389d = jSONObjectY;
        this.f9386a = jSONObjectY.optString("ad_html", null);
        this.f9387b = jSONObjectY.optString("ad_base_url", null);
        this.f9388c = jSONObjectY.optJSONObject("ad_json");
    }
}
