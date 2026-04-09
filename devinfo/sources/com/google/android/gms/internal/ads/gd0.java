package com.google.android.gms.internal.ads;

import com.applovin.mediation.AppLovinUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gd0 {

    /* renamed from: b, reason: collision with root package name */
    public JSONObject f11499b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f11500c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11501d;

    /* renamed from: e, reason: collision with root package name */
    public JSONObject f11502e;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f11498a = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f11503f = new AtomicBoolean(false);

    public gd0(ex exVar) {
        this.f11500c = exVar;
    }

    public final synchronized void a() {
        JSONObject jSONObject;
        Map map;
        try {
            this.f11501d = true;
            ww wwVarS = ua.j.C.f35265h.i().s();
            if (wwVarS != null && (jSONObject = wwVarS.g) != null) {
                this.f11499b = ((Boolean) va.s.f36163e.f36166c.a(sk.N4)).booleanValue() ? jSONObject.optJSONObject("common_settings") : null;
                this.f11502e = jSONObject.optJSONObject("ad_unit_patterns");
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (jSONArrayOptJSONArray != null) {
                    for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i4);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID);
                            String strOptString2 = jSONObjectOptJSONObject.optString("format");
                            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                            if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                                ConcurrentHashMap concurrentHashMap = this.f11498a;
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
