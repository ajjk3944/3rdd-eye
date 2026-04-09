package io.appmetrica.analytics.impl;

import c9.C2077A;
import c9.C2099t;
import c9.C2100u;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class P6 {

    /* renamed from: a, reason: collision with root package name */
    public final Ql f39959a = new Ql();

    /* renamed from: b, reason: collision with root package name */
    public Map f39960b;

    /* renamed from: c, reason: collision with root package name */
    public Map f39961c;

    /* renamed from: d, reason: collision with root package name */
    public IdentifiersResult f39962d;

    public P6() {
        C2100u c2100u = C2100u.f18582b;
        this.f39960b = c2100u;
        this.f39961c = c2100u;
    }

    public final synchronized void a(IdentifiersResult identifiersResult) {
        HashMap map;
        Map linkedHashMap;
        RandomAccess randomAccessA;
        String str;
        try {
            IdentifiersResult identifiersResult2 = this.f39962d;
            String str2 = identifiersResult2 != null ? identifiersResult2.id : null;
            if (str2 == null || str2.length() == 0 || ((str = identifiersResult.id) != null && str.length() != 0)) {
                this.f39962d = identifiersResult;
                String str3 = identifiersResult.id;
                if (str3 == null) {
                    map = null;
                } else {
                    map = new HashMap();
                    try {
                        JSONObject jSONObject = new JSONObject(str3);
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            try {
                                ArrayList arrayListA = AbstractC5122zb.a(new JSONArray(jSONObject.optString(next)));
                                if (arrayListA != null) {
                                    map.put(next, arrayListA);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
                if (map != null) {
                    linkedHashMap = new LinkedHashMap(C2077A.l(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        List list = (List) entry.getValue();
                        linkedHashMap.put(key, new IdentifiersResult(String.valueOf(AbstractC4623fo.a((Collection) list) ? null : new JSONArray((Collection) list)), identifiersResult.status, identifiersResult.errorExplanation));
                    }
                } else {
                    linkedHashMap = C2100u.f18582b;
                }
                this.f39961c = linkedHashMap;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2077A.l(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key2 = entry2.getKey();
                    String str4 = ((IdentifiersResult) entry2.getValue()).id;
                    if (str4 == null) {
                        randomAccessA = null;
                    } else {
                        try {
                            randomAccessA = AbstractC5122zb.a(new JSONArray(str4));
                        } catch (Throwable unused3) {
                        }
                    }
                    if (randomAccessA == null) {
                        randomAccessA = C2099t.f18581b;
                    }
                    linkedHashMap2.put(key2, randomAccessA);
                }
                this.f39960b = linkedHashMap2;
            }
        } finally {
        }
    }

    public final synchronized void a(List list, HashMap map) {
        IdentifierStatus identifierStatus;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                List list2 = (List) this.f39960b.get(str);
                if (list2 != null && !list2.isEmpty()) {
                    linkedHashMap.put(str, list2);
                }
            }
            Ql ql = this.f39959a;
            String strA = AbstractC5122zb.a((Map) linkedHashMap);
            IdentifiersResult identifiersResult = this.f39962d;
            if (identifiersResult == null || (identifierStatus = identifiersResult.status) == null) {
                identifierStatus = IdentifierStatus.UNKNOWN;
            }
            map.put("appmetrica_custom_sdk_hosts", ql.a(new IdentifiersResult(strA, identifierStatus, identifiersResult != null ? identifiersResult.errorExplanation : null)));
        } catch (Throwable th) {
            throw th;
        }
    }
}
