package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.se, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1861se {

    /* renamed from: a, reason: collision with root package name */
    public final List f16760a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16761b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16762c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16763d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16764e;

    /* renamed from: f, reason: collision with root package name */
    public final String f16765f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16766g;

    /* renamed from: h, reason: collision with root package name */
    public final JSONObject f16767h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final long f16768j;

    /* renamed from: k, reason: collision with root package name */
    public final long f16769k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f16770l;

    /* renamed from: m, reason: collision with root package name */
    public final String f16771m;

    public C1861se(JSONObject jSONObject) throws NumberFormatException {
        Long lValueOf;
        Long lValueOf2 = -1L;
        this.f16765f = jSONObject.optString("url");
        this.f16761b = jSONObject.optString("base_uri");
        this.f16762c = jSONObject.optString("post_parameters");
        this.f16763d = a(jSONObject.optString("drt_include"));
        this.f16771m = jSONObject.optString("content_type");
        this.f16770l = a(jSONObject.optString("use_compression"));
        this.f16764e = a(jSONObject.optString("cookies_include", "true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String strOptString = jSONObject.optString("errors");
        this.f16760a = strOptString == null ? null : Arrays.asList(strOptString.split(","));
        this.f16766g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f16767h = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.i = jSONObject.optString("pool_key");
        String strOptString2 = jSONObject.optString("start_time");
        if (TextUtils.isEmpty(strOptString2)) {
            lValueOf = lValueOf2;
        } else {
            try {
                lValueOf = Long.valueOf(strOptString2);
            } catch (NumberFormatException unused) {
            }
        }
        this.f16768j = lValueOf.longValue();
        String strOptString3 = jSONObject.optString("end_time");
        if (!TextUtils.isEmpty(strOptString3)) {
            try {
                lValueOf2 = Long.valueOf(strOptString3);
            } catch (NumberFormatException unused2) {
            }
        }
        this.f16769k = lValueOf2.longValue();
    }

    public static boolean a(String str) {
        if (str != null) {
            return str.equals("1") || str.equals("true");
        }
        return false;
    }
}
