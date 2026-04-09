package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import r.InterfaceC5503a;

/* loaded from: classes.dex */
public class v4 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f21649a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f21650b = new Object();

    public v4(JSONObject jSONObject) {
        this.f21649a = jSONObject;
    }

    public JSONObject a() {
        JSONObject jSONObjectDeepCopy;
        synchronized (this.f21650b) {
            jSONObjectDeepCopy = JsonUtils.deepCopy(this.f21649a);
        }
        return jSONObjectDeepCopy;
    }

    public List b(String str, List list) {
        List<String> stringList;
        synchronized (this.f21650b) {
            stringList = JsonUtils.getStringList(this.f21649a, str, list);
        }
        return stringList;
    }

    public void c(String str) {
        synchronized (this.f21650b) {
            this.f21649a.remove(str);
        }
    }

    public String toString() {
        String string;
        synchronized (this.f21650b) {
            string = this.f21649a.toString();
        }
        return string;
    }

    public boolean a(String str) {
        boolean zHas;
        synchronized (this.f21650b) {
            zHas = this.f21649a.has(str);
        }
        return zHas;
    }

    public Object b(String str) {
        Object objOpt;
        synchronized (this.f21650b) {
            objOpt = this.f21649a.opt(str);
        }
        return objOpt;
    }

    public void a(K0.b bVar) {
        synchronized (this.f21650b) {
            bVar.accept(this);
        }
    }

    public void b(String str, int i) {
        synchronized (this.f21650b) {
            JsonUtils.putInt(this.f21649a, str, i);
        }
    }

    public Object a(InterfaceC5503a interfaceC5503a) {
        Object objApply;
        synchronized (this.f21650b) {
            objApply = interfaceC5503a.apply(this);
        }
        return objApply;
    }

    public void b(String str, long j4) {
        synchronized (this.f21650b) {
            JsonUtils.putLong(this.f21649a, str, j4);
        }
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f21650b) {
            bool2 = JsonUtils.getBoolean(this.f21649a, str, bool);
        }
        return bool2;
    }

    public void b(String str, String str2) {
        synchronized (this.f21650b) {
            JsonUtils.putString(this.f21649a, str, str2);
        }
    }

    public float a(String str, float f10) {
        float f11;
        synchronized (this.f21650b) {
            f11 = JsonUtils.getFloat(this.f21649a, str, f10);
        }
        return f11;
    }

    public int a(String str, int i) {
        int i10;
        synchronized (this.f21650b) {
            i10 = JsonUtils.getInt(this.f21649a, str, i);
        }
        return i10;
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f21650b) {
            jSONArray2 = JsonUtils.getJSONArray(this.f21649a, str, jSONArray);
        }
        return jSONArray2;
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f21650b) {
            jSONObject2 = JsonUtils.getJSONObject(this.f21649a, str, jSONObject);
        }
        return jSONObject2;
    }

    public long a(String str, long j4) {
        long j10;
        synchronized (this.f21650b) {
            j10 = JsonUtils.getLong(this.f21649a, str, j4);
        }
        return j10;
    }

    public String a(String str, String str2) {
        String string;
        synchronized (this.f21650b) {
            string = JsonUtils.getString(this.f21649a, str, str2);
        }
        return string;
    }

    public List a(String str, List list) {
        List<Integer> integerList;
        synchronized (this.f21650b) {
            integerList = JsonUtils.getIntegerList(this.f21649a, str, list);
        }
        return integerList;
    }

    public void a(String str, boolean z10) {
        synchronized (this.f21650b) {
            JsonUtils.putBoolean(this.f21649a, str, z10);
        }
    }

    public void a(String str, Object obj) {
        synchronized (this.f21650b) {
            JsonUtils.putObject(this.f21649a, str, obj);
        }
    }
}
