package com.mbridge.msdk.videocommon.setting;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Integer> f19697a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.videocommon.entity.c> f19698b;

    /* renamed from: c, reason: collision with root package name */
    private long f19699c;

    /* renamed from: d, reason: collision with root package name */
    private long f19700d;

    /* renamed from: e, reason: collision with root package name */
    private long f19701e;

    /* renamed from: f, reason: collision with root package name */
    private long f19702f;

    /* renamed from: g, reason: collision with root package name */
    private long f19703g;

    /* renamed from: h, reason: collision with root package name */
    private long f19704h;

    /* renamed from: j, reason: collision with root package name */
    private String f19706j;

    /* renamed from: i, reason: collision with root package name */
    private int f19705i = 0;

    /* renamed from: k, reason: collision with root package name */
    private String f19707k = "";

    /* renamed from: l, reason: collision with root package name */
    private String f19708l = "";

    public String a() {
        return this.f19706j;
    }

    public void b(String str) {
        this.f19706j = str;
    }

    public void c(String str) {
        this.f19708l = str;
    }

    public void d(String str) {
        this.f19707k = str;
    }

    public void e(long j10) {
        this.f19700d = j10;
    }

    public String f() {
        return this.f19708l;
    }

    public Map<String, com.mbridge.msdk.videocommon.entity.c> g() {
        return this.f19698b;
    }

    public long h() {
        return this.f19700d * 1000;
    }

    public long i() {
        return this.f19703g;
    }

    public String j() {
        return this.f19707k;
    }

    public JSONObject k() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            Map<String, Integer> map = this.f19697a;
            if (map != null && map.size() > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, Integer> entry : this.f19697a.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue().intValue());
                    }
                    jSONObject.put("caplist", jSONObject2);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            Map<String, com.mbridge.msdk.videocommon.entity.c> map2 = this.f19698b;
            if (map2 != null && map2.size() > 0) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, com.mbridge.msdk.videocommon.entity.c> entry2 : this.f19698b.entrySet()) {
                        JSONObject jSONObject3 = new JSONObject();
                        String key = entry2.getKey();
                        com.mbridge.msdk.videocommon.entity.c value = entry2.getValue();
                        if (value != null) {
                            jSONObject3.put("name", value.c());
                            jSONObject3.put("amount", value.a());
                            jSONObject3.put("id", key);
                        }
                        jSONArray.put(jSONObject3);
                    }
                    jSONObject.put("reward", jSONArray);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            jSONObject.put("getpf", this.f19699c);
            jSONObject.put("ruct", this.f19700d);
            jSONObject.put(CampaignEx.JSON_KEY_PLCT, this.f19701e);
            jSONObject.put("dlct", this.f19702f);
            jSONObject.put("vcct", this.f19703g);
            jSONObject.put("current_time", this.f19704h);
            jSONObject.put("vtag", this.f19707k);
            jSONObject.put("isDefault", this.f19705i);
            return jSONObject;
        } catch (Exception e12) {
            e12.printStackTrace();
            return jSONObject;
        }
    }

    public void a(long j10) {
        this.f19704h = j10;
    }

    public void b(long j10) {
        this.f19702f = j10;
    }

    public void c(long j10) {
        this.f19699c = j10;
    }

    public long d() {
        return this.f19699c * 1000;
    }

    public long e() {
        return this.f19701e * 1000;
    }

    public void f(long j10) {
        this.f19703g = j10;
    }

    public void a(Map<String, Integer> map) {
        this.f19697a = map;
    }

    public long b() {
        return this.f19704h;
    }

    public long c() {
        return this.f19702f;
    }

    public void d(long j10) {
        this.f19701e = j10;
    }

    public void a(int i10) {
        this.f19705i = i10;
    }

    public void b(Map<String, com.mbridge.msdk.videocommon.entity.c> map) {
        this.f19698b = map;
    }

    public static a a(String str) {
        a aVar = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                a aVar2 = new a();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("caplist");
                    aVar2.b(jSONObject.optString("ab_id", ""));
                    aVar2.c(jSONObject.optString("rid", ""));
                    if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                        HashMap map = new HashMap();
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys != null && itKeys.hasNext()) {
                            String next = itKeys.next();
                            int iOptInt = jSONObjectOptJSONObject.optInt(next, 1000);
                            if (!TextUtils.isEmpty(next)) {
                                if (!TextUtils.isEmpty(next) && iOptInt == 0) {
                                    map.put(next, 1000);
                                } else {
                                    map.put(next, Integer.valueOf(iOptInt));
                                }
                            }
                        }
                        aVar2.a(map);
                    }
                    aVar2.b(com.mbridge.msdk.videocommon.entity.c.a(jSONObject.optJSONArray("reward")));
                    aVar2.c(jSONObject.optLong("getpf", 43200L));
                    aVar2.e(jSONObject.optLong("ruct", 5400L));
                    aVar2.d(jSONObject.optLong(CampaignEx.JSON_KEY_PLCT, 3600L));
                    aVar2.b(jSONObject.optLong("dlct", 3600L));
                    aVar2.f(jSONObject.optLong("vcct", 5L));
                    aVar2.a(jSONObject.optLong("current_time"));
                    aVar2.d(jSONObject.optString("vtag", ""));
                    return aVar2;
                } catch (Exception e10) {
                    e = e10;
                    aVar = aVar2;
                    e.printStackTrace();
                    return aVar;
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        return aVar;
    }
}
