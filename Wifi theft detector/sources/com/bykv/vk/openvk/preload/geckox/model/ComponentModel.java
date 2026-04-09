package com.bykv.vk.openvk.preload.geckox.model;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ComponentModel {
    private Map<String, List<UpdatePackage>> packages;
    private Map<String, b> universalStrategies;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f9155a;

        /* renamed from: b, reason: collision with root package name */
        public int f9156b;

        /* renamed from: c, reason: collision with root package name */
        public List<Long> f9157c;

        public final a a(JSONObject jSONObject) {
            JSONArray jSONArrayOptJSONArray;
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("c")) {
                        this.f9155a = (String) com.bykv.vk.openvk.preload.falconx.a.a.a(jSONObject, "c", String.class);
                    }
                    if (jSONObject.has("clean_type")) {
                        this.f9156b = jSONObject.optInt("clean_type");
                    }
                    if (jSONObject.has("version") && (jSONArrayOptJSONArray = jSONObject.optJSONArray("version")) != null && jSONArrayOptJSONArray.length() > 0) {
                        this.f9157c = new ArrayList();
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                            this.f9157c.add(Long.valueOf(jSONArrayOptJSONArray.optLong(i10)));
                        }
                    }
                    if (jSONObject.has(NotificationCompat.CATEGORY_STATUS)) {
                        jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
                    }
                    if (jSONObject.has("pkg_id")) {
                        jSONObject.optInt("pkg_id");
                    }
                    if (jSONObject.has("err_code")) {
                        jSONObject.optInt("err_code");
                    }
                    if (jSONObject.has("err_msg")) {
                        com.bykv.vk.openvk.preload.falconx.a.a.a(jSONObject, "err_msg", String.class);
                    }
                } catch (Throwable unused) {
                }
            }
            return this;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public List<a> f9158a;

        /* renamed from: b, reason: collision with root package name */
        private c f9159b;

        public final b a(JSONObject jSONObject) {
            JSONObject jSONObjectOptJSONObject;
            JSONArray jSONArrayOptJSONArray;
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("specified_clean") && (jSONArrayOptJSONArray = jSONObject.optJSONArray("specified_clean")) != null && jSONArrayOptJSONArray.length() > 0) {
                        this.f9158a = new ArrayList();
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                            if (jSONObjectOptJSONObject2 != null) {
                                a aVar = new a();
                                aVar.a(jSONObjectOptJSONObject2);
                                this.f9158a.add(aVar);
                            }
                        }
                    }
                    if (jSONObject.has("group_clean") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("group_clean")) != null) {
                        c cVar = new c();
                        this.f9159b = cVar;
                        cVar.a(jSONObjectOptJSONObject);
                    }
                } catch (Throwable unused) {
                }
            }
            return this;
        }
    }

    public static class c {
        public final c a(JSONObject jSONObject) {
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("rule")) {
                        jSONObject.optInt("rule");
                    }
                    if (jSONObject.has("policy")) {
                        jSONObject.optInt("policy");
                    }
                    if (jSONObject.has("limit")) {
                        jSONObject.optInt("limit");
                    }
                } catch (Throwable unused) {
                }
            }
            return this;
        }
    }

    public ComponentModel fromJson(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (jSONObject != null) {
            try {
                if (jSONObject.has("packages") && (jSONObjectOptJSONObject2 = jSONObject.optJSONObject("packages")) != null) {
                    this.packages = new HashMap();
                    Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray(next);
                        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                            ArrayList arrayList = new ArrayList();
                            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i10);
                                if (jSONObjectOptJSONObject3 != null) {
                                    UpdatePackage updatePackage = new UpdatePackage();
                                    updatePackage.fromJson(jSONObjectOptJSONObject3);
                                    arrayList.add(updatePackage);
                                }
                            }
                            this.packages.put(next, arrayList);
                        }
                    }
                }
                if (jSONObject.has("universal_strategies") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("universal_strategies")) != null) {
                    this.universalStrategies = new HashMap();
                    Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject(next2);
                        if (jSONObjectOptJSONObject4 != null) {
                            b bVar = new b();
                            bVar.a(jSONObjectOptJSONObject4);
                            this.universalStrategies.put(next2, bVar);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return this;
    }

    public Map<String, List<UpdatePackage>> getPackages() {
        return this.packages;
    }

    public Map<String, b> getUniversalStrategies() {
        return this.universalStrategies;
    }
}
