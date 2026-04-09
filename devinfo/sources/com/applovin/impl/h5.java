package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class h5 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f4215a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f4216b = new Object();

    public h5(JSONObject jSONObject) {
        this.f4215a = jSONObject;
    }

    public JSONObject a() {
        JSONObject jSONObjectDeepCopy;
        synchronized (this.f4216b) {
            jSONObjectDeepCopy = JsonUtils.deepCopy(this.f4215a);
        }
        return jSONObjectDeepCopy;
    }

    public List b(String str, List list) {
        List<String> stringList;
        synchronized (this.f4216b) {
            stringList = JsonUtils.getStringList(this.f4215a, str, list);
        }
        return stringList;
    }

    public void c(String str) {
        synchronized (this.f4216b) {
            this.f4215a.remove(str);
        }
    }

    public String toString() {
        String string;
        synchronized (this.f4216b) {
            string = this.f4215a.toString();
        }
        return string;
    }

    public boolean a(String str) {
        boolean zHas;
        synchronized (this.f4216b) {
            zHas = this.f4215a.has(str);
        }
        return zHas;
    }

    public Object b(String str) {
        Object objOpt;
        synchronized (this.f4216b) {
            objOpt = this.f4215a.opt(str);
        }
        return objOpt;
    }

    public void a(d4.a aVar) {
        synchronized (this.f4216b) {
            aVar.accept(this);
        }
    }

    public void b(String str, int i4) {
        synchronized (this.f4216b) {
            JsonUtils.putInt(this.f4215a, str, i4);
        }
    }

    public Object a(s.a aVar) {
        Object objApply;
        synchronized (this.f4216b) {
            objApply = aVar.apply(this);
        }
        return objApply;
    }

    public void b(String str, long j) {
        synchronized (this.f4216b) {
            JsonUtils.putLong(this.f4215a, str, j);
        }
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f4216b) {
            bool2 = JsonUtils.getBoolean(this.f4215a, str, bool);
        }
        return bool2;
    }

    public void b(String str, String str2) {
        synchronized (this.f4216b) {
            JsonUtils.putString(this.f4215a, str, str2);
        }
    }

    public float a(String str, float f10) {
        float f11;
        synchronized (this.f4216b) {
            f11 = JsonUtils.getFloat(this.f4215a, str, f10);
        }
        return f11;
    }

    public int a(String str, int i4) {
        int i10;
        synchronized (this.f4216b) {
            i10 = JsonUtils.getInt(this.f4215a, str, i4);
        }
        return i10;
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f4216b) {
            jSONArray2 = JsonUtils.getJSONArray(this.f4215a, str, jSONArray);
        }
        return jSONArray2;
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f4216b) {
            jSONObject2 = JsonUtils.getJSONObject(this.f4215a, str, jSONObject);
        }
        return jSONObject2;
    }

    public long a(String str, long j) {
        long j8;
        synchronized (this.f4216b) {
            j8 = JsonUtils.getLong(this.f4215a, str, j);
        }
        return j8;
    }

    public String a(String str, String str2) {
        String string;
        synchronized (this.f4216b) {
            string = JsonUtils.getString(this.f4215a, str, str2);
        }
        return string;
    }

    public List a(String str, List list) {
        List<Integer> integerList;
        synchronized (this.f4216b) {
            integerList = JsonUtils.getIntegerList(this.f4215a, str, list);
        }
        return integerList;
    }

    public void a(String str, boolean z3) {
        synchronized (this.f4216b) {
            JsonUtils.putBoolean(this.f4215a, str, z3);
        }
    }

    public void a(String str, Object obj) {
        synchronized (this.f4216b) {
            JsonUtils.putObject(this.f4215a, str, obj);
        }
    }
}
