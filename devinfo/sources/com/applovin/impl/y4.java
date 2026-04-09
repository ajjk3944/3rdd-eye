package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class y4 {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f6222a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f6223b;

    /* renamed from: c, reason: collision with root package name */
    protected final SharedPreferences f6224c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f6225d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Object f6226e = new Object();

    public y4(com.applovin.impl.sdk.k kVar) {
        this.f6222a = kVar;
        Context contextO = com.applovin.impl.sdk.k.o();
        this.f6223b = contextO;
        this.f6224c = contextO.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(x4.class.getName());
            Class.forName(r3.class.getName());
        } catch (Throwable unused) {
        }
        d();
    }

    private void d() {
        String strB = ((Boolean) a5.a(z4.j, Boolean.FALSE, com.applovin.impl.sdk.k.o())).booleanValue() ? "" : b();
        synchronized (this.f6226e) {
            try {
                for (x4 x4Var : x4.c()) {
                    try {
                        Object objA = this.f6222a.a(strB + x4Var.b(), null, x4Var.a().getClass(), this.f6224c);
                        if (objA != null) {
                            this.f6225d.put(x4Var.b(), objA);
                        }
                    } catch (Throwable th2) {
                        com.applovin.impl.sdk.o.c("SettingsManager", "Unable to load \"" + x4Var.b() + "\"", th2);
                        this.f6222a.D().a("SettingsManager", "initSettings", th2);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public Object a(x4 x4Var) {
        if (x4Var == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        synchronized (this.f6226e) {
            try {
                Object obj = this.f6225d.get(x4Var.b());
                if (obj == null) {
                    return x4Var.a();
                }
                return x4Var.a(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public List b(x4 x4Var) {
        ArrayList arrayList = new ArrayList(6);
        Iterator it = c(x4Var).iterator();
        while (it.hasNext()) {
            arrayList.add(MaxAdFormat.formatFromString((String) it.next()));
        }
        return arrayList;
    }

    public List c(x4 x4Var) {
        return CollectionUtils.explode((String) a(x4Var));
    }

    public void e() {
        Boolean bool = (Boolean) a5.a(z4.j, Boolean.FALSE, com.applovin.impl.sdk.k.o());
        String strB = b();
        synchronized (this.f6226e) {
            try {
                SharedPreferences.Editor editorEdit = this.f6224c.edit();
                for (x4 x4Var : x4.c()) {
                    Object obj = this.f6225d.get(x4Var.b());
                    if (obj != null) {
                        String strB2 = x4Var.b();
                        this.f6222a.a(strB + x4Var.b(), obj, editorEdit);
                        if (bool.booleanValue()) {
                            this.f6222a.a(strB2, obj, editorEdit);
                        }
                    }
                }
                if (((Boolean) this.f6222a.a(x4.F6)).booleanValue()) {
                    a5.a(editorEdit);
                } else {
                    editorEdit.apply();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean c() {
        return this.f6222a.n0().isVerboseLoggingEnabled() || ((Boolean) a(x4.f6069k)).booleanValue();
    }

    private String b() {
        return "com.applovin.sdk." + n7.f(this.f6222a.i0()) + ".";
    }

    public void a(x4 x4Var, Object obj) {
        if (x4Var == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        if (obj != null) {
            synchronized (this.f6226e) {
                this.f6225d.put(x4Var.b(), obj);
            }
            return;
        }
        throw new IllegalArgumentException("No new value specified");
    }

    public void a(JSONObject jSONObject) {
        synchronized (this.f6226e) {
            try {
                boolean zBooleanValue = JsonUtils.getBoolean(jSONObject, x4.f6146u.b(), Boolean.FALSE).booleanValue();
                HashMap map = zBooleanValue ? new HashMap() : null;
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next != null && next.length() > 0) {
                        try {
                            x4 x4VarA = x4.a(next);
                            if (x4VarA != null) {
                                Object objA = zBooleanValue ? a(x4VarA) : null;
                                Object objA2 = a(next, jSONObject, x4VarA.a());
                                this.f6225d.put(x4VarA.b(), objA2);
                                if (x4VarA == x4.H5) {
                                    this.f6225d.put(x4.I5.b(), Long.valueOf(System.currentTimeMillis()));
                                }
                                if (zBooleanValue && !objA2.equals(objA)) {
                                    map.put(x4VarA, objA);
                                }
                            }
                        } catch (JSONException e2) {
                            com.applovin.impl.sdk.o.c("SettingsManager", "Unable to parse JSON settingsValues array", e2);
                            this.f6222a.D().a("SettingsManager", "loadSettingsException", e2);
                        } catch (Throwable th2) {
                            com.applovin.impl.sdk.o.c("SettingsManager", "Unable to convert setting object ", th2);
                            this.f6222a.D().a("SettingsManager", "loadSettingsThrowable", th2);
                        }
                    }
                }
                if (zBooleanValue && map.size() > 0) {
                    v2 v2Var = new v2();
                    v2Var.a("========== UPDATED SETTINGS ==========");
                    for (x4 x4Var : map.keySet()) {
                        v2Var.a(x4Var.b(), a(x4Var) + " (" + map.get(x4Var) + ")");
                    }
                    v2Var.a("========== END ==========");
                    this.f6222a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f6222a.O().a("SettingsManager", v2Var.toString());
                    }
                }
                a5.b(z4.j, (Boolean) a(x4.T6), com.applovin.impl.sdk.k.o());
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void a() {
        synchronized (this.f6226e) {
            this.f6225d.clear();
        }
        this.f6222a.a(this.f6224c);
    }

    private static Object a(String str, JSONObject jSONObject, Object obj) {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Double) {
            return Double.valueOf(jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        throw new RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }
}
