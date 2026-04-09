package com.apm.insight.runtime;

import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<String, d> f3455a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f3456b = null;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f3457c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3458d = false;

    /* renamed from: e, reason: collision with root package name */
    private String f3459e;

    private d(JSONObject jSONObject, String str) {
        this.f3459e = str;
        a(jSONObject);
        f3455a.put(this.f3459e, this);
        com.apm.insight.a.a((Object) "after update aid ".concat(String.valueOf(str)));
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        this.f3456b = jSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("error_module")) == null) {
            return;
        }
        this.f3458d = jSONObjectOptJSONObject.optInt("switcher") == 1 && jSONObjectOptJSONObject.optInt("err_sampling_rate") == 1;
    }

    public static JSONObject b(String str) {
        d dVar = f3455a.get(str);
        if (dVar != null) {
            return dVar.f3456b;
        }
        return null;
    }

    public static d c(String str) {
        return f3455a.get(str);
    }

    public static long d(String str) {
        d dVar = f3455a.get(str);
        if (dVar == null) {
            return 3600000L;
        }
        try {
            return Long.decode(com.apm.insight.a.a(dVar.f3456b, "over_all", "get_settings_interval")).longValue() * 1000;
        } catch (Throwable unused) {
            return 3600000L;
        }
    }

    public static boolean e(String str) {
        JSONObject jSONObject;
        d dVar = f3455a.get(str);
        return (dVar == null || (jSONObject = dVar.f3456b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public static boolean f(String str) {
        JSONObject jSONObject;
        d dVar = f3455a.get(str);
        return (dVar == null || (jSONObject = dVar.f3456b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public static boolean g(String str) {
        JSONObject jSONObject;
        d dVar = f3455a.get(str);
        return (dVar == null || (jSONObject = dVar.f3456b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public final boolean a() {
        if (this.f3456b == null) {
            return false;
        }
        return this.f3458d;
    }

    public static boolean a(String str) {
        return f3455a.get(str) != null;
    }

    public static void a(String str, JSONObject jSONObject) {
        d dVar = f3455a.get(str);
        if (dVar != null) {
            dVar.a(jSONObject);
        } else {
            new d(jSONObject, str);
        }
    }
}
