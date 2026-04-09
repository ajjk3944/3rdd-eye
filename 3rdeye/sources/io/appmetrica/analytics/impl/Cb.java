package io.appmetrica.analytics.impl;

import android.util.Base64;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Cb {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f39245a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39246b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39247c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f39248d;

    /* renamed from: e, reason: collision with root package name */
    public final String f39249e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f39250f;

    /* renamed from: g, reason: collision with root package name */
    public final String f39251g;

    /* renamed from: h, reason: collision with root package name */
    public final String f39252h;
    public final CounterConfigurationReporterType i;

    /* renamed from: j, reason: collision with root package name */
    public final String f39253j;

    public Cb(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f39245a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f39246b = jSONObject2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f39247c = jSONObject2.getInt("bytes_truncated");
        this.f39253j = JsonUtils.optStringOrNull(jSONObject2, "environment");
        String strOptString = jSONObject2.optString("trimmed_fields");
        this.f39248d = new HashMap();
        if (strOptString != null) {
            try {
                HashMap mapC = AbstractC5122zb.c(strOptString);
                if (mapC != null) {
                    for (Map.Entry entry : mapC.entrySet()) {
                        this.f39248d.put(EnumC4655h4.valueOf((String) entry.getKey()), Integer.valueOf(Integer.parseInt((String) entry.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f39249e = jSONObject3.getString("package_name");
        this.f39250f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.f39251g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f39252h = jSONObject4.getString("api_key");
        this.i = a(jSONObject4);
    }

    public final String a() {
        return this.f39252h;
    }

    public final int b() {
        return this.f39247c;
    }

    public final byte[] c() {
        return this.f39245a;
    }

    public final String d() {
        return this.f39253j;
    }

    public final String e() {
        return this.f39246b;
    }

    public final String f() {
        return this.f39249e;
    }

    public final Integer g() {
        return this.f39250f;
    }

    public final String h() {
        return this.f39251g;
    }

    public final CounterConfigurationReporterType i() {
        return this.i;
    }

    public final HashMap<EnumC4655h4, Integer> j() {
        return this.f39248d;
    }

    public final String k() throws JSONException {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f39248d.entrySet()) {
            map.put(((EnumC4655h4) entry.getKey()).name(), (Integer) entry.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f39250f).put("psid", this.f39251g).put("package_name", this.f39249e)).put("reporter_configuration", new JSONObject().put("api_key", this.f39252h).put("reporter_type", this.i.getStringValue())).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f39245a, 0)).put(AppMeasurementSdk.ConditionalUserProperty.NAME, this.f39246b).put("bytes_truncated", this.f39247c).put("trimmed_fields", AbstractC5122zb.b(map)).putOpt("environment", this.f39253j)).toString();
    }

    public static CounterConfigurationReporterType a(JSONObject jSONObject) {
        return jSONObject.has("reporter_type") ? CounterConfigurationReporterType.fromStringValue(jSONObject.getString("reporter_type")) : CounterConfigurationReporterType.MAIN;
    }

    public Cb(C4683i6 c4683i6, C4552d4 c4552d4, HashMap<EnumC4655h4, Integer> map) {
        this.f39245a = c4683i6.getValueBytes();
        this.f39246b = c4683i6.getName();
        this.f39247c = c4683i6.getBytesTruncated();
        if (map != null) {
            this.f39248d = map;
        } else {
            this.f39248d = new HashMap();
        }
        Nf nfA = c4552d4.a();
        this.f39249e = nfA.e();
        this.f39250f = nfA.f();
        this.f39251g = nfA.g();
        CounterConfiguration counterConfigurationB = c4552d4.b();
        this.f39252h = counterConfigurationB.getApiKey();
        this.i = counterConfigurationB.getReporterType();
        this.f39253j = c4683i6.f();
    }
}
