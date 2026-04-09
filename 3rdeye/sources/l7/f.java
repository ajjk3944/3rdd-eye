package l7;

import c9.C2097r;
import c9.C2099t;
import g0.C4356c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import k8.F;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsonTopologicalSorting.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final C4356c f43879a = new C4356c(5);

    public static void a(String str, LinkedHashMap linkedHashMap, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, LinkedHashMap linkedHashMap2) throws a {
        ArrayList arrayList;
        if (linkedHashSet.contains(str)) {
            List listG0 = C2097r.G0(linkedHashSet);
            StringBuilder sb = new StringBuilder();
            int size = listG0.size();
            for (int iIndexOf = listG0.indexOf(str); iIndexOf < size; iIndexOf++) {
                sb.append((String) listG0.get(iIndexOf));
                sb.append(" -> ");
            }
            sb.append(str);
            String string = sb.toString();
            kotlin.jvm.internal.l.e(string, "output.toString()");
            throw new a(string);
        }
        if (linkedHashSet2.contains(str)) {
            return;
        }
        List list = (List) linkedHashMap.get(str);
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (linkedHashMap.containsKey((String) obj)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            linkedHashSet.add(str);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((String) it.next(), linkedHashMap, linkedHashSet, linkedHashSet2, linkedHashMap2);
            }
            linkedHashSet.remove(str);
        }
        linkedHashSet2.add(str);
        RandomAccess randomAccess = arrayList;
        if (arrayList == null) {
            randomAccess = C2099t.f18581b;
        }
        linkedHashMap2.put(str, C2097r.L0((Iterable) randomAccess));
    }

    public static void b(z7.g gVar, JSONObject jSONObject, boolean z10, ArrayList arrayList) throws JSONException {
        String str;
        C4356c c4356c = f43879a;
        if (z10) {
            Object objJ = F.j("type", jSONObject);
            if (objJ == null) {
                throw z7.e.g("type", jSONObject);
            }
            try {
                if (((String) objJ).length() <= 0) {
                    throw z7.e.e(jSONObject, "type", objJ);
                }
                str = (String) objJ;
            } catch (ClassCastException unused) {
                throw z7.e.l(jSONObject, "type", objJ);
            }
        } else {
            str = (String) F.r(gVar, jSONObject, "type", e.f43878b, c4356c);
        }
        if (str != null) {
            arrayList.add(str);
        }
        Iterator<String> keys = jSONObject.keys();
        kotlin.jvm.internal.l.e(keys, "keys");
        while (keys.hasNext()) {
            String key = keys.next();
            Object obj = jSONObject.get(key);
            if (obj instanceof JSONObject) {
                kotlin.jvm.internal.l.e(key, "key");
                b(gVar, (JSONObject) obj, false, arrayList);
            }
        }
        Iterator<String> keys2 = jSONObject.keys();
        kotlin.jvm.internal.l.e(keys2, "keys");
        while (keys2.hasNext()) {
            String key2 = keys2.next();
            Object obj2 = jSONObject.get(key2);
            if (obj2 instanceof JSONArray) {
                kotlin.jvm.internal.l.e(key2, "key");
                JSONArray jSONArray = (JSONArray) obj2;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj3 = jSONArray.get(i);
                    if (obj3 instanceof JSONObject) {
                        b(gVar, (JSONObject) obj3, false, arrayList);
                    }
                }
            }
        }
    }

    public static LinkedHashMap c(z7.g gVar, JSONObject jSONObject) throws JSONException, z7.d, a {
        LinkedHashMap linkedHashMap = new LinkedHashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        kotlin.jvm.internal.l.e(keys, "keys");
        while (keys.hasNext()) {
            String key = keys.next();
            Object obj = jSONObject.get(key);
            if (obj instanceof JSONObject) {
                kotlin.jvm.internal.l.e(key, "key");
                ArrayList arrayList = new ArrayList();
                b(gVar, (JSONObject) obj, true, arrayList);
                linkedHashMap.put(key, arrayList);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            a((String) it.next(), linkedHashMap, linkedHashSet, linkedHashSet2, linkedHashMap2);
        }
        return linkedHashMap2;
    }
}
