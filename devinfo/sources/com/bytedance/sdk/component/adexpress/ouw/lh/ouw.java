package com.bytedance.sdk.component.adexpress.ouw.lh;

import android.text.TextUtils;
import android.util.Pair;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.utils.ko;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    public Map<String, ouw> fkw = new ConcurrentHashMap();

    /* renamed from: le, reason: collision with root package name */
    private String f7374le;

    /* renamed from: lh, reason: collision with root package name */
    public vt f7375lh;
    public String ouw;
    private List<C0048ouw> ra;
    public String vt;
    public String yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.component.adexpress.ouw.lh.ouw$ouw, reason: collision with other inner class name */
    public static class C0048ouw {

        /* renamed from: lh, reason: collision with root package name */
        int f7376lh;
        public String ouw;
        public String vt;

        public final boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0048ouw)) {
                return super.equals(obj);
            }
            String str2 = this.ouw;
            if (str2 != null) {
                C0048ouw c0048ouw = (C0048ouw) obj;
                if (str2.equals(c0048ouw.ouw) && (str = this.vt) != null && str.equals(c0048ouw.vt)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt {

        /* renamed from: lh, reason: collision with root package name */
        public List<Pair<String, String>> f7377lh;
        public String ouw;
        String vt;
    }

    public final JSONObject lh() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", this.f7374le);
            jSONObject.putOpt("version", this.ouw);
            jSONObject.putOpt("main", this.vt);
            if (!TextUtils.isEmpty(this.yu)) {
                jSONObject.put("template_fetch_url", this.yu);
            }
            JSONArray jSONArray = new JSONArray();
            if (ouw() != null) {
                for (C0048ouw c0048ouw : ouw()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", c0048ouw.ouw);
                    jSONObject2.putOpt("md5", c0048ouw.vt);
                    jSONObject2.putOpt(AppLovinEventTypes.USER_COMPLETED_LEVEL, Integer.valueOf(c0048ouw.f7376lh));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.fkw.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                boolean z3 = false;
                for (String str : this.fkw.keySet()) {
                    ouw ouwVar = this.fkw.get(str);
                    if (ouwVar != null) {
                        jSONObject3.put(str, ouwVar.lh());
                        z3 = true;
                    }
                }
                if (z3) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            vt vtVar = this.f7375lh;
            if (vtVar != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", vtVar.ouw);
                jSONObject4.put("md5", vtVar.vt);
                JSONObject jSONObject5 = new JSONObject();
                List<Pair<String, String>> list = vtVar.f7377lh;
                if (list != null) {
                    for (Pair<String, String> pair : list) {
                        jSONObject5.put((String) pair.first, pair.second);
                    }
                }
                jSONObject4.put("map", jSONObject5);
                jSONObject.putOpt("resources_archive", jSONObject4);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final List<C0048ouw> ouw() {
        if (this.ra == null) {
            this.ra = new ArrayList();
        }
        return this.ra;
    }

    public final boolean vt() {
        return (TextUtils.isEmpty(this.vt) || TextUtils.isEmpty(this.ouw) || TextUtils.isEmpty(this.f7374le)) ? false : true;
    }

    public static ouw ouw(String str) {
        if (str == null) {
            return null;
        }
        try {
            return ouw(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static ouw ouw(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return null;
        }
        ouw ouwVar = new ouw();
        ouwVar.f7374le = jSONObject.optString("name");
        ouwVar.ouw = jSONObject.optString("version");
        ouwVar.vt = jSONObject.optString("main");
        ouwVar.yu = jSONObject.optString("template_fetch_url", "");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i4);
                C0048ouw c0048ouw = new C0048ouw();
                c0048ouw.ouw = jSONObjectOptJSONObject2.optString("url");
                c0048ouw.vt = jSONObjectOptJSONObject2.optString("md5");
                c0048ouw.f7376lh = jSONObjectOptJSONObject2.optInt(AppLovinEventTypes.USER_COMPLETED_LEVEL);
                arrayList.add(c0048ouw);
            }
        }
        ouwVar.ra = arrayList;
        try {
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("engines");
            if (jSONObjectOptJSONObject3 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    ouw ouwVarOuw = ouw(jSONObjectOptJSONObject3.optJSONObject(next));
                    if (ouwVarOuw != null) {
                        ouwVar.fkw.put(next, ouwVarOuw);
                    }
                }
            }
        } catch (Exception e2) {
            ko.vt("engine", "parse exception:" + e2.getMessage());
        }
        if (jSONObject.has("resources_archive") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            vt vtVar = new vt();
            vtVar.ouw = jSONObjectOptJSONObject.optString("url");
            vtVar.vt = jSONObjectOptJSONObject.optString("md5");
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("map");
            if (jSONObjectOptJSONObject4 != null) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject4.keys();
                ArrayList arrayList2 = new ArrayList();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    arrayList2.add(new Pair(next2, jSONObjectOptJSONObject4.optString(next2)));
                }
                vtVar.f7377lh = arrayList2;
            }
            ouwVar.f7375lh = vtVar;
        }
        if (ouwVar.vt()) {
            return ouwVar;
        }
        return null;
    }
}
