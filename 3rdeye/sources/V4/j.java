package V4;

import A2.l;
import V4.b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SettingsV3JsonTransform.java */
/* loaded from: classes2.dex */
public final class j implements g {
    @Override // V4.g
    public final b a(l lVar, JSONObject jSONObject) throws JSONException {
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        b.C0184b c0184b = jSONObject.has("session") ? new b.C0184b(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new b.C0184b(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new b(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (iOptInt * 1000) + System.currentTimeMillis(), c0184b, new b.a(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), dOptDouble, dOptDouble2, iOptInt2);
    }
}
