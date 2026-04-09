package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import org.json.JSONObject;
import y9.C5819a;

/* loaded from: classes3.dex */
public final class D0 {
    public static String a(C0 c02) {
        try {
            return Base64.encodeToString(new JSONObject().put("apiKey", c02.f39215a).put("packageName", c02.f39216b).put("reporterType", c02.f39217c.getStringValue()).put("processID", c02.f39218d).put("processSessionID", c02.f39219e).put("errorEnvironment", c02.f39220f).toString().getBytes(C5819a.f48359b), 0);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static C0 a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(str, 0), C5819a.f48359b));
            return new C0(jSONObject.getString("apiKey"), jSONObject.getString("packageName"), CounterConfigurationReporterType.Companion.fromStringValue(jSONObject.getString("reporterType")), jSONObject.getInt("processID"), jSONObject.getString("processSessionID"), JsonUtils.optStringOrNull(jSONObject, "errorEnvironment"));
        } catch (Throwable unused) {
            return null;
        }
    }
}
