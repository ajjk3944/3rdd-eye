package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Kn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0597Kn {

    /* renamed from: b, reason: collision with root package name */
    public JSONObject f9532b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f9533c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9534d;

    /* renamed from: e, reason: collision with root package name */
    public JSONObject f9535e;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f9531a = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f9536f = new AtomicBoolean(false);

    public C0597Kn(C0623Mf c0623Mf) {
        this.f9533c = c0623Mf;
    }

    public final synchronized void a() {
        JSONObject jSONObject;
        Map map;
        try {
            this.f9534d = true;
            C0487Ef c0487EfS = p2.j.f22785C.f22795h.i().s();
            if (c0487EfS != null && (jSONObject = c0487EfS.f7978g) != null) {
                this.f9532b = ((Boolean) C2841s.f23267e.f23270c.a(H9.f8641N4)).booleanValue() ? jSONObject.optJSONObject("common_settings") : null;
                this.f9535e = jSONObject.optJSONObject("ad_unit_patterns");
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("ad_unit_id");
                            String strOptString2 = jSONObjectOptJSONObject.optString("format");
                            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                            if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                                ConcurrentHashMap concurrentHashMap = this.f9531a;
                                if (concurrentHashMap.containsKey(strOptString2)) {
                                    map = (Map) concurrentHashMap.get(strOptString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                                    concurrentHashMap.put(strOptString2, concurrentHashMap2);
                                    map = concurrentHashMap2;
                                }
                                map.put(strOptString, jSONObjectOptJSONObject2);
                            }
                        }
                    }
                }
            }
        } finally {
        }
    }
}
