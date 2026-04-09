package io.appmetrica.analytics.impl;

import g0.C4356c;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ro, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4933ro {

    /* renamed from: a, reason: collision with root package name */
    public final C4959so f41594a;

    public C4933ro(Cif cif, vo voVar, String str) {
        this.f41594a = new C4959so(cif, voVar, new C4356c(2));
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        Boolean bool = Boolean.FALSE;
        jSONObject3.put("first_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "first_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "first_event_done", bool)));
        jSONObject3.put("init_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "init_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "init_event_done", bool)));
        jSONObject3.put("report_request_id", AbstractC5122zb.a(jSONObject2, "report_request_id", AbstractC5122zb.a(jSONObject, "report_request_id", -1)));
        jSONObject3.put("global_number", JsonUtils.optLongOrDefault(jSONObject2, "global_number", JsonUtils.optLongOrDefault(jSONObject, "global_number", 0L)));
        jSONObject3.put("session_id", JsonUtils.optLongOrDefault(jSONObject2, "session_id", JsonUtils.optLongOrDefault(jSONObject, "session_id", -1L)));
        jSONObject3.put("referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_handled", bool)));
        jSONObject3.put("numbers_of_type", JsonUtils.optJsonObjectOrNullable(jSONObject2, "numbers_of_type", JsonUtils.optJsonObjectOrNull(jSONObject, "numbers_of_type")));
        jSONObject3.put("open_id", AbstractC5122zb.a(jSONObject2, "open_id", AbstractC5122zb.a(jSONObject, "open_id", 1)));
        jSONObject3.put("attribution_id", AbstractC5122zb.a(jSONObject2, "attribution_id", AbstractC5122zb.a(jSONObject, "attribution_id", 1)));
        jSONObject3.put("last_migration_api_level", AbstractC5122zb.a(jSONObject2, "last_migration_api_level", AbstractC5122zb.a(jSONObject, "last_migration_api_level", 0)));
        jSONObject3.put("external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject2, "external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject, "external_attribution_window_start", -1L)));
        return jSONObject3;
    }

    public final synchronized void b(long j4) {
        C4959so c4959so = this.f41594a;
        c4959so.a(c4959so.a().put("global_number", j4));
    }

    public final synchronized boolean c() {
        return this.f41594a.a().optBoolean("first_event_done", false);
    }

    public final synchronized boolean d() {
        return this.f41594a.a().optBoolean("init_event_done", false);
    }

    public final synchronized int b() {
        return this.f41594a.a().optInt("open_id", 1);
    }

    public final synchronized void c(long j4) {
        C4959so c4959so = this.f41594a;
        c4959so.a(c4959so.a().put("session_id", j4));
    }

    public final synchronized void b(int i) {
        C4959so c4959so = this.f41594a;
        c4959so.a(c4959so.a().put("last_migration_api_level", i));
    }

    public final synchronized void c(int i) {
        C4959so c4959so = this.f41594a;
        c4959so.a(c4959so.a().put("open_id", i));
    }

    public final synchronized void a(JSONObject jSONObject) {
        C4959so c4959so = this.f41594a;
        c4959so.a(c4959so.a().put("numbers_of_type", jSONObject));
    }

    public final synchronized int a() {
        return this.f41594a.a().optInt("attribution_id", 1);
    }

    public final synchronized void a(int i) {
        C4959so c4959so = this.f41594a;
        c4959so.a(c4959so.a().put("attribution_id", i));
    }

    public final synchronized void a(long j4) {
        C4959so c4959so = this.f41594a;
        c4959so.a(c4959so.a().put("external_attribution_window_start", j4));
    }
}
