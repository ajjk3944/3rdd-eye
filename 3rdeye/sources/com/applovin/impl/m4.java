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

/* loaded from: classes.dex */
public class m4 {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f20149a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f20150b;

    /* renamed from: c, reason: collision with root package name */
    protected final SharedPreferences f20151c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f20152d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Object f20153e = new Object();

    public m4(com.applovin.impl.sdk.k kVar) {
        this.f20149a = kVar;
        Context contextO = com.applovin.impl.sdk.k.o();
        this.f20150b = contextO;
        this.f20151c = contextO.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(l4.class.getName());
            Class.forName(g3.class.getName());
        } catch (Throwable unused) {
        }
        d();
    }

    public Object a(l4 l4Var) {
        if (l4Var == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        synchronized (this.f20153e) {
            try {
                Object obj = this.f20152d.get(l4Var.b());
                if (obj == null) {
                    return l4Var.a();
                }
                return l4Var.a(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List b(l4 l4Var) {
        ArrayList arrayList = new ArrayList(6);
        Iterator it = c(l4Var).iterator();
        while (it.hasNext()) {
            arrayList.add(MaxAdFormat.formatFromString((String) it.next()));
        }
        return arrayList;
    }

    public List c(l4 l4Var) {
        return CollectionUtils.explode((String) a(l4Var));
    }

    public void d() {
        String strB = b();
        synchronized (this.f20153e) {
            try {
                for (l4 l4Var : l4.c()) {
                    try {
                        Object objA = this.f20149a.a(strB + l4Var.b(), null, l4Var.a().getClass(), this.f20151c);
                        if (objA != null) {
                            this.f20152d.put(l4Var.b(), objA);
                        }
                    } catch (Throwable th) {
                        com.applovin.impl.sdk.o.c("SettingsManager", "Unable to load \"" + l4Var.b() + "\"", th);
                        this.f20149a.E().a("SettingsManager", "initSettings", th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        String strB = b();
        synchronized (this.f20153e) {
            try {
                SharedPreferences.Editor editorEdit = this.f20151c.edit();
                for (l4 l4Var : l4.c()) {
                    Object obj = this.f20152d.get(l4Var.b());
                    if (obj != null) {
                        this.f20149a.a(strB + l4Var.b(), obj, editorEdit);
                    }
                }
                if (((Boolean) this.f20149a.a(l4.f19893b6)).booleanValue()) {
                    o4.a(editorEdit);
                } else {
                    editorEdit.apply();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c() {
        return this.f20149a.n0().isVerboseLoggingEnabled() || ((Boolean) a(l4.f19955k)).booleanValue();
    }

    private String b() {
        return "com.applovin.sdk." + a7.f(this.f20149a.i0()) + ".";
    }

    public void a(l4 l4Var, Object obj) {
        if (l4Var == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        if (obj != null) {
            synchronized (this.f20153e) {
                this.f20152d.put(l4Var.b(), obj);
            }
            return;
        }
        throw new IllegalArgumentException("No new value specified");
    }

    public void a(JSONObject jSONObject) {
        synchronized (this.f20153e) {
            try {
                boolean zBooleanValue = JsonUtils.getBoolean(jSONObject, l4.f20042v.b(), Boolean.FALSE).booleanValue();
                HashMap map = zBooleanValue ? new HashMap() : null;
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next != null && next.length() > 0) {
                        try {
                            l4 l4VarA = l4.a(next);
                            if (l4VarA != null) {
                                Object objA = zBooleanValue ? a(l4VarA) : null;
                                Object objA2 = a(next, jSONObject, l4VarA.a());
                                this.f20152d.put(l4VarA.b(), objA2);
                                if (l4VarA == l4.f19939h5) {
                                    this.f20152d.put(l4.f19946i5.b(), Long.valueOf(System.currentTimeMillis()));
                                }
                                if (zBooleanValue && !objA2.equals(objA)) {
                                    map.put(l4VarA, objA);
                                }
                            }
                        } catch (JSONException e4) {
                            com.applovin.impl.sdk.o.c("SettingsManager", "Unable to parse JSON settingsValues array", e4);
                            this.f20149a.E().a("SettingsManager", "loadSettingsException", e4);
                        } catch (Throwable th) {
                            com.applovin.impl.sdk.o.c("SettingsManager", "Unable to convert setting object ", th);
                            this.f20149a.E().a("SettingsManager", "loadSettingsThrowable", th);
                        }
                    }
                }
                if (zBooleanValue && map.size() > 0) {
                    n2 n2Var = new n2();
                    n2Var.a("========== UPDATED SETTINGS ==========");
                    for (l4 l4Var : map.keySet()) {
                        n2Var.a(l4Var.b(), a(l4Var) + " (" + map.get(l4Var) + ")");
                    }
                    n2Var.a("========== END ==========");
                    this.f20149a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f20149a.O().a("SettingsManager", n2Var.toString());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a() {
        synchronized (this.f20153e) {
            this.f20152d.clear();
        }
        this.f20149a.a(this.f20151c);
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
