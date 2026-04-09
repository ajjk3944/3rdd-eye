package com.apm.insight.runtime;

import androidx.annotation.Nullable;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<String, d> f5240a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f5241b = null;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f5242c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5243d = false;

    /* renamed from: e, reason: collision with root package name */
    private String f5244e;

    private d(JSONObject jSONObject, String str) {
        this.f5244e = str;
        a(jSONObject);
        f5240a.put(this.f5244e, this);
        com.apm.insight.a.a((Object) "after update aid ".concat(String.valueOf(str)));
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        this.f5241b = jSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("error_module")) == null) {
            return;
        }
        this.f5243d = jSONObjectOptJSONObject.optInt("switcher") == 1 && jSONObjectOptJSONObject.optInt("err_sampling_rate") == 1;
    }

    @Nullable
    public static JSONObject b(String str) {
        d dVar = f5240a.get(str);
        if (dVar != null) {
            return dVar.f5241b;
        }
        return null;
    }

    public static d c(String str) {
        return f5240a.get(str);
    }

    public static long d(String str) {
        d dVar = f5240a.get(str);
        if (dVar == null) {
            return 3600000L;
        }
        try {
            return Long.decode(com.apm.insight.a.a(dVar.f5241b, "over_all", "get_settings_interval")).longValue() * 1000;
        } catch (Throwable unused) {
            return 3600000L;
        }
    }

    public static boolean e(String str) {
        JSONObject jSONObject;
        d dVar = f5240a.get(str);
        return (dVar == null || (jSONObject = dVar.f5241b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public static boolean f(String str) {
        JSONObject jSONObject;
        d dVar = f5240a.get(str);
        return (dVar == null || (jSONObject = dVar.f5241b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public static boolean g(String str) {
        JSONObject jSONObject;
        d dVar = f5240a.get(str);
        return (dVar == null || (jSONObject = dVar.f5241b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public final boolean a() {
        if (this.f5241b == null) {
            return false;
        }
        return this.f5243d;
    }

    public static boolean a(String str) {
        return f5240a.get(str) != null;
    }

    public static void a(String str, JSONObject jSONObject) {
        d dVar = f5240a.get(str);
        if (dVar != null) {
            dVar.a(jSONObject);
        } else {
            new d(jSONObject, str);
        }
    }
}
