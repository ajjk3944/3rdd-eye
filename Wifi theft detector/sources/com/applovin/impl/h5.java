package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h5 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f6132a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f6133b = new Object();

    public h5(JSONObject jSONObject) {
        this.f6132a = jSONObject;
    }

    public JSONObject a() {
        JSONObject jSONObjectDeepCopy;
        synchronized (this.f6133b) {
            jSONObjectDeepCopy = JsonUtils.deepCopy(this.f6132a);
        }
        return jSONObjectDeepCopy;
    }

    public List b(String str, List list) {
        List<String> stringList;
        synchronized (this.f6133b) {
            stringList = JsonUtils.getStringList(this.f6132a, str, list);
        }
        return stringList;
    }

    public void c(String str) {
        synchronized (this.f6133b) {
            this.f6132a.remove(str);
        }
    }

    public String toString() {
        String string;
        synchronized (this.f6133b) {
            string = this.f6132a.toString();
        }
        return string;
    }

    public boolean a(String str) {
        boolean zHas;
        synchronized (this.f6133b) {
            zHas = this.f6132a.has(str);
        }
        return zHas;
    }

    public Object b(String str) {
        Object objOpt;
        synchronized (this.f6133b) {
            objOpt = this.f6132a.opt(str);
        }
        return objOpt;
    }

    public void a(r0.b bVar) {
        synchronized (this.f6133b) {
            bVar.accept(this);
        }
    }

    public void b(String str, int i10) {
        synchronized (this.f6133b) {
            JsonUtils.putInt(this.f6132a, str, i10);
        }
    }

    public Object a(l.a aVar) {
        Object objApply;
        synchronized (this.f6133b) {
            objApply = aVar.apply(this);
        }
        return objApply;
    }

    public void b(String str, long j10) {
        synchronized (this.f6133b) {
            JsonUtils.putLong(this.f6132a, str, j10);
        }
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f6133b) {
            bool2 = JsonUtils.getBoolean(this.f6132a, str, bool);
        }
        return bool2;
    }

    public void b(String str, String str2) {
        synchronized (this.f6133b) {
            JsonUtils.putString(this.f6132a, str, str2);
        }
    }

    public float a(String str, float f10) {
        float f11;
        synchronized (this.f6133b) {
            f11 = JsonUtils.getFloat(this.f6132a, str, f10);
        }
        return f11;
    }

    public int a(String str, int i10) {
        int i11;
        synchronized (this.f6133b) {
            i11 = JsonUtils.getInt(this.f6132a, str, i10);
        }
        return i11;
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f6133b) {
            jSONArray2 = JsonUtils.getJSONArray(this.f6132a, str, jSONArray);
        }
        return jSONArray2;
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f6133b) {
            jSONObject2 = JsonUtils.getJSONObject(this.f6132a, str, jSONObject);
        }
        return jSONObject2;
    }

    public long a(String str, long j10) {
        long j11;
        synchronized (this.f6133b) {
            j11 = JsonUtils.getLong(this.f6132a, str, j10);
        }
        return j11;
    }

    public String a(String str, String str2) {
        String string;
        synchronized (this.f6133b) {
            string = JsonUtils.getString(this.f6132a, str, str2);
        }
        return string;
    }

    public List a(String str, List list) {
        List<Integer> integerList;
        synchronized (this.f6133b) {
            integerList = JsonUtils.getIntegerList(this.f6132a, str, list);
        }
        return integerList;
    }

    public void a(String str, boolean z10) {
        synchronized (this.f6133b) {
            JsonUtils.putBoolean(this.f6132a, str, z10);
        }
    }

    public void a(String str, Object obj) {
        synchronized (this.f6133b) {
            JsonUtils.putObject(this.f6132a, str, obj);
        }
    }
}
