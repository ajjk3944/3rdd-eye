package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ju {

    /* renamed from: a, reason: collision with root package name */
    public final List f12823a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12824b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12825c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12826d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12827e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12828f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final JSONObject f12829h;

    /* renamed from: i, reason: collision with root package name */
    public final String f12830i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final long f12831k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f12832l;

    /* renamed from: m, reason: collision with root package name */
    public final String f12833m;

    public ju(JSONObject jSONObject) throws NumberFormatException {
        Long lValueOf;
        Long lValueOf2 = -1L;
        this.f12828f = jSONObject.optString("url");
        this.f12824b = jSONObject.optString("base_uri");
        this.f12825c = jSONObject.optString("post_parameters");
        this.f12826d = a(jSONObject.optString("drt_include"));
        this.f12833m = jSONObject.optString("content_type");
        this.f12832l = a(jSONObject.optString("use_compression"));
        this.f12827e = a(jSONObject.optString("cookies_include", "true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String strOptString = jSONObject.optString("errors");
        this.f12823a = strOptString == null ? null : Arrays.asList(strOptString.split(","));
        this.g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f12829h = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f12830i = jSONObject.optString("pool_key");
        String strOptString2 = jSONObject.optString("start_time");
        if (TextUtils.isEmpty(strOptString2)) {
            lValueOf = lValueOf2;
        } else {
            try {
                lValueOf = Long.valueOf(strOptString2);
            } catch (NumberFormatException unused) {
            }
        }
        this.j = lValueOf.longValue();
        String strOptString3 = jSONObject.optString("end_time");
        if (!TextUtils.isEmpty(strOptString3)) {
            try {
                lValueOf2 = Long.valueOf(strOptString3);
            } catch (NumberFormatException unused2) {
            }
        }
        this.f12831k = lValueOf2.longValue();
    }

    public static boolean a(String str) {
        if (str != null) {
            return str.equals("1") || str.equals("true");
        }
        return false;
    }
}
