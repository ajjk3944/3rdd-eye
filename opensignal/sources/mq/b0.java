package mq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class b0 extends dr.a {
    public static Object O(Map map, Object obj) {
        br.l.e(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int P(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map Q(lq.l lVar) {
        br.l.e(lVar, "pair");
        Map mapSingletonMap = Collections.singletonMap(lVar.f15571a, lVar.f15572d);
        br.l.d(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static Map R(lq.l... lVarArr) {
        if (lVarArr.length <= 0) {
            return x.f16946a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(P(lVarArr.length));
        U(linkedHashMap, lVarArr);
        return linkedHashMap;
    }

    public static LinkedHashMap S(Map map, Map map2) {
        br.l.e(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map T(Map map, lq.l lVar) {
        br.l.e(map, "<this>");
        if (map.isEmpty()) {
            return Q(lVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(lVar.f15571a, lVar.f15572d);
        return linkedHashMap;
    }

    public static final void U(HashMap map, lq.l[] lVarArr) {
        for (lq.l lVar : lVarArr) {
            map.put(lVar.f15571a, lVar.f15572d);
        }
    }

    public static Map V(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return x.f16946a;
        }
        if (size == 1) {
            return Q((lq.l) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(P(arrayList.size()));
        X(arrayList, linkedHashMap);
        return linkedHashMap;
    }

    public static Map W(Map map) {
        br.l.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return x.f16946a;
        }
        if (size != 1) {
            return Y(map);
        }
        br.l.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        br.l.d(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static void X(ArrayList arrayList, HashMap map) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lq.l lVar = (lq.l) it.next();
            map.put(lVar.f15571a, lVar.f15572d);
        }
    }

    public static LinkedHashMap Y(Map map) {
        br.l.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
